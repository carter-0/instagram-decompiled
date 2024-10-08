package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

public abstract class Q21 {
    public static final Bundle A00(0eP... r8) {
        Bundle bundle = new Bundle(r6);
        for (0eP r0 : r8) {
            String str = (String) r0.A00;
            Object obj = r0.A01;
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else {
                if (obj instanceof Object[]) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    0qQ.A0A(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(str, (Parcelable[]) obj);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(str, (String[]) obj);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw AnonymousClass7TE.A0w(002.A0v("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, '\"'));
                    }
                } else if (!(obj instanceof Serializable)) {
                    if (obj instanceof IBinder) {
                        bundle.putBinder(str, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str, (Size) obj);
                    } else if (obj instanceof SizeF) {
                        bundle.putSizeF(str, (SizeF) obj);
                    } else {
                        throw AnonymousClass7TE.A0w(002.A0v("Illegal value type ", Pxf.A0g(obj), " for key \"", str, '\"'));
                    }
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        return bundle;
    }
}
