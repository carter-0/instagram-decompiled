package X;

import com.instagram.archive.fragment.ArchiveReelHighlightsFragment;

/* renamed from: X.Wag  reason: case insensitive filesystem */
public final class C19494Wag implements C20960X6n {
    public final int A00;
    public final Object A01;

    public C19494Wag(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DVC() {
        AnonymousClass2t9 r0;
        switch (this.A00) {
            case 0:
                C19381WWx wWx = ((ArchiveReelHighlightsFragment) this.A01).A00;
                if (wWx != null) {
                    for (C19269WSc wSc : wWx.A0A) {
                        wSc.A03 = false;
                    }
                    r0 = wWx.A05;
                    break;
                } else {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                }
            case 2:
                C15343Uat uat = (C15343Uat) this.A01;
                WWy wWy = uat.A02;
                if (wWy != null) {
                    for (C19269WSc wSc2 : wWy.A0E) {
                        wSc2.A03 = false;
                    }
                }
                WWy wWy2 = uat.A02;
                if (wWy2 != null) {
                    r0 = wWy2.A09;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r0.notifyDataSetChanged();
    }

    public final void DcQ() {
        switch (this.A00) {
            case 1:
                C51969G9p.A1M(this.A01);
                return;
            case 3:
                ((1IX) this.A01).EJ1((0sP) null, C60340gF.A00);
                return;
            default:
                return;
        }
    }
}
