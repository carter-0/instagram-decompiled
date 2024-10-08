package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.Gzd  reason: case insensitive filesystem */
public final class C54108Gzd extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsTemplateBrowserMoreInfoBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final String A01 = "clips_template_browser_more_info_bottom_sheet";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass7TE.A0d(view, R.id.bottom_sheet_description).setText(requireArguments().getString(DevServerEntity.COLUMN_DESCRIPTION));
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1896707636);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_template_browser_bottom_sheet_layout, viewGroup, false);
        AnonymousClass0fD.A09(-323235446, A02);
        return inflate;
    }
}
