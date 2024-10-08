package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

public final class IR7 implements C328157Ds {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ C332807Wl A02;
    public final /* synthetic */ C331547Rk A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0rh A05;

    public IR7(C284945Oz r1, C284945Oz r2, C332807Wl r3, C331547Rk r4, 0sP r5, 0rh r6) {
        this.A04 = r5;
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
    }

    public final float Abj() {
        return this.A05.A00 / 2.0f;
    }

    public final void CvC() {
        this.A02.Diz(new MessageIdentifier(this.A03.A03, (String) null));
    }

    public final void DvS(float f, float f2, float f3, float f4, float f5) {
        this.A01.Epw(new C289165d8(AnonymousClass5TW.A00((int) f3, -((int) f4))));
        C51967G9n.A1Q(this.A04, f);
        C51967G9n.A14(this.A00, f5);
    }
}
