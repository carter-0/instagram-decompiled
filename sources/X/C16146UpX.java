package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.UpX  reason: case insensitive filesystem */
public final class C16146UpX extends C299875vz implements AnonymousClass1MK, C268714ds {
    public Drawable A00;
    public C386039jx A01;
    public boolean A02;
    public int A03;
    public int A04;
    public C59985Jcu A05;
    public final int A06;
    public final Context A07;
    public final C19476WaO A08;
    public final C68639NQs A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Drawable A0F;
    public final GradientDrawable A0G;
    public final C306386Ly A0H;
    public final List A0I;

    public C16146UpX(Context context, UserSession userSession, C19476WaO waO, String str, boolean z) {
        Date date;
        Context context2 = context;
        this.A07 = context2;
        C19476WaO waO2 = waO;
        this.A08 = waO2;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        int A022 = AnonymousClass7TF.A02(context2, R.dimen.ai_agent_share_profile_sticker_padding);
        int A012 = AnonymousClass7TH.A01(context2);
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        int A052 = AnonymousClass7TG.A05(context2);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        this.A0B = dimensionPixelSize3;
        this.A0E = context2.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        int dimensionPixelSize4 = context2.getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A0D = dimensionPixelSize4;
        int dimensionPixelSize5 = context2.getResources().getDimensionPixelSize(R.dimen.alert_dialog_width);
        this.A06 = dimensionPixelSize5;
        this.A0C = AnonymousClass7TG.A03(context2);
        this.A0A = C51972G9s.A08(context2);
        String A16 = AnonymousClass7TE.A16(context2, 2131956788);
        Drawable drawable = context2.getDrawable(R.drawable.interactive_sticker_background);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            0qQ.A0C(mutate, C273654mx.A00(0));
            GradientDrawable gradientDrawable = (GradientDrawable) mutate;
            this.A0G = gradientDrawable;
            Drawable drawable2 = context2.getDrawable(R.drawable.sticker_background_shadow);
            if (drawable2 != null) {
                this.A0F = drawable2;
                Drawable drawable3 = context2.getDrawable(R.drawable.instagram_circle_chevron_24);
                if (drawable3 != null) {
                    this.A00 = drawable3;
                    C68639NQs nQs = new C68639NQs(userSession, context2);
                    this.A09 = nQs;
                    Spannable spannable = C306386Ly.A0d;
                    C306386Ly r5 = new C306386Ly(context2, ((dimensionPixelSize5 - (dimensionPixelSize4 * 2)) - this.A00.getIntrinsicWidth()) - dimensionPixelSize3);
                    this.A0H = r5;
                    this.A04 = A022;
                    this.A03 = A012;
                    ArrayList arrayList = new ArrayList();
                    this.A0I = arrayList;
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                    drawable2.setCallback(this);
                    nQs.setVisible(true, false);
                    nQs.setCallback(this);
                    int color = context2.getColor(R.color.countdown_sticker_title_text_color);
                    r5.A0I(AnonymousClass7TG.A0O(context2));
                    AJB.A0B(r5, (float) dimensionPixelSize, 0.0f, 0.0f);
                    r5.A0F(color);
                    r5.A0K(Layout.Alignment.ALIGN_NORMAL);
                    r5.setCallback(this);
                    this.A00.mutate().setAlpha(128);
                    Drawable mutate2 = this.A00.mutate();
                    Integer num = AnonymousClass05K.A0j;
                    mutate2.setColorFilter(C9162RRn.A00(num, color));
                    User user = waO2.A00.A00;
                    if (user != null) {
                        C386039jx r19 = new C386039jx(context2, user.Bh3(), str, user.getUsername(), dimensionPixelSize5);
                        r19.setCallback(this);
                        arrayList.add(r19);
                        this.A01 = r19;
                    }
                    SimpleImageUrl simpleImageUrl = new SimpleImageUrl(this.A08.A00.A05);
                    if (!C253833rU.A02(simpleImageUrl)) {
                        C13989Tnp.A1P(this, 1NK.A00(), simpleImageUrl, "countdown_sticker_drawable");
                    }
                    String str2 = waO2.A00.A0B;
                    if ((str2 == null ? "" : str2).length() > 0) {
                        str2 = str2 == null ? "" : str2;
                        Locale locale = Locale.getDefault();
                        0qQ.A07(locale);
                        A16 = Pxf.A0n(locale, str2);
                    }
                    r5.A0M(A16);
                    C19476WaO waO3 = this.A08;
                    if (waO3.A00.A06 != null || waO3.A00() >= JTR.A0L()) {
                        date = new Date(TimeUnit.SECONDS.toMillis(waO2.A00()));
                    } else {
                        date = null;
                    }
                    if (!z || date == null) {
                        nQs.A09(date);
                    } else {
                        nQs.A0A(date);
                    }
                    StaticLayout staticLayout = r5.A0G;
                    if (staticLayout == null || staticLayout.getLineCount() <= 1) {
                        this.A04 = A022;
                        this.A03 = A012;
                    } else {
                        this.A04 = dimensionPixelSize2;
                        this.A03 = A052;
                    }
                    int A0C2 = 0nH.A0C(waO2.A00.A0C, -1);
                    BGi bGi = waO2.A00;
                    String str3 = bGi.A0B;
                    float f = 1.0f;
                    int A072 = 0nH.A07(A0C2, AnonymousClass7TF.A1Q((str3 == null ? "" : str3).length()) ? 0.5f : 1.0f);
                    int A0C3 = 0nH.A0C(bGi.A08, -8519535);
                    C19476WaO waO4 = this.A08;
                    if (waO4.A00.A06 == null && waO4.A00() < JTR.A0L()) {
                        f = 0.3f;
                    }
                    int A073 = 0nH.A07(A0C3, f);
                    int A0B2 = 0nH.A0B(waO2.A00.A07, -855638017);
                    String str4 = waO2.A00.A0A;
                    int[] iArr = C19476WaO.A04;
                    int i = 0nH.A0C(str4, iArr[0]) == -1 ? -869915098 : A0B2;
                    gradientDrawable.setColors(new int[]{0nH.A0C(waO2.A00.A0A, iArr[0]), 0nH.A0C(waO2.A00.A09, iArr[1])});
                    r5.A0F(A072);
                    this.A00.mutate().setColorFilter(C9162RRn.A00(num, A072));
                    Drawable mutate3 = nQs.mutate();
                    0qQ.A0C(mutate3, "null cannot be cast to non-null type com.instagram.reels.countdown.view.CountdownStickerTimeCardsDrawable");
                    ((C68639NQs) mutate3).A08(A073, A0B2, A072, i);
                    Collections.addAll(arrayList, new Drawable[]{this.A05, gradientDrawable, r5, nQs, this.A00});
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        0qQ.A0B(r7, 1);
        Bitmap bitmap = r7.A01;
        if (bitmap != null) {
            int i = this.A06;
            boolean z = 1MF.A02;
            Bitmap A002 = 0fO.A00(bitmap, i, (int) (((float) bitmap.getHeight()) * (((float) i) / ((float) bitmap.getWidth()))), true);
            0qQ.A07(A002);
            C59985Jcu jcu = new C59985Jcu(A002, (Matrix) null, (float) this.A0A, 15);
            this.A05 = jcu;
            jcu.setBounds(this.A0G.getBounds());
            invalidateSelf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        C386039jx r0;
        0qQ.A0B(canvas, 0);
        if (this.A02) {
            this.A0F.draw(canvas);
        }
        Drawable drawable = this.A05;
        if (drawable == null) {
            drawable = this.A0G;
        }
        drawable.draw(canvas);
        this.A0H.draw(canvas);
        this.A09.draw(canvas);
        this.A00.draw(canvas);
        if (this.A08.A02 && (r0 = this.A01) != null) {
            r0.draw(canvas);
        }
    }

    public final List A07() {
        return this.A0I;
    }

    public final C2802350v BzV() {
        return this.A08;
    }

    public final int getIntrinsicHeight() {
        int i;
        C386039jx r0;
        int i2 = this.A04;
        C306386Ly r1 = this.A0H;
        int intrinsicHeight = ((i2 + r1.A06) - r1.A08) + this.A03 + this.A09.getIntrinsicHeight() + this.A0E;
        if (!this.A08.A02 || (r0 = this.A01) == null) {
            i = 0;
        } else {
            i = r0.A03;
        }
        return intrinsicHeight + i;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        C386039jx r4;
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A06) / 2.0f;
        float f4 = f - f3;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f5 = f2 - intrinsicHeight;
        float f6 = f + f3;
        float f7 = f2 + intrinsicHeight;
        C306386Ly r0 = this.A0H;
        C306386Ly r24 = r0;
        int i6 = r0.A06;
        int i7 = r0.A08;
        int i8 = this.A04;
        int i9 = ((i8 + this.A03) + i6) - i7;
        C68639NQs nQs = this.A09;
        int intrinsicHeight2 = nQs.getIntrinsicHeight();
        int intrinsicWidth = this.A00.getIntrinsicWidth();
        float f8 = ((float) i8) + f5;
        float f9 = f8 + (((float) (i6 - i7)) / 2.0f);
        float f10 = (float) this.A0D;
        float f11 = f6 - f10;
        float f12 = (float) intrinsicWidth;
        float f13 = f11 - f12;
        C59985Jcu jcu = this.A05;
        if (jcu != null) {
            C13988Tno.A0w(jcu, f4, f5, f6, f7);
        }
        int i10 = (int) f4;
        int i11 = (int) f6;
        int i12 = (int) f7;
        int i13 = i12;
        int i14 = i12;
        this.A0G.setBounds(i10, (int) f5, i11, i14);
        Drawable drawable = this.A0F;
        float f14 = (float) this.A0C;
        drawable.setBounds((int) (f4 - f14), (int) (f5 - f14), (int) (f14 + f6), (int) (f14 + f7));
        int i15 = (int) (f10 + f4);
        float f15 = (float) i7;
        float f16 = f5 + ((float) i9);
        C306386Ly r02 = r24;
        r02.setBounds(i15, (int) (f8 - f15), (int) (f13 - ((float) this.A0B)), (int) (f15 + f16));
        float f17 = f12 / 2.0f;
        int i16 = (int) f11;
        this.A00.setBounds((int) f13, (int) (f9 - f17), i16, (int) (f9 + f17));
        nQs.setBounds(i15, (int) f16, i16, (int) (f16 + ((float) intrinsicHeight2)));
        if (this.A08.A02 && (r4 = this.A01) != null) {
            r4.setBounds(i10, (int) (f7 - ((float) r4.A03)), i11, i13);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        this.A09.setVisible(z, z2);
        return super.setVisible(z, z2);
    }
}
