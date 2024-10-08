package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.review.internal.zzd;
import com.google.android.play.core.review.internal.zzf;
import com.google.android.play.core.review.zzh;
import java.util.List;
import java.util.Map;

/* renamed from: X.TKz  reason: case insensitive filesystem */
public abstract class C13092TKz implements Runnable {
    public final C365498nD A00;

    public C13092TKz() {
        this.A00 = null;
    }

    public C13092TKz(C365498nD r1) {
        this.A00 = r1;
    }

    public final void run() {
        List<C13092TKz> list;
        IInterface iInterface;
        Map map;
        try {
            if (this instanceof Qy1) {
                Qy1 qy1 = (Qy1) this;
                try {
                    C11174SEa sEa = qy1.A01;
                    IInterface iInterface2 = sEa.A00.A01;
                    String str = sEa.A01;
                    Bundle A0a = AnonymousClass7TE.A0a();
                    synchronized (C10090RmS.class) {
                        try {
                            map = C10090RmS.A00;
                            C66580MXl.A1T("java", map, 11004);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    A0a.putInt("playcore_version_code", Pxg.A06("java", map));
                    if (map.containsKey("native")) {
                        A0a.putInt("playcore_native_version", Pxg.A06("native", map));
                    }
                    if (map.containsKey("unity")) {
                        A0a.putInt("playcore_unity_version", Pxg.A06("unity", map));
                    }
                    zzh zzh = new zzh(qy1.A00, sEa);
                    zzd zzd = (zzd) iInterface2;
                    int A03 = AnonymousClass0fD.A03(1007289266);
                    int A032 = AnonymousClass0fD.A03(961006206);
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    AnonymousClass0fD.A0A(-1288377358, A032);
                    obtain.writeString(str);
                    obtain.writeInt(1);
                    A0a.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(zzh);
                    int A033 = AnonymousClass0fD.A03(-638624634);
                    try {
                        zzd.A00.transact(2, obtain, (Parcel) null, 1);
                        obtain.recycle();
                        AnonymousClass0fD.A0A(-1620789150, A033);
                        AnonymousClass0fD.A0A(2042102170, A03);
                    } catch (Throwable th2) {
                        th = th2;
                        obtain.recycle();
                        AnonymousClass0fD.A0A(-1452337255, A033);
                        throw th;
                    }
                } catch (RemoteException e) {
                    C11228SGg sGg = C11174SEa.A02;
                    Object[] objArr = {qy1.A01.A01};
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", C11228SGg.A00(sGg.A00, "error requesting in-app review for %s", objArr), e);
                    }
                    qy1.A00.A02(C41845B3m.A0j(e));
                }
            } else if (this instanceof C8613Qxy) {
                SOS sos = ((C8613Qxy) this).A00.A00;
                sos.A06.A01("unlinkToDeath", new Object[0]);
                sos.A01.asBinder().unlinkToDeath(sos.A05, 0);
                sos.A01 = null;
                sos.A02 = false;
            } else {
                if (this instanceof Qy0) {
                    Qy0 qy0 = (Qy0) this;
                    SOS sos2 = qy0.A01.A00;
                    IBinder iBinder = qy0.A00;
                    if (iBinder == null) {
                        iInterface = null;
                    } else {
                        iInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                        if (!(iInterface instanceof zzf)) {
                            iInterface = new zzd(iBinder);
                        }
                    }
                    sos2.A01 = iInterface;
                    C11228SGg sGg2 = sos2.A06;
                    sGg2.A01("linkToDeath", new Object[0]);
                    try {
                        sos2.A01.asBinder().linkToDeath(sos2.A05, 0);
                    } catch (RemoteException e2) {
                        String A002 = AnonymousClass000.A00(1550);
                        if (Log.isLoggable("PlayCore", 6)) {
                            Log.e("PlayCore", 002.A0g(sGg2.A00, " : ", A002), e2);
                        }
                    }
                    sos2.A02 = false;
                    list = sos2.A09;
                    for (Runnable run : list) {
                        run.run();
                    }
                } else if (this instanceof C8612Qxx) {
                    SOS sos3 = ((C8612Qxx) this).A00;
                    if (sos3.A01 != null) {
                        sos3.A06.A01("Unbind from service.", new Object[0]);
                        sos3.A03.unbindService(sos3.A00);
                        sos3.A02 = false;
                        sos3.A01 = null;
                        sos3.A00 = null;
                    }
                    SOS.A00(sos3);
                    return;
                } else {
                    C8614Qxz qxz = (C8614Qxz) this;
                    SOS sos4 = qxz.A01;
                    C13092TKz tKz = qxz.A00;
                    if (sos4.A01 == null && !sos4.A02) {
                        C11228SGg sGg3 = sos4.A06;
                        sGg3.A01("Initiate binding to the service.", new Object[0]);
                        list = sos4.A09;
                        list.add(tKz);
                        SVN svn = new SVN(sos4);
                        sos4.A00 = svn;
                        sos4.A02 = true;
                        if (!sos4.A03.bindService(sos4.A04, svn, 1)) {
                            sGg3.A01("Failed to bind to the service.", new Object[0]);
                            sos4.A02 = false;
                            for (C13092TKz tKz2 : list) {
                                C13209TQa tQa = new C13209TQa();
                                C365498nD r0 = tKz2.A00;
                                if (r0 != null) {
                                    r0.A02(tQa);
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (sos4.A02) {
                        sos4.A06.A01("Waiting to bind to the service.", new Object[0]);
                        sos4.A09.add(tKz);
                        return;
                    } else {
                        tKz.run();
                        return;
                    }
                }
                list.clear();
            }
        } catch (Exception e3) {
            C365498nD r02 = this.A00;
            if (r02 != null) {
                r02.A02(e3);
            }
        }
    }
}
