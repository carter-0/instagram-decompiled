package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SpM  reason: case insensitive filesystem */
public final class C12219SpM implements ReadableArray, C13947Tm7 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00.equals(((C12219SpM) obj).A00));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r1.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        r6.A00.add(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C12219SpM A00(com.facebook.react.bridge.ReadableArray r7) {
        /*
            X.SpM r6 = new X.SpM
            r6.<init>()
            int r5 = r7.size()
            r4 = 0
        L_0x000a:
            if (r4 >= r5) goto L_0x0056
            com.facebook.react.bridge.ReadableType r0 = r7.getType(r4)
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x001a;
                case 1: goto L_0x0048;
                case 2: goto L_0x003d;
                case 3: goto L_0x0033;
                case 4: goto L_0x002a;
                case 5: goto L_0x0021;
                default: goto L_0x0017;
            }
        L_0x0017:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x001a:
            java.util.List r1 = r6.A00
            r0 = 0
            r1.add(r0)
            goto L_0x0017
        L_0x0021:
            com.facebook.react.bridge.ReadableArray r0 = r7.getArray(r4)
            X.SpM r1 = A00(r0)
            goto L_0x0037
        L_0x002a:
            com.facebook.react.bridge.ReadableMap r0 = r7.getMap(r4)
            X.SpN r1 = X.C12220SpN.A00(r0)
            goto L_0x0037
        L_0x0033:
            java.lang.String r1 = r7.getString(r4)
        L_0x0037:
            java.util.List r0 = r6.A00
            r0.add(r1)
            goto L_0x0017
        L_0x003d:
            double r2 = r7.getDouble(r4)
            java.util.List r1 = r6.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            goto L_0x0052
        L_0x0048:
            boolean r0 = r7.getBoolean(r4)
            java.util.List r1 = r6.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0052:
            r1.add(r0)
            goto L_0x0017
        L_0x0056:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12219SpM.A00(com.facebook.react.bridge.ReadableArray):X.SpM");
    }

    public final ReadableArray getArray(int i) {
        return (ReadableArray) this.A00.get(i);
    }

    public final boolean getBoolean(int i) {
        return AnonymousClass7TE.A1a(this.A00.get(i));
    }

    public final double getDouble(int i) {
        return JTO.A00(this.A00.get(i));
    }

    public final int getInt(int i) {
        return C51971G9r.A0I(this.A00, i);
    }

    public final ReadableMap getMap(int i) {
        return (ReadableMap) this.A00.get(i);
    }

    public final String getString(int i) {
        return AnonymousClass7TE.A19(this.A00, i);
    }

    public final ReadableType getType(int i) {
        Object obj = this.A00.get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        return null;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final boolean isNull(int i) {
        return DbW.A1a(this.A00.get(i));
    }

    public final void pushInt(int i) {
        this.A00.add(new Double((double) i));
    }

    public final int size() {
        return this.A00.size();
    }

    public final ArrayList toArrayList() {
        return AnonymousClass7TE.A1D(this.A00);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C12219SpM(List list) {
        this.A00 = AnonymousClass7TE.A1D(list);
    }

    public C12219SpM() {
        this.A00 = AnonymousClass7TE.A1C();
    }
}
