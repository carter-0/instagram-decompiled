package X;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import com.instagram.android.R;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.io.Serializable;

/* renamed from: X.H0j  reason: case insensitive filesystem */
public final class C54139H0j extends AnonymousClass4DH implements AnonymousClass0iw, X97, C20906X3x {
    public static final String __redex_internal_original_name = "WorldPagesFragment";
    public HOV A00;
    public 1Xj A01;
    public MapBottomSheetBehavior A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final float AP4(float f, float f2, float f3) {
        return f3 > 0.0f ? (f < 0.7f || f2 < 0.7f) ? 0.55f : 0.7f : (f > 0.7f || f2 > 0.7f) ? 1.0f : 0.7f;
    }

    public final void Cxy() {
    }

    public final void DCD() {
    }

    public final void DhJ(MapBottomSheetBehavior mapBottomSheetBehavior, float f, float f2, float f3) {
    }

    public final void DhQ(MapBottomSheetBehavior mapBottomSheetBehavior, float f) {
    }

    public final void Dja() {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, X.5n1] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String iconicHorizonWorldDeeplink;
        WorldLocationPagesInfo CGk;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        HOV hov = this.A00;
        if (hov != null) {
            AnonymousClass0eM r6 = this.A03;
            UserSession A0l = AnonymousClass7TE.A0l(r6);
            1Xj r13 = this.A01;
            String str2 = "entryMedia";
            if (r13 != null) {
                0qQ.A0B(A0l, 1);
                C55209Hdz.A00(hov, this, A0l, r13, AnonymousClass05K.A01, (String) null, AnonymousClass7TE.A1H());
                ImageView A0J = DbX.A0J(view2, R.id.modal_close_button);
                Drawable drawable = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
                if (drawable != null) {
                    A0J.setImageDrawable(new C52794Gcl(requireActivity(), drawable));
                }
                ID1.A01(A0J, 63, this);
                IgImageView A0b = DbX.A0b(view2, R.id.background_cover);
                1Xj r2 = this.A01;
                if (r2 != null) {
                    JSO A0l2 = C51966G9m.A0l(r2);
                    if (A0l2 == null || (CGk = A0l2.CGk()) == null) {
                        str = null;
                    } else {
                        str = CGk.getCoverPhoto();
                    }
                    DbV.A1P(this, A0b, str);
                    IgdsMediaButton igdsMediaButton = (IgdsMediaButton) AnonymousClass7TF.A0F(view2, R.id.go_to_world_button);
                    1Xj r22 = this.A01;
                    if (r22 != null) {
                        JSO A0l3 = C51966G9m.A0l(r22);
                        if (!(A0l3 == null || (iconicHorizonWorldDeeplink = A0l3.getIconicHorizonWorldDeeplink()) == null)) {
                            AnonymousClass0fU.A00(new IB2(iconicHorizonWorldDeeplink, this, 2), igdsMediaButton);
                            ? obj = new Object();
                            obj.A00 = R.drawable.instagram_app_horizon_pano_filled_16;
                            igdsMediaButton.setStartAddOn(obj, DbV.A05(this).getString(2131976902));
                            igdsMediaButton.setVisibility(0);
                            HOV hov2 = this.A00;
                            if (hov2 != null) {
                                UserSession A0l4 = AnonymousClass7TE.A0l(r6);
                                1Xj r132 = this.A01;
                                if (r132 != null) {
                                    0qQ.A0B(A0l4, 1);
                                    C55209Hdz.A00(hov2, this, A0l4, r132, AnonymousClass05K.A0u, (String) null, AnonymousClass7TE.A1H());
                                }
                            }
                        }
                        Resources A0A = AnonymousClass7TF.A0A(requireActivity());
                        View A0G = AnonymousClass7TF.A0G(view2, R.id.bottom_sheet);
                        this.A02 = VBZ.A00(A0G);
                        Guideline A0F = AnonymousClass7TF.A0F(view2, R.id.status_bar_adjustment_guideline);
                        MapBottomSheetBehavior mapBottomSheetBehavior = this.A02;
                        str2 = "bottomSheetBehavior";
                        if (mapBottomSheetBehavior != null) {
                            mapBottomSheetBehavior.A03 = this;
                            mapBottomSheetBehavior.A02 = this;
                            mapBottomSheetBehavior.A04 = Float.valueOf(0.55f);
                            ImageView A0J2 = DbX.A0J(A0G, R.id.shadow);
                            int A0G2 = 2Yu.A0G(requireActivity(), R.attr.bottomSheetTopCornerRadius);
                            int A0B = AnonymousClass7TE.A0B(A0A);
                            float[] fArr = new float[8];
                            float f = (float) A0G2;
                            fArr[0] = f;
                            fArr[1] = f;
                            fArr[2] = f;
                            fArr[3] = f;
                            fArr[4] = 0.0f;
                            C51975G9x.A1L(fArr, 0.0f);
                            A0J2.setImageDrawable(new C14664U0k(new RoundRectShape(fArr, (RectF) null, (float[]) null), (float) A0B, Color.argb(Math.round(63.75f), 0, 0, 0), A0B));
                            A0F.setGuidelineBegin(2db.A01(requireActivity()) - A0B);
                            0s1 A0D = DbW.A0D(requireActivity());
                            A0D.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
                            Bundle requireArguments = requireArguments();
                            C54140H0k h0k = new C54140H0k();
                            Bundle A0a = AnonymousClass7TE.A0a();
                            A0a.putString("arg_entry_media_id", requireArguments.getString("arg_entry_media_id"));
                            A0a.putSerializable("arg_entry_surface", requireArguments.getSerializable("arg_entry_surface"));
                            h0k.setArguments(A0a);
                            A0D.A0A(h0k, R.id.fragment_container);
                            A0D.A00();
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("entrySurface");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cyl() {
        MapBottomSheetBehavior mapBottomSheetBehavior = this.A02;
        if (mapBottomSheetBehavior == null) {
            0qQ.A0F("bottomSheetBehavior");
            throw AnonymousClass00P.createAndThrow();
        } else {
            mapBottomSheetBehavior.A0R(true, 0.7f);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1328538718);
        C54139H0j.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("arg_entry_surface");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.IgWorldPagesSurface");
        this.A00 = (HOV) serializable;
        1E8 A0d = DbX.A0d(this.A03);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("arg_entry_media_id");
        } else {
            str = null;
        }
        1Xj A023 = A0d.A02(str);
        if (A023 != null) {
            this.A01 = A023;
            AnonymousClass0fD.A09(-1492434053, A022);
            return;
        }
        IllegalArgumentException A0w = AnonymousClass7TE.A0w("Entry Media must be provided");
        AnonymousClass0fD.A09(1287746220, A022);
        throw A0w;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-542272140);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_world_pages_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1828220057, A022);
        return inflate;
    }
}
