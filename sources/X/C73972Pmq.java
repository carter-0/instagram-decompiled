package X;

import android.net.Uri;
import android.util.Base64;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.io.IOException;

/* renamed from: X.Pmq  reason: case insensitive filesystem */
public final class C73972Pmq extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ C71105Ocj A03;
    public final /* synthetic */ N2E A04;
    public final /* synthetic */ CommonMediaTransport A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73972Pmq(Uri uri, C71105Ocj ocj, N2E n2e, CommonMediaTransport commonMediaTransport, Integer num, String str, int i, int i2) {
        super(1);
        this.A04 = n2e;
        this.A03 = ocj;
        this.A06 = num;
        this.A05 = commonMediaTransport;
        this.A02 = uri;
        this.A07 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        if (str == null) {
            N2E n2e = this.A04;
            0KC.A0C("ArmadilloExpressStreamableDownloadResponse", AnonymousClass7TF.A0m("Closing due to error: ", new IOException("Failed to retrieve restore url")));
            N2E.A00(n2e);
        } else {
            C71105Ocj ocj = this.A03;
            AnonymousClass0eM r0 = C71105Ocj.A05;
            UserSession userSession = ocj.A01;
            Integer num = this.A06;
            CommonMediaTransport commonMediaTransport = this.A05;
            String str2 = commonMediaTransport.fileSha256_;
            0qQ.A07(str2);
            byte[] decode = Base64.decode(str2, 2);
            0qQ.A07(decode);
            String str3 = commonMediaTransport.fileEncSha256_;
            0qQ.A07(str3);
            byte[] decode2 = Base64.decode(str3, 2);
            0qQ.A07(decode2);
            String str4 = commonMediaTransport.mediaKey_;
            0qQ.A07(str4);
            byte[] decode3 = Base64.decode(str4, 2);
            0qQ.A07(decode3);
            long A08 = C66580MXl.A08(commonMediaTransport.mediaKeyTimestamp_);
            Uri uri = this.A02;
            0qQ.A0A(uri);
            byte[] decode4 = Base64.decode(this.A07, 2);
            0qQ.A07(decode4);
            int i = this.A01;
            int i2 = this.A00;
            N2E n2e2 = this.A04;
            AnonymousClass7TF.A1E(num, 1, uri);
            OXH.A02(new C73983Pn1(uri, n2e2, new N2F(n2e2), n2e2, num, str, decode, decode2, decode3, decode4, i, i2, A08), userSession);
        }
        return C60340gF.A00;
    }
}
