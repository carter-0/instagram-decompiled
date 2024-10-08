package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FRV implements CallerContextable {
    public static final String __redex_internal_original_name = "GetMultipleLinksAccountTypesCommand";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: com.instagram.profile.bindergroup.AccountLinkModel$FacebookPageLinkData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkDataV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x020b, code lost:
        if (r14 != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020d, code lost:
        r6.add(new com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookLinkData(X.AnonymousClass7TE.A16(r3, 2131970009), r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x021d, code lost:
        X.0qQ.A07(r2);
        r1 = new com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataV2(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0226, code lost:
        r6 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022e, code lost:
        if (r6.hasNext() == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023c, code lost:
        if (((X.C253443qn) r6.next()).BMt() != com.instagram.api.schemas.IgUserBioLinkTypeEnum.EXTERNAL) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x023e, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0248, code lost:
        if (X.182.A06(r4, r0, 36315078064475095L) == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x024c, code lost:
        r6 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0254, code lost:
        if (r6.hasNext() == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0262, code lost:
        if (((X.C253443qn) r6.next()).BMt() != com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0264, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        if (X.182.A06(r4, r0, 36320120356937763L) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (X.182.A06(r4, r0, 36320120356937763L) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0165, code lost:
        if (r2 != null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0169, code lost:
        if ((r2 instanceof java.util.Collection) == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016f, code lost:
        if (r2.isEmpty() == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0171, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0172, code lost:
        if (r2 == null) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0174, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0184, code lost:
        if (r2.size() >= X.DbS.A04(X.0Tu.A06, r0, 36596553040923169L)) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0186, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0187, code lost:
        if (r2 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018b, code lost:
        if ((r2 instanceof java.util.Collection) == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0191, code lost:
        if (r2.isEmpty() == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0193, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0194, code lost:
        r6 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0198, code lost:
        if (r2 != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019a, code lost:
        r9 = A00(r0, r8, true);
        r2 = r3.getString(2131970008);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a5, code lost:
        if (r9 == false) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a7, code lost:
        X.0qQ.A07(r2);
        r1 = new com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataEnhanced(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01af, code lost:
        r6.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
        if (r7 == null) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b4, code lost:
        r6.addAll(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b7, code lost:
        if (r15 == false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b9, code lost:
        if (r13 != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bb, code lost:
        r6.add(new com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookPageLinkData(X.AnonymousClass7TE.A16(r3, 2131970010), r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d5, code lost:
        if (X.182.A06(X.0Tu.A06, r0, 36321576349672982L) == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e1, code lost:
        if (X.2Lv.A00(r0).A00(r10, "ig_to_fb_sharing_account") != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ec, code lost:
        if (X.182.A06(r4, r0, 36321576350066204L) == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f2, code lost:
        if (A00(r0, r8, false) == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f4, code lost:
        r2 = X.C49074Eos.A00(r3, r27, r0, X.AnonymousClass05K.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fc, code lost:
        if (r2 == null) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fe, code lost:
        r6.add(new com.instagram.profile.bindergroup.AccountLinkModel.BottomMessageData("", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0208, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0209, code lost:
        if (r16 == false) goto L_0x01ee;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01(android.content.Context r25, X.C253663rB r26, X.AnonymousClass0iw r27, com.instagram.common.session.UserSession r28, com.instagram.user.model.User r29) {
        /*
            r24 = this;
            r11 = 0
            r9 = 1
            r0 = r28
            X.0Tu r4 = X.DbS.A0J(r0, r9)
            r1 = 36315078064278486(0x81045f00030bd6, double:3.029139824707361E-306)
            boolean r1 = X.182.A06(r4, r0, r1)
            if (r1 == 0) goto L_0x0020
            r1 = 36320120356937763(0x8108f500132023, double:3.032328590888771E-306)
            boolean r1 = X.182.A06(r4, r0, r1)
            r16 = 1
            if (r1 == 0) goto L_0x0022
        L_0x0020:
            r16 = 0
        L_0x0022:
            java.lang.Class<X.FRV> r14 = X.FRV.class
            com.facebook.common.callercontext.CallerContext r10 = com.facebook.common.callercontext.CallerContext.A00(r14)
            java.lang.String r19 = "ig_android_ig_business_asset_fb_profile_discovery"
            java.lang.String r20 = "ig_add_fb_page_link"
            java.lang.String r21 = "add_fb_page_link"
            java.lang.String r22 = "loading"
            X.9JK r2 = new X.9JK
            r17 = r2
            r18 = r10
            r17.<init>((com.facebook.common.callercontext.CallerContext) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22)
            X.9F7 r1 = X.DbV.A0O(r0)
            java.lang.Object r1 = r1.Au3(r2)
            X.Dfh r1 = (X.C46478Dfh) r1
            if (r1 == 0) goto L_0x006c
            X.9Gd r1 = r1.A00
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = r1.A00(r2, r0)
            if (r1 == 0) goto L_0x006c
            boolean r1 = X.00l.A0W(r1)
            if (r1 != 0) goto L_0x006c
            r1 = 36320120355823642(0x8108f50002201a, double:3.032328590184196E-306)
            boolean r1 = X.182.A06(r4, r0, r1)
            if (r1 == 0) goto L_0x006c
            r1 = 36320120356937763(0x8108f500132023, double:3.032328590888771E-306)
            boolean r1 = X.182.A06(r4, r0, r1)
            r15 = 1
            if (r1 == 0) goto L_0x006d
        L_0x006c:
            r15 = 0
        L_0x006d:
            r8 = r29
            X.4Cl r1 = r8.A03
            java.util.List r2 = r1.Afp()
            r3 = r25
            if (r2 == 0) goto L_0x0158
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r2.iterator()
        L_0x0081:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x015a
            java.lang.Object r1 = r13.next()
            X.3qn r1 = (X.C253443qn) r1
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r12 = r1.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r5 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            r6 = 0
            if (r12 != r5) goto L_0x00bc
            if (r16 == 0) goto L_0x0081
            X.2Ly r6 = X.2Lv.A00(r0)
            com.facebook.common.callercontext.CallerContext r5 = com.facebook.common.callercontext.CallerContext.A00(r14)
            java.lang.String r1 = "ig_android_linking_cache_igxfb_fb_profile_link"
            fxcache.model.FxCalAccount r1 = r6.A01(r5, r1)
            if (r1 == 0) goto L_0x00ba
            java.lang.String r6 = r1.A06
        L_0x00aa:
            r1 = 2131970023(0x7f1347e7, float:1.9576985E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r3, r1)
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkDataV2 r1 = new com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkDataV2
            r1.<init>(r5, r6)
        L_0x00b6:
            r7.add(r1)
            goto L_0x0081
        L_0x00ba:
            r6 = 0
            goto L_0x00aa
        L_0x00bc:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r12 = r1.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r5 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            if (r12 != r5) goto L_0x00df
            if (r15 == 0) goto L_0x0081
            r1 = 2131970022(0x7f1347e6, float:1.9576983E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r3, r1)
            if (r26 == 0) goto L_0x00d9
            X.5Bm r1 = r26.BMy()
            if (r1 == 0) goto L_0x00d9
            java.lang.String r6 = r1.getName()
        L_0x00d9:
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookPageLinkData r1 = new com.instagram.profile.bindergroup.AccountLinkModel$FacebookPageLinkData
            r1.<init>(r5, r6)
            goto L_0x00b6
        L_0x00df:
            java.lang.String r5 = r1.getTitle()
            int r5 = r5.length()
            if (r5 != 0) goto L_0x010d
            boolean r5 = A00(r0, r8, r9)
            if (r5 == 0) goto L_0x0134
            java.lang.String r18 = X.C49073Eor.A00(r1)
            java.lang.String r20 = r1.BMn()
            java.lang.String r21 = r1.BGL()
            java.lang.String r22 = r1.BEP()
            boolean r23 = r1.CZA()
            java.lang.String r19 = ""
        L_0x0105:
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced r1 = new com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x00b6
        L_0x010d:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r6 = r1.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r5 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_GROUP
            if (r6 == r5) goto L_0x0081
            boolean r5 = A00(r0, r8, r9)
            if (r5 == 0) goto L_0x0145
            java.lang.String r18 = r1.getTitle()
            java.lang.String r19 = X.C49073Eor.A00(r1)
            java.lang.String r20 = r1.BMn()
            java.lang.String r21 = r1.BGL()
            java.lang.String r22 = r1.BEP()
            boolean r23 = r1.CZA()
            goto L_0x0105
        L_0x0134:
            java.lang.String r12 = X.C49073Eor.A00(r1)
            java.lang.String r6 = r1.BMn()
            java.lang.String r5 = ""
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2 r1 = new com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2
            r1.<init>(r12, r5, r6)
            goto L_0x00b6
        L_0x0145:
            java.lang.String r12 = r1.getTitle()
            java.lang.String r6 = X.C49073Eor.A00(r1)
            java.lang.String r5 = r1.BMn()
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2 r1 = new com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2
            r1.<init>(r12, r6, r5)
            goto L_0x00b6
        L_0x0158:
            r7 = 0
            goto L_0x0164
        L_0x015a:
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0267
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0267
        L_0x0164:
            r14 = 0
            if (r2 == 0) goto L_0x0171
        L_0x0167:
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x024c
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x024c
        L_0x0171:
            r13 = 0
            if (r2 == 0) goto L_0x0186
        L_0x0174:
            int r12 = r2.size()
            X.0Tu r1 = X.0Tu.A06
            r5 = 36596553040923169(0x82045f00020a21, double:3.2071457333462157E-306)
            int r1 = X.DbS.A04(r1, r0, r5)
            r5 = 1
            if (r12 >= r1) goto L_0x0189
        L_0x0186:
            r5 = 0
            if (r2 == 0) goto L_0x0193
        L_0x0189:
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0226
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0226
        L_0x0193:
            r2 = 0
        L_0x0194:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            if (r2 != 0) goto L_0x01b2
            boolean r9 = A00(r0, r8, r9)
            r1 = 2131970008(0x7f1347d8, float:1.9576955E38)
            java.lang.String r2 = r3.getString(r1)
            if (r9 == 0) goto L_0x021d
            X.0qQ.A07(r2)
            com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataEnhanced r1 = new com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataEnhanced
            r1.<init>(r2, r5)
        L_0x01af:
            r6.add(r1)
        L_0x01b2:
            if (r7 == 0) goto L_0x01b7
            r6.addAll(r7)
        L_0x01b7:
            if (r15 == 0) goto L_0x01ca
            if (r13 != 0) goto L_0x01ca
            r1 = 2131970010(0x7f1347da, float:1.957696E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r1)
            com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookPageLinkData r1 = new com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookPageLinkData
            r1.<init>(r2, r5)
            r6.add(r1)
        L_0x01ca:
            X.0Tu r7 = X.0Tu.A06
            r1 = 36321576349672982(0x810a4800012616, double:3.0332493665573354E-306)
            boolean r1 = X.182.A06(r7, r0, r1)
            if (r1 == 0) goto L_0x0209
            X.2Ly r2 = X.2Lv.A00(r0)
            java.lang.String r1 = "ig_to_fb_sharing_account"
            boolean r1 = r2.A00(r10, r1)
            if (r1 != 0) goto L_0x0209
            r1 = 36321576350066204(0x810a480007261c, double:3.0332493668060106E-306)
            boolean r1 = X.182.A06(r4, r0, r1)
            if (r1 == 0) goto L_0x0209
        L_0x01ee:
            boolean r1 = A00(r0, r8, r11)
            if (r1 == 0) goto L_0x0208
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2 = r27
            android.text.SpannableStringBuilder r2 = X.C49074Eos.A00(r3, r2, r0, r1)
            if (r2 == 0) goto L_0x0208
            java.lang.String r1 = ""
            com.instagram.profile.bindergroup.AccountLinkModel$BottomMessageData r0 = new com.instagram.profile.bindergroup.AccountLinkModel$BottomMessageData
            r0.<init>(r1, r2)
            r6.add(r0)
        L_0x0208:
            return r6
        L_0x0209:
            if (r16 == 0) goto L_0x01ee
            if (r14 != 0) goto L_0x01ee
            r1 = 2131970009(0x7f1347d9, float:1.9576957E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r1)
            com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookLinkData r1 = new com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookLinkData
            r1.<init>(r2, r5)
            r6.add(r1)
            goto L_0x01ee
        L_0x021d:
            X.0qQ.A07(r2)
            com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataV2 r1 = new com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataV2
            r1.<init>(r2, r5)
            goto L_0x01af
        L_0x0226:
            java.util.Iterator r6 = r2.iterator()
        L_0x022a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0193
            java.lang.Object r1 = r6.next()
            X.3qn r1 = (X.C253443qn) r1
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r2 = r1.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.EXTERNAL
            if (r2 != r1) goto L_0x022a
            r1 = 36315078064475095(0x81045f00060bd7, double:3.0291398248316975E-306)
            boolean r1 = X.182.A06(r4, r0, r1)
            r2 = 1
            if (r1 == 0) goto L_0x0194
            goto L_0x0193
        L_0x024c:
            java.util.Iterator r6 = r2.iterator()
        L_0x0250:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0171
            java.lang.Object r1 = r6.next()
            X.3qn r1 = (X.C253443qn) r1
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r5 = r1.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            if (r5 != r1) goto L_0x0250
            r13 = 1
            goto L_0x0174
        L_0x0267:
            java.util.Iterator r6 = r2.iterator()
        L_0x026b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0164
            java.lang.Object r1 = r6.next()
            X.3qn r1 = (X.C253443qn) r1
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r5 = r1.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            if (r5 != r1) goto L_0x026b
            r14 = 1
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRV.A01(android.content.Context, X.3rB, X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User):java.util.ArrayList");
    }

    public static final boolean A00(UserSession userSession, User user, boolean z) {
        0Tu r2;
        Boolean CS6 = user.A03.CS6();
        if (CS6 != null && CS6.booleanValue()) {
            0qQ.A0B(userSession, 0);
            if (z) {
                r2 = 0Tu.A06;
            } else {
                r2 = 0Tu.A05;
            }
            if (!182.A06(r2, userSession, 36322821890517458L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
