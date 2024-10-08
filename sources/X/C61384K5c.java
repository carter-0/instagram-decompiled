package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.K5c  reason: case insensitive filesystem */
public final class C61384K5c extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BrandedContentWelcomeComposeFragment";
    public boolean A00;
    public final List A01 = 0sr.A1P(new 0eP[]{AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.instagram_settings_pano_outline_24), 2131976831), AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.instagram_tag_down_pano_outline_24), 2131976832), AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.instagram_users_pano_outline_24), 2131976833), AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.instagram_compose_pano_outline_24), 2131976834)});
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eom(2131954188);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean onBackPressed() {
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 16 && !getParentFragmentManager().A12()) {
            DbT.A1I(this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1460062748);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 37), 1356063744);
        AnonymousClass0fD.A09(26603529, A022);
        return A0H;
    }
}
