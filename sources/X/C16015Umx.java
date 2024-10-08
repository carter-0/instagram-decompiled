package X;

import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.Umx  reason: case insensitive filesystem */
public abstract class C16015Umx extends Un0 implements C20979X7s {
    public N4R A00;
    public 0sP A01;

    public void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        IgFormField igFormField = this.A02;
        igFormField.setInComboMode(new WBA((Object) this, 23));
        if (z3 && leadGenFormBaseQuestion.A0I) {
            igFormField.getBottomSubtitleInfoView().setText((CharSequence) null);
            W0n.A02(igFormField, new C19406WXz(this, 3));
        }
    }

    public final N4R getCurrentCountry() {
        return this.A00;
    }

    public String getCurrentCountryCode() {
        String A03;
        N4R n4r = this.A00;
        if (n4r == null || (A03 = n4r.A03()) == null) {
            return "";
        }
        return A03;
    }

    public 0sP getOnCountryPickerClickListener() {
        return this.A01;
    }

    public final void setCurrentCountry(N4R n4r) {
        this.A00 = n4r;
    }

    public void setOnCountryPickerClickListener(0sP r1) {
        this.A01 = r1;
    }
}
