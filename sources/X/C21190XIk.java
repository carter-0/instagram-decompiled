package X;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.XIk  reason: case insensitive filesystem */
public final class C21190XIk extends C22292Xz1 {
    public XQR A00 = null;
    public C250813m6 A01;
    public Integer A02;
    public final String A03;
    public final boolean A04;

    public final boolean A03() {
        if (this.A01 != -1 || this.A03 == null) {
            return super.A03();
        }
        return AnonymousClass7TF.A1W(this.A02, AnonymousClass05K.A0C);
    }

    public final void close() {
        XQR xqr = this.A00;
        if (xqr != null) {
            this.A03 = xqr.A00();
            this.A00 = null;
            Integer num = this.A02;
            if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
                this.A02 = AnonymousClass05K.A0N;
            }
        }
        try {
            C257103wr r0 = this.A02;
            if (r0 != null) {
                r0.close();
            }
            this.A02 = null;
            this.A01 = null;
        } catch (IOException e) {
            C250813m6 r02 = this.A01;
            if (r02 != null) {
                r02.DtY(e);
            }
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [java.io.ByteArrayOutputStream, X.XQR] */
    public final long open(C257263x7 r32) {
        String str;
        String A002 = AnonymousClass000.A00(4223);
        C250813m6 r1 = this.A01;
        C257263x7 r10 = r32;
        if (r1 != null) {
            r1.Dtd(C257183wz.NOT_CACHED, r10);
        }
        try {
            C257103wr r0 = this.A02;
            if (r0 != null) {
                long open = r0.open(r10);
                int i = (int) open;
                this.A01 = i;
                this.A00 = 0;
                if (i == -1) {
                    this.A00 = new ByteArrayOutputStream();
                    this.A02 = AnonymousClass05K.A00;
                } else if (i <= 1048576) {
                    this.A03 = new byte[i];
                }
                if (this.A01 != null) {
                    Map responseHeaders = this.A02.getResponseHeaders();
                    if (responseHeaders != null) {
                        String obj = r10.A06.toString();
                        String str2 = this.A03;
                        AbstractMap.SimpleEntry[] simpleEntryArr = 2AC.A0B;
                        List list = (List) responseHeaders.get("x-fb-video-livetrace-parentsource");
                        int i2 = 0;
                        String str3 = null;
                        if (list != null) {
                            str = (String) list.get(0);
                            2AC.A08.put(obj, str);
                        } else {
                            str = null;
                        }
                        List list2 = (List) responseHeaders.get("x-fb-video-livetrace-ids");
                        if (list2 != null) {
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            for (String split : ((String) list2.get(0)).split(",[\\s]*")) {
                                try {
                                    String[] split2 = split.split(":");
                                    A1C.add(new C17320VQz(Long.parseLong(split2[0]), 1000 * Long.parseLong(split2[1])));
                                } catch (NumberFormatException unused) {
                                }
                            }
                            C17320VQz[] vQzArr = (C17320VQz[]) A1C.toArray(new C17320VQz[A1C.size()]);
                            AbstractMap.SimpleEntry[] simpleEntryArr2 = 2AC.A0B;
                            while (true) {
                                AbstractMap.SimpleEntry simpleEntry = simpleEntryArr2[i2];
                                if (responseHeaders.get(simpleEntry.getKey()) == null) {
                                    i2++;
                                    if (i2 >= 3) {
                                        break;
                                    }
                                } else {
                                    str3 = (String) simpleEntry.getValue();
                                    break;
                                }
                            }
                            this.A01.Dtb("live_trace", new 2AC(obj, str2, str, str3, "SUCCESS", (Map) null, vQzArr, System.currentTimeMillis()));
                        }
                        A02(this.A01, this.A04);
                    }
                    C257253x6 r02 = r10.A07;
                    if (r02 != null) {
                        Map map = r02.A0Q;
                        if (map.containsKey(A002)) {
                            this.A01.EUi((String) map.get(A002));
                            return open;
                        }
                    }
                }
                return open;
            }
            throw JTO.A0u("No http data source.");
        } catch (IOException e) {
            C250813m6 r03 = this.A01;
            if (r03 != null) {
                r03.DtY(e);
            }
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        String str;
        int i3 = this.A01;
        if (i3 != -1) {
            int i4 = i3 - this.A00;
            if (i4 == 0) {
                return -1;
            }
            if (i2 > i4) {
                i2 = i4;
            }
        }
        if (r7 > 0) {
            try {
                C257103wr r0 = this.A02;
                if (r0 != null) {
                    r7 = r0.read(bArr, i, r7);
                    if (r7 > 0) {
                        byte[] bArr2 = this.A03;
                        if (bArr2 != null) {
                            System.arraycopy(bArr, i, bArr2, this.A00, r7);
                        } else if (this.A00 != null) {
                            Integer num = this.A02;
                            Integer num2 = AnonymousClass05K.A01;
                            if (num != num2) {
                                if (num != AnonymousClass05K.A00) {
                                    String A002 = AnonymousClass000.A00(2524);
                                    if (num != null) {
                                        switch (num.intValue()) {
                                            case 1:
                                                str = "Partial";
                                                break;
                                            case 2:
                                                str = AnonymousClass000.A00(2177);
                                                break;
                                            case 3:
                                                str = "Canceled";
                                                break;
                                            default:
                                                str = "Started";
                                                break;
                                        }
                                    } else {
                                        str = "null";
                                    }
                                    Log.e("NonPrefetchDataSource", 002.A0R(A002, str));
                                }
                                this.A02 = num2;
                            }
                            this.A00.write(bArr, i, r7);
                        }
                        this.A00 += r7;
                        return r7;
                    }
                } else {
                    r7 = -1;
                }
                if (this.A01 == -1 && r7 == -1) {
                    this.A02 = AnonymousClass05K.A0C;
                    return r7;
                }
            } catch (IOException e) {
                C250813m6 r02 = this.A01;
                if (r02 != null) {
                    r02.DtY(e);
                }
                throw e;
            }
        }
        return r7;
    }

    public C21190XIk(28N r8, C250813m6 r9, C257063wn r10, C257093wq r11, String str, int i, int i2, boolean z) {
        this.A03 = r10.A07;
        this.A02 = r8.A00(r10, r11, r9, str, i, i2);
        this.A01 = r9;
        this.A03 = null;
        this.A04 = z;
    }

    public final void addTransferListener(C250823m7 r2) {
        C250813m6 xx0;
        r2.getClass();
        if (r2 instanceof C250813m6) {
            xx0 = (C250813m6) r2;
        } else {
            xx0 = new C22189Xx0(r2);
        }
        this.A01 = xx0;
    }

    public final void cancel() {
    }
}
