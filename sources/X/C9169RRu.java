package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.RRu  reason: case insensitive filesystem */
public abstract class C9169RRu {
    public static String A00(AnonymousClass5L9 r5) {
        String str;
        int A03 = r5.A03();
        StringBuilder A14 = Pxe.A14(A03);
        for (int i = 0; i < A03; i++) {
            int A01 = r5.A01(i);
            if (A01 != 34) {
                if (A01 == 39) {
                    str = "\\'";
                } else if (A01 != 92) {
                    switch (A01) {
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
                            if (A01 < 32 || A01 > 126) {
                                Pxk.A0b(A14, A01);
                                A01 = (A01 & 7) + 48;
                            }
                            A14.append((char) A01);
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
