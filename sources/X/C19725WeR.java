package X;

import android.opengl.GLES20;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.WeR  reason: case insensitive filesystem */
public final class C19725WeR implements X78 {
    public static final byte[] A08 = {1, -1, 1, 1, -1, -1, 0, 1, 1, 1, 1, 0, -1, 1, 0, 0};
    public static final byte[] A09 = {1, 1, 1, 1, -1, 1, 0, 1, 1, -1, 1, 0, -1, -1, 0, 0};
    public float A00 = 1.0f;
    public C18571VuN A01 = C18571VuN.A08;
    public C17872VhP A02;
    public final C14261Tsj A03;
    public final C14260Tsi A04;
    public final Tt4 A05;
    public final C18039VkN A06;
    public final C18039VkN A07;

    public final void E4D() {
    }

    public static void A00() {
        AnonymousClass9S9.A04("before donetargeting");
        GLES20.glBindFramebuffer(36160, 0);
        AnonymousClass9S9.A04("after donetargeting");
    }

    public static void A01(C19725WeR weR) {
        AnonymousClass9S9.A04("before target drawbacking for drawing");
        GLES20.glBindFramebuffer(36160, weR.A05.A00);
        AnonymousClass9S9.A04("target drawbacking for drawing");
    }

    public final void AQF() {
        int i = this.A05.A02;
        C18039VkN vkN = this.A07;
        this.A01.A00();
        C14260Tsi tsi = this.A04;
        if (tsi != null) {
            tsi.A01(16777215, this.A00);
        }
        C14261Tsj tsj = this.A03;
        tsj.A02("uTexture", i);
        tsj.A00();
        GLES20.glBindBuffer(34962, 0);
        vkN.A00();
        GLES20.glDrawArrays(5, 0, 4);
        vkN.A01();
    }

    public C19725WeR(C17872VhP vhP, int i, int i2) {
        this.A02 = vhP;
        this.A05 = vhP.A01.Bnh().CsV(i, i2);
        C19727WeT weT = (C19727WeT) vhP.A00(C19727WeT.class);
        this.A03 = weT.A00;
        this.A04 = weT.A01;
        this.A07 = weT.A03;
        this.A06 = weT.A02;
    }

    public final void A02() {
        A01(this);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        A00();
    }

    public final void A03(X78 x78) {
        x78.E4D();
        A01(this);
        x78.AQF();
        A00();
    }
}
