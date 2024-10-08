package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.QYf  reason: case insensitive filesystem */
public final class C7820QYf extends SIU {
    public final C11404SSb A00;
    public final C12220SpN A01;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r6.A00.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        r1 = r6.A00;
        r0 = java.lang.Double.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        r1.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r5 = r5 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C12219SpM A00(com.facebook.react.bridge.ReadableArray r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0004
            r6 = 0
        L_0x0003:
            return r6
        L_0x0004:
            X.SpM r6 = new X.SpM
            r6.<init>()
            r5 = 0
            int r4 = r8.size()
        L_0x000e:
            if (r5 >= r4) goto L_0x0003
            com.facebook.react.bridge.ReadableType r0 = r8.getType(r5)
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x009e;
                case 2: goto L_0x0093;
                case 3: goto L_0x0089;
                case 4: goto L_0x002e;
                case 5: goto L_0x0025;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r5 = r5 + 1
            goto L_0x000e
        L_0x001e:
            java.util.List r1 = r6.A00
            r0 = 0
            r1.add(r0)
            goto L_0x001b
        L_0x0025:
            com.facebook.react.bridge.ReadableArray r0 = r8.getArray(r5)
            X.SpM r1 = r7.A00(r0)
            goto L_0x008d
        L_0x002e:
            com.facebook.react.bridge.ReadableMap r3 = r8.getMap(r5)
            java.lang.String r2 = "nodeTag"
            boolean r0 = r3.hasKey(r2)
            if (r0 == 0) goto L_0x0080
            com.facebook.react.bridge.ReadableType r1 = r3.getType(r2)
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            if (r1 != r0) goto L_0x0080
            X.SSb r1 = r7.A00
            int r0 = r3.getInt(r2)
            X.SIU r2 = X.C11404SSb.A00(r1, r0)
            if (r2 == 0) goto L_0x00ad
            boolean r0 = r2 instanceof X.QYz
            if (r0 == 0) goto L_0x006c
            X.QYz r2 = (X.QYz) r2
            boolean r0 = r2 instanceof X.QYy
            if (r0 == 0) goto L_0x006a
            r0 = r2
            X.QYy r0 = (X.QYy) r0
            java.lang.Object r1 = r0.A02
        L_0x005e:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0077
            int r0 = X.AnonymousClass7TE.A0M(r1)
        L_0x0066:
            r6.pushInt(r0)
            goto L_0x001b
        L_0x006a:
            r1 = 0
            goto L_0x005e
        L_0x006c:
            boolean r0 = r2 instanceof X.C7819QYe
            if (r0 == 0) goto L_0x001b
            X.QYe r2 = (X.C7819QYe) r2
            int r0 = r2.A05()
            goto L_0x0066
        L_0x0077:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L_0x008d
            double r2 = r2.A05()
            goto L_0x0097
        L_0x0080:
            com.facebook.react.bridge.ReadableMap r0 = r8.getMap(r5)
            X.SpN r1 = r7.A01(r0)
            goto L_0x008d
        L_0x0089:
            java.lang.String r1 = r8.getString(r5)
        L_0x008d:
            java.util.List r0 = r6.A00
            r0.add(r1)
            goto L_0x001b
        L_0x0093:
            double r2 = r8.getDouble(r5)
        L_0x0097:
            java.util.List r1 = r6.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            goto L_0x00a8
        L_0x009e:
            boolean r0 = r8.getBoolean(r5)
            java.util.List r1 = r6.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00a8:
            r1.add(r0)
            goto L_0x001b
        L_0x00ad:
            java.lang.String r0 = "Mapped value node does not exist"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7820QYf.A00(com.facebook.react.bridge.ReadableArray):X.SpM");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        r3.putString(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        r3.putDouble(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r1.put(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C12220SpN A01(com.facebook.react.bridge.ReadableMap r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0004
            r3 = 0
        L_0x0003:
            return r3
        L_0x0004:
            X.SpN r3 = new X.SpN
            r3.<init>()
            com.facebook.react.bridge.ReadableMapKeySetIterator r6 = r8.keySetIterator()
        L_0x000d:
            boolean r0 = r6.CKI()
            if (r0 == 0) goto L_0x0003
            java.lang.String r2 = r6.Crc()
            com.facebook.react.bridge.ReadableType r0 = r8.getType(r2)
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x00a6;
                case 2: goto L_0x009d;
                case 3: goto L_0x0094;
                case 4: goto L_0x0034;
                case 5: goto L_0x0028;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x000d
        L_0x0023:
            java.util.Map r1 = r3.A00
            r0 = 0
            goto L_0x00b0
        L_0x0028:
            com.facebook.react.bridge.ReadableArray r0 = r8.getArray(r2)
            X.SpM r0 = r7.A00(r0)
            r3.putArray(r2, r0)
            goto L_0x000d
        L_0x0034:
            com.facebook.react.bridge.ReadableMap r5 = r8.getMap(r2)
            if (r5 == 0) goto L_0x008b
            java.lang.String r4 = "nodeTag"
            boolean r0 = r5.hasKey(r4)
            if (r0 == 0) goto L_0x008b
            com.facebook.react.bridge.ReadableType r1 = r5.getType(r4)
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            if (r1 != r0) goto L_0x008b
            X.SSb r1 = r7.A00
            int r0 = r5.getInt(r4)
            X.SIU r4 = X.C11404SSb.A00(r1, r0)
            if (r4 == 0) goto L_0x00b5
            boolean r0 = r4 instanceof X.QYz
            if (r0 == 0) goto L_0x0074
            X.QYz r4 = (X.QYz) r4
            boolean r0 = r4 instanceof X.QYy
            if (r0 == 0) goto L_0x0072
            r0 = r4
            X.QYy r0 = (X.QYy) r0
            java.lang.Object r1 = r0.A02
        L_0x0066:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x007f
            int r0 = X.AnonymousClass7TE.A0M(r1)
        L_0x006e:
            r3.A01(r2, r0)
            goto L_0x000d
        L_0x0072:
            r1 = 0
            goto L_0x0066
        L_0x0074:
            boolean r0 = r4 instanceof X.C7819QYe
            if (r0 == 0) goto L_0x000d
            X.QYe r4 = (X.C7819QYe) r4
            int r0 = r4.A05()
            goto L_0x006e
        L_0x007f:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0086
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0098
        L_0x0086:
            double r0 = r4.A05()
            goto L_0x00a1
        L_0x008b:
            X.SpN r0 = r7.A01(r5)
            r3.putMap(r2, r0)
            goto L_0x000d
        L_0x0094:
            java.lang.String r1 = r8.getString(r2)
        L_0x0098:
            r3.putString(r2, r1)
            goto L_0x000d
        L_0x009d:
            double r0 = r8.getDouble(r2)
        L_0x00a1:
            r3.putDouble(r2, r0)
            goto L_0x000d
        L_0x00a6:
            boolean r0 = r8.getBoolean(r2)
            java.util.Map r1 = r3.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00b0:
            r1.put(r2, r0)
            goto L_0x000d
        L_0x00b5:
            java.lang.String r0 = "Mapped value node does not exist"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7820QYf.A01(com.facebook.react.bridge.ReadableMap):X.SpN");
    }

    public C7820QYf(C11404SSb sSb, ReadableMap readableMap) {
        this.A00 = sSb;
        this.A01 = C12220SpN.A00(readableMap);
    }

    public final String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "ObjectAnimatedNode[", A1A);
        A1A.append("]: mConfig: ");
        return AnonymousClass7TF.A0i(this.A01, A1A);
    }

    public final void A05(C12220SpN spN, String str) {
        AnonymousClass7TG.A1N(str, spN);
        C12220SpN spN2 = this.A01;
        ReadableType type = spN2.getType(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        0qQ.A07(type);
        if (type == ReadableType.Map) {
            spN.putMap(str, A01(spN2.getMap(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
        } else if (type == ReadableType.Array) {
            spN.putArray(str, A00(spN2.getArray(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
        } else {
            throw AnonymousClass7TE.A0w("Invalid value type for ObjectAnimatedNode");
        }
    }
}
