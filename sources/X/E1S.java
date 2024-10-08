package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;

public final class E1S extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CoinFlipEditAvatarBottomSheetFragment";
    public float A00;
    public C46369Ddm A01;
    public String A02;
    public String A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ProfileCoinFlipView profileCoinFlipView = (ProfileCoinFlipView) AnonymousClass7TF.A0G(view, R.id.profile_coin_flip_view);
        Context context = profileCoinFlipView.getContext();
        String str = this.A02;
        if (str != null) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A04);
            0qQ.A0A(context);
            C320966tM.A02(context, profileCoinFlipView, A0l, AnonymousClass7TE.A0v(), str, this.A00, R.dimen.appreciation_reels_grid_item_width);
        }
        FP6.A00(view.requireViewById(R.id.coin_flip_edit_avatar_button), 28, this);
    }

    public final String getModuleName() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-1665947407);
        E1S.super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A03 = string;
            String string2 = requireArguments().getString(C273654mx.A00(1481));
            if (string2 != null) {
                this.A02 = string2;
                this.A00 = requireArguments().getFloat("args_top_margin_ratio");
                this.A01 = DbW.A0F(this).A00(C46369Ddm.class);
                AnonymousClass0fD.A09(1945609207, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("avatar sticker required");
            i = 2046040611;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("module name required");
            i = 1704955395;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1827380229);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.coin_flip_edit_avatar_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1431242462, A022);
        return inflate;
    }
}
