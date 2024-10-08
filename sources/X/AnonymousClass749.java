package X;

import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.expandingtextview.ExpandingTextView;

/* renamed from: X.749  reason: invalid class name */
public final class AnonymousClass749 implements AnonymousClass7D2 {
    public final AnonymousClass7XR A00;
    public final AnonymousClass7DZ A01;
    public final C255763ug A02 = new AnonymousClass74A(this);
    public final C255763ug A03 = new AnonymousClass74C(this);
    public final C255763ug A04 = new AnonymousClass74B(this);
    public final UserSession A05;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r12, AnonymousClass7FW r13) {
        AnonymousClass74L r122 = (AnonymousClass74L) r12;
        AnonymousClass79c r132 = (AnonymousClass79c) r13;
        ExpandingTextView expandingTextView = r122.A05;
        boolean z = r132.A0A;
        expandingTextView.A04 = z;
        expandingTextView.setMaxLines(3);
        expandingTextView.setExpandState(AnonymousClass74K.COLLAPSED);
        if (z) {
            expandingTextView.A02 = expandingTextView.getContext().getString(2131960112);
        }
        AnonymousClass74M r10 = new AnonymousClass74M(r122, r132);
        expandingTextView.setMaxWidth(AnonymousClass7PV.A00(expandingTextView.getContext(), r132.A0F));
        CharSequence charSequence = r132.A04;
        if (charSequence instanceof Spannable) {
            C3271479o.A02((Spannable) charSequence, this.A02, this.A03, new PGE(this, r132), this.A04, (C255763ug) null, (C255763ug) null, r10);
        }
        expandingTextView.setEllipsisTextColor(AnonymousClass7FB.A00(r132.A03.A03, r132.A00.CU2()));
        C3271479o.A00(r122.A02, expandingTextView, (AnonymousClass5FV) null, r132);
        this.A01.A02(r122, r132);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        AnonymousClass74L r32 = (AnonymousClass74L) r3;
        CharSequence text = r32.A05.getText();
        if (text instanceof Spannable) {
            C3271479o.A01((Spannable) text);
        }
        this.A01.A01(r32);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.7XR, X.7Wz, X.7XN, X.7XX] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass749(com.instagram.common.session.UserSession r9, X.AnonymousClass7XR r10, X.AnonymousClass9HC r11) {
        /*
            r8 = this;
            r8.<init>()
            X.74A r0 = new X.74A
            r0.<init>(r8)
            r8.A02 = r0
            X.74B r0 = new X.74B
            r0.<init>(r8)
            r8.A04 = r0
            X.74C r0 = new X.74C
            r0.<init>(r8)
            r8.A03 = r0
            r5 = r10
            r8.A00 = r10
            r8.A05 = r9
            r7 = 2131431571(0x7f0b1093, float:1.8484875E38)
            X.74D r2 = new X.74D
            r2.<init>(r10)
            X.7DT r3 = new X.7DT
            r3.<init>(r10)
            r6 = r11
            boolean r0 = r11.A1X
            X.7DV r4 = new X.7DV
            r4.<init>(r10, r0)
            X.7DX r1 = new X.7DX
            r1.<init>(r10)
            X.76F r0 = new X.76F
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.7DZ r0 = new X.7DZ
            r0.<init>(r1)
            r8.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass749.<init>(com.instagram.common.session.UserSession, X.7XR, X.9HC):void");
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.direct_expandable_text_message, viewGroup, false);
        AnonymousClass74L r1 = new AnonymousClass74L(inflate, (ExpandingTextView) inflate.requireViewById(R.id.direct_expandable_text_message_text_view));
        this.A01.A00(r1);
        return r1;
    }
}
