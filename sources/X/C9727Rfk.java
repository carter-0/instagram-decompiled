package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Rfk  reason: case insensitive filesystem */
public abstract class C9727Rfk {
    public static String A00(TAQ taq) {
        String str;
        int A05 = taq.A05();
        StringBuilder A14 = Pxe.A14(A05);
        for (int i = 0; i < A05; i++) {
            int A02 = taq.A02(i);
            if (A02 != 34) {
                if (A02 == 39) {
                    str = "\\'";
                } else if (A02 != 92) {
                    switch (A02) {
                        case 7:
                            str = "\\a";
                            break;
                        case 8:
                            str = "\\b";
                            break;
                        case 9:
                            str = "\\t";
                            break;
                        case 10:
                            str = "\\n";
                            break;
                        case 11:
                            str = "\\v";
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            str = "\\f";
                            break;
                        case 13:
                            str = "\\r";
                            break;
                        default:
                            if (A02 < 32 || A02 > 126) {
                                Pxk.A0b(A14, A02);
                                A02 = (A02 & 7) + 48;
                            }
                            A14.append((char) A02);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                A14.append(str);
            } else {
                str = "\\\"";
                A14.append(str);
            }
        }
        return A14.toString();
    }
}
