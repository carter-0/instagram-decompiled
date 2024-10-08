package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class VYJ {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;

    public VYJ(View view) {
        Context context = view.getContext();
        this.A00 = view;
        this.A03 = DbU.A0G(view, R.id.dashboard_section_header_title);
        View requireViewById = view.requireViewById(R.id.dashboard_section_header_cta);
        this.A01 = requireViewById;
        TextView A0G = DbU.A0G(requireViewById, R.id.dashboard_cta_text);
        this.A02 = A0G;
        DbT.A17(context, A0G, 2Yu.A0D(context));
        DbX.A1B(requireViewById, R.id.forward_arrow);
        0nA.A0c(requireViewById, 0);
        0nA.A0X(requireViewById, 0);
    }
}
