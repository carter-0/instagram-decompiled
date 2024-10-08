package X;

import android.graphics.PointF;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lo0  reason: case insensitive filesystem */
public final class C65138Lo0 implements C66481MTj {
    public final /* synthetic */ FollowersShareFragment A00;

    public final void Dvr(User user, boolean z) {
        AnonymousClass3Q2 A002;
        AnonymousClass3Q2 BbQ;
        FollowersShareFragment followersShareFragment = this.A00;
        if (JTP.A1Z(followersShareFragment)) {
            List Co4 = FollowersShareFragment.A00(followersShareFragment).Co4();
            KO3 A02 = FollowersShareFragment.A02(followersShareFragment);
            A002 = A02.A03.BbQ(((MediaSession) Co4.get(0)).BbR());
        } else {
            A002 = LRK.A00(followersShareFragment);
        }
        if (A002 != null) {
            ArrayList arrayList = A002.A40;
            PeopleTag peopleTag = new PeopleTag(new PointF(), user);
            peopleTag.A09(user);
            if (z) {
                arrayList.add(0, peopleTag);
            } else {
                arrayList.add(peopleTag);
            }
            A002.A40 = arrayList;
            if (z) {
                AnonymousClass3Q2 A003 = LRK.A00(followersShareFragment);
                UserSession A0l = AnonymousClass7TE.A0l(followersShareFragment.A0f);
                C61822KNl kNl = followersShareFragment.A0C;
                if (kNl == null) {
                    JTO.A1M();
                    throw AnonymousClass00P.createAndThrow();
                }
                boolean A0F = LTZ.A0F(kNl.A0F, A0l, false);
                Collection collection = A003.A4L;
                if (collection == null) {
                    collection = AnonymousClass7TE.A1C();
                }
                ArrayList A1D = AnonymousClass7TE.A1D(collection);
                A1D.add(0, user.getId());
                String id = peopleTag.getId();
                0qQ.A07(id);
                if (JTP.A1Z(followersShareFragment)) {
                    Iterator A0w = JTP.A0w(FollowersShareFragment.A00(followersShareFragment));
                    while (A0w.hasNext()) {
                        String BbR = JTO.A0Z(A0w).BbR();
                        if (!(BbR == null || (BbQ = FollowersShareFragment.A02(followersShareFragment).A03.BbQ(BbR)) == null)) {
                            if (A0F) {
                                BbQ.A4L = A1D;
                            } else {
                                BbQ.A2d = id;
                            }
                        }
                    }
                }
                if (A0F) {
                    A003.A4L = A1D;
                } else {
                    A003.A2d = id;
                }
            }
            FollowersShareFragment.A02(followersShareFragment).A03.AIU();
        }
    }

    public C65138Lo0(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    public final void Dub(User user, boolean z) {
        AnonymousClass3Q2 BbQ;
        ArrayList arrayList;
        boolean z2;
        FollowersShareFragment followersShareFragment = this.A00;
        CallerContext callerContext = FollowersShareFragment.A10;
        PeopleTag peopleTag = new PeopleTag(new PointF(), user);
        Iterator A0w = JTP.A0w(FollowersShareFragment.A00(followersShareFragment));
        while (A0w.hasNext()) {
            String BbR = JTO.A0Z(A0w).BbR();
            if (!(BbR == null || (BbQ = FollowersShareFragment.A02(followersShareFragment).A03.BbQ(BbR)) == null)) {
                ArrayList arrayList2 = BbQ.A40;
                List list = BbQ.A4L;
                if (list != null) {
                    arrayList = AnonymousClass7TE.A1D(list);
                } else {
                    arrayList = null;
                }
                String str = BbQ.A2d;
                boolean A1A = 018.A1A(arrayList2, new MP4(peopleTag, 6));
                if (arrayList != null) {
                    z2 = arrayList.remove(peopleTag.getId());
                } else {
                    z2 = false;
                }
                if (A1A || z2) {
                    0qQ.A0B(arrayList2, 0);
                    BbQ.A40 = arrayList2;
                    if (z2) {
                        BbQ.A4L = arrayList;
                        if (FollowersShareFragment.A02(followersShareFragment).A05()) {
                            LRK.A00(followersShareFragment).A4L = arrayList;
                        }
                    }
                }
                if (DbV.A1Z(user, str)) {
                    BbQ.A2d = null;
                    if (FollowersShareFragment.A02(followersShareFragment).A05()) {
                        LRK.A00(followersShareFragment).A2d = null;
                    }
                }
            }
        }
        FollowersShareFragment.A02(followersShareFragment).A03.AIU();
    }
}
