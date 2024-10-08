package X;

import com.instagram.direct.model.DirectForwardingParams;
import java.io.IOException;

/* renamed from: X.F5e  reason: case insensitive filesystem */
public abstract class C49753F5e {
    public static DirectForwardingParams parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            DirectForwardingParams directForwardingParams = new DirectForwardingParams();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("forwarded_thread_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    directForwardingParams.A07 = A0l;
                } else if ("forwarded_message_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    directForwardingParams.A06 = A0l2;
                } else if ("is_from_msys_thread".equals(A17)) {
                    directForwardingParams.A0A = r4.A0d();
                } else if (C273654mx.A00(290).equals(A17)) {
                    directForwardingParams.A01 = AnonymousClass7TF.A0X(r4);
                } else if ("forward_warning_icon".equals(A17)) {
                    directForwardingParams.A02 = AnonymousClass7TF.A0X(r4);
                } else if ("forward_warning_text".equals(A17)) {
                    directForwardingParams.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("is_from_pre_cutover".equals(A17)) {
                    directForwardingParams.A0B = r4.A0d();
                } else if ("forwarded_message_client_context".equals(A17)) {
                    directForwardingParams.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("forwarded_thread_id_v2".equals(A17)) {
                    directForwardingParams.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("forwarded_thread_subtype".equals(A17)) {
                    directForwardingParams.A03 = AnonymousClass7TF.A0X(r4);
                } else if ("forwarded_thread_audience_type".equals(A17)) {
                    directForwardingParams.A00 = AnonymousClass7TF.A0X(r4);
                } else if ("forwarded_thread_user_type".equals(A17)) {
                    directForwardingParams.A09 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return directForwardingParams;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, DirectForwardingParams directForwardingParams) {
        r2.A0c();
        String str = directForwardingParams.A07;
        if (str != null) {
            r2.A0R("forwarded_thread_id", str);
        }
        String str2 = directForwardingParams.A06;
        if (str2 != null) {
            r2.A0R("forwarded_message_id", str2);
        }
        r2.A0S("is_from_msys_thread", directForwardingParams.A0A);
        Integer num = directForwardingParams.A01;
        if (num != null) {
            r2.A0P(C273654mx.A00(290), num.intValue());
        }
        Integer num2 = directForwardingParams.A02;
        if (num2 != null) {
            r2.A0P("forward_warning_icon", num2.intValue());
        }
        String str3 = directForwardingParams.A04;
        if (str3 != null) {
            r2.A0R("forward_warning_text", str3);
        }
        r2.A0S("is_from_pre_cutover", directForwardingParams.A0B);
        String str4 = directForwardingParams.A05;
        if (str4 != null) {
            r2.A0R("forwarded_message_client_context", str4);
        }
        String str5 = directForwardingParams.A08;
        if (str5 != null) {
            r2.A0R("forwarded_thread_id_v2", str5);
        }
        Integer num3 = directForwardingParams.A03;
        if (num3 != null) {
            r2.A0P("forwarded_thread_subtype", num3.intValue());
        }
        Integer num4 = directForwardingParams.A00;
        if (num4 != null) {
            r2.A0P("forwarded_thread_audience_type", num4.intValue());
        }
        String str6 = directForwardingParams.A09;
        if (str6 != null) {
            r2.A0R("forwarded_thread_user_type", str6);
        }
        r2.A0Z();
    }
}
