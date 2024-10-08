package X;

public final class ADm {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;

    public ADm(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.A05 = num2;
        this.A01 = bool;
        this.A06 = num3;
        this.A00 = null;
        this.A07 = num4;
        this.A04 = num;
        this.A03 = null;
        this.A02 = null;
    }

    public ADm(A70 a70) {
        this.A05 = null;
        this.A01 = null;
        this.A06 = a70.A04;
        this.A00 = a70.A00;
        this.A07 = null;
        this.A04 = a70.A03;
        this.A03 = a70.A02;
        this.A02 = a70.A01;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudioVideoConfig{audioSampleRateHz=");
        A1A.append(this.A05);
        A1A.append(", recordWithoutEffects=");
        A1A.append(this.A01);
        A1A.append(", motionFactor=");
        A1A.append((Object) null);
        A1A.append(", maximumDurationUs=");
        A1A.append((Object) null);
        A1A.append(", bitrate=");
        A1A.append(this.A06);
        A1A.append(", deviceOutputType=");
        A1A.append((Object) null);
        A1A.append(", customVideoFrameRate=");
        A1A.append((Object) null);
        A1A.append(", enableOrientation=");
        A1A.append(this.A00);
        A1A.append(", videoMimeType=");
        A1A.append((String) null);
        A1A.append(", muxingFormat=");
        Integer num = this.A07;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "WEBM";
                    break;
                case 2:
                    str = "OUTPUT_FORMAT_DEFAULT";
                    break;
                default:
                    str = "MPEG_4";
                    break;
            }
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", aacProfile=");
        A1A.append(this.A04);
        A1A.append(", useSupernovaCustomAudio=");
        A1A.append(this.A03);
        A1A.append(", useRealTimeBasedPresentationTimeCounting=");
        A1A.append(this.A02);
        A1A.append('}');
        return A1A.toString();
    }
}
