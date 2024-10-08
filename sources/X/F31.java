package X;

import com.instagram.model.direct.DirectShareTarget;

public final class F31 {
    public final DirectShareTarget A00;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls2, cls)) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.audiencepicker.DirectShareTargetSourcePair");
        return 0qQ.A0K(this.A00, ((F31) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public F31(DirectShareTarget directShareTarget) {
        this.A00 = directShareTarget;
    }
}
