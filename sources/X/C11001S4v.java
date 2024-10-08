package X;

import android.util.Log;
import androidx.biometric.BiometricFragment;
import java.util.concurrent.Executor;

/* renamed from: X.S4v  reason: case insensitive filesystem */
public final class C11001S4v {
    public SGZ A00;
    public final RLE A01;
    public final SR5 A02;
    public final C10714Rws A03;
    public final C13735Tg7 A04;
    public final C10440RsH A05;
    public final Executor A06;

    public final void A00() {
        String str;
        SGZ sgz = this.A00;
        if (sgz != null) {
            0hq r1 = sgz.A00;
            if (r1 == null) {
                str = "Unable to start authentication. Client fragment manager was null.";
            } else {
                BiometricFragment A0R = r1.A0R("androidx.biometric.BiometricFragment");
                if (A0R == null) {
                    str = "Unable to cancel authentication. BiometricFragment not found.";
                } else {
                    A0R.A07(3);
                    return;
                }
            }
            Log.e("BiometricPromptCompat", str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.Suo} */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.Tg7] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(androidx.fragment.app.Fragment r6) {
        /*
            r5 = this;
            X.Rws r3 = r5.A03
            if (r3 == 0) goto L_0x001f
            java.util.concurrent.Executor r2 = r5.A06
            X.RLE r0 = r5.A01
            r0.getClass()
            X.SGZ r1 = new X.SGZ
            r1.<init>(r0, r6, r2)
            r5.A00 = r1
            X.SR5 r0 = r5.A02
            if (r0 != 0) goto L_0x001b
            r0 = 0
            X.SGZ.A00(r0, r3, r1)
            return
        L_0x001b:
            r1.A01(r0, r3)
            return
        L_0x001f:
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.SSY r4 = r0.A01(r6)
            X.RsH r3 = r5.A05
            java.util.concurrent.Executor r2 = r5.A06
            X.Tg7 r1 = r5.A04
            if (r2 == 0) goto L_0x003a
            if (r1 == 0) goto L_0x003a
            X.Suo r0 = new X.Suo
            r0.<init>(r1, r2)
        L_0x0036:
            X.SSY.A02(r0, r3, r4)
            return
        L_0x003a:
            X.Sun r0 = new X.Sun
            r0.<init>()
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11001S4v.A01(androidx.fragment.app.Fragment):void");
    }

    public C11001S4v(RLE rle, SR5 sr5, C10714Rws rws, C13735Tg7 tg7, C10440RsH rsH, Executor executor) {
        this.A06 = executor;
        this.A03 = rws;
        this.A01 = rle;
        this.A02 = sr5;
        this.A04 = tg7;
        this.A05 = rsH;
    }
}
