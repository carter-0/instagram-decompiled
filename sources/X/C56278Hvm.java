package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Hvm  reason: case insensitive filesystem */
public abstract class C56278Hvm {
    public static final void A01(Context context, String str, String str2) {
        0qQ.A0B(str, 1);
        int i = 0;
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = new NineSixteenLayoutConfigImpl(context, false);
        int A00 = nineSixteenLayoutConfigImpl.A00();
        if (!nineSixteenLayoutConfigImpl.A0M) {
            i = (int) (AnonymousClass7TF.A0E(context).density * 70.0f);
        }
        int i2 = A00 + i;
        C310336ap A0X = DbV.A0X();
        A0X.A0H = "magicmod_error_snackbar";
        A0X.A0D = str;
        A0X.A0R = true;
        A0X.A02 = i2;
        A0X.A0I = str2;
        Dbb.A1Q(A0X);
    }

    public static final HLB A00(UserSession userSession) {
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        boolean A1T = AnonymousClass7TF.A1T(A0q.getInt("magic_mod_edit_prompt_nux_seen_count", 0), 3);
        TimeUnit timeUnit = TimeUnit.DAYS;
        boolean A1R = AnonymousClass7TF.A1R(((System.currentTimeMillis() - A0q.getLong("magic_mod_edit_prompt_nux_last_seen_time", 0)) > timeUnit.toMillis(1) ? 1 : ((System.currentTimeMillis() - A0q.getLong("magic_mod_edit_prompt_nux_last_seen_time", 0)) == timeUnit.toMillis(1) ? 0 : -1)));
        if (A1T && A1R) {
            return HLB.EDIT_PROMPT;
        }
        boolean A1T2 = AnonymousClass7TF.A1T(A0q.getInt("magic_mod_feedback_nux_seen_count", 0), 3);
        boolean A1R2 = AnonymousClass7TF.A1R(((System.currentTimeMillis() - A0q.getLong("magic_mod_feedback_nux_last_seen_time", 0)) > timeUnit.toMillis(1) ? 1 : ((System.currentTimeMillis() - A0q.getLong("magic_mod_feedback_nux_last_seen_time", 0)) == timeUnit.toMillis(1) ? 0 : -1)));
        if (!A1T2 || !A1R2) {
            return null;
        }
        return HLB.FEEDBACK;
    }
}
