package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class UCD extends C249703kE {
    public final RecyclerView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UCD(View view) {
        super(view);
        0qQ.A0B(view, 1);
        View findViewById = view.findViewById(R.id.tracked_content);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        Context context = recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A0v(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        JTP.A1D(recyclerView, AnonymousClass7TG.A02(context), AnonymousClass7TG.A05(context));
        0qQ.A07(findViewById);
        this.A00 = recyclerView;
    }
}
