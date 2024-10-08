package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.9hz  reason: invalid class name and case insensitive filesystem */
public final class C384849hz extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "GlassesStoryBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "glasses_story_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A00.getValue();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(775839535);
        C384849hz.super.onCreate(bundle);
        AnonymousClass0fD.A09(-778594150, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1234044814);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_stories_third_camera_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1483808296, A02);
        return inflate;
    }
}
