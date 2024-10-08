package X;

/* renamed from: X.8iF  reason: invalid class name and case insensitive filesystem */
public final class C362638iF extends C320806sz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2Rw A01;

    public C362638iF(2Rw r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final int A00(int i) {
        int itemViewType;
        Class cls;
        AnonymousClass2t9 r2 = this.A01;
        if (!(r2 instanceof AnonymousClass2t9)) {
            return 0;
        }
        AnonymousClass2t9 r22 = r2;
        Object obj = r22.A05;
        if (0qQ.A0K(obj, "GalleryGridAdapter")) {
            itemViewType = r22.getItemViewType(i);
            if (itemViewType == r22.A01(C361718gg.class) || itemViewType == r22.A01(C362568i7.class) || itemViewType == r22.A01(C362578i8.class) || itemViewType == r22.A01(C362608iB.class) || itemViewType == r22.A01(C361728gh.class)) {
                return 1;
            }
            if (itemViewType != r22.A01(C362598iA.class)) {
                cls = C362588i9.class;
            }
            return this.A00;
        } else if (0qQ.A0K(obj, "StoryDraftsGalleryItemAdapter")) {
            itemViewType = r22.getItemViewType(i);
            if (itemViewType == r22.A01(C362408hq.class)) {
                return 1;
            }
            cls = C362418hr.class;
        } else if (!0qQ.A0K(obj, AnonymousClass000.A00(465)) || r22.getItemViewType(i) != r22.A01(FYS.class)) {
            return 0;
        } else {
            return 1;
        }
        if (itemViewType != r22.A01(cls)) {
            return 0;
        }
        return this.A00;
    }
}
