package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.N5w  reason: case insensitive filesystem */
public final class C68207N5w extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final Drawable A01;
    public final View.OnLongClickListener A02;
    public final C328637Fo A03;
    public final C254703su A04;
    public final boolean A05;
    public final int A06;

    public C68207N5w(Drawable drawable, View.OnLongClickListener onLongClickListener, C328637Fo r4, C254703su r5, int i, int i2, boolean z) {
        C51973G9u.A0r(1, r5, drawable, r4);
        this.A04 = r5;
        this.A00 = i;
        this.A06 = i2;
        this.A01 = drawable;
        this.A03 = r4;
        this.A05 = z;
        this.A02 = onLongClickListener;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68207N5w) {
                C68207N5w n5w = (C68207N5w) obj;
                if (!(0qQ.A0K(this.A04, n5w.A04) && this.A00 == n5w.A00 && this.A06 == n5w.A06 && 0qQ.A0K(this.A01, n5w.A01) && this.A03 == n5w.A03 && this.A05 == n5w.A05 && 0qQ.A0K(this.A02, n5w.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04.A0h();
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A01, (((AnonymousClass7TE.A0K(this.A04) + this.A00) * 31) + this.A06) * 31))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C254703su r0;
        C68207N5w n5w = (C68207N5w) obj;
        String A0h = this.A04.A0h();
        if (n5w == null || (r0 = n5w.A04) == null) {
            str = null;
        } else {
            str = r0.A0h();
        }
        if (!0qQ.A0K(A0h, str) || this.A03 != n5w.A03) {
            return false;
        }
        return true;
    }
}
