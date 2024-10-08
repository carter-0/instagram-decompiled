package X;

import java.io.Serializable;
import java.lang.reflect.Method;

public abstract class T9X implements Serializable {
    public final boolean A02(T9X t9x) {
        C8139QhY qhY = (C8139QhY) this;
        if (qhY instanceof C8137QhW) {
            C8137QhW qhW = (C8137QhW) qhY;
            if (t9x.getClass() != qhW.getClass()) {
                return false;
            }
            C8137QhW qhW2 = (C8137QhW) t9x;
            if (qhW2.A00 == qhW.A00 && qhW2.A00 == qhW.A00) {
                return true;
            }
            return false;
        } else if (t9x.getClass() == qhY.getClass() && ((C8139QhY) t9x).A00 == qhY.A00) {
            return true;
        } else {
            return false;
        }
    }

    public final T9X A00(Class cls) {
        if (this instanceof C8137QhW) {
            C8137QhW qhW = (C8137QhW) this;
            if (cls != qhW.A00) {
                return new C8137QhW(qhW.A00, cls);
            }
            return qhW;
        }
        C8139QhY qhY = (C8139QhY) this;
        if (cls != qhY.A00) {
            return new C8139QhY(cls);
        }
        return qhY;
    }

    public final Object A01(Object obj) {
        if (this instanceof C8137QhW) {
            C8137QhW qhW = (C8137QhW) this;
            try {
                C8244Qkx qkx = qhW.A00;
                Method method = qkx.A0E;
                if (method == null) {
                    return qkx.A0D.get(obj);
                }
                return method.invoke(obj, (Object[]) null);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw Pxe.A0j(002.A0u("Problem accessing property '", qhW.A00.A04.A03, "': ", e2.getMessage()), e2);
            }
        } else {
            throw C66580MXl.A11();
        }
    }
}
