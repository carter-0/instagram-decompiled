package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uas  reason: case insensitive filesystem */
public final class C15342Uas extends AnonymousClass4DH implements AnonymousClass4DU, C301525zS, AnonymousClass4DS, C20930X4v {
    public static final String __redex_internal_original_name = "FeaturedProductCarouselPickerFragment";
    public ReboundHorizontalScrollView A00;
    public 1Xj A01;
    public 1Xj A02;
    public Uw7 A03 = Uw7.A02;
    public TextView A04;
    public String A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = C20697WxT.A00(this, 19);

    public final void D1n(MotionEvent motionEvent, View view) {
    }

    public final void DhI(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
    }

    public final void DhW(C301495zP r1, C301495zP r2, ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public final void DsU(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public final void Dse(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131962222);
    }

    public final String getModuleName() {
        return "instagram_shopping_featured_product_carousel_picker";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (ReboundHorizontalScrollView) view.findViewById(R.id.media_scroll_view);
        this.A04 = AnonymousClass7TE.A0d(view, R.id.caption);
        ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
        if (reboundHorizontalScrollView == null) {
            0qQ.A0F("mediaScrollView");
            throw AnonymousClass00P.createAndThrow();
        }
        reboundHorizontalScrollView.A0A(this);
        A02(this);
    }

    private final void A00() {
        AnonymousClass0eM r5 = this.A07;
        ((C18065Vkr) r5.getValue()).A03("scroll");
        this.A03 = Uw7.A02;
        1Xj r1 = this.A01;
        if (r1 != null) {
            ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
            if (reboundHorizontalScrollView == null) {
                0qQ.A0F("mediaScrollView");
                throw AnonymousClass00P.createAndThrow();
            }
            Integer valueOf = Integer.valueOf(r1.A15(AnonymousClass7TE.A0l(this.A06)));
            VGL.A00(reboundHorizontalScrollView, (C18065Vkr) r5.getValue(), this.A03, valueOf, (Integer) null);
        }
        this.A01 = null;
    }

    private final void A01(int i) {
        1Xj r1;
        1Xj r0 = this.A02;
        if (r0 != null) {
            1Xj A1c = r0.A1c(i);
            0qQ.A0A(A1c);
            if (A1c.CeS()) {
                Integer num = null;
                if (!0qQ.A0K(this.A01, A1c) && (r1 = this.A01) != null) {
                    num = Integer.valueOf(r1.A15(AnonymousClass7TE.A0l(this.A06)));
                }
                this.A01 = A1c;
                this.A03 = Uw7.PREPARING;
                AnonymousClass0eM r4 = this.A07;
                ((C18065Vkr) r4.getValue()).A03("scroll");
                ((C18065Vkr) r4.getValue()).A00(A1c);
                ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
                if (reboundHorizontalScrollView == null) {
                    0qQ.A0F("mediaScrollView");
                    throw AnonymousClass00P.createAndThrow();
                }
                1Xj r12 = this.A01;
                0qQ.A0A(r12);
                Integer valueOf = Integer.valueOf(r12.A15(AnonymousClass7TE.A0l(this.A06)));
                VGL.A00(reboundHorizontalScrollView, (C18065Vkr) r4.getValue(), this.A03, num, valueOf);
                return;
            }
            A00();
        }
    }

    public static final void A02(C15342Uas uas) {
        int i;
        1Xj r9 = uas.A02;
        if (r9 != null) {
            ReboundHorizontalScrollView reboundHorizontalScrollView = uas.A00;
            if (reboundHorizontalScrollView != null) {
                0qQ.A0A(r9);
                UserSession A0l = AnonymousClass7TE.A0l(uas.A06);
                boolean A1Y = DbW.A1Y(A0l);
                Context context = reboundHorizontalScrollView.getContext();
                0qQ.A0A(context);
                int A09 = 0nA.A09(context);
                reboundHorizontalScrollView.A0A = A1Y;
                float A0l2 = r9.A0l();
                int i2 = (int) (((float) A09) * 0.8f);
                float f = (float) i2;
                if (A0l2 < 1.0f) {
                    i = (int) (f * A0l2);
                } else {
                    i = i2;
                    i2 = (int) (f / A0l2);
                }
                reboundHorizontalScrollView.removeAllViews();
                int A0o = r9.A0o();
                for (int i3 = 0; i3 < A0o; i3++) {
                    1Xj A1c = r9.A1c(i3);
                    if (A1c != null) {
                        View A0D = DbT.A0D(LayoutInflater.from(context), reboundHorizontalScrollView, R.layout.carousel_picker_item_media_view, false);
                        VTP vtp = new VTP(A0D);
                        A0D.setTag(vtp);
                        reboundHorizontalScrollView.addView(A0D);
                        MediaFrameLayout mediaFrameLayout = vtp.A01;
                        0nA.A0g(mediaFrameLayout, i, i2);
                        mediaFrameLayout.A00 = A1c.A0l();
                        C247843h0.A00(uas, new C246923fS(A0l).A00(context, A1c), vtp.A00);
                        if (i3 == 0) {
                            0nA.A0d(A0D, context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
                        }
                        0nA.A0U(A0D, DbY.A01(context));
                    }
                }
                ReboundHorizontalScrollView reboundHorizontalScrollView2 = uas.A00;
                if (reboundHorizontalScrollView2 != null) {
                    uas.A01(reboundHorizontalScrollView2.getCurrentChildIndex());
                    return;
                }
            }
            0qQ.A0F("mediaScrollView");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dqc(View view, int i) {
        ArrayList arrayList;
        List<Object> C2n;
        A00();
        ((C18065Vkr) this.A07.getValue()).A03("tapped");
        1Xj r0 = this.A02;
        0qQ.A0A(r0);
        1Xj A1c = r0.A1c(i);
        0qQ.A0A(A1c);
        this.A05 = A1c.getId();
        C249713kF r3 = C249713kF.A00;
        UserSession A0l = AnonymousClass7TE.A0l(this.A06);
        Integer num = AnonymousClass05K.A0j;
        C16581Uxb uxb = C16581Uxb.FEATURED_PRODUCT_MEDIA;
        1Xj r02 = this.A02;
        0qQ.A0A(r02);
        C46284DTn B4x = r02.A0C.B4x();
        if (B4x == null || (C2n = B4x.C2n()) == null) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass7TG.A0r(C2n);
            for (Object A0R : C2n) {
                arrayList.add(String.valueOf(AnonymousClass7TE.A0R(A0R)));
            }
        }
        r3.A0l(this, A0l, new ProductPickerArguments(uxb, num, "instagram_shopping_featured_product_carousel_picker", (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, arrayList, false, false, true, true));
    }

    public final void DyR(1Xj r6, C270194gL r7) {
        this.A03 = Uw7.PLAYING;
        1Xj r1 = this.A01;
        if (r1 != null) {
            ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
            if (reboundHorizontalScrollView == null) {
                0qQ.A0F("mediaScrollView");
                throw AnonymousClass00P.createAndThrow();
            }
            Integer valueOf = Integer.valueOf(r1.A15(AnonymousClass7TE.A0l(this.A06)));
            VGL.A00(reboundHorizontalScrollView, (C18065Vkr) this.A07.getValue(), this.A03, (Integer) null, valueOf);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1 && i == 3) {
            Parcelable parcelableExtra = intent.getParcelableExtra("selected_product");
            if (!(parcelableExtra == null || this.A05 == null)) {
                Intent intent2 = new Intent();
                intent2.putExtra("selected_product", parcelableExtra);
                intent2.putExtra("media_id", this.A05);
                requireActivity().setResult(-1, intent2);
            }
            DbT.A1K(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2101166086);
        C15342Uas.super.onCreate(bundle);
        String A012 = C320236s2.A01(requireArguments(), "media_id");
        AnonymousClass0eM r1 = this.A06;
        1Xj A023 = DbX.A0d(r1).A02(A012);
        this.A02 = A023;
        if (A023 == null) {
            1OC A042 = C3724090s.A04(AnonymousClass7TE.A0l(r1), A012);
            C15622Ufo.A00(A042, this, 13);
            schedule(A042);
        }
        AnonymousClass0fD.A09(-1193410012, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(36255109);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_featured_product_carousel_picker, false);
        AnonymousClass0fD.A09(1622285913, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-2102693147);
        C15342Uas.super.onPause();
        A00();
        ((C18065Vkr) this.A07.getValue()).A02("fragment_paused");
        AnonymousClass0fD.A09(1159285414, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1057819033);
        super.onResume();
        ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
        if (reboundHorizontalScrollView == null) {
            0qQ.A0F("mediaScrollView");
            throw AnonymousClass00P.createAndThrow();
        }
        A01(reboundHorizontalScrollView.getCurrentChildIndex());
        AnonymousClass0fD.A09(-954483389, A022);
    }

    public final void DKQ(ReboundHorizontalScrollView reboundHorizontalScrollView, int i, int i2) {
        A01(i);
    }
}
