package X;

import android.content.DialogInterface;

/* renamed from: X.7bm  reason: invalid class name and case insensitive filesystem */
public final class C334727bm extends AnonymousClass0T0 implements C334127ai {
    public final DialogInterface.OnDismissListener A00;
    public final DialogInterface.OnShowListener A01;
    public final 28D A02;
    public final C335377cr A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334727bm) {
                C334727bm r5 = (C334727bm) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || this.A02 != r5.A02 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C335377cr r0 = this.A03;
        return ((((((r0 == null ? 0 : r0.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public C334727bm(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, 28D r3, C335377cr r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = onShowListener;
        this.A00 = onDismissListener;
    }
}
