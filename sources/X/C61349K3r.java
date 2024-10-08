package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.K3r  reason: case insensitive filesystem */
public final class C61349K3r extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsAudioBrowserBackgroundFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "music_overlay_detail";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1710537085);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_audio_browser_background_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1996729737, A02);
        return inflate;
    }
}
