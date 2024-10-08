package X;

import java.util.List;

/* renamed from: X.IMw  reason: case insensitive filesystem */
public final class C57056IMw implements B1F, C61910qF {
    public final int A00;
    public final Object A01;

    public C57056IMw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Eyz(C61081JwJ jwJ, C335907dj r10, String str, List list, boolean z) {
        int i = this.A00;
        C335907dj r3 = r10;
        String str2 = str;
        AnonymousClass7TG.A1N(str, r10);
        C61081JwJ jwJ2 = jwJ;
        0qQ.A0B(jwJ, 4);
        switch (i) {
            case 5:
            case 6:
                C60314JjH.A01(r10, (C60314JjH) this.A01);
                return;
            default:
                C52971GgO.A01(jwJ2, r3, (C52971GgO) this.A01, str2, list, z);
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B1F) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        Class cls;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 5:
            case 6:
                cls = C60314JjH.class;
                break;
            default:
                cls = C52971GgO.class;
                break;
        }
        return new 03J(5, obj, cls, "onCommentPostedSuccessfully", "onCommentPostedSuccessfully(Ljava/lang/String;Lcom/instagram/comments/mvvm/data/model/CommentListRowModel$CommentRowModel;ZLjava/util/List;Lcom/instagram/comments/mvvm/data/model/CommentPostedSuccessUiModel;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
