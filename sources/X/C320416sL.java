package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6sL  reason: invalid class name and case insensitive filesystem */
public abstract class C320416sL {
    public final Context A00;
    public final C270754hF A01;
    public final C320436sN A02;
    public final UserSession A03;
    public final C324356z9 A04;
    public final AnonymousClass0iw A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C320416sL(Context context, AnonymousClass07i r10, C270754hF r11, AnonymousClass0iw r12, UserSession userSession) {
        this(context, (C320446sO) null, r11, r12, userSession, new C228602lw(context, r10, (Integer) null), (String) null);
        0qQ.A0B(r10, 5);
    }

    public final void A01() {
        A00(this, (Long) null, (String) null, 0sn.A00, true, true, false, false);
    }

    public final void A04(Long l, String str, List list, boolean z) {
        0qQ.A0B(list, 0);
        A00(this, l, str, list, false, true, false, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C320416sL r20, java.lang.Long r21, java.lang.String r22, java.util.List r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r14 = r24
            r2 = r25
            r3 = r26
            r0 = r20
            if (r24 != 0) goto L_0x0018
            X.6z9 r5 = r0.A04
            X.6zA r4 = r5.A03
            java.lang.String r1 = r4.A07
            if (r1 != 0) goto L_0x0058
            java.lang.Integer r4 = r4.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r4 == r1) goto L_0x0058
        L_0x0018:
            r13 = 1
            X.4hF r4 = r0.A01
            boolean r5 = r4 instanceof X.C270744hE
            r1 = 0
            if (r5 == 0) goto L_0x0061
            com.instagram.common.session.UserSession r7 = r0.A03
            boolean r16 = X.1KU.A0B(r7)
            X.4hE r4 = (X.C270744hE) r4
            java.lang.Integer r8 = r4.Bec(r7)
            X.6sN r6 = r0.A02
            r5 = 24
            X.9Kp r12 = new X.9Kp
            r12.<init>(r0, r5)
            X.0qQ.A0B(r7, r1)
            r5 = 4
            X.0qQ.A0B(r8, r5)
            java.util.Set r11 = r6.A02
            java.util.List r10 = r6.A01
            X.6sO r6 = r6.A00
            r9 = 0
            X.GKf r5 = new X.GKf
            r15 = r13
            r18 = r1
            r17 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.6z9 r1 = r0.A04
            java.lang.Integer r4 = r4.AJJ(r7, r5, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r4 == r1) goto L_0x0061
        L_0x0057:
            return
        L_0x0058:
            r13 = 0
            r4 = 5
            r1 = 2
            boolean r1 = r5.A07(r4, r1, r2, r3)
            if (r1 == 0) goto L_0x0057
        L_0x0061:
            X.4hF r1 = r0.A01
            boolean r4 = r1 instanceof X.C320426sM
            if (r4 == 0) goto L_0x00ff
            X.6sM r1 = (X.C320426sM) r1
            com.instagram.common.session.UserSession r6 = r0.A03
            if (r13 == 0) goto L_0x00dd
            r3 = 0
            X.0qQ.A0B(r6, r3)
            X.73D r5 = X.AnonymousClass73D.A00
            java.lang.String r8 = r1.A02
            java.lang.Integer r7 = X.C320426sM.A03
            r9 = 0
            r10 = r9
            r11 = r14
            r12 = r3
            com.facebook.pando.PandoGraphQLRequest r5 = r5.A03(r6, r7, r8, r9, r10, r11, r12)
        L_0x007f:
            long r18 = java.lang.System.currentTimeMillis()
            X.6z9 r4 = r0.A04
            X.6sN r2 = r0.A02
            r15 = 1
            r10 = r2
            r11 = r6
            r12 = r9
            r16 = r3
            r17 = r3
            X.GKf r7 = r10.A00(r11, r12, r13, r14, r15, r16, r17)
            X.73F r6 = new X.73F
            r15 = r6
            r16 = r0
            r17 = r1
            r20 = r13
            r21 = r14
            r15.<init>(r16, r17, r18, r20, r21)
            X.6zA r3 = r4.A03
            java.lang.Integer r2 = r3.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 == r1) goto L_0x00cf
            r3.A00(r1)
            r7.onStart()
            X.73G r1 = new X.73G
            r1.<init>(r7, r3, r6)
            com.instagram.common.session.UserSession r6 = r4.A01
            X.73H r4 = new X.73H
            r4.<init>(r1)
            X.73I r3 = new X.73I
            r3.<init>(r1)
            r1 = 843957806(0x324dc62e, float:1.1977631E-8)
            X.0nX r2 = new X.0nX
            r2.<init>(r1)
            X.1vn r1 = X.1vm.A01(r6)
            r1.ATM(r3, r4, r5, r2)
        L_0x00cf:
            boolean r1 = r0 instanceof X.C320406sK
            if (r1 == 0) goto L_0x0057
            X.6sK r0 = (X.C320406sK) r0
            X.6uY r1 = r0.A00
            java.lang.String r0 = "graphql_request_executed"
            r1.A0E(r0)
            return
        L_0x00dd:
            X.6z9 r2 = r0.A04
            X.6zA r2 = r2.A03
            java.lang.String r4 = r2.A07
            r3 = 0
            X.0qQ.A0B(r6, r3)
            X.73D r15 = X.AnonymousClass73D.A00
            java.lang.String r2 = r1.A02
            java.lang.Integer r17 = X.C320426sM.A03
            r9 = 0
            r16 = r6
            r20 = r9
            r22 = r3
            r18 = r2
            r19 = r4
            r21 = r3
            com.facebook.pando.PandoGraphQLRequest r5 = r15.A03(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x007f
        L_0x00ff:
            boolean r4 = r1 instanceof X.C270764hG
            if (r4 == 0) goto L_0x0176
            r15 = r1
            X.4hG r15 = (X.C270764hG) r15
            r19 = r22
            r11 = r23
            r23 = r27
            com.instagram.common.session.UserSession r4 = r0.A03
            if (r13 == 0) goto L_0x0164
            android.content.Context r5 = r0.A00
            X.0sn r20 = X.0sn.A00
            r18 = r21
            r21 = r14
            r22 = r3
            r16 = r5
            r17 = r4
            X.1GP r3 = r15.Cmt(r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0122:
            if (r3 == 0) goto L_0x0176
            X.0Tu r5 = X.0Tu.A05
            r1 = 36323496200318148(0x810c0700052cc4, double:3.0344634878359564E-306)
            boolean r1 = X.182.A06(r5, r4, r1)
            if (r1 == 0) goto L_0x0149
            if (r24 == 0) goto L_0x0149
            X.6z9 r1 = r0.A04
            X.6zA r5 = r1.A03
            java.lang.Integer r2 = r5.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x0144
            X.11X r1 = r5.A01
            if (r1 == 0) goto L_0x0144
            r1.onCancel()
        L_0x0144:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r5.A00(r1)
        L_0x0149:
            X.6z9 r2 = r0.A04
            X.6sN r1 = r0.A02
            boolean r0 = r11.isEmpty()
            r10 = 1
            r12 = r0 ^ 1
            r5 = r1
            r6 = r4
            r7 = r19
            r8 = r13
            r9 = r14
            r11 = r23
            X.GKf r0 = r5.A00(r6, r7, r8, r9, r10, r11, r12)
            r2.A04(r3, r0)
            return
        L_0x0164:
            X.6z9 r5 = r0.A04
            X.6zA r5 = r5.A03
            java.lang.String r6 = r5.A07
            android.content.Context r5 = r0.A00
            r7 = r15
            r8 = r5
            r9 = r4
            r10 = r6
            r12 = r3
            X.1GP r3 = r7.Cmv(r8, r9, r10, r11, r12)
            goto L_0x0122
        L_0x0176:
            boolean r3 = r1 instanceof X.JSp
            if (r3 == 0) goto L_0x01e9
            X.JSp r1 = (X.JSp) r1
            com.instagram.common.session.UserSession r5 = r0.A03
            if (r25 == 0) goto L_0x01de
            if (r13 == 0) goto L_0x01d3
            X.1OC r6 = r1.BCc(r5, r14)
        L_0x0186:
            X.0Tu r1 = X.0Tu.A05
            r3 = 36323496200318148(0x810c0700052cc4, double:3.0344634878359564E-306)
            boolean r1 = X.182.A06(r1, r5, r3)
            if (r1 == 0) goto L_0x01ab
            if (r24 == 0) goto L_0x01ab
            X.6z9 r1 = r0.A04
            X.6zA r4 = r1.A03
            java.lang.Integer r3 = r4.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r3 != r1) goto L_0x01a6
            X.11X r1 = r4.A01
            if (r1 == 0) goto L_0x01a6
            r1.onCancel()
        L_0x01a6:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r4.A00(r1)
        L_0x01ab:
            X.6z9 r4 = r0.A04
            X.6sN r7 = r0.A02
            r9 = 0
            r0 = 0
            r8 = r5
            r10 = r13
            r11 = r14
            r12 = r0
            r13 = r2
            r14 = r0
            X.GKf r3 = r7.A00(r8, r9, r10, r11, r12, r13, r14)
            X.0qQ.A0B(r6, r0)
            X.6zA r2 = r4.A03
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0057
            X.H4x r0 = new X.H4x
            r0.<init>(r6, r3, r2)
            r6.A00 = r0
            X.4D6 r0 = r4.A02
            r0.schedule(r6)
            return
        L_0x01d3:
            X.6z9 r3 = r0.A04
            X.6zA r3 = r3.A03
            java.lang.String r3 = r3.A07
            X.1OC r6 = r1.C42(r5, r3)
            goto L_0x0186
        L_0x01de:
            X.6z9 r3 = r0.A04
            X.6zA r3 = r3.A03
            java.lang.String r3 = r3.A06
            X.1OC r6 = r1.Aez(r5, r3)
            goto L_0x0186
        L_0x01e9:
            com.instagram.common.session.UserSession r11 = r0.A03
            if (r13 == 0) goto L_0x0228
            X.1OC r3 = r1.BCc(r11, r14)
        L_0x01f1:
            X.0Tu r4 = X.0Tu.A05
            r1 = 36323496200318148(0x810c0700052cc4, double:3.0344634878359564E-306)
            boolean r1 = X.182.A06(r4, r11, r1)
            if (r1 == 0) goto L_0x0216
            if (r24 == 0) goto L_0x0216
            X.6z9 r1 = r0.A04
            X.6zA r4 = r1.A03
            java.lang.Integer r2 = r4.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x0211
            X.11X r1 = r4.A01
            if (r1 == 0) goto L_0x0211
            r1.onCancel()
        L_0x0211:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r4.A00(r1)
        L_0x0216:
            X.6z9 r1 = r0.A04
            X.6sN r10 = r0.A02
            r12 = 0
            r15 = 0
            r16 = r15
            r17 = r15
            X.GKf r0 = r10.A00(r11, r12, r13, r14, r15, r16, r17)
            r1.A03(r3, r0)
            return
        L_0x0228:
            X.6z9 r2 = r0.A04
            X.6zA r2 = r2.A03
            java.lang.String r2 = r2.A07
            X.1OC r3 = r1.C42(r11, r2)
            goto L_0x01f1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320416sL.A00(X.6sL, java.lang.Long, java.lang.String, java.util.List, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r2 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C276114sa r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x000e
            java.lang.String r0 = r4.BP8()
            if (r0 != 0) goto L_0x0018
            boolean r0 = r4.BU8()
            if (r0 == 0) goto L_0x0018
        L_0x000e:
            X.6z9 r0 = r3.A04
            X.6zA r1 = r0.A03
            r0 = 0
            r1.A07 = r0
            r1.A02 = r0
            return
        L_0x0018:
            X.6z9 r1 = r3.A04
            java.lang.String r0 = r4.BP8()
            boolean r2 = r4.BU8()
            X.6zA r1 = r1.A03
            r1.A07 = r0
            if (r0 != 0) goto L_0x002b
            r0 = 0
            if (r2 == 0) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            r1.A0A = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320416sL.A02(X.4sa):void");
    }

    public void A03(C270674h7 r2) {
        this.A02.A02.add(r2);
    }

    public C320416sL(Context context, C320446sO r12, C270754hF r13, AnonymousClass0iw r14, UserSession userSession, AnonymousClass4D6 r16, String str) {
        this.A00 = context;
        UserSession userSession2 = userSession;
        this.A03 = userSession;
        this.A05 = r14;
        this.A01 = r13;
        C320436sN r2 = new C320436sN(r12, userSession);
        this.A02 = r2;
        this.A04 = new C324356z9(new Handler(Looper.getMainLooper()), userSession2, r16, str, (String) null, str != null);
        r2.A02.add(new C320466sQ(this));
    }
}
