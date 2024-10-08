package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Qcu  reason: case insensitive filesystem */
public final class C7923Qcu extends C7924Qcv {
    public Button A00;
    public ImageView A01;
    public LinearLayout A02;
    public ProgressBar A03;
    public ViewPager A04;
    public List A05;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1068244338);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.sc_ig_onboarding_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1399951470, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(210034080);
        C7923Qcu.super.onResume();
        ViewPager viewPager = this.A04;
        0qQ.A0A(viewPager);
        if (viewPager.getVisibility() == 0) {
            ViewPager viewPager2 = this.A04;
            0qQ.A0A(viewPager2);
            viewPager2.getCurrentItem();
            List list = this.A05;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    List list2 = this.A05;
                    0qQ.A0A(list2);
                    list2.get(i);
                }
            }
        }
        AnonymousClass0fD.A09(-223469823, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Context A0E = Pxj.A0E(view);
        Pxf.A1B(view, C11408SSf.A01(A0E, R.attr.sc_surface_background));
        this.A03 = (ProgressBar) view.findViewById(R.id.pb_loading);
        ViewPager A002 = SKW.A00(view, R.id.onboarding_view_pager);
        this.A04 = A002;
        0qQ.A0A(A002);
        A002.setOffscreenPageLimit(2);
        this.A02 = (LinearLayout) SKW.A00(view, R.id.onboarding_pager_control);
        Button button = (Button) SKW.A00(view, R.id.btn_next);
        this.A00 = button;
        0qQ.A0A(button);
        C11408SSf.A05(button);
        ViewPager viewPager = this.A04;
        0qQ.A0A(viewPager);
        viewPager.setVisibility(8);
        LinearLayout linearLayout = this.A02;
        0qQ.A0A(linearLayout);
        linearLayout.setVisibility(8);
        this.A01 = SKW.A01(view, R.id.iv_back_button);
        Context context = getContext();
        if (!(this.A00 == null || context == null)) {
            ImageView imageView = this.A01;
            0qQ.A0A(imageView);
            0qQ.A0A(this.A00);
            DbU.A13(context, imageView, R.drawable.instagram_arrow_left_pano_outline_24);
        }
        XtE.A00(new TNH(this, 6)).A02(new C11767SgD(this, 2), XtE.A0B);
        TextView A022 = SKW.A02(view, R.id.tv_privacy_disclaimer);
        A022.setText(2131972641);
        C11408SSf.A04(A0E, A022, R.attr.sc_secondary_text);
        Pxf.A1B(SKW.A00(view, R.id.divider), C11408SSf.A01(A0E, R.attr.sc_divider));
        09i.A0A.A04(requireArguments());
    }
}
