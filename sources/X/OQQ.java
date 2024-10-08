package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

public abstract class OQQ {
    public static C270214gN parseFromJson(16F r35) {
        String str;
        String str2;
        16F r8 = r35;
        0qQ.A0B(r8, 0);
        try {
            Boolean bool = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            C69414Nku nku = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Boolean bool6 = null;
            C254403sQ r0 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("failure_domain".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    0qQ.A0B(str2, 0);
                    nku = (C69414Nku) C69414Nku.A02.get(str2);
                    if (nku == null) {
                        nku = C69414Nku.A0G;
                    }
                } else if (TraceFieldType.ErrorCode.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("server_error_code".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if ("send_attempt_channel".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                } else if ("should_allow_automatic_retry".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("should_allow_manual_retry".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r8);
                } else if (C41845B3m.A1E(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r8.A1P();
                    }
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r8.A1P();
                    }
                } else if ("client_facing_error_message".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r8.A1P();
                    }
                } else if ("is_epd_error".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r8);
                } else if ("biz_thread_throttled_state".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    r0 = (C254403sQ) C254403sQ.A01.get(str);
                    if (r0 == null) {
                        r0 = C254403sQ.UNKNOWN;
                    }
                } else if ("can_see_notes".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r8);
                } else if ("can_see_broadcast_chats".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r8);
                } else {
                    bool6 = C41847B3o.A0z(r8, bool6, A17, "should_automatic_retry_immediately");
                }
                r8.A0z();
            }
            if (nku == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("failure_domain", r8, "SendError");
            } else if (str3 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(TraceFieldType.ErrorCode, r8, "SendError");
            } else if (str5 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("send_attempt_channel", r8, "SendError");
            } else if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("should_allow_automatic_retry", r8, "SendError");
            } else if (bool2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("should_allow_manual_retry", r8, "SendError");
            } else if (bool3 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_epd_error", r8, "SendError");
            } else if (bool4 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_see_notes", r8, "SendError");
            } else if (bool5 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_see_broadcast_chats", r8, "SendError");
            } else if (bool6 != null || !(r8 instanceof 0c9)) {
                return new C270214gN(r0, nku, str3, str4, str5, str6, str7, str8, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue());
            } else {
                AnonymousClass7TF.A1L("should_automatic_retry_immediately", r8, "SendError");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C270214gN r3) {
        r2.A0c();
        C69414Nku nku = r3.A01;
        if (nku != null) {
            r2.A0R("failure_domain", nku.A01);
        }
        String str = r3.A03;
        if (str != null) {
            r2.A0R(TraceFieldType.ErrorCode, str);
        }
        String str2 = r3.A06;
        if (str2 != null) {
            r2.A0R("server_error_code", str2);
        }
        String str3 = r3.A05;
        if (str3 != null) {
            r2.A0R("send_attempt_channel", str3);
        }
        r2.A0S("should_allow_automatic_retry", r3.A0B);
        r2.A0S("should_allow_manual_retry", r3.A0C);
        String str4 = r3.A07;
        if (str4 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str4);
        }
        String str5 = r3.A04;
        if (str5 != null) {
            r2.A0R(DialogModule.KEY_MESSAGE, str5);
        }
        String str6 = r3.A02;
        if (str6 != null) {
            r2.A0R("client_facing_error_message", str6);
        }
        r2.A0S("is_epd_error", r3.A0A);
        C254403sQ r0 = r3.A00;
        if (r0 != null) {
            r2.A0R("biz_thread_throttled_state", r0.A00);
        }
        r2.A0S("can_see_notes", r3.A09);
        r2.A0S("can_see_broadcast_chats", r3.A08);
        r2.A0S("should_automatic_retry_immediately", r3.A0D);
        r2.A0Z();
    }
}
