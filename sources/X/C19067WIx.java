package X;

import com.facebook.react.bridge.Callback;

/* renamed from: X.WIx  reason: case insensitive filesystem */
public final class C19067WIx implements C20876X2c {
    public final int A00;
    public final Callback A01;
    public final /* synthetic */ C18592Vuj A02;

    public final void AT8() {
        try {
            C18592Vuj vuj = this.A02;
            W0R w0r = vuj.A0L;
            int i = this.A00;
            int[] iArr = vuj.A0P;
            w0r.A06(i, iArr);
            float A002 = W2U.A00((float) iArr[0]);
            float A003 = W2U.A00((float) iArr[1]);
            this.A01.invoke(0, null, Float.valueOf(W2U.A00((float) iArr[2])), Float.valueOf(W2U.A00((float) iArr[3])), Float.valueOf(A002), Float.valueOf(A003));
        } catch (USL unused) {
            this.A01.invoke(new Object[0]);
        }
    }

    public C19067WIx(Callback callback, C18592Vuj vuj, int i) {
        this.A02 = vuj;
        this.A00 = i;
        this.A01 = callback;
    }
}
