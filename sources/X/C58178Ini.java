package X;

/* renamed from: X.Ini  reason: case insensitive filesystem */
public final class C58178Ini extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58178Ini(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0390, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a1, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a8, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x000c;
                case 2: goto L_0x002e;
                case 3: goto L_0x0050;
                case 4: goto L_0x0144;
                case 5: goto L_0x014f;
                case 6: goto L_0x015a;
                case 7: goto L_0x0165;
                case 8: goto L_0x0170;
                case 9: goto L_0x017b;
                case 10: goto L_0x0072;
                case 11: goto L_0x0094;
                case 12: goto L_0x0186;
                case 13: goto L_0x00b6;
                case 14: goto L_0x00ce;
                case 15: goto L_0x0191;
                case 16: goto L_0x019c;
                case 17: goto L_0x01a7;
                case 18: goto L_0x00f0;
                case 19: goto L_0x01b1;
                case 20: goto L_0x0005;
                case 21: goto L_0x01b8;
                case 22: goto L_0x01ea;
                case 23: goto L_0x01ea;
                case 24: goto L_0x0224;
                case 25: goto L_0x01b1;
                case 26: goto L_0x0005;
                case 27: goto L_0x0254;
                case 28: goto L_0x025d;
                case 29: goto L_0x0268;
                case 30: goto L_0x0273;
                case 31: goto L_0x027c;
                case 32: goto L_0x02a2;
                case 33: goto L_0x02ac;
                case 34: goto L_0x00f0;
                case 35: goto L_0x01b1;
                case 36: goto L_0x0005;
                case 37: goto L_0x0391;
                case 38: goto L_0x00f0;
                case 39: goto L_0x00f0;
                case 40: goto L_0x02b6;
                case 41: goto L_0x030f;
                case 42: goto L_0x0319;
                case 43: goto L_0x0328;
                case 44: goto L_0x0331;
                case 45: goto L_0x037b;
                case 46: goto L_0x03af;
                case 47: goto L_0x03af;
                case 48: goto L_0x03bc;
                case 49: goto L_0x03c8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.07f r2 = X.DbY.A0I(r0)
        L_0x000b:
            return r2
        L_0x000c:
            java.lang.Object r0 = r13.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03d5
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x001a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.TopicIntf r0 = (com.instagram.api.schemas.TopicIntf) r0
            com.facebook.pando.TreeUpdaterJNI r0 = r0.FHC()
            r2.add(r0)
            goto L_0x001a
        L_0x002e:
            java.lang.Object r0 = r13.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03d5
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            X.DTQ r0 = (X.DTQ) r0
            com.facebook.pando.TreeUpdaterJNI r0 = r0.FHC()
            r2.add(r0)
            goto L_0x003c
        L_0x0050:
            java.lang.Object r0 = r13.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03d5
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x005e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            X.4sR r0 = (X.C276074sR) r0
            com.facebook.pando.TreeUpdaterJNI r0 = r0.FHC()
            r2.add(r0)
            goto L_0x005e
        L_0x0072:
            java.lang.Object r0 = r13.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03d5
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0080:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            X.DTV r0 = (X.DTV) r0
            com.facebook.pando.TreeUpdaterJNI r0 = r0.FHC()
            r2.add(r0)
            goto L_0x0080
        L_0x0094:
            java.lang.Object r0 = r13.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03d5
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00a2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.instagram.model.mediasize.VideoVersionIntf r0 = (com.instagram.model.mediasize.VideoVersionIntf) r0
            com.facebook.pando.TreeUpdaterJNI r0 = r0.FHC()
            r2.add(r0)
            goto L_0x00a2
        L_0x00b6:
            java.lang.Object r0 = r13.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03d5
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00c4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            X.C41846B3n.A1T(r2, r1)
            goto L_0x00c4
        L_0x00ce:
            java.lang.Object r0 = r13.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03d5
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00dc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            X.YBd r0 = (X.C22563YBd) r0
            com.facebook.pando.TreeUpdaterJNI r0 = r0.FHC()
            r2.add(r0)
            goto L_0x00dc
        L_0x00f0:
            java.lang.Object r2 = r13.A01
            return r2
        L_0x00f3:
            java.lang.Object r2 = r13.A01
            X.DHM r2 = (X.DHM) r2
            java.util.List r0 = r2.Alu()
            if (r0 == 0) goto L_0x0119
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0105:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x011a
            X.1Xj r0 = X.C51966G9m.A0t(r1)
            X.1Xy r0 = r0.A0C
            X.3ZG r0 = r0.Ezy()
            r10.add(r0)
            goto L_0x0105
        L_0x0119:
            r10 = 0
        L_0x011a:
            X.1sQ r4 = r2.getClipsMetadata()
            java.util.List r11 = r2.getCoauthorProducers()
            java.lang.String r6 = r2.getConnectionId()
            java.lang.String r7 = r2.getId()
            X.3lZ r5 = r2.getInjected()
            java.lang.String r8 = r2.getLoggingInfoToken()
            java.lang.String r9 = r2.getMezqlToken()
            X.1dn r3 = r2.getMusicMetadata()
            java.util.List r12 = r2.getSponsorTags()
            X.3ZF r2 = new X.3ZF
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        L_0x0144:
            java.lang.Object r0 = r13.A01
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            if (r0 == 0) goto L_0x03d5
            com.facebook.pando.TreeUpdaterJNI r2 = r0.FHC()
            return r2
        L_0x014f:
            java.lang.Object r0 = r13.A01
            X.DUQ r0 = (X.DUQ) r0
            if (r0 == 0) goto L_0x03d5
            com.facebook.pando.TreeUpdaterJNI r2 = r0.FHC()
            return r2
        L_0x015a:
            java.lang.Object r0 = r13.A01
            X.3yJ r0 = (X.C258003yJ) r0
            if (r0 == 0) goto L_0x03d5
            com.facebook.pando.TreeUpdaterJNI r2 = r0.FHC()
            return r2
        L_0x0165:
            java.lang.Object r0 = r13.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x03d5
            com.facebook.pando.TreeUpdaterJNI r2 = r0.A08()
            return r2
        L_0x0170:
            java.lang.Object r0 = r13.A01
            X.3vN r0 = (X.C256193vN) r0
            if (r0 == 0) goto L_0x03d5
            com.facebook.pando.TreeUpdaterJNI r2 = r0.FHC()
            return r2
        L_0x017b:
            java.lang.Object r0 = r13.A01
            X.DT3 r0 = (X.DT3) r0
            if (r0 == 0) goto L_0x03d5
            com.facebook.pando.TreeUpdaterJNI r2 = r0.FHC()
            return r2
        L_0x0186:
            java.lang.Object r0 = r13.A01
            X.DT4 r0 = (X.DT4) r0
            if (r0 == 0) goto L_0x03d5
            com.facebook.pando.TreeUpdaterJNI r2 = r0.FHC()
            return r2
        L_0x0191:
            java.lang.Object r0 = r13.A01
            X.DTW r0 = (X.DTW) r0
            if (r0 == 0) goto L_0x03d5
            com.facebook.pando.TreeUpdaterJNI r2 = r0.FHC()
            return r2
        L_0x019c:
            java.lang.Object r0 = r13.A01
            X.JSO r0 = (X.JSO) r0
            if (r0 == 0) goto L_0x03d5
            com.facebook.pando.TreeUpdaterJNI r2 = r0.FHC()
            return r2
        L_0x01a7:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.ENZ r2 = new X.ENZ
            r2.<init>(r0)
            return r2
        L_0x01b1:
            java.lang.Object r0 = r13.A01
            java.lang.Object r2 = X.DbT.A0r(r0)
            return r2
        L_0x01b8:
            java.lang.Object r2 = r13.A01
            X.H1w r2 = (X.C54176H1w) r2
            X.0eM r0 = r2.A0C
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "parent_media_id"
            java.lang.String r3 = r1.getString(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "initial_media_id_list"
            java.util.ArrayList r0 = r1.getStringArrayList(r0)
            if (r0 != 0) goto L_0x01da
            X.0sn r0 = X.0sn.A00
        L_0x01da:
            android.os.Bundle r2 = r2.requireArguments()
            java.lang.String r1 = "next_max_id"
            java.lang.String r1 = r2.getString(r1)
            X.H6Y r2 = new X.H6Y
            r2.<init>(r4, r3, r1, r0)
            return r2
        L_0x01ea:
            java.lang.Object r1 = r13.A01
            X.H19 r1 = (X.H19) r1
            androidx.fragment.app.FragmentActivity r5 = r1.getActivity()
            if (r5 == 0) goto L_0x038e
            com.instagram.user.model.User r0 = r1.A00
            if (r0 == 0) goto L_0x038e
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r0)
            if (r3 == 0) goto L_0x038e
            X.0eM r4 = r1.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r1 = "open_carousel_review_page_header"
            r0 = 3698(0xe72, float:5.182E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Dfc r3 = X.C46548Dgp.A01(r2, r3, r0, r1)
            X.6Yo r2 = X.DbX.A0N(r5, r4)
            r2.A08()
            X.1a1 r1 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.C46474Dfc.A03(r2, r0, r1, r3)
            goto L_0x038e
        L_0x0224:
            java.lang.Object r2 = r13.A01
            X.H19 r2 = (X.H19) r2
            X.0eM r0 = r2.A02
            X.GhV r0 = X.G9w.A0Z(r0)
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x038e
            androidx.fragment.app.FragmentActivity r3 = r2.getActivity()
            if (r3 == 0) goto L_0x038e
            X.0eM r0 = r2.A01
            X.0lg r2 = X.DbT.A0X(r0)
            X.F3W r1 = X.C51971G9r.A0k(r1)
            java.lang.String r0 = "open_carousel_review_page_header"
            r1.A0E = r0
            r0 = 1
            r1.A0N = r0
            android.os.Bundle r1 = r1.A00()
            java.lang.String r0 = "single_media_feed"
            X.DbY.A0u(r3, r1, r2, r0)
            goto L_0x038e
        L_0x0254:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r2 = r0.requireParentFragment()
            return r2
        L_0x025d:
            java.lang.Object r0 = r13.A01
            X.GTG r0 = (X.GTG) r0
            int r0 = r0.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0268:
            java.lang.Object r0 = r13.A01
            X.GTG r0 = (X.GTG) r0
            int r0 = r0.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0273:
            java.lang.Object r0 = r13.A01
            boolean r0 = r0 instanceof X.AnonymousClass3OA
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x027c:
            java.lang.Object r3 = r13.A01
            X.Jw9 r3 = (X.C61071Jw9) r3
            boolean r2 = r3.A02
            X.3Ds r0 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            X.HqF r1 = new X.HqF
            if (r2 == 0) goto L_0x029e
            r1.<init>(r0)
            java.lang.Object r0 = r3.A00
            X.GTI r0 = (X.GTI) r0
            java.lang.Object r0 = r0.A02
            java.lang.Object r0 = X.DbT.A0r(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1.A01 = r0
        L_0x0299:
            X.3Dt r2 = r1.A00()
            return r2
        L_0x029e:
            r1.<init>(r0)
            goto L_0x0299
        L_0x02a2:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5F1 r2 = new X.5F1
            r2.<init>(r0)
            return r2
        L_0x02ac:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5F2 r2 = new X.5F2
            r2.<init>(r0)
            return r2
        L_0x02b6:
            java.lang.Object r3 = r13.A01
            com.instagram.feed.tifu.TifuViewModel r3 = (com.instagram.feed.tifu.TifuViewModel) r3
            X.322 r1 = r3.A05
            X.4oe r4 = r3.A09
            X.5O4 r0 = r3.A0A
            r1.D2g(r4, r0)
            X.0Ud r1 = r3.A0G
            java.lang.Object r0 = r1.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            X.62P r2 = r0.A06
            java.lang.Object r0 = r1.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            int r1 = r0.A00
            java.lang.Object r0 = X.00k.A0O(r2, r1)
            X.9J3 r0 = (X.AnonymousClass9J3) r0
            r6 = 0
            if (r0 == 0) goto L_0x030d
            java.lang.Object r0 = r0.A00
            X.1Xj r0 = (X.1Xj) r0
        L_0x02e2:
            X.5v9 r5 = r3.A06
            java.lang.String r7 = X.C51969G9p.A0u(r0)
            java.lang.String r8 = r4.A06
            if (r0 == 0) goto L_0x030b
            java.lang.String r9 = X.DbT.A0x(r0)
        L_0x02f0:
            java.lang.String r10 = r4.A07
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x02fc
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L_0x02fc:
            int r12 = r2.size()
            java.lang.Integer r0 = r3.A0E
            java.lang.String r11 = X.C292845jc.A00(r0)
            r5.Cl3(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x038e
        L_0x030b:
            r9 = r6
            goto L_0x02f0
        L_0x030d:
            r0 = r6
            goto L_0x02e2
        L_0x030f:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.feed.tifu.api.TifuApiHelper r2 = new com.instagram.feed.tifu.api.TifuApiHelper
            r2.<init>(r0)
            return r2
        L_0x0319:
            java.lang.Object r0 = r13.A01
            X.GZn r0 = (X.C52614GZn) r0
            X.GZF r0 = r0.A00
            int r0 = r0.A03()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0328:
            java.lang.Object r0 = r13.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            X.62P r2 = X.AnonymousClass62Q.A00(r0)
            return r2
        L_0x0331:
            java.lang.Object r2 = r13.A01
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            X.6Gl r0 = r2.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            java.util.List r0 = r0.A0D
            java.util.Iterator r1 = r0.iterator()
        L_0x0341:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0379
            java.lang.Object r3 = r1.next()
            r0 = r3
            X.6JM r0 = (X.AnonymousClass6JM) r0
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A02
            if (r0 < 0) goto L_0x0341
        L_0x0354:
            X.6JM r3 = (X.AnonymousClass6JM) r3
            r0 = -1
            if (r3 == 0) goto L_0x0374
            X.6Gl r1 = r2.A02()
            X.6Gk r1 = (X.C305076Gk) r1
            int r2 = r1.A07
            X.6JK r3 = (X.AnonymousClass6JK) r3
            int r1 = r3.A02
            int r2 = r2 - r1
            float r2 = (float) r2
            int r1 = r3.A09
            float r1 = (float) r1
            float r2 = r2 / r1
            r1 = 1065185444(0x3f7d70a4, float:0.99)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0374
            int r0 = r3.A07
        L_0x0374:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0379:
            r3 = 0
            goto L_0x0354
        L_0x037b:
            java.lang.Object r0 = r13.A01
            X.4Jv r0 = (X.C263234Jv) r0
            X.3fJ r3 = r0.A03
            X.1Xj r2 = r0.A00
            java.lang.String r1 = "thumbnailMedia"
            if (r2 == 0) goto L_0x03a1
            X.3W1 r1 = r0.A05
            X.4DU r0 = r0.A02
            r3.DN5(r0, r2, r2, r1)
        L_0x038e:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0391:
            java.lang.Object r2 = r13.A01
            X.H09 r2 = (X.H09) r2
            X.0eM r0 = r2.A0E
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r2.A0A
            if (r0 != 0) goto L_0x03a9
            java.lang.String r1 = "userId"
        L_0x03a1:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03a9:
            X.H66 r2 = new X.H66
            r2.<init>(r1, r0)
            return r2
        L_0x03af:
            java.lang.Object r0 = r13.A01
            X.33e r0 = (X.C2362933e) r0
            X.33d r0 = r0.A04
            X.0eM r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x03bc:
            java.lang.Object r0 = r13.A01
            X.HoG r0 = (X.C55833HoG) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.3fS r2 = new X.3fS
            r2.<init>(r0)
            return r2
        L_0x03c8:
            X.3Ds r2 = X.C238863Ds.SUBTITLE
            java.lang.Object r1 = r13.A01
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            boolean r0 = r1.A3e
            X.3Dt r2 = X.C55009Hag.A00(r2, r1, r0)
            return r2
        L_0x03d5:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58178Ini.invoke():java.lang.Object");
    }
}
