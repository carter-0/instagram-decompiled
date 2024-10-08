package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.65a  reason: invalid class name and case insensitive filesystem */
public final class C3027265a implements MailboxCallback {
    public final UserSession A00;
    public final AnonymousClass65X A01;
    public final AnonymousClass6EB A02;

    public /* synthetic */ C3027265a(UserSession userSession, AnonymousClass65X r3) {
        AnonymousClass6EB r0 = new AnonymousClass6EB(userSession);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = r0;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        0qQ.A0B(mailboxNullable, 0);
        C301345z0 r0 = (C301345z0) mailboxNullable.value;
        if (r0 != null) {
            int count = r0.mResultSet.getCount();
            for (int i = 0; i < count; i++) {
                AnonymousClass65X r13 = this.A01;
                UserSession userSession = this.A00;
                Long nullableLong = r0.mResultSet.getNullableLong(i, 8);
                Long nullableLong2 = r0.mResultSet.getNullableLong(i, 9);
                int integer = r0.mResultSet.getInteger(i, 13);
                int integer2 = r0.mResultSet.getInteger(i, 11);
                if (nullableLong == null || (nullableLong2 == null && !(integer2 == 18 && integer == 10))) {
                    0wb.A04("notification_threadPk_null_or_messagePK_null", "No group invite notification should be rendered", 1);
                    AnonymousClass6EB r8 = this.A02;
                    C268194cw r4 = new C268194cw(C269474fB.A00);
                    r4.A0F("is_bg_account", false);
                    r4.A0F("skips_sync", false);
                    AnonymousClass6EB.A01(r8, (Boolean) null, (Boolean) null, "ARMADILLO_NOTIFICATIONS_PRESENT_CLIENT_NOTIFICATION_ERROR", (String) null, (String) null, r4.toString(), (String) null);
                } else {
                    String string = r0.mResultSet.getString(i, 15);
                    if (string != null) {
                        OZF.A02.A00().A00(AnonymousClass65X.A00(userSession, new SimpleImageUrl(r0.mResultSet.getString(i, 22)), r13, nullableLong2, r0.mResultSet.getString(i, 4), r0.mResultSet.getString(i, 3), r0.mResultSet.getString(i, 5), string, String.valueOf(r0.mResultSet.getString(i, 25)), String.valueOf(r0.mResultSet.getLong(i, 2)), r0.mResultSet.getString(i, 18), r0.mResultSet.getString(i, 17), integer2, integer, nullableLong.longValue()), userSession);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
    }
}
