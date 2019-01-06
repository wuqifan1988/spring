package com.shengsiyuan.spring2;

/**
 * @author huaishi
 */
public class American implements Person {

    Tool tool;

    public American(Tool tool) {
        this.tool = tool;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello: " + name);
    }

    @Override
    public void sayGoodbye(String name) {
        System.out.println("goodbye: " + name);
    }

    @Override
    public void work() {
        tool.work();
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
