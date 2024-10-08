package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.signin.internal.zae;
import com.google.android.gms.signin.internal.zaf;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* renamed from: X.QqA  reason: case insensitive filesystem */
public final class C8405QqA extends AnonymousClass645 implements C13954TmH {
    public final Integer A00;
    public final Bundle A01;
    public final AnonymousClass643 A02;

    public final String A05() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String A06() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void FOS(zae zae) {
        GoogleSignInAccount googleSignInAccount;
        try {
            String A002 = C273654mx.A00(1175);
            Account account = new Account(A002, "com.google");
            if (A002.equals(account.name)) {
                googleSignInAccount = SPD.A00(this.A0F).A01();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.A00;
            AnonymousClass3Qk.A02(num);
            zat zat = new zat(account, googleSignInAccount, 2, num.intValue());
            zaa zaa = (zaa) A03();
            zai zai = new zai(zat, 1);
            int A03 = AnonymousClass0fD.A03(2108055427);
            Parcel A003 = zaa.A00();
            A003.writeInt(1);
            zai.writeToParcel(A003, 0);
            Pxf.A16(zae, A003);
            zaa.A01(A003, 12);
            AnonymousClass0fD.A0A(-1036543505, A03);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zae.FOP(new zak(new ConnectionResult(8, (PendingIntent) null), (zav) null, 1));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final boolean requiresSignIn() {
        return true;
    }

    public C8405QqA(Context context, Bundle bundle, Looper looper, AnonymousClass63y r12, AnonymousClass640 r13, AnonymousClass643 r14) {
        super(context, looper, r12, r13, r14, 44);
        this.A02 = r14;
        this.A01 = bundle;
        this.A00 = r14.A00;
    }

    public final Bundle A02() {
        String str = this.A02.A02;
        if (!this.A0F.getPackageName().equals(str)) {
            this.A01.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.A01;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zaf) {
            return queryLocalInterface;
        }
        zaa zaa = new zaa("com.google.android.gms.signin.internal.ISignInService", iBinder);
        AnonymousClass0fD.A0A(1700845582, AnonymousClass0fD.A03(-1717546403));
        return zaa;
    }
}
