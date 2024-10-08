package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.VkS  reason: case insensitive filesystem */
public final class C18044VkS {
    public final C229932oe A00;
    public final 2el A01;
    public final WUE A02;
    public final C15898UkM A03;

    public final void A01(C18001Vjd vjd, C17661Vbr vbr) {
        String A012 = vjd.A01();
        C2354830a A002 = AnonymousClass30Y.A00(vjd, vbr, A012);
        A002.A00(new C250603lj[]{this.A03}[0]);
        this.A00.A01(A002.A01(), A012);
    }

    public final void A02(C18001Vjd vjd, C17661Vbr vbr) {
        C250603lj[] r4 = {this.A02, this.A03};
        String A012 = vjd.A01();
        C2354830a A002 = AnonymousClass30Y.A00(vjd, vbr, A012);
        int i = 0;
        do {
            A002.A00(r4[i]);
            i++;
        } while (i < 2);
        this.A00.A01(A002.A01(), A012);
    }

    public final void A00(View view, String str) {
        C13988Tno.A14(view, this.A01, this.A00, str);
    }

    public C18044VkS(UserSession userSession, 2el r4, W03 w03, W1W w1w, X57 x57, boolean z) {
        AnonymousClass7TG.A1U(userSession, r4, w1w);
        this.A01 = r4;
        C229932oe r1 = new C229932oe();
        this.A00 = r1;
        this.A02 = new WUE(userSession, r1, x57);
        this.A03 = new C15898UkM(userSession, w03, w1w, z);
    }
}
