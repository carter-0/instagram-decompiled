package X;

import android.content.res.Resources;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.T7t  reason: case insensitive filesystem */
public final class C12806T7t implements C13757TgT {
    public final /* synthetic */ S3Q A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C12806T7t(S3Q s3q, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = s3q;
    }

    public final void Dod(Integer num) {
        String str;
        if (this.A02) {
            str = "ENABLED_AUTOFILL";
        } else {
            str = "DISABLED_AUTOFILL";
        }
        String str2 = "CONTACT_AUTOFILL";
        if (!0qQ.A0K(this.A01, str2)) {
            str2 = "PAYMENT_AUTOFILL";
        }
        C11242SHc sHc = this.A00.A03;
        if (sHc.A04) {
            1Ln A06 = 1Ln.A06(sHc.A00);
            if (DbT.A1Y(A06)) {
                A06.A0k(str2);
                A06.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                A06.Cgf();
            }
        }
    }

    public final void onFailure(Throwable th) {
        S3Q s3q = this.A00;
        0sL r1 = s3q.A07;
        String str = this.A01;
        boolean z = this.A02;
        r1.invoke(str, Boolean.valueOf(!z));
        1xC r2 = 1xC.A01;
        Resources resources = s3q.A00.getResources();
        0qQ.A07(resources);
        r2.A00(new AnonymousClass3GP(Dc5.A02(resources, new C12804T7r(s3q, str, z))));
    }
}
