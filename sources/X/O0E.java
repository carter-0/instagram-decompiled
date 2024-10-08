package X;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class O0E {
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, com.instagram.model.direct.DirectMessageSearchThread] */
    public static final ArrayList A00(UserSession userSession, List list) {
        ArrayList arrayList;
        String A07;
        String str;
        DirectMessageSearchMessage directMessageSearchMessage;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C74253Prh prh = (C74253Prh) it.next();
            if (prh instanceof C72646PDz) {
                C72646PDz pDz = (C72646PDz) prh;
                arrayList = AnonymousClass7TF.A0q(pDz, 0);
                for (OC4 oc4 : pDz.A01) {
                    C370538wd r2 = oc4.A01;
                    OC3 oc3 = oc4.A00;
                    if (!(oc3 == null || r2 == null || Collections.unmodifiableList(r2.A1c).isEmpty())) {
                        User A0g = DbS.A0g(Collections.unmodifiableList(r2.A1c), 0);
                        ImageUrl Bh3 = A0g.Bh3();
                        Boolean bool = r2.A0y;
                        ImageUrl imageUrl = null;
                        if (bool == null || !bool.equals(true)) {
                            A07 = AnonymousClass50n.A07(A0g);
                            str = "one_to_one";
                        } else {
                            A07 = r2.A1K;
                            if (Collections.unmodifiableList(r2.A1c).size() > 1) {
                                imageUrl = DbS.A0g(Collections.unmodifiableList(r2.A1c), 1).Bh3();
                            }
                            str = "group";
                        }
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        Iterator A0h = JTQ.A0h(r2.A1c);
                        while (A0h.hasNext()) {
                            User A0k = DbT.A0k(A0h);
                            Parcelable.Creator creator = PendingRecipient.CREATOR;
                            0qQ.A0A(A0k);
                            C66581MXm.A1M(A0k, A1C2);
                        }
                        OGD ogd = oc3.A00;
                        if (ogd != null) {
                            String str2 = ogd.A01;
                            String str3 = ogd.A02;
                            long j = ogd.A00;
                            String str4 = r2.A1D;
                            0qQ.A07(str4);
                            ImmutableList A00 = OXJ.A00(DbU.A0K(ogd.A04), DbX.A05(ogd.A02));
                            0qQ.A0A(A00);
                            directMessageSearchMessage = new DirectMessageSearchMessage(A00, DbU.A0K(A1C2), Bh3, imageUrl, str2, str3, A07, str4, str, j, 0, -1);
                        } else {
                            String str5 = r2.A1D;
                            0qQ.A07(str5);
                            String str6 = oc3.A01;
                            ImmutableList A0K = DbU.A0K(A1C2);
                            0qQ.A0B(A07, 3);
                            ? obj = new Object();
                            obj.A08 = str5;
                            obj.A06 = str6;
                            obj.A09 = A07;
                            obj.A0A = str;
                            obj.A07 = "open";
                            obj.A04 = Bh3;
                            obj.A05 = imageUrl;
                            obj.A03 = A0K;
                            obj.A02 = 0;
                            obj.A01 = 0;
                            obj.A00 = -1;
                            directMessageSearchMessage = obj;
                        }
                        arrayList.add(directMessageSearchMessage);
                    }
                }
            } else if (prh instanceof PE0) {
                PE0 pe0 = (PE0) prh;
                arrayList = AnonymousClass7TF.A0q(pe0, 1);
                for (C45281Ctk ctk : pe0.A01) {
                    1Xj r22 = ctk.A00;
                    if (r22 != null) {
                        0qQ.A0A(r22);
                        arrayList.add(new DirectSearchResharedContent(userSession, r22, C66580MXl.A12(ctk.A01)));
                    }
                }
            }
            A1C.addAll(arrayList);
        }
        return A1C;
    }
}
