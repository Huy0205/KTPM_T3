package examples;

import java.io.File;

import examples.DirExplorer.FileHandler;
import examples.DirExplorer.Filter;

public class test {
	public static void main(String[] args) {
//		File projectDir = new File("T:\\KTPM_T3\\DecisionMatoring\\src\\main\\java");
//		DirExplorer.Filter filter = new Filter() {
//			public boolean interested(int level, String path, File file) {
//				return path.endsWith(".java");
//			}
//		};
//		DirExplorer.FileHandler handler = new FileHandler() {
//			public void handle(int level, String path, File file) {
//				System.out.println(path);
//			}
//		};
//		DirExplorer di = new DirExplorer(filter, handler);
//		di.explore(projectDir);
		
		
		File projectDir = new File("src");
		new DirExplorer((level, path, file) -> path.endsWith(".java"), 
				 (level, path, file) -> {System.out.println(path);}).explore(projectDir);
		

	}
}
