package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaa;

public final /* synthetic */ class SxI implements C13636Te2 {
    public final /* synthetic */ TelemetryData A00;

    public /* synthetic */ SxI(TelemetryData telemetryData) {
        this.A00 = telemetryData;
    }

    /* JADX INFO: finally extract failed */
    public final void accept(Object obj, Object obj2) {
        C365498nD r9 = (C365498nD) obj2;
        zaa zaa = (zaa) ((BaseGmsClient) obj).A03();
        TelemetryData telemetryData = this.A00;
        int A03 = AnonymousClass0fD.A03(-1746547611);
        Parcel A002 = zaa.A00();
        A002.writeInt(1);
        telemetryData.writeToParcel(A002, 0);
        int A032 = AnonymousClass0fD.A03(-1122337457);
        try {
            zaa.A00.transact(1, A002, (Parcel) null, 1);
            A002.recycle();
            AnonymousClass0fD.A0A(1863232442, A032);
            AnonymousClass0fD.A0A(-759865617, A03);
            r9.A01((Object) null);
        } catch (Throwable th) {
            A002.recycle();
            AnonymousClass0fD.A0A(-1980423653, A032);
            throw th;
        }
    }
}
