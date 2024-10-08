package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class GLR extends C252733pa {
    public C52259GLa A00;
    public C52259GLa A01;
    public boolean A02;
    public final C320446sO A03;
    public final C270754hF A04;
    public final AnonymousClass4HW A05;
    public final UserSession A06;
    public final C324356z9 A07;
    public final C52262GLd A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C52259GLa r13, X.GLR r14, java.lang.Boolean r15, X.AnonymousClass4D7 r16) {
        /*
            r1 = r14
            r3 = r15
            r5 = 30
            r7 = r16
            boolean r0 = X.C66147MDz.A02(r5, r7)
            if (r0 == 0) goto L_0x00d6
            r6 = r7
            X.MDz r6 = (X.C66147MDz) r6
            int r4 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00d6
            int r4 = r4 - r2
            r6.A00 = r4
        L_0x001a:
            java.lang.Object r2 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r14 = 1
            if (r0 == 0) goto L_0x00a3
            if (r0 != r14) goto L_0x00e2
            java.lang.Object r3 = r6.A03
            java.lang.Object r13 = r6.A02
            X.GLa r13 = (X.C52259GLa) r13
            java.lang.Object r1 = r6.A01
            X.GLR r1 = (X.GLR) r1
            X.0eS.A00(r2)
        L_0x0032:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007e
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r7 = r2.A00
            X.5u7 r7 = (X.C298835u7) r7
            X.4sa r5 = r7.BaP()
            java.util.List r0 = X.C51973G9u.A0m(r7)
            java.util.List r8 = A05(r1, r0)
            r4 = 0
            A07(r7, r1, r8, r4, r4)
            boolean r10 = r13.A04
            if (r10 == 0) goto L_0x0059
            boolean r0 = X.AnonymousClass7TF.A1Y(r3, r14)
            if (r0 == 0) goto L_0x0059
            r4 = 1
        L_0x0059:
            java.lang.String r2 = r13.A02
            r9 = 0
            X.GLa r0 = A00(r5, r2, r9, r4)
            r1.A00 = r0
            X.GLd r6 = r1.A08
            r6.A00()
            boolean r11 = r13.A06
            r12 = r9
            r13 = r9
            r15 = r9
            r16 = r9
            r6.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = r7.BaG()
            A08(r1, r0)
            A06(r5, r1, r2, r8, r10)
        L_0x007b:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x007e:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00dd
            X.GLa r0 = A01(r1)
            X.GLa r0 = X.G9w.A0d(r0, r1)
            r1.A00 = r0
            X.GLd r0 = r1.A08
            r0.A00()
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r1 = r2.A00
            X.4dm r1 = (X.C268654dm) r1
            r2 = 0
            boolean r3 = r13.A04
            boolean r4 = r13.A06
            r5 = r2
            r6 = r2
            r7 = r2
            r0.A03(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x007b
        L_0x00a3:
            X.0eS.A00(r2)
            X.GLd r7 = r1.A08
            boolean r9 = r13.A04
            boolean r10 = r13.A06
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            r11 = 0
            r12 = r11
            r7.A04(r8, r9, r10, r11, r12)
            X.4hF r4 = r1.A04
            com.instagram.common.session.UserSession r2 = r1.A06
            if (r9 == 0) goto L_0x00cf
            X.1OC r2 = r4.BCc(r2, r10)
        L_0x00bd:
            r6.A01 = r1
            r6.A02 = r13
            r6.A03 = r15
            r6.A00 = r14
            r0 = 985100686(0x3ab7718e, float:0.0013995634)
            java.lang.Object r2 = r2.A00(r0, r6)
            if (r2 != r5) goto L_0x0032
            return r5
        L_0x00cf:
            java.lang.String r0 = r13.A03
            X.1OC r2 = r4.C42(r2, r0)
            goto L_0x00bd
        L_0x00d6:
            X.MDz r6 = new X.MDz
            r6.<init>(r14, r7, r5)
            goto L_0x001a
        L_0x00dd:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLR.A02(X.GLa, X.GLR, java.lang.Boolean, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = r2.A04;
        r0 = r2.A06;
        r11 = new X.C52259GLa(r2.A02, r2.A03, r2.A00, r2.A01, r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(X.GLR r18, java.lang.Boolean r19, java.lang.Long r20, java.lang.String r21, java.util.List r22, X.AnonymousClass4D7 r23, boolean r24) {
        /*
            r10 = 0
            r4 = r18
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0040
            X.GLa r2 = A01(r4)
            if (r2 == 0) goto L_0x0040
            r9 = 0
            boolean r1 = r2.A04
            boolean r0 = r2.A06
            java.lang.String r12 = r2.A02
            java.lang.String r13 = r2.A03
            long r15 = r2.A01
            int r14 = r2.A00
            X.GLa r3 = new X.GLa
            r11 = r3
            r17 = r1
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r17, r18)
            X.4HW r0 = r4.A05
            X.GLc r2 = new X.GLc
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r11 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r23
            java.lang.Object r1 = r0.A00(r3, r1, r2)
            X.1Hj r0 = X.1Hj.A02
            if (r1 != r0) goto L_0x0040
            return r1
        L_0x0040:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLR.A04(X.GLR, java.lang.Boolean, java.lang.Long, java.lang.String, java.util.List, X.4D7, boolean):java.lang.Object");
    }

    public static final void A06(C276114sa r4, GLR glr, String str, List list, boolean z) {
        String str2 = str;
        if (str != null && !glr.A0G) {
            ((C229352nF) glr.A09.getValue()).A03(r4, C294895nD.DEFAULT, str2, list, z, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e9, code lost:
        if (X.00l.A0W(r1) != false) goto L_0x01eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C46224DRf r12) {
        /*
            r11 = this;
            r4 = 0
            boolean r0 = r12 instanceof X.C52260GLb
            r5 = 0
            if (r0 == 0) goto L_0x0013
            r0 = 34
            X.ImR r1 = new X.ImR
            r1.<init>((java.lang.Object) r11, (java.lang.Object) r12, (X.AnonymousClass4D7) r5, (int) r0)
        L_0x000d:
            X.4Cq r0 = r11.A01
            r11.A09(r1, r0)
        L_0x0012:
            return
        L_0x0013:
            boolean r0 = r12 instanceof X.C57629Idu
            if (r0 == 0) goto L_0x001f
            r0 = 33
        L_0x0019:
            X.ImL r1 = new X.ImL
            r1.<init>(r11, r5, r0)
            goto L_0x000d
        L_0x001f:
            boolean r0 = r12 instanceof X.C57630Idv
            if (r0 == 0) goto L_0x0026
            r0 = 34
            goto L_0x0019
        L_0x0026:
            boolean r0 = r12 instanceof X.C57628Idt
            if (r0 == 0) goto L_0x002d
            r0 = 35
            goto L_0x0019
        L_0x002d:
            r3 = 1
            boolean r1 = r12 instanceof X.BJ4
            if (r1 == 0) goto L_0x0053
            r2 = r12
            X.BJ4 r2 = (X.BJ4) r2
            int r0 = r2.A00
            if (r0 != r3) goto L_0x0053
            X.4HW r0 = r11.A05
            boolean r0 = r0.A02(r2)
            if (r0 != 0) goto L_0x0012
            X.GLd r0 = r11.A08
            r0.A01()
            r0 = 37
            X.ImR r1 = new X.ImR
            r1.<init>((java.lang.Object) r11, (java.lang.Object) r2, (X.AnonymousClass4D7) r5, (int) r0)
            X.4Cq r0 = r11.A01
            r11.A09(r1, r0)
            return
        L_0x0053:
            boolean r0 = r12 instanceof X.GPD
            if (r0 == 0) goto L_0x0071
            X.4HW r0 = r11.A05
            boolean r0 = r0.A02(r12)
            if (r0 != 0) goto L_0x0012
            X.GLd r0 = r11.A08
            r0.A01()
            r0 = 35
            X.ImR r1 = new X.ImR
            r1.<init>((java.lang.Object) r11, (java.lang.Object) r12, (X.AnonymousClass4D7) r5, (int) r0)
            X.4Cq r0 = r11.A01
            r11.A09(r1, r0)
            return
        L_0x0071:
            if (r1 == 0) goto L_0x0094
            r2 = r12
            X.BJ4 r2 = (X.BJ4) r2
            int r0 = r2.A00
            if (r0 != r4) goto L_0x0094
            X.4HW r0 = r11.A05
            boolean r0 = r0.A02(r2)
            if (r0 != 0) goto L_0x0012
            X.GLd r0 = r11.A08
            r0.A01()
            r0 = 36
            X.ImR r1 = new X.ImR
            r1.<init>((java.lang.Object) r11, (java.lang.Object) r2, (X.AnonymousClass4D7) r5, (int) r0)
            X.4Cq r0 = r11.A01
            r11.A09(r1, r0)
            return
        L_0x0094:
            boolean r0 = r12 instanceof X.GM5
            if (r0 == 0) goto L_0x0107
            X.GM5 r12 = (X.GM5) r12
            X.0eM r0 = r11.A0C
            r0.getValue()
            com.instagram.common.session.UserSession r4 = r11.A06
            java.lang.String r1 = r12.A02
            java.lang.String r0 = r12.A01
            int r2 = r12.A00
            boolean r3 = r12.A03
            if (r1 == 0) goto L_0x00f3
            X.1Xl r1 = X.C324666zh.A00(r4, r0, r1)
            if (r1 == 0) goto L_0x00f3
            boolean r0 = r1 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x00eb
            r0 = r1
            X.3OA r0 = (X.AnonymousClass3OA) r0
            X.1Xj r0 = r0.A0K
        L_0x00ba:
            r0.A03 = r2
            X.5o3 r0 = X.C267324bN.A0d
            X.4bN r2 = r0.A04(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A0D(r0)
            r2.A0A = r3
        L_0x00c9:
            boolean r0 = r11.A0H
            if (r0 == 0) goto L_0x00cf
            r11.A00 = r5
        L_0x00cf:
            X.GLd r0 = r11.A08
            java.util.Set r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
            if (r2 == 0) goto L_0x00f5
        L_0x00d9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r1.next()
            X.Hjk r0 = (X.C55564Hjk) r0
            X.GBE r0 = r0.A00
            r0.A0J(r2)
            goto L_0x00d9
        L_0x00eb:
            boolean r0 = r1 instanceof X.1Xj
            if (r0 == 0) goto L_0x021d
            r0 = r1
            X.1Xj r0 = (X.1Xj) r0
            goto L_0x00ba
        L_0x00f3:
            r2 = 0
            goto L_0x00c9
        L_0x00f5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r1.next()
            X.Hjk r0 = (X.C55564Hjk) r0
            X.GBE r0 = r0.A00
            r0.A0J(r5)
            goto L_0x00f5
        L_0x0107:
            boolean r0 = r12 instanceof X.GN8
            if (r0 == 0) goto L_0x0214
            X.GN8 r12 = (X.GN8) r12
            boolean r2 = r11.A0H
            if (r2 == 0) goto L_0x01f4
            X.5u8 r1 = X.C276114sa.A00
            r0 = 0
        L_0x0114:
            X.5u9 r0 = r1.A00(r0)
            r0.A00 = r5
            X.4sZ r0 = r0.A00()
        L_0x011e:
            r5 = 1
            if (r2 != 0) goto L_0x01d6
            boolean r1 = r12.A03
            if (r1 != 0) goto L_0x01d6
            boolean r1 = r12.A05
            if (r1 == 0) goto L_0x0131
            java.lang.String r2 = r12.A02
            int r1 = r12.A00
            if (r2 == 0) goto L_0x01da
            if (r1 != 0) goto L_0x01da
        L_0x0131:
            X.0eM r10 = r11.A09
            java.lang.Object r1 = r10.getValue()
            X.2nF r1 = (X.C229352nF) r1
            java.lang.String r9 = r12.A01
            if (r9 == 0) goto L_0x01d2
            X.5nC r1 = r1.A02(r9)
            java.util.List r6 = r1.A03
        L_0x0143:
            com.instagram.common.session.UserSession r8 = r11.A06
            boolean r1 = X.1KU.A06(r8)
            if (r1 == 0) goto L_0x0175
            X.0Tu r7 = X.0Tu.A05
            r1 = 36325918562137461(0x810e3b00093575, double:3.035995399204558E-306)
            boolean r1 = X.182.A06(r7, r8, r1)
            if (r1 != 0) goto L_0x015e
            boolean r1 = X.C51969G9p.A1W(r7, r8)
            if (r1 == 0) goto L_0x0175
        L_0x015e:
            X.GM9 r8 = X.C52166GHi.A00(r8)
            boolean r7 = r12.A04
            int r2 = r12.A00
            java.lang.String r1 = r12.A02
            java.util.List r6 = r8.A00(r1, r6, r2, r7)
            java.lang.Object r1 = r10.getValue()
            X.2nF r1 = (X.C229352nF) r1
            r1.A08(r9, r6, r4, r4)
        L_0x0175:
            if (r0 == 0) goto L_0x01d0
            boolean r0 = r0.BU8()
            if (r0 != r3) goto L_0x01d0
        L_0x017d:
            X.GLd r0 = r11.A08
            java.util.Set r0 = r0.A02
            java.util.Iterator r8 = r0.iterator()
        L_0x0185:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r7 = r8.next()
            X.Hjk r7 = (X.C55564Hjk) r7
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ac
            X.GBE r4 = r7.A00
            X.GE0 r3 = r4.A1B
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r1 = 19
            X.IwK r0 = new X.IwK
            r0.<init>(r3, r1)
            X.GE0.A00(r3, r2, r0)
            r4.A0Q(r6)
        L_0x01ac:
            X.GBE r3 = r7.A00
            X.2is r0 = r3.A07
            if (r0 == 0) goto L_0x01b5
            r0.A0Q(r6, r5)
        L_0x01b5:
            X.2nH r2 = r3.A02
            if (r2 == 0) goto L_0x01c2
            X.2nF r1 = r3.A0X
            com.instagram.clips.intf.ClipsViewerConfig r0 = r3.A0Y
            java.lang.String r0 = r0.A1J
            r1.A04(r2, r0)
        L_0x01c2:
            int r1 = r6.size()
            int r0 = r3.A0C()
            if (r1 > r0) goto L_0x0185
            r3.A0T(r5)
            goto L_0x0185
        L_0x01d0:
            r5 = 0
            goto L_0x017d
        L_0x01d2:
            X.0sn r6 = X.0sn.A00
            goto L_0x0143
        L_0x01d6:
            r6 = 0
            boolean r2 = r12.A03
            goto L_0x01ec
        L_0x01da:
            java.lang.String r6 = r12.A01
            if (r0 == 0) goto L_0x01eb
            java.lang.String r1 = r0.BP8()
            if (r1 == 0) goto L_0x01eb
            boolean r1 = X.00l.A0W(r1)
            r2 = 0
            if (r1 == 0) goto L_0x01ec
        L_0x01eb:
            r2 = 1
        L_0x01ec:
            X.GLa r1 = A00(r0, r6, r2, r4)
            r11.A00 = r1
            goto L_0x0131
        L_0x01f4:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x01fd
            X.5u8 r1 = X.C276114sa.A00
            r0 = 1
            goto L_0x0114
        L_0x01fd:
            X.0eM r0 = r11.A09
            java.lang.Object r1 = r0.getValue()
            X.2nF r1 = (X.C229352nF) r1
            java.lang.String r0 = r12.A01
            if (r0 == 0) goto L_0x0211
            X.5nC r0 = r1.A02(r0)
            X.4sa r0 = r0.A01
            goto L_0x011e
        L_0x0211:
            r0 = 0
            goto L_0x011e
        L_0x0214:
            boolean r0 = r12 instanceof X.C57627Ids
            if (r0 != 0) goto L_0x0012
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x021d:
            r0 = 525(0x20d, float:7.36E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLR.A0B(X.DRf):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GLR(X.C320446sO r21, X.C270754hF r22, com.instagram.common.session.UserSession r23, X.C324356z9 r24, X.C52262GLd r25, java.lang.String r26, boolean r27, boolean r28) {
        /*
            r20 = this;
            r0 = 17
            r11 = r23
            X.0t0 r10 = X.C58674Ivj.A00(r11, r0)
            r0 = 18
            X.0t0 r9 = X.C58674Ivj.A00(r11, r0)
            r0 = 19
            X.0t0 r8 = X.C58674Ivj.A00(r11, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320197665693798(0x81090700092066, double:3.0323774812573847E-306)
            boolean r7 = X.182.A06(r2, r11, r0)
            X.GM6 r0 = X.GM6.A00
            X.0t0 r6 = X.AnonymousClass0eN.A01(r0)
            X.GPC r0 = X.GPC.A00
            X.0t0 r5 = X.AnonymousClass0eN.A01(r0)
            X.GNp r0 = X.C52323GNp.A00
            X.0t0 r3 = X.AnonymousClass0eN.A01(r0)
            r0 = 20
            X.0t0 r2 = X.C58674Ivj.A00(r11, r0)
            r18 = 1
            r0 = 3
            r12 = r22
            X.C51973G9u.A0u(r0, r12, r10, r9)
            r0 = 11
            X.C51969G9p.A1O(r8, r0, r6)
            r0 = 14
            X.C51973G9u.A0v(r0, r5, r3, r2)
            r13 = 0
            if (r7 == 0) goto L_0x00b5
            X.1HY r1 = new X.1HY
            r1.<init>(r13)
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r0 = r0.A04
            X.4Cc r0 = r1.plus(r0)
            X.19S r0 = X.19E.A02(r0)
        L_0x005d:
            java.lang.String r1 = "Reels"
            r4 = r20
            r4.<init>(r1, r0)
            r4.A06 = r11
            r0 = r24
            r4.A07 = r0
            r4.A04 = r12
            r0 = r25
            r4.A08 = r0
            r0 = r21
            r4.A03 = r0
            r0 = r27
            r4.A0H = r0
            r0 = r28
            r4.A0G = r0
            r4.A09 = r10
            r4.A0A = r9
            r4.A0B = r8
            r4.A0I = r7
            r4.A0C = r6
            r4.A0D = r5
            r4.A0E = r3
            r4.A0F = r2
            r15 = 0
            long r16 = android.os.SystemClock.uptimeMillis()
            X.GLa r12 = new X.GLa
            r14 = r26
            r19 = r15
            r12.<init>(r13, r14, r15, r16, r18, r19)
            r4.A00 = r12
            long r9 = android.os.SystemClock.uptimeMillis()
            X.GLa r5 = new X.GLa
            r6 = r13
            r7 = r13
            r8 = r15
            r11 = r15
            r12 = r15
            r5.<init>(r6, r7, r8, r9, r11, r12)
            r4.A01 = r5
            X.4HU r0 = X.AnonymousClass4HU.A00
            X.4HW r0 = X.C335967dq.A00(r0)
            r4.A05 = r0
            return
        L_0x00b5:
            r0 = 985100686(0x3ab7718e, float:0.0013995634)
            X.19S r0 = X.AnonymousClass43D.A00(r0)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLR.<init>(X.6sO, X.4hF, com.instagram.common.session.UserSession, X.6z9, X.GLd, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r10 != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r7 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r7.BU8() != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C52259GLa A00(X.C276114sa r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            if (r7 == 0) goto L_0x000f
            java.lang.String r0 = r7.BP8()
            if (r0 != 0) goto L_0x000f
            boolean r1 = r7.BU8()
            r0 = 1
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r2 = 0
            if (r0 != 0) goto L_0x0035
            r6 = r9
            if (r9 != 0) goto L_0x0032
            r1 = 1
            if (r7 == 0) goto L_0x0030
            boolean r0 = r7.BU8()
            if (r0 != r1) goto L_0x0030
        L_0x001f:
            java.lang.String r2 = r7.BP8()
        L_0x0023:
            r3 = 0
            long r4 = android.os.SystemClock.uptimeMillis()
            X.GLa r0 = new X.GLa
            r1 = r8
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return r0
        L_0x0030:
            if (r10 == 0) goto L_0x0035
        L_0x0032:
            if (r7 == 0) goto L_0x0023
            goto L_0x001f
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLR.A00(X.4sa, java.lang.String, boolean, boolean):X.GLa");
    }

    public static final C52259GLa A01(GLR glr) {
        C52259GLa gLa;
        if (!glr.A0H || ((gLa = glr.A00) != null && gLa.A04)) {
            return glr.A00;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: X.0rk} */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.JUI, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (r10.A00 != false) goto L_0x0077;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C52259GLa r19, X.GLR r20, java.lang.Long r21, java.lang.String r22, java.util.List r23, X.AnonymousClass4D7 r24, boolean r25, boolean r26) {
        /*
            r4 = r20
            r3 = r19
            r1 = r26
            r7 = 4
            r8 = r24
            boolean r0 = X.JUI.A01(r7, r8)
            if (r0 == 0) goto L_0x010d
            r6 = r8
            X.JUI r6 = (X.JUI) r6
            int r5 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto L_0x010d
            int r5 = r5 - r2
            r6.A00 = r5
        L_0x001d:
            java.lang.Object r7 = r6.A05
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r18 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0083
            if (r0 != r2) goto L_0x0119
            boolean r1 = r6.A06
            java.lang.Object r10 = r6.A04
            X.0r1 r10 = (X.0r1) r10
            java.lang.Object r9 = r6.A03
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r3 = r6.A02
            X.GLa r3 = (X.C52259GLa) r3
            java.lang.Object r4 = r6.A01
            X.GLR r4 = (X.GLR) r4
            X.0eS.A00(r7)
        L_0x003f:
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004f
            X.GLd r13 = r4.A08
        L_0x0047:
            r13.A00()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L_0x004f:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0114
            X.GLa r0 = A01(r4)
            X.GLa r0 = X.G9w.A0d(r0, r4)
            r4.A00 = r0
            X.GLd r13 = r4.A08
            X.5sO r7 = (X.C297815sO) r7
            java.lang.Object r14 = r7.A00
            X.4dm r14 = (X.C268654dm) r14
            int r15 = r9.A00
            int r0 = r15 + 1
            r9.A00 = r0
            boolean r4 = r3.A04
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0077
            boolean r0 = r10.A00
            r17 = 1
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            r17 = 0
        L_0x0079:
            r19 = r2
            r20 = r1
            r16 = r4
            r13.A03(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0047
        L_0x0083:
            X.0eS.A00(r7)
            X.4hF r9 = r4.A04
            boolean r0 = r9 instanceof X.C270764hG
            if (r0 == 0) goto L_0x011e
            X.0eM r0 = r4.A0B
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x011e
            boolean r7 = r3.A04
            r14 = r23
            r16 = r25
            X.4hG r9 = (X.C270764hG) r9
            if (r7 == 0) goto L_0x00fb
            com.instagram.common.session.UserSession r11 = r4.A06
            boolean r15 = r3.A06
            android.content.Context r10 = X.C51966G9m.A0P(r11)
            r12 = r21
            r13 = r22
            r17 = r1
            X.1GP r8 = r9.Cmt(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00b0:
            if (r8 == 0) goto L_0x011e
            X.GLd r9 = r4.A08
            boolean r0 = r3.A06
            boolean r24 = X.AnonymousClass7TE.A1b(r14)
            java.lang.Integer r20 = X.AnonymousClass05K.A0C
            r19 = r9
            r21 = r7
            r22 = r0
            r23 = r2
            r19.A04(r20, r21, r22, r23, r24)
            X.0rk r9 = new X.0rk
            r9.<init>()
            X.0r1 r10 = new X.0r1
            r10.<init>()
            r20 = 6
            X.Ixj r11 = new X.Ixj
            r19 = r11
            r21 = r14
            r22 = r4
            r23 = r9
            r24 = r10
            r25 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r6.A01 = r4
            r6.A02 = r3
            r6.A03 = r9
            r6.A04 = r10
            r6.A06 = r1
            r6.A00 = r2
            r7 = 985100686(0x3ab7718e, float:0.0013995634)
            r0 = 2
            java.lang.Object r7 = r8.A01(r6, r11, r7, r0)
            if (r7 != r5) goto L_0x003f
            return r5
        L_0x00fb:
            com.instagram.common.session.UserSession r8 = r4.A06
            java.lang.String r0 = r3.A03
            android.content.Context r11 = X.C51966G9m.A0P(r8)
            r10 = r9
            r12 = r8
            r13 = r0
            r15 = r16
            X.1GP r8 = r10.Cmv(r11, r12, r13, r14, r15)
            goto L_0x00b0
        L_0x010d:
            X.JUI r6 = new X.JUI
            r6.<init>(r4, r8, r7)
            goto L_0x001d
        L_0x0114:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0119:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x011e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r18)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLR.A03(X.GLa, X.GLR, java.lang.Long, java.lang.String, java.util.List, X.4D7, boolean, boolean):java.lang.Object");
    }

    public static final List A05(GLR glr, List list) {
        for (C320456sP A002 : (Iterable) glr.A0F.getValue()) {
            list = A002.A00(list);
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        if (r1 == null) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C298835u7 r10, X.GLR r11, java.util.List r12, boolean r13, boolean r14) {
        /*
            boolean r0 = r10 instanceof X.C54192H2m
            r9 = 0
            if (r0 == 0) goto L_0x0074
            r1 = r10
            X.H2m r1 = (X.C54192H2m) r1
            if (r1 == 0) goto L_0x0075
            X.N49 r0 = r1.A00
            if (r0 == 0) goto L_0x0075
            java.lang.String r4 = r0.A01
        L_0x0010:
            X.N49 r0 = r1.A00
            if (r0 == 0) goto L_0x0079
            java.lang.String r3 = r0.A00
        L_0x0016:
            r8 = 0
            if (r4 == 0) goto L_0x0022
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0022
            if (r3 == 0) goto L_0x0022
            r8 = 1
        L_0x0022:
            java.util.Iterator r7 = r12.iterator()
        L_0x0026:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r2 = r7.next()
            X.4bN r2 = (X.C267324bN) r2
            r2.A09 = r14
            if (r13 == 0) goto L_0x0068
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0038:
            r2.A0D(r0)
            boolean r0 = r10.CPt()
            if (r0 != 0) goto L_0x0053
            X.0eM r0 = r11.A0E
            r0.getValue()
            long r5 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.A06 = r0
        L_0x0053:
            if (r8 == 0) goto L_0x0026
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r0.A2n()
        L_0x005d:
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x0026
            r2.A07 = r4
            goto L_0x0026
        L_0x0066:
            r0 = r9
            goto L_0x005d
        L_0x0068:
            boolean r0 = r10.CPt()
            if (r0 == 0) goto L_0x0071
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x0038
        L_0x0071:
            java.lang.Integer r0 = r2.A03
            goto L_0x0038
        L_0x0074:
            r1 = r9
        L_0x0075:
            r4 = r9
            if (r1 == 0) goto L_0x0079
            goto L_0x0010
        L_0x0079:
            r3 = r9
            goto L_0x0016
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLR.A07(X.5u7, X.GLR, java.util.List, boolean, boolean):void");
    }

    public static final void A08(GLR glr, String str) {
        if (str != null && str.length() > 0) {
            glr.A04.EiB(str);
        }
    }

    private final void A09(0sL r6, C262224Cq r7) {
        if (this.A0I) {
            AnonymousClass7TE.A1Z(new C58105ImR((Object) r6, (AnonymousClass4D7) null, 38, 42), r7);
        } else {
            1Eo.A05(AnonymousClass12T.A00.A04, new C58105ImR((Object) r6, (AnonymousClass4D7) null, 39, 42), r7);
        }
    }

    public static final boolean A0A(C52259GLa gLa, GLR glr) {
        if (!gLa.A04) {
            int i = gLa.A00;
            boolean A1R = AnonymousClass7TF.A1R(i);
            if (!AnonymousClass7TF.A1Z(glr.A0A) && A1R) {
                glr.A0E.getValue();
                long uptimeMillis = SystemClock.uptimeMillis() - gLa.A01;
                if (i >= 5 || uptimeMillis <= 2000) {
                    return false;
                }
            }
        }
        return true;
    }
}
