package X;

import android.view.View;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;

public final class IVN implements MVB {
    public final /* synthetic */ C228472lj A00;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVN(C228472lj r1) {
        this.A00 = r1;
    }

    public final void onButtonClick(View view) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put(AnonymousClass000.A00(3456), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        C228472lj r2 = this.A00;
        r2.A0n.A0A().A0w().A03(true);
        r2.A0A(1FI.A0J, (String) null, A1H);
    }
}
