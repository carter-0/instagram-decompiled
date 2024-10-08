package X;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Build;

public final class MA3 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C364988mL A01;
    public final /* synthetic */ LAM A02;
    public final /* synthetic */ C63927LDk A03;
    public final /* synthetic */ C64149LQm A04;
    public final /* synthetic */ C367428qj A05;

    public MA3(Bitmap bitmap, C364988mL r2, LAM lam, C63927LDk lDk, C64149LQm lQm, C367428qj r6) {
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = bitmap;
        this.A04 = lQm;
        this.A02 = lam;
        this.A03 = lDk;
    }

    public final void run() {
        Gainmap gainmap;
        C364988mL r4 = this.A01;
        Bitmap A002 = r4.A00();
        if (A002 != null && Build.VERSION.SDK_INT >= 34) {
            C367428qj r6 = this.A05;
            if (r6.A04.A00) {
                gainmap = new Gainmap(A002.copy(Bitmap.Config.ALPHA_8, false));
                A002.recycle();
            } else {
                gainmap = new Gainmap(A002);
            }
            gainmap.setDisplayRatioForFullHdr(r6.A05.A00);
            float[] fArr = (float[]) r6.A07.A00;
            gainmap.setEpsilonHdr(fArr[0], fArr[1], fArr[2]);
            float[] fArr2 = (float[]) r6.A08.A00;
            gainmap.setEpsilonSdr(fArr2[0], fArr2[1], fArr2[2]);
            float[] fArr3 = (float[]) r6.A09.A00;
            gainmap.setGamma(fArr3[0], fArr3[1], fArr3[2]);
            gainmap.setMinDisplayRatioForHdrTransition(r6.A06.A00);
            float[] fArr4 = (float[]) r6.A0A.A00;
            gainmap.setRatioMax(fArr4[0], fArr4[1], fArr4[2]);
            float[] fArr5 = (float[]) r6.A0B.A00;
            gainmap.setRatioMin(fArr5[0], fArr5[1], fArr5[2]);
            this.A00.setGainmap(gainmap);
        }
        C64149LQm.A00(this.A00, r4, this.A02, this.A03, this.A04);
    }
}
