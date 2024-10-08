package X;

/* renamed from: X.4D9  reason: invalid class name */
public abstract class AnonymousClass4D9 extends C262214Cp implements C262204Co, AnonymousClass4D7, C262224Cq {
    public final C262094Cc A00;

    public void A0V(Object obj) {
    }

    public final void A0J(Object obj) {
        if (obj instanceof 1Hd) {
            1Hd r4 = (1Hd) obj;
            Throwable th = r4.A00;
            boolean z = false;
            if (1Hd.A01.get(r4) != 0) {
                z = true;
            }
            A0W(z, th);
            return;
        }
        A0V(obj);
    }

    public void A0W(boolean z, Throwable th) {
        if (this instanceof C252663pT) {
            C252673pU r1 = (C252673pU) this;
            if (!r1.A00.AI3(th) && !z) {
                C9878Rir.A00(r1.A00, th);
            }
        }
    }

    public final C262094Cc ArX() {
        return this.A00;
    }

    public final C262094Cc getContext() {
        return this.A00;
    }

    public AnonymousClass4D9(C262094Cc r2, boolean z, boolean z2) {
        19I r0;
        if (z2) {
            r0 = 19H.A00;
        } else {
            r0 = 19H.A01;
        }
        this._state$volatile = r0;
        if (z) {
            A0N((C262204Co) r2.get(C262204Co.A00));
        }
        this.A00 = r2.plus(this);
    }

    public String A0G() {
        return getClass().getSimpleName();
    }

    public final void A0T(Integer num, Object obj, 0sL r7) {
        C262094Cc r3;
        Object A002;
        Object obj2;
        int intValue = num.intValue();
        if (intValue == 0) {
            1Ew.A00(obj, this, r7);
        } else if (intValue == 2) {
            0qQ.A0B(r7, 0);
            1Ey.A02(1Ey.A01(obj, this, r7)).resumeWith(C60340gF.A00);
        } else if (intValue == 3) {
            try {
                r3 = this.A00;
                A002 = 1F5.A00((Object) null, r3);
                if (!(r7 instanceof 1Em)) {
                    obj2 = 1Ey.A00(obj, this, r7);
                } else {
                    0u4.A05(r7, 2);
                    obj2 = r7.invoke(obj, this);
                }
                1F5.A02(A002, r3);
                if (obj2 != 1Hj.A02) {
                    resumeWith(obj2);
                }
            } catch (Throwable th) {
                resumeWith(new 0eQ(th));
            }
        } else if (intValue != 1) {
            throw new RuntimeException();
        }
    }

    public final void resumeWith(Object obj) {
        Throwable A002 = 0eR.A00(obj);
        if (A002 != null) {
            obj = new 1Hd(false, A002);
        }
        Object A0D = A0D(obj);
        if (A0D != 19H.A04) {
            A0U(A0D);
        }
    }

    public void A0U(Object obj) {
        A0I(obj);
    }
}
