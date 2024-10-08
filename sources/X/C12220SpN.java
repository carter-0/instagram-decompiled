package X;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SpN  reason: case insensitive filesystem */
public final class C12220SpN implements ReadableMap, C13948Tm8 {
    public final Map A00 = AnonymousClass7TE.A1E();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                Map map = this.A00;
                Map map2 = ((C12220SpN) obj).A00;
                if (map != null) {
                    if (!map.equals(map2)) {
                        return false;
                    }
                } else if (map2 != null) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C12220SpN A00(ReadableMap readableMap) {
        Map map;
        Boolean bool;
        C12220SpN spN = new C12220SpN();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.CKI()) {
            String Crc = keySetIterator.Crc();
            switch (readableMap.getType(Crc).ordinal()) {
                case 0:
                    map = spN.A00;
                    bool = null;
                    break;
                case 1:
                    boolean z = readableMap.getBoolean(Crc);
                    map = spN.A00;
                    bool = Boolean.valueOf(z);
                    break;
                case 2:
                    spN.putDouble(Crc, readableMap.getDouble(Crc));
                    continue;
                case 3:
                    spN.putString(Crc, readableMap.getString(Crc));
                    continue;
                case 4:
                    spN.putMap(Crc, A00(readableMap.getMap(Crc)));
                    continue;
                case 5:
                    spN.putArray(Crc, C12219SpM.A00(readableMap.getArray(Crc)));
                    continue;
            }
            map.put(Crc, bool);
        }
        return spN;
    }

    public final void A01(String str, int i) {
        this.A00.put(str, new Double((double) i));
    }

    public final C13948Tm8 copy() {
        C12220SpN spN = new C12220SpN();
        spN.A00.putAll(this.A00);
        return spN;
    }

    public final ReadableArray getArray(String str) {
        return (ReadableArray) this.A00.get(str);
    }

    public final boolean getBoolean(String str) {
        return AnonymousClass7TE.A1a(this.A00.get(str));
    }

    public final double getDouble(String str) {
        return JTO.A00(this.A00.get(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.SpC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.SpC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.SpC} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.react.bridge.Dynamic getDynamic(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.ThreadLocal r0 = X.C12212SpC.A02
            java.lang.Object r0 = r0.get()
            X.0vW r0 = (X.0vW) r0
            java.lang.Object r0 = r0.A7A()
            X.SpC r0 = (X.C12212SpC) r0
            if (r0 != 0) goto L_0x0015
            X.SpC r0 = new X.SpC
            r0.<init>()
        L_0x0015:
            r0.A00 = r1
            r0.A01 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12220SpN.getDynamic(java.lang.String):com.facebook.react.bridge.Dynamic");
    }

    public final Iterator getEntryIterator() {
        return AnonymousClass7TF.A0u(this.A00);
    }

    public final int getInt(String str) {
        return Pxg.A06(str, this.A00);
    }

    public final ReadableMap getMap(String str) {
        return (ReadableMap) this.A00.get(str);
    }

    public final String getString(String str) {
        return DbT.A11(str, this.A00);
    }

    public final ReadableType getType(String str) {
        Object obj = this.A00.get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof Dynamic) {
            return ((Dynamic) obj).getType();
        }
        throw AnonymousClass7TE.A0w(002.A11("Invalid value ", obj.toString(), " for key ", str, "contained in JavaOnlyMap"));
    }

    public final boolean hasKey(String str) {
        return this.A00.containsKey(str);
    }

    public final int hashCode() {
        Map map = this.A00;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final boolean isNull(String str) {
        return DbW.A1a(this.A00.get(str));
    }

    public final ReadableMapKeySetIterator keySetIterator() {
        return new C12221SpO(this);
    }

    public final void putArray(String str, ReadableArray readableArray) {
        this.A00.put(str, readableArray);
    }

    public final void putDouble(String str, double d) {
        this.A00.put(str, Double.valueOf(d));
    }

    public final void putMap(String str, ReadableMap readableMap) {
        this.A00.put(str, readableMap);
    }

    public final void putString(String str, String str2) {
        this.A00.put(str, str2);
    }

    public final HashMap toHashMap() {
        return Pxe.A19(this.A00);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C12220SpN(Object... objArr) {
        Double d = objArr[1];
        this.A00.put(objArr[0], d instanceof Number ? Double.valueOf(JTO.A00(d)) : d);
    }

    public C12220SpN() {
    }
}
