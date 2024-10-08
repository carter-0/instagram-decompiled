package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PUI implements Iterable, C62650uo {
    public C69340Njf A00;
    public String A01 = "";
    public String A02 = "";
    public List A03 = AnonymousClass7TE.A1C();
    public List A04 = 0sn.A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            PUI pui = (PUI) obj;
            if (!0qQ.A0K(this.A01, pui.A01) || !0qQ.A0K(this.A02, pui.A02) || !0qQ.A0K(this.A03, pui.A03) || this.A00 != pui.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A03, this.A00});
    }

    public final Iterator iterator() {
        return this.A03.iterator();
    }
}
