package X;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.M0s  reason: case insensitive filesystem */
public final class C65826M0s implements C14279TtC {
    public int A00;
    public int A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final AnonymousClass3QP A03;
    public final L5Z A04 = new L5Z();
    public final C63742L5a A05 = new C63742L5a();
    public final Set A06;

    public C65826M0s(AnonymousClass3QP r2, Set set) {
        0qQ.A0B(r2, 2);
        this.A06 = set;
        this.A03 = r2;
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        r2.A06 = emptyList;
    }

    public final void Ddo() {
        List list = this.A02;
        list.size();
        AnonymousClass3QP r5 = this.A03;
        r5.A06 = list;
        int i = this.A01;
        int i2 = this.A00;
        r5.A02 = i;
        r5.A01 = i2;
        long j = 0;
        for (Object A0R : this.A05.A01) {
            j += AnonymousClass7TE.A0R(A0R);
        }
        r5.A03 = j;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.JtF, java.lang.Object] */
    public final void DGz(XBw xBw, int i, long j) {
        if (DbT.A0h().A0Z()) {
            C63742L5a l5a = this.A05;
            List<Object> list = l5a.A01;
            long j2 = 0;
            for (Object A0R : list) {
                j2 += AnonymousClass7TE.A0R(A0R);
            }
            if (j2 <= 500) {
                l5a.A00 = SystemClock.elapsedRealtime();
                int i2 = i;
                if (this.A06.contains(Integer.valueOf(i2))) {
                    int width = xBw.getWidth();
                    int height = xBw.getHeight();
                    File A0s = JTO.A0s(AnonymousClass457.A05(), 002.A0e("frame_capture_", ".png", System.currentTimeMillis()));
                    int i3 = i - 1;
                    L5Z l5z = this.A04;
                    long j3 = j;
                    if (l5z.A01) {
                        if (j <= 0) {
                            l5z.A00 = -j3;
                        }
                        l5z.A01 = false;
                    }
                    long j4 = j + l5z.A00;
                    try {
                        List list2 = this.A02;
                        String A0u = JTP.A0u(A0s);
                        ? obj = new Object();
                        obj.A04 = 0;
                        obj.A03 = 0;
                        obj.A02 = -1;
                        obj.A01 = -1;
                        obj.A06 = null;
                        obj.A05 = null;
                        obj.A00 = -100.0f;
                        obj.A04 = j4;
                        obj.A06 = A0u;
                        obj.A02 = i3;
                        list2.add(obj);
                    } catch (IOException e) {
                        0KC.A0F("VideoFrameSaver", "failed to retrieve reference file path", e);
                        0wb.A07("reference_image_file_path_error", e);
                    }
                    this.A01 = width;
                    this.A00 = height;
                    C7245Q0r.A03(new C61516KAv(A0s, i2, width, height, j3), width, height);
                    list.add(Long.valueOf(SystemClock.elapsedRealtime() - l5a.A00));
                }
            }
        }
    }
}
