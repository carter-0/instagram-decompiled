package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.5hl  reason: invalid class name and case insensitive filesystem */
public final class C291715hl {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C291715hl) || i != ((C291715hl) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (i == 1) {
            return "Italic";
        }
        return "Invalid";
    }

    @Deprecated(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @ReplaceWith(expression = "FontStyle.", imports = {}))
    public /* synthetic */ C291715hl(int i) {
        this.A00 = i;
    }
}
