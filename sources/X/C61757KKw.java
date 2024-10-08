package X;

import android.graphics.Path;

/* renamed from: X.KKw  reason: case insensitive filesystem */
public final class C61757KKw extends C391879tp {
    public final int A00;
    public final Path A01;
    public final C354668Mx A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61757KKw) {
                C61757KKw kKw = (C61757KKw) obj;
                if (!(this.A00 == kKw.A00 && this.A02 == kKw.A02 && 0qQ.A0K(this.A01, kKw.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C61757KKw(Path path, C354668Mx r2, int i) {
        this.A00 = i;
        this.A02 = r2;
        this.A01 = path;
    }
}
