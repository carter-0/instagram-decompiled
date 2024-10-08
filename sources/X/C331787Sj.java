package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Sj  reason: invalid class name and case insensitive filesystem */
public final class C331787Sj extends 2YL {
    public AnonymousClass7SA A00;
    public AnonymousClass7SB A01;
    public 0eP A02;
    public C262204Co A03;
    public boolean A04 = true;
    public boolean A05;
    public final AnonymousClass12T A06;
    public final UserSession A07;
    public final C331827Sn A08;
    public final C331717Sc A09;
    public final 2Dm A0A;
    public final AnonymousClass0eM A0B;
    public final C331797Sk A0C;
    public final AnonymousClass9HO A0D;
    public final AnonymousClass9HC A0E;
    public final AnonymousClass7SH A0F;
    public final C331617Rr A0G;
    public volatile boolean A0H;

    public C331787Sj(UserSession userSession, AnonymousClass9HO r7, AnonymousClass9HC r8, AnonymousClass7SH r9, C331617Rr r10, C331717Sc r11) {
        AnonymousClass0eM r0;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r10, 2);
        0qQ.A0B(r8, 3);
        0qQ.A0B(r11, 5);
        0qQ.A0B(r7, 6);
        this.A07 = userSession;
        this.A0G = r10;
        this.A0E = r8;
        this.A0F = r9;
        this.A09 = r11;
        this.A0D = r7;
        2Dm A002 = 1bJ.A00(userSession);
        this.A0A = A002;
        this.A0C = (C331797Sk) userSession.A01(C331797Sk.class, new C73918Ply(userSession, 18));
        this.A06 = AnonymousClass12T.A00;
        C331807Sl r2 = C331807Sl.A00;
        0eO r1 = 0eO.A03;
        if (C331817Sm.A00(userSession)) {
            r0 = AnonymousClass0eN.A00(r1, r2);
        } else {
            r0 = new 1Ue(r2.invoke());
        }
        this.A0B = r0;
        this.A05 = true;
        this.A08 = new C331827Sn(userSession, A002);
    }

    public final void A03(AnonymousClass7SD r12, DirectThreadKey directThreadKey) {
        0qQ.A0B(r12, 1);
        C318136oS A002 = C318116oQ.A00(this);
        this.A03 = 1Eo.A03(AnonymousClass05K.A00, this.A06.AOJ(1740191742, (int) 182.A01(0Tu.A05, this.A07, 36610090777843684L)), new AnonymousClass9KK(r12, directThreadKey, this, (AnonymousClass4D7) null, 1), A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (((java.lang.Number) r11.A0B.getValue()).intValue() < 2013) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass7SD r12, com.instagram.model.direct.DirectThreadKey r13) {
        /*
            r11 = this;
            r0 = 0
            r4 = r11
            boolean r9 = r11.A05
            r11.A05 = r0
            if (r9 == 0) goto L_0x0019
            X.0eM r0 = r11.A0B
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2013(0x7dd, float:2.821E-42)
            r10 = 1
            if (r1 >= r0) goto L_0x001a
        L_0x0019:
            r10 = 0
        L_0x001a:
            if (r10 == 0) goto L_0x004d
            com.instagram.common.session.UserSession r3 = r11.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318058773157695(0x810715001b173f, double:3.031024837004924E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0048
            X.4CZ r0 = X.AnonymousClass12W.A00
            X.134 r0 = X.AnonymousClass12y.A00
            X.134 r2 = r0.A0P()
        L_0x0033:
            X.4Cc r2 = (X.C262094Cc) r2
            X.6oS r1 = X.C318116oQ.A00(r11)
            r7 = 0
            r8 = 2
            X.9KJ r3 = new X.9KJ
            r6 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r2, r3, r1)
            return
        L_0x0048:
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r2 = r0.A04
            goto L_0x0033
        L_0x004d:
            X.12T r2 = r11.A06
            r1 = 302(0x12e, float:4.23E-43)
            r0 = 2
            X.0nV r2 = r2.AOJ(r1, r0)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331787Sj.A04(X.7SD, com.instagram.model.direct.DirectThreadKey):void");
    }

    public static final List A00(C331787Sj r8, AnonymousClass7SD r9, AnonymousClass2Ep r10, List list) {
        AnonymousClass7SA r0 = r8.A00;
        AnonymousClass7SD r4 = r9;
        List list2 = list;
        if (r0 != null) {
            return r0.F03(r9, list);
        }
        UserSession userSession = r8.A07;
        ((AnonymousClass7OP) userSession.A01(AnonymousClass7OP.class, new C73897PlY(userSession, 39))).A01(list);
        C331797Sk r02 = r8.A0C;
        C331617Rr r6 = r8.A0G;
        AnonymousClass9HC r2 = r8.A0E;
        AnonymousClass7SH r3 = r8.A0F;
        if (r3 != null) {
            return r02.A00(r8.A0D, r2, r3, r4, r10, r6, list2);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(C331787Sj r4, AnonymousClass7SD r5, List list) {
        long j;
        AnonymousClass7SB r3 = r4.A01;
        if (r3 != null) {
            ArrayList A0U = 00k.A0U(list);
            Long l = r4.A08.A01;
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            r3.DRu(r5, A0U, j);
        }
    }

    public final void A02(AnonymousClass7SB r5) {
        0eP r0;
        if (this.A01 == null) {
            this.A01 = r5;
            if (182.A06(0Tu.A05, this.A07, 36318058773485379L) && (r0 = this.A02) != null) {
                r5.DRt((List) r0.A01);
            }
        }
    }
}
