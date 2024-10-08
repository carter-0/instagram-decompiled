package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.63T  reason: invalid class name */
public final class AnonymousClass63T implements Handler.Callback {
    public static AnonymousClass63T A0F;
    public static final Status A0G = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0H = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0I = new Object();
    public long A00 = 10000;
    public AnonymousClass63b A01 = null;
    public C13637Te4 A02;
    public boolean A03 = false;
    public TelemetryData A04;
    public final Context A05;
    public final Handler A06;
    public final GoogleApiAvailability A07;
    public final C3024163f A08;
    public final Map A09 = new ConcurrentHashMap(5, 0.75f, 1);
    public final Set A0A = new 04u(0);
    public final AtomicInteger A0B = new AtomicInteger(1);
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final Set A0D = new 04u(0);
    public volatile boolean A0E = true;

    public static final void A05(AnonymousClass63E r9, AnonymousClass63T r10, C365498nD r11, int i) {
        long currentTimeMillis;
        long elapsedRealtime;
        int i2 = i;
        if (i != 0) {
            AnonymousClass63Q r4 = r9.A06;
            AnonymousClass63T r5 = r10;
            if (r10.A08()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = C295525oN.A00().A00;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.A03) {
                        boolean z = rootTelemetryConfiguration.A04;
                        AnonymousClass63w r2 = (AnonymousClass63w) r10.A09.get(r4);
                        if (r2 != null) {
                            AnonymousClass647 r1 = r2.A04;
                            if (r1 instanceof BaseGmsClient) {
                                BaseGmsClient baseGmsClient = (BaseGmsClient) r1;
                                if (baseGmsClient.A0Q != null && !baseGmsClient.CQT()) {
                                    ConnectionTelemetryConfiguration A002 = Sz0.A00(r2, baseGmsClient, i);
                                    if (A002 != null) {
                                        r2.A00++;
                                        z = A002.A03;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        if (!z) {
                            currentTimeMillis = 0;
                            elapsedRealtime = 0;
                            Sz0 sz0 = new Sz0(r4, r5, i2, currentTimeMillis, elapsedRealtime);
                            AnonymousClass9GD r22 = r11.A00;
                            Handler handler = r5.A06;
                            handler.getClass();
                            r22.A08(sz0, new Y4A(handler));
                        }
                    } else {
                        return;
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                elapsedRealtime = SystemClock.elapsedRealtime();
                Sz0 sz02 = new Sz0(r4, r5, i2, currentTimeMillis, elapsedRealtime);
                AnonymousClass9GD r222 = r11.A00;
                Handler handler2 = r5.A06;
                handler2.getClass();
                r222.A08(sz02, new Y4A(handler2));
            }
        }
    }

    public static Status A00(ConnectionResult connectionResult, AnonymousClass63Q r5) {
        return new Status(connectionResult.A02, connectionResult, 002.A0u("API: ", r5.A00.A02, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), 17);
    }

    public static AnonymousClass63T A01(Context context) {
        AnonymousClass63T r3;
        HandlerThread handlerThread;
        synchronized (A0I) {
            r3 = A0F;
            if (r3 == null) {
                synchronized (AnonymousClass63a.A07) {
                    handlerThread = AnonymousClass63a.A05;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        AnonymousClass0fe.A00(handlerThread2);
                        AnonymousClass63a.A05 = handlerThread2;
                        handlerThread2.start();
                        handlerThread = AnonymousClass63a.A05;
                    }
                }
                r3 = new AnonymousClass63T(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.A00);
                A0F = r3;
            }
        }
        return r3;
    }

    private final AnonymousClass63w A02(AnonymousClass63E r4) {
        Map map = this.A09;
        AnonymousClass63Q r2 = r4.A06;
        AnonymousClass63w r1 = (AnonymousClass63w) map.get(r2);
        if (r1 == null) {
            r1 = new AnonymousClass63w(r4, this);
            map.put(r2, r1);
        }
        if (r1.A04.requiresSignIn()) {
            this.A0D.add(r2);
        }
        r1.A09();
        return r1;
    }

    public static void A03() {
        synchronized (A0I) {
            AnonymousClass63T r1 = A0F;
            if (r1 != null) {
                r1.A0C.incrementAndGet();
                Handler handler = r1.A06;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Te4, X.63E] */
    private final void A04() {
        TelemetryData telemetryData = this.A04;
        if (telemetryData != null) {
            if (telemetryData.A01 > 0 || A08()) {
                C13637Te4 te4 = this.A02;
                C13637Te4 te42 = te4;
                if (te4 == null) {
                    ? r0 = new AnonymousClass63E(this.A05, (AnonymousClass63L) Sx3.A01, QpT.A00, AnonymousClass63N.A02);
                    this.A02 = r0;
                    te42 = r0;
                }
                te42.Cgn(telemetryData);
            }
            this.A04 = null;
        }
    }

    public final void A07(AnonymousClass63b r4) {
        synchronized (A0I) {
            if (this.A01 != r4) {
                this.A01 = r4;
                this.A0A.clear();
            }
            this.A0A.addAll(r4.A00);
        }
    }

    public final boolean A08() {
        if (this.A03) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C295525oN.A00().A00;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.A03) {
            return false;
        }
        int i = this.A08.A01.get(203400000, -1);
        if (i == -1 || i == 0) {
            return true;
        }
        return false;
    }

    public final boolean A09(ConnectionResult connectionResult, int i) {
        boolean z;
        PendingIntent pendingIntent;
        Intent A042;
        Boolean bool;
        GoogleApiAvailability googleApiAvailability = this.A07;
        Context context = this.A05;
        synchronized (C45196Cry.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = C45196Cry.A00;
            if (context2 == null || (bool = C45196Cry.A01) == null || context2 != applicationContext) {
                C45196Cry.A01 = null;
                z = applicationContext.getPackageManager().isInstantApp();
                C45196Cry.A01 = Boolean.valueOf(z);
                C45196Cry.A00 = applicationContext;
            } else {
                z = bool.booleanValue();
            }
        }
        if (z) {
            return false;
        }
        int i2 = connectionResult.A01;
        if ((i2 == 0 || (pendingIntent = connectionResult.A02) == null) && ((A042 = googleApiAvailability.A04(context, (String) null, i2)) == null || (pendingIntent = PendingIntent.getActivity(context, 0, A042, 201326592)) == null)) {
            return false;
        }
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra(Pxd.A00(839), pendingIntent);
        intent.putExtra(Pxd.A00(723), i);
        intent.putExtra(Pxd.A00(815), true);
        googleApiAvailability.A06(PendingIntent.getActivity(context, 0, intent, C9992Rkm.A00 | 134217728), context, i2);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [X.Te4, X.63E] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0230, code lost:
        if (r1.A02 != false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0232, code lost:
        r1.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0235, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x037c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d7, code lost:
        r3.APT(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01da, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            int r5 = r12.what
            r3 = 13
            r0 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r2 = "GoogleApiManager"
            r6 = 17
            r4 = 1
            r7 = 0
            switch(r5) {
                case 1: goto L_0x0026;
                case 2: goto L_0x001e;
                case 3: goto L_0x0059;
                case 4: goto L_0x0348;
                case 5: goto L_0x007d;
                case 6: goto L_0x00d0;
                case 7: goto L_0x0120;
                case 8: goto L_0x0348;
                case 9: goto L_0x0215;
                case 10: goto L_0x0128;
                case 11: goto L_0x014a;
                case 12: goto L_0x019a;
                case 13: goto L_0x0348;
                case 14: goto L_0x01df;
                case 15: goto L_0x01e7;
                case 16: goto L_0x0236;
                case 17: goto L_0x02bc;
                case 18: goto L_0x02c0;
                case 19: goto L_0x0383;
                default: goto L_0x0010;
            }
        L_0x0010:
            r0 = 602(0x25a, float:8.44E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = X.002.A0O(r0, r5)
            android.util.Log.w(r2, r0)
            return r7
        L_0x001e:
            java.lang.String r1 = "zab"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0026:
            java.lang.Object r2 = r12.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r4 != r2) goto L_0x0032
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x0032:
            r11.A00 = r0
            android.os.Handler r6 = r11.A06
            r5 = 12
            r6.removeMessages(r5)
            java.util.Map r0 = r11.A09
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0045:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x037c
            java.lang.Object r0 = r3.next()
            android.os.Message r2 = r6.obtainMessage(r5, r0)
            long r0 = r11.A00
            r6.sendMessageDelayed(r2, r0)
            goto L_0x0045
        L_0x0059:
            java.util.Map r0 = r11.A09
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x0063:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x037c
            java.lang.Object r1 = r2.next()
            X.63w r1 = (X.AnonymousClass63w) r1
            X.63T r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.AnonymousClass3Qk.A01(r0)
            r0 = 0
            r1.A01 = r0
            r1.A09()
            goto L_0x0063
        L_0x007d:
            int r8 = r12.arg1
            java.lang.Object r7 = r12.obj
            com.google.android.gms.common.ConnectionResult r7 = (com.google.android.gms.common.ConnectionResult) r7
            java.util.Map r0 = r11.A09
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x008d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r5 = r1.next()
            X.63w r5 = (X.AnonymousClass63w) r5
            int r0 = r5.A03
            if (r0 != r8) goto L_0x008d
            int r0 = r7.A01
            if (r0 != r3) goto L_0x00b8
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00
            java.lang.String r3 = "CANCELED"
            java.lang.String r2 = r7.A03
            java.lang.String r1 = "Error resolution was canceled by the user, original error message: "
            java.lang.String r0 = ": "
            java.lang.String r1 = X.002.A0u(r1, r3, r0, r2)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r6, r1)
        L_0x00b4:
            X.AnonymousClass63w.A01(r0, r5)
            return r4
        L_0x00b8:
            X.63Q r0 = r5.A05
            com.google.android.gms.common.api.Status r0 = A00(r7, r0)
            goto L_0x00b4
        L_0x00bf:
            java.lang.String r1 = "Could not find API instance "
            java.lang.String r0 = " while trying to fail enqueued calls."
            java.lang.String r1 = X.002.A0c(r1, r0, r8)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            android.util.Log.wtf(r2, r1, r0)
            return r4
        L_0x00d0:
            android.content.Context r3 = r11.A05
            android.content.Context r2 = r3.getApplicationContext()
            boolean r2 = r2 instanceof android.app.Application
            if (r2 == 0) goto L_0x037c
            android.content.Context r2 = r3.getApplicationContext()
            android.app.Application r2 = (android.app.Application) r2
            com.google.android.gms.common.api.internal.BackgroundDetector.A00(r2)
            com.google.android.gms.common.api.internal.BackgroundDetector r6 = com.google.android.gms.common.api.internal.BackgroundDetector.A04
            X.63v r3 = new X.63v
            r3.<init>(r11)
            monitor-enter(r6)
            java.util.ArrayList r2 = r6.A01     // Catch:{ all -> 0x011d }
            r2.add(r3)     // Catch:{ all -> 0x011d }
            monitor-exit(r6)     // Catch:{ all -> 0x011d }
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.A03
            boolean r2 = r5.get()
            if (r2 != 0) goto L_0x0112
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo
            r3.<init>()
            android.app.ActivityManager.getMyMemoryState(r3)
            boolean r2 = r5.getAndSet(r4)
            if (r2 != 0) goto L_0x0112
            int r3 = r3.importance
            r2 = 100
            if (r3 <= r2) goto L_0x0112
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A02
            r2.set(r4)
        L_0x0112:
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A02
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x037c
            r11.A00 = r0
            return r4
        L_0x011d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x011d }
            throw r0
        L_0x0120:
            java.lang.Object r0 = r12.obj
            X.63E r0 = (X.AnonymousClass63E) r0
            r11.A02(r0)
            return r4
        L_0x0128:
            java.util.Set r3 = r11.A0D
            java.util.Iterator r2 = r3.iterator()
        L_0x012e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0146
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r11.A09
            java.lang.Object r0 = r0.remove(r1)
            X.63w r0 = (X.AnonymousClass63w) r0
            if (r0 == 0) goto L_0x012e
            r0.A0A()
            goto L_0x012e
        L_0x0146:
            r3.clear()
            return r4
        L_0x014a:
            java.util.Map r1 = r11.A09
            java.lang.Object r0 = r12.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x037c
            java.lang.Object r0 = r12.obj
            java.lang.Object r3 = r1.get(r0)
            X.63w r3 = (X.AnonymousClass63w) r3
            X.63T r5 = r3.A0C
            android.os.Handler r2 = r5.A06
            X.AnonymousClass3Qk.A01(r2)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x037c
            X.63Q r1 = r3.A05
            r0 = 11
            r2.removeMessages(r0, r1)
            r0 = 9
            r2.removeMessages(r0, r1)
            r3.A02 = r7
            com.google.android.gms.common.GoogleApiAvailability r2 = r5.A07
            android.content.Context r1 = r5.A05
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r2.A03(r1, r0)
            r0 = 18
            if (r1 != r0) goto L_0x0195
            r2 = 21
            java.lang.String r1 = "Connection timed out waiting for Google Play services update to complete."
        L_0x0188:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            X.AnonymousClass63w.A01(r0, r3)
            X.647 r3 = r3.A04
            java.lang.String r0 = "Timing out connection while resuming."
            goto L_0x01d7
        L_0x0195:
            r2 = 22
            java.lang.String r1 = "API failed to connect while resuming due to an unknown error."
            goto L_0x0188
        L_0x019a:
            java.util.Map r1 = r11.A09
            java.lang.Object r0 = r12.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x037c
            java.lang.Object r0 = r12.obj
            java.lang.Object r2 = r1.get(r0)
            X.63w r2 = (X.AnonymousClass63w) r2
            X.63T r0 = r2.A0C
            android.os.Handler r0 = r0.A06
            X.AnonymousClass3Qk.A01(r0)
            X.647 r3 = r2.A04
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto L_0x037c
            java.util.Map r0 = r2.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x037c
            X.64J r1 = r2.A06
            java.util.Map r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01db
            java.util.Map r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01db
            java.lang.String r0 = "Timing out service connection."
        L_0x01d7:
            r3.APT(r0)
            return r4
        L_0x01db:
            X.AnonymousClass63w.A05(r2)
            return r4
        L_0x01df:
            java.lang.String r1 = "zaa"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x01e7:
            java.lang.Object r2 = r12.obj
            X.A9c r2 = (X.C39783A9c) r2
            java.util.Map r1 = r11.A09
            X.63Q r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x037c
            X.63Q r0 = r2.A01
            java.lang.Object r1 = r1.get(r0)
            X.63w r1 = (X.AnonymousClass63w) r1
            java.util.List r0 = r1.A07
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x037c
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x037c
            X.647 r0 = r1.A04
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0232
            X.AnonymousClass63w.A03(r1)
            return r4
        L_0x0215:
            java.util.Map r1 = r11.A09
            java.lang.Object r0 = r12.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x037c
            java.lang.Object r0 = r12.obj
            java.lang.Object r1 = r1.get(r0)
            X.63w r1 = (X.AnonymousClass63w) r1
            X.63T r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.AnonymousClass3Qk.A01(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x037c
        L_0x0232:
            r1.A09()
            return r4
        L_0x0236:
            java.lang.Object r2 = r12.obj
            X.A9c r2 = (X.C39783A9c) r2
            java.util.Map r1 = r11.A09
            X.63Q r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x037c
            X.63Q r0 = r2.A01
            java.lang.Object r10 = r1.get(r0)
            X.63w r10 = (X.AnonymousClass63w) r10
            java.util.List r0 = r10.A07
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L_0x037c
            X.63T r0 = r10.A0C
            android.os.Handler r1 = r0.A06
            r0 = 15
            r1.removeMessages(r0, r2)
            r0 = 16
            r1.removeMessages(r0, r2)
            com.google.android.gms.common.Feature r7 = r2.A00
            java.util.Queue r6 = r10.A09
            int r0 = r6.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r9 = r6.iterator()
        L_0x0273:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02a1
            java.lang.Object r8 = r9.next()
            X.S6l r8 = (X.C11033S6l) r8
            boolean r0 = r8 instanceof X.C8384Qpp
            if (r0 == 0) goto L_0x0273
            r0 = r8
            X.Qpp r0 = (X.C8384Qpp) r0
            com.google.android.gms.common.Feature[] r3 = r0.A05(r10)
            if (r3 == 0) goto L_0x0273
            int r2 = r3.length
            r1 = 0
        L_0x028e:
            if (r1 >= r2) goto L_0x0273
            r0 = r3[r1]
            boolean r0 = X.SA1.A01(r0, r7)
            if (r0 == 0) goto L_0x029e
            if (r1 < 0) goto L_0x0273
            r5.add(r8)
            goto L_0x0273
        L_0x029e:
            int r1 = r1 + 1
            goto L_0x028e
        L_0x02a1:
            int r3 = r5.size()
            r2 = 0
        L_0x02a6:
            if (r2 >= r3) goto L_0x037c
            java.lang.Object r1 = r5.get(r2)
            X.S6l r1 = (X.C11033S6l) r1
            r6.remove(r1)
            X.TRT r0 = new X.TRT
            r0.<init>(r7)
            r1.A03(r0)
            int r2 = r2 + 1
            goto L_0x02a6
        L_0x02bc:
            r11.A04()
            return r4
        L_0x02c0:
            java.lang.Object r5 = r12.obj
            X.Rwf r5 = (X.C10701Rwf) r5
            long r1 = r5.A02
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x02f4
            int r1 = r5.A00
            com.google.android.gms.common.internal.MethodInvocation r0 = r5.A03
            com.google.android.gms.common.internal.MethodInvocation[] r0 = new com.google.android.gms.common.internal.MethodInvocation[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.android.gms.common.internal.TelemetryData r6 = new com.google.android.gms.common.internal.TelemetryData
            r6.<init>(r1, r0)
            X.Te4 r0 = r11.A02
            if (r0 != 0) goto L_0x02f0
            android.content.Context r5 = r11.A05
            X.Sx3 r3 = X.Sx3.A01
            X.63K r2 = X.QpT.A00
            X.63N r1 = X.AnonymousClass63N.A02
            X.QpT r0 = new X.QpT
            r0.<init>((android.content.Context) r5, (X.AnonymousClass63L) r3, (X.AnonymousClass63K) r2, (X.AnonymousClass63N) r1)
            r11.A02 = r0
        L_0x02f0:
            r0.Cgn(r6)
            return r4
        L_0x02f4:
            com.google.android.gms.common.internal.TelemetryData r0 = r11.A04
            if (r0 == 0) goto L_0x0312
            java.util.List r2 = r0.A00
            int r1 = r0.A01
            int r0 = r5.A00
            if (r1 != r0) goto L_0x030a
            if (r2 == 0) goto L_0x0335
            int r1 = r2.size()
            int r0 = r5.A01
            if (r1 < r0) goto L_0x0335
        L_0x030a:
            android.os.Handler r0 = r11.A06
            r0.removeMessages(r6)
            r11.A04()
        L_0x0312:
            com.google.android.gms.common.internal.TelemetryData r0 = r11.A04
            if (r0 != 0) goto L_0x037c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.common.internal.MethodInvocation r0 = r5.A03
            r2.add(r0)
            int r1 = r5.A00
            com.google.android.gms.common.internal.TelemetryData r0 = new com.google.android.gms.common.internal.TelemetryData
            r0.<init>(r1, r2)
            r11.A04 = r0
            android.os.Handler r3 = r11.A06
            android.os.Message r2 = r3.obtainMessage(r6)
            long r0 = r5.A02
            r3.sendMessageDelayed(r2, r0)
            return r4
        L_0x0335:
            com.google.android.gms.common.internal.TelemetryData r2 = r11.A04
            com.google.android.gms.common.internal.MethodInvocation r1 = r5.A03
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x0344
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.A00 = r0
        L_0x0344:
            r0.add(r1)
            goto L_0x0312
        L_0x0348:
            java.lang.Object r3 = r12.obj
            X.Rut r3 = (X.C10599Rut) r3
            java.util.Map r1 = r11.A09
            X.63E r0 = r3.A01
            X.63Q r0 = r0.A06
            java.lang.Object r2 = r1.get(r0)
            X.63w r2 = (X.AnonymousClass63w) r2
            if (r2 != 0) goto L_0x0360
            X.63E r0 = r3.A01
            X.63w r2 = r11.A02(r0)
        L_0x0360:
            X.647 r0 = r2.A04
            boolean r0 = r0.requiresSignIn()
            if (r0 == 0) goto L_0x037d
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A0C
            int r1 = r0.get()
            int r0 = r3.A00
            if (r1 == r0) goto L_0x037d
            X.S6l r1 = r3.A02
            com.google.android.gms.common.api.Status r0 = A0G
            r1.A00(r0)
            r2.A0A()
        L_0x037c:
            return r4
        L_0x037d:
            X.S6l r0 = r3.A02
            r2.A0D(r0)
            return r4
        L_0x0383:
            r11.A03 = r7
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass63T.handleMessage(android.os.Message):boolean");
    }

    public AnonymousClass63T(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.A05 = context;
        C3024063e r3 = new C3024063e(looper, this);
        this.A06 = r3;
        this.A07 = googleApiAvailability;
        this.A08 = new C3024163f(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = DeviceProperties.A03;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            DeviceProperties.A03 = bool;
        }
        if (bool.booleanValue()) {
            this.A0E = false;
        }
        r3.sendMessage(r3.obtainMessage(6));
    }

    public final void A06(ConnectionResult connectionResult, int i) {
        if (!A09(connectionResult, i)) {
            Handler handler = this.A06;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
