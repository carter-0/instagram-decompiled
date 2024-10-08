package X;

import android.net.Uri;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Pmp  reason: case insensitive filesystem */
public final class C73971Pmp extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ ODP A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ byte[] A05;
    public final /* synthetic */ byte[] A06;
    public final /* synthetic */ byte[] A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73971Pmp(Uri uri, ODP odp, Integer num, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        super(1);
        this.A03 = num;
        this.A06 = bArr;
        this.A05 = bArr2;
        this.A07 = bArr3;
        this.A00 = j;
        this.A04 = str;
        this.A01 = uri;
        this.A02 = odp;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NAY nay = (NAY) obj;
        0qQ.A0B(nay, 0);
        int A002 = C69853NtH.A00(this.A03);
        byte[] bArr = this.A06;
        byte[] bArr2 = this.A05;
        byte[] bArr3 = this.A07;
        long j = this.A00;
        String str = this.A04;
        Uri uri = this.A01;
        C71722Opg A003 = C71722Opg.A00(this.A02, 30);
        AnonymousClass68L A0I = C66581MXm.A0I(nay);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, A003);
        C66582MXn.A1E(A0I, new C71698OpI(uri, nay, A0J, str, bArr, bArr2, bArr3, A002, j), A0J);
        return C60340gF.A00;
    }
}
