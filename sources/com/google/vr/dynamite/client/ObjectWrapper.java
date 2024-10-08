package com.google.vr.dynamite.client;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.Pxe;
import android.os.IBinder;
import java.lang.reflect.Field;

public final class ObjectWrapper extends c {
    public final Object wrappedObject;

    public ObjectWrapper(Object obj) {
        int A03 = AnonymousClass0fD.A03(652179987);
        this.wrappedObject = obj;
        AnonymousClass0fD.A0A(496130142, A03);
    }

    public static Object unwrap(IObjectWrapper iObjectWrapper, Class cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        Field field = null;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field2 = declaredFields[i];
            if (!field2.isSynthetic()) {
                Field field3 = field;
                field = field2;
                if (field3 != null) {
                    field = null;
                    break;
                }
            }
            i++;
        }
        if (field == null) {
            throw AnonymousClass7TE.A0w("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                Object obj = field.get(asBinder);
                if (obj == null) {
                    return null;
                }
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
                throw AnonymousClass7TE.A0w("remoteBinder is the wrong class.");
            } catch (NullPointerException e) {
                throw Pxe.A0h("Binder object is null.", e);
            } catch (IllegalArgumentException e2) {
                throw Pxe.A0h("remoteBinder is the wrong class.", e2);
            } catch (IllegalAccessException e3) {
                throw Pxe.A0h("Could not access the field in remoteBinder.", e3);
            }
        } else {
            throw AnonymousClass7TE.A0w("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
