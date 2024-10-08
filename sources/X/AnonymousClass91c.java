package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewTreeObserver;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.91c  reason: invalid class name */
public abstract class AnonymousClass91c extends C306386Ly implements C321026tS, AnonymousClass5MJ, C3724991d {
    public int A00;
    public int A01;
    public boolean A02;
    public int A03;
    public final float A04;
    public final Paint A05;
    public final AnonymousClass6M4 A06;

    public AnonymousClass91c(Context context, int i) {
        super(context, i);
        Paint paint = new Paint(1);
        this.A05 = paint;
        this.A04 = 0nA.A00(context, 5.0f);
        Context context2 = this.A0Z;
        0qQ.A07(context2);
        this.A06 = C321156tf.A00(context2, this);
        paint.setColor(context.getColor(R.color.cds_white_a20));
    }

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final /* synthetic */ void EqG() {
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        if (A0W() > 0) {
            Spannable spannable = this.A0F;
            0qQ.A07(spannable);
            if (spannable.length() != 0) {
                if (this.A02) {
                    RectF rectF = new RectF(getBounds());
                    float f = rectF.left;
                    float f2 = this.A04;
                    rectF.left = f - f2;
                    rectF.right += f2;
                    rectF.top -= f2;
                    rectF.bottom += f2;
                    TextPaint textPaint = this.A0b;
                    canvas.drawRoundRect(rectF, textPaint.getTextSize() / 4.0f, textPaint.getTextSize() / 4.0f, this.A05);
                }
                canvas.save();
                canvas.translate((float) getBounds().left, (float) getBounds().top);
                A0H(canvas);
                TextPaint textPaint2 = this.A0b;
                0qQ.A07(textPaint2);
                int i = this.A00 - this.A01;
                if (i < 0) {
                    i = 0;
                }
                A0Z(canvas2, spannable, textPaint2, A08(), this.A00, this.A01, i);
                canvas.restore();
                this.A06.draw(canvas);
            }
        }
    }

    public float A0U() {
        return 0.0f;
    }

    public float A0V() {
        return 0.0f;
    }

    public C360728f3 A0X() {
        if (this instanceof C388639o9) {
            return ((C388639o9) this).A01;
        }
        return ((C388629o8) this).A03;
    }

    public void A0Y() {
        Spannable spannable;
        if ((this instanceof C388639o9) && (spannable = this.A0F) != null && spannable.length() != 0) {
            Spannable spannable2 = this.A0F;
            0qQ.A07(spannable2);
            C263324Kh.A05(spannable2, C389939qT.class);
            Spannable spannable3 = this.A0F;
            0qQ.A07(spannable3);
            C263324Kh.A05(spannable3, C380259Xg.class);
        }
    }

    public void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, 0rN r14, float f, float f2, int i) {
        StaticLayout staticLayout;
        Integer num;
        int i2;
        if (this instanceof C388639o9) {
            C388639o9 r3 = (C388639o9) this;
            0qQ.A0B(canvas, 0);
            staticLayout = r3.A0G;
            if (staticLayout != null) {
                float f3 = ((float) (i % IgNetworkConsentStorage.MAX_ENTRIES)) / 1000.0f;
                TimeInterpolator timeInterpolator = r3.A00;
                0qQ.A0B(timeInterpolator, 1);
                if (f3 < 0.25f) {
                    i2 = -10;
                } else {
                    int i3 = 10;
                    if (f3 < 0.5f) {
                        i2 = ((int) ((timeInterpolator.getInterpolation((f3 - 0.25f) * 4.0f) * 2.0f) * 10.0f)) - 10;
                    } else {
                        if (f3 >= 0.75f) {
                            i3 = 10 - ((int) ((timeInterpolator.getInterpolation((f3 - 0.75f) * 4.0f) * 2.0f) * 10.0f));
                        }
                        i2 = i3;
                    }
                }
                for (ViewTreeObserver.OnPreDrawListener onPreDraw : r3.A03) {
                    onPreDraw.onPreDraw();
                }
                for (C380259Xg r0 : r3.A04) {
                    r0.A00 = i2;
                }
                for (AnonymousClass91R r02 : r3.A02) {
                    r02.A04 = false;
                }
            } else {
                return;
            }
        } else {
            C388629o8 r6 = (C388629o8) this;
            0qQ.A0B(canvas, 0);
            0qQ.A0B(spannable, 2);
            staticLayout = r6.A0G;
            if (staticLayout != null) {
                List list = r6.A04;
                int i4 = i % CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                int i5 = r6.A02;
                float floatValue = ((Number) list.get(i4 / i5)).floatValue();
                float f4 = ((float) (i % i5)) / ((float) i5);
                if (floatValue == 0.0f) {
                    num = Integer.valueOf(r6.A01);
                } else {
                    num = null;
                    if (floatValue != 1.0f) {
                        float cos = ((1.0f - ((float) Math.cos(((double) (f4 * 2.0f)) * 3.141592653589793d))) / 2.0f) * floatValue;
                        floatValue = cos;
                        if (cos < 0.2f) {
                            floatValue = 0.0f;
                        }
                    }
                }
                C380239Xe r1 = (C380239Xe) C263324Kh.A00(spannable, C380239Xe.class);
                if (r1 != null) {
                    r1.A04 = Float.valueOf(floatValue * r6.A00);
                    r1.A05 = num;
                }
            } else {
                return;
            }
        }
        staticLayout.draw(canvas);
    }

    public final AnonymousClass6M4 C49() {
        return this.A06;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public void EXC(int i, int i2) {
        this.A00 = i;
        this.A03 = i2;
        invalidateSelf();
    }

    public final void FL9(boolean z, boolean z2) {
        this.A02 = z;
        AnonymousClass6M4 r0 = this.A06;
        if (z2) {
            r0.A01();
        } else {
            r0.A00();
        }
        invalidateSelf();
    }

    public final int A0W() {
        int durationInMs = getDurationInMs();
        int i = this.A03;
        if (i < 0) {
            i = durationInMs;
        }
        if (i <= 0) {
            return 0;
        }
        int i2 = (int) (((float) i) / ((float) durationInMs));
        if (i2 > 1) {
            return i / i2;
        }
        return i;
    }

    public final C2802350v BzV() {
        return C394809yj.A00(A0X(), this, true, false);
    }

    public final /* synthetic */ boolean CZ7(UserSession userSession) {
        return true;
    }

    public final void Dre(int i, int i2) {
        this.A01 = i;
    }
}
