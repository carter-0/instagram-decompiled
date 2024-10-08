package X;

import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.WYd  reason: case insensitive filesystem */
public final class C19410WYd implements X4I {
    public final int A00;
    public final Object A01;

    public C19410WYd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CvW(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str) {
        switch (this.A00) {
            case 0:
                ((C15313UaK) this.A01).A04();
                return;
            case 1:
                AnonymousClass7TF.A1H(leadGenFormBaseQuestion, str);
                ((C18077Vl6) this.A01).A05(leadGenFormBaseQuestion, str, false);
                return;
            default:
                return;
        }
    }
}
