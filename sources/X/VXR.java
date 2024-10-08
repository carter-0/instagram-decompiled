package X;

public final class VXR {
    public static int A03;
    public static int A04;
    public final C45408Cvo A00;
    public final Integer A01;
    public final String A02;

    public VXR(C45408Cvo cvo, Integer num) {
        StringBuilder sb;
        int i;
        String A0z;
        this.A00 = cvo;
        this.A01 = num;
        int intValue = num.intValue();
        if (intValue == 0) {
            sb = new StringBuilder();
            sb.append("empty_space_");
            i = A04;
            A04 = i + 1;
            A0z = Pxe.A0z(sb, i);
        } else if (intValue != 1) {
            cvo.getClass();
            cvo.A02.getClass();
            A0z = cvo.A02.A0X;
            A0z.getClass();
        } else {
            sb = new StringBuilder();
            sb.append("media_placeholder_");
            i = A03;
            A03 = i + 1;
            A0z = Pxe.A0z(sb, i);
        }
        this.A02 = A0z;
    }
}
