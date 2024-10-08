package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.zzbm;
import com.google.android.play.core.splitinstall.internal.zzbo;
import com.google.android.play.core.splitinstall.zzbh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8nF  reason: invalid class name and case insensitive filesystem */
public abstract class C365518nF implements Runnable {
    public final C365498nD A00;

    public C365518nF() {
        this.A00 = null;
    }

    public C365518nF(C365498nD r1) {
        this.A00 = r1;
    }

    public final void run() {
        C365498nD r1;
        RuntimeException runtimeException;
        IInterface iInterface;
        try {
            if (this instanceof C379249Tc) {
                C70082Jk r5 = ((C379249Tc) this).A00;
                synchronized (r5.A07) {
                    try {
                        AtomicInteger atomicInteger = r5.A0B;
                        if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                            if (r5.A01 != null) {
                                r5.A06.A03("Unbind from service.", new Object[0]);
                                r5.A03.unbindService(r5.A00);
                                r5.A02 = false;
                                r5.A01 = null;
                                r5.A00 = null;
                            }
                            C70082Jk.A00(r5);
                        } else {
                            r5.A06.A03("Leaving the connection open for other ongoing calls.", new Object[0]);
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } else if (this instanceof C365528nG) {
                C365528nG r4 = (C365528nG) this;
                C70082Jk r6 = r4.A01;
                synchronized (r6.A07) {
                    try {
                        C365498nD r2 = r4.A00;
                        r6.A0A.add(r2);
                        r2.A00.A03(new C365548nI(r2, r6));
                        if (r6.A0B.getAndIncrement() > 0) {
                            r6.A06.A03("Already connected to the service.", new Object[0]);
                        }
                        C365518nF r42 = r4.A02;
                        if (r6.A01 == null && !r6.A02) {
                            2Jh r8 = r6.A06;
                            r8.A03("Initiate binding to the service.", new Object[0]);
                            List<C365518nF> list = r6.A09;
                            list.add(r42);
                            C365598nN r43 = new C365598nN(r6);
                            r6.A00 = r43;
                            r6.A02 = true;
                            if (!r6.A03.bindService(r6.A04, r43, 1)) {
                                r8.A03("Failed to bind to the service.", new Object[0]);
                                r6.A02 = false;
                                for (C365518nF r0 : list) {
                                    C41512AvF avF = new C41512AvF();
                                    C365498nD r02 = r0.A00;
                                    if (r02 != null) {
                                        r02.A02(avF);
                                    }
                                }
                                list.clear();
                            }
                        } else if (r6.A02) {
                            r6.A06.A03("Waiting to bind to the service.", new Object[0]);
                            r6.A09.add(r42);
                        } else {
                            r42.run();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } else if (this instanceof C365508nE) {
                C365508nE r44 = (C365508nE) this;
                try {
                    2Jg r22 = r44.A01;
                    IInterface iInterface2 = r22.A00.A01;
                    String str = r22.A01;
                    ArrayList A01 = 2Jg.A01(r44.A02);
                    Bundle bundle = new Bundle();
                    bundle.putInt("playcore_version_code", 11004);
                    zzbh zzbh = new zzbh(r44.A00, r22);
                    AnonymousClass0fD.A0A(880255504, AnonymousClass0fD.A03(371321985));
                    zzbm zzbm = (zzbm) iInterface2;
                    int A03 = AnonymousClass0fD.A03(-1687629948);
                    Parcel A002 = zzbm.A00();
                    A002.writeString(str);
                    A002.writeTypedList(A01);
                    A002.writeInt(1);
                    bundle.writeToParcel(A002, 0);
                    A002.writeStrongBinder(zzbh);
                    zzbm.A01(A002, 8);
                    AnonymousClass0fD.A0A(1282849471, A03);
                } catch (RemoteException e) {
                    2Jg.A02.A05(e, "deferredInstall(%s)", new Object[]{r44.A02});
                    r1 = r44.A00;
                    runtimeException = new RuntimeException(e);
                    r1.A02(runtimeException);
                }
            } else if (this instanceof AnonymousClass9TS) {
                AnonymousClass9TS r45 = (AnonymousClass9TS) this;
                C70082Jk r52 = r45.A01.A00;
                IBinder iBinder = r45.A00;
                if (iBinder == null) {
                    iInterface = null;
                } else {
                    iInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
                    if (!(iInterface instanceof zzbo)) {
                        iInterface = new zzbm(iBinder);
                    }
                }
                r52.A01 = iInterface;
                2Jh r46 = r52.A06;
                r46.A03("linkToDeath", new Object[0]);
                try {
                    r52.A01.asBinder().linkToDeath(r52.A05, 0);
                } catch (RemoteException e2) {
                    r46.A05(e2, AnonymousClass000.A00(1550), new Object[0]);
                }
                r52.A02 = false;
                List<Runnable> list2 = r52.A09;
                for (Runnable run : list2) {
                    run.run();
                }
                list2.clear();
            } else if (this instanceof C365718nZ) {
                C365718nZ r47 = (C365718nZ) this;
                Collection collection = r47.A03;
                ArrayList A012 = 2Jg.A01(collection);
                Collection<String> collection2 = r47.A04;
                ArrayList arrayList = new ArrayList(collection2.size());
                for (String putString : collection2) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("language", putString);
                    arrayList.add(bundle2);
                }
                A012.addAll(arrayList);
                try {
                    List<C365708nY> list3 = r47.A01.A00;
                    list3.add(new C365698nX(2, System.currentTimeMillis()));
                    2Jg r23 = r47.A02;
                    IInterface iInterface3 = r23.A00.A01;
                    String str2 = r23.A01;
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("playcore_version_code", 11004);
                    ArrayList arrayList2 = new ArrayList();
                    for (C365708nY r10 : list3) {
                        Bundle bundle4 = new Bundle();
                        C365698nX r102 = (C365698nX) r10;
                        bundle4.putInt("event_type", r102.A00);
                        bundle4.putLong("event_timestamp", r102.A01);
                        arrayList2.add(bundle4);
                    }
                    bundle3.putParcelableArrayList("event_timestamps", new ArrayList(arrayList2));
                    zzbh zzbh2 = new zzbh(r47.A00, r23);
                    AnonymousClass0fD.A0A(-904801938, AnonymousClass0fD.A03(1330804082));
                    zzbm zzbm2 = (zzbm) iInterface3;
                    int A032 = AnonymousClass0fD.A03(377966662);
                    Parcel A003 = zzbm2.A00();
                    A003.writeString(str2);
                    A003.writeTypedList(A012);
                    A003.writeInt(1);
                    bundle3.writeToParcel(A003, 0);
                    A003.writeStrongBinder(zzbh2);
                    zzbm2.A01(A003, 2);
                    AnonymousClass0fD.A0A(1854901886, A032);
                } catch (RemoteException e3) {
                    2Jg.A02.A05(e3, "startInstall(%s,%s)", new Object[]{collection, collection2});
                    r1 = r47.A00;
                    runtimeException = new RuntimeException(e3);
                    r1.A02(runtimeException);
                }
            } else if (this instanceof C365648nS) {
                C365648nS r48 = (C365648nS) this;
                try {
                    2Jg r12 = r48.A01;
                    IInterface iInterface4 = r12.A00.A01;
                    String str3 = r12.A01;
                    zzbh zzbh3 = new zzbh(r48.A00, r12);
                    AnonymousClass0fD.A0A(2043325433, AnonymousClass0fD.A03(-83112058));
                    zzbm zzbm3 = (zzbm) iInterface4;
                    int A033 = AnonymousClass0fD.A03(-414491177);
                    Parcel A004 = zzbm3.A00();
                    A004.writeString(str3);
                    A004.writeStrongBinder(zzbh3);
                    zzbm3.A01(A004, 6);
                    AnonymousClass0fD.A0A(2065796331, A033);
                } catch (RemoteException e4) {
                    2Jg.A02.A05(e4, "getSessionStates", new Object[0]);
                    r1 = r48.A00;
                    runtimeException = new RuntimeException(e4);
                    r1.A02(runtimeException);
                }
            } else if (this instanceof C383869gO) {
                C383869gO r49 = (C383869gO) this;
                try {
                    2Jg r24 = r49.A02;
                    IInterface iInterface5 = r24.A00.A01;
                    String str4 = r24.A01;
                    int i = r49.A00;
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt("playcore_version_code", 11004);
                    zzbh zzbh4 = new zzbh(r49.A01, r24);
                    AnonymousClass0fD.A0A(-1826281722, AnonymousClass0fD.A03(2144096588));
                    zzbm zzbm4 = (zzbm) iInterface5;
                    int A034 = AnonymousClass0fD.A03(676484940);
                    Parcel A005 = zzbm4.A00();
                    A005.writeString(str4);
                    A005.writeInt(i);
                    A005.writeInt(1);
                    bundle5.writeToParcel(A005, 0);
                    A005.writeStrongBinder(zzbh4);
                    zzbm4.A01(A005, 4);
                    AnonymousClass0fD.A0A(-1017211677, A034);
                } catch (RemoteException e5) {
                    2Jg.A02.A05(e5, "cancelInstall(%d)", new Object[]{Integer.valueOf(r49.A00)});
                    r1 = r49.A01;
                    runtimeException = new RuntimeException(e5);
                    r1.A02(runtimeException);
                }
            } else if (this instanceof C383859gN) {
                C383859gN r410 = (C383859gN) this;
                try {
                    2Jg r25 = r410.A01;
                    IInterface iInterface6 = r25.A00.A01;
                    String str5 = r25.A01;
                    ArrayList A013 = 2Jg.A01(r410.A02);
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt("playcore_version_code", 11004);
                    zzbh zzbh5 = new zzbh(r410.A00, r25);
                    AnonymousClass0fD.A0A(-1474874644, AnonymousClass0fD.A03(892919642));
                    zzbm zzbm5 = (zzbm) iInterface6;
                    int A035 = AnonymousClass0fD.A03(33175400);
                    Parcel A006 = zzbm5.A00();
                    A006.writeString(str5);
                    A006.writeTypedList(A013);
                    A006.writeInt(1);
                    bundle6.writeToParcel(A006, 0);
                    A006.writeStrongBinder(zzbh5);
                    zzbm5.A01(A006, 7);
                    AnonymousClass0fD.A0A(202285664, A035);
                } catch (RemoteException e6) {
                    2Jg.A02.A05(e6, "deferredUninstall(%s)", new Object[]{r410.A02});
                    r1 = r410.A00;
                    runtimeException = new RuntimeException(e6);
                    r1.A02(runtimeException);
                }
            } else {
                C70082Jk r411 = ((C383849gM) this).A00.A00;
                r411.A06.A03("unlinkToDeath", new Object[0]);
                r411.A01.asBinder().unlinkToDeath(r411.A05, 0);
                r411.A01 = null;
                r411.A02 = false;
            }
        } catch (Exception e7) {
            C365498nD r03 = this.A00;
            if (r03 != null) {
                r03.A02(e7);
            }
        }
    }
}
