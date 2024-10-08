package X;

import com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount;
import java.io.IOException;
import java.util.ArrayList;

public final class F66 {
    public static DwI parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("action".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("uri".equals(A17)) {
                    r0.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("render_type".equals(A17)) {
                    r4.A1D();
                } else if ("bloks_action".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("uid".equals(A17)) {
                    r0.A07 = AnonymousClass7TG.A0l(r4);
                } else if ("nonce".equals(A17)) {
                    r0.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("cni".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("challenge_context".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("dialog_title".equals(A17)) {
                    r0.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("dialog_message".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("accounts".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AssistAccountRecoveryResponse$UhlAccount parseFromJson = C48963En1.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A09 = arrayList;
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
