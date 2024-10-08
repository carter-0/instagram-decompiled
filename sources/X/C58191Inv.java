package X;

import java.util.List;

/* renamed from: X.Inv  reason: case insensitive filesystem */
public final class C58191Inv extends 0Yg implements C62320sa {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass3Y5 A02;
    public final /* synthetic */ C53698Gsp A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58191Inv(AnonymousClass3Y5 r2, C53698Gsp gsp, float f, long j) {
        super(0);
        this.A03 = gsp;
        this.A02 = r2;
        this.A00 = f;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        float size;
        C53698Gsp gsp = this.A03;
        AnonymousClass3Y5 r5 = this.A02;
        float f = this.A00;
        int A012 = C245073cH.A01(this.A01);
        List list = gsp.A01;
        if (list.isEmpty()) {
            size = 0.0f;
        } else {
            size = (f * ((float) list.size())) + ((((float) list.size()) * 4.0f) - 1.0f) + 48.0f;
            float f2 = ((float) A012) / C51970G9q.A0d(r5).A01.getDisplayMetrics().density;
            if (size > f2) {
                size = f2;
            }
        }
        return Float.valueOf(size);
    }
}
