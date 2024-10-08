package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Rix  reason: case insensitive filesystem */
public abstract class C9884Rix {
    public static Integer A00(Field field) {
        Class<?> type = field.getType();
        Class<?> componentType = type.getComponentType();
        if (type.isArray() && componentType != null && Parcelable.class.isAssignableFrom(componentType)) {
            return AnonymousClass05K.A0j;
        }
        if (type.isArray() && componentType != null && String.class.isAssignableFrom(componentType)) {
            return AnonymousClass05K.A0u;
        }
        if (type.isArray() && componentType != null && Byte.TYPE.isAssignableFrom(componentType)) {
            return AnonymousClass05K.A15;
        }
        if (type.isArray() && componentType != null && Integer.TYPE.isAssignableFrom(componentType)) {
            return AnonymousClass05K.A1I;
        }
        if (Bundle.class.isAssignableFrom(type)) {
            return AnonymousClass05K.A0Y;
        }
        if (Parcelable.class.isAssignableFrom(type)) {
            return AnonymousClass05K.A00;
        }
        if (IBinder.class.isAssignableFrom(type)) {
            return AnonymousClass05K.A01;
        }
        if (IInterface.class.isAssignableFrom(type)) {
            return AnonymousClass05K.A1F;
        }
        if (type == List.class || type == ArrayList.class) {
            if (SQJ.A02(field) != String.class || SQJ.A03(field)) {
                return AnonymousClass05K.A0N;
            }
            return AnonymousClass05K.A0C;
        } else if (type == Map.class || type == HashMap.class) {
            return AnonymousClass05K.A08;
        } else {
            if (type == Integer.TYPE || type == Integer.class) {
                return AnonymousClass05K.A02;
            }
            if (type == Boolean.TYPE || type == Boolean.class) {
                return AnonymousClass05K.A04;
            }
            if (type == Long.TYPE || type == Long.class) {
                return AnonymousClass05K.A03;
            }
            if (type == Float.TYPE || type == Float.class) {
                return AnonymousClass05K.A05;
            }
            if (type == Double.TYPE || type == Double.class) {
                return AnonymousClass05K.A06;
            }
            if (type == Byte.TYPE || type == Byte.class) {
                return AnonymousClass05K.A09;
            }
            if (type == String.class) {
                return AnonymousClass05K.A07;
            }
            throw AnonymousClass7TE.A15(AnonymousClass7TG.A0m(type, "Type is not yet usable with SafeParcelUtil: ", AnonymousClass7TE.A1A()));
        }
    }
}
