package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import java.util.List;
import java.util.Set;

/* renamed from: X.9Jl  reason: invalid class name and case insensitive filesystem */
public final class C376819Jl extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public boolean A09;
    public final int A0A;
    public final Object A0B;

    /* JADX WARNING: type inference failed for: r10v0, types: [X.9Jl, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A0A;
        this.A08 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        switch (i) {
            case 0:
                return MediaCommentListRepository.A07((MediaCommentListRepository) this.A0B, (Set) null, (Set) null, this, (C62320sa) null, (0sJ) null, false);
            case 1:
                return MediaCommentListRepository.A01((C61081JwJ) null, (B1F) null, (MediaCommentListRepository) this.A0B, (String) null, (String) null, (List) null, this, false);
            default:
                return ((ClipsDraftRepository) this.A0B).A0B((C293505kq) null, (B24) null, this, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376819Jl(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A0A = i;
        this.A0B = obj;
    }
}
