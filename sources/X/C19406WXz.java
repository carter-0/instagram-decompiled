package X;

import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView;

/* renamed from: X.WXz  reason: case insensitive filesystem */
public final class C19406WXz implements X4F {
    public final int A00;
    public final Object A01;

    public C19406WXz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dmt(String str) {
        IgFormField igFormField;
        switch (this.A00) {
            case 0:
                E5H e5h = (E5H) this.A01;
                if (!str.equals("removable") || (igFormField = e5h.A0F) == null) {
                    return;
                }
            case 2:
                if (str.equals("removable")) {
                    igFormField = ((C16017Un5) this.A01).A04;
                    break;
                } else {
                    return;
                }
            case 4:
                if (str.equals("removable")) {
                    igFormField = ((LeadGenFormShortAnswerQuestionView) this.A01).A01;
                    break;
                } else {
                    return;
                }
            default:
                if (str.equals("removable")) {
                    igFormField = ((Un0) this.A01).A02;
                    break;
                } else {
                    return;
                }
        }
        igFormField.setText("");
    }
}
