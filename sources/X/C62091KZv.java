package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.KZv  reason: case insensitive filesystem */
public final class C62091KZv extends AnonymousClass80W {
    public C66399MQf A00;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final Set A02 = DbS.A0y();

    public final void A06(C66399MQf mQf, C66399MQf mQf2, Object obj, Object obj2) {
        0qQ.A0B(obj2, 3);
        A03(obj.getClass(), mQf, mQf2);
        A03(obj2.getClass(), mQf2, mQf);
    }

    public final void A04(Object obj) {
        if (obj instanceof C61945KSu) {
            C66399MQf mQf = this.A00;
            if (mQf != null) {
                if (mQf.equals(this.A00.first)) {
                    obj = LLS.A00;
                    super.A04(obj);
                }
            }
            0qQ.A0F("startState");
            throw AnonymousClass00P.createAndThrow();
        }
        if (this.A02.contains(obj)) {
            Map map = this.A01;
            Object obj2 = this.A00.first;
            0qQ.A07(obj2);
            C66399MQf mQf2 = (C66399MQf) obj2;
            C66399MQf mQf3 = this.A00;
            if (mQf3 != null) {
                Object obj3 = map.get(new C61084JwM(mQf2, mQf3, obj));
                if (obj3 != null) {
                    obj = obj3;
                }
            }
            0qQ.A0F("startState");
            throw AnonymousClass00P.createAndThrow();
        }
        super.A04(obj);
    }

    public final void A08(C66399MQf mQf, Object obj) {
        A03(obj.getClass(), C65406Lsm.A00, mQf);
        A03(LLS.class, mQf, C65405Lsl.A00);
    }

    public C62091KZv(C66399MQf mQf) {
        super(mQf);
        A02(new C59966Jcb(this, 3));
    }

    public final void A05(C66399MQf mQf, C66399MQf mQf2, Class cls) {
        A03(cls, mQf, mQf2);
        A03(LLT.class, mQf2, mQf);
    }

    public final void A07(C66399MQf mQf, Object obj) {
        A03(obj.getClass(), mQf, C65405Lsl.A00);
    }
}
