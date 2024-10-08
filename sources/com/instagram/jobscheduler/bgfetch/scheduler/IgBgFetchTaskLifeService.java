package com.instagram.jobscheduler.bgfetch.scheduler;

import X.0KC;
import X.0Tu;
import X.182;
import X.2IT;
import X.AnonymousClass0fD;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C20592WvV;
import X.C73660PhZ;
import X.DbT;
import X.Pxe;
import X.Pxg;
import X.T7D;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class IgBgFetchTaskLifeService extends Service {
    public boolean A00;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onTaskRemoved(Intent intent) {
        if (this.A00) {
            try {
                T7D A002 = 2IT.A00(DbT.A05(this), Pxe.A0a(this));
                if (A002 != null) {
                    C73660PhZ phZ = new C73660PhZ(this, 29);
                    if (!182.A06(0Tu.A06, A002.A04, 36330235004404256L)) {
                        phZ.invoke();
                        return;
                    }
                    AnonymousClass7TE.A1Z(new C20592WvV(A002, phZ, (AnonymousClass4D7) null, 2), A002.A07);
                }
            } catch (Exception e) {
                0KC.A0C("IgBgFetchTaskLifeService", AnonymousClass7TG.A0m(e, "scheduleBackgroundPrefetchJob error: ", AnonymousClass7TE.A1A()));
                stopSelf();
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A01 = Pxg.A01(this, intent, 802068681);
        this.A00 = true;
        AnonymousClass0fD.A0B(-762590311, A01);
        return 0;
    }
}
