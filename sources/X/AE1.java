package X;

import java.util.List;

public final class AE1 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AE1) {
                AE1 ae1 = (AE1) obj;
                if (!(0qQ.A0K(this.A03, ae1.A03) && this.A02 == ae1.A02 && this.A00 == ae1.A00 && this.A01 == ae1.A01 && this.A04 == ae1.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TF.A09(this.A04, (((((((((AnonymousClass7TE.A0K(this.A03) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + C54732HQn.A00()) * 31) + 1231) * 31) * 31) - 1;
    }

    public AE1(List list, int i, int i2, int i3, boolean z) {
        this.A03 = list;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoHighlightsConfiguration(types=");
        A1A.append(this.A03);
        A1A.append(", numberOfOutput=");
        A1A.append(this.A02);
        A1A.append(", lengthOfEachSegmentsInMs=");
        A1A.append(this.A00);
        A1A.append(", maxSampledFrameCount=");
        A1A.append(this.A01);
        A1A.append(", isSpeedupEnabled=");
        A1A.append(false);
        A1A.append(", useAi4arVhdModel=");
        A1A.append(true);
        A1A.append(", useSceneChangeVhdModel=");
        A1A.append(this.A04);
        A1A.append(", videoStartTimeMs=");
        A1A.append(0);
        A1A.append(", videoDurationMs=");
        A1A.append(-1);
        return AnonymousClass7TG.A0p(A1A);
    }

    public AE1() {
        this(AnonymousClass7TE.A1I(C390729rk.VIDEO_SEGMENTS_USER_DEFINED), 3, 2500, 90, true);
    }
}
