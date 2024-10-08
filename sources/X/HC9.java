package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class HC9 extends C249383je {
    public Object A00;
    public final int A01;
    public final Object A02;

    public HC9(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = obj;
    }

    public final void onScroll(C238133Ar r7, int i, int i2, int i3, int i4, int i5) {
        int A03;
        int i6;
        View AnE;
        int bottom;
        View view;
        int computeVerticalScrollOffset;
        switch (this.A01) {
            case 0:
                A03 = AnonymousClass0fD.A03(-1093489814);
                i6 = 159020039;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(453560980);
                0qQ.A0B(r7, 0);
                boolean z = false;
                if (!(r7.B6L() == 0 && (AnE = r7.AnE(0)) != null && AnE.getTop() == r7.CEd().getPaddingTop())) {
                    z = true;
                }
                C17719Vco vco = ((C15374UbS) this.A02).A01;
                if (vco != null) {
                    View view2 = vco.A01;
                    int i7 = 8;
                    if (z) {
                        i7 = 0;
                    }
                    view2.setVisibility(i7);
                    i6 = -829250330;
                    break;
                } else {
                    0qQ.A0F("viewHolder");
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                A03 = AnonymousClass0fD.A03(-260637430);
                0qQ.A0B(r7, 0);
                C55611HkW hkW = (C55611HkW) ((GDB) this.A02).A0O.getValue();
                View view3 = (View) this.A00;
                if (i3 > 1) {
                    Integer num = hkW.A01;
                    if (num != null) {
                        bottom = num.intValue();
                    } else {
                        ViewParent parent = view3.getParent();
                        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
                            bottom = view3.getBottom() * 2;
                        } else {
                            bottom = view.getBottom();
                        }
                        hkW.A01 = Integer.valueOf(bottom);
                    }
                    if ((r7 instanceof C238113Ap) || (r7 instanceof C238123Aq)) {
                        computeVerticalScrollOffset = ((C238123Aq) r7).A03.computeVerticalScrollOffset();
                    } else {
                        computeVerticalScrollOffset = 0;
                    }
                    float f = -((float) C229632nm.A03(computeVerticalScrollOffset, 0, bottom));
                    if (f != hkW.A00) {
                        view3.setY(f);
                        hkW.A00 = f;
                    }
                }
                i6 = -1137809280;
                break;
        }
        AnonymousClass0fD.A0A(i6, A03);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int i2;
        int i3;
        AnonymousClass57X r0;
        switch (this.A01) {
            case 0:
                i2 = AnonymousClass0fD.A03(356951997);
                if (!(i == 0 || (r0 = (AnonymousClass57X) this.A00) == null)) {
                    r0.A00();
                }
                ((C228152ks) this.A02).FJ2(this);
                i3 = -2066078785;
                break;
            case 1:
                i2 = AnonymousClass0fD.A03(381113554);
                i3 = -1672424093;
                break;
            default:
                super.onScrollStateChanged(r3, i);
                return;
        }
        AnonymousClass0fD.A0A(i3, i2);
    }

    public HC9(C15374UbS ubS) {
        this.A01 = 1;
        this.A02 = ubS;
    }
}
