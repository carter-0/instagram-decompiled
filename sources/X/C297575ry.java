package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import com.instagram.api.schemas.TrackData;
import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.5ry  reason: invalid class name and case insensitive filesystem */
public abstract class C297575ry {
    /* JADX WARNING: type inference failed for: r6v19, types: [com.instagram.clips.animatedthumbnail.AnimatedThumbnailView, android.view.View, java.lang.Object, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public static final void A01(Context context, C61074JwC jwC, C267324bN r31, AnonymousClass0iw r32, UserSession userSession, AnonymousClass3W1 r34, C68154N2u n2u, C297595s1 r36, C229332nD r37, C292805jY r38, Integer num, List list, boolean z, boolean z2) {
        View view;
        MusicInfo BUr;
        TrackData BUk;
        List ByT;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        C297595s1 r2 = r36;
        0qQ.A0B(r2, 2);
        AnonymousClass3W1 r28 = r34;
        0qQ.A0B(r28, 4);
        AnonymousClass0iw r29 = r32;
        0qQ.A0B(r29, 6);
        C267324bN r8 = r31;
        1Xj r15 = r8.A02;
        if (r15 != null) {
            r2.A01 = r8;
            AnonymousClass3W1 r4 = r28;
            r4.A2p = true;
            r2.A02 = r4;
            r2.A03 = n2u;
            0Tu r42 = 0Tu.A05;
            boolean z3 = false;
            if (182.A06(r42, userSession2, 36318196211193841L) || (r38 != null && r38.A00())) {
                z3 = true;
            }
            float f = 1.0f;
            if (z3) {
                view = r2.itemView;
            } else {
                TypedValue typedValue = new TypedValue();
                context2.getTheme().resolveAttribute(R.attr.seenMediaAlpha, typedValue, true);
                float f2 = typedValue.getFloat();
                view = r2.itemView;
                if (((AbstractCollection) r37.A02.A04).contains(r8.getId())) {
                    f = f2;
                }
            }
            view.setAlpha(f);
            ExtendedImageUrl A1m = r15.A1m(r2.A00);
            if (A1m != null) {
                ? r6 = r2.A06;
                IgImageView igImageView = r2.A0E;
                SpritesheetInfo A1q = r15.A1q();
                0qQ.A0B(r6, 3);
                0qQ.A0B(igImageView, 4);
                if (A1q == null || (ByT = A1q.ByT()) == null || 00k.A0O(ByT, 0) == null || !z) {
                    igImageView.A0I = null;
                    igImageView.A0A = new C247833gz();
                    igImageView.A0K = r15.BTL();
                    igImageView.setUrl(A1m, r29);
                    igImageView.setVisibility(0);
                    r6.setVisibility(8);
                } else {
                    r6.A00 = 0.5625f;
                    AnimatedThumbnailView animatedThumbnailView = r6;
                    animatedThumbnailView.A0I(r29, A1q, 182.A00(r42, userSession2, 37158695541145689L), 182.A01(r42, userSession2, 36595745587333365L), 182.A06(r42, userSession2, 36314270611147261L));
                    r6.setVisibility(0);
                    igImageView.setVisibility(8);
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            IgTextView igTextView = r2.A0C;
            igTextView.setLayoutParams(layoutParams);
            IgTextView igTextView2 = r2.A0B;
            igTextView2.setLayoutParams(layoutParams);
            View view2 = r2.A05;
            view2.setVisibility(8);
            View view3 = r2.A04;
            view3.setVisibility(8);
            r2.A0A.setVisibility(8);
            igTextView.setVisibility(8);
            igTextView2.setVisibility(8);
            C252063oV r82 = r2.A0G;
            r82.setVisibility(8);
            r2.A0D.setVisibility(8);
            IgSimpleImageView igSimpleImageView = r2.A08;
            igSimpleImageView.setVisibility(8);
            r2.A09.setVisibility(8);
            if (num == AnonymousClass05K.A01) {
                Resources resources = context2.getResources();
                C67231sQ clipsMetadata = r15.A1Y().A00.getClipsMetadata();
                if (clipsMetadata == null || (BUr = clipsMetadata.BUr()) == null || (BUk = BUr.BUk()) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 1;
                String title = BUk.getTitle();
                String str = "";
                String str2 = str;
                if (title == null) {
                    title = str;
                }
                igTextView.setLayoutParams(layoutParams2);
                igTextView.setText(title);
                igTextView.setContentDescription(str);
                igTextView.setVisibility(0);
                C297635s5.A00 = true;
                String displayArtist = BUk.getDisplayArtist();
                if (displayArtist != null) {
                    str = displayArtist;
                }
                igTextView2.setLayoutParams(layoutParams2);
                igTextView2.setText(str);
                igTextView2.setContentDescription(str2);
                igTextView2.setVisibility(0);
                C297635s5.A00 = true;
                GIH gih = new GIH(context2, (GJO) null, resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0, 0, 0, -1, false);
                ImageUrl Arr = BUk.Arr();
                ((ImageView) r82.getView()).setImageDrawable(gih);
                JYP.A00((ImageView) r82.getView(), Arr);
                r82.setVisibility(0);
                C297635s5.A00 = true;
                view2.setVisibility(0);
            }
            C61074JwC jwC2 = jwC;
            if (jwC != null) {
                C61080JwI jwI = (C61080JwI) jwC2.A02;
                if (jwI != null) {
                    C297635s5.A00(context2, jwI, r29, userSession2, r15, r2);
                }
                C61080JwI jwI2 = (C61080JwI) jwC2.A03;
                if (jwI2 != null) {
                    C297635s5.A00(context2, jwI2, r29, userSession2, r15, r2);
                }
                C61080JwI jwI3 = (C61080JwI) jwC2.A00;
                if (jwI3 != null) {
                    C297635s5.A00(context2, jwI3, r29, userSession2, r15, r2);
                }
                C61080JwI jwI4 = (C61080JwI) jwC2.A01;
                if (jwI4 != null) {
                    C297635s5.A00(context2, jwI4, r29, userSession2, r15, r2);
                }
            } else {
                List list2 = list;
                if (list != null && !list2.isEmpty()) {
                    C297635s5.A01(r29, igSimpleImageView, list2);
                }
            }
            if (C297635s5.A00) {
                view3.setVisibility(0);
            }
            if (z2 && 182.A06(r42, userSession2, 36325884201809220L)) {
                C250563lf.A0f(new AnonymousClass9IQ((Integer) null, 6, r15.A6W(userSession2)), r2.A07, r28);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.instagram.clips.animatedthumbnail.AnimatedThumbnailView, android.view.View] */
    public static final C297595s1 A00(Context context, ViewGroup viewGroup, RIXUCoverSize rIXUCoverSize, AnonymousClass0iw r14, UserSession userSession, AnonymousClass49Q r16, C292805jY r17, boolean z, boolean z2, boolean z3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        Integer num;
        int i;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int ordinal;
        AnonymousClass9I1 r5;
        float f;
        int ordinal2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float A04;
        RoundedCornerFrameLayout roundedCornerFrameLayout2;
        RoundedCornerFrameLayout roundedCornerFrameLayout3;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(viewGroup, 2);
        0qQ.A0B(r14, 7);
        View inflate = LayoutInflater.from(context).inflate(R.layout.clips_netego_card, viewGroup, false);
        C292805jY r6 = r17;
        if (r17 != null && r6.A00()) {
            0qQ.A0A(inflate);
            RIXULayoutStyle rIXULayoutStyle = r6.A02;
            if (rIXULayoutStyle != null) {
                int ordinal3 = rIXULayoutStyle.ordinal();
                if (ordinal3 != 1) {
                    if (ordinal3 == 2 && (inflate instanceof RoundedCornerFrameLayout) && (roundedCornerFrameLayout3 = (RoundedCornerFrameLayout) inflate) != null) {
                        roundedCornerFrameLayout3.setCornerRadius(0);
                        roundedCornerFrameLayout3.setStrokeWidth(0.0f);
                    }
                } else if ((inflate instanceof RoundedCornerFrameLayout) && (roundedCornerFrameLayout2 = (RoundedCornerFrameLayout) inflate) != null) {
                    roundedCornerFrameLayout2.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
                }
            }
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(0);
        } else if (z3 && 182.A06(0Tu.A05, userSession, 36325884202530122L)) {
            0qQ.A0A(inflate);
            if ((inflate instanceof RoundedCornerFrameLayout) && (roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate) != null) {
                roundedCornerFrameLayout.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            }
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMarginEnd(dimensionPixelSize3);
            }
        }
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        C297595s1 r4 = new C297595s1(inflate);
        inflate.setTag(r4);
        AnonymousClass49Q r52 = r16;
        C297605s2 r1 = new C297605s2(r52, r4, z);
        AnonymousClass0fU.A00(r1, inflate);
        inflate.setOnTouchListener(new C297615s3(context, r14, r52, r4));
        AnonymousClass0fU.A00(r1, r4.A06);
        r4.A0E.A0E = new C297625s4(r52, r4);
        Context context2 = inflate.getContext();
        0qQ.A07(context2);
        if (r17 != null && r6.A00()) {
            int A01 = AnonymousClass0nB.A01(context2);
            RIXUAspectRatio rIXUAspectRatio = r6.A00;
            if (rIXUAspectRatio != null) {
                int ordinal4 = rIXUAspectRatio.ordinal();
                if (ordinal4 == 1) {
                    f = 1.7777778f;
                } else if (ordinal4 == 2) {
                    f = 1.3333334f;
                }
                RIXULayoutFormat rIXULayoutFormat = r6.A01;
                if (rIXULayoutFormat == null) {
                    ordinal2 = -1;
                } else {
                    ordinal2 = rIXULayoutFormat.ordinal();
                }
                if (ordinal2 == 2) {
                    RIXULayoutStyle rIXULayoutStyle2 = r6.A02;
                    if (rIXULayoutStyle2 != null) {
                        int ordinal5 = rIXULayoutStyle2.ordinal();
                        if (ordinal5 == 1) {
                            f2 = ((float) (A01 - (context2.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2))) - 0nA.A04(context2, 8);
                            f3 = 2.0f;
                            f4 = f2 / f3;
                            r5 = new AnonymousClass9I1((int) f4, (int) (f4 * f), 2);
                            ViewGroup.LayoutParams layoutParams3 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                            int i3 = r5.A01;
                            layoutParams3.width = i3;
                            layoutParams3.height = r5.A00;
                            r4.A00 = i3;
                            return r4;
                        } else if (ordinal5 == 2) {
                            f5 = 2.0f;
                            f6 = ((float) A01) / 2.0f;
                            A04 = 0nA.A04(context2, 1);
                        }
                    }
                    throw new IllegalArgumentException("Invalid grid layout style");
                } else if (ordinal2 == 3) {
                    RIXULayoutStyle rIXULayoutStyle3 = r6.A02;
                    if (rIXULayoutStyle3 != null) {
                        int ordinal6 = rIXULayoutStyle3.ordinal();
                        if (ordinal6 == 1) {
                            f2 = ((float) (A01 - (context2.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2))) - (2.0f * 0nA.A04(context2, 8));
                            f3 = 3.0f;
                            f4 = f2 / f3;
                            r5 = new AnonymousClass9I1((int) f4, (int) (f4 * f), 2);
                            ViewGroup.LayoutParams layoutParams32 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                            int i32 = r5.A01;
                            layoutParams32.width = i32;
                            layoutParams32.height = r5.A00;
                            r4.A00 = i32;
                            return r4;
                        } else if (ordinal6 == 2) {
                            f6 = ((float) A01) / 3.0f;
                            A04 = 0nA.A04(context2, 1);
                            f5 = 2.0f;
                        }
                    }
                    throw new IllegalArgumentException("Invalid grid layout style");
                }
                f4 = f6 - (A04 / f5);
                r5 = new AnonymousClass9I1((int) f4, (int) (f4 * f), 2);
                ViewGroup.LayoutParams layoutParams322 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                int i322 = r5.A01;
                layoutParams322.width = i322;
                layoutParams322.height = r5.A00;
                r4.A00 = i322;
                return r4;
            }
            throw new IllegalArgumentException("Invalid grid aspect ratio");
        }
        if (z3) {
            0Tu r62 = 0Tu.A05;
            if (182.A06(r62, userSession, 36325884202530122L)) {
                int A012 = (int) 182.A01(r62, userSession, 36607359179298364L);
                float A00 = (float) 182.A00(r62, userSession, 37170309132780041L);
                int A013 = AnonymousClass0nB.A01(context2);
                int dimensionPixelSize4 = context2.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * (A012 + 1);
                int dimensionPixelSize5 = (((A013 - dimensionPixelSize4) - (context2.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin) * ((A012 * 2) + 1))) - ((int) 0nA.A04(context2, 48))) / A012;
                r5 = new AnonymousClass9I1(dimensionPixelSize5, (int) (((float) dimensionPixelSize5) * A00), 2);
                ViewGroup.LayoutParams layoutParams3222 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                int i3222 = r5.A01;
                layoutParams3222.width = i3222;
                layoutParams3222.height = r5.A00;
                r4.A00 = i3222;
                return r4;
            }
        }
        0Tu r63 = 0Tu.A05;
        float A002 = (float) 182.A00(r63, userSession, 37170309132452359L);
        float A003 = (float) 182.A00(r63, userSession, 37170309132517896L);
        if (!z3 || z2 || A002 <= 0.0f || A003 <= 0.0f) {
            A002 = (float) 182.A00(r63, userSession, 37166258977767854L);
            A003 = (float) 182.A00(r63, userSession, 37166258977833391L);
            if (z2 || A002 <= 0.0f || A003 <= 0.0f) {
                if (!(rIXUCoverSize == null || (ordinal = rIXUCoverSize.ordinal()) == -1)) {
                    if (ordinal == 1) {
                        num = Integer.valueOf(R.dimen.avatar_sticker_max_height);
                        i = R.dimen.ai_agent_embodiment_video_container_size;
                    } else if (ordinal == 3) {
                        num = Integer.valueOf(R.dimen.clips_netego_card_width_medium);
                        i = R.dimen.clips_netego_card_height_medium;
                    } else if (ordinal == 4) {
                        num = Integer.valueOf(R.dimen.alert_dialog_width);
                        i = R.dimen.clips_netego_card_height_large;
                    } else if (!(ordinal == 0 || ordinal == 2)) {
                        throw new RuntimeException();
                    }
                    Integer valueOf = Integer.valueOf(i);
                    int intValue = num.intValue();
                    int intValue2 = valueOf.intValue();
                    Resources resources = context2.getResources();
                    dimensionPixelSize = resources.getDimensionPixelSize(intValue);
                    dimensionPixelSize2 = resources.getDimensionPixelSize(intValue2);
                    r5 = new AnonymousClass9I1(dimensionPixelSize, dimensionPixelSize2, 2);
                    ViewGroup.LayoutParams layoutParams32222 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                    int i32222 = r5.A01;
                    layoutParams32222.width = i32222;
                    layoutParams32222.height = r5.A00;
                    r4.A00 = i32222;
                    return r4;
                }
                num = Integer.valueOf(R.dimen.clips_netego_card_width);
                i = R.dimen.clips_netego_card_height;
                Integer valueOf2 = Integer.valueOf(i);
                int intValue3 = num.intValue();
                int intValue22 = valueOf2.intValue();
                Resources resources2 = context2.getResources();
                dimensionPixelSize = resources2.getDimensionPixelSize(intValue3);
                dimensionPixelSize2 = resources2.getDimensionPixelSize(intValue22);
                r5 = new AnonymousClass9I1(dimensionPixelSize, dimensionPixelSize2, 2);
                ViewGroup.LayoutParams layoutParams322222 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                int i322222 = r5.A01;
                layoutParams322222.width = i322222;
                layoutParams322222.height = r5.A00;
                r4.A00 = i322222;
                return r4;
            }
        }
        dimensionPixelSize = AnonymousClass1GB.A01(0nA.A00(context2, A002));
        dimensionPixelSize2 = AnonymousClass1GB.A01(0nA.A00(context2, A003));
        r5 = new AnonymousClass9I1(dimensionPixelSize, dimensionPixelSize2, 2);
        ViewGroup.LayoutParams layoutParams3222222 = inflate.findViewById(R.id.preview_container).getLayoutParams();
        int i3222222 = r5.A01;
        layoutParams3222222.width = i3222222;
        layoutParams3222222.height = r5.A00;
        r4.A00 = i3222222;
        return r4;
    }
}
