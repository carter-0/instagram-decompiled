package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class AVN implements AnonymousClass2WT {
    public final /* synthetic */ C337927h8 A00;

    public AVN(C337927h8 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.recyclerview.widget.RecyclerView, X.7gG] */
    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        ? recyclerView = new RecyclerView(context, (AttributeSet) null, 0);
        recyclerView.A03 = true;
        recyclerView.A04 = true;
        recyclerView.A05 = true;
        recyclerView.A02 = true;
        2Wh r1 = new 2Wh(context, recyclerView);
        r1.setId(R.id.recycler_view_container_id);
        return r1;
    }
}
