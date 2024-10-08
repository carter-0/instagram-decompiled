package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;

public final class E0e extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PAHowAdCodesWorkFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r5 = this.A00;
        0lg A0L = AnonymousClass7TF.A0L(r5, 0);
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, A0L, 36330119039566297L)) {
            ((IgdsBulletCell) AnonymousClass7TF.A0F(view, R.id.bullet_cell_run_ads)).setText((Integer) 2131952229, (Integer) 2131952228);
            ((IgdsBulletCell) AnonymousClass7TF.A0F(view, R.id.bullet_cell_branded_content)).setText((Integer) 2131952221, (Integer) 2131952220);
        }
        if (182.A06(r4, AnonymousClass7TF.A0L(r5, 0), 36328718880292403L)) {
            Dbb.A0t(view, R.id.bullet_cell_allows_creative_optimizations, 0);
            ((IgdsBulletCell) AnonymousClass7TF.A0F(view, R.id.bullet_cell_limit_posts_editing)).setText((Integer) 2131952224, (Integer) 2131952222);
        }
        if (182.A06(r4, AnonymousClass7TF.A0L(r5, 0), 36330037435187620L)) {
            Dbb.A0t(view, R.id.bullet_cell_testimonial, 0);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-40273338);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.pa_how_ad_codes_work, viewGroup, false);
        AnonymousClass0fD.A09(1129589784, A02);
        return inflate;
    }
}
