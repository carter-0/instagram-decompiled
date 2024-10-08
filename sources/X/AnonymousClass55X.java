package X;

import com.instagram.api.schemas.CameraTool;

/* renamed from: X.55X  reason: invalid class name */
public final class AnonymousClass55X extends AnonymousClass0T0 {
    public int A00;
    public CameraTool A01;
    public Float A02;
    public Float A03;
    public Float A04;

    public AnonymousClass55X(CameraTool cameraTool, Float f, Float f2, Float f3, int i) {
        0qQ.A0B(cameraTool, 2);
        this.A00 = i;
        this.A01 = cameraTool;
        this.A02 = f;
        this.A03 = f2;
        this.A04 = f3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass55X) {
                AnonymousClass55X r5 = (AnonymousClass55X) obj;
                if (this.A00 != r5.A00 || this.A01 != r5.A01 || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A00 * 31) + this.A01.hashCode()) * 31;
        Float f = this.A02;
        int i = 0;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A03;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.A04;
        if (f3 != null) {
            i = f3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CameraToolInfoWithSegmentIndex(segmentIndex=");
        sb.append(this.A00);
        sb.append(", cameraTool=");
        sb.append(this.A01);
        sb.append(", durationSelectorSeconds=");
        sb.append(this.A02);
        sb.append(", speedSelector=");
        sb.append(this.A03);
        sb.append(", timerSelectorSeconds=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }
}
