package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class WGG implements X5r {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ W3O A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public WGG(W3O w3o, String str, String str2, int i, long j) {
        this.A02 = w3o;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void Dos(Bundle bundle, Object obj) {
        String Bsy = ((X2L) obj).ArF().Bsy();
        boolean equalsIgnoreCase = Bsy.equalsIgnoreCase("on");
        W3O w3o = this.A02;
        C18038VkM vkM = w3o.A0V;
        UserSession userSession = vkM.A01;
        1Au.A00(userSession).A1B(equalsIgnoreCase);
        Bundle bundle2 = new Bundle();
        bundle2.putString("client_ccu_enabled", this.A03);
        bundle2.putString("server_ccu_enabled", Bsy);
        String str = this.A04;
        bundle2.putString("source", str);
        for (WGM wgm : w3o.A0Q.A00) {
            C17968Vj2 A002 = wgm.A00.A00("ccu_setting_enable_disable_event");
            String string = bundle2.getString("client_ccu_enabled");
            0xI r0 = A002.A00;
            r0.A0C("client_ccu_enabled", string);
            C13988Tno.A0y(bundle2, r0, "server_ccu_enabled");
            C13988Tno.A0y(bundle2, r0, "source");
            A002.A00();
        }
        if ("remote_setting_migration".equalsIgnoreCase(str)) {
            DbX.A1T(vkM.A02.AR4(), userSession.A06, "user_remote_setting_migration_completed", true);
            w3o.A09(this.A01);
        }
        if ("ccu_background_ping".equalsIgnoreCase(str)) {
            DbX.A1T(vkM.A02.AR4(), userSession.A06, "ccu_setting_synced_with_server", true);
        }
    }

    public final void onFailure(Throwable th) {
        int i;
        String str = this.A03;
        if ("off".equalsIgnoreCase(str)) {
            if (AnonymousClass000.A00(1917).equalsIgnoreCase(this.A04)) {
                1Au.A00(this.A02.A0V.A01).A1B(true);
            }
        }
        String str2 = this.A04;
        if ("remote_setting_migration".equalsIgnoreCase(str2) && (i = this.A00) > 0) {
            this.A02.A08(i - 1, str2, str, this.A01);
        }
        Bundle bundle = new Bundle();
        bundle.putString("client_ccu_enabled", str);
        bundle.putString("source", str2);
        bundle.putString("failure_message", th.getMessage());
        W3O w3o = this.A02;
        WGM wgm = w3o.A0R;
        String message = th.getMessage();
        C18038VkM vkM = w3o.A0V;
        String valueOf = String.valueOf(vkM.A02.getBoolean(002.A0R(vkM.A01.A06, "user_remote_setting_migration_completed"), false));
        if (str2.equals("remote_setting_migration")) {
            C17968Vj2 A002 = wgm.A00.A00("ccu_setting_migration_failure_event");
            if (message != null) {
                A002.A00.A0C("error_message", message);
            }
            0xI r1 = A002.A00;
            r1.A0C("client_setting_status", str);
            r1.A0C("migration_status", valueOf);
            A002.A00();
        }
        for (WGM wgm2 : w3o.A0Q.A00) {
            C17968Vj2 A003 = wgm2.A00.A00("ccu_setting_failed_event");
            String string = bundle.getString("client_ccu_enabled");
            0xI r0 = A003.A00;
            r0.A0C("client_ccu_enabled", string);
            C13988Tno.A0y(bundle, r0, "source");
            C13988Tno.A0y(bundle, r0, "failure_message");
            A003.A00();
        }
    }
}
