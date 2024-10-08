package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.ICustomTabsService$Stub$Proxy;
import androidx.browser.customtabs.CustomTabsClient$2;

public abstract class SVM implements ServiceConnection {
    public Context A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [android.support.customtabs.ICustomTabsService$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.RRY] */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ICustomTabsService iCustomTabsService;
        int A03;
        Parcel obtain;
        Parcel obtain2;
        int A032;
        Parcel obtain3;
        Parcel obtain4;
        if (this.A00 != null) {
            if (iBinder == null) {
                iCustomTabsService = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.A00);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof ICustomTabsService)) {
                    ? obj = new Object();
                    int A033 = AnonymousClass0fD.A03(1358281000);
                    obj.A00 = iBinder;
                    AnonymousClass0fD.A0A(1189365140, A033);
                    iCustomTabsService = obj;
                } else {
                    iCustomTabsService = (ICustomTabsService) queryLocalInterface;
                }
            }
            SF1 sf1 = new SF1(componentName, this.A00, iCustomTabsService, this);
            QAW qaw = (QAW) this;
            try {
                ICustomTabsService$Stub$Proxy iCustomTabsService$Stub$Proxy = (ICustomTabsService$Stub$Proxy) sf1.A02;
                A032 = AnonymousClass0fD.A03(-88062666);
                obtain3 = Parcel.obtain();
                obtain4 = Parcel.obtain();
                obtain3.writeInterfaceToken(ICustomTabsService.A00);
                obtain3.writeLong(0);
                AnonymousClass7TH.A0N(iCustomTabsService$Stub$Proxy.A00, obtain3, obtain4, 2);
                obtain4.readInt();
                obtain4.recycle();
                obtain3.recycle();
                AnonymousClass0fD.A0A(-1467466138, A032);
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                obtain4.recycle();
                obtain3.recycle();
                AnonymousClass0fD.A0A(-1092528197, A032);
                throw th;
            }
            C12817T8h t8h = qaw.A01;
            CustomTabsClient$2 customTabsClient$2 = new CustomTabsClient$2(new Object(), sf1);
            C10506RtL rtL = null;
            try {
                ICustomTabsService iCustomTabsService2 = sf1.A02;
                ICustomTabsService$Stub$Proxy iCustomTabsService$Stub$Proxy2 = (ICustomTabsService$Stub$Proxy) iCustomTabsService2;
                A03 = AnonymousClass0fD.A03(113561412);
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
                obtain.writeInterfaceToken(ICustomTabsService.A00);
                obtain.writeStrongInterface(customTabsClient$2);
                IBinder iBinder2 = iCustomTabsService$Stub$Proxy2.A00;
                boolean z = false;
                if (Pxg.A02(iBinder2, obtain, obtain2, 3) != 0) {
                    z = true;
                }
                obtain2.recycle();
                obtain.recycle();
                AnonymousClass0fD.A0A(-134261549, A03);
                if (z) {
                    rtL = new C10506RtL(sf1.A00, customTabsClient$2, iCustomTabsService2);
                }
            } catch (RemoteException unused2) {
            } catch (Throwable th2) {
                obtain2.recycle();
                obtain.recycle();
                AnonymousClass0fD.A0A(1965144289, A03);
                throw th2;
            }
            t8h.A02 = rtL;
            if (rtL != null) {
                SO4 so4 = new SO4();
                C10506RtL rtL2 = t8h.A02;
                Intent intent = so4.A01;
                intent.setPackage(rtL2.A00.getPackageName());
                IBinder asBinder = rtL2.A01.asBinder();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putBinder("android.support.customtabs.extra.SESSION", asBinder);
                intent.putExtras(A0a);
                so4.A01().A00(t8h.A00, qaw.A00.A00());
                t8h.A03 = true;
                return;
            }
            SVM svm = t8h.A01;
            if (svm != null) {
                t8h.A00.unbindService(svm);
                t8h.A02 = null;
                t8h.A01 = null;
            }
            C12817T8h.A00(t8h);
            return;
        }
        throw AnonymousClass7TE.A0z("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
