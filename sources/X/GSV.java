package X;

public final class GSV extends GRC {
    public final int A00;
    public final GSY A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GSV) {
                GSV gsv = (GSV) obj;
                if (!0qQ.A0K(this.A01, gsv.A01) || this.A00 != gsv.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public GSV(GSY gsy, int i) {
        super("story_mentions_info", "content_type_story_mentions_info");
        this.A01 = gsy;
        this.A00 = i;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }
}
