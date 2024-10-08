package X;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzas;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.zzaf;
import java.util.Map;

public final class SxY implements C13636Te2 {
    public boolean A00;
    public final /* synthetic */ C10598Rus A01;
    public final /* synthetic */ C8367QpP A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SxY(C10598Rus rus, C8367QpP qpP) {
        this();
        this.A02 = qpP;
        this.A01 = rus;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        C8401Qq6 qq6 = (C8401Qq6) obj;
        C365498nD r14 = (C365498nD) obj2;
        if (this.A00) {
            zzaf zzaf = new zzaf(r14);
            try {
                S41 s41 = this.A01.A01;
                C10755RxZ rxZ = qq6.A00;
                C8401Qq6 qq62 = ((SyI) rxZ.A00).A00;
                qq62.A07();
                AnonymousClass3Qk.A03(s41, "Invalid null listener key");
                Map map = rxZ.A03;
                synchronized (map) {
                    zzas zzas = (zzas) map.remove(s41);
                    if (zzas != null) {
                        synchronized (zzas) {
                            int A03 = AnonymousClass0fD.A03(-800739121);
                            C10598Rus rus = zzas.A00;
                            rus.A02 = null;
                            rus.A01 = null;
                            AnonymousClass0fD.A0A(1651640789, A03);
                        }
                        ((zzal) qq62.A03()).FP5(new zzbe((PendingIntent) null, (IBinder) null, zzas.asBinder(), zzaf.asBinder(), (zzbc) null, 2));
                    }
                }
            } catch (RuntimeException e) {
                r14.A02(e);
            }
        }
    }

    public SxY() {
        this.A00 = true;
    }
}
