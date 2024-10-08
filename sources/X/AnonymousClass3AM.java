package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.3AM  reason: invalid class name */
public final class AnonymousClass3AM extends C231402rc {
    public final /* synthetic */ RecyclerView A00;

    public AnonymousClass3AM(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public final void A00() {
        float f = RecyclerView.A1E;
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A0S || !recyclerView.A0T) {
            recyclerView.A0N = true;
            recyclerView.requestLayout();
            return;
        }
        recyclerView.postOnAnimation(recyclerView.A11);
    }

    public final void onChanged() {
        RecyclerView recyclerView = this.A00;
        recyclerView.A17((String) null);
        recyclerView.mState.A0C = true;
        recyclerView.A19(true);
        if (recyclerView.A07.A04.size() <= 0) {
            recyclerView.requestLayout();
        }
    }

    public final void onItemRangeChanged(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A17((String) null);
        AnonymousClass3Ae r3 = recyclerView.A07;
        if (i2 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.CsX(obj, 4, i, i2));
            r3.A00 |= 4;
            if (arrayList.size() == 1) {
                A00();
            }
        }
    }

    public final void onItemRangeInserted(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A17((String) null);
        AnonymousClass3Ae r3 = recyclerView.A07;
        if (i2 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.CsX((Object) null, 1, i, i2));
            r3.A00 |= 1;
            if (arrayList.size() == 1) {
                A00();
            }
        }
    }

    public final void onItemRangeMoved(int i, int i2, int i3) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A17((String) null);
        AnonymousClass3Ae r3 = recyclerView.A07;
        if (i == i2) {
            return;
        }
        if (i3 == 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.CsX((Object) null, 8, i, i2));
            r3.A00 |= 8;
            if (arrayList.size() == 1) {
                A00();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public final void onItemRangeRemoved(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A17((String) null);
        AnonymousClass3Ae r3 = recyclerView.A07;
        if (i2 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.CsX((Object) null, 2, i, i2));
            r3.A00 |= 2;
            if (arrayList.size() == 1) {
                A00();
            }
        }
    }

    public final void onStateRestorationPolicyChanged() {
        2Rw r0;
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A0I != null && (r0 = recyclerView.A0A) != null && r0.canRestoreState()) {
            recyclerView.requestLayout();
        }
    }
}
