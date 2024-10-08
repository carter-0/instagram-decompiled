package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Upa  reason: case insensitive filesystem */
public final class C16149Upa extends C299875vz implements C268714ds {
    public static final Interpolator A0g = new DecelerateInterpolator();
    public int A00;
    public long A01;
    public C15838UjO A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final Drawable A0D;
    public final Drawable A0E;
    public final Drawable A0F;
    public final GradientDrawable A0G;
    public final C19471WaJ A0H;
    public final C306386Ly A0I;
    public final String A0J;
    public final List A0K = new ArrayList();
    public final List A0L = new ArrayList();
    public final int[] A0M;
    public final int[] A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final int A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final int A0Y;
    public final int A0Z;
    public final Rect A0a;
    public final Rect A0b;
    public final Drawable A0c;
    public final Drawable A0d;
    public final UserSession A0e;
    public final List A0f;

    private void A00() {
        int i;
        List list = this.A0f;
        List list2 = this.A0K;
        list.removeAll(list2);
        list2.clear();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            C21026XAf xAf = (C21026XAf) it.next();
            C306386Ly r1 = new C306386Ly(this.A0C, (((this.A0Z - (this.A0X * 2)) - (this.A0P * 2)) - this.A0Q) - this.A0U);
            if (!TextUtils.isEmpty(xAf.getText())) {
                r1.A0M(xAf.getText());
                i = this.A0T;
            } else if (xAf.BDf() != null) {
                r1.A0M(xAf.BDf());
                i = this.A0S;
            } else {
                r1.A0A((float) this.A0V);
                r1.A0K(Layout.Alignment.ALIGN_NORMAL);
                r1.setCallback(this);
                list2.add(r1);
                list.add(r1);
            }
            r1.A0F(i);
            r1.A0A((float) this.A0V);
            r1.A0K(Layout.Alignment.ALIGN_NORMAL);
            r1.setCallback(this);
            list2.add(r1);
            list.add(r1);
        }
    }

    private void A01() {
        List list = this.A0f;
        List list2 = this.A0L;
        list.removeAll(list2);
        list2.clear();
        for (int i = 0; i < this.A03.size(); i++) {
            Context context = this.A0C;
            C15834UjK ujK = new C15834UjK(context, context.getResources().getStringArray(R.array.quiz_sticker_answer_row_options)[i]);
            ujK.setCallback(this);
            list2.add(ujK);
            list.add(ujK);
        }
    }

    public final List A07() {
        return this.A0f;
    }

    public final Integer A08() {
        return AnonymousClass05K.A0N;
    }

    public final C2802350v BzV() {
        return this.A0H;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.UjO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.UjO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: X.UjO} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0009
            android.graphics.drawable.Drawable r0 = r11.A0d
            r0.draw(r12)
        L_0x0009:
            android.graphics.drawable.Drawable r0 = r11.A0c
            r0.draw(r12)
            android.graphics.drawable.GradientDrawable r0 = r11.A0G
            r0.draw(r12)
            X.6Ly r0 = r11.A0I
            r0.draw(r12)
            r12.save()
            r2 = 0
        L_0x001c:
            java.util.List r1 = r11.A0K
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x00f8
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x00dd
            int r0 = r11.A00
            if (r2 != r0) goto L_0x00dd
            X.UjO r5 = r11.A02
            if (r5 == 0) goto L_0x00dd
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object r6 = r1.get(r0)
            X.6Ly r6 = (X.C306386Ly) r6
            r10 = 1
            long r0 = r11.A01
            r8 = 500(0x1f4, double:2.47E-321)
            long r8 = r8 + r0
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0078
            android.graphics.drawable.Drawable r0 = r11.A0E
            r0.draw(r12)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5.A01 = r0
            r5.A02 = r0
            r5.invalidateSelf()
            r5.A03 = r10
            long r0 = java.lang.System.currentTimeMillis()
            r5.A00 = r0
            r5.invalidateSelf()
            r5.draw(r12)
            int r0 = r11.A06
            r6.A0F(r0)
        L_0x0065:
            r6.draw(r12)
            r11.invalidateSelf()
        L_0x006b:
            r3 = 0
            int r1 = r11.A0O
            int r0 = r11.A0W
            int r1 = r1 + r0
            float r0 = (float) r1
            r12.translate(r3, r0)
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0078:
            r8 = 800(0x320, double:3.953E-321)
            long r8 = r8 + r0
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00c9
            long r3 = r3 - r0
            android.view.animation.Interpolator r8 = A0g
            float r7 = (float) r3
            r4 = 1140457472(0x43fa0000, float:500.0)
            r3 = 1145569280(0x44480000, float:800.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            float r0 = X.0mi.A01(r7, r4, r3, r1, r0)
            float r3 = r8.getInterpolation(r0)
            android.graphics.drawable.Drawable r0 = r11.A0D
            r0.draw(r12)
            android.graphics.drawable.Drawable r1 = r11.A0E
            r0 = 1132396544(0x437f0000, float:255.0)
            int r0 = X.AnonymousClass7TE.A05(r0, r3)
            r1.setAlpha(r0)
            r1.draw(r12)
            int r1 = r11.A07
            int r0 = r11.A06
            int r0 = X.0nH.A02(r3, r1, r0)
            r6.A0F(r0)
            r6.draw(r12)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = r5.A01
            if (r0 != 0) goto L_0x00c2
            r5.A01 = r1
            r5.A02 = r1
        L_0x00bd:
            r5.invalidateSelf()
        L_0x00c0:
            r6 = r5
            goto L_0x0065
        L_0x00c2:
            if (r0 == r1) goto L_0x00c0
            r5.A02 = r0
            r5.A01 = r1
            goto L_0x00bd
        L_0x00c9:
            android.graphics.drawable.Drawable r0 = r11.A0D
            r0.draw(r12)
            r0 = 0
            r5.A03 = r0
            r5.invalidateSelf()
            r5.draw(r12)
            int r0 = r11.A07
            r6.A0F(r0)
            goto L_0x00f3
        L_0x00dd:
            java.util.List r0 = r11.A0L
            java.lang.Object r0 = r0.get(r2)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.draw(r12)
            android.graphics.drawable.Drawable r0 = r11.A0D
            r0.draw(r12)
            java.lang.Object r6 = r1.get(r2)
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
        L_0x00f3:
            r6.draw(r12)
            goto L_0x006b
        L_0x00f8:
            r12.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16149Upa.draw(android.graphics.Canvas):void");
    }

    public final int getIntrinsicHeight() {
        int size = this.A0R + (this.A0K.size() * (this.A0W + this.A0O));
        int i = this.A0B;
        C306386Ly r1 = this.A0I;
        return ((i + r1.A06) - r1.A08) + this.A09 + size + this.A0X;
    }

    public final int getIntrinsicWidth() {
        return this.A0Z;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i3;
        super.setBounds(i5, i2, i6, i4);
        int i7 = (i + i3) / 2;
        int i8 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i9 = i8 - intrinsicHeight;
        int i10 = i8 + intrinsicHeight;
        C306386Ly r10 = this.A0I;
        int i11 = r10.A08;
        int i12 = this.A0B;
        int i13 = this.A09;
        int i14 = ((i12 + r10.A06) - i11) + i13 + i9;
        int i15 = this.A0R + i14 + this.A0W;
        this.A0c.setBounds(i5, i9, i6, i10);
        Drawable drawable = this.A0d;
        int i16 = this.A0Y;
        drawable.setBounds(i - i16, i9 - i16, i3 + i16, i10 + i16);
        this.A0G.setBounds(i5, i9, i6, i14);
        int i17 = r10.A0A / 2;
        r10.setBounds(i7 - i17, (i9 + i12) - i11, i7 + i17, (i14 - i13) + i11);
        Rect rect = this.A0a;
        int i18 = this.A0X;
        int i19 = i + i18;
        int i20 = i3 - i18;
        int i21 = this.A0O;
        rect.set(i19, i15, i20, i21 + i15);
        this.A0D.setBounds(rect);
        this.A0E.setBounds(rect);
        Rect rect2 = this.A0b;
        int i22 = this.A0P;
        int i23 = i19 + i22;
        int i24 = (i21 / 2) + i15;
        int i25 = this.A0Q;
        int i26 = i25 / 2;
        int i27 = i23 + i25;
        rect2.set(i23, i24 - i26, i27, i26 + i24);
        C15838UjO ujO = this.A02;
        if (ujO != null) {
            ujO.setBounds(rect2);
        }
        this.A0F.setBounds(rect2);
        for (int i28 = 0; i28 < this.A03.size(); i28++) {
            ((Drawable) this.A0L.get(i28)).setBounds(rect2);
            List list = this.A0K;
            ((Drawable) list.get(i28)).setBounds(i27 + this.A0U, i24 - (((C306386Ly) list.get(i28)).A06 / 2), i20 - i22, (((C306386Ly) list.get(i28)).A06 / 2) + i24);
        }
    }

    public C16149Upa(Context context, UserSession userSession, C19471WaJ waJ) {
        C306386Ly r1;
        ArrayList arrayList = new ArrayList();
        this.A0f = arrayList;
        this.A0a = new Rect();
        this.A0b = new Rect();
        this.A00 = -1;
        this.A0e = userSession;
        this.A0C = context;
        Resources resources = context.getResources();
        int A0B2 = AnonymousClass7TE.A0B(resources);
        this.A0X = A0B2;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A0Z = dimensionPixelSize;
        this.A0Y = JTP.A03(resources);
        this.A0A = resources.getDimensionPixelSize(R.dimen.poll_v2_sticker_title_text_size);
        this.A0B = AnonymousClass7TE.A0B(resources);
        this.A09 = AnonymousClass7TE.A0F(resources);
        this.A0R = JTP.A03(resources);
        this.A0O = resources.getDimensionPixelSize(R.dimen.activation_row_icon_size);
        this.A0P = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0W = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0Q = resources.getDimensionPixelOffset(R.dimen.abc_dialog_padding_material);
        this.A0V = resources.getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A0U = AnonymousClass7TE.A0D(resources);
        this.A08 = AnonymousClass7TE.A09(context);
        this.A07 = context.getColor(R.color.countdown_sticker_title_text_color);
        this.A06 = context.getColor(R.color.canvas_bottom_sheet_description_text_color);
        this.A0J = context.getString(2131971249);
        Drawable drawable = context.getDrawable(R.drawable.quiz_sticker_background);
        drawable.getClass();
        this.A0c = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.sticker_background_shadow);
        drawable2.getClass();
        this.A0d = drawable2;
        drawable2.setCallback(this);
        Drawable drawable3 = context.getDrawable(R.drawable.quiz_sticker_title_background);
        drawable3.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawable3.mutate();
        this.A0G = gradientDrawable;
        Drawable drawable4 = context.getDrawable(R.drawable.quiz_sticker_answer_row_background_unselected);
        drawable4.getClass();
        this.A0D = drawable4;
        Drawable drawable5 = context.getDrawable(R.drawable.quiz_sticker_answer_row_background_selected_refreshed);
        drawable5.getClass();
        this.A0E = drawable5;
        Drawable drawable6 = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        drawable6.getClass();
        Drawable mutate = drawable6.mutate();
        this.A0F = mutate;
        DbX.A11(context, mutate, R.color.canvas_bottom_sheet_description_text_color);
        C306386Ly r2 = new C306386Ly(context, dimensionPixelSize - (A0B2 * 2));
        this.A0I = r2;
        int color = context.getColor(R.color.direct_light_mode_glyph_color_tertiary);
        int i = 0;
        this.A0M = new int[]{color, color};
        int color2 = context.getColor(R.color.direct_dark_mode_composer_hint_text_color);
        this.A0N = new int[]{color2, color2};
        this.A0S = context.getColor(R.color.direct_light_mode_glyph_color_tertiary);
        this.A0T = context.getColor(R.color.countdown_sticker_title_text_color);
        this.A03 = new ArrayList(VKA.A00(context.getResources()));
        Collections.addAll(arrayList, new Drawable[]{drawable, gradientDrawable, r2, drawable4});
        C306386Ly r4 = this.A0I;
        r4.A0M(this.A0J);
        float f = (float) this.A0A;
        r4.A0A(f);
        r4.A0F(this.A08);
        Context context2 = this.A0C;
        0qQ.A0B(context2, 0);
        r4.A0I(AnonymousClass7TG.A0O(context2));
        AJB.A0B(r4, f, 0.0f, 0.0f);
        r4.A0K(Layout.Alignment.ALIGN_CENTER);
        r4.setCallback(this);
        A01();
        A00();
        this.A0H = waJ;
        if (waJ != null) {
            if (TextUtils.isEmpty(waJ.A01)) {
                String str = waJ.A02.A04;
                r1 = this.A0I;
                r1.A0M(TextUtils.isEmpty(str) ? this.A0J : str);
            } else {
                r1 = this.A0I;
                r1.A0M(waJ.A01);
            }
            UNZ unz = waJ.A02;
            r1.A0F(0nH.A0C(unz.A0A, -1));
            List list = unz.A0B;
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ArrayList arrayList2 = this.A03;
                    int size = arrayList2.size();
                    Object obj = list.get(i2);
                    if (i2 < size) {
                        arrayList2.set(i2, obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                A00();
                A01();
            }
            int[] iArr = {0nH.A0C(unz.A09, -14277082), 0nH.A0C(unz.A05, -14277082)};
            this.A0G.setColors(iArr);
            while (true) {
                ArrayList arrayList3 = this.A03;
                if (i >= arrayList3.size()) {
                    break;
                }
                C15834UjK ujK = (C15834UjK) this.A0L.get(i);
                if (TextUtils.isEmpty(((C21026XAf) arrayList3.get(i)).getText())) {
                    ujK.A08(this.A0M, this.A0N);
                } else {
                    ujK.A08(iArr, iArr);
                }
                i++;
            }
            int A002 = waJ.A00();
            if (A002 != -1) {
                this.A00 = A002;
                Interpolator interpolator = C15838UjO.A08;
                this.A02 = new C15838UjO((Drawable) this.A0L.get(A002), this.A0F, 300);
            }
        }
    }
}
