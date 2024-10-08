package X;

import com.instagram.model.showreel.IgShowreelComposition;
import java.util.UUID;

/* renamed from: X.6NO  reason: invalid class name */
public abstract class AnonymousClass6NO {
    public static final AnonymousClass6Q8 A00(AnonymousClass6LO r4, IgShowreelComposition igShowreelComposition) {
        String F01 = ((C306796Nn) r4).A04.F01();
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        String Anf = igShowreelComposition.Anf();
        String C4b = igShowreelComposition.C4b();
        if (F01 == null) {
            F01 = "";
        }
        return new AnonymousClass6Q8(obj, Anf, C4b, F01, igShowreelComposition.AqT().length());
    }
}
