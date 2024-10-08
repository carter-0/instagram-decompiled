package X;

import com.facebook.proxygen.TraceFieldType;

public final class OME {
    public final 02m A00;

    public final void A00(String str, boolean z) {
        02m r3 = this.A00;
        r3.A0G.E1U(944520647, 1);
        int hashCode = str.hashCode();
        r3.markerStart(944520647, hashCode);
        r3.markerAnnotate(944520647, hashCode, "is_animated", z);
        r3.markerAnnotate(944520647, hashCode, TraceFieldType.RequestID, str);
        r3.markerPoint(944520647, hashCode, "server_request_sent");
    }

    public final void A01(String str, boolean z) {
        02m r3 = this.A00;
        r3.A0G.E1U(944511429, 1);
        int hashCode = str.hashCode();
        r3.markerStart(944511429, hashCode);
        r3.markerPoint(944511429, hashCode, "download_start");
        r3.markerAnnotate(944511429, hashCode, "is_animated", z);
        r3.markerAnnotate(944511429, hashCode, "download_id", str);
    }

    public OME(02m r1) {
        this.A00 = r1;
    }
}
