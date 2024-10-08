package com.instagram.react.modules.base;

import X.0lg;
import X.0xE;
import X.0xF;
import X.0xI;
import X.C60510iO;
import X.DbU;
import X.QZK;
import com.facebook.fbreact.specs.NativeAnalyticsSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Analytics")
public class IgReactAnalyticsModule extends NativeAnalyticsSpec {
    public static final String MODULE_NAME = "Analytics";
    public final 0lg mSession;

    public String getName() {
        return "Analytics";
    }

    public void logCounter(String str, double d) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r3.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r3.A00.add(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.0xE obtainExtraArray(com.facebook.react.bridge.ReadableArray r4) {
        /*
            X.0xE r3 = new X.0xE
            r3.<init>()
            r2 = 0
        L_0x0006:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0054
            com.facebook.react.bridge.ReadableType r0 = r4.getType(r2)
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0043;
                case 2: goto L_0x003b;
                case 3: goto L_0x0036;
                case 4: goto L_0x0028;
                case 5: goto L_0x001f;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.String r1 = "Unknown data type"
            X.TQP r0 = new X.TQP
            r0.<init>(r1)
            throw r0
        L_0x001f:
            com.facebook.react.bridge.ReadableArray r0 = r4.getArray(r2)
            X.0xE r1 = obtainExtraArray(r0)
            goto L_0x0030
        L_0x0028:
            com.facebook.react.bridge.ReadableMap r0 = r4.getMap(r2)
            X.0xF r1 = obtainExtraBundle(r0)
        L_0x0030:
            java.util.ArrayList r0 = r3.A00
            r0.add(r1)
            goto L_0x0051
        L_0x0036:
            java.lang.String r0 = r4.getString(r2)
            goto L_0x004e
        L_0x003b:
            double r0 = r4.getDouble(r2)
            r3.A00(r0)
            goto L_0x0051
        L_0x0043:
            boolean r0 = r4.getBoolean(r2)
            r3.A05(r0)
            goto L_0x0051
        L_0x004b:
            java.lang.String r0 = "null"
        L_0x004e:
            r3.A04(r0)
        L_0x0051:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.base.IgReactAnalyticsModule.obtainExtraArray(com.facebook.react.bridge.ReadableArray):X.0xE");
    }

    public IgReactAnalyticsModule(QZK qzk, 0lg r2) {
        super(qzk);
        this.mSession = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        return r1.A02(r2.mSession).A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        return X.0xI.A01(r3, new X.T68(r2, r4).getModuleName());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.0xI getAnalyticsEvent(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1581452433: goto L_0x0015;
                case 963638032: goto L_0x0024;
                case 1229418656: goto L_0x0030;
                case 1326426600: goto L_0x003c;
                case 1491939820: goto L_0x0048;
                case 1514698072: goto L_0x0057;
                case 1671672458: goto L_0x0063;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.T68 r0 = new X.T68
            r0.<init>(r2, r4)
            java.lang.String r0 = r0.getModuleName()
            X.0xI r0 = X.0xI.A01(r3, r0)
            return r0
        L_0x0015:
            r0 = 4100(0x1004, float:5.745E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1Q0 r1 = X.1Q0.A0R
            goto L_0x006d
        L_0x0024:
            java.lang.String r0 = "resend_tapped"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1Q0 r1 = X.1Q0.A0P
            goto L_0x006d
        L_0x0030:
            java.lang.String r0 = "next_blocked"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1Q0 r1 = X.1Q0.A0M
            goto L_0x006d
        L_0x003c:
            java.lang.String r0 = "resend_blocked"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1Q0 r1 = X.1Q0.A0O
            goto L_0x006d
        L_0x0048:
            r0 = 1840(0x730, float:2.578E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1Q0 r1 = X.1Q0.A0Q
            goto L_0x006d
        L_0x0057:
            java.lang.String r0 = "next_tapped"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1Q0 r1 = X.1Q0.A0N
            goto L_0x006d
        L_0x0063:
            java.lang.String r0 = "dismiss"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1Q0 r1 = X.1Q0.A0L
        L_0x006d:
            X.0lg r0 = r2.mSession
            X.FGI r0 = r1.A02(r0)
            X.0xI r0 = r0.A04()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.base.IgReactAnalyticsModule.getAnalyticsEvent(java.lang.String, java.lang.String):X.0xI");
    }

    public static 0xF obtainExtraBundle(ReadableMap readableMap) {
        0xE r0;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        0xF r3 = new 0xF();
        while (keySetIterator.CKI()) {
            String Crc = keySetIterator.Crc();
            switch (readableMap.getType(Crc).ordinal()) {
                case 0:
                    r0 = "null";
                    break;
                case 1:
                    r0 = Boolean.valueOf(readableMap.getBoolean(Crc));
                    break;
                case 2:
                    r0 = Double.valueOf(readableMap.getDouble(Crc));
                    break;
                case 3:
                    r0 = readableMap.getString(Crc);
                    break;
                case 4:
                    r0 = obtainExtraBundle(readableMap.getMap(Crc));
                    break;
                case 5:
                    r0 = obtainExtraArray(readableMap.getArray(Crc));
                    break;
                default:
                    throw new RuntimeException("Unknown data type");
            }
            0xF.A00(r3, r0, Crc);
        }
        return r3;
    }

    public static void setDataAsExtra(0xI r4, ReadableMap readableMap) {
        String str;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.CKI()) {
            String Crc = keySetIterator.Crc();
            switch (readableMap.getType(Crc).ordinal()) {
                case 0:
                    str = "null";
                    break;
                case 1:
                    r4.A09(Crc, Boolean.valueOf(readableMap.getBoolean(Crc)));
                    continue;
                case 2:
                    r4.A0A(Crc, Double.valueOf(readableMap.getDouble(Crc)));
                    continue;
                case 3:
                    str = readableMap.getString(Crc);
                    break;
                case 4:
                    r4.A05(obtainExtraBundle(readableMap.getMap(Crc)), Crc);
                    continue;
                case 5:
                    r4.A06(obtainExtraArray(readableMap.getArray(Crc)), Crc);
                    continue;
                default:
                    throw new RuntimeException("Unknown data type");
            }
            r4.A0C(Crc, str);
        }
    }

    public void logEvent(String str, ReadableMap readableMap, String str2) {
        0xI analyticsEvent = getAnalyticsEvent(str, str2);
        setDataAsExtra(analyticsEvent, readableMap);
        DbU.A1R(analyticsEvent, this.mSession);
    }

    public void logRealtimeEvent(String str, ReadableMap readableMap, String str2) {
        0xI analyticsEvent = getAnalyticsEvent(str, str2);
        setDataAsExtra(analyticsEvent, readableMap);
        C60510iO.A00(this.mSession).EHF(analyticsEvent);
    }
}
