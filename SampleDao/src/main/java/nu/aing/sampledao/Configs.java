package nu.aing.sampledao;

/**
 * @author Fanny Irawan Sutawanir (fannyirawans@gmail.com)
 */
public interface Configs {

    String BASE_DIR = System.getProperty("user.dir").replace("\\", "/");

    String OUTPUT_DIR = new StringBuilder(BASE_DIR).append("/app/src/main/java").toString();
}