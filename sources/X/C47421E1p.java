package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E1p  reason: case insensitive filesystem */
public final class C47421E1p extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "OpenCarouselNuxSheetFragment";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public static void A00(Context context, FGX fgx, int i) {
        fgx.A05((CharSequence) null, context.getText(i), R.drawable.instagram_eye_pano_outline_24);
        fgx.A05((CharSequence) null, context.getText(2131968941), R.drawable.instagram_user_circle_pano_outline_24);
        fgx.A05((CharSequence) null, context.getText(2131968942), R.drawable.instagram_delete_pano_outline_24);
        fgx.A05((CharSequence) null, context.getText(2131968940), R.drawable.instagram_carousel_pano_outline_24);
    }

    public final String getModuleName() {
        return "OPEN_CAROUSEL_NUX_SHEET";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        Context context;
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        boolean z3 = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean(AnonymousClass000.A00(1111));
        } else {
            z = false;
        }
        this.A01 = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z2 = bundle3.getBoolean(AnonymousClass000.A00(1110));
        } else {
            z2 = false;
        }
        this.A00 = z2;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            z3 = bundle4.getBoolean(AnonymousClass000.A00(1112));
        }
        this.A02 = z3;
        DbX.A0J(view, R.id.open_carousel_nux_sheet_image).setImageResource(R.drawable.ig_illustrations_illo_add_photos_videos_refresh);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.open_carousel_nux_sheet_headerline);
        boolean z4 = false;
        igdsHeadline.A0E(0, 0, 0, 0);
        Context A0S = AnonymousClass7TE.A0S(igdsHeadline);
        int i2 = 2131969016;
        if (this.A01) {
            i2 = 2131968955;
        }
        igdsHeadline.setHeadline(i2);
        FGX A012 = FGX.A01(A0S, AnonymousClass7TE.A0v());
        if (DbX.A0l(AnonymousClass0t1.A01, this.A03).A0N() == AnonymousClass05K.A0C) {
            z4 = true;
        }
        if (this.A00) {
            if (!z4) {
                A00(A0S, A012, 2131968939);
            } else {
                A00(A0S, A012, 2131968938);
            }
        } else if (this.A01) {
            if (!z4) {
                A012.A05((CharSequence) null, A0S.getText(2131968962), R.drawable.instagram_circle_check_pano_outline_24);
                A012.A05((CharSequence) null, A0S.getText(2131968964), R.drawable.instagram_eye_pano_outline_24);
                A012.A05((CharSequence) null, A0S.getText(2131968965), R.drawable.instagram_user_circle_pano_outline_24);
                A012.A05((CharSequence) null, A0S.getText(2131968963), R.drawable.instagram_delete_pano_outline_24);
                A012.A05((CharSequence) null, A0S.getText(2131968961), R.drawable.instagram_carousel_pano_outline_24);
            } else {
                A012.A05((CharSequence) null, A0S.getText(2131968957), R.drawable.instagram_circle_check_pano_outline_24);
                A012.A05((CharSequence) null, A0S.getText(2131968959), R.drawable.instagram_eye_pano_outline_24);
                A012.A05((CharSequence) null, A0S.getText(2131968960), R.drawable.instagram_user_circle_pano_outline_24);
                A012.A05((CharSequence) null, A0S.getText(2131968958), R.drawable.instagram_delete_pano_outline_24);
                A012.A05((CharSequence) null, A0S.getText(2131968956), R.drawable.instagram_carousel_pano_outline_24);
            }
        } else if (!z4) {
            A012.A05((CharSequence) null, A0S.getText(2131969024), R.drawable.instagram_circle_check_pano_outline_24);
            A012.A05((CharSequence) null, A0S.getText(2131969026), R.drawable.instagram_eye_pano_outline_24);
            A012.A05((CharSequence) null, A0S.getText(2131969027), R.drawable.instagram_user_circle_pano_outline_24);
            A012.A05((CharSequence) null, A0S.getText(2131969025), R.drawable.instagram_delete_pano_outline_24);
            A012.A05((CharSequence) null, A0S.getText(2131969023), R.drawable.instagram_carousel_pano_outline_24);
        } else {
            A012.A05((CharSequence) null, A0S.getText(2131969018), R.drawable.instagram_circle_check_pano_outline_24);
            A012.A05((CharSequence) null, A0S.getText(2131969020), R.drawable.instagram_eye_pano_outline_24);
            A012.A05((CharSequence) null, A0S.getText(2131969022), R.drawable.instagram_globe_pano_outline_24);
            A012.A05((CharSequence) null, A0S.getText(2131969019), R.drawable.instagram_user_circle_pano_outline_24);
            A012.A05((CharSequence) null, A0S.getText(2131969017), R.drawable.instagram_delete_pano_outline_24);
            A012.A05((CharSequence) null, A0S.getText(2131969021), R.drawable.instagram_carousel_pano_outline_24);
        }
        igdsHeadline.setBulletList(A012.A04());
        if (this.A00) {
            C3021461u r2 = (C3021461u) view.findViewById(R.id.open_carousel_nux_sheet_button);
            r2.setVisibility(0);
            Context context2 = r2.getContext();
            r2.setPrimaryActionText(context2.getString(2131968937));
            r2.setPrimaryActionOnClickListener(FP1.A00(this, 12));
            r2.setSecondaryActionText(context2.getString(2131968943));
            r2.setSecondaryActionOnClickListener(FP1.A00(this, 13));
        } else {
            boolean z5 = this.A02;
            C3021461u r22 = (C3021461u) view.findViewById(R.id.open_carousel_nux_sheet_button);
            r22.setVisibility(0);
            AnonymousClass0fU.A00(new C50100FOq(3, (Object) this, z5), r22);
            if (z5) {
                context = r22.getContext();
                i = 2131968772;
            } else if (this.A01) {
                context = r22.getContext();
                i = 2131968989;
            }
            r22.setPrimaryActionText(context.getString(i));
        }
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.learn_more_link_button);
        if (!this.A00) {
            FP1.A01(A0d, 14, this);
            if (!this.A01) {
                DbT.A18(A0d.getContext(), A0d, 2131974593);
                return;
            }
            return;
        }
        A0d.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1741320127);
        0qQ.A0B(layoutInflater, 0);
        C47421E1p.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.open_carousel_nux_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1108812179, A022);
        return inflate;
    }
}
