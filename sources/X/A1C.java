package X;

public abstract class A1C {
    public static final Integer A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -971609053:
                    if (str.equals("video_call_incoming")) {
                        return AnonymousClass05K.A00;
                    }
                    break;
                case -581010951:
                    if (str.equals("rtc_generic")) {
                        return AnonymousClass05K.A0C;
                    }
                    break;
                case -386351794:
                    if (str.equals("rtc_ring")) {
                        return AnonymousClass05K.A01;
                    }
                    break;
                case 835198941:
                    if (str.equals("video_call_ended")) {
                        return AnonymousClass05K.A0N;
                    }
                    break;
            }
        }
        return AnonymousClass05K.A0Y;
    }
}
