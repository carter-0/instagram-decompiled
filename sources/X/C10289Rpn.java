package X;

import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.utils.CircularEventLog;

/* renamed from: X.Rpn  reason: case insensitive filesystem */
public final class C10289Rpn {
    public final CircularEventLog A00;

    public C10289Rpn(EventBase eventBase, String str) {
        0qQ.A0B(str, 2);
        this.A00 = new CircularEventLog(eventBase, 100);
    }
}
