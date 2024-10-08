package X;

import android.graphics.RectF;

/* renamed from: X.A9b  reason: case insensitive filesystem */
public final class C39782A9b {
    public final RectF A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39782A9b) {
                C39782A9b a9b = (C39782A9b) obj;
                if (!0qQ.A0K(this.A01, a9b.A01) || !0qQ.A0K(this.A00, a9b.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C39782A9b(RectF rectF, String str) {
        this.A01 = str;
        this.A00 = rectF;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SingleHandPredictionData(gesture=");
        A1A.append(this.A01);
        A1A.append(", boundingBox=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
