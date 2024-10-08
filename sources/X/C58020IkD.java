package X;

import java.util.List;

/* renamed from: X.IkD  reason: case insensitive filesystem */
public final /* synthetic */ class C58020IkD implements C61910qF, B1F {
    public final /* synthetic */ C52971GgO A00;

    public C58020IkD(C52971GgO ggO) {
        this.A00 = ggO;
    }

    public final void Eyz(C61081JwJ jwJ, C335907dj r9, String str, List list, boolean z) {
        AnonymousClass7TG.A1N(str, r9);
        0qQ.A0B(jwJ, 4);
        C52971GgO.A01(jwJ, r9, this.A00, str, list, z);
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(5, this.A00, C52971GgO.class, "onCommentPostedSuccessfully", "onCommentPostedSuccessfully(Ljava/lang/String;Lcom/instagram/comments/mvvm/data/model/CommentListRowModel$CommentRowModel;ZLjava/util/List;Lcom/instagram/comments/mvvm/data/model/CommentPostedSuccessUiModel;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B1F) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }
}
