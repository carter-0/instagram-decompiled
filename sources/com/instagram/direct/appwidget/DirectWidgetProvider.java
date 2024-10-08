package com.instagram.direct.appwidget;

import X.002;
import X.00k;
import X.00l;
import X.08y;
import X.09i;
import X.0Aj;
import X.0Sy;
import X.0kR;
import X.0qQ;
import X.11S;
import X.AnonymousClass000;
import X.AnonymousClass0BO;
import X.AnonymousClass0QU;
import X.AnonymousClass0kN;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C59880bj;
import X.C66580MXl;
import X.C66581MXm;
import X.C66582MXn;
import X.C71072Oar;
import X.C72933PPr;
import X.C72936PPu;
import X.DbS;
import X.DbU;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;

public final class DirectWidgetProvider extends AnonymousClass0QU {
    public final void A05(Context context, Intent intent, C59880bj r13) {
        String str;
        int[] intArray;
        Bundle extras;
        Bundle extras2;
        String str2;
        Bundle extras3;
        int[] intArray2;
        0qQ.A0B(context, 0);
        String action = intent.getAction();
        if (action != null) {
            str = new 11S("com\\.instagram\\.android\\.").A01(action, AnonymousClass000.A00(2598));
        } else {
            str = null;
        }
        if ("thread_update_event".equals(str)) {
            Bundle extras4 = intent.getExtras();
            if (extras4 != null) {
                AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(extras4.getInt("appWidgetId"), R.id.profiles_container);
            }
        } else if ("active_session_change_event".equals(str)) {
            Bundle extras5 = intent.getExtras();
            if (extras5 != null) {
                int i = extras5.getInt("appWidgetId");
                AppWidgetManager instance = AppWidgetManager.getInstance(context);
                0qQ.A07(instance);
                C71072Oar oar = C71072Oar.A00;
                Integer valueOf = Integer.valueOf(i);
                String A02 = oar.A02(context, valueOf);
                AnonymousClass0wW A0S = DbS.A0S(this);
                if (!(A0S instanceof UserSession) || !00k.A0u(AnonymousClass0BO.A00(A0S).BNz(), A02)) {
                    AnonymousClass0wW A0S2 = DbS.A0S(this);
                    if (!(A0S2 instanceof UserSession) || !00k.A0u(AnonymousClass0BO.A00(A0S2).BNz(), A02)) {
                        if (A02 != null) {
                            context.deleteSharedPreferences(002.A0O("app_widget_id_", i));
                            A02(instance, context, this, i);
                        }
                    } else if (A02 != null) {
                        return;
                    }
                    08y r1 = 09i.A0A;
                    if (r1.A05(this) instanceof UserSession) {
                        SharedPreferences A00 = C71072Oar.A00(context, valueOf);
                        UserSession A08 = r1.A08(this);
                        String A0n = DbU.A0n(A08, AnonymousClass0t1.A01);
                        String str3 = A08.A06;
                        SharedPreferences.Editor edit = A00.edit();
                        edit.putString(002.A0O("com.instagram.direct.appwidget.USER_ID", i), str3);
                        edit.putString(002.A0O("com.instagram.direct.appwidget.USER", i), A0n);
                        edit.apply();
                        A02(instance, context, this, i);
                    }
                }
            }
        } else {
            if (!((!"android.appwidget.action.APPWIDGET_UPDATE".equals(str) && !"android.appwidget.action.APPWIDGET_UPDATE_OPTIONS".equals(str)) || (extras3 = intent.getExtras()) == null || (intArray2 = extras3.getIntArray("appWidgetIds")) == null)) {
                for (int A022 : intArray2) {
                    AppWidgetManager instance2 = AppWidgetManager.getInstance(context);
                    0qQ.A07(instance2);
                    A02(instance2, context, this, A022);
                }
            }
            if ("direct_v2".equals(str) && (extras2 = intent.getExtras()) != null) {
                String A023 = C71072Oar.A00.A02(context, Integer.valueOf(extras2.getInt("appWidgetId")));
                Bundle extras6 = intent.getExtras();
                if (extras6 != null) {
                    str2 = extras6.getString("com.instagram.direct.appwidget.THREAD_ID");
                } else {
                    str2 = null;
                }
                Intent A09 = DbS.A09();
                if (A023 != null) {
                    A09.setClassName(context, "com.instagram.mainactivity.LauncherActivity");
                    A09.setFlags(335544320);
                    Uri.Builder authority = new Uri.Builder().scheme("instagram").authority("direct_v2");
                    authority.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                    authority.appendQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A023);
                    authority.appendQueryParameter("t", "direct_widget");
                    A09.setData(authority.build());
                    0kR.A0B(context, A09);
                }
            }
            if ("direct-inbox".equals(str) && (extras = intent.getExtras()) != null) {
                String A024 = C71072Oar.A00.A02(context, Integer.valueOf(extras.getInt("appWidgetId")));
                Intent A092 = DbS.A09();
                A092.setClassName(context, "com.instagram.mainactivity.LauncherActivity");
                A092.setFlags(335544320);
                Uri.Builder authority2 = new Uri.Builder().scheme("instagram").authority("direct-inbox");
                if (A024 != null && !00l.A0W(A024)) {
                    authority2.appendQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A024);
                }
                A092.setData(authority2.build());
                0kR.A0B(context, A092);
            }
            Bundle extras7 = intent.getExtras();
            if (extras7 != null && (intArray = extras7.getIntArray("appWidgetIds")) != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (int i2 : intArray) {
                    if (!C66581MXm.A07(context, i2).getBoolean("has_configured_widget", false)) {
                        AnonymousClass7TF.A1M(A1C, i2);
                    }
                }
                if (r4 != 0) {
                    AnonymousClass0wW A0S3 = DbS.A0S(this);
                    0qQ.A0B(A0S3, 0);
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0S3), "ig_app_widget_lifecycle");
                    if (A0e.isSampled() && str != null) {
                        A0e.AAJ("widget_name", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
                        A0e.AAJ("lifecycle_event_name", str);
                        ArrayList A0v = DbS.A0v(r4);
                        int i3 = 0;
                        do {
                            A0v.add(String.valueOf(intArray[i3]));
                            i3++;
                        } while (i3 < r4);
                        A0e.AAe("widget_ids", 00k.A0a(A0v));
                        A0e.Cgf();
                    }
                }
            }
        }
    }

    public static final void A02(AppWidgetManager appWidgetManager, Context context, DirectWidgetProvider directWidgetProvider, int i) {
        String A02 = C71072Oar.A00.A02(context, Integer.valueOf(i));
        AnonymousClass0wW A0S = DbS.A0S(directWidgetProvider);
        if (!(A0S instanceof UserSession) || !00k.A0u(AnonymousClass0BO.A00(A0S).BNz(), A02)) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            0qQ.A07(instance);
            A01(instance, context, i, R.string.f0nameremoved, R.string.f0nameremoved);
            return;
        }
        C71072Oar.A01(new C72936PPu(appWidgetManager, context, directWidgetProvider, i), A02);
    }

    public static final RemoteViews A00(PendingIntent pendingIntent, Context context, Intent intent, String str, int i, int i2, int i3) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        remoteViews.setRemoteAdapter(i3, R.id.profiles_container, intent);
        if (str != null) {
            C71072Oar oar = C71072Oar.A00;
            Integer valueOf = Integer.valueOf(i3);
            C71072Oar.A01(new C72933PPr(context, remoteViews, i2), oar.A02(context, valueOf));
            int i4 = C71072Oar.A00(context, valueOf).getInt(002.A0O("widget_dark_mode_ui", i3), -1);
            if (i4 == 1) {
                remoteViews.setTextColor(R.id.title_text, -16777216);
                remoteViews.setInt(R.id.view_container, "setBackgroundColor", -1);
            } else if (i4 != 2) {
                remoteViews.setInt(R.id.view_container, "setBackgroundResource", R.drawable.appwidget_rounded_corner);
            } else {
                remoteViews.setTextColor(R.id.title_text, -1);
                remoteViews.setInt(R.id.view_container, "setBackgroundColor", -16777216);
            }
        }
        Intent A0A = C66580MXl.A0A(context, DirectWidgetProvider.class);
        A0A.setAction("direct-inbox");
        A0A.putExtra("appWidgetId", i3);
        int i5 = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i5 = 167772160;
        }
        0Sy A0K = C66582MXn.A0K(context, A0A);
        A0K.A08();
        remoteViews.setOnClickPendingIntent(R.id.ig_icon, A0K.A02(context, i3, i5));
        remoteViews.setPendingIntentTemplate(R.id.profiles_container, pendingIntent);
        return remoteViews;
    }

    public static final void A01(AppWidgetManager appWidgetManager, Context context, int i, int i2, int i3) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.direct_app_widget_stress_screen);
        remoteViews.setTextViewText(R.id.title, context.getString(i2));
        remoteViews.setTextViewText(R.id.subtitle, context.getString(i3));
        Intent A0A = C66580MXl.A0A(context, DirectWidgetProvider.class);
        A0A.setAction("direct-inbox");
        A0A.putExtra("appWidgetId", i);
        int i4 = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = 167772160;
        }
        0Sy A0K = C66582MXn.A0K(context, A0A);
        A0K.A08();
        remoteViews.setOnClickPendingIntent(R.id.go_to_ig_button, A0K.A02(context, i, i4));
        appWidgetManager.updateAppWidget(i, remoteViews);
    }
}
