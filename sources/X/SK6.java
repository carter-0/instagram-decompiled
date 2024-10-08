package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class SK6 {
    public final Class A03() {
        if (this instanceof C8181Qim) {
            return ((C8181Qim) this).A0G;
        }
        return ((C8180Qil) this).A00;
    }

    public final Object A08(C269674fV r4, Object obj) {
        if (this instanceof C8181Qim) {
            C8181Qim qim = (C8181Qim) this;
            C8207QkG qkG = qim.A02;
            if (qkG != null || qim.A04 == null) {
                return C8181Qim.A00(r4, qim, qkG, obj, qim.A0D);
            }
            return qim.A09(r4, obj);
        }
        r4.A0Y(this, A03(), "no array delegate creator specified", Pxe.A1b());
        throw AnonymousClass00P.createAndThrow();
    }

    public final Object A09(C269674fV r5, Object obj) {
        C8207QkG qkG;
        if (this instanceof C8181Qim) {
            C8181Qim qim = (C8181Qim) this;
            C8207QkG qkG2 = qim.A04;
            if (qkG2 != null || (qkG = qim.A02) == null) {
                return C8181Qim.A00(r5, qim, qkG2, obj, qim.A0F);
            }
            return C8181Qim.A00(r5, qim, qkG, obj, qim.A0D);
        }
        r5.A0Y(this, A03(), "no delegate creator specified", Pxe.A1b());
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0F() {
        if (this instanceof C8181Qim) {
            return AnonymousClass7TF.A1V(((C8181Qim) this).A07);
        }
        return false;
    }

    public final boolean A0G() {
        if (this instanceof C8181Qim) {
            return AnonymousClass7TF.A1V(((C8181Qim) this).A09);
        }
        return false;
    }

    public final boolean A0H() {
        if (this instanceof C8181Qim) {
            return AnonymousClass7TF.A1V(((C8181Qim) this).A0A);
        }
        return false;
    }

    public final boolean A0I() {
        if (this instanceof C8181Qim) {
            return AnonymousClass7TF.A1V(((C8181Qim) this).A0C);
        }
        if (this instanceof C8175Qig) {
            return true;
        }
        return false;
    }

    public final boolean A0J() {
        if (this instanceof C8181Qim) {
            return AnonymousClass7TF.A1V(((C8181Qim) this).A0B);
        }
        return false;
    }

    public final boolean A0K() {
        if (this instanceof C8181Qim) {
            return AnonymousClass7TF.A1V(((C8181Qim) this).A00);
        }
        return false;
    }

    public final boolean A0L() {
        if ((this instanceof C8179Qik) || (this instanceof C8177Qii)) {
            return true;
        }
        if (this instanceof C8181Qim) {
            return AnonymousClass7TF.A1V(((C8181Qim) this).A03);
        }
        if ((this instanceof C8178Qij) || (this instanceof C8176Qih)) {
            return true;
        }
        return AnonymousClass7TF.A1V((Object) null);
    }

    public final boolean A0M() {
        if (this instanceof C8181Qim) {
            return AnonymousClass7TF.A1V(((C8181Qim) this).A01);
        }
        return false;
    }

    public final boolean A0N() {
        if (!(this instanceof C8179Qik) && !(this instanceof C8178Qij) && !(this instanceof C8176Qih) && !(this instanceof C8177Qii) && !A0L() && !A0M() && !A0K() && !A0I() && !A0J() && !A0G() && !A0H()) {
            if ((!(this instanceof C8181Qim) || !AnonymousClass7TF.A1V(((C8181Qim) this).A08)) && !A0F()) {
                return false;
            }
        }
        return true;
    }

    public final C8218QkR[] A0O(C269454f9 r8) {
        if (this instanceof C8181Qim) {
            return ((C8181Qim) this).A0E;
        }
        if (!(this instanceof C8175Qig)) {
            return null;
        }
        Class cls = Integer.TYPE;
        AnonymousClass4eE r1 = r8.A01.A07;
        C268894eF A09 = r1.A09(cls);
        C268894eF A092 = r1.A09(Long.TYPE);
        return new C8218QkR[]{C8175Qig.A00(r1.A09(Object.class), "sourceRef", 0), C8175Qig.A00(A092, "byteOffset", 1), C8175Qig.A00(A092, "charOffset", 2), C8175Qig.A00(A09, "lineNr", 3), C8175Qig.A00(A09, "columnNr", 4)};
    }

    public static Object A02(16F r3, C269674fV r4, JsonDeserializer jsonDeserializer, BeanDeserializerBase beanDeserializerBase, SK6 sk6) {
        Object A09 = sk6.A09(r4, jsonDeserializer.A0D(r3, r4));
        C8157Qhq[] qhqArr = beanDeserializerBase.A0G;
        if (qhqArr == null || 0 >= qhqArr.length) {
            return A09;
        }
        r4.A0g(qhqArr[0].A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A04(C269674fV r4) {
        r4.A0Y(this, A03(), "no default no-arguments constructor found", Pxe.A1b());
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A05(C269674fV r4, double d) {
        r4.A0Y(this, A03(), "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d));
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A06(C269674fV r4, int i) {
        r4.A0Y(this, A03(), "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", AnonymousClass7TF.A1b(i));
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A07(C269674fV r4, long j) {
        r4.A0Y(this, A03(), "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Pxf.A1W(j));
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A0A(C269674fV r4, String str) {
        r4.A0Y(this, A03(), C273654mx.A00(3060), str);
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A0B(C269674fV r4, BigDecimal bigDecimal) {
        r4.A0Y(this, A03(), "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A0C(C269674fV r4, BigInteger bigInteger) {
        r4.A0Y(this, A03(), "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A0D(C269674fV r4, boolean z) {
        r4.A0Y(this, A03(), "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", C51968G9o.A1b(z));
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A0E(C269674fV r4, Object[] objArr) {
        r4.A0Y(this, A03(), "no creator with arguments specified", Pxe.A1b());
        throw AnonymousClass00P.createAndThrow();
    }
}
