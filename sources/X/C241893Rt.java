package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.ArrayList;

/* renamed from: X.3Rt  reason: invalid class name and case insensitive filesystem */
public final class C241893Rt extends ArrayList<SubscribeTopic> {
    public C241893Rt() {
        add(new SubscribeTopic("/fbns_reg_resp", 1));
        addAll(FbnsServiceDelegate.A0E);
    }
}
