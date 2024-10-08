package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gdw  reason: case insensitive filesystem */
public final class C52863Gdw extends ViewOutlineProvider {
    public final int A00;

    public final void getOutline(View view, Outline outline) {
        AnonymousClass7TF.A1H(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.A00);
    }

    public final boolean equals(Object obj) {
        C52863Gdw gdw;
        if (obj instanceof C52863Gdw) {
            gdw = (C52863Gdw) obj;
        } else {
            gdw = null;
        }
        if (gdw == null || this.A00 != gdw.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public C52863Gdw(int i) {
        this.A00 = i;
    }
}
