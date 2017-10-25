package cn.lzyike.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author dingle
 * 这是一个测试类
 */
public class Hello {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入目录名:");
		String dirName=sc.nextLine();
		System.out.println("请输入文件名:");
		String fileName=sc.nextLine();
		File f=new File(dirName+"/"+fileName);
		String fs=new String();
		InputStream is=null;
		try {
			is=new FileInputStream(f);
			int x=0;
			byte bts[]=new byte[1024];
			while((x=is.read(bts))!=-1) {
				fs+=new String(bts,0,x);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(fs);
	}
}
