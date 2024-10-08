package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.79l  reason: invalid class name and case insensitive filesystem */
public final class C3271179l implements C255763ug {
    public final AnonymousClass7NT A00;
    public final C255763ug A01;
    public final String A02;

    public C3271179l(AnonymousClass7NT r2, C255763ug r3, String str) {
        0qQ.A0B(str, 2);
        0qQ.A0B(r3, 3);
        this.A00 = r2;
        this.A02 = str;
        this.A01 = r3;
    }

    public final void D28(ClickableSpan clickableSpan, View view, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(clickableSpan, 2);
        AnonymousClass7NT r2 = this.A00;
        String str2 = this.A02;
        AnonymousClass7NK r0 = (AnonymousClass7NK) r2.A01.get(str2);
        if (r0 == null || !r0.CQX(str2)) {
            this.A01.D28(clickableSpan, view, str);
        } else {
            r2.A02(str2);
        }
    }
}
