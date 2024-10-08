package androidx.room;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C51968G9o;
import X.Pxe;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;

public final class MultiInstanceInvalidationService$binder$1 extends Binder implements IMultiInstanceInvalidationService {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this();
        this.A00 = multiInstanceInvalidationService;
        AnonymousClass0fD.A0A(90552005, AnonymousClass0fD.A03(-1697554461));
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1698239304, AnonymousClass0fD.A03(-1788130953));
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int i4;
        int i5;
        int A03;
        Parcel obtain;
        int A032 = AnonymousClass0fD.A03(1241636157);
        String str = IMultiInstanceInvalidationService.A00;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel3.enforceInterface(str);
                if (i == 1) {
                    IMultiInstanceInvalidationCallback A002 = MultiInstanceInvalidationClient$callback$1.A00(parcel3.readStrongBinder());
                    String readString = parcel3.readString();
                    int A0D = AnonymousClass7TG.A0D(A002, 1756970826);
                    int i6 = 0;
                    if (readString == null) {
                        i4 = 557018806;
                    } else {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
                        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
                        synchronized (remoteCallbackList) {
                            try {
                                int i7 = multiInstanceInvalidationService.A00 + 1;
                                multiInstanceInvalidationService.A00 = i7;
                                Integer valueOf = Integer.valueOf(i7);
                                if (remoteCallbackList.register(A002, valueOf)) {
                                    multiInstanceInvalidationService.A02.put(valueOf, readString);
                                    i6 = i7;
                                } else {
                                    multiInstanceInvalidationService.A00--;
                                }
                            } catch (Throwable th) {
                                AnonymousClass0fD.A0A(935918832, A0D);
                                throw th;
                            }
                        }
                        i4 = 37833664;
                    }
                    AnonymousClass0fD.A0A(i4, A0D);
                    parcel4.writeNoException();
                    parcel4.writeInt(i6);
                } else if (i == 2) {
                    IMultiInstanceInvalidationCallback A003 = MultiInstanceInvalidationClient$callback$1.A00(parcel3.readStrongBinder());
                    int readInt = parcel3.readInt();
                    int A0D2 = AnonymousClass7TG.A0D(A003, 685382538);
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.A00;
                    RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.A01;
                    synchronized (remoteCallbackList2) {
                        try {
                            remoteCallbackList2.unregister(A003);
                            multiInstanceInvalidationService2.A02.remove(Integer.valueOf(readInt));
                        } catch (Throwable th2) {
                            AnonymousClass0fD.A0A(273753889, A0D2);
                            throw th2;
                        }
                    }
                    AnonymousClass0fD.A0A(1519209530, A0D2);
                    parcel4.writeNoException();
                } else if (i == 3) {
                    int readInt2 = parcel3.readInt();
                    String[] createStringArray = parcel3.createStringArray();
                    int A033 = AnonymousClass0fD.A03(-140073984);
                    0qQ.A0B(createStringArray, 1);
                    MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.A00;
                    RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.A01;
                    synchronized (remoteCallbackList3) {
                        try {
                            Map map = multiInstanceInvalidationService3.A02;
                            String str2 = (String) C51968G9o.A10(map, readInt2);
                            if (str2 == null) {
                                Log.w("ROOM", "Remote invalidation client ID not registered");
                                i5 = -1045868061;
                            } else {
                                int beginBroadcast = remoteCallbackList3.beginBroadcast();
                                int i8 = 0;
                                while (i8 < beginBroadcast) {
                                    try {
                                        Object broadcastCookie = remoteCallbackList3.getBroadcastCookie(i8);
                                        0qQ.A0C(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                                        int A09 = Pxe.A09(broadcastCookie);
                                        String str3 = (String) C51968G9o.A10(map, A09);
                                        if (readInt2 != A09 && str2.equals(str3)) {
                                            try {
                                                IMultiInstanceInvalidationCallback$Stub$Proxy iMultiInstanceInvalidationCallback$Stub$Proxy = (IMultiInstanceInvalidationCallback$Stub$Proxy) ((IMultiInstanceInvalidationCallback) remoteCallbackList3.getBroadcastItem(i8));
                                                A03 = AnonymousClass0fD.A03(1388715494);
                                                obtain = Parcel.obtain();
                                                obtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.A00);
                                                obtain.writeStringArray(createStringArray);
                                                iMultiInstanceInvalidationCallback$Stub$Proxy.A00.transact(1, obtain, (Parcel) null, 1);
                                                obtain.recycle();
                                                AnonymousClass0fD.A0A(1465223271, A03);
                                            } catch (RemoteException e) {
                                                Log.w("ROOM", "Error invoking a remote callback", e);
                                            } catch (Throwable th3) {
                                                obtain.recycle();
                                                AnonymousClass0fD.A0A(-1710716750, A03);
                                                throw th3;
                                            }
                                        }
                                        i8++;
                                    } catch (Throwable th4) {
                                        remoteCallbackList3.finishBroadcast();
                                        AnonymousClass0fD.A0A(396209090, A033);
                                        throw th4;
                                    }
                                }
                                remoteCallbackList3.finishBroadcast();
                                i5 = 236870985;
                            }
                        } catch (Throwable th5) {
                            AnonymousClass0fD.A0A(1899608479, A033);
                            throw th5;
                        }
                    }
                    AnonymousClass0fD.A0A(i5, A033);
                }
                i3 = 1261623556;
            } else if (i == 1598968902) {
                parcel4.writeString(str);
                i3 = -238232284;
            }
            AnonymousClass0fD.A0A(i3, A032);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel3, parcel4, i2);
        AnonymousClass0fD.A0A(-1270099336, A032);
        return onTransact;
    }

    public MultiInstanceInvalidationService$binder$1() {
        int A03 = AnonymousClass0fD.A03(-534289645);
        attachInterface(this, IMultiInstanceInvalidationService.A00);
        AnonymousClass0fD.A0A(-2061017608, A03);
    }
}
