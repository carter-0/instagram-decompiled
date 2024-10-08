package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.GzP  reason: case insensitive filesystem */
public final class C54094GzP extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MusicSpotlightBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "music_spotlight_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(26486190);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_music_spotlight_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1814396681, A02);
        return inflate;
    }
}
