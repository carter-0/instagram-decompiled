package X;

import android.view.View;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.8ht  reason: invalid class name and case insensitive filesystem */
public final class C362438ht implements View.OnClickListener {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ C361998hA A01;

    public C362438ht(IgTextView igTextView, C361998hA r2) {
        this.A00 = igTextView;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0fD.A05(1110073952);
        if (this.A00.isSelected()) {
            i = 1745395386;
        } else {
            C361998hA r1 = this.A01;
            27p.A01(r1.A0F).A0a();
            C362048hG r12 = r1.A05;
            if (r12 == null) {
                0qQ.A0F("delegate");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r12.A0g(true);
                i = -1069321306;
            }
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
