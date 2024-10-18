import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChocolateTruffleDistributor {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Chocolate Truffle Distributor");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create label and text field for input
        JLabel label = new JLabel("Enter number of truffles (N):");
        label.setBounds(20, 20, 200, 25);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(20, 50, 100, 25);
        frame.add(textField);

        // Create button to calculate
        JButton button = new JButton("Calculate Ways");
        button.setBounds(20, 90, 150, 25);
        frame.add(button);

        // Create label for output
        JLabel resultLabel = new JLabel("Ways: ");
        resultLabel.setBounds(20, 130, 250, 25);
        frame.add(resultLabel);

        // Add action listener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int N = Integer.parseInt(textField.getText());
                    if (N > 1 && N < 50) {
                        int ways = countWays(N);
                        resultLabel.setText("Ways: " + ways);
                    } else {
                        resultLabel.setText("N must be between 2 and 49.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    // Function to count ways to distribute truffles
    private static int countWays(int N) {
        int[] dp = new int[N + 1];
        dp[0] = 1; // 1 way to distribute 0 truffles

        // Fill the dp array for each person (from the second to the N-th)
        for (int i = 0; i < N - 1; i++) {
            int[] newDp = new int[N + 1];
            for (int j = 0; j <= N; j++) {
                // Distributing 0 truffles
                newDp[j] += dp[j];
                // Distributing 1 truffle
                if (j >= 1) {
                    newDp[j] += dp[j - 1];
                }
                // Distributing 2 truffles
                if (j >= 2) {
                    newDp[j] += dp[j - 2];
                }
            }
            dp = newDp; // Move to the next state
        }

        // Calculate total ways considering the first person can take k truffles
        int totalWays = 0;
        for (int k = 0; k <= N; k++) {
            if (k <= N) {
                totalWays += dp[N - k];
            }
        }

        return totalWays;
    }
}
