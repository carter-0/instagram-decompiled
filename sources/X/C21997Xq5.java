package X;

import android.os.Message;
import java.util.List;

/* renamed from: X.Xq5  reason: case insensitive filesystem */
public final class C21997Xq5 {
    public Message A00;
    public C22061Xun A01;

    public static void A01(C21997Xq5 xq5) {
        xq5.A00 = null;
        xq5.A01 = null;
        List list = C22061Xun.A01;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(xq5);
            }
        }
    }

    public static void A00(Message message, C21997Xq5 xq5, C22061Xun xun) {
        xq5.A00 = message;
        xq5.A01 = xun;
        message.getClass();
        message.sendToTarget();
        A01(xq5);
    }
}
