package X;

/* renamed from: X.93o  reason: invalid class name and case insensitive filesystem */
public abstract class C3729993o {
    public static final 11S A00;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append("(\\p{Digit}+)");
        sb.append("(\\.)?(");
        sb.append("(\\p{Digit}+)");
        sb.append("?)(");
        sb.append("[eE][+-]?(\\p{Digit}+)");
        sb.append(")?)|(\\.(");
        sb.append("(\\p{Digit}+)");
        sb.append(")(");
        sb.append("[eE][+-]?(\\p{Digit}+)");
        sb.append(")?)|((");
        sb.append("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))");
        sb.append(")[pP][+-]?");
        sb.append("(\\p{Digit}+)");
        sb.append(')');
        A00 = new 11S(002.A0g("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", sb.toString(), ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
