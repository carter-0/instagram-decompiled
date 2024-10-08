package com.facebook.mill.immutablecursor;

import X.0qQ;
import X.AnonymousClass00P;
import X.C60340gF;
import X.C9255RVg;
import X.SBI;
import X.SBJ;
import com.facebook.mill.runtime.TypeSqlQuery;
import com.facebook.simplejni.NativeHolder;

public final class TypeSqlQueryImpl implements TypeSqlQuery {
    public static final C9255RVg Companion = new Object();
    public static final int SQLITE_BLOB = 4;
    public static final int SQLITE_FLOAT = 2;
    public static final int SQLITE_INTEGER = 1;
    public static final int SQLITE_NULL = 5;
    public static final int SQLITE_TEXT = 3;
    public byte[] columnTypes;
    public NativeHolder mNativeHolder;
    public int size = -1;

    public TypeSqlQueryImpl(NativeHolder nativeHolder) {
        0qQ.A0B(nativeHolder, 1);
        this.mNativeHolder = nativeHolder;
        SBJ.A00();
        SBI.A00();
    }

    private final native int getSize();

    private final native boolean isNull(int i);

    public native void close();

    public native byte[] getBlob(int i);

    public native boolean getBoolean(int i);

    public native double getDouble(int i);

    public native float getFloat(int i);

    public native int getInt(int i);

    public native long getLong(int i);

    public native String getString(int i);

    public native int getType(int i);

    public native boolean next();

    public native void resetPosition();

    public void setColumnTypes(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        this.columnTypes = bArr;
    }

    public byte[] getColumnTypes() {
        byte[] bArr = this.columnTypes;
        if (bArr != null) {
            return bArr;
        }
        0qQ.A0F("columnTypes");
        throw AnonymousClass00P.createAndThrow();
    }

    public int getCount() {
        int i = this.size;
        if (i != -1) {
            return i;
        }
        int size2 = getSize();
        this.size = size2;
        return size2;
    }

    public Object getAny(int i) {
        int type = getType(i);
        if (type == 1) {
            return Integer.valueOf(getInt(i));
        }
        if (type == 2) {
            return Float.valueOf(getFloat(i));
        }
        if (type == 4) {
            return getBlob(i);
        }
        if (type != 5) {
            return getString(i);
        }
        return C60340gF.A00;
    }

    public Object getNullableAny(int i) {
        if (isNull(i)) {
            return null;
        }
        return getAny(i);
    }

    public byte[] getNullableBlob(int i) {
        if (isNull(i)) {
            return null;
        }
        return getBlob(i);
    }

    public Boolean getNullableBoolean(int i) {
        if (isNull(i)) {
            return null;
        }
        return Boolean.valueOf(getBoolean(i));
    }

    public Double getNullableDouble(int i) {
        if (isNull(i)) {
            return null;
        }
        return Double.valueOf(getDouble(i));
    }

    public Float getNullableFloat(int i) {
        if (isNull(i)) {
            return null;
        }
        return Float.valueOf(getFloat(i));
    }

    public Integer getNullableInt(int i) {
        if (isNull(i)) {
            return null;
        }
        return Integer.valueOf(getInt(i));
    }

    public Long getNullableLong(int i) {
        if (isNull(i)) {
            return null;
        }
        return Long.valueOf(getLong(i));
    }

    public String getNullableString(int i) {
        if (isNull(i)) {
            return null;
        }
        return getString(i);
    }
}
