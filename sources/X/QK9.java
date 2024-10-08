package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.Map;
import java.util.Set;

public final class QK9 extends SJP {
    public final C270254gR A00;
    public final S0G A01;

    public final void A05(Context context, Bundle bundle, C13703TfM tfM, C59533JNf jNf, C10996S4q s4q, C11288SJh sJh, AutofillData autofillData, Integer num, Map map) {
        Context context2 = context;
        C11288SJh sJh2 = sJh;
        DbW.A1O(context2, 0, sJh2);
        String A0n = C51972G9s.A0n();
        C270254gR r2 = this.A00;
        C11290SJq sJq = r2.A01;
        Integer num2 = AnonymousClass05K.A00;
        Bundle bundle2 = bundle;
        sJq.A03(bundle2, num2, "CONTACT_SAVE", A0n);
        S7D s7d = new S7D(r2);
        s7d.A01(AnonymousClass05K.A01, num2, A0n);
        s7d.A00();
        long j = SandboxRepository.CACHE_TTL;
        Set A02 = A02();
        s7d.A03(A02);
        UserSession userSession = r2.A04.A00;
        0Tu r9 = 0Tu.A05;
        if (182.A06(r9, userSession, 36322860548500055L) || !DbY.A1Z(r9, userSession, 36322860548958814L) || !A02.isEmpty()) {
            if (!182.A06(r9, userSession, 36322860548500055L) && DbY.A1Z(r9, userSession, 36322860548827740L)) {
                j = 0;
            }
            AutofillData autofillData2 = autofillData;
            C59533JNf jNf2 = jNf;
            C10996S4q s4q2 = s4q;
            Integer num3 = num;
            Map map2 = map;
            Set set = A02;
            Bundle bundle3 = bundle2;
            Context context3 = context2;
            S7D s7d2 = s7d;
            C11290SJq sJq2 = sJq;
            1TZ.A00().execute(new C20126Wlm(context2, new C13285TTe(sJh2, num3, this, s4q2, C11384SQx.A02(autofillData2), map2, context3, jNf2, s7d2, sJq2, C9915RjU.A00.A03(autofillData2), set, bundle3, tfM, A0n, 0, j)));
            return;
        }
        s7d.A02(AnonymousClass7TF.A0w("no_prompt_reason", "bloks_prompt_not_cached"));
        s7d.A04(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QK9(C270254gR r1, S0G s0g) {
        super(s0g);
        AnonymousClass7TG.A1O(r1, s0g);
        this.A00 = r1;
        this.A01 = s0g;
    }
}
