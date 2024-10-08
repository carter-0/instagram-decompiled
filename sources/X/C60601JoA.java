package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.JoA  reason: case insensitive filesystem */
public final class C60601JoA extends C249703kE {
    public final RecyclerView A00;
    public final LDb A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60601JoA(View view, AnonymousClass0iw r5, C63682L2s l2s) {
        super(view);
        0qQ.A0B(view, 1);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.recycler_view);
        this.A00 = recyclerView;
        Context A0S = AnonymousClass7TE.A0S(view);
        LDb lDb = new LDb(A0S, r5, l2s);
        this.A01 = lDb;
        DbV.A1A(A0S, recyclerView);
        recyclerView.setAdapter(lDb.A00);
        recyclerView.getLayoutParams().height = -2;
    }
}
