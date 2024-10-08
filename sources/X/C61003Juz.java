package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Juz  reason: case insensitive filesystem */
public final class C61003Juz extends AnonymousClass0T0 {
    public final List A00;
    public final boolean A01;
    public final ArrayList A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61003Juz) {
                C61003Juz juz = (C61003Juz) obj;
                if (!0qQ.A0K(this.A00, juz.A00) || this.A01 != juz.A01 || !0qQ.A0K(this.A02, juz.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A01, AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C61003Juz(ArrayList arrayList, List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = arrayList;
    }

    public C61003Juz() {
        this((ArrayList) null, (List) null, false);
    }
}
