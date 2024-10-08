package X;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.972  reason: invalid class name */
public abstract class AnonymousClass972 extends AnonymousClass973 {
    public static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    public static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public AnonymousClass975 unknownFields = AnonymousClass975.A05;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.9GO, java.io.IOException] */
    public static AnonymousClass972 A02(C3738397d r10, AnonymousClass972 r11, byte[] bArr) {
        AnonymousClass9GO r2;
        byte[] bArr2 = bArr;
        int length = bArr.length;
        AnonymousClass972 r6 = (AnonymousClass972) r11.A0E(AnonymousClass05K.A0N, (Object) null, (Object) null);
        try {
            C374899Bg A00 = AnonymousClass9BZ.A02.A00(r6.getClass());
            A00.Co8(new AnonymousClass9CM(r10), r6, bArr2, 0, length);
            A00.ClW(r6);
            A05(r6);
            return r6;
        } catch (AnonymousClass9GO e) {
            boolean z = e.A01;
            r2 = e;
            if (z) {
                ? iOException = new IOException(e.getMessage(), e);
                iOException.A00 = null;
                r2 = iOException;
            }
            r2.A00 = r6;
            throw r2;
        } catch (AnonymousClass9GP e2) {
            ? iOException2 = new IOException(e2.getMessage());
            iOException2.A00 = null;
            r2 = iOException2;
            r2.A00 = r6;
            throw r2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof AnonymousClass9GO) {
                throw e3.getCause();
            }
            ? iOException3 = new IOException(e3.getMessage(), e3);
            iOException3.A00 = null;
            r2 = iOException3;
            r2.A00 = r6;
            throw r2;
        } catch (IndexOutOfBoundsException unused) {
            r2 = AnonymousClass9GO.A01();
            r2.A00 = r6;
            throw r2;
        }
    }

    public static AnonymousClass972 A00(AnonymousClass97R r4, C3738397d r5, AnonymousClass972 r6) {
        AnonymousClass97V r42 = (AnonymousClass97V) r4;
        byte[] bArr = r42.A00;
        int A05 = r42.A05();
        int A02 = r42.A02();
        AnonymousClass97T r0 = new AnonymousClass97T(bArr, A05, A02);
        try {
            r0.A0G(A02);
            AnonymousClass972 A01 = A01(r0, r5, r6);
            try {
                r0.A0P();
                A05(A01);
                return A01;
            } catch (AnonymousClass9GO e) {
                e.A00 = A01;
                throw e;
            }
        } catch (AnonymousClass9GO e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.9GO, java.io.IOException] */
    public static AnonymousClass972 A01(AnonymousClass97U r5, C3738397d r6, AnonymousClass972 r7) {
        AnonymousClass9GO r2;
        Throwable e;
        AnonymousClass972 r4 = (AnonymousClass972) r7.A0E(AnonymousClass05K.A0N, (Object) null, (Object) null);
        try {
            C374899Bg A00 = AnonymousClass9BZ.A02.A00(r4.getClass());
            AnonymousClass9CF r0 = r5.A01;
            if (r0 == null) {
                r0 = new AnonymousClass9CF(r5);
            }
            A00.Co7(r0, r6, r4);
            A00.ClW(r4);
            return r4;
        } catch (AnonymousClass9GO e2) {
            boolean z = e2.A01;
            r2 = e2;
            if (z) {
                ? iOException = new IOException(e2.getMessage(), e2);
                iOException.A00 = null;
                r2 = iOException;
            }
            r2.A00 = r4;
            throw r2;
        } catch (AnonymousClass9GP e3) {
            ? iOException2 = new IOException(e3.getMessage());
            iOException2.A00 = null;
            iOException2.A00 = r4;
            throw iOException2;
        } catch (IOException e4) {
            if (e4.getCause() instanceof AnonymousClass9GO) {
                e = e4.getCause();
                throw e;
            }
            ? iOException3 = new IOException(e4.getMessage(), e4);
            iOException3.A00 = null;
            r2 = iOException3;
            r2.A00 = r4;
            throw r2;
        } catch (RuntimeException e5) {
            e = e5;
            if (e.getCause() instanceof AnonymousClass9GO) {
                throw e.getCause();
            }
            throw e;
        }
    }

    public static AnonymousClass9C1 A03(AnonymousClass973 r1, String str, Object[] objArr) {
        return new AnonymousClass9C1(r1, str, objArr);
    }

    public static void A06(AnonymousClass972 r2, Class cls) {
        r2.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(cls, r2);
    }

    public static final boolean A07(AnonymousClass972 r4) {
        byte byteValue = ((Number) r4.A0E(AnonymousClass05K.A00, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean CVR = AnonymousClass9BZ.A02.A00(r4.getClass()).CVR(r4);
        Integer num = AnonymousClass05K.A01;
        AnonymousClass972 r0 = null;
        if (CVR) {
            r0 = r4;
        }
        r4.A0E(num, r0, (Object) null);
        return CVR;
    }

    public final C375269Cx A0C() {
        return (C375269Cx) A0E(AnonymousClass05K.A0Y, (Object) null, (Object) null);
    }

    public final C3738297c A0D() {
        return (C3738297c) A0E(AnonymousClass05K.A0u, (Object) null, (Object) null);
    }

    public Object A0E(Integer num, Object obj, Object obj2) {
        C3738297c r0;
        C3738297c r02;
        C3738297c r03;
        C3738297c r04;
        C3738297c r05;
        C3738297c r06;
        C3738297c r07;
        C3738297c r08;
        C3738297c r09;
        C3738297c r010;
        C3738297c r011;
        C3738297c r012;
        C3738297c r013;
        C3738297c r014;
        C3738297c r015;
        C3738297c r016;
        C3738297c r017;
        C3738297c r018;
        C3738297c r019;
        C3738297c r020;
        C3738297c r021;
        C3738297c r022;
        C3738297c r023;
        C3738297c r024;
        C3738297c r025;
        C3738297c r026;
        C3738297c r027;
        C3738297c r028;
        C3738297c r029;
        C3738297c r030;
        C3738297c r031;
        C3738297c r032;
        if (this instanceof C3738097a) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3738097a.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C3741398h.class});
                case 3:
                    return new C3738097a();
                case 4:
                    return new C375249Cv();
                case 5:
                    return C3738097a.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r033 = C3738097a.PARSER;
                    if (r033 != null) {
                        return r033;
                    }
                    synchronized (C3738097a.class) {
                        r032 = C3738097a.PARSER;
                        if (r032 == null) {
                            C3738397d r034 = C3738197b.A01;
                            r032 = new C3738197b(C3738097a.DEFAULT_INSTANCE);
                            C3738097a.PARSER = r032;
                        }
                    }
                    return r032;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3740998d) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3740998d.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new C3740998d();
                case 4:
                    return new C384119gn();
                case 5:
                    return C3740998d.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r035 = C3740998d.PARSER;
                    if (r035 != null) {
                        return r035;
                    }
                    synchronized (C3740998d.class) {
                        r031 = C3740998d.PARSER;
                        if (r031 == null) {
                            C3738397d r036 = C3738197b.A01;
                            r031 = new C3738197b(C3740998d.DEFAULT_INSTANCE);
                            C3740998d.PARSER = r031;
                        }
                    }
                    return r031;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof AnonymousClass97Q) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    String A00 = Pxd.A00(109);
                    return new AnonymousClass9C1(AnonymousClass97Q.DEFAULT_INSTANCE, A00, new Object[]{"version_", "keyValue_"});
                case 3:
                    return new AnonymousClass97Q();
                case 4:
                    return new C384159gr();
                case 5:
                    return AnonymousClass97Q.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r037 = AnonymousClass97Q.PARSER;
                    if (r037 != null) {
                        return r037;
                    }
                    synchronized (AnonymousClass97Q.class) {
                        r030 = AnonymousClass97Q.PARSER;
                        if (r030 == null) {
                            C3738397d r038 = C3738197b.A01;
                            r030 = new C3738197b(AnonymousClass97Q.DEFAULT_INSTANCE);
                            AnonymousClass97Q.PARSER = r030;
                        }
                    }
                    return r030;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3741098e) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3741098e.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "encryptedKeyset_", "keysetInfo_"});
                case 3:
                    return new C3741098e();
                case 4:
                    return new C384189gu();
                case 5:
                    return C3741098e.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r039 = C3741098e.PARSER;
                    if (r039 != null) {
                        return r039;
                    }
                    synchronized (C3741098e.class) {
                        r029 = C3741098e.PARSER;
                        if (r029 == null) {
                            C3738397d r040 = C3738197b.A01;
                            r029 = new C3738197b(C3741098e.DEFAULT_INSTANCE);
                            C3741098e.PARSER = r029;
                        }
                    }
                    return r029;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3741398h) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3741398h.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384229gy();
                case 5:
                    return C3741398h.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r041 = C3741398h.PARSER;
                    if (r041 != null) {
                        return r041;
                    }
                    synchronized (C3741398h.class) {
                        r028 = C3741398h.PARSER;
                        if (r028 == null) {
                            C3738397d r042 = C3738197b.A01;
                            r028 = new C3738197b(C3741398h.DEFAULT_INSTANCE);
                            C3741398h.PARSER = r028;
                        }
                    }
                    return r028;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3741498i) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3741498i.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
                case 3:
                    return new C3741498i();
                case 4:
                    return new C384309h7();
                case 5:
                    return C3741498i.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r043 = C3741498i.PARSER;
                    if (r043 != null) {
                        return r043;
                    }
                    synchronized (C3741498i.class) {
                        r027 = C3741498i.PARSER;
                        if (r027 == null) {
                            C3738397d r044 = C3738197b.A01;
                            r027 = new C3738197b(C3741498i.DEFAULT_INSTANCE);
                            C3741498i.PARSER = r027;
                        }
                    }
                    return r027;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3741198f) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3741198f.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C3741298g.class});
                case 3:
                    return new C3741198f();
                case 4:
                    return new C384239gz();
                case 5:
                    return C3741198f.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r045 = C3741198f.PARSER;
                    if (r045 != null) {
                        return r045;
                    }
                    synchronized (C3741198f.class) {
                        r026 = C3741198f.PARSER;
                        if (r026 == null) {
                            C3738397d r046 = C3738197b.A01;
                            r026 = new C3738197b(C3741198f.DEFAULT_INSTANCE);
                            C3741198f.PARSER = r026;
                        }
                    }
                    return r026;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3741298g) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3741298g.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new C3741298g();
                case 4:
                    return new C384249h0();
                case 5:
                    return C3741298g.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r047 = C3741298g.PARSER;
                    if (r047 != null) {
                        return r047;
                    }
                    synchronized (C3741298g.class) {
                        r025 = C3741298g.PARSER;
                        if (r025 == null) {
                            C3738397d r048 = C3738197b.A01;
                            r025 = new C3738197b(C3741298g.DEFAULT_INSTANCE);
                            C3741298g.PARSER = r025;
                        }
                    }
                    return r025;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3741598j) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3741598j.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new C3741598j();
                case 4:
                    return new C384289h5();
                case 5:
                    return C3741598j.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r049 = C3741598j.PARSER;
                    if (r049 != null) {
                        return r049;
                    }
                    synchronized (C3741598j.class) {
                        r024 = C3741598j.PARSER;
                        if (r024 == null) {
                            C3738397d r050 = C3738197b.A01;
                            r024 = new C3738197b(C3741598j.DEFAULT_INSTANCE);
                            C3741598j.PARSER = r024;
                        }
                    }
                    return r024;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3741698k) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3741698k.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384259h2();
                case 5:
                    return C3741698k.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r051 = C3741698k.PARSER;
                    if (r051 != null) {
                        return r051;
                    }
                    synchronized (C3741698k.class) {
                        r023 = C3741698k.PARSER;
                        if (r023 == null) {
                            C3738397d r052 = C3738197b.A01;
                            r023 = new C3738197b(C3741698k.DEFAULT_INSTANCE);
                            C3741698k.PARSER = r023;
                        }
                    }
                    return r023;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3741798l) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3741798l.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new AnonymousClass9h1();
                case 5:
                    return C3741798l.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r053 = C3741798l.PARSER;
                    if (r053 != null) {
                        return r053;
                    }
                    synchronized (C3741798l.class) {
                        r022 = C3741798l.PARSER;
                        if (r022 == null) {
                            C3738397d r054 = C3738197b.A01;
                            r022 = new C3738197b(C3741798l.DEFAULT_INSTANCE);
                            C3741798l.PARSER = r022;
                        }
                    }
                    return r022;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C3740898c) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C3740898c.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new C3740898c();
                case 4:
                    return new C384199gv();
                case 5:
                    return C3740898c.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r055 = C3740898c.PARSER;
                    if (r055 != null) {
                        return r055;
                    }
                    synchronized (C3740898c.class) {
                        r021 = C3740898c.PARSER;
                        if (r021 == null) {
                            C3738397d r056 = C3738197b.A01;
                            r021 = new C3738197b(C3740898c.DEFAULT_INSTANCE);
                            C3740898c.PARSER = r021;
                        }
                    }
                    return r021;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof AnonymousClass99B) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    String A002 = Pxd.A00(109);
                    return new AnonymousClass9C1(AnonymousClass99B.DEFAULT_INSTANCE, A002, new Object[]{"version_", "keyValue_"});
                case 3:
                    return new AnonymousClass99B();
                case 4:
                    return new C384179gt();
                case 5:
                    return AnonymousClass99B.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r057 = AnonymousClass99B.PARSER;
                    if (r057 != null) {
                        return r057;
                    }
                    synchronized (AnonymousClass99B.class) {
                        r020 = AnonymousClass99B.PARSER;
                        if (r020 == null) {
                            C3738397d r058 = C3738197b.A01;
                            r020 = new C3738197b(AnonymousClass99B.DEFAULT_INSTANCE);
                            AnonymousClass99B.PARSER = r020;
                        }
                    }
                    return r020;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof AnonymousClass99C) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(AnonymousClass99C.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new AnonymousClass99C();
                case 4:
                    return new C384139gp();
                case 5:
                    return AnonymousClass99C.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r059 = AnonymousClass99C.PARSER;
                    if (r059 != null) {
                        return r059;
                    }
                    synchronized (AnonymousClass99C.class) {
                        r019 = AnonymousClass99C.PARSER;
                        if (r019 == null) {
                            C3738397d r060 = C3738197b.A01;
                            r019 = new C3738197b(AnonymousClass99C.DEFAULT_INSTANCE);
                            AnonymousClass99C.PARSER = r019;
                        }
                    }
                    return r019;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof AnonymousClass99D) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(AnonymousClass99D.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new AnonymousClass99D();
                case 4:
                    return new C384099gl();
                case 5:
                    return AnonymousClass99D.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r061 = AnonymousClass99D.PARSER;
                    if (r061 != null) {
                        return r061;
                    }
                    synchronized (AnonymousClass99D.class) {
                        r018 = AnonymousClass99D.PARSER;
                        if (r018 == null) {
                            C3738397d r062 = C3738197b.A01;
                            r018 = new C3738197b(AnonymousClass99D.DEFAULT_INSTANCE);
                            AnonymousClass99D.PARSER = r018;
                        }
                    }
                    return r018;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof AnonymousClass99E) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(AnonymousClass99E.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384059gh();
                case 5:
                    return AnonymousClass99E.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r063 = AnonymousClass99E.PARSER;
                    if (r063 != null) {
                        return r063;
                    }
                    synchronized (AnonymousClass99E.class) {
                        r017 = AnonymousClass99E.PARSER;
                        if (r017 == null) {
                            C3738397d r064 = C3738197b.A01;
                            r017 = new C3738197b(AnonymousClass99E.DEFAULT_INSTANCE);
                            AnonymousClass99E.PARSER = r017;
                        }
                    }
                    return r017;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof AnonymousClass99A) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(AnonymousClass99A.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
                case 3:
                    return new AnonymousClass99A();
                case 4:
                    return new C384029ge();
                case 5:
                    return AnonymousClass99A.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r065 = AnonymousClass99A.PARSER;
                    if (r065 != null) {
                        return r065;
                    }
                    synchronized (AnonymousClass99A.class) {
                        r016 = AnonymousClass99A.PARSER;
                        if (r016 == null) {
                            C3738397d r066 = C3738197b.A01;
                            r016 = new C3738197b(AnonymousClass99A.DEFAULT_INSTANCE);
                            AnonymousClass99A.PARSER = r016;
                        }
                    }
                    return r016;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384339hA) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    String A003 = Pxd.A00(25);
                    return new AnonymousClass9C1(C384339hA.DEFAULT_INSTANCE, A003, new Object[]{"version_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384299h6();
                case 5:
                    return C384339hA.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r067 = C384339hA.PARSER;
                    if (r067 != null) {
                        return r067;
                    }
                    synchronized (C384339hA.class) {
                        r015 = C384339hA.PARSER;
                        if (r015 == null) {
                            C3738397d r068 = C3738197b.A01;
                            r015 = new C3738197b(C384339hA.DEFAULT_INSTANCE);
                            C384339hA.PARSER = r015;
                        }
                    }
                    return r015;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof AnonymousClass971) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(AnonymousClass971.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", XPB.class});
                case 3:
                    return new AnonymousClass971();
                case 4:
                    return new C384279h4();
                case 5:
                    return AnonymousClass971.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r069 = AnonymousClass971.PARSER;
                    if (r069 != null) {
                        return r069;
                    }
                    synchronized (AnonymousClass971.class) {
                        r014 = AnonymousClass971.PARSER;
                        if (r014 == null) {
                            C3738397d r070 = C3738197b.A01;
                            r014 = new C3738197b(AnonymousClass971.DEFAULT_INSTANCE);
                            AnonymousClass971.PARSER = r014;
                        }
                    }
                    return r014;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384429hJ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384429hJ.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
                case 3:
                    return new C384429hJ();
                case 4:
                    return new C384269h3();
                case 5:
                    return C384429hJ.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r071 = C384429hJ.PARSER;
                    if (r071 != null) {
                        return r071;
                    }
                    synchronized (C384429hJ.class) {
                        r013 = C384429hJ.PARSER;
                        if (r013 == null) {
                            C3738397d r072 = C3738197b.A01;
                            r013 = new C3738197b(C384429hJ.DEFAULT_INSTANCE);
                            C384429hJ.PARSER = r013;
                        }
                    }
                    return r013;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384459hM) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384459hM.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
                case 3:
                    return new C384459hM();
                case 4:
                    return new C384319h8();
                case 5:
                    return C384459hM.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r073 = C384459hM.PARSER;
                    if (r073 != null) {
                        return r073;
                    }
                    synchronized (C384459hM.class) {
                        r012 = C384459hM.PARSER;
                        if (r012 == null) {
                            C3738397d r074 = C3738197b.A01;
                            r012 = new C3738197b(C384459hM.DEFAULT_INSTANCE);
                            C384459hM.PARSER = r012;
                        }
                    }
                    return r012;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384379hE) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384379hE.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384219gx();
                case 5:
                    return C384379hE.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r075 = C384379hE.PARSER;
                    if (r075 != null) {
                        return r075;
                    }
                    synchronized (C384379hE.class) {
                        r011 = C384379hE.PARSER;
                        if (r011 == null) {
                            C3738397d r076 = C3738197b.A01;
                            r011 = new C3738197b(C384379hE.DEFAULT_INSTANCE);
                            C384379hE.PARSER = r011;
                        }
                    }
                    return r011;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384449hL) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384449hL.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384209gw();
                case 5:
                    return C384449hL.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r077 = C384449hL.PARSER;
                    if (r077 != null) {
                        return r077;
                    }
                    synchronized (C384449hL.class) {
                        r010 = C384449hL.PARSER;
                        if (r010 == null) {
                            C3738397d r078 = C3738197b.A01;
                            r010 = new C3738197b(C384449hL.DEFAULT_INSTANCE);
                            C384449hL.PARSER = r010;
                        }
                    }
                    return r010;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384369hD) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384369hD.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384169gs();
                case 5:
                    return C384369hD.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r079 = C384369hD.PARSER;
                    if (r079 != null) {
                        return r079;
                    }
                    synchronized (C384369hD.class) {
                        r09 = C384369hD.PARSER;
                        if (r09 == null) {
                            C3738397d r080 = C3738197b.A01;
                            r09 = new C3738197b(C384369hD.DEFAULT_INSTANCE);
                            C384369hD.PARSER = r09;
                        }
                    }
                    return r09;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384359hC) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384359hC.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384149gq();
                case 5:
                    return C384359hC.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r081 = C384359hC.PARSER;
                    if (r081 != null) {
                        return r081;
                    }
                    synchronized (C384359hC.class) {
                        r08 = C384359hC.PARSER;
                        if (r08 == null) {
                            C3738397d r082 = C3738197b.A01;
                            r08 = new C3738197b(C384359hC.DEFAULT_INSTANCE);
                            C384359hC.PARSER = r08;
                        }
                    }
                    return r08;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384349hB) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384349hB.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384129go();
                case 5:
                    return C384349hB.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r083 = C384349hB.PARSER;
                    if (r083 != null) {
                        return r083;
                    }
                    synchronized (C384349hB.class) {
                        r07 = C384349hB.PARSER;
                        if (r07 == null) {
                            C3738397d r084 = C3738197b.A01;
                            r07 = new C3738197b(C384349hB.DEFAULT_INSTANCE);
                            C384349hB.PARSER = r07;
                        }
                    }
                    return r07;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384419hI) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384419hI.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384109gm();
                case 5:
                    return C384419hI.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r085 = C384419hI.PARSER;
                    if (r085 != null) {
                        return r085;
                    }
                    synchronized (C384419hI.class) {
                        r06 = C384419hI.PARSER;
                        if (r06 == null) {
                            C3738397d r086 = C3738197b.A01;
                            r06 = new C3738197b(C384419hI.DEFAULT_INSTANCE);
                            C384419hI.PARSER = r06;
                        }
                    }
                    return r06;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384409hH) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384409hH.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384089gk();
                case 5:
                    return C384409hH.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r087 = C384409hH.PARSER;
                    if (r087 != null) {
                        return r087;
                    }
                    synchronized (C384409hH.class) {
                        r05 = C384409hH.PARSER;
                        if (r05 == null) {
                            C3738397d r088 = C3738197b.A01;
                            r05 = new C3738197b(C384409hH.DEFAULT_INSTANCE);
                            C384409hH.PARSER = r05;
                        }
                    }
                    return r05;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384439hK) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384439hK.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new C384439hK();
                case 4:
                    return new C384079gj();
                case 5:
                    return C384439hK.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r089 = C384439hK.PARSER;
                    if (r089 != null) {
                        return r089;
                    }
                    synchronized (C384439hK.class) {
                        r04 = C384439hK.PARSER;
                        if (r04 == null) {
                            C3738397d r090 = C3738197b.A01;
                            r04 = new C3738197b(C384439hK.DEFAULT_INSTANCE);
                            C384439hK.PARSER = r04;
                        }
                    }
                    return r04;
                default:
                    throw new UnsupportedOperationException();
            }
        } else if (this instanceof C384399hG) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass9C1(C384399hG.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
                case 3:
                    return new AnonymousClass972();
                case 4:
                    return new C384069gi();
                case 5:
                    return C384399hG.DEFAULT_INSTANCE;
                case 6:
                    C3738297c r091 = C384399hG.PARSER;
                    if (r091 != null) {
                        return r091;
                    }
                    synchronized (C384399hG.class) {
                        r03 = C384399hG.PARSER;
                        if (r03 == null) {
                            C3738397d r092 = C3738197b.A01;
                            r03 = new C3738197b(C384399hG.DEFAULT_INSTANCE);
                            C384399hG.PARSER = r03;
                        }
                    }
                    return r03;
                default:
                    throw new UnsupportedOperationException();
            }
        } else {
            boolean z = this instanceof C384329h9;
            int intValue = num.intValue();
            if (z) {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        String A004 = Pxd.A00(25);
                        return new AnonymousClass9C1(C384329h9.DEFAULT_INSTANCE, A004, new Object[]{"tagSize_"});
                    case 3:
                        return new AnonymousClass972();
                    case 4:
                        return new C384049gg();
                    case 5:
                        return C384329h9.DEFAULT_INSTANCE;
                    case 6:
                        C3738297c r093 = C384329h9.PARSER;
                        if (r093 != null) {
                            return r093;
                        }
                        synchronized (C384329h9.class) {
                            r02 = C384329h9.PARSER;
                            if (r02 == null) {
                                C3738397d r094 = C3738197b.A01;
                                r02 = new C3738197b(C384329h9.DEFAULT_INSTANCE);
                                C384329h9.PARSER = r02;
                            }
                        }
                        return r02;
                    default:
                        throw new UnsupportedOperationException();
                }
            } else {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return new AnonymousClass9C1(C384389hF.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
                    case 3:
                        return new AnonymousClass972();
                    case 4:
                        return new C384039gf();
                    case 5:
                        return C384389hF.DEFAULT_INSTANCE;
                    case 6:
                        C3738297c r095 = C384389hF.PARSER;
                        if (r095 != null) {
                            return r095;
                        }
                        synchronized (C384389hF.class) {
                            r0 = C384389hF.PARSER;
                            if (r0 == null) {
                                C3738397d r096 = C3738197b.A01;
                                r0 = new C3738197b(C384389hF.DEFAULT_INSTANCE);
                                C384389hF.PARSER = r0;
                            }
                        }
                        return r0;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return AnonymousClass9BZ.A02.A00(cls).ASr(this, obj);
    }

    public final int hashCode() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return AnonymousClass9BZ.A02.A00(getClass()).CL6(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int CL6 = AnonymousClass9BZ.A02.A00(getClass()).CL6(this);
        this.memoizedHashCode = CL6;
        return CL6;
    }

    public static Object A04(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(Pxd.A00(141), e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw new RuntimeException(Pxd.A00(180), cause);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public static void A05(AnonymousClass972 r2) {
        if (!A07(r2)) {
            ? iOException = new IOException(new RuntimeException(C273654mx.A00(59)).getMessage());
            iOException.A00 = null;
            iOException.A00 = r2;
            throw iOException;
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AGd.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AGd.A00(this, sb, 0);
        return sb.toString();
    }
}
