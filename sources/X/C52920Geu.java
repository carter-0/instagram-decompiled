package X;

import android.graphics.Shader;

/* renamed from: X.Geu  reason: case insensitive filesystem */
public final class C52920Geu extends C298605tj {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ AnonymousClass62O A03;

    public C52920Geu(AnonymousClass62O r1, float f, float f2, float f3) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = r1;
    }

    public final Shader A01(long j) {
        float f = this.A01;
        long A002 = C289325dP.A00(f, f);
        long A003 = C289325dP.A00(this.A02, this.A00);
        return C52416GRt.A00(this.A03, AnonymousClass62Q.A04(Float.valueOf(0.15f), Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(0.85f)), 1, A002, A003);
    }
}
