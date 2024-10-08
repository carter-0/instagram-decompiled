package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.9Ww  reason: invalid class name and case insensitive filesystem */
public final class C380159Ww extends Drawable implements C268684dp, Drawable.Callback, AnonymousClass1MK, C300645xY, C369758vH {
    public Bitmap A00;
    public Bitmap A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final Resources A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Path A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final Drawable A0K;
    public final Drawable A0L;
    public final UserSession A0M;
    public final C306386Ly A0N;
    public final C306386Ly A0O;
    public final C306386Ly A0P;
    public final C306386Ly A0Q;
    public final C3499082j A0R;
    public final boolean A0S;
    public final int A0T;
    public final Drawable A0U;
    public final CopyOnWriteArraySet A0V = new CopyOnWriteArraySet();

    public C380159Ww(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C3499082j r24) {
        String str;
        CharSequence charSequence;
        Layout.Alignment alignment;
        BitmapDrawable bitmapDrawable;
        Context context2 = context;
        this.A0C = context2;
        this.A0M = userSession;
        C3499082j r1 = r24;
        this.A0R = r1;
        Resources A0A2 = AnonymousClass7TF.A0A(context2);
        this.A0D = A0A2;
        this.A0G = AnonymousClass7TE.A0V(3);
        this.A0F = AnonymousClass7TE.A0V(3);
        this.A0E = AnonymousClass7TE.A0V(1);
        Path path = new Path();
        this.A0H = path;
        RectF A0Y = AnonymousClass7TE.A0Y();
        this.A0J = A0Y;
        int A002 = (int) (((float) AnonymousClass81W.A00(targetViewSizeProvider)) * 0.8f);
        float f = (float) A002;
        int i = (int) (f / 0.75f);
        this.A0S = 0mk.A02(context2);
        this.A06 = A002;
        this.A05 = i;
        String str2 = r1.A04;
        if (str2 != null) {
            ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(str2, A002, i);
            AE3 ae3 = r1.A03;
            0qQ.A07(ae3);
            AE3 ae32 = r1.A02;
            float A0D2 = (float) AnonymousClass7TE.A0D(A0A2);
            this.A0T = A0A2.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            int A0B2 = AnonymousClass7TE.A0B(A0A2);
            this.A02 = A0B2;
            this.A03 = A0A2.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            this.A04 = AnonymousClass7TE.A0D(A0A2);
            int i2 = (int) (((float) A0B2) / 2.0f);
            this.A09 = i2;
            this.A0B = A0A2.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            this.A0A = A0A2.getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
            int i3 = A002 - (A0B2 * 2);
            this.A07 = i3;
            this.A08 = Color.argb(Math.round(38.25f), 0, 0, 0);
            RectF rectF = new RectF(0.0f, 0.0f, f, (float) i);
            this.A0I = rectF;
            float[] fArr = new float[8];
            fArr[0] = A0D2;
            fArr[1] = A0D2;
            fArr[2] = A0D2;
            fArr[3] = A0D2;
            AnonymousClass7TG.A11(path, rectF, fArr, A0D2);
            Drawable drawable = context2.getDrawable(R.drawable.sticker_background_shadow);
            this.A0U = drawable;
            0qQ.A0A(drawable);
            drawable.setCallback(this);
            float A012 = AnonymousClass7TE.A01(this.A0D, R.dimen.abc_dialog_padding_material);
            this.A0J.set(0.0f, 0.0f, A012, A012);
            float f2 = (float) i3;
            this.A0N = AnonymousClass7TE.A0s(context2, (int) ((f2 - A0Y.width()) - ((float) i2)));
            String A013 = ae3.A01();
            if (ae32 != null) {
                str = ae32.A01();
            } else {
                str = null;
            }
            int i4 = r1.A00;
            if (i4 > 0) {
                charSequence = 0bC.A02(this.A0C.getResources(), new String[]{A013, String.valueOf(i4)}, R.plurals.standalone_fundraiser_with_cohost_label, i4);
            } else if (str == null || str.length() == 0 || str.equals(A013)) {
                this.A0N.A0J(Typeface.SANS_SERIF, 1);
                charSequence = A013;
            } else {
                charSequence = 0bC.A01(this.A0C.getResources(), new String[]{A013, str}, 2131974171);
            }
            C306386Ly r12 = this.A0N;
            AnonymousClass7TF.A11(this.A0D, r12, R.dimen.account_discovery_bottom_gap);
            r12.A0F(-1);
            r12.A0D(10.0f, 0.0f, 0.0f, this.A08);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            r12.A0K(alignment2);
            r12.A0O = true;
            r12.A0M(charSequence);
            int i5 = (int) (f2 * 0.8f);
            C306386Ly A0s = AnonymousClass7TE.A0s(context2, i5);
            this.A0Q = A0s;
            Resources resources = this.A0D;
            AnonymousClass7TF.A11(resources, A0s, R.dimen.album_preview_add_item_margin);
            A0s.A0B(AnonymousClass7TE.A01(resources, R.dimen.standalone_fundraiser_sticker_title_text_line_spacing), 1.0f);
            A0s.A0J(AnonymousClass7TG.A0O(this.A0C), 1);
            A0s.A0F(-1);
            A0s.A0D(10.0f, 0.0f, 0.0f, this.A08);
            A0s.A0K(this.A0S ? Layout.Alignment.ALIGN_OPPOSITE : alignment2);
            A0s.A0G(3, "…");
            A0s.A0O = true;
            A0s.A0M(this.A0R.A09);
            C306386Ly A0s2 = AnonymousClass7TE.A0s(context2, i5);
            this.A0O = A0s2;
            AnonymousClass7TF.A11(this.A0D, A0s2, R.dimen.account_discovery_bottom_gap);
            Typeface typeface = Typeface.SANS_SERIF;
            A0s2.A0J(typeface, 1);
            A0s2.A0F(-1);
            A0s2.A0D(10.0f, 0.0f, 0.0f, this.A08);
            if (this.A0S) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            A0s2.A0K(alignment);
            A0s2.A0O = true;
            String str3 = this.A0R.A06;
            if (str3 != null) {
                Locale locale = Locale.getDefault();
                0qQ.A07(locale);
                String upperCase = str3.toUpperCase(locale);
                0qQ.A07(upperCase);
                A0s2.A0M(upperCase);
                this.A0L = context2.getDrawable(R.drawable.standalone_fundraiser_sticker_donate_button_background);
                C306386Ly A0s3 = AnonymousClass7TE.A0s(context2, i3);
                this.A0P = A0s3;
                Context context3 = this.A0C;
                AnonymousClass7TG.A0x(context3, A0s3, 14);
                A0s3.A0J(typeface, 1);
                A0s3.A0F(-16777216);
                A0s3.A0K(Layout.Alignment.ALIGN_CENTER);
                A0s3.A0C(0.0f, 14.0f);
                A0s3.A0M(context3.getString(182.A06(0Tu.A05, this.A0M, 36316624252441115L) ? 2131974170 : 2131974169));
                if ((ae32 == null || !ae32.A02) && !ae3.A02) {
                    bitmapDrawable = null;
                } else {
                    Context context4 = this.A0C;
                    int A022 = AnonymousClass7TF.A02(context4, R.dimen.account_discovery_bottom_gap);
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) context4.getDrawable(R.drawable.verified_profile);
                    0qQ.A0A(bitmapDrawable2);
                    Bitmap bitmap = bitmapDrawable2.getBitmap();
                    if (bitmap != null) {
                        bitmapDrawable = new BitmapDrawable(context4.getResources(), 0fO.A00(bitmap, A022, A022, true));
                        bitmapDrawable.setCallback(this);
                        AnonymousClass7TE.A1R(bitmapDrawable, context4.getColor(2Yu.A05(context4)));
                        AnonymousClass7TG.A13(bitmapDrawable);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                this.A0K = bitmapDrawable;
                SimpleImageUrl A003 = ae3.A00();
                if (A003 != null) {
                    1OO A0J2 = 1NK.A00().A0J(A003, "standalone_fundraiser_sticker");
                    A0J2.A08 = "profile_pic";
                    A0J2.A02(this);
                    A0J2.A01();
                }
                1OO A0J3 = 1NK.A00().A0J(extendedImageUrl, "standalone_fundraiser_sticker");
                A0J3.A08 = "media";
                A0J3.A02(this);
                A0J3.A01();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0w("Requires cover photo url");
    }

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0V.add(b1v);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0073 A[LOOP:0: B:9:0x006d->B:11:0x0073, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CyF(X.C226952iF r12, X.AnonymousClass3LX r13) {
        /*
            r11 = this;
            r3 = 0
            X.AnonymousClass7TF.A1H(r12, r13)
            java.lang.Object r1 = r12.C3s()
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r1)
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x007d
            android.graphics.Bitmap r2 = r13.A01
            if (r2 == 0) goto L_0x009b
            int r1 = r11.A06
            int r0 = r11.A05
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.extractThumbnail(r2, r1, r0)
            if (r2 == 0) goto L_0x0096
            r11.A00 = r2
            android.graphics.Paint r1 = r11.A0F
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r2, r10, r10)
            r1.setShader(r0)
            android.graphics.RectF r0 = r11.A0I
            float r4 = r0.width()
            float r7 = r0.height()
            android.graphics.Paint r2 = r11.A0E
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r5 = r7 * r0
            r1 = 4
            r0 = 1184197120(0x46956a00, float:19125.0)
            int r0 = java.lang.Math.round(r0)
            int r0 = android.graphics.Color.argb(r0, r3, r3, r3)
            int[] r8 = new int[]{r3, r3, r3, r0}
            float[] r9 = new float[r1]
            r9 = {0, 1048576000, 1056964608, 1065353216} // fill-array
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.setShader(r3)
            X.AlN r0 = new X.AlN
            r0.<init>(r11)
        L_0x0064:
            X.11Z.A02(r0)
        L_0x0067:
            java.util.concurrent.CopyOnWriteArraySet r0 = r11.A0V
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r0)
        L_0x006d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r1.next()
            X.B1v r0 = (X.C41815B1v) r0
            r0.DOX()
            goto L_0x006d
        L_0x007d:
            java.lang.String r0 = "profile_pic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0067
            android.graphics.Bitmap r0 = r13.A01
            if (r0 == 0) goto L_0x00a0
            android.graphics.Bitmap r0 = X.1MF.A05(r0)
            r11.A01 = r0
            X.AlO r0 = new X.AlO
            r0.<init>(r11)
            goto L_0x0064
        L_0x0095:
            return
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x009b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x00a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380159Ww.CyF(X.2iF, X.3LX):void");
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0V.remove(b1v);
    }

    public final void draw(Canvas canvas) {
        float f;
        boolean z;
        int i;
        int i2;
        int i3;
        0qQ.A0B(canvas, 0);
        if (!isLoading()) {
            Rect A0X = AnonymousClass7TE.A0X(this);
            Drawable drawable = this.A0U;
            0qQ.A0A(drawable);
            drawable.draw(canvas);
            canvas.save();
            AnonymousClass7TF.A13(canvas, A0X);
            canvas.save();
            Path path = this.A0H;
            canvas.drawPath(path, this.A0F);
            canvas.drawPath(path, this.A0E);
            RectF rectF = this.A0J;
            float height = rectF.height();
            float f2 = height / 2.0f;
            int i4 = this.A02;
            float f3 = (float) i4;
            boolean z2 = this.A0S;
            if (z2) {
                canvas.translate((float) (this.A06 - i4), f3);
                canvas.translate(-height, 0.0f);
            } else {
                canvas.translate(f3, f3);
            }
            Bitmap bitmap = this.A01;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rectF, this.A0G);
                C306386Ly r8 = this.A0N;
                float f4 = f2 - (((float) r8.A06) / 2.0f);
                int i5 = this.A09;
                if (z2) {
                    f = (float) ((-i5) - r8.A0A);
                } else {
                    f = height + ((float) i5);
                }
                canvas.translate(f, f4);
                r8.draw(canvas);
                Drawable drawable2 = this.A0K;
                if (drawable2 != null && this.A0R.A00 == 0) {
                    float intrinsicHeight = (float) ((r8.A06 - drawable2.getIntrinsicHeight()) - this.A0A);
                    if (z2) {
                        i3 = (-this.A0B) - drawable2.getIntrinsicWidth();
                    } else {
                        i3 = r8.A0A + this.A0B;
                    }
                    canvas.translate((float) i3, intrinsicHeight);
                    drawable2.draw(canvas);
                }
                canvas.restore();
                canvas.save();
                String str = this.A0R.A06;
                if (str != null) {
                    int i6 = 0;
                    if (str.length() == 0) {
                        z = true;
                        i = 0;
                        i2 = 0;
                    } else {
                        z = false;
                        C306386Ly r0 = this.A0O;
                        i = r0.A06;
                        i2 = r0.A0A;
                        i6 = this.A03;
                    }
                    int i7 = this.A05 - i4;
                    Drawable drawable3 = this.A0L;
                    0qQ.A0A(drawable3);
                    C306386Ly r10 = this.A0Q;
                    int i8 = r10.A06;
                    int i9 = r10.A0A;
                    float f5 = (float) ((this.A06 - i4) - i9);
                    float f6 = (float) (i8 + i6);
                    float f7 = (float) (i9 - i2);
                    canvas.translate(0.0f, (float) (((((i7 - drawable3.getIntrinsicHeight()) - this.A04) - i) - i6) - i8));
                    if (!z2) {
                        f5 = f3;
                    }
                    canvas.translate(f5, 0.0f);
                    r10.draw(canvas);
                    if (!z) {
                        canvas.translate(0.0f, f6);
                        if (z2) {
                            canvas.translate(f7, 0.0f);
                        } else {
                            canvas.translate(0.0f, 0.0f);
                        }
                        this.A0O.draw(canvas);
                    }
                    canvas.restore();
                    canvas.save();
                    0qQ.A0A(drawable3);
                    canvas.translate(f3, (float) (i7 - drawable3.getIntrinsicHeight()));
                    int i10 = this.A07;
                    drawable3.setBounds(0, 0, i10, drawable3.getIntrinsicHeight());
                    drawable3.draw(canvas);
                    float f8 = (float) (i10 / 2);
                    float intrinsicHeight2 = (float) (drawable3.getIntrinsicHeight() / 2);
                    C306386Ly r1 = this.A0P;
                    AnonymousClass7TF.A15(canvas, r1, f8 - ((float) (r1.A0A / 2)), intrinsicHeight2 - ((float) (r1.A06 / 2)));
                    canvas.restore();
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final void AHg() {
        this.A0V.clear();
    }

    public final String AsL() {
        return this.A0R.A05;
    }

    public final NewFundraiserInfo BVw() {
        return this.A0R.A01;
    }

    public final String C4F() {
        return 002.A0R("standalone_fundraiser_cover_photo_variant_", this.A0R.A07);
    }

    public final String getFundraiserId() {
        return this.A0R.A07;
    }

    public final int getIntrinsicHeight() {
        return this.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public final boolean isLoading() {
        if (this.A00 == null || this.A01 == null) {
            return true;
        }
        return false;
    }

    public final void setAlpha(int i) {
        this.A0F.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A0E.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0U;
        0qQ.A0A(drawable);
        int i5 = this.A0T;
        drawable.setBounds(i - i5, i2 - i5, i3 + i5, i4 + i5);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
