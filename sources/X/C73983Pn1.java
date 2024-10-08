package X;

import android.net.Uri;
import com.facebook.instagrammem.mca.MailboxInstagramMem$BytesAvailableHandlerCallback;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Pn1  reason: case insensitive filesystem */
public final class C73983Pn1 extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Uri A03;
    public final /* synthetic */ MailboxInstagramMem$BytesAvailableHandlerCallback A04;
    public final /* synthetic */ N2F A05;
    public final /* synthetic */ N2E A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ byte[] A09;
    public final /* synthetic */ byte[] A0A;
    public final /* synthetic */ byte[] A0B;
    public final /* synthetic */ byte[] A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73983Pn1(Uri uri, MailboxInstagramMem$BytesAvailableHandlerCallback mailboxInstagramMem$BytesAvailableHandlerCallback, N2F n2f, N2E n2e, Integer num, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2, long j) {
        super(1);
        this.A07 = num;
        this.A0A = bArr;
        this.A09 = bArr2;
        this.A0B = bArr3;
        this.A02 = j;
        this.A08 = str;
        this.A03 = uri;
        this.A0C = bArr4;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = mailboxInstagramMem$BytesAvailableHandlerCallback;
        this.A05 = n2f;
        this.A06 = n2e;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NAY nay = (NAY) obj;
        0qQ.A0B(nay, 0);
        int A002 = C69853NtH.A00(this.A07);
        byte[] bArr = this.A0A;
        byte[] bArr2 = this.A09;
        byte[] bArr3 = this.A0B;
        long j = this.A02;
        String str = this.A08;
        Uri uri = this.A03;
        byte[] bArr4 = this.A0C;
        int i = this.A01;
        int i2 = this.A00;
        if (i2 < 0) {
            i2 = 0;
        }
        MailboxInstagramMem$BytesAvailableHandlerCallback mailboxInstagramMem$BytesAvailableHandlerCallback = this.A04;
        N2F n2f = this.A05;
        C71722Opg A003 = C71722Opg.A00(this.A06, 35);
        AnonymousClass68L A0I = C66581MXm.A0I(nay);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, A003);
        C66582MXn.A1E(A0I, new C71705OpP(uri, mailboxInstagramMem$BytesAvailableHandlerCallback, n2f, nay, A0J, str, bArr, bArr2, bArr3, bArr4, A002, i, i2, j), A0J);
        return C60340gF.A00;
    }
}
