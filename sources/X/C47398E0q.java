package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E0q  reason: case insensitive filesystem */
public final class C47398E0q extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ReuseControlsIntroductionBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "REUSE_CONTROLS_INTRODUCTION_BOTTOM_SHEET_FRAGMENT";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.new_remix_introduction_headline);
        Context A0S = AnonymousClass7TE.A0S(igdsHeadline);
        Resources resources = A0S.getResources();
        Boolean A0v = AnonymousClass7TE.A0v();
        FGX A01 = FGX.A01(A0S, A0v);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_qp_reuse_refresh);
        igdsHeadline.setHeadline(2131961847);
        A01.A05((CharSequence) null, resources.getString(2131961842), R.drawable.instagram_sticker_pano_outline_24);
        A01.A05((CharSequence) null, resources.getString(2131961844), R.drawable.instagram_remix_pano_outline_24);
        FGX.A03(A01, igdsHeadline, (CharSequence) null, resources.getString(2131961846), R.drawable.instagram_settings_pano_outline_24);
        AnonymousClass0eM r4 = this.A00;
        1Av A0h = DbX.A0h(r4);
        DbS.A1a(A0h, A0v, A0h.A4n, 1Av.A8a, 331);
        C52345GOp.A06(AnonymousClass7TE.A0l(r4));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(574087702);
        0qQ.A0B(layoutInflater, 0);
        C47398E0q.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_new_remix_introduction_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(-1116891010, A02);
        return inflate;
    }
}
