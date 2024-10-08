package X;

/* renamed from: X.JGr  reason: case insensitive filesystem */
public final class C59365JGr extends 0Yg implements 0sK {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0sK A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59365JGr(Object obj, String str, 0sK r4, float f, int i) {
        super(3);
        this.A01 = i;
        this.A03 = str;
        this.A00 = f;
        this.A02 = obj;
        this.A04 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        C286575Wy r10 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        if ((A0M & 6) == 0) {
            A0M |= G9t.A0Y(r10, A1a);
        }
        if ((A0M & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1106243795, "com.instagram.barcelona.feed.post.ui.MediaCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostCarousel.kt:635)");
            }
            int i = this.A01;
            C51967G9n.A1M(new C55799Hnf(this.A02, this.A03, this.A00, i, A1a), r10, this.A04, 0);
            if (0fL.A02()) {
                0fL.A00(-1639653177);
            }
        } else {
            r10.Evl();
        }
        return C60340gF.A00;
    }
}
