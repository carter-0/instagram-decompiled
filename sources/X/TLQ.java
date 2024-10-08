package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class TLQ implements InvocationHandler {
    public SharedPreferences A00;
    public final int A01;
    public final Context A02;
    public final String A03;

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        0qQ.A0B(method, 1);
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.getSharedPreferences(this.A03, this.A01);
            this.A00 = sharedPreferences;
        }
        if (objArr == null) {
            objArr = Pxe.A1b();
        }
        return method.invoke(sharedPreferences, Arrays.copyOf(objArr, objArr.length));
    }

    public TLQ(Context context, String str, int i) {
        this.A02 = context;
        this.A03 = str;
        this.A01 = i;
    }
}
