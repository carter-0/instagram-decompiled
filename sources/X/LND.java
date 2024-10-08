package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Arrays;

public final class LND {
    public static final View A00(ViewGroup viewGroup, AnonymousClass0iw r6, UserSession userSession, boolean z, boolean z2) {
        View inflate = DbV.A0D(viewGroup).inflate(R.layout.asset_grid_row_item, viewGroup, false);
        1QU r0 = LN9.A0C;
        0qQ.A0A(inflate);
        inflate.setTag(new LN9(inflate, r6, userSession));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (z) {
            Resources resources = viewGroup.getResources();
            int i = R.dimen.asset_picker_cell_margin;
            if (z2) {
                i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
            layoutParams.setMarginEnd(resources.getDimensionPixelSize(i));
        }
        inflate.setLayoutParams(layoutParams);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void A01(AnonymousClass0iw r17, UserSession userSession, C357638Yz r19, C314236hs r20, LN9 ln9, C317466nJ r22) {
        String name;
        String str;
        int i;
        String str2;
        C318046oG r1;
        String str3;
        int i2;
        SimpleImageUrl CCI;
        ImageView.ScaleType scaleType;
        Drawable drawable;
        String str4;
        Context context;
        C279284yO r0;
        A66 A01;
        ImageView.ScaleType scaleType2;
        C347017w8 r12;
        KKA kka;
        Drawable drawable2;
        C321016tR r13;
        C347017w8 r14;
        Drawable drawable3;
        C321016tR r15;
        C347017w8 r16;
        C321016tR r152;
        C347017w8 r153;
        C321016tR r9;
        C347017w8 r132;
        C317466nJ r02;
        LN9 ln92 = ln9;
        0qQ.A0B(ln92, 1);
        C317466nJ r6 = r22;
        0qQ.A0B(r6, 3);
        if (r6.CAW() == C317476nK.PLUS_BUTTON || (r02 = ln92.A02) == null || Arrays.hashCode(new Object[]{r02}) != Arrays.hashCode(new Object[]{r6})) {
            C317476nK CAW = r6.CAW();
            int ordinal = CAW.ordinal();
            String str5 = "";
            if (ordinal == 1) {
                C317486nL B0p = r6.B0p();
                if (B0p != null) {
                    str5 = B0p.A01;
                }
                name = CAW.name();
                str = str5;
            } else if (ordinal == 0) {
                C317876nz BzU = r6.BzU();
                if (BzU != null) {
                    str = BzU.A0Z;
                    String name2 = BzU.A00().name();
                    if (name2 != null) {
                        str5 = name2;
                    }
                } else {
                    str = str5;
                }
                name = str5;
            } else if (ordinal == 2) {
                name = CAW.name();
                str = "plus_button_id";
            } else {
                throw AnonymousClass7TE.A1K();
            }
            UserSession userSession2 = userSession;
            if (str.length() > 0 && name.length() > 0) {
                27p.A01(userSession2).A01.A02(str, name);
            }
            boolean z = false;
            if (r6.CAW() == C317476nK.EMOJI) {
                i = ln92.A04;
            } else {
                i = 0;
            }
            ln92.A08.A02();
            ? r4 = ln92.A09;
            r4.setPadding(i, i, i, i);
            r4.setVisibility(DbW.A01(r6.CKf() ? 1 : 0));
            IgImageView igImageView = ln92.A0A;
            boolean z2 = r6 instanceof KKA;
            if (z2) {
                Drawable drawable4 = igImageView.getDrawable();
                Drawable drawable5 = null;
                if ((drawable4 instanceof C347017w8) && (r132 = (C347017w8) drawable4) != null) {
                    drawable5 = JTR.A0S(r132);
                }
                if ((drawable5 instanceof C321016tR) && (r9 = (C321016tR) drawable5) != null) {
                    r9.A06();
                }
            } else {
                igImageView.A09();
            }
            igImageView.setPadding(i, i, i, i);
            igImageView.setVisibility(0);
            igImageView.setFocusable(true);
            Context context2 = igImageView.getContext();
            int ordinal2 = r6.CAW().ordinal();
            C314236hs r92 = r20;
            if (ordinal2 != -1) {
                AnonymousClass0iw r142 = r17;
                if (ordinal2 == 1) {
                    C317486nL B0p2 = r6.B0p();
                    if (B0p2 != null) {
                        int i3 = B0p2.A00;
                        if (i3 < 0) {
                            i2 = -1;
                        } else {
                            i2 = i3 % 6;
                        }
                        int width = igImageView.getWidth() - (i * 2);
                        if (i2 < 0 || width <= 0) {
                            CCI = r6.CCI();
                            igImageView.setImageMatrix((Matrix) null);
                            scaleType = ImageView.ScaleType.FIT_CENTER;
                        } else {
                            float f = (float) width;
                            int i4 = ln92.A05;
                            float f2 = f / ((float) i4);
                            Matrix matrix = ln92.A06;
                            matrix.reset();
                            matrix.setTranslate((float) ((-i2) * i4), 0.0f);
                            matrix.postScale(f2, f2);
                            CCI = C337087ff.A00(userSession2, B0p2, ln92.A03);
                            igImageView.setImageMatrix(matrix);
                            scaleType = ImageView.ScaleType.MATRIX;
                        }
                        igImageView.setScaleType(scaleType);
                        if (CCI != null) {
                            igImageView.setUrl(CCI, r142);
                        }
                        str3 = B0p2.A02;
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else if (ordinal2 == 0) {
                    C317876nz BzU2 = r6.BzU();
                    if (BzU2 != null) {
                        Drawable drawable6 = igImageView.getDrawable();
                        String str6 = null;
                        if (!(drawable6 instanceof C347017w8) || (r153 = (C347017w8) drawable6) == null) {
                            drawable = null;
                        } else {
                            drawable = JTR.A0S(r153);
                        }
                        if ((drawable instanceof C321016tR) && (r152 = (C321016tR) drawable) != null) {
                            str6 = r152.A0k;
                        }
                        C317876nz BzU3 = r6.BzU();
                        if (BzU3 != null) {
                            str4 = BzU3.A0Z;
                        } else {
                            str4 = null;
                        }
                        if (0qQ.A0K(str6, str4)) {
                            A01 = new A66(igImageView.getDrawable(), (Integer) null, AnonymousClass7TE.A16(context2, 2131968497));
                        } else {
                            if (z2) {
                                context = new C251383n1(context2, (int) R.style.IgdsSemanticColorsDark);
                            } else {
                                context = context2;
                            }
                            0qQ.A0A(context);
                            C357638Yz r03 = r19;
                            if (r19 != null) {
                                r0 = (C279284yO) r03.A08.A00;
                            } else {
                                r0 = null;
                            }
                            r142.getModuleName();
                            A01 = AJA.A01(context, userSession2, r0, r92, BzU2);
                        }
                        if (z2 && (kka = (KKA) r6) != null) {
                            if (kka.A03) {
                                Bitmap decodeResource = BitmapFactory.decodeResource(context2.getResources(), R.drawable.magicmod__beta_backdrop_grid);
                                0qQ.A07(decodeResource);
                                igImageView.setBackground(new C59975Jck(decodeResource, context2.getResources().getDimension(R.dimen.abc_edit_text_inset_top_material)));
                                int A08 = C51972G9s.A08(context2);
                                igImageView.setPadding(A08, A08, A08, A08);
                                if (182.A06(0Tu.A05, userSession2, 36323805438357021L)) {
                                    igImageView.A00 = 0.5625f;
                                    ComposeView composeView = ln92.A07;
                                    composeView.setVisibility(0);
                                    composeView.setContent(AnonymousClass5PI.A04(new C59112J6u(userSession2, 16), -162120927, true));
                                }
                            }
                            C62476KgR kgR = kka.A00;
                            C62476KgR kgR2 = C62476KgR.A03;
                            IgImageView igImageView2 = ln92.A0B;
                            if (kgR != kgR2) {
                                igImageView2.setVisibility(0);
                                LY8.A00(igImageView2, 45, kka, A01);
                                if (kgR == C62476KgR.PLAYING) {
                                    z = true;
                                }
                                igImageView2.setSelected(z);
                            } else {
                                igImageView2.setVisibility(8);
                            }
                            boolean z3 = kka.A02;
                            Drawable drawable7 = A01.A00;
                            boolean z4 = drawable7 instanceof C347017w8;
                            if (z3) {
                                if (!z4 || (r16 = (C347017w8) drawable7) == null) {
                                    drawable3 = null;
                                } else {
                                    drawable3 = JTR.A0S(r16);
                                }
                                if ((drawable3 instanceof C321016tR) && (r15 = (C321016tR) drawable3) != null) {
                                    r15.A05();
                                }
                            } else {
                                if (!z4 || (r14 = (C347017w8) drawable7) == null) {
                                    drawable2 = null;
                                } else {
                                    drawable2 = JTR.A0S(r14);
                                }
                                if ((drawable2 instanceof C321016tR) && (r13 = (C321016tR) drawable2) != null) {
                                    r13.A07();
                                }
                            }
                        }
                        Drawable drawable8 = A01.A00;
                        igImageView.setImageDrawable(drawable8);
                        if (z2) {
                            if ((drawable8 instanceof C347017w8) && (r12 = (C347017w8) drawable8) != null) {
                                00k.A0A(r12.A05());
                            }
                            scaleType2 = ImageView.ScaleType.CENTER_INSIDE;
                        } else {
                            igImageView.setImageMatrix((Matrix) null);
                            scaleType2 = ImageView.ScaleType.FIT_CENTER;
                        }
                        igImageView.setScaleType(scaleType2);
                        str3 = A01.A02;
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else if (ordinal2 == 2) {
                    Drawable drawable9 = context2.getDrawable(R.drawable.direct_large_avatar_button_background);
                    if (drawable9 != null) {
                        DbU.A10(context2, drawable9, R.color.cds_white_a20);
                    }
                    igImageView.setScaleX(0.8f);
                    igImageView.setScaleY(0.8f);
                    igImageView.setImageResource(R.drawable.instagram_add_pano_outline_24);
                    DbX.A12(context2, igImageView, 2Yu.A0H(context2, R.attr.igds_color_primary_button_on_media));
                    igImageView.setBackground(drawable9);
                    igImageView.setPadding(37, 37, 37, 37);
                    0xa r122 = 26G.A00(userSession2).A00;
                    String A00 = C273654mx.A00(2954);
                    int i5 = r122.getInt(A00, 0);
                    if (i5 < 3) {
                        Handler A0D = AnonymousClass7TF.A0D();
                        A0D.postDelayed(new C19994WjF(ln92), 500);
                        A0D.postDelayed(new C19995WjG(ln92), 650);
                        AnonymousClass7TG.A1M(r122, A00, i5 + 1);
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                igImageView.setContentDescription(str3);
            }
            ln92.A02 = r6;
            ln92.A01 = r92;
            if (r6.CAW() == C317476nK.STICKER) {
                C317876nz BzU4 = r6.BzU();
                if (BzU4 != null) {
                    r1 = BzU4.A00();
                } else {
                    r1 = null;
                }
                if (r1 == C318046oG.CUTOUT_VIDEO) {
                    return;
                }
            }
            int ordinal3 = r6.CAW().ordinal();
            if (ordinal3 == 1) {
                C317486nL B0p3 = r6.B0p();
                if (B0p3 != null) {
                    str2 = B0p3.A01;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else if (ordinal3 == 0) {
                C317876nz BzU5 = r6.BzU();
                if (BzU5 != null) {
                    str2 = BzU5.A0Z;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else if (ordinal3 == 2) {
                str2 = "plus_button_id";
            } else {
                throw AnonymousClass7TE.A1K();
            }
            new C55973Hqe(igImageView, new C73669Phi(str2, userSession2, 24), 182.A06(AnonymousClass7TF.A0H(userSession2), userSession2, 36327297246050631L)).A00();
        }
    }
}
