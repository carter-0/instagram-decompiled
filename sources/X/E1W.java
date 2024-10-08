package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

public final class E1W extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AvatarCoinFlipAutoEnableBottomsheetFragment";
    public String A00 = "avatar_coin_flip_auto_enable_bottomsheet_";
    public String A01;
    public AvatarCoinFlipConfig A02;
    public Boolean A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C49738F4d.A01(view, this.A02, this, AnonymousClass7TE.A0l(this.A06));
        FP6.A00(view.requireViewById(R.id.coin_flip_bottom_sheet_button), 26, this);
        if (!DbX.A1a(this.A03)) {
            View requireViewById = view.requireViewById(R.id.coin_flip_bottom_sheet_secondary_button);
            requireViewById.setVisibility(0);
            FP6.A00(requireViewById, 27, this);
        }
        ((C46795DlU) this.A05.getValue()).A00("ig_opt_out_tied_to_avatar", AnonymousClass05K.A00, this.A01);
    }

    public final String getModuleName() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public E1W() {
        C51801G2k A002 = C51801G2k.A00(this, 38);
        C51801G2k A003 = C51801G2k.A00(this, 40);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r4, C51801G2k.A00(A003, 41));
        this.A04 = DbS.A0I(C51801G2k.A00(A004, 42), A002, new MMX(11, (Object) null, (Object) A004), DbS.A0z(C314326i1.class));
        C51801G2k A005 = C51801G2k.A00(this, 39);
        AnonymousClass0eM A006 = AnonymousClass0eN.A00(r4, C51801G2k.A00(C51801G2k.A00(this, 43), 44));
        this.A05 = DbS.A0I(C51801G2k.A00(A006, 45), A005, new MMX(12, (Object) null, (Object) A006), DbS.A0z(C46795DlU.class));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        AvatarCoinFlipConfig avatarCoinFlipConfig;
        int A022 = AnonymousClass0fD.A02(277892602);
        E1W.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Boolean bool = null;
        if (bundle2 != null) {
            str = bundle2.getString("args_previous_module_name");
        } else {
            str = null;
        }
        this.A01 = str;
        String A0R = 002.A0R(this.A00, str);
        0qQ.A0B(A0R, 0);
        this.A00 = A0R;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            avatarCoinFlipConfig = (AvatarCoinFlipConfig) bundle3.getParcelable("args_avatar_coin_flip_config");
        } else {
            avatarCoinFlipConfig = null;
        }
        this.A02 = avatarCoinFlipConfig;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            bool = DbU.A0g(bundle4, "tied_to_avatar_enabled");
        }
        this.A03 = bool;
        AnonymousClass0fD.A09(-1178210762, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1424074348);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_coin_flip_auto_enable_nux_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-2063425357, A022);
        return inflate;
    }
}
