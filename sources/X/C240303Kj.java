package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.3Kj  reason: invalid class name and case insensitive filesystem */
public final class C240303Kj extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final ClickableSpan A00;
    public final View A01;
    public final 1Xj A02;
    public final String A03;
    public final boolean A04;

    public C240303Kj(ClickableSpan clickableSpan, View view, 1Xj r4, String str, boolean z) {
        0qQ.A0B(r4, 1);
        this.A02 = r4;
        this.A03 = str;
        this.A04 = z;
        this.A01 = view;
        this.A00 = clickableSpan;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240303Kj) {
                C240303Kj r5 = (C240303Kj) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A04 != r5.A04 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        View view = this.A01;
        int i3 = 0;
        if (view == null) {
            hashCode = 0;
        } else {
            hashCode = view.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        ClickableSpan clickableSpan = this.A00;
        if (clickableSpan != null) {
            i3 = clickableSpan.hashCode();
        }
        return i4 + i3;
    }
}
