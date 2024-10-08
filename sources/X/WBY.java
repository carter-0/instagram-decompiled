package X;

import android.os.Bundle;
import android.view.View;

public final class WBY implements View.OnLongClickListener {
    public final /* synthetic */ int A00;

    public WBY(int i) {
        this.A00 = i;
    }

    public final boolean onLongClick(View view) {
        return view.performAccessibilityAction(this.A00, (Bundle) null);
    }
}
