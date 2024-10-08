package X;

import com.instagram.user.model.User;

/* renamed from: X.M0e  reason: case insensitive filesystem */
public final class C65812M0e implements X84 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C65812M0e(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    public final void CtD() {
        C60437JlV jlV;
        int bindingAdapterPosition;
        switch (this.A00) {
            case 0:
                M0U m0u = (M0U) ((MVW) this.A01);
                User user = m0u.A04;
                if (user != null) {
                    jlV = (C60437JlV) this.A03;
                    C62283KdH kdH = ((C62247Kch) jlV.A05).A03;
                    AnonymousClass7TE.A1Z(new C66177MGo(kdH, user, (AnonymousClass4D7) null, 5), C318116oQ.A00(kdH));
                    m0u.A00 = 0;
                    bindingAdapterPosition = ((C249703kE) this.A02).getBindingAdapterPosition();
                    break;
                } else {
                    return;
                }
            case 1:
                jlV = (C60437JlV) this.A03;
                jlV.A05.DUj((M0U) this.A02);
                break;
            default:
                jlV = (C60437JlV) this.A03;
                jlV.A05.DGS((M0U) this.A02);
                break;
        }
        int indexOf = jlV.A07.indexOf((MVW) this.A01);
        if (indexOf >= 0) {
            bindingAdapterPosition = C60437JlV.A00(jlV, indexOf);
            jlV.notifyItemChanged(bindingAdapterPosition);
        }
    }

    public final void D4i() {
        if (this.A00 == 0) {
            ((C65809M0b) ((C60437JlV) this.A03).A05).A09.A00((MVW) this.A01);
        }
    }

    public final void DBo() {
        if (this.A00 == 0) {
            ((M0U) ((MVW) this.A01)).A00 = 3;
            ((2Rw) this.A03).notifyItemChanged(((C249703kE) this.A02).getBindingAdapterPosition());
        }
    }
}
