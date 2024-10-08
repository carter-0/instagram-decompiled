package com.meta.arfx.engine.common;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C368618t1;
import X.C40919AlR;
import X.C40920AlS;
import X.C40921AlT;
import X.C40922AlU;
import X.C40923AlV;
import X.C41097AoJ;
import X.C41098AoK;
import X.C41188Apm;
import X.C41224AqM;
import X.C41249Aql;
import X.C41258Aqu;
import X.C41261Aqx;
import X.C41267Ar3;
import X.C41269Ar5;
import android.os.Binder;
import android.os.IBinder;
import android.view.Surface;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import com.meta.arfx.engine.interfaces.IAREngineServiceController;
import com.meta.arfx.engine.interfaces.IARExperimentUtilBinding;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;

public final class AREngineService$binder$1 extends Binder implements IAREngineServiceController {
    public final /* synthetic */ C368618t1 A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AREngineService$binder$1(C368618t1 r3) {
        this();
        this.A00 = r3;
        AnonymousClass0fD.A0A(-1815833668, AnonymousClass0fD.A03(2102833043));
    }

    public static final void A00(AREngineService$binder$1 aREngineService$binder$1) {
        int A03 = AnonymousClass0fD.A03(-613539275);
        C368618t1 r2 = aREngineService$binder$1.A00;
        VersionedSharedMemory versionedSharedMemory = r2.A0G;
        if (versionedSharedMemory != null) {
            versionedSharedMemory.unmap(r2.A0L);
        }
        r2.A0L = null;
        VersionedSharedMemory versionedSharedMemory2 = r2.A0G;
        if (versionedSharedMemory2 != null) {
            versionedSharedMemory2.close();
        }
        r2.A0G = null;
        AnonymousClass0fD.A0A(-1300942285, A03);
    }

    public final void AHJ() {
        int A03 = AnonymousClass0fD.A03(904905206);
        C368618t1 r3 = this.A00;
        while (true) {
            LinkedList linkedList = r3.A0R;
            if (!linkedList.isEmpty()) {
                Future future = (Future) linkedList.poll();
                if (future != null) {
                    future.cancel(true);
                }
            } else {
                r3.A0U.execute(new C40919AlR(r3));
                AnonymousClass0fD.A0A(261064630, A03);
                return;
            }
        }
    }

    public final void APu(List list, int i, int i2, int i3, long j, long j2, boolean z) {
        C368618t1 r5;
        LinkedList linkedList;
        int i4;
        int A03 = AnonymousClass0fD.A03(-487580945);
        if (list != null) {
            this.A00.A0S.addAll(list);
        }
        while (true) {
            r5 = this.A00;
            linkedList = r5.A0Q;
            Future future = (Future) linkedList.peek();
            if (future != null && future.isDone()) {
                linkedList.poll();
            }
        }
        if (linkedList.size() > 5) {
            i4 = 1642585098;
        } else {
            linkedList.add(r5.A0U.submit(new C41258Aqu(r5, i, i2, i3, j2, j, z)));
            i4 = -1762863292;
        }
        AnonymousClass0fD.A0A(i4, A03);
    }

    public final void EFA(IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARExperimentUtilBinding iARExperimentUtilBinding, IARNetworkClientWorkerHost iARNetworkClientWorkerHost, int i, int i2, boolean z, boolean z2, boolean z3) {
        int A03 = AnonymousClass0fD.A03(-1470818828);
        C368618t1 r3 = this.A00;
        r3.A0U.execute(new C41261Aqx(r3, iARAnalyticsLoggerHost, iARExperimentUtilBinding, iARNetworkClientWorkerHost, i, i2, z, z3));
        AnonymousClass0fD.A0A(-921555432, A03);
    }

    public final void EFB() {
        int A03 = AnonymousClass0fD.A03(164337530);
        C368618t1 r3 = this.A00;
        while (true) {
            LinkedList linkedList = r3.A0Q;
            if (!(!linkedList.isEmpty())) {
                break;
            }
            Future future = (Future) linkedList.poll();
            if (future != null) {
                future.cancel(true);
            }
        }
        while (true) {
            LinkedList linkedList2 = r3.A0R;
            if (AnonymousClass7TE.A1b(linkedList2)) {
                Future future2 = (Future) linkedList2.poll();
                if (future2 != null) {
                    future2.cancel(true);
                }
            } else {
                r3.A0T.execute(new C40920AlS(this));
                r3.A0U.execute(new C40921AlT(r3));
                AnonymousClass0fD.A0A(1354122819, A03);
                return;
            }
        }
    }

    public final void EHx() {
        int A03 = AnonymousClass0fD.A03(375863182);
        C368618t1 r2 = this.A00;
        r2.A0U.execute(new C40922AlU(r2));
        AnonymousClass0fD.A0A(-1968215278, A03);
    }

    public final void EQO(int i) {
        int A03 = AnonymousClass0fD.A03(1649574728);
        C368618t1 r2 = this.A00;
        r2.A0U.execute(new C41097AoJ(r2, i));
        AnonymousClass0fD.A0A(-88135247, A03);
    }

    public final void EQT(int i) {
        int A03 = AnonymousClass0fD.A03(2086960120);
        C368618t1 r2 = this.A00;
        r2.A0U.execute(new C41098AoK(r2, i));
        AnonymousClass0fD.A0A(1613204015, A03);
    }

    public final void EUp(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z) {
        int A03 = AnonymousClass0fD.A03(-1520047004);
        List list2 = list;
        0qQ.A0B(list2, 9);
        C368618t1 r3 = this.A00;
        r3.A0U.execute(new C41267Ar3(r3, str, str2, str3, str4, str5, str6, list2, i, i2, z));
        AnonymousClass0fD.A0A(-2055154530, A03);
    }

    public final void Ejz(IAREngineServiceCallback iAREngineServiceCallback) {
        int A03 = AnonymousClass0fD.A03(-1849503469);
        this.A00.A0J = iAREngineServiceCallback;
        AnonymousClass0fD.A0A(962042174, A03);
    }

    public final void End(Surface surface, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(-1013966585);
        C368618t1 r2 = this.A00;
        r2.A0U.execute(new C41224AqM(surface, r2, i, i2));
        AnonymousClass0fD.A0A(-1344586104, A03);
    }

    public final void ErQ(VersionedSharedMemory versionedSharedMemory) {
        int A03 = AnonymousClass0fD.A03(1961985730);
        C368618t1 r2 = this.A00;
        r2.A0T.execute(new C41188Apm(versionedSharedMemory, this, r2));
        AnonymousClass0fD.A0A(821902615, A03);
    }

    public final void ErR(int i, int i2, int i3, int i4, boolean z) {
        int A03 = AnonymousClass0fD.A03(-1256262925);
        C368618t1 r3 = this.A00;
        r3.A0U.execute(new C41249Aql(r3, i, i2, i3, i4, z));
        AnonymousClass0fD.A0A(2099916417, A03);
    }

    public final void EyA() {
        int A03 = AnonymousClass0fD.A03(618715178);
        C368618t1 r3 = this.A00;
        while (true) {
            LinkedList linkedList = r3.A0Q;
            if (!linkedList.isEmpty()) {
                Future future = (Future) linkedList.poll();
                if (future != null) {
                    future.cancel(true);
                }
            } else {
                r3.A0U.execute(new C40923AlV(r3));
                AnonymousClass0fD.A0A(-1456992910, A03);
                return;
            }
        }
    }

    public final void FKS(int[] iArr, int[] iArr2, int[] iArr3, float f, float f2, float f3, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2) {
        C368618t1 r5;
        LinkedList linkedList;
        int i5;
        int A03 = AnonymousClass0fD.A03(-79603393);
        int[] iArr4 = iArr;
        0qQ.A0B(iArr4, 10);
        int[] iArr5 = iArr2;
        0qQ.A0B(iArr5, 11);
        int[] iArr6 = iArr3;
        0qQ.A0B(iArr6, 12);
        while (true) {
            r5 = this.A00;
            linkedList = r5.A0R;
            Future future = (Future) linkedList.peek();
            if (future != null && future.isDone()) {
                linkedList.poll();
            }
        }
        if (linkedList.size() > 5) {
            i5 = -1053339006;
        } else {
            int i6 = i3;
            float f4 = f2;
            float f5 = f;
            long j4 = j3;
            long j5 = j2;
            float f6 = f3;
            int i7 = i;
            int i8 = i2;
            linkedList.add(r5.A0T.submit(new C41269Ar5(r5, iArr4, iArr5, iArr6, f5, f4, f6, i7, i8, i6, i4, j, j5, j4, z, z2)));
            i5 = 991540094;
        }
        AnonymousClass0fD.A0A(i5, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-757544830, AnonymousClass0fD.A03(-1427956496));
        return this;
    }

    /* JADX WARNING: type inference failed for: r9v5, types: [java.lang.Object, com.meta.arfx.engine.interfaces.IARExperimentUtilBinding$Stub$Proxy] */
    /* JADX WARNING: type inference failed for: r10v5, types: [com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v5, types: [java.lang.Object, com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost$Stub$Proxy] */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.meta.arfx.engine.interfaces.IAREngineServiceCallback$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01df, code lost:
        r2.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x021e, code lost:
        r2.writeNoException();
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0222, code lost:
        r0 = 1660115826;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r27, android.os.Parcel r28, android.os.Parcel r29, int r30) {
        /*
            r26 = this;
            r0 = -2022313451(0xffffffff8775f215, float:-1.8502893E-34)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r5 = 1
            java.lang.String r4 = "com.meta.arfx.engine.interfaces.IAREngineServiceController"
            r7 = r26
            r6 = r27
            r0 = r28
            r2 = r29
            if (r6 < r5) goto L_0x001f
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r3) goto L_0x0227
            r0.enforceInterface(r4)
            switch(r27) {
                case 1: goto L_0x002c;
                case 2: goto L_0x005d;
                case 3: goto L_0x0109;
                case 4: goto L_0x0127;
                case 5: goto L_0x015b;
                case 6: goto L_0x0182;
                case 7: goto L_0x0197;
                case 8: goto L_0x01e3;
                case 9: goto L_0x01e7;
                case 10: goto L_0x01eb;
                case 11: goto L_0x0207;
                case 12: goto L_0x020b;
                case 13: goto L_0x020f;
                case 14: goto L_0x0217;
                default: goto L_0x001f;
            }
        L_0x001f:
            r3 = r30
            boolean r6 = super.onTransact(r6, r0, r2, r3)
            r0 = 232069149(0xdd5181d, float:1.3132944E-30)
        L_0x0028:
            X.AnonymousClass0fD.A0A(r0, r1)
            return r6
        L_0x002c:
            r6 = 1
            android.os.IBinder r5 = r0.readStrongBinder()
            if (r5 != 0) goto L_0x0039
            r4 = 0
        L_0x0034:
            r7.Ejz(r4)
            goto L_0x01df
        L_0x0039:
            java.lang.String r0 = "com.meta.arfx.engine.interfaces.IAREngineServiceCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r0)
            if (r4 == 0) goto L_0x0048
            boolean r0 = r4 instanceof com.meta.arfx.engine.interfaces.IAREngineServiceCallback
            if (r0 == 0) goto L_0x0048
            com.meta.arfx.engine.interfaces.IAREngineServiceCallback r4 = (com.meta.arfx.engine.interfaces.IAREngineServiceCallback) r4
            goto L_0x0034
        L_0x0048:
            com.meta.arfx.engine.interfaces.IAREngineServiceCallback$Stub$Proxy r4 = new com.meta.arfx.engine.interfaces.IAREngineServiceCallback$Stub$Proxy
            r4.<init>()
            r0 = 1321415730(0x4ec33432, float:1.6374889E9)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r4.A00 = r5
            r0 = 1304598251(0x4dc296eb, float:4.08083808E8)
            X.AnonymousClass0fD.A0A(r0, r3)
            goto L_0x0034
        L_0x005d:
            r6 = 1
            int r3 = r0.readInt()
            boolean r13 = X.AnonymousClass7TF.A1P(r3)
            int r11 = r0.readInt()
            int r12 = r0.readInt()
            int r3 = r0.readInt()
            boolean r14 = X.AnonymousClass7TF.A1P(r3)
            int r3 = r0.readInt()
            boolean r15 = X.AnonymousClass7TF.A1P(r3)
            android.os.IBinder r5 = r0.readStrongBinder()
            if (r5 != 0) goto L_0x00e4
            r9 = 0
        L_0x0085:
            android.os.IBinder r5 = r0.readStrongBinder()
            if (r5 != 0) goto L_0x00bc
            r10 = 0
        L_0x008c:
            android.os.IBinder r4 = r0.readStrongBinder()
            if (r4 != 0) goto L_0x0098
            r8 = 0
        L_0x0093:
            r7.EFA(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01df
        L_0x0098:
            java.lang.String r0 = "com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost"
            android.os.IInterface r8 = r4.queryLocalInterface(r0)
            if (r8 == 0) goto L_0x00a7
            boolean r0 = r8 instanceof com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost
            if (r0 == 0) goto L_0x00a7
            com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost r8 = (com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost) r8
            goto L_0x0093
        L_0x00a7:
            com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost$Stub$Proxy r8 = new com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost$Stub$Proxy
            r8.<init>()
            r0 = 1607432808(0x5fcf7a68, float:2.9900753E19)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r8.A00 = r4
            r0 = 314683952(0x12c1b230, float:1.2223939E-27)
            X.AnonymousClass0fD.A0A(r0, r3)
            goto L_0x0093
        L_0x00bc:
            r3 = 32
            java.lang.String r3 = X.Pxd.A00(r3)
            android.os.IInterface r10 = r5.queryLocalInterface(r3)
            if (r10 == 0) goto L_0x00cf
            boolean r3 = r10 instanceof com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost
            if (r3 == 0) goto L_0x00cf
            com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost r10 = (com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost) r10
            goto L_0x008c
        L_0x00cf:
            com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost$Stub$Proxy r10 = new com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost$Stub$Proxy
            r10.<init>()
            r3 = 713213044(0x2a82c474, float:2.3228956E-13)
            int r4 = X.AnonymousClass0fD.A03(r3)
            r10.A00 = r5
            r3 = -1049227454(0xffffffffc1760f42, float:-15.378725)
            X.AnonymousClass0fD.A0A(r3, r4)
            goto L_0x008c
        L_0x00e4:
            java.lang.String r3 = "com.meta.arfx.engine.interfaces.IARExperimentUtilBinding"
            android.os.IInterface r9 = r5.queryLocalInterface(r3)
            if (r9 == 0) goto L_0x00f3
            boolean r3 = r9 instanceof com.meta.arfx.engine.interfaces.IARExperimentUtilBinding
            if (r3 == 0) goto L_0x00f3
            com.meta.arfx.engine.interfaces.IARExperimentUtilBinding r9 = (com.meta.arfx.engine.interfaces.IARExperimentUtilBinding) r9
            goto L_0x0085
        L_0x00f3:
            com.meta.arfx.engine.interfaces.IARExperimentUtilBinding$Stub$Proxy r9 = new com.meta.arfx.engine.interfaces.IARExperimentUtilBinding$Stub$Proxy
            r9.<init>()
            r3 = 159124499(0x97c0c13, float:3.0339074E-33)
            int r4 = X.AnonymousClass0fD.A03(r3)
            r9.A00 = r5
            r3 = -442393393(0xffffffffe5a19ccf, float:-9.53992E22)
            X.AnonymousClass0fD.A0A(r3, r4)
            goto L_0x0085
        L_0x0109:
            r6 = 1
            android.os.Parcelable$Creator r4 = android.view.Surface.CREATOR
            int r3 = r0.readInt()
            if (r3 == 0) goto L_0x0125
            java.lang.Object r4 = r4.createFromParcel(r0)
        L_0x0116:
            android.view.Surface r4 = (android.view.Surface) r4
            int r3 = r0.readInt()
            int r0 = r0.readInt()
            r7.End(r4, r3, r0)
            goto L_0x01df
        L_0x0125:
            r4 = 0
            goto L_0x0116
        L_0x0127:
            r6 = 1
            java.lang.String r8 = r0.readString()
            java.lang.String r9 = r0.readString()
            java.lang.String r10 = r0.readString()
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            int r15 = r0.readInt()
            java.lang.String r13 = r0.readString()
            int r3 = r0.readInt()
            boolean r17 = X.AnonymousClass7TF.A1P(r3)
            int r16 = r0.readInt()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            java.util.ArrayList r14 = r0.createTypedArrayList(r3)
            r7.EUp(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01df
        L_0x015b:
            r6 = 1
            long r12 = r0.readLong()
            long r14 = r0.readLong()
            int r9 = r0.readInt()
            int r10 = r0.readInt()
            int r3 = r0.readInt()
            boolean r16 = X.AnonymousClass7TF.A1P(r3)
            int r11 = r0.readInt()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            java.util.ArrayList r8 = r0.createTypedArrayList(r3)
            r7.APu(r8, r9, r10, r11, r12, r14, r16)
            goto L_0x01df
        L_0x0182:
            r6 = 1
            X.ALJ r4 = com.facebook.cameracore.util.memory.VersionedSharedMemory.CREATOR
            int r3 = r0.readInt()
            if (r3 == 0) goto L_0x0195
            java.lang.Object r0 = r4.createFromParcel(r0)
        L_0x018f:
            com.facebook.cameracore.util.memory.VersionedSharedMemory r0 = (com.facebook.cameracore.util.memory.VersionedSharedMemory) r0
            r7.ErQ(r0)
            goto L_0x01df
        L_0x0195:
            r0 = 0
            goto L_0x018f
        L_0x0197:
            int r14 = r0.readInt()
            long r18 = r0.readLong()
            int r3 = r0.readInt()
            boolean r24 = X.AnonymousClass7TF.A1P(r3)
            int r15 = r0.readInt()
            int r16 = r0.readInt()
            float r11 = r0.readFloat()
            float r12 = r0.readFloat()
            float r13 = r0.readFloat()
            long r20 = r0.readLong()
            long r22 = r0.readLong()
            int[] r8 = r0.createIntArray()
            int[] r9 = r0.createIntArray()
            int[] r10 = r0.createIntArray()
            int r17 = r0.readInt()
            int r0 = r0.readInt()
            boolean r25 = X.AnonymousClass7TF.A1P(r0)
            r6 = 1
            r7.FKS(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24, r25)
        L_0x01df:
            r2.writeNoException()
            goto L_0x0222
        L_0x01e3:
            r7.EyA()
            goto L_0x021e
        L_0x01e7:
            r7.AHJ()
            goto L_0x021e
        L_0x01eb:
            int r8 = r0.readInt()
            int r9 = r0.readInt()
            int r10 = r0.readInt()
            int r11 = r0.readInt()
            int r0 = r0.readInt()
            boolean r12 = X.AnonymousClass7TF.A1P(r0)
            r7.ErR(r8, r9, r10, r11, r12)
            goto L_0x021e
        L_0x0207:
            r7.EFB()
            goto L_0x021e
        L_0x020b:
            r7.EHx()
            goto L_0x021e
        L_0x020f:
            int r0 = r0.readInt()
            r7.EQO(r0)
            goto L_0x021e
        L_0x0217:
            int r0 = r0.readInt()
            r7.EQT(r0)
        L_0x021e:
            r2.writeNoException()
            r6 = 1
        L_0x0222:
            r0 = 1660115826(0x62f35b72, float:2.244574E21)
            goto L_0x0028
        L_0x0227:
            r3 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r6 != r3) goto L_0x001f
            r2.writeString(r4)
            r0 = 719792414(0x2ae7291e, float:4.1062374E-13)
            X.AnonymousClass0fD.A0A(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.arfx.engine.common.AREngineService$binder$1.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public AREngineService$binder$1() {
        int A03 = AnonymousClass0fD.A03(667450032);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IAREngineServiceController");
        AnonymousClass0fD.A0A(-783022387, A03);
    }
}
