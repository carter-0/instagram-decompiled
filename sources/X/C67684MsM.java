package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.MsM  reason: case insensitive filesystem */
public final class C67684MsM extends Animation {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ C71492dQ A04;
    public final /* synthetic */ C71492dQ A05;
    public final /* synthetic */ C68080Mzl A06;

    public C67684MsM(C71492dQ r1, C71492dQ r2, C68080Mzl mzl, float f, float f2, float f3, float f4) {
        this.A05 = r1;
        this.A02 = f;
        this.A03 = f2;
        this.A04 = r2;
        this.A01 = f3;
        this.A00 = f4;
        this.A06 = mzl;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        C71492dQ r3 = this.A05;
        float f2 = this.A02;
        r3.A02 = f2 + ((this.A03 - f2) * f);
        C71492dQ r2 = this.A04;
        float f3 = this.A01;
        r2.A02 = f3 + ((this.A00 - f3) * f);
        C68080Mzl mzl = this.A06;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass7TE.A0c(mzl.A0C).setLayoutParams(r3);
        AnonymousClass7TE.A0c(mzl.A0B).setLayoutParams(r2);
    }
}
