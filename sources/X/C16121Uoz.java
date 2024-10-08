package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoTextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;

/* renamed from: X.Uoz  reason: case insensitive filesystem */
public final class C16121Uoz extends 17P implements C274444oL {
    public final TextAppSearchDiscussionTopic Axy() {
        return (TextAppSearchDiscussionTopic) A05(-1932673435, ImmutablePandoTextAppSearchDiscussionTopic.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.Uoz, X.4oL] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(V8R.A00(this), this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Uoz] */
    public final Integer BlF() {
        return getOptionalIntValueByHashCode(-1005155355);
    }

    public final String BlG() {
        return A0i(1961098136);
    }

    public final String C9s() {
        return A0i(-521591601);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.Uoz, X.17P] */
    public final C15063UNg FCT() {
        TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl;
        TextAppSearchDiscussionTopic Axy = Axy();
        if (Axy != null) {
            textAppSearchDiscussionTopicImpl = Axy.FCU();
        } else {
            textAppSearchDiscussionTopicImpl = null;
        }
        return new C15063UNg(textAppSearchDiscussionTopicImpl, getOptionalIntValueByHashCode(-1005155355), A0i(1961098136), A0i(-521591601));
    }
}
