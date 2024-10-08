package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fmx  reason: case insensitive filesystem */
public final class C51010Fmx implements C311686d5 {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C314796ir A01;

    public C51010Fmx(AnonymousClass0iw r1, C314796ir r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DYA() {
        C314796ir r1 = this.A01;
        if (!r1.A01) {
            r1.A05.EHd();
        } else {
            r1.A01 = false;
        }
    }

    public final void DYB() {
        C314796ir r3 = this.A01;
        C255773uh Au5 = r3.A05.Au5();
        if (Au5 == null || Au5.A0e != C250963mL.NETEGO_META_GALLERY_STORIES) {
            C275794rx r0 = r3.A00;
            if (r0 != null) {
                r0.A03(true);
            }
            r3.A00 = null;
        }
        AnonymousClass9PQ.A05(this.A00, r3.A04, AnonymousClass05K.A00);
    }

    public final void onClick() {
        C270124gE r0;
        String str;
        C314796ir r2 = this.A01;
        C255773uh Au5 = r2.A05.Au5();
        if (Au5 != null && (r0 = Au5.A0C) != null && (str = r0.A04) != null) {
            AnonymousClass0iw r1 = this.A00;
            r2.A01 = true;
            UserSession userSession = r2.A04;
            AnonymousClass9PQ.A05(r1, userSession, AnonymousClass05K.A01);
            C49307Esq.A00.A07(r2.A03.getRootActivity(), 28D.A3V, userSession, "stories", str);
        }
    }
}
