package X;

import android.view.View;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.7e8  reason: invalid class name and case insensitive filesystem */
public final class C336137e8 implements View.OnClickListener {
    public final /* synthetic */ C334397bC A00;
    public final /* synthetic */ C53335GmL A01;
    public final /* synthetic */ C334347b7 A02;
    public final /* synthetic */ C52971GgO A03;
    public final /* synthetic */ C335417cv A04;
    public final /* synthetic */ 0lr A05;

    public C336137e8(C334397bC r1, C53335GmL gmL, C334347b7 r3, C52971GgO ggO, C335417cv r5, 0lr r6) {
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
        this.A03 = ggO;
        this.A01 = gmL;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1747638370);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A02.A0B;
        C335417cv r0 = this.A04;
        String str = r0.A06;
        boolean z = r0.A0F;
        C381459bn A012 = C334337b6.A01(r0);
        0lr r7 = this.A05;
        C334337b6.A04(composerAutoCompleteTextView, A012, this.A00, this.A01, this.A03, r7, str, z);
        AnonymousClass0fD.A0C(-1381704800, A052);
    }
}
