package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.6n8  reason: invalid class name and case insensitive filesystem */
public abstract class C317356n8 {
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c9, code lost:
        if (r0.A6b(r6) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00de, code lost:
        if (r17.isEmpty() != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011a, code lost:
        if (r0.A4l() != true) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C317366n9 A01(com.instagram.common.session.UserSession r36, X.C255773uh r37, X.C317376nA r38, X.C317746nl r39, com.instagram.user.model.User r40, java.util.List r41, java.util.List r42) {
        /*
            r0 = 7
            r8 = 0
            r4 = r41
            if (r41 == 0) goto L_0x0178
            java.util.List r17 = X.00k.A0h(r4, r0)
        L_0x000a:
            r1 = r42
            if (r42 == 0) goto L_0x0174
            java.util.List r18 = X.00k.A0h(r1, r0)
        L_0x0012:
            r2 = r37
            r7 = r40
            if (r37 == 0) goto L_0x0171
            X.1Xj r0 = r2.A0b
            if (r0 == 0) goto L_0x0171
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.C0K()
            if (r0 == 0) goto L_0x0171
            java.util.List r0 = X.JZW.A00(r0)
            if (r0 == 0) goto L_0x0171
            java.util.Iterator r5 = r0.iterator()
        L_0x002e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r3 = r5.next()
            r0 = r3
            X.1bM r0 = (X.C65211bM) r0
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x016b
            java.lang.String r1 = r0.getId()
        L_0x0045:
            java.lang.String r0 = r7.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
        L_0x004f:
            X.1bM r3 = (X.C65211bM) r3
            if (r3 == 0) goto L_0x0171
            X.9JK r10 = A00(r3)
        L_0x0057:
            r5 = 1
            r6 = r36
            r3 = r39
            if (r37 == 0) goto L_0x0165
            boolean r0 = r2.A0k()
            if (r0 != r5) goto L_0x0165
            boolean r0 = r2.A0j()
            if (r0 != 0) goto L_0x0165
            com.instagram.user.model.User r0 = r2.A0i
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x0165
            boolean r0 = A05(r2, r3)
            if (r0 == 0) goto L_0x0165
            r23 = 1
            X.3QO r1 = r2.A0B()
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 != r0) goto L_0x0167
            X.0Tu r9 = X.0Tu.A05
            r0 = 36320313629810920(0x810922000920e8, double:3.0324508174320026E-306)
            boolean r0 = X.182.A06(r9, r6, r0)
            if (r0 == 0) goto L_0x0167
            r0 = 36601788606648658(0x820922000b1152, double:3.210456726192946E-306)
            long r0 = X.182.A01(r9, r6, r0)
            int r9 = (int) r0
            r25 = 1
            if (r9 != r5) goto L_0x0167
            r23 = 0
        L_0x009f:
            if (r41 == 0) goto L_0x00a7
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00cb
        L_0x00a7:
            if (r37 == 0) goto L_0x0162
            com.instagram.user.model.User r0 = r2.A0i
        L_0x00ab:
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x00cb
            if (r37 == 0) goto L_0x00cb
            boolean r0 = r2.A0k()
            if (r0 != r5) goto L_0x00cb
            boolean r0 = r2.A0j()
            if (r0 != 0) goto L_0x00cb
            X.1Xj r0 = r2.A0b
            if (r0 == 0) goto L_0x00cb
            boolean r0 = r0.A6b(r6)
            r24 = 1
            if (r0 == 0) goto L_0x00cd
        L_0x00cb:
            r24 = 0
        L_0x00cd:
            A05(r2, r3)
            boolean r0 = A05(r2, r3)
            if (r0 == 0) goto L_0x00e0
            if (r17 == 0) goto L_0x00e0
            boolean r0 = r17.isEmpty()
            r26 = 1
            if (r0 == 0) goto L_0x00e2
        L_0x00e0:
            r26 = 0
        L_0x00e2:
            com.instagram.common.typedurl.ImageUrl r12 = r7.Bh3()
            com.instagram.common.session.UserSession r4 = r3.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36599722727444080(0x820741000c0e70, double:3.209150255865343E-306)
            long r0 = X.182.A01(r3, r4, r0)
            int r6 = (int) r0
            if (r37 == 0) goto L_0x015f
            com.instagram.user.model.User r0 = r2.A0i
            if (r0 == 0) goto L_0x015f
            java.lang.String r16 = r0.getUsername()
        L_0x00fe:
            if (r17 != 0) goto L_0x0102
            X.0sn r17 = X.0sn.A00
        L_0x0102:
            if (r18 != 0) goto L_0x0106
            X.0sn r18 = X.0sn.A00
        L_0x0106:
            if (r37 == 0) goto L_0x015d
            com.instagram.user.model.User r0 = r2.A0i
        L_0x010a:
            boolean r36 = X.0qQ.A0K(r0, r7)
            if (r37 == 0) goto L_0x011c
            X.1Xj r0 = r2.A0b
            if (r0 == 0) goto L_0x011c
            boolean r0 = r0.A4l()
            r37 = 1
            if (r0 == r5) goto L_0x011e
        L_0x011c:
            r37 = 0
        L_0x011e:
            r0 = 2342161256966068280(0x2081074100251838, double:4.064100122889807E-152)
            boolean r34 = X.182.A06(r3, r4, r0)
            if (r2 == 0) goto L_0x0131
            X.1Xj r0 = r2.A0b
            if (r0 == 0) goto L_0x0131
            X.3QO r8 = r0.A1t()
        L_0x0131:
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            r35 = 0
            if (r8 != r0) goto L_0x0139
            r35 = 1
        L_0x0139:
            r19 = 0
            java.lang.String r15 = ""
            r11 = 0
            X.6n9 r9 = new X.6n9
            r14 = r38
            r13 = r11
            r21 = r19
            r22 = r5
            r27 = r19
            r28 = r19
            r29 = r19
            r30 = r19
            r31 = r19
            r32 = r19
            r33 = r5
            r38 = r19
            r20 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r9
        L_0x015d:
            r0 = r8
            goto L_0x010a
        L_0x015f:
            r16 = r8
            goto L_0x00fe
        L_0x0162:
            r0 = r8
            goto L_0x00ab
        L_0x0165:
            r23 = 0
        L_0x0167:
            r25 = 0
            goto L_0x009f
        L_0x016b:
            r1 = r8
            goto L_0x0045
        L_0x016e:
            r3 = r8
            goto L_0x004f
        L_0x0171:
            r10 = r8
            goto L_0x0057
        L_0x0174:
            r18 = r8
            goto L_0x0012
        L_0x0178:
            r17 = r8
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317356n8.A01(com.instagram.common.session.UserSession, X.3uh, X.6nA, X.6nl, com.instagram.user.model.User, java.util.List, java.util.List):X.6n9");
    }

    public static final LinkedHashMap A02(1Xj r3) {
        List C0K;
        List<C65211bM> A00;
        if (r3 == null || (C0K = r3.A0C.C0K()) == null || (A00 = JZW.A00(C0K)) == null) {
            return null;
        }
        int A0L = 0se.A0L(0Yv.A1E(A00, 10));
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C65211bM r1 : A00) {
            linkedHashMap.put(r1.getPk(), r1);
        }
        return linkedHashMap;
    }

    public static final List A03(1Xj r5) {
        List C0K;
        List<C65211bM> A00;
        if (r5 == null || (C0K = r5.A0C.C0K()) == null || (A00 = JZW.A00(C0K)) == null) {
            return null;
        }
        ArrayList<C247733gp> arrayList = new ArrayList<>(0Yv.A1E(A00, 10));
        for (C65211bM r2 : A00) {
            C247733gp r0 = null;
            if ((r2 instanceof 1bK) && r2 != null) {
                r0 = new C247733gp(r2);
            }
            arrayList.add(r0);
        }
        for (C247733gp r02 : arrayList) {
            if (r02 != null) {
                r02.A02(r5);
            }
        }
        return arrayList;
    }

    public static final List A04(1Xj r2) {
        List C0K;
        List<C65211bM> A00;
        if (r2 == null || (C0K = r2.A0C.C0K()) == null || (A00 = JZW.A00(C0K)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(A00, 10));
        for (C65211bM A002 : A00) {
            arrayList.add(A00(A002));
        }
        return arrayList;
    }

    public static final boolean A05(C255773uh r4, C317746nl r5) {
        AnonymousClass3QO r1;
        UserSession userSession = r5.A00;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36318247749949468L)) {
            return true;
        }
        if (!182.A06(r2, userSession, 36320313629810920L)) {
            return false;
        }
        if (r4 != null) {
            r1 = r4.A0B();
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass3QO.HALLPASS) {
            return true;
        }
        return false;
    }

    public static final AnonymousClass9JK A00(C65211bM r5) {
        String str;
        ImageUrl imageUrl;
        String pk = r5.getPk();
        User CCd = r5.CCd();
        String str2 = null;
        if (CCd != null) {
            str = CCd.getId();
        } else {
            str = null;
        }
        User CCd2 = r5.CCd();
        if (CCd2 != null) {
            imageUrl = CCd2.Bh3();
        } else {
            imageUrl = null;
        }
        User CCd3 = r5.CCd();
        if (CCd3 != null) {
            str2 = CCd3.getUsername();
        }
        return new AnonymousClass9JK(imageUrl, pk, str, str2, r5.getText());
    }
}
