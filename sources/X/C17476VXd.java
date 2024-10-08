package X;

import android.graphics.Rect;

/* renamed from: X.VXd  reason: case insensitive filesystem */
public final class C17476VXd {
    public final int A00;
    public final Rect A01;
    public final VR2 A02;
    public final C16516UwL A03;

    public C17476VXd(VR2 vr2, C16516UwL uwL) {
        this.A03 = uwL;
        this.A02 = vr2;
        C20972X7c x7c = vr2.A00;
        Rect rect = new Rect(0, 0, (int) x7c.BIf(), (int) x7c.BIe());
        rect.offset((-rect.width()) / 2, (-rect.height()) / 2);
        this.A01 = rect;
        this.A00 = Math.max(rect.width(), rect.height());
    }
}
