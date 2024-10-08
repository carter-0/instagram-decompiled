package X;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class U02 implements View.OnTouchListener {
    public float A00 = 10.0f;
    public GestureDetector A01;
    public X96 A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray A05 = new SparseArray();
    public final List A06 = new ArrayList();
    public final MotionEvent.PointerCoords A07 = new MotionEvent.PointerCoords();
    public final MotionEvent.PointerCoords A08 = new MotionEvent.PointerCoords();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent2);
        GestureDetector gestureDetector = this.A01;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent2);
        }
        int pointerId = motionEvent2.getPointerId(motionEvent2.getActionIndex());
        if (motionEvent2.getAction() != 0 && !this.A03) {
            return false;
        }
        int actionMasked = motionEvent2.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != A1U) {
                if (actionMasked == 2) {
                    List list = this.A06;
                    if (list.size() == A1U) {
                        MotionEvent.PointerCoords pointerCoords = this.A07;
                        motionEvent2.getPointerCoords(0, pointerCoords);
                        Object obj = this.A05.get(motionEvent2.getPointerId(0));
                        if (obj != null) {
                            MotionEvent.PointerCoords pointerCoords2 = ((C17573VaR) obj).A04;
                            if (!this.A04) {
                                if (((float) JTR.A00(pointerCoords.x - pointerCoords2.x, pointerCoords.y - pointerCoords2.y)) > this.A00) {
                                    this.A04 = A1U;
                                    X96 x96 = this.A02;
                                    if (x96 != null) {
                                        x96.DHq();
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            }
                            X96 x962 = this.A02;
                            if (x962 != null) {
                                float f = pointerCoords.x;
                                float f2 = pointerCoords.y;
                                x962.DlH(f, f2, f - pointerCoords2.x, f2 - pointerCoords2.y);
                                A01(motionEvent2, 0);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        int findPointerIndex = motionEvent2.findPointerIndex(C51971G9r.A0I(list, 0));
                        int findPointerIndex2 = motionEvent2.findPointerIndex(C51971G9r.A0I(list, A1U ? 1 : 0));
                        SparseArray sparseArray = this.A05;
                        Object obj2 = sparseArray.get(C51971G9r.A0I(list, 0));
                        if (obj2 != null) {
                            MotionEvent.PointerCoords pointerCoords3 = ((C17573VaR) obj2).A04;
                            Object obj3 = sparseArray.get(C51971G9r.A0I(list, A1U));
                            if (obj3 != null) {
                                MotionEvent.PointerCoords pointerCoords4 = ((C17573VaR) obj3).A04;
                                MotionEvent.PointerCoords pointerCoords5 = this.A07;
                                if (findPointerIndex != -1) {
                                    motionEvent2.getPointerCoords(findPointerIndex, pointerCoords5);
                                } else {
                                    pointerCoords5.x = pointerCoords3.x;
                                    pointerCoords5.y = pointerCoords3.y;
                                }
                                MotionEvent.PointerCoords pointerCoords6 = this.A08;
                                if (findPointerIndex2 != -1) {
                                    motionEvent2.getPointerCoords(findPointerIndex2, pointerCoords6);
                                } else {
                                    pointerCoords6.x = pointerCoords4.x;
                                    pointerCoords6.y = pointerCoords4.y;
                                }
                                float f3 = pointerCoords5.x;
                                float f4 = pointerCoords6.x;
                                float f5 = f3 + f4;
                                float f6 = pointerCoords3.x;
                                float f7 = pointerCoords4.x;
                                float f8 = f6 + f7;
                                float f9 = (f5 + f8) / 4.0f;
                                float f10 = pointerCoords5.y;
                                float f11 = pointerCoords6.y;
                                float f12 = f10 + f11;
                                float f13 = pointerCoords3.y;
                                float f14 = pointerCoords4.y;
                                float f15 = f13 + f14;
                                float f16 = (f12 + f15) / 4.0f;
                                float f17 = (f5 - f8) / 2.0f;
                                float f18 = (f12 - f15) / 2.0f;
                                float f19 = f10 - f11;
                                float f20 = f13 - f14;
                                float A002 = ((float) JTR.A00(f3 - f4, f19)) / ((float) JTR.A00(f6 - f7, f20));
                                float atan2 = ((float) Math.atan2((double) f19, (double) (f4 - f3))) - ((float) Math.atan2((double) f20, (double) (f7 - f6)));
                                X96 x963 = this.A02;
                                if (x963 != null) {
                                    x963.DSf(f9, f16, f17, f18, A002, atan2);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    if (this.A04) {
                        for (int i = 0; i < motionEvent2.getPointerCount(); i++) {
                            A01(motionEvent2, i);
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            List list2 = this.A06;
                            list2.remove(list2.indexOf(Integer.valueOf(pointerId)));
                            this.A05.remove(pointerId);
                        }
                    } else if (!this.A04) {
                        X96 x964 = this.A02;
                        if (x964 != null) {
                            x964.DHq();
                            this.A04 = A1U;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                return A1U;
            }
            Object obj4 = this.A05.get(C51971G9r.A0I(this.A06, 0));
            if (obj4 != null) {
                C17573VaR vaR = (C17573VaR) obj4;
                if (!this.A04) {
                    X96 x965 = this.A02;
                    if (x965 != null) {
                        MotionEvent.PointerCoords pointerCoords7 = vaR.A04;
                        x965.Dl2(pointerCoords7.x, pointerCoords7.y);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = vaR.A03;
                long j2 = uptimeMillis - j;
                if (j > 0 && j2 > 0) {
                    float f21 = (float) j2;
                    A00((vaR.A00 * 1000.0f) / f21, (vaR.A01 * 1000.0f) / f21);
                    return A1U;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            A00(0.0f, 0.0f);
            return A1U;
        } else if (!this.A03) {
            this.A03 = A1U;
            X96 x966 = this.A02;
            if (x966 != null) {
                x966.DsP(A1U);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        int actionIndex = motionEvent2.getActionIndex();
        int pointerId2 = motionEvent2.getPointerId(actionIndex);
        G9w.A0x(pointerId2, this.A06);
        C17573VaR vaR2 = new C17573VaR(this);
        motionEvent2.getPointerCoords(actionIndex, vaR2.A04);
        vaR2.A00 = 0.0f;
        vaR2.A01 = 0.0f;
        vaR2.A02 = motionEvent2.getEventTime();
        vaR2.A03 = 0;
        this.A05.put(pointerId2, vaR2);
        return A1U;
    }

    private final void A00(float f, float f2) {
        if (this.A04) {
            X96 x96 = this.A02;
            if (x96 != null) {
                x96.DHm(f, f2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A05.clear();
        this.A06.clear();
        if (this.A03) {
            this.A03 = false;
            X96 x962 = this.A02;
            if (x962 != null) {
                x962.DsP(false);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A04 = false;
    }

    private final void A01(MotionEvent motionEvent, int i) {
        Object obj = this.A05.get(motionEvent.getPointerId(i));
        if (obj != null) {
            C17573VaR vaR = (C17573VaR) obj;
            long eventTime = motionEvent.getEventTime();
            if (eventTime > vaR.A02) {
                MotionEvent.PointerCoords pointerCoords = vaR.A04;
                vaR.A00 = -pointerCoords.x;
                vaR.A01 = -pointerCoords.y;
                motionEvent.getPointerCoords(i, pointerCoords);
                vaR.A00 += pointerCoords.x;
                vaR.A01 += pointerCoords.y;
                vaR.A03 = vaR.A02;
                vaR.A02 = eventTime;
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A02() {
        X96 x96;
        if (this.A04 && (x96 = this.A02) != null) {
            x96.DHm(0.0f, 0.0f);
        }
    }
}
