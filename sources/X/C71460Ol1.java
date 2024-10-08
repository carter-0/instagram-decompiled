package X;

import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ol1  reason: case insensitive filesystem */
public final class C71460Ol1 implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C71460Ol1(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        if (this.A00 != 0) {
            UserSession userSession = ((P2V) this.A01).A00;
            String str2 = this.A02;
            1Ou A012 = 1Ou.A01(userSession);
            C66665MaY A08 = C66669Mac.A08(userSession, C65941iJ.class);
            0qQ.A0B(A08, 1);
            1OS r0 = new 1OS(A08);
            r0.A00 = str2;
            r0.A01 = z;
            A012.A0A(r0);
            return;
        }
        C69178NgR ngR = (C69178NgR) this.A01;
        ((AnonymousClass7ZW) ngR.A00.getValue()).A01(this.A02, z);
        C254793t3 A002 = OXL.A00(ngR.requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A002 != null) {
            str = C300965yF.A07(A002);
        } else {
            str = null;
        }
        ((AnonymousClass7I3) ngR.A01.getValue()).A0D((String) null, str, z);
    }
}
