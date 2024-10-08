package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.NoSuchElementException;

/* renamed from: X.B3y  reason: case insensitive filesystem */
public final /* synthetic */ class C41855B3y implements AnonymousClass2Kv {
    public final /* synthetic */ 1zJ A00;

    public /* synthetic */ C41855B3y(1zJ r1) {
        this.A00 = r1;
    }

    public static void A00(C250663lr r6, 1zJ r7) {
        String requiredStringField = r6.getRequiredStringField(2, TraceFieldType.BroadcastId);
        r6.getRequiredStringField(1, "notifier_id");
        r6.getRequiredTreeField(4, "notification_metadata", C43030Bqu.class, -1464520935).getOptionalStringField(0, "chat_id");
        AnonymousClass1Nd.A00(r7.A01).A00(new C62162KbK(requiredStringField));
    }

    public final void invoke(AnonymousClass3JD r10) {
        Object Bny;
        String str;
        1zJ r6 = this.A00;
        if (r10 != null && (Bny = r10.Bny()) != null) {
            C43031Bqv bqv = (C43031Bqv) ((C250663lr) Bny).getRequiredTreeField(0, "xdt_live_notify_subscribe(input:$input)", C43031Bqv.class, -2102915157);
            String requiredStringField = bqv.getRequiredStringField(3, "notification_type");
            0qQ.A0B(requiredStringField, 0);
            for (Integer num : AnonymousClass05K.A00(2)) {
                if (1 - num.intValue() != 0) {
                    str = "live_chat_invite";
                } else {
                    str = "legacy_inapp";
                }
                if (requiredStringField.equals(str)) {
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        A00(bqv, r6);
                    } else if (intValue == 1) {
                        11Z.A02(new C45989DHs(r6, bqv));
                    }
                    if (num == AnonymousClass05K.A00) {
                        A00(bqv, r6);
                        return;
                    }
                    return;
                }
            }
            throw new NoSuchElementException(C273654mx.A00(5));
        }
    }
}
