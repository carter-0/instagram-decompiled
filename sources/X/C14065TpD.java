package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.TpD  reason: case insensitive filesystem */
public final class C14065TpD {
    public final List A00 = new ArrayList();

    public final boolean A00(MotionEvent motionEvent) {
        float focusY;
        List<C17171VLa> list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C17171VLa vLa : list) {
                WJn wJn = vLa.A00;
                int i = WJn.A0U;
                if (wJn.A0I != null && (motionEvent.getPointerCount() == 2 || wJn.A0J != AnonymousClass05K.A00)) {
                    Integer num = wJn.A0J;
                    Integer num2 = AnonymousClass05K.A0C;
                    if (!(num == num2 || num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0N)) {
                        Rect rect = wJn.A0O;
                        rect.setEmpty();
                        WJn.A00(wJn).getGlobalVisibleRect(rect);
                        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                            continue;
                        }
                    }
                    ScaleGestureDetector scaleGestureDetector = wJn.A0Q;
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            Integer num3 = wJn.A0J;
                            Integer num4 = AnonymousClass05K.A0Y;
                            float focusX = scaleGestureDetector.getFocusX();
                            if (num3 == num4) {
                                WJn.A03(wJn, focusX - wJn.A08, scaleGestureDetector.getFocusY() - wJn.A09);
                                return true;
                            }
                            wJn.A06 = focusX;
                            wJn.A07 = scaleGestureDetector.getFocusY();
                            return true;
                        } else if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                return true;
                            }
                            if (wJn.A0J == num2) {
                                wJn.A0J = AnonymousClass05K.A0Y;
                                if (motionEvent.getPointerCount() == 2) {
                                    int pointerCount = (motionEvent.getPointerCount() - motionEvent.getActionIndex()) - 1;
                                    wJn.A08 = motionEvent.getX(pointerCount) - wJn.A06;
                                    focusY = motionEvent.getY(pointerCount);
                                } else {
                                    wJn.A08 = scaleGestureDetector.getFocusX() - wJn.A06;
                                    focusY = scaleGestureDetector.getFocusY();
                                }
                                wJn.A09 = focusY - wJn.A07;
                                return true;
                            }
                        }
                    }
                    Integer num5 = wJn.A0J;
                    if (num5 != num2 && num5 != AnonymousClass05K.A0Y) {
                        return true;
                    }
                    View A002 = WJn.A00(wJn);
                    float width = ((((float) A002.getWidth()) * 1.0f) - ((float) A002.getWidth())) / 2.0f;
                    float height = ((1.0f * ((float) A002.getHeight())) - ((float) A002.getHeight())) / 2.0f;
                    float f = -width;
                    float A04 = C13989Tnp.A04(Float.valueOf(wJn.A03), f, width);
                    float f2 = -height;
                    float A042 = C13989Tnp.A04(Float.valueOf(wJn.A04), f2, height);
                    float f3 = wJn.A0L;
                    if (A04 > f + f3 || f > A04) {
                        f = A04;
                    }
                    if (width - f3 > f || f > width) {
                        width = f;
                    }
                    if (A042 > f2 + f3 || f2 > A042) {
                        f2 = A042;
                    }
                    if (height - f3 > f2 || f2 > height) {
                        height = f2;
                    }
                    Float valueOf = Float.valueOf(width);
                    Float valueOf2 = Float.valueOf(height);
                    float floatValue = valueOf.floatValue();
                    float floatValue2 = valueOf2.floatValue();
                    double d = (double) floatValue;
                    double d2 = (double) wJn.A0C;
                    wJn.A00 = ((double) wJn.A0B) + d;
                    wJn.A01 = d2 + ((double) floatValue2);
                    2cs r2 = wJn.A0F;
                    if (r2 != null) {
                        2cs r1 = wJn.A0G;
                        if (r1 != null) {
                            r2.A02();
                            r2.A0A(wJn);
                            r2.A04();
                            wJn.A0J = AnonymousClass05K.A01;
                            wJn.A0K = false;
                            if (!r1.A0C() || !r2.A0C()) {
                                return true;
                            }
                            wJn.A04();
                            return true;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        return false;
    }
}
