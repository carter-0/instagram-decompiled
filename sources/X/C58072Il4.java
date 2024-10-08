package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* renamed from: X.Il4  reason: case insensitive filesystem */
public final class C58072Il4 extends C64101El {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58072Il4(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A04 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Il4, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                this.A03 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((IgLiveQuestionsRepository) this.A04).A05((String) null, this, 0);
            case 1:
                this.A03 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((LimitsPlusRepository) this.A04).A03(this, 0);
            default:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return I3P.A01(this, (0sL) null, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58072Il4(AnonymousClass4D7 r2) {
        super(r2);
        this.A05 = 2;
    }
}
