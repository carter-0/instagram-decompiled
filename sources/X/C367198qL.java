package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8qL  reason: invalid class name and case insensitive filesystem */
public final class C367198qL {
    public boolean A00;
    public final int A01;
    public final 02m A02;
    public final UserSession A03;

    public C367198qL(UserSession userSession, int i) {
        0qQ.A0B(userSession, 2);
        this.A01 = i;
        this.A03 = userSession;
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A02 = r0;
    }

    public final void A01(String str, String str2) {
        0qQ.A0B(str2, 1);
        if (!this.A00) {
            0KC.A0D("CLNoticePerformanceLogger", "Marker not started.");
        } else {
            this.A02.markerAnnotate(this.A01, str, str2);
        }
    }

    public final void A00(String str, long j) {
        if (!this.A00) {
            0KC.A0D("CLNoticePerformanceLogger", "Marker not started.");
        } else {
            this.A02.markerAnnotate(this.A01, str, j);
        }
    }

    public final void A02(String str, String str2, String str3) {
        if (this.A00) {
            0KC.A0D("CLNoticePerformanceLogger", "Marker already started");
        }
        this.A00 = true;
        02m r2 = this.A02;
        int i = this.A01;
        r2.markerStart(i);
        if (str != null) {
            r2.markerAnnotate(i, "entrypoint", str);
        }
        if (str2 != null) {
            r2.markerAnnotate(i, "notice_variant", str2);
        }
        if (str3 != null) {
            r2.markerAnnotate(i, "surface", str3);
        }
    }

    public final void A03(short s) {
        if (!this.A00) {
            0KC.A0D("CLNoticePerformanceLogger", "Marker not started.");
            return;
        }
        this.A02.markerEnd(this.A01, s);
        this.A00 = false;
    }
}
