package X;

public abstract class Ri8 {
    public static final boolean A00() {
        02m r0 = RQ9.A01;
        if (r0 != null) {
            r0.markerStart(424088705);
        }
        02m r2 = RQ9.A01;
        if (r2 != null) {
            r2.markerAnnotate(424088705, C273654mx.A00(887), RQ9.A00);
        }
        int i = RQ9.A00;
        02m r1 = RQ9.A01;
        if (i == 0) {
            if (r1 == null) {
                return true;
            }
            r1.markerEnd(424088705, 2);
            return true;
        } else if (r1 == null) {
            return false;
        } else {
            r1.markerEnd(424088705, 3);
            return false;
        }
    }
}
