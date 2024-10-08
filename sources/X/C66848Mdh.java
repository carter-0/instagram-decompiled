package X;

import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: X.Mdh  reason: case insensitive filesystem */
public final class C66848Mdh {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final /* synthetic */ FlexboxLayoutManager A07;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r0 != r2) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        if (r4.A02 == 1) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C66848Mdh r6) {
        /*
            r0 = -1
            r6.A03 = r0
            r6.A01 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.A00 = r0
            r5 = 0
            r6.A06 = r5
            r6.A04 = r5
            com.google.android.flexbox.FlexboxLayoutManager r4 = r6.A07
            boolean r3 = r4.CWo()
            r2 = 2
            r1 = 1
            int r0 = r4.A03
            if (r3 == 0) goto L_0x0024
            if (r0 != 0) goto L_0x0029
            int r0 = r4.A02
            if (r0 != r1) goto L_0x0021
        L_0x0020:
            r5 = 1
        L_0x0021:
            r6.A05 = r5
            return
        L_0x0024:
            if (r0 != 0) goto L_0x0029
            int r0 = r4.A02
            r2 = 3
        L_0x0029:
            if (r0 != r2) goto L_0x0021
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66848Mdh.A01(X.Mdh):void");
    }

    public C66848Mdh(FlexboxLayoutManager flexboxLayoutManager) {
        this.A07 = flexboxLayoutManager;
    }

    public static void A00(C66848Mdh mdh) {
        int A032;
        FlexboxLayoutManager flexboxLayoutManager = mdh.A07;
        if (flexboxLayoutManager.CWo() || !flexboxLayoutManager.A0L) {
            if (!mdh.A05) {
                A032 = flexboxLayoutManager.A0B.A06();
            }
            A032 = flexboxLayoutManager.A0B.A03();
        } else {
            if (!mdh.A05) {
                A032 = flexboxLayoutManager.A03 - flexboxLayoutManager.A0B.A06();
            }
            A032 = flexboxLayoutManager.A0B.A03();
        }
        mdh.A00 = A032;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AnchorInfo{mPosition=");
        A1A.append(this.A03);
        A1A.append(", mFlexLinePosition=");
        A1A.append(this.A01);
        A1A.append(", mCoordinate=");
        A1A.append(this.A00);
        A1A.append(", mPerpendicularCoordinate=");
        A1A.append(this.A02);
        A1A.append(", mLayoutFromEnd=");
        A1A.append(this.A05);
        A1A.append(", mValid=");
        A1A.append(this.A06);
        A1A.append(", mAssignedFromSavedState=");
        A1A.append(this.A04);
        return C51967G9n.A0r(A1A, '}');
    }
}
