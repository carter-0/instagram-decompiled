package X;

import android.widget.ImageView;

/* renamed from: X.LMs  reason: case insensitive filesystem */
public final class C64098LMs {
    public final ImageView A00;
    public final AnonymousClass07Z A01;
    public final C316236lK A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C20695WxR(this, 28));
    public final AnonymousClass0eM A04;

    public static final void A00(C64098LMs lMs) {
        AnonymousClass7TF.A16(AnonymousClass7TE.A0c(lMs.A02.A06));
        AnonymousClass0eM r1 = lMs.A03;
        if (((AnonymousClass61R) r1.getValue()).isPlaying()) {
            ((AnonymousClass61R) r1.getValue()).stop();
            ((AnonymousClass61R) r1.getValue()).EL2(0.0f);
        }
    }

    public C64098LMs(ImageView imageView, AnonymousClass07Z r6, AnonymousClass07g r7, C316236lK r8) {
        AnonymousClass7TG.A1P(r7, r8);
        this.A01 = r6;
        this.A02 = r8;
        this.A00 = imageView;
        this.A04 = C49154EqL.A00(new WEF(), r7, DbS.A0z(C60203JhM.class));
        AnonymousClass7TE.A1Z(new MG5(this, (AnonymousClass4D7) null, 30), AnonymousClass07a.A00(r6));
    }
}
