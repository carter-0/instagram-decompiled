package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;

/* renamed from: X.OPh  reason: case insensitive filesystem */
public abstract class C70868OPh {
    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object, X.6YJ] */
    /* JADX WARNING: type inference failed for: r0v36, types: [java.lang.Object, X.6YJ] */
    public static String A00(Context context, UserSession userSession, AnonymousClass7FJ r9, String str, boolean z, boolean z2, boolean z3) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        Object[] objArr2;
        String username;
        AnonymousClass3I7 r0;
        int i4;
        Object[] objArr3;
        String username2;
        AnonymousClass6YJ r02;
        1Xj r5 = r9.A01;
        Integer num = r9.A04;
        Integer num2 = AnonymousClass05K.A01;
        if (!z) {
            if (num != num2) {
                if (r5 != null) {
                    if (!r5.A5N() && r9.A02 == ReelType.A0S && (r0 = r9.A00) != null) {
                        ? obj = new Object();
                        obj.A00 = r0;
                        int intValue = obj.CAm().intValue();
                        if (intValue == 3) {
                            i3 = 2131959432;
                        } else if (intValue == 2) {
                            i3 = 2131959667;
                        }
                        objArr2 = new Object[1];
                        username = obj.A00.A06;
                    } else if (r9.A02 != ReelType.A0P) {
                        String A01 = A01(userSession, r5);
                        if (A01 != null) {
                            if (z3) {
                                i = 2131960419;
                                if (z2) {
                                    i = 2131960415;
                                }
                                objArr = new Object[]{str, A01};
                            } else {
                                int i5 = 2131960413;
                                if (z2) {
                                    i5 = 2131960414;
                                }
                                objArr = new Object[]{A01};
                            }
                            return context.getString(i, objArr);
                        }
                    } else if (z3) {
                        int i6 = 2131960399;
                        if (z2) {
                            i6 = 2131960396;
                        }
                        User A2A = r5.A2A(userSession);
                        A2A.getClass();
                        objArr2 = new Object[]{str, A2A.getUsername()};
                        return context.getString(i3, objArr2);
                    } else {
                        int i7 = 2131960394;
                        if (z2) {
                            i7 = 2131960395;
                        }
                        objArr2 = new Object[1];
                        User A2A2 = r5.A2A(userSession);
                        A2A2.getClass();
                        username = A2A2.getUsername();
                    }
                }
                if (z3) {
                    int i8 = 2131960416;
                    if (z2) {
                        i8 = 2131960417;
                    }
                    objArr = new Object[]{str};
                    return context.getString(i, objArr);
                }
                i2 = 2131960421;
                if (z2) {
                    i2 = 2131960422;
                }
            } else if (r5 == null) {
                return context.getString(2131960369);
            } else {
                i3 = 2131960368;
                objArr2 = new Object[1];
                username = A01(userSession, r5);
            }
            objArr2[0] = username;
            return context.getString(i3, objArr2);
        } else if (num == num2) {
            i2 = 2131960370;
        } else {
            if (r5 != null) {
                if (!r5.A5N()) {
                    AnonymousClass3I7 r1 = r9.A00;
                    if (r1 == null) {
                        r02 = null;
                    } else {
                        ? obj2 = new Object();
                        obj2.A00 = r1;
                        r02 = obj2;
                    }
                    if (r9.A02 != ReelType.A0S || r02 == null) {
                        int i9 = 2131960424;
                        if (z2) {
                            i9 = 2131960425;
                        }
                        objArr3 = new Object[1];
                        username2 = A01(userSession, r5);
                    } else {
                        int intValue2 = r02.CAm().intValue();
                        if (intValue2 == 3) {
                            i4 = 2131959433;
                        } else if (intValue2 == 2) {
                            i4 = 2131959668;
                        }
                        objArr3 = new Object[1];
                        username2 = r02.A00.A06;
                    }
                } else if (r9.A02 == ReelType.A0P) {
                    int i10 = 2131960403;
                    if (z2) {
                        i10 = 2131960404;
                    }
                    objArr3 = new Object[1];
                    User A2A3 = r5.A2A(userSession);
                    A2A3.getClass();
                    username2 = A2A3.getUsername();
                }
                objArr3[0] = username2;
                return context.getString(i4, objArr3);
            }
            i2 = 2131960426;
            if (z2) {
                i2 = 2131960427;
            }
        }
        return context.getString(i2);
    }

    public static String A01(UserSession userSession, 1Xj r2) {
        User A2A = r2.A2A(userSession);
        A2A.getClass();
        if (A2A.A2Q()) {
            return C231122qu.A0G(userSession, r2);
        }
        User A2A2 = r2.A2A(userSession);
        A2A2.getClass();
        return A2A2.getUsername();
    }
}
