package com.instagram.direct.notifications.impl;

import X.002;
import X.09i;
import X.0Aj;
import X.0KC;
import X.0sn;
import X.0wb;
import X.14i;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass7TE;
import X.C254743sy;
import X.C254923tH;
import X.C376169Gw;
import X.C395269zU;
import X.C66580MXl;
import X.C70128Nxi;
import X.C7196Pyk;
import X.C73413PcA;
import X.C73416PcD;
import X.DbT;
import X.DbV;
import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

public final class DirectNotificationActionService extends IntentService implements AnonymousClass0iw {
    public final String getModuleName() {
        return "direct_notification_action_service";
    }

    public DirectNotificationActionService() {
        super("DirectNotificationActionService");
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        C254923tH r10;
        C254743sy directThreadKey;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        if (intent == null) {
            0wb.A04("DirectNotificationActionService", "Unexpected null intent", 1);
            return;
        }
        try {
            String action = intent.getAction();
            if (action == null) {
                str3 = "notification_action_clicked_no_action";
                str4 = "No action is defined for the notification action.";
            } else {
                Uri data = intent.getData();
                Boolean bool2 = null;
                if (data != null) {
                    str = data.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                } else {
                    str = null;
                }
                if (str == null) {
                    0KC.A0D("DirectNotificationActionService", "No thread id found in notification action");
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        0wb.A04("notification_action_clicked_no_extra", 002.A0g("The notification action ", intent.getAction(), " is triggered but there is intended user ID in the extra."), 1);
                    } else {
                        UserSession A07 = 09i.A0A.A07(extras);
                        if (A07 == null) {
                            str3 = "notification_action_clicked_for_inactive_user";
                            str4 = "Attempting to send from notification action when logged into a different account.";
                        } else {
                            String queryParameter = data.getQueryParameter(TraceFieldType.TransportType);
                            if (queryParameter == null || queryParameter.length() == 0) {
                                r10 = C254923tH.DJANGO;
                            } else {
                                r10 = C395269zU.A00(queryParameter);
                            }
                            if (r10.A00()) {
                                directThreadKey = new MsysThreadId(r10, (Long) null, Long.parseLong(str));
                            } else {
                                directThreadKey = new DirectThreadKey(str, (List) null);
                            }
                            C254743sy r12 = directThreadKey;
                            if (action.equals("direct_text_reply")) {
                                C70128Nxi.A00(new C73413PcA(A07, r10, this, r12, data.getQueryParameter("reply"), data.getQueryParameter("uuid"), data.getQueryParameter("category"), data.getQueryParameter("experiments_mask")));
                            } else if (action.equals("direct_inline_like")) {
                                C376169Gw r2 = C376169Gw.A00;
                                0sn r1 = 0sn.A00;
                                Capabilities createWithAdditionalCapabilities = r2.createWithAdditionalCapabilities(r1, r1);
                                String queryParameter2 = data.getQueryParameter("message_id");
                                String queryParameter3 = data.getQueryParameter("message_client_context");
                                String queryParameter4 = data.getQueryParameter("uuid");
                                String queryParameter5 = data.getQueryParameter("category");
                                Boolean.parseBoolean(data.getQueryParameter("is_instamadillo"));
                                C70128Nxi.A00(new C73416PcD(A07, createWithAdditionalCapabilities, r10, this, r12, queryParameter2, queryParameter3, queryParameter4, queryParameter5));
                            } else {
                                0wb.A03("DirectNotificationActionService", 002.A0R("Unknown intent action: ", intent.getAction()));
                            }
                            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A07), "ig_push_notification_user_action");
                            if (A0e.isSampled()) {
                                String queryParameter6 = data.getQueryParameter("intended_recipient_user_id");
                                A0e.AAJ("recipient_id", queryParameter6);
                                A0e.AAJ("push_identifier", data.getQueryParameter("push_id"));
                                A0e.AAJ("push_category", data.getQueryParameter("category"));
                                String queryParameter7 = data.getQueryParameter("is_vm_active");
                                Long l = null;
                                if (queryParameter7 != null) {
                                    bool = Boolean.valueOf(Boolean.parseBoolean(queryParameter7));
                                } else {
                                    bool = null;
                                }
                                A0e.A7p("is_vm_active", bool);
                                String queryParameter8 = data.getQueryParameter("is_e2ee");
                                if (queryParameter8 != null) {
                                    bool2 = Boolean.valueOf(Boolean.parseBoolean(queryParameter8));
                                }
                                A0e.A7p("is_e2ee", bool2);
                                A0e.A7p("is_bg_account", DbT.A0l(C66580MXl.A1X(A07, queryParameter6)));
                                String queryParameter9 = data.getQueryParameter("occamadillo_thread_id");
                                if (queryParameter9 != null) {
                                    l = DbV.A0q(queryParameter9);
                                }
                                A0e.A9F("occamadillo_thread_id", l);
                                A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, data.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                                A0e.AAJ("action_type", action);
                                if (14i.A08()) {
                                    str2 = AppStateModule.APP_STATE_BACKGROUND;
                                } else {
                                    str2 = "foreground";
                                }
                                A0e.AAJ("app_state", str2);
                                A0e.Cgf();
                            }
                        }
                    }
                }
            }
            0wb.A04(str3, str4, 1);
        } finally {
            C7196Pyk.A01(intent);
        }
    }
}
