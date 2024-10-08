package X;

import android.view.View;

/* renamed from: X.LiK  reason: case insensitive filesystem */
public final class C64800LiK implements C232262tL {
    public final View.OnClickListener A00;
    public final C62582KiF A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A01.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64800LiK liK = (C64800LiK) obj;
        0qQ.A0B(liK, 0);
        if (this.A01.A00 == liK.A01.A00 && 0qQ.A0K(this.A02, liK.A02) && this.A04 == liK.A04 && this.A03 == liK.A03) {
            return true;
        }
        return false;
    }

    public C64800LiK(View.OnClickListener onClickListener, C62582KiF kiF, String str, boolean z, boolean z2) {
        this.A01 = kiF;
        this.A02 = str;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = onClickListener;
    }
}
