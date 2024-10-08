package X;

import java.net.InetAddress;

public final class TBE implements Runnable {
    public final String A00;

    public final void run() {
        String str = this.A00;
        SQO.A01("BrowserLiteFragment", "Async resolving %s", str);
        try {
            InetAddress.getByName(str);
        } catch (Exception e) {
            SQO.A01("BrowserLiteFragment", "Exception during async DNS: %s", Pxf.A1Z(e));
        }
        SQO.A01("BrowserLiteFragment", "Done resolving %s", str);
    }

    public TBE(String str) {
        this.A00 = str;
    }
}
