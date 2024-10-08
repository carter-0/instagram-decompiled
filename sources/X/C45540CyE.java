package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CyE  reason: case insensitive filesystem */
public final class C45540CyE {
    public static C43794CDm parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Z(r4, A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            N5C parseFromJson = CXE.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r3.A02 = arrayList;
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0q)) {
                    r3.A01 = AnonymousClass7TG.A0l(r4);
                } else {
                    1XY.A01(r4, r3, A0q);
                }
                r4.A0z();
            }
            List list = r3.A02;
            0qQ.A0A(list);
            String str = r3.A01;
            0qQ.A0A(str);
            r3.A00 = new N5D(list, str);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
