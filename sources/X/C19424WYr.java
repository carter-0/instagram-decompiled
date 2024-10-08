package X;

import android.location.Location;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.WYr  reason: case insensitive filesystem */
public final class C19424WYr implements C267874cM {
    public final int A00;
    public final Object A01;

    public C19424WYr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DCn(Exception exc) {
    }

    public final void onLocationChanged(Location location) {
        String str;
        switch (this.A00) {
            case 0:
                C15285UZp uZp = (C15285UZp) this.A01;
                C15285UZp.A04(uZp, true);
                IgdsSwitch igdsSwitch = uZp.A0A;
                if (igdsSwitch == null) {
                    str = "useCurrentLocationSwitch";
                } else {
                    PromoteData promoteData = uZp.A05;
                    if (promoteData == null) {
                        str = "promoteData";
                    } else {
                        igdsSwitch.setChecked(promoteData.A0o.A00());
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 1:
                ((C19204WPk) this.A01).A07();
                return;
            default:
                1Wr r0 = 1Wr.A00;
                r0.getClass();
                if (r0.isAccurateEnough(location)) {
                    ((WZ2) this.A01).A02.A0I.invalidate();
                }
                WZ2 wz2 = (WZ2) this.A01;
                if (wz2.A00) {
                    WZ2.A00(wz2);
                    wz2.A00 = false;
                    return;
                }
                return;
        }
    }
}
