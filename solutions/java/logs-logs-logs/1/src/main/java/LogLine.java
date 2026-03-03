public class LogLine {

    private String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        
        if (logLine.contains("TRC"))
            return LogLevel.TRACE;
        else if (logLine.contains("DBG"))
            return LogLevel.DEBUG;
        else if (logLine.contains("INF"))
            return LogLevel.INFO;
        else if (logLine.contains("WRN"))
            return LogLevel.WARNING;
        else if (logLine.contains("ERR"))
            return LogLevel.ERROR;
        else if (logLine.contains("FTL"))
            return LogLevel.FATAL;
        else
            return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        return level.getValue() + ":" + logLine.substring(logLine.indexOf(":") + 2);
    }
}