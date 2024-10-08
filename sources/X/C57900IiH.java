package X;

import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.IiH  reason: case insensitive filesystem */
public final class C57900IiH implements Runnable {
    public final /* synthetic */ H13 A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;
    public final /* synthetic */ boolean A02;

    public C57900IiH(H13 h13, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        this.A00 = h13;
        this.A01 = directThreadThemeInfo;
        this.A02 = z;
    }

    public final void run() {
        H13.A04(this.A00, this.A01, this.A02);
    }
}
