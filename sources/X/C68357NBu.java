package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.NBu  reason: case insensitive filesystem */
public final class C68357NBu extends C300255wo {
    public final /* synthetic */ UserSession A00;

    public C68357NBu(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        return new C70627ODy(MqttNetworkSessionPlugin.get(), RealtimeClientManager.getInstance(this.A00));
    }
}
