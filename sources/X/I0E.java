package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class I0E {
    public final H8S A00;
    public final H8W A01;
    public final IPQ A02;
    public final AnonymousClass1FE A03;
    public final 1E8 A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass2z1 A06;
    public final C235012z6 A07;
    public final C235012z6 A08;
    public final C235012z6 A09;
    public final C234552yC A0A;
    public final C234622yL A0B;
    public final C235322zj A0C;
    public final Map A0D = AnonymousClass7TE.A1H();
    public final Map A0E = AnonymousClass7TE.A1H();
    public final AnonymousClass2z2 A0F;
    public final AnonymousClass2yG A0G;
    public final 1Ua A0H;
    public final AnonymousClass2pP A0I;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1FE, java.lang.Object] */
    public I0E(Context context, H8S h8s, UserSession userSession, C232852uY r21, AnonymousClass4DU r22, C249763kK r23) {
        Context context2 = context;
        C249763kK r8 = r23;
        DbW.A1N(r8, 3, context2);
        AnonymousClass4DU r6 = r22;
        this.A05 = r6;
        this.A00 = h8s;
        UserSession userSession2 = userSession;
        this.A04 = 1E7.A00(userSession2);
        this.A03 = new Object();
        AnonymousClass2pP A0f = C51972G9s.A0f(userSession2);
        this.A0I = A0f;
        1Ua A002 = 1UX.A00(C60960kU.A00, userSession2);
        0qQ.A07(A002);
        this.A0H = A002;
        AnonymousClass2z2 r4 = new AnonymousClass2z2(userSession2, r6, (C228182kv) null, r8, A002, "instagram_organic_vpvd_imp");
        this.A0F = r4;
        C232852uY r13 = r21;
        this.A0A = AnonymousClass2yB.A00(context2, userSession2, r13, r6, (AnonymousClass2lU) null);
        AnonymousClass2yG A003 = C234572yE.A00(userSession2);
        this.A0G = A003;
        this.A0B = C234592yH.A00(context2, userSession2, r13, r6, (AnonymousClass2lU) null, A003);
        0uX A004 = 0uX.A00(userSession2);
        0qQ.A07(A004);
        this.A0C = new C235322zj(userSession2, A004);
        this.A09 = new C235012z6(r4, A0f);
        this.A08 = new C235012z6(new C57470IbE(userSession2, r6, A002), A0f);
        this.A07 = new C235012z6(new AnonymousClass2z2(userSession2, r6, (C228182kv) null, r8, A002, "instagram_ad_vpvd_imp"), A0f);
        this.A06 = new AnonymousClass2z1(A0f);
        this.A01 = new H8W(C51972G9s.A0b(userSession2), userSession2, r6);
        this.A02 = new IPQ();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        if (r3 != null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass6JM r10, X.C305086Gl r11, X.C53293Glf r12, X.I0E r13, X.1Xj r14, java.lang.String r15) {
        /*
            int r7 = r12.A00
            r5 = 0
            if (r7 >= r5) goto L_0x0006
            r7 = 0
        L_0x0006:
            X.IPQ r4 = r13.A02
            java.util.Map r3 = r13.A0E
            java.lang.Object r2 = r3.get(r15)
            X.30Y r2 = (X.AnonymousClass30Y) r2
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r0 = r2.A04
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            if (r0 == 0) goto L_0x00e1
            int r0 = r0.getPosition()
            if (r0 != r7) goto L_0x00e1
        L_0x001e:
            X.6JK r10 = (X.AnonymousClass6JK) r10
            int r1 = r10.A02
            int r6 = r10.A09
            int r0 = r1 + r6
            r8 = 1
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r5, r1, r8, r0)
            int r3 = r10.A02
            r1 = r3
            X.6Gk r11 = (X.C305076Gk) r11
            int r0 = r11.A08
            if (r3 >= r0) goto L_0x0036
            r3 = r0
        L_0x0036:
            int r1 = r1 + r6
            int r0 = r11.A07
            if (r1 <= r0) goto L_0x003c
            r1 = r0
        L_0x003c:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r5, r3, r8, r1)
            java.util.Map r8 = r4.A03
            java.lang.String r9 = r2.A05
            java.lang.Object r3 = r8.get(r9)
            X.Hn1 r3 = (X.C55766Hn1) r3
            X.Hpv r1 = r4.A02
            java.util.Set r0 = r1.A01
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L_0x00de
            java.util.Map r0 = r1.A00
            r0.remove(r9)
            if (r3 != 0) goto L_0x00d9
            long r0 = r4.A00
            X.Hn1 r3 = new X.Hn1
            r3.<init>(r0)
            r8.put(r9, r3)
        L_0x0066:
            java.util.List r1 = r3.A01
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r7)
            r1.add(r0)
            java.util.List r1 = r3.A02
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6)
            r1.add(r0)
        L_0x007a:
            X.30Y r2 = r2.A02
            X.30Y r0 = X.AnonymousClass30Y.A07
            if (r2 == r0) goto L_0x00c8
            X.Hpv r1 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.viewpoint.core.ViewpointData<com.instagram.feed.media.Media, com.instagram.feed.ui.state.MediaState>"
            X.0qQ.A0C(r2, r0)
            X.0qQ.A0B(r2, r5)
            java.util.Set r0 = r1.A01
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L_0x00d7
            java.util.Map r1 = r1.A00
            java.lang.String r0 = r2.A05
            r1.remove(r0)
            r0 = 1
        L_0x009a:
            java.lang.String r3 = r2.A05
            java.lang.Object r2 = r8.get(r3)
            X.Hn1 r2 = (X.C55766Hn1) r2
            if (r0 == 0) goto L_0x00d4
            if (r2 == 0) goto L_0x00c9
            java.util.List r0 = r2.A01
            r0.clear()
            java.util.List r0 = r2.A02
            r0.clear()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A00 = r0
        L_0x00b4:
            java.util.List r1 = r2.A01
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r7)
            r1.add(r0)
            java.util.List r1 = r2.A02
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6)
            r1.add(r0)
        L_0x00c8:
            return
        L_0x00c9:
            long r0 = r4.A00
            X.Hn1 r2 = new X.Hn1
            r2.<init>(r0)
            r8.put(r3, r2)
            goto L_0x00b4
        L_0x00d4:
            if (r2 == 0) goto L_0x00c8
            goto L_0x00b4
        L_0x00d7:
            r0 = 0
            goto L_0x009a
        L_0x00d9:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A00 = r0
            goto L_0x0066
        L_0x00de:
            if (r3 == 0) goto L_0x007a
            goto L_0x0066
        L_0x00e1:
            java.util.Map r2 = r13.A0D
            java.lang.String r0 = r14.getId()
            java.lang.Object r1 = r2.get(r0)
            X.30Y r1 = (X.AnonymousClass30Y) r1
            if (r1 == 0) goto L_0x0110
            java.lang.Object r0 = r1.A04
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            if (r0 == 0) goto L_0x0110
            int r0 = r0.getPosition()
            if (r0 != r7) goto L_0x0110
        L_0x00fb:
            java.lang.Object r0 = r1.A04
            X.30a r0 = X.AnonymousClass30Y.A00(r14, r0, r15)
            r0.A02(r1)
            X.30Y r2 = r0.A01()
            r3.put(r15, r2)
            X.0qQ.A0A(r2)
            goto L_0x001e
        L_0x0110:
            X.3W1 r6 = X.G9t.A18(r14)
            r6.A0D(r7)
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x019d
            X.HOE r0 = X.HOE.CONTEXT
        L_0x011d:
            r6.A0f = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r6.A0w = r0
            java.lang.String r0 = r12.A05
            if (r0 == 0) goto L_0x012b
            r6.A1B = r0
        L_0x012b:
            java.lang.Integer r7 = r12.A02
            r0 = -1
            if (r7 == 0) goto L_0x019b
            int r1 = r7.intValue()
            if (r1 == r0) goto L_0x019b
            if (r1 == r5) goto L_0x0198
            r0 = 1
            if (r1 != r0) goto L_0x01a6
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x013d:
            r6.A14 = r0
            X.0tS r9 = X.DbT.A0h()
            X.0s0 r8 = r9.A10
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 229(0xe5, float:3.21E-43)
            boolean r1 = X.AnonymousClass7TG.A1a(r9, r8, r1, r0)
            java.lang.String r0 = r14.getId()
            X.30a r6 = X.AnonymousClass30Y.A00(r14, r6, r0)
            if (r1 == 0) goto L_0x015c
            X.2zj r0 = r13.A0C
            r6.A00(r0)
        L_0x015c:
            X.2z1 r0 = r13.A06
            r6.A00(r0)
            X.4DU r1 = r13.A05
            boolean r0 = X.HVN.A00(r14, r1)
            if (r0 == 0) goto L_0x0190
            X.2z6 r0 = r13.A07
        L_0x016b:
            r6.A00(r0)
            boolean r0 = X.HVN.A00(r14, r1)
            if (r0 == 0) goto L_0x018d
            X.2yL r0 = r13.A0B
        L_0x0176:
            r6.A00(r0)
            X.H8S r0 = r13.A00
            X.30Y r1 = X.DbU.A0a(r0, r6)
            java.lang.String r0 = r14.getId()
            if (r0 == 0) goto L_0x01a1
            r2.put(r0, r1)
            X.0qQ.A0A(r1)
            goto L_0x00fb
        L_0x018d:
            X.2yC r0 = r13.A0A
            goto L_0x0176
        L_0x0190:
            if (r7 == 0) goto L_0x0195
            X.2z6 r0 = r13.A08
            goto L_0x016b
        L_0x0195:
            X.2z6 r0 = r13.A09
            goto L_0x016b
        L_0x0198:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x013d
        L_0x019b:
            r0 = 0
            goto L_0x013d
        L_0x019d:
            X.HOE r0 = X.HOE.STANDALONE
            goto L_0x011d
        L_0x01a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01a6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I0E.A00(X.6JM, X.6Gl, X.Glf, X.I0E, X.1Xj, java.lang.String):void");
    }
}
