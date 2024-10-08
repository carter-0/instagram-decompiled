package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

public final class NOO extends C232222tE {
    public final Context A00;
    public final C70493O8s A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67979My4(DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_inbox_sort_and_filter_row, false), this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C71959Otk otk = (C71959Otk) r7;
        C67979My4 my4 = (C67979My4) r8;
        AnonymousClass7TF.A1H(otk, my4);
        my4.A02.setText(2131959988);
        List list = otk.A00;
        if (AnonymousClass7TE.A1b(list)) {
            TextView textView = my4.A01;
            textView.setText(DbT.A0z(", ", C73429PcU.A00(list, 29), new C73933PmD(this, 35)));
            textView.setVisibility(0);
            return;
        }
        my4.A01.setVisibility(8);
    }

    public final Class modelClass() {
        return C71959Otk.class;
    }

    public NOO(Context context, C70493O8s o8s) {
        this.A00 = context;
        this.A01 = o8s;
    }
}
