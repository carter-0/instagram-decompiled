package X;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Or0  reason: case insensitive filesystem */
public final class C71799Or0 implements C257113ws {
    public long A00;
    public long A01;
    public Uri A02;
    public C257113ws A03;
    public String A04;
    public boolean A05;
    public long A06;
    public C250823m7 A07;
    public 2R9 A08;
    public boolean A09;
    public boolean A0A;
    public final C257113ws A0B = new C257203x1();
    public final C257113ws A0C;
    public final C257113ws A0D;
    public final C251073mW A0E;

    private final void A00() {
        try {
            C257113ws r1 = this.A03;
            if (!0qQ.A0K(r1, this.A0B)) {
                0qQ.A0K(r1, this.A0C);
            }
            this.A03.close();
        } finally {
            this.A09 = false;
            2R9 r12 = this.A08;
            if (r12 != null) {
                this.A0E.ECd(r12);
                this.A08 = null;
            }
        }
    }

    public final /* synthetic */ void cancel() {
    }

    public final void close() {
        this.A02 = null;
        try {
            A00();
            this.A0D.close();
        } catch (IOException e) {
            if (this.A03 == this.A0B || (e instanceof AnonymousClass5HZ)) {
                this.A05 = true;
            }
            throw e;
        }
    }

    public final long open(C257263x7 r26) {
        Throwable e;
        String A10;
        long j;
        String queryParameter;
        Long A102;
        C257263x7 r3 = r26;
        0qQ.A0B(r3, 0);
        Uri uri = r3.A06;
        0qQ.A06(uri);
        if (C66834MdS.A08(uri.toString())) {
            try {
                this.A02 = uri;
                C71042OaK oaK = OyP.A08;
                String queryParameter2 = uri.getQueryParameter("sha256");
                if (queryParameter2 != null) {
                    A10 = C69852NtG.A00(queryParameter2);
                } else {
                    A10 = DbT.A10(uri);
                }
                this.A04 = A10;
                long j2 = r3.A04;
                this.A01 = j2;
                long j3 = r3.A03;
                this.A0A = this.A05;
                Uri uri2 = this.A02;
                if (uri2 == null || (queryParameter = uri2.getQueryParameter("file_length")) == null || (A102 = AnonymousClass7TE.A10(queryParameter)) == null) {
                    j = -1;
                } else {
                    j = A102.longValue();
                }
                if (j3 != -1 || this.A0A) {
                    long j4 = j - this.A01;
                    if (j3 > j4) {
                        j3 = j4;
                    }
                    if (j3 < -1) {
                        j3 = -1;
                    }
                    this.A00 = j3;
                } else {
                    long A002 = C9692RfA.A00(this.A0E.Aqf(this.A04));
                    this.A00 = A002;
                    if (A002 != -1) {
                        long j5 = A002 - j2;
                        this.A00 = j5;
                        if (j5 <= 0) {
                            StringBuilder A1A = AnonymousClass7TE.A1A();
                            A1A.append("DataSpec.position: ");
                            A1A.append(j2);
                            A1A.append(" originalFileLength: ");
                            A1A.append(j);
                            A1A.append(" bytesRemaining: ");
                            A1A.append(j5);
                            throw new C2609647s(A1A.toString(), 2008);
                        }
                    }
                }
                A02(false);
                long j6 = this.A00;
                if (j6 == -1) {
                    long j7 = j - j2;
                    if (j7 < -1) {
                        j7 = -1;
                    }
                    this.A00 = j7;
                    j6 = j7;
                }
                long AjN = this.A0E.AjN(this.A01, this.A04, j6);
                if (1 <= AjN) {
                    long j8 = this.A00;
                    if (AjN < j8) {
                        long j9 = j8 - AjN;
                        Map emptyMap = Collections.emptyMap();
                        Uri uri3 = this.A02;
                        if (uri3 == null) {
                            uri3 = Uri.EMPTY;
                        }
                        String str = this.A04;
                        C257253x6 r13 = new C257253x6();
                        C256703wD.A02(uri3);
                        this.A0D.open(new C257263x7(uri3, r13, str, emptyMap, (byte[]) null, 1, 0, 0, AjN, j9));
                    }
                }
                return this.A00;
            } catch (IOException e2) {
                e = e2;
                C257113ws r4 = this.A03;
                C257113ws r2 = this.A0B;
                if (r4 == r2 || (e instanceof AnonymousClass5HZ)) {
                    this.A05 = true;
                }
                if (r4 == r2) {
                    return open(r3);
                }
            }
        } else {
            e = new C2609547r(r3, "Invalid uri", 1004, 1);
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        0qQ.A0B(bArr, 0);
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A01 >= this.A06) {
                A02(true);
            }
            int read = this.A03.read(bArr, i, i2);
            if (read == -1) {
                C257113ws r3 = this.A03;
                if (!0qQ.A0K(r3, this.A0B)) {
                    0qQ.A0K(r3, this.A0C);
                }
            }
            if (read != -1) {
                long j = (long) read;
                this.A01 += j;
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - j;
                    return read;
                }
            } else if (this.A09) {
                A01(0);
                return read;
            } else {
                long j3 = this.A00;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                A00();
                A02(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.A09) {
                Throwable th = e;
                do {
                    if (!(th instanceof C2609647s) || ((C2609647s) th).A00 != 2008) {
                        th = th.getCause();
                    } else {
                        A01(0);
                        return -1;
                    }
                } while (th != null);
            }
            if (this.A03 == this.A0B || (e instanceof AnonymousClass5HZ)) {
                this.A05 = true;
            }
            throw e;
        }
    }

    private final void A01(long j) {
        this.A00 = j;
        if (this.A03 == this.A0C) {
            C251073mW r6 = this.A0E;
            long A002 = C9692RfA.A00(r6.Aqf(this.A04));
            long j2 = this.A01 + j;
            if (A002 < j2) {
                C10462Rsd rsd = new C10462Rsd();
                rsd.A01.put("exo_len", Long.valueOf(j2));
                rsd.A00.remove("exo_len");
                r6.ABz(rsd, this.A04);
            }
        }
    }

    private final void A02(boolean z) {
        2R9 ExR;
        boolean z2;
        C257263x7 r11;
        C257113ws r3;
        long j;
        if (this.A0A) {
            ExR = null;
        } else {
            ExR = this.A0E.ExR(AnonymousClass05K.A0C, this.A04, this.A01, this.A00);
        }
        if (ExR == null) {
            r3 = this.A0D;
            Map emptyMap = Collections.emptyMap();
            Uri uri = this.A02;
            if (uri == null) {
                uri = Uri.EMPTY;
            }
            long j2 = this.A01;
            long j3 = this.A00;
            if (j3 <= 0) {
                j3 = -1;
            }
            String str = this.A04;
            C257253x6 r13 = new C257253x6();
            C256703wD.A02(uri);
            z2 = true;
            r11 = new C257263x7(uri, r13, str, emptyMap, (byte[]) null, 1, 0, 0, j2, j3);
        } else if (ExR.A07) {
            Uri fromFile = Uri.fromFile(ExR.A05);
            long j4 = this.A01 - ExR.A04;
            long j5 = ExR.A03 - j4;
            long j6 = this.A00;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            Map emptyMap2 = Collections.emptyMap();
            if (fromFile == null) {
                fromFile = Uri.EMPTY;
            }
            if (j5 <= 0) {
                j5 = -1;
            }
            String str2 = this.A04;
            C257253x6 r132 = new C257253x6();
            C256703wD.A02(fromFile);
            z2 = true;
            r11 = new C257263x7(fromFile, r132, str2, emptyMap2, (byte[]) null, 1, 0, 0, j4, j5);
            r3 = this.A0B;
        } else {
            long j7 = ExR.A03;
            if (j7 == -1) {
                j7 = this.A00;
            } else {
                long j8 = this.A00;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
            }
            Map emptyMap3 = Collections.emptyMap();
            Uri uri2 = this.A02;
            if (uri2 == null) {
                uri2 = Uri.EMPTY;
            }
            long j9 = this.A01;
            if (j7 <= 0) {
                j7 = -1;
            }
            String str3 = this.A04;
            C257253x6 r133 = new C257253x6();
            C256703wD.A02(uri2);
            z2 = true;
            r11 = new C257263x7(uri2, r133, str3, emptyMap3, (byte[]) null, 1, 0, 0, j9, j7);
            r3 = this.A0C;
        }
        if (this.A0A || r3 != this.A0D) {
            j = Long.MAX_VALUE;
        } else {
            j = this.A01 + 65536;
        }
        this.A06 = j;
        boolean z3 = true;
        if (z) {
            C257113ws r1 = this.A03;
            C257113ws r2 = this.A0D;
            C256703wD.A04(AnonymousClass7TF.A1W(r1, r2));
            if (r3 != r2) {
                try {
                    A00();
                } catch (IOException e) {
                    if (ExR != null && (!ExR.A07) == z2) {
                        this.A0E.ECd(ExR);
                    }
                    throw e;
                }
            } else {
                return;
            }
        }
        if (ExR != null && (!ExR.A07)) {
            this.A08 = ExR;
        }
        this.A03 = r3;
        if (r11.A03 != -1) {
            z3 = false;
        }
        this.A09 = z3;
        long open = r3.open(r11);
        if (this.A09 && open != -1) {
            A01(open);
        }
    }

    public final Uri getUri() {
        return this.A02;
    }

    public C71799Or0(C257113ws r3, C251073mW r4) {
        this.A0E = r4;
        this.A0D = r3;
        this.A0C = new C71795Oqw(new C71793Oqu(r4), r3);
        this.A03 = r3;
    }

    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }

    public final void addTransferListener(C250823m7 r1) {
        this.A07 = r1;
    }
}
