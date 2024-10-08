package X;

import android.opengl.GLES20;

/* renamed from: X.Usr  reason: case insensitive filesystem */
public final class C16321Usr extends C19724WeQ {
    public static C14261Tsj A02;
    public static C14260Tsi A03;
    public static C16331Ut1 A04;
    public static C18039VkN A05;
    public static final float[] A06 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public float A00;
    public int A01;

    public final void AQF() {
        C18571VuN vuN;
        A02.A00();
        GLES20.glBindBuffer(34962, A04.A03);
        A05.A00();
        C21006X9e x9e = this.A03;
        17k.A07(x9e, AnonymousClass000.A00(3614));
        C19723WeP weP = (C19723WeP) x9e;
        if (weP instanceof C16315Usj) {
            vuN = C18571VuN.A06;
        } else {
            vuN = weP.A06;
        }
        vuN.A00();
        GLES20.glDrawArrays(5, 0, 4);
        A05.A01();
        GLES20.glBindBuffer(34962, 0);
    }

    public final void A01(C21006X9e x9e) {
        int i;
        float f;
        super.A01(x9e);
        if (x9e != null) {
            i = ((C19723WeP) x9e).A03;
        } else {
            i = 0;
        }
        this.A01 = i;
        if (x9e != null) {
            f = ((float) x9e.AbG()) / 255.0f;
        } else {
            f = 0.0f;
        }
        this.A00 = f;
    }
}
