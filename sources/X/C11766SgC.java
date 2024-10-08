package X;

import android.os.Parcel;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;

/* renamed from: X.SgC  reason: case insensitive filesystem */
public final class C11766SgC implements C13513Tbe {
    public final /* synthetic */ AnonymousClass385 A00;
    public final /* synthetic */ RemoteListenableWorker A01;
    public final /* synthetic */ String A02;

    public C11766SgC(AnonymousClass385 r1, RemoteListenableWorker remoteListenableWorker, String str) {
        this.A01 = remoteListenableWorker;
        this.A00 = r1;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void ATJ(IWorkManagerImplCallback iWorkManagerImplCallback, Object obj) {
        AnonymousClass3DG CGi = this.A00.A04.A05().CGi(this.A02);
        RemoteListenableWorker remoteListenableWorker = this.A01;
        byte[] A012 = S83.A01(new ParcelableRemoteWorkRequest(remoteListenableWorker.A01, CGi.A0I));
        IListenableWorkerImpl$Stub$Proxy iListenableWorkerImpl$Stub$Proxy = (IListenableWorkerImpl$Stub$Proxy) ((IListenableWorkerImpl) obj);
        int A03 = AnonymousClass0fD.A03(427052451);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IListenableWorkerImpl.A00);
            obtain.writeByteArray(A012);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            Pxi.A0z(iListenableWorkerImpl$Stub$Proxy.A00, obtain);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-1028988993, A03);
        }
    }
}
