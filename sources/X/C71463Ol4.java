package X;

import android.widget.CompoundButton;

/* renamed from: X.Ol4  reason: case insensitive filesystem */
public final class C71463Ol4 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C69184Nga A00;
    public final /* synthetic */ PR9 A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C71463Ol4(C69184Nga nga, PR9 pr9, boolean z, boolean z2) {
        this.A00 = nga;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = pr9;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        0qQ.A0B(compoundButton, 0);
        if (z) {
            C69184Nga nga = this.A00;
            NUQ A002 = C67758MuD.A00(nga);
            A002.A0B("TURN_ON_3P");
            A002.A08();
            C69184Nga.A07(nga).A05(nga.requireActivity(), z);
        } else if (!this.A02 || this.A03) {
            C69184Nga nga2 = this.A00;
            C67758MuD.A00(nga2).A0B("TURN_OFF_3P");
            C67758MuD.A00(nga2).A0B("TURN_OFF_3P_DIALOG_IMPRESSION");
            C71145Oe2.A06(nga2, C358278ae.RED_BOLD, 2131961702, 2131961699, (Integer) null, (C62320sa) null, new C41567AwZ(40, compoundButton, nga2, this.A01), (C62320sa) null, new GA1(27, nga2, z), 2131961701, 2131961700);
        } else {
            C69184Nga nga3 = this.A00;
            C67758MuD.A00(nga3).A0B("TURN_OFF_3P_STOPPED_NEED_MORE_THAN_ONE_METHOD");
            C71145Oe2.A06(nga3, C358278ae.BLUE_BOLD, 2131973149, (Integer) null, (Integer) null, (C62320sa) null, C73915Plq.A00(this.A01, compoundButton, 8), (C62320sa) null, C73736Pix.A00, 2131973148, 2131973147);
        }
    }
}
