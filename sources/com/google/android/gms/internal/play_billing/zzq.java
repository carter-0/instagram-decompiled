package com.google.android.gms.internal.play_billing;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import X.SQS;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzq implements IInterface, zzs {
    public final IBinder A00;

    public zzq(String str, IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(678282863);
        this.A00 = iBinder;
        AnonymousClass0fD.A0A(-1496362575, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-484911195);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(631168460, A03);
        return iBinder;
    }

    public zzq(IBinder iBinder) {
        this("com.android.vending.billing.IInAppBillingService", iBinder);
        AnonymousClass0fD.A0A(-54439185, AnonymousClass0fD.A03(-1240290399));
    }

    public static Bundle A00(Parcel parcel, zzq zzq, int i) {
        Parcel A03 = zzq.A03(parcel, i);
        Bundle bundle = (Bundle) SQS.A00(A03, Bundle.CREATOR);
        A03.recycle();
        return bundle;
    }

    public static void A01(Parcel parcel, String str, String str2, int i) {
        parcel.writeInt(i);
        parcel.writeString(str);
        parcel.writeString(str2);
    }

    public final Parcel A02() {
        int A03 = AnonymousClass0fD.A03(-1274318119);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        AnonymousClass0fD.A0A(-795885213, A03);
        return obtain;
    }

    public final Parcel A03(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(191137988);
        parcel = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            AnonymousClass0fD.A0A(1628576773, A03);
        }
    }

    public final int FOu(int i, String str, String str2) {
        int A03 = AnonymousClass0fD.A03(-638272200);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        Parcel A032 = A03(A02, 5);
        int readInt = A032.readInt();
        A032.recycle();
        AnonymousClass0fD.A0A(-1484769603, A03);
        return readInt;
    }

    public final int FPS(Bundle bundle, String str, String str2, int i) {
        int A03 = AnonymousClass0fD.A03(-1198202798);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        SQS.A01(A02, bundle);
        Parcel A032 = A03(A02, 10);
        int readInt = A032.readInt();
        A032.recycle();
        AnonymousClass0fD.A0A(72009387, A03);
        return readInt;
    }

    public final Bundle FPZ(Bundle bundle, String str, String str2, int i) {
        int A03 = AnonymousClass0fD.A03(1246135016);
        Parcel A02 = A02();
        A01(A02, str, str2, 9);
        SQS.A01(A02, bundle);
        Bundle A002 = A00(A02, this, 902);
        AnonymousClass0fD.A0A(152304438, A03);
        return A002;
    }

    public final Bundle FPh(Bundle bundle, String str, String str2, int i) {
        int A03 = AnonymousClass0fD.A03(272557791);
        Parcel A02 = A02();
        A01(A02, str, str2, 9);
        SQS.A01(A02, bundle);
        Bundle A002 = A00(A02, this, 12);
        AnonymousClass0fD.A0A(1058619827, A03);
        return A002;
    }

    public final Bundle FPn(String str, String str2, String str3, String str4, int i) {
        int A03 = AnonymousClass0fD.A03(-1307383102);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        A02.writeString(str3);
        A02.writeString((String) null);
        Bundle A002 = A00(A02, this, 3);
        AnonymousClass0fD.A0A(-364791396, A03);
        return A002;
    }

    public final Bundle FPu(Bundle bundle, String str, String str2, String str3, String str4, int i) {
        int A03 = AnonymousClass0fD.A03(970179152);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        A02.writeString(str3);
        A02.writeString((String) null);
        SQS.A01(A02, bundle);
        Bundle A002 = A00(A02, this, 8);
        AnonymousClass0fD.A0A(-1636542717, A03);
        return A002;
    }

    public final Bundle FQ0(Bundle bundle, String str, String str2, String str3, int i) {
        int A03 = AnonymousClass0fD.A03(1867122103);
        Parcel A02 = A02();
        A01(A02, str, str2, 6);
        A02.writeString(str3);
        SQS.A01(A02, bundle);
        Bundle A002 = A00(A02, this, 9);
        AnonymousClass0fD.A0A(-2143232390, A03);
        return A002;
    }

    public final Bundle FQ4(String str, String str2, String str3, int i) {
        int A03 = AnonymousClass0fD.A03(-744358610);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        A02.writeString(str3);
        Bundle A002 = A00(A02, this, 4);
        AnonymousClass0fD.A0A(1149163865, A03);
        return A002;
    }

    public final Bundle FQ8(Bundle bundle, String str, String str2, String str3, int i) {
        int A03 = AnonymousClass0fD.A03(277151362);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        A02.writeString(str3);
        SQS.A01(A02, bundle);
        Bundle A002 = A00(A02, this, 11);
        AnonymousClass0fD.A0A(1936986514, A03);
        return A002;
    }

    public final Bundle FQB(Bundle bundle, String str, String str2, int i) {
        int A03 = AnonymousClass0fD.A03(-1186087047);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        SQS.A01(A02, bundle);
        Bundle A002 = A00(A02, this, 2);
        AnonymousClass0fD.A0A(250668223, A03);
        return A002;
    }

    public final Bundle FQE(Bundle bundle, Bundle bundle2, String str, String str2, int i) {
        int A03 = AnonymousClass0fD.A03(1543223846);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        SQS.A01(A02, bundle);
        SQS.A01(A02, bundle2);
        Bundle A002 = A00(A02, this, 901);
        AnonymousClass0fD.A0A(-2333570, A03);
        return A002;
    }

    public final int FQT(int i, String str, String str2) {
        int A03 = AnonymousClass0fD.A03(1533316962);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        Parcel A032 = A03(A02, 1);
        int readInt = A032.readInt();
        A032.recycle();
        AnonymousClass0fD.A0A(1329997573, A03);
        return readInt;
    }
}
