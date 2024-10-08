package X;

/* renamed from: X.3ai  reason: invalid class name and case insensitive filesystem */
public enum C244143ai {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);
    
    public final int A00;

    /* access modifiers changed from: public */
    C244143ai(int i) {
        this.A00 = i;
    }

    public static C244143ai A00(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException(002.A0O("Unknown enum value: ", i));
        }
    }
}
