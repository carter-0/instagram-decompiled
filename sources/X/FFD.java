package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;

public abstract class FFD {
    public static void A00(AnonymousClass0Ac r2, 0bb r3, FZ1 fz1) {
        r3.A06(C46476Dff.A00(), fz1.A01);
        r3.A01(r2, "event_step");
        r3.A01(C67612Mqk.CHALLENGE, "event_source");
    }

    public static void A01(0Aj r1, 0bb r2, 0bb r3, String str, String str2) {
        r2.A06("render_type", str);
        r2.A06("step", str2);
        r1.AAK(r3, "core");
        r1.AAK(r2, PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE);
    }

    public static void A02(C21123XFn xFn, 0lg r6, Integer num, String str, String str2) {
        0wc r1;
        String str3;
        String A02;
        FZ1 A00 = F5E.A00(r6);
        if (A00.A01 != null && (r1 = A00.A00) != null) {
            0Aj A0e = AnonymousClass7TE.A0e(r1, "challenge_start_flow");
            if (A0e.isSampled()) {
                0bb r3 = new 0bb();
                A00(xFn, r3, A00);
                long j = 0;
                try {
                    if ((r6 instanceof UserSession) && (A02 = 0Gl.A02(r6)) != null) {
                        j = Long.parseLong(A02);
                    }
                } catch (NumberFormatException unused) {
                }
                r3.A05("target_user_id", Long.valueOf(j));
                0bb r12 = new 0bb();
                r12.A06("challenge_type", str);
                switch (num.intValue()) {
                    case 1:
                        str3 = "native";
                        break;
                    case 2:
                        str3 = "react_native";
                        break;
                    default:
                        str3 = "bloks";
                        break;
                }
                A01(A0e, r12, r3, str3, str2);
                A0e.Cgf();
            }
        }
    }

    public static void A03(0lg r6, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Integer num;
        0Aj r2;
        0wc r1;
        String A02;
        0wc r12;
        String A022;
        0wc r13;
        String A023;
        String str8;
        for (XRA xra : XRA.values()) {
            if (0qQ.A0K(xra.A01, str4)) {
                C21123XFn xFn = xra.A00;
                if (xFn != null) {
                    Integer[] A00 = AnonymousClass05K.A00(10);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str8 = "ig_challenge_dismiss";
                                    break;
                                case 2:
                                    str8 = "ig_challenge_primary_button";
                                    break;
                                case 3:
                                    str8 = "ig_challenge_secondary_button";
                                    break;
                                case 4:
                                    str8 = "ig_challenge_url";
                                    break;
                                case 5:
                                    str8 = "ig_challenge_resend";
                                    break;
                                case 6:
                                    str8 = "ig_challenge_navigation";
                                    break;
                                case 7:
                                    str8 = "ig_challenge_button";
                                    break;
                                case 8:
                                    str8 = "ig_challenge_end_flow";
                                    break;
                                case 9:
                                    str8 = NetInfoModule.CONNECTION_TYPE_NONE;
                                    break;
                                default:
                                    str8 = "ig_challenge_start_flow";
                                    break;
                            }
                            if (!str8.equals(str)) {
                                i++;
                            }
                        } else {
                            num = AnonymousClass05K.A1I;
                        }
                    }
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue == 8) {
                            FZ1 A002 = F5E.A00(r6);
                            if (A002.A01 != null && (r1 = A002.A00) != null) {
                                r2 = AnonymousClass7TE.A0e(r1, "challenge_end_flow");
                                if (r2.isSampled()) {
                                    0bb r5 = new 0bb();
                                    A00(xFn, r5, A002);
                                    long j = 0;
                                    try {
                                        if ((r6 instanceof UserSession) && (A02 = 0Gl.A02(r6)) != null) {
                                            j = Long.parseLong(A02);
                                        }
                                    } catch (NumberFormatException unused) {
                                    }
                                    r5.A05("target_user_id", Long.valueOf(j));
                                    0bb r14 = new 0bb();
                                    r14.A06("challenge_type", str2);
                                    A01(r2, r14, r5, "bloks", str3);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (intValue == 6) {
                            FZ1 A003 = F5E.A00(r6);
                            if (A003.A01 != null && (r12 = A003.A00) != null) {
                                r2 = AnonymousClass7TE.A0e(r12, "challenge_navigation");
                                if (r2.isSampled()) {
                                    0bb r3 = new 0bb();
                                    A00(xFn, r3, A003);
                                    long j2 = 0;
                                    try {
                                        if ((r6 instanceof UserSession) && (A022 = 0Gl.A02(r6)) != null) {
                                            j2 = Long.parseLong(A022);
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                    r3.A05("target_user_id", Long.valueOf(j2));
                                    0bb r15 = new 0bb();
                                    r15.A06("challenge_type", str2);
                                    A01(r2, r15, r3, "bloks", str3);
                                    DbS.A1J(r2, str5);
                                    r2.AAJ("reason", str6);
                                    r2.AAJ("additional_user_input", str7);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (intValue == 7) {
                            FZ1 A004 = F5E.A00(r6);
                            if (A004.A01 != null && (r13 = A004.A00) != null) {
                                r2 = AnonymousClass7TE.A0e(r13, C66579MXk.A00(697));
                                if (r2.isSampled()) {
                                    0bb r32 = new 0bb();
                                    A00(xFn, r32, A004);
                                    long j3 = 0;
                                    try {
                                        if ((r6 instanceof UserSession) && (A023 = 0Gl.A02(r6)) != null) {
                                            j3 = Long.parseLong(A023);
                                        }
                                    } catch (NumberFormatException unused3) {
                                    }
                                    r32.A05("target_user_id", Long.valueOf(j3));
                                    0bb r16 = new 0bb();
                                    r16.A06("challenge_type", str2);
                                    A01(r2, r16, r32, "bloks", str3);
                                    DbS.A1J(r2, str5);
                                    r2.AAJ("reason", str6);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                        r2.Cgf();
                        return;
                    }
                    A02(xFn, r6, AnonymousClass05K.A0N, str2, str3);
                    return;
                }
                return;
            }
        }
    }
}
