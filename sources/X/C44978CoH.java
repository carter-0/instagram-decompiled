package X;

import com.instagram.reels.memories.model.MemoryItem;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CoH  reason: case insensitive filesystem */
public abstract class C44978CoH {
    public static C45241Csw parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                if (C41846B3n.A1Z(r4, r4.A0q())) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            MemoryItem parseFromJson = C44979CoI.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            C45241Csw csw = new C45241Csw();
            if (arrayList != null) {
                csw.A00 = arrayList;
            }
            return csw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
