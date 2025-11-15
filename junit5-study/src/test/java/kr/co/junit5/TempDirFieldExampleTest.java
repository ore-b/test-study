package kr.co.junit5;

import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class TempDirFieldExampleTest {

    @TempDir
    Path tempDir;

//    @TempDir
//    File tempDir;


    @Test
    void create_file_in_temp_dir() throws Exception {
        Path file = tempDir.resolve("test.txt");
        java.nio.file.Files.writeString(file, "hello");

        System.out.println("temp dir  = " + tempDir);
        System.out.println("temp file = " + file);
    }

    @Test
    void use_temp_dir_argument(@TempDir Path tempDir) throws Exception {
        Path logFile = tempDir.resolve("log.txt");
        java.nio.file.Files.writeString(logFile, "log data");

        System.out.println("temp dir  = " + tempDir);
        System.out.println("log file  = " + logFile);
    }
}
