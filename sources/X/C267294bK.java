package X;

/* renamed from: X.4bK  reason: invalid class name and case insensitive filesystem */
public final class C267294bK extends 1F1 {
    public final Runnable A00;

    public final void run() {
        this.A00.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        Runnable runnable = this.A00;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(runnable)));
        sb.append(", ");
        sb.append(this.A00);
        sb.append(", ");
        sb.append(this.A01);
        sb.append(']');
        return sb.toString();
    }

    public C267294bK(Runnable runnable, C634712l r2, long j) {
        this.A00 = j;
        this.A01 = r2;
        this.A00 = runnable;
    }
}
