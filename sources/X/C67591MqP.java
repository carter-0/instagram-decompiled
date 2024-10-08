package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.MqP  reason: case insensitive filesystem */
public final class C67591MqP extends Drawable implements AnonymousClass1MK, JPR {
    public float A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public Bitmap A04;
    public C67596MqU A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public final ValueAnimator A0C;
    public final Context A0D;
    public final C67590MqO A0E;
    public final String A0F;
    public final C62320sa A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final Matrix A0L;
    public final Paint A0M = AnonymousClass7TE.A0V(3);
    public final Paint A0N = AnonymousClass7TE.A0V(3);
    public final Paint A0O = AnonymousClass7TE.A0V(3);
    public final Paint A0P = AnonymousClass7TE.A0V(1);
    public final RectF A0Q;
    public final RectF A0R;
    public final Drawable A0S;
    public final Drawable A0T;
    public final UserSession A0U;
    public final boolean A0V;
    public final int[] A0W;

    public C67591MqP(Context context, UserSession userSession, C67590MqO mqO, C67596MqU mqU, C62320sa r10) {
        Drawable drawable;
        Drawable drawable2;
        int A022 = DbW.A02(1, context, userSession);
        AnonymousClass7TF.A1D(mqO, 3, mqU);
        this.A0D = context;
        this.A0U = userSession;
        this.A0E = mqO;
        this.A05 = mqU;
        this.A0G = r10;
        this.A0F = mqO.A01;
        float[] fArr = new float[A022];
        // fill-array-data instruction
        fArr[0] = 0;
        fArr[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        0qQ.A07(ofFloat);
        this.A0C = ofFloat;
        boolean z = true;
        this.A0W = new int[]{0, 0, AnonymousClass7TF.A03(context, R.attr.igds_color_primary_icon)};
        this.A0K = AnonymousClass7TF.A03(context, R.attr.igds_color_primary_background);
        this.A0J = AnonymousClass7TF.A03(context, R.attr.igds_color_elevated_separator);
        this.A0I = AnonymousClass7TF.A03(context, R.attr.igds_color_highlight_background);
        this.A0R = AnonymousClass7TE.A0Y();
        this.A0Q = AnonymousClass7TE.A0Y();
        this.A0L = new Matrix();
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_primary_text);
        Drawable drawable3 = context.getDrawable(R.drawable.instagram_flag_off_pano_outline_24);
        if (drawable3 == null || (drawable = drawable3.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(A032);
        }
        this.A0S = drawable;
        this.A0H = AnonymousClass7TF.A02(context, R.dimen.abc_button_padding_horizontal_material);
        int A033 = AnonymousClass7TF.A03(context, R.attr.igds_color_primary_text_on_media);
        Drawable drawable4 = context.getDrawable(R.drawable.instagram_lock_pano_filled_24);
        if (drawable4 == null || (drawable2 = drawable4.mutate()) == null) {
            drawable2 = null;
        } else {
            drawable2.setTint(A033);
        }
        this.A0T = drawable2;
        this.A0V = (!0qQ.A0K(this.A05, C67598MqW.A00) || !182.A06(0Tu.A05, userSession, 36321769626806013L)) ? false : z;
        Context context2 = this.A0D;
        int i = this.A05.A04;
        0qQ.A0B(context2, 0);
        this.A02 = AnonymousClass7TF.A02(context2, i);
        A02(this);
        A03(this);
        1OO A0J2 = 1NK.A00().A0J(DbS.A0V(mqO.A02), "friend_map");
        A0J2.A02(this);
        A0J2.A01();
        if (this.A0E.A04) {
            ValueAnimator valueAnimator = this.A0C;
            valueAnimator.setDuration(850);
            C71170Oej.A00(valueAnimator, this, 11);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.start();
        }
    }

    public final void A04(C67596MqU mqU, Long l, boolean z) {
        long j;
        0qQ.A0B(mqU, 0);
        if (!0qQ.A0K(this.A05, mqU)) {
            this.A05 = mqU;
            Context context = this.A0D;
            int i = mqU.A04;
            0qQ.A0B(context, 0);
            if (z) {
                int A022 = AnonymousClass7TF.A02(context, i);
                ValueAnimator valueAnimator = this.A03;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator A052 = JTQ.A05(this.A02, A022);
                if (this.A02 < A022) {
                    A052.setInterpolator(new OvershootInterpolator(1.6f));
                }
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 350;
                }
                A052.setDuration(j);
                C71170Oej.A00(A052, this, 10);
                A052.start();
                this.A03 = A052;
                return;
            }
            this.A02 = AnonymousClass7TF.A02(context, i);
            A02(this);
            A03(this);
        }
    }

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        0qQ.A0B(r3, 1);
        Bitmap bitmap = r3.A01;
        if (bitmap != null) {
            this.A04 = bitmap;
            A01(this);
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A04 != null || this.A05.A0A) {
            float centerX = this.A0R.centerX();
            canvas.save();
            AnonymousClass7TG.A0z(canvas, this);
            canvas.drawCircle(centerX, centerX, centerX, this.A0P);
            C67590MqO mqO = this.A0E;
            if (mqO.A04) {
                canvas.save();
                canvas.rotate(this.A00, centerX, centerX);
                canvas.drawCircle(centerX, centerX, centerX, this.A0M);
                canvas.restore();
            }
            boolean z = this.A0V;
            if (!z) {
                canvas.drawCircle(centerX, centerX, centerX - ((float) this.A07), this.A0O);
            }
            if (this.A04 != null) {
                float f = (centerX - ((float) this.A07)) - ((float) this.A09);
                canvas.save();
                float f2 = (float) (this.A07 + this.A09);
                canvas.translate(f2, f2);
                canvas.drawCircle(f, f, f, this.A0N);
                canvas.restore();
            }
            if (this.A05.A08) {
                canvas.save();
                float f3 = (float) (this.A07 + this.A09 + this.A0H);
                canvas.translate(f3, f3);
                Drawable drawable = this.A0S;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                canvas.restore();
            }
            if (mqO.A05) {
                C67596MqU mqU = this.A05;
                if ((mqU instanceof Nd8) || (mqU instanceof C67597MqV)) {
                    canvas.save();
                    canvas.translate((((float) (this.A07 + this.A09)) + (((float) this.A08) / 2.0f)) - (((float) A00()) / 2.0f), (((float) (this.A07 + this.A09)) + (((float) this.A08) / 2.0f)) - (((float) A00()) / 2.0f));
                    Drawable drawable2 = this.A0T;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    canvas.restore();
                }
            }
            if (!z) {
                C14504TxQ.A00(canvas, this.A0Q, this.A0K);
            }
            canvas.restore();
        }
    }

    @Deprecated(message = "This method is no longer used in graphics optimizations", replaceWith = @ReplaceWith(expression = "Not Applicable", imports = {}))
    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A0R;
        int i = this.A02;
        rectF.set(new Rect(0, 0, i, i));
        float width = C14504TxQ.A00.width() * 3.0f;
        float centerX = rectF.centerX() - (width / 2.0f);
        float f = rectF.bottom - ((float) this.A0B);
        this.A0Q.set(centerX, f, width + centerX, ((float) this.A0A) + f);
    }

    private final int A00() {
        boolean A0K2 = 0qQ.A0K(this.A05, C67597MqV.A00);
        Context context = this.A0D;
        int i = R.dimen.abc_dialog_padding_material;
        if (A0K2) {
            i = R.dimen.ai_sticker_creation_suggested_prompt_pill_height;
        }
        0qQ.A0B(context, 0);
        return AnonymousClass7TF.A02(context, i);
    }

    public static final void A01(C67591MqP mqP) {
        Bitmap bitmap = mqP.A04;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            Bitmap bitmap2 = mqP.A04;
            if (bitmap2 != null) {
                Rect rect = new Rect(0, 0, width, bitmap2.getHeight());
                int i = mqP.A08;
                Rect rect2 = new Rect(0, 0, i, i);
                Matrix matrix = mqP.A0L;
                AnonymousClass3JT.A0A(matrix, rect, rect2);
                int i2 = mqP.A08;
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                0qQ.A07(createBitmap);
                Canvas canvas = new Canvas(createBitmap);
                Bitmap bitmap3 = mqP.A04;
                if (bitmap3 != null) {
                    Paint paint = mqP.A0N;
                    canvas.drawBitmap(bitmap3, matrix, paint);
                    if (!mqP.A05.A08) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    }
                    mqP.invalidateSelf();
                    mqP.A0G.invoke();
                    return;
                }
            }
            0qQ.A0F("bitmap");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A02(C67591MqP mqP) {
        int A022;
        int A023;
        boolean z = mqP.A0V;
        if (z) {
            A022 = 0;
        } else {
            Context context = mqP.A0D;
            int i = mqP.A05.A02;
            0qQ.A0B(context, 0);
            A022 = AnonymousClass7TF.A02(context, i);
        }
        mqP.A07 = A022;
        if (z) {
            A023 = 0;
        } else {
            Context context2 = mqP.A0D;
            int i2 = mqP.A05.A05;
            0qQ.A0B(context2, 0);
            A023 = AnonymousClass7TF.A02(context2, i2);
        }
        mqP.A09 = A023;
        int A012 = AnonymousClass1GB.A01((((float) mqP.A02) - (((float) mqP.A07) * 2.0f)) - (((float) A023) * 2.0f));
        mqP.A08 = A012;
        int A013 = AnonymousClass1GB.A01(((float) A012) - (((float) mqP.A0H) * 2.0f));
        Drawable drawable = mqP.A0S;
        if (drawable != null) {
            drawable.setBounds(0, 0, A013, A013);
        }
        Drawable drawable2 = mqP.A0T;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, mqP.A00(), mqP.A00());
        }
        Context context3 = mqP.A0D;
        int i3 = mqP.A05.A03;
        0qQ.A0B(context3, 0);
        int A024 = AnonymousClass7TF.A02(context3, i3);
        int i4 = 0;
        if (mqP.A05.A09) {
            i4 = A024;
        }
        mqP.A0A = i4;
        int A025 = AnonymousClass7TF.A02(context3, R.dimen.annotation_hidden_location_pill_nub_padding);
        int i5 = 0;
        if (mqP.A05.A09) {
            i5 = A025;
        }
        mqP.A0B = i5;
        mqP.A01 = mqP.A02 + (mqP.A0A - i5);
        int A026 = AnonymousClass7TF.A02(context3, R.dimen.abc_edit_text_inset_top_material);
        int i6 = 0;
        if (!mqP.A05.A07) {
            i6 = A026;
        }
        mqP.A06 = (float) i6;
        mqP.setBounds(new Rect(0, 0, mqP.A02, mqP.A01));
        A01(mqP);
        mqP.invalidateSelf();
        mqP.A0G.invoke();
    }

    public static final void A03(C67591MqP mqP) {
        int i;
        Paint paint = mqP.A0O;
        paint.setColor(mqP.A0J);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = mqP.A0N;
        paint2.setColor(mqP.A0I);
        paint2.setStyle(style);
        Paint paint3 = mqP.A0P;
        paint3.setColor(mqP.A0K);
        paint3.setStyle(style);
        float f = mqP.A06;
        C67596MqU mqU = mqP.A05;
        float f2 = f * mqU.A01;
        float f3 = mqU.A00;
        boolean z = mqU instanceof C69025Nd2;
        Context context = mqP.A0D;
        if (z) {
            0qQ.A0B(context, 0);
            i = R.color.background;
        } else {
            0qQ.A0B(context, 0);
            i = R.color.black_30_transparent;
        }
        paint3.setShadowLayer(f2, 0.0f, f3, context.getColor(i));
        Paint paint4 = mqP.A0M;
        RectF rectF = mqP.A0R;
        paint4.setShader(new SweepGradient(rectF.centerX(), rectF.centerY(), mqP.A0W, (float[]) null));
    }

    public final boolean AkI() {
        if (this.A0E.A00 == null || !this.A05.A06) {
            return false;
        }
        return true;
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public final void setAlpha(int i) {
        this.A0N.setAlpha(i);
        this.A0O.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0N.setColorFilter(colorFilter);
        this.A0O.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
