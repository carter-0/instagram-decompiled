package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceService;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceService$Stub$Proxy;
import com.google.android.gms.deviceperformance.internal.zzc;

public final class SxX implements C13636Te2 {
    public static final SxX A00 = new Object();

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        zzc zzc = new zzc((C365498nD) obj2);
        IDevicePerformanceService$Stub$Proxy iDevicePerformanceService$Stub$Proxy = (IDevicePerformanceService$Stub$Proxy) ((IDevicePerformanceService) ((BaseGmsClient) obj).A03());
        int A03 = AnonymousClass0fD.A03(-1706541908);
        int A032 = AnonymousClass0fD.A03(65224425);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
        AnonymousClass0fD.A0A(-1045162293, A032);
        Pxf.A16(zzc, obtain);
        int A033 = AnonymousClass0fD.A03(1963009958);
        Parcel obtain2 = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(iDevicePerformanceService$Stub$Proxy.A00, obtain, obtain2, 1);
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0fD.A0A(-254105201, A033);
            AnonymousClass0fD.A0A(-1558701466, A03);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0fD.A0A(-1696037357, A033);
            throw th;
        }
    }
}
