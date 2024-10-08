package X;

import com.instagram.api.schemas.Achievement;
import java.util.List;

/* renamed from: X.KPy  reason: case insensitive filesystem */
public final class C61885KPy extends C62791KmT {
    public final Achievement A00;
    public final List A01;
    public final List A02;

    public C61885KPy(Achievement achievement, List list, List list2) {
        0qQ.A0B(achievement, 1);
        this.A00 = achievement;
        this.A01 = list;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61885KPy) {
                C61885KPy kPy = (C61885KPy) obj;
                if (!0qQ.A0K(this.A00, kPy.A00) || !0qQ.A0K(this.A01, kPy.A01) || !0qQ.A0K(this.A02, kPy.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
