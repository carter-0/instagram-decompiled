package X;

import android.animation.LayoutTransition;

/* renamed from: X.LgP  reason: case insensitive filesystem */
public final class C64694LgP implements 1wn {
    public final /* synthetic */ C247733gp A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C317586nV A02;
    public final /* synthetic */ C316986mX A03;

    public C64694LgP(C247733gp r1, C255773uh r2, C317586nV r3, C316986mX r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(286702064);
        C240163Jv r11 = (C240163Jv) obj;
        int A033 = AnonymousClass0fD.A03(1953949492);
        0qQ.A0B(r11, 0);
        1Xj r1 = r11.A01;
        if (r1 != null) {
            C255773uh r8 = this.A01;
            if (r1.equals(r8.A0b)) {
                C316986mX r4 = this.A03;
                C247733gp r3 = this.A00;
                C317586nV r2 = this.A02;
                boolean z = r11.A04;
                if (r4.A04) {
                    r4.A04 = false;
                    if (z) {
                        r2.D0m();
                    }
                    LayoutTransition layoutTransition = r4.A06.getLayoutTransition();
                    layoutTransition.addTransitionListener(new C64197LTh(layoutTransition));
                    layoutTransition.enableTransitionType(4);
                    C316986mX.A01(r3, r8, r4);
                    AnonymousClass7TG.A1A(r4.A05, true);
                }
            }
        }
        AnonymousClass0fD.A0A(964652186, A033);
        AnonymousClass0fD.A0A(2121982818, A032);
    }
}
