package com.instagram.debug.devoptions.section.directinboxreplyreminder;

import X.0xY;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class DirectInboxReplyReminderOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public DirectInboxReplyReminderOptions$getItems$1(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1082583147);
        0xY A0N = AnonymousClass7TF.A0N(this.$userSession);
        A0N.ED3("inbox_recent_reminder_message_ids");
        A0N.ED3("inbox_reminder_thread_map");
        A0N.ED3("inbox_sender_reminder_impression_count");
        A0N.ED3("inbox_receiver_reminder_impression_count");
        A0N.apply();
        AnonymousClass0fD.A0C(-485831044, A05);
    }
}
