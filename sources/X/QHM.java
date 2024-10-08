package X;

public final class QHM extends TA3 {
    public final boolean equals(Object obj) {
        if (!(obj instanceof QHM) || !super.equals(obj)) {
            return false;
        }
        return true;
    }
}
