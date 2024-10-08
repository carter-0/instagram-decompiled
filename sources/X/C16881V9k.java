package X;

import android.os.Bundle;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;

/* renamed from: X.V9k  reason: case insensitive filesystem */
public abstract class C16881V9k {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VVd, java.lang.Object] */
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        AnonymousClass6Tm r1 = r17;
        Object A03 = r1.A03(0);
        0qQ.A0C(A03, C66579MXk.A00(375));
        Hashtag hashtag = (Hashtag) A03;
        String A0h = DbY.A0h(r1, 1);
        String A0j = AnonymousClass7TG.A0j();
        Bundle bundle = new Bundle();
        ? obj = new Object();
        obj.A00 = null;
        obj.A02 = new ArrayList();
        obj.A01 = null;
        SectionPagination sectionPagination = new SectionPagination(obj);
        C16672Uz8 uz8 = C16672Uz8.TOP;
        String name = hashtag.getName();
        if (name == null) {
            name = "";
        }
        bundle.putParcelable("contextual_feed_config", new HashtagContextualFeedConfig(new EntityContextualFeedConfig(sectionPagination, uz8, (C16672Uz8) null, name, (String) null, 0, 10, true), hashtag, A0j, A0h));
        ArrayList A14 = DbV.A14(A0h);
        C309516Yo A0I = Dbb.A0I(r16);
        C46424Del A00 = C49262Es5.A00("feed_contextual_hashtag");
        A00.A06 = "Hashtag";
        A00.A09(A14);
        A00.A08 = A0h;
        A00.A01 = bundle;
        A00.A0A = A0j;
        Dba.A0w((Bundle) null, A00.A07(), A0I);
        return null;
    }
}
