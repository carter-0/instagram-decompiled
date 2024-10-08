package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.UAy  reason: case insensitive filesystem */
public final class C14819UAy extends C249403jg {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public final void A00(RecyclerView recyclerView, String str) {
        AnonymousClass7TF.A1H(str, recyclerView);
        Map map = this.A00;
        if (!map.containsKey(recyclerView)) {
            recyclerView.A15(this);
        }
        map.put(recyclerView, str);
        if (recyclerView.getScrollState() == 0) {
            Map map2 = this.A01;
            if (map2.containsKey(str)) {
                Object remove = map2.remove(str);
                if (remove != null) {
                    recyclerView.A0o(AnonymousClass7TE.A0M(remove));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C252553pI r1 = recyclerView.A0D;
            if (r1 != null) {
                Parcelable parcelable = (Parcelable) this.A02.get(str);
                if (parcelable != null) {
                    r1.A1P(parcelable);
                } else {
                    r1.A1O(0);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A0D = AnonymousClass7TG.A0D(recyclerView, -869468529);
        C252553pI r3 = recyclerView.A0D;
        if (r3 != null) {
            this.A02.put(this.A00.get(recyclerView), r3.A1M());
            AnonymousClass0fD.A0A(-667940571, A0D);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(291795724, A0D);
        throw A0y;
    }
}
