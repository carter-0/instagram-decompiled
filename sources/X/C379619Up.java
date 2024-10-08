package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.9Up  reason: invalid class name and case insensitive filesystem */
public final class C379619Up {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;

    public C379619Up(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        this.A00 = bool;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
        this.A04 = num4;
        this.A05 = str;
    }

    public final String A00() {
        String str;
        HashMap A1E = AnonymousClass7TE.A1E();
        Boolean bool = this.A00;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A1E.put("is_prefetch", str);
        }
        Integer num = this.A01;
        if (num != null) {
            A1E.put("ad_position", num.toString());
        }
        Integer num2 = this.A02;
        if (num2 != null) {
            A1E.put("index_of_card", num2.toString());
        }
        Integer num3 = this.A03;
        if (num3 != null) {
            A1E.put("number_of_cards", num3.toString());
        }
        Integer num4 = this.A04;
        if (num4 != null) {
            A1E.put("opt_in_index", num4.toString());
        }
        String str2 = this.A05;
        if (str2 != null) {
            A1E.put("module", str2);
        }
        String obj = new JSONObject(A1E).toString();
        0qQ.A07(obj);
        return obj;
    }
}
