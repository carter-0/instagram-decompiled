package X;

/* renamed from: X.5mK  reason: invalid class name and case insensitive filesystem */
public final class C294365mK {
    public final C287955b5 A00;
    public final Integer A01;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AnimationResult(endReason=");
        if (this.A01.intValue() != 0) {
            str = "Finished";
        } else {
            str = "BoundReached";
        }
        sb.append(str);
        sb.append(", endState=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C294365mK(C287955b5 r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }
}
