package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rdn  reason: case insensitive filesystem */
public abstract class C9609Rdn {
    public static final String A00(C10864RzP rzP) {
        String str = rzP.A0P;
        C10249Rp9 rp9 = rzP.A0J;
        if (rp9 != null) {
            MediaComposition mediaComposition = rp9.A00;
            C266714aE r4 = C266714aE.VIDEO;
            ArrayList A1C = AnonymousClass7TE.A1C();
            HashMap A07 = mediaComposition.A07(r4);
            if (A07 != null) {
                int size = A07.size();
                for (int i = 0; i < size; i++) {
                    List A08 = mediaComposition.A08(r4, i);
                    if (A08 != null) {
                        A1C.addAll(A08);
                    }
                }
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                File file = ((C266754aI) it.next()).A04;
                file.getClass();
                A1C2.add(file.getCanonicalPath());
            }
            if (DbT.A1b(A1C2)) {
                Object obj = A1C2.get(0);
                0qQ.A07(obj);
                return (String) obj;
            }
        }
        return str;
    }
}
