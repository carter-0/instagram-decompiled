package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.LYg  reason: case insensitive filesystem */
public final class C64280LYg implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ C315496jz A01;

    public C64280LYg(GestureDetector gestureDetector, C315496jz r2) {
        this.A01 = r2;
        this.A00 = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                C315496jz r2 = this.A01;
                if (r2.A0F == AnonymousClass05K.A01) {
                    return false;
                }
                r2.A0G = false;
                r2.A0H = false;
                r2.A03 = 0.0f;
                r2.A04 = 0.0f;
                r2.A01 = motionEvent.getRawX();
                r2.A02 = motionEvent.getRawY();
                r2.A00 = 0.0f;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (actionMasked == 1) {
            C315496jz r3 = this.A01;
            if (r3.A03 == 0.0f) {
                float f = r3.A04;
                if (f == 0.0f) {
                    num = AnonymousClass05K.A00;
                } else if (f < 0.0f) {
                    num = AnonymousClass05K.A0j;
                } else {
                    r3.A0F = AnonymousClass05K.A0C;
                }
            } else {
                r3.A0F = AnonymousClass05K.A01;
                2cs r4 = r3.A0B;
                if (r4 != null) {
                    float f2 = -r3.A00;
                    View view2 = r3.A09;
                    if (view2 != null) {
                        r4.A07((double) (f2 / AnonymousClass7TE.A02(view2)));
                        2cs r0 = r3.A0B;
                        0qQ.A0A(r0);
                        float A03 = JTO.A03(r0);
                        if (Math.abs(A03) > 0.4f) {
                            int i = (A03 > 0.0f ? 1 : (A03 == 0.0f ? 0 : -1));
                            2cs r22 = r3.A0B;
                            if (i > 0) {
                                0qQ.A0A(r22);
                                r22.A03();
                                num = AnonymousClass05K.A0C;
                            } else {
                                0qQ.A0A(r22);
                                r22.A06(-1.0d);
                                num = AnonymousClass05K.A0N;
                            }
                        } else {
                            2cs r02 = r3.A0B;
                            0qQ.A0A(r02);
                            r02.A04();
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            r3.A01(num);
        } else if (actionMasked == 2) {
            C315496jz r6 = this.A01;
            if (!r6.A0G && !r6.A0H) {
                float rawX = motionEvent.getRawX() - r6.A01;
                float rawY = motionEvent.getRawY() - r6.A02;
                if (JTR.A00(rawX, rawY) > ((double) r6.A05)) {
                    if (JTS.A00(rawY, rawX) < 45.0d) {
                        r6.A0G = true;
                    } else {
                        r6.A0H = true;
                    }
                }
            }
        }
        return this.A00.onTouchEvent(motionEvent);
    }
}
