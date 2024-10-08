package X;

import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import java.util.List;

public final class PIO implements AnonymousClass9HR {
    public final C254923tH A00;
    public final MsysThreadSubtype A01;
    public final List A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PIO(C254923tH r2, List list) {
        this(r2, MsysThreadSubtype.Standard.A00, list);
        0qQ.A0B(list, 1);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PIO)) {
            return false;
        }
        PIO pio = (PIO) obj;
        if (this.A00 != pio.A00) {
            return false;
        }
        List list = this.A02;
        List list2 = pio.A02;
        return list.containsAll(list2) && list2.containsAll(list);
    }

    public final C254923tH C9i() {
        return this.A00;
    }

    public final int hashCode() {
        int i = 0;
        for (Object hashCode : this.A02) {
            i ^= hashCode.hashCode();
        }
        return AnonymousClass7TE.A0N(this.A00, i * 31);
    }

    public PIO(C254923tH r2, MsysThreadSubtype msysThreadSubtype, List list) {
        0qQ.A0B(list, 1);
        this.A02 = list;
        this.A01 = msysThreadSubtype;
        this.A00 = r2;
    }
}
