package X;

/* renamed from: X.9Ku  reason: invalid class name and case insensitive filesystem */
public final class C377169Ku extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377169Ku(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v126, types: [X.A4W, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x043d, code lost:
        r2.A0O(r2.A02, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        return r0.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0415;
                case 1: goto L_0x03cc;
                case 2: goto L_0x03aa;
                case 3: goto L_0x0395;
                case 4: goto L_0x0385;
                case 5: goto L_0x037b;
                case 6: goto L_0x036d;
                case 7: goto L_0x0433;
                case 8: goto L_0x0365;
                case 9: goto L_0x035d;
                case 10: goto L_0x0355;
                case 11: goto L_0x034d;
                case 12: goto L_0x005f;
                case 13: goto L_0x0335;
                case 14: goto L_0x0312;
                case 15: goto L_0x02e1;
                case 16: goto L_0x02d7;
                case 17: goto L_0x02c9;
                case 18: goto L_0x02bb;
                case 19: goto L_0x02ad;
                case 20: goto L_0x002a;
                case 21: goto L_0x029d;
                case 22: goto L_0x028f;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x0281;
                case 26: goto L_0x0023;
                case 27: goto L_0x026a;
                case 28: goto L_0x0256;
                case 29: goto L_0x023f;
                case 30: goto L_0x0214;
                case 31: goto L_0x0208;
                case 32: goto L_0x01fa;
                case 33: goto L_0x01ee;
                case 34: goto L_0x01e2;
                case 35: goto L_0x01d6;
                case 36: goto L_0x0010;
                case 37: goto L_0x01ca;
                case 38: goto L_0x01bc;
                case 39: goto L_0x01b2;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0197;
                case 42: goto L_0x0172;
                case 43: goto L_0x0167;
                case 44: goto L_0x014c;
                case 45: goto L_0x0136;
                case 46: goto L_0x012c;
                case 47: goto L_0x011b;
                case 48: goto L_0x0107;
                case 49: goto L_0x00fd;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.6gr r0 = (X.C313696gr) r0
            X.0eM r0 = r0.A05
        L_0x000b:
            java.lang.Object r7 = r0.getValue()
        L_0x000f:
            return r7
        L_0x0010:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            r7 = 0
            boolean r0 = X.C362988ir.A01(r7, r0)
            if (r0 == 0) goto L_0x000f
            X.C362988ir.A00()
            X.LR1 r7 = X.LR1.A05
            return r7
        L_0x0023:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            X.0eM r0 = r0.A05
            goto L_0x000b
        L_0x002a:
            java.lang.Object r2 = r15.A01
            X.6gm r2 = (X.C313646gm) r2
            X.6go r0 = r2.A02
            int r1 = r0.ordinal()
            r0 = 0
            r7 = 0
            if (r1 == r0) goto L_0x0054
            r0 = 2
            if (r1 == r0) goto L_0x0049
            r0 = 1
            if (r1 != r0) goto L_0x0445
            boolean r0 = r2 instanceof X.C313696gr
            if (r0 == 0) goto L_0x000f
            X.6gr r2 = (X.C313696gr) r2
            if (r2 == 0) goto L_0x000f
            X.0eM r0 = r2.A05
            goto L_0x000b
        L_0x0049:
            boolean r0 = r2 instanceof X.C62177KbZ
            if (r0 == 0) goto L_0x000f
            X.KbZ r2 = (X.C62177KbZ) r2
            if (r2 == 0) goto L_0x000f
            X.M0W r7 = r2.A01
            return r7
        L_0x0054:
            boolean r0 = r2 instanceof X.C62176KbY
            if (r0 == 0) goto L_0x000f
            X.KbY r2 = (X.C62176KbY) r2
            if (r2 == 0) goto L_0x000f
            X.M0X r7 = r2.A00
            return r7
        L_0x005f:
            java.lang.Object r0 = r15.A01
            X.4zU r0 = (X.C279824zU) r0
            X.0eM r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            X.0xa r2 = (X.0xa) r2
            java.lang.String r1 = "key"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r2 == 0) goto L_0x00fa
            r1 = 0
            java.lang.String r0 = ";"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.00l.A0R(r2, r0, r1)
        L_0x0084:
            java.util.Iterator r6 = r0.iterator()
        L_0x0088:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            r5 = 1
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r3 = X.00l.A0R(r1, r0, r4)
            int r1 = r3.size()
            r0 = 3
            if (r1 != r0) goto L_0x0088
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0088
            int r2 = r0.intValue()
            java.lang.Object r0 = r3.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            X.0qQ.A0B(r0, r4)
            r1 = 10
            java.lang.Long r0 = X.00y.A0n(r1, r0)
            if (r0 == 0) goto L_0x0088
            long r10 = r0.longValue()
            r0 = 2
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.0qQ.A0B(r0, r4)
            java.lang.Long r0 = X.00y.A0n(r1, r0)
            if (r0 == 0) goto L_0x0088
            long r12 = r0.longValue()
            X.1CS[] r0 = X.1CS.values()
            java.lang.Object r9 = X.03t.A06(r0, r2)
            X.1CS r9 = (X.1CS) r9
            if (r9 != 0) goto L_0x00f1
            X.1CS r9 = X.1CS.A07
        L_0x00f1:
            X.4zV r8 = new X.4zV
            r8.<init>(r9, r10, r12)
            r7.add(r8)
            goto L_0x0088
        L_0x00fa:
            X.0sn r0 = X.0sn.A00
            goto L_0x0084
        L_0x00fd:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6EU r7 = new X.6EU
            r7.<init>(r0)
            return r7
        L_0x0107:
            java.lang.Object r0 = r15.A01
            X.7Ql r0 = (X.C331327Ql) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0115
            X.T8U r7 = new X.T8U
            r7.<init>()
            return r7
        L_0x0115:
            X.T8T r7 = new X.T8T
            r7.<init>()
            return r7
        L_0x011b:
            java.lang.Object r1 = r15.A01
            android.content.Context r1 = (android.content.Context) r1
            boolean r0 = r1 instanceof X.C62030qu
            if (r0 == 0) goto L_0x012a
            X.0qu r1 = (X.C62030qu) r1
            X.0qt r7 = r1.BkL()
            return r7
        L_0x012a:
            r7 = 0
            return r7
        L_0x012c:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.37U r7 = new X.37U
            r7.<init>(r0)
            return r7
        L_0x0136:
            java.lang.Object r2 = r15.A01
            X.0lg r2 = (X.0lg) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 13
            X.G2c r1 = new X.G2c
            r1.<init>(r2, r0)
            java.lang.Class<X.2oP> r0 = X.C229832oP.class
            java.lang.Object r7 = r2.A01(r0, r1)
            return r7
        L_0x014c:
            java.lang.Object r3 = r15.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36592996814750580(0x82012300690374, double:3.204896761594897E-306)
            long r2 = X.182.A01(r2, r3, r0)
            int r1 = (int) r2
            X.0nU r0 = new X.0nU
            r0.<init>()
            X.1qX r7 = new X.1qX
            r7.<init>(r0, r1)
            return r7
        L_0x0167:
            java.lang.Object r1 = r15.A01
            X.4X7 r1 = (X.AnonymousClass4X7) r1
            com.instagram.ui.widget.textureview.ScalingTextureView r0 = r1.A02
            r0.A02(r1)
            goto L_0x0442
        L_0x0172:
            java.lang.Object r4 = r15.A01
            X.4Yt r4 = (X.C266404Yt) r4
            com.instagram.common.session.UserSession r3 = r4.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316246295842990(0x81056f000a10ae, double:3.0298786190528444E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x018c
            X.A4W r0 = new X.A4W
            r0.<init>()
            r4.A00 = r0
        L_0x018c:
            android.view.SurfaceView r0 = r4.A02
            android.view.SurfaceHolder r0 = r0.getHolder()
            r0.addCallback(r4)
            goto L_0x0442
        L_0x0197:
            java.util.Set r0 = X.AnonymousClass4O4.A0I
            android.content.Context r1 = X.C60960kU.A00
            X.0qQ.A07(r1)
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.4O4 r7 = new X.4O4
            r7.<init>(r1, r0)
            return r7
        L_0x01a8:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2ew r7 = new X.2ew
            r7.<init>(r0)
            return r7
        L_0x01b2:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r7 = new com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository
            r7.<init>(r0)
            return r7
        L_0x01bc:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.C278264wZ.A05(r0)
            X.LDa r7 = new X.LDa
            r7.<init>(r0)
            return r7
        L_0x01ca:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.L8Y r7 = new X.L8Y
            r7.<init>(r0)
            return r7
        L_0x01d6:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveShareRepository r7 = new com.instagram.video.live.mvvm.model.repository.IgLiveShareRepository
            r7.<init>(r0)
            return r7
        L_0x01e2:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r7 = new com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository
            r7.<init>(r0)
            return r7
        L_0x01ee:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository r7 = new com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository
            r7.<init>(r0)
            return r7
        L_0x01fa:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.String r0 = r1.A06
            X.6hI r7 = new X.6hI
            r7.<init>(r1, r0)
            return r7
        L_0x0208:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r7 = new com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository
            r7.<init>(r0)
            return r7
        L_0x0214:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            X.6go r9 = r0.A02
            com.instagram.common.session.UserSession r8 = r0.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342161059395540788(0x2081071300061734, double:4.063932599841931E-152)
            boolean r14 = X.182.A06(r2, r8, r0)
            r0 = 36599525158424141(0x82071300040e4d, double:3.209025312421587E-306)
            long r10 = X.182.A01(r2, r8, r0)
            r0 = 36604142248072212(0x820b4600011414, double:3.211945178506555E-306)
            long r12 = X.182.A01(r2, r8, r0)
            X.LES r7 = new X.LES
            r7.<init>(r8, r9, r10, r12, r14)
            return r7
        L_0x023f:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            X.6h4 r2 = r0.A03
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r1 = r0.A01()
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi r0 = new com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi
            r0.<init>(r3)
            com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r7 = new com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository
            r7.<init>(r3, r0, r1, r2)
            return r7
        L_0x0256:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            X.6go r2 = r0.A02
            X.6h4 r1 = r0.A03
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r0.A01()
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r7 = new com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager
            r7.<init>(r3, r2, r0, r1)
            return r7
        L_0x026a:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r2 = r0.A01()
            X.6go r1 = r0.A02
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r0 = new com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi
            r0.<init>(r3)
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7 = new com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository
            r7.<init>(r3, r0, r1, r2)
            return r7
        L_0x0281:
            java.lang.Object r0 = r15.A01
            X.6gz r0 = (X.C313776gz) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.6go r0 = r0.A02
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r7 = new com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager
            r7.<init>(r1, r0)
            return r7
        L_0x028f:
            java.lang.Object r0 = r15.A01
            X.6gm r0 = (X.C313646gm) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.LM9 r7 = new X.LM9
            r7.<init>(r0, r1)
            return r7
        L_0x029d:
            java.lang.Object r0 = r15.A01
            X.6gm r0 = (X.C313646gm) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            X.0iw r1 = r0.A00
            X.6go r0 = r0.A02
            X.L7J r7 = new X.L7J
            r7.<init>(r1, r2, r0)
            return r7
        L_0x02ad:
            java.lang.Object r0 = r15.A01
            X.6gm r0 = (X.C313646gm) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.LF6 r7 = new X.LF6
            r7.<init>(r0, r1)
            return r7
        L_0x02bb:
            java.lang.Object r0 = r15.A01
            X.6gm r0 = (X.C313646gm) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.L5M r7 = new X.L5M
            r7.<init>(r0, r1)
            return r7
        L_0x02c9:
            java.lang.Object r0 = r15.A01
            X.6gm r0 = (X.C313646gm) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.L7I r7 = new X.L7I
            r7.<init>(r0, r1)
            return r7
        L_0x02d7:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3OF r7 = new X.3OF
            r7.<init>(r0)
            return r7
        L_0x02e1:
            java.lang.Object r0 = r15.A01
            X.1Qt r0 = (X.1Qt) r0
            X.1QU r0 = r0.A00
            java.lang.String r1 = r0.A0D
            X.0qQ.A06(r1)
            java.lang.String r0 = "IgApi:"
            java.lang.String r2 = X.00l.A0F(r0, r1)
            X.11S r1 = X.1Qt.A04
            java.lang.String r0 = "/"
            java.lang.String r2 = r1.A00(r2, r0)
            java.lang.String r0 = "/+"
            X.11S r1 = new X.11S
            r1.<init>(r0)
            java.lang.String r0 = "_"
            java.lang.String r1 = r1.A00(r2, r0)
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {95, 32} // fill-array
            java.lang.String r7 = X.00l.A0M(r1, r0)
            return r7
        L_0x0312:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "network/"
            r1.append(r0)
            java.lang.Object r0 = r15.A01
            X.1Qt r0 = (X.1Qt) r0
            X.1QU r0 = r0.A00
            X.1CE r0 = r0.A09
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r7 = r1.toLowerCase(r0)
            X.0qQ.A07(r7)
            return r7
        L_0x0335:
            java.lang.Object r0 = r15.A01
            X.4zU r0 = (X.C279824zU) r0
            android.content.Context r2 = r0.A01
            java.lang.String r1 = "historical_app_start_v2"
            r0 = 0
            android.content.SharedPreferences r1 = r2.getSharedPreferences(r1, r0)
            X.0qQ.A0A(r1)
            java.lang.String r0 = "HistoricalAppStartManagerImpl"
            X.0tX r7 = new X.0tX
            r7.<init>(r1, r0)
            return r7
        L_0x034d:
            java.lang.Object r2 = r15.A01
            X.18g r2 = (X.18g) r2
            java.lang.String r1 = "STORIES_REQUEST_END"
            goto L_0x043d
        L_0x0355:
            java.lang.Object r2 = r15.A01
            X.18g r2 = (X.18g) r2
            java.lang.String r1 = "STORIES_REQUEST_START"
            goto L_0x043d
        L_0x035d:
            java.lang.Object r2 = r15.A01
            X.18g r2 = (X.18g) r2
            java.lang.String r1 = "FEED_REQUEST_SUCCEEDED"
            goto L_0x043d
        L_0x0365:
            java.lang.Object r2 = r15.A01
            X.18g r2 = (X.18g) r2
            java.lang.String r1 = "FEED_REQUEST_END"
            goto L_0x043d
        L_0x036d:
            java.lang.Object r0 = r15.A01
            X.18g r0 = (X.18g) r0
            X.1Gq r0 = r0.A0C()
            X.1Gs r7 = new X.1Gs
            r7.<init>(r0)
            return r7
        L_0x037b:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1KS r7 = new X.1KS
            r7.<init>(r0)
            return r7
        L_0x0385:
            java.lang.Object r0 = r15.A01
            X.1Cj r0 = (X.1Cj) r0
            com.instagram.common.session.UserSession r0 = r0.A06
            X.0ug r0 = X.0tq.A00(r0)
            X.0to r7 = new X.0to
            r7.<init>(r0)
            return r7
        L_0x0395:
            java.lang.Object r2 = r15.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.0wX r0 = r2.A03
            android.content.Context r1 = r0.A06()
            X.1Ck r0 = new X.1Ck
            r0.<init>(r1, r2)
            X.1Cj r7 = new X.1Cj
            r7.<init>(r2, r0)
            return r7
        L_0x03aa:
            java.lang.Object r0 = r15.A01
            X.3Id r0 = (X.C239783Id) r0
            java.util.List r0 = r0.BG8()
            if (r0 == 0) goto L_0x0442
            java.util.Iterator r2 = r0.iterator()
        L_0x03b8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0442
            java.lang.Object r1 = r2.next()
            com.instagram.model.mediasize.ExtendedImageUrl r1 = (com.instagram.model.mediasize.ExtendedImageUrl) r1
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A02 = r0
            goto L_0x03b8
        L_0x03cc:
            java.lang.Object r0 = r15.A01
            X.3Id r0 = (X.C239783Id) r0
            java.util.List r0 = r0.BPh()
            if (r0 == 0) goto L_0x0442
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x03df:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03f7
            java.lang.Object r0 = r1.next()
            X.DSg r0 = (X.C46251DSg) r0
            java.util.List r0 = r0.Bni()
            if (r0 != 0) goto L_0x03f3
            X.0sn r0 = X.0sn.A00
        L_0x03f3:
            X.018.A16(r0, r2)
            goto L_0x03df
        L_0x03f7:
            java.util.Iterator r2 = r2.iterator()
        L_0x03fb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0442
            java.lang.Object r0 = r2.next()
            X.DTI r0 = (X.DTI) r0
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r0.BFv()
            if (r1 == 0) goto L_0x03fb
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A02 = r0
            goto L_0x03fb
        L_0x0415:
            r0 = 9000(0x2328, double:4.4466E-320)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x041a, all -> 0x0426 }
        L_0x041a:
            java.lang.Object r0 = r15.A01
            com.instagram.util.startup.appwarmer.KeepWarmAgainReceiver r0 = (com.instagram.util.startup.appwarmer.KeepWarmAgainReceiver) r0
            android.content.BroadcastReceiver$PendingResult r0 = r0.A00     // Catch:{ IllegalStateException -> 0x0442 }
            if (r0 == 0) goto L_0x0442
            r0.finish()     // Catch:{ IllegalStateException -> 0x0442 }
            goto L_0x0442
        L_0x0426:
            r1 = move-exception
            java.lang.Object r0 = r15.A01
            com.instagram.util.startup.appwarmer.KeepWarmAgainReceiver r0 = (com.instagram.util.startup.appwarmer.KeepWarmAgainReceiver) r0
            android.content.BroadcastReceiver$PendingResult r0 = r0.A00     // Catch:{ IllegalStateException -> 0x0432 }
            if (r0 == 0) goto L_0x0432
            r0.finish()     // Catch:{ IllegalStateException -> 0x0432 }
        L_0x0432:
            throw r1
        L_0x0433:
            java.lang.Object r2 = r15.A01
            X.18g r2 = (X.18g) r2
            r0 = 2266(0x8da, float:3.175E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
        L_0x043d:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
        L_0x0442:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0445:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377169Ku.invoke():java.lang.Object");
    }
}
