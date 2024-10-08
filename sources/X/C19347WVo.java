package X;

import java.util.List;

/* renamed from: X.WVo  reason: case insensitive filesystem */
public final class C19347WVo implements X8Q {
    public final /* synthetic */ C15286UZq A00;

    public final void DZR(N3M n3m) {
        X9z x9z;
        String str;
        C15286UZq uZq = this.A00;
        List list = n3m.A0B;
        if (list == null || (x9z = (X9z) list.get(0)) == null || (str = ((UNP) x9z).A01) == null) {
            throw new IllegalStateException("action key should not be null");
        }
        C15286UZq.A01(n3m, uZq, str, true);
    }

    public C19347WVo(C15286UZq uZq) {
        this.A00 = uZq;
    }

    public final void Di2(N3M n3m) {
        C15286UZq uZq = this.A00;
        0wc r0 = uZq.A02;
        if (r0 == null) {
            0qQ.A0F("typedLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        1Ln A0H = 1Ln.A0H(r0);
        if (DbT.A1Y(A0H)) {
            C13989Tnp.A1J(A0H, n3m, n3m.A05);
            C13992Tns.A0n(A0H, uZq);
        }
        C67757MuC A07 = uZq.A07();
        C71108Ocm.A03(A07.A0C, A07.A0F, A07.A0G, C20753WyQ.A00);
    }

    public final boolean EtL(N3M n3m) {
        return this.A00.A07().A06();
    }

    public final void DKZ(UNB unb, N3M n3m) {
        boolean A1X = DbW.A1X(unb);
        C15286UZq uZq = this.A00;
        0wc r1 = uZq.A02;
        if (r1 == null) {
            0qQ.A0F("typedLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        1Ln r5 = new 1Ln(AnonymousClass7TE.A0e(r1, "instagram_inform_module_action_button_click"), 290);
        String valueOf = String.valueOf(n3m.A05);
        String str = n3m.A06;
        if (DbT.A1Y(r5)) {
            r5.A0R("category_id", valueOf);
            r5.A0R("category_name", str);
            r5.A0Q("inform_module_id", C51971G9r.A0n(A1X ? 1 : 0, valueOf));
            r5.A0R("inform_module_name", str);
            r5.A0R("action_button_name", unb.A02);
            C13992Tns.A0n(r5, uZq);
        }
        C15286UZq.A01((N3M) null, uZq, unb.A00, A1X);
    }
}
