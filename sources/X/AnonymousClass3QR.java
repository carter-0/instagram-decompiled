package X;

import java.util.HashMap;

/* renamed from: X.3QR  reason: invalid class name */
public final class AnonymousClass3QR {
    public HashMap A00 = new HashMap();

    public final synchronized int A00(Integer num) {
        String str;
        int i;
        if (num.intValue() != 0) {
            str = "FINISH_UPLOAD";
        } else {
            str = "RENDER";
        }
        Integer num2 = (Integer) this.A00.get(str);
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        return i;
    }
}
