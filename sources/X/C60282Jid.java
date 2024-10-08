package X;

import com.instagram.user.model.User;

/* renamed from: X.Jid  reason: case insensitive filesystem */
public final class C60282Jid extends 2YL {
    public final KWY A00;
    public final 1Xj A01;
    public final String A02;
    public final AnonymousClass0r6 A03;
    public final 0V2 A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final C54434HDi A07;

    public static final void A00(C60282Jid jid, int i) {
        Object value;
        boolean z;
        boolean z2;
        MQL mql;
        L0M l0m;
        05G r6 = jid.A05;
        do {
            value = r6.getValue();
            C61067Jw5 jw5 = (C61067Jw5) value;
            z = true;
            if (i <= 1) {
                z = false;
            }
            z2 = jw5.A04;
            mql = (MQL) jw5.A02;
            l0m = (L0M) jw5.A01;
            AnonymousClass7TG.A1Q(mql, l0m);
        } while (!r6.AIY(value, new C61067Jw5(l0m, mql, z2, z)));
    }

    public final void A01(MQN mqn) {
        Object value;
        boolean z;
        MQL mql;
        L0M l0m;
        C318136oS A002;
        int i;
        Object value2;
        boolean z2;
        MQL mql2;
        L0M l0m2;
        if (mqn instanceof C65039LmI) {
            05G r6 = this.A05;
            do {
                value2 = r6.getValue();
                C61067Jw5 jw5 = (C61067Jw5) value2;
                z2 = jw5.A03;
                mql2 = (MQL) jw5.A02;
                l0m2 = (L0M) jw5.A01;
                AnonymousClass7TG.A1Q(mql2, l0m2);
            } while (!r6.AIY(value2, new C61067Jw5(l0m2, mql2, false, z2)));
            A002 = C318116oQ.A00(this);
            i = 22;
        } else if (mqn instanceof C65037LmG) {
            A002 = C318116oQ.A00(this);
            i = 23;
        } else if (mqn instanceof C65036LmF) {
            05G r62 = this.A05;
            do {
                value = r62.getValue();
                C61067Jw5 jw52 = (C61067Jw5) value;
                z = jw52.A03;
                mql = (MQL) jw52.A02;
                l0m = (L0M) jw52.A01;
                AnonymousClass7TG.A1Q(mql, l0m);
            } while (!r62.AIY(value, new C61067Jw5(l0m, mql, true, z)));
            return;
        } else if (mqn instanceof C65038LmH) {
            KWY kwy = this.A00;
            05G r2 = kwy.A02;
            do {
            } while (!r2.AIY(r2.getValue(), kwy.A00.next()));
            return;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        AnonymousClass7TF.A1K(this, A002, i);
    }

    public C60282Jid(KWY kwy, C54434HDi hDi, String str) {
        1Xj r2;
        MQL mql;
        String str2;
        DUO Bhn;
        String text;
        this.A00 = kwy;
        this.A07 = hDi;
        this.A02 = str;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A04 = A012;
        this.A03 = A012;
        if (str != null) {
            r2 = DbV.A0U(hDi.A01, str);
        } else {
            r2 = null;
        }
        this.A01 = r2;
        if (r2 == null || C51966G9m.A11(r2) == null) {
            mql = C65032LmB.A00;
        } else {
            User A11 = C51966G9m.A11(r2);
            if (A11 != null) {
                str2 = A11.getUsername();
            } else {
                str2 = null;
            }
            String str3 = "";
            str2 = str2 == null ? str3 : str2;
            C46314DUr BeN = r2.A0C.BeN();
            if (!(BeN == null || (Bhn = BeN.Bhn()) == null || (text = Bhn.getText()) == null)) {
                str3 = text;
            }
            mql = new C65031LmA(str2, str3);
        }
        02z A10 = DbS.A10(new C61067Jw5((L0M) kwy.A04.getValue(), mql));
        this.A05 = A10;
        this.A06 = 10b.A03(A10);
        JTO.A1Y(num, new C66183MGu(this, (AnonymousClass4D7) null, 21), C318116oQ.A00(this));
    }
}
