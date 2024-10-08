package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.integrity.s;
import com.google.android.play.integrity.internal.f;
import com.google.android.play.integrity.internal.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class TL4 implements Runnable {
    public final C365498nD A00;

    public TL4() {
        this.A00 = null;
    }

    public TL4(C365498nD r1) {
        this.A00 = r1;
    }

    public final void run() {
        List<TL4> list;
        Parcel obtain;
        int A03;
        IInterface iInterface;
        try {
            if (this instanceof C8619QyD) {
                C8619QyD qyD = (C8619QyD) this;
                SOT sot = qyD.A01.A00;
                IBinder iBinder = qyD.A00;
                if (iBinder == null) {
                    iInterface = null;
                } else {
                    iInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    if (!(iInterface instanceof h)) {
                        iInterface = new f(iBinder);
                    }
                }
                sot.A01 = iInterface;
                C11229SGh sGh = sot.A06;
                sGh.A01("linkToDeath", new Object[0]);
                try {
                    sot.A01.asBinder().linkToDeath(sot.A05, 0);
                } catch (RemoteException e) {
                    String A002 = AnonymousClass000.A00(1550);
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", 002.A0g(sGh.A00, " : ", A002), e);
                    }
                }
                sot.A02 = false;
                list = sot.A09;
                for (Runnable run : list) {
                    run.run();
                }
            } else if (this instanceof C8618QyC) {
                C8618QyC qyC = (C8618QyC) this;
                SOT sot2 = qyC.A01;
                TL4 tl4 = qyC.A00;
                if (sot2.A01 == null && !sot2.A02) {
                    C11229SGh sGh2 = sot2.A06;
                    sGh2.A01("Initiate binding to the service.", new Object[0]);
                    list = sot2.A09;
                    list.add(tl4);
                    SVO svo = new SVO(sot2);
                    sot2.A00 = svo;
                    sot2.A02 = true;
                    if (!sot2.A03.bindService(sot2.A04, svo, 1)) {
                        sGh2.A01("Failed to bind to the service.", new Object[0]);
                        sot2.A02 = false;
                        for (TL4 A003 : list) {
                            A003.A00(new C13210TQb());
                        }
                    } else {
                        return;
                    }
                } else if (sot2.A02) {
                    sot2.A06.A01("Waiting to bind to the service.", new Object[0]);
                    sot2.A09.add(tl4);
                    return;
                } else {
                    tl4.run();
                    return;
                }
            } else if (this instanceof C8620QyE) {
                C8620QyE qyE = (C8620QyE) this;
                try {
                    C10613Rv7 rv7 = qyE.A02;
                    IInterface iInterface2 = rv7.A01.A01;
                    byte[] bArr = qyE.A03;
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("package.name", rv7.A02);
                    A0a.putByteArray("nonce", bArr);
                    A0a.putInt("playcore.integrity.version.major", 1);
                    A0a.putInt("playcore.integrity.version.minor", 1);
                    A0a.putInt("playcore.integrity.version.patch", 0);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    A1C.add(new C8615Qy9(System.currentTimeMillis()));
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    Iterator it = A1C.iterator();
                    while (it.hasNext()) {
                        Bundle A0a2 = AnonymousClass7TE.A0a();
                        A0a2.putInt("event_type", 3);
                        A0a2.putLong("event_timestamp", ((C8615Qy9) ((RPY) it.next())).A00);
                        A1C2.add(A0a2);
                    }
                    A0a.putParcelableArrayList("event_timestamps", AnonymousClass7TE.A1D(A1C2));
                    s sVar = new s(qyE.A00, rv7);
                    f fVar = (f) iInterface2;
                    int A032 = AnonymousClass0fD.A03(-1142241991);
                    int A033 = AnonymousClass0fD.A03(495236924);
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    AnonymousClass0fD.A0A(-1299367711, A033);
                    obtain.writeInt(1);
                    A0a.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(sVar);
                    A03 = AnonymousClass0fD.A03(581613889);
                    fVar.A00.transact(2, obtain, (Parcel) null, 1);
                    obtain.recycle();
                    AnonymousClass0fD.A0A(-2122573271, A03);
                    AnonymousClass0fD.A0A(-1909476450, A032);
                    return;
                } catch (RemoteException e2) {
                    C11229SGh sGh3 = qyE.A02.A00;
                    Object[] objArr = {qyE.A01};
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", C11229SGh.A00(sGh3.A00, "requestIntegrityToken(%s)", objArr), e2);
                    }
                    qyE.A00.A02(new C8360QpI(-100, e2));
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    AnonymousClass0fD.A0A(-1965590401, A03);
                    throw th;
                }
            } else if (this instanceof C8617QyB) {
                SOT sot3 = ((C8617QyB) this).A00.A00;
                sot3.A06.A01("unlinkToDeath", new Object[0]);
                sot3.A01.asBinder().unlinkToDeath(sot3.A05, 0);
                sot3.A01 = null;
                sot3.A02 = false;
                return;
            } else {
                SOT sot4 = ((C8616QyA) this).A00;
                if (sot4.A01 != null) {
                    sot4.A06.A01("Unbind from service.", new Object[0]);
                    sot4.A03.unbindService(sot4.A00);
                    sot4.A02 = false;
                    sot4.A01 = null;
                    sot4.A00 = null;
                }
                SOT.A00(sot4);
                return;
            }
            list.clear();
        } catch (Exception e3) {
            A00(e3);
        }
    }

    public void A00(Exception exc) {
        C365498nD r0 = this.A00;
        if (r0 != null) {
            r0.A02(exc);
        }
    }
}
