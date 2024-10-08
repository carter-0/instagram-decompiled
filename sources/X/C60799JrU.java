package X;

import android.view.MotionEvent;
import android.widget.EditText;

/* renamed from: X.JrU  reason: case insensitive filesystem */
public final class C60799JrU extends C283285Gy {
    public final int A00;
    public final Object A01;

    public C60799JrU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        float f3 = f;
        float f4 = f2;
        switch (this.A00) {
            case 0:
                0qQ.A0B(motionEvent2, 1);
                if (motionEvent == null) {
                    return false;
                }
                C65757LzB lzB = (C65757LzB) this.A01;
                return lzB.A04.A01(motionEvent3, motionEvent4, lzB.A03, f3, f4, false);
            case 1:
                0qQ.A0B(motionEvent2, 1);
                if (motionEvent == null) {
                    return false;
                }
                C64873LjZ ljZ = (C64873LjZ) this.A01;
                if (Math.abs(f2) > Math.abs(f)) {
                    if (motionEvent2.getRawY() < motionEvent.getRawY()) {
                        if (!ljZ.A01) {
                            LGX lgx = ljZ.A07;
                            if (!lgx.A03) {
                                EditText editText = lgx.A09;
                                editText.requestFocus();
                                0nA.A0Q(editText);
                                break;
                            }
                        }
                    } else {
                        ljZ.A08.invoke();
                        break;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (motionEvent != null && Math.abs(f2) > Math.abs(f) && motionEvent.getY() > 5.0f) {
                    ((LGX) this.A01).A00();
                    break;
                } else {
                    return false;
                }
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                return false;
            case 1:
                return C51971G9r.A1b(((C64873LjZ) this.A01).A09);
            default:
                ((LGX) this.A01).A00();
                return true;
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }
}
