package X;

/* renamed from: X.9x8  reason: invalid class name and case insensitive filesystem */
public abstract class C393869x8 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "IDLE";
        } else {
            str = "LOADING";
        }
        return str.hashCode() + intValue;
    }
}
