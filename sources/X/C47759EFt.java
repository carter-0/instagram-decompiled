package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;

/* renamed from: X.EFt  reason: case insensitive filesystem */
public final class C47759EFt extends C232222tE {
    public final Context A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.interest_shimmer_placeholder, viewGroup, false);
        0qQ.A0C(inflate, Pxd.A00(4));
        return new C46942Dnw((ShimmerFrameLayout) inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        int i;
        View A002;
        C46942Dnw dnw = (C46942Dnw) r11;
        0qQ.A0B(dnw, 1);
        dnw.A01.A02();
        Context context = this.A00;
        0qQ.A0B(context, 0);
        LinearLayout linearLayout = dnw.A00;
        linearLayout.removeAllViews();
        int floor = ((int) ((float) Math.floor((double) (((float) 0nA.A08(context)) / context.getResources().getDimension(R.dimen.shimmer_interest_section_height))))) - 1;
        if (floor >= 0) {
            int i2 = 0;
            while (true) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.interest_section_shimmer, linearLayout, false);
                HorizontalFlowLayout horizontalFlowLayout = (HorizontalFlowLayout) inflate.findViewById(R.id.subinterests_pill_container);
                if (i2 % 2 == 0) {
                    0qQ.A0A(horizontalFlowLayout);
                    i = R.dimen.abc_list_item_height_large_material;
                    horizontalFlowLayout.addView(C48955Emt.A00(context, horizontalFlowLayout, R.dimen.abc_list_item_height_large_material));
                    A002 = C48955Emt.A00(context, horizontalFlowLayout, R.dimen.abc_list_item_height_large_material);
                } else {
                    0qQ.A0A(horizontalFlowLayout);
                    i = R.dimen.abc_list_item_height_large_material;
                    horizontalFlowLayout.addView(C48955Emt.A00(context, horizontalFlowLayout, R.dimen.abc_list_item_height_large_material));
                    A002 = C48955Emt.A00(context, horizontalFlowLayout, R.dimen.alignment_guide_default_vertical_margin);
                }
                horizontalFlowLayout.addView(A002);
                horizontalFlowLayout.addView(C48955Emt.A00(context, horizontalFlowLayout, i));
                linearLayout.addView(inflate);
                if (i2 != floor) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final Class modelClass() {
        return C50317FXw.class;
    }

    public C47759EFt(Context context) {
        this.A00 = context;
    }
}
