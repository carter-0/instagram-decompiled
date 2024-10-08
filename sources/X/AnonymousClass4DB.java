package X;

/* renamed from: X.4DB  reason: invalid class name */
public class AnonymousClass4DB extends AnonymousClass4D9 implements AnonymousClass4D8 {
    public final AnonymousClass4D7 A00;

    public AnonymousClass4DB(AnonymousClass4D7 r2, C262094Cc r3) {
        super(r3, true, true);
        this.A00 = r2;
    }

    public void A0I(Object obj) {
        AnonymousClass4D7 A02 = 1Ey.A02(this.A00);
        if (obj instanceof 1Hd) {
            Throwable th = ((1Hd) obj).A00;
            0qQ.A0B(th, 0);
            obj = new 0eQ(th);
        }
        1F3.A00(obj, A02);
    }

    public void A0U(Object obj) {
        if (this instanceof C252173og) {
            C252173og r3 = (C252173og) this;
            if (r3.threadLocalIsSet) {
                ThreadLocal threadLocal = r3.A00;
                0eP r0 = (0eP) threadLocal.get();
                if (r0 != null) {
                    1F5.A02(r0.A01, (C262094Cc) r0.A00);
                }
                threadLocal.remove();
            }
            AnonymousClass4D7 r5 = r3.A00;
            if (obj instanceof 1Hd) {
                Throwable th = ((1Hd) obj).A00;
                0qQ.A0B(th, 0);
                obj = new 0eQ(th);
            }
            C262094Cc context = r5.getContext();
            C252173og r32 = null;
            Object A002 = 1F5.A00(r32, context);
            if (A002 != 1F5.A00) {
                r32 = 1Ep.A03(A002, r5, context);
            }
            try {
                r5.resumeWith(obj);
            } finally {
                if (r32 == null || r32.A0X()) {
                    1F5.A02(A002, context);
                }
            }
        } else {
            AnonymousClass4D7 r2 = this.A00;
            if (obj instanceof 1Hd) {
                Throwable th2 = ((1Hd) obj).A00;
                0qQ.A0B(th2, 0);
                obj = new 0eQ(th2);
            }
            r2.resumeWith(obj);
        }
    }

    public final AnonymousClass4D8 getCallerFrame() {
        AnonymousClass4D7 r1 = this.A00;
        if (r1 instanceof AnonymousClass4D8) {
            return (AnonymousClass4D8) r1;
        }
        return null;
    }
}
