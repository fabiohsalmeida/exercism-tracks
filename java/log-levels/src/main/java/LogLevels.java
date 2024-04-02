public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.split(":")[0].replace("[", "").replace("]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] splited = logLine.split(":");
        String logLevel = splited[0].replace("[", "").replace("]", "").toLowerCase();
        String message = splited[1].trim();

        return String.format("%s (%s)", message, logLevel);
    }
}
