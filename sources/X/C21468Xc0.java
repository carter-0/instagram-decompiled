package X;

import android.os.Handler;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.Xc0  reason: case insensitive filesystem */
public final class C21468Xc0 {
    public C296575qI A00;
    public C296505qA A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final C340077kf A03;
    public final XnF A04;
    public final C340097kh A05;
    public final AnonymousClass0JR A06;
    public final List A07 = new LinkedList();
    public final Queue A08 = new LinkedList();

    public C21468Xc0(C340077kf r2, XnF xnF, C340097kh r4, AnonymousClass0JR r5) {
        0qQ.A0B(r2, 2);
        this.A06 = r5;
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = xnF;
    }

    public final void A00() {
        this.A07.clear();
        this.A08.clear();
        this.A02.removeCallbacksAndMessages((Object) null);
    }
}
