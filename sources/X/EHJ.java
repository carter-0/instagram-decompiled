package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;

public final class EHJ extends C232232tF {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final FanClubConsiderationViewModel A04;
    public final String A05;
    public final String A06;

    public EHJ(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, FanClubConsiderationViewModel fanClubConsiderationViewModel, String str, String str2) {
        DbW.A1O(userSession, 3, fanClubConsiderationViewModel);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = fanClubConsiderationViewModel;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C47005Dox(DbU.A09(layoutInflater, viewGroup, R.layout.fan_club_consideration_teaser_view, false));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        View view;
        View.OnClickListener onClickListener;
        C47249Dta dta = (C47249Dta) r9;
        C47005Dox dox = (C47005Dox) r10;
        AnonymousClass7TF.A1H(dta, dox);
        RoundedCornerImageView roundedCornerImageView = dox.A03;
        roundedCornerImageView.setUrl(dta.A00, this.A02);
        roundedCornerImageView.A0I = AZR.A00;
        ? r6 = dox.A04;
        r6.setBackgroundColor(Color.argb(128, 0, 0, 0));
        IgImageView igImageView = dox.A02;
        Context context = this.A00;
        0qQ.A0B(context, 0);
        Drawable drawable = context.getDrawable(R.drawable.reels_pano_filled_16);
        if (drawable != null) {
            DbX.A11(context, drawable, 2Yu.A0H(context, R.attr.igds_color_icon_on_media));
            igImageView.setImageDrawable(drawable);
            int i = 8;
            if (AnonymousClass7TF.A1W(dta.A01, C16648Uyk.VIDEO)) {
                i = 0;
            }
            igImageView.setVisibility(i);
            String str = dta.A02;
            if (str == null || str.length() == 0) {
                r6.setVisibility(0);
                IgImageView igImageView2 = dox.A01;
                Drawable drawable2 = context.getDrawable(R.drawable.instagram_crown_pano_filled_24);
                if (drawable2 != null) {
                    DbX.A11(context, drawable2, 2Yu.A0H(context, R.attr.igds_color_icon_on_media));
                } else {
                    drawable2 = null;
                }
                igImageView2.setImageDrawable(drawable2);
                igImageView2.setVisibility(0);
                view = dox.A00;
                onClickListener = C50094FOk.A00;
            } else {
                dox.A01.setVisibility(8);
                r6.setVisibility(8);
                view = dox.A00;
                onClickListener = new FPF(7, (Object) dta, (Object) this);
            }
            AnonymousClass0fU.A00(onClickListener, view);
            return;
        }
        throw DbU.A0h();
    }

    public final Class modelClass() {
        return C47249Dta.class;
    }
}
