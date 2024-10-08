package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6bU  reason: invalid class name and case insensitive filesystem */
public final class C310706bU implements AnonymousClass2lD {
    public C311226cL A00;
    public final UserSession A01;
    public final 2el A02;
    public final C229932oe A03 = new C229932oe();
    public final AnonymousClass4DU A04;
    public final C311226cL A05;
    public final C311236cM A06;
    public final C311196cI A07;
    public final List A08;
    public final Set A09;

    public C310706bU(Context context, FragmentActivity fragmentActivity, C46505Dg8 dg8, UserSession userSession, 2el r23, C310696bT r24, C309986aF r25, C310016aI r26, C310666bQ r27, C310676bR r28) {
        2el r8 = r23;
        0qQ.A0B(r8, 3);
        C309986aF r15 = r25;
        0qQ.A0B(r15, 4);
        C310016aI r1 = r26;
        0qQ.A0B(r1, 7);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 8);
        C310696bT r10 = r24;
        0qQ.A0B(r10, 9);
        C310666bQ r9 = r27;
        2O0 A002 = 2O0.A00(r9.A01);
        0qQ.A07(A002);
        Context context2 = context;
        C310716bV r6 = new C310716bV(context2, r9);
        C310796bd r11 = new C310796bd(context2, fragmentActivity, dg8, r15, r1, r9);
        C310986bw r5 = new C310986bw(r9);
        C311006by r3 = new C311006by(r9);
        C311046c2 r2 = new C311046c2(r9);
        C311006by r13 = r3;
        C311046c2 r14 = r2;
        C310986bw r12 = r5;
        C310716bV r102 = r6;
        ArrayList A012 = C256393vh.A01(r102, r11, r12, r13, r14, new C311096c8(r9), new C311156cE(r10, r9));
        AnonymousClass4DU r0 = r9.A02;
        this.A02 = r8;
        this.A01 = userSession2;
        this.A04 = r0;
        this.A07 = new C311196cI(A002);
        this.A05 = new C311226cL(new C311206cJ(r28));
        this.A06 = new C311236cM(userSession2);
        this.A08 = A012;
        this.A09 = new HashSet();
    }

    /* JADX WARNING: type inference failed for: r15v5, types: [X.30a, X.30Z] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        if (r6.A0g == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r23, X.C250603lj r24, X.C255773uh r25, X.C250973mM r26, X.C309426Yf r27, java.lang.Integer r28, int r29) {
        /*
            r22 = this;
            r10 = 0
            r9 = 1
            r4 = r22
            X.6cM r11 = r4.A06
            X.6cI r1 = r4.A07
            r3 = r26
            com.instagram.model.reels.Reel r8 = r3.A0H
            java.lang.String r2 = r8.getId()
            X.0qQ.A07(r2)
            java.util.Map r13 = r1.A01
            java.lang.Object r0 = r13.get(r2)
            r6 = r25
            if (r0 != 0) goto L_0x002a
            X.2O0 r0 = r1.A00
            boolean r0 = r0.CaU(r8, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13.put(r2, r0)
        L_0x002a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            X.6YY r7 = new X.6YY
            r12 = r27
            r7.<init>(r3, r11, r12, r0)
            X.3mL r2 = r6.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r2 != r0) goto L_0x0042
            X.3OA r2 = r6.A0g
            r0 = 1
            if (r2 != 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            java.lang.String r2 = "_item_"
            if (r0 == 0) goto L_0x00f2
            com.instagram.common.session.UserSession r14 = r4.A01
            java.lang.String r5 = r6.A0j
            java.lang.String r0 = r6.A0k
            java.lang.String r2 = X.002.A0g(r5, r2, r0)
            X.30X r0 = X.AnonymousClass30X.A02
            X.30Z r15 = new X.30Z
            r15.<init>(r6, r7, r2)
            r15.A00 = r14
            X.3OA r0 = r6.A0g
            if (r0 == 0) goto L_0x0060
            r15.A01 = r0
        L_0x0060:
            X.6cL r0 = r4.A00
            r15.A00(r0)
            r15.A00(r11)
            r0 = r24
            if (r24 == 0) goto L_0x006f
            r15.A00(r0)
        L_0x006f:
            X.2oe r7 = r4.A03
            java.lang.String r0 = r8.getId()
            X.0qQ.A07(r0)
            X.30Y r2 = r7.A00(r0)
            X.30Y r0 = X.AnonymousClass30Y.A07
            r20 = r29
            if (r0 == r2) goto L_0x00b8
            r11 = 0
        L_0x0083:
            java.util.List r0 = r4.A08
            java.util.Iterator r12 = r0.iterator()
        L_0x0089:
            boolean r0 = r12.hasNext()
            r14 = r23
            r2 = r28
            if (r0 == 0) goto L_0x0103
            java.lang.Object r13 = r12.next()
            X.6bW r13 = (X.C310726bW) r13
            int r0 = r2.intValue()
            if (r0 == r10) goto L_0x00b4
            if (r0 == r9) goto L_0x00aa
            r13.ABc(r15, r11, r6, r3)
        L_0x00a4:
            if (r11 == 0) goto L_0x0089
            r11.A00(r1)
            goto L_0x0089
        L_0x00aa:
            r18 = r3
            r17 = r6
            r16 = r11
            r13.ABh(r14, r15, r16, r17, r18)
            goto L_0x00a4
        L_0x00b4:
            r13.ABe(r15, r11, r6, r3)
            goto L_0x00a4
        L_0x00b8:
            java.lang.String r2 = r8.getId()
            X.0qQ.A07(r2)
            java.lang.Object r0 = r13.get(r2)
            if (r0 != 0) goto L_0x00d2
            X.2O0 r0 = r1.A00
            boolean r0 = r0.CaU(r8, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13.put(r2, r0)
        L_0x00d2:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r21 = r0.booleanValue()
            X.6YZ r2 = new X.6YZ
            r17 = r6
            r18 = r11
            r19 = r12
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.String r0 = r8.getId()
            X.0qQ.A07(r0)
            X.30a r11 = new X.30a
            r11.<init>(r3, r2, r0)
            goto L_0x0083
        L_0x00f2:
            java.lang.String r5 = r6.A0j
            java.lang.String r0 = r6.A0k
            java.lang.String r2 = X.002.A0g(r5, r2, r0)
            X.30Y r0 = X.AnonymousClass30Y.A07
            X.30a r15 = new X.30a
            r15.<init>(r6, r7, r2)
            goto L_0x0060
        L_0x0103:
            java.util.Set r0 = r4.A09
            java.util.Iterator r3 = r0.iterator()
        L_0x0109:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r1 = r3.next()
            X.2w1 r1 = (X.C233612w1) r1
            int r0 = r2.intValue()
            if (r0 == r10) goto L_0x0125
            if (r0 == r9) goto L_0x0121
            r1.ABb(r15)
            goto L_0x0109
        L_0x0121:
            r1.ABg(r15)
            goto L_0x0109
        L_0x0125:
            r1.ABd(r15)
            goto L_0x0109
        L_0x0129:
            if (r11 == 0) goto L_0x0139
            X.30Y r1 = r11.A01()
            java.lang.String r0 = r8.getId()
            X.0qQ.A07(r0)
            r7.A01(r1, r0)
        L_0x0139:
            java.lang.String r0 = r8.getId()
            X.0qQ.A07(r0)
            X.30Y r0 = r7.A00(r0)
            r15.A02(r0)
            X.6cL r0 = r4.A05
            r15.A00(r0)
            X.2el r1 = r4.A02
            X.30Y r0 = r15.A01()
            r1.A05(r14, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x01af
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330539946361518(0x81126f000042ae, double:3.0389179811966724E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01af
            X.4DU r0 = r4.A04
            X.HnI r13 = new X.HnI
            r13.<init>(r3, r0)
            X.3OA r4 = r6.A0g
            if (r4 == 0) goto L_0x0177
            X.1Xj r12 = r4.A0K
            if (r12 != 0) goto L_0x017b
        L_0x0177:
            X.1Xj r12 = r6.A0b
            if (r12 == 0) goto L_0x01af
        L_0x017b:
            X.0qQ.A07(r5)
            com.instagram.common.session.UserSession r0 = r13.A00
            java.lang.String r15 = r6.ByO(r0)
            if (r15 != 0) goto L_0x018a
            java.lang.String r15 = r12.C9L()
        L_0x018a:
            X.49W r3 = r13.A02
            X.49S r2 = r13.A03
            java.lang.String r9 = "story_ads"
            X.4DU r0 = r13.A01
            java.lang.String r10 = r0.getModuleName()
            X.GAN r1 = new X.GAN
            r6 = r1
            r7 = r14
            r8 = r2
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x01b0
            java.lang.String r0 = r4.A0S
        L_0x01a3:
            X.IcD r11 = new X.IcD
            r14 = r0
            r16 = r20
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = 0
            r3.A00(r0, r11, r1)
        L_0x01af:
            return
        L_0x01b0:
            r0 = 0
            goto L_0x01a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310706bU.A00(android.view.View, X.3lj, X.3uh, X.3mM, X.6Yf, java.lang.Integer, int):void");
    }

    public final void A8h(C233612w1 r2) {
        0qQ.A0B(r2, 0);
        this.A09.add(r2);
    }

    public final void EDk(C233612w1 r2) {
        0qQ.A0B(r2, 0);
        this.A09.remove(r2);
    }
}
