package X;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.pollresults.PollResultsView;
import java.util.List;

/* renamed from: X.Ft7  reason: case insensitive filesystem */
public final /* synthetic */ class C51375Ft7 implements Runnable {
    public final /* synthetic */ C50576Fel A00;
    public final /* synthetic */ C283155Gi A01;

    public /* synthetic */ C51375Ft7(C50576Fel fel, C283155Gi r2) {
        this.A00 = fel;
        this.A01 = r2;
    }

    public final void run() {
        boolean z;
        Object obj;
        Object obj2;
        ViewGroup.LayoutParams layoutParams;
        C50576Fel fel = this.A00;
        C283155Gi r2 = this.A01;
        TextView textView = fel.A03;
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        PollResultsView pollResultsView = fel.A00;
        if (pollResultsView == null) {
            pollResultsView = (PollResultsView) fel.A02.inflate();
            fel.A00 = pollResultsView;
        }
        pollResultsView.setVisibility(0);
        List list = r2.A04.A0z;
        list.getClass();
        if (((N4G) list.get(0)).A00 >= ((N4G) list.get(1)).A00) {
            z = true;
            obj = list.get(0);
        } else {
            z = false;
            obj = list.get(1);
        }
        N4G n4g = (N4G) obj;
        if (z) {
            obj2 = list.get(1);
        } else {
            obj2 = list.get(0);
        }
        N4G n4g2 = (N4G) obj2;
        int i = n4g.A00;
        int i2 = n4g2.A00;
        int i3 = i * 100;
        int i4 = i + i2;
        int i5 = i3 / i4;
        int i6 = (i2 * 100) / i4;
        TextView textView2 = pollResultsView.A04;
        Resources resources = pollResultsView.getResources();
        DbY.A0y(resources, textView2, Integer.valueOf(i5), 2131972366);
        pollResultsView.A05.setText(n4g.A01);
        DbY.A0y(resources, pollResultsView.A02, Integer.valueOf(i6), 2131972366);
        pollResultsView.A03.setText(n4g2.A01);
        int dimensionPixelOffset = width - resources.getDimensionPixelOffset(R.dimen.account_group_management_clickable_width);
        pollResultsView.A01.getLayoutParams().width = (i5 * dimensionPixelOffset) / 100;
        ImageView imageView = pollResultsView.A00;
        if (i6 == 0) {
            DbU.A11(pollResultsView.getContext(), imageView, R.drawable.poll_bar_loser_0_percent);
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = imageView.getLayoutParams();
            dimensionPixelOffset = (dimensionPixelOffset * i6) / 100;
        }
        layoutParams.width = dimensionPixelOffset;
    }
}
