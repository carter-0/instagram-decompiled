package X;

import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.JjM  reason: case insensitive filesystem */
public final class C60318JjM extends 2YL {
    public final BrandedContentDisclosureArgs A00;
    public final BrandedContentProjectRepository A01;
    public final BrandedContentApi A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final String A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final List A07 = AnonymousClass7TE.A1C();
    public final Map A08 = AnonymousClass7TE.A1H();
    public final Map A09 = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(MMG.A00(this, 16));
    public final C249513ju A0B;
    public final AnonymousClass0r6 A0C;
    public final boolean A0D;

    /* JADX WARNING: type inference failed for: r17v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r18v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r3v44, types: [X.IwP] */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.0sa] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00da, code lost:
        r15 = null;
        r16 = 2131968772;
        r19 = 2131954098;
        r14 = X.JTP.A0P(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0111, code lost:
        if (r0 == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a9, code lost:
        r5 = X.JTR.A0g(r0.getUsername(), r4);
        r3 = new X.C58716IwP(39, (java.lang.Object) r2, (java.lang.Object) r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01c5, code lost:
        if (X.AnonymousClass7TF.A1Z(r13.A0A) == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c7, code lost:
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c8, code lost:
        r3 = new X.LAD(r13, r5, (java.lang.Integer) null, 2131968772, (X.C62320sa) null, r15, 2131954092);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01fd, code lost:
        if (r3 == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0225, code lost:
        r12 = new X.LAD(r13, X.JTR.A0g(r0.getUsername(), r4), 2131952275, 2131954722, new X.C58696Iw5(45, r2, r0, r13), new X.C58716IwP(40, (java.lang.Object) r0, (java.lang.Object) r13), 2131954104);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x027e, code lost:
        if (r3 == false) goto L_0x0222;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A06(X.C63597Kzk r21, com.instagram.user.model.User r22) {
        /*
            r20 = this;
            r7 = 0
            r13 = r20
            java.util.Map r1 = r13.A09
            r0 = r22
            java.lang.Object r1 = r1.get(r0)
            X.Jus r1 = (X.C60996Jus) r1
            if (r1 == 0) goto L_0x005e
            com.instagram.api.schemas.BrandedContentProjectAction r5 = com.instagram.api.schemas.BrandedContentProjectAction.ADD_MEDIA_TO_PROJECT
            java.lang.String r11 = r1.A05
            java.lang.String r7 = r1.A01
            java.lang.String r8 = r1.A02
            java.lang.String r12 = r1.A06
            java.lang.String r10 = r1.A04
            java.lang.String r9 = r1.A03
            r4 = 0
            com.instagram.api.schemas.BrandedContentProjectMetadata r3 = new com.instagram.api.schemas.BrandedContentProjectMetadata
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.Map r2 = r13.A08
            java.lang.String r1 = r0.getId()
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = r0.getId()
            r2.remove(r0)
            X.LdS r0 = X.C64526LdS.A00
            X.MPw[] r0 = new X.C66390MPw[]{r0}
            A04(r13, r0)
        L_0x0040:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            return r0
        L_0x0045:
            r2.clear()
            com.instagram.common.session.UserSession r2 = r13.A04
            X.0iw r1 = r13.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0X
            X.JVF.A01(r1, r2, r0)
            X.LdS r0 = X.C64526LdS.A00
            X.MPw[] r0 = new X.C66390MPw[]{r0}
            A04(r13, r0)
            A01(r3, r13)
            goto L_0x0040
        L_0x005e:
            java.util.Map r1 = r13.A08
            java.lang.String r2 = r0.getId()
            boolean r2 = r1.containsKey(r2)
            r6 = 1
            r8 = 5
            if (r2 == 0) goto L_0x0093
            java.lang.String r2 = r0.getId()
            r1.remove(r2)
            com.instagram.common.session.UserSession r4 = r13.A04
            X.0iw r3 = r13.A03
            java.lang.String r2 = r3.getModuleName()
            X.C64186LSt.A05(r3, r4, r2)
            r13.A05(r0, r7)
        L_0x0081:
            X.LdS r0 = X.C64526LdS.A00
            X.MPw[] r0 = new X.C66390MPw[]{r0}
            A04(r13, r0)
            java.util.Collection r0 = r1.values()
            java.util.ArrayList r0 = X.00k.A0U(r0)
            return r0
        L_0x0093:
            int r4 = r1.size()
            r3 = 2
            r5 = 4
            r2 = r21
            if (r4 >= r3) goto L_0x00ce
            boolean r3 = r0.A1v()
            r15 = 0
            if (r3 == 0) goto L_0x0114
            java.lang.String r3 = r0.getId()
            r1.put(r3, r0)
            r13.A05(r0, r6)
            com.instagram.common.session.UserSession r3 = r13.A04
            X.17i r3 = X.17h.A00(r3)
            r3.A01(r0, r7, r7)
        L_0x00b7:
            X.0eM r0 = r13.A0A
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0081
            if (r21 == 0) goto L_0x00ca
            X.K88 r0 = r2.A00
            X.0hq r0 = r0.getParentFragmentManager()
            r0.A13()
        L_0x00ca:
            A01(r15, r13)
            goto L_0x0081
        L_0x00ce:
            java.lang.String r3 = r13.A05
            int r0 = r3.hashCode()
            switch(r0) {
                case 3230752: goto L_0x00ea;
                case 3322092: goto L_0x00f4;
                case 3496474: goto L_0x00fe;
                case 109770997: goto L_0x0108;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            r3 = 2131954093(0x7f1309ad, float:1.9544675E38)
        L_0x00da:
            r15 = 0
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r19 = 2131954098(0x7f1309b2, float:1.9544686E38)
            X.HsR r14 = X.JTP.A0P(r3)
            goto L_0x0138
        L_0x00ea:
            java.lang.String r0 = "igtv"
            boolean r0 = r3.equals(r0)
            r3 = 2131954094(0x7f1309ae, float:1.9544678E38)
            goto L_0x0111
        L_0x00f4:
            java.lang.String r0 = "live"
            boolean r0 = r3.equals(r0)
            r3 = 2131954095(0x7f1309af, float:1.954468E38)
            goto L_0x0111
        L_0x00fe:
            java.lang.String r0 = "reel"
            boolean r0 = r3.equals(r0)
            r3 = 2131954096(0x7f1309b0, float:1.9544682E38)
            goto L_0x0111
        L_0x0108:
            java.lang.String r0 = "story"
            boolean r0 = r3.equals(r0)
            r3 = 2131954097(0x7f1309b1, float:1.9544684E38)
        L_0x0111:
            if (r0 != 0) goto L_0x00da
            goto L_0x00d7
        L_0x0114:
            X.4Cl r3 = r0.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r3 = r3.AcG()
            if (r3 == 0) goto L_0x0200
            int r4 = r3.ordinal()
            if (r4 == r8) goto L_0x0187
            if (r4 == r5) goto L_0x0281
            r3 = 3
            if (r4 != r3) goto L_0x0200
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r19 = 2131954168(0x7f1309f8, float:1.9544828E38)
            r0 = 2131954167(0x7f1309f7, float:1.9544826E38)
            X.HsR r14 = X.JTP.A0P(r0)
        L_0x0138:
            X.LAD r12 = new X.LAD
            r17 = r15
            r18 = r15
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
        L_0x0141:
            if (r21 == 0) goto L_0x0298
            X.K88 r5 = r2.A00
            X.8ab r4 = X.DbW.A0U(r5)
            int r0 = r12.A00
            r4.A09(r0)
            X.HsR r0 = r12.A01
            int r3 = r0.A00
            java.lang.Object[] r2 = r0.A01
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = r5.getString(r3, r0)
            r4.A0q(r0)
            java.lang.Integer r0 = r12.A02
            int r2 = r0.intValue()
            r0 = 14
            X.LV3 r0 = X.LV3.A00(r12, r0)
            X.8ae r3 = X.C358278ae.DEFAULT
            r4.A0P(r0, r3, r2)
            java.lang.Integer r0 = r12.A03
            if (r0 == 0) goto L_0x0182
            int r2 = r0.intValue()
            r0 = 15
            X.LV3 r0 = X.LV3.A00(r12, r0)
            r4.A0Q(r0, r3, r2)
        L_0x0182:
            X.DbT.A1V(r4)
            goto L_0x0081
        L_0x0187:
            java.lang.String r3 = r0.getId()
            r1.put(r3, r0)
            r13.A05(r0, r6)
            com.instagram.common.session.UserSession r5 = r13.A04
            X.0iw r4 = r13.A03
            java.lang.String r3 = r0.getId()
            r6 = 0
            X.C64186LSt.A01(r4, r5, r3)
            java.lang.String r4 = r13.A05
            int r3 = r4.hashCode()
            switch(r3) {
                case 3230752: goto L_0x01d6;
                case 3322092: goto L_0x01e0;
                case 3496474: goto L_0x01ea;
                case 109770997: goto L_0x01f4;
                default: goto L_0x01a6;
            }
        L_0x01a6:
            r4 = 2131954087(0x7f1309a7, float:1.9544663E38)
        L_0x01a9:
            java.lang.String r0 = r0.getUsername()
            X.HsR r5 = X.JTR.A0g(r0, r4)
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 39
            X.IwP r3 = new X.IwP
            r3.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r13)
            X.0eM r0 = r13.A0A
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x01c8
            r15 = r3
        L_0x01c8:
            r10 = 2131954092(0x7f1309ac, float:1.9544673E38)
            X.LAD r12 = new X.LAD
            r3 = r12
            r4 = r13
            r8 = r6
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0141
        L_0x01d6:
            java.lang.String r3 = "igtv"
            boolean r3 = r4.equals(r3)
            r4 = 2131954088(0x7f1309a8, float:1.9544665E38)
            goto L_0x01fd
        L_0x01e0:
            java.lang.String r3 = "live"
            boolean r3 = r4.equals(r3)
            r4 = 2131954089(0x7f1309a9, float:1.9544667E38)
            goto L_0x01fd
        L_0x01ea:
            java.lang.String r3 = "reel"
            boolean r3 = r4.equals(r3)
            r4 = 2131954090(0x7f1309aa, float:1.954467E38)
            goto L_0x01fd
        L_0x01f4:
            java.lang.String r3 = "story"
            boolean r3 = r4.equals(r3)
            r4 = 2131954091(0x7f1309ab, float:1.9544671E38)
        L_0x01fd:
            if (r3 != 0) goto L_0x01a9
            goto L_0x01a6
        L_0x0200:
            com.instagram.common.session.UserSession r3 = r13.A04
            java.lang.String r6 = r0.getId()
            X.0iw r5 = r13.A03
            X.0wc r4 = X.DbX.A0O(r5, r3)
            java.lang.String r3 = "ig_branded_content_permission_required_dialog_shown"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r3)
            java.lang.Long r3 = X.DbV.A0q(r6)
            X.C64186LSt.A00(r4, r5, r3)
            java.lang.String r4 = r13.A05
            int r3 = r4.hashCode()
            switch(r3) {
                case 3230752: goto L_0x0257;
                case 3322092: goto L_0x0261;
                case 3496474: goto L_0x026b;
                case 109770997: goto L_0x0275;
                default: goto L_0x0222;
            }
        L_0x0222:
            r4 = 2131954099(0x7f1309b3, float:1.9544688E38)
        L_0x0225:
            java.lang.String r3 = r0.getUsername()
            X.HsR r14 = X.JTR.A0g(r3, r4)
            r3 = 2131952275(0x7f130293, float:1.9540988E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            r3 = 45
            X.Iw5 r5 = new X.Iw5
            r5.<init>(r3, r2, r0, r13)
            r3 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
            r4 = 40
            X.IwP r3 = new X.IwP
            r3.<init>((int) r4, (java.lang.Object) r0, (java.lang.Object) r13)
            r19 = 2131954104(0x7f1309b8, float:1.9544698E38)
            X.LAD r12 = new X.LAD
            r17 = r5
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0141
        L_0x0257:
            java.lang.String r3 = "igtv"
            boolean r3 = r4.equals(r3)
            r4 = 2131954100(0x7f1309b4, float:1.954469E38)
            goto L_0x027e
        L_0x0261:
            java.lang.String r3 = "live"
            boolean r3 = r4.equals(r3)
            r4 = 2131954101(0x7f1309b5, float:1.9544692E38)
            goto L_0x027e
        L_0x026b:
            java.lang.String r3 = "reel"
            boolean r3 = r4.equals(r3)
            r4 = 2131954102(0x7f1309b6, float:1.9544694E38)
            goto L_0x027e
        L_0x0275:
            java.lang.String r3 = "story"
            boolean r3 = r4.equals(r3)
            r4 = 2131954103(0x7f1309b7, float:1.9544696E38)
        L_0x027e:
            if (r3 != 0) goto L_0x0225
            goto L_0x0222
        L_0x0281:
            java.lang.String r3 = r0.getId()
            r1.put(r3, r0)
            r13.A05(r0, r6)
            com.instagram.common.session.UserSession r4 = r13.A04
            X.0iw r3 = r13.A03
            java.lang.String r0 = r0.getId()
            X.C64186LSt.A01(r3, r4, r0)
            goto L_0x00b7
        L_0x0298:
            X.JjM r2 = r12.A06
            X.LdO r0 = new X.LdO
            r0.<init>(r12)
            X.MPw[] r0 = new X.C66390MPw[]{r0}
            A04(r2, r0)
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60318JjM.A06(X.Kzk, com.instagram.user.model.User):java.util.ArrayList");
    }

    public C60318JjM(BrandedContentDisclosureArgs brandedContentDisclosureArgs, BrandedContentProjectRepository brandedContentProjectRepository, BrandedContentApi brandedContentApi, AnonymousClass0iw r17, UserSession userSession) {
        AnonymousClass0iw r2 = r17;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1U(userSession2, r2, brandedContentDisclosureArgs);
        0qQ.A0B(brandedContentProjectRepository, 5);
        this.A04 = userSession2;
        this.A03 = r2;
        this.A00 = brandedContentDisclosureArgs;
        this.A02 = brandedContentApi;
        this.A01 = brandedContentProjectRepository;
        this.A05 = brandedContentDisclosureArgs.A03;
        this.A0D = brandedContentDisclosureArgs.A05;
        1HR A0o = JTQ.A0o();
        this.A0B = A0o;
        this.A0C = 0u9.A04(A0o);
        BrandedContentDisclosureArgs brandedContentDisclosureArgs2 = this.A00;
        List list = brandedContentDisclosureArgs2.A04;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = JTO.A0l(it).A00;
            if (user != null) {
                A1C.add(user);
            }
        }
        Iterator it2 = A1C.iterator();
        while (it2.hasNext()) {
            User A0k = DbT.A0k(it2);
            this.A08.put(A0k.getId(), A0k);
        }
        BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = brandedContentDisclosureArgs2.A01;
        if (brandedContentProjectMetadataIntf != null) {
            String Bhc = brandedContentProjectMetadataIntf.Bhc();
            String Bhd = brandedContentProjectMetadataIntf.Bhd();
            Bhd = Bhd == null ? "" : Bhd;
            String Ahf = brandedContentProjectMetadataIntf.Ahf();
            Ahf = Ahf == null ? "" : Ahf;
            String Ahm = brandedContentProjectMetadataIntf.Ahm();
            C60996Jus jus = new C60996Jus(brandedContentProjectMetadataIntf.Aa1(), C51971G9r.A0m(), Bhc, Bhd, Ahf, Ahm == null ? "" : Ahm, brandedContentProjectMetadataIntf.Ajv(), brandedContentProjectMetadataIntf.Aju(), (String) null);
            this.A09.put(jus.A00(), jus);
            if (brandedContentProjectMetadataIntf.AYA() == BrandedContentProjectAction.ADD_MEDIA_TO_PROJECT) {
                this.A08.put(jus.A00().getId(), jus.A00());
            }
        }
        MH8.A03(this, C318116oQ.A00(this), 17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r3.A1v() != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C66966Mfz A00(X.C60318JjM r2, com.instagram.user.model.User r3) {
        /*
            com.instagram.common.session.UserSession r0 = r2.A04
            boolean r0 = X.AnonymousClass430.A02(r0)
            if (r0 == 0) goto L_0x000e
            X.Mfz r2 = new X.Mfz
            r2.<init>()
            return r2
        L_0x000e:
            java.util.Map r1 = r2.A08
            java.lang.String r0 = r3.getId()
            boolean r0 = r1.containsKey(r0)
            X.Mfz r2 = new X.Mfz
            if (r0 == 0) goto L_0x003d
            r2.<init>()
            X.4Cl r0 = r3.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = r0.AcG()
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            if (r1 == r0) goto L_0x0032
            boolean r1 = r3.A1v()
            r0 = 2131969279(0x7f1344ff, float:1.9575476E38)
            if (r1 == 0) goto L_0x0035
        L_0x0032:
            r0 = 2131952452(0x7f130344, float:1.9541347E38)
        L_0x0035:
            X.JTT.A1R(r2, r0)
            X.4lo r0 = X.C273014lo.SECONDARY
        L_0x003a:
            r2.A03 = r0
            return r2
        L_0x003d:
            r2.<init>()
            r0 = 2131952258(0x7f130282, float:1.9540954E38)
            X.JTT.A1R(r2, r0)
            X.4lo r0 = X.C273014lo.PRIMARY
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60318JjM.A00(X.JjM, com.instagram.user.model.User):X.Mfz");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.instagram.api.schemas.BrandedContentProjectMetadata} */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.KPD, X.JbE] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r8.A03.AcG() == com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED) goto L_0x008d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.api.schemas.BrandedContentProjectMetadataIntf r18, X.C60318JjM r19) {
        /*
            r0 = r19
            r11 = r18
            if (r18 != 0) goto L_0x0046
            java.util.Map r1 = r0.A08
            java.util.Iterator r4 = X.AnonymousClass7TF.A0v(r1)
        L_0x000c:
            boolean r1 = r4.hasNext()
            r11 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.Object r3 = r4.next()
            java.util.Map r2 = r0.A09
            boolean r1 = r2.containsKey(r3)
            if (r1 == 0) goto L_0x000c
            if (r3 == 0) goto L_0x0046
            java.lang.Object r1 = r2.get(r3)
            X.Jus r1 = (X.C60996Jus) r1
            if (r1 == 0) goto L_0x0046
            com.instagram.api.schemas.BrandedContentProjectAction r12 = com.instagram.api.schemas.BrandedContentProjectAction.ADD_MEDIA_TO_PROJECT
            java.lang.String r4 = r1.A05
            java.lang.String r14 = r1.A01
            java.lang.String r15 = r1.A02
            java.lang.String r3 = r1.A06
            java.lang.String r2 = r1.A04
            java.lang.String r1 = r1.A03
            com.instagram.api.schemas.BrandedContentProjectMetadata r10 = new com.instagram.api.schemas.BrandedContentProjectMetadata
            r13 = r11
            r17 = r2
            r18 = r4
            r19 = r3
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r11 = r10
        L_0x0046:
            java.util.Map r9 = r0.A08
            java.util.Collection r1 = r9.values()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x0054:
            boolean r1 = r3.hasNext()
            r7 = 1
            if (r1 == 0) goto L_0x0069
            java.lang.Object r2 = r3.next()
            java.util.Map r1 = r0.A09
            boolean r1 = r1.containsKey(r2)
            X.DbV.A1U(r2, r4, r1)
            goto L_0x0054
        L_0x0069:
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r10 = r4.iterator()
        L_0x0071:
            boolean r1 = r10.hasNext()
            r5 = 0
            if (r1 == 0) goto L_0x00a7
            com.instagram.user.model.User r8 = X.DbT.A0k(r10)
            boolean r1 = r8.A1v()
            if (r1 != 0) goto L_0x008d
            X.4Cl r1 = r8.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r2 = r1.AcG()
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            r4 = 1
            if (r2 != r1) goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            int r1 = r9.size()
            if (r1 > r7) goto L_0x009e
            com.instagram.common.session.UserSession r3 = r0.A04
            java.lang.String r2 = r0.A05
            boolean r1 = r0.A0D
            boolean r5 = X.C347037wA.A06(r3, r2, r5, r1)
        L_0x009e:
            com.instagram.pendingmedia.model.BrandedContentTag r1 = new com.instagram.pendingmedia.model.BrandedContentTag
            r1.<init>(r8, r5, r4)
            r6.add(r1)
            goto L_0x0071
        L_0x00a7:
            if (r11 == 0) goto L_0x00ab
            X.0sn r6 = X.0sn.A00
        L_0x00ab:
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs r2 = r0.A00
            r2.A07 = r7
            r2.A04 = r6
            r2.A01 = r11
            r2.A06 = r7
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r4 = r2.A00
            java.lang.String r1 = "branded_content_menu"
            X.KPD r3 = new X.KPD
            r3.<init>(r1)
            r3.A05 = r7
            r3.A02 = r6
            r3.A01 = r11
            r3.A00 = r4
            r3.A04 = r5
            r3.A03 = r5
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r6)
            java.lang.String r1 = "brand_partners"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r1, r4)
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r4 = r2.A01
            java.lang.String r1 = "project_metadata"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r1, r4)
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r4 = r2.A00
            java.lang.String r1 = "BRANDED_CONTENT_GATING_INFO"
            X.0eP r8 = X.AnonymousClass7TE.A1L(r1, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            java.lang.String r1 = "disclosure_fragment_entered_from_brand_search"
            X.0eP r9 = X.AnonymousClass7TE.A1L(r1, r4)
            java.lang.String r1 = "disclosure_fragment_is_edit_flow"
            X.0eP r10 = X.AnonymousClass7TE.A1L(r1, r4)
            boolean r1 = r2.A07
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "disclosure_fragment_is_paid_partnership_on"
            X.0eP r11 = X.AnonymousClass7TE.A1L(r1, r5)
            java.lang.String r5 = r2.A03
            java.lang.String r1 = "ARGUMENT_MEDIA_TYPE"
            X.0eP r12 = X.AnonymousClass7TE.A1L(r1, r5)
            java.lang.String r5 = r2.A02
            java.lang.String r1 = "ARGUMENT_MEDIA_ID"
            X.0eP r13 = X.AnonymousClass7TE.A1L(r1, r5)
            boolean r1 = r2.A05
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r1 = 408(0x198, float:5.72E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0eP r14 = X.AnonymousClass7TE.A1L(r1, r5)
            java.lang.String r1 = "includes_suspected_sponsor"
            X.0eP r15 = X.AnonymousClass7TE.A1L(r1, r4)
            boolean r1 = r2.A06
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "is_from_consolidated"
            X.0eP r16 = X.AnonymousClass7TE.A1L(r1, r2)
            X.0eP[] r1 = new X.0eP[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            android.os.Bundle r2 = X.Q21.A00(r1)
            X.LdQ r1 = new X.LdQ
            r1.<init>(r2, r3)
            X.MPw[] r1 = new X.C66390MPw[]{r1}
            A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60318JjM.A01(com.instagram.api.schemas.BrandedContentProjectMetadataIntf, X.JjM):void");
    }

    public static final void A03(C60318JjM jjM, String str) {
        UserSession userSession = jjM.A04;
        JVF.A04(jjM.A03, userSession, AnonymousClass05K.A0W, userSession.A06, AnonymousClass7TF.A0w("action_type", str));
    }

    private final void A05(User user, boolean z) {
        String str;
        if (z) {
            str = "added";
        } else {
            str = "removed";
        }
        UserSession userSession = this.A04;
        JVF.A04(this.A03, userSession, AnonymousClass05K.A0D, userSession.A06, DbY.A0q("has_brand_approval", String.valueOf(user.A1v()), AnonymousClass7TE.A1L("brand_id", user.getId()), AnonymousClass7TE.A1L("action_type", str)));
    }

    public static final void A02(C60318JjM jjM, C14487Tx9 tx9, Integer num, String str, String str2, List list, boolean z) {
        C61069Jw7 A022;
        boolean z2 = true;
        if (!list.isEmpty()) {
            int i = 3;
            if (!z || list.size() <= 3) {
                z2 = false;
                A022 = C18690Vwo.A02(str);
            } else {
                0qQ.A0B(str, 0);
                A022 = new C61069Jw7((C266444Yx) new C52255GKw(str), AnonymousClass05K.A0C, num);
            }
            JTT.A1Q(tx9, A022);
            if (str2 != null) {
                tx9.A04(AnonymousClass05K.A00, new C61069Jw7((CharSequence) str2, (CharSequence) null, (CharSequence) null));
            }
            if (!z2) {
                i = list.size();
            }
            Iterator it = 00k.A0d(list, i).iterator();
            while (it.hasNext()) {
                User A0k = DbT.A0k(it);
                tx9.A03(A00(jjM, A0k), new C66632Ma1(A0k));
            }
        }
    }

    public static final void A04(C60318JjM jjM, C66390MPw... mPwArr) {
        AnonymousClass7TE.A1Z(new C58096ImI(mPwArr, jjM, (AnonymousClass4D7) null, 0), C318116oQ.A00(jjM));
    }
}
