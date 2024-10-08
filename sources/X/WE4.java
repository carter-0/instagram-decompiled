package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;

public final class WE4 implements 06c {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WE4(C307896Rx r1, C277014uI r2, int i) {
        this.A00 = i;
        switch (i) {
            case 1:
            case 2:
            case 4:
                this.A02 = r2;
                this.A01 = r1;
                break;
            default:
                this.A01 = r1;
                this.A02 = r2;
                break;
        }
    }

    public final void DGi(String str, Bundle bundle) {
        C277014uI r3;
        C307896Rx r1;
        C308276Tl r2;
        Object valueOf;
        switch (this.A00) {
            case 0:
                0qQ.A0B(bundle, 1);
                if (!bundle.getBoolean("is_bottom_sheet_open")) {
                    ((View) this.A01).setClickable(true);
                }
                UHW uhw = (UHW) this.A02;
                boolean z = bundle.getBoolean("submitted");
                uhw.A00 = z;
                if (z) {
                    uhw.A02 = true;
                    uhw.A02();
                    return;
                }
                return;
            case 3:
                0qQ.A0B(bundle, 1);
                r3 = ((C276544tV) this.A01).A08();
                break;
            case 5:
                0qQ.A0B(bundle, 1);
                boolean z2 = bundle.getBoolean(Dbp.A02(9, 15, 54));
                C308276Tl r12 = new C308276Tl();
                r12.A01(Boolean.valueOf(z2));
                C299275ur.A00((C307896Rx) this.A01, r12.A00(), (C277014uI) this.A02);
                return;
            case 6:
                0qQ.A0B(bundle, 1);
                C276544tV r13 = (C276544tV) this.A01;
                if (r13 != null) {
                    r3 = r13.A0A(40);
                    break;
                } else {
                    return;
                }
            case 7:
                0qQ.A0B(bundle, 1);
                boolean z3 = bundle.getBoolean(AnonymousClass000.A00(5194));
                if (z3) {
                    C59689JTv.A07(((Fragment) this.A02).requireActivity(), 2131957329);
                }
                ((0hq) this.A01).A0x(AnonymousClass000.A00(144));
                K5R k5r = (K5R) this.A02;
                int i = 0;
                DbX.A0N(k5r.requireActivity(), k5r.A04).A06();
                FragmentActivity activity = k5r.getActivity();
                if (activity != null) {
                    Integer num = k5r.A00;
                    if (num == null) {
                        0qQ.A0F("entryPoint");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (num == AnonymousClass05K.A15) {
                        if (z3) {
                            i = -1;
                        }
                        activity.setResult(i);
                        activity.finish();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                r3 = (C277014uI) this.A02;
                r2 = new C308276Tl();
                r1 = (C307896Rx) this.A01;
                valueOf = r1.A03;
                break;
        }
        if (r3 != null) {
            int i2 = bundle.getInt(TraceFieldType.ErrorCode);
            r1 = (C307896Rx) this.A02;
            r2 = new C308276Tl();
            valueOf = Integer.valueOf(i2);
            r2.A01(valueOf);
            C299275ur.A00(r1, r2.A00(), r3);
        }
    }

    public WE4(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
