package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* renamed from: X.4eF  reason: invalid class name and case insensitive filesystem */
public abstract class C268894eF extends C268904eG implements Serializable, Type {
    public final Class A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final int A04;

    public C268894eF A04() {
        return null;
    }

    public C268894eF A05() {
        return ((C268944eK) this).A00;
    }

    public final C268894eF A07(int i) {
        C268924eI r0 = ((C268944eK) this).A01;
        if (i < 0) {
            return null;
        }
        C268894eF[] r1 = r0.A01;
        if (i < r1.length) {
            return r1[i];
        }
        return null;
    }

    public C268894eF A08(C268894eF r13) {
        C268894eF r4 = r13;
        if (this instanceof C268934eJ) {
            C268934eJ r2 = (C268934eJ) this;
            if (r2 instanceof AnonymousClass4iM) {
                AnonymousClass4iM r22 = (AnonymousClass4iM) r2;
                if (r22.A01 == r13) {
                    return r22;
                }
                Class cls = r22.A00;
                C268924eI r6 = r22.A01;
                return new AnonymousClass4iM(r22.A00, r4, r22.A00, r6, cls, r22.A02, r22.A01, r22.A02, r22.A03);
            }
            throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
        }
        C268944eK r23 = (C268944eK) this;
        Object newInstance = Array.newInstance(r13.A00, 0);
        return new AnonymousClass4iN(r4, r23.A01, newInstance, r23.A02, r23.A01, r23.A03);
    }

    public final C268894eF A0B(Class cls) {
        C268894eF A0B;
        C268894eF[] r3;
        C268944eK r4 = (C268944eK) this;
        if (cls == r4.A00) {
            return r4;
        }
        if (cls.isInterface() && (r3 = r4.A02) != null) {
            for (C268894eF A0B2 : r3) {
                C268894eF A0B3 = A0B2.A0B(cls);
                if (A0B3 != null) {
                    return A0B3;
                }
            }
        }
        C268894eF r0 = r4.A00;
        if (r0 == null || (A0B = r0.A0B(cls)) == null) {
            return null;
        }
        return A0B;
    }

    public C268894eF A0E(Object obj) {
        Object obj2 = obj;
        if (this instanceof C268934eJ) {
            C268934eJ r2 = (C268934eJ) this;
            if (r2 instanceof AnonymousClass4iM) {
                AnonymousClass4iM r22 = (AnonymousClass4iM) r2;
                if (obj == r22.A01) {
                    return r22;
                }
                Class cls = r22.A00;
                C268924eI r6 = r22.A01;
                return new AnonymousClass4iM(r22.A00, r22.A01, r22.A00, r6, cls, r22.A02, obj2, r22.A02, r22.A03);
            } else if (r2.A01 == obj) {
                return r2;
            } else {
                Class cls2 = r2.A00;
                C268924eI r5 = r2.A01;
                return new C268944eK(r2.A00, r5, cls2, r2.A02, obj, r2.A02, 0, r2.A03);
            }
        } else {
            AnonymousClass4iN r23 = (AnonymousClass4iN) this;
            if (obj != r23.A01) {
                return new AnonymousClass4iN(r23.A00, r23.A01, r23.A01, r23.A02, obj, r23.A03);
            }
            return r23;
        }
    }

    public C268894eF A0F(Object obj) {
        Object obj2 = obj;
        if (this instanceof C268934eJ) {
            C268934eJ r3 = (C268934eJ) this;
            if (r3 instanceof AnonymousClass4iM) {
                AnonymousClass4iM r32 = (AnonymousClass4iM) r3;
                if (obj == r32.A02) {
                    return r32;
                }
                Class cls = r32.A00;
                C268924eI r7 = r32.A01;
                return new AnonymousClass4iM(r32.A00, r32.A01, r32.A00, r7, cls, obj2, r32.A01, r32.A02, r32.A03);
            } else if (obj == r3.A02) {
                return r3;
            } else {
                Class cls2 = r3.A00;
                C268924eI r5 = r3.A01;
                C268894eF r4 = r3.A00;
                C268894eF[] r2 = r3.A02;
                return new C268944eK(r4, r5, cls2, obj, r3.A01, r2, 0, r3.A03);
            }
        } else {
            AnonymousClass4iN r33 = (AnonymousClass4iN) this;
            if (obj == r33.A02) {
                return r33;
            }
            return new AnonymousClass4iN(r33.A00, r33.A01, r33.A01, obj, r33.A01, r33.A03);
        }
    }

    public C268924eI A0G() {
        return ((C268944eK) this).A01;
    }

    public boolean A0M() {
        return false;
    }

    public boolean A0O() {
        return false;
    }

    public abstract boolean equals(Object obj);

    public abstract String toString();

    public C268894eF A03() {
        if (this instanceof AnonymousClass4iN) {
            return ((AnonymousClass4iN) this).A00;
        }
        if (this instanceof AnonymousClass4iM) {
            return ((AnonymousClass4iM) this).A01;
        }
        return null;
    }

    public C268894eF A06() {
        if (this instanceof C268934eJ) {
            C268934eJ r1 = (C268934eJ) this;
            if (r1 instanceof AnonymousClass4iM) {
                AnonymousClass4iM r12 = (AnonymousClass4iM) r1;
                if (r12.A03) {
                    return r12;
                }
                Class cls = r12.A00;
                C268924eI r5 = r12.A01;
                return new AnonymousClass4iM(r12.A00, r12.A01.A06(), r12.A00, r5, cls, r12.A02, r12.A01, r12.A02, true);
            } else if (r1.A03) {
                return r1;
            } else {
                Class cls2 = r1.A00;
                C268924eI r3 = r1.A01;
                return new C268944eK(r1.A00, r3, cls2, r1.A02, r1.A01, r1.A02, 0, true);
            }
        } else {
            AnonymousClass4iN r13 = (AnonymousClass4iN) this;
            if (!r13.A03) {
                return new AnonymousClass4iN(r13.A00.A06(), r13.A01, r13.A01, r13.A02, r13.A01, true);
            }
            return r13;
        }
    }

    public C268894eF A09(C268894eF r4) {
        C268894eF r2;
        Object obj = r4.A01;
        if (obj != this.A01) {
            r2 = A0E(obj);
        } else {
            r2 = this;
        }
        Object obj2 = r4.A02;
        if (obj2 != this.A02) {
            return r2.A0F(obj2);
        }
        return r2;
    }

    public C268894eF A0A(C268894eF r11, C268924eI r12, Class cls, C268894eF[] r14) {
        if (!(this instanceof C268934eJ)) {
            return null;
        }
        C268934eJ r1 = (C268934eJ) this;
        if (!(r1 instanceof AnonymousClass4iM)) {
            return null;
        }
        AnonymousClass4iM r13 = (AnonymousClass4iM) r1;
        C268924eI r4 = r13.A01;
        return new AnonymousClass4iM(r11, r13.A01, r13.A00, r4, cls, r13.A02, r13.A01, r14, r13.A03);
    }

    public C268894eF A0C(Object obj) {
        if (this instanceof C268934eJ) {
            C268934eJ r2 = (C268934eJ) this;
            if (r2 instanceof AnonymousClass4iM) {
                AnonymousClass4iM r22 = (AnonymousClass4iM) r2;
                C268894eF r1 = r22.A01;
                if (obj == r1.A01) {
                    return r22;
                }
                Class cls = r22.A00;
                C268924eI r6 = r22.A01;
                return new AnonymousClass4iM(r22.A00, r1.A0E(obj), r22.A00, r6, cls, r22.A02, r22.A01, r22.A02, r22.A03);
            }
            throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
        }
        AnonymousClass4iN r23 = (AnonymousClass4iN) this;
        C268894eF r12 = r23.A00;
        if (obj != r12.A01) {
            return new AnonymousClass4iN(r12.A0E(obj), r23.A01, r23.A01, r23.A02, r23.A01, r23.A03);
        }
        return r23;
    }

    public C268894eF A0D(Object obj) {
        if (this instanceof C268934eJ) {
            C268934eJ r2 = (C268934eJ) this;
            if (r2 instanceof AnonymousClass4iM) {
                AnonymousClass4iM r22 = (AnonymousClass4iM) r2;
                C268894eF r1 = r22.A01;
                if (obj == r1.A02) {
                    return r22;
                }
                C268894eF A0F = r1.A0F(obj);
                Class cls = r22.A00;
                C268924eI r6 = r22.A01;
                return new AnonymousClass4iM(r22.A00, A0F, r22.A00, r6, cls, r22.A02, r22.A01, r22.A02, r22.A03);
            }
            throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
        }
        AnonymousClass4iN r23 = (AnonymousClass4iN) this;
        C268894eF r12 = r23.A00;
        if (obj != r12.A02) {
            return new AnonymousClass4iN(r12.A0F(obj), r23.A01, r23.A01, r23.A02, r23.A01, r23.A03);
        }
        return r23;
    }

    public StringBuilder A0H(StringBuilder sb) {
        if (this instanceof C268934eJ) {
            C268944eK.A01(this.A00, sb, true);
            return sb;
        }
        sb.append('[');
        return ((AnonymousClass4iN) this).A00.A0H(sb);
    }

    public StringBuilder A0I(StringBuilder sb) {
        if (this instanceof C268934eJ) {
            C268934eJ r3 = (C268934eJ) this;
            if (r3 instanceof AnonymousClass4iM) {
                AnonymousClass4iM r32 = (AnonymousClass4iM) r3;
                C268944eK.A01(r32.A00, sb, false);
                sb.append('<');
                StringBuilder A0I = r32.A01.A0I(sb);
                A0I.append(">;");
                return A0I;
            }
            int i = 0;
            C268944eK.A01(r3.A00, sb, false);
            int length = r3.A01.A01.length;
            if (length > 0) {
                sb.append('<');
                do {
                    sb = r3.A07(i).A0I(sb);
                    i++;
                } while (i < length);
                sb.append('>');
            }
            sb.append(';');
            return sb;
        }
        sb.append('[');
        return ((AnonymousClass4iN) this).A00.A0I(sb);
    }

    public final boolean A0J() {
        if (this instanceof AnonymousClass4iN) {
            return ((AnonymousClass4iN) this).A00.A0J();
        }
        if (((C268944eK) this).A01.A01.length > 0) {
            return true;
        }
        return false;
    }

    public boolean A0K() {
        if (this.A01 == null && this.A02 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0L() {
        if (this instanceof AnonymousClass4iN) {
            return false;
        }
        return Modifier.isAbstract(this.A00.getModifiers());
    }

    public boolean A0N() {
        if (this instanceof C268934eJ) {
            return false;
        }
        return true;
    }

    public final boolean A0P() {
        Class cls = this.A00;
        C269584fM[] r0 = C269574fL.A01;
        Class superclass = cls.getSuperclass();
        if (superclass == null || !"java.lang.Record".equals(superclass.getName())) {
            return false;
        }
        return true;
    }

    public final boolean A0Q(Class cls) {
        Class cls2 = this.A00;
        if (cls2 == cls || cls.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A04;
    }

    public C268894eF(C268894eF r2) {
        this.A00 = r2.A00;
        this.A04 = r2.A04;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A03 = r2.A03;
    }

    public C268894eF(Class cls, Object obj, Object obj2, int i, boolean z) {
        this.A00 = cls;
        this.A04 = cls.getName().hashCode() + i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = z;
    }
}
