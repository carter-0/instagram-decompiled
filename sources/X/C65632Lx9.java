package X;

import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.Lx9  reason: case insensitive filesystem */
public final class C65632Lx9 implements C358118aO {
    public final int A00;
    public final Object A01;

    public C65632Lx9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dk9() {
        switch (this.A00) {
            case 0:
                C61438K7n.A05((C61438K7n) this.A01);
                return;
            case 1:
                K9I k9i = ((DirectPrivateStoryRecipientController) this.A01).A0H;
                if (k9i != null) {
                    k9i.A06();
                    return;
                }
                return;
            case 2:
                ((C63768L6a) this.A01).A00 = true;
                return;
            default:
                C64986LlP.A04((C64986LlP) this.A01);
                return;
        }
    }
}
