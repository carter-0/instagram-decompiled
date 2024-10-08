package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import java.util.List;

/* renamed from: X.PqS  reason: case insensitive filesystem */
public final class C74186PqS extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74186PqS(int i, List list, 0sP r4) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 26:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 32:
            case 35:
            case 45:
            case 46:
                this.A01 = r4;
                this.A02 = list;
                break;
            default:
                this.A02 = r4;
                this.A01 = list;
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: com.facebook.rsys.crypto.gen.CryptoContextHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: X.HNJ} */
    /* JADX WARNING: type inference failed for: r2v5, types: [com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.content.Context, X.0iw, java.lang.Object, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03f4, code lost:
        if (r3.A06() != false) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0568, code lost:
        if (r1.A0S.A01() == false) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0613, code lost:
        r1 = X.O23.A00(r0);
        r0 = "effect_trigger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x064d, code lost:
        r4.A03(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e8, code lost:
        if (r23 != null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x018f, code lost:
        ((X.C14379Tv8) r3.A01).A00(r2);
        ((X.0sP) r3.A02).invoke(r2.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01f2, code lost:
        r0 = r3.A01;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0208, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0236, code lost:
        X.C51965G9l.A1W(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return r1.invoke(((java.util.List) r0).get(r2));
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x07b0  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x07e5  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0815  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r23) {
        /*
            r22 = this;
            r3 = r22
            r13 = r23
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x09ed;
                case 1: goto L_0x0990;
                case 2: goto L_0x0967;
                case 3: goto L_0x0954;
                case 4: goto L_0x093d;
                case 5: goto L_0x0928;
                case 6: goto L_0x091b;
                case 7: goto L_0x090e;
                case 8: goto L_0x0901;
                case 9: goto L_0x091b;
                case 10: goto L_0x0652;
                case 11: goto L_0x061d;
                case 12: goto L_0x05d3;
                case 13: goto L_0x0587;
                case 14: goto L_0x0546;
                case 15: goto L_0x03bd;
                case 16: goto L_0x036b;
                case 17: goto L_0x034f;
                case 18: goto L_0x0319;
                case 19: goto L_0x02ec;
                case 20: goto L_0x02c6;
                case 21: goto L_0x0264;
                case 22: goto L_0x0251;
                case 23: goto L_0x023b;
                case 24: goto L_0x0225;
                case 25: goto L_0x020d;
                case 26: goto L_0x0009;
                case 27: goto L_0x01fe;
                case 28: goto L_0x001e;
                case 29: goto L_0x0009;
                case 30: goto L_0x01d4;
                case 31: goto L_0x01cd;
                case 32: goto L_0x0009;
                case 33: goto L_0x01a3;
                case 34: goto L_0x001e;
                case 35: goto L_0x0009;
                case 36: goto L_0x0187;
                case 37: goto L_0x017e;
                case 38: goto L_0x0175;
                case 39: goto L_0x0146;
                case 40: goto L_0x012e;
                case 41: goto L_0x00fc;
                case 42: goto L_0x00ec;
                case 43: goto L_0x00dd;
                case 44: goto L_0x00c4;
                case 45: goto L_0x0009;
                case 46: goto L_0x0009;
                case 47: goto L_0x009c;
                case 48: goto L_0x0044;
                case 49: goto L_0x0029;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r2 = X.AnonymousClass7TE.A0M(r13)
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A02
        L_0x0013:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x001e:
            int r2 = X.AnonymousClass7TE.A0M(r13)
            java.lang.Object r1 = r3.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A01
            goto L_0x0013
        L_0x0029:
            X.VYk r13 = (X.C17506VYk) r13
            java.lang.Object r4 = r3.A02
            X.Uae r4 = (X.C15329Uae) r4
            X.0eM r0 = r4.A0G
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r1 = r3.A01
            X.VZn r1 = (X.C17534VZn) r1
            X.0qQ.A0A(r13)
            X.4DU r0 = r4.A09
            X.VGO.A00(r0, r2, r4, r1, r13)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0044:
            X.3HX r13 = (X.AnonymousClass3HX) r13
            java.lang.Object r6 = r3.A02
            X.35Y r6 = (X.AnonymousClass35Y) r6
            X.4DH r2 = r6.A00
            boolean r0 = r2.isAdded()
            if (r0 == 0) goto L_0x0a0f
            if (r13 == 0) goto L_0x0a0f
            com.instagram.common.session.UserSession r0 = r6.A01
            com.instagram.reels.store.ReelStore r0 = X.1OP.A05(r0)
            r5 = 1
            com.instagram.model.reels.Reel r1 = r0.A0I(r13, r5)
            android.content.Context r4 = r2.requireContext()
            java.lang.Object r3 = r3.A01
            X.1Xj r3 = (X.1Xj) r3
            r0 = 25
            X.Wvu r2 = new X.Wvu
            r2.<init>(r0, r6, r1)
            X.0qQ.A0B(r3, r5)
            X.6ap r1 = X.DbS.A0a()
            r1.A03()
            com.instagram.common.typedurl.ImageUrl r0 = r3.A1Q()
            r1.A09 = r0
            r0 = 2131974271(0x7f13587f, float:1.9585601E38)
            X.DbS.A19(r4, r1, r0)
            r1.A0L = r5
            r0 = 2131952148(0x7f130214, float:1.954073E38)
            X.DbW.A0q(r4, r1, r0)
            int r0 = X.Dc5.A00()
            r1.A01 = r0
            r0 = 8
            X.C72737PHr.A00(r1, r2, r0)
            X.DbY.A1N(r1)
            goto L_0x0a0f
        L_0x009c:
            android.view.View r13 = (android.view.View) r13
            java.lang.Object r0 = r3.A02
            X.UAP r0 = (X.UAP) r0
            X.X9a r12 = r0.A08
            java.lang.Object r15 = r3.A01
            com.instagram.model.shopping.productfeed.ProductFeedItem r15 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r15
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            java.util.List r0 = r0.A0F
            java.lang.Integer r3 = X.C51968G9o.A0t(r0)
            r1 = 0
            X.ULV r0 = new X.ULV
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            r16 = 0
            r14 = r0
            r17 = r16
            r12.DZa(r13, r14, r15, r16, r17)
            goto L_0x0a0f
        L_0x00c4:
            java.lang.Object r4 = r3.A01
            X.JOX r4 = (X.JOX) r4
            java.lang.Object r0 = r3.A02
            X.GqT r0 = (X.C53557GqT) r0
            X.MXZ r2 = r0.A03
            boolean r0 = r0.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = X.DbT.A0l(r0)
            r4.Dww(r2, r1, r0)
            goto L_0x0a0f
        L_0x00dd:
            java.lang.Object r0 = r3.A02
            X.PQ2 r0 = (X.PQ2) r0
            X.OTj r1 = r0.A03
            if (r1 == 0) goto L_0x00e8
            r0 = 1
            r1.A03 = r0
        L_0x00e8:
            if (r23 == 0) goto L_0x0a0f
            goto L_0x01f2
        L_0x00ec:
            r1 = 0
            X.0qQ.A0B(r13, r1)
            java.lang.Object r0 = r3.A02
            X.PQ2 r0 = (X.PQ2) r0
            X.OTj r0 = r0.A03
            if (r0 == 0) goto L_0x01f2
            r0.A03 = r1
            goto L_0x01f2
        L_0x00fc:
            java.lang.Object r4 = r3.A02
            X.N4N r4 = (X.N4N) r4
            java.lang.Object r0 = r3.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r6 = r0.A00
            X.N62 r6 = (X.N62) r6
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.Jvf r0 = r4.A06
            r1 = 0
            java.lang.String r7 = r0.A02
            java.lang.String r8 = r0.A03
            boolean r10 = r0.A06
            boolean r11 = r0.A05
            r9 = 1
            X.AnonymousClass7TF.A1B(r7, r9, r8)
            X.Jvf r2 = new X.Jvf
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            X.N4N r0 = X.N4N.A00(r1, r2, (X.N3M) null, r3, (X.OEW) null, (X.C69628NpA) null, r4, (java.lang.Integer) null, r5, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r6, r7, r8, 0, 0, r9, false, false, false, false, false, false)
            return r0
        L_0x012e:
            java.lang.Object r4 = r3.A01
            X.MZn r4 = (X.C66626MZn) r4
            java.lang.Object r3 = r3.A02
            X.UlA r3 = (X.C15940UlA) r3
            java.util.Iterator r2 = r3.A03()
            X.PIb r1 = X.C72744PIb.A00
            X.Pe0 r0 = new X.Pe0
            r0.<init>(r3)
            r4.A02(r0, r1, r2)
            goto L_0x0a0f
        L_0x0146:
            java.lang.Object r4 = r3.A01
            X.Tqa r4 = (X.C14140Tqa) r4
            java.lang.Object r0 = r3.A02
            X.Nfu r0 = (X.C69171Nfu) r0
            X.Nfg r1 = r0.A00
            X.Mg0 r3 = r0.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.X9x r1 = r1.A00
            X.N5G r1 = (X.N5G) r1
            java.lang.Long r0 = r1.A00
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.A02
            com.instagram.model.keyword.Keyword r1 = new com.instagram.model.keyword.Keyword
            r1.<init>(r2, r0)
            java.lang.String r0 = "meta_ai_suggestion"
            r1.A07 = r0
            X.Mn4 r0 = new X.Mn4
            r0.<init>(r1)
            r4.DMv(r0, r3)
            goto L_0x0a0f
        L_0x0175:
            X.HAU r13 = (X.HAU) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.5u2 r2 = r13.A02
            goto L_0x018f
        L_0x017e:
            X.Nck r13 = (X.C69008Nck) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.5u2 r2 = r13.A00
            goto L_0x018f
        L_0x0187:
            X.Ncl r13 = (X.C69009Ncl) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.5u2 r2 = r13.A00
        L_0x018f:
            java.lang.Object r0 = r3.A01
            X.Tv8 r0 = (X.C14379Tv8) r0
            java.lang.Object r1 = r3.A02
            X.0sP r1 = (X.0sP) r1
            r0.A00(r2)
            com.instagram.model.keyword.Keyword r0 = r2.A00()
            r1.invoke(r0)
            goto L_0x0a0f
        L_0x01a3:
            X.6Gb r6 = X.C51968G9o.A0L(r13)
            java.lang.Object r5 = r3.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r3.A02
            X.0sP r4 = (X.0sP) r4
            X.Ppz r1 = X.C74158Ppz.A00
            int r3 = r5.size()
            r0 = 32
            X.PqS r2 = new X.PqS
            r2.<init>((int) r0, (java.util.List) r5, (X.0sP) r1)
            r1 = 21
            X.GaB r0 = new X.GaB
            r0.<init>((int) r1, (java.util.List) r5, (X.0sP) r4)
            X.5PJ r1 = X.AnonymousClass5PI.A02(r0)
            r0 = 0
            r6.CfA(r0, r2, r1, r3)
            goto L_0x0a0f
        L_0x01cd:
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A02
            goto L_0x0208
        L_0x01d4:
            X.HNJ r13 = (X.HNJ) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r3.A02
            X.GhR r0 = (X.C53035GhR) r0
            X.Hrd r2 = r0.A00
            int r1 = r13.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x01fb
            r0 = 5
            if (r1 == r0) goto L_0x01f8
            r0 = 1
            if (r1 == r0) goto L_0x01f5
            X.HM6 r0 = X.HM6.VALID
        L_0x01ef:
            r2.A01(r0)
        L_0x01f2:
            java.lang.Object r0 = r3.A01
            goto L_0x0236
        L_0x01f5:
            X.HM6 r0 = X.HM6.EMAIL_IN_USE
            goto L_0x01ef
        L_0x01f8:
            X.HM6 r0 = X.HM6.INVALID
            goto L_0x01ef
        L_0x01fb:
            X.HM6 r0 = X.HM6.SCHOOL_NOT_FOUND
            goto L_0x01ef
        L_0x01fe:
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A02
            com.instagram.schools.management.data.SchoolInfo r0 = (com.instagram.schools.management.data.SchoolInfo) r0
            java.lang.String r0 = r0.A01
        L_0x0208:
            r1.invoke(r0)
            goto L_0x0a0f
        L_0x020d:
            long r4 = X.AnonymousClass7TE.A0R(r13)
            java.lang.Object r0 = r3.A01
            com.facebook.msys.mca.Mailbox r0 = (com.facebook.msys.mca.Mailbox) r0
            java.lang.Object r2 = r3.A02
            X.0lg r2 = (X.0lg) r2
            X.6E0 r1 = new X.6E0
            r1.<init>(r0, r4)
            java.lang.Class<X.6E0> r0 = X.AnonymousClass6E0.class
            r2.A04(r0, r1)
            goto L_0x0a0f
        L_0x0225:
            long r1 = X.AnonymousClass7TE.A0R(r13)
            java.lang.Object r0 = r3.A01
            com.facebook.msys.mci.AccountSession r0 = (com.facebook.msys.mci.AccountSession) r0
            com.facebook.rsys.crypto.gen.CryptoContextHolder r13 = com.facebook.rsys.cryptocontextfactory.gen.CryptoContextFactory.CProxy.createContextHolderWithAccountSession(r1, r0)
            X.0qQ.A07(r13)
            java.lang.Object r0 = r3.A02
        L_0x0236:
            X.C51965G9l.A1W(r0, r13)
            goto L_0x0a0f
        L_0x023b:
            java.lang.Object r2 = r3.A02
            X.Ner r2 = (X.C69112Ner) r2
            X.87G r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0a0f
            X.87G r1 = r2.A01
            r0 = 0
            X.C69112Ner.A01(r1, r2, r0)
            goto L_0x0a0f
        L_0x0251:
            com.facebook.msys.mca.Mailbox r0 = X.C66581MXm.A0H(r13)
            java.lang.Object r1 = r3.A02
            X.Odx r1 = (X.C71143Odx) r1
            r1.A00 = r0
            java.lang.Object r0 = r3.A01
            X.0sP r0 = (X.0sP) r0
            X.C71143Odx.A03(r1, r0)
            goto L_0x0a0f
        L_0x0264:
            X.N4R r13 = (X.N4R) r13
            r10 = 0
            X.0qQ.A0B(r13, r10)
            java.lang.Object r0 = r3.A02
            X.Odx r0 = (X.C71143Odx) r0
            com.instagram.common.session.UserSession r0 = r0.A0H
            X.OWf r1 = X.C70320O1y.A00(r0)
            r0 = 8
            r1.A01(r0)
            java.lang.Object r4 = r13.A00
            X.OEP r4 = (X.OEP) r4
            java.lang.Object r2 = r3.A01
            X.OHa r2 = (X.C70705OHa) r2
            java.lang.String r5 = r2.A02
            java.lang.String r6 = "-1"
            java.lang.String r0 = r2.A03
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r11 = r2.A04
            com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface r1 = r2.A01
            X.0sa r0 = r2.A05
            if (r0 == 0) goto L_0x02c4
            java.lang.Object r0 = r0.invoke()
            com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp r0 = (com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp) r0
        L_0x029d:
            java.lang.String r7 = ""
            r17 = 0
            r9 = 1
            com.instagram.rtc.rsys.proxies.IGRTCCallManager r4 = r4.A01
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r9
            r18 = r0
            r19 = r1
            java.lang.String r1 = r4.startCallCopyId(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0qQ.A07(r1)
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r0 = "startSession ended with localCallId  "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "RtcRsysInteractor"
            r2.A01(r0, r1)
            goto L_0x0a0f
        L_0x02c4:
            r0 = 0
            goto L_0x029d
        L_0x02c6:
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r3.A02
            X.OHa r0 = (X.C70705OHa) r0
            X.ODE r1 = r0.A00
            boolean r0 = r13 instanceof X.NCY
            if (r0 == 0) goto L_0x02ea
            X.GnK r0 = r1.A00
            java.lang.Object r0 = r0.A03
            X.C51965G9l.A1W(r0, r13)
            java.lang.Object r1 = r3.A01
            X.1IX r1 = (X.1IX) r1
            X.Ppl r0 = X.C74144Ppl.A00
            r1.EJ1(r0, r13)
            r0 = 1
        L_0x02e5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x02ea:
            r0 = 0
            goto L_0x02e5
        L_0x02ec:
            X.NCZ r13 = (X.NCZ) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.OZU r4 = r13.A09
            java.lang.Object r2 = r3.A02
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r1 = r3.A01
            android.graphics.Point r1 = (android.graphics.Point) r1
            X.AnonymousClass7TF.A1H(r2, r1)
            X.0eM r0 = r4.A09
            r0.getValue()
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0314
            monitor-enter(r4)
            X.OZU.A01(r2, r1, r4)     // Catch:{ all -> 0x0311 }
            monitor-exit(r4)
            goto L_0x0a0f
        L_0x0311:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0314:
            X.OZU.A01(r2, r1, r4)
            goto L_0x0a0f
        L_0x0319:
            X.NCZ r6 = X.C66581MXm.A0j(r13)
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r3.A02
            X.Odx r0 = (X.C71143Odx) r0
            com.instagram.common.session.UserSession r0 = r0.A0H
            java.lang.Long r0 = X.C66581MXm.A0r(r0, r1)
            if (r0 == 0) goto L_0x0a0f
            java.lang.Object r5 = r3.A01
            java.lang.Number r5 = (java.lang.Number) r5
            long r3 = r0.longValue()
            X.OU3 r0 = r6.A01
            com.facebook.rsys.calltag.gen.CallTagApi r2 = r0.A03
            if (r2 == 0) goto L_0x0a0f
            java.lang.String r1 = r6.A0A
            int r0 = r5.intValue()
            switch(r0) {
                case 1: goto L_0x0349;
                case 2: goto L_0x034c;
                default: goto L_0x0342;
            }
        L_0x0342:
            java.lang.String r0 = "screen_share"
        L_0x0344:
            r2.updateCallTags(r1, r3, r0)
            goto L_0x0a0f
        L_0x0349:
            java.lang.String r0 = "watch_together"
            goto L_0x0344
        L_0x034c:
            java.lang.String r0 = "photobooth"
            goto L_0x0344
        L_0x034f:
            X.N4R r13 = (X.N4R) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r13.A00
            X.OEP r0 = (X.OEP) r0
            java.lang.Object r2 = r3.A01
            com.facebook.rsys.callmanager.gen.CallApi r2 = (com.facebook.rsys.callmanager.gen.CallApi) r2
            java.lang.Object r1 = r3.A02
            com.instagram.rtc.rsys.proxies.EngineProxy r1 = (com.instagram.rtc.rsys.proxies.EngineProxy) r1
            X.AnonymousClass7TF.A1H(r2, r1)
            com.instagram.rtc.rsys.proxies.IGRTCCallManager r0 = r0.A01
            r0.registerAppModelListener(r2, r1)
            goto L_0x0a0f
        L_0x036b:
            X.NCZ r13 = (X.NCZ) r13
            r2 = 0
            X.0qQ.A0B(r13, r2)
            X.NCn r5 = X.NCZ.A00(r13)
            boolean r0 = r5 instanceof com.instagram.rtc.rsys.camera.IgLiteCameraProxy
            if (r0 == 0) goto L_0x0a0f
            com.instagram.rtc.rsys.camera.IgLiteCameraProxy r5 = (com.instagram.rtc.rsys.camera.IgLiteCameraProxy) r5
            if (r5 == 0) goto L_0x0a0f
            java.lang.Object r4 = r3.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r0 = r3.A02
            X.Oq3 r0 = (X.C71743Oq3) r0
            X.7rh r1 = r0.A08
            X.0qQ.A0B(r4, r2)
            X.AtJ r0 = r5.A04
            java.lang.Object r0 = r0.get()
            X.A6Y r0 = (X.A6Y) r0
            X.7th r0 = r0.A03
            r0.Ege(r4)
            if (r1 == 0) goto L_0x039c
            r0.A9s(r1)
        L_0x039c:
            X.7pa r0 = r5.A02
            if (r0 != 0) goto L_0x0a0f
            int r0 = r4.getWidth()
            if (r0 <= 0) goto L_0x0a0f
            int r0 = r4.getHeight()
            if (r0 <= 0) goto L_0x0a0f
            int r2 = r4.getWidth()
            int r1 = r4.getHeight()
            X.7pa r0 = new X.7pa
            r0.<init>(r2, r1)
            r5.A02 = r0
            goto L_0x0a0f
        L_0x03bd:
            X.ONr r13 = (X.C70840ONr) r13
            r6 = 0
            X.0qQ.A0B(r13, r6)
            java.lang.Object r4 = r3.A01
            com.instagram.rtc.rsys.models.AnalyticsEvent r4 = (com.instagram.rtc.rsys.models.AnalyticsEvent) r4
            int r1 = r4.step
            r0 = 6
            if (r1 != r0) goto L_0x04c1
            java.lang.Object r2 = r3.A02
            X.Ods r2 = (X.C71142Ods) r2
            int r0 = r2.A0P
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "start_battery_level"
            r13.A00(r1, r0)
            X.1Cn r3 = r2.A0Z
            X.1Cn.A00(r3)
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "end_battery_level"
            r13.A00(r1, r0)
            boolean r0 = r2.A0N
            if (r0 != 0) goto L_0x03f6
            boolean r1 = r3.A06()
            r0 = 0
            if (r1 == 0) goto L_0x03f7
        L_0x03f6:
            r0 = 1
        L_0x03f7:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_battery_charging"
            r13.A01(r0, r1)
            boolean r0 = r2.A0f
            if (r0 != 0) goto L_0x040f
            long r0 = r2.A0J
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "total_duration_with_face_effects"
            r13.A02(r0, r1)
        L_0x040f:
            X.OMM r10 = r2.A0Q
            if (r10 == 0) goto L_0x044d
            java.lang.String r0 = "/proc/self/stat"
            java.lang.String[] r0 = X.OYL.A02(r0)
            X.OMM r9 = X.OYL.A01(r0)
            if (r9 == 0) goto L_0x044d
            double r0 = r9.A01
            double r7 = r10.A01
            double r0 = r0 - r7
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            java.lang.String r5 = "cpu_user_time"
            if (r3 == 0) goto L_0x0436
            X.NeE r3 = new X.NeE
            r3.<init>(r0)
            java.util.Map r0 = r13.A00
            r0.put(r5, r3)
        L_0x0436:
            double r0 = r9.A00
            double r7 = r10.A00
            double r0 = r0 - r7
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            java.lang.String r5 = "cpu_kernel_time"
            if (r3 == 0) goto L_0x044d
            X.NeE r3 = new X.NeE
            r3.<init>(r0)
            java.util.Map r0 = r13.A00
            r0.put(r5, r3)
        L_0x044d:
            long r0 = r2.A0C
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration_full_screen"
            r13.A02(r0, r1)
            long r0 = r2.A0G
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration_minimized_screen"
            r13.A02(r0, r1)
            long r0 = r2.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration_backgrounded"
            r13.A02(r0, r1)
            long r0 = r2.A0I
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration_reconnecting"
            r13.A02(r0, r1)
            long r0 = r2.A0H
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "distinct_reconnecting_count"
            r13.A02(r0, r1)
            X.OTL r1 = r2.A0X
            X.OVE r0 = r1.A01
            long r11 = r0.A00()
            X.OVE r0 = r1.A00
            long r9 = r0.A00()
            X.OVE r0 = r1.A02
            long r7 = r0.A00()
            r2 = 0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x04a7
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            java.lang.String r0 = "screen_share_sharer_duration_ms"
            r13.A02(r0, r1)
        L_0x04a7:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x04b4
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = "screen_share_sharer_connected_duration_ms"
            r13.A02(r0, r1)
        L_0x04b4:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x04c1
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = "screen_share_viewer_duration_ms"
            r13.A02(r0, r1)
        L_0x04c1:
            java.util.Map r0 = r4.boolParams
            X.0qQ.A07(r0)
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)
        L_0x04ca:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04ee
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            X.NeD r1 = new X.NeD
            r1.<init>(r0)
            X.0qQ.A0B(r2, r6)
            java.util.Map r0 = r13.A00
            r0.put(r2, r1)
            goto L_0x04ca
        L_0x04ee:
            java.util.Map r0 = r4.stringParams
            X.0qQ.A07(r0)
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)
        L_0x04f7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0519
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            X.NeI r1 = new X.NeI
            r1.<init>(r0)
            X.0qQ.A0B(r2, r6)
            java.util.Map r0 = r13.A00
            r0.put(r2, r1)
            goto L_0x04f7
        L_0x0519:
            java.util.Map r0 = r4.numberParams
            X.0qQ.A07(r0)
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r0)
        L_0x0522:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0a0f
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            long r2 = X.AnonymousClass7TE.A0R(r0)
            X.NeH r1 = new X.NeH
            r1.<init>(r2)
            X.0qQ.A0B(r4, r6)
            java.util.Map r0 = r13.A00
            r0.put(r4, r1)
            goto L_0x0522
        L_0x0546:
            X.ONr r4 = X.C66581MXm.A0h(r13)
            java.lang.Object r2 = r3.A01
            X.PL9 r2 = (X.PL9) r2
            java.lang.Integer r0 = r2.A00
            java.lang.String r1 = X.O22.A00(r0)
            java.lang.String r0 = "action"
            r4.A03(r0, r1)
            java.lang.Object r1 = r3.A02
            X.Ods r1 = (X.C71142Ods) r1
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x056a
            X.ONT r0 = r1.A0S
            boolean r1 = r0.A01()
            r0 = 1
            if (r1 != 0) goto L_0x056b
        L_0x056a:
            r0 = 0
        L_0x056b:
            r1 = 0
            if (r0 != 0) goto L_0x0570
            java.lang.String r1 = r2.A03
        L_0x0570:
            java.lang.String r0 = "current_filter_id"
            r4.A03(r0, r1)
            java.lang.String r1 = "filter_effect"
            java.lang.String r0 = "effect_type"
            r4.A03(r0, r1)
            java.lang.Long r1 = r2.A02
            java.lang.String r0 = "effect_duration"
            r4.A02(r0, r1)
            java.lang.Integer r0 = r2.A01
            goto L_0x0613
        L_0x0587:
            X.ONr r4 = X.C66581MXm.A0h(r13)
            java.lang.Object r2 = r3.A01
            X.PLB r2 = (X.PLB) r2
            java.lang.Integer r0 = r2.A01
            java.lang.String r1 = X.O22.A00(r0)
            java.lang.String r0 = "action"
            r4.A03(r0, r1)
            java.lang.Object r0 = r3.A02
            X.Ods r0 = (X.C71142Ods) r0
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x05d0
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x05ce
            java.lang.String r0 = "1004"
        L_0x05a8:
            java.lang.String r1 = "current_face_effect_id"
            r4.A03(r1, r0)
            X.Njs r0 = r2.A00
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "effect_type"
            r4.A03(r0, r1)
            java.lang.String r1 = r2.A06
            java.lang.String r0 = "effect_initiator_id"
            r4.A03(r0, r1)
            java.lang.Integer r1 = r2.A02
            java.lang.String r0 = "participant_count"
            r4.A00(r1, r0)
            java.lang.Long r1 = r2.A04
            java.lang.String r0 = "effect_duration"
            r4.A02(r0, r1)
            java.lang.Integer r0 = r2.A03
            goto L_0x0613
        L_0x05ce:
            r0 = 0
            goto L_0x05a8
        L_0x05d0:
            java.lang.String r0 = r2.A05
            goto L_0x05a8
        L_0x05d3:
            X.ONr r4 = X.C66581MXm.A0h(r13)
            java.lang.Object r5 = r3.A01
            X.PL8 r5 = (X.PL8) r5
            java.lang.Integer r0 = r5.A00
            java.lang.String r1 = X.O22.A00(r0)
            java.lang.String r0 = "action"
            r4.A03(r0, r1)
            java.lang.Object r0 = r3.A02
            X.Ods r0 = (X.C71142Ods) r0
            X.ONT r3 = r0.A0S
            boolean r0 = r3.A01()
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r2 = 0
            if (r0 == 0) goto L_0x061a
            r0 = r2
        L_0x05f8:
            java.lang.String r1 = "current_background_id"
            r4.A03(r1, r0)
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x0605
            java.lang.String r2 = r5.A04
        L_0x0605:
            java.lang.String r0 = "current_background_name"
            r4.A03(r0, r2)
            java.lang.Long r1 = r5.A02
            java.lang.String r0 = "effect_duration"
            r4.A02(r0, r1)
            java.lang.Integer r0 = r5.A01
        L_0x0613:
            java.lang.String r1 = X.O23.A00(r0)
            java.lang.String r0 = "effect_trigger"
            goto L_0x064d
        L_0x061a:
            java.lang.String r0 = r5.A03
            goto L_0x05f8
        L_0x061d:
            X.ONr r4 = X.C66581MXm.A0h(r13)
            java.lang.String r1 = "shared"
            java.lang.String r0 = "action"
            r4.A03(r0, r1)
            java.lang.Object r0 = r3.A01
            X.0xE r0 = (X.0xE) r0
            java.lang.String r2 = "share_type"
            if (r0 == 0) goto L_0x063a
            X.NeF r1 = new X.NeF
            r1.<init>(r0)
            java.util.Map r0 = r4.A00
            r0.put(r2, r1)
        L_0x063a:
            java.lang.Object r2 = r3.A02
            X.PKC r2 = (X.PKC) r2
            boolean r0 = r2.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "result"
            r4.A01(r0, r1)
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "error_message"
        L_0x064d:
            r4.A03(r0, r1)
            goto L_0x0a0f
        L_0x0652:
            com.instagram.common.session.UserSession r13 = (com.instagram.common.session.UserSession) r13
            r15 = 0
            X.0qQ.A0B(r13, r15)
            java.lang.Object r2 = r3.A02
            com.instagram.rtc.activity.RtcCallIntentHandlerActivity r2 = (com.instagram.rtc.activity.RtcCallIntentHandlerActivity) r2
            java.lang.Object r3 = r3.A01
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.String r4 = "rtc_call_activity_arguments_key_notification_trace_id"
            r0 = 0
            long r4 = r3.getLongExtra(r4, r0)
            X.OEO r0 = X.O26.A00(r13)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            X.Pvr r0 = r0.A01
            X.PxB r6 = r0.BWh(r1)
            java.lang.String r0 = "reach_rtc_intent_handler_activity"
            r6.AIe(r0)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36323667999796601(0x810c2f00112d79, double:3.034572134517911E-306)
            boolean r0 = X.182.A06(r4, r13, r0)
            if (r0 == 0) goto L_0x0694
            X.08y r0 = X.09i.A0A     // Catch:{ IllegalStateException -> 0x068f }
            com.instagram.common.session.UserSession r12 = r0.A08(r2)     // Catch:{ IllegalStateException -> 0x068f }
            goto L_0x0695
        L_0x068f:
            r2.finish()
            goto L_0x0a0f
        L_0x0694:
            r12 = r13
        L_0x0695:
            java.lang.Class<com.instagram.model.rtc.RtcEnterCallArgs> r9 = com.instagram.model.rtc.RtcEnterCallArgs.class
            java.lang.ClassLoader r0 = r9.getClassLoader()
            r3.setExtrasClassLoader(r0)
            java.lang.String r7 = "rtc_call_activity_arguments_key_enter_call_args"
            android.os.Parcelable r5 = r3.getParcelableExtra(r7)
            com.instagram.model.rtc.RtcEnterCallArgs r5 = (com.instagram.model.rtc.RtcEnterCallArgs) r5
            X.OWb r4 = X.C71004OWb.A00
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "isAccountSwitchRequired "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)
            java.lang.String r1 = "RtcCallIntentHandlerActivity"
            r11 = 0
            r4.A01(r1, r0)
            boolean r0 = r5 instanceof com.instagram.model.rtc.RtcJoinCallArgs
            if (r0 == 0) goto L_0x070e
            com.instagram.model.rtc.RtcJoinCallArgs r5 = (com.instagram.model.rtc.RtcJoinCallArgs) r5
            java.lang.String r0 = r5.A05
        L_0x06c0:
            if (r0 == 0) goto L_0x07ac
            java.lang.String r8 = r12.A06
            boolean r0 = r0.equals(r8)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x07ac
            java.lang.ClassLoader r0 = r9.getClassLoader()
            r3.setExtrasClassLoader(r0)
            android.os.Parcelable r5 = r3.getParcelableExtra(r7)
            com.instagram.model.rtc.RtcEnterCallArgs r5 = (com.instagram.model.rtc.RtcEnterCallArgs) r5
            if (r5 == 0) goto L_0x0791
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "attemptAccountSwitch "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r6)
            r4.A01(r1, r0)
            boolean r0 = r5 instanceof com.instagram.model.rtc.RtcJoinCallArgs
            if (r0 == 0) goto L_0x0700
            r0 = r5
            com.instagram.model.rtc.RtcJoinCallArgs r0 = (com.instagram.model.rtc.RtcJoinCallArgs) r0
            java.lang.String r7 = r0.A05
        L_0x06f1:
            if (r7 == 0) goto L_0x0791
            java.lang.String r0 = r5.BWg()
            if (r0 == 0) goto L_0x0791
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0791
            goto L_0x071b
        L_0x0700:
            boolean r0 = r5 instanceof com.instagram.model.rtc.RtcCreateCallArgs
            if (r0 == 0) goto L_0x0791
            r0 = r5
            com.instagram.model.rtc.RtcCreateCallArgs r0 = (com.instagram.model.rtc.RtcCreateCallArgs) r0
            com.instagram.model.rtc.RtcIgNotification r0 = r0.A06
            if (r0 == 0) goto L_0x0791
            java.lang.String r7 = r0.A02
            goto L_0x06f1
        L_0x070e:
            boolean r0 = r5 instanceof com.instagram.model.rtc.RtcCreateCallArgs
            if (r0 == 0) goto L_0x07ac
            com.instagram.model.rtc.RtcCreateCallArgs r5 = (com.instagram.model.rtc.RtcCreateCallArgs) r5
            com.instagram.model.rtc.RtcIgNotification r0 = r5.A06
            if (r0 == 0) goto L_0x07ac
            java.lang.String r0 = r0.A02
            goto L_0x06c0
        L_0x071b:
            boolean r0 = X.0qQ.A0K(r8, r7)     // Catch:{ IllegalStateException -> 0x0783 }
            if (r0 != 0) goto L_0x0743
            X.0BQ r9 = X.AnonymousClass0BO.A00(r12)     // Catch:{ IllegalStateException -> 0x0783 }
            com.instagram.user.model.User r13 = r9.BNw(r7)     // Catch:{ IllegalStateException -> 0x0783 }
            if (r13 == 0) goto L_0x0767
            android.content.Context r0 = X.DbT.A05(r2)     // Catch:{ IllegalStateException -> 0x0783 }
            boolean r0 = r9.AG1(r0, r12, r13)     // Catch:{ IllegalStateException -> 0x0783 }
            java.lang.String r6 = " to "
            if (r0 == 0) goto L_0x0774
            r13.getId()     // Catch:{ IllegalStateException -> 0x0783 }
            java.lang.String r14 = "UserSessionHelper"
            android.content.Context r10 = X.DbT.A05(r2)     // Catch:{ IllegalStateException -> 0x0783 }
            r9.E2T(r10, r11, r12, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0783 }
        L_0x0743:
            X.08y r0 = X.09i.A0A     // Catch:{ IllegalStateException -> 0x0783 }
            com.instagram.common.session.UserSession r6 = r0.A08(r2)     // Catch:{ IllegalStateException -> 0x0783 }
            boolean r0 = X.C66580MXl.A1X(r6, r7)     // Catch:{ IllegalStateException -> 0x0783 }
            if (r0 != 0) goto L_0x075c
            X.0wj r0 = X.0wj.A01     // Catch:{ IllegalStateException -> 0x0783 }
            X.ON9 r5 = new X.ON9     // Catch:{ IllegalStateException -> 0x0783 }
            r5.<init>(r0)     // Catch:{ IllegalStateException -> 0x0783 }
            java.lang.String r0 = "RtcCallIntentHandlerActivity: User ID of user session post account switch doesn't match call notification recipient user id"
            r5.A00(r0)     // Catch:{ IllegalStateException -> 0x0783 }
            goto L_0x0791
        L_0x075c:
            java.lang.String r5 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r0 = r6.A05     // Catch:{ IllegalStateException -> 0x0783 }
            r3.putExtra(r5, r0)     // Catch:{ IllegalStateException -> 0x0783 }
            X.0kR.A0B(r2, r3)     // Catch:{ IllegalStateException -> 0x0783 }
            goto L_0x07a7
        L_0x0767:
            java.lang.String r5 = "User "
            java.lang.String r0 = " is not logged in"
            java.lang.String r0 = X.002.A0g(r5, r7, r0)     // Catch:{ IllegalStateException -> 0x0783 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IllegalStateException -> 0x0783 }
            goto L_0x0782
        L_0x0774:
            java.lang.String r5 = "Can't switch from "
            java.lang.String r0 = r13.getId()     // Catch:{ IllegalStateException -> 0x0783 }
            java.lang.String r0 = X.002.A0u(r5, r8, r6, r0)     // Catch:{ IllegalStateException -> 0x0783 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IllegalStateException -> 0x0783 }
        L_0x0782:
            throw r0     // Catch:{ IllegalStateException -> 0x0783 }
        L_0x0783:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "incorrect intent: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r5)
            r4.A04(r1, r0, r6)
        L_0x0791:
            X.0wj r1 = X.0wj.A01
            X.ON9 r0 = new X.ON9
            r0.<init>(r1)
            java.lang.String r4 = "RtcCallIntentHandlerActivity: Fail to switch account"
            r3 = 659044095(0x274836ff, float:2.778539E-15)
            X.0fA r1 = r0.A00
            X.OW1 r0 = new X.OW1
            r0.<init>(r1, r4, r3)
            r0.A01()
        L_0x07a7:
            r2.finish()
            goto L_0x0a0f
        L_0x07ac:
            X.SJD r0 = r2.A01
            if (r0 != 0) goto L_0x07da
            android.view.View r1 = X.C66581MXm.A0A(r2)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r5 = X.AnonymousClass7TE.A0b(r1, r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            X.POg r4 = new X.POg
            r4.<init>(r13, r2)
            X.OKx r1 = new X.OKx
            r1.<init>(r2)
            X.SJD r0 = new X.SJD
            r17 = r2
            r18 = r5
            r19 = r13
            r20 = r1
            r21 = r4
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r2.A01 = r0
        L_0x07da:
            X.Pvq r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x0815
            boolean r0 = r0.isRunning()
            if (r0 != r1) goto L_0x0815
            X.0wj r1 = X.0wj.A01
            X.ON9 r0 = new X.ON9
            r0.<init>(r1)
            java.lang.String r5 = "RtcCallIntentHandlerActivity: Previous operation in progress while processing intent"
            r1 = 659044095(0x274836ff, float:2.778539E-15)
            X.0fA r0 = r0.A00
            X.OW1 r4 = new X.OW1
            r4.<init>(r0, r5, r1)
            java.lang.String r1 = r3.getAction()
            if (r1 != 0) goto L_0x0800
            java.lang.String r1 = "null"
        L_0x0800:
            java.lang.String r0 = "intent_action"
            r4.A02(r0, r1)
            X.Pvq r0 = r2.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "current_operation"
            r4.A02(r0, r1)
            r4.A01()
            goto L_0x0a0f
        L_0x0815:
            java.lang.String r5 = r3.getAction()
            if (r5 == 0) goto L_0x08eb
            int r4 = r5.hashCode()
            r0 = 328934692(0x139b2524, float:3.9164124E-27)
            java.lang.String r1 = "Required value was null."
            if (r4 == r0) goto L_0x08b5
            r0 = 533040327(0x1fc58cc7, float:8.366564E-20)
            if (r4 == r0) goto L_0x0881
            r0 = 1894398468(0x70ea3a04, float:5.7991703E29)
            if (r4 != r0) goto L_0x08eb
            java.lang.String r0 = "rtc_call_activity_intent_action_incoming_call"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x08eb
            java.lang.String r0 = "rtc_call_activity_arguments_key_incoming_param"
            byte[] r5 = r3.getByteArrayExtra(r0)
            if (r5 == 0) goto L_0x08dc
            java.lang.Class<com.instagram.rtc.activity.RtcIncomingParams> r4 = com.instagram.rtc.activity.RtcIncomingParams.class
            java.lang.String r0 = "CREATOR"
            java.lang.reflect.Field r0 = r4.getDeclaredField(r0)
            java.lang.Object r3 = r0.get(r11)
            boolean r0 = r3 instanceof android.os.Parcelable.Creator
            if (r0 == 0) goto L_0x08cb
            android.os.Parcelable$Creator r3 = (android.os.Parcelable.Creator) r3
            if (r3 == 0) goto L_0x08cb
            android.os.Parcel r1 = android.os.Parcel.obtain()
            X.0qQ.A07(r1)
            int r0 = r5.length
            r1.unmarshall(r5, r15, r0)
            r1.setDataPosition(r15)
            java.lang.Object r0 = r3.createFromParcel(r1)
            r1.recycle()
            com.instagram.rtc.activity.RtcIncomingParams r0 = (com.instagram.rtc.activity.RtcIncomingParams) r0
            X.PJe r4 = new X.PJe
            r5 = r6
            r6 = r2
            r7 = r13
            r8 = r2
            r9 = r0
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0875:
            r2.A00 = r4
            android.os.Handler r0 = r2.A02
            r0.removeCallbacksAndMessages(r11)
            r4.start()
            goto L_0x0a0f
        L_0x0881:
            java.lang.String r0 = "rtc_call_activity_intent_action_create_or_join_call"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x08eb
            java.lang.ClassLoader r0 = r9.getClassLoader()
            r3.setExtrasClassLoader(r0)
            android.os.Parcelable r3 = r3.getParcelableExtra(r7)
            com.instagram.model.rtc.RtcEnterCallArgs r3 = (com.instagram.model.rtc.RtcEnterCallArgs) r3
            if (r3 == 0) goto L_0x08e1
            com.instagram.model.rtc.RtcCallSource r0 = r3.Bxh()
            X.7Rj r1 = r0.A01
            X.7Rj r0 = X.C331537Rj.PUSH_NOTIFICATION
            if (r1 != r0) goto L_0x08af
            boolean r0 = r3 instanceof com.instagram.model.rtc.RtcJoinCallArgs
            if (r0 == 0) goto L_0x08af
            X.OWf r1 = X.C70320O1y.A00(r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A03(r0)
        L_0x08af:
            X.PJf r4 = new X.PJf
            r4.<init>(r2, r13, r3, r2)
            goto L_0x0875
        L_0x08b5:
            java.lang.String r0 = "rtc_call_activity_intent_action_open_ongoing_call"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x08eb
            java.lang.String r0 = "rtc_call_activity_intent_action_open_ongoing_call_entrypoint"
            java.lang.String r0 = r3.getStringExtra(r0)
            if (r0 == 0) goto L_0x08e6
            X.PJd r4 = new X.PJd
            r4.<init>(r2, r13, r2, r0)
            goto L_0x0875
        L_0x08cb:
            java.lang.String r1 = "Could not access CREATOR field in class "
            X.0Yh r0 = X.DbS.A0z(r4)
            java.lang.Class r0 = r0.A00
            java.lang.String r0 = X.0q1.A01(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x08dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x08e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x08e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x08eb:
            X.0wj r0 = X.0wj.A01
            X.ON9 r2 = new X.ON9
            r2.<init>(r0)
            java.lang.String r1 = "RtcCallIntentHandlerActivity: Unknown intent action: "
            java.lang.String r0 = r3.getAction()
            java.lang.String r0 = X.002.A0R(r1, r0)
            r2.A00(r0)
            goto L_0x0a0f
        L_0x0901:
            java.lang.Object r1 = r3.A01
            X.6Zi r1 = (X.C309716Zi) r1
            java.lang.Object r0 = r3.A02
            X.3uh r0 = (X.C255773uh) r0
            r1.DCC(r0)
            goto L_0x0a0f
        L_0x090e:
            java.lang.Object r1 = r3.A01
            X.6Zi r1 = (X.C309716Zi) r1
            java.lang.Object r0 = r3.A02
            X.3uh r0 = (X.C255773uh) r0
            r1.DCB(r0)
            goto L_0x0a0f
        L_0x091b:
            java.lang.Object r1 = r3.A01
            X.6Zr r1 = (X.C309806Zr) r1
            java.lang.Object r0 = r3.A02
            X.3uh r0 = (X.C255773uh) r0
            r1.CtE(r0)
            goto L_0x0a0f
        L_0x0928:
            java.util.List r2 = X.JTQ.A0i(r13)
            java.lang.Object r1 = r3.A01
            X.6mk r1 = (X.C317116mk) r1
            java.lang.Object r0 = r3.A02
            X.3BQ r0 = (X.AnonymousClass3BQ) r0
            boolean r0 = r1.DpS(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x093d:
            float r1 = X.AnonymousClass7TE.A04(r13)
            java.lang.Object r0 = r3.A01
            X.3rq r0 = (X.C254043rq) r0
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r0 = r0.A02
            if (r0 == 0) goto L_0x094c
            r0.setProgress(r1)
        L_0x094c:
            java.lang.Object r0 = r3.A02
            X.5qj r0 = (X.C296845qj) r0
            r0.A00 = r1
            goto L_0x0a0f
        L_0x0954:
            boolean r0 = X.AnonymousClass7TE.A1a(r13)
            if (r0 == 0) goto L_0x0a0f
            java.lang.Object r1 = r3.A02
            X.6iG r1 = (X.C314436iG) r1
            java.lang.Object r0 = r3.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.C314436iG.A04(r1, r0)
            goto L_0x0a0f
        L_0x0967:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            java.lang.Object r2 = r3.A01
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            if (r13 == 0) goto L_0x098a
            java.lang.Object r0 = r3.A02
            com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator r0 = (com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0979:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x098b
            java.lang.Object r0 = r1.next()
            X.PtZ r0 = (X.C74359PtZ) r0
            android.graphics.Bitmap r13 = r0.FHd(r13)
            goto L_0x0979
        L_0x098a:
            r13 = 0
        L_0x098b:
            r2.resumeWith(r13)
            goto L_0x0a0f
        L_0x0990:
            java.util.List r13 = (java.util.List) r13
            r2 = 0
            X.0qQ.A0B(r13, r2)
            java.lang.Object r5 = r3.A01
            X.GnY r5 = (X.C53401GnY) r5
            boolean r0 = r13 instanceof java.util.Collection
            if (r0 == 0) goto L_0x09d2
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x09d2
        L_0x09a4:
            java.lang.String r8 = r5.A04
            r6 = 0
            java.lang.Object r7 = r3.A02
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r0 = r5.A02
            X.1Xj r0 = (X.1Xj) r0
            com.instagram.common.typedurl.ImageUrl r5 = r0.A1Q()
            if (r5 != 0) goto L_0x09c5
            android.net.Uri r0 = r0.A05
            if (r0 == 0) goto L_0x09bf
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x09c1
        L_0x09bf:
            java.lang.String r0 = ""
        L_0x09c1:
            com.instagram.common.typedurl.SimpleImageUrl r5 = X.DbS.A0V(r0)
        L_0x09c5:
            r10 = 0
            X.0sn r9 = X.0sn.A00
            X.L9x r4 = new X.L9x
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13.add(r2, r4)
            goto L_0x0a0f
        L_0x09d2:
            java.util.Iterator r4 = r13.iterator()
        L_0x09d6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x09a4
            java.lang.Object r0 = r4.next()
            X.L9x r0 = (X.C63868L9x) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r5.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x09d6
            goto L_0x0a0f
        L_0x09ed:
            java.lang.String r13 = (java.lang.String) r13
            r14 = 0
            X.0qQ.A0B(r13, r14)
            java.lang.Object r1 = r3.A02
            com.instagram.profilecard.domain.ProfileCardViewModel r1 = (com.instagram.profilecard.domain.ProfileCardViewModel) r1
            java.lang.Object r10 = r3.A01
            android.content.Context r10 = (android.content.Context) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            com.instagram.common.session.UserSession r11 = r1.A0F
            X.2EG r12 = X.2EG.A31
            X.SUL r9 = new X.SUL
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.String r0 = "ProfileCardFragment"
            r9.A0S = r0
            r9.A0A()
        L_0x0a0f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74186PqS.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74186PqS(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
