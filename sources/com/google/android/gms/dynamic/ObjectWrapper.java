package com.google.android.gms.dynamic;

import X.002;
import X.AnonymousClass0fD;
import X.AnonymousClass3Qk;
import X.Pxd;
import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

public final class ObjectWrapper extends IObjectWrapper.Stub {
    public final Object A00;

    public static Object A00(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field field = null;
        int i = 0;
        for (Field field2 : asBinder.getClass().getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            AnonymousClass3Qk.A02(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException(Pxd.A00(362), e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException(Pxd.A00(462), e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(002.A0O("Unexpected number of IObjectWrapper declared fields: ", r5));
        }
    }

    public ObjectWrapper(Object obj) {
        int A03 = AnonymousClass0fD.A03(-212057726);
        this.A00 = obj;
        AnonymousClass0fD.A0A(-1921809681, A03);
    }
}
