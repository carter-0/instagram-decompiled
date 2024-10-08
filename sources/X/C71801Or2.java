package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Or2  reason: case insensitive filesystem */
public final class C71801Or2 implements C257133wu {
    public C257113ws A00;
    public final C257113ws A01;
    public final Map A02;

    public final void cancel() {
    }

    public final void changeHttpPriority(byte b, boolean z) {
    }

    public final Uri getUri() {
        return null;
    }

    public final void close() {
        C257113ws r0 = this.A00;
        if (r0 != null) {
            r0.close();
            this.A00 = null;
        }
    }

    public final long open(C257263x7 r27) {
        String str;
        C257113ws r0;
        C257263x7 r12 = r27;
        Map map = this.A02;
        if (map.size() == 1) {
            Iterator A0v = AnonymousClass7TF.A0v(map);
            str = null;
            while (A0v.hasNext()) {
                str = AnonymousClass7TE.A18(A0v);
            }
        } else {
            str = (String) map.get(r12.A08);
        }
        if (str != null) {
            Uri A09 = JTQ.A09(str);
            String str2 = null;
            Map emptyMap = Collections.emptyMap();
            if (A09 == null) {
                A09 = Uri.EMPTY;
            }
            long j = r12.A02;
            long j2 = r12.A04;
            long j3 = j - j2;
            long j4 = r12.A03;
            if (j4 <= 0) {
                j4 = -1;
            }
            int i = r12.A00;
            C257253x6 r14 = r12.A07;
            String str3 = r12.A08;
            if (str3 != null) {
                str2 = str3;
            }
            C256703wD.A02(A09);
            if (r14 == null) {
                r14 = new C257253x6();
            }
            long j5 = j3;
            int i2 = i;
            r12 = new C257263x7(A09, r14, str2, emptyMap, (byte[]) null, 1, i2, j5, j2, j4);
            r0 = new C257203x1();
        } else {
            r0 = this.A01;
        }
        this.A00 = r0;
        return r0.open(r12);
    }

    public final int read(byte[] bArr, int i, int i2) {
        C257113ws r0 = this.A00;
        if (r0 == null) {
            return -1;
        }
        return r0.read(bArr, i, i2);
    }

    public C71801Or2(C257113ws r1, Map map) {
        this.A01 = r1;
        this.A02 = map;
    }

    public final void addTransferListener(C250823m7 r2) {
        r2.getClass();
        this.A01.addTransferListener(r2);
    }

    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
