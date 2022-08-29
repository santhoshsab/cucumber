package org.scc;

import java.io.File;

public class Lun {
	public static void main(String[] args) {
		File f = new File("C:\\Program Files\\Amazon\\AWSCLIV2\\Java");
		
		boolean b = f.mkdir();
		System.out.println(b);
	}

}

