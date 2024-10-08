package X;

import android.animation.LayoutTransition;

/* renamed from: X.LgO  reason: case insensitive filesystem */
public final class C64693LgO implements 1wn {
    public final /* synthetic */ C247733gp A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C317586nV A02;
    public final /* synthetic */ C316986mX A03;

    public C64693LgO(C247733gp r1, C255773uh r2, C317586nV r3, C316986mX r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-865674674);
        C240153Ju r9 = (C240153Ju) obj;
        int A0D = AnonymousClass7TG.A0D(r9, 1994274277);
        1Xj r1 = r9.A04;
        if (r1 != null) {
            C255773uh r6 = this.A01;
            if (r1.equals(r6.A0b)) {
                C316986mX r3 = this.A03;
                C247733gp r2 = this.A00;
                C317586nV r12 = this.A02;
                if (!r3.A04) {
                    r3.A04 = true;
                    r12.D0o();
                    LayoutTransition layoutTransition = r3.A06.getLayoutTransition();
                    layoutTransition.addTransitionListener(new C64197LTh(layoutTransition));
                    layoutTransition.enableTransitionType(4);
                    C316986mX.A01(r2, r6, r3);
                    AnonymousClass7TE.A1U(r3.A05, true);
                }
            }
        }
        AnonymousClass0fD.A0A(-808058532, A0D);
        AnonymousClass0fD.A0A(246131822, A032);
    }
}
