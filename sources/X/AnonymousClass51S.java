package X;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.51S  reason: invalid class name */
public final class AnonymousClass51S extends AnonymousClass0T0 {
    public float A00;
    public int A01;
    public List A02;
    public List A03;
    public Set A04;
    public boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass51S) {
                AnonymousClass51S r5 = (AnonymousClass51S) obj;
                if (Float.compare(this.A00, r5.A00) != 0 || this.A01 != r5.A01 || this.A05 != r5.A05 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecordingSettings(speed=");
        sb.append(this.A00);
        sb.append(", timerDurationInMs=");
        sb.append(this.A01);
        sb.append(", isGhostModeOn=");
        sb.append(this.A05);
        sb.append(", cameraTool=");
        sb.append(this.A04);
        sb.append(", cameraAREffectList=");
        sb.append(this.A02);
        sb.append(", cameraToolsStruct=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        List list;
        Float valueOf = Float.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(this.A01);
        Boolean valueOf3 = Boolean.valueOf(this.A05);
        Set set = this.A04;
        List list2 = this.A02;
        if (list2 != null) {
            list = 00k.A0X(00k.A0a(list2));
        } else {
            list = null;
        }
        return Arrays.hashCode(new Object[]{valueOf, valueOf2, valueOf3, set, list, this.A03});
    }

    public AnonymousClass51S(List list, List list2, Set set, float f, int i, boolean z) {
        this.A00 = f;
        this.A01 = i;
        this.A05 = z;
        this.A04 = set;
        this.A02 = list;
        this.A03 = list2;
    }

    public AnonymousClass51S() {
        this((List) null, (List) null, (Set) null, 1.0f, -1, false);
    }
}
