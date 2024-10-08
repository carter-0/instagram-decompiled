package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class OW5 {
    public final UserSession A00;
    public final C72203OyT A01;
    public final Set A02 = 0sc.A07(new C69358Njy[]{C69358Njy.OTC_DISPLAY_CODE_INTRO_V2, C69358Njy.OTC_DISPLAY_CODE_V2});
    public final AnonymousClass0eM A03 = C67485Mof.A00(this, 0eO.A02, 23);

    public static void A00(Activity activity, C69358Njy njy, C69271NiX niX, OW5 ow5, Integer num) {
        Activity activity2 = activity;
        OW5 ow52 = ow5;
        ow52.A01(activity2, new Bundle(), njy, niX, num, AnonymousClass05K.A00, (Integer) null);
    }

    public final void A01(Activity activity, Bundle bundle, C69358Njy njy, C69271NiX niX, Integer num, Integer num2, Integer num3) {
        Activity activity2 = activity;
        0qQ.A0B(activity, 0);
        C69271NiX niX2 = niX;
        Integer num4 = num;
        Integer num5 = num2;
        C51974G9v.A1M(num, niX, num2);
        Bundle bundle2 = bundle;
        0qQ.A0B(bundle, 6);
        if (((AnonymousClass65E) this.A03.getValue()).A00()) {
            11Z.A03(new C73411Pc8(activity2, bundle2, njy, niX2, this, num4, num5, num3));
        }
    }

    public final void A02(Activity activity, Bundle bundle, C69271NiX niX, Integer num, Integer num2) {
        Bundle bundle2 = bundle;
        C69271NiX niX2 = niX;
        C51972G9s.A1C(niX, bundle);
        if (((AnonymousClass65E) this.A03.getValue()).A00()) {
            11Z.A03(new C73398Pbv(activity, bundle2, niX2, this, num, num2));
        }
    }

    public OW5(UserSession userSession, C72203OyT oyT) {
        AnonymousClass7TG.A1O(userSession, oyT);
        this.A00 = userSession;
        this.A01 = oyT;
    }
}
