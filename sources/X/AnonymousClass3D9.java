package X;

import java.util.List;

/* renamed from: X.3D9  reason: invalid class name */
public final class AnonymousClass3D9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C231422re A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public AnonymousClass3D9(C231422re r1, Runnable runnable, List list, List list2, int i) {
        this.A01 = r1;
        this.A04 = list;
        this.A03 = list2;
        this.A00 = i;
        this.A02 = runnable;
    }

    public final void run() {
        this.A01.A03.execute(new AnonymousClass3DE(this, C232332tX.A00(new AnonymousClass3DC(this))));
    }
}
