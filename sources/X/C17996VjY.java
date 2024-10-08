package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VjY  reason: case insensitive filesystem */
public final class C17996VjY {
    public C322496vv A00 = C322496vv.Closed;
    public final Context A01;
    public final AnonymousClass07i A02;
    public final C14029ToV A03 = new C14029ToV();
    public final VOC A04;

    public final void A01(Hashtag hashtag) {
        String str;
        0qQ.A0B(hashtag, 0);
        List list = this.A03.A00;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (next instanceof C17674Vc5) {
                C17674Vc5 vc5 = (C17674Vc5) next;
                if (C18214Vne.A00(vc5) != AnonymousClass05K.A00) {
                    continue;
                } else {
                    Hashtag hashtag2 = vc5.A00;
                    if (hashtag2 != null) {
                        str = hashtag2.getId();
                    } else {
                        str = null;
                    }
                    if (0qQ.A0K(str, hashtag.getId())) {
                        break;
                    }
                }
            }
            i++;
        }
        Object obj = list.get(i);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.interestrecs.model.InterestRecommendationWrapper");
        C17674Vc5 vc52 = (C17674Vc5) obj;
        0qQ.A0B(vc52, 0);
        C298725tv r0 = (C298725tv) vc52.A01;
        String str2 = r0.A02;
        List list2 = r0.A06;
        String str3 = r0.A03;
        String str4 = r0.A04;
        String str5 = r0.A05;
        List list3 = r0.A07;
        User user = r0.A01;
        new 1E9(new 1hu((UserSession) null), 6, false);
        new 1E9(new 1hu((UserSession) null), 6, false);
        list.set(i, new C17674Vc5(new C298725tv(hashtag.FEY(), user, str2, str3, str4, str5, list2, list3)));
    }

    public final void A00() {
        if (AnonymousClass7TE.A1b(this.A03.A00)) {
            this.A00 = C322496vv.Open;
            return;
        }
        this.A00 = C322496vv.Loading;
        C15381Ube ube = this.A04.A00;
        UserSession A0l = AnonymousClass7TE.A0l(ube.A0i);
        String name = C15381Ube.A01(ube).A01.getName();
        if (name != null) {
            1NY A0O = DbU.A0O(A0l);
            DbU.A1P(A0O, "tags/%s/follow_chaining_recs/", new Object[]{Uri.encode(name.trim())});
            1OC A0S = DbT.A0S(A0O, UXK.class, C18224Vno.class);
            C15621Ufn.A00(A0S, this, 31);
            1ES.A00(this.A01, this.A02, A0S);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C17996VjY(Context context, AnonymousClass07i r3, VOC voc) {
        this.A01 = context;
        this.A02 = r3;
        this.A04 = voc;
    }
}
