package X;

import org.webrtc.CameraVideoCapturer;

public final class LG4 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LG4) {
                LG4 lg4 = (LG4) obj;
                if (!0qQ.A0K(this.A03, lg4.A03) || this.A00 != lg4.A00 || !0qQ.A0K(this.A01, lg4.A01) || !0qQ.A0K(this.A04, lg4.A04) || this.A05 != lg4.A05 || !0qQ.A0K(this.A02, lg4.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = C51972G9s.A07(this.A00, AnonymousClass7TE.A0O(this.A03));
        return AnonymousClass7TF.A09(this.A05, (AnonymousClass7TF.A08(this.A01, A07) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A02);
    }

    public LG4(String str, String str2, String str3, String str4, long j, boolean z) {
        this.A03 = str;
        this.A00 = j;
        this.A01 = str2;
        this.A04 = str3;
        this.A05 = z;
        this.A02 = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StoryPromptMetadata(id=");
        A1A.append(this.A03);
        A1A.append(AnonymousClass000.A00(2038));
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(1998));
        A1A.append(this.A01);
        A1A.append(", promptSummaryText=");
        A1A.append(this.A04);
        A1A.append(AnonymousClass000.A00(1999));
        A1A.append(this.A05);
        A1A.append(AnonymousClass000.A00(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS));
        return C51975G9x.A0i(this.A02, A1A);
    }
}
