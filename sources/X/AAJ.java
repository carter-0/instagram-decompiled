package X;

public abstract class AAJ {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            default:
                return -1;
        }
    }

    public static Integer A01(AnonymousClass8KV r2) {
        switch (r2.ordinal()) {
            case 0:
                return AnonymousClass05K.A00;
            case 1:
                return AnonymousClass05K.A01;
            case 2:
                return AnonymousClass05K.A0C;
            case 3:
                return AnonymousClass05K.A0N;
            case 4:
                return AnonymousClass05K.A0Y;
            case 5:
                return AnonymousClass05K.A0j;
            default:
                throw AnonymousClass7TE.A15(AnonymousClass7TG.A0m(r2, "Not FrameTargetHint for output: ", AnonymousClass7TE.A1A()));
        }
    }
}
