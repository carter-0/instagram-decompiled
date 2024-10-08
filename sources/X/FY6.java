package X;

public final class FY6 implements C232262tL {
    public final Integer A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        switch (this.A00.intValue()) {
            case 0:
                return "FEED";
            case 1:
                return "STORY";
            case 2:
                return AnonymousClass000.A00(2489);
            case 3:
                return "REEL";
            case 4:
                return "LIVE";
            case 5:
                return "AI";
            case 6:
                return "MADE_FOR_YOU";
            case 7:
                return "PROMOTE";
            case 8:
                return "FUNDRAISER";
            case 9:
                return "INVITE_GROUP_MEMBERS";
            case 10:
                return "CHANNEL_CREATION";
            case 11:
                return "QUIET_POSTING";
            default:
                return "MUSIC_HIGHLIGHT";
        }
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        FY6 fy6 = (FY6) obj;
        0qQ.A0B(fy6, 0);
        return AnonymousClass7TF.A1W(fy6.A00, this.A00);
    }

    public FY6(Integer num) {
        this.A00 = num;
    }
}
