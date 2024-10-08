package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Set;

/* renamed from: X.EzK  reason: case insensitive filesystem */
public final class C49601EzK {
    public View A00;
    public RecyclerView A01;
    public Set A02 = AnonymousClass7TE.A1F();
    public final SearchEditText A03;

    public C49601EzK(View view, SearchEditText searchEditText) {
        this.A00 = view.findViewById(R.id.username_suggestions_container_vscroll);
        RecyclerView A0I = DbT.A0I(view, R.id.username_suggestions_vscroll);
        this.A01 = A0I;
        Context context = view.getContext();
        DbU.A15(context, A0I, 1, false);
        C275824s0 r1 = new C275824s0(context, 1);
        r1.A01(context.getDrawable(R.drawable.horizontal_divider_1px));
        this.A01.A11(r1);
        this.A03 = searchEditText;
    }
}
