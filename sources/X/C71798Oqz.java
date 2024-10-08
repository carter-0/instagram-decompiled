package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Oqz  reason: case insensitive filesystem */
public final class C71798Oqz implements C257113ws {
    public static final long A06 = TimeUnit.MINUTES.toMillis(20);
    public long A00;
    public C257263x7 A01;
    public C257203x1 A02;
    public C250823m7 A03;
    public boolean A04;
    public final UserSession A05;

    public final void addTransferListener(C250823m7 r2) {
        synchronized (this) {
            this.A03 = r2;
        }
    }

    public final /* synthetic */ void cancel() {
    }

    public final void close() {
        synchronized (this) {
            C257203x1 r0 = this.A02;
            if (r0 != null) {
                r0.close();
            }
            C250823m7 r2 = this.A03;
            if (r2 != null) {
                C257263x7 r1 = this.A01;
                C257263x7 r02 = C257263x7.A0B;
                if (r1 == null) {
                    r1 = C257263x7.A0B;
                }
                r2.DtX(this, r1, true);
            }
            this.A01 = null;
            this.A00 = 0;
            this.A04 = false;
        }
    }

    public final Map getResponseHeaders() {
        LinkedHashMap A1H;
        synchronized (this) {
            A1H = AnonymousClass7TE.A1H();
            A1H.put(AnonymousClass000.A00(426), 0sr.A1M(new String[]{String.valueOf(this.A00)}));
        }
        return A1H;
    }

    public final Uri getUri() {
        Uri uri;
        synchronized (this) {
            C257263x7 r0 = this.A01;
            if (r0 == null || (uri = r0.A06) == null) {
                uri = Uri.EMPTY;
            }
        }
        0qQ.A09(uri);
        return uri;
    }

    public final long open(C257263x7 r30) {
        Throwable th;
        Object obj;
        long open;
        boolean z = false;
        C257263x7 r2 = r30;
        0qQ.A0B(r2, 0);
        Uri uri = r2.A06;
        0qQ.A06(uri);
        String scheme = uri.getScheme();
        if (scheme != null) {
            z = scheme.equalsIgnoreCase("msys");
        }
        if (z) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = r2;
                } else {
                    th = new C2609547r(r2, "DataSource is already opened", 1004, 1);
                }
                throw th;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            0rm A11 = C51965G9l.A11();
            0rm A112 = C51965G9l.A11();
            AnonymousClass0eM r0 = C71105Ocj.A05;
            C69851NtF.A00(this.A05).A03(new C71878OsM(countDownLatch, A112, A11), DbT.A10(uri));
            try {
                countDownLatch.await(A06, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                0KC.A0C("ArmadilloExpressHttpDataSource", "Interrupted while waiting for media file download");
            }
            if (A11.A00 != null || (obj = A112.A00) == null) {
                throw new C2609547r(r2, "Download failed", 1001, 1);
            }
            Uri A09 = DbT.A09((String) obj);
            long j = r2.A03;
            if (j <= 0) {
                j = -1;
            }
            int i = r2.A01;
            byte[] bArr = r2.A0A;
            Map map = r2.A09;
            long j2 = r2.A04;
            String str = r2.A08;
            int i2 = r2.A00;
            C257253x6 r8 = r2.A07;
            long j3 = r2.A02 - j2;
            synchronized (this) {
                C257203x1 r1 = new C257203x1();
                this.A02 = r1;
                C250823m7 r02 = this.A03;
                if (r02 != null) {
                    r1.addTransferListener(r02);
                }
                C257203x1 r12 = this.A02;
                if (r12 == null) {
                    0qQ.A0F("fileDataSource");
                    th = AnonymousClass00P.createAndThrow();
                    throw th;
                }
                if (r8 == null) {
                    r8 = new C257253x6();
                }
                long j4 = j3;
                int i3 = i;
                int i4 = i2;
                Map map2 = map;
                byte[] bArr2 = bArr;
                C257253x6 r17 = r8;
                String str2 = str;
                open = r12.open(new C257263x7(A09, r17, str2, map2, bArr2, i3, i4, j4, j2, j));
                this.A04 = true;
                this.A00 = AnonymousClass7TE.A0t(A09.getPath()).length();
            }
            return open;
        }
        throw new C2609547r(r2, "Invalid uri", 1004, 1);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read;
        synchronized (this) {
            C257203x1 r1 = this.A02;
            if (r1 == null || !this.A04) {
                throw new C2609547r(this.A01, "No downloaded file to read", 2005, 2);
            }
            read = r1.read(bArr, i, i2);
        }
        return read;
    }

    public C71798Oqz(UserSession userSession) {
        this.A05 = userSession;
    }
}
