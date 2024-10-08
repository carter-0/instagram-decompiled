package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.io.IOException;

public abstract class OQT {
    public static 1fi parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1fi r0 = new 1fi();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("direct_pending_media".equals(A17)) {
                    r0.A04 = LJH.parseFromJson(r3);
                } else if ("mutation_queue_override".equals(A17)) {
                    C69343Nji nji = (C69343Nji) C51968G9o.A10(C69343Nji.A01, r3.A1D());
                    if (nji == null) {
                        nji = C69343Nji.DEFAULT;
                    }
                    r0.A03 = nji;
                } else if ("private_reply_info".equals(A17)) {
                    r0.A02 = OQU.parseFromJson(r3);
                } else if ("is_x_transport_forward".equals(A17)) {
                    r0.A06 = AnonymousClass7TF.A0S(r3);
                } else if ("existing_album_identifier".equals(A17)) {
                    r0.A05 = O1B.parseFromJson(r3);
                } else if ("replied_to_message".equals(A17)) {
                    r0.A01 = C254933tI.A00(r3);
                } else if ("should_skip_genai_eval".equals(A17)) {
                    r0.A08 = r3.A0d();
                } else if ("genai_params".equals(A17)) {
                    r0.A00 = C254813t5.parseFromJson(r3);
                } else {
                    C66893Meb.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, 1fi r4) {
        r3.A0c();
        if (r4.A04 != null) {
            r3.A0q("direct_pending_media");
            LJH.A00(r3, r4.A04);
        }
        C69343Nji nji = r4.A03;
        if (nji != null) {
            r3.A0P("mutation_queue_override", nji.A00);
        }
        if (r4.A02 != null) {
            r3.A0q("private_reply_info");
            OQU.A00(r3, r4.A02);
        }
        Boolean bool = r4.A06;
        if (bool != null) {
            r3.A0S("is_x_transport_forward", bool.booleanValue());
        }
        if (r4.A05 != null) {
            r3.A0q("existing_album_identifier");
            MessageIdentifier messageIdentifier = r4.A05;
            r3.A0c();
            r3.A0R("non_null_identifier", messageIdentifier.A01);
            String A00 = messageIdentifier.A00();
            if (A00 != null) {
                r3.A0R("message_client_context", A00);
            }
            r3.A0Z();
        }
        if (r4.A01 != null) {
            r3.A0q("replied_to_message");
            C292605jE.A01(r3, r4.A01);
        }
        r3.A0S("should_skip_genai_eval", r4.A08);
        if (r4.A00 != null) {
            r3.A0q("genai_params");
            C254813t5.A00(r4.A00, r3);
        }
        C66893Meb.A00(r3, r4);
        r3.A0Z();
    }
}
