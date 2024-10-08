package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.Wpq  reason: case insensitive filesystem */
public final class C20351Wpq implements Runnable {
    public final /* synthetic */ C321356tz A00;
    public final /* synthetic */ C331897Sw A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C20351Wpq(C321356tz r1, C331897Sw r2, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A05 = z2;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z3;
    }

    public final void run() {
        try {
            if (!this.A04 && this.A05) {
                C331897Sw.A03(this.A01, this.A00.A01, this.A02);
            }
        } catch (Exception e) {
            AnonymousClass7TF.A19(0wj.A01.AEf("GifCache", 817892340), DialogModule.KEY_MESSAGE, "Exception while extracting audio data from file", e);
        }
        11Z.A02(new C20336WpZ(this.A00, this.A01, this.A03, this.A02, this.A06));
    }
}
