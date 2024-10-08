package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E0m  reason: case insensitive filesystem */
public final class C47394E0m extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectInviteModelThreadNuxFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "DIRECT_INVITE_MODEL_NUX";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.nux_headline);
        Context A0S = AnonymousClass7TE.A0S(igdsHeadline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_profile_share_refresh);
        igdsHeadline.setHeadline(2131959604);
        igdsHeadline.setBody(2131959603);
        FGX A01 = FGX.A01(A0S, AnonymousClass7TE.A0v());
        A01.A05(A0S.getString(2131959601), (CharSequence) null, R.drawable.instagram_mail_pano_outline_24);
        FGX.A03(A01, igdsHeadline, A0S.getString(2131959602), (CharSequence) null, R.drawable.instagram_direct_pano_outline_24);
        C3021461u r1 = (C3021461u) AnonymousClass7TE.A0b(view, R.id.nux_bottom_button);
        r1.setPrimaryActionText(A0S.getString(2131968772));
        r1.setPrimaryActionOnClickListener(FP8.A00(this, 59));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1893216913);
        0qQ.A0B(layoutInflater, 0);
        C47394E0m.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.invite_model_nux_headline, viewGroup, false);
        AnonymousClass0fD.A09(-1372114237, A02);
        return inflate;
    }
}
