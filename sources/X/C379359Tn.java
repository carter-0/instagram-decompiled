package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.9Tn  reason: invalid class name and case insensitive filesystem */
public final class C379359Tn implements Runnable {
    public final /* synthetic */ C358088aL A00;
    public final /* synthetic */ C357638Yz A01;
    public final /* synthetic */ AnonymousClass8I0 A02;
    public final /* synthetic */ Integer A03;

    public C379359Tn(C358088aL r1, C357638Yz r2, AnonymousClass8I0 r3, Integer num) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = num;
    }

    public final void run() {
        View A05;
        int i;
        int i2;
        AnonymousClass8I0 r4 = this.A02;
        AnonymousClass8E8 A002 = r4.A05.A00();
        C358088aL r2 = this.A00;
        AnonymousClass8EA r0 = A002.A00;
        if (r0 != null && (A05 = r0.A05(r2)) != null) {
            C357638Yz r1 = this.A01;
            Integer num = this.A03;
            if ((r1.A08.A00 instanceof AnonymousClass80O) && !r1.A0S(AnonymousClass80N.A00, r2)) {
                AnonymousClass4DH r5 = r4.A03;
                if (r5.mLifecycleRegistry.A07().compareTo(07U.A04) >= 0) {
                    FragmentActivity requireActivity = r5.requireActivity();
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        i = 2131955532;
                    } else {
                        i = 2131955530;
                    }
                    AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(requireActivity, i);
                    A0e.A04(A05, r4.A01, 0, false);
                    A0e.A02();
                    A0e.A07(C283255Gu.A07);
                    A0e.A01 = r4.A02;
                    A0e.A0B = false;
                    A0e.A04 = new C389339pH(1, num, r4);
                    AnonymousClass5Gv A003 = A0e.A00();
                    if (intValue != 0) {
                        i2 = 2131955531;
                    } else {
                        i2 = 2131955529;
                    }
                    String string = r5.getString(i2);
                    0qQ.A07(string);
                    A003.A0B = string;
                    A003.A07(r4.A04);
                }
            }
        }
    }
}
