package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.EglBase14Impl;

/* renamed from: X.3RV  reason: invalid class name */
public final class AnonymousClass3RV {
    public static final AnonymousClass3RV A00 = new Object();
    public static final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public final AnonymousClass45J A00(Context context, String str) {
        0qQ.A0B(context, 0);
        0qQ.A0B(str, 1);
        ConcurrentHashMap concurrentHashMap = A01;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            boolean z = false;
            if (00p.A0k(str, "rti.mqtt.", false)) {
                Integer[] A002 = AnonymousClass05K.A00(19);
                int length = A002.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Integer num = A002[i];
                    if (0qQ.A0K(AnonymousClass45C.A00(num), 00l.A0F("rti.mqtt.", str))) {
                        switch (num.intValue()) {
                            case 1:
                            case 2:
                            case 4:
                            case 5:
                            case 17:
                            case EglBase14Impl.EGLExt_SDK_VERSION:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                    } else {
                        i++;
                    }
                }
            }
            AnonymousClass45I r1 = new AnonymousClass45I(context, str, z);
            obj = concurrentHashMap.putIfAbsent(str, r1);
            if (obj == null) {
                obj = r1;
            }
        }
        return (AnonymousClass45J) obj;
    }
}
