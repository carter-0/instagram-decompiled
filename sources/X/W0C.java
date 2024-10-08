package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;
import java.util.List;

public final class W0C {
    public static final W0C A03 = A00(AnonymousClass05K.A03);
    public static final W0C A04 = A00(AnonymousClass05K.A02);
    public static final W0C A05 = A00(AnonymousClass05K.A1F);
    public static final W0C A06 = A00(AnonymousClass05K.A05);
    public static final W0C A07 = A00(AnonymousClass05K.A0Y);
    public static final W0C A08 = A00(AnonymousClass05K.A00);
    public static final W0C A09 = A00(AnonymousClass05K.A0N);
    public static final W0C A0A = A00(AnonymousClass05K.A1I);
    public static final W0C A0B = A00(AnonymousClass05K.A0C);
    public static final W0C A0C = A00(AnonymousClass05K.A01);
    public static final W0C A0D = A00(AnonymousClass05K.A15);
    public final int A00;
    public final Integer A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (0qQ.A0K(getClass(), JTR.A0v(obj))) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.datax.Error");
                if (this.A00 != ((W0C) obj).A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00 + 7;
    }

    public final String toString() {
        String str;
        String format = String.format("%04x", Arrays.copyOf(AnonymousClass7TF.A1b(this.A00), 1));
        0qQ.A07(format);
        int intValue = this.A01.intValue();
        if (intValue == 15) {
            str = "This code doesn't match to a known error type, please reach out to the connectivityteam or the owners of the service you are trying to communicate with on the deviceteam to figure out what this code means.";
        } else if (intValue != 5) {
            switch (intValue) {
                case 1:
                    str = "SERVICE_NOT_FOUND";
                    break;
                case 2:
                    str = "SERVICE_LOST";
                    break;
                case 3:
                    str = "OUT_OF_CHANNELS";
                    break;
                case 4:
                    str = AnonymousClass000.A00(959);
                    break;
                case 6:
                    str = "CHANNEL_CLOSED";
                    break;
                case 7:
                    str = "UNKNOWN_TYPE";
                    break;
                case 8:
                    str = "DEPRECATED_TYPE";
                    break;
                case 9:
                    str = "REMOVED_TYPE";
                    break;
                case 10:
                    str = "BAD_TYPE";
                    break;
                case 11:
                    str = "BAD_REQUEST";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = "SERIALIZE_FAILED";
                    break;
                case 13:
                    str = "DESERIALIZE_FAILED";
                    break;
                case 14:
                    str = "WRITE_WOULD_BLOCK";
                    break;
                default:
                    str = "OK";
                    break;
            }
        } else {
            str = "Message is too long. DataX cannot send messages longer than 16383 bytes. Try fragmenting your data into more messages, for example if you're sending a list of contacts then send each contact in a separate message instead of all in one big list.";
        }
        return 002.A0v("Error(0x", format, ": ", str, ')');
    }

    public W0C(int i) {
        Integer num;
        this.A00 = i;
        Integer[] A002 = AnonymousClass05K.A00(16);
        int length = A002.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                num = AnonymousClass05K.A07;
                break;
            }
            num = A002[i2];
            if (this.A00 == C16799V6g.A00(num)) {
                break;
            }
            i2++;
        }
        this.A01 = num;
        this.A02 = 0sr.A1P(new W0C[]{A0C, A0B, A09});
        int i3 = this.A00;
        if (i3 < 0 || i3 > 65535) {
            throw new IllegalStateException(002.A03(i3, " must be unsigned 16bit"));
        }
    }

    public static W0C A00(Integer num) {
        return new W0C(C16799V6g.A00(num));
    }
}
