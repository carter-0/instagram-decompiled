package X;

import java.util.List;

/* renamed from: X.IMv  reason: case insensitive filesystem */
public final class C57055IMv implements C66430MRk, C61910qF {
    public final int A00;
    public final Object A01;

    public final void AUc(Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        C52971GgO.A04((C52971GgO) this.A01, num, str, str2, str3, str4, list, z);
    }

    public C57055IMv(C52971GgO ggO, int i) {
        this.A00 = i;
        this.A01 = ggO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C66430MRk) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(7, this.A01, C52971GgO.class, "onCommentFailedPosting", "onCommentFailedPosting(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/instagram/feed/media/CommentFailCause;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
