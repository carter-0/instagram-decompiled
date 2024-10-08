package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class Q5Y extends Service {
    public Messenger A00;
    public ExecutorService A01;
    public int A02;
    public final Set A03 = AnonymousClass7TE.A1F();

    public static TL5 A00(Bundle bundle, Q5Y q5y, C13555TcR tcR, String str) {
        Set set = q5y.A03;
        synchronized (set) {
            if (set.add(str)) {
                return new TL5(bundle, q5y, tcR, str);
            }
            0KC.A0P("GcmTaskService", "%s: Task already running, won't start another", new Object[]{q5y.getPackageName()});
            return null;
        }
    }

    private void A01(int i) {
        Set set = this.A03;
        synchronized (set) {
            this.A02 = i;
            if (set.isEmpty()) {
                stopSelf(this.A02);
            }
        }
    }

    public static void A02(Q5Y q5y, String str) {
        Set set = q5y.A03;
        synchronized (set) {
            set.remove(str);
            if (set.isEmpty()) {
                q5y.stopSelf(q5y.A02);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        if (intent == null || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            return null;
        }
        synchronized (this) {
            messenger = this.A00;
            if (messenger == null) {
                messenger = new Messenger(new Q7q(new ComponentName(this, getClass()), Looper.getMainLooper(), this));
                this.A00 = messenger;
            }
        }
        return messenger.getBinder();
    }

    public void onCreate() {
        int A04 = AnonymousClass0fD.A04(-1748514931);
        super.onCreate();
        AnonymousClass0fD.A0B(1901157359, A04);
    }

    public final void onDestroy() {
        ExecutorService executorService;
        int A04 = AnonymousClass0fD.A04(-2049527650);
        super.onDestroy();
        synchronized (this) {
            executorService = this.A01;
            if (executorService == null) {
                executorService = Executors.newFixedThreadPool(2, new TOI());
                this.A01 = executorService;
            }
        }
        if (executorService != null) {
            List<Runnable> shutdownNow = executorService.shutdownNow();
            if (!shutdownNow.isEmpty()) {
                0KC.A0O("GcmTaskService", "Shutting down, but not all tasks are finished executing. Remaining: %d", AnonymousClass7TF.A1b(shutdownNow.size()));
            }
        }
        AnonymousClass0fD.A0B(96572628, A04);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.C9928Rjh.A00 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = -1794414635(0xffffffff950b67d5, float:-2.8152735E-26)
            r6 = r19
            r2 = r20
            int r4 = X.Pxg.A01(r6, r2, r0)
            r0 = r21
            r5 = r22
            super.onStartCommand(r2, r0, r5)     // Catch:{ all -> 0x01c2 }
            r18 = 2
            if (r20 != 0) goto L_0x0020
            r6.A01(r5)
            r0 = -812906177(0xffffffffcf8c093f, float:-4.6988324E9)
        L_0x001c:
            X.AnonymousClass0fD.A0B(r0, r4)
            return r18
        L_0x0020:
            java.lang.String r1 = r2.getAction()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "com.google.android.gms.gcm.ACTION_TASK_READY"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x019e
            android.os.Bundle r0 = r2.getExtras()     // Catch:{ all -> 0x01c2 }
            r11 = 0
            if (r0 != 0) goto L_0x003c
            java.lang.String r1 = "GcmTaskService"
            java.lang.String r0 = "Null Intent passed, terminating"
            X.0KC.A0C(r1, r0)     // Catch:{ all -> 0x01c2 }
            goto L_0x01ad
        L_0x003c:
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x01c2 }
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ all -> 0x01c2 }
            r9 = 0
            r0.writeToParcel(r2, r9)     // Catch:{ all -> 0x01c2 }
            r2.setDataPosition(r9)     // Catch:{ all -> 0x01c2 }
            int r0 = r2.readInt()     // Catch:{ all -> 0x01bd }
            java.lang.String r8 = "No callback received, terminating"
            r7 = 0
            if (r0 > 0) goto L_0x005b
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.0KC.A0D(r0, r8)     // Catch:{ all -> 0x01bd }
            goto L_0x0178
        L_0x005b:
            int r1 = r2.readInt()     // Catch:{ all -> 0x01bd }
            r0 = 1279544898(0x4c444e42, float:5.146036E7)
            if (r1 == r0) goto L_0x006b
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.0KC.A0D(r0, r8)     // Catch:{ all -> 0x01bd }
            goto L_0x0178
        L_0x006b:
            int r17 = r2.readInt()     // Catch:{ all -> 0x01bd }
            r3 = 0
            r1 = r11
        L_0x0071:
            r0 = r17
            if (r3 >= r0) goto L_0x016c
            java.lang.Class<X.Rjh> r16 = X.C9928Rjh.class
            monitor-enter(r16)     // Catch:{ all -> 0x01bd }
            java.lang.Boolean r0 = X.C9928Rjh.A00     // Catch:{ all -> 0x01ba }
            if (r0 != 0) goto L_0x00cd
            android.os.Bundle r14 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x01ba }
            java.lang.String r13 = "key"
            java.lang.String r0 = "value"
            r14.putString(r13, r0)     // Catch:{ all -> 0x01ba }
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ all -> 0x01ba }
            r14.writeToParcel(r12, r9)     // Catch:{ all -> 0x01ba }
            r12.setDataPosition(r9)     // Catch:{ all -> 0x01ba }
            int r0 = r12.readInt()     // Catch:{ RuntimeException -> 0x00c6 }
            r14 = 1
            if (r0 <= 0) goto L_0x00bc
            int r15 = r12.readInt()     // Catch:{ RuntimeException -> 0x00c6 }
            r0 = 1279544898(0x4c444e42, float:5.146036E7)
            if (r15 != r0) goto L_0x00c1
            int r0 = r12.readInt()     // Catch:{ RuntimeException -> 0x00c6 }
            if (r0 != r14) goto L_0x00b7
            java.lang.String r0 = r12.readString()     // Catch:{ RuntimeException -> 0x00c6 }
            boolean r0 = r13.equals(r0)     // Catch:{ RuntimeException -> 0x00c6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ RuntimeException -> 0x00c6 }
            X.C9928Rjh.A00 = r0     // Catch:{ RuntimeException -> 0x00c6 }
            goto L_0x00ca
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()     // Catch:{ RuntimeException -> 0x00c6 }
            goto L_0x00c5
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()     // Catch:{ RuntimeException -> 0x00c6 }
            goto L_0x00c5
        L_0x00c1:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()     // Catch:{ RuntimeException -> 0x00c6 }
        L_0x00c5:
            throw r0     // Catch:{ RuntimeException -> 0x00c6 }
        L_0x00c6:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01b5 }
            X.C9928Rjh.A00 = r0     // Catch:{ all -> 0x01b5 }
        L_0x00ca:
            r12.recycle()     // Catch:{ all -> 0x01ba }
        L_0x00cd:
            java.lang.Boolean r0 = X.C9928Rjh.A00     // Catch:{ all -> 0x01ba }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ba }
            monitor-exit(r16)     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x00db
            java.lang.String r12 = r2.readString()     // Catch:{ all -> 0x01bd }
            goto L_0x00ed
        L_0x00db:
            java.lang.Object r12 = r2.readValue(r11)     // Catch:{ all -> 0x01bd }
            boolean r0 = r12 instanceof java.lang.String     // Catch:{ all -> 0x01bd }
            if (r0 != 0) goto L_0x00eb
            java.lang.String r12 = "GooglePlayCallbackExtractor"
            java.lang.String r0 = "Bad callback received, terminating"
            X.0KC.A0D(r12, r0)     // Catch:{ all -> 0x01bd }
            goto L_0x0162
        L_0x00eb:
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x01bd }
        L_0x00ed:
            if (r12 == 0) goto L_0x0162
            if (r1 != 0) goto L_0x011f
            java.lang.String r0 = "callback"
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x011f
            int r1 = r2.readInt()     // Catch:{ all -> 0x01bd }
            r0 = 4
            java.lang.String r12 = "Bad callback received, terminating"
            if (r1 == r0) goto L_0x0103
            goto L_0x0166
        L_0x0103:
            java.lang.String r1 = r2.readString()     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "com.google.android.gms.gcm.PendingCallback"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01bd }
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.0KC.A0D(r0, r12)     // Catch:{ all -> 0x01bd }
            goto L_0x0178
        L_0x0115:
            android.os.IBinder r0 = r2.readStrongBinder()     // Catch:{ all -> 0x01bd }
            X.Sm7 r1 = new X.Sm7     // Catch:{ all -> 0x01bd }
            r1.<init>(r0)     // Catch:{ all -> 0x01bd }
            goto L_0x0162
        L_0x011f:
            java.lang.Object r13 = r2.readValue(r11)     // Catch:{ all -> 0x01bd }
            boolean r0 = r13 instanceof java.lang.String     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x012d
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x01bd }
            r10.putString(r12, r13)     // Catch:{ all -> 0x01bd }
            goto L_0x0162
        L_0x012d:
            boolean r0 = r13 instanceof java.lang.Boolean     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x0139
            boolean r0 = X.AnonymousClass7TE.A1a(r13)     // Catch:{ all -> 0x01bd }
            r10.putBoolean(r12, r0)     // Catch:{ all -> 0x01bd }
            goto L_0x0162
        L_0x0139:
            boolean r0 = r13 instanceof java.lang.Integer     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x0145
            int r0 = X.Pxe.A09(r13)     // Catch:{ all -> 0x01bd }
            r10.putInt(r12, r0)     // Catch:{ all -> 0x01bd }
            goto L_0x0162
        L_0x0145:
            boolean r0 = r13 instanceof java.util.ArrayList     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x014f
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x01bd }
            r10.putParcelableArrayList(r12, r13)     // Catch:{ all -> 0x01bd }
            goto L_0x0162
        L_0x014f:
            boolean r0 = r13 instanceof android.os.Bundle     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x0159
            android.os.Bundle r13 = (android.os.Bundle) r13     // Catch:{ all -> 0x01bd }
            r10.putBundle(r12, r13)     // Catch:{ all -> 0x01bd }
            goto L_0x0162
        L_0x0159:
            boolean r0 = r13 instanceof android.os.Parcelable     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x0162
            android.os.Parcelable r13 = (android.os.Parcelable) r13     // Catch:{ all -> 0x01bd }
            r10.putParcelable(r12, r13)     // Catch:{ all -> 0x01bd }
        L_0x0162:
            int r3 = r3 + 1
            goto L_0x0071
        L_0x0166:
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.0KC.A0D(r0, r12)     // Catch:{ all -> 0x01bd }
            goto L_0x0178
        L_0x016c:
            if (r1 != 0) goto L_0x0174
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.0KC.A0D(r0, r8)     // Catch:{ all -> 0x01bd }
            goto L_0x0178
        L_0x0174:
            android.util.Pair r7 = android.util.Pair.create(r1, r10)     // Catch:{ all -> 0x01bd }
        L_0x0178:
            r2.recycle()     // Catch:{ all -> 0x01c2 }
            if (r7 == 0) goto L_0x01ad
            java.lang.Object r3 = r7.first     // Catch:{ all -> 0x01c2 }
            X.TcR r3 = (X.C13555TcR) r3     // Catch:{ all -> 0x01c2 }
            java.lang.Object r2 = r7.second     // Catch:{ all -> 0x01c2 }
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "tag"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x01c2 }
            if (r1 == 0) goto L_0x01ad
            java.lang.String r0 = "extras"
            android.os.Bundle r0 = r2.getBundle(r0)     // Catch:{ all -> 0x01c2 }
            X.TL5 r0 = A00(r0, r6, r3, r1)     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x01ad
            r0.A01()     // Catch:{ all -> 0x01c2 }
            goto L_0x01ad
        L_0x019e:
            java.lang.String r0 = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x01ad
            java.lang.String r1 = "GcmTaskService"
            java.lang.String r0 = "Unknown action received, terminating"
            X.0KC.A0C(r1, r0)     // Catch:{ all -> 0x01c2 }
        L_0x01ad:
            r6.A01(r5)
            r0 = -543721098(0xffffffffdf977976, float:-2.182977E19)
            goto L_0x001c
        L_0x01b5:
            r0 = move-exception
            r12.recycle()     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            r2.recycle()     // Catch:{ all -> 0x01c2 }
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x01c2:
            r1 = move-exception
            r6.A01(r5)
            r0 = -1436985591(0xffffffffaa595709, float:-1.9303668E-13)
            X.AnonymousClass0fD.A0B(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5Y.onStartCommand(android.content.Intent, int, int):int");
    }
}
