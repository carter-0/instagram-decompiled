package X;

/* renamed from: X.6VK  reason: invalid class name */
public final class AnonymousClass6VK implements Runnable {
    public final long A00;
    public final /* synthetic */ AnonymousClass6VJ A01;

    public AnonymousClass6VK(AnonymousClass6VJ r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reel launching took longer than ");
        sb.append(this.A00);
        sb.append(" ms. Reel loaded: ");
        AnonymousClass6VJ r2 = this.A01;
        long j = AnonymousClass6VJ.A0I;
        sb.append(r2.A0D.A0z(r2.A0C));
        sb.append(" Image loaded: ");
        sb.append(r2.A08);
        sb.append(" Source module: ");
        sb.append(r2.A03);
        String obj = sb.toString();
        0KC.A0C("ReelPreloadLauncher", obj);
        0wb.A03("ReelPreloadLauncher", obj);
    }
}
