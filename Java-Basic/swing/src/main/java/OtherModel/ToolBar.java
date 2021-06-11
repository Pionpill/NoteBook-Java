package OtherModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * reference: https://blog.csdn.net/xietansheng/article/details/77151743
 */
public class ToolBar {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
        }
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(300, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建 内容面板，使用 边界布局
        JPanel panel = new JPanel(new BorderLayout());

        // 创建 一个工具栏实例
        JToolBar toolBar = new JToolBar("测试工具栏");

        // 创建 工具栏按钮
        JButton previousBtn = new JButton(new ImageIcon("Java-Basic/swing/resource/icons/doge.jpg"));
        JButton pauseBtn = new JButton(new ImageIcon("Java-Basic/swing/resource/icons/doge.jpg"));
        JButton nextBtn = new JButton(new ImageIcon("Java-Basic/swing/resource/icons/doge.jpg"));

        // 添加 按钮 到 工具栏
        toolBar.add(previousBtn);
        toolBar.add(pauseBtn);
        toolBar.add(nextBtn);

        // 创建一个文本区域，用于输出相关信息
        final JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);

        // 添加 按钮 的点击动作监听器，并把相关信息输入到 文本区域
        previousBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("上一曲\n");
            }
        });
        pauseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("暂停\n");
            }
        });
        nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("下一曲\n");
            }
        });

        // 添加 工具栏 到 内容面板 的 顶部
        panel.add(toolBar, BorderLayout.PAGE_START);
        // 添加 文本区域 到 内容面板 的 中间
        panel.add(textArea, BorderLayout.CENTER);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }
}
