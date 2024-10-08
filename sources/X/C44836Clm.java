package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Clm  reason: case insensitive filesystem */
public abstract class C44836Clm {
    public static JVH parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            GSY gsy = null;
            ArrayList arrayList = null;
            C61214Jz7 jz7 = null;
            String str = null;
            BBF bbf = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("context_page".equals(A17)) {
                    gsy = C44833Clj.parseFromJson(r8);
                } else if ("info_fields_data".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C68181N3w parseFromJson = VEN.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("legal_content".equals(A17)) {
                    jz7 = C44837Cln.parseFromJson(r8);
                } else if ("policy_url".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("thank_you_page".equals(A17)) {
                    bbf = C44841Clr.parseFromJson(r8);
                }
                r8.A0z();
            }
            return new JVH(gsy, arrayList, jz7, bbf, str, 5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
