package X;

import com.fasterxml.jackson.annotation.JsonTypeId;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.util.HashMap;

/* renamed from: X.QkH  reason: case insensitive filesystem */
public abstract class C8208QkH extends C269064eW implements Serializable {
    public final transient C12445Suc A00;
    public final transient C269074eX A01;

    public final Annotation A06(Class cls) {
        C12445Suc suc = this.A00;
        if (suc == null) {
            return null;
        }
        return suc.AXK(cls);
    }

    public final boolean A08(Class[] clsArr) {
        C12445Suc suc = this.A00;
        if (suc == null) {
            return false;
        }
        return suc.CKL(clsArr);
    }

    public final Class A09() {
        Executable executable;
        if (this instanceof C8204QkD) {
            return ((C8204QkD) this).A00;
        }
        if (this instanceof C8202QkB) {
            return ((C8202QkB) this).A02.A09();
        }
        if (this instanceof C8203QkC) {
            return ((C8203QkC) this).A00.getDeclaringClass();
        }
        if (this instanceof C8206QkF) {
            executable = ((C8206QkF) this).A01;
        } else {
            executable = ((C8205QkE) this).A00;
        }
        return executable.getDeclaringClass();
    }

    public final Object A0A(Object obj) {
        if (this instanceof C8204QkD) {
            throw Pxg.A0c("Cannot get virtual property '", ((C8204QkD) this).A01, "'");
        } else if (this instanceof C8202QkB) {
            throw AnonymousClass7TE.A1B(Pxf.A0e(((C8202QkB) this).A02.A09(), "Cannot call getValue() on constructor parameter of "));
        } else if (this instanceof C8203QkC) {
            C8203QkC qkC = (C8203QkC) this;
            try {
                return qkC.A00.get(obj);
            } catch (IllegalAccessException e) {
                throw Pxe.A0h(002.A0u("Failed to getValue() for field ", qkC.A0B(), ": ", e.getMessage()), e);
            }
        } else if (this instanceof C8206QkF) {
            C8206QkF qkF = (C8206QkF) this;
            try {
                return qkF.A01.invoke(obj, (Object[]) null);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw Pxe.A0h(002.A0u("Failed to getValue() with method ", qkF.A0B(), ": ", C269574fL.A09(e2)), e2);
            }
        } else {
            throw AnonymousClass7TE.A1B(Pxf.A0e(((C8205QkE) this).A00.getDeclaringClass(), "Cannot call getValue() on constructor of "));
        }
    }

    public final Member A0C() {
        if (this instanceof C8204QkD) {
            return null;
        }
        if (this instanceof C8202QkB) {
            return ((C8202QkB) this).A02.A0C();
        }
        if (this instanceof C8203QkC) {
            return ((C8203QkC) this).A00;
        }
        if (this instanceof C8206QkF) {
            return ((C8206QkF) this).A01;
        }
        return ((C8205QkE) this).A00;
    }

    public final boolean A0E() {
        HashMap hashMap;
        Class<JsonTypeId> cls = JsonTypeId.class;
        C12445Suc suc = this.A00;
        if (suc == null || (hashMap = suc.A00) == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    public C8208QkH(C12445Suc suc, C269074eX r2) {
        this.A01 = r2;
        this.A00 = suc;
    }

    public String A0B() {
        return 002.A0g(A09().getName(), "#", A05());
    }

    public final void A0D(boolean z) {
        Member A0C = A0C();
        if (A0C != null) {
            C269574fL.A0H(A0C, z);
        }
    }
}
