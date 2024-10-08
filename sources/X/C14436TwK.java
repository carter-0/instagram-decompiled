package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.TwK  reason: case insensitive filesystem */
public final class C14436TwK {
    public final Context A00;
    public final UserSession A01;
    public final C14450TwY A02;
    public final Set A03 = new LinkedHashSet();
    public final Set A04 = new LinkedHashSet();
    public final Set A05 = new LinkedHashSet();
    public final Set A06 = new LinkedHashSet();
    public final Set A07 = new LinkedHashSet();
    public final Set A08 = new LinkedHashSet();

    public C14436TwK(Context context, UserSession userSession, C14450TwY twY) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = twY;
    }

    public final void A00(AnonymousClass0iw r11, C66967Mg0 mg0, C14407Tva tva, User user) {
        if (mg0.A0H) {
            if (r11 != null) {
                C230012om r5 = new C230012om(r11, this.A01);
                String id = user.getId();
                int i = mg0.A00;
                AnonymousClass6KM r1 = new AnonymousClass6KM("su_in_search_null_state", id, r11.getModuleName());
                r1.A00 = i;
                r5.A07(new AnonymousClass6KN(r1));
            }
            C14406TvZ A002 = C14205Trk.A00(this.A01);
            A002.A03.remove(new C66632Ma1(user));
            1ES.A06(F88.A01(A002.A06, user.getId(), (String) null, (String) null), 359266386, false);
            for (C20917X4i CLu : this.A08) {
                CLu.CLu(user.getId());
            }
            return;
        }
        if (mg0.A0F) {
            C14017ToJ A003 = C14025ToR.A00(this.A01);
            synchronized (A003) {
                A003.A00.A05(user);
            }
        }
        for (C20917X4i CLu2 : this.A08) {
            CLu2.CLu(user.getId());
        }
        VGH.A00(new C15593UfL(this.A00, new C19556Wbg(2, mg0, user, this), this.A02), this.A01, tva, user.getId(), mg0.A08, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.Tvo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.Vvr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.Tvo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.Tvo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.model.hashtag.Hashtag r14, X.C66967Mg0 r15, X.C14407Tva r16) {
        /*
            r13 = this;
            r3 = 0
            r4 = r14
            X.0qQ.A0B(r14, r3)
            r12 = 1
            r5 = r15
            boolean r0 = r15.A0F
            r7 = r13
            r6 = r16
            if (r0 == 0) goto L_0x0030
            X.Tva r0 = X.C14407Tva.MAP
            if (r6 != r0) goto L_0x001f
            com.instagram.common.session.UserSession r0 = r13.A01
            X.Vvr r1 = X.VGC.A00(r0)
            monitor-enter(r1)
            X.ToI r0 = r1.A00     // Catch:{ all -> 0x002c }
            r0.A05(r14)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x001f:
            com.instagram.common.session.UserSession r0 = r13.A01
            X.Tvo r1 = X.C14416Tvl.A00(r0)
            monitor-enter(r1)
            X.ToI r0 = r1.A00     // Catch:{ all -> 0x002c }
            r0.A05(r14)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x002f:
            monitor-exit(r1)
        L_0x0030:
            java.util.Set r0 = r13.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0036:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r2.next()
            X.X4f r1 = (X.C20914X4f) r1
            java.lang.String r0 = r14.getId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.CLP(r0)
            goto L_0x0036
        L_0x004e:
            com.instagram.common.session.UserSession r8 = r13.A01
            java.lang.String r0 = r14.getId()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            java.lang.String r11 = r15.A08
            r9 = 0
            android.content.Context r1 = r13.A00
            X.TwY r0 = r13.A02
            X.Wbi r2 = new X.Wbi
            r2.<init>(r3, r4, r5, r6, r7)
            X.UfL r7 = new X.UfL
            r7.<init>(r1, r2, r0)
            X.VGH.A00(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14436TwK.A01(com.instagram.model.hashtag.Hashtag, X.Mg0, X.Tva):void");
    }

    public final void A02(Keyword keyword, C66967Mg0 mg0) {
        0qQ.A0B(keyword, 0);
        String str = keyword.A03;
        if (str == null) {
            str = keyword.A04;
        }
        if (mg0.A0F) {
            C14420Tvp A002 = C14417Tvm.A00(this.A01);
            synchronized (A002) {
                A002.A00.A05(keyword);
            }
        }
        for (C20915X4g CLV : this.A05) {
            CLV.CLV(str);
        }
        UserSession userSession = this.A01;
        String A0w = C66582MXn.A0w(mg0.A08);
        String str2 = keyword.A04;
        String str3 = keyword.A03;
        C15593UfL ufL = new C15593UfL(this.A00, new C19557Wbh(keyword, mg0, this, str), this.A02);
        0qQ.A0B(str2, 2);
        String str4 = null;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("fbsearch/hide_search_entities/");
        DbX.A1M(A0a, "section", A0w);
        String A0k = C51970G9q.A0k(AnonymousClass7TE.A1I(str2));
        0qQ.A07(A0k);
        A0a.A0G("keyword_names", A0k);
        if (!(str3 == null || str3.length() == 0)) {
            str4 = C51970G9q.A0k(AnonymousClass7TE.A1I(str3));
            0qQ.A07(str4);
        }
        A0a.A0G("keyword", str4);
        1OC A0M = A0a.A0M();
        A0M.A00 = ufL;
        1ES.A03(A0M);
    }

    public final void A03(C18072Vl0 vl0, C66967Mg0 mg0, C14407Tva tva) {
        C18072Vl0 vl02 = vl0;
        0qQ.A0B(vl0, 0);
        C66967Mg0 mg02 = mg0;
        C14407Tva tva2 = tva;
        if (mg0.A0F) {
            if (tva2 == C14407Tva.MAP) {
                C18646Vvr A002 = VGC.A00(this.A01);
                synchronized (A002) {
                    A002.A02.A05(vl0);
                }
            } else {
                C14415Tvk.A00(this.A01).A00.A05(vl0);
            }
        }
        for (C20916X4h CLi : this.A07) {
            String A052 = vl0.A00().A05();
            0qQ.A07(A052);
            CLi.CLi(A052);
        }
        UserSession userSession = this.A01;
        String A022 = vl0.A00().A02();
        0qQ.A07(A022);
        VGH.A00(new C15593UfL(this.A00, new C19558Wbi(1, vl02, mg02, tva2, this), this.A02), userSession, (C14407Tva) null, A022, mg0.A08, 2);
    }

    public final void A04(C66569MWx mWx, C66967Mg0 mg0) {
        if (mg0.A0F) {
            C14472Twu A002 = C14433TwH.A00(this.A01);
            synchronized (A002) {
                A002.A00.A05(mWx);
            }
        }
        for (C20913X4e CLC : this.A03) {
            CLC.CLC(mWx.getId());
        }
        VGH.A00(new C15593UfL(this.A00, new C19556Wbg(0, mg0, mWx, this), this.A02), this.A01, (C14407Tva) null, mWx.getId(), mg0.A08, 7);
    }
}
