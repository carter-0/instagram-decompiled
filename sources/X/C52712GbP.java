package X;

import android.view.View;
import java.util.List;

/* renamed from: X.GbP  reason: case insensitive filesystem */
public final class C52712GbP implements View.OnFocusChangeListener {
    public final List A00 = AnonymousClass7TE.A1C();

    public final void onFocusChange(View view, boolean z) {
        for (View.OnFocusChangeListener onFocusChange : this.A00) {
            onFocusChange.onFocusChange(view, z);
        }
    }
}
