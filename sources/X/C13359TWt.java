package X;

import java.util.Map;

/* renamed from: X.TWt  reason: case insensitive filesystem */
public final class C13359TWt extends 0Yg implements 0sP {
    public static final C13359TWt A00 = new C13359TWt();

    public C13359TWt() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        StackTraceElement stackTraceElement;
        String str;
        Map map = (Map) obj;
        0qQ.A0B(map, 0);
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String className = stackTrace[i2].getClassName();
            Map map2 = 0Yh.A03;
            if (className.equals(0q1.A00(C251343mx.class))) {
                i = C229632nm.A03(i2 - 2, 0, length - 1);
            }
        }
        if (i == 0 || i == length - 1) {
            stackTraceElement = null;
        } else {
            stackTraceElement = stackTrace[i];
        }
        if (stackTraceElement != null) {
            str = stackTraceElement.getClassName();
        } else {
            str = null;
        }
        if (str == null) {
            str = "nothing";
        }
        String A0g = 002.A0g("<cls>", str, "</cls>");
        map.put("isSpec", false);
        map.put("component", A0g);
        StringBuilder A0n = AnonymousClass7TF.A0n(A0g);
        A0n.append(':');
        Object obj2 = "nothing";
        if (stackTraceElement != null) {
            obj2 = Integer.valueOf(stackTraceElement.getLineNumber());
        }
        map.put("location", AnonymousClass7TF.A0i(obj2, A0n));
        return C60340gF.A00;
    }
}
