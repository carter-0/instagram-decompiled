package X;

import android.text.style.ClickableSpan;

/* renamed from: X.EGb  reason: case insensitive filesystem */
public final class C47764EGb extends AnonymousClass4AA {
    public final ClickableSpan A00;
    public final String A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C47764EGb eGb = (C47764EGb) obj;
        0qQ.A0B(eGb, 0);
        if (!0qQ.A0K(this.A01, eGb.A01) || !0qQ.A0K(this.A02, eGb.A02)) {
            return false;
        }
        return true;
    }

    public C47764EGb(ClickableSpan clickableSpan, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = clickableSpan;
    }
}
