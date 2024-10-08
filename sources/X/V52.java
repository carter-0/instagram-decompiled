package X;

public abstract class V52 {
    public static final float A00(C46626Di6 di6) {
        C48272Ebr ebr = C48272Ebr.$redex_init_class;
        switch (di6.ordinal()) {
            case 0:
            case 6:
                return 1.0f;
            case 1:
            case 2:
            case 4:
            case 5:
                return 0.75f;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered unsupported CDS bottom sheet style: ");
                sb.append(di6);
                throw new UnsupportedOperationException(C51967G9n.A0r(sb, '.'));
        }
    }
}
