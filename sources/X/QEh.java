package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class QEh extends C249403jg {
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A0D = AnonymousClass7TG.A0D(recyclerView, 1550324123);
        int childCount = recyclerView.getChildCount();
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                if (recyclerView.getChildAt(i3) instanceof ViewGroup) {
                    AnonymousClass2E0.A0H();
                }
                if (i3 == childCount) {
                    break;
                }
                i3++;
            }
        }
        AnonymousClass0fD.A0A(2135194798, A0D);
    }
}
