package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;

/* renamed from: X.Pom  reason: case insensitive filesystem */
public final class C74083Pom extends 0Yg implements 0sP {
    public static final C74083Pom A00 = new C74083Pom();

    public C74083Pom() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass45Y nbp;
        AnonymousClass46J r4 = (AnonymousClass46J) obj;
        0qQ.A0B(r4, 0);
        int intValue = r4.A00.intValue();
        if (intValue != 1) {
            MqttNetworkSessionPlugin mqttNetworkSessionPlugin = MqttNetworkSessionPlugin.get();
            if (intValue != 0) {
                nbp = new NBQ(mqttNetworkSessionPlugin);
            } else {
                nbp = new NBO(mqttNetworkSessionPlugin);
            }
        } else {
            nbp = new NBP(MqttNetworkSessionPlugin.get());
        }
        Execution.executeAsync(nbp, (AccountSession) null, 3);
        return C60340gF.A00;
    }
}
