package com.facebook.msys.mca;

import X.0JA;
import X.AnonymousClass681;
import X.AnonymousClass68J;
import X.C66595MYh;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;

public abstract class MailboxFeature {
    public static final MailboxFeature $redex_init_class = null;
    public final AnonymousClass68J mMailboxApiHandleMetaProvider;

    public interface DbConnectionResolutionCallback {
        Object run(Mailbox mailbox, SqliteHolder sqliteHolder);
    }

    public static final native void safeDispatchToDbConnectionAndResolve(Mailbox mailbox, MailboxFutureImpl mailboxFutureImpl, Object obj, int i, int i2, NotificationScope notificationScope, PrivacyContext privacyContext, String str, String str2, DbConnectionResolutionCallback dbConnectionResolutionCallback);

    public static final void safeDispatchToDbConnectionAndResolve(Mailbox mailbox, MailboxFutureImpl mailboxFutureImpl, Object obj, int i, int i2, String str, String str2, DbConnectionResolutionCallback dbConnectionResolutionCallback) {
        safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj, i, i2, (NotificationScope) null, (PrivacyContext) null, str, str2, dbConnectionResolutionCallback);
    }

    static {
        C66595MYh.A00();
    }

    public MailboxFeature(AnonymousClass68J r1) {
        this.mMailboxApiHandleMetaProvider = r1;
    }

    public static final Object getNonNullNotificationValue(AnonymousClass681 r1, Map map, String str, int i) {
        Object A00 = r1.A00(i);
        Object obj = map.get(A00);
        0JA.A05(obj, "Failed to find required key '%s' in payload for notification '%s'. Make sure that your header annotations (MAILBOX_NOTIFICATION_CONTAINS_KEY or MAILBOX_NOTIFICATION_MAY_CONTAIN_KEY) match the behavior of your Mailbox API function.", new Object[]{A00, str});
        return obj;
    }
}
