package X;

import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.mutations.CompositeMutation;

/* renamed from: X.Iku  reason: case insensitive filesystem */
public final class C58062Iku extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Iku, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        this.A04 = obj;
        this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        Object obj2 = this.A06;
        if (i != 0) {
            return C52974GgR.A00((MusicCanonicalType) null, (C52974GgR) obj2, (String) null, this, 0, 0);
        }
        return ((CompositeMutation) obj2).Cor((C293505kq) null, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58062Iku(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A06 = obj;
    }
}
