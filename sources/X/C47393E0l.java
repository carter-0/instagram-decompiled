package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E0l  reason: case insensitive filesystem */
public final class C47393E0l extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SharedStackUpsellBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "SHARED_STACK_UPSELL_BOTTOM_SHEET";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A00;
        0lg A0L = AnonymousClass7TF.A0L(r3, 0);
        boolean z = ((ENY) A0L.A01(ENY.class, new C73920Pm0(A0L, 6))).A00;
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.upsell_bottom_sheet_headerline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_collaborative_albums_refresh);
        int i = 2131973626;
        if (z) {
            i = 2131973629;
        }
        igdsHeadline.setHeadline(i);
        Context A0S = AnonymousClass7TE.A0S(igdsHeadline);
        Resources resources = A0S.getResources();
        FGX A02 = FGX.A02(A0S, true);
        int i2 = 2131973632;
        if (z) {
            i2 = 2131973630;
        }
        String string = resources.getString(i2);
        int i3 = 2131973623;
        if (z) {
            i3 = 2131973628;
        }
        A02.A05(string, resources.getString(i3), R.drawable.instagram_collage_pano_outline_24);
        A02.A05(resources.getString(2131973633), resources.getString(2131973624), R.drawable.instagram_users_pano_outline_24);
        if (182.A06(0Tu.A05, DbT.A0X(r3), 36316448161075586L)) {
            A02.A05(resources.getString(2131973634), resources.getString(2131973625), R.drawable.instagram_new_post_pano_outline_24);
        }
        igdsHeadline.setBulletList(A02.A04());
        C3021461u r1 = (C3021461u) AnonymousClass7TE.A0b(view, R.id.upsell_bottom_sheet_buttons_layout);
        r1.setDividerVisible(true);
        DbZ.A1A(this, r1, 2131973627);
        r1.setPrimaryActionOnClickListener(FP8.A00(this, 44));
        r1.setSecondaryActionText(getString(2131973631));
        r1.setSecondaryActionOnClickListener(FP8.A00(this, 45));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(121779989);
        0qQ.A0B(layoutInflater, 0);
        C47393E0l.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.shared_stack_upsell_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(565587529, A02);
        return inflate;
    }
}
