package androidx.compose.foundation;

import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass1GB;
import X.AnonymousClass4D7;
import X.AnonymousClass6Ht;
import X.AnonymousClass6JR;
import X.AnonymousClass9K3;
import X.C284905Ot;
import X.C284945Oz;
import X.C285595Rx;
import X.C287655aY;
import X.C288015bE;
import X.C288025bF;
import X.C289005cr;
import X.C289155d7;
import X.C289295dM;
import X.C289325dP;
import X.C304916Fs;
import X.C305206Gy;
import X.C305376Hq;
import X.C305386Hs;
import X.C52401GRb;
import X.C60340gF;
import X.GQM;
import X.XE2;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;

public final class AndroidEdgeEffectOverscrollEffect implements C305386Hs {
    public C289295dM A00;
    public GQM A01;
    public long A02 = 0;
    public boolean A03;
    public final AnonymousClass6Ht A04;
    public final C284945Oz A05;
    public final Modifier A06;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AC9(X.AnonymousClass4D7 r11, X.0sL r12, long r13) {
        /*
            r10 = this;
            r4 = 0
            boolean r0 = X.AnonymousClass9JY.A00(r4, r11)
            if (r0 == 0) goto L_0x0184
            r3 = r11
            X.9JY r3 = (X.AnonymousClass9JY) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0184
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r7 = r3.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 2
            r6 = 1
            r9 = 0
            if (r0 == 0) goto L_0x00b5
            if (r0 == r6) goto L_0x00b1
            if (r0 != r2) goto L_0x018b
            long r0 = r3.A01
            java.lang.Object r3 = r3.A02
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r3
            X.0eS.A00(r7)
        L_0x002d:
            X.GQ9 r7 = (X.GQ9) r7
            long r5 = r7.A00
            long r5 = X.GQ9.A02(r0, r5)
            r3.A03 = r4
            r0 = 32
            long r1 = r5 >> r0
            int r0 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            X.6Ht r0 = r3.A04
            android.widget.EdgeEffect r1 = r0.A03
            if (r1 != 0) goto L_0x0050
            android.widget.EdgeEffect r1 = X.AnonymousClass6Ht.A00(r0)
            r0.A03 = r1
        L_0x0050:
            int r0 = X.AnonymousClass1GB.A01(r2)
        L_0x0054:
            X.XE2.A04(r1, r0)
        L_0x0057:
            float r2 = X.GQ9.A00(r5)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            X.6Ht r0 = r3.A04
            android.widget.EdgeEffect r1 = r0.A07
            if (r1 != 0) goto L_0x006b
            android.widget.EdgeEffect r1 = X.AnonymousClass6Ht.A00(r0)
            r0.A07 = r1
        L_0x006b:
            int r0 = X.AnonymousClass1GB.A01(r2)
        L_0x006f:
            X.XE2.A04(r1, r0)
        L_0x0072:
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007f
            X.5Oz r1 = r3.A05
            X.0gF r0 = X.C60340gF.A00
            r1.Epw(r0)
        L_0x007f:
            r3.A04()
        L_0x0082:
            X.0gF r5 = X.C60340gF.A00
        L_0x0084:
            return r5
        L_0x0085:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0072
            X.6Ht r0 = r3.A04
            android.widget.EdgeEffect r1 = r0.A01
            if (r1 != 0) goto L_0x0095
            android.widget.EdgeEffect r1 = X.AnonymousClass6Ht.A00(r0)
            r0.A01 = r1
        L_0x0095:
            int r0 = X.AnonymousClass1GB.A01(r2)
            int r0 = -r0
            goto L_0x006f
        L_0x009b:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            X.6Ht r0 = r3.A04
            android.widget.EdgeEffect r1 = r0.A05
            if (r1 != 0) goto L_0x00ab
            android.widget.EdgeEffect r1 = X.AnonymousClass6Ht.A00(r0)
            r0.A05 = r1
        L_0x00ab:
            int r0 = X.AnonymousClass1GB.A01(r2)
            int r0 = -r0
            goto L_0x0054
        L_0x00b1:
            X.0eS.A00(r7)
            goto L_0x0082
        L_0x00b5:
            X.0eS.A00(r7)
            long r0 = r10.A02
            boolean r0 = X.C288025bF.A04(r0)
            if (r0 == 0) goto L_0x00ce
            X.GQ9 r0 = new X.GQ9
            r0.<init>(r13)
            r3.A00 = r6
            java.lang.Object r0 = r12.invoke(r0, r3)
            if (r0 != r5) goto L_0x0082
            return r5
        L_0x00ce:
            r0 = 32
            long r0 = r13 >> r0
            int r6 = (int) r0
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0162
            X.6Ht r1 = r10.A04
            android.widget.EdgeEffect r0 = r1.A03
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 == 0) goto L_0x0162
            android.widget.EdgeEffect r7 = r1.A03
            if (r7 != 0) goto L_0x00ef
            android.widget.EdgeEffect r7 = X.AnonymousClass6Ht.A00(r1)
            r1.A03 = r7
        L_0x00ef:
            int r0 = X.AnonymousClass1GB.A01(r6)
        L_0x00f3:
            X.XE2.A04(r7, r0)
        L_0x00f6:
            float r7 = X.GQ9.A00(r13)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0142
            X.6Ht r1 = r10.A04
            android.widget.EdgeEffect r0 = r1.A07
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 == 0) goto L_0x0142
            android.widget.EdgeEffect r8 = r1.A07
            if (r8 != 0) goto L_0x0112
            android.widget.EdgeEffect r8 = X.AnonymousClass6Ht.A00(r1)
            r1.A07 = r8
        L_0x0112:
            int r0 = X.AnonymousClass1GB.A01(r7)
        L_0x0116:
            X.XE2.A04(r8, r0)
        L_0x0119:
            long r0 = X.GQF.A00(r6, r7)
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x012a
            X.5Oz r7 = r10.A05
            X.0gF r6 = X.C60340gF.A00
            r7.Epw(r6)
        L_0x012a:
            long r0 = X.GQ9.A02(r13, r0)
            X.GQ9 r6 = new X.GQ9
            r6.<init>(r0)
            r3.A02 = r10
            r3.A01 = r0
            r3.A00 = r2
            java.lang.Object r7 = r12.invoke(r6, r3)
            if (r7 == r5) goto L_0x0084
            r3 = r10
            goto L_0x002d
        L_0x0142:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0160
            X.6Ht r1 = r10.A04
            android.widget.EdgeEffect r0 = r1.A01
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 == 0) goto L_0x0160
            android.widget.EdgeEffect r8 = r1.A01
            if (r8 != 0) goto L_0x015a
            android.widget.EdgeEffect r8 = X.AnonymousClass6Ht.A00(r1)
            r1.A01 = r8
        L_0x015a:
            int r0 = X.AnonymousClass1GB.A01(r7)
            int r0 = -r0
            goto L_0x0116
        L_0x0160:
            r7 = 0
            goto L_0x0119
        L_0x0162:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0181
            X.6Ht r1 = r10.A04
            android.widget.EdgeEffect r0 = r1.A05
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 == 0) goto L_0x0181
            android.widget.EdgeEffect r7 = r1.A05
            if (r7 != 0) goto L_0x017a
            android.widget.EdgeEffect r7 = X.AnonymousClass6Ht.A00(r1)
            r1.A05 = r7
        L_0x017a:
            int r0 = X.AnonymousClass1GB.A01(r6)
            int r0 = -r0
            goto L_0x00f3
        L_0x0181:
            r6 = 0
            goto L_0x00f6
        L_0x0184:
            X.9JY r3 = new X.9JY
            r3.<init>(r10, r11, r4)
            goto L_0x0015
        L_0x018b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.AC9(X.4D7, X.0sL, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r0 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r0.isFinished() == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r0 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04() {
        /*
            r3 = this;
            X.6Ht r2 = r3.A04
            android.widget.EdgeEffect r0 = r2.A07
            if (r0 == 0) goto L_0x0048
            r0.onRelease()
            boolean r1 = r0.isFinished()
        L_0x000d:
            android.widget.EdgeEffect r0 = r2.A01
            if (r0 == 0) goto L_0x001f
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x001e
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            android.widget.EdgeEffect r0 = r2.A03
            if (r0 == 0) goto L_0x0031
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0030
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            android.widget.EdgeEffect r0 = r2.A05
            if (r0 == 0) goto L_0x003e
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            if (r1 == 0) goto L_0x0047
        L_0x0040:
            X.5Oz r1 = r3.A05
            X.0gF r0 = X.C60340gF.A00
            r1.Epw(r0)
        L_0x0047:
            return
        L_0x0048:
            r1 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A04():void");
    }

    public final long A05() {
        long A012;
        C289295dM r0 = this.A00;
        if (r0 != null) {
            A012 = r0.A00;
        } else {
            A012 = C288015bE.A01(this.A02);
        }
        float A013 = C289295dM.A01(A012);
        long j = this.A02;
        return C289325dP.A00(A013 / C288025bF.A02(j), C289295dM.A02(A012) / C288025bF.A00(j));
    }

    public final void A06(long j) {
        long j2 = this.A02;
        boolean z = false;
        if (j2 == 0) {
            z = true;
        }
        boolean z2 = false;
        if (j == j2) {
            z2 = true;
        }
        boolean z3 = !z2;
        this.A02 = j;
        if (z3) {
            AnonymousClass6Ht r7 = this.A04;
            long A002 = C289155d7.A00(AnonymousClass1GB.A01(C288025bF.A02(j)), AnonymousClass1GB.A01(C288025bF.A00(j)));
            r7.A00 = A002;
            EdgeEffect edgeEffect = r7.A07;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (A002 >> 32), C289005cr.A00(A002));
            }
            EdgeEffect edgeEffect2 = r7.A01;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (A002 >> 32), C289005cr.A00(A002));
            }
            EdgeEffect edgeEffect3 = r7.A03;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize(C289005cr.A00(A002), (int) (A002 >> 32));
            }
            EdgeEffect edgeEffect4 = r7.A05;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize(C289005cr.A00(A002), (int) (A002 >> 32));
            }
            EdgeEffect edgeEffect5 = r7.A08;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (A002 >> 32), C289005cr.A00(A002));
            }
            EdgeEffect edgeEffect6 = r7.A02;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (A002 >> 32), C289005cr.A00(A002));
            }
            EdgeEffect edgeEffect7 = r7.A04;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize(C289005cr.A00(A002), (int) (A002 >> 32));
            }
            EdgeEffect edgeEffect8 = r7.A06;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize(C289005cr.A00(A002), (int) (A002 >> 32));
            }
        }
        if (!z && z3) {
            this.A05.Epw(C60340gF.A00);
            A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x019a, code lost:
        if ((!r0.isFinished()) != false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01a8, code lost:
        if (r6 == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01aa, code lost:
        if (r10 == false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0141, code lost:
        if ((!r0.isFinished()) == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016e, code lost:
        if ((!r0.isFinished()) == false) goto L_0x0170;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long ACA(X.0sP r14, int r15, long r16) {
        /*
            r13 = this;
            long r0 = r13.A02
            boolean r2 = X.C288025bF.A04(r0)
            r0 = r16
            if (r2 == 0) goto L_0x0018
            X.5dM r2 = new X.5dM
            r2.<init>(r0)
            java.lang.Object r0 = r14.invoke(r2)
            X.5dM r0 = (X.C289295dM) r0
            long r0 = r0.A00
            return r0
        L_0x0018:
            boolean r2 = r13.A03
            r6 = 1
            if (r2 != 0) goto L_0x0055
            X.6Ht r4 = r13.A04
            android.widget.EdgeEffect r2 = r4.A03
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 == 0) goto L_0x002c
            r2 = 0
            r13.A01(r2)
        L_0x002c:
            android.widget.EdgeEffect r2 = r4.A05
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 == 0) goto L_0x0039
            r2 = 0
            r13.A02(r2)
        L_0x0039:
            android.widget.EdgeEffect r2 = r4.A07
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 == 0) goto L_0x0046
            r2 = 0
            r13.A03(r2)
        L_0x0046:
            android.widget.EdgeEffect r2 = r4.A01
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 == 0) goto L_0x0053
            r2 = 0
            r13.A00(r2)
        L_0x0053:
            r13.A03 = r6
        L_0x0055:
            float r7 = X.C289295dM.A02(r0)
            r3 = 0
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x021b
            X.6Ht r4 = r13.A04
            android.widget.EdgeEffect r2 = r4.A07
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 == 0) goto L_0x01fb
            float r5 = r13.A03(r0)
            android.widget.EdgeEffect r2 = r4.A07
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 != 0) goto L_0x0081
            android.widget.EdgeEffect r2 = r4.A07
            if (r2 != 0) goto L_0x007e
            android.widget.EdgeEffect r2 = X.AnonymousClass6Ht.A00(r4)
            r4.A07 = r2
        L_0x007e:
            r2.onRelease()
        L_0x0081:
            float r8 = X.C289295dM.A01(r0)
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00ac
            X.6Ht r4 = r13.A04
            android.widget.EdgeEffect r2 = r4.A03
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 == 0) goto L_0x01db
            float r3 = r13.A01(r0)
            android.widget.EdgeEffect r2 = r4.A03
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 != 0) goto L_0x00ac
            android.widget.EdgeEffect r2 = r4.A03
            if (r2 != 0) goto L_0x00a9
            android.widget.EdgeEffect r2 = X.AnonymousClass6Ht.A00(r4)
            r4.A03 = r2
        L_0x00a9:
            r2.onRelease()
        L_0x00ac:
            long r2 = X.C289325dP.A00(r3, r5)
            r9 = 0
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x00bd
            X.5Oz r5 = r13.A05
            X.0gF r4 = X.C60340gF.A00
            r5.Epw(r4)
        L_0x00bd:
            long r0 = X.C289295dM.A06(r0, r2)
            X.5dM r4 = new X.5dM
            r4.<init>(r0)
            java.lang.Object r4 = r14.invoke(r4)
            X.5dM r4 = (X.C289295dM) r4
            long r4 = r4.A00
            long r0 = X.C289295dM.A06(r0, r4)
            if (r15 != r6) goto L_0x01d8
            float r9 = X.C289295dM.A01(r0)
            r12 = -1090519040(0xffffffffbf000000, float:-0.5)
            r11 = 1056964608(0x3f000000, float:0.5)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x01cc
            r13.A01(r0)
        L_0x00e3:
            r10 = 1
        L_0x00e4:
            float r9 = X.C289295dM.A02(r0)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x01c0
            r13.A03(r0)
        L_0x00ef:
            r0 = 1
        L_0x00f0:
            if (r10 != 0) goto L_0x00f4
            if (r0 == 0) goto L_0x01d8
        L_0x00f4:
            r10 = 1
        L_0x00f5:
            X.6Ht r1 = r13.A04
            android.widget.EdgeEffect r0 = r1.A03
            if (r0 != 0) goto L_0x01b8
            r0 = 0
        L_0x00fc:
            r9 = 0
            if (r0 == 0) goto L_0x01b5
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b5
            android.widget.EdgeEffect r0 = r1.A03
            if (r0 != 0) goto L_0x010d
            android.widget.EdgeEffect r0 = X.AnonymousClass6Ht.A00(r1)
            r1.A03 = r0
        L_0x010d:
            X.XE2.A03(r0, r8)
            android.widget.EdgeEffect r0 = r1.A03
            if (r0 != 0) goto L_0x01ad
            r0 = 0
        L_0x0115:
            r6 = r0 ^ 1
        L_0x0117:
            android.widget.EdgeEffect r0 = r1.A05
            if (r0 == 0) goto L_0x0144
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0144
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0144
            android.widget.EdgeEffect r0 = r1.A05
            if (r0 != 0) goto L_0x0131
            android.widget.EdgeEffect r0 = X.AnonymousClass6Ht.A00(r1)
            r1.A05 = r0
        L_0x0131:
            X.XE2.A03(r0, r8)
            if (r6 != 0) goto L_0x0143
            android.widget.EdgeEffect r0 = r1.A05
            if (r0 == 0) goto L_0x0143
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            r6 = 0
            if (r0 != 0) goto L_0x0144
        L_0x0143:
            r6 = 1
        L_0x0144:
            android.widget.EdgeEffect r0 = r1.A07
            if (r0 == 0) goto L_0x0171
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0171
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0171
            android.widget.EdgeEffect r0 = r1.A07
            if (r0 != 0) goto L_0x015e
            android.widget.EdgeEffect r0 = X.AnonymousClass6Ht.A00(r1)
            r1.A07 = r0
        L_0x015e:
            X.XE2.A03(r0, r7)
            if (r6 != 0) goto L_0x0170
            android.widget.EdgeEffect r0 = r1.A07
            if (r0 == 0) goto L_0x0170
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            r6 = 0
            if (r0 != 0) goto L_0x0171
        L_0x0170:
            r6 = 1
        L_0x0171:
            android.widget.EdgeEffect r0 = r1.A01
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a8
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a8
            android.widget.EdgeEffect r0 = r1.A01
            if (r0 != 0) goto L_0x018b
            android.widget.EdgeEffect r0 = X.AnonymousClass6Ht.A00(r1)
            r1.A01 = r0
        L_0x018b:
            X.XE2.A03(r0, r7)
            if (r6 != 0) goto L_0x019c
            android.widget.EdgeEffect r0 = r1.A01
            if (r0 == 0) goto L_0x019c
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x01aa
        L_0x019c:
            X.5Oz r1 = r13.A05
            X.0gF r0 = X.C60340gF.A00
            r1.Epw(r0)
        L_0x01a3:
            long r0 = X.C289295dM.A07(r2, r4)
            return r0
        L_0x01a8:
            if (r6 != 0) goto L_0x019c
        L_0x01aa:
            if (r10 == 0) goto L_0x01a3
            goto L_0x019c
        L_0x01ad:
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            goto L_0x0115
        L_0x01b5:
            r6 = 0
            goto L_0x0117
        L_0x01b8:
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            goto L_0x00fc
        L_0x01c0:
            int r6 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x01c9
            r13.A00(r0)
            goto L_0x00ef
        L_0x01c9:
            r0 = 0
            goto L_0x00f0
        L_0x01cc:
            int r6 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x01d5
            r13.A02(r0)
            goto L_0x00e3
        L_0x01d5:
            r10 = 0
            goto L_0x00e4
        L_0x01d8:
            r10 = 0
            goto L_0x00f5
        L_0x01db:
            android.widget.EdgeEffect r2 = r4.A05
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 == 0) goto L_0x00ac
            float r3 = r13.A02(r0)
            android.widget.EdgeEffect r2 = r4.A05
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 != 0) goto L_0x00ac
            android.widget.EdgeEffect r2 = r4.A05
            if (r2 != 0) goto L_0x00a9
            android.widget.EdgeEffect r2 = X.AnonymousClass6Ht.A00(r4)
            r4.A05 = r2
            goto L_0x00a9
        L_0x01fb:
            android.widget.EdgeEffect r2 = r4.A01
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 == 0) goto L_0x021b
            float r5 = r13.A00(r0)
            android.widget.EdgeEffect r2 = r4.A01
            boolean r2 = X.AnonymousClass6Ht.A01(r2)
            if (r2 != 0) goto L_0x0081
            android.widget.EdgeEffect r2 = r4.A01
            if (r2 != 0) goto L_0x007e
            android.widget.EdgeEffect r2 = X.AnonymousClass6Ht.A00(r4)
            r4.A01 = r2
            goto L_0x007e
        L_0x021b:
            r5 = 0
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.ACA(X.0sP, int, long):long");
    }

    public final Modifier B04() {
        return this.A06;
    }

    public final boolean CVA() {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        AnonymousClass6Ht r4 = this.A04;
        EdgeEffect edgeEffect4 = r4.A07;
        if ((edgeEffect4 == null || XE2.A00(edgeEffect4) == 0.0f) && (((edgeEffect = r4.A01) == null || XE2.A00(edgeEffect) == 0.0f) && (((edgeEffect2 = r4.A03) == null || XE2.A00(edgeEffect2) == 0.0f) && ((edgeEffect3 = r4.A05) == null || XE2.A00(edgeEffect3) == 0.0f)))) {
            return false;
        }
        return true;
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, C305376Hq r8) {
        Modifier gRb;
        AnonymousClass6Ht r4 = new AnonymousClass6Ht(context, C285595Rx.A00(r8.A00));
        this.A04 = r4;
        C60340gF r5 = C60340gF.A00;
        C305206Gy r1 = C305206Gy.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A05 = new ParcelableSnapshotMutableState(r1, r5);
        Modifier A002 = C304916Fs.A00(Modifier.A00, r5, new AnonymousClass9K3(this, (AnonymousClass4D7) null, 3));
        if (Build.VERSION.SDK_INT >= 31) {
            gRb = new AnonymousClass6JR(this, r4, C287655aY.A00);
        } else {
            gRb = new C52401GRb(this, r4, r8, C287655aY.A00);
        }
        this.A06 = A002.Ezh(gRb);
    }

    private final float A00(long j) {
        float A012 = C289295dM.A01(A05());
        float A022 = C289295dM.A02(j);
        float A002 = A022 / C288025bF.A00(this.A02);
        AnonymousClass6Ht r0 = this.A04;
        EdgeEffect edgeEffect = r0.A01;
        if (edgeEffect == null) {
            edgeEffect = AnonymousClass6Ht.A00(r0);
            r0.A01 = edgeEffect;
        }
        float A003 = (-XE2.A01(edgeEffect, -A002, 1.0f - A012)) * C288025bF.A00(this.A02);
        if (XE2.A00(edgeEffect) != 0.0f) {
            return A022;
        }
        return A003;
    }

    private final float A01(long j) {
        float A022 = C289295dM.A02(A05());
        float A012 = C289295dM.A01(j);
        float A023 = A012 / C288025bF.A02(this.A02);
        AnonymousClass6Ht r0 = this.A04;
        EdgeEffect edgeEffect = r0.A03;
        if (edgeEffect == null) {
            edgeEffect = AnonymousClass6Ht.A00(r0);
            r0.A03 = edgeEffect;
        }
        float A013 = XE2.A01(edgeEffect, A023, 1.0f - A022) * C288025bF.A02(this.A02);
        if (XE2.A00(edgeEffect) != 0.0f) {
            return A012;
        }
        return A013;
    }

    private final float A02(long j) {
        float A022 = C289295dM.A02(A05());
        float A012 = C289295dM.A01(j);
        float A023 = A012 / C288025bF.A02(this.A02);
        AnonymousClass6Ht r0 = this.A04;
        EdgeEffect edgeEffect = r0.A05;
        if (edgeEffect == null) {
            edgeEffect = AnonymousClass6Ht.A00(r0);
            r0.A05 = edgeEffect;
        }
        float A024 = (-XE2.A01(edgeEffect, -A023, A022)) * C288025bF.A02(this.A02);
        if (XE2.A00(edgeEffect) != 0.0f) {
            return A012;
        }
        return A024;
    }

    private final float A03(long j) {
        float A012 = C289295dM.A01(A05());
        float A022 = C289295dM.A02(j);
        float A002 = A022 / C288025bF.A00(this.A02);
        AnonymousClass6Ht r0 = this.A04;
        EdgeEffect edgeEffect = r0.A07;
        if (edgeEffect == null) {
            edgeEffect = AnonymousClass6Ht.A00(r0);
            r0.A07 = edgeEffect;
        }
        float A013 = XE2.A01(edgeEffect, A002, A012) * C288025bF.A00(this.A02);
        if (XE2.A00(edgeEffect) != 0.0f) {
            return A022;
        }
        return A013;
    }
}
