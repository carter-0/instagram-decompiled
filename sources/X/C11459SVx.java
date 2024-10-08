package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SVx  reason: case insensitive filesystem */
public final class C11459SVx implements Handler.Callback, ServiceConnection {
    public Set A00 = AnonymousClass7TE.A1F();
    public final Context A01;
    public final Handler A02;
    public final Map A03 = AnonymousClass7TE.A1E();
    public final HandlerThread A04;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r12.A03 != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.C10715Rwt r12) {
        /*
            r11 = this;
            java.lang.String r3 = "NotifManCompat"
            r5 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r5)
            if (r0 == 0) goto L_0x000e
            java.util.ArrayDeque r0 = r12.A02
            r0.size()
        L_0x000e:
            java.util.ArrayDeque r4 = r12.A02
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x007b
            boolean r0 = r12.A03
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            android.content.Intent r0 = X.Pxe.A0G(r0)
            android.content.ComponentName r6 = r12.A04
            android.content.Intent r1 = r0.setComponent(r6)
            android.content.Context r2 = r11.A01
            r0 = 33
            boolean r0 = r2.bindService(r1, r11, r0)
            r12.A03 = r0
            if (r0 == 0) goto L_0x00f3
            r0 = 0
            r12.A00 = r0
        L_0x0035:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x003d
        L_0x0039:
            android.support.v4.app.INotificationSideChannel r0 = r12.A01
            if (r0 != 0) goto L_0x007c
        L_0x003d:
            android.os.Handler r7 = r11.A02
            android.content.ComponentName r6 = r12.A04
            boolean r0 = r7.hasMessages(r5, r6)
            if (r0 != 0) goto L_0x007b
            int r0 = r12.A00
            r2 = 1
            int r1 = r0 + 1
            r12.A00 = r1
            r0 = 6
            if (r1 <= r0) goto L_0x0105
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Giving up on delivering "
            r1.append(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r0 = " tasks to "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " after "
            r1.append(r0)
            int r0 = r12.A00
            r1.append(r0)
            java.lang.String r0 = " retries"
            X.Pxg.A1Q(r0, r3, r1)
            r4.clear()
        L_0x007b:
            return
        L_0x007c:
            java.lang.Object r0 = r4.peek()
            X.TZV r0 = (X.TZV) r0
            if (r0 == 0) goto L_0x00eb
            android.util.Log.isLoggable(r3, r5)     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            android.support.v4.app.INotificationSideChannel r10 = r12.A01     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            X.Sd6 r0 = (X.C11603Sd6) r0     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            java.lang.String r9 = r0.A02     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            int r8 = r0.A00     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            java.lang.String r2 = r0.A03     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            android.app.Notification r1 = r0.A01     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            android.support.v4.app.INotificationSideChannel$Stub$Proxy r10 = (android.support.v4.app.INotificationSideChannel$Stub$Proxy) r10     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            r0 = -2076004475(0xffffffff8442af85, float:-2.2885185E-36)
            int r7 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            java.lang.String r0 = android.support.v4.app.INotificationSideChannel.A00     // Catch:{ all -> 0x00c9 }
            r6.writeInterfaceToken(r0)     // Catch:{ all -> 0x00c9 }
            r6.writeString(r9)     // Catch:{ all -> 0x00c9 }
            r6.writeInt(r8)     // Catch:{ all -> 0x00c9 }
            r6.writeString(r2)     // Catch:{ all -> 0x00c9 }
            r0 = 0
            r2 = 1
            r6.writeInt(r2)     // Catch:{ all -> 0x00c9 }
            r1.writeToParcel(r6, r0)     // Catch:{ all -> 0x00c9 }
            android.os.IBinder r1 = r10.A00     // Catch:{ all -> 0x00c9 }
            r0 = 0
            r1.transact(r2, r6, r0, r2)     // Catch:{ all -> 0x00c9 }
            r6.recycle()     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            r0 = -969527797(0xffffffffc6362e0b, float:-11659.511)
            X.AnonymousClass0fD.A0A(r0, r7)     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            r4.remove()     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            goto L_0x007c
        L_0x00c9:
            r1 = move-exception
            r6.recycle()     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            r0 = 1140712066(0x43fde282, float:507.7696)
            X.AnonymousClass0fD.A0A(r0, r7)     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
            throw r1     // Catch:{ DeadObjectException -> 0x00d4, RemoteException -> 0x00d8 }
        L_0x00d4:
            android.util.Log.isLoggable(r3, r5)
            goto L_0x00eb
        L_0x00d8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "RemoteException communicating with "
            r1.append(r0)
            android.content.ComponentName r0 = r12.A04
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            android.util.Log.w(r3, r0, r2)
        L_0x00eb:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x007b
            goto L_0x003d
        L_0x00f3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unable to bind to listener "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r0, r1)
            android.util.Log.w(r3, r0)
            r2.unbindService(r11)
            goto L_0x0035
        L_0x0105:
            int r1 = r1 - r2
            int r2 = r2 << r1
            int r0 = r2 * 1000
            android.util.Log.isLoggable(r3, r5)
            android.os.Message r2 = r7.obtainMessage(r5, r6)
            long r0 = (long) r0
            r7.sendMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11459SVx.A00(X.Rwt):void");
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.support.v4.app.INotificationSideChannel$Stub$Proxy, java.lang.Object] */
    public final boolean handleMessage(Message message) {
        Set set;
        C10715Rwt rwt;
        INotificationSideChannel iNotificationSideChannel;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                C10337Rqa rqa = (C10337Rqa) message.obj;
                ComponentName componentName = rqa.A00;
                IBinder iBinder = rqa.A01;
                rwt = (C10715Rwt) this.A03.get(componentName);
                if (rwt == null) {
                    return true;
                }
                if (iBinder == null) {
                    iNotificationSideChannel = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.A00);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                        ? obj = new Object();
                        int A032 = AnonymousClass0fD.A03(219225009);
                        obj.A00 = iBinder;
                        AnonymousClass0fD.A0A(-1334049216, A032);
                        iNotificationSideChannel = obj;
                    } else {
                        iNotificationSideChannel = (INotificationSideChannel) queryLocalInterface;
                    }
                }
                rwt.A01 = iNotificationSideChannel;
                rwt.A00 = 0;
            } else if (i == 2) {
                C10715Rwt rwt2 = (C10715Rwt) this.A03.get(message.obj);
                if (rwt2 == null) {
                    return true;
                }
                if (rwt2.A03) {
                    this.A01.unbindService(this);
                    rwt2.A03 = false;
                }
                rwt2.A01 = null;
                return true;
            } else if (i != 3) {
                return false;
            } else {
                rwt = (C10715Rwt) this.A03.get(message.obj);
                if (rwt == null) {
                    return true;
                }
            }
            A00(rwt);
            return true;
        }
        Object obj2 = message.obj;
        Context context = this.A01;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (1Fs.A05) {
            if (string != null) {
                if (!string.equals(1Fs.A03)) {
                    HashSet hashSet = new HashSet(r3);
                    for (String unflattenFromString : Pxh.A1b(string, ":")) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    1Fs.A04 = hashSet;
                    1Fs.A03 = string;
                }
            }
            set = 1Fs.A04;
        }
        if (!set.equals(this.A00)) {
            this.A00 = set;
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(DbS.A09().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet A1F = AnonymousClass7TE.A1F();
            for (ResolveInfo next : queryIntentServices) {
                if (set.contains(next.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = next.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (next.serviceInfo.permission != null) {
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("Permission present on component ");
                        A1A.append(componentName2);
                        Pxg.A1Q(", not adding listener record.", "NotifManCompat", A1A);
                    } else {
                        A1F.add(componentName2);
                    }
                }
            }
            Iterator it = A1F.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                Map map = this.A03;
                if (!map.containsKey(componentName3)) {
                    Log.isLoggable("NotifManCompat", 3);
                    map.put(componentName3, new C10715Rwt(componentName3));
                }
            }
            Iterator A0u = AnonymousClass7TF.A0u(this.A03);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                if (!A1F.contains(A1J.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        A1J.getKey();
                    }
                    C10715Rwt rwt3 = (C10715Rwt) A1J.getValue();
                    if (rwt3.A03) {
                        context.unbindService(this);
                        rwt3.A03 = false;
                    }
                    rwt3.A01 = null;
                    A0u.remove();
                }
            }
        }
        Iterator A0v = AnonymousClass7TF.A0v(this.A03);
        while (A0v.hasNext()) {
            C10715Rwt rwt4 = (C10715Rwt) A0v.next();
            rwt4.A02.add(obj2);
            A00(rwt4);
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("NotifManCompat", 3);
        Pxe.A1N(this.A02, new C10337Rqa(componentName, iBinder), 1);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("NotifManCompat", 3);
        Pxe.A1N(this.A02, componentName, 2);
    }

    public C11459SVx(Context context) {
        this.A01 = context;
        HandlerThread A0I = Pxf.A0I("NotificationManagerCompat");
        this.A04 = A0I;
        A0I.start();
        this.A02 = new Handler(A0I.getLooper(), this);
    }
}
