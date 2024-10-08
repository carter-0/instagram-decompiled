package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;

public final class DxF extends C47418E1m implements G9c {
    public static final String __redex_internal_original_name = "ReelAvatarStickerBottomSheetFragment";
    public int A00 = 2131953527;
    public int A01 = 2131953541;
    public int A02 = 2131953542;
    public int A03 = 2131953529;
    public int A04 = 2131953531;
    public int A05 = 2131953533;
    public C267624bv A06 = new C64509LdB(this, 9);
    public AnonymousClass27H A07 = AnonymousClass27G.A00;
    public C331157Pu A08;
    public C60269JiQ A09;
    public G6I A0A;
    public C310216ac A0B;
    public Integer A0C = 2131953534;
    public Integer A0D = 2131953539;
    public Integer A0E = 2131953540;
    public Integer A0F = 2131953538;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K = true;
    public boolean A0L = true;
    public String A0M;
    public String A0N;
    public String A0O;
    public final AnonymousClass0eM A0P = C227642jf.A02(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public static final void A00(DxF dxF) {
        C250973mM r0;
        C255773uh Au5;
        C310216ac r4 = dxF.A0B;
        if (r4 != null) {
            if (!dxF.A0J && (r0 = ((ReelViewerFragment) r4.A04).A0a) != null) {
                if (!C308426Uf.A00.A00(r4.A00, r0.A0H.A0D())) {
                    C273384mU r1 = r4.A04;
                    C250973mM r2 = ((ReelViewerFragment) r1).A0a;
                    if (!(r2 == null || (Au5 = r1.Au5()) == null)) {
                        r4.A05.E0x(Au5, r2, true);
                    }
                }
            }
            DbW.A1K(dxF.A08);
        }
    }

    public final void A07() {
        String str;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MH5 mh5 = new MH5(07U.A05, this, viewLifecycleOwner, (AnonymousClass4D7) null, 25);
        19B r4 = 19B.A00;
        1Eo.A05(r4, mh5, A002);
        SpinnerImageView spinnerImageView = this.A0B;
        if (spinnerImageView != null) {
            DbS.A1T(spinnerImageView);
            C60269JiQ jiQ = this.A09;
            if (jiQ == null) {
                str = "viewModel";
            } else {
                1Eo.A05(r4, new MG3((Object) jiQ, (AnonymousClass4D7) null, 21), C318116oQ.A00(jiQ));
                return;
            }
        } else {
            str = "loadingSpinner";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A08() {
        G6I g6i = this.A0A;
        if (g6i != null) {
            g6i.DZO();
        }
        View view = this.mView;
        if (view != null) {
            view.post(new C51270FrP(this));
        }
        27r A012 = 27p.A01(AnonymousClass7TE.A0l(this.A0P));
        String str = this.A0N;
        if (str == null) {
            0qQ.A0F("avatarStickerTemplateId");
            throw AnonymousClass00P.createAndThrow();
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("sticker_template_id", str);
        0Aj A0e = AnonymousClass7TE.A0e(A012.A01, "mimicry_upsell_tap_add_avatar_to_story");
        if (A0e.isSampled()) {
            DbS.A1N(A0e, "avatar_stickers_upsell");
            DbV.A1L(A0e, A1E);
        }
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A01;
    }

    public final String getModuleName() {
        String str = this.A0O;
        if (str != null) {
            return C49092EpH.A00(this, str);
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(1946562765);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A0H = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A0G = string2;
                String string3 = requireArguments.getString("args_upsell_avatar_sticker_template_id");
                if (string3 != null) {
                    this.A0N = string3;
                    this.A0M = requireArguments.getString("args_upsell_avatar_sticker_expression_id");
                    String string4 = requireArguments.getString("args_previous_module_name");
                    if (string4 != null) {
                        this.A0O = string4;
                        this.A0J = requireArguments.getBoolean("args_is_self_story");
                        this.A0I = requireArguments.getBoolean("args_is_from_template_participation");
                        C587707f viewModelStore = getViewModelStore();
                        UserSession A0l = AnonymousClass7TE.A0l(this.A0P);
                        String str = this.A0N;
                        if (str == null) {
                            0qQ.A0F("avatarStickerTemplateId");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        this.A09 = new 2YN(new C61598KDz(A0l, str, this.A0M), viewModelStore, AnonymousClass2YP.A00).A00(C60269JiQ.class);
                        AnonymousClass0fD.A09(567633719, A022);
                        return;
                    }
                    illegalStateException = AnonymousClass7TE.A0z("previous module required");
                    i = 1051663527;
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("avatar sticker template id required");
                    i = -147816042;
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("editor logging mechanism required");
                i = 1857629002;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("editor logging surface required");
            i = 690774439;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
