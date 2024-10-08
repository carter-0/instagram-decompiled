package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzw;

public final /* synthetic */ class SxV implements C13636Te2 {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ QpR A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ SxV(Account account, Bundle bundle, QpR qpR, String str) {
        this.A02 = qpR;
        this.A00 = account;
        this.A03 = str;
        this.A01 = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        zza zza = (zza) ((BaseGmsClient) obj).A03();
        zzw zzw = new zzw((C365498nD) obj2);
        Account account = this.A00;
        String str = this.A03;
        Bundle bundle = this.A01;
        int A032 = AnonymousClass0fD.A03(1258638941);
        Parcel A002 = zza.A00();
        Pxf.A16(zzw, A002);
        SMV.A00(A002, account);
        A002.writeString(str);
        SMV.A00(A002, bundle);
        zza.A02(A002, 1);
        AnonymousClass0fD.A0A(1270717686, A032);
    }
}
