package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.E1h  reason: case insensitive filesystem */
public final class C47413E1h extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AvatarCoinFlipNuxBottomSheetFragment";
    public String A00;
    public AvatarCoinFlipConfig A01;
    public String A02;
    public final AnonymousClass0eM A03 = DbS.A0I(C51799G2i.A00(this, 20), C51799G2i.A00(this, 17), new MMX(21, (Object) null, (Object) this), DbS.A0z(C46795DlU.class));
    public final AnonymousClass0eM A04 = DbS.A0I(C51799G2i.A00(this, 19), C51799G2i.A00(this, 18), new MMX(20, (Object) null, (Object) this), DbS.A0z(DdZ.class));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C49738F4d.A01(view, this.A01, this, AnonymousClass7TE.A0l(this.A05));
        FP6.A00(view.requireViewById(R.id.coin_flip_bottom_sheet_button), 36, this);
        FP6.A00(view.requireViewById(R.id.coin_flip_bottom_sheet_secondary_button), 37, this);
        C46795DlU dlU = (C46795DlU) this.A03.getValue();
        Integer num = AnonymousClass05K.A00;
        String str = this.A00;
        if (str == null) {
            0qQ.A0F("launchSurface");
            throw AnonymousClass00P.createAndThrow();
        } else {
            dlU.A00(str, num, (String) null);
        }
    }

    public final String getModuleName() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-92044424);
        C47413E1h.super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A02 = string;
            AvatarCoinFlipConfig avatarCoinFlipConfig = (AvatarCoinFlipConfig) requireArguments().getParcelable("args_avatar_coin_flip_config");
            if (avatarCoinFlipConfig != null) {
                this.A01 = avatarCoinFlipConfig;
                String string2 = requireArguments().getString("args_launch_surface");
                if (string2 != null) {
                    this.A00 = string2;
                    AnonymousClass0fD.A09(2126631605, A022);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("launch surface required");
                i = 134827465;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("avatar coin flip config required");
                i = -495360401;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("module name required");
            i = 1648224419;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1495000571);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_coin_flip_nux_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-424186370, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2135854457);
        super.onDestroyView();
        AnonymousClass0fD.A09(-1503634760, A022);
    }
}
