package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E1K extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LinksListFragment";
    public 1Xj A00;
    public C323206x7 A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "links_sheet";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.6xI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r12v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d1, code lost:
        if (r12.length() == 0) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
        if (r12 != 0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d6, code lost:
        r10 = r12.length();
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00da, code lost:
        if (r10 == 0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dc, code lost:
        r12 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        r0 = new X.C47181Drw(r0.BMt(), r14, r12, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
        if (r12.length() == 0) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0153, code lost:
        if (r12 != 0) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0159, code lost:
        if (r12.length() != 0) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015c, code lost:
        r12 = r0.BMt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0160, code lost:
        if (r14 != null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0162, code lost:
        r14 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0164, code lost:
        r0 = new X.C47181Drw(r12, r10, r11, r14);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r31, android.os.Bundle r32) {
        /*
            r30 = this;
            r7 = 0
            r8 = r31
            X.0qQ.A0B(r8, r7)
            r5 = r30
            r0 = r32
            super.onViewCreated(r8, r0)
            r0 = 2131435521(0x7f0b2001, float:1.8492887E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r8, r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            android.content.Context r1 = r5.requireContext()
            r0 = 1
            X.DbU.A15(r1, r6, r0, r7)
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "LinksListFragment.USER_ID"
            java.lang.String r19 = r1.getString(r0)
            X.0eM r0 = r5.A02
            r29 = r0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r29)
            r0 = r19
            com.instagram.user.model.User r4 = X.DbV.A0j(r1, r0)
            if (r4 == 0) goto L_0x0230
            X.1Xj r1 = r5.A00
            if (r1 == 0) goto L_0x0043
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r29)
            X.C267154b3.A00(r8, r5, r0, r1)
        L_0x0043:
            android.content.Context r3 = r5.requireContext()
            X.6x7 r9 = r5.A01
            X.1Xj r0 = r5.A00
            r28 = r0
            java.util.LinkedList r18 = new java.util.LinkedList
            r18.<init>()
            X.4Cl r0 = r4.A03
            java.util.List r2 = r0.Afp()
            if (r2 == 0) goto L_0x01f9
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01f9
            int r13 = r2.size()
            r1 = 0
        L_0x0065:
            r12 = 0
            if (r1 >= r13) goto L_0x01c7
            java.lang.Object r0 = r2.get(r1)
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r10 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r11 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            boolean r17 = X.AnonymousClass7TF.A1W(r10, r11)
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r14 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r10 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            boolean r16 = X.AnonymousClass7TF.A1W(r14, r10)
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r15 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r14 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_GROUP
            boolean r14 = X.AnonymousClass7TF.A1W(r15, r14)
            if (r17 == 0) goto L_0x00f1
            X.4Cl r10 = r4.A03
            X.3rB r11 = r10.BMx()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r29)
            boolean r10 = X.C3250170s.A00(r0, r10, r4)
            if (r10 == 0) goto L_0x00ed
            if (r11 == 0) goto L_0x00aa
            X.4EU r10 = r11.BMz()
            if (r10 == 0) goto L_0x00aa
            java.lang.String r12 = r10.getName()
        L_0x00aa:
            java.lang.String r11 = r0.getTitle()
            X.5Bj r15 = r0.B45()
            if (r15 == 0) goto L_0x00ca
            java.lang.String r10 = r15.AyC()
            if (r10 == 0) goto L_0x00ca
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x00ca
            java.lang.String r14 = " · "
            java.lang.String r10 = r15.AyC()
            java.lang.String r11 = X.002.A0g(r11, r14, r10)
        L_0x00ca:
            if (r12 == 0) goto L_0x00d3
            int r10 = r12.length()
            r14 = r12
            if (r10 != 0) goto L_0x00d6
        L_0x00d3:
            r14 = r11
            if (r12 == 0) goto L_0x00dd
        L_0x00d6:
            int r10 = r12.length()
            if (r10 == 0) goto L_0x00dd
            r12 = r11
        L_0x00dd:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r11 = r0.BMt()
            java.lang.String r10 = ""
            X.Drw r0 = new X.Drw
            r0.<init>(r11, r14, r12, r10)
        L_0x00e8:
            r10 = r18
            r10.add(r0)
        L_0x00ed:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x00f1:
            java.lang.String r17 = ""
            if (r16 == 0) goto L_0x016b
            X.4Cl r10 = r4.A03
            X.3rB r11 = r10.BMx()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r29)
            boolean r10 = X.C46427Deo.A02(r10, r4)
            if (r10 == 0) goto L_0x00ed
            if (r11 == 0) goto L_0x0111
            X.5Bm r10 = r11.BMy()
            if (r10 == 0) goto L_0x0111
            java.lang.String r12 = r10.getName()
        L_0x0111:
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r29)
            java.lang.String r14 = X.C46427Deo.A00(r3, r0, r10)
            java.lang.String r11 = r0.BOm()
            if (r14 == 0) goto L_0x0125
            int r10 = r14.length()
            if (r10 != 0) goto L_0x0126
        L_0x0125:
            r14 = r11
        L_0x0126:
            r10 = 2131970022(0x7f1347e6, float:1.9576983E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r3, r10)
            X.5Bj r16 = r0.B45()
            if (r16 == 0) goto L_0x0149
            java.lang.String r10 = r16.AyC()
            if (r10 == 0) goto L_0x0149
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x0149
            java.lang.String r15 = " · "
            java.lang.String r10 = r16.AyC()
            java.lang.String r11 = X.002.A0g(r11, r15, r10)
        L_0x0149:
            if (r12 == 0) goto L_0x0152
            int r15 = r12.length()
            r10 = r12
            if (r15 != 0) goto L_0x0155
        L_0x0152:
            r10 = r11
            if (r12 == 0) goto L_0x015b
        L_0x0155:
            int r15 = r12.length()
            if (r15 != 0) goto L_0x015c
        L_0x015b:
            r11 = r12
        L_0x015c:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r12 = r0.BMt()
            if (r14 != 0) goto L_0x0164
            r14 = r17
        L_0x0164:
            X.Drw r0 = new X.Drw
            r0.<init>(r12, r10, r11, r14)
            goto L_0x00e8
        L_0x016b:
            if (r14 != 0) goto L_0x00ed
            java.lang.String r22 = r0.getTitle()
            int r12 = r22.length()
            if (r12 != 0) goto L_0x017b
            java.lang.String r22 = X.C49073Eor.A00(r0)
        L_0x017b:
            java.lang.String r12 = r0.getTitle()
            int r12 = r12.length()
            if (r12 != 0) goto L_0x01c2
            r23 = r17
        L_0x0187:
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r29)
            java.lang.String r24 = X.C46427Deo.A00(r3, r0, r12)
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r21 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r12 = r0.BMt()
            if (r12 == r11) goto L_0x019f
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r11 = r0.BMt()
            if (r11 != r10) goto L_0x01a1
        L_0x019f:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r21 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.EXTERNAL
        L_0x01a1:
            java.lang.String r25 = r0.BOm()
            if (r24 != 0) goto L_0x01a9
            r24 = r17
        L_0x01a9:
            r26 = 2131238496(0x7f081e60, float:1.8093272E38)
            java.lang.Boolean r0 = r0.BYO()
            if (r0 == 0) goto L_0x01bf
            boolean r27 = r0.booleanValue()
        L_0x01b6:
            X.Drw r0 = new X.Drw
            r20 = r0
            r20.<init>((com.instagram.api.schemas.IgUserBioLinkTypeEnum) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (int) r26, (boolean) r27)
            goto L_0x00e8
        L_0x01bf:
            r27 = 1
            goto L_0x01b6
        L_0x01c2:
            java.lang.String r23 = X.C49073Eor.A00(r0)
            goto L_0x0187
        L_0x01c7:
            if (r9 == 0) goto L_0x01d1
            X.0eM r0 = r9.A0h
            java.lang.Object r12 = r0.getValue()
            X.6xI r12 = (X.C323316xI) r12
        L_0x01d1:
            X.E94 r3 = new X.E94
            r9 = r3
            r10 = r5
            r11 = r28
            r13 = r4
            r14 = r18
            r9.<init>(r10, r11, r12, r13, r14)
            r6.setAdapter(r3)
            java.util.List r0 = r3.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x01e6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01f6
            java.lang.Object r1 = r2.next()
            X.EAc r0 = r3.A00
            r3.addModel(r1, r0)
            goto L_0x01e6
        L_0x01f6:
            r3.notifyDataSetChanged()
        L_0x01f9:
            r0 = r29
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r7)
            java.lang.Boolean r0 = X.AnonymousClass35I.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0230
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342172144706273100(0x2081112800083f4c, double:4.0733320030024105E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0230
            r0 = 2131435522(0x7f0b2002, float:1.8492889E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r8, r0)
            X.0xx r1 = X.DbV.A0J(r5)
            r6 = 0
            r7 = 20
            X.MH7 r0 = new X.MH7
            r2 = r0
            r3 = r5
            r5 = r19
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.String) r5, (X.AnonymousClass4D7) r6, (int) r7)
            X.AnonymousClass7TE.A1Z(r0, r1)
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1K.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1022669996);
        E1K.super.onCreate(bundle);
        AnonymousClass0fD.A09(-305611820, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1783480182);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_links_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-900885264, A022);
        return inflate;
    }
}
