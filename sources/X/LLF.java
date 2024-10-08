package X;

public abstract class LLF {
    public static final String A00 = A00(999);

    public static final String A00(int i) {
        1iA A002 = 1i9.A00(Integer.valueOf(i));
        if (A002 == null) {
            return "IGMediaTypeUnavailable";
        }
        switch (A002.ordinal()) {
            case 0:
                return "IGMediaTypePhoto";
            case 1:
                return "IGMediaTypeVideo";
            case 2:
                return "IGMediaTypeMap";
            case 3:
                return "IGMediaTypeLive";
            case 4:
                return "IGMediaTypeCarousel";
            case 5:
                return "IGMediaTypePostLive";
            case 6:
                return "IGMediaTypeCollection";
            case 7:
                return "IGMediaTypeAudio";
            case 8:
                return "IGMediaTypeShowreelNative";
            case 9:
                return "IGMediaTypeGuideFacade";
            default:
                return "IGMediaTypeUnavailable";
        }
    }
}
