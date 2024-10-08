package X;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.TzT  reason: case insensitive filesystem */
public final class C14621TzT implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C14618TzQ A01;
    public final /* synthetic */ C307786Rm A02;
    public final /* synthetic */ C276544tV A03;
    public final /* synthetic */ C277014uI A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C14621TzT(View view, C14618TzQ tzQ, C307786Rm r3, C276544tV r4, C277014uI r5, boolean z, boolean z2) {
        this.A01 = tzQ;
        this.A06 = z;
        this.A00 = view;
        this.A05 = z2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.A06) {
            X9E x9e = (X9E) this.A00;
            x9e.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            x9e.setChecked(this.A05);
            x9e.setOnCheckedChangeListener(this);
        }
        C277014uI r4 = this.A04;
        if (r4 != null) {
            C276544tV r3 = this.A03;
            C308276Tl A0T = DbU.A0T(r3);
            A0T.A02(Boolean.valueOf(z));
            C307786Rm r0 = this.A02;
            A0T.A03(r0, 2);
            DbT.A1R(r0, r3, A0T, r4);
        }
    }
}
