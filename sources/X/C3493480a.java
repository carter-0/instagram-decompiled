package X;

/* renamed from: X.80a  reason: invalid class name and case insensitive filesystem */
public final class C3493480a implements C3493580b {
    public final AnonymousClass80Z A00;

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        AnonymousClass80Z r1;
        AnonymousClass80Y r2;
        if (obj2 == AnonymousClass80X.POST_CAPTURE) {
            r1 = this.A00;
            r2 = AnonymousClass80Y.EDITING;
        } else if (obj2 != AnonymousClass80X.SUB_FRAGMENT) {
            r1 = this.A00;
            r2 = AnonymousClass80Y.CURATION;
        } else {
            return;
        }
        if (r2 != r1.A00) {
            r1.A00 = r2;
            for (AnonymousClass81G FHt : r1.A01) {
                FHt.FHt(r2);
            }
        }
    }

    public C3493480a(AnonymousClass80Z r1) {
        this.A00 = r1;
    }
}
