package X;

import com.instagram.archive.data.HighlightsSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jfj  reason: case insensitive filesystem */
public final class C60103Jfj extends C361478gI {
    public final HighlightsSettingsRepository A00;
    public final UserSession A01;
    public final C323016wn A02;
    public final C322986wk A03;
    public final C262224Cq A04 = 19E.A02(AnonymousClass12T.A00.AOJ(-18, 3));
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6wo, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60103Jfj(android.app.Application r21, com.instagram.common.session.UserSession r22) {
        /*
            r20 = this;
            r13 = 1
            r0 = r21
            r7 = r22
            X.AnonymousClass7TF.A1B(r7, r13, r0)
            r3 = r20
            r3.<init>(r0)
            r3.A01 = r7
            r8 = 0
            X.6wo r0 = new X.6wo
            r0.<init>()
            com.instagram.archive.data.HighlightsSettingsRepository r4 = X.C323036wp.A00(r0, r7)
            r3.A00 = r4
            X.6wn r0 = X.C323006wm.A00(r7)
            r3.A02 = r0
            r2 = 0
            r6 = 3
            X.6wk r5 = new X.6wk
            r5.<init>(r6, r2)
            r3.A03 = r5
            X.12T r1 = X.AnonymousClass12T.A00
            r0 = -18
            X.0nV r0 = r1.AOJ(r0, r6)
            X.19S r0 = X.19E.A02(r0)
            r3.A04 = r0
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r7)
            boolean r17 = r0.A2S()
            X.9I8 r0 = r4.A01()
            boolean r1 = r0.A02
            X.Ld8 r15 = X.Ld8.A00
            X.0sn r0 = X.0sn.A00
            X.62P r16 = A00(r3, r0, r2)
            X.JcX r14 = new X.JcX
            r19 = r2
            r18 = r1
            r14.<init>((X.C66386MPs) r15, (X.AnonymousClass62P) r16, (boolean) r17, (boolean) r18, (boolean) r19)
            X.02z r0 = X.DbS.A10(r14)
            r3.A05 = r0
            r3.A06 = r0
            X.0Ud r2 = r4.A03
            r1 = 13
            X.MGZ r0 = new X.MGZ
            r0.<init>(r3, r8, r1)
            X.DbY.A19(r3, r0, r2)
            X.0pa r2 = r5.A01
            r1 = 14
            X.MGZ r0 = new X.MGZ
            r0.<init>(r3, r8, r1)
            X.DbY.A19(r3, r0, r2)
            X.9I8 r0 = r4.A01()
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0091
            X.6wk r4 = r3.A03
            android.content.Context r5 = X.JTR.A0P(r3)
            com.instagram.common.session.UserSession r6 = r3.A01
            java.lang.String r12 = r6.A06
            X.6oz r7 = X.C318466oz.A00
            r9 = r8
            r10 = r8
            r11 = r8
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60103Jfj.<init>(android.app.Application, com.instagram.common.session.UserSession):void");
    }

    public final void A0E() {
        UserSession userSession = this.A01;
        1OP r0 = 1OP.$redex_init_class;
        AnonymousClass3PC A002 = AnonymousClass3PA.A00(userSession);
        0qQ.A07(A002);
        boolean z = this.A00.A01().A02;
        AnonymousClass7TE.A1Z(new C59672JTc(this, A002, (AnonymousClass4D7) null, 1, z), C318116oQ.A00(this));
    }

    public static final AnonymousClass62P A00(C60103Jfj jfj, List list, boolean z) {
        UserSession userSession = jfj.A01;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36322289314900017L);
        HighlightsSettingsRepository highlightsSettingsRepository = jfj.A00;
        boolean z2 = highlightsSettingsRepository.A01().A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A0U = 00k.A0U(list);
        01V.A1D(A0U, Reel.A00(userSession, list));
        Reel reel = (Reel) 00k.A0J(A0U);
        if ((z || A062) && (reel == null || !reel.A0l())) {
            A1C.add(new C318826pb(z, z2));
            A1C.add(C319916rR.A00);
        }
        if (A0U.isEmpty()) {
            A1C.add(new C319926rS(z2));
        } else {
            int i = 0;
            Iterator it = A0U.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                Reel reel2 = (Reel) next;
                Object r1 = new C318806pZ(userSession, new AnonymousClass3BT((AnonymousClass3BS) null, reel2, AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY), highlightsSettingsRepository.A01().A01);
                if (reel2.A0l()) {
                    if ((z || A062) && i == 0) {
                        A1C.add(r1);
                        r1 = C319916rR.A00;
                    }
                    i = i2;
                }
                A1C.add(r1);
                i = i2;
            }
        }
        if (00k.A0L(A1C) instanceof C319916rR) {
            018.A15(A1C);
        }
        return AnonymousClass62Q.A00(A1C);
    }
}
