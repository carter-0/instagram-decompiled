package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.ar.core.dependencies.f;
import com.google.ar.core.p;

public final class TJ5 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C10906S0g A01;
    public final /* synthetic */ SFR A02;

    public TJ5(Context context, C10906S0g s0g, SFR sfr) {
        this.A02 = sfr;
        this.A00 = context;
        this.A01 = s0g;
    }

    public final void run() {
        Parcel A002;
        int A03;
        try {
            f fVar = this.A02.A01;
            String str = this.A00.getApplicationInfo().packageName;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putCharSequence("package.name", "com.google.ar.core");
            p pVar = new p(this);
            int A032 = AnonymousClass0fD.A03(267803138);
            A002 = fVar.A00();
            A002.writeString(str);
            A002.writeInt(1);
            A0a.writeToParcel(A002, 0);
            Pxf.A16(pVar, A002);
            A03 = AnonymousClass0fD.A03(-1275500857);
            fVar.A00.transact(2, A002, (Parcel) null, 1);
            A002.recycle();
            AnonymousClass0fD.A0A(-1059320237, A03);
            AnonymousClass0fD.A0A(1295172930, A032);
        } catch (RemoteException e) {
            Log.e("ARCore-InstallService", "requestInfo threw", e);
            this.A01.A00(RDH.A05);
        } catch (Throwable th) {
            A002.recycle();
            AnonymousClass0fD.A0A(-1302794670, A03);
            throw th;
        }
    }
}
