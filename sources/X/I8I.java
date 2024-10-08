package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class I8I implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public I8I(C267324bN r1, C52036GCi gCi, String str, int i) {
        this.A00 = i;
        this.A02 = gCi;
        this.A03 = str;
        this.A01 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        1OC A0U;
        C267324bN r3;
        int i2;
        int i3 = this.A00;
        C52036GCi gCi = (C52036GCi) this.A02;
        UserSession userSession = gCi.A02;
        if (i3 != 0) {
            String str = this.A03;
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            DbU.A1P(A0a, "usertags/%s/remove/", new Object[]{str});
            A0a.A9m("media_id", str);
            DbX.A1M(A0a, "container_module", "feed_contextual_self_profile");
            A0U = DbT.A0U(A0a, true);
            r3 = (C267324bN) this.A01;
            i2 = 24;
        } else {
            String str2 = this.A03;
            0qQ.A0B("feed_contextual_self_profile", 2);
            1NY A0a2 = AnonymousClass7TG.A0a(userSession);
            A0a2.A0K("commerce/media/%s/remove_all_tags_on_media/", new Object[]{str2});
            A0a2.A0Q(1XP.class, 1XY.class);
            C51965G9l.A1S(A0a2, "feed_contextual_self_profile");
            A0U = DbT.A0U(A0a2, true);
            r3 = (C267324bN) this.A01;
            i2 = 23;
        }
        A0U.A00 = new H51(r3, gCi, i2);
        gCi.A01.schedule(A0U);
    }
}
