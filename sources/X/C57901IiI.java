package X;

import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.IiI  reason: case insensitive filesystem */
public final class C57901IiI implements Runnable {
    public final /* synthetic */ H13 A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;
    public final /* synthetic */ boolean A02;

    public C57901IiI(H13 h13, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        this.A00 = h13;
        this.A01 = directThreadThemeInfo;
        this.A02 = z;
    }

    public final void run() {
        H13 h13 = this.A00;
        I6F i6f = h13.A00;
        if (i6f != null) {
            DirectThreadThemeInfo directThreadThemeInfo = this.A01;
            i6f.A05(directThreadThemeInfo.A0o);
            I6F i6f2 = h13.A00;
            if (i6f2 != null) {
                i6f2.A04(directThreadThemeInfo.A0o);
                H13.A04(h13, directThreadThemeInfo, this.A02);
                return;
            }
        }
        0qQ.A0F("aiThemesLogger");
        throw AnonymousClass00P.createAndThrow();
    }
}
