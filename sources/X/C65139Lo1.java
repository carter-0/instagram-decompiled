package X;

import android.graphics.PointF;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.User;

/* renamed from: X.Lo1  reason: case insensitive filesystem */
public final class C65139Lo1 implements C66481MTj {
    public final /* synthetic */ 28D A00;
    public final /* synthetic */ K66 A01;

    public final void Dvr(User user, boolean z) {
        K66 k66 = this.A01;
        28D r6 = this.A00;
        PeopleTag peopleTag = new PeopleTag(new PointF(), user);
        AnonymousClass0eM r4 = k66.A0T;
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r4), 36314618502580964L)) {
            peopleTag.A09(user);
        }
        if (z) {
            K66.A05(k66).A01(peopleTag, true);
            boolean A0F = LTZ.A0F(r6, AnonymousClass7TE.A0l(r4), DbT.A0l(K66.A0R(k66)));
            C60264JiL A05 = K66.A05(k66);
            String id = user.getId();
            if (A0F) {
                A05.A02(id);
            } else {
                A05.A06.A0B(id);
            }
        } else {
            K66.A05(k66).A01(peopleTag, false);
        }
    }

    public C65139Lo1(28D r1, K66 k66) {
        this.A01 = k66;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r1 != true) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dub(com.instagram.user.model.User r6, boolean r7) {
        /*
            r5 = this;
            X.K66 r3 = r5.A01
            com.instagram.model.people.PeopleTag r2 = new com.instagram.model.people.PeopleTag
            r2.<init>((com.instagram.user.model.User) r6)
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r3)
            java.util.List r0 = r0.A0n
            r4 = 1
            if (r0 == 0) goto L_0x0017
            boolean r1 = X.JTQ.A1S(r2, r0)
            r0 = 1
            if (r1 == r4) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r1 = 0
            if (r0 == 0) goto L_0x002f
            X.JiL r4 = X.K66.A05(r3)
            java.lang.String r0 = r6.getId()
            r4.A03(r0)
            X.JiL r0 = X.K66.A05(r3)
            X.2Fj r0 = r0.A06
            r0.A0B(r1)
        L_0x002f:
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r3)
            java.util.List r0 = r0.A0q
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0059
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r3)
            java.lang.String r0 = r0.A0U
            boolean r0 = X.DbV.A1Z(r6, r0)
            if (r0 == 0) goto L_0x0052
            X.JiL r0 = X.K66.A05(r3)
            X.2Fj r0 = r0.A06
            r0.A0B(r1)
        L_0x0052:
            X.JiL r0 = X.K66.A05(r3)
            r0.A00(r2)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65139Lo1.Dub(com.instagram.user.model.User, boolean):void");
    }
}
