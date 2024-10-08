package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt;
import com.instagram.common.session.UserSession;
import com.instagram.nme.contextualpromo.ContextualPromoHelper;
import com.instagram.nux.aymh.viewmodel.AggregateAccountLoginHandler;

/* renamed from: X.Il5  reason: case insensitive filesystem */
public final class C58073Il5 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public final int A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58073Il5(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A0C = i;
        this.A03 = obj;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.Il5, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A0C) {
            case 0:
                this.A03 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return CommentPostingRequestExtensionsKt.A01((CommentGiphyMediaInfo) null, (C53335GmL) null, (C53285GlX) null, (UserSession) null, (AnonymousClass571) null, (AnonymousClass572) null, (1Xj) null, (1Xl) null, (String) null, (String) null, this);
            case 1:
                this.A0B = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ContextualPromoHelper) this.A03).A02((String) null, this);
            default:
                this.A0B = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((AggregateAccountLoginHandler) this.A03).A01((C61079JwH) null, (AnonymousClass0aP) null, (C60937Jtv) null, (AnonymousClass35F) null, (C239803Ii) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58073Il5(AnonymousClass4D7 r2) {
        super(r2);
        this.A0C = 0;
    }
}
