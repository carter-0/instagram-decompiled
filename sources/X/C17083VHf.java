package X;

import java.io.IOException;

/* renamed from: X.VHf  reason: case insensitive filesystem */
public abstract class C17083VHf {
    public static C15055ULy parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C15055ULy uLy = new C15055ULy();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("title_meta".equals(A17)) {
                    uLy.A08 = C17087VHj.parseFromJson(r3);
                } else if ("divider_meta".equals(A17)) {
                    uLy.A02 = C17081VHd.parseFromJson(r3);
                } else if ("commerce_item_meta".equals(A17)) {
                    uLy.A01 = VHZ.parseFromJson(r3);
                } else if ("keyword_search_meta".equals(A17)) {
                    uLy.A04 = Kx5.parseFromJson(r3);
                } else if ("expansion_meta".equals(A17)) {
                    uLy.A03 = Kx4.parseFromJson(r3);
                } else if ("bloks_meta".equals(A17)) {
                    uLy.A00 = Kx3.parseFromJson(r3);
                } else if ("text_with_entities_block_meta".equals(A17)) {
                    uLy.A07 = C17085VHh.parseFromJson(r3);
                } else if ("null_state_shops_meta".equals(A17)) {
                    uLy.A05 = C17082VHe.parseFromJson(r3);
                }
                r3.A0z();
            }
            return uLy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
