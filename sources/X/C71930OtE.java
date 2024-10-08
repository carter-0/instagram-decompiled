package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.instagram.direct.appwidget.DirectWidgetProvider;

/* renamed from: X.OtE  reason: case insensitive filesystem */
public final class C71930OtE implements 1wn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ DirectWidgetProvider A02;

    public C71930OtE(Context context, DirectWidgetProvider directWidgetProvider, int i) {
        this.A02 = directWidgetProvider;
        this.A01 = context;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1793319099);
        int A032 = AnonymousClass0fD.A03(-1662720214);
        DirectWidgetProvider directWidgetProvider = this.A02;
        Context context = this.A01;
        int i = this.A00;
        if (C66581MXm.A07(context, i).getBoolean("com.instagram.direct.appwidget.IS_EMPTY_CHAT", false)) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            0qQ.A07(instance);
            DirectWidgetProvider.A02(instance, context, directWidgetProvider, i);
        }
        AnonymousClass0fD.A0A(-1710309803, A032);
        AnonymousClass0fD.A0A(-378803125, A03);
    }
}
