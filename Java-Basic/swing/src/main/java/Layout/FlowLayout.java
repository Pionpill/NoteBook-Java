package Layout;

import java.awt.*;
import javax.swing.*;

/**
 * reference: https://blog.csdn.net/xietansheng/article/details/72814541
 */
public class FlowLayout {
    public static void main(String args[]) {
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(200, 250);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        // 创建内容面板，默认即为流式布局
        JPanel panel = new JPanel();

        panel.add(new JButton("按钮01"));
        panel.add(new JButton("按钮02"));
        panel.add(new JButton("按钮03"));
        panel.add(new JButton("按钮04"));
        panel.add(new JButton("按钮05"));

        jf.setContentPane(panel);
        jf.setVisible(true); // PS: 最后再设置为可显示(绘制), 所有添加的组件才会显示
    }
}
