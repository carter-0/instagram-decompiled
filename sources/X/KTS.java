package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class KTS extends C61382K5a {
    public static final String __redex_internal_original_name = "ClipsProfileCropFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return "clips_share_sheet_profile_crop";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.edit_feed_preview_crop_helper_text);
        TextView textView = (TextView) requireViewById;
        textView.setText(2131956798);
        textView.setContentDescription(getString(2131956799));
        0qQ.A07(requireViewById);
        2eQ.A06(textView, 500);
    }

    public KTS() {
        0Yh A0z = DbS.A0z(C60228Jhl.class);
        this.A01 = DbS.A0I(C66296MMf.A00(this, 6), C66296MMf.A00(this, 7), MMY.A00(this, (Object) null, 25), A0z);
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        C59922Jbl.A02(DbV.A05(this), A002, 2131955342);
        2eS.A01(C59904JbT.A00(new LYF((Object) this, 69), r4, A002));
    }
}
