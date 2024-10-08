package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class DxG extends C47418E1m implements C268594df {
    public static final String __redex_internal_original_name = "AvatarStickerMimicryUpsellBottomSheetFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C267624bv A04 = new C50195FTb(this, 3);
    public ImageUrl A05;
    public String A06;
    public String A07;
    public C62320sa A08 = new MMO(this, 11);
    public boolean A09;
    public String A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new MMO(this, 10));

    public final int AqL() {
        return -2;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.A05;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            0qQ.A0F("dragHandle");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private final boolean A01() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle.getBoolean("is_sender");
        }
        throw AnonymousClass7TE.A0z("is_sender arg expected");
    }

    public final void A07() {
        Drawable drawable;
        ImageUrl imageUrl = this.A05;
        if (imageUrl != null) {
            String url = imageUrl.getUrl();
            if (URLUtil.isContentUrl(url) || URLUtil.isFileUrl(url)) {
                String A002 = AnonymousClass6FA.A00(AnonymousClass7TE.A0l(this.A0E)).A00(imageUrl.getUrl());
                if (A002 != null) {
                    drawable = A00(DbS.A0V(A002));
                } else {
                    drawable = requireContext().getDrawable(this.A03);
                }
            } else {
                drawable = A00(imageUrl);
            }
            A03().setImageDrawable(drawable);
            return;
        }
        super.A07();
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return true;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final String getModuleName() {
        String str = this.A0A;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isScrolledToTop() {
        return true;
    }

    private final Drawable A00(ImageUrl imageUrl) {
        int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.avatar_sticker_max_height);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0E);
        String url = imageUrl.getUrl();
        0qQ.A07(url);
        return C320996tP.A02(requireContext, A0l, url, dimensionPixelSize, dimensionPixelSize, C63282KuR.A00(A0l));
    }

    public final void A08() {
        boolean z;
        String str;
        boolean z2;
        super.A08();
        FV0 fv0 = (FV0) this.A0B.getValue();
        boolean z3 = this.A09;
        boolean A012 = A01();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            z = bundle.getBoolean("is_from_nux");
        } else {
            z = false;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("sticker_template_id");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z2 = bundle3.getBoolean("args_is_restricted_logging");
        } else {
            z2 = true;
        }
        fv0.A00(str, z3, A012, z, z2);
    }

    public final void A09() {
        boolean z;
        String str;
        boolean z2;
        super.A09();
        FV0 fv0 = (FV0) this.A0B.getValue();
        boolean z3 = this.A09;
        boolean A012 = A01();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            z = bundle.getBoolean("is_from_nux");
        } else {
            z = false;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("sticker_template_id");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z2 = bundle3.getBoolean("args_is_restricted_logging");
        } else {
            z2 = true;
        }
        fv0.A00(str, z3, A012, z, z2);
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        Integer num;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        String str;
        boolean z2;
        String str2;
        int A022 = AnonymousClass0fD.A02(1716814113);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A07 = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A06 = string2;
                String string3 = requireArguments.getString("args_previous_module_name");
                if (string3 != null) {
                    this.A0A = string3;
                    this.A09 = requireArguments.getBoolean("has_avatar");
                    String string4 = requireArguments.getString(AnonymousClass000.A00(88));
                    SimpleImageUrl simpleImageUrl = null;
                    if (string4 != null) {
                        simpleImageUrl = DbS.A0V(string4);
                    }
                    this.A05 = simpleImageUrl;
                    if (A01()) {
                        num = AnonymousClass05K.A00;
                    } else {
                        num = AnonymousClass05K.A01;
                    }
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        i2 = 2131971349;
                    } else {
                        i2 = 2131973113;
                    }
                    this.A02 = i2;
                    if (intValue != 0) {
                        i3 = 2131971348;
                    } else {
                        i3 = 2131973112;
                    }
                    this.A01 = i3;
                    if (intValue != 0) {
                        i4 = 2131971347;
                    } else {
                        i4 = 2131973111;
                    }
                    this.A00 = i4;
                    0lg A0X = DbT.A0X(this.A0E);
                    0qQ.A0B(A0X, 1);
                    0Tu A0J = DbS.A0J(2SP.A00, 3);
                    if (182.A06(A0J, A0X, 36325351626650524L)) {
                        i5 = R.drawable.ig_avatars_style_2_g6_casual_alpha_style2;
                    } else {
                        boolean A062 = 182.A06(A0J, A0X, 36322246364506137L);
                        i5 = R.drawable.ig_avatar_assets_avatar_nux_static;
                        if (A062) {
                            i5 = R.drawable.ig_avatar_assets_avatar_nux_sp;
                        }
                    }
                    this.A03 = i5;
                    FV0 fv0 = (FV0) this.A0B.getValue();
                    boolean z3 = this.A09;
                    boolean A012 = A01();
                    Bundle bundle2 = this.mArguments;
                    if (bundle2 != null) {
                        z = bundle2.getBoolean("is_from_nux");
                    } else {
                        z = false;
                    }
                    Bundle bundle3 = this.mArguments;
                    if (bundle3 != null) {
                        str = bundle3.getString("sticker_template_id");
                    } else {
                        str = null;
                    }
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 != null) {
                        z2 = bundle4.getBoolean("args_is_restricted_logging");
                    } else {
                        z2 = true;
                    }
                    if (z) {
                        str2 = "create_avatar_nux";
                    } else {
                        str2 = "avatar_sticker";
                    }
                    0Aj A0e = AnonymousClass7TE.A0e(fv0.A00, "mimicry_upsell_shown");
                    DbS.A1N(A0e, str2);
                    A0e.AAJ("has_avatar", String.valueOf(z3));
                    A0e.AAJ("is_sender", String.valueOf(A012));
                    A0e.AAJ("ig_user_id", fv0.A01.A06);
                    if (!z2) {
                        if (str == null) {
                            str = "None";
                        }
                        A0e.AAJ("sticker_template_id", str);
                    }
                    A0e.Cgf();
                    AnonymousClass0fD.A09(1073743077, A022);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("module name required");
                i = -868046444;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("editor logging mechanism required");
                i = -1046287806;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("editor logging surface required");
            i = 564184870;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
