package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.birthdays.BirthdayPogsApi;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3pb  reason: invalid class name and case insensitive filesystem */
public final class C252743pb extends C252733pa {
    public static final long A07 = TimeUnit.DAYS.toMillis(1);
    public static final C2615349y A08 = new Object();
    public long A00;
    public C262204Co A01;
    public final UserSession A02;
    public final BirthdayPogsApi A03;
    public final 1Av A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C252743pb(1Av r5, UserSession userSession) {
        super("Direct", AnonymousClass43D.A01(2012135052, 3));
        List list;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 2);
        this.A02 = userSession;
        this.A04 = r5;
        this.A03 = new BirthdayPogsApi(userSession, 1vm.A01(userSession));
        0xa r3 = r5.A01;
        Set stringSet = r3.getStringSet("birthday_user_ids", 0sl.A00);
        if (stringSet != null) {
            list = 00k.A0X(stringSet);
        } else {
            list = 0sn.A00;
        }
        02z A012 = 106.A01(list);
        this.A05 = A012;
        this.A06 = 10b.A03(A012);
        this.A00 = r3.getLong("birthday_user_ids_last_updated_timestamp", 0);
    }
}
