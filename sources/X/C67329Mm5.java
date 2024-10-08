package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.Mm5  reason: case insensitive filesystem */
public abstract class C67329Mm5 {
    public static final void A01(String str) {
        0qQ.A0B(str, 0);
        0f9 AEf = 0wj.A01.AEf("FolderError", 20134884);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "CRITICAL: Received null or empty folders");
        AEf.ABQ(AnonymousClass000.A00(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), str);
        AEf.report();
    }

    public static final boolean A02(2PM r7) {
        String str;
        2Ej r0;
        0qQ.A0B(r7, 0);
        String str2 = r7.A06;
        String str3 = r7.A05;
        AnonymousClass7TF.A1H(str2, str3);
        for (Integer num : AnonymousClass05K.A00(7)) {
            switch (num.intValue()) {
                case 1:
                    str = "AD_RESPONSES";
                    break;
                case 2:
                    str = "ALL";
                    break;
                case 3:
                    str = "CUSTOM";
                    break;
                case 4:
                    str = "GENERAL";
                    break;
                case 5:
                    str = "PRIMARY";
                    break;
                case 6:
                    str = "REQUESTS";
                    break;
                default:
                    str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                    break;
            }
            if (str.equals(str2)) {
                switch (num.intValue()) {
                    case 1:
                        r0 = C69932Ea.A00;
                        break;
                    case 2:
                        r0 = AnonymousClass2EY.A00;
                        break;
                    case 3:
                        r0 = new 2Ej(str3);
                        break;
                    case 4:
                        r0 = AnonymousClass2EL.A00;
                        break;
                    case 5:
                        r0 = AnonymousClass2EU.A00;
                        break;
                    case 6:
                        r0 = AnonymousClass43I.A00;
                        break;
                    default:
                        return false;
                }
                r7.A01 = r0;
                return true;
            }
        }
        return false;
    }

    public static final String A00(2EM r2) {
        Integer num;
        if (r2.equals(AnonymousClass2EY.A00)) {
            num = AnonymousClass05K.A0C;
        } else if (r2.equals(C69932Ea.A00)) {
            num = AnonymousClass05K.A01;
        } else if (r2.equals(AnonymousClass2EL.A00)) {
            num = AnonymousClass05K.A0Y;
        } else if (r2.equals(AnonymousClass2EU.A00)) {
            num = AnonymousClass05K.A0j;
        } else if (!r2.equals(AnonymousClass43I.A00)) {
            return null;
        } else {
            num = AnonymousClass05K.A0u;
        }
        switch (num.intValue()) {
            case 1:
                return "AD_RESPONSES";
            case 2:
                return "ALL";
            case 3:
                return "CUSTOM";
            case 4:
                return "GENERAL";
            case 5:
                return "PRIMARY";
            default:
                return "REQUESTS";
        }
    }
}
