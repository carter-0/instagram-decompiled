package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Ll  reason: invalid class name and case insensitive filesystem */
public final class C330107Ll extends Drawable {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public StaticLayout A05;
    public CharSequence A06;
    public CharSequence A07;
    public List A08;
    public Map A09;
    public final ValueAnimator A0A;
    public final Context A0B;
    public final TextPaint A0C;
    public final TextPaint A0D;
    public final String A0E;
    public final HashMap A0F = new HashMap();
    public final HashMap A0G;
    public final HashMap A0H;
    public final AnonymousClass0eM A0I;
    public final C62320sa A0J;
    public final boolean A0K;
    public final float A0L;
    public final float A0M;
    public final int A0N;
    public final UserSession A0O;
    public final boolean A0P;

    public C330107Ll(Context context, UserSession userSession, C62320sa r9) {
        this.A0B = context;
        this.A0J = r9;
        this.A0O = userSession;
        this.A0L = 0nA.A04(context, 12);
        this.A0M = 0nA.A04(context, 3);
        this.A0P = 0mk.A02(context);
        this.A0N = context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text));
        this.A08 = 0sn.A00;
        this.A09 = 0Yt.A0E();
        this.A0G = new HashMap();
        this.A0H = new HashMap();
        this.A0K = 182.A06(0Tu.A05, userSession, 36329053887807241L);
        this.A0E = " • ";
        this.A0I = AnonymousClass1YB.A00(new AnonymousClass9L4(this, 43));
        this.A03 = -1;
        this.A00 = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(2900);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new C330117Lm(this));
        ofFloat.addListener(new C330127Ln(this));
        this.A0A = ofFloat;
        TextPaint textPaint = new TextPaint();
        A02(textPaint, false);
        this.A0D = textPaint;
        TextPaint textPaint2 = new TextPaint();
        A02(textPaint2, true);
        this.A0C = textPaint2;
    }

    public final void draw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        int height = getBounds().height();
        float width = (float) getBounds().width();
        float f2 = ((float) height) - this.A0M;
        CharSequence charSequence = this.A07;
        float f3 = 0.0f;
        if (charSequence != null) {
            boolean z = this.A0P;
            if (z) {
                f = width - 0.0f;
            } else {
                f = 0.0f;
            }
            if (this.A0K) {
                StaticLayout staticLayout = this.A05;
                if (staticLayout == null) {
                    staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.A0C, this.A02).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(1).build();
                    0qQ.A07(staticLayout);
                    this.A05 = staticLayout;
                }
                canvas2.save();
                canvas2.translate(f, 0.0f);
                staticLayout.draw(canvas2);
                canvas2.restore();
            } else {
                CharSequence charSequence2 = this.A06;
                if (charSequence2 == null) {
                    charSequence2 = TextUtils.ellipsize(charSequence, this.A0C, (float) this.A02, TextUtils.TruncateAt.END);
                    this.A06 = charSequence2;
                    0qQ.A0A(charSequence2);
                }
                canvas2.drawText(charSequence2, 0, charSequence2.length(), f, f2, this.A0C);
            }
            f3 = 0.0f + this.A01;
            if (!this.A08.isEmpty()) {
                TextPaint textPaint = this.A0D;
                textPaint.setAlpha(255);
                textPaint.setColor(this.A0N);
                float floatValue = this.A01 - ((Number) this.A0I.getValue()).floatValue();
                String str = this.A0E;
                if (z) {
                    floatValue = width - floatValue;
                }
                canvas2.drawText(str, floatValue, f2, textPaint);
            }
        }
        if (!this.A08.isEmpty()) {
            if (this.A0P) {
                f3 = width - f3;
            }
            if (this.A08.size() > 1) {
                float f4 = this.A00;
                if (f4 > 0.0f && f4 < 1.0f) {
                    TextPaint textPaint2 = this.A0D;
                    textPaint2.setAlpha((int) ((1.0f - f4) * 255.0f));
                    int i = this.A03;
                    if (i == 0) {
                        i = this.A08.size();
                    }
                    int A002 = A00(i - 1);
                    List list = this.A08;
                    int i2 = this.A03;
                    if (i2 == 0) {
                        i2 = list.size();
                    }
                    textPaint2.setColor(A002);
                    A01(canvas2, (CharSequence) list.get(i2 - 1), f3, f2, (-f2) * this.A00);
                }
            }
            TextPaint textPaint3 = this.A0D;
            textPaint3.setAlpha((int) (this.A00 * 255.0f));
            textPaint3.setColor(A00(this.A03));
            CharSequence charSequence3 = (CharSequence) this.A08.get(this.A03);
            A01(canvas2, charSequence3, f3, f2, f2 * (1.0f - this.A00));
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        if (rect.width() != this.A02) {
            this.A0F.clear();
            this.A0H.clear();
            this.A06 = null;
            this.A05 = null;
            this.A02 = rect.width();
        }
    }

    private final int A00(int i) {
        Number number = (Number) this.A09.get(Integer.valueOf(i));
        if (number == null) {
            return this.A0N;
        }
        HashMap hashMap = this.A0G;
        Object obj = hashMap.get(number);
        if (obj == null) {
            Context context = this.A0B;
            obj = Integer.valueOf(context.getColor(2Yu.A0H(context, number.intValue())));
            hashMap.put(number, obj);
        }
        return ((Number) obj).intValue();
    }

    private final void A01(Canvas canvas, CharSequence charSequence, float f, float f2, float f3) {
        Canvas canvas2 = canvas;
        float f4 = f;
        float f5 = f3;
        CharSequence charSequence2 = charSequence;
        if (!this.A0K) {
            HashMap hashMap = this.A0F;
            CharSequence charSequence3 = (CharSequence) hashMap.get(charSequence2);
            if (charSequence3 == null) {
                charSequence3 = TextUtils.ellipsize(charSequence2, this.A0D, ((float) this.A02) - this.A01, TextUtils.TruncateAt.END);
                hashMap.put(charSequence2, charSequence3);
                0qQ.A0A(charSequence3);
            }
            canvas2.drawText(charSequence3, 0, charSequence3.length(), f4, f2 + f3, this.A0D);
        } else if (this.A01 < ((float) this.A02)) {
            HashMap hashMap2 = this.A0H;
            Object obj = hashMap2.get(charSequence2);
            if (obj == null) {
                obj = StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.A0D, (int) (((float) this.A02) - this.A01)).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(1).build();
                0qQ.A07(obj);
                hashMap2.put(charSequence2, obj);
            }
            Layout layout = (Layout) obj;
            if (layout != null) {
                canvas2.save();
                canvas2.translate(f4, f5);
                layout.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    private final void A02(TextPaint textPaint, boolean z) {
        Paint.Align align;
        textPaint.setColor(this.A0N);
        textPaint.setTextSize(this.A0L);
        textPaint.setAntiAlias(true);
        textPaint.setFakeBoldText(z);
        textPaint.setStyle(Paint.Style.FILL);
        if (this.A0P) {
            align = Paint.Align.RIGHT;
        } else {
            align = Paint.Align.LEFT;
        }
        textPaint.setTextAlign(align);
    }

    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (visible) {
            this.A03 = 0;
            this.A04 = 0;
            if (isVisible()) {
                if (this.A08.size() > 1) {
                    ValueAnimator valueAnimator = this.A0A;
                    if (!valueAnimator.isRunning()) {
                        valueAnimator.start();
                    }
                }
            } else if (!isVisible()) {
                this.A0A.cancel();
                this.A04 = 0;
                return visible;
            }
        }
        return visible;
    }
}
