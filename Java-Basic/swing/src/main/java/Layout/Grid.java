package Layout;

import javax.swing.*;
import java.awt.*;

/**
 * reference: https://blog.csdn.net/xietansheng/article/details/72814548
 */
public class Grid {
    public static void main(String[] args) {
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(200, 250);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        // 创建 3 行 3 列 的网格布局
        GridLayout layout = new GridLayout(3, 3);

        // 设置 水平 和 竖直 间隙
        // layout.setHgap(10);
        // layout.setVgap(10);

        JPanel panel = new JPanel(layout);

        panel.add(new JButton("按钮01"));
        panel.add(new JButton("按钮02"));
        panel.add(new JButton("按钮03"));
        panel.add(new JButton("按钮04"));
        panel.add(new JButton("按钮05"));
        panel.add(new JButton("按钮06"));
        panel.add(new JButton("按钮07"));
        panel.add(new JButton("按钮08"));

        jf.setContentPane(panel);
        jf.setVisible(true);
    }
}
