package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import java.util.ArrayList;

/* renamed from: X.7vk  reason: invalid class name and case insensitive filesystem */
public final class C346787vk extends C231632rz {
    public final float A00 = 1.0f;
    public final UserSession A01;
    public final C357638Yz A02;
    public final AnonymousClass8MJ A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C346787vk(UserSession userSession, C357638Yz r3, AnonymousClass8MJ r4) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: type inference failed for: r11v2, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C279284yO r0;
        C268684dp r1;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(1172673205);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj4, 2);
        0qQ.A0B(obj3, 3);
        UserSession userSession = this.A01;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SquareStickerRedesignGridRowViewBinder.Holder");
        C39683A4z a4z = (C39683A4z) tag;
        C3251571g r9 = (C3251571g) obj4;
        AnonymousClass6u8 r8 = (AnonymousClass6u8) obj3;
        C357638Yz r18 = this.A02;
        AnonymousClass8MJ r10 = this.A03;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(a4z, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r8, 3);
        0qQ.A0B(r10, 5);
        View view3 = a4z.A00;
        Resources resources = view3.getResources();
        boolean z = r8.A04;
        int i2 = R.dimen.abc_edit_text_inset_top_material;
        if (z) {
            i2 = R.dimen.asset_picker_static_sticker_last_row_padding;
        }
        0nA.A0X(view3, resources.getDimensionPixelSize(i2));
        ArrayList arrayList = a4z.A01;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj5 = arrayList.get(i3);
            0qQ.A07(obj5);
            Object tag2 = ((View) obj5).getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SquareStickerRedesignItemViewBinder.Holder");
            C380509Yl r12 = (C380509Yl) tag2;
            long j = (long) (r8.A01 + i3 + 1);
            if (i3 < r9.A01()) {
                C317876nz r2 = (C317876nz) r9.A02(i3);
                Long valueOf = Long.valueOf(j);
                RectF rectF = C39859ACf.A01;
                0qQ.A0B(r12, 1);
                0qQ.A0B(r2, 2);
                29J r14 = 27p.A01(userSession).A01;
                0qQ.A07(r14);
                r14.A02(r2.A0Z, r2.A00().name());
                ? r11 = r12.A03;
                Context context = r11.getContext();
                0qQ.A07(context);
                if (r18 != null) {
                    r0 = (C279284yO) r18.A08.A00;
                } else {
                    r0 = null;
                }
                A66 A012 = AJA.A01(context, userSession, r0, r10, r2);
                r12.A02.A02();
                r11.setVisibility(0);
                Drawable drawable = A012.A00;
                r11.setImageDrawable(drawable);
                r11.setContentDescription(A012.A02);
                r12.A00 = new A73(userSession, r12, r10, r2, valueOf);
                Drawable drawable2 = r11.getDrawable();
                if (!0qQ.A0K(drawable2, drawable)) {
                    if (drawable2 instanceof C268684dp) {
                        ((C268684dp) drawable2).AHg();
                    } else if (drawable2 instanceof C380029Wg) {
                        C380029Wg r13 = (C380029Wg) drawable2;
                        if (r13.A00) {
                            r13.A00 = false;
                        }
                    } else if (drawable2 instanceof C380039Wh) {
                        C380039Wh r15 = (C380039Wh) drawable2;
                        if (r15.A00) {
                            r15.A00 = false;
                        }
                    } else if (drawable2 instanceof C15833UjJ) {
                        C15833UjJ ujJ = (C15833UjJ) drawable2;
                        if (ujJ.A00) {
                            ujJ.A00 = false;
                        }
                    } else if (drawable2 instanceof C389979qX) {
                        ((C389979qX) drawable2).A00 = false;
                    } else if (drawable2 instanceof AnonymousClass9Wk) {
                        ((AnonymousClass9Wk) drawable2).A00 = false;
                    }
                }
                int ordinal = r2.A00().ordinal();
                if (ordinal == 104 || ordinal == 37 || ordinal == 65) {
                    Drawable drawable3 = r11.getDrawable();
                    if (!(drawable3 instanceof C268684dp) || (r1 = (C268684dp) drawable3) == null || !r1.isLoading()) {
                        r11.setScaleType(ImageView.ScaleType.MATRIX);
                        r11.A01 = new AZH(drawable3, r12, r2);
                    } else {
                        r11.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        r11.A01 = null;
                        0qQ.A0C(drawable3, "null cannot be cast to non-null type com.instagram.common.ui.drawables.LoadingDrawable");
                        r1.A9D(new AZ2(drawable3, r1, r12, r2));
                    }
                } else if (ordinal == 38 || ordinal == 64) {
                    r11.setImageMatrix((Matrix) null);
                    r11.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    r11.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    r11.A01 = null;
                } else {
                    r11.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    r11.A01 = null;
                }
                new C55973Hqe(r11, new MJ9(2, r2, r14), 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36327297246050631L)).A00();
                27p.A01(userSession).A1j(valueOf, r2.A0Z, AED.A02(r2, false), AED.A00(r2));
            } else {
                RectF rectF2 = C39859ACf.A01;
                0qQ.A0B(r12, 0);
                r12.A02.A02();
                r12.A00 = null;
                r12.A03.setVisibility(4);
            }
        }
        AnonymousClass0fD.A0A(518447040, A032);
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [android.view.View, java.lang.Object, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(855837473);
        0qQ.A0B(viewGroup, 1);
        float f = this.A00;
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 2);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_horizontal_container, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(1));
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        0qQ.A0A(context);
        0qQ.A0B(context, 0);
        int dimensionPixelSize = (int) (((double) context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin)) * C346897vw.A00(userSession));
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        viewGroup2.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        C39683A4z a4z = new C39683A4z(viewGroup2);
        int i2 = 0;
        while (true) {
            boolean z = true;
            while (true) {
                RectF rectF = C39859ACf.A01;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.ad_stories_more_info_footer_width), -2, 1.0f);
                ? constrainedImageView = new ConstrainedImageView(context);
                if (z) {
                    layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin));
                }
                constrainedImageView.setLayoutParams(layoutParams);
                constrainedImageView.A00 = f;
                constrainedImageView.setFocusable(true);
                constrainedImageView.setTag(new C380509Yl(constrainedImageView));
                a4z.A01.add(constrainedImageView);
                viewGroup2.addView(constrainedImageView);
                i2++;
                if (i2 < 4) {
                    z = false;
                    if (i2 < 3) {
                    }
                } else {
                    viewGroup2.setTag(a4z);
                    AnonymousClass0fD.A0A(1366202751, A032);
                    return viewGroup2;
                }
            }
        }
    }
}
