package X;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.VbQ  reason: case insensitive filesystem */
public final class C17634VbQ {
    public final Context A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final C306386Ly A05;
    public final ReelDashboardFragment A06;

    public C17634VbQ(View view, ReelDashboardFragment reelDashboardFragment) {
        Context context = view.getContext();
        this.A00 = context;
        this.A06 = reelDashboardFragment;
        this.A01 = view;
        this.A02 = DbU.A0F(view, R.id.quiz_summary_answer_row_icon);
        this.A04 = DbU.A0G(view, R.id.quiz_summary_answer_row_answer_text);
        TextView A0G = DbU.A0G(view, R.id.quiz_summary_answer_row_answer_count);
        this.A03 = A0G;
        ABM.A01(A0G);
        Spannable spannable = C306386Ly.A0d;
        C306386Ly r2 = new C306386Ly(context, AnonymousClass7TG.A02(context));
        this.A05 = r2;
        r2.A0F(DbV.A01(context));
        AnonymousClass7TF.A11(context.getResources(), r2, R.dimen.bio_product_sticker_subtitle_size);
        ABM.A00(context, r2);
    }
}
