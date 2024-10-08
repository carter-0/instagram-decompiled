package com.facebook.react.bridge;

import X.002;
import X.0Sd;
import X.AnonymousClass7TE;
import X.DbW;
import X.JTO;
import X.SBO;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadableNativeArray extends NativeArray implements ReadableArray {
    public static int jniPassCounter;
    public Object[] mLocalArray;
    public ReadableType[] mLocalTypeArray;

    private native Object[] importArray();

    private native Object[] importTypeArray();

    public ReadableType getType(int i) {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr == null) {
            synchronized (this) {
                if (this.mLocalTypeArray == null) {
                    jniPassCounter++;
                    Object[] importTypeArray = importTypeArray();
                    0Sd.A00(importTypeArray);
                    this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(importTypeArray, importTypeArray.length, ReadableType[].class);
                }
            }
            readableTypeArr = this.mLocalTypeArray;
        }
        return readableTypeArr[i];
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr != null) {
            return objArr;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                jniPassCounter++;
                Object[] importArray = importArray();
                0Sd.A00(importArray);
                this.mLocalArray = importArray;
            }
        }
        return this.mLocalArray;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableNativeArray)) {
            return false;
        }
        return Arrays.deepEquals(getLocalArray(), ((ReadableNativeArray) obj).getLocalArray());
    }

    static {
        SBO.A00();
    }

    public /* bridge */ /* synthetic */ ReadableArray getArray(int i) {
        return (ReadableNativeArray) getLocalArray()[i];
    }

    public boolean getBoolean(int i) {
        return AnonymousClass7TE.A1a(getLocalArray()[i]);
    }

    public double getDouble(int i) {
        return JTO.A00(getLocalArray()[i]);
    }

    public int getInt(int i) {
        return AnonymousClass7TE.A0M(getLocalArray()[i]);
    }

    public /* bridge */ /* synthetic */ ReadableMap getMap(int i) {
        return (ReadableNativeMap) getLocalArray()[i];
    }

    public String getString(int i) {
        return (String) getLocalArray()[i];
    }

    public int hashCode() {
        return getLocalArray().hashCode();
    }

    public boolean isNull(int i) {
        return DbW.A1a(getLocalArray()[i]);
    }

    public int size() {
        return getLocalArray().length;
    }

    public ArrayList toArrayList() {
        Object obj;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i = 0; i < size(); i++) {
            switch (getType(i).ordinal()) {
                case 0:
                    A1C.add((Object) null);
                    continue;
                case 1:
                    obj = Boolean.valueOf(getBoolean(i));
                    break;
                case 2:
                    obj = Double.valueOf(getDouble(i));
                    break;
                case 3:
                    obj = getString(i);
                    break;
                case 4:
                    obj = ((ReadableNativeMap) getLocalArray()[i]).toHashMap();
                    break;
                case 5:
                    obj = ((ReadableNativeArray) getLocalArray()[i]).toArrayList();
                    break;
                default:
                    throw AnonymousClass7TE.A0w(002.A0c("Could not convert object at index: ", ".", i));
            }
            A1C.add(obj);
        }
        return A1C;
    }
}
