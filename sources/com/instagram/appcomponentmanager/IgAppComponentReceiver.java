package com.instagram.appcomponentmanager;

import X.02C;
import X.0qQ;
import X.AnonymousClass0eX;
import X.AnonymousClass0fD;
import X.AnonymousClass0xl;
import X.C61170le;
import X.C62880wX;
import X.C66580MXl;
import X.DbT;
import X.JTO;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.appcomponentmanager.AppComponentManagerService;
import java.io.File;

public final class IgAppComponentReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, -1383463471);
        intent.getAction();
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            File A00 = AnonymousClass0eX.A00(context, 1436876361);
            A00.mkdirs();
            String[] list = JTO.A0s(A00, "versions").list();
            if (list == null || list.length == 0) {
                0qQ.A0B(context, 0);
                Context A05 = DbT.A05(context);
                C62880wX r0 = C61170le.A00;
                r0.A00 = A05;
                if (AnonymousClass0xl.A00(r0).A00.getString("current", (String) null) == null) {
                    i = -1079568247;
                    AnonymousClass0fD.A0E(i, A03, intent);
                }
            }
            02C.enqueueWork(context, AppComponentManagerService.class, 137875812, new Intent("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS"));
        }
        i = 202694452;
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
