package X;

import android.os.Parcelable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.microg.safeparcel.SafeParcelable;

public abstract class SQJ {
    public static Parcelable.Creator A00(Class cls) {
        try {
            return (Parcelable.Creator) Pxg.A10(cls, "CREATOR").get((Object) null);
        } catch (NoSuchFieldException unused) {
            throw AnonymousClass7TE.A15(AnonymousClass7TF.A0l(" is an Parcelable without CREATOR", JTQ.A0d(cls)));
        } catch (IllegalAccessException unused2) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("CREATOR in ");
            A1A.append(cls);
            throw AnonymousClass7TE.A15(AnonymousClass7TF.A0l(" is not accessible", A1A));
        }
    }

    public static Class A02(Field field) {
        Class<SafeParcelable> subClass;
        SafeParcelable.Field field2 = (SafeParcelable.Field) field.getAnnotation(SafeParcelable.Field.class);
        if (field2 != null && (subClass = field2.subClass()) != SafeParcelable.class && subClass != null) {
            return subClass;
        }
        Type genericType = field.getGenericType();
        if (!(genericType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericType;
        if (parameterizedType.getActualTypeArguments().length < 1) {
            return null;
        }
        Type type = parameterizedType.getActualTypeArguments()[0];
        if (type instanceof Class) {
            return (Class) type;
        }
        return null;
    }

    public static boolean A03(Field field) {
        SafeParcelable.Field field2 = (SafeParcelable.Field) field.getAnnotation(SafeParcelable.Field.class);
        if (field2 != null) {
            return field2.useValueParcel();
        }
        throw Pxe.A0i();
    }

    public static Parcelable.Creator A01(Field field) {
        Class<?> type = field.getType();
        if ((!type.isArray() || (type = type.getComponentType()) != null) && Parcelable.class.isAssignableFrom(type)) {
            return A00(type);
        }
        throw AnonymousClass7TE.A15(AnonymousClass7TF.A0l(" is not an Parcelable", JTQ.A0d(type)));
    }
}
