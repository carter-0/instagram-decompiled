package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzl;
import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;

/* renamed from: X.Qxg  reason: case insensitive filesystem */
public final class C8599Qxg extends C10903S0d {
    public final C8597Qxd A00;

    /* JADX WARNING: type inference failed for: r7v0, types: [android.os.Parcelable, java.lang.Object, com.google.android.gms.internal.vision.zzs] */
    public final SparseArray A01(S24 s24) {
        Barcode[] barcodeArr;
        ? obj = new Object();
        C10473Rso rso = s24.A02;
        obj.A00 = rso.A00;
        obj.A01 = rso.A01;
        obj.A03 = 0;
        obj.A02 = 0;
        obj.A04 = 0;
        Bitmap bitmap = s24.A00;
        if (bitmap != null) {
            C8597Qxd qxd = this.A00;
            if (!AnonymousClass7TF.A1V(qxd.A00())) {
                barcodeArr = new Barcode[0];
            } else {
                try {
                    ObjectWrapper objectWrapper = new ObjectWrapper(bitmap);
                    Object A002 = qxd.A00();
                    AnonymousClass3Qk.A02(A002);
                    zzb zzb = (zzb) ((zzl) A002);
                    int A03 = AnonymousClass0fD.A03(-1436719897);
                    Parcel A003 = zzb.A00();
                    Pxf.A16(objectWrapper, A003);
                    A003.writeInt(1);
                    obj.writeToParcel(A003, 0);
                    Parcel A01 = zzb.A01(A003, 2);
                    barcodeArr = (Barcode[]) A01.createTypedArray(Barcode.CREATOR);
                    A01.recycle();
                    AnonymousClass0fD.A0A(-2065881195, A03);
                } catch (RemoteException e) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                    barcodeArr = new Barcode[0];
                }
            }
            if (barcodeArr == null) {
                throw AnonymousClass7TE.A0w("Internal barcode detector error; check logcat output.");
            }
        } else {
            ByteBuffer A004 = s24.A00();
            C8597Qxd qxd2 = this.A00;
            AnonymousClass3Qk.A02(A004);
            if (!AnonymousClass7TF.A1V(qxd2.A00())) {
                barcodeArr = new Barcode[0];
            } else {
                try {
                    ObjectWrapper objectWrapper2 = new ObjectWrapper(A004);
                    Object A005 = qxd2.A00();
                    AnonymousClass3Qk.A02(A005);
                    zzb zzb2 = (zzb) ((zzl) A005);
                    int A032 = AnonymousClass0fD.A03(176351068);
                    Parcel A006 = zzb2.A00();
                    Pxf.A16(objectWrapper2, A006);
                    A006.writeInt(1);
                    obj.writeToParcel(A006, 0);
                    Parcel A012 = zzb2.A01(A006, 1);
                    barcodeArr = (Barcode[]) A012.createTypedArray(Barcode.CREATOR);
                    A012.recycle();
                    AnonymousClass0fD.A0A(-1206288851, A032);
                } catch (RemoteException e2) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e2);
                    barcodeArr = new Barcode[0];
                }
            }
        }
        SparseArray sparseArray = new SparseArray(r5);
        for (Barcode barcode : barcodeArr) {
            sparseArray.append(barcode.A0C.hashCode(), barcode);
        }
        return sparseArray;
    }

    public C8599Qxg(C8597Qxd qxd) {
        this.A00 = qxd;
    }

    public final void A00() {
        super.A00();
        this.A00.A03();
    }

    public C8599Qxg() {
        throw AnonymousClass7TE.A0z("Default constructor called");
    }
}
