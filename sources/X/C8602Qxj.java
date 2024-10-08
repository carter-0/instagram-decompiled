package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Qxj  reason: case insensitive filesystem */
public final class C8602Qxj extends QAL {
    public Context A00;
    public View A01;
    public TextView A02;
    public Map A03;
    public Set A04;

    public final void show() {
        if (this.A04.size() == 1) {
            View view = (View) this.A03.get(this.A04.iterator().next());
            if (view != null) {
                view.callOnClick();
                return;
            }
            return;
        }
        super.show();
    }
}
