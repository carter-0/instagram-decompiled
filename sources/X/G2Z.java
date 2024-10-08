package X;

import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

public final class G2Z extends 0Yg implements C62320sa {
    public static final G2Z A00 = new G2Z();

    public G2Z() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        EnumEntries enumEntries = EW1.A02;
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(enumEntries, 10)));
        for (Object next : enumEntries) {
            A0x.put(((EW1) next).A00, next);
        }
        return A0x;
    }
}
