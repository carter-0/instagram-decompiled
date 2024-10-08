package X;

import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class DxE extends C47418E1m {
    public static final String __redex_internal_original_name = "AvatarCoinFlipMimicryUpsellBottomSheetFragment";
    public int A00 = 2131953528;
    public int A01 = 2131956846;
    public int A02 = 2131953532;
    public int A03 = R.drawable.ig_avatar_assets_avatar_nux_static;
    public EtF A04;
    public C267624bv A05 = new C50195FTb(this, 0);
    public C331157Pu A06;
    public String A07;
    public String A08;
    public boolean A09 = true;
    public String A0A;
    public final AnonymousClass0eM A0B = C227642jf.A02(this);

    private final List A00() {
        C317856nx r4;
        UserSession A0l;
        C317866ny r2;
        C317846nw r1;
        AnonymousClass0eM r12 = this.A0B;
        if (DcE.A01(AnonymousClass7TE.A0l(r12)) && DcE.A00(AnonymousClass7TE.A0l(r12))) {
            r4 = C317846nw.A01;
            A0l = AnonymousClass7TE.A0l(r12);
            r2 = C317866ny.PROFILE;
            r1 = C317846nw.COIN_FLIP_FRAME_POP_ANIMATED_AVATAR_STICKERS_440_400;
        } else if (DcE.A02(AnonymousClass7TE.A0l(r12)) && DcE.A01(AnonymousClass7TE.A0l(r12))) {
            r4 = C317846nw.A01;
            A0l = AnonymousClass7TE.A0l(r12);
            r2 = C317866ny.PROFILE;
            r1 = C317846nw.COIN_FLIP_FRAME_POP_ANIMATED_AVATAR_STICKERS_V2;
        } else if (!DcE.A02(AnonymousClass7TE.A0l(r12))) {
            return null;
        } else {
            r4 = C317846nw.A01;
            A0l = AnonymousClass7TE.A0l(r12);
            r2 = C317866ny.PROFILE;
            r1 = C317846nw.COIN_FLIP_ANIMATED_AVATAR_STICKERS_V2;
        }
        return AnonymousClass7TE.A1I(r4.A00(r1, r2, A0l, false));
    }

    public final void A08() {
        C52480GUi gUi = C63556Kz5.A01;
        UserSession A0l = AnonymousClass7TE.A0l(this.A0B);
        gUi.A04(requireActivity(), this.A05, A0l, A05(), A04(), (String) null, A00());
    }

    public final void A09() {
        C52480GUi gUi = C63556Kz5.A01;
        UserSession A0l = AnonymousClass7TE.A0l(this.A0B);
        gUi.A04(requireActivity(), this.A05, A0l, A05(), A04(), (String) null, A00());
    }

    public final String getModuleName() {
        String str = this.A0A;
        if (str != null) {
            return str;
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-1022053256);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A08 = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A07 = string2;
                String string3 = requireArguments.getString("args_previous_module_name");
                if (string3 != null) {
                    this.A0A = string3;
                    AnonymousClass0fD.A09(1247692478, A022);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("previous module required");
                i = 1683250918;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("editor logging mechanism required");
                i = -152512079;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("editor logging surface required");
            i = -441040210;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
