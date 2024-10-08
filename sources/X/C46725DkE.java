package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

/* renamed from: X.DkE  reason: case insensitive filesystem */
public final class C46725DkE extends Fragment {
    public static SHX A02;
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;

    public final void onViewCreated(View view, Bundle bundle) {
        view.setBackgroundColor(AnonymousClass7TF.A03(DbT.A06(this, view, 0), R.attr.igds_color_primary_background));
        this.A01 = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.safe_browsing_headline);
        this.A00 = (IgdsBottomButtonLayout) AnonymousClass7TE.A0b(view, R.id.safe_browsing_bottom_button);
        IgdsHeadline igdsHeadline = this.A01;
        String str = "headline";
        if (igdsHeadline != null) {
            igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_warning_refresh);
            IgdsHeadline igdsHeadline2 = this.A01;
            if (igdsHeadline2 != null) {
                igdsHeadline2.setHeadline(2131975983);
                FragmentActivity activity = getActivity();
                DbS.A1X(activity);
                FGX A022 = FGX.A02(activity, true);
                RBU rbu = new RBU(requireContext().getColor(R.color.igds_link), 0);
                String A0m = DbU.A0m(this, 2131964884);
                SpannableStringBuilder A0C = DbS.A0C(002.A0T(getString(2131975980), A0m, ' '));
                AnonymousClass7AV.A04(A0C, rbu, A0m);
                A022.A05((CharSequence) null, A0C, R.drawable.instagram_info_pano_outline_24);
                A022.A05((CharSequence) null, getString(2131975981), R.drawable.instagram_user_circle_pano_outline_24);
                A022.A05((CharSequence) null, getString(2131975982), R.drawable.instagram_settings_pano_outline_24);
                List A04 = A022.A04();
                ((IgdsBulletCell) A04.get(0)).setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
                IgdsHeadline igdsHeadline3 = this.A01;
                if (igdsHeadline3 != null) {
                    igdsHeadline3.setBulletList(A04);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setDividerVisible(true);
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                        if (igdsBottomButtonLayout2 != null) {
                            DbZ.A1A(this, igdsBottomButtonLayout2, 2131975974);
                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
                            if (igdsBottomButtonLayout3 != null) {
                                igdsBottomButtonLayout3.setPrimaryActionOnClickListener(C50089FOe.A00);
                                IgdsBottomButtonLayout igdsBottomButtonLayout4 = this.A00;
                                if (igdsBottomButtonLayout4 != null) {
                                    igdsBottomButtonLayout4.setSecondaryActionText(getString(2131975978));
                                    IgdsBottomButtonLayout igdsBottomButtonLayout5 = this.A00;
                                    if (igdsBottomButtonLayout5 != null) {
                                        igdsBottomButtonLayout5.setSecondaryActionOnClickListener(new FP6((Object) this, 0));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1243002921);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.safe_browsing_warning_headline, false);
        AnonymousClass0fD.A09(1737024814, A022);
        return A0D;
    }
}
