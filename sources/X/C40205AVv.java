package X;

import android.app.job.JobParameters;
import com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.AVv  reason: case insensitive filesystem */
public final class C40205AVv implements B1A {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C40205AVv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void D5F(PyF pyF) {
        switch (this.A00) {
            case 0:
                AnonymousClass9NS r5 = (AnonymousClass9NS) this.A01;
                for (2K0 A08 : r5.A05) {
                    A08.A08((AnonymousClass9NU) this.A02, (C294495mY) pyF.A04(), r5.A00);
                }
                return;
            case 1:
                boolean A07 = pyF.A07();
                if (A07) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    AnonymousClass9NS r2 = (AnonymousClass9NS) this.A01;
                    Set set = r2.A06;
                    A1C.add(new AnonymousClass9NV(AnonymousClass05K.A0N, set));
                    for (2K0 A04 : r2.A05) {
                        A04.A04(new AnonymousClass9NU(AnonymousClass05K.A1F, A1C, set, set), "AUTO_UNINSTALL".equals((Object) null), A07);
                    }
                }
                ((PyE) this.A02).A01(new C294495mY((Throwable) null, -1, A07, false));
                return;
            default:
                OxygenScheduledInstallerJobService oxygenScheduledInstallerJobService = (OxygenScheduledInstallerJobService) this.A02;
                JobParameters jobParameters = (JobParameters) this.A01;
                1Uf r0 = oxygenScheduledInstallerJobService.A01;
                if (r0 == null) {
                    0qQ.A0F("lightSharedPreferencesFactory");
                    throw AnonymousClass00P.createAndThrow();
                }
                boolean isEmpty = oxygenScheduledInstallerJobService.A00(r0).isEmpty();
                boolean z = true;
                if (isEmpty) {
                    z = false;
                }
                0fR.A02(jobParameters, oxygenScheduledInstallerJobService, z);
                return;
        }
    }
}
