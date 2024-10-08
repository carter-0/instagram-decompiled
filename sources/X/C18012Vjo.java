package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Vjo  reason: case insensitive filesystem */
public final class C18012Vjo {
    public String A00 = "";
    public final C17280VPh A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public C18012Vjo(Context context, AnonymousClass0iw r15, UserSession userSession, C337287g2 r17, C17280VPh vPh, Integer num, List list, boolean z) {
        UserSession userSession2 = userSession;
        C337287g2 r3 = r17;
        C17280VPh vPh2 = vPh;
        C51973G9u.A0r(2, userSession2, vPh2, r3);
        this.A01 = vPh2;
        0eO r1 = 0eO.A02;
        this.A06 = C20695WxR.A00(this, r1, 46);
        this.A04 = C20695WxR.A00(this, r1, 45);
        this.A02 = AnonymousClass0eN.A00(0eO.A03, new C58222IoQ(r3, this, userSession2, list, 1, false, z));
        this.A05 = AnonymousClass0eN.A00(0eO.A04, new C58218IoM(32, r15, context, this, userSession2, num));
        this.A03 = C20695WxR.A00(userSession2, r1, 44);
    }

    public final void A00() {
        boolean A1b = G9t.A1b(this.A03);
        AnonymousClass0eM r2 = this.A05;
        C15475UdQ udQ = (C15475UdQ) r2.getValue();
        if (A1b) {
            udQ.A00 = 0;
        } else {
            udQ.A01 = false;
        }
        C15475UdQ udQ2 = (C15475UdQ) r2.getValue();
        udQ2.A01();
        udQ2.updateListView();
    }

    public final void A01(String str, int i, boolean z) {
        boolean A1b = G9t.A1b(this.A03);
        AnonymousClass0eM r2 = this.A05;
        C15475UdQ udQ = (C15475UdQ) r2.getValue();
        if (A1b) {
            udQ.A00 = 10;
        } else {
            udQ.A03.A00 = z;
            TwD twD = udQ.A02;
            twD.A01 = str;
            twD.A00 = i;
            udQ.A01 = true;
        }
        C15475UdQ udQ2 = (C15475UdQ) r2.getValue();
        udQ2.A01();
        udQ2.updateListView();
    }
}
