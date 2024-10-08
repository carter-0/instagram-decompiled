package X;

/* renamed from: X.MuS  reason: case insensitive filesystem */
public final class C67768MuS extends C252303ot {
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        C232272tM r3 = (C232272tM) obj;
        if (!r3.getClass().equals(obj2.getClass()) || !r3.isContentSame(obj2)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        C232262tL r4 = (C232262tL) obj;
        C232262tL r5 = (C232262tL) obj2;
        if (r4 == r5 || (r4.getClass().equals(r5.getClass()) && r4.getKey().equals(r5.getKey()))) {
            return true;
        }
        return false;
    }
}
