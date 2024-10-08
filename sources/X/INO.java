package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import java.util.HashMap;

public final class INO implements AnonymousClass1MK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C56520Hzr A04;
    public final /* synthetic */ C255573uM A05;
    public final /* synthetic */ boolean[] A06;

    public INO(C56520Hzr hzr, C255573uM r2, boolean[] zArr, int i, int i2, int i3, long j) {
        this.A04 = hzr;
        this.A06 = zArr;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A05 = r2;
        this.A00 = i3;
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        C56520Hzr.A00(this.A04, this.A02, this.A01);
    }

    public final void DK4(C226952iF r3, int i) {
        if (i == 0) {
            this.A06[0] = false;
        }
    }

    public final void CyF(C226952iF r20, AnonymousClass3LX r21) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A03;
        C56520Hzr hzr = this.A04;
        hzr.A00 = Math.max(hzr.A00, elapsedRealtime);
        Bitmap bitmap = r21.A01;
        C255573uM r6 = this.A05;
        int i = this.A00;
        Rect rect = null;
        int i2 = r6.A01;
        int i3 = r6.A04;
        int i4 = i % i2;
        float height = ((float) bitmap.getHeight()) / ((float) (i2 / i3));
        float width = ((float) bitmap.getWidth()) / ((float) i3);
        int A052 = AnonymousClass7TE.A05((float) (i4 % i3), width) + 1;
        int A053 = AnonymousClass7TE.A05((float) (i4 / i3), height) + 1;
        int i5 = (int) (((float) A052) + (width - 2.0f));
        int i6 = (int) (((float) A053) + (height - 2.0f));
        if (i5 <= bitmap.getWidth() && i6 <= bitmap.getHeight()) {
            rect = new Rect(A052, A053, i5, i6);
        }
        double d = ((double) r6.A03) / ((double) r6.A02);
        if (rect != null) {
            for (C59580JPa EvP : hzr.A03) {
                EvP.EvP(bitmap, rect, d, this.A02, this.A01);
            }
            if (hzr.A02) {
                02m A0l = C51965G9l.A0l();
                String str = hzr.A01.A0G;
                int i7 = this.A02;
                boolean z = this.A06[0];
                0qQ.A0B(str, 0);
                2Bs r9 = 2Bq.A0D;
                int hashCode = str.hashCode();
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("thumbnail_index", String.valueOf(i));
                A1E.put("total_thumbnails", String.valueOf(i2));
                A1E.put(AnonymousClass000.A00(1690), String.valueOf(i7));
                A1E.put("thumbnail_in_cache", String.valueOf(z ? 1 : 0));
                r9.A03(1900591, hashCode, A1E);
                A0l.markerPoint(1900591, hashCode, "first_thumbnail_shown");
                hzr.A02 = false;
            } else if (i % 10 == 0) {
                0qQ.A07(02m.A0p);
                String str2 = hzr.A01.A0G;
                int i8 = this.A02;
                0qQ.A0B(str2, 0);
                2Bs r5 = 2Bq.A0D;
                int hashCode2 = str2.hashCode();
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(i);
                A1A.append(":");
                A1A.append(i8);
                A1A.append(":");
                A1A.append(elapsedRealtime);
                HashMap A1E2 = AnonymousClass7TE.A1E();
                A1E2.put(String.valueOf(i), A1A.toString());
                r5.A03(1900591, hashCode2, A1E2);
            }
        }
    }
}
