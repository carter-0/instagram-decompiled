package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.H3t  reason: case insensitive filesystem */
public final class C54224H3t extends C331047Ph implements C231272rL, C231302rO, AnonymousClass71P {
    public final UserSession A00;
    public final C273674n0 A01;
    public final C53039GhV A02;
    public final LRh A03;
    public final C15553Ueh A04;
    public final C229122ms A05;
    public final C231762sK A06;
    public final 0sP A07;
    public final Context A08;
    public final Map A09 = AnonymousClass7TE.A1E();

    public C54224H3t(Context context, AnonymousClass0iw r14, UserSession userSession, C53039GhV ghV, LRh lRh, AnonymousClass32Q r18, C229122ms r19, 0sP r20) {
        AnonymousClass32Q r3 = r18;
        C229122ms r1 = r19;
        C51974G9v.A1M(userSession, r1, r3);
        C53039GhV ghV2 = ghV;
        0qQ.A0B(ghV2, 6);
        this.A08 = context;
        this.A00 = userSession;
        this.A05 = r1;
        this.A02 = ghV2;
        this.A03 = lRh;
        this.A07 = r20;
        this.A01 = new C273674n0((C324266yu) null, r3, AnonymousClass05K.A01);
        AnonymousClass0iw r5 = r14;
        C15553Ueh ueh = new C15553Ueh(context, r5, userSession, new C57229ITq(this), new WX2(this), true, false, true);
        this.A04 = ueh;
        C231762sK r0 = new C231762sK(context);
        this.A06 = r0;
        A0B(ueh, r0);
    }

    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A09;
        AnonymousClass6u8 r1 = (AnonymousClass6u8) map.get(str);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass6u8 r12 = new AnonymousClass6u8();
        r12.A03 = true;
        map.put(str, r12);
        return r12;
    }

    public final void EZ4(int i) {
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void A0C() {
        A06();
        C273674n0 r6 = this.A01;
        r6.A06();
        int A022 = r6.A02();
        for (int i = 0; i < A022; i++) {
            C3251571g A0E = r6.A0E(i);
            AnonymousClass6u8 BQA = BQA(AnonymousClass7TF.A0h(A0E));
            boolean z = true;
            if (this.A05.CKB() || i != r6.A02() - 1) {
                z = false;
            }
            BQA.A00(i, z);
            A09(this.A04, A0E, BQA);
        }
        C229122ms r1 = this.A05;
        if (r1.CKB()) {
            A08(this.A06, r1);
        }
        A07();
    }
}
