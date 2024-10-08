package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class T5C implements C13788Th3 {
    public zzh A00;
    public boolean A01;
    public final Context A02;
    public final zzp A03 = new zzp((String) null);

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.mlkit_vision_text_common.zzd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.QwW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.QwW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.TeE, java.lang.Object] */
    public final C11167SDe FP0(C10615Rv9 rv9) {
        List qwe;
        C8535QwZ qwe2;
        String str;
        int i;
        if (this.A00 == null) {
            FPF();
        }
        if (this.A00 != null) {
            C10615Rv9 rv92 = rv9;
            ObjectWrapper objectWrapper = new ObjectWrapper(rv92.A02);
            int i2 = rv92.A00;
            int i3 = rv92.A01;
            ? obj = new Object();
            obj.A00 = i2;
            obj.A01 = i3;
            obj.A02 = 0;
            obj.A04 = 0;
            obj.A03 = 0;
            try {
                zzh zzh = this.A00;
                AnonymousClass3Qk.A02(zzh);
                int A032 = AnonymousClass0fD.A03(-559114030);
                Parcel A002 = zzh.A00();
                Pxf.A16(objectWrapper, A002);
                A002.writeInt(1);
                obj.writeToParcel(A002, 0);
                Parcel A012 = zzh.A01(A002, 1);
                zzl[] zzlArr = (zzl[]) A012.createTypedArray(zzl.CREATOR);
                A012.recycle();
                AnonymousClass0fD.A0A(304528109, A032);
                SparseArray A0L = Pxe.A0L();
                for (zzl zzl : zzlArr) {
                    SparseArray sparseArray = A0L;
                    SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzl.A02);
                    if (sparseArray2 == null) {
                        sparseArray2 = Pxe.A0L();
                        sparseArray.append(zzl.A02, sparseArray2);
                    }
                    sparseArray2.append(zzl.A03, zzl);
                }
                C8548Qwm qwm = C8535QwZ.A00;
                ? obj2 = new Object();
                obj2.A02 = new Object[4];
                obj2.A00 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= A0L.size()) {
                        break;
                    }
                    SparseArray sparseArray3 = (SparseArray) A0L.valueAt(i5);
                    ? obj3 = new Object();
                    obj3.A02 = new Object[4];
                    obj3.A00 = 0;
                    for (int i6 = 0; i6 < sparseArray3.size(); i6++) {
                        obj3.A00(sparseArray3.valueAt(i6));
                    }
                    obj3.A01 = true;
                    Object[] objArr = obj3.A02;
                    int i7 = obj3.A00;
                    if (i7 == 0) {
                        qwe2 = C8540Qwe.A02;
                    } else {
                        qwe2 = new C8540Qwe(objArr, i7);
                    }
                    List<C10702Rwg> A003 = C9716RfZ.A00(new Object(), qwe2);
                    zzf zzf = ((zzl) qwe2.get(0)).A04;
                    C8548Qwm A04 = qwe2.listIterator(0);
                    int i8 = AnonymousClass972.MUTABLE_FLAG_MASK;
                    int i9 = AnonymousClass972.MUTABLE_FLAG_MASK;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = Integer.MAX_VALUE;
                    while (A04.hasNext()) {
                        zzf zzf2 = ((zzl) A04.next()).A04;
                        int i12 = zzf.A01;
                        int i13 = zzf.A02;
                        double radians = Math.toRadians((double) zzf.A00);
                        double sin = Math.sin(radians);
                        double cos = Math.cos(radians);
                        Point[] pointArr = new Point[4];
                        Point point = new Point(zzf2.A01, zzf2.A02);
                        pointArr[0] = point;
                        point.offset(-i12, -i13);
                        Point point2 = pointArr[0];
                        int i14 = point2.x;
                        double d = (double) point2.y;
                        int i15 = (int) ((((double) i14) * cos) + (d * sin));
                        int i16 = (int) ((((double) (-i14)) * sin) + (d * cos));
                        point2.x = i15;
                        point2.y = i16;
                        int i17 = zzf2.A03 + i15;
                        pointArr[1] = new Point(i17, i16);
                        int i18 = zzf2.A04 + i16;
                        pointArr[2] = new Point(i17, i18);
                        pointArr[3] = new Point(i15, i18);
                        int i19 = 0;
                        do {
                            Point point3 = pointArr[i19];
                            int i20 = point3.x;
                            i10 = Math.min(i10, i20);
                            i8 = Math.max(i8, i20);
                            int i21 = point3.y;
                            i11 = Math.min(i11, i21);
                            i9 = Math.max(i9, i21);
                            i19++;
                        } while (i19 < 4);
                    }
                    int i22 = zzf.A01;
                    int i23 = zzf.A02;
                    double radians2 = Math.toRadians((double) zzf.A00);
                    double sin2 = Math.sin(radians2);
                    double cos2 = Math.cos(radians2);
                    Point[] pointArr2 = {new Point(i10, i11), new Point(i8, i11), new Point(i8, i9), new Point(i10, i9)};
                    int i24 = 0;
                    do {
                        Point point4 = pointArr2[i24];
                        int i25 = point4.x;
                        double d2 = (double) point4.y;
                        point4.x = (int) ((((double) i25) * cos2) - (d2 * sin2));
                        point4.y = (int) ((((double) i25) * sin2) + (d2 * cos2));
                        point4.offset(i22, i23);
                        i24++;
                    } while (i24 < 4);
                    List asList = Arrays.asList(pointArr2);
                    String A004 = C10093RmV.A00.A00(C9716RfZ.A00(SyX.A00, A003));
                    Rect A005 = SAA.A00(asList);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    for (C10702Rwg rwg : A003) {
                        String str2 = rwg.A02;
                        if (A1E.containsKey(str2)) {
                            i = AnonymousClass7TE.A0M(A1E.get(str2));
                        } else {
                            i = 0;
                        }
                        C66581MXm.A1S(str2, A1E, i + 1);
                    }
                    Set entrySet = A1E.entrySet();
                    if (entrySet.isEmpty() || (str = DbT.A13((Map.Entry) Collections.max(entrySet, C10093RmV.A01))) == null || str.isEmpty()) {
                        str = "und";
                    }
                    obj2.A00(new R2y(A005, A004, str, asList, A003));
                    i4++;
                }
                obj2.A01 = true;
                Object[] objArr2 = obj2.A02;
                int i26 = obj2.A00;
                if (i26 == 0) {
                    qwe = C8540Qwe.A02;
                } else {
                    qwe = new C8540Qwe(objArr2, i26);
                }
                C10093RmV.A00.A00(C9716RfZ.A00(SyY.A00, qwe));
                return new C11167SDe(qwe);
            } catch (RemoteException e) {
                throw new C8992RKk("Failed to run legacy text recognizer.", (Throwable) e);
            }
        } else {
            throw new C8992RKk("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [com.google.android.gms.internal.mlkit_vision_text_common.zza] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FPF() {
        /*
            r8 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r0 = r8.A00
            if (r0 != 0) goto L_0x00ac
            android.content.Context r5 = r8.A02     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            X.Te5 r1 = X.SU6.A0A     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            java.lang.String r0 = "com.google.android.gms.vision.dynamite"
            X.SU6 r1 = X.SU6.A04(r5, r1, r0)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            java.lang.String r0 = "com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator"
            android.os.IBinder r2 = r1.A08(r0)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            if (r2 != 0) goto L_0x0018
            r4 = 0
            goto L_0x0024
        L_0x0018:
            java.lang.String r1 = "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator"
            android.os.IInterface r4 = r2.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzk     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.internal.mlkit_vision_text_common.zzk r4 = (com.google.android.gms.internal.mlkit_vision_text_common.zzk) r4     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
        L_0x0024:
            com.google.android.gms.dynamic.ObjectWrapper r3 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r3.<init>(r5)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            com.google.android.gms.internal.mlkit_vision_text_common.zzp r2 = r8.A03     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            com.google.android.gms.internal.mlkit_vision_text_common.zza r4 = (com.google.android.gms.internal.mlkit_vision_text_common.zza) r4     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r0 = 1069776854(0x3fc37fd6, float:1.5273387)
            int r7 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            android.os.Parcel r1 = r4.A00()     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            X.Pxf.A16(r3, r1)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r6 = 1
            r1.writeInt(r6)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r0 = 0
            r2.writeToParcel(r1, r0)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            android.os.Parcel r4 = r4.A01(r1, r6)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            android.os.IBinder r3 = r4.readStrongBinder()     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            if (r3 != 0) goto L_0x0063
            goto L_0x0061
        L_0x004e:
            com.google.android.gms.internal.mlkit_vision_text_common.zzi r4 = new com.google.android.gms.internal.mlkit_vision_text_common.zzi     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r4.<init>(r1, r2)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r0 = -1078268369(0xffffffffbfbaee2f, float:-1.4603938)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r0 = -1714970687(0xffffffff99c79fc1, float:-2.0640642E-23)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            goto L_0x0024
        L_0x0061:
            r2 = 0
            goto L_0x006f
        L_0x0063:
            java.lang.String r1 = "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer"
            android.os.IInterface r2 = r3.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzh     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            if (r0 == 0) goto L_0x007b
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzh) r2     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
        L_0x006f:
            r4.recycle()     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r0 = 672878838(0x281b50f6, float:8.621784E-15)
            X.AnonymousClass0fD.A0A(r0, r7)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r8.A00 = r2     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            goto L_0x008e
        L_0x007b:
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r2 = new com.google.android.gms.internal.mlkit_vision_text_common.zzh     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r2.<init>(r1, r3)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r0 = 563648400(0x21989790, float:1.0340039E-18)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r0 = -401952875(0xffffffffe80aaf95, float:-2.619702E24)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            goto L_0x006f
        L_0x008e:
            if (r2 != 0) goto L_0x00ac
            boolean r0 = r8.A01     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            if (r0 != 0) goto L_0x00ac
            X.C9747Rg5.A00(r5)     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            r8.A01 = r6     // Catch:{ RemoteException -> 0x00a3, RJj -> 0x009a }
            return
        L_0x009a:
            r2 = move-exception
            java.lang.String r1 = "Failed to load deprecated vision dynamite module."
            X.RKk r0 = new X.RKk
            r0.<init>((java.lang.String) r1, (java.lang.Throwable) r2)
            throw r0
        L_0x00a3:
            r2 = move-exception
            java.lang.String r1 = "Failed to create legacy text recognizer."
            X.RKk r0 = new X.RKk
            r0.<init>((java.lang.String) r1, (java.lang.Throwable) r2)
            throw r0
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5C.FPF():void");
    }

    public final void FPO() {
        zzh zzh = this.A00;
        if (zzh != null) {
            try {
                int A032 = AnonymousClass0fD.A03(476126879);
                zzh.A02(zzh.A00(), 2);
                AnonymousClass0fD.A0A(-518064536, A032);
            } catch (RemoteException e) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e);
            }
            this.A00 = null;
        }
    }

    public T5C(Context context) {
        this.A02 = context;
    }
}
