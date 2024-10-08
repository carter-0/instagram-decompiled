package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.627  reason: invalid class name */
public final class AnonymousClass627 extends ImageView implements AnonymousClass59Q {
    public float A00;
    public int A01;
    public C56003Hr9 A02;
    public AnonymousClass59N A03 = AnonymousClass59N.A01;
    public GZ0 A04;
    public AnonymousClass6L9 A05;
    public C3028065i A06;
    public Map A07;
    public boolean A08;
    public AnonymousClass59P A09;
    public ImmutableMap A0A;
    public final C283285Gy A0B = new AnonymousClass628(this);
    public final AnonymousClass629 A0C = new AnonymousClass629();
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new C377129Kq(this, 40));

    public final boolean A00(X2R x2r) {
        AnonymousClass59P r1;
        if (this.A05 == null) {
            if (!(x2r instanceof WIJ)) {
                GZ0 gz0 = this.A04;
                if (!(gz0 == null || !(!gz0.A04.isEmpty()) || (r1 = this.A09) == null)) {
                    this.A05 = new AnonymousClass6L9(gz0, r1);
                }
            }
            return false;
        }
        AnonymousClass6L9 r0 = this.A05;
        if (r0 != null) {
            r0.A01.A02.A01(x2r);
            return true;
        }
        return false;
    }

    public final void Eaf(AnonymousClass59N r4, GZ0 gz0, AnonymousClass59P r6, Map map, boolean z, boolean z2) {
        setLayerType(0, (Paint) null);
        C226492gu r2 = gz0.A00;
        r2.FNX(0.0f, 1.0f).EL2(0.0f);
        setImageDrawable((Drawable) r2);
        this.A07 = map;
        this.A03 = r4;
        this.A04 = gz0;
        this.A08 = z2;
        this.A09 = r6;
        r2.EDF();
        r2.A8s(new C14531Txr(this));
    }

    public final void onDraw(Canvas canvas) {
        List<RectF> list;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        C56003Hr9 hr9 = this.A02;
        if (hr9 != null) {
            hr9.A00(canvas, getWidth(), getHeight());
        }
        C3028065i r3 = this.A06;
        if (r3 != null && (list = r3.A00) != null) {
            for (RectF drawRect : list) {
                canvas.drawRect(drawRect, r3.A01);
            }
        }
    }

    public final void setClickableLayersIndicatorEnabled(boolean z) {
        this.A06 = null;
        if (z) {
            this.A06 = new C3028065i();
        }
    }

    public final void setPlaceholderDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        setImageDrawable(drawable);
        this.A04 = null;
        this.A0A = null;
        this.A07 = null;
    }

    private final GestureDetector getTapDetector() {
        return (GestureDetector) this.A0D.getValue();
    }

    public final ImmutableMap getRenderingComponentInfos() {
        GZ0 gz0;
        boolean z;
        List list;
        float f;
        float f2;
        GZ0 gz02;
        ImmutableMap immutableMap = this.A0A;
        if (immutableMap != null || (gz0 = this.A04) == null) {
            return immutableMap;
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        C226492gu r6 = gz0.A00;
        List<QP5> list2 = (List) gz0.A01.A00;
        AnonymousClass61R r62 = (AnonymousClass61R) r6;
        float f3 = r62.A03.A03;
        if (list2.isEmpty() || f3 == 1.0f || !this.A08) {
            z = false;
        } else {
            z = true;
            r62.EL2(1.0f);
        }
        for (QP5 qp5 : list2) {
            String str = qp5.A02;
            String str2 = qp5.A01;
            String str3 = qp5.A03;
            String str4 = qp5.A00;
            Map map = r62.A02.A0F;
            if (!(map == null || (list = (List) map.get(str)) == null || !(!list.isEmpty()))) {
                C71572e9 r1 = (C71572e9) list.get(0);
                0qQ.A0A(r1);
                0qQ.A0B(r1, 1);
                0qQ.A0B(str2, 2);
                0qQ.A0B(str3, 3);
                RectF rectF = r1.A0A;
                0qQ.A07(rectF);
                Rect bounds = r62.getBounds();
                0qQ.A07(bounds);
                int width = bounds.width();
                int height = bounds.height();
                int width2 = getWidth();
                int height2 = getHeight();
                float f4 = 0.0f;
                if (width * height2 > width2 * height) {
                    f = ((float) height2) / ((float) height);
                    f4 = (((float) width2) - (((float) width) * f)) * 0.5f;
                    f2 = 0.0f;
                } else {
                    f = ((float) width2) / ((float) width);
                    f2 = (((float) height2) - (((float) height) * f)) * 0.5f;
                }
                int i = (int) ((rectF.left * f) + f4);
                int i2 = (int) ((rectF.top * f) + f2);
                int height3 = (int) (rectF.height() * f);
                int width3 = (int) (f * rectF.width());
                String str5 = null;
                if ("image".equals(str3) && (gz02 = this.A04) != null) {
                    for (JV7 jv7 : gz02.A03) {
                        if (0qQ.A0K(jv7.A01, str4)) {
                            str5 = jv7.A02;
                        }
                    }
                }
                builder.put(str3, new S1s(new C10952S2k(i, i2, width3, height3, str5), str2, str3));
            }
        }
        if (z) {
            r62.EL2(f3);
        }
        ImmutableMap build = builder.build();
        0qQ.A07(build);
        this.A0A = build;
        return build;
    }

    public final float getTopMargin$fbandroid_java_com_facebook_showreelnativesdk_core_ui_ui() {
        return this.A00;
    }

    public final int getVerticalScrollPosition$fbandroid_java_com_facebook_showreelnativesdk_core_ui_ui() {
        return this.A01;
    }

    public final void setDebugIndicatorEnabled(boolean z) {
        if (z && this.A02 == null) {
            Context context = getContext();
            0qQ.A07(context);
            this.A02 = new C56003Hr9(context);
        }
        C56003Hr9 hr9 = this.A02;
        if (hr9 != null) {
            hr9.A02 = z;
        }
    }

    public final void setDebugInfoText(String str) {
        if (str != null && this.A02 == null) {
            Context context = getContext();
            0qQ.A07(context);
            this.A02 = new C56003Hr9(context);
        }
        C56003Hr9 hr9 = this.A02;
        if (hr9 != null) {
            hr9.A01 = str;
        }
    }

    public AnonymousClass627(Context context) {
        super(context);
    }

    public final float getDuration() {
        C226492gu keyframesAnimatable = getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            return keyframesAnimatable.AzF();
        }
        return 0.0f;
    }

    public final C226492gu getKeyframesAnimatable() {
        if (!(getDrawable() instanceof C226492gu)) {
            return null;
        }
        Drawable drawable = getDrawable();
        0qQ.A0C(drawable, "null cannot be cast to non-null type com.facebook.keyframes.common.KeyframesAnimatable");
        return (C226492gu) drawable;
    }

    public final float getProgress() {
        C226492gu keyframesAnimatable = getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            return keyframesAnimatable.BhR();
        }
        return 0.0f;
    }

    public final int getRepeatsRemaining() {
        C226492gu keyframesAnimatable = getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            return keyframesAnimatable.Bm3();
        }
        return 0;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A052 = AnonymousClass0fD.A05(692525514);
        0qQ.A0B(motionEvent, 0);
        if (this.A07 == null) {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -2062769215;
        } else {
            AnonymousClass629 r6 = this.A0C;
            AnonymousClass59N r4 = this.A03;
            0qQ.A0B(r4, 1);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (r6.A03 == AnonymousClass05K.A01) {
                    C376649Iu r3 = r6.A02;
                    PointF pointF = r6.A00;
                    RectF rectF = r6.A01;
                    if (!(r3 == null || pointF == null || rectF == null)) {
                        r4.DIY(pointF, rectF, r3, AnonymousClass05K.A0N);
                    }
                }
                r6.A03 = AnonymousClass05K.A00;
            }
            onTouchEvent = getTapDetector().onTouchEvent(motionEvent);
            i = -714951262;
        }
        AnonymousClass0fD.A0C(i, A052);
        return onTouchEvent;
    }

    public final void setTopMargin(float f) {
        this.A00 = f;
    }

    public final void setVerticalScrollPosition(int i) {
        this.A01 = i;
    }
}
