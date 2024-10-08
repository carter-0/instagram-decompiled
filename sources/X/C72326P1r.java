package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.P1r  reason: case insensitive filesystem */
public final class C72326P1r implements C74479PvZ {
    public final /* synthetic */ C70692OGn A00;

    public final void Cuu(C317966o8 r3, C69319NjK njK, int i) {
        C74511Pw6 pw6;
        0qQ.A0B(njK, 2);
        NJZ njz = this.A00.A03.A0A.A00;
        IgdsInlineSearchBox igdsInlineSearchBox = njz.A0A;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
        OJY ojy = njz.A07;
        if (ojy != null && (pw6 = ojy.A00.A02) != null) {
            pw6.Csp(r3, njK, i);
        }
    }

    public final void DuL(String str) {
    }

    public C72326P1r(C70692OGn oGn) {
        this.A00 = oGn;
    }

    public final void Cus() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00.A03.A0A.A00.A0A;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
    }

    public final void Cv8(C61077JwF jwF, int i) {
        C71083Ob6 ob6 = this.A00.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A1H = C51966G9m.A1H(ob6.A01.A01);
        int i2 = 0;
        while (A1H.hasNext()) {
            Object next = A1H.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            if (i2 == i) {
                A1C.add(jwF);
            } else {
                A1C.add(next);
            }
            i2 = i3;
        }
        C71083Ob6.A01(N47.A00(AnonymousClass05K.A0C, C71083Ob6.A00(ob6), ob6.A01.A04, A1C, false), ob6);
    }

    public final void DdJ(int i) {
        C71083Ob6 ob6 = this.A00.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A1H = C51966G9m.A1H(ob6.A01.A01);
        int i2 = 0;
        while (A1H.hasNext()) {
            Object next = A1H.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            int i4 = i;
            if (i2 == i4) {
                long j = (long) i4;
                UserSession userSession = ob6.A09;
                AnonymousClass0iw r9 = ob6.A08;
                C317966o8 r8 = (C317966o8) ((C61077JwF) ob6.A02.get(i2)).A00;
                String str = r8.A0U;
                if (str == null) {
                    str = "";
                }
                List A1I = AnonymousClass7TE.A1I(r8.A0S);
                C69447Nlr nlr = C69447Nlr.AI_STICKER;
                String str2 = ob6.A0E;
                boolean A0d = 00l.A0d(JTP.A0o(r8.A0H), ".webp", false);
                Long valueOf = Long.valueOf(j);
                UserSession userSession2 = userSession;
                AnonymousClass0iw r17 = r9;
                C71048OaQ.A01(nlr, r17, userSession2, valueOf, str, (String) null, str2, A1I, A0d);
                String str3 = r8.A0U;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                String str5 = str2;
                C71048OaQ.A03(C69480NmO.PAIR_AI_GENERATED, r17, userSession2, valueOf, str4, str5, AnonymousClass7TE.A1I(r8.A0S), 00l.A0d(JTP.A0o(r8.A0H), ".webp", false));
                next = ob6.A02.get(i2);
            }
            A1C.add(next);
            i2 = i3;
        }
        C71083Ob6.A01(N47.A00(AnonymousClass05K.A0C, C71083Ob6.A00(ob6), ob6.A01.A04, A1C, false), ob6);
    }
}
