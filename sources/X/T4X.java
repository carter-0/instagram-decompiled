package X;

import com.facebook.react.modules.intent.IntentModule;
import com.google.android.gms.internal.mlkit_vision_common.zzah;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class T4X implements C13745TgH {
    public static final C11357SOt A05;
    public static final C11357SOt A06;
    public static final C13961TmO A07 = C12625T0n.A00;
    public static final Charset A08 = Pxe.A17();
    public OutputStream A00;
    public final C12720T4e A01 = new C12720T4e(this);
    public final Map A02;
    public final C13961TmO A03;
    public final Map A04;

    public final /* synthetic */ C13745TgH A7P(C11357SOt sOt, long j) {
        A04(sOt, j, true);
        return this;
    }

    public final C13745TgH A7Q(C11357SOt sOt, Object obj) {
        A05(sOt, obj, true);
        return this;
    }

    public static int A00(C11357SOt sOt) {
        zzah zzah = (zzah) C11357SOt.A01(sOt, zzah.class);
        if (zzah != null) {
            return ((SyL) zzah).A00;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    private final void A01(int i) {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.A00;
            if (i2 != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    private final void A02(C11357SOt sOt, C13961TmO tmO, Object obj, boolean z) {
        OutputStream outputStream;
        C8854RCv rCv = new C8854RCv();
        try {
            outputStream = this.A00;
            this.A00 = rCv;
            tmO.ARq(obj, this);
            this.A00 = outputStream;
            long j = rCv.A00;
            rCv.close();
            if (!z || j != 0) {
                A01((A00(sOt) << 3) | 2);
                while (true) {
                    int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
                    OutputStream outputStream2 = this.A00;
                    if (i != 0) {
                        j = Pxg.A0F(outputStream2, j);
                    } else {
                        outputStream2.write(((int) j) & 127);
                        tmO.ARq(obj, this);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                rCv.close();
                throw th;
            } catch (Throwable th2) {
                Class<Throwable> cls = Throwable.class;
                try {
                    cls.getDeclaredMethod("addSuppressed", new Class[]{cls}).invoke(th, new Object[]{th2});
                } catch (Exception unused) {
                }
                throw th;
            }
        }
    }

    public final void A03(C11357SOt sOt, int i, boolean z) {
        if (!z || i != 0) {
            zzah zzah = (zzah) C11357SOt.A01(sOt, zzah.class);
            if (zzah != null) {
                A01(((SyL) zzah).A00 << 3);
                A01(i);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void A04(C11357SOt sOt, long j, boolean z) {
        if (!z || j != 0) {
            zzah zzah = (zzah) C11357SOt.A01(sOt, zzah.class);
            if (zzah != null) {
                A01(((SyL) zzah).A00 << 3);
                while (true) {
                    int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
                    OutputStream outputStream = this.A00;
                    if (i != 0) {
                        j = Pxg.A0F(outputStream, j);
                    } else {
                        outputStream.write(((int) j) & 127);
                        return;
                    }
                }
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
    }

    public final void A05(C11357SOt sOt, Object obj, boolean z) {
        byte[] bArr;
        OutputStream outputStream;
        ByteBuffer byteBuffer;
        int ordinal;
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    A01((A00(sOt) << 3) | 2);
                    bArr = charSequence.toString().getBytes(A08);
                } else {
                    return;
                }
            } else if (obj instanceof Collection) {
                for (Object A052 : (Collection) obj) {
                    A05(sOt, A052, false);
                }
                return;
            } else if (obj instanceof Map) {
                Iterator A0u = AnonymousClass7TF.A0u((Map) obj);
                while (A0u.hasNext()) {
                    A02(sOt, A07, A0u.next(), false);
                }
                return;
            } else {
                if (obj instanceof Double) {
                    double A002 = JTO.A00(obj);
                    if (!z || A002 != 0.0d) {
                        A01((A00(sOt) << 3) | 1);
                        outputStream = this.A00;
                        byteBuffer = Pxg.A12(8);
                        byteBuffer.putDouble(A002);
                    } else {
                        return;
                    }
                } else if (obj instanceof Float) {
                    float A042 = AnonymousClass7TE.A04(obj);
                    if (!z || A042 != 0.0f) {
                        A01((A00(sOt) << 3) | 5);
                        outputStream = this.A00;
                        byteBuffer = Pxg.A12(4);
                        byteBuffer.putFloat(A042);
                    } else {
                        return;
                    }
                } else if (obj instanceof Number) {
                    A04(sOt, AnonymousClass7TE.A0R(obj), z);
                    return;
                } else if (obj instanceof Boolean) {
                    A03(sOt, AnonymousClass7TE.A1a(obj) ? 1 : 0, z);
                    return;
                } else if (obj instanceof byte[]) {
                    bArr = (byte[]) obj;
                    if (!z || bArr.length != 0) {
                        A01((A00(sOt) << 3) | 2);
                    } else {
                        return;
                    }
                } else {
                    Map map = this.A02;
                    Class<?> cls = obj.getClass();
                    C13961TmO tmO = (C13961TmO) map.get(cls);
                    if (tmO == null) {
                        C13654TeL teL = (C13654TeL) this.A04.get(cls);
                        if (teL != null) {
                            C12720T4e t4e = this.A01;
                            t4e.A01 = false;
                            t4e.A00 = sOt;
                            t4e.A02 = z;
                            teL.ARq(obj, t4e);
                            return;
                        }
                        if (obj instanceof C13643TeA) {
                            ordinal = ((C13643TeA) obj).FOt();
                        } else if (obj instanceof Enum) {
                            ordinal = ((Enum) obj).ordinal();
                        } else {
                            tmO = this.A03;
                        }
                        A03(sOt, ordinal, true);
                        return;
                    }
                    A02(sOt, tmO, obj, z);
                    return;
                }
                outputStream.write(byteBuffer.array());
                return;
            }
            A01(bArr.length);
            this.A00.write(bArr);
        }
    }

    static {
        SUa A032 = SUa.A03("key");
        RDN rdn = RDN.DEFAULT;
        A05 = SUa.A04(rdn, A032);
        A06 = SUa.A06(rdn, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
    }

    public T4X(C13961TmO tmO, OutputStream outputStream, Map map, Map map2) {
        this.A00 = outputStream;
        this.A02 = map;
        this.A04 = map2;
        this.A03 = tmO;
    }
}
