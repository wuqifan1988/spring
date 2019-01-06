package com.shengsiyuan.spring2;

/**
 * @author huaishi
 */
public class Chinese implements Person
{
    Tool tool;

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("你好：" + name);
    }

    @Override
    public void sayGoodbye(String name) {
        System.out.println("再见：" + name);
    }

    @Override
    public void work() {
        tool.work();
    }
}
