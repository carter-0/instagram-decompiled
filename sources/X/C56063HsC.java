package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.HsC  reason: case insensitive filesystem */
public final class C56063HsC {
    public final Drawable A00;

    public final boolean equals(Object obj) {
        Drawable drawable = this.A00;
        if (!(obj instanceof C56063HsC) || !0qQ.A0K(drawable, ((C56063HsC) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        Drawable drawable = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CachedDrawable(wrappedDrawable=");
        return AnonymousClass7TG.A0n(drawable, A1A);
    }

    public /* synthetic */ C56063HsC(Drawable drawable) {
        this.A00 = drawable;
    }
}
