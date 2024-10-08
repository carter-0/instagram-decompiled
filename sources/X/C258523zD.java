package X;

import java.util.concurrent.RunnableFuture;

/* renamed from: X.3zD  reason: invalid class name and case insensitive filesystem */
public final class C258523zD extends C258533zE implements RunnableFuture {
    public volatile 1LO A00;

    public final String A07() {
        1LO r2 = this.A00;
        if (r2 == null) {
            return C258523zD.super.A07();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("task=[");
        sb.append(r2);
        sb.append("]");
        return sb.toString();
    }

    public final void A08() {
        1LO r0;
        Object obj = this.value;
        if ((obj instanceof 1Ls) && ((1Ls) obj).A01 && (r0 = this.A00) != null) {
            r0.A03();
        }
        this.A00 = null;
    }

    public final void run() {
        1LO r0 = this.A00;
        if (r0 != null) {
            r0.run();
        }
        this.A00 = null;
    }
}
