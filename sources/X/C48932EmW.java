package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.IOException;

/* renamed from: X.EmW  reason: case insensitive filesystem */
public abstract class C48932EmW {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.EwL] */
    public static C49480EwL parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("style".equals(A17)) {
                    String A1Q = r8.A1Q();
                    Integer[] A00 = AnonymousClass05K.A00(7);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "paragraph";
                                    break;
                                case 2:
                                    str = "bold_paragraph";
                                    break;
                                case 3:
                                    str = "bulletpoint";
                                    break;
                                case 4:
                                    str = "bulletpoint_checkmark";
                                    break;
                                case 5:
                                    str = "bulletpoint_cross";
                                    break;
                                case 6:
                                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                                    break;
                                default:
                                    str = "subheading";
                                    break;
                            }
                            if (!str.equals(A1Q)) {
                                i++;
                            }
                        } else {
                            num = AnonymousClass05K.A0u;
                        }
                    }
                }
                r8.A0z();
            }
            ? obj = new Object();
            if (str2 != null) {
                obj.A01 = str2;
            }
            if (num != null) {
                obj.A00 = num;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
