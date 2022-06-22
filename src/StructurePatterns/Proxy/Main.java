package StructurePatterns.Proxy;

public class Main {
    public static void main(String[] args) {
        Project project=new ProxyProject("https://www.github.com/Nikita535/JavaPatterns");
        project.run();
        project.run();
    }
}
