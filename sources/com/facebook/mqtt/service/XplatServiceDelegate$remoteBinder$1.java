package com.facebook.mqtt.service;

import X.0KC;
import X.AnonymousClass0fD;
import X.C62320sa;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.IBinder;
import com.facebook.mqtt.service.ipc.IMqttXplatService;

public final class XplatServiceDelegate$remoteBinder$1 extends Binder implements IMqttXplatService {
    public XplatServiceDelegate$remoteBinder$1() {
        int A03 = AnonymousClass0fD.A03(74830910);
        attachInterface(this, "com.facebook.mqtt.service.ipc.IMqttXplatService");
        AnonymousClass0fD.A0A(230065811, A03);
        AnonymousClass0fD.A0A(-157484549, AnonymousClass0fD.A03(1945355825));
    }

    public final void A00(C62320sa r6) {
        int A03 = AnonymousClass0fD.A03(1830953771);
        try {
            r6.invoke();
        } catch (RuntimeException e) {
            int A032 = AnonymousClass0fD.A03(297603381);
            if (e.getCause() instanceof DeadObjectException) {
                0KC.A0G("MqttXplatService", "System is dead", e);
                AnonymousClass0fD.A0A(1544414200, A032);
            } else {
                AnonymousClass0fD.A0A(282582318, A032);
                throw e;
            }
        }
        AnonymousClass0fD.A0A(1375900965, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1259846668, AnonymousClass0fD.A03(-741844994));
        return this;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object, com.facebook.mqtt.service.ipc.IMqttPublishExtListener$Stub$Proxy] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0120, code lost:
        if (r1 != false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0240, code lost:
        X.AnonymousClass0fD.A0A(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x027c, code lost:
        X.AnonymousClass0fD.A0A(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x027f, code lost:
        r3.writeNoException();
        r3.writeInt(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0285, code lost:
        r1 = 88450693;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r16, android.os.Parcel r17, android.os.Parcel r18, int r19) {
        /*
            r15 = this;
            r0 = 461320248(0x1b7f3038, float:2.1108686E-22)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            java.lang.String r2 = "com.facebook.mqtt.service.ipc.IMqttXplatService"
            r4 = r17
            r3 = r18
            r5 = r16
            if (r5 < r0) goto L_0x001d
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r5 > r1) goto L_0x002a
            r4.enforceInterface(r2)
            switch(r16) {
                case 1: goto L_0x006e;
                case 2: goto L_0x005f;
                case 3: goto L_0x0244;
                case 4: goto L_0x01b1;
                case 5: goto L_0x0268;
                case 6: goto L_0x0174;
                case 7: goto L_0x0138;
                case 8: goto L_0x00e9;
                case 9: goto L_0x0090;
                case 10: goto L_0x0050;
                case 11: goto L_0x0037;
                case 12: goto L_0x007d;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r19
            boolean r1 = super.onTransact(r5, r4, r3, r0)
            r0 = -1682996297(0xffffffff9baf83b7, float:-2.903644E-22)
            X.AnonymousClass0fD.A0A(r0, r6)
            return r1
        L_0x002a:
            r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r5 != r1) goto L_0x001d
            r3.writeString(r2)
            r1 = 1207490643(0x47f8d853, float:127408.65)
            goto L_0x0288
        L_0x0037:
            r1 = 2031103937(0x79102fc1, float:4.6791207E34)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.26N r1 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            java.lang.String r2 = ""
            r1 = -912299906(0xffffffffc99f687e, float:-1305871.8)
            X.AnonymousClass0fD.A0A(r1, r4)
            r3.writeNoException()
            r3.writeString(r2)
            goto L_0x0285
        L_0x0050:
            r1 = 1775941479(0x69dab767, float:3.305149E25)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.26N r1 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            r9 = 0
            r1 = -934702364(0xffffffffc84992e4, float:-206411.56)
            goto L_0x0240
        L_0x005f:
            r1 = -1398792591(0xffffffffaca01e71, float:-4.550853E-12)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.26N r1 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            r9 = 0
            r1 = 297928286(0x11c2065e, float:3.0611727E-28)
            goto L_0x0240
        L_0x006e:
            r1 = 396619170(0x17a3eda2, float:1.0593615E-24)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.26N r1 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            r9 = 0
            r1 = -1451956824(0xffffffffa974e5a8, float:-5.437808E-14)
            goto L_0x0240
        L_0x007d:
            java.lang.String r2 = r4.readString()
            r1 = 2027126081(0x78d37d41, float:3.4316097E34)
            int r4 = X.AnonymousClass7TG.A0D(r2, r1)
            X.26N r1 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            r9 = 0
            r1 = 1285993002(0x4ca6b22a, float:8.7396688E7)
            goto L_0x0240
        L_0x0090:
            java.lang.String r12 = r4.readString()
            byte[] r14 = r4.createByteArray()
            int r5 = r4.readInt()
            long r1 = r4.readLong()
            r4 = 1982983064(0x7631eb98, float:9.0216304E32)
            int r4 = X.AnonymousClass7TG.A0D(r12, r4)
            X.0qQ.A0B(r14, r0)
            X.46a r11 = X.C9259RVk.A00(r5)
            X.26N r5 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            r5 = 2
            X.0qQ.A0B(r11, r5)
            X.44t r9 = com.facebook.mqtt.service.XplatServiceDelegate.A02
            r13 = 0
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            boolean r5 = X.0qQ.A0K(r7, r5)
            java.lang.String r7 = "MqttXplatPublisher"
            if (r5 == 0) goto L_0x00cc
            java.lang.String r5 = "Publish and wait is a blocking operation that cannot be executed on main thread"
            X.0KC.A0C(r7, r5)
        L_0x00cc:
            java.util.concurrent.CountDownLatch r7 = new java.util.concurrent.CountDownLatch
            r7.<init>(r0)
            X.Snp r10 = new X.Snp
            r10.<init>(r7)
            int r5 = r9.A00(r10, r11, r12, r13, r14)
            r9 = -1
            if (r5 == r9) goto L_0x00e4
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r7.await(r1, r5)
            int r9 = r10.A00
        L_0x00e4:
            r1 = -1138544035(0xffffffffbc23325d, float:-0.009960738)
            goto L_0x0240
        L_0x00e9:
            java.lang.String r9 = r4.readString()
            byte[] r8 = r4.createByteArray()
            int r7 = r4.readInt()
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 != 0) goto L_0x0116
            r5 = 0
        L_0x00fc:
            r1 = -1837823101(0xffffffff92750b83, float:-7.732256E-28)
            int r4 = X.AnonymousClass7TG.A0D(r9, r1)
            X.AnonymousClass7TF.A1C(r8, r0, r5)
            X.46a r2 = X.C9259RVk.A00(r7)
            X.26N r1 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            r1 = 2
            X.0qQ.A0B(r2, r1)
            r9 = -1
            r1 = -844308772(0xffffffffcdacdedc, float:-3.62535808E8)
            goto L_0x0240
        L_0x0116:
            java.lang.String r1 = "com.facebook.mqtt.service.ipc.IMqttPublishExtListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            if (r5 == 0) goto L_0x0123
            boolean r1 = r5 instanceof com.facebook.mqtt.service.ipc.IMqttPublishExtListener$Stub$Proxy
            if (r1 == 0) goto L_0x0123
            goto L_0x00fc
        L_0x0123:
            com.facebook.mqtt.service.ipc.IMqttPublishExtListener$Stub$Proxy r5 = new com.facebook.mqtt.service.ipc.IMqttPublishExtListener$Stub$Proxy
            r5.<init>()
            r1 = -1947178561(0xffffffff8bf069bf, float:-9.2603746E-32)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r5.A00 = r4
            r1 = -42119513(0xfffffffffd7d4ea7, float:-2.1043942E37)
            X.AnonymousClass0fD.A0A(r1, r2)
            goto L_0x00fc
        L_0x0138:
            java.lang.String r10 = r4.readString()
            byte[] r12 = r4.createByteArray()
            int r2 = r4.readInt()
            java.lang.String r11 = r4.readString()
            android.os.IBinder r1 = r4.readStrongBinder()
            com.facebook.mqtt.service.ipc.IMqttPublishListener r4 = com.facebook.mqtt.service.ipc.IMqttPublishListener.Stub.A00(r1)
            r1 = 1778891607(0x6a07bb57, float:4.102242E25)
            int r1 = X.AnonymousClass7TG.A0D(r10, r1)
            X.AnonymousClass7TF.A1C(r12, r0, r11)
            X.46a r9 = X.C9259RVk.A00(r2)
            X.26N r2 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            X.Snn r8 = new X.Snn
            r8.<init>(r15, r4, r0)
            r2 = 2
            X.0qQ.A0B(r9, r2)
            X.44t r7 = com.facebook.mqtt.service.XplatServiceDelegate.A02
            int r9 = r7.A00(r8, r9, r10, r11, r12)
            r2 = -1539404458(0xffffffffa43e8d56, float:-4.13194E-17)
            goto L_0x027c
        L_0x0174:
            java.lang.String r10 = r4.readString()
            byte[] r12 = r4.createByteArray()
            int r2 = r4.readInt()
            android.os.IBinder r1 = r4.readStrongBinder()
            com.facebook.mqtt.service.ipc.IMqttPublishListener r5 = com.facebook.mqtt.service.ipc.IMqttPublishListener.Stub.A00(r1)
            r1 = 158535386(0x9730eda, float:2.9257044E-33)
            int r1 = X.AnonymousClass0fD.A03(r1)
            r4 = 0
            X.0qQ.A0B(r10, r4)
            X.0qQ.A0B(r12, r0)
            X.46a r9 = X.C9259RVk.A00(r2)
            X.26N r2 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            X.Snn r8 = new X.Snn
            r8.<init>(r15, r5, r4)
            r11 = 0
            r2 = 2
            X.0qQ.A0B(r9, r2)
            X.44t r7 = com.facebook.mqtt.service.XplatServiceDelegate.A02
            int r9 = r7.A00(r8, r9, r10, r11, r12)
            r2 = 313622749(0x12b180dd, float:1.1202038E-27)
            goto L_0x027c
        L_0x01b1:
            android.os.Parcelable$Creator r1 = com.facebook.mqtt.service.ipc.SubscriptionParcelable.CREATOR
            java.util.ArrayList r8 = r4.createTypedArrayList(r1)
            r4.readInt()
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 != 0) goto L_0x01f6
            r5 = 0
        L_0x01c1:
            r1 = 1039423493(0x3df45805, float:0.11930851)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r7 = 0
            X.AnonymousClass7TF.A1B(r8, r7, r5)
            X.Snr r10 = new X.Snr
            r10.<init>(r15, r5)
            java.util.ArrayList r9 = X.Pxg.A14(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x01d9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x021a
            java.lang.Object r2 = r8.next()
            com.facebook.mqtt.service.ipc.SubscriptionParcelable r2 = (com.facebook.mqtt.service.ipc.SubscriptionParcelable) r2
            int r1 = r2.A00
            X.46a r5 = X.C9259RVk.A00(r1)
            java.lang.String r2 = r2.A01
            X.JwH r1 = new X.JwH
            r1.<init>((com.facebook.mqtt.service.MqttSubscribeListener) r10, (X.C2605346a) r5, (java.lang.String) r2)
            r9.add(r1)
            goto L_0x01d9
        L_0x01f6:
            java.lang.String r1 = "com.facebook.mqtt.service.ipc.IMqttSubscribeListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            if (r5 == 0) goto L_0x0205
            boolean r1 = r5 instanceof com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy
            if (r1 == 0) goto L_0x0205
            com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy r5 = (com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy) r5
            goto L_0x01c1
        L_0x0205:
            com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy r5 = new com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy
            r5.<init>()
            r1 = 2146958578(0x7ff7fcf2, float:NaN)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r5.A00 = r4
            r1 = -368193218(0xffffffffea0dd13e, float:-4.2861665E25)
            X.AnonymousClass0fD.A0A(r1, r2)
            goto L_0x01c1
        L_0x021a:
            X.26N r1 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            java.util.Iterator r5 = r9.iterator()
        L_0x0220:
            r9 = 1
        L_0x0221:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x023d
            java.lang.Object r2 = r5.next()
            X.JwH r2 = (X.C61079JwH) r2
            if (r9 == 0) goto L_0x023b
            X.0qQ.A0B(r2, r7)
            X.44u r1 = com.facebook.mqtt.service.XplatServiceDelegate.A03
            boolean r1 = r1.A02(r2)
            if (r1 == 0) goto L_0x023b
            goto L_0x0220
        L_0x023b:
            r9 = 0
            goto L_0x0221
        L_0x023d:
            r1 = -37357977(0xfffffffffdc5f667, float:-3.2892164E37)
        L_0x0240:
            X.AnonymousClass0fD.A0A(r1, r4)
            goto L_0x027f
        L_0x0244:
            long r4 = r4.readLong()
            r1 = -807587919(0xffffffffcfdd2fb1, float:-7.4217805E9)
            int r1 = X.AnonymousClass0fD.A03(r1)
            java.util.concurrent.locks.ReentrantLock r8 = com.facebook.mqtt.service.XplatServiceDelegate.A06
            r8.lock()
            java.util.concurrent.locks.Condition r7 = com.facebook.mqtt.service.XplatServiceDelegate.A05     // Catch:{ all -> 0x0263 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0263 }
            r7.await(r4, r2)     // Catch:{ all -> 0x0263 }
            r9 = 0
            r8.unlock()
            r2 = -1853054012(0xffffffff918ca3c4, float:-2.2189034E-28)
            goto L_0x027c
        L_0x0263:
            r0 = move-exception
            r8.unlock()
            throw r0
        L_0x0268:
            java.util.ArrayList r4 = r4.createStringArrayList()
            r1 = -230268307(0xfffffffff246626d, float:-3.9294094E30)
            int r1 = X.AnonymousClass7TG.A0D(r4, r1)
            X.44u r2 = com.facebook.mqtt.service.XplatServiceDelegate.A03
            boolean r9 = r2.A03(r4)
            r2 = -1893732906(0xffffffff8f1fedd6, float:-7.885111E-30)
        L_0x027c:
            X.AnonymousClass0fD.A0A(r2, r1)
        L_0x027f:
            r3.writeNoException()
            r3.writeInt(r9)
        L_0x0285:
            r1 = 88450693(0x545a685, float:9.29348E-36)
        L_0x0288:
            X.AnonymousClass0fD.A0A(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.XplatServiceDelegate$remoteBinder$1.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
