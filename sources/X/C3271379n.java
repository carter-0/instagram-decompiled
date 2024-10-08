package X;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.79n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3271379n implements C255763ug {
    public final /* synthetic */ AnonymousClass768 A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C3271379n(AnonymousClass768 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void D28(ClickableSpan clickableSpan, View view, String str) {
        AnonymousClass768 r4 = this.A00;
        String str2 = this.A01;
        AnonymousClass7XR r2 = r4.A01;
        if (r2 != null) {
            Context context = view.getContext();
            AnonymousClass9B9.A00();
            if (!context.getString(2131960442).startsWith(str) || !((Boolean) r4.A02.A0C.getValue()).booleanValue()) {
                ((AnonymousClass7X9) r2).Cql(str, true, str2);
            } else {
                ((C333147Xv) r2).CwE();
            }
        }
    }
}
