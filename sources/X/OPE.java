package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;

public abstract class OPE {
    public static final NJH A00(UserSession userSession, C69309NjA njA, C74314Psq psq, Integer num, String str, String str2, boolean z) {
        NJH njh = new NJH();
        Bundle A0F = JTP.A0F(userSession);
        A0F.putBoolean("arg_is_creator", z);
        A0F.putString(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, str);
        A0F.putString("direct_thread_key_v2", str2);
        A0F.putInt("direct_thread_audience_type", AnonymousClass7TG.A0A(num));
        if (njA != null) {
            A0F.putSerializable("prompts_entry_point", njA);
        }
        njh.setArguments(A0F);
        njh.A00 = psq;
        return njh;
    }

    public static final boolean A01(UserSession userSession, AnonymousClass2Ep r9, 2Dm r10, String str) {
        boolean A1Z = C66581MXm.A1Z(r10);
        if (r9 == null) {
            return false;
        }
        DirectThreadKey BJy = r9.BJy();
        String C6C = r9.C6C();
        if (C6C == null) {
            return A1Z;
        }
        if (AnonymousClass7TE.A0q(userSession).getBoolean("broadcast_channel_challenges_nux", A1Z) || !AnonymousClass9HV.A00(userSession).A00(C66580MXl.A0g(C6C), 22)) {
            return false;
        }
        if (str != null && str.equals("inbox_new_broadcast_chat")) {
            return false;
        }
        C242243Te A0b = C66580MXl.A0b(r9);
        if (A0b == null || !A0b.A0H) {
            Iterator it = r10.Aax(BJy, A1Z).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C254703su r2 = (C254703su) next;
                if (r2.A10 != 2FW.A0G && C51966G9m.A1W(userSession, r2.A1u)) {
                    if (next != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}
