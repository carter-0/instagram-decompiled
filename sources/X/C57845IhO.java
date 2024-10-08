package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.IhO  reason: case insensitive filesystem */
public final class C57845IhO implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ IntentAwareAdPivotState A01;

    public C57845IhO(RecyclerView recyclerView, IntentAwareAdPivotState intentAwareAdPivotState) {
        this.A00 = recyclerView;
        this.A01 = intentAwareAdPivotState;
    }

    public final void run() {
        Parcelable A1M;
        C252553pI r0 = this.A00.A0D;
        if (r0 != null && (A1M = r0.A1M()) != null) {
            this.A01.A03 = A1M;
        }
    }
}
