package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Oqx  reason: case insensitive filesystem */
public final class C71796Oqx implements C257113ws {
    public C257113ws A00;
    public final UserSession A01;
    public final C71799Or0 A02;
    public final C71798Oqz A03;

    public final /* synthetic */ void cancel() {
    }

    public final long open(C257263x7 r5) {
        C257113ws r0;
        String A0R;
        0qQ.A0B(r5, 0);
        Uri uri = r5.A06;
        0qQ.A06(uri);
        if (uri.getQueryParameter("sidecar") != null) {
            C71042OaK oaK = OyP.A08;
            OyP A012 = C71042OaK.A01(this.A01);
            String queryParameter = uri.getQueryParameter("sha256");
            String queryParameter2 = uri.getQueryParameter("mimetype");
            if (queryParameter == null || queryParameter2 == null || (A0R = 002.A0R(C69852NtG.A00(queryParameter), C66834MdS.A05(queryParameter2))) == null || !OyP.A00(A012, A0R).exists()) {
                r0 = this.A02;
                C257113ws r02 = r0;
                this.A00 = r02;
                return r02.open(r5);
            }
        }
        r0 = this.A03;
        C257113ws r022 = r0;
        this.A00 = r022;
        return r022.open(r5);
    }

    public final int read(byte[] bArr, int i, int i2) {
        0qQ.A0B(bArr, 0);
        return this.A00.read(bArr, i, i2);
    }

    public final void addTransferListener(C250823m7 r2) {
        this.A00.addTransferListener(r2);
    }

    public final void close() {
        this.A00.close();
    }

    public final Uri getUri() {
        return this.A00.getUri();
    }

    public C71796Oqx(UserSession userSession, C71799Or0 or0, C71798Oqz oqz) {
        this.A01 = userSession;
        this.A02 = or0;
        this.A03 = oqz;
        this.A00 = or0;
    }

    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
