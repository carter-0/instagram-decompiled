package X;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

public final class NgO extends C47518E6c {
    public static final String __redex_internal_original_name = "DirectThreadReminderBottomSheetFragment";
    public OVO A00;
    public DirectThreadKey A01;
    public Integer A02;
    public UserSession A03;

    public final String getModuleName() {
        return "direct_thread_reminder_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        FGF fgf = new FGF(2131959566);
        fgf.A06 = true;
        List A1P = 0sr.A1P(new C70953OTa[]{new C70953OTa("HOUR_ONE", C66583MXo.A07(this, fgf, A1C).getString(2131959569)), new C70953OTa("HOUR_SIX", requireContext().getString(2131959570)), new C70953OTa("CUSTOM", requireContext().getString(2131959571))});
        Integer num = this.A02;
        if (num == null) {
            0qQ.A0F("preSelectedOption");
            throw AnonymousClass00P.createAndThrow();
        }
        C70962OTj oTj = new C70962OTj((RadioGroup.OnCheckedChangeListener) null, C70149Ny3.A00(num), A1P);
        O8B o8b = new O8B(this);
        for (C70953OTa oTa : oTj.A05) {
            oTa.A00 = new C71399Ojy(35, o8b, oTa, oTj);
        }
        A1C.add(oTj);
        setBottomSheetMenuItems(A1C);
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1605375110);
        super.onCreate(bundle);
        this.A03 = DbX.A0V(this);
        AnonymousClass0fD.A09(1023978659, A022);
    }
}
