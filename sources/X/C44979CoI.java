package X;

import com.instagram.reels.memories.model.MemoryItem;
import java.io.IOException;

/* renamed from: X.CoI  reason: case insensitive filesystem */
public abstract class C44979CoI {
    public static MemoryItem parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            MemoryItem memoryItem = new MemoryItem();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("item_type".equals(A17)) {
                    String A1Q = r3.A1Q();
                    C62558Kho kho = (C62558Kho) C62558Kho.A01.get(A1Q);
                    if (kho != null) {
                        memoryItem.A00 = kho;
                    } else {
                        throw AnonymousClass7TE.A1B(002.A0R(AnonymousClass000.A00(2522), A1Q));
                    }
                } else if ("item_payload".equals(A17)) {
                    memoryItem.A01 = D2C.parseFromJson(r3);
                }
                r3.A0z();
            }
            return memoryItem;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
