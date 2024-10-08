package X;

public final class KM1 extends C355808Rl {
    public final int A00;
    public final int A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KM1) {
                KM1 km1 = (KM1) obj;
                if (!(this.A02 == km1.A02 && this.A00 == km1.A00 && this.A01 == km1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "MUSIC_AUDIO";
                break;
            case 2:
                str = "VOICEOVER";
                break;
            case 3:
                str = "SOUND_EFFECT";
                break;
            default:
                str = "CAMERA_AUDIO";
                break;
        }
        return ((C51968G9o.A0F(str, intValue) + this.A00) * 31) + this.A01;
    }

    public KM1(Integer num, int i, int i2) {
        this.A02 = num;
        this.A00 = i;
        this.A01 = i2;
    }
}
