package X;

public abstract class O3X {
    public static final Integer A00(String str) {
        if (str != null) {
            if (00l.A0d(str, "ig_self_injury_direct_message", false)) {
                return AnonymousClass05K.A0N;
            }
            if (00l.A0d(str, "ig_nudity_direct_message", false)) {
                return AnonymousClass05K.A01;
            }
            Integer num = AnonymousClass05K.A0Y;
            if (00l.A0d(str, "ig_bullying_or_harassment_direct_message", false)) {
                return AnonymousClass05K.A0C;
            }
            if (00l.A0d(str, "ig_product_scam_fraud_reportable", false)) {
                return num;
            }
            if (00l.A0d(str, "ig_hate_speech_direct_message", false)) {
                return AnonymousClass05K.A0j;
            }
        }
        return AnonymousClass05K.A00;
    }
}
