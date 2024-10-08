package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.P2k  reason: case insensitive filesystem */
public final class C72345P2k implements C74394PuA {
    public final Context A00;
    public final View.OnClickListener A01;
    public final C60189Jh8 A02;
    public final O79 A03;
    public final N4P A04;
    public final UserSession A05;
    public final boolean A06;

    public C72345P2k(Context context, View.OnClickListener onClickListener, UserSession userSession, C60189Jh8 jh8, O79 o79, N4P n4p, boolean z) {
        0qQ.A0B(userSession, 2);
        AnonymousClass7TG.A1S(o79, jh8);
        this.A00 = context;
        this.A05 = userSession;
        this.A04 = n4p;
        this.A06 = z;
        this.A03 = o79;
        this.A02 = jh8;
        this.A01 = onClickListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        if (r3.intValue() <= 0) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r23 = this;
            r0 = r23
            X.Jh8 r1 = r0.A02
            X.05G r1 = r1.A04
            java.lang.Object r2 = r1.getValue()
            if (r2 != 0) goto L_0x003a
            X.N4P r2 = r0.A04
            X.3Te r2 = r2.A0E
            if (r2 == 0) goto L_0x003a
            java.util.List r2 = r2.A0G
            if (r2 == 0) goto L_0x003a
            java.lang.Object r3 = X.00k.A0J(r2)
            X.JwB r3 = (X.C61073JwB) r3
            if (r3 == 0) goto L_0x003a
            r8 = 0
            r7 = 1
            java.lang.String r4 = r3.A02
            java.lang.String r2 = ""
            if (r4 != 0) goto L_0x0027
            r4 = r2
        L_0x0027:
            java.lang.String r5 = r3.A03
            if (r5 != 0) goto L_0x002c
            r5 = r2
        L_0x002c:
            java.lang.String r6 = r3.A01
            java.lang.Object r3 = r3.A00
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo r2 = new com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.Epw(r2)
        L_0x003a:
            java.lang.Object r2 = r1.getValue()
            if (r2 != 0) goto L_0x0066
            X.N4P r2 = r0.A04
            X.3Te r2 = r2.A0E
            if (r2 == 0) goto L_0x0066
            X.JwB r3 = r2.A03
            if (r3 == 0) goto L_0x0066
            r8 = 1
            r7 = 0
            java.lang.String r4 = r3.A02
            java.lang.String r2 = ""
            if (r4 != 0) goto L_0x0053
            r4 = r2
        L_0x0053:
            java.lang.String r5 = r3.A03
            if (r5 != 0) goto L_0x0058
            r5 = r2
        L_0x0058:
            java.lang.String r6 = r3.A01
            java.lang.Object r3 = r3.A00
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo r2 = new com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.Epw(r2)
        L_0x0066:
            java.lang.Object r4 = r1.getValue()
            com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo r4 = (com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo) r4
            if (r4 != 0) goto L_0x0071
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x0071:
            android.content.Context r2 = r0.A00
            r1 = 2131959339(0x7f131e2b, float:1.9555316E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r2, r1)
            r6 = 0
            X.Njo r10 = X.C69349Njo.TYPE_SWITCH
            boolean r3 = r0.A06
            r1 = 0
            X.PHu r9 = new X.PHu
            r9.<init>(r1, r0, r4)
            r1 = 1
            X.OIM r5 = new X.OIM
            r7 = r6
            r8 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r19 = r6
            r20 = r6
            r21 = r3
            r22 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = 2131959337(0x7f131e29, float:1.9555312E38)
            java.lang.String r3 = r2.getString(r3)
            X.FGF r12 = new X.FGF
            r12.<init>((java.lang.CharSequence) r3)
            X.N4P r3 = r0.A04
            X.3Te r3 = r3.A0E
            if (r3 == 0) goto L_0x00bb
            java.lang.Integer r3 = r3.A06
            if (r3 == 0) goto L_0x00bb
            int r3 = r3.intValue()
            r11 = 1
            if (r3 > 0) goto L_0x00bc
        L_0x00bb:
            r11 = 0
        L_0x00bc:
            java.lang.String r9 = r4.A03
            java.lang.String r10 = r4.A01
            if (r10 != 0) goto L_0x00c9
            r3 = 2131958716(0x7f131bbc, float:1.9554052E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r2, r3)
        L_0x00c9:
            com.instagram.common.typedurl.ImageUrl r8 = r4.A00
            if (r11 == 0) goto L_0x00cf
            android.view.View$OnClickListener r7 = r0.A01
        L_0x00cf:
            X.F01 r6 = new X.F01
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = 2131959338(0x7f131e2a, float:1.9555314E38)
            java.lang.String r0 = r2.getString(r0)
            X.DfA r10 = new X.DfA
            r10.<init>((java.lang.CharSequence) r0)
            X.OSr r13 = new X.OSr
            r13.<init>(r1)
            X.OSr r15 = new X.OSr
            r15.<init>(r1)
            r11 = r5
            r14 = r6
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r11, r12, r13, r14, r15}
            java.util.List r0 = X.0sr.A1P(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72345P2k.getItems():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r0.intValue() <= 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r1 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isEnabled() {
        /*
            r10 = this;
            X.N4P r9 = r10.A04
            X.3Te r7 = r9.A0E
            r0 = 0
            if (r7 == 0) goto L_0x0064
            java.lang.String r1 = r7.A07
        L_0x0009:
            com.instagram.common.session.UserSession r5 = r10.A05
            boolean r8 = X.C51966G9m.A1W(r5, r1)
            if (r7 == 0) goto L_0x0013
            java.util.List r0 = r7.A0G
        L_0x0013:
            r4 = 1
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r6 = r0 ^ 1
            if (r7 == 0) goto L_0x002d
            java.lang.Integer r0 = r7.A06
            if (r0 == 0) goto L_0x002d
            int r0 = r0.intValue()
            r3 = 1
            if (r0 > 0) goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            X.9HW r2 = X.AnonymousClass9HV.A00(r5)
            X.3t3 r1 = r9.A0L
            r0 = 40
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            if (r7 == 0) goto L_0x0066
            boolean r0 = r7.A0H
            if (r0 != r4) goto L_0x0066
            if (r6 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x0066
        L_0x0048:
            java.util.List r0 = r7.A0D
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0066
        L_0x0052:
            java.util.List r0 = r7.A0E
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0066
        L_0x005c:
            r0 = 0
            boolean r0 = X.AnonymousClass7K4.A03(r5, r0)
            if (r0 == 0) goto L_0x0066
            return r4
        L_0x0064:
            r1 = r0
            goto L_0x0009
        L_0x0066:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72345P2k.isEnabled():boolean");
    }
}
