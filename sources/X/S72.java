package X;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzl;

public abstract class S72 {
    public Object A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Context A03;
    public final Object A04 = Pxe.A0p();
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r4 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(android.content.Context r7, X.SU6 r8) {
        /*
            r6 = this;
            r5 = r6
            X.Qxd r5 = (X.C8597Qxd) r5
            java.lang.String r0 = "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"
            android.os.IBinder r3 = r8.A08(r0)
            r2 = 0
            if (r3 == 0) goto L_0x001a
            java.lang.String r1 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator"
            android.os.IInterface r4 = r3.queryLocalInterface(r1)
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.zzn
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.internal.vision.zzn r4 = (com.google.android.gms.internal.vision.zzn) r4
            if (r4 != 0) goto L_0x002d
        L_0x001a:
            return r2
        L_0x001b:
            com.google.android.gms.internal.vision.zzp r4 = new com.google.android.gms.internal.vision.zzp
            r4.<init>(r1, r3)
            r0 = -420278230(0xffffffffe6f3102a, float:-5.739166E23)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = -237881695(0xfffffffff1d236a1, float:-2.0818526E30)
            X.AnonymousClass0fD.A0A(r0, r1)
        L_0x002d:
            com.google.android.gms.dynamic.ObjectWrapper r1 = new com.google.android.gms.dynamic.ObjectWrapper
            r1.<init>(r7)
            com.google.android.gms.internal.vision.zzk r3 = r5.A00
            X.AnonymousClass3Qk.A02(r3)
            com.google.android.gms.internal.vision.zzb r4 = (com.google.android.gms.internal.vision.zzb) r4
            r0 = 996171622(0x3b605f66, float:0.003423655)
            int r5 = X.AnonymousClass0fD.A03(r0)
            android.os.Parcel r2 = r4.A00()
            X.Pxf.A16(r1, r2)
            r1 = 0
            r0 = 1
            r2.writeInt(r0)
            r3.writeToParcel(r2, r1)
            android.os.Parcel r4 = r4.A01(r2, r0)
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0064
            r2 = 0
        L_0x005a:
            r4.recycle()
            r0 = -1837134743(0xffffffff927f8c69, float:-8.063688E-28)
            X.AnonymousClass0fD.A0A(r0, r5)
            return r2
        L_0x0064:
            java.lang.String r1 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector"
            android.os.IInterface r2 = r3.queryLocalInterface(r1)
            boolean r0 = r2 instanceof com.google.android.gms.internal.vision.zzl
            if (r0 != 0) goto L_0x005a
            com.google.android.gms.internal.vision.zzo r2 = new com.google.android.gms.internal.vision.zzo
            r2.<init>(r1, r3)
            r0 = 55434940(0x34ddebc, float:6.049977E-37)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 145437329(0x8ab3291, float:1.0303576E-33)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S72.A01(android.content.Context, X.SU6):java.lang.Object");
    }

    public final Object A00() {
        Object obj;
        synchronized (this.A04) {
            obj = this.A00;
            if (obj == null) {
                SU6 su6 = null;
                try {
                    su6 = SU6.A04(this.A03, SU6.A08, this.A06);
                } catch (C8968RJj unused) {
                    String str = this.A07;
                    String format = String.format("%s.%s", new Object[]{"com.google.android.gms.vision", str});
                    Object[] objArr = {format};
                    if (Log.isLoggable("Vision", 3)) {
                        String.format("Cannot load thick client module, fall back to load optional module %s", objArr);
                    }
                    try {
                        su6 = SU6.A04(this.A03, SU6.A0A, format);
                    } catch (C8968RJj e) {
                        Object[] objArr2 = {format};
                        if (Log.isLoggable("Vision", 6)) {
                            boolean isLoggable = Log.isLoggable("Vision", 3);
                            String format2 = String.format("Error loading optional module %s", objArr2);
                            if (isLoggable) {
                                Log.e("Vision", format2, e);
                            } else {
                                String valueOf = String.valueOf(e);
                                StringBuilder A0q = Pxh.A0q(valueOf, Pxf.A09(format2) + 2);
                                A0q.append(format2);
                                Log.e("Vision", Pxg.A0s(": ", valueOf, A0q));
                            }
                        }
                        if (!this.A01) {
                            Object[] objArr3 = {str};
                            if (Log.isLoggable("Vision", 3)) {
                                String.format("Broadcasting download intent for dependency %s", objArr3);
                            }
                            Intent A09 = DbS.A09();
                            A09.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                            A09.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                            A09.setAction("com.google.android.gms.vision.DEPENDENCY");
                            this.A03.sendBroadcast(A09);
                            this.A01 = true;
                        }
                    }
                }
                if (su6 != null) {
                    try {
                        this.A00 = A01(this.A03, su6);
                    } catch (C8968RJj | RemoteException e2) {
                        Log.e(this.A05, "Error creating remote native handle", e2);
                    }
                }
                boolean z = this.A02;
                if (!z && this.A00 == null) {
                    Log.w(this.A05, "Native handle not yet available. Reverting to no-op handle.");
                    this.A02 = true;
                } else if (z && this.A00 != null) {
                    Log.w(this.A05, "Native handle is now available.");
                }
                obj = this.A00;
            }
        }
        return obj;
    }

    public final void A03() {
        synchronized (this.A04) {
            if (this.A00 != null) {
                try {
                    A02();
                } catch (RemoteException e) {
                    Log.e(this.A05, "Could not finalize native handle", e);
                }
            }
        }
    }

    public S72(Context context, String str, String str2) {
        this.A03 = context;
        this.A05 = str;
        String valueOf = String.valueOf(str2);
        this.A06 = Pxg.A0l(valueOf.length(), "com.google.android.gms.vision.dynamite.", valueOf);
        this.A07 = str2;
    }

    public void A02() {
        if (A00() != null) {
            Object A002 = A00();
            AnonymousClass3Qk.A02(A002);
            zzb zzb = (zzb) ((zzl) A002);
            int A032 = AnonymousClass0fD.A03(1430192686);
            zzb.A02(zzb.A00(), 3);
            AnonymousClass0fD.A0A(212135401, A032);
        }
    }
}
