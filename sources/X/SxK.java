package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbbd;

public final /* synthetic */ class SxK implements C13636Te2 {
    public final /* synthetic */ QpS A00;

    public /* synthetic */ SxK(QpS qpS) {
        this.A00 = qpS;
    }

    public final void accept(Object obj, Object obj2) {
        QpS qpS = this.A00;
        zbbd zbbd = new zbbd((C365498nD) obj2);
        zba zba = (zba) ((BaseGmsClient) obj).A03();
        String str = qpS.A00;
        int A03 = AnonymousClass0fD.A03(-937287152);
        int A032 = AnonymousClass0fD.A03(1625149835);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(zba.A00);
        AnonymousClass0fD.A0A(-135530439, A032);
        Pxf.A16(zbbd, obtain);
        obtain.writeString(str);
        zba.A01(obtain, 2);
        AnonymousClass0fD.A0A(-718293137, A03);
    }
}
