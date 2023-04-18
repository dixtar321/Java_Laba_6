package funcs;
import java.util.Scanner;

public class FormattedInput {
    private Scanner scanner = new Scanner(System.in);

    public Object[] scanf(String format) {
        Object[] result = new Object[format.length() - format.replace("%", "").length()];

        while (true) {
            try {
                String[] inputs = scanner.nextLine().split(" ");

                if (inputs.length != result.length) {
                    throw new Exception();
                }

                int index = 0;

                for (int i = 0; i < format.length(); i++) {
                    char c = format.charAt(i);

                    if (c == '%') {
                        switch (format.charAt(i + 1)) {
                            case 'd':
                                result[index] = Integer.parseInt(inputs[index]);
                                break;
                            case 'f':
                                result[index] = Double.parseDouble(inputs[index]);
                                break;
                            case 's':
                                result[index] = inputs[index];
                                break;
                            case 'c':
                                result[index] = inputs[index].charAt(0);
                                break;
                            default:
                                throw new Exception();
                        }

                        index++;
                    }
                }

                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
            }
        }

        return result;
    }

    public Object[] sscanf(String format, String in) {
        Object[] result = new Object[format.length() - format.replace("%", "").length()];

        try {
            String[] inputs = in.split(" ");

            if (inputs.length != result.length) {
                throw new Exception();
            }

            int index = 0;

            for (int i = 0; i < format.length(); i++) {
                char c = format.charAt(i);

                if (c == '%') {
                    switch (format.charAt(i + 1)) {
                        case 'd':
                            result[index] = Integer.parseInt(inputs[index]);
                            break;
                        case 'f':
                            result[index] = Double.parseDouble(inputs[index]);
                            break;
                        case 's':
                            result[index] = inputs[index];
                            break;
                        case 'c':
                            result[index] = inputs[index].charAt(0);
                            break;
                        default:
                            throw new Exception();
                    }

                    index++;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        return result;
    }
}
