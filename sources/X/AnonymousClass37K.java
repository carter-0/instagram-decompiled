package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.37K  reason: invalid class name */
public final class AnonymousClass37K extends C252233om {
    public final ArrayList A00 = new ArrayList();

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        view.getViewTreeObserver().addOnPreDrawListener(new C7225Pzu(view, this));
    }

    public final void onDestroyView() {
        ArrayList arrayList = this.A00;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C7218Pzn pzn = ((AnonymousClass37L) arrayList.get(size)).A00.A0D;
                if (pzn != null) {
                    pzn.A0G();
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        arrayList.clear();
    }
}
