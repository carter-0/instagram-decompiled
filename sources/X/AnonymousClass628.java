package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.Map;

/* renamed from: X.628  reason: invalid class name */
public final class AnonymousClass628 extends C283285Gy {
    public final /* synthetic */ AnonymousClass627 A00;

    public final boolean onDown(MotionEvent motionEvent) {
        float f;
        float f2;
        RectF rectF;
        0qQ.A0B(motionEvent, 0);
        AnonymousClass627 r3 = this.A00;
        AnonymousClass629 r5 = r3.A0C;
        Map map = r3.A07;
        C226492gu keyframesAnimatable = r3.getKeyframesAnimatable();
        AnonymousClass59N r1 = r3.A03;
        0qQ.A0B(r1, 4);
        r5.A02 = null;
        r5.A00 = null;
        r5.A01 = null;
        if (!r1.AFX() || map == null || map.isEmpty() || keyframesAnimatable == null) {
            return false;
        }
        Drawable drawable = (Drawable) keyframesAnimatable;
        0qQ.A0B(drawable, 0);
        Rect bounds = drawable.getBounds();
        0qQ.A07(bounds);
        int width = bounds.width();
        int height = bounds.height();
        int width2 = r3.getWidth();
        int height2 = r3.getHeight();
        float f3 = 0.0f;
        if (width * height2 > width2 * height) {
            f = ((float) height2) / ((float) height);
            f3 = (((float) width2) - (((float) width) * f)) * 0.5f;
            f2 = 0.0f;
        } else {
            f = ((float) width2) / ((float) width);
            f2 = (((float) height2) - (((float) height) * f)) * 0.5f;
        }
        if (drawable.getBounds().width() == 0 || drawable.getBounds().height() == 0) {
            return false;
        }
        float f4 = f3 / f;
        float f5 = f2 / f;
        C49443Evk CLv = keyframesAnimatable.CLv((String[]) 00k.A0Y(map.keySet()).toArray(new String[0]), (motionEvent.getX() / f) - f4, (motionEvent.getY() / f) - f5);
        if (CLv == null || !map.containsKey(CLv.A01) || !map.containsKey(CLv.A01) || (rectF = CLv.A00) == null) {
            return false;
        }
        float top = (((float) r3.getTop()) + r3.A00) - ((float) r3.A01);
        RectF rectF2 = new RectF((rectF.left + f4) * f, ((rectF.top + f5) * f) + top, (rectF.right + f4) * f, ((rectF.bottom + f5) * f) + top);
        r5.A02 = (C376649Iu) map.get(CLv.A01);
        r5.A00 = new PointF(motionEvent.getX(), motionEvent.getY());
        r5.A01 = rectF2;
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        float f;
        float f2;
        C49443Evk CLv;
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        AnonymousClass627 r1 = this.A00;
        AnonymousClass629 r6 = r1.A0C;
        Map map = r1.A07;
        C226492gu keyframesAnimatable = r1.getKeyframesAnimatable();
        AnonymousClass59N r8 = r1.A03;
        0qQ.A0B(r8, 4);
        if (r8.AFX() && map != null && !map.isEmpty() && keyframesAnimatable != null) {
            C376649Iu r7 = r6.A02;
            PointF pointF = r6.A00;
            RectF rectF = r6.A01;
            if (r7 != null && pointF != null && rectF != null) {
                Drawable drawable = (Drawable) keyframesAnimatable;
                0qQ.A0B(drawable, 0);
                Rect bounds = drawable.getBounds();
                0qQ.A07(bounds);
                int width = bounds.width();
                int height = bounds.height();
                int width2 = r1.getWidth();
                int height2 = r1.getHeight();
                float f3 = 0.0f;
                if (width * height2 > width2 * height) {
                    f = ((float) height2) / ((float) height);
                    f3 = (((float) width2) - (((float) width) * f)) * 0.5f;
                    f2 = 0.0f;
                } else {
                    f = ((float) width2) / ((float) width);
                    f2 = (((float) height2) - (((float) height) * f)) * 0.5f;
                }
                if (drawable.getBounds().width() != 0 && drawable.getBounds().height() != 0 && (CLv = keyframesAnimatable.CLv((String[]) 00k.A0Y(map.keySet()).toArray(new String[0]), (motionEvent2.getX() / f) - (f3 / f), (motionEvent2.getY() / f) - (f2 / f))) != null && map.containsKey(CLv.A01)) {
                    r8.DIY(pointF, rectF, r7, AnonymousClass05K.A0C);
                    Integer num = r6.A03;
                    Integer num2 = AnonymousClass05K.A01;
                    if (num != num2) {
                        r6.A03 = num2;
                    }
                }
            }
        }
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        PointF pointF;
        RectF rectF;
        0qQ.A0B(motionEvent, 0);
        AnonymousClass627 r0 = this.A00;
        AnonymousClass629 r1 = r0.A0C;
        AnonymousClass59N r4 = r0.A03;
        0qQ.A0B(r4, 1);
        r1.A03 = AnonymousClass05K.A00;
        C376649Iu r3 = r1.A02;
        if (r3 == null || (pointF = r1.A00) == null || (rectF = r1.A01) == null) {
            return true;
        }
        return r4.DIY(pointF, rectF, r3, AnonymousClass05K.A01);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PointF pointF;
        RectF rectF;
        0qQ.A0B(motionEvent, 0);
        AnonymousClass627 r0 = this.A00;
        AnonymousClass629 r5 = r0.A0C;
        AnonymousClass59N r4 = r0.A03;
        0qQ.A0B(r4, 1);
        Integer num = AnonymousClass05K.A00;
        r5.A03 = num;
        C376649Iu r2 = r5.A02;
        if (r2 == null || (pointF = r5.A00) == null || (rectF = r5.A01) == null) {
            return true;
        }
        return r4.DIY(pointF, rectF, r2, num);
    }

    public AnonymousClass628(AnonymousClass627 r1) {
        this.A00 = r1;
    }
}
