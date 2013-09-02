package com.hascode.tutorial;

public class Main {
	public static void main(String[] args){
		System.out.println("Templating Plugin for Maven Example");
		System.out.println(String.format("artifactId: ${project.artifactId}, groupId: ${project.groupId}, version: ${project.version}"));
		System.out.println("project build directory: ${project.build.directory}");
	}
}