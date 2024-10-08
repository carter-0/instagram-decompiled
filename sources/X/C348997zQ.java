package X;

/* renamed from: X.7zQ  reason: invalid class name and case insensitive filesystem */
public final class C348997zQ implements Runnable {
    public final /* synthetic */ C348987zP A00;

    public C348997zQ(C348987zP r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass91c r5;
        int currentTimeMillis;
        C348987zP r6 = this.A00;
        C306386Ly r1 = r6.A01;
        if (r1 != null) {
            C252063oV r7 = r6.A07;
            if (r7.CVM()) {
                if ((r1 instanceof AnonymousClass91c) && (r5 = (AnonymousClass91c) r1) != null) {
                    int A0W = r5.A0W();
                    if (A0W == 0) {
                        currentTimeMillis = 0;
                    } else {
                        currentTimeMillis = (int) ((System.currentTimeMillis() - r6.A00) % ((long) A0W));
                    }
                    r5.EXC(currentTimeMillis, r5.getDurationInMs());
                } else if (r1.A0I != null) {
                    r1.invalidateSelf();
                }
                r7.getView().postOnAnimation(r6.A0A);
            }
        }
    }
}
