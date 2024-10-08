package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class D0B {
    public static C43818CEk parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("author_notif_control".equals(A17)) {
                    r0.A00 = C44587ChL.parseFromJson(r14);
                } else if ("containing_thread".equals(A17)) {
                    r0.A03 = C44597ChV.parseFromJson(r14);
                } else if ("downwards_thread_will_continue".equals(A17)) {
                    r0.A04 = AnonymousClass7TF.A0S(r14);
                } else if ("is_author_of_root_post".equals(A17)) {
                    r0.A05 = AnonymousClass7TF.A0S(r14);
                } else if ("is_subscribed_to_target_post".equals(A17)) {
                    r0.A06 = AnonymousClass7TF.A0S(r14);
                } else if ("paging_tokens".equals(A17)) {
                    r0.A01 = C44312Ccu.parseFromJson(r14);
                } else {
                    ArrayList arrayList = null;
                    if ("reply_threads".equals(A17)) {
                        if (r14.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r14.A1J() != 16L.A08) {
                                BBL parseFromJson = C44597ChV.parseFromJson(r14);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r0.A0C = arrayList;
                    } else if ("show_unavailable_replies_disclaimer".equals(A17)) {
                        r0.A07 = AnonymousClass7TF.A0S(r14);
                    } else if ("sibling_threads".equals(A17)) {
                        if (r14.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r14.A1J() != 16L.A08) {
                                BBL parseFromJson2 = C44597ChV.parseFromJson(r14);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        r0.A0D = arrayList;
                    } else if ("sibling_threads_header".equals(A17)) {
                        r0.A08 = AnonymousClass7TG.A0l(r14);
                    } else if ("target_post_id".equals(A17)) {
                        r0.A09 = AnonymousClass7TG.A0l(r14);
                    } else if ("target_post_reply_context_disclaimer".equals(A17)) {
                        r0.A0A = AnonymousClass7TG.A0l(r14);
                    } else if ("target_post_reply_placeholder".equals(A17)) {
                        r0.A0B = AnonymousClass7TG.A0l(r14);
                    } else {
                        1XY.A01(r14, r0, A17);
                    }
                }
                r14.A0z();
            }
            C61059Jvx jvx = r0.A00;
            BBL bbl = r0.A03;
            boolean A14 = C41845B3m.A14(r0.A04);
            boolean A142 = C41845B3m.A14(r0.A05);
            boolean A143 = C41845B3m.A14(r0.A06);
            N49 n49 = r0.A01;
            0qQ.A0A(n49);
            List list = r0.A0C;
            0qQ.A0A(list);
            boolean A144 = C41845B3m.A14(r0.A07);
            List list2 = r0.A0D;
            0qQ.A0A(list2);
            r0.A02 = new C53323Gm9(jvx, n49, bbl, r0.A08, r0.A09, r0.A0A, r0.A0B, list, list2, A14, A142, A143, A144);
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
