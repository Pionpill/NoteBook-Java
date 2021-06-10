package Layout;

import javax.swing.*;
import java.awt.*;

/**
 * https:// blog.csdn.net/xietansheng/article/details/72862707
 */
public class Border {
    public static void main(String[] args) {
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(350, 250);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建内容面包容器，指定使用 边界布局
        JPanel panel = new JPanel(new BorderLayout());

        // 创建 5 个按钮
        JButton btnN = new JButton("Button_North");
        JButton btnS = new JButton("Button_South");
        JButton btnW = new JButton("Button_West");
        JButton btnE = new JButton("Button_East");
        JButton btnC = new JButton("Button_Center");

        // 把 5 个按钮添加到容器中的 5 个方位
        panel.add(btnN, BorderLayout.NORTH);
        panel.add(btnS, BorderLayout.SOUTH);
        panel.add(btnW, BorderLayout.WEST);
        panel.add(btnE, BorderLayout.EAST);
        panel.add(btnC, BorderLayout.CENTER);

        jf.setContentPane(panel);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
