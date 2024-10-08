package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: X.GOs  reason: case insensitive filesystem */
public abstract class C52348GOs {
    public static final GO6 A00(C267324bN r11, UserSession userSession, long j, boolean z, boolean z2) {
        0Tu r0;
        long j2;
        Double A0r;
        0Tu r02;
        double doubleValue;
        long j3;
        int A04;
        int i;
        double A00;
        long j4;
        double A002;
        double A003;
        long j5;
        long j6;
        long j7;
        long j8;
        Double A0r2;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        0qQ.A0B(userSession, 0);
        if (z) {
            if (z2) {
                r02 = 0Tu.A06;
                j6 = 36599018357591412L;
            } else if (r11 == null || !r11.CcK()) {
                r02 = 0Tu.A06;
                j6 = 36599018356477295L;
            } else {
                r02 = 0Tu.A06;
                j6 = 36599018353528165L;
            }
            long A042 = (long) DbS.A04(r02, userSession, j6);
            if (z2) {
                j7 = 36599018357656949L;
            } else if (r11 == null || !r11.CcK()) {
                j7 = 36599018356542832L;
            } else {
                j7 = 36599018353593702L;
            }
            long A043 = (long) DbS.A04(r02, userSession, j7);
            if (j <= A042) {
                if (r11 == null || !r11.CcK()) {
                    j11 = 37161968310223049L;
                } else {
                    j11 = 37161968307077305L;
                }
                doubleValue = 182.A00(r02, userSession, j11);
                0qQ.A0A(Double.valueOf(doubleValue));
                if (r11 == null || !r11.CcK()) {
                    j12 = 36599018356411758L;
                } else {
                    j12 = 36599018353462628L;
                }
                i = DbS.A04(r02, userSession, j12);
                if (r11 == null || !r11.CcK()) {
                    j13 = 37161968310616270L;
                } else {
                    j13 = 37161968307536064L;
                }
                A00 = 182.A00(r02, userSession, j13);
                0qQ.A0A(Double.valueOf(A00));
                if (r11 == null || !r11.CcK()) {
                    j14 = 37161968310419660L;
                } else {
                    j14 = 37161968307470527L;
                }
                A002 = 182.A00(r02, userSession, j14);
                0qQ.A0A(Double.valueOf(A002));
                if (r11 == null || !r11.CcK()) {
                    j15 = 37161968310354123L;
                } else {
                    j15 = 37161968307142842L;
                }
                A003 = 182.A00(r02, userSession, j15);
                0qQ.A0A(Double.valueOf(A003));
                j5 = 37161968307339453L;
            } else if (j > A043) {
                if (z2) {
                    A0r2 = C51968G9o.A0r(r02, userSession, 37161968309305540L);
                } else {
                    if (r11 == null || !r11.CcK()) {
                        j8 = 37161968310288586L;
                    } else {
                        j8 = 37161968306749624L;
                    }
                    A0r2 = C51968G9o.A0r(r02, userSession, j8);
                    0qQ.A0A(A0r2);
                }
                doubleValue = A0r2.doubleValue();
                if (z2) {
                    i = (int) 182.A00(r02, userSession, 37161968309108930L);
                } else {
                    if (r11 == null || !r11.CcK()) {
                        j9 = 36599018357067122L;
                    } else {
                        j9 = 36599018353397091L;
                    }
                    i = DbS.A04(r02, userSession, j9);
                }
                A00 = 182.A00(r02, userSession, 37161968307208379L);
                if (z2) {
                    j10 = 37161968311140560L;
                } else if (r11 == null || !r11.CcK()) {
                    j10 = 37161968310026439L;
                } else {
                    j10 = 37161968307273916L;
                }
                A002 = 182.A00(r02, userSession, j10);
                0qQ.A0A(Double.valueOf(A002));
                A003 = 182.A00(r02, userSession, 37161968307601601L);
                j5 = 37161968307404990L;
            }
            return new GO6(doubleValue, A00, A002, A003, 182.A00(r02, userSession, j5), i);
        }
        if (z2) {
            r0 = 0Tu.A06;
            A0r = C51968G9o.A0r(r0, userSession, 37161968309371077L);
        } else {
            if (r11 == null || !r11.CcK()) {
                r0 = 0Tu.A06;
                j2 = 37161968310550733L;
            } else {
                r0 = 0Tu.A06;
                j2 = 37161968305635507L;
            }
            A0r = C51968G9o.A0r(r0, userSession, j2);
            0qQ.A0A(A0r);
        }
        doubleValue = A0r.doubleValue();
        if (z2) {
            A04 = (int) 182.A00(r02, userSession, 37161968309174467L);
        } else {
            if (r11 == null || !r11.CcK()) {
                j3 = 36599018356673905L;
            } else {
                j3 = 36599018352282972L;
            }
            A04 = DbS.A04(r02, userSession, j3);
        }
        A00 = 182.A00(r02, userSession, 37161968305766580L);
        if (z2) {
            j4 = 37161968311206097L;
        } else if (r11 == null || !r11.CcK()) {
            j4 = 37161968310157512L;
        } else {
            j4 = 37161968305897654L;
        }
        A002 = 182.A00(r02, userSession, j4);
        0qQ.A0A(Double.valueOf(A002));
        A003 = 182.A00(r02, userSession, 37161968305832117L);
        j5 = 37161968306028727L;
        return new GO6(doubleValue, A00, A002, A003, 182.A00(r02, userSession, j5), i);
    }

    public static final GO6 A01(UserSession userSession, long j) {
        Integer num;
        0qQ.A0B(userSession, 0);
        C53307Glt glt = ((I43) userSession.A01(I43.class, C58711IwK.A00(userSession, 37))).A00;
        if (j <= glt.A00) {
            num = AnonymousClass05K.A00;
        } else if (j <= glt.A01) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return glt.A02;
        }
        if (intValue != 1) {
            return glt.A04;
        }
        return glt.A03;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.GP6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.I6B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.GP6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.GP6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(X.C267324bN r2, com.instagram.common.session.UserSession r3) {
        /*
            r0 = 0
            X.0qQ.A0B(r3, r0)
            if (r2 == 0) goto L_0x001b
            boolean r0 = r2.CcK()
            if (r0 != 0) goto L_0x001b
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317543381210432(0x81069d005a1540, double:3.030698901062158E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x001b
            r0 = 0
            return r0
        L_0x001b:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317543381800261(0x81069d00631545, double:3.0306989014351685E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0030
            X.I6B r1 = X.C55273Hf2.A00(r3)
            monitor-enter(r1)
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0039 }
            goto L_0x0037
        L_0x0030:
            X.GP6 r1 = X.C52346GOq.A00(r3)
            monitor-enter(r1)
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r1)
            return r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52348GOs.A02(X.4bN, com.instagram.common.session.UserSession):java.lang.String");
    }

    public static final boolean A03(Context context, C267324bN r26, UserSession userSession) {
        boolean z;
        ArrayList A0v;
        boolean A00;
        ArrayList arrayList;
        ArrayList arrayList2;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1B(userSession2, 0, context);
        C52346GOq.A00(userSession2);
        0Tu r3 = 0Tu.A06;
        if (182.A06(r3, userSession2, 36317543381800261L)) {
            C55273Hf2.A00(userSession2);
        }
        0Tu r2 = 0Tu.A05;
        boolean A06 = 182.A06(r2, userSession2, 36317543378916665L);
        boolean A062 = 182.A06(r3, userSession2, 36317543381210432L);
        boolean A063 = 182.A06(r2, userSession2, 36317543380817214L);
        boolean A064 = 182.A06(r3, userSession2, 36317543380751677L);
        C267324bN r13 = r26;
        if (r26 != null && (r13.CcK() || A062)) {
            if (182.A06(r3, userSession2, 36317543381800261L)) {
                I6B A002 = C55273Hf2.A00(userSession2);
                synchronized (A002) {
                    UserSession userSession3 = A002.A03;
                    if (GP5.A01(userSession3)) {
                        z = C55069Hbe.A00(userSession3).A00();
                        A002.A01 = C55069Hbe.A00(userSession3).A02;
                    } else {
                        boolean A02 = GP5.A02(userSession3);
                        ArrayList A003 = I6B.A00(A002);
                        0qQ.A0B(userSession3, 0);
                        double A004 = 182.A00(r3, userSession3, 37161968309633222L);
                        if (A004 > 0.0d) {
                            int A04 = DbS.A04(r3, userSession3, 36599018356084076L);
                            int A042 = DbS.A04(r3, userSession3, 36599018356018539L);
                            if (A042 > 0) {
                                I6B i6b = A002;
                                z = I6B.A03(i6b, A003, (ArrayList) null, A004, A04, A042);
                                if (A02 && 0qQ.A0K(A002.A01, "not_swiper")) {
                                    z = I6B.A03(i6b, A003, I6B.A01(A002), A004, A04, A042);
                                }
                            } else {
                                int A043 = DbS.A04(r3, userSession3, 36599018356149613L);
                                if (A043 > 0) {
                                    I6B i6b2 = A002;
                                    z = I6B.A02(i6b2, A003, (ArrayList) null, A004, A04, A043);
                                    if (A02 && 0qQ.A0K(A002.A01, "not_swiper")) {
                                        z = I6B.A02(i6b2, A003, I6B.A01(A002), A004, A04, A043);
                                    }
                                }
                            }
                        }
                        A002.A01 = null;
                        A002.A00 = 0.0d;
                        z = false;
                    }
                }
            } else {
                GP6 A005 = C52346GOq.A00(userSession2);
                synchronized (A005) {
                    UserSession userSession4 = A005.A03;
                    if (GP5.A01(userSession4)) {
                        A00 = C55069Hbe.A00(userSession4).A00();
                        A005.A01 = C55069Hbe.A00(userSession4).A02;
                    } else {
                        Type type = new C8693R1i().A00;
                        boolean A022 = GP5.A02(userSession4);
                        0qQ.A0B(userSession4, 0);
                        boolean A065 = 182.A06(r2, userSession4, 36317543381538116L);
                        0xa r9 = A005.A04;
                        String string = r9.getString("KEY_SWIPE_HISTORY_V2", (String) null);
                        if (string != null) {
                            Object A09 = A005.A02.A09(string, type);
                            0qQ.A07(A09);
                            A0v = (ArrayList) A09;
                        } else {
                            A0v = DbS.A0v(20);
                        }
                        double A006 = 182.A00(r3, userSession4, 37161968309633222L);
                        if (A006 > 0.0d) {
                            int A044 = DbS.A04(r3, userSession4, 36599018356084076L);
                            int A045 = DbS.A04(r3, userSession4, 36599018356018539L);
                            if (A045 > 0) {
                                GP6 gp6 = A005;
                                A00 = GP6.A01(gp6, A0v, A006, A044, A045);
                                if (A022 && 0qQ.A0K(A005.A01, "not_swiper")) {
                                    String string2 = r9.getString("KEY_PROFILE_SWIPE_HISTORY", (String) null);
                                    if (string2 != null) {
                                        Object A092 = A005.A02.A09(string2, type);
                                        0qQ.A07(A092);
                                        arrayList2 = (ArrayList) A092;
                                    } else {
                                        arrayList2 = DbS.A0v(20);
                                    }
                                    if (A065) {
                                        arrayList2.addAll(A0v);
                                    }
                                    A00 = GP6.A01(gp6, arrayList2, A006, A044, A045);
                                }
                            } else {
                                int A046 = DbS.A04(r3, userSession4, 36599018356149613L);
                                if (A046 > 0) {
                                    GP6 gp62 = A005;
                                    A00 = GP6.A00(gp62, A0v, A006, A044, A046);
                                    if (A022 && 0qQ.A0K(A005.A01, "not_swiper")) {
                                        String string3 = r9.getString("KEY_PROFILE_SWIPE_HISTORY", (String) null);
                                        if (string3 != null) {
                                            Object A093 = A005.A02.A09(string3, type);
                                            0qQ.A07(A093);
                                            arrayList = (ArrayList) A093;
                                        } else {
                                            arrayList = DbS.A0v(20);
                                        }
                                        if (A065) {
                                            arrayList.addAll(A0v);
                                        }
                                        A00 = GP6.A00(gp62, arrayList, A006, A044, A046);
                                    }
                                }
                            }
                        }
                        A005.A01 = null;
                        A005.A00 = 0.0d;
                        z = false;
                    }
                }
            }
            String A023 = A02(r13, userSession2);
            if (A06) {
                if (!A063) {
                    return z;
                }
                if (z || (0qQ.A0K(A023, "not_swiper") && A064)) {
                    return true;
                }
                return false;
            } else if (A063) {
                return A064;
            }
        }
        return false;
    }
}
