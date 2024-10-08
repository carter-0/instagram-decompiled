package X;

import android.view.View;

/* renamed from: X.9g0  reason: invalid class name and case insensitive filesystem */
public final class C383699g0 extends C232922uf {
    public final int A00;
    public final Object A01;

    public C383699g0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DmB(2cs r4) {
        if (this.A00 != 0) {
            super.DmB(r4);
            return;
        }
        AIY aiy = (AIY) this.A01;
        aiy.A07.setVisibility(0);
        if (aiy.A03().A05 != null) {
            aiy.A0A.setVisibility(0);
        }
    }

    public final void DmC(2cs r8) {
        A42 a42;
        String str;
        int itemCount;
        int i;
        switch (this.A00) {
            case 0:
                if (r8.A01 == 0.0d) {
                    AIY aiy = (AIY) this.A01;
                    aiy.A07.setVisibility(8);
                    aiy.A0A.setVisibility(8);
                    return;
                }
                return;
            case 2:
                N1U n1u = (N1U) this.A01;
                2cs r1 = n1u.A0C;
                if (0qQ.A0K(r8, r1)) {
                    r1 = n1u.A0D;
                }
                if (r1.A0C() && (a42 = n1u.A04) != null) {
                    Integer num = n1u.A05;
                    Integer num2 = n1u.A06;
                    Integer num3 = AnonymousClass05K.A00;
                    if (num2 == num3) {
                        if (num == num3) {
                            str = "top_left";
                        } else if (num == AnonymousClass05K.A01) {
                            str = "top_right";
                        }
                        C331857Sq r0 = a42.A00;
                        r0.A09.A0B(((C333637Zs) r0.A0H.getValue()).A00(), str, (String) null);
                        return;
                    }
                    if (num2 == AnonymousClass05K.A01 && num == num3) {
                        str = "bottom_left";
                    } else {
                        str = "bottom_right";
                    }
                    C331857Sq r02 = a42.A00;
                    r02.A09.A0B(((C333637Zs) r02.A0H.getValue()).A00(), str, (String) null);
                    return;
                }
                return;
            case 3:
                A6O a6o = (A6O) this.A01;
                2cs r5 = a6o.A01;
                if (r5.A09.A00 == 0.8999999761581421d) {
                    r5.A06 = false;
                    r5.A03();
                    C387619mV r4 = a6o.A02.A00.A0M.A02;
                    if (r4.getItemCount() > 0 && (itemCount = (r4.A00 + 1) % r4.getItemCount()) != (i = r4.A00)) {
                        r4.A03 = true;
                        r4.A04.post(new C41142Ap2(r4, itemCount, i));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.DmC(r8);
                return;
        }
    }

    public final void DmE(2cs r6) {
        switch (this.A00) {
            case 0:
                double A012 = AnonymousClass37Q.A01(r6.A09.A00, 1.0d);
                AIY aiy = (AIY) this.A01;
                float f = (float) A012;
                aiy.A07.setAlpha(f);
                C252063oV r1 = aiy.A0A;
                if (r1.CVM()) {
                    r1.getView().setAlpha(f);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(r6, 0);
                View view = (View) this.A01;
                C71412ct r3 = r6.A09;
                view.setScaleX((float) r3.A00);
                view.setScaleY((float) r3.A00);
                return;
            case 2:
                0qQ.A0B(r6, 0);
                N1U n1u = (N1U) this.A01;
                2cs r12 = n1u.A0C;
                if (r6.equals(r12)) {
                    n1u.A0A.setTranslationX((float) r12.A09.A00);
                    return;
                }
                2cs r13 = n1u.A0D;
                if (r6.equals(r13)) {
                    n1u.A0A.setTranslationY((float) r13.A09.A00);
                    return;
                }
                return;
            default:
                A6O a6o = (A6O) this.A01;
                float f2 = (float) a6o.A01.A09.A00;
                View view2 = a6o.A00;
                view2.setScaleX(f2);
                view2.setScaleY(f2);
                return;
        }
    }
}
