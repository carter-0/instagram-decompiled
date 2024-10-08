package androidx.work.impl.background.systemalarm;

import X.AnonymousClass0fD;
import X.AnonymousClass0h3;
import X.AnonymousClass389;
import X.Sg6;
import X.TZl;
import android.content.Intent;
import android.util.Log;

public class SystemAlarmService extends AnonymousClass0h3 implements TZl {
    public Sg6 A00;
    public boolean A01;

    static {
        AnonymousClass389.A01("SystemAlarmService");
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(-488916408);
        super.onCreate();
        Sg6 sg6 = new Sg6(this);
        this.A00 = sg6;
        if (sg6.A02 != null) {
            AnonymousClass389.A00();
            Log.e(Sg6.A0B, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            sg6.A02 = this;
        }
        this.A01 = false;
        AnonymousClass0fD.A0B(-28763192, A04);
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0fD.A04(-253960804);
        super.onDestroy();
        this.A01 = true;
        Sg6 sg6 = this.A00;
        AnonymousClass389.A00();
        sg6.A04.A03(sg6);
        sg6.A02 = null;
        AnonymousClass0fD.A0B(563478687, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0fD.A04(1318340339);
        super.onStartCommand(intent, i, i2);
        if (this.A01) {
            AnonymousClass389.A00();
            Sg6 sg6 = this.A00;
            AnonymousClass389.A00();
            sg6.A04.A03(sg6);
            sg6.A02 = null;
            Sg6 sg62 = new Sg6(this);
            this.A00 = sg62;
            if (sg62.A02 != null) {
                AnonymousClass389.A00();
                Log.e(Sg6.A0B, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                sg62.A02 = this;
            }
            this.A01 = false;
        }
        if (intent != null) {
            this.A00.A02(intent, i2);
        }
        AnonymousClass0fD.A0B(239442611, A04);
        return 3;
    }
}
