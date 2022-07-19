package itsjava.test.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Admin/Desktop/KYJ/smart_study");
		Stream<Path> stream = Files.list(path);
		//p 는 서브디렉토리 또는 파일에 해당하는 Path 객체
		//p.getFileName() 는 서브 디렉토리 이름 또는 파일 이름 리턴
		stream.forEach( p-> System.out.println(p.getFileName()));

	}

}
