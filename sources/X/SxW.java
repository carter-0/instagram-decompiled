package X;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzas;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.FusedLocationProviderClient$zzb;
import java.util.Map;

public final /* synthetic */ class SxW implements C13636Te2 {
    public final C10598Rus A00;
    public final zzbc A01;
    public final C8367QpP A02;
    public final RR1 A03;
    public final SxY A04;

    public SxW(C10598Rus rus, zzbc zzbc, C8367QpP qpP, RR1 rr1, SxY sxY) {
        this.A02 = qpP;
        this.A04 = sxY;
        this.A03 = rr1;
        this.A01 = zzbc;
        this.A00 = rus;
    }

    public final void accept(Object obj, Object obj2) {
        zzas zzas;
        C8367QpP qpP = this.A02;
        SxY sxY = this.A04;
        RR1 rr1 = this.A03;
        zzbc zzbc = this.A01;
        C10598Rus rus = this.A00;
        FusedLocationProviderClient$zzb fusedLocationProviderClient$zzb = new FusedLocationProviderClient$zzb(new C12592Syr(qpP, rr1, sxY), (C365498nD) obj2);
        zzbc.A04 = qpP.A08;
        C10755RxZ rxZ = ((C8401Qq6) obj).A00;
        synchronized (rxZ) {
            C8401Qq6 qq6 = ((SyI) rxZ.A00).A00;
            qq6.A07();
            S41 s41 = rus.A01;
            if (s41 != null) {
                Map map = rxZ.A03;
                synchronized (map) {
                    zzas = (zzas) map.get(s41);
                    if (zzas == null) {
                        zzas = new zzas(rus);
                    }
                    map.put(s41, zzas);
                }
                ((zzal) qq6.A03()).FP5(new zzbe((PendingIntent) null, (IBinder) null, zzas.asBinder(), fusedLocationProviderClient$zzb.asBinder(), zzbc, 1));
            }
        }
    }
}
