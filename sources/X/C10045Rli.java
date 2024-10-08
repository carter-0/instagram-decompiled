package X;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Rli  reason: case insensitive filesystem */
public abstract class C10045Rli {
    public static final Collection A00;

    static {
        Class<CoroutineExceptionHandler> cls = CoroutineExceptionHandler.class;
        A00 = C242173Sx.A07(2YX.A00(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }
}
