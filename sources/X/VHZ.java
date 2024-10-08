package X;

import com.instagram.common.textwithentities.model.TextWithEntities;
import java.io.IOException;

public abstract class VHZ {
    public static C15035UKo parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C15035UKo uKo = new C15035UKo();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("item".equals(A17)) {
                    uKo.A00 = C17079VHb.parseFromJson(r5);
                } else {
                    String str = null;
                    if ("item_type".equals(A17)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        C16562UxE uxE = (C16562UxE) C16562UxE.A01.get(str);
                        if (uxE == null) {
                            uxE = C16562UxE.UNKNOWN;
                        }
                        uKo.A07 = uxE;
                    } else if ("behavior".equals(A17)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        C16573UxQ uxQ = (C16573UxQ) C16573UxQ.A01.get(str);
                        if (uxQ == null) {
                            uxQ = C16573UxQ.UNKNOWN;
                        }
                        uKo.A06 = uxQ;
                    } else if ("behavior_meta".equals(A17)) {
                        uKo.A02 = C45088Cq6.parseFromJson(r5);
                    } else if ("image_thumbnail_meta".equals(A17)) {
                        C61083JwL parseFromJson = C17078VHa.parseFromJson(r5);
                        0qQ.A0B(parseFromJson, 0);
                        uKo.A01 = parseFromJson;
                    } else if (AnonymousClass000.A00(3778).equals(A17)) {
                        TextWithEntities parseFromJson2 = Ci4.parseFromJson(r5);
                        0qQ.A0B(parseFromJson2, 0);
                        uKo.A03 = parseFromJson2;
                    } else if ("secondary_text".equals(A17)) {
                        uKo.A04 = Ci4.parseFromJson(r5);
                    } else if ("tertiary_text".equals(A17)) {
                        uKo.A05 = Ci4.parseFromJson(r5);
                    } else if ("show_caret".equals(A17)) {
                        uKo.A09 = r5.A0d();
                    } else if ("has_variants".equals(A17)) {
                        uKo.A08 = r5.A0d();
                    }
                }
                r5.A0z();
            }
            return uKo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
