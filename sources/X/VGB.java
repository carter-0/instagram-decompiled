package X;

import com.instagram.save.model.CollaborativeCollectionMetadata;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VGB {
    public static CollaborativeCollectionMetadata parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CollaborativeCollectionMetadata collaborativeCollectionMetadata = new CollaborativeCollectionMetadata();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if (C273654mx.A00(280).equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    collaborativeCollectionMetadata.A02 = arrayList;
                } else if ("social_context_subtitle".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    collaborativeCollectionMetadata.A01 = A0l;
                } else if ("ig_thread_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    collaborativeCollectionMetadata.A00 = A0l2;
                }
                r5.A0z();
            }
            return collaborativeCollectionMetadata;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
