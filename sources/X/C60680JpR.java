package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.freetransform.widget.ClipTransformItemView;
import com.instagram.music.common.ui.LoadingSpinnerView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.JpR  reason: case insensitive filesystem */
public abstract class C60680JpR extends C249703kE {
    public static final List A00 = 0sr.A1P(new 0eP[]{AnonymousClass7TE.A1L(DbS.A0z(C61781KLu.class), MPP.A00), AnonymousClass7TE.A1L(DbS.A0z(C61782KLv.class), MPQ.A00), AnonymousClass7TE.A1L(DbS.A0z(C61783KLw.class), MPR.A00), AnonymousClass7TE.A1L(DbS.A0z(C61779KLs.class), MPS.A00), AnonymousClass7TE.A1L(DbS.A0z(C61780KLt.class), MPT.A00)});

    public final void A00(C66472MTa mTa, 0sP r12) {
        C61190Jyj jyj;
        C255943uy r0;
        C61192Jyl jyl;
        int i;
        C61188Jyh jyh;
        C61189Jyi jyi;
        C61191Jyk jyk;
        JY5 jy5;
        if (this instanceof C61782KLv) {
            C61782KLv kLv = (C61782KLv) this;
            if ((mTa instanceof C61191Jyk) && (jyk = (C61191Jyk) mTa) != null) {
                IgImageView igImageView = kLv.A01;
                boolean z = jyk.A02;
                int i2 = 8;
                igImageView.setVisibility(DbW.A00(z ? 1 : 0));
                if (igImageView.getVisibility() == 0) {
                    String str = jyk.A00;
                    if (str != null) {
                        Spannable spannable = C306386Ly.A0d;
                        C306386Ly r02 = new C306386Ly(AnonymousClass7TE.A0S(igImageView), igImageView.getWidth());
                        r02.A0M(str);
                        igImageView.setImageDrawable(r02);
                    }
                    String str2 = jyk.A01;
                    if (0qQ.A0K(str2, "None")) {
                        Context context = igImageView.getContext();
                        DbU.A13(context, igImageView, R.drawable.instagram_circle_x_pano_outline_24);
                        DbU.A14(context, igImageView, 2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_06));
                    }
                    Resources A05 = DbU.A05(igImageView);
                    boolean A0K = 0qQ.A0K(str2, "None");
                    int i3 = R.dimen.ad4ad_button_bottom_margin;
                    if (A0K) {
                        i3 = R.dimen.abc_select_dialog_padding_start_material;
                    }
                    int dimensionPixelSize = A05.getDimensionPixelSize(i3);
                    igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    igImageView.setSelected(jyk.A03);
                }
                LoadingSpinnerView loadingSpinnerView = kLv.A02;
                if (z) {
                    i2 = 0;
                }
                loadingSpinnerView.setVisibility(i2);
                if (loadingSpinnerView.getVisibility() == 0) {
                    jy5 = JY5.LOADING;
                } else {
                    jy5 = JY5.SUCCESS;
                }
                loadingSpinnerView.setLoadingStatus(jy5);
                IgTextView igTextView = kLv.A00;
                igTextView.setText(jyk.A01);
                Context context2 = igTextView.getContext();
                boolean z2 = jyk.A03;
                int i4 = R.attr.igds_color_creation_tools_grey_06;
                if (z2) {
                    i4 = R.attr.igds_color_primary_text_on_media;
                }
                JTS.A0u(context2, igTextView, i4);
                LYG.A02(kLv.itemView, 11, jyk, r12);
            }
        } else if (this instanceof C61781KLu) {
            C61781KLu kLu = (C61781KLu) this;
            if ((mTa instanceof C61189Jyi) && (jyi = (C61189Jyi) mTa) != null) {
                IgImageView igImageView2 = kLu.A02;
                boolean z3 = jyi.A03;
                igImageView2.setSelected(z3);
                int i5 = jyi.A00;
                IgTextView igTextView2 = kLu.A01;
                if (i5 == 0) {
                    int i6 = 2131955839;
                    if (182.A06(0Tu.A05, kLu.A00, 36320760307131215L)) {
                        i6 = 2131955840;
                    }
                    igTextView2.setText(i6);
                } else {
                    igTextView2.setText(jyi.A01);
                }
                Context context3 = igTextView2.getContext();
                int i7 = R.attr.igds_color_creation_tools_grey_06;
                if (z3) {
                    i7 = R.attr.igds_color_primary_text_on_media;
                }
                JTS.A0u(context3, igTextView2, i7);
                LYG.A02(igImageView2, 9, r12, jyi);
                LYG.A02(igTextView2, 10, r12, jyi);
                igImageView2.setImageBitmap((Bitmap) null);
                jyi.A02.invoke(Integer.valueOf(i5), new C59112J6u(kLu, 30));
            }
        } else if (this instanceof C61780KLt) {
            C61780KLt kLt = (C61780KLt) this;
            if ((mTa instanceof C61188Jyh) && (jyh = (C61188Jyh) mTa) != null) {
                RoundedCornerFrameLayout roundedCornerFrameLayout = kLt.A02;
                roundedCornerFrameLayout.setSelected(jyh.A04);
                LYG.A02(roundedCornerFrameLayout, 7, jyh, r12);
                kLt.A01.setBackgroundResource(jyh.A00);
                kLt.A00.setText(jyh.A02);
                LYG.A02(kLt.itemView, 8, jyh, r12);
            }
        } else if (this instanceof C61779KLs) {
            C61779KLs kLs = (C61779KLs) this;
            if ((mTa instanceof C61192Jyl) && (jyl = (C61192Jyl) mTa) != null) {
                LYG.A02(kLs.A02, 5, r12, jyl);
                IgTextView igTextView3 = kLs.A00;
                LYG.A02(igTextView3, 6, r12, jyl);
                String str3 = jyl.A06;
                0qQ.A0B(igTextView3, 0);
                if (str3 != null) {
                    switch (AnonymousClass8M2.valueOf(str3).ordinal()) {
                        case 0:
                            i = 2131955922;
                            break;
                        case 1:
                            i = 2131955935;
                            break;
                        case 2:
                            i = 2131955934;
                            break;
                        case 3:
                            i = 2131955948;
                            break;
                        case 4:
                            i = 2131955941;
                            break;
                        case 5:
                            i = 2131955942;
                            break;
                        case 6:
                            i = 2131955945;
                            break;
                        case 7:
                            i = 2131955943;
                            break;
                        case 8:
                            i = 2131955944;
                            break;
                        case 9:
                            i = 2131955946;
                            break;
                        case 10:
                            i = 2131955937;
                            break;
                        case 11:
                            i = 2131955938;
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            i = 2131955939;
                            break;
                        case 13:
                            i = 2131955936;
                            break;
                        case 14:
                            i = 2131955947;
                            break;
                        default:
                            throw AnonymousClass7TE.A1K();
                    }
                    igTextView3.setText(i);
                }
                ClipTransformItemView clipTransformItemView = kLs.A01;
                clipTransformItemView.setVideoAspect(jyl.A04);
                float f = jyl.A01;
                float f2 = jyl.A00;
                float f3 = jyl.A02;
                float f4 = jyl.A03;
                if (!(clipTransformItemView.A01 == f && clipTransformItemView.A00 == f2 && clipTransformItemView.A02 == f3 && clipTransformItemView.A03 == f4)) {
                    clipTransformItemView.A01 = f;
                    clipTransformItemView.A00 = f2;
                    clipTransformItemView.A02 = f3;
                    clipTransformItemView.A03 = f4;
                    ClipTransformItemView.A02(clipTransformItemView);
                }
                clipTransformItemView.setBitmap(jyl.A05);
            }
        } else {
            C61783KLw kLw = (C61783KLw) this;
            if ((mTa instanceof C61190Jyj) && (jyj = (C61190Jyj) mTa) != null) {
                RoundedCornerFrameLayout roundedCornerFrameLayout2 = kLw.A02;
                roundedCornerFrameLayout2.setSelected(jyj.A04);
                LYG.A02(roundedCornerFrameLayout2, 3, r12, jyj);
                Integer num = jyj.A01;
                if (num != null) {
                    kLw.A01.setBackgroundResource(num.intValue());
                }
                kLw.A00.setText(jyj.A02);
                boolean z4 = jyj.A03;
                SpinnerImageView spinnerImageView = kLw.A03;
                if (z4) {
                    r0 = C255943uy.LOADING;
                } else {
                    r0 = C255943uy.LOADED;
                }
                spinnerImageView.setLoadingStatus(r0);
                LYG.A02(kLw.itemView, 4, r12, jyj);
            }
        }
    }
}
