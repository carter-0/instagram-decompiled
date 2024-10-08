package X;

import java.util.List;

/* renamed from: X.Ija  reason: case insensitive filesystem */
public final /* synthetic */ class C57981Ija implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ I0B A01;
    public final /* synthetic */ C21381XZo A02;
    public final /* synthetic */ C66125MCx A03;
    public final /* synthetic */ C66125MCx A04;
    public final /* synthetic */ C66125MCx A05;
    public final /* synthetic */ C53059Ghr A06;

    public /* synthetic */ C57981Ija(I0B i0b, C21381XZo xZo, C66125MCx mCx, C66125MCx mCx2, C66125MCx mCx3, C53059Ghr ghr, int i) {
        this.A01 = i0b;
        this.A00 = i;
        this.A03 = mCx;
        this.A04 = mCx2;
        this.A02 = xZo;
        this.A06 = ghr;
        this.A05 = mCx3;
    }

    public final void run() {
        I0B i0b = this.A01;
        int i = this.A00;
        C66125MCx mCx = this.A03;
        C66125MCx mCx2 = this.A04;
        C21381XZo xZo = this.A02;
        C53059Ghr ghr = this.A06;
        C66125MCx mCx3 = this.A05;
        0qQ.A0B(ghr, 5);
        if (i0b.A00 == i) {
            MCy mCy = mCx3.A02;
            int i2 = mCy.A02 + mCy.A00;
            C66125MCx mCx4 = i0b.A02;
            if (mCx4 == null || i0b.A01 != null) {
                throw AnonymousClass7TE.A0z("must be in snapshot state to apply diff");
            }
            i0b.A01 = mCx;
            0sL r2 = i0b.A0A;
            0qQ.A0B(r2, 0);
            List list = mCx.A05;
            018.A1A(list, C58924Izn.A00);
            list.add(C51965G9l.A0v(r2));
            mCx.A06(r2);
            i0b.A02 = null;
            MCy mCy2 = mCx4.A02;
            C231452rh r1 = i0b.A03;
            if (r1 != null) {
                MCy mCy3 = mCx2.A02;
                C21991XpE.A02(xZo, mCy2, mCy3, r1);
                C54724HQd hQd = i0b.A05;
                0qQ.A0B(hQd, 0);
                List list2 = ghr.A00;
                2HZ A0B = C229632nm.A0B(C229632nm.A0C(0, list2.size()), 3);
                int i3 = A0B.A00;
                int i4 = A0B.A01;
                int i5 = A0B.A02;
                if (i5 <= 0 ? !(i5 >= 0 || i4 > i3) : i3 <= i4) {
                    while (true) {
                        int A0I = C51971G9r.A0I(list2, i3);
                        if (A0I == 0) {
                            hQd.A00(C51971G9r.A0I(list2, i3 + 1), C51971G9r.A0I(list2, i3 + 2));
                        } else if (A0I == 1) {
                            hQd.A01(C51971G9r.A0I(list2, i3 + 1), C51971G9r.A0I(list2, i3 + 2));
                        } else if (A0I == 2) {
                            int A0I2 = C51971G9r.A0I(list2, i3 + 1);
                            int A0I3 = C51971G9r.A0I(list2, i3 + 2);
                            if (!(hQd instanceof C53059Ghr)) {
                                C231452rh r0 = ((C53058Ghq) hQd).A00.A03;
                                if (r0 == null) {
                                    break;
                                }
                                r0.Ddf(A0I2, A0I3);
                            } else {
                                List list3 = ((C53059Ghr) hQd).A00;
                                G9w.A0x(2, list3);
                                G9w.A0x(A0I2, list3);
                                G9w.A0x(A0I3, list3);
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Unexpected recording value");
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    }
                }
                list2.clear();
                mCx.A05(hQd);
                if (!mCx.isEmpty()) {
                    mCx.A01(C229632nm.A03(C21991XpE.A00(xZo, mCy2, mCy3, i2), 0, mCx.size() - 1));
                }
                I0B.A00(i0b, mCx4, i0b.A01);
                return;
            }
            0qQ.A0F("updateCallback");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
