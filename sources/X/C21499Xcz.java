package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.Xcz  reason: case insensitive filesystem */
public final class C21499Xcz {
    public final float A00;
    public final Rect A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21499Xcz) {
                C21499Xcz xcz = (C21499Xcz) obj;
                if (!0qQ.A0K(this.A01, xcz.A01) || Float.compare(this.A00, xcz.A00) != 0 || !0qQ.A0K(this.A02, xcz.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A00(this.A01.hashCode() * 31, this.A00));
    }

    public C21499Xcz(Rect rect, List list, float f) {
        this.A01 = rect;
        this.A00 = f;
        this.A02 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SaliencyOutputs(rect=");
        A1A.append(this.A01);
        A1A.append(", blobRatio=");
        A1A.append(this.A00);
        A1A.append(", centroids=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
