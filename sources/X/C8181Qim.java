package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
/* renamed from: X.Qim  reason: case insensitive filesystem */
public final class C8181Qim extends SK6 implements Serializable {
    public C268894eF A00;
    public C268894eF A01;
    public C8207QkG A02;
    public C8207QkG A03;
    public C8207QkG A04;
    public C8207QkG A05;
    public C8207QkG A06;
    public C8207QkG A07;
    public C8207QkG A08;
    public C8207QkG A09;
    public C8207QkG A0A;
    public C8207QkG A0B;
    public C8207QkG A0C;
    public C8218QkR[] A0D;
    public C8218QkR[] A0E;
    public C8218QkR[] A0F;
    public final Class A0G;
    public final String A0H;

    public static Object A00(C269674fV r4, C8181Qim qim, C8207QkG qkG, Object obj, C8218QkR[] qkRArr) {
        if (qkG == null) {
            throw DbW.A0c("No delegate constructor for ", qim.A0H);
        } else if (qkRArr == null) {
            try {
                return qkG.A0K(obj);
            } catch (Throwable th) {
                throw qim.A0P(r4, th);
            }
        } else {
            int length = qkRArr.length;
            Object[] objArr = new Object[length];
            int i = 0;
            while (i < length) {
                C8218QkR qkR = qkRArr[i];
                if (qkR == null) {
                    objArr[i] = obj;
                    i++;
                } else {
                    r4.A0g(qkR.A0B());
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            if (qkG instanceof C8206QkF) {
                return ((C8206QkF) qkG).A01.invoke((Object) null, objArr);
            }
            return ((C8205QkE) qkG).A00.newInstance(objArr);
        }
    }

    public final Object A04(C269674fV r3) {
        C8207QkG qkG = this.A03;
        if (qkG == null) {
            super.A04(r3);
            throw AnonymousClass00P.createAndThrow();
        }
        try {
            return qkG.A0J();
        } catch (Exception e) {
            r3.A0f(this.A0G, A0P(r3, e));
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A05(C269674fV r3, double d) {
        C8207QkG qkG;
        C8207QkG qkG2 = this.A08;
        if (qkG2 != null) {
            try {
                return qkG2.A0K(Double.valueOf(d));
            } catch (Throwable th) {
                th = th;
                qkG = this.A08;
                A01(r3, this, qkG, th);
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (this.A05 != null) {
            try {
                return this.A05.A0K(BigDecimal.valueOf(d));
            } catch (Throwable th2) {
                th = th2;
                qkG = this.A05;
                A01(r3, this, qkG, th);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            super.A05(r3, d);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A06(C269674fV r3, int i) {
        C8207QkG qkG;
        C8207QkG qkG2 = this.A09;
        if (qkG2 != null) {
            try {
                return qkG2.A0K(Integer.valueOf(i));
            } catch (Throwable th) {
                th = th;
                qkG = this.A09;
                A01(r3, this, qkG, th);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            C8207QkG qkG3 = this.A0A;
            if (qkG3 != null) {
                try {
                    return qkG3.A0K(DbS.A0j(i));
                } catch (Throwable th2) {
                    th = th2;
                    qkG = this.A0A;
                    A01(r3, this, qkG, th);
                    throw AnonymousClass00P.createAndThrow();
                }
            } else if (this.A06 != null) {
                try {
                    return this.A06.A0K(BigInteger.valueOf((long) i));
                } catch (Throwable th3) {
                    th = th3;
                    qkG = this.A06;
                    A01(r3, this, qkG, th);
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                super.A06(r3, i);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final Object A07(C269674fV r3, long j) {
        C8207QkG qkG;
        C8207QkG qkG2 = this.A0A;
        if (qkG2 != null) {
            try {
                return qkG2.A0K(Long.valueOf(j));
            } catch (Throwable th) {
                th = th;
                qkG = this.A0A;
                A01(r3, this, qkG, th);
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (this.A06 != null) {
            try {
                return this.A06.A0K(BigInteger.valueOf(j));
            } catch (Throwable th2) {
                th = th2;
                qkG = this.A06;
                A01(r3, this, qkG, th);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            super.A07(r3, j);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A0A(C269674fV r3, String str) {
        C8207QkG qkG = this.A0B;
        if (qkG != null) {
            try {
                return qkG.A0K(str);
            } catch (Throwable th) {
                A01(r3, this, this.A0B, th);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            super.A0A(r3, str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A0B(C269674fV r4, BigDecimal bigDecimal) {
        C8207QkG qkG;
        Double valueOf;
        C8207QkG qkG2 = this.A05;
        if (qkG2 != null) {
            try {
                return qkG2.A0K(bigDecimal);
            } catch (Throwable th) {
                th = th;
                qkG = this.A05;
                A01(r4, this, qkG, th);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            if (this.A08 != null) {
                double doubleValue = bigDecimal.doubleValue();
                if (Double.isInfinite(doubleValue)) {
                    valueOf = null;
                } else {
                    valueOf = Double.valueOf(doubleValue);
                }
                if (valueOf != null) {
                    try {
                        return this.A08.A0K(valueOf);
                    } catch (Throwable th2) {
                        th = th2;
                        qkG = this.A08;
                        A01(r4, this, qkG, th);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            super.A0B(r4, bigDecimal);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A0C(C269674fV r3, BigInteger bigInteger) {
        C8207QkG qkG = this.A06;
        if (qkG != null) {
            try {
                return qkG.A0K(bigInteger);
            } catch (Throwable th) {
                A01(r3, this, this.A06, th);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            super.A0C(r3, bigInteger);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A0D(C269674fV r3, boolean z) {
        C8207QkG qkG = this.A07;
        if (qkG == null) {
            super.A0D(r3, z);
            throw AnonymousClass00P.createAndThrow();
        }
        try {
            return qkG.A0K(Boolean.valueOf(z));
        } catch (Throwable th) {
            A01(r3, this, this.A07, th);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A0E(C269674fV r3, Object[] objArr) {
        C8207QkG qkG = this.A0C;
        if (qkG == null) {
            super.A0E(r3, objArr);
            throw AnonymousClass00P.createAndThrow();
        }
        try {
            if (qkG instanceof C8206QkF) {
                return ((C8206QkF) qkG).A01.invoke((Object) null, objArr);
            }
            return ((C8205QkE) qkG).A00.newInstance(objArr);
        } catch (Exception e) {
            r3.A0f(this.A0G, A0P(r3, e));
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final AnonymousClass4iD A0P(C269674fV r2, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        if (th instanceof AnonymousClass4iD) {
            return (AnonymousClass4iD) th;
        }
        return r2.A0K(this.A0G, th);
    }

    public C8181Qim(C268894eF r2) {
        String obj;
        Class<Object> cls;
        if (r2 == null) {
            obj = "UNKNOWN TYPE";
        } else {
            obj = r2.toString();
        }
        this.A0H = obj;
        if (r2 == null) {
            cls = Object.class;
        } else {
            cls = r2.A00;
        }
        this.A0G = cls;
    }

    public static void A01(C269674fV r2, C8181Qim qim, C8208QkH qkH, Throwable th) {
        r2.A0f(qkH.A09(), qim.A0P(r2, th));
        throw AnonymousClass00P.createAndThrow();
    }
}
