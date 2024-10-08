package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.zzg;
import com.google.android.gms.internal.fido.zza;

public final /* synthetic */ class SxN implements C13636Te2 {
    public final /* synthetic */ C8363QpL A00;
    public final /* synthetic */ PublicKeyCredentialRequestOptions A01;

    public /* synthetic */ SxN(C8363QpL qpL, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        this.A00 = qpL;
        this.A01 = publicKeyCredentialRequestOptions;
    }

    public final void accept(Object obj, Object obj2) {
        zzg zzg = new zzg((C365498nD) obj2);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.A01;
        int A03 = AnonymousClass0fD.A03(-371256735);
        int A032 = AnonymousClass0fD.A03(-583546164);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        AnonymousClass0fD.A0A(-746055467, A032);
        obtain.writeStrongBinder(zzg);
        obtain.writeInt(1);
        publicKeyCredentialRequestOptions.writeToParcel(obtain, 0);
        ((zza) ((BaseGmsClient) obj).A03()).A00(obtain, 2);
        AnonymousClass0fD.A0A(1978984992, A03);
    }
}
