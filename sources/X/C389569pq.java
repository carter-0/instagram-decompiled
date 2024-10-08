package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.instagram.android.R;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9pq  reason: invalid class name and case insensitive filesystem */
public final class C389569pq extends C299875vz implements C41816B1w, C300645xY {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final AnonymousClass6M4 A0B;
    public final ProfileStickerModel A0C;
    public final boolean A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final Context A0O;
    public final RectF A0P;
    public final Drawable A0Q;
    public final C306386Ly A0R;
    public final C59985Jcu[] A0S = new C59985Jcu[3];

    public C389569pq(Context context, ProfileStickerModel profileStickerModel) {
        int dimensionPixelSize;
        int intrinsicHeight;
        int i;
        Bitmap bitmap;
        Context context2 = context;
        0qQ.A0B(context2, 1);
        this.A0O = context2;
        Resources resources = context2.getResources();
        ProfileStickerModel profileStickerModel2 = profileStickerModel;
        this.A0C = profileStickerModel2;
        C61076JwE[] jwEArr = profileStickerModel2.A00;
        boolean z = true;
        z = (jwEArr == null || jwEArr.length < 3 || jwEArr[0] == null || jwEArr[1] == null || jwEArr[2] == null) ? false : z;
        this.A0D = z;
        this.A04 = !z;
        Integer num = profileStickerModel2.A05;
        Drawable A002 = ABE.A00(context2, num);
        this.A0Q = A002;
        int i2 = 0;
        if (A002 == null) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble);
        }
        this.A0F = dimensionPixelSize;
        if (A002 == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = (int) ((((float) dimensionPixelSize) / ((float) A002.getIntrinsicHeight())) * ((float) A002.getIntrinsicWidth()));
        }
        this.A0H = intrinsicHeight;
        if (A002 == null) {
            i = 0;
        } else {
            i = (dimensionPixelSize * 7) / 10;
        }
        this.A0G = i;
        this.A0P = AnonymousClass7TE.A0Y();
        this.A0E = AnonymousClass7TE.A09(context2);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.quiz_sticker_corner_radius);
        this.A09 = dimensionPixelSize2;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.share_professional_profile_background_corner_radius_without_images);
        this.A0A = dimensionPixelSize3;
        this.A01 = this.A04 ? dimensionPixelSize3 : dimensionPixelSize2;
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.bio_product_sticker_width);
        this.A0J = dimensionPixelSize4;
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        this.A0K = dimensionPixelSize5;
        int A0H2 = AnonymousClass7TE.A0H(resources);
        this.A0I = A0H2;
        int i3 = dimensionPixelSize5 * 2;
        int i4 = i3 + (dimensionPixelSize4 * 3) + (A0H2 * 2);
        this.A07 = i4;
        int A0I2 = AnonymousClass7TE.A0I(resources);
        this.A0L = A0I2;
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, i4 - i3);
        this.A0R = A0s;
        AJB.A06(context2, A0s, (float) A0I2, 0.0f);
        User user = profileStickerModel2.A03;
        if (user != null) {
            String A0D2 = 002.A0D(AnonymousClass7TG.A0o(user.getUsername()), '@');
            0qQ.A0B(A0D2, 2);
            0qQ.A0B(num, 3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0D2);
            spannableStringBuilder.setSpan(new C380229Xd(spannableStringBuilder, (float[]) null, ABE.A01(context2, num)), 0, spannableStringBuilder.length(), 33);
            A0s.A0L(spannableStringBuilder);
            A00(this);
            this.A03 = this.A04 ? this.A00 : i4;
            int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            this.A0M = dimensionPixelSize6;
            int A0D3 = AnonymousClass7TE.A0D(resources);
            this.A0N = A0D3;
            int i5 = i + (A0D3 * 2) + A0s.A06 + dimensionPixelSize6;
            this.A08 = i5;
            int i6 = dimensionPixelSize4 + i5 + dimensionPixelSize5;
            this.A06 = i6;
            this.A02 = !this.A04 ? i6 : i5;
            AnonymousClass6M3 r1 = new AnonymousClass6M3(context2, this, -1);
            r1.A01(2131973503);
            Integer num2 = AnonymousClass05K.A00;
            0qQ.A0B(num2, 0);
            r1.A06 = num2;
            this.A0B = r1.A00();
            if (z) {
                int dimensionPixelSize7 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
                C61076JwE[] jwEArr2 = profileStickerModel2.A00;
                if (jwEArr2 != null) {
                    int length = jwEArr2.length;
                    int i7 = 0;
                    while (i2 < length) {
                        C61076JwE jwE = jwEArr2[i2];
                        int i8 = i7 + 1;
                        if (!(jwE == null || (bitmap = (Bitmap) jwE.A00) == null)) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            int i9 = this.A0J;
                            boolean z2 = 1MF.A02;
                            Matrix A0U = AnonymousClass7TE.A0U();
                            1MF.A0J(A0U, width, height, i9, i9, 0, false);
                            this.A0S[i7] = new C59985Jcu(bitmap, A0U, (float) dimensionPixelSize7, 15);
                        }
                        i2++;
                        i7 = i8;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = new Paint();
        paint.setColor(this.A0E);
        RectF rectF = this.A0P;
        float f = (float) this.A01;
        canvas.drawRoundRect(rectF, f, f, paint);
        this.A0R.draw(canvas);
        Drawable drawable = this.A0Q;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (!this.A04) {
            canvas.save();
            int i = 0;
            do {
                C59985Jcu jcu = this.A0S[i];
                if (jcu != null) {
                    jcu.draw(canvas);
                }
                canvas.translate((float) (this.A0J + this.A0I), 0.0f);
                i++;
            } while (i < 3);
            canvas.restore();
        }
        this.A0B.draw(canvas);
    }

    public static final void A00(C389569pq r18) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        C389569pq r6 = r18;
        if (r6.A04) {
            i = 0nA.A09(r6.A0O);
            i2 = r6.A0K;
            i3 = i2 * 5;
        } else {
            i = r6.A07;
            i2 = r6.A0K;
            i3 = i2 * 2;
        }
        int i5 = i - i3;
        Context context = r6.A0O;
        C306386Ly r4 = r6.A0R;
        int i6 = r6.A0L;
        boolean A1Z = AnonymousClass7TG.A1Z(context, r4);
        Spannable spannable = r4.A0F;
        if (spannable == null || spannable.length() == 0) {
            r4.A0A((float) i6);
        } else {
            int i7 = 2;
            int i8 = (int) (((float) i6) * 2.0f);
            int floor = ((int) Math.floor((double) (((float) (i8 - 2)) / 2.0f))) + 2;
            while (true) {
                f = ((float) floor) / 2.0f;
                if (i7 >= floor) {
                    break;
                }
                String obj = r4.A0F.toString();
                TextPaint textPaint = r4.A0b;
                textPaint.setTextSize(f);
                if (((float) i5) <= textPaint.measureText(obj) || new StaticLayout(obj, textPaint, i5, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, A1Z).getLineCount() != A1Z) {
                    i8 = floor;
                } else {
                    i7 = floor;
                }
                floor = ((int) Math.floor((double) (((float) (i8 - i7)) / 2.0f))) + i7;
            }
            AJB.A06(context, r4, f, 0.0f);
        }
        int A022 = AnonymousClass7TH.A02(r4);
        r6.A05 = A022;
        r4.A0E(A022);
        if (r6.A04) {
            i4 = r6.A05 + (i2 * 2);
            r6.A00 = i4;
        } else {
            i4 = r6.A07;
        }
        r6.A03 = i4;
    }

    public final List A07() {
        return 0sn.A00;
    }

    public final int BRc() {
        return AnonymousClass7TF.A1V(this.A0C.A03) ? 1 : 0;
    }

    public final List BRk() {
        List A1I = AnonymousClass7TE.A1I(this.A0C.A03);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A1I) {
            if (next != null) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public final String C4F() {
        if (!this.A0D || this.A04) {
            return "share_professional_no_thumbnails";
        }
        return "share_professional_thumbnails";
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        int i5 = this.A0G + i2;
        Drawable drawable = this.A0Q;
        if (drawable != null) {
            int i6 = (int) f;
            int i7 = this.A0H / 2;
            drawable.setBounds(i6 - i7, i2, i6 + i7, this.A0F + i2);
        }
        this.A0P.set((float) i, (float) i5, (float) i3, (float) i4);
        int i8 = (int) f;
        int i9 = this.A05 / 2;
        int i10 = this.A08 + i2;
        this.A0R.setBounds(i8 - i9, i5 + this.A0N + this.A0M, i8 + i9, i10);
        if (this.A0D) {
            int i11 = i + this.A0K;
            int i12 = this.A0J;
            int i13 = i11 + i12;
            int i14 = i12 + i10;
            int i15 = 0;
            do {
                C59985Jcu jcu = this.A0S[i15];
                if (jcu != null) {
                    jcu.setBounds(i11, i10, i13, i14);
                }
                i15++;
            } while (i15 < 3);
        }
    }
}
