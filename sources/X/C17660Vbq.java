package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Vbq  reason: case insensitive filesystem */
public final class C17660Vbq {
    public final Context A00;
    public final GradientDrawable A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;

    public C17660Vbq(View view) {
        this.A00 = view.getContext();
        View requireViewById = view.requireViewById(R.id.poll_v2_result_option_row_unfilled);
        this.A03 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.poll_v2_result_option_row_filled);
        this.A02 = requireViewById2;
        this.A05 = DbU.A0G(requireViewById, R.id.poll_v2_result_option_row_option_text);
        this.A04 = DbU.A0G(requireViewById2, R.id.poll_v2_result_option_row_option_text_filled);
        TextView A0G = DbU.A0G(requireViewById, R.id.poll_v2_result_option_row_vote_percentage);
        this.A07 = A0G;
        TextView A0G2 = DbU.A0G(requireViewById2, R.id.poll_v2_result_option_row_vote_percentage_filled);
        this.A06 = A0G2;
        this.A01 = C13989Tnp.A0M(requireViewById2);
        C306466Mg.A02(A0G);
        C306466Mg.A02(A0G2);
    }
}
