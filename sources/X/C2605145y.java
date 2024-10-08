package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.45y  reason: invalid class name and case insensitive filesystem */
public final class C2605145y {
    public static final C2605245z A02;
    public InputStream A00;
    public OutputStream A01;

    public final void A00(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            InputStream inputStream = this.A00;
            if (inputStream != null) {
                try {
                    int read = inputStream.read(bArr, i2, i3);
                    if (read < 0) {
                        throw new RuntimeException();
                    } else if (read > 0) {
                        i2 += read;
                    } else {
                        throw new RuntimeException(002.A0n("Cannot read. Remote side has closed. Tried to read ", " bytes, but only got ", " bytes.", i, i2));
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new RuntimeException("Cannot read from null inputStream");
            }
        }
    }

    public final void A01(byte[] bArr, int i) {
        OutputStream outputStream = this.A01;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, 0, i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("Cannot write to null outputStream");
        }
    }

    static {
        AnonymousClass46A r2;
        AnonymousClass46A r1;
        try {
            Object invoke = C2605245z.A02.invoke((Object) null, new Object[]{C2605145y.class.getName()});
            Class<?> cls = invoke.getClass();
            Class<String> cls2 = String.class;
            Method declaredMethod = cls.getDeclaredMethod("error", new Class[]{cls2});
            Method declaredMethod2 = cls.getDeclaredMethod("warn", new Class[]{cls2});
            r2 = new C22267Xyc(invoke, declaredMethod);
            r1 = new C22268Xyd(invoke, declaredMethod2);
        } catch (ExceptionInInitializerError | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            r2 = new AnonymousClass4C5();
            r1 = new AnonymousClass4C6();
        }
        A02 = new C2605245z(r2, r1);
    }

    public C2605145y(InputStream inputStream) {
        this.A01 = null;
        this.A00 = inputStream;
    }

    public C2605145y(OutputStream outputStream) {
        this.A00 = null;
        this.A01 = outputStream;
    }

    public C2605145y() {
        this.A00 = null;
        this.A01 = null;
    }
}
