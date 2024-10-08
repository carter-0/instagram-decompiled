package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

public final class OM2 {
    public float A00;
    public int A01;
    public MediaViewerReplyBarEligibilityChecker A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public List A06 = 0sn.A00;
    public C62320sa A07;
    public 0sP A08;
    public 0sP A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C = true;
    public L4N A0D;
    public C68168N3i A0E;
    public final View A0F;
    public final Context A0G;
    public final UserSession A0H;
    public final AnonymousClass7H6 A0I;
    public final AnonymousClass2Ep A0J;
    public final DirectShareTarget A0K;
    public final C254743sy A0L;

    public OM2(Context context, View view, UserSession userSession, AnonymousClass7H6 r7, DirectShareTarget directShareTarget, C254743sy r9) {
        AnonymousClass3U9 r0;
        boolean z;
        DbW.A1N(userSession, 2, view);
        this.A0G = context;
        this.A0H = userSession;
        this.A0L = r9;
        this.A0K = directShareTarget;
        this.A0F = view;
        this.A0I = r7;
        Integer num = AnonymousClass05K.A01;
        this.A03 = num;
        this.A04 = num;
        this.A0E = C68168N3i.A00(view);
        this.A02 = new MediaViewerReplyBarEligibilityCheckerImpl(false, false, false);
        this.A0D = new L4N(new P19(this, 1));
        if (C66647MaG.A04(r9) != null) {
            r0 = C66647MaG.A02(1bJ.A00(userSession), r9);
        } else {
            r0 = null;
        }
        this.A0J = r0;
        if (r0 != null) {
            z = r0.CVE();
        } else {
            z = false;
        }
        this.A0A = z;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r6.A0B != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36319407392431402L) == false) goto L_0x00ad;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r37 = this;
            X.9HD r4 = X.AnonymousClass9HC.A1b
            r6 = r37
            com.instagram.common.session.UserSession r3 = r6.A0H
            android.os.Parcelable$Creator r0 = com.instagram.direct.capabilities.Capabilities.CREATOR
            X.0sn r2 = X.0sn.A00
            X.9HC r7 = X.C66581MXm.A0X(r3, r4, r2)
            android.content.Context r11 = r6.A0G
            X.76d r13 = X.C3262776c.A00(r11, r3)
            java.util.List r1 = r6.A06
            int r0 = r6.A01
            java.lang.Object r8 = r1.get(r0)
            X.Oa5 r8 = (X.C71039Oa5) r8
            X.3sy r5 = r6.A0L
            boolean r0 = r5 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x00f6
            X.0eM r0 = r7.A19
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x00f6
            r12 = 0
            boolean r7 = r6.A0A
            X.2Ep r0 = r6.A0J
            if (r0 == 0) goto L_0x00f3
            X.ODs r0 = r0.B25()
            if (r0 == 0) goto L_0x00f3
            java.lang.Long r1 = r0.A01
        L_0x003b:
            java.lang.String r0 = r6.A05
            r19 = 0
            r16 = r5
            r17 = r1
            r18 = r0
            r20 = r7
            r14 = r3
            r15 = r8
            X.77B r0 = r13.A03(r14, r15, r16, r17, r18, r19, r20)
            java.util.List r7 = X.AnonymousClass7TE.A1I(r0)
        L_0x0051:
            if (r12 != 0) goto L_0x00ef
            r0 = 0
        L_0x0054:
            X.9HC r10 = X.C66581MXm.A0X(r3, r4, r2)
            boolean r8 = r6.A0A
            if (r8 == 0) goto L_0x00eb
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
        L_0x005e:
            X.2Ep r1 = r6.A0J
            if (r1 == 0) goto L_0x00e8
            com.instagram.direct.model.DirectThreadThemeInfo r4 = r1.C5v()
        L_0x0066:
            r16 = 0
            X.7Kt r2 = X.C329927Kt.A00
            X.7L2 r4 = r2.A01(r11, r10, r4, r9)
            X.7H6 r2 = r6.A0I
            r36 = r2
            com.instagram.model.direct.DirectShareTarget r2 = r6.A0K
            r17 = r2
            X.N3i r15 = r6.A0E
            X.L4N r2 = r6.A0D
            if (r2 == 0) goto L_0x00e6
            java.lang.String r9 = r2.A01
        L_0x007e:
            if (r8 != 0) goto L_0x0086
            boolean r2 = r6.A0B
            r31 = 1
            if (r2 == 0) goto L_0x0088
        L_0x0086:
            r31 = 0
        L_0x0088:
            float r14 = r6.A00
            boolean r13 = r6.A0C
            r33 = 0
            X.7L0 r12 = r4.A07
            X.7Kx r8 = r4.A04
            java.lang.Integer r4 = r6.A03
            if (r1 == 0) goto L_0x00ad
            int r2 = r1.C6a()
            r1 = 29
            if (r2 != r1) goto L_0x00ad
            X.0Tu r10 = X.0Tu.A05
            r1 = 36319407392431402(0x81084f00141d2a, double:3.0318777092640704E-306)
            boolean r1 = X.182.A06(r10, r3, r1)
            r35 = 1
            if (r1 != 0) goto L_0x00af
        L_0x00ad:
            r35 = 0
        L_0x00af:
            X.0sP r11 = r6.A08
            X.0sP r10 = r6.A09
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker r3 = r6.A02
            X.0sa r2 = r6.A07
            java.lang.Integer r1 = r6.A04
            r25 = r7
            r26 = r2
            r27 = r11
            r28 = r10
            r29 = r14
            r30 = r0
            r32 = r13
            r34 = r33
            r22 = r4
            r23 = r1
            r24 = r9
            r19 = r15
            r20 = r17
            r21 = r5
            r17 = r8
            r18 = r12
            r14 = r36
            r15 = r3
            r14.A0g(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            android.view.View r1 = r6.A0F
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x00e6:
            r9 = 0
            goto L_0x007e
        L_0x00e8:
            r4 = 0
            goto L_0x0066
        L_0x00eb:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x005e
        L_0x00ef:
            int r0 = r6.A01
            goto L_0x0054
        L_0x00f3:
            r1 = 0
            goto L_0x003b
        L_0x00f6:
            r12 = 1
            java.util.List r0 = r6.A06
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0101:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r9 = r10.next()
            X.Oa5 r9 = (X.C71039Oa5) r9
            boolean r8 = r6.A0A
            X.2Ep r0 = r6.A0J
            if (r0 == 0) goto L_0x0131
            X.ODs r0 = r0.B25()
            if (r0 == 0) goto L_0x0131
            java.lang.Long r1 = r0.A01
        L_0x011b:
            java.lang.String r0 = r6.A05
            r19 = 0
            r16 = r5
            r17 = r1
            r18 = r0
            r20 = r8
            r14 = r3
            r15 = r9
            X.77B r0 = r13.A03(r14, r15, r16, r17, r18, r19, r20)
            r7.add(r0)
            goto L_0x0101
        L_0x0131:
            r1 = 0
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OM2.A00():void");
    }
}
