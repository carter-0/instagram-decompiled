package X;

import android.widget.Toast;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment;
import java.util.HashMap;

public final class P0c implements C74442Pux {
    public final /* synthetic */ DirectIceBreakerSettingFragment A00;

    public P0c(DirectIceBreakerSettingFragment directIceBreakerSettingFragment) {
        this.A00 = directIceBreakerSettingFragment;
    }

    public final void CtL() {
        DirectIceBreakerSettingFragment directIceBreakerSettingFragment = this.A00;
        Toast toast = directIceBreakerSettingFragment.A02;
        if (toast != null) {
            toast.cancel();
            directIceBreakerSettingFragment.A02 = null;
        }
        OVT.A00(directIceBreakerSettingFragment);
        C69863NtR.A00(directIceBreakerSettingFragment.A00, 2131974093);
        C70932OSf oSf = directIceBreakerSettingFragment.A07;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(TraceFieldType.ErrorCode, "TOGGLE_SHOW_QUESTIONS_FOR_RESTART_CHAT_STATUS_REQUEST_FAILURE");
        C70932OSf.A00(oSf, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to toggle icebreaker show questions for restart chat switch button", A1E);
    }

    public final void CtU() {
        DirectIceBreakerSettingFragment directIceBreakerSettingFragment = this.A00;
        directIceBreakerSettingFragment.A02 = C59689JTv.A01(directIceBreakerSettingFragment.A00, (String) null, 2131959389, 1);
        2dZ.A0t.A03(directIceBreakerSettingFragment.A03).EVS(false);
        directIceBreakerSettingFragment.setItems(directIceBreakerSettingFragment.A06.A01());
    }

    public final void CtV() {
        DirectIceBreakerSettingFragment directIceBreakerSettingFragment = this.A00;
        Toast toast = directIceBreakerSettingFragment.A02;
        if (toast != null) {
            toast.cancel();
            directIceBreakerSettingFragment.A02 = null;
        }
        OVT.A00(directIceBreakerSettingFragment);
    }
}
