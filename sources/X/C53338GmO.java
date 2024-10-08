package X;

import android.graphics.Point;

/* renamed from: X.GmO  reason: case insensitive filesystem */
public final class C53338GmO extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final Point A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53338GmO) {
                C53338GmO gmO = (C53338GmO) obj;
                if (!(this.A01 == gmO.A01 && Float.compare(this.A00, gmO.A00) == 0 && 0qQ.A0K(this.A02, gmO.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A00(this.A01 * 31, this.A00));
    }

    public C53338GmO(Point point, float f, int i) {
        this.A01 = i;
        this.A00 = f;
        this.A02 = point;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FaceSwarmTemplateSpecifier(rank=");
        A1A.append(this.A01);
        A1A.append(", sizeDp=");
        A1A.append(this.A00);
        A1A.append(", point=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
