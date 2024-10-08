package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.6tf  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C321156tf {
    public static AnonymousClass6M4 A00(Context context, C321026tS r3) {
        0qQ.A0B(context, 1);
        return A01(context, r3, AnonymousClass05K.A0N, AnonymousClass05K.A01);
    }

    public static AnonymousClass6M4 A01(Context context, C321026tS r8, Integer num, Integer num2) {
        int i;
        0qQ.A0B(num, 2);
        0qQ.A0B(num2, 3);
        AnonymousClass6M3 r2 = new AnonymousClass6M3(context, r8.getCurrent(), context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_v2_1_winner_submission_width));
        int intValue = num.intValue();
        if (intValue == 0) {
            i = 2131974544;
        } else if (intValue != 1) {
            i = 2131974547;
            if (intValue != 2) {
                i = 2131974559;
            }
        } else {
            i = 2131974529;
        }
        r2.A01(i);
        r2.A02(R.dimen.account_discovery_bottom_gap);
        r2.A08 = true;
        r2.A06 = num2;
        return r2.A00();
    }

    public static void A02(C321026tS r0) {
        r0.C49().A00();
    }
}
