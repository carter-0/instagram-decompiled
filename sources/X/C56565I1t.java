package X;

import org.webrtc.CameraVideoCapturer;

/* renamed from: X.I1t  reason: case insensitive filesystem */
public final class C56565I1t {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56565I1t) {
                C56565I1t i1t = (C56565I1t) obj;
                if (!0qQ.A0K(this.A04, i1t.A04) || !0qQ.A0K(this.A00, i1t.A00) || !0qQ.A0K(this.A02, i1t.A02) || !0qQ.A0K(this.A05, i1t.A05) || !0qQ.A0K(this.A01, i1t.A01) || this.A06 != i1t.A06 || !0qQ.A0K(this.A03, i1t.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A06, ((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A03);
    }

    public C56565I1t(Long l, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A04 = str;
        this.A00 = l;
        this.A02 = str2;
        this.A05 = str3;
        this.A01 = str4;
        this.A06 = z;
        this.A03 = str5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SuggestionsPromptMetadata(id=");
        A1A.append(this.A04);
        A1A.append(AnonymousClass000.A00(2038));
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(1998));
        A1A.append(this.A02);
        A1A.append(", suggestionPromptSummary=");
        A1A.append(this.A05);
        A1A.append(", attributionPromptSummaryText=");
        A1A.append(this.A01);
        A1A.append(AnonymousClass000.A00(1999));
        A1A.append(this.A06);
        A1A.append(AnonymousClass000.A00(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS));
        return C51975G9x.A0i(this.A03, A1A);
    }

    public C56565I1t() {
        this(C51971G9r.A0m(), (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
