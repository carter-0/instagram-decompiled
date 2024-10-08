package X;

import java.util.Arrays;

public final class HES extends C57086IOa {
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof HES)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), false, 3, false});
    }

    public HES(C53504Gpa gpa) {
        super(gpa);
    }

    public HES() {
        super((C53504Gpa) null);
    }
}
