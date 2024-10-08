package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class LIK {
    public static final void A00(Context context, UserSession userSession, 27r r5, 1Av r6) {
        DbY.A1S(r6, context);
        if (182.A06(0Tu.A05, userSession, 36323002279209710L) && !AnonymousClass7TG.A1a(r6, r6.A0h, 1Av.A8a, 188)) {
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A0j(context.getDrawable(R.drawable.ig_illustrations_illo_text_refresh));
            A0Y.A09(2131975092);
            A0Y.A08(2131975089);
            A0Y.A0J(LV0.A00(r5, r6, 25), 2131975090);
            A0Y.A0G(LV0.A00(r5, r6, 26), 2131975091);
            A0Y.A04();
            DbT.A1V(A0Y);
            r5.A0i();
        }
    }

    public static final void A01(Context context, UserSession userSession, 27r r8, 1Av r9, boolean z) {
        DbY.A1S(r9, context);
        if (!182.A06(0Tu.A05, userSession, 36323002279209710L)) {
            0xa r5 = r9.A01;
            if (r5.getInt("clips_sticker_translations_opt_in_impression_count", 0) < 3 && !AnonymousClass7TG.A1a(r9, r9.A0h, 1Av.A8a, 188)) {
                C358248ab A0Y = DbS.A0Y(context);
                A0Y.A0j(context.getDrawable(R.drawable.ig_illustrations_illo_text_refresh));
                int i = 2131974222;
                if (z) {
                    i = 2131975088;
                }
                A0Y.A09(i);
                int i2 = 2131974219;
                if (z) {
                    i2 = 2131975085;
                }
                A0Y.A08(i2);
                int i3 = 2131974220;
                if (z) {
                    i3 = 2131975086;
                }
                A0Y.A0J(LV0.A00(r8, r9, 23), i3);
                int i4 = 2131974221;
                if (z) {
                    i4 = 2131975087;
                }
                A0Y.A0G(LV0.A00(r8, r9, 24), i4);
                A0Y.A04();
                DbT.A1V(A0Y);
                JTS.A1S(r5, "clips_sticker_translations_opt_in_impression_count", 0);
                r8.A0i();
            }
        }
    }
}
