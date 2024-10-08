package X;

import com.instagram.bugreporter.BugReportSevereSwitchView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.PQn  reason: case insensitive filesystem */
public final class C72955PQn implements C273414mX {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C72955PQn(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = obj;
    }

    public final void Cyc() {
        if (this.A00 != 0 && this.A02) {
            ((C39963ALf) this.A01).A04();
        }
    }

    public final void Cyf() {
        IgdsSwitch igdsSwitch;
        if (this.A00 == 0 && this.A02 && (igdsSwitch = ((BugReportSevereSwitchView) this.A01).A05) != null) {
            igdsSwitch.setChecked(false);
        }
    }
}
