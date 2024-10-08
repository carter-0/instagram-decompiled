package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class VWW {
    public final View A00;
    public final RecyclerView A01;
    public final RecyclerView A02;

    public VWW(View view) {
        this.A00 = view;
        RecyclerView A0I = DbT.A0I(view, R.id.column_headers_row);
        this.A01 = A0I;
        this.A02 = DbT.A0I(view, R.id.grid_view);
        DbV.A1A(view.getContext(), A0I);
    }
}
