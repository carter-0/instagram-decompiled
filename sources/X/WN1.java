package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

public final class WN1 implements X8K {
    public final 0xI A00;
    public final String A01;
    public final String A02;

    public final String getStringForKey(String str) {
        String obj;
        int i;
        0qQ.A0B(str, 0);
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
            String str2 = this.A00.A04;
            0qQ.A0A(str2);
            return str2;
        }
        if (str.equals("module")) {
            obj = this.A00.A03;
        } else {
            0qQ.A0B("@JOIN", 1);
            if (str.startsWith("@JOIN")) {
                int length = str.length();
                int i2 = 0;
                while (true) {
                    i = -1;
                    if (i2 < length) {
                        if (str.charAt(i2) == '(') {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                int i3 = length - 1;
                if (i3 >= 0) {
                    while (true) {
                        int i4 = i3 - 1;
                        if (str.charAt(i3) != ')') {
                            if (i4 < 0) {
                                break;
                            }
                            i3 = i4;
                        } else {
                            i = i3;
                            break;
                        }
                    }
                }
                if (i2 <= 0 || i <= 0) {
                    return "";
                }
                List A0Q = 00l.A0Q(C51967G9n.A0q(str, i2 + 1, i), new char[]{','}, 0);
                if (A0Q.size() != 3) {
                    return "";
                }
                String str3 = (String) A0Q.get(0);
                String str4 = (String) A0Q.get(1);
                String str5 = (String) A0Q.get(2);
                0qQ.A0B(str3, 1);
                0qQ.A0B(str4, 2);
                0qQ.A0B(str5, 3);
                return 002.A0g(getStringForKey(str3), str5, getStringForKey(str4));
            }
            Object A022 = this.A00.A06.A00.A02(str);
            if (A022 == null) {
                return "";
            }
            obj = A022.toString();
        }
        if (obj != null) {
            return obj;
        }
        return "";
    }

    public final String BwS() {
        return this.A02;
    }

    public final long C7M() {
        return this.A00.A00;
    }

    public final String getDisplayName() {
        return this.A01;
    }

    public WN1(0xI r2, String str) {
        this.A00 = r2;
        this.A02 = str;
        String str2 = r2.A04;
        0qQ.A07(str2);
        this.A01 = str2;
    }
}
