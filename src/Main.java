import org.junit.Test;

public class Main {
    @Test
    public void extrag() {
        solve();
    }

    private void solve() {
        int N = 39609;
        int min = 99999999;
        String nString = String.valueOf(N);
        int number = 0;

        StringBuilder sb;
        for (int i = 0; i < nString.length(); i++) {
            sb = new StringBuilder();
            sb.append(nString);
            number = Integer.parseInt(String.valueOf(sb.deleteCharAt(i)));
            if (min > number) {
                min = number;
            }
        }
        }
    }
