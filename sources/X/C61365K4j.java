package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;

/* renamed from: X.K4j  reason: case insensitive filesystem */
public final class C61365K4j extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PlaylistReelsTitleFragment";
    public EditText A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1B(r3, 2131969508);
        r3.ErD(C64269LXv.A00, R.drawable.instagram_check_pano_outline_24);
    }

    public final String getModuleName() {
        return "playlist_reels_title_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.playlist_title_edittext);
        this.A00 = editText;
        if (editText == null) {
            0qQ.A0F("titleEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            editText.postDelayed(new C65908M3x(this), 500);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-945582769);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_playlist_title, viewGroup, false);
        AnonymousClass0fD.A09(462331886, A02);
        return inflate;
    }
}
