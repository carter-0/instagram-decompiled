package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.59r  reason: invalid class name and case insensitive filesystem */
public abstract class C2818159r {
    public static final String A04(Map map) {
        0qQ.A0B(map, 0);
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData != null) {
                String A00 = fBPayLoggerData.A00();
                if (!(A00 == null || A00.length() == 0)) {
                    return A00;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return (String) A00(Py7.A01(21, 10, 17), map);
    }

    public static final LinkedHashMap A06(FBPayLoggerData fBPayLoggerData) {
        0qQ.A0B(fBPayLoggerData, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("logger_data", fBPayLoggerData);
        String A00 = fBPayLoggerData.A00();
        if (!(A00 == null || A00.length() == 0)) {
            String A002 = fBPayLoggerData.A00();
            if (A002 != null) {
                linkedHashMap.put(Py7.A00(), A002);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return linkedHashMap;
    }

    public static final String A02(Map map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData != null) {
                String str = fBPayLoggerData.A00;
                if (!(str == null || str.length() == 0)) {
                    return str;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return (String) map.get(AnonymousClass000.A00(1331));
    }

    public static final String A03(Map map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData != null) {
                String str = fBPayLoggerData.A01;
                if (!(str == null || str.length() == 0)) {
                    return str;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return (String) A00("flow_name", map);
    }

    public static final String A05(Map map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData != null) {
                String str = fBPayLoggerData.A04;
                if (!(str == null || str.length() == 0)) {
                    return str;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return (String) map.get("source");
    }

    public static final Object A00(String str, Map map) {
        Object obj = map.get(str);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String A01() {
        String valueOf = String.valueOf(System.currentTimeMillis());
        String obj = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", valueOf, obj);
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
