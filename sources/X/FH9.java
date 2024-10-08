package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class FH9 {
    public static void A0D(C229382nI r9, C307786Rm r10, C307896Rx r11, C276544tV r12, List list, Map map, Map map2) {
        String str;
        C307786Rm r2 = r10;
        FragmentActivity A03 = C308206Td.A03(r10);
        List list2 = list;
        C276544tV A00 = C49732F3x.A00(list);
        C307896Rx r3 = r11;
        C46615Dhv A002 = C46616Dhw.A00((C20880X2h) null, r10, r11, C46611Dhr.A02(r12));
        C46622Di2 A01 = A01(r9, A002, r2, r3, r12, list2, map, map2);
        try {
            str = C46611Dhr.A08(r12);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        C331157Pu A003 = A08(A03, A01, A002, r2, r3, A00, str).A00();
        A01.A0C = A003;
        A003.A02(A03, A01);
    }

    public static void A0F(C307896Rx r5, C276544tV r6, Map map) {
        C307896Rx r3 = r5;
        A0C(C308206Td.A04(r3), C308206Td.A06(r3), r3.A03, r3, r6, C308206Td.A0B(r5), map);
    }

    public static int A00(String str) {
        if (str == null) {
            return 16;
        }
        try {
            return AnonymousClass6Su.A05(str);
        } catch (C258053yO e) {
            1Kn.A03("BloksBottomSheetHelper", e);
            return 16;
        }
    }

    public static C46622Di2 A01(C229382nI r33, C46615Dhv dhv, C307786Rm r35, C307896Rx r36, C276544tV r37, List list, Map map, Map map2) {
        int i;
        C3034368u A00;
        C277014uI A0A;
        String A0F;
        String A01;
        C276544tV r6 = r37;
        String A07 = C46611Dhr.A07(r6);
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object value = A1J.getValue();
            String A012 = C49732F3x.A01(A1J.getKey());
            if (value == null) {
                A01 = null;
            } else {
                A01 = C49732F3x.A01(A1J.getValue());
            }
            A1E.put(A012, A01);
        }
        C307786Rm r1 = r35;
        0lg A0A2 = C308206Td.A0A(r1);
        Map map3 = map2;
        String str = A07;
        C46645DiQ diQ = new C46645DiQ((SparseArray) null, (C51893G6j) null, (C51893G6j) null, (Object) null, (String) null, str, (String) null, (String) null, A1E, AnonymousClass7TE.A1C(), (Map) null, map3, map3, -1, 0, -1, -1, false, false);
        boolean A1V = AnonymousClass7TF.A1V(C46611Dhr.A03(C46611Dhr.A09(r6), 15855));
        Context context = r1.A00;
        String str2 = diQ.A09;
        if (!(str2 == null || 0Gl.A01(A0A2) == null)) {
            HashMap hashMap = diQ.A0C;
            0qQ.A0B(A0A2, 1);
            C359638dF.A02(context, new C359618dD(A0A2, false, A1V, false), str2, (String) null, hashMap, 0);
        }
        C307896Rx r7 = r36;
        if (A1V) {
            A00 = C46611Dhr.A01(r7, r6);
        } else {
            if (r6.A04 == 13647) {
                i = 43;
            } else if (C46611Dhr.A0F(r6)) {
                i = 38;
            } else {
                throw AnonymousClass7TE.A0w("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
            C276544tV A072 = r6.A07(i);
            if (A072 == null) {
                A00 = null;
            } else {
                A00 = C3034368u.A00(r7, A072);
            }
        }
        C276544tV A002 = C49732F3x.A00(list);
        String A06 = C46611Dhr.A06(r6);
        if (!(A002 == null || (A0F = A002.A0F()) == null)) {
            A06 = A0F;
        }
        C46649DiU diU = new C46649DiU(A1E, map3, A07);
        C49672F1e f1e = new C49672F1e(A0A2);
        C46615Dhv dhv2 = dhv;
        if (dhv != null) {
            f1e.A00.A07(dhv2);
        }
        IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
        igBloksScreenConfig.A0R = A06;
        igBloksScreenConfig.A07 = A00;
        igBloksScreenConfig.A0c = r33.A00;
        igBloksScreenConfig.A0d = A1V;
        String str3 = null;
        if (A002 != null) {
            str3 = A002.A0D();
        }
        igBloksScreenConfig.A00 = A00(str3);
        if (A002 == null) {
            A0A = C46611Dhr.A04(r6);
        } else {
            A0A = A002.A0A(42);
        }
        if (A0A != null) {
            igBloksScreenConfig.A0A = A0A;
        }
        return C49891FBs.A01(igBloksScreenConfig, diU);
    }

    public static C46622Di2 A02(C229382nI r7, C307896Rx r8, C276544tV r9, 0lg r10, Map map) {
        Object A04;
        if (C276544tV.A00(r9, 31) != null) {
            A04 = C276544tV.A00(r9, 31);
        } else {
            C276544tV A07 = r9.A07(36);
            17k.A07(A07, "Content is expected in the bottom sheet payload");
            if (r8 != null) {
                A04 = C3034368u.A00(r8, A07);
            } else {
                A04 = C3034368u.A04(A07);
            }
            r9.A0P(31, A04);
        }
        String A10 = DbV.A10(r9, "");
        C277014uI A0A = r9.A0A(46);
        int A00 = A00(r9.A0K(44));
        A04.getClass();
        C46622Di2 di2 = new C46622Di2();
        Bundle A0a = AnonymousClass7TE.A0a();
        DbW.A0w(A0a, r10);
        A0a.putString("module_name", A10);
        A0a.putInt("content_key", C46636DiG.A00(r10).A01(A04));
        if (map != null) {
            A0a.putInt("external_variables_key", C46636DiG.A00(r10).A01(new HashMap(map)));
        }
        A0a.putInt("soft_input_mode", A00);
        if (A0A != null) {
            A0a.putInt("backpress_key", C46636DiG.A00(r10).A01(A0A));
        }
        di2.setArguments(A0a);
        di2.A07 = r7;
        return di2;
    }

    public static C276534tU A03(C307896Rx r3, C276544tV r4) {
        C276534tU r2 = new C276534tU(13374);
        C276544tV A07 = r4.A07(35);
        if (A07 != null) {
            r2.A0P(31, C3034368u.A00(r3, A07));
            A0H(r4, r2);
            r2.A0O();
            return r2;
        }
        throw AnonymousClass7TE.A0z("Null content for BottomSheet");
    }

    public static C331157Pu A05(Context context, 0lg r4) {
        AnonymousClass37D A02;
        if (!182.A06(0Tu.A05, r4, 36311947032920903L) || (A02 = AnonymousClass37D.A00.A02(context)) == null || !((AnonymousClass37F) A02).A0g) {
            return null;
        }
        BottomSheetFragment A09 = A02.A09();
        if (A09 instanceof BottomSheetFragment) {
            return A09.A02;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        if (r27 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r0.A0R(65, false) != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r10 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r5 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        r1 = X.AnonymousClass37D.A00.A02(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        if (r1 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        r1.A0Q(new X.C65755Lz9(0, r5, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        return A0A(r10, X.C308206Td.A0A(r7), r12, r13, r23, r15, r28, r17, r18, r19, r20, r21, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        if (r0.A0R(41, false) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
        if (r0.A0R(66, false) == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C331127Pr A08(android.app.Activity r22, X.C46622Di2 r23, X.C46615Dhv r24, X.C307786Rm r25, X.C307896Rx r26, X.C276544tV r27, java.lang.String r28) {
        /*
            r4 = 43
            r3 = 35
            r5 = 0
            r1 = r24
            r7 = r25
            r8 = r26
            if (r24 == 0) goto L_0x0106
            X.4tV r2 = r1.A02
            if (r2 == 0) goto L_0x0106
            android.content.Context r0 = r7.A00
            X.4uI r12 = r2.A0A(r3)
            java.lang.String r13 = r2.A0F()
            java.lang.String r14 = r2.A0H()
            java.lang.String r15 = r2.A0K(r4)
            r16 = 1
            r9 = r0
            r10 = r5
            r11 = r8
            X.7Pt r12 = A0B(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x002c:
            r6 = 1
            r2 = 0
            r0 = r27
            if (r24 == 0) goto L_0x00dc
            java.util.List r11 = r1.A07
            if (r11 == 0) goto L_0x00dc
            int r9 = r11.size()
            if (r9 <= r6) goto L_0x0043
            java.lang.String r10 = "invalid_screen"
            java.lang.String r9 = "OpenBottomSheet screen only allows one navbar right button"
            X.1Kn.A02(r10, r9)
        L_0x0043:
            java.lang.Object r10 = r11.get(r2)
            X.4tV r10 = (X.C276544tV) r10
            android.content.Context r9 = r7.A00
            X.4uI r16 = r10.A0A(r3)
            java.lang.String r17 = r10.A0F()
            java.lang.String r18 = r10.A0H()
            java.lang.String r19 = r10.A0K(r4)
            r13 = r9
            r14 = r5
            r15 = r8
            r20 = r6
            X.7Pt r13 = A0B(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0064:
            java.lang.String r15 = ""
            if (r27 == 0) goto L_0x006e
            r6 = 52
            java.lang.String r15 = X.DbV.A11(r0, r15, r6)
        L_0x006e:
            if (r24 == 0) goto L_0x0075
            java.lang.String r1 = r1.A06
            if (r1 == 0) goto L_0x0075
            r15 = r1
        L_0x0075:
            r6 = 50
            if (r27 != 0) goto L_0x00b4
            r17 = 50
        L_0x007b:
            r19 = 0
            if (r27 != 0) goto L_0x00c5
            r18 = 16
        L_0x0081:
            r20 = 0
            if (r27 == 0) goto L_0x008f
        L_0x0085:
            r1 = 65
            boolean r0 = r0.A0R(r1, r2)
            r21 = 1
            if (r0 != 0) goto L_0x0091
        L_0x008f:
            r21 = 0
        L_0x0091:
            r10 = r22
            if (r5 == 0) goto L_0x00a5
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r1 = r0.A02(r10)
            if (r1 == 0) goto L_0x00a5
            X.Lz9 r0 = new X.Lz9
            r0.<init>(r2, r5, r8)
            r1.A0Q(r0)
        L_0x00a5:
            X.0lg r11 = X.C308206Td.A0A(r7)
            r14 = r23
            r16 = r28
            r22 = r2
            X.7Pr r0 = A0A(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x00b4:
            r1 = 46
            int r17 = r0.A03(r1, r6)
            r1 = 41
            boolean r1 = r0.A0R(r1, r2)
            r19 = 1
            if (r1 != 0) goto L_0x00c5
            goto L_0x007b
        L_0x00c5:
            X.4uI r5 = r0.A0A(r4)
            java.lang.String r1 = r0.A0K(r3)
            int r18 = A00(r1)
            r1 = 66
            boolean r1 = r0.A0R(r1, r2)
            r20 = 1
            if (r1 != 0) goto L_0x0085
            goto L_0x0081
        L_0x00dc:
            if (r27 == 0) goto L_0x0103
            android.content.Context r10 = r7.A00
            r9 = 55
            X.4uI r16 = r0.A0A(r9)
            r9 = 56
            java.lang.String r17 = r0.A0K(r9)
            r9 = 54
            java.lang.String r18 = r0.A0K(r9)
            r9 = 53
            java.lang.String r19 = r0.A0K(r9)
            r13 = r10
            r14 = r5
            r15 = r8
            r20 = r6
            X.7Pt r13 = A0B(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0064
        L_0x0103:
            r13 = r5
            goto L_0x0064
        L_0x0106:
            r12 = r5
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH9.A08(android.app.Activity, X.Di2, X.Dhv, X.6Rm, X.6Rx, X.4tV, java.lang.String):X.7Pr");
    }

    public static C331127Pr A09(Activity activity, IgBloksScreenConfig igBloksScreenConfig, 0lg r15, C273494mf r16) {
        return A0A(activity, r15, (C331147Pt) null, (C331147Pt) null, r16, igBloksScreenConfig.A0U, (String) null, 50, igBloksScreenConfig.A00, false, igBloksScreenConfig.A0b, igBloksScreenConfig.A0a, igBloksScreenConfig.A0j);
    }

    public static void A0C(Activity activity, C229382nI r23, C307786Rm r24, C307896Rx r25, C276544tV r26, 0lg r27, Map map) {
        String str;
        AnonymousClass37E r2 = AnonymousClass37D.A00;
        Activity activity2 = activity;
        r2.A01(activity2);
        C276544tV r0 = r26;
        int A00 = A00(r0.A0K(44));
        C307896Rx r3 = r25;
        0lg r8 = r27;
        C46622Di2 A02 = A02(r23, r3, r0, r8, map);
        C331147Pt A0B = A0B(activity2, (View.OnClickListener) null, r3, r0.A0A(57), r0.A0K(58), r0.A0K(56), r0.A0K(55), true);
        String str2 = "";
        String A0J = r0.A0J();
        if (A0J != null) {
            str2 = A0J;
        }
        int A03 = r0.A03(41, 50);
        boolean A0T = r0.A0T(false);
        try {
            str = C46611Dhr.A08(r0);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        C331157Pu A002 = A0A(activity2, r8, (C331147Pt) null, A0B, A02, str2, str, A03, A00, A0T, r0.A0R(63, false), r0.A0R(62, false), r0.A0R(65, false)).A00();
        A02.A0C = A002;
        if (!(r24 == null || r25 == null || r0.A0A(40) == null)) {
            C277014uI A0A = r0.A0A(40);
            AnonymousClass37D A022 = r2.A02(activity2);
            if (A022 != null) {
                A022.A0Q(new C65755Lz9(0, A0A, r3));
            }
        }
        A002.A02(activity2, A02);
    }

    public static void A0G(C307896Rx r21, C276544tV r22, Map map, boolean z) {
        String str;
        C307896Rx r3 = r21;
        0lg A0B = C308206Td.A0B(r3);
        FragmentActivity A04 = C308206Td.A04(r3);
        C229382nI A06 = C308206Td.A06(r3);
        C331157Pu A07 = A07(r3);
        if (A07 == null) {
            A07 = A05(A04, A0B);
        }
        if (A07 == null) {
            1Kn.A02("BloksBottomSheetHelper", "Can't push bottom sheet outside of controller");
            return;
        }
        C276544tV r0 = r22;
        int A00 = A00(r0.A0K(44));
        C46622Di2 A02 = A02(A06, r3, r0, A0B, map);
        A02.A0C = A07;
        if (r0.A0A(40) != null) {
            C277014uI A0A = r0.A0A(40);
            AnonymousClass37D A022 = AnonymousClass37D.A00.A02(A04);
            if (A022 != null) {
                A022.A0Q(new C65755Lz9(0, A0A, r3));
            }
        }
        C331147Pt A0B2 = A0B(A04, (View.OnClickListener) null, r3, r0.A0A(57), r0.A0K(58), r0.A0K(56), r0.A0K(55), true);
        String str2 = "";
        String A0J = r0.A0J();
        if (A0J != null) {
            str2 = A0J;
        }
        int A03 = r0.A03(41, 50);
        boolean A0T = r0.A0T(false);
        try {
            str = C46611Dhr.A08(r0);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        A07.A0G(A02, A0A(A04, A0B, (C331147Pt) null, A0B2, A02, str2, str, A03, A00, A0T, r0.A0R(63, false), r0.A0R(62, false), r0.A0R(65, false)), z, true);
    }

    public static void A0H(C276544tV r5, C276534tU r6) {
        r6.A0P(40, r5.A0A(38));
        r6.A0P(46, r5.A0A(75));
        String str = "";
        String A0F = r5.A0F();
        if (A0F != null) {
            str = A0F;
        }
        r6.A0P(43, str);
        r6.A0P(41, Integer.valueOf(r5.A03(53, 50)));
        r6.A0P(38, Boolean.valueOf(r5.A0R(52, false)));
        r6.A0P(58, r5.A0K(48));
        r6.A0P(55, r5.A0K(44));
        r6.A0P(57, r5.A0A(45));
        r6.A0P(56, r5.A0K(57));
        r6.A0P(44, r5.A0K(55));
        r6.A0P(63, Boolean.valueOf(r5.A0R(72, false)));
        r6.A0P(62, Boolean.valueOf(r5.A0R(71, false)));
        r6.A0P(65, Boolean.valueOf(r5.A0R(76, false)));
    }

    public static C276534tU A04(C3034368u r3) {
        Pair A00 = C48777Ek0.A00(r3);
        C276534tU r2 = new C276534tU(13374);
        r2.A0P(31, A00.second);
        A0H((C276544tV) A00.first, r2);
        r2.A0O();
        return r2;
    }

    public static C331157Pu A06(C307786Rm r2) {
        return (C331157Pu) r2.A01.get(R.id.bottom_sheet_id);
    }

    public static C331157Pu A07(C307896Rx r0) {
        return A06(C308206Td.A09(r0));
    }

    public static C331127Pr A0A(Activity activity, 0lg r5, C331147Pt r6, C331147Pt r7, C273494mf r8, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        C331127Pr A0W = DbS.A0W(r5);
        if (!TextUtils.isEmpty(str)) {
            A0W.A0d = str;
        }
        if (r6 != null) {
            A0W.A0Q = r6;
        }
        if (r7 != null) {
            A0W.A0R = r7;
        }
        if (str2 != null) {
            A0W.A0f = str2;
        }
        float max = Math.max(Math.min(((float) i) / 100.0f, 1.0f), 0.0f);
        if (i2 == 16 && 0nA.A0x(activity)) {
            A0W.A0Z = true;
        }
        DbS.A1S(A0W, z);
        A0W.A03 = max;
        A0W.A0T = r8;
        A0W.A0x = true;
        A0W.A0y = !z2;
        A0W.A0k = !z3;
        A0W.A12 = z4;
        return A0W;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C331147Pt A0B(android.content.Context r4, android.view.View.OnClickListener r5, X.C307896Rx r6, X.C277014uI r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x000e
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            X.7Ps r2 = new X.7Ps
            r2.<init>()
            r2.A0A = r11
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x004b
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "none"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x004b
        L_0x0029:
            r2.A06 = r8
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0037
        L_0x0031:
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r2.A07 = r10
        L_0x0037:
            if (r5 != 0) goto L_0x0044
            if (r6 == 0) goto L_0x0046
            if (r7 == 0) goto L_0x0046
            r0 = 11
            X.FPE r5 = new X.FPE
            r5.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r7)
        L_0x0044:
            r2.A05 = r5
        L_0x0046:
            X.7Pt r0 = r2.A00()
            return r0
        L_0x004b:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0037
            java.lang.Integer r3 = X.C46616Dhw.A03(r9)
            if (r3 == 0) goto L_0x007d
            int r0 = X.Tt3.A01(r3)
            r2.A02 = r0
            android.content.res.Resources r1 = r4.getResources()
            int r0 = X.Tt3.A00(r3)
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A07 = r1
        L_0x006f:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = "BloksBottomSheetHelper"
            java.lang.String r0 = "Trailing header icon buttons must have an accessibility label"
            X.1Kn.A02(r1, r0)
            goto L_0x0037
        L_0x007d:
            X.GOf r1 = X.C52337GOf.OUTLINE
            X.GOg r0 = X.GOg.SIZE_24
            android.graphics.drawable.Drawable r0 = X.C14091Tpi.A01(r4, r0, r1, r9)
            r2.A04 = r0
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH9.A0B(android.content.Context, android.view.View$OnClickListener, X.6Rx, X.4uI, java.lang.String, java.lang.String, java.lang.String, boolean):X.7Pt");
    }

    public static void A0E(C307786Rm r5, Runnable runnable) {
        AnonymousClass37D A02;
        C331157Pu A06 = A06(r5);
        Context context = r5.A00;
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        AnonymousClass37D A022 = r0.A02(context);
        if (A06 == null && A022 == null) {
            1Kn.A02("BloksBottomSheetHelper", "Can't dismiss bottom sheet outside of controller");
            return;
        }
        if (!(runnable == null || (A02 = r0.A02(context)) == null)) {
            A02.A0Q(new C65754Lz8(runnable, 0));
        }
        if (A06 != null) {
            A06.A0L((C332277Ui) null);
        } else if (A022 != null) {
            A022.A0B();
        }
    }
}
