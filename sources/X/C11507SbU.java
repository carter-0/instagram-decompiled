package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.SbU  reason: case insensitive filesystem */
public final class C11507SbU implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public C11507SbU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnTouchListener(new C11507SbU(obj, i));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        String str;
        switch (this.A00) {
            case 6:
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            case 7:
                0qQ.A0B(motionEvent, 1);
                C7925Qcw qcw = (C7925Qcw) this.A01;
                ScaleGestureDetector scaleGestureDetector = qcw.A07;
                if (scaleGestureDetector != null) {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                }
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                return true;
                            }
                        } else if (pointerId != qcw.A05) {
                            return true;
                        } else {
                            float x = motionEvent.getX(actionIndex);
                            f = motionEvent.getY(actionIndex);
                            ImageView imageView = qcw.A0G;
                            0qQ.A0A(imageView);
                            float translationX = imageView.getTranslationX() + (x - qcw.A02);
                            ImageView imageView2 = qcw.A0G;
                            0qQ.A0A(imageView2);
                            float translationY = imageView2.getTranslationY() + (f - qcw.A03);
                            float f2 = qcw.A01;
                            float f3 = qcw.A04;
                            float f4 = f2 * f3;
                            float f5 = qcw.A00 * f3;
                            FrameLayout frameLayout = qcw.A0B;
                            0qQ.A0A(frameLayout);
                            float width = (float) frameLayout.getWidth();
                            FrameLayout frameLayout2 = qcw.A0B;
                            0qQ.A0A(frameLayout2);
                            float A03 = AnonymousClass7TE.A03(frameLayout2);
                            float f6 = (f4 - width) / 2.0f;
                            float max = Math.max(Math.min(translationX, f6), -f6);
                            ImageView imageView3 = qcw.A0G;
                            0qQ.A0A(imageView3);
                            imageView3.setTranslationX(max);
                            if (f5 >= A03) {
                                float f7 = (f5 - A03) / 2.0f;
                                float max2 = Math.max(Math.min(translationY, f7), -f7);
                                ImageView imageView4 = qcw.A0G;
                                0qQ.A0A(imageView4);
                                imageView4.setTranslationY(max2);
                            }
                            qcw.A02 = x;
                        }
                    }
                    qcw.A05 = -1;
                    return true;
                }
                qcw.A05 = pointerId;
                qcw.A02 = motionEvent.getX();
                f = motionEvent.getY();
                qcw.A03 = f;
                return true;
            case 8:
                return true;
            case 9:
                ((GestureDetector) this.A01).onTouchEvent(motionEvent);
                return false;
            case 10:
                R8W r8w = (R8W) this.A01;
                if (r8w.A06) {
                    return false;
                }
                r8w.A06 = true;
                0wc r2 = r8w.A00;
                List list = null;
                if (r2 == null) {
                    str = "typedLogger";
                } else {
                    0Aj A002 = r2.A00(0kJ.A05, "playable_ads_user_start_interaction");
                    String str2 = r8w.A04;
                    if (str2 == null) {
                        str = "eventSessionID";
                    } else {
                        A002.AAJ(Dbj.A02(), str2);
                        A002.AAJ(AnonymousClass000.A00(4026), r8w.A03);
                        String str3 = r8w.A05;
                        if (str3 != null) {
                            list = 03t.A0J(new String[]{str3});
                        }
                        A002.AAe("tracking", list);
                        A002.Cgf();
                        return false;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            default:
                QC2 qc2 = (QC2) this.A01;
                C11508SbV sbV = qc2.A01;
                if (sbV == null) {
                    sbV = new C11508SbV(qc2.getActivity(), qc2.A01.getWindow().getDecorView(), qc2);
                    qc2.A01 = sbV;
                }
                return sbV.onTouch(view, motionEvent);
        }
    }
}
