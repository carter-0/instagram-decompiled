package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;

/* renamed from: X.9Kd  reason: invalid class name and case insensitive filesystem */
public final class C376999Kd extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376999Kd(MediaCommentListRepository mediaCommentListRepository, C333897aK r3, String str, String str2, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A02 = 1;
        this.A04 = mediaCommentListRepository;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9Kd, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.9Kd, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        String str;
        Object obj2;
        String str2;
        Object obj3;
        int i;
        int i2 = this.A02;
        AnonymousClass4D7 r6 = r10;
        Object obj4 = this.A04;
        switch (i2) {
            case 0:
                obj3 = this.A03;
                str = this.A05;
                str2 = this.A06;
                obj2 = this.A01;
                i = 0;
                break;
            case 1:
                return new C376999Kd((MediaCommentListRepository) obj4, (C333897aK) this.A03, this.A06, this.A05, r10);
            case 2:
                str = this.A05;
                obj2 = this.A01;
                str2 = this.A06;
                obj3 = this.A03;
                i = 2;
                break;
            default:
                str2 = this.A06;
                str = this.A05;
                obj2 = this.A01;
                obj3 = this.A03;
                i = 3;
                break;
        }
        return new C376999Kd(obj4, obj3, obj2, str, str2, r6, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C376999Kd) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.9Kd, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02fc, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        X.0eS.A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r11.A00 = r0;
        r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r7, r11, new X.C41661AyD(r3, r6, r5, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        r3 = com.instagram.comments.mvvm.data.network.CommentTranslationFetcher.A00;
        r1 = ((com.instagram.comments.mvvm.data.MediaCommentListRepository) r11.A04).A0B;
        r11.A01 = null;
        r11.A00 = 3;
        r12 = r3.A00(r4, r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        if (r12 != r2) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
        r12 = (X.C239803Ii) r12;
        r6 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r11.A04;
        r5 = r11.A06;
        r4 = r11.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        if ((r12 instanceof X.C239793Ih) == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
        r1 = X.C333897aK.A04;
        r11.A00 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        if (com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r6, r11, new X.C41661AyD(r1, r5, r4, (java.lang.String) ((X.C239793Ih) r12).A00)) != r2) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f2, code lost:
        if ((r12 instanceof X.C297815sO) != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r12 = new X.C239793Ih(X.C60340gF.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0104, code lost:
        r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r11.A04;
        r6 = r11.A06;
        r5 = r11.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        if ((r12 instanceof X.C239793Ih) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0112, code lost:
        if ((r12 instanceof X.C297815sO) == false) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0114, code lost:
        r3 = X.C333897aK.A03;
        r1 = null;
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0192, code lost:
        if (r0 != r2) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0194, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01df, code lost:
        if (r0.ordinal() != 357) goto L_0x01e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A02
            switch(r0) {
                case 0: goto L_0x004a;
                case 1: goto L_0x005c;
                case 2: goto L_0x0198;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r11.A00
            r4 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r4) goto L_0x02ef
            X.0eS.A00(r12)
        L_0x0011:
            X.3Ii r12 = (X.C239803Ii) r12
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r11.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x0024
            X.3Ih r12 = (X.C239793Ih) r12
            java.lang.Object r0 = r12.A00
        L_0x0021:
            r1.invoke(r0)
        L_0x0024:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0027:
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 == 0) goto L_0x02e9
            java.lang.Object r1 = r11.A03
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x0024
            X.5sO r12 = (X.C297815sO) r12
            java.lang.Object r0 = r12.A00
            goto L_0x0021
        L_0x0036:
            X.0eS.A00(r12)
            java.lang.Object r3 = r11.A04
            X.5mt r3 = (X.C294705mt) r3
            java.lang.String r1 = r11.A06
            java.lang.String r0 = r11.A05
            r11.A00 = r4
            java.lang.Object r12 = r3.A06(r1, r0, r11)
            if (r12 != r2) goto L_0x0011
            return r2
        L_0x004a:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r11.A00
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0120
            if (r0 == r3) goto L_0x0063
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x005c:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0063;
                case 2: goto L_0x00ac;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00fa;
                default: goto L_0x0063;
            }
        L_0x0063:
            X.0eS.A00(r12)
            goto L_0x0024
        L_0x0067:
            X.0eS.A00(r12)
            java.lang.Object r7 = r11.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r7
            X.0Ud r0 = r7.A0L
            java.lang.Object r0 = r0.getValue()
            X.7aH r0 = (X.C333867aH) r0
            java.lang.String r6 = r11.A06
            java.lang.String r5 = r11.A05
            X.7dj r4 = X.C335067cK.A01(r0, r6, r5)
            if (r4 == 0) goto L_0x0024
            java.lang.Object r0 = r11.A03
            X.7aK r3 = X.C333897aK.SHOW_TRANSLATION
            if (r0 != r3) goto L_0x011a
            java.lang.String r1 = r4.A0O
            if (r1 == 0) goto L_0x0098
            r0 = 1
        L_0x008b:
            r11.A00 = r0
            X.AyD r0 = new X.AyD
            r0.<init>(r3, r6, r5, r1)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r7, r11, r0)
            goto L_0x0192
        L_0x0098:
            X.7aK r3 = X.C333897aK.LOADING
            r1 = 0
            r11.A01 = r4
            r0 = 2
            r11.A00 = r0
            X.AyD r0 = new X.AyD
            r0.<init>(r3, r6, r5, r1)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r7, r11, r0)
            if (r0 != r2) goto L_0x00b3
            return r2
        L_0x00ac:
            java.lang.Object r4 = r11.A01
            X.7dj r4 = (X.C335907dj) r4
            X.0eS.A00(r12)
        L_0x00b3:
            com.instagram.comments.mvvm.data.network.CommentTranslationFetcher r3 = com.instagram.comments.mvvm.data.network.CommentTranslationFetcher.A00
            java.lang.Object r0 = r11.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r0
            com.instagram.common.session.UserSession r1 = r0.A0B
            r0 = 0
            r11.A01 = r0
            r0 = 3
            r11.A00 = r0
            java.lang.Object r12 = r3.A00(r4, r1, r11)
            if (r12 != r2) goto L_0x00cb
            return r2
        L_0x00c8:
            X.0eS.A00(r12)
        L_0x00cb:
            X.3Ii r12 = (X.C239803Ii) r12
            java.lang.Object r6 = r11.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r6
            java.lang.String r5 = r11.A06
            java.lang.String r4 = r11.A05
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00f0
            X.3Ih r12 = (X.C239793Ih) r12
            java.lang.Object r3 = r12.A00
            java.lang.String r3 = (java.lang.String) r3
            X.7aK r1 = X.C333897aK.SHOW_TRANSLATION
            r0 = 4
            r11.A00 = r0
            X.AyD r0 = new X.AyD
            r0.<init>(r1, r5, r4, r3)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r6, r11, r0)
            if (r0 != r2) goto L_0x00fd
            return r2
        L_0x00f0:
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0104
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x00fa:
            X.0eS.A00(r12)
        L_0x00fd:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r12 = new X.3Ih
            r12.<init>(r0)
        L_0x0104:
            java.lang.Object r7 = r11.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r7
            java.lang.String r6 = r11.A06
            java.lang.String r5 = r11.A05
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0024
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 == 0) goto L_0x02f7
            X.7aK r3 = X.C333897aK.SHOW_ORIGINAL
            r1 = 0
            r0 = 5
            goto L_0x008b
        L_0x011a:
            X.7aK r3 = X.C333897aK.SHOW_ORIGINAL
            r1 = 0
            r0 = 6
            goto L_0x008b
        L_0x0120:
            X.0eS.A00(r12)
            java.lang.Object r4 = r11.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r4
            X.05G r0 = r4.A0H
            java.lang.Object r0 = r0.getValue()
            X.7aH r0 = (X.C333867aH) r0
            java.util.List r0 = r0.A06
            java.lang.String r10 = r11.A06
            java.util.Iterator r6 = r0.iterator()
        L_0x0137:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0151
            java.lang.Object r1 = r6.next()
            r0 = r1
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A01
            X.7dj r0 = (X.C335907dj) r0
            java.lang.String r0 = r0.A0K
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x0137
        L_0x0151:
            X.9IV r1 = (X.AnonymousClass9IV) r1
            if (r1 == 0) goto L_0x0024
            java.lang.Object r0 = r1.A00
            X.9Ib r0 = (X.C376459Ib) r0
            if (r0 == 0) goto L_0x0024
            java.lang.Object r6 = r0.A00
            X.7dk r6 = (X.C335917dk) r6
            if (r6 == 0) goto L_0x0024
            java.lang.Object r7 = r11.A03
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r0 = r7.intValue()
            if (r0 == r5) goto L_0x0195
            if (r0 != r3) goto L_0x02fd
            java.lang.String r1 = r6.A04
        L_0x016f:
            java.lang.String r0 = r11.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0024
            X.GmL r0 = r4.A04
            java.lang.String r9 = r0.A0E
            java.lang.Object r8 = r11.A01
            java.lang.Integer r8 = (java.lang.Integer) r8
            X.GnY r5 = new X.GnY
            r5.<init>((X.C335917dk) r6, (java.lang.Integer) r7, (java.lang.Integer) r8, (java.lang.String) r9, (java.lang.String) r10)
            r11.A00 = r3
            X.4HW r3 = r4.A07
            r1 = 0
            com.instagram.comments.mvvm.data.MediaCommentListRepository$fetchOrJoinChildCommentPage$2 r0 = new com.instagram.comments.mvvm.data.MediaCommentListRepository$fetchOrJoinChildCommentPage$2
            r0.<init>(r5, r4, r1)
            java.lang.Object r0 = r3.A00(r5, r11, r0)
        L_0x0192:
            if (r0 != r2) goto L_0x0024
            return r2
        L_0x0195:
            java.lang.String r1 = r6.A05
            goto L_0x016f
        L_0x0198:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r11.A00
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x01b0
            if (r0 == r3) goto L_0x01c6
            if (r0 != r5) goto L_0x0303
            X.0eS.A00(r12)
        L_0x01a7:
            java.lang.Object r0 = r11.A03
            X.B1M r0 = (X.B1M) r0
            r0.Dim()
            goto L_0x0024
        L_0x01b0:
            X.0eS.A00(r12)
            java.lang.Object r0 = r11.A04
            X.8cd r0 = (X.C359338cd) r0
            java.lang.String r1 = r11.A05
            r0.A00 = r1
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r0 = r0.A07
            r11.A00 = r3
            java.lang.Object r12 = r0.A03(r1, r11)
            if (r12 != r2) goto L_0x01c9
            return r2
        L_0x01c6:
            X.0eS.A00(r12)
        L_0x01c9:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x0024
            int r8 = r12.size()
            java.lang.Object r0 = r11.A01
            X.28D r0 = (X.28D) r0
            if (r0 == 0) goto L_0x01e1
            int r1 = r0.ordinal()
            r0 = 357(0x165, float:5.0E-43)
            r7 = 10
            if (r1 == r0) goto L_0x01e3
        L_0x01e1:
            r7 = 50
        L_0x01e3:
            java.lang.String r4 = r11.A06
            if (r4 == 0) goto L_0x0205
            r3 = 0
            java.util.Iterator r1 = r12.iterator()
        L_0x01ec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0207
            java.lang.Object r0 = r1.next()
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.A2n()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x0208
            int r3 = r3 + 1
            goto L_0x01ec
        L_0x0205:
            r1 = 0
            goto L_0x020d
        L_0x0207:
            r3 = -1
        L_0x0208:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r3)
        L_0x020d:
            r9 = 0
            if (r1 == 0) goto L_0x02d1
            r0 = -1
            int r6 = r1.intValue()
            if (r6 == r0) goto L_0x02d1
            if (r8 < r7) goto L_0x02d1
            int r4 = r8 + -1
            int r0 = r7 / 2
            int r3 = r6 - r0
            int r1 = r7 + -1
            int r0 = r1 / 2
            int r6 = r6 + r0
            if (r3 >= 0) goto L_0x02c9
            r4 = r1
        L_0x0227:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            int r0 = r4 + 1
        L_0x022d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.A04
            X.8cd r0 = (X.C359338cd) r0
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r4 = r0.A07
            java.lang.String r3 = r11.A05
            int r7 = r6.intValue()
            int r6 = r1.intValue()
            r11.A00 = r5
            android.util.LruCache r5 = r4.A00
            if (r5 == 0) goto L_0x01a7
            java.util.HashMap r8 = r4.A02
            java.lang.Object r0 = r8.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x02b8
            java.util.List r1 = r0.subList(r7, r6)
            if (r1 == 0) goto L_0x02b8
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0294
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0294
        L_0x0261:
            java.lang.Object r0 = r8.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01a7
            java.util.List r0 = r0.subList(r7, r6)
            if (r0 == 0) goto L_0x01a7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0278:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02db
            java.lang.Object r0 = r1.next()
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x030b
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0278
            r6.add(r0)
            goto L_0x0278
        L_0x0294:
            java.util.Iterator r1 = r1.iterator()
        L_0x0298:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0261
            java.lang.Object r0 = r1.next()
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x0313
            java.lang.Object r0 = r5.get(r0)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            boolean r0 = com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository.A02(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0298
        L_0x02b8:
            java.lang.Object r0 = r8.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01a7
            java.util.List r0 = r0.subList(r7, r6)
            java.lang.Object r0 = com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository.A00(r4, r3, r0, r11)
            goto L_0x02e6
        L_0x02c9:
            int r9 = r8 - r7
            if (r6 >= r8) goto L_0x0227
            r4 = r6
            r9 = r3
            goto L_0x0227
        L_0x02d1:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            int r0 = java.lang.Math.min(r7, r8)
            goto L_0x022d
        L_0x02db:
            java.util.HashMap r1 = r4.A03
            r1.put(r3, r6)
            X.0V2 r0 = r4.A04
            java.lang.Object r0 = r0.emit(r1, r11)
        L_0x02e6:
            if (r0 != r2) goto L_0x01a7
            return r2
        L_0x02e9:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x02ef:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x02f7:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x02fd:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0303:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x030b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0313:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376999Kd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376999Kd(Object obj, Object obj2, Object obj3, String str, String str2, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A02 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = obj3;
    }
}
