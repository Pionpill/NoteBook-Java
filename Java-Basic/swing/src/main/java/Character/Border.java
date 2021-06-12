package Character;

import javax.swing.*;
import java.awt.*;

/**
 * reference: https://blog.csdn.net/xietansheng/article/details/78389211
 */
public class Border {
    public static void main(String[] args) {
        JFrame jf = new JFrame("测试窗口");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
        jf.setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JPanel panel01 = createPanel();
        panel01.setBorder(BorderFactory.createLineBorder(Color.RED)); // 线边框

        JPanel panel02 = createPanel();
        panel02.setBorder(BorderFactory.createTitledBorder("边框标题XXX")); // 标题边框

        JPanel panel03 = createPanel();
        panel03.setBorder(BorderFactory.createRaisedSoftBevelBorder()); // 凸起软斜面

        JPanel panel04 = createPanel();
        panel04.setBorder(BorderFactory.createLoweredBevelBorder()); // 凹入斜面

        panel.add(panel01);
        panel.add(panel02);
        panel.add(panel03);
        panel.add(panel04);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }

    private static JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(180, 180));

        panel.add(new JLabel("一个标签"));
        panel.add(new JButton("一个按钮"));
        panel.add(new JRadioButton("单选按钮"));
        panel.add(new JCheckBox("复选框"));

        return panel;
    }
}