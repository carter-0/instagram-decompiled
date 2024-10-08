package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.H3r  reason: case insensitive filesystem */
public final class C54222H3r extends C331047Ph implements C231292rN, AnonymousClass36F, AnonymousClass71P {
    public final C273674n0 A00;
    public final C322186vO A01;
    public final AnonymousClass71R A02;
    public final 1sy A03;
    public final C229122ms A04;
    public final C231762sK A05;
    public final Map A06 = AnonymousClass7TE.A1E();
    public final Map A07 = AnonymousClass7TE.A1E();

    public C54222H3r(Context context, AnonymousClass0iw r12, UserSession userSession, C322186vO r14, AnonymousClass32J r15, 1sy r16, AnonymousClass32Q r17, C229122ms r18) {
        this.A01 = r14;
        this.A04 = r18;
        this.A03 = r16;
        AnonymousClass32Q r7 = r17;
        DbW.A1N(userSession, 1, r7);
        AnonymousClass71R r2 = new AnonymousClass71R(r12, userSession, (C267644bx) null, r15, r7, (String) null, (String) null);
        this.A02 = r2;
        r2.A01 = null;
        C231762sK r0 = new C231762sK(context);
        this.A05 = r0;
        A0B(r2, r0);
        this.A00 = new C273674n0(new C324266yu(context, r12, userSession), r7, AnonymousClass05K.A01);
    }

    public final boolean AJb(1Xj r2) {
        return this.A00.A0B(r2);
    }

    public final AnonymousClass6u8 BQA(String str) {
        Map map = this.A06;
        AnonymousClass6u8 r0 = (AnonymousClass6u8) map.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass6u8 r02 = new AnonymousClass6u8();
        map.put(str, r02);
        return r02;
    }

    public final AnonymousClass3W1 BQr(1Xj r4) {
        Map map = this.A07;
        AnonymousClass3W1 r1 = (AnonymousClass3W1) map.get(r4);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass3W1 A18 = G9t.A18(r4);
        A18.A0O(this.A03);
        map.put(r4, A18);
        return A18;
    }

    public final boolean isEmpty() {
        if (this.A00.A02() == 0) {
            return true;
        }
        return false;
    }

    public final void A0C() {
        A06();
        C273674n0 r5 = this.A00;
        r5.A08(this.A01);
        for (int i = 0; i < r5.A02(); i++) {
            C3251571g A0E = r5.A0E(i);
            AnonymousClass6u8 BQA = BQA(AnonymousClass7TF.A0h(A0E));
            boolean z = true;
            if (this.A04.CKB() || i != r5.A02() - 1) {
                z = false;
            }
            BQA.A00(i, z);
            A09(this.A02, A0E, BQA);
        }
        C229122ms r1 = this.A04;
        if (r1.CKB() || r1.CT5()) {
            A08(this.A05, r1);
        }
        A07();
    }

    public final void Cs9(1Xj r2) {
        0fE.A00(this, -1570034876);
    }

    public final void DQv(1Xj r1) {
        A0C();
    }
}
