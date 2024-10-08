package com.instagram.direct.notifications.impl;

import X.0qQ;
import X.0wb;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C66580MXl;
import X.C7196Pyk;
import X.DbV;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class DirectNotificationActionReceiver extends C7196Pyk {
    public final void onReceive(Context context, Intent intent) {
        Bundle resultsFromIntent;
        CharSequence charSequence;
        String str;
        String str2;
        int A01 = AnonymousClass0fD.A01(-480267960);
        boolean A1Z = AnonymousClass7TG.A1Z(context, intent);
        String action = intent.getAction();
        Uri data = intent.getData();
        if (action == null) {
            str = "notification_action_clicked_no_action";
            str2 = "Receive an intent to notification action receiver but there is no action.";
        } else if (data == null) {
            str = "notification_action_clicked_no_data";
            str2 = "Receive an intent to notification action receiver but there is no data.";
        } else {
            if (!(!action.equals("direct_text_reply") || (resultsFromIntent = RemoteInput.getResultsFromIntent(intent)) == null || (charSequence = resultsFromIntent.getCharSequence("DirectNotificationConstants.DirectReply")) == null)) {
                data = DbV.A08(data.buildUpon(), "reply", DbV.A12(charSequence.toString()));
            }
            0qQ.A0A(data);
            0qQ.A0B(data, 2);
            Intent putExtra = C66580MXl.A0A(context, DirectNotificationActionService.class).setData(data).setAction(action).putExtra("IgSessionManager.SESSION_TOKEN_KEY", data.getQueryParameter("intended_recipient_user_id"));
            0qQ.A07(putExtra);
            C7196Pyk.A00(context, putExtra);
            AnonymousClass0fD.A0E(-2136552611, A01, intent);
        }
        0wb.A04(str, str2, A1Z ? 1 : 0);
        AnonymousClass0fD.A0E(-2136552611, A01, intent);
    }
}
