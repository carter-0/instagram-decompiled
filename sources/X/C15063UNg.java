package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;

/* renamed from: X.UNg  reason: case insensitive filesystem */
public final class C15063UNg extends AnonymousClass0T0 implements C274444oL {
    public final TextAppSearchDiscussionTopic A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final C15063UNg FCT() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15063UNg) {
                C15063UNg uNg = (C15063UNg) obj;
                if (!0qQ.A0K(this.A00, uNg.A00) || !0qQ.A0K(this.A01, uNg.A01) || !0qQ.A0K(this.A02, uNg.A02) || !0qQ.A0K(this.A03, uNg.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TextAppSearchDiscussionTopic Axy() {
        return this.A00;
    }

    public final Integer BlF() {
        return this.A01;
    }

    public final String BlG() {
        return this.A02;
    }

    public final String C9s() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextAppPostRelatedTrendsInfo", V8R.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public C15063UNg(TextAppSearchDiscussionTopic textAppSearchDiscussionTopic, Integer num, String str, String str2) {
        this.A00 = textAppSearchDiscussionTopic;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
    }
}
