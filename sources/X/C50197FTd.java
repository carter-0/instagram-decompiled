package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FTd  reason: case insensitive filesystem */
public final class C50197FTd implements G5P {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C50197FTd(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final void DHu() {
        if (this.A00 != 0) {
            Dd4 dd4 = (Dd4) this.A01;
            AnonymousClass0iw r4 = (AnonymousClass0iw) this.A02;
            String str = this.A04;
            User user = (User) this.A03;
            UserSession userSession = dd4.A0A;
            if (str == null) {
                str = "activity_feed_notification";
            }
            C321406u6.A05(r4, userSession, str, user.getId(), 0oI.A0A(dd4.A05));
            return;
        }
        UserSession userSession2 = (UserSession) this.A01;
        String str2 = this.A04;
        User user2 = (User) this.A02;
        Context context = (Context) this.A03;
        FU8 fu8 = new FU8();
        if (str2 == null) {
            str2 = "push_notification";
        }
        C321406u6.A05(fu8, userSession2, str2, user2.getId(), 0oI.A0A(context));
    }
}
