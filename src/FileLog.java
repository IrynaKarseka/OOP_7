import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLog implements Logable {
    private final Logger logger = Logger.getLogger("log");
    public FileLog() {
        setFileHandler("log.txt");
    }

    public FileLog(String fileNameLog) {
        setFileHandler(fileNameLog);
    }

    public void setFileHandler(String fileNameLog) {
        this.logger.setUseParentHandlers(false);
        try {
            FileHandler fileHandler = new FileHandler(fileNameLog, true);
        this.logger.addHandler(fileHandler);
        fileHandler.setFormatter(new SimpleFormatter());
        } catch (Exception exception) {
            System.out.println("Ошибка работы с файлом.");
            System.out.println(exception.getMessage());
        }
    }
    @Override
    public void log(String message) {
        logger.info(message);
    }
}
