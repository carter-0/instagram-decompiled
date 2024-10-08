package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;

public final class DxD extends C47418E1m {
    public static final String __redex_internal_original_name = "ReelAvatarMusicStickerBottomSheetFragment";
    public int A00 = R.drawable.ig_avatar_assets_ig_avatar_nux_music;
    public C267624bv A01 = new C50195FTb(this, 6);
    public C331157Pu A02;
    public String A03;
    public String A04;
    public String A05;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.avatar_upsell_icon);
        A0G.getLayoutParams().height = -2;
        A0G.getLayoutParams().width = -1;
    }

    public final String getModuleName() {
        String str = this.A05;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        String string;
        String string2;
        String string3;
        int A022 = AnonymousClass0fD.A02(-58057331);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("args_editor_logging_surface")) == null) {
            illegalStateException = AnonymousClass7TE.A0z("editor logging surface required");
            i = -836614393;
        } else {
            this.A04 = string;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (string2 = bundle3.getString("args_editor_logging_mechanism")) == null) {
                illegalStateException = AnonymousClass7TE.A0z("editor logging mechanism required");
                i = -988804201;
            } else {
                this.A03 = string2;
                Bundle bundle4 = this.mArguments;
                if (bundle4 == null || (string3 = bundle4.getString("args_previous_module_name")) == null) {
                    illegalStateException = AnonymousClass7TE.A0z("previous module required");
                    i = -965756816;
                } else {
                    this.A05 = string3;
                    AnonymousClass0fD.A09(-1543373310, A022);
                    return;
                }
            }
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
