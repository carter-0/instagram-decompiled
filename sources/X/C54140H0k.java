package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.H0k  reason: case insensitive filesystem */
public final class C54140H0k extends AnonymousClass4DH implements AnonymousClass0iw, AnonymousClass4DU, C20898X3p {
    public static final String __redex_internal_original_name = "WorldPagesDetailFragment";
    public HOV A00;
    public HAI A01;
    public 1Xj A02;
    public AnonymousClass32A A03;
    public GradientSpinnerAvatarView A04;
    public final String A05 = __redex_internal_original_name;
    public final String A06 = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: X.0iw} */
    /* JADX WARNING: type inference failed for: r20v2, types: [X.2s5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v9, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r33, android.os.Bundle r34) {
        /*
            r32 = this;
            r2 = 0
            r0 = r33
            X.0qQ.A0B(r0, r2)
            r1 = r32
            r3 = r34
            super.onViewCreated(r0, r3)
            r3 = 2131436295(0x7f0b2307, float:1.8494456E38)
            android.widget.TextView r12 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = 2131438088(0x7f0b2a08, float:1.8498093E38)
            android.widget.TextView r11 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = 2131438087(0x7f0b2a07, float:1.849809E38)
            android.view.View r10 = X.AnonymousClass7TF.A0F(r0, r3)
            r3 = 2131444046(0x7f0b414e, float:1.8510177E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = 2131438028(0x7f0b29cc, float:1.8497971E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = 2131436536(0x7f0b23f8, float:1.8494945E38)
            android.view.View r13 = X.AnonymousClass7TF.A0G(r0, r3)
            r3 = 2131444050(0x7f0b4152, float:1.8510185E38)
            android.view.View r3 = r0.requireViewById(r3)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r3
            r1.A04 = r3
            if (r3 == 0) goto L_0x0047
            r3.setGradientSpinnerActivated(r2)
        L_0x0047:
            X.0eM r3 = r1.A08
            r31 = r3
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r31)
            X.328 r3 = new X.328
            r3.<init>(r1)
            X.32A r4 = new X.32A
            r4.<init>(r1, r5, r3)
            java.lang.String r3 = X.AnonymousClass7TF.A0b()
            r4.A0C = r3
            r1.A03 = r4
            android.content.Context r8 = r0.getContext()
            r3 = 2131976903(0x7f1362c7, float:1.959094E38)
            android.text.SpannableStringBuilder r14 = X.DbW.A08(r8, r3)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r8, r3)
            android.content.Context r5 = r1.getContext()
            r4 = 0
            if (r5 == 0) goto L_0x0273
            android.content.Context r3 = r1.getContext()
            int r3 = X.2Yu.A06(r3)
            int r3 = r5.getColor(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x0087:
            X.HFw r3 = new X.HFw
            r3.<init>((X.C54140H0k) r1, (java.lang.Integer) r5)
            X.AnonymousClass7AV.A05(r14, r3, r9)
            r12.setText(r14)
            X.03v.A07(r12)
            X.DbT.A1H(r12)
            X.1Xj r3 = r1.A02
            java.lang.String r16 = "entryMedia"
            if (r3 == 0) goto L_0x0276
            X.JSO r5 = X.C51966G9m.A0l(r3)
            r3 = 1
            if (r5 == 0) goto L_0x00ba
            java.lang.Integer r9 = r5.BES()
            if (r9 == 0) goto L_0x00ba
            int r5 = r9.intValue()
            if (r5 <= 0) goto L_0x00ba
            r5 = 2131976904(0x7f1362c8, float:1.9590942E38)
            X.DbX.A13(r8, r11, r9, r5)
            r10.setVisibility(r2)
        L_0x00ba:
            X.1Xj r5 = r1.A02
            if (r5 == 0) goto L_0x0276
            X.JSO r5 = X.C51966G9m.A0l(r5)
            if (r5 == 0) goto L_0x0260
            java.lang.String r5 = r5.getIconicHorizonWorldName()
            if (r5 == 0) goto L_0x0260
        L_0x00ca:
            r6.setText(r5)
            r9 = 2131969691(0x7f13469b, float:1.9576312E38)
            X.1Xj r5 = r1.A02
            if (r5 == 0) goto L_0x0276
            X.JSO r5 = X.C51966G9m.A0l(r5)
            if (r5 == 0) goto L_0x025d
            com.instagram.api.schemas.WorldLocationPagesInfo r5 = r5.CGk()
            if (r5 == 0) goto L_0x025d
            java.lang.Integer r6 = r5.Be3()
        L_0x00e4:
            android.content.res.Resources r5 = r8.getResources()
            java.lang.String r5 = X.C14066TpE.A00(r5, r6, r4, r2)
            X.DbX.A13(r8, r7, r5, r9)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r31)
            X.Uz8 r5 = X.C16672Uz8.TOP
            java.util.List r12 = X.AnonymousClass7TE.A1I(r5)
            X.0eM r15 = r1.A07
            java.lang.Object r6 = r15.getValue()
            X.Ghd r6 = (X.C53045Ghd) r6
            X.72b r10 = new X.72b
            r10.<init>()
            X.IRM r9 = X.IRM.A00
            r8 = r5
            r11 = r6
            X.HAI r6 = X.HAI.A01(r7, r8, r9, r10, r11, r12)
            r1.A01 = r6
            androidx.fragment.app.FragmentActivity r16 = r1.requireActivity()
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r31)
            java.lang.String r7 = r1.A06
            r20 = -1
            r18 = r1
            r19 = r7
            r22 = r2
            r23 = r3
            X.X9Q r9 = X.C16942VBu.A00(r16, r17, r18, r19, r20, r22, r23)
            X.2el r8 = X.C51969G9p.A0k()
            r31.getValue()
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r31)
            X.Hzv r6 = new X.Hzv
            r16 = r6
            r17 = r1
            r19 = r4
            r20 = r4
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            X.Hq5 r14 = new X.Hq5
            r14.<init>(r8, r6)
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r31)
            r6 = 5
            X.UlC r11 = new X.UlC
            r11.<init>(r1, r6)
            X.IRP r10 = new X.IRP
            r10.<init>(r14, r3)
            X.TpP r21 = new X.TpP
            r21.<init>()
            X.HAI r6 = r1.A01
            java.lang.String r16 = "dataSource"
            if (r6 == 0) goto L_0x0276
            r14 = 2
            X.AnonymousClass7TF.A1G(r12, r14, r7)
            android.content.Context r17 = r1.requireContext()
            X.2s4 r20 = new X.2s4
            r20.<init>()
            r22 = r11
            r23 = r6
            r24 = r10
            r25 = r9
            r26 = r1
            r27 = r4
            r28 = r7
            r29 = r2
            r30 = r2
            r18 = r1
            r19 = r12
            X.2tC r11 = X.C14370Tuz.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.Mmq r6 = new X.Mmq
            r6.<init>()
            r11.A01(r6)
            androidx.fragment.app.FragmentActivity r18 = r1.requireActivity()
            java.lang.Object r7 = r15.getValue()
            X.Ghd r7 = (X.C53045Ghd) r7
            X.HAI r6 = r1.A01
            if (r6 == 0) goto L_0x0276
            com.instagram.common.session.UserSession r21 = X.AnonymousClass7TE.A0l(r31)
            X.TsA r10 = new X.TsA
            r23 = r4
            r24 = r4
            r25 = r4
            r26 = r4
            r27 = r7
            r28 = r2
            r17 = r10
            r19 = r1
            r20 = r11
            r22 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r31)
            X.TvE r7 = new X.TvE
            r7.<init>(r6)
            X.IRG r6 = new X.IRG
            r6.<init>()
            r7.A01(r6)
            r7.A06 = r10
            X.HAI r6 = r1.A01
            if (r6 == 0) goto L_0x0276
            r7.A08 = r6
            r7.A0A = r9
            r7.A04 = r1
            X.32Q r6 = X.AnonymousClass32Q.A00
            r7.A02(r6)
            r7.A0N = r2
            r7.A00(r8)
            r7.A0I = r3
            X.TpO r6 = new X.TpO
            r6.<init>(r7)
            r6.A05(r0, r3)
            java.lang.Object r2 = r15.getValue()
            X.Ghd r2 = (X.C53045Ghd) r2
            r6.A06(r2)
            r2 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.DbT.A0I(r0, r2)
            X.IHS r0 = new X.IHS
            r0.<init>()
            r2.A13(r0)
            X.0xx r6 = X.DbW.A0E(r1)
            r2 = 20
            X.ImS r0 = new X.ImS
            r0.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r4, (int) r2)
            X.19B r8 = X.19B.A00
            X.1Eo.A05(r8, r0, r6)
            X.0xx r2 = X.DbW.A0E(r1)
            r7 = 21
            X.ImS r0 = new X.ImS
            r0.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r4, (int) r7)
            X.1Eo.A05(r8, r0, r2)
            X.HAI r0 = r1.A01
            if (r0 == 0) goto L_0x0276
            r0.A07(r5, r3)
            java.lang.Object r0 = r15.getValue()
            X.Ghd r0 = (X.C53045Ghd) r0
            r0.A00()
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r1.A04
            if (r0 == 0) goto L_0x0239
            r0.A09()
        L_0x0239:
            java.lang.Object r0 = r15.getValue()
            X.Ghd r0 = (X.C53045Ghd) r0
            X.HDe r6 = r0.A00
            java.lang.String r5 = r0.A01
            X.4Cq r3 = r6.A01
            r2 = 47
            X.MFV r0 = new X.MFV
            r0.<init>(r6, r5, r4, r2)
            X.1Er r2 = X.1Eo.A04(r8, r0, r3)
            X.J6g r0 = X.C59098J6g.A01(r6, r7)
            r2.CO3(r0)
            r0 = 61
            X.ID1.A01(r13, r0, r1)
            return
        L_0x025d:
            r6 = r4
            goto L_0x00e4
        L_0x0260:
            X.1Xj r5 = r1.A02
            if (r5 == 0) goto L_0x0276
            X.JSO r5 = X.C51966G9m.A0l(r5)
            if (r5 == 0) goto L_0x0270
            java.lang.String r5 = r5.getAttributionTitle()
            goto L_0x00ca
        L_0x0270:
            r5 = r4
            goto L_0x00ca
        L_0x0273:
            r5 = r4
            goto L_0x0087
        L_0x0276:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54140H0k.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void DqC(C16672Uz8 uz8) {
        HAI hai = this.A01;
        if (hai == null) {
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        hai.A07(uz8, true);
        AnonymousClass0eM r1 = this.A07;
        ((C53045Ghd) r1.getValue()).A02.Epw(uz8);
        if (((List) ((C53045Ghd) r1.getValue()).A03.getValue()).isEmpty()) {
            ((C53045Ghd) r1.getValue()).A00();
        }
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public C54140H0k() {
        C58686Ivv A002 = C58686Ivv.A00(this, 18);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C58686Ivv.A00(C58686Ivv.A00(this, 19), 20));
        this.A07 = DbS.A0I(C58686Ivv.A00(A003, 21), A002, C58687Ivw.A00((Object) null, A003, 9), DbS.A0z(C53045Ghd.class));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-818279479);
        C54140H0k.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("arg_entry_surface");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.IgWorldPagesSurface");
        this.A00 = (HOV) serializable;
        1E8 A0d = DbX.A0d(this.A08);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("arg_entry_media_id");
        } else {
            str = null;
        }
        1Xj A023 = A0d.A02(str);
        if (A023 != null) {
            this.A02 = A023;
            AnonymousClass0fD.A09(-2127785999, A022);
            return;
        }
        IllegalArgumentException A0w = AnonymousClass7TE.A0w("Entry Media must be provided");
        AnonymousClass0fD.A09(-605663146, A022);
        throw A0w;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(64668512);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_world_pages_detail, viewGroup, false);
        AnonymousClass0fD.A09(-56020782, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1885723079);
        super.onDestroy();
        this.A04 = null;
        AnonymousClass0fD.A09(1717560908, A022);
    }
}
