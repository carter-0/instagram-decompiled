package com.instagram.direct.appwidget;

import X.00y;
import X.0qQ;
import X.C71476OlK;
import X.DbT;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViewsService;

public final class DirectWidgetService extends RemoteViewsService {
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int i;
        String schemeSpecificPart;
        Integer A0l;
        0qQ.A0B(intent, 0);
        Context A05 = DbT.A05(this);
        Uri data = intent.getData();
        if (data == null || (schemeSpecificPart = data.getSchemeSpecificPart()) == null || (A0l = 00y.A0l(schemeSpecificPart)) == null) {
            i = 0;
        } else {
            i = A0l.intValue();
        }
        return new C71476OlK(A05, intent, i);
    }
}
