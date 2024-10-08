package X;

/* renamed from: X.8gn  reason: invalid class name and case insensitive filesystem */
public final class C361788gn implements Runnable {
    public final /* synthetic */ C361778gm A00;

    public C361788gn(C361778gm r1) {
        this.A00 = r1;
    }

    public final void run() {
        C361778gm r5 = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        r5.A0C.animate().setDuration(500).alpha(0.0f).setListener(new C378579Qj(r5));
        r5.A0B.animate().setDuration(500).alpha(0.0f);
    }
}
