package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.9Yb  reason: invalid class name and case insensitive filesystem */
public final class C380409Yb extends C249703kE {
    public final C385199iY A00;
    public final View A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380409Yb(View view, C334397bC r8, AnonymousClass0iw r9) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = view;
        C385199iY r5 = new C385199iY(r8, r9);
        this.A00 = r5;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        Context context = recyclerView.getContext();
        int A0D = AnonymousClass7TE.A0D(context.getResources());
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setPadding(recyclerView.getPaddingLeft(), A0D, recyclerView.getPaddingRight(), A0D);
        recyclerView.setAdapter(r5);
        recyclerView.A11(new C67821MvP(AnonymousClass7TG.A03(context)));
    }
}
