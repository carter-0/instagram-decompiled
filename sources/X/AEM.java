package X;

import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;

public abstract class AEM {
    public static final Integer A02(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1212837439) {
            if (hashCode != 3415681) {
                if (hashCode != 668488878 || !str.equals("permanent")) {
                    return null;
                }
                return AnonymousClass05K.A0C;
            } else if (str.equals("once")) {
                return AnonymousClass05K.A00;
            } else {
                return null;
            }
        } else if (str.equals("replayable")) {
            return AnonymousClass05K.A01;
        } else {
            return null;
        }
    }

    public static final Integer A00(LocalSendSpeedMessageTypes localSendSpeedMessageTypes) {
        switch (localSendSpeedMessageTypes.ordinal()) {
            case 1:
                return AnonymousClass05K.A1F;
            case 2:
                return AnonymousClass05K.A09;
            case 3:
                return AnonymousClass05K.A06;
            case 4:
                return AnonymousClass05K.A0N;
            case 5:
                return AnonymousClass05K.A0Y;
            case 6:
                return AnonymousClass05K.A0A;
            case 7:
                return AnonymousClass05K.A04;
            case 8:
                return AnonymousClass05K.A03;
            default:
                return AnonymousClass05K.A00;
        }
    }

    public static final Integer A01(Integer num) {
        switch (num.intValue()) {
            case 2:
                return AnonymousClass05K.A0N;
            case 3:
                return AnonymousClass05K.A0Y;
            case 5:
                return AnonymousClass05K.A06;
            case 6:
                return AnonymousClass05K.A09;
            case 7:
                return AnonymousClass05K.A0A;
            case 8:
                return AnonymousClass05K.A04;
            case 9:
                return AnonymousClass05K.A03;
            default:
                return AnonymousClass05K.A00;
        }
    }
}
