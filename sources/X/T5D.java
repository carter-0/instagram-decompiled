package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_text_common.zznl;
import com.google.android.gms.internal.mlkit_vision_text_common.zznn;
import com.google.android.gms.internal.mlkit_vision_text_common.zznx;

public final class T5D implements C13788Th3 {
    public zznn A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final SJS A04;

    public T5D(Context context, SJS sjs) {
        this.A03 = context;
        this.A04 = sjs;
    }

    public final C11167SDe FP0(C10615Rv9 rv9) {
        Parcelable parcelable;
        if (this.A00 == null) {
            FPF();
        }
        zznn zznn = this.A00;
        AnonymousClass3Qk.A02(zznn);
        if (!this.A01) {
            try {
                int A032 = AnonymousClass0fD.A03(-131919119);
                zznn.A02(zznn.A00(), 1);
                AnonymousClass0fD.A0A(-1945397078, A032);
                this.A01 = true;
            } catch (RemoteException e) {
                String valueOf = String.valueOf(this.A04.A00());
                throw new C8992RKk(Pxg.A0l(valueOf.length(), "Failed to init text recognizer ", valueOf), (Throwable) e);
            }
        }
        zznl zznl = new zznl(-1, rv9.A00, rv9.A01, SystemClock.elapsedRealtime(), 0);
        Bitmap bitmap = rv9.A02;
        AnonymousClass3Qk.A02(bitmap);
        ObjectWrapper objectWrapper = new ObjectWrapper(bitmap);
        try {
            int A033 = AnonymousClass0fD.A03(-563486545);
            Parcel A002 = zznn.A00();
            Pxf.A16(objectWrapper, A002);
            A002.writeInt(1);
            zznl.writeToParcel(A002, 0);
            Parcel A012 = zznn.A01(A002, 3);
            Parcelable.Creator creator = zznx.CREATOR;
            if (A012.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A012);
            }
            A012.recycle();
            AnonymousClass0fD.A0A(-141459495, A033);
            return new C11167SDe((zznx) parcelable);
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(this.A04.A00());
            throw new C8992RKk(Pxg.A0l(valueOf2.length(), "Failed to run text recognizer ", valueOf2), (Throwable) e2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [com.google.android.gms.internal.mlkit_vision_text_common.zza] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FPF() {
        /*
            r6 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zznn r0 = r6.A00
            if (r0 != 0) goto L_0x00f6
            android.content.Context r5 = r6.A03     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            X.SJS r2 = r6.A04     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            boolean r0 = r2.A01()     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            if (r0 == 0) goto L_0x0032
            X.Te5 r1 = X.SU6.A09     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
        L_0x0010:
            boolean r0 = r2.A01()     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r4 = 1
            if (r4 == r0) goto L_0x002f
            java.lang.String r0 = "com.google.android.gms.vision.ocr"
        L_0x0019:
            X.SU6 r1 = X.SU6.A04(r5, r1, r0)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            boolean r0 = r2.A01()     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            if (r4 == r0) goto L_0x002c
            java.lang.String r0 = "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"
        L_0x0025:
            android.os.IBinder r3 = r1.A08(r0)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            if (r3 != 0) goto L_0x0037
            goto L_0x0035
        L_0x002c:
            java.lang.String r0 = "com.google.mlkit.vision.text.bundled.latin.BundledLatinTextRecognizerCreator"
            goto L_0x0025
        L_0x002f:
            java.lang.String r0 = "com.google.mlkit.dynamite.text.latin"
            goto L_0x0019
        L_0x0032:
            X.Te5 r1 = X.SU6.A0A     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            goto L_0x0010
        L_0x0035:
            r2 = 0
            goto L_0x0043
        L_0x0037:
            java.lang.String r1 = "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator"
            android.os.IInterface r2 = r3.queryLocalInterface(r1)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zznq     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            if (r0 == 0) goto L_0x0063
            com.google.android.gms.internal.mlkit_vision_text_common.zznq r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zznq) r2     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
        L_0x0043:
            com.google.android.gms.dynamic.ObjectWrapper r1 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r1.<init>(r5)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            com.google.android.gms.internal.mlkit_vision_text_common.zza r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zza) r2     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r0 = -796736909(0xffffffffd082c273, float:-1.7550252E10)
            int r5 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            android.os.Parcel r0 = r2.A00()     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            X.Pxf.A16(r1, r0)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            android.os.Parcel r4 = r2.A01(r0, r4)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            android.os.IBinder r3 = r4.readStrongBinder()     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            if (r3 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0063:
            com.google.android.gms.internal.mlkit_vision_text_common.zzno r2 = new com.google.android.gms.internal.mlkit_vision_text_common.zzno     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r2.<init>(r1, r3)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r0 = 1458534025(0x56ef7689, float:1.31646192E14)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r0 = -630259893(0xffffffffda6eff4b, float:-1.68179355E16)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            goto L_0x0043
        L_0x0076:
            r2 = 0
            goto L_0x0084
        L_0x0078:
            java.lang.String r1 = "com.google.mlkit.vision.text.aidls.ITextRecognizer"
            android.os.IInterface r2 = r3.queryLocalInterface(r1)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zznn     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            if (r0 == 0) goto L_0x0090
            com.google.android.gms.internal.mlkit_vision_text_common.zznn r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zznn) r2     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
        L_0x0084:
            r4.recycle()     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r0 = -1044201980(0xffffffffc1c2be04, float:-24.342781)
            X.AnonymousClass0fD.A0A(r0, r5)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r6.A00 = r2     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            goto L_0x00a3
        L_0x0090:
            com.google.android.gms.internal.mlkit_vision_text_common.zznn r2 = new com.google.android.gms.internal.mlkit_vision_text_common.zznn     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r2.<init>(r1, r3)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r0 = 559714607(0x215c912f, float:7.473105E-19)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            r0 = 1084453230(0x40a3716e, float:5.1075964)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ RJj -> 0x00bf, RemoteException -> 0x00a4 }
            goto L_0x0084
        L_0x00a3:
            return
        L_0x00a4:
            r3 = move-exception
            X.SJS r0 = r6.A04
            java.lang.String r0 = r0.A00()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Failed to create text recognizer "
            int r0 = r2.length()
            java.lang.String r1 = X.Pxg.A0l(r0, r1, r2)
            X.RKk r0 = new X.RKk
            r0.<init>((java.lang.String) r1, (java.lang.Throwable) r3)
            throw r0
        L_0x00bf:
            r3 = move-exception
            X.SJS r2 = r6.A04
            boolean r0 = r2.A01()
            r1 = 1
            if (r0 != 0) goto L_0x00de
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x00d4
            android.content.Context r0 = r6.A03
            X.C9747Rg5.A00(r0)
            r6.A02 = r1
        L_0x00d4:
            r2 = 14
            java.lang.String r0 = "Waiting for the text optional module to be downloaded. Please wait."
            X.RKk r1 = new X.RKk
            r1.<init>((java.lang.String) r0, (int) r2)
            throw r1
        L_0x00de:
            java.lang.String r1 = r2.A00()
            java.lang.String r0 = r3.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Failed to load text module %s. %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.RKk r1 = new X.RKk
            r1.<init>((java.lang.String) r0, (java.lang.Throwable) r3)
            throw r1
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5D.FPF():void");
    }

    public final void FPO() {
        zznn zznn = this.A00;
        if (zznn != null) {
            try {
                int A032 = AnonymousClass0fD.A03(967230893);
                zznn.A02(zznn.A00(), 2);
                AnonymousClass0fD.A0A(-474967504, A032);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(this.A04.A00());
                Log.e("DecoupledTextDelegate", Pxg.A0l(valueOf.length(), "Failed to release text recognizer ", valueOf), e);
            }
            this.A00 = null;
        }
        this.A01 = false;
    }
}
