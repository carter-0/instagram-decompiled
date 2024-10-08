package X;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Qx1  reason: case insensitive filesystem */
public abstract class C8563Qx1 extends C12586Syl {
    public static final Map zzb = new ConcurrentHashMap();
    public STV zzc = STV.A00();
    public int zzd = -1;

    public static C8563Qx1 A01(C11371SQf sQf, C8563Qx1 qx1, byte[] bArr) {
        C8563Qx1 A02 = A02(sQf, qx1, bArr, bArr.length);
        if (A02.A0R()) {
            return A02;
        }
        C8842RCi A00 = new C13217TQi().A00();
        A00.A06(A02);
        throw A00;
    }

    public final C8562Qx0 A0L() {
        return (C8562Qx0) A0N(5, (Object) null, (Object) null);
    }

    public final C8563Qx1 A0M() {
        return (C8563Qx1) A0N(4, (Object) null, (Object) null);
    }

    public abstract Object A0N(int i, Object obj, Object obj2);

    public final void A0P() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void A0Q() {
        this.zzd = (this.zzd & AnonymousClass972.MUTABLE_FLAG_MASK) | Integer.MAX_VALUE;
    }

    public final boolean A0R() {
        byte byteValue = ((Number) A0N(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean FQA = SO7.A00().A01(getClass()).FQA(this);
        C8563Qx1 qx1 = this;
        if (true != FQA) {
            qx1 = null;
        }
        A0N(2, qx1, (Object) null);
        return FQA;
    }

    public final /* synthetic */ C13957TmK FPi() {
        return (C12586Syl) A0N(6, (Object) null, (Object) null);
    }

    public final /* synthetic */ C8562Qx0 FQH() {
        return (C8562Qx0) A0N(5, (Object) null, (Object) null);
    }

    public static C8563Qx1 A03(Class cls) {
        Map map = zzb;
        C8563Qx1 qx1 = (C8563Qx1) map.get(cls);
        if (qx1 == null) {
            try {
                Pxg.A1M(cls);
                qx1 = (C8563Qx1) map.get(cls);
                if (qx1 == null) {
                    qx1 = (C8563Qx1) ((C8563Qx1) SUg.A05(cls)).A0N(6, (Object) null, (Object) null);
                    if (qx1 != null) {
                        map.put(cls, qx1);
                    } else {
                        throw Pxe.A0i();
                    }
                }
            } catch (ClassNotFoundException e) {
                throw Pxe.A0j("Class initialization cannot fail.", e);
            }
        }
        return qx1;
    }

    public static C12582Syh A07(C13957TmK tmK, String str, Object[] objArr) {
        return new C12582Syh(tmK, str, objArr);
    }

    public final boolean A0S() {
        return AnonymousClass7TF.A1P(this.zzd & AnonymousClass972.MUTABLE_FLAG_MASK);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return SO7.A00().A01(cls).FQ6(this, obj);
    }

    private final int A00() {
        return Pxg.A0S(this).FOw(this);
    }

    public static C8563Qx1 A02(C11371SQf sQf, C8563Qx1 qx1, byte[] bArr, int i) {
        C8842RCi e;
        C8563Qx1 A0M = qx1.A0M();
        try {
            C13845TiL A0S = Pxg.A0S(A0M);
            A0S.FPz(new SFE(sQf), A0M, bArr, 0, i);
            A0S.FPl(A0M);
            return A0M;
        } catch (C8842RCi e2) {
            e = e2;
            e.A06(A0M);
            throw e;
        } catch (C13217TQi e3) {
            e = e3.A00();
            e.A06(A0M);
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C8842RCi) {
                throw e4.getCause();
            }
            e = new C8842RCi(e4);
            e.A06(A0M);
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = C8842RCi.A05();
            e.A06(A0M);
            throw e;
        }
    }

    public static C8564Qx2 A04() {
        return C8564Qx2.A00();
    }

    public static C13984Tna A05(C13984Tna tna) {
        int size = tna.size();
        int i = size + size;
        if (size == 0) {
            i = 10;
        }
        return tna.FPW(i);
    }

    public static C8566Qx4 A06() {
        return C8566Qx4.A00();
    }

    public static Object A08(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw Pxe.A0u("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw Pxe.A0u("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void A09(C8563Qx1 qx1, Class cls) {
        qx1.A0P();
        zzb.put(cls, qx1);
    }

    public final int A0I(C13845TiL tiL) {
        int i;
        if (A0S()) {
            i = tiL.FOw(this);
            if (i < 0) {
                throw DbW.A0b("serialized size must be non-negative, was ", i);
            }
        } else {
            int i2 = this.zzd & Integer.MAX_VALUE;
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            i = tiL.FOw(this);
            if (i >= 0) {
                this.zzd = (this.zzd & AnonymousClass972.MUTABLE_FLAG_MASK) | i;
            } else {
                throw DbW.A0b("serialized size must be non-negative, was ", i);
            }
        }
        return i;
    }

    public final int A0K() {
        return Pxg.A0S(this).FPC(this);
    }

    public final void A0O() {
        Pxg.A0S(this).FPl(this);
        A0P();
    }

    public final int FPo() {
        int i;
        if (A0S()) {
            i = A00();
            if (i < 0) {
                throw DbW.A0b("serialized size must be non-negative, was ", i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                int A00 = A00();
                if (A00 >= 0) {
                    this.zzd = (this.zzd & AnonymousClass972.MUTABLE_FLAG_MASK) | A00;
                    return A00;
                }
                throw DbW.A0b("serialized size must be non-negative, was ", A00);
            }
        }
        return i;
    }

    public final void FQP(C8567Qx5 qx5) {
        Pxg.A0S(this).FQ3(C12591Syq.A01(qx5), this);
    }

    public final int hashCode() {
        if (A0S()) {
            return A0K();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int A0K = A0K();
        this.zza = A0K;
        return A0K;
    }

    public final String toString() {
        return C11402SRy.A00(this, super.toString());
    }
}
