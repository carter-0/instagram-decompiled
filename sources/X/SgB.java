package X;

import android.os.Parcel;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;

public final /* synthetic */ class SgB implements C13513Tbe {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RemoteListenableWorker A01;

    public /* synthetic */ SgB(RemoteListenableWorker remoteListenableWorker, int i) {
        this.A01 = remoteListenableWorker;
        this.A00 = i;
    }

    public final void ATJ(IWorkManagerImplCallback iWorkManagerImplCallback, Object obj) {
        RemoteListenableWorker remoteListenableWorker = this.A01;
        byte[] A012 = S83.A01(new ParcelableInterruptRequest(remoteListenableWorker.A01.A09.toString(), this.A00));
        IListenableWorkerImpl$Stub$Proxy iListenableWorkerImpl$Stub$Proxy = (IListenableWorkerImpl$Stub$Proxy) ((IListenableWorkerImpl) obj);
        int A03 = AnonymousClass0fD.A03(543651921);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IListenableWorkerImpl.A00);
            obtain.writeByteArray(A012);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            Pxi.A10(iListenableWorkerImpl$Stub$Proxy.A00, obtain, 2);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-984696325, A03);
        }
    }
}
