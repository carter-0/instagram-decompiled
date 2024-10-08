package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Lnv  reason: case insensitive filesystem */
public final class C65133Lnv implements C66509MUn {
    public final /* synthetic */ AnonymousClass6Z5 A00;
    public final /* synthetic */ String A01;

    public C65133Lnv(AnonymousClass6Z5 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void Ckx() {
        String str;
        AnonymousClass6Z5 r3 = this.A00;
        C250973mM r2 = ((ReelViewerFragment) r3.A17).A0a;
        if (r2 != null && (str = this.A01) != null) {
            C310016aI r0 = r3.A0L;
            if (r0 == null) {
                0qQ.A0F("reelViewerLogger");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A0O(r2, str);
            }
        }
    }

    public final void Cky(boolean z) {
        String str;
        AnonymousClass6Z5 r1 = this.A00;
        C250973mM r2 = ((ReelViewerFragment) r1.A17).A0a;
        if (r2 != null && (str = this.A01) != null) {
            C310016aI r12 = r1.A0L;
            if (r12 == null) {
                0qQ.A0F("reelViewerLogger");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r12.A0Q(r2, (String) null, str, 0.0f, 0.0f);
            }
        }
    }

    public final void Cl1() {
        AnonymousClass6Z5 r1 = this.A00;
        C250973mM r2 = ((ReelViewerFragment) r1.A17).A0a;
        if (r2 != null) {
            C310016aI r12 = r1.A0L;
            if (r12 == null) {
                0qQ.A0F("reelViewerLogger");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r12.A0O(r2, AnonymousClass000.A00(307));
            }
        }
    }
}
