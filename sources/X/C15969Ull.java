package X;

import com.instagram.common.session.UserSession;
import com.instagram.discovery.related.model.RelatedItem;

/* renamed from: X.Ull  reason: case insensitive filesystem */
public final class C15969Ull extends AnonymousClass369 {
    public final C17495VXy A00;
    public final U9j A01;

    public final void FN9(AnonymousClass345 r3, int i) {
        Object A0O;
        0qQ.A0B(r3, 0);
        U9j u9j = this.A01;
        if (!(u9j instanceof C15950UlL)) {
            A0O = 00k.A0O(u9j.A04, i);
        } else if (i != 0) {
            A0O = 00k.A0O(u9j.A04, i - 1);
        } else {
            return;
        }
        RelatedItem relatedItem = (RelatedItem) A0O;
        if (relatedItem != null) {
            r3.FNA(relatedItem.A03, relatedItem, i);
        }
    }

    public final Class C9I() {
        return RelatedItem.class;
    }

    public final /* bridge */ /* synthetic */ void Cs0(Object obj, int i) {
        String str;
        Integer num;
        AnonymousClass0iw r1;
        UserSession userSession;
        0xF r2;
        String A012;
        RelatedItem relatedItem = (RelatedItem) obj;
        0qQ.A0B(relatedItem, 0);
        C17495VXy vXy = this.A00;
        int intValue = relatedItem.A00().intValue();
        if (intValue == 0) {
            str = relatedItem.A03;
            0qQ.A07(str);
            if (vXy.A03.add(str)) {
                num = AnonymousClass05K.A00;
                r1 = vXy.A00;
                userSession = vXy.A02;
                r2 = vXy.A01;
                A012 = relatedItem.A01();
            } else {
                return;
            }
        } else if (intValue == 1) {
            String str2 = relatedItem.A03;
            0qQ.A07(str2);
            if (vXy.A03.add(str2)) {
                num = AnonymousClass05K.A0C;
                r1 = vXy.A00;
                userSession = vXy.A02;
                r2 = vXy.A01;
                A012 = relatedItem.A01();
                str = relatedItem.A03;
            } else {
                return;
            }
        } else {
            return;
        }
        C16936VBo.A00(r1, r2, userSession, num, A012, str);
    }

    public C15969Ull(C17495VXy vXy, U9j u9j) {
        this.A01 = u9j;
        this.A00 = vXy;
    }
}
