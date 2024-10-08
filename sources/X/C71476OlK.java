package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.instagram.android.R;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import com.instagram.direct.appwidget.DirectWidgetProvider;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.OlK  reason: case insensitive filesystem */
public final class C71476OlK implements RemoteViewsService.RemoteViewsFactory {
    public List A00 = 0sn.A00;
    public final int A01;
    public final Context A02;
    public final 1wn A03 = C71932OtG.A00(this, 1);
    public final 1wn A04 = C71932OtG.A00(this, 2);
    public final 1wn A05 = C71932OtG.A00(this, 3);
    public final HashSet A06 = AnonymousClass7TE.A1F();
    public final Intent A07;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final void onCreate() {
    }

    public static final void A00(C71476OlK olK) {
        Context context = olK.A02;
        Intent intent = new Intent("thread_update_event", (Uri) null, context.getApplicationContext(), DirectWidgetProvider.class);
        intent.putExtra("appWidgetId", olK.A07.getIntExtra("appWidgetId", 0));
        context.sendBroadcast(intent);
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final RemoteViews getLoadingView() {
        RemoteViews remoteViews = new RemoteViews(this.A02.getPackageName(), R.layout.appwidget_recipient_profile);
        remoteViews.setViewVisibility(R.id.picture_glimmer, 0);
        remoteViews.setViewVisibility(R.id.single_profile_picture, 8);
        remoteViews.setViewVisibility(R.id.group_picture, 8);
        remoteViews.setViewVisibility(R.id.username_glimmer, 0);
        remoteViews.setViewVisibility(R.id.username, 8);
        return remoteViews;
    }

    public final RemoteViews getViewAt(int i) {
        Bitmap A052;
        Bitmap A053;
        Bitmap A054;
        Context context = this.A02;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.appwidget_recipient_profile);
        remoteViews.setViewVisibility(R.id.picture_glimmer, 8);
        remoteViews.setViewVisibility(R.id.username_glimmer, 8);
        DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) this.A00.get(i);
        remoteViews.setTextViewText(R.id.username, directThreadWidgetItem.A04);
        remoteViews.setViewVisibility(R.id.username, 0);
        int i2 = 4;
        if (directThreadWidgetItem.A00) {
            i2 = 0;
        }
        remoteViews.setViewVisibility(R.id.unread_indicator, i2);
        String str = null;
        Bitmap A0H = 1NK.A00().A0H(DbS.A0V(directThreadWidgetItem.A03), (String) null);
        String str2 = directThreadWidgetItem.A01;
        if (str2 == null) {
            remoteViews.setViewVisibility(R.id.group_picture, 8);
            remoteViews.setViewVisibility(R.id.single_profile_picture, 0);
            if (!(A0H == null || (A054 = 1MF.A05(A0H)) == null)) {
                remoteViews.setImageViewBitmap(R.id.single_profile_picture, A054);
            }
        } else {
            remoteViews.setViewVisibility(R.id.single_profile_picture, 8);
            remoteViews.setViewVisibility(R.id.group_picture, 0);
            if (!(A0H == null || (A053 = 1MF.A05(A0H)) == null)) {
                remoteViews.setImageViewBitmap(R.id.front_picture, A053);
            }
            Bitmap A0H2 = 1NK.A00().A0H(DbS.A0V(str2), (String) null);
            if (!(A0H2 == null || (A052 = 1MF.A05(A0H2)) == null)) {
                remoteViews.setImageViewBitmap(R.id.back_picture, A052);
            }
        }
        int i3 = this.A01;
        int i4 = C66581MXm.A07(context, i3).getInt(002.A0O("widget_dark_mode_ui", i3), -1);
        if (i4 == 1) {
            remoteViews.setTextColor(R.id.username, -16777216);
        } else if (i4 != 2) {
            remoteViews.setTextColor(R.id.username, context.getColor(R.color.direct_widget_primary_text));
        } else {
            remoteViews.setTextColor(R.id.username, -1);
        }
        Bundle extras = this.A07.getExtras();
        if (extras != null) {
            str = extras.getString("com.instagram.direct.appwidget.USER_ID");
        }
        Intent A09 = DbS.A09();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("com.instagram.direct.appwidget.THREAD_ID", directThreadWidgetItem.A02);
        A0a.putString("com.instagram.direct.appwidget.USER_ID", str);
        A09.putExtras(A0a);
        remoteViews.setOnClickFillInIntent(R.id.profile, A09);
        return remoteViews;
    }

    public final void onDataSetChanged() {
        String A022 = C71072Oar.A00.A02(this.A02, Integer.valueOf(this.A01));
        C71072Oar.A01(new C72929PPn(this, 1), A022);
        C71072Oar.A01(new C72929PPn(this, 2), A022);
    }

    public final void onDestroy() {
        C71072Oar oar = C71072Oar.A00;
        Context context = this.A02;
        int i = this.A01;
        C71072Oar.A01(new C72929PPn(this, 3), oar.A02(context, Integer.valueOf(i)));
        context.deleteSharedPreferences(002.A0O("app_widget_id_", i));
    }

    public C71476OlK(Context context, Intent intent, int i) {
        this.A02 = context;
        this.A07 = intent;
        this.A01 = i;
    }
}
