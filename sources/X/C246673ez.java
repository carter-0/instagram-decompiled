package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3ez  reason: invalid class name and case insensitive filesystem */
public abstract class C246673ez {
    public static final StringBuilder A01(Context context, Resources resources, AnonymousClass0iw r10, UserSession userSession, 1Xj r12, 0Pl r13, boolean z) {
        String str;
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        1Xj r4 = r12;
        0qQ.A0B(r12, 2);
        Resources resources2 = resources;
        0qQ.A0B(resources, 3);
        0qQ.A0B(r10, 6);
        User A2A = r12.A2A(userSession);
        if (A2A != null) {
            str = A2A.B8Q();
        } else {
            str = "";
        }
        String AXm = r12.A0C.AXm();
        return A02(context2, resources2, userSession2, r4, r13, C243193Xt.A02(userSession, r12, r12), A00(r12), str, AXm, r10.getModuleName(), z);
    }

    public static final StringBuilder A02(Context context, Resources resources, UserSession userSession, 1Xj r14, 0Pl r15, AnonymousClass3VA r16, Integer num, String str, String str2, String str3, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        String str4;
        String str5;
        int i3;
        Object[] objArr2;
        int i4;
        AnonymousClass3VA r2 = r16;
        0qQ.A0B(r2, 9);
        String str6 = str3;
        0qQ.A0B(str6, 10);
        StringBuilder sb = new StringBuilder();
        1Xj r7 = r14;
        if (r14 != null) {
            if (r14.CcK()) {
                i4 = 2131965975;
            } else if (r14.A69()) {
                i4 = 2131965977;
            }
            sb.append(resources.getString(i4));
            sb.append(' ');
        }
        if (num != null) {
            int intValue = num.intValue();
            String str7 = str;
            String str8 = str2;
            if (intValue == 0) {
                i2 = 2131964113;
                if (str2 != null) {
                    i = 2131964114;
                }
                objArr = new Object[]{str7};
                str4 = resources.getString(i, objArr);
                2eQ.A09(str4, sb, false);
            } else if (intValue != 1) {
                if (intValue == 3) {
                    i2 = 2131965936;
                    if (str2 != null) {
                        i = 2131965937;
                        objArr = new Object[]{str8};
                        str4 = resources.getString(i, objArr);
                        2eQ.A09(str4, sb, false);
                    }
                } else if (intValue == 4) {
                    i2 = 2131971514;
                    if (str2 != null) {
                        i = 2131971515;
                    }
                }
                objArr = new Object[]{str7};
                str4 = resources.getString(i, objArr);
                2eQ.A09(str4, sb, false);
            } else {
                if (r2 == AnonymousClass3VA.CLIPS) {
                    str5 = resources.getString(2131971902);
                } else {
                    str5 = "";
                }
                0qQ.A0A(str5);
                StringBuilder sb2 = new StringBuilder();
                if (str2 != null) {
                    sb2.append(str5);
                    i3 = 2131976478;
                    objArr2 = new Object[]{str7, str8};
                } else {
                    sb2.append(str5);
                    i3 = 2131976477;
                    objArr2 = new Object[]{str7};
                }
                sb2.append(resources.getString(i3, objArr2));
                str4 = sb2.toString();
                2eQ.A09(str4, sb, false);
            }
            objArr = new Object[]{str7, str8};
            str4 = resources.getString(i, objArr);
            2eQ.A09(str4, sb, false);
        }
        A03(context, userSession, r7, r15, str6, sb, z);
        return sb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.content.Context r7, com.instagram.common.session.UserSession r8, X.1Xj r9, X.0Pl r10, java.lang.String r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r4 = 1
            if (r9 == 0) goto L_0x0061
            boolean r0 = X.C243353Yk.A00(r8, r9)
            if (r0 == 0) goto L_0x0073
            if (r10 == 0) goto L_0x0073
            X.3Yy r0 = X.C243483Yy.A00
            java.util.List r0 = r0.A06(r8, r9)
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L_0x0073
            java.lang.CharSequence r0 = r10.A0E(r7, r9, r11)
        L_0x001f:
            X.2eQ.A09(r0, r12, r4)
        L_0x0022:
            int r0 = r9.A0r()
            if (r0 == 0) goto L_0x004f
            android.content.res.Resources r6 = r7.getResources()
            X.0qQ.A07(r6)
            int r5 = r9.A0r()
            r3 = 0
            r2 = 2131820864(0x7f110140, float:1.9274455E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r0 = X.C253673rC.A04(r6, r1, r0, r3, r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r6.getQuantityString(r2, r5, r0)
            X.0qQ.A07(r0)
            X.2eQ.A09(r0, r12, r4)
        L_0x004f:
            boolean r0 = r9.CeS()
            if (r0 == 0) goto L_0x0061
            long r2 = r9.A1A()
            double r0 = (double) r2
            java.lang.String r0 = X.1G0.A03(r7, r0)
            X.2eQ.A09(r0, r12, r4)
        L_0x0061:
            if (r13 == 0) goto L_0x0072
            if (r9 == 0) goto L_0x0072
            X.3gp r0 = r9.A1T()
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = r0.A0d
            if (r0 == 0) goto L_0x0072
            X.2eQ.A09(r0, r12, r4)
        L_0x0072:
            return
        L_0x0073:
            boolean r0 = X.C243353Yk.A00(r8, r9)
            if (r0 != 0) goto L_0x0022
            android.content.res.Resources r1 = r7.getResources()
            X.0qQ.A07(r1)
            int r0 = r9.A0v()
            java.lang.String r0 = X.AnonymousClass3f0.A00(r1, r0)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246673ez.A03(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, X.0Pl, java.lang.String, java.lang.StringBuilder, boolean):void");
    }

    public static final void A04(View view, UserSession userSession, 1Xj r9, int i) {
        int i2;
        Object[] objArr;
        int i3;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r9, 2);
        Resources resources = view.getResources();
        User A2A = r9.A2A(userSession);
        if (A2A != null) {
            String B8Q = A2A.B8Q();
            String AXm = r9.A0C.AXm();
            int intValue = A00(r9).intValue();
            if (intValue == 0) {
                i3 = 2131965096;
                if (AXm != null) {
                    i2 = 2131965097;
                }
                objArr = new Object[]{B8Q, Integer.valueOf(i + 1)};
                view.setContentDescription(resources.getString(i2, objArr));
                return;
            } else if (intValue == 1) {
                i3 = 2131965104;
                if (AXm != null) {
                    i2 = 2131965105;
                }
                objArr = new Object[]{B8Q, Integer.valueOf(i + 1)};
                view.setContentDescription(resources.getString(i2, objArr));
                return;
            } else if (intValue == 3) {
                i3 = 2131965100;
                if (AXm != null) {
                    i2 = 2131965101;
                }
                objArr = new Object[]{B8Q, Integer.valueOf(i + 1)};
                view.setContentDescription(resources.getString(i2, objArr));
                return;
            } else {
                return;
            }
            objArr = new Object[]{B8Q, AXm, Integer.valueOf(i + 1)};
            view.setContentDescription(resources.getString(i2, objArr));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A05(View view, UserSession userSession, 1Xj r11, int i, int i2) {
        int i3;
        Object[] objArr;
        String quantityString;
        int i4;
        int i5;
        int i6 = 0;
        Resources resources = view.getResources();
        User A2A = r11.A2A(userSession);
        if (A2A != null) {
            String B8Q = A2A.B8Q();
            String AXm = r11.A0C.AXm();
            int intValue = A00(r11).intValue();
            if (intValue != 2) {
                if (intValue == 0) {
                    i5 = 2131963139;
                    if (AXm != null) {
                        i3 = 2131963140;
                    }
                    objArr = new Object[]{B8Q, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                } else if (intValue == 1) {
                    i5 = 2131963146;
                    if (AXm != null) {
                        i3 = 2131963147;
                    }
                    objArr = new Object[]{B8Q, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                } else if (intValue == 3) {
                    i5 = 2131963141;
                    if (AXm != null) {
                        i3 = 2131963142;
                    }
                    objArr = new Object[]{B8Q, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                } else if (intValue == 4) {
                    i5 = 2131963143;
                    if (AXm != null) {
                        i3 = 2131963144;
                    }
                    objArr = new Object[]{B8Q, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                } else {
                    throw new RuntimeException();
                }
                objArr = new Object[]{B8Q, AXm, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
            } else {
                User A2A2 = r11.A2A(userSession);
                if (A2A2 != null) {
                    String B8Q2 = A2A2.B8Q();
                    int A0o = r11.A0o();
                    int i7 = 0;
                    while (i7 < A0o) {
                        1Xj A1c = r11.A1c(i7);
                        if (A1c != null) {
                            if (A1c.CeS()) {
                                i6++;
                            }
                            i7++;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    int i8 = A0o - i6;
                    if (A0o == i6) {
                        i4 = 2131963137;
                    } else if (A0o == i8) {
                        i4 = 2131963136;
                    } else {
                        if (i8 == 1) {
                            if (i6 >= 1) {
                                quantityString = resources.getQuantityString(R.plurals.grid_carousel_one_photo_n_videos, i6, new Object[]{Integer.valueOf(i6), B8Q2, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)});
                                view.setContentDescription(quantityString);
                            }
                        } else if (i8 >= 1 && i6 == 1) {
                            quantityString = resources.getQuantityString(R.plurals.grid_carousel_n_photos_one_video, i8, new Object[]{Integer.valueOf(i8), B8Q2, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)});
                            view.setContentDescription(quantityString);
                        }
                        i3 = 2131963138;
                        objArr = new Object[]{Integer.valueOf(i8), Integer.valueOf(i6), B8Q2, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                    }
                    objArr = new Object[]{Integer.valueOf(A0o), B8Q2, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            quantityString = resources.getString(i3, objArr);
            view.setContentDescription(quantityString);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.view.View r12, com.instagram.common.session.UserSession r13, X.1Xj r14, X.1Xj r15, X.0Pl r16, java.lang.String r17, java.lang.String r18, int r19, int r20, boolean r21) {
        /*
            r3 = 0
            r7 = 3
            r6 = 1
            X.0qQ.A0B(r14, r7)
            r0 = 9
            r9 = r18
            X.0qQ.A0B(r9, r0)
            android.content.res.Resources r4 = r12.getResources()
            X.1Xy r0 = r14.A0C
            java.lang.String r5 = r0.AXm()
            java.lang.Integer r2 = A00(r14)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            boolean r0 = r14.CcK()
            r1 = 32
            if (r0 == 0) goto L_0x0080
            r0 = 2131965975(0x7f133817, float:1.9568775E38)
        L_0x002b:
            java.lang.String r0 = r4.getString(r0)
            r10.append(r0)
            r10.append(r1)
        L_0x0035:
            int r0 = r2.intValue()
            if (r0 == r6) goto L_0x006c
            if (r0 != r7) goto L_0x0058
            r2 = 2131954805(0x7f130c75, float:1.954612E38)
            if (r5 == 0) goto L_0x0075
            r2 = 2131954806(0x7f130c76, float:1.9546122E38)
        L_0x0045:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
        L_0x004d:
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r5}
            java.lang.String r0 = r4.getString(r2, r0)
            X.2eQ.A09(r0, r10, r3)
        L_0x0058:
            android.content.Context r5 = r12.getContext()
            X.0qQ.A07(r5)
            r6 = r13
            r7 = r15
            r8 = r16
            r11 = r21
            A03(r5, r6, r7, r8, r9, r10, r11)
            r12.setContentDescription(r10)
            return
        L_0x006c:
            r2 = 2131954808(0x7f130c78, float:1.9546126E38)
            if (r5 == 0) goto L_0x0075
            r2 = 2131954809(0x7f130c79, float:1.9546128E38)
            goto L_0x0045
        L_0x0075:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r5 = r17
            goto L_0x004d
        L_0x0080:
            boolean r0 = r14.A69()
            if (r0 == 0) goto L_0x0035
            r0 = 2131974699(0x7f135a2b, float:1.958647E38)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246673ez.A06(android.view.View, com.instagram.common.session.UserSession, X.1Xj, X.1Xj, X.0Pl, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public static final Integer A00(1Xj r1) {
        if (r1.A5Y()) {
            return AnonymousClass05K.A00;
        }
        if (r1.A5G()) {
            return AnonymousClass05K.A0Y;
        }
        if (r1.CeS()) {
            return AnonymousClass05K.A01;
        }
        if (r1.A5D()) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A0N;
    }
}
