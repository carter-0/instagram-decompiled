package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vis  reason: case insensitive filesystem */
public final class C17959Vis {
    public List A00 = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C17959Vis) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
