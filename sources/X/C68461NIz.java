package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NIz  reason: case insensitive filesystem */
public final class C68461NIz extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CampaignMessagesFragment";
    public C70936OSj A00;
    public PIE A01;
    public String A02;
    public C62320sa A03 = new C73928Pm8(this, 1);
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;

    public final String getModuleName() {
        return "campaign_messages_fragment";
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r6 = 0
            r7 = r22
            X.0qQ.A0B(r7, r6)
            r2 = r21
            r0 = r23
            super.onViewCreated(r7, r0)
            X.0eM r0 = r2.A04
            r20 = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r20)
            X.OSj r3 = new X.OSj
            r3.<init>(r2, r0)
            r2.A00 = r3
            X.0sm r1 = X.0Yt.A0E()
            java.lang.String r0 = "igd_campaign_message_list_impression"
            X.C70936OSj.A00(r3, r0, r1)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "bundle_key_media_id"
            java.lang.String r10 = ""
            java.lang.String r0 = r1.getString(r0, r10)
            r2.A02 = r0
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r20)
            X.PIE r0 = new X.PIE
            r0.<init>(r3, r2, r1)
            r2.A01 = r0
            X.0eM r0 = r2.A05
            X.2YL r8 = X.DbS.A0H(r0)
            java.lang.String r5 = r2.A02
            r3 = 0
            if (r5 == 0) goto L_0x018e
            X.6oS r4 = X.C318116oQ.A00(r8)
            r1 = 30
            X.MFW r0 = new X.MFW
            r0.<init>(r8, r5, r3, r1)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r0, r4)
            r0 = 2131431628(0x7f0b10cc, float:1.848499E38)
            com.instagram.common.ui.widget.imageview.IgImageView r19 = X.DbX.A0b(r7, r0)
            r0 = 2131431620(0x7f0b10c4, float:1.8484974E38)
            android.widget.TextView r14 = X.AnonymousClass7TG.A0R(r7, r0)
            r0 = 2131431608(0x7f0b10b8, float:1.848495E38)
            android.widget.TextView r18 = X.AnonymousClass7TG.A0R(r7, r0)
            r0 = 2131431609(0x7f0b10b9, float:1.8484952E38)
            android.view.View r15 = X.AnonymousClass7TF.A0F(r7, r0)
            r0 = 2131431614(0x7f0b10be, float:1.8484962E38)
            android.widget.TextView r17 = X.AnonymousClass7TG.A0R(r7, r0)
            r0 = 2131431613(0x7f0b10bd, float:1.848496E38)
            android.widget.TextView r8 = X.AnonymousClass7TG.A0R(r7, r0)
            android.os.Bundle r9 = r2.requireArguments()
            java.lang.String r0 = "bundle_key_start_time"
            long r4 = r9.getLong(r0)
            java.lang.String r0 = "bundle_key_thumbnail_image"
            java.lang.String r16 = r9.getString(r0, r10)
            java.lang.String r0 = "bundle_key_budget_spent"
            java.lang.String r13 = r9.getString(r0, r3)
            java.lang.String r0 = "bundle_key_message_count"
            r12 = -1
            int r11 = r9.getInt(r0, r12)
            java.lang.String r0 = "bundle_key_boosting_status"
            java.lang.String r10 = r9.getString(r0)
            java.lang.String r0 = "extra_bundle_for_boosting"
            android.os.Bundle r9 = r9.getBundle(r0)
            if (r13 == 0) goto L_0x00b4
            if (r11 != r12) goto L_0x00b9
        L_0x00b4:
            r0 = 8
            r15.setVisibility(r0)
        L_0x00b9:
            java.lang.String r0 = "MMM d"
            java.lang.String r0 = X.C14240TsN.A04(r0, r4)
            r14.setText(r0)
            r5 = 1
            if (r13 == 0) goto L_0x00d7
            android.content.res.Resources r4 = X.DbV.A05(r2)
            if (r4 == 0) goto L_0x018b
            r0 = 2131964237(0x7f13314d, float:1.956525E38)
            java.lang.String r4 = X.AnonymousClass7TF.A0e(r4, r13, r0)
        L_0x00d2:
            r0 = r18
            r0.setText(r4)
        L_0x00d7:
            if (r11 == r12) goto L_0x00eb
            android.content.res.Resources r4 = X.DbV.A05(r2)
            if (r4 == 0) goto L_0x0188
            r0 = 2131820766(0x7f1100de, float:1.9274256E38)
            java.lang.String r4 = X.DbY.A0d(r4, r11, r0)
        L_0x00e6:
            r0 = r17
            r0.setText(r4)
        L_0x00eb:
            int r0 = r16.length()
            if (r0 <= 0) goto L_0x00ff
            r11 = 100
            com.instagram.model.mediasize.ExtendedImageUrl r4 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0 = r16
            r4.<init>(r0, r11, r11)
            r0 = r19
            r0.setUrl(r4, r2)
        L_0x00ff:
            java.lang.String r11 = r2.A02
            if (r11 == 0) goto L_0x018e
            com.instagram.api.schemas.BoostedActionStatus r0 = com.instagram.api.schemas.BoostedActionStatus.ACTIVE
            boolean r0 = X.Dba.A1X(r0, r10)
            if (r0 == 0) goto L_0x0170
            if (r9 == 0) goto L_0x0170
            android.content.res.Resources r4 = X.DbV.A05(r2)
            r0 = 2131964236(0x7f13314c, float:1.9565248E38)
            X.DbU.A1A(r4, r8, r0)
            X.Oiu r0 = new X.Oiu
            r0.<init>(r9, r2, r11, r5)
        L_0x011c:
            X.AnonymousClass0fU.A00(r0, r8)
        L_0x011f:
            r0 = 2131431617(0x7f0b10c1, float:1.8484968E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.JTR.A0c(r7, r0)
            X.PIE r0 = r2.A01
            java.lang.String r7 = "recyclerAdapter"
            if (r0 == 0) goto L_0x0190
            X.2t9 r0 = r0.A00
            r4.setAdapter(r0)
            android.content.Context r0 = r2.requireContext()
            X.DbU.A15(r0, r4, r5, r6)
            X.3Ar r4 = X.C238103Ao.A00(r4)
            X.0qQ.A07(r4)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r20)
            X.PIE r8 = r2.A01
            if (r8 == 0) goto L_0x0190
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r0 = 5
            X.PFx r7 = new X.PFx
            r7.<init>(r2, r0)
            r9 = r3
            r11 = r0
            r12 = r5
            X.TsD r0 = X.C14293TtR.A00(r6, r7, r8, r9, r10, r11, r12)
            r4.AAD(r0)
            X.07U r6 = X.07U.A05
            X.07Z r5 = r2.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r5)
            r9 = 14
            X.MHI r4 = new X.MHI
            r7 = r2
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            X.1Eo.A05(r1, r4, r0)
            return
        L_0x0170:
            com.instagram.api.schemas.BoostedActionStatus r0 = com.instagram.api.schemas.BoostedActionStatus.EXTENDABLE
            boolean r0 = X.Dba.A1X(r0, r10)
            if (r0 == 0) goto L_0x011f
            android.content.res.Resources r4 = X.DbV.A05(r2)
            r0 = 2131964235(0x7f13314b, float:1.9565246E38)
            X.DbU.A1A(r4, r8, r0)
            X.Oib r0 = new X.Oib
            r0.<init>(r11, r2, r5)
            goto L_0x011c
        L_0x0188:
            r4 = 0
            goto L_0x00e6
        L_0x018b:
            r4 = 0
            goto L_0x00d2
        L_0x018e:
            java.lang.String r7 = "mediaId"
        L_0x0190:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68461NIz.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i3, i4, intent2);
        if (intent != null) {
            str = intent2.getStringExtra("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CAMPAIGN_MESSAGE_KEY");
        } else {
            str = null;
        }
        if (i3 == 92887 && i4 == -1 && str != null) {
            C69066Ne3 ne3 = ((C67729Mti) this.A05.getValue()).A00;
            AnonymousClass3U9 A0d = C66580MXl.A0d(ne3.A04, str);
            if (A0d != null) {
                05G r3 = ne3.A05;
                C69588NoW noW = (C69588NoW) r3.getValue();
                UserSession userSession = ne3.A02;
                C254703su A06 = A0d.A06();
                Context context = ne3.A00;
                String str2 = C66713MbK.A00;
                String obj = C66713MbK.A00(context, userSession, A06, A0d, AnonymousClass48N.A04(userSession, A06, A0d)).toString();
                if (noW instanceof NW1) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    C61081JwJ jwJ = (C61081JwJ) ((NW1) noW).A00;
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    for (Object next : (List) jwJ.A00) {
                        DbY.A1T(((N2K) next).A07, str, next, A1C2);
                    }
                    A1C.addAll(A1C2);
                    N2K n2k = new N2K(A0d.A06(), DbS.A0g(A0d.BRZ(), 0), str, obj, 0, A0d.BKd(), A0d.Cdv(userSession));
                    C69066Ne3.A00(ne3, n2k);
                    A1C.add(n2k);
                    r3.Epw(new NW1(new C61081JwJ((List) A1C, 39, jwJ.A01)));
                }
            }
        }
    }

    public C68461NIz() {
        C73928Pm8 pm8 = new C73928Pm8(this, 0);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73910Pll(new C73910Pll(this, 47), 48));
        this.A05 = DbS.A0I(new C73910Pll(A002, 49), pm8, new C73916Plr(6, (Object) null, A002), DbS.A0z(C67729Mti.class));
        this.A04 = C227642jf.A02(this);
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        r3.setTitle(requireContext().getString(2131964243));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-154602574);
        0qQ.A0B(layoutInflater, 0);
        C68461NIz.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_messages_layout, false);
        AnonymousClass0fD.A09(1105526944, A022);
        return A0D;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1977324393);
        super.onResume();
        if (AnonymousClass3HA.A00(requireContext())) {
            C317756nm.A05(requireActivity(), AnonymousClass7TE.A0l(this.A04), !C61290mR.A07());
        }
        AnonymousClass0fD.A09(-1703088985, A022);
    }
}
