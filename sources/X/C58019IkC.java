package X;

import java.util.List;

/* renamed from: X.IkC  reason: case insensitive filesystem */
public final /* synthetic */ class C58019IkC implements C61910qF, C66430MRk {
    public final /* synthetic */ C52971GgO A00;

    public C58019IkC(C52971GgO ggO) {
        this.A00 = ggO;
    }

    public final void AUc(Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        C52971GgO.A04(this.A00, num, str, str2, str3, str4, list, z);
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(7, this.A00, C52971GgO.class, "onCommentFailedPosting", "onCommentFailedPosting(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/instagram/feed/media/CommentFailCause;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C66430MRk) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }
}
