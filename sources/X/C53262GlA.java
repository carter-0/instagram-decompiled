package X;

import com.instagram.api.schemas.AudioFilterType;
import java.util.List;

/* renamed from: X.GlA  reason: case insensitive filesystem */
public final class C53262GlA extends AnonymousClass0T0 {
    public final AudioFilterType A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53262GlA) {
                C53262GlA glA = (C53262GlA) obj;
                if (this.A00 != glA.A00 || !0qQ.A0K(this.A01, glA.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C53262GlA(AudioFilterType audioFilterType, List list) {
        this.A00 = audioFilterType;
        this.A01 = list;
    }
}
