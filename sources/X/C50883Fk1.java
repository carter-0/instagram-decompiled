package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fk1  reason: case insensitive filesystem */
public final class C50883Fk1 implements G6H {
    public final Context A00;
    public final UserSession A01;

    public static final void A00(C50883Fk1 fk1) {
        1NY A0N = DbU.A0N(fk1.A01);
        A0N.A0A("video_call/change_notification_settings/");
        A0N.A0C("push_option", 2);
        1OC A0N2 = DbY.A0N(A0N, 1XP.class, 1XY.class);
        C47696EDf.A01(A0N2, fk1, 15);
        1ES.A03(A0N2);
    }

    public C50883Fk1(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        A00(this);
    }
}
