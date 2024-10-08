package X;

import android.widget.CompoundButton;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;

/* renamed from: X.WCz  reason: case insensitive filesystem */
public final class C18922WCz implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C18922WCz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static void A00(CompoundButton compoundButton, Object obj, Object obj2, int i) {
        compoundButton.setOnCheckedChangeListener(new C18922WCz(i, obj, obj2));
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C14786U8w u8w;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes;
        C59732JVq jVq;
        switch (this.A00) {
            case 0:
                C15315UaN uaN = (C15315UaN) this.A02;
                if (uaN.isResumed()) {
                    u8w = uaN.A02();
                    break;
                } else {
                    return;
                }
            case 1:
                u8w = (C14786U8w) ((UZH) this.A02).A00.getValue();
                break;
            case 2:
                C14776U8m u8m = (C14776U8m) ((UZ0) this.A02).A06.getValue();
                String str = ((LeadGenCustomDisclaimerCheckbox) this.A01).A00;
                0qQ.A0B(str, 0);
                C61046Jvk jvk = (C61046Jvk) u8m.A06.get(str);
                if (jvk != null) {
                    jvk.A01 = z;
                }
                C14776U8m.A00(u8m);
                return;
            default:
                C15307UaE uaE = (C15307UaE) this.A02;
                if (uaE.isResumed()) {
                    C14787U8y A0T = C13990Tnq.A0T(uaE.A04);
                    leadGenInfoFieldTypes = (LeadGenInfoFieldTypes) this.A01;
                    jVq = A0T.A01;
                    break;
                } else {
                    return;
                }
        }
        leadGenInfoFieldTypes = (LeadGenInfoFieldTypes) this.A01;
        jVq = u8w.A01;
        W33.A04(jVq, leadGenInfoFieldTypes, z);
    }
}
