package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.TJq  reason: case insensitive filesystem */
public final class C13060TJq implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C13894TjH A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C13060TJq(Fragment fragment, C13894TjH tjH, boolean z, boolean z2) {
        this.A01 = tjH;
        this.A00 = fragment;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void run() {
        this.A01.ESk(this.A00, this.A02, this.A03);
    }
}
