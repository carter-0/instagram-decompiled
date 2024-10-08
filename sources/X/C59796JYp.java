package X;

import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import com.instagram.common.gallery.Medium;
import java.util.List;

/* renamed from: X.JYp  reason: case insensitive filesystem */
public final class C59796JYp {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Integer A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;

    public static C59796JYp A00(Medium medium, int i) {
        C59796JYp A012 = A01(medium.A0X, i);
        0qQ.A07(A012);
        return A012;
    }

    public static C59796JYp A01(String str, int i) {
        C59796JYp jYp;
        long j;
        Long A10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        String str2 = str;
        try {
            mediaMetadataRetriever.setDataSource(AnonymousClass7TE.A0t(str).getAbsolutePath());
        } catch (Exception unused) {
            if (i < 6) {
                try {
                    jYp = A01(str, i + 1);
                } catch (IllegalArgumentException unused2) {
                    jYp = new C59796JYp(str2, 0, -1, false);
                } catch (RuntimeException unused3) {
                    jYp = new C59796JYp(str2, 0, -2, false);
                } catch (Throwable th) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused4) {
                    }
                    throw th;
                }
            }
        }
        String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
        if (A02(extractMetadata)) {
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata2 == null || (A10 = AnonymousClass7TE.A10(extractMetadata2)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            jYp = new C59796JYp(str2, -1, j, false);
        } else if (i < 6) {
            jYp = A01(str, i + 1);
        } else {
            jYp = new C59796JYp(str2, 0, -3, false);
            jYp.A06 = extractMetadata;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception unused5) {
        }
        return jYp;
    }

    public static boolean A02(String str) {
        if ("video/avc".equals(str) || "video/mp4".equals(str) || "video/3gpp".equals(str) || "video/3gpp2".equals(str)) {
            return true;
        }
        return false;
    }

    public final void A04(Integer num) {
        this.A05 = num;
        for (MUU D3Y : this.A08) {
            D3Y.D3Y(this, num);
        }
    }

    public C59796JYp(String str, int i, long j, boolean z) {
        this.A08 = AnonymousClass7TE.A1C();
        this.A07 = "";
        Integer num = AnonymousClass05K.A01;
        this.A05 = num;
        this.A06 = null;
        this.A01 = i;
        this.A03 = j;
        this.A05 = num;
        this.A07 = str;
        this.A09 = z;
    }

    public final void A03() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A04;
        this.A03 = elapsedRealtime;
        for (MUU D3S : this.A08) {
            D3S.D3S(this, elapsedRealtime);
        }
    }

    public C59796JYp() {
        this.A08 = AnonymousClass7TE.A1C();
        this.A07 = "";
        this.A05 = AnonymousClass05K.A01;
        this.A06 = null;
    }
}
