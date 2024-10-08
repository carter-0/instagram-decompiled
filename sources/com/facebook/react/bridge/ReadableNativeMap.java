package com.facebook.react.bridge;

import X.002;
import X.0Sd;
import X.0eO;
import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass7TE;
import X.C13348TVv;
import X.C73431PcW;
import X.C9531RcU;
import X.DbS;
import X.DbW;
import X.Pxe;
import X.Pxf;
import X.Pxh;
import X.SBO;
import X.SpP;
import java.util.HashMap;
import java.util.Iterator;

public class ReadableNativeMap extends NativeMap implements ReadableMap {
    public static final C9531RcU Companion = new Object();
    public static int jniPassCounter;
    public final AnonymousClass0eM keys$delegate;
    public final AnonymousClass0eM localMap$delegate;
    public final AnonymousClass0eM localTypeMap$delegate;

    /* access modifiers changed from: private */
    public final native String[] importKeys();

    /* access modifiers changed from: private */
    public final native Object[] importTypes();

    /* access modifiers changed from: private */
    public final native Object[] importValues();

    public ReadableArray getArray(String str) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 0);
        Object obj = getLocalMap().get(str);
        if (obj == null) {
            return null;
        }
        Object obj2 = obj;
        if (!(obj instanceof ReadableArray)) {
            obj2 = null;
        }
        ReadableArray readableArray = (ReadableArray) obj2;
        if (readableArray != null) {
            return readableArray;
        }
        Class<?> cls = obj.getClass();
        if (cls == null || (str2 = cls.getSimpleName()) == null) {
            str2 = "NULL";
        }
        String A13 = 002.A13("Value for ", str3, " cannot be cast from ", str2, " to ", "ReadableArray");
        0qQ.A0B(A13, 1);
        throw new RuntimeException(A13);
    }

    public boolean getBoolean(String str) {
        String str2;
        0qQ.A0B(str, 0);
        Class cls = Boolean.TYPE;
        Object value = getValue(str);
        Object obj = value;
        if (!(value instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        Class<?> cls2 = value.getClass();
        if (cls2 == null || (str2 = cls2.getSimpleName()) == null) {
            str2 = "NULL";
        }
        throw Pxh.A0P(cls, str, str2);
    }

    public double getDouble(String str) {
        String str2;
        0qQ.A0B(str, 0);
        Class cls = Double.TYPE;
        Object value = getValue(str);
        Object obj = value;
        if (!(value instanceof Double)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            return number.doubleValue();
        }
        Class<?> cls2 = value.getClass();
        if (cls2 == null || (str2 = cls2.getSimpleName()) == null) {
            str2 = "NULL";
        }
        throw Pxh.A0P(cls, str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.SpC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.SpC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.SpC} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.bridge.Dynamic getDynamic(java.lang.String r2) {
        /*
            r1 = this;
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.ThreadLocal r0 = X.C12212SpC.A02
            java.lang.Object r0 = r0.get()
            X.0vW r0 = (X.0vW) r0
            java.lang.Object r0 = r0.A7A()
            X.SpC r0 = (X.C12212SpC) r0
            if (r0 != 0) goto L_0x0019
            X.SpC r0 = new X.SpC
            r0.<init>()
        L_0x0019:
            r0.A00 = r1
            r0.A01 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeMap.getDynamic(java.lang.String):com.facebook.react.bridge.Dynamic");
    }

    public Iterator getEntryIterator() {
        C73431PcW pcW;
        synchronized (this) {
            String[] keys = getKeys();
            Object[] importValues = importValues();
            jniPassCounter++;
            pcW = new C73431PcW(importValues, keys);
        }
        return pcW;
    }

    public int getInt(String str) {
        String str2;
        0qQ.A0B(str, 0);
        Class cls = Double.TYPE;
        Object value = getValue(str);
        Object obj = value;
        if (!(value instanceof Double)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            return (int) number.doubleValue();
        }
        Class<?> cls2 = value.getClass();
        if (cls2 == null || (str2 = cls2.getSimpleName()) == null) {
            str2 = "NULL";
        }
        throw Pxh.A0P(cls, str, str2);
    }

    public long getLong(String str) {
        String str2;
        0qQ.A0B(str, 0);
        Class cls = Long.TYPE;
        Object value = getValue(str);
        Object obj = value;
        if (!(value instanceof Long)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            return number.longValue();
        }
        Class<?> cls2 = value.getClass();
        if (cls2 == null || (str2 = cls2.getSimpleName()) == null) {
            str2 = "NULL";
        }
        throw Pxh.A0P(cls, str, str2);
    }

    public ReadableNativeMap getMap(String str) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 0);
        Object obj = getLocalMap().get(str);
        if (obj == null) {
            return null;
        }
        Object obj2 = obj;
        if (!(obj instanceof ReadableNativeMap)) {
            obj2 = null;
        }
        ReadableNativeMap readableNativeMap = (ReadableNativeMap) obj2;
        if (readableNativeMap != null) {
            return readableNativeMap;
        }
        Class<?> cls = obj.getClass();
        if (cls == null || (str2 = cls.getSimpleName()) == null) {
            str2 = "NULL";
        }
        String A13 = 002.A13("Value for ", str3, " cannot be cast from ", str2, " to ", "ReadableNativeMap");
        0qQ.A0B(A13, 1);
        throw new RuntimeException(A13);
    }

    public String getString(String str) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 0);
        Object obj = getLocalMap().get(str);
        if (obj == null) {
            return null;
        }
        Object obj2 = obj;
        if (!(obj instanceof String)) {
            obj2 = null;
        }
        String str4 = (String) obj2;
        if (str4 != null) {
            return str4;
        }
        Class<?> cls = obj.getClass();
        if (cls == null || (str2 = cls.getSimpleName()) == null) {
            str2 = "NULL";
        }
        String A13 = 002.A13("Value for ", str3, " cannot be cast from ", str2, " to ", "String");
        0qQ.A0B(A13, 1);
        throw new RuntimeException(A13);
    }

    public ReadableType getType(String str) {
        0qQ.A0B(str, 0);
        ReadableType readableType = (ReadableType) getLocalTypeMap().get(str);
        if (readableType != null) {
            return readableType;
        }
        throw new RuntimeException(str);
    }

    public boolean hasKey(String str) {
        0qQ.A0B(str, 0);
        return getLocalMap().containsKey(str);
    }

    public boolean isNull(String str) {
        0qQ.A0B(str, 0);
        if (getLocalMap().containsKey(str)) {
            return DbW.A1a(getLocalMap().get(str));
        }
        throw new RuntimeException(str);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RcU, java.lang.Object] */
    static {
        SBO.A00();
    }

    private final /* synthetic */ Object checkInstance(String str, Object obj, Class cls) {
        throw AnonymousClass7TE.A1B("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final int getJNIPassCounter() {
        return jniPassCounter;
    }

    /* access modifiers changed from: private */
    public final String[] getKeys() {
        return (String[]) this.keys$delegate.getValue();
    }

    private final HashMap getLocalMap() {
        return (HashMap) this.localMap$delegate.getValue();
    }

    private final HashMap getLocalTypeMap() {
        return (HashMap) this.localTypeMap$delegate.getValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableNativeMap)) {
            return false;
        }
        return 0qQ.A0K(getLocalMap(), ((ReadableNativeMap) obj).getLocalMap());
    }

    public ReadableNativeMap() {
        0eO r1 = 0eO.A04;
        this.keys$delegate = C13348TVv.A00(this, r1, 43);
        this.localMap$delegate = C13348TVv.A00(this, r1, 44);
        this.localTypeMap$delegate = C13348TVv.A00(this, r1, 45);
    }

    private final /* synthetic */ Object getNullableValue(String str, Class cls) {
        if (getLocalMap().get(str) == null) {
            return null;
        }
        throw AnonymousClass7TE.A1B("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    private final /* synthetic */ Object getValue(String str, Class cls) {
        getValue(str);
        throw AnonymousClass7TE.A1B("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    public ReadableMapKeySetIterator keySetIterator() {
        return new SpP(getKeys());
    }

    public HashMap toHashMap() {
        Object obj;
        HashMap A19 = Pxe.A19(getLocalMap());
        Iterator A0u = Pxf.A0u(A19);
        while (A0u.hasNext()) {
            Object next = A0u.next();
            DbS.A1Y(next);
            String str = (String) next;
            switch (getType(str).ordinal()) {
                case 4:
                    ReadableNativeMap map = getMap(str);
                    0Sd.A00(map);
                    obj = map.toHashMap();
                    break;
                case 5:
                    ReadableArray array = getArray(str);
                    0Sd.A00(array);
                    obj = array.toArrayList();
                    break;
            }
            A19.put(str, obj);
        }
        return A19;
    }

    private final Object getNullableValue(String str) {
        return getLocalMap().get(str);
    }

    private final Object getValue(String str) {
        if (hasKey(str)) {
            Object obj = getLocalMap().get(str);
            0Sd.A00(obj);
            0qQ.A07(obj);
            return obj;
        }
        throw new RuntimeException(str);
    }
}
