package X;

import com.instagram.api.schemas.TrackData;

/* renamed from: X.JxV  reason: case insensitive filesystem */
public final class C61119JxV extends AnonymousClass0T0 implements MWQ {
    public final int A00;
    public final TrackData A01;

    public C61119JxV(TrackData trackData, int i) {
        0qQ.A0B(trackData, 1);
        this.A01 = trackData;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61119JxV) {
                C61119JxV jxV = (C61119JxV) obj;
                if (!0qQ.A0K(this.A01, jxV.A01) || this.A00 != jxV.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }
}
