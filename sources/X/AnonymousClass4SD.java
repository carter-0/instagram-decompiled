package X;

import android.os.Message;
import java.util.List;

/* renamed from: X.4SD  reason: invalid class name */
public final class AnonymousClass4SD {
    public Message A00;
    public AnonymousClass4S5 A01;

    public static void A00(AnonymousClass4SD r3) {
        r3.A00 = null;
        r3.A01 = null;
        List list = AnonymousClass4S5.A01;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(r3);
            }
        }
    }

    public final void A01() {
        Message message = this.A00;
        message.getClass();
        message.sendToTarget();
        A00(this);
    }
}
