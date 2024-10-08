package kotlinx.coroutines.android;

import X.C262074Ca;
import X.C262094Cc;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class AndroidExceptionPreHandler extends C262074Ca implements CoroutineExceptionHandler {
    public volatile Object _preHandler = this;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.Key);
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void handleException(C262094Cc r1, Throwable th) {
    }
}
