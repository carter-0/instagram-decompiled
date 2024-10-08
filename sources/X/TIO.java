package X;

import com.facebook.browser.lite.ipc.BrowserLiteCallback;

public final class TIO implements Runnable {
    public final /* synthetic */ C10980S3o A00;
    public final /* synthetic */ SRY A01;
    public final /* synthetic */ boolean A02;

    public TIO(C10980S3o s3o, SRY sry, boolean z) {
        this.A01 = sry;
        this.A02 = z;
        this.A00 = s3o;
    }

    public final void run() {
        SRY sry = this.A01;
        int i = 300;
        while (sry.A06 == null) {
            try {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                Thread.sleep(10);
                i = i2;
            } catch (InterruptedException unused) {
            }
        }
        BrowserLiteCallback browserLiteCallback = sry.A06;
        if (browserLiteCallback != null) {
            try {
                this.A00.A00(browserLiteCallback);
            } catch (Exception e) {
                this.A00.A01(e);
            }
        } else if (this.A02) {
            C10980S3o s3o = this.A00;
            C71087ObS obS = sry.A07;
            if (obS != null) {
                obS.A04(new C71519OmG(10, s3o, sry));
            }
        } else {
            SQO.A01("BrowserLiteCallbacker", "Callback service is not available.", Pxe.A1b());
            0KC.A0E("BrowserLiteCallbacker", "Callback service is not available");
        }
    }
}
