package X;

import com.facebook.dsp.core.ColorData;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;
import kotlin.enums.EnumEntries;

/* renamed from: X.Di8  reason: case insensitive filesystem */
public final class C46628Di8 {
    public static final C46628Di8 A00 = new Object();

    public static final ColorData A01(C276544tV r3) {
        if (r3 == null) {
            return null;
        }
        String A0F = r3.A0F();
        int i = 16777215;
        if (A0F != null) {
            i = AnonymousClass6Su.A03(A0F);
        }
        String A0D = r3.A0D();
        int i2 = 16777215;
        if (A0D != null) {
            i2 = AnonymousClass6Su.A03(A0D);
        }
        return new ColorData(i, i2);
    }

    public static final ColorData A02(C276544tV r3) {
        if (r3 == null) {
            return null;
        }
        String A0F = r3.A0F();
        int i = -1728053248;
        if (A0F != null) {
            i = AnonymousClass6Su.A03(A0F);
        }
        String A0D = r3.A0D();
        int i2 = -1728053248;
        if (A0D != null) {
            i2 = AnonymousClass6Su.A03(A0D);
        }
        return new ColorData(i, i2);
    }

    public static CdsOpenScreenConfig$BottomSheetMargins A03(C276544tV r3, int i) {
        C276544tV A07 = r3.A07(i);
        if (A07 == null) {
            return null;
        }
        return new CdsOpenScreenConfig$BottomSheetMargins(A00(A07, 36), A00(A07, 40), A00(A07, 38), A00(A07, 35));
    }

    public static final C46471DfZ A04() {
        C46626Di6 di6 = C46471DfZ.A0T;
        0qQ.A0B(di6, 1);
        Integer num = AnonymousClass05K.A0C;
        C46627Di7 di7 = C46471DfZ.A0S;
        EX7 ex7 = C46471DfZ.A0O;
        EX6 ex6 = C46471DfZ.A0R;
        EX5 ex5 = C46471DfZ.A0Q;
        if (VJ0.A00()) {
            ex5 = EX5.TOP_ROUNDED;
        }
        return new C46471DfZ((VQZ) null, (ColorData) null, (ColorData) null, CdsBottomSheetDimmingBehaviour.Default.A00, (CdsBottomSheetTopSpan) null, ex7, (CdsOpenScreenConfig$BottomSheetMargins) null, ex5, ex6, di7, di6, (CdsOpenScreenDismissCallback) null, num, (Integer) null, (Integer) null, (Integer) null, (String) null, 16542, false, false, false, false, false, false);
    }

    public static final C46471DfZ A05(C307786Rm r29, C276544tV r30) {
        EX7 ex7;
        EX6 ex6;
        Integer num;
        Integer num2;
        C46627Di7 di7;
        C46626Di6 di6;
        EX7 ex72;
        C276544tV r0 = r30;
        if (r30 != null) {
            int i = r0.A04;
            C307786Rm r1 = r29;
            if (i == 14059) {
                boolean A0R = r0.A0R(36, false);
                String A11 = DbV.A11(r0, "FULL_SHEET", 40);
                try {
                    if (A11.equals("FULL_SHEET")) {
                        num = AnonymousClass05K.A00;
                    } else if (A11.equals("HALF_SHEET")) {
                        num = AnonymousClass05K.A01;
                    } else {
                        throw AnonymousClass7TE.A0w(A11);
                    }
                } catch (IllegalArgumentException e) {
                    1Kn.A03(C46471DfZ.A0U, e);
                    num = AnonymousClass05K.A00;
                }
                String A112 = DbV.A11(r0, "NEVER_ANIMATED", 46);
                try {
                    if (A112.equals("ALWAYS_ANIMATED")) {
                        num2 = AnonymousClass05K.A00;
                    } else if (A112.equals("DISABLED")) {
                        num2 = AnonymousClass05K.A01;
                    } else if (A112.equals("NEVER_ANIMATED")) {
                        num2 = AnonymousClass05K.A0C;
                    } else if (A112.equals("ONLY_ANIMATED_WHILE_LOADING")) {
                        num2 = AnonymousClass05K.A0N;
                    } else {
                        throw AnonymousClass7TE.A0w(A112);
                    }
                } catch (IllegalArgumentException e2) {
                    1Kn.A03(C46471DfZ.A0U, e2);
                    num2 = AnonymousClass05K.A0C;
                }
                C277014uI A0A = r0.A0A(42);
                if (A0R) {
                    di7 = C46627Di7.DISABLED;
                } else {
                    di7 = C46627Di7.ENABLED;
                }
                Integer num3 = AnonymousClass05K.A00;
                if (num == num3) {
                    di6 = C46626Di6.FULL_SHEET;
                } else {
                    di6 = C46626Di6.HALF_SHEET;
                }
                int intValue = num2.intValue();
                if (intValue == 0) {
                    ex72 = EX7.ANIMATED;
                } else if (intValue == 1) {
                    ex72 = EX7.DISABLED;
                } else if (intValue != 3) {
                    ex72 = EX7.STATIC;
                } else {
                    ex72 = EX7.ANIMATED_WHILE_LOADING;
                }
                CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback = new CdsOpenScreenCallerDismissCallback(new C51111Foh(r1, r0, A0A));
                C49668F1a f1a = C46471DfZ.A0P;
                Integer num4 = AnonymousClass05K.A0C;
                EX6 ex62 = EX6.AUTO;
                return new C46471DfZ((VQZ) null, (ColorData) null, (ColorData) null, CdsBottomSheetDimmingBehaviour.Default.A00, (CdsBottomSheetTopSpan) null, ex72, (CdsOpenScreenConfig$BottomSheetMargins) null, EX5.SAME_SIZE, ex62, di7, di6, cdsOpenScreenCallerDismissCallback, num4, (Integer) null, (Integer) null, num3, (String) null, 16542, false, false, false, false, false, false);
            }
            String str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            String str2 = "full_sheet";
            String str3 = "auto";
            if (i == 16085) {
                String A113 = DbV.A11(r0, str3, 36);
                EnumEntries enumEntries = C46627Di7.A02;
                C46627Di7 A002 = C46625Di5.A00(A113);
                String A0H = r0.A0H();
                if (A0H != null) {
                    str2 = A0H;
                }
                EnumEntries enumEntries2 = C46626Di6.A03;
                C46626Di6 A003 = C46624Di4.A00(str2);
                String A10 = DbV.A10(r0, "static");
                EX7[] ex7Arr = EX7.A01;
                int length = ex7Arr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        2SK.A02(C46471DfZ.A0U, 002.A0R("Error finding BackgroundMode enum value for: ", A10));
                        ex7 = EX7.STATIC;
                        break;
                    }
                    ex7 = ex7Arr[i2];
                    if (0qQ.A0K(ex7.toString(), A10)) {
                        break;
                    }
                    i2++;
                }
                String A0J = r0.A0J();
                if (A0J != null) {
                    str3 = A0J;
                }
                EX6[] ex6Arr = EX6.A01;
                int length2 = ex6Arr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        2SK.A02(C46471DfZ.A0U, 002.A0R("Error finding DimmedBackgroundTapToDismiss enum value for: ", str3));
                        ex6 = EX6.AUTO;
                        break;
                    }
                    ex6 = ex6Arr[i3];
                    if (0qQ.A0K(ex6.toString(), str3)) {
                        break;
                    }
                    i3++;
                }
                ColorData A02 = A02(r0.A07(55));
                Integer A004 = C46621Di1.A00(DbV.A11(r0, str, 45));
                0qQ.A07(A004);
                ColorData A01 = A01(r0.A07(57));
                CdsOpenScreenConfig$BottomSheetMargins A03 = A03(r0, 58);
                C277014uI A0A2 = r0.A0A(40);
                boolean A0R2 = r0.A0R(48, false);
                CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback2 = new CdsOpenScreenCallerDismissCallback(new C51111Foh(r1, r0, A0A2));
                C49668F1a f1a2 = C46471DfZ.A0P;
                Integer num5 = AnonymousClass05K.A0C;
                return new C46471DfZ((VQZ) null, A02, A01, CdsBottomSheetDimmingBehaviour.Default.A00, (CdsBottomSheetTopSpan) null, ex7, A03, EX5.SAME_SIZE, ex6, A002, A003, cdsOpenScreenCallerDismissCallback2, num5, (Integer) null, A004, AnonymousClass05K.A00, (String) null, 16542, A0R2, false, false, false, false, false);
            } else if (i == 16542) {
                String A102 = DbV.A10(r0, str2);
                EnumEntries enumEntries3 = C46626Di6.A03;
                C46626Di6 A005 = C46624Di4.A00(A102);
                String A0H2 = r0.A0H();
                if (A0H2 != null) {
                    str3 = A0H2;
                }
                EnumEntries enumEntries4 = C46627Di7.A02;
                C46627Di7 A006 = C46625Di5.A00(str3);
                String A114 = DbV.A11(r0, "adjust_pan", 40);
                int hashCode = A114.hashCode();
                int i4 = 32;
                if (hashCode != -1009740956) {
                    if (hashCode == -205076707 && A114.equals("adjust_nothing")) {
                        i4 = 48;
                    }
                } else if (A114.equals("adjust_resize")) {
                    i4 = 16;
                }
                String A0I = r0.A0I();
                if (A0I != null) {
                    str = A0I;
                }
                Integer A007 = C46621Di1.A00(str);
                0qQ.A07(A007);
                ColorData A022 = A02(r0.A07(52));
                ColorData A012 = A01(r0.A07(54));
                CdsOpenScreenConfig$BottomSheetMargins A032 = A03(r0, 55);
                C49668F1a f1a3 = C46471DfZ.A0P;
                Integer num6 = AnonymousClass05K.A0C;
                EX7 ex73 = EX7.STATIC;
                EX6 ex63 = EX6.AUTO;
                Integer valueOf = Integer.valueOf(i4);
                return new C46471DfZ((VQZ) null, A022, A012, CdsBottomSheetDimmingBehaviour.Default.A00, (CdsBottomSheetTopSpan) null, ex73, A032, EX5.SAME_SIZE, ex63, A006, A005, (CdsOpenScreenDismissCallback) null, num6, valueOf, A007, AnonymousClass05K.A00, (String) null, 16542, false, false, false, false, false, false);
            } else {
                String str4 = C46471DfZ.A0U;
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Error matching OpenCDSSCreenConfig from options styleId: ");
                1Kn.A02(str4, AnonymousClass7TF.A0i(r0.A07(132), A1A));
            }
        }
        return A04();
    }

    public static final int A00(C276544tV r5, int i) {
        String str;
        StringBuilder A1A;
        String A0K = r5.A0K(i);
        float f = 4.0f;
        if (A0K != null) {
            try {
                f = AnonymousClass6Su.A01(A0K);
            } catch (C258053yO unused) {
                if (i != 35) {
                    if (i == 36) {
                        str = "left";
                    } else if (i == 38) {
                        str = "right";
                    } else if (i != 40) {
                        A1A = AnonymousClass7TE.A1A();
                        A1A.append("Invalid BottomSheetMargin prop constant: ");
                        A1A.append(i);
                    } else {
                        str = "top";
                    }
                    A1A = AnonymousClass7TE.A1A();
                    A1A.append("Invalid format for bottom-sheet-margin prop ");
                    A1A.append(str);
                    A1A.append(" : ");
                    A1A.append(A0K);
                } else {
                    str = "bottom";
                    A1A = AnonymousClass7TE.A1A();
                    A1A.append("Invalid format for bottom-sheet-margin prop ");
                    A1A.append(str);
                    A1A.append(" : ");
                    A1A.append(A0K);
                }
                1Kn.A02("BloksCdsOpenScreenConfig", A1A.toString());
                return 0;
            }
        }
        return (int) f;
    }
}
