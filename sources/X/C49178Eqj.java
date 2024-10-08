package X;

/* renamed from: X.Eqj  reason: case insensitive filesystem */
public abstract class C49178Eqj {
    public static final Integer A00(String str) {
        String str2;
        if (str != null) {
            for (Integer num : AnonymousClass05K.A00(8)) {
                switch (num.intValue()) {
                    case 1:
                        str2 = C273654mx.A00(3168);
                        break;
                    case 2:
                        str2 = "edit_profile";
                        break;
                    case 3:
                        str2 = "personal_information";
                        break;
                    case 4:
                        str2 = "profile_qp";
                        break;
                    case 5:
                        str2 = "nux";
                        break;
                    case 6:
                        str2 = C273654mx.A00(2995);
                        break;
                    case 7:
                        str2 = "2fa_sms";
                        break;
                    default:
                        str2 = C273654mx.A00(679);
                        break;
                }
                if (str.equalsIgnoreCase(str2)) {
                    return num;
                }
            }
        }
        return null;
    }
}
