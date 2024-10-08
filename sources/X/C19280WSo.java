package X;

import android.content.Context;

/* renamed from: X.WSo  reason: case insensitive filesystem */
public final class C19280WSo implements C232262tL, X40 {
    public int A00 = -1;
    public final C17797VgA A01;
    public final C16672Uz8 A02;

    public final int CEi(Context context) {
        int i = this.A00;
        if (i != -1) {
            return i;
        }
        int A04 = JTR.A04(context);
        this.A00 = A04;
        return A04;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19280WSo wSo = (C19280WSo) obj;
        0qQ.A0B(wSo, 0);
        if (this.A02 != wSo.A02 || !0qQ.A0K(this.A01.A01, wSo.A01.A01)) {
            return false;
        }
        return true;
    }

    public C19280WSo(C17797VgA vgA, C16672Uz8 uz8) {
        AnonymousClass7TG.A1O(vgA, uz8);
        this.A01 = vgA;
        this.A02 = uz8;
    }
}
