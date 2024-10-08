package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.70w  reason: invalid class name and case insensitive filesystem */
public final class C3250570w {
    public static final C3250570w A00 = new Object();

    /* JADX WARNING: type inference failed for: r3v2, types: [X.FgG] */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.71B] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
        if (X.0eE.A00(r10).A00().A2L() == false) goto L_0x0071;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0191 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A02(android.content.Context r20, X.AnonymousClass0iw r21, com.instagram.common.session.UserSession r22, X.C323326xJ r23, com.instagram.user.model.User r24, java.lang.String r25) {
        /*
            r14 = 0
            r7 = r20
            X.0qQ.A0B(r7, r14)
            r2 = 1
            r0 = 2
            r10 = r22
            X.0qQ.A0B(r10, r0)
            r0 = 4
            r9 = r21
            X.0qQ.A0B(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12 = r24
            boolean r1 = X.2R8.A04(r10, r12)
            r19 = r23
            if (r1 == 0) goto L_0x0152
            X.710 r3 = r19.BhL()
            X.718 r1 = new X.718
            r1.<init>(r7, r3, r12)
            r0.add(r1)
            X.710 r1 = r19.BhL()
            X.71B r3 = new X.71B
            r3.<init>(r7, r1, r12)
        L_0x0037:
            r0.add(r3)
        L_0x003a:
            boolean r1 = r12.A2O()
            if (r1 == 0) goto L_0x0058
            java.lang.String r24 = r12.getId()
            boolean r25 = A04(r10, r12)
            X.FgP r1 = new X.FgP
            r20 = r1
            r21 = r7
            r22 = r9
            r23 = r10
            r20.<init>(r21, r22, r23, r24, r25)
            r0.add(r1)
        L_0x0058:
            boolean r2 = X.C3254572l.A01(r7, r10, r12, r2)
            boolean r1 = X.2R8.A04(r10, r12)
            if (r1 == 0) goto L_0x0071
            X.0t1 r1 = X.0eE.A00(r10)
            com.instagram.user.model.User r1 = r1.A00()
            boolean r1 = r1.A2L()
            r4 = 1
            if (r1 != 0) goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            if (r2 == 0) goto L_0x00e4
            X.70w r15 = A00
            r16 = r7
            r17 = r9
            r18 = r10
            r20 = r12
            r21 = r14
            java.util.ArrayList r1 = r15.A01(r16, r17, r18, r19, r20, r21)
            r0.addAll(r1)
        L_0x0087:
            boolean r1 = X.AnonymousClass2o2.A03(r10)
            if (r1 == 0) goto L_0x009f
            boolean r1 = X.C324726zn.A01(r10, r12)
            if (r1 == 0) goto L_0x009f
            X.6rM r2 = r19.Bgg()
            X.6pS r1 = new X.6pS
            r1.<init>(r7, r10, r2, r12)
            r0.add(r1)
        L_0x009f:
            X.4Cl r1 = r12.A03
            java.lang.Boolean r1 = r1.Bvv()
            if (r1 == 0) goto L_0x00bb
            X.4Cl r1 = r12.A03
            java.lang.String r3 = r1.Bnv()
            if (r3 == 0) goto L_0x00bb
            X.6rM r2 = r19.Bgg()
            X.FgN r1 = new X.FgN
            r1.<init>(r7, r2, r3)
            r0.add(r1)
        L_0x00bb:
            X.6rM r6 = r19.Bgg()
            r2 = 3
            if (r4 != 0) goto L_0x00c3
            r2 = 6
        L_0x00c3:
            int r1 = r0.size()
            if (r1 <= r2) goto L_0x0191
            int r5 = r2 + -1
            java.util.List r4 = r0.subList(r14, r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r2 = r0.size()
        L_0x00d8:
            if (r5 >= r2) goto L_0x0188
            java.lang.Object r1 = r0.get(r5)
            r3.add(r1)
            int r5 = r5 + 1
            goto L_0x00d8
        L_0x00e4:
            if (r4 != 0) goto L_0x010e
            boolean r1 = X.2Ek.A01(r12)
            if (r1 != 0) goto L_0x00f2
            boolean r1 = X.AnonymousClass431.A02(r10, r12)
            if (r1 == 0) goto L_0x010e
        L_0x00f2:
            boolean r1 = X.AnonymousClass703.A0A(r10, r12)
            if (r1 == 0) goto L_0x010e
            X.6rM r23 = r19.Bgg()
            X.719 r1 = new X.719
            r20 = r1
            r21 = r7
            r22 = r10
            r24 = r12
            r25 = r14
            r20.<init>(r21, r22, r23, r24, r25)
            r0.add(r1)
        L_0x010e:
            boolean r1 = X.C324066yY.A05(r12)
            if (r1 == 0) goto L_0x0124
            X.70w r6 = A00
            X.6pK r8 = X.C318666pK.SUPPORT
            X.6rM r11 = r19.Bgg()
            r13 = 0
            X.70x r1 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.add(r1)
        L_0x0124:
            boolean r1 = X.AnonymousClass703.A09(r10, r12)
            if (r1 == 0) goto L_0x013a
            X.70w r6 = A00
            X.6pK r8 = X.C318666pK.DONATE
            X.6rM r11 = r19.Bgg()
            r13 = 0
            X.70x r1 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.add(r1)
        L_0x013a:
            boolean r1 = r12.A2M()
            if (r1 == 0) goto L_0x0087
            X.70w r6 = A00
            X.6pK r8 = X.C318666pK.NATIVE_CALL
            X.6rM r11 = r19.Bgg()
            r13 = 0
            X.70x r1 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.add(r1)
            goto L_0x0087
        L_0x0152:
            X.6pG r1 = new X.6pG
            r1.<init>(r14)
            r0.add(r1)
            java.lang.String r1 = "37229129288"
            r3 = r25
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x016f
            X.710 r1 = r19.BhL()
            X.FgG r3 = new X.FgG
            r3.<init>(r7, r1)
            goto L_0x0037
        L_0x016f:
            boolean r1 = A03(r10, r12)
            if (r1 == 0) goto L_0x003a
            boolean r25 = A04(r10, r12)
            X.710 r23 = r19.BhL()
            X.6pR r3 = new X.6pR
            r20 = r3
            r21 = r7
            r20.<init>(r21, r22, r23, r24, r25)
            goto L_0x0037
        L_0x0188:
            X.FgH r0 = new X.FgH
            r0.<init>(r7, r6, r3)
            r4.add(r0)
            return r4
        L_0x0191:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3250570w.A02(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.6xJ, com.instagram.user.model.User, java.lang.String):java.util.List");
    }

    public static final boolean A03(UserSession userSession, User user) {
        boolean z;
        Boolean Bld = user.A03.Bld();
        if (Bld != null) {
            z = Bld.booleanValue();
        } else {
            z = false;
        }
        if (z || C324376zB.A01(userSession, user)) {
            return false;
        }
        Boolean CXB = user.A03.CXB();
        if (CXB == null || !CXB.booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (X.AnonymousClass0t1.A01.A01(r9).A2L() == false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A05(android.content.Context r24, X.AnonymousClass0iw r25, com.instagram.common.session.UserSession r26, X.C323326xJ r27, com.instagram.user.model.User r28, java.lang.String r29) {
        /*
            r23 = this;
            r13 = 0
            r1 = 1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9 = r26
            r11 = r28
            boolean r2 = X.2R8.A04(r9, r11)
            r6 = r24
            r16 = r27
            if (r2 == 0) goto L_0x0112
            X.710 r3 = r16.BhL()
            X.718 r2 = new X.718
            r2.<init>(r6, r3, r11)
            r0.add(r2)
            X.710 r2 = r16.BhL()
            X.71B r7 = new X.71B
            r7.<init>(r6, r2, r11)
        L_0x002a:
            r0.add(r7)
        L_0x002d:
            boolean r4 = X.C3254572l.A01(r6, r9, r11, r1)
            boolean r2 = X.2R8.A04(r9, r11)
            if (r2 == 0) goto L_0x0044
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r2 = r2.A01(r9)
            boolean r3 = r2.A2L()
            r2 = 1
            if (r3 != 0) goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            r5 = r23
            r8 = r25
            if (r4 == 0) goto L_0x00a9
            r12 = r5
            r13 = r6
            r14 = r8
            r15 = r9
            r17 = r11
            r18 = r1
            java.util.ArrayList r1 = r12.A01(r13, r14, r15, r16, r17, r18)
            r0.addAll(r1)
        L_0x005a:
            boolean r1 = X.AnonymousClass2o2.A03(r9)
            if (r1 == 0) goto L_0x0072
            boolean r1 = X.C324726zn.A01(r9, r11)
            if (r1 == 0) goto L_0x0072
            X.6rM r2 = r16.Bgg()
            X.6pS r1 = new X.6pS
            r1.<init>(r6, r9, r2, r11)
            r0.add(r1)
        L_0x0072:
            X.4Cl r1 = r11.A03
            java.lang.Boolean r1 = r1.Bvv()
            if (r1 == 0) goto L_0x008e
            X.4Cl r1 = r11.A03
            java.lang.String r3 = r1.Bnv()
            if (r3 == 0) goto L_0x008e
            X.6rM r2 = r16.Bgg()
            X.FgN r1 = new X.FgN
            r1.<init>(r6, r2, r3)
            r0.add(r1)
        L_0x008e:
            boolean r1 = r11.A2O()
            if (r1 == 0) goto L_0x00a8
            java.lang.String r14 = r11.getId()
            boolean r15 = A04(r9, r11)
            X.FgP r1 = new X.FgP
            r10 = r1
            r11 = r6
            r12 = r8
            r13 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r0.add(r1)
        L_0x00a8:
            return r0
        L_0x00a9:
            if (r2 != 0) goto L_0x00d3
            boolean r2 = X.2Ek.A01(r11)
            if (r2 != 0) goto L_0x00b7
            boolean r2 = X.AnonymousClass431.A02(r9, r11)
            if (r2 == 0) goto L_0x00d3
        L_0x00b7:
            boolean r2 = X.AnonymousClass703.A0A(r9, r11)
            if (r2 == 0) goto L_0x00d3
            X.6rM r20 = r16.Bgg()
            X.719 r2 = new X.719
            r17 = r2
            r18 = r6
            r19 = r9
            r21 = r11
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            r0.add(r2)
        L_0x00d3:
            boolean r2 = X.C324066yY.A05(r11)
            if (r2 == 0) goto L_0x00e7
            X.6pK r7 = X.C318666pK.SUPPORT
            X.6rM r10 = r16.Bgg()
            r12 = 0
            X.70x r2 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.add(r2)
        L_0x00e7:
            boolean r2 = X.AnonymousClass703.A09(r9, r11)
            if (r2 == 0) goto L_0x00fb
            X.6pK r7 = X.C318666pK.DONATE
            X.6rM r10 = r16.Bgg()
            r12 = 0
            X.70x r2 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.add(r2)
        L_0x00fb:
            boolean r2 = r11.A2M()
            if (r2 == 0) goto L_0x005a
            X.6pK r7 = X.C318666pK.NATIVE_CALL
            X.6rM r10 = r16.Bgg()
            r12 = 0
            r13 = r1
            X.70x r1 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.add(r1)
            goto L_0x005a
        L_0x0112:
            X.6pG r2 = new X.6pG
            r2.<init>(r13)
            r0.add(r2)
            java.lang.String r2 = "37229129288"
            r3 = r29
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x012f
            X.710 r2 = r16.BhL()
            X.FgG r7 = new X.FgG
            r7.<init>(r6, r2)
            goto L_0x002a
        L_0x012f:
            boolean r2 = A03(r9, r11)
            if (r2 == 0) goto L_0x002d
            X.2f1 r2 = X.AnonymousClass2f1.A00(r9)
            boolean r2 = r2.A0Q(r11)
            if (r2 == 0) goto L_0x014e
            boolean r2 = r11.A2A()
            if (r2 == 0) goto L_0x014e
            boolean r2 = r11.A2L()
            if (r2 != 0) goto L_0x014e
            r11.A1x()
        L_0x014e:
            boolean r12 = A04(r9, r11)
            X.710 r10 = r16.BhL()
            X.6pR r7 = new X.6pR
            r8 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3250570w.A05(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.6xJ, com.instagram.user.model.User, java.lang.String):java.util.ArrayList");
    }

    private final ArrayList A01(Context context, AnonymousClass0iw r19, UserSession userSession, C323326xJ r21, User user, boolean z) {
        C318666pK r0;
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Context context2 = context;
            AnonymousClass0iw r11 = r19;
            UserSession userSession2 = userSession;
            User user2 = user;
            boolean z2 = z;
            if (i2 < 10) {
                C318666pK A01 = AnonymousClass703.A01(context2, userSession2, user2, i2, true);
                if (!(A01 == null || A01 == C318666pK.MESSAGE || ((A01 == (r0 = C318666pK.SHOP) || A01 == r0) && 2R8.A04(userSession2, user2) && AnonymousClass0t1.A01.A01(userSession2).A2L()))) {
                    switch (A01.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            sparseArray.put(i3, A01);
                            break;
                        default:
                            arrayList.add(A00(context2, A01, r11, userSession2, r21.Bgg(), user2, (ArrayList) null, z2));
                            break;
                    }
                    i3++;
                }
                i2++;
            } else {
                if (sparseArray.size() > 1 || (sparseArray.size() >= 1 && AnonymousClass703.A0C(user2))) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = sparseArray.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object valueAt = sparseArray.valueAt(i4);
                        if (valueAt != null) {
                            arrayList2.add(Integer.valueOf(((C318666pK) valueAt).A00));
                            i4++;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    arrayList.add(sparseArray.keyAt(0), A00(context2, C318666pK.CONTACT, r11, userSession2, r21.Bgg(), user2, arrayList2, z2));
                } else {
                    int size2 = sparseArray.size();
                    while (i < size2) {
                        int keyAt = sparseArray.keyAt(i);
                        Object valueAt2 = sparseArray.valueAt(i);
                        if (valueAt2 != null) {
                            arrayList.add(keyAt, A00(context2, (C318666pK) valueAt2, r11, userSession2, r21.Bgg(), user2, (ArrayList) null, z2));
                            i++;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                return arrayList;
            }
        }
    }

    public static final boolean A04(UserSession userSession, User user) {
        if (!user.CQp(new C317986oA(userSession)) || !182.A06(0Tu.A05, userSession, 36322993690127069L)) {
            return false;
        }
        return true;
    }

    private final C3250670x A00(Context context, C318666pK r15, AnonymousClass0iw r16, UserSession userSession, C319866rM r18, User user, ArrayList arrayList, boolean z) {
        C3250670x r1;
        Context context2 = context;
        UserSession userSession2 = userSession;
        C319866rM r5 = r18;
        User user2 = user;
        switch (r15.ordinal()) {
            case 0:
                r1 = new C50657FgI(context, r5, user2);
                break;
            case 1:
                r1 = new C50663FgO(context, r5, user2);
                break;
            case 2:
                r1 = new DcH(context, r5, user2);
                break;
            case 3:
                r1 = new C50665FgQ(context, r5, user2);
                break;
            case 4:
                r1 = new C50659FgK(context, r5, user2);
                break;
            case 5:
                r1 = new C50658FgJ(context, r5, user2);
                break;
            case 6:
                return new AnonymousClass719(context, userSession2, r5, user2, z);
            case 7:
                r1 = new C50660FgL(context, r5, user2);
                break;
            case 8:
                ArrayList arrayList2 = arrayList;
                if (arrayList != null) {
                    return new DcF(context, r5, user2, arrayList2);
                }
                throw new IllegalStateException("Required value was null.");
            case 9:
                return new AnonymousClass71A(context2, r16, userSession2, r5, user2);
            case 10:
                r1 = new AnonymousClass717(context, userSession2, r5, user2);
                break;
            case 11:
                return new C318736pR(context, userSession2, r5, user2, A04(userSession2, user2));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r1 = new C50661FgM(context, r5, user2);
                break;
            default:
                throw new IllegalStateException("Unknown business action on profile.");
        }
        return r1;
    }
}
