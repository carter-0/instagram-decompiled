package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.XoI  reason: case insensitive filesystem */
public final class C21973XoI {
    public static final C21973XoI A01 = new C21973XoI(ImmutableList.of());
    public final ImmutableList A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C21973XoI) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C21973XoI(List list) {
        this.A00 = ImmutableList.copyOf((Collection) list);
    }
}
