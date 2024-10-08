package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.direct.sharetostory.data.JoinChatStickerData;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

public final class NJ7 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final /* synthetic */ AnonymousClass0YZ[] A0L;
    public static final String __redex_internal_original_name = "DirectThreadInviteLinkSettingsFragment";
    public String A00;
    public boolean A01;
    public boolean A02;
    public LinearLayout A03;
    public 1Ng A04;
    public IgdsListCell A05;
    public boolean A06;
    public final C46362Dde A07 = new C46362Dde(this, new C73655PhU(this, 18));
    public final C46362Dde A08 = new C46362Dde(this, new C73655PhU(this, 25));
    public final C46362Dde A09 = new C46362Dde(this, new C73655PhU(this, 26));
    public final C46362Dde A0A = new C46362Dde(this, new C73655PhU(this, 28));
    public final C319956rV A0B = new C46362Dde(this, new C73655PhU(this, 19));
    public final C319956rV A0C = new C46362Dde(this, new C73655PhU(this, 21));
    public final C319956rV A0D = new C46362Dde(this, new C73655PhU(this, 22));
    public final C319956rV A0E = new C46362Dde(this, new C73655PhU(this, 23));
    public final AtomicBoolean A0F = JTQ.A0k();
    public final AnonymousClass0eM A0G = C227642jf.A02(this);
    public final 1wn A0H = C71932OtG.A00(this, 16);
    public final C46362Dde A0I = new C46362Dde(this, new C73655PhU(this, 27));
    public final C319956rV A0J = new C46362Dde(this, new C73655PhU(this, 20));
    public final C319956rV A0K = new C46362Dde(this, new C73655PhU(this, 24));

    public static final void A03(NJ7 nj7) {
        NJ7 nj72 = nj7;
        C254793t3 A002 = A00(nj7);
        0qQ.A0B(A002, 0);
        0Aj A0e = AnonymousClass7TE.A0e(((OJb) C66940MfZ.A01(nj7.A0E, nj7, A0L, 10)).A00, "link_click_share_tab");
        if (A0e.isSampled()) {
            C66584MXp.A0q(A0e, A002);
            A0e.Cgf();
        }
        String str = nj7.A00;
        if (str != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("android.intent.extra.TEXT", str);
            C46395DeI.A0Q(nj7.requireActivity(), A0a, nj72, AnonymousClass7TE.A0l(nj72.A0G), "share_to_system_sheet", AnonymousClass7TE.A1E());
        }
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        DbW.A1B(r5, 2131963172);
        if (this.A01) {
            if (!182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.A0G), 36314562668530354L)) {
                AnonymousClass3JR A0K2 = DbS.A0K();
                A0K2.A06 = R.drawable.instagram_share_android_pano_outline_24;
                A0K2.A05 = 2131973441;
                DbX.A19(C71401Ok0.A00(this, 52), A0K2, r5);
            }
        }
    }

    public final String getModuleName() {
        return "direct_thread_invite_link_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A0G;
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r4));
        this.A04 = A002;
        if (A002 == null) {
            0qQ.A0F("igEventBus");
            throw AnonymousClass00P.createAndThrow();
        }
        A002.A01(this.A0H, C71914Osw.class);
        Context requireContext = requireContext();
        this.A05 = (IgdsListCell) view.requireViewById(R.id.invite_link_settings_link);
        TextView A0G2 = DbU.A0G(view, R.id.invite_link_explainer_text);
        String A042 = 182.A04(0Tu.A05, AnonymousClass7TE.A0l(r4), 36877512621490313L);
        if (A042.length() > 0) {
            String A16 = AnonymousClass7TE.A16(requireContext, 2131963164);
            String A012 = A01(requireContext, A16);
            0qQ.A0A(A0G2);
            int color = requireContext().getColor(2Yu.A06(requireContext));
            AnonymousClass7AV.A07(new C47566E8e(requireContext, new 04x(16, A16), this, AnonymousClass05K.A01, A16, A042, color), A0G2, A16, A012);
        } else {
            A0G2.setText(A01(requireContext, ""));
        }
        this.A03 = (LinearLayout) view.requireViewById(R.id.invite_link_settings_container);
        A07(this);
    }

    static {
        Class<NJ7> cls = NJ7.class;
        A0L = new AnonymousClass0YZ[]{C66580MXl.A16(cls, "threadId", "getThreadId()Lcom/instagram/model/direct/threadkey/intf/ThreadId;"), C66580MXl.A16(cls, "threadV2Id", "getThreadV2Id()Ljava/lang/String;"), C66580MXl.A16(cls, "threadTitle", "getThreadTitle()Ljava/lang/String;"), C66580MXl.A16(cls, "threadImage", "getThreadImage()Lcom/instagram/common/typedurl/ImageUrl;"), C66580MXl.A16(cls, "isAdmin", "isAdmin()Z"), C66580MXl.A16(cls, "isModerator", "isModerator()Z"), C66580MXl.A16(cls, "broadcastChatCreatorId", "getBroadcastChatCreatorId()Ljava/lang/String;"), C66580MXl.A16(cls, "isSubscriberOnly", "isSubscriberOnly()Z"), C66580MXl.A16(cls, "forceDisableToggle", "getForceDisableToggle()Z"), C66580MXl.A16(cls, "userType", "getUserType()Ljava/lang/String;"), C66580MXl.A16(cls, "logger", "getLogger()Lcom/instagram/direct/fragment/thread/inviteLink/logger/InviteLinkSettingsLogger;")};
    }

    public static final C254793t3 A00(NJ7 nj7) {
        return (C254793t3) C66940MfZ.A01(nj7.A0K, nj7, A0L, 0);
    }

    public static final String A02(NJ7 nj7) {
        return (String) C66940MfZ.A01(nj7.A0I, nj7, A0L, 1);
    }

    public static final void A04(NJ7 nj7) {
        if (nj7.A02) {
            C313756gx A002 = C313746gw.A00(AnonymousClass7TE.A0l(nj7.A0G));
            int A032 = C66583MXo.A03(nj7);
            A002.A0M(AnonymousClass05K.A0C, C300965yF.A07(A00(nj7)), A02(nj7), A032, A08(nj7));
        }
        C46498Dg1 dg1 = new C46498Dg1(nj7.requireContext(), AnonymousClass7TE.A0l(nj7.A0G));
        Context requireContext = nj7.requireContext();
        int i = 2131963170;
        if (AnonymousClass48O.A04(nj7.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"))) {
            i = 2131963153;
        }
        dg1.A09(requireContext.getString(i));
        dg1.A02(C71401Ok0.A00(nj7, 60), 2131963169);
        new C49945FFy(dg1).A03(nj7.requireActivity());
    }

    public static final void A05(NJ7 nj7) {
        C49731F3w A072;
        String str;
        NJ7 nj72 = nj7;
        C319956rV r3 = nj72.A0E;
        AnonymousClass0YZ[] r1 = A0L;
        C254793t3 A002 = A00(nj72);
        0qQ.A0B(A002, 0);
        0Aj A0e = AnonymousClass7TE.A0e(((OJb) C66940MfZ.A01(r3, nj72, r1, 10)).A00, "link_click_send_tab");
        if (A0e.isSampled()) {
            C66584MXp.A0q(A0e, A002);
            A0e.Cgf();
        }
        if (nj72.A02) {
            C313756gx A003 = C313746gw.A00(AnonymousClass7TE.A0l(nj72.A0G));
            int A032 = C66583MXo.A03(nj72);
            A003.A0M(AnonymousClass05K.A01, C300965yF.A07(A00(nj72)), A02(nj72), A032, A08(nj72));
        }
        String str2 = nj72.A00;
        if (str2 != null) {
            P43 p43 = new P43(nj72, 1);
            boolean A042 = AnonymousClass48O.A04(nj72.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"));
            1ap r6 = 1as.A04.A02;
            AnonymousClass0eM r5 = nj72.A0G;
            UserSession A0l = AnonymousClass7TE.A0l(r5);
            if (A042) {
                A072 = r6.A07(nj72, A0l, 2FW.A0S);
                String str3 = nj72.A00;
                C254793t3 A004 = A00(nj72);
                if (C300965yF.A02(A004) != null) {
                    str = C66580MXl.A0x(A004);
                } else {
                    str = null;
                }
                String A022 = A02(nj72);
                String str4 = AnonymousClass7TE.A0l(r5).A06;
                C46362Dde dde = nj72.A07;
                boolean A0K2 = 0qQ.A0K(str4, C66940MfZ.A01(dde, nj72, r1, 6));
                A072.A07.putParcelable(C273654mx.A00(475), new InviteLinkShareInfo((Uri) null, (ImageUrl) C66940MfZ.A01(nj72.A08, nj72, r1, 3), str3, str, A022, (String) C66940MfZ.A01(dde, nj72, r1, 6), (String) C66940MfZ.A01(nj72.A09, nj72, r1, 2), (String) C66940MfZ.A01(nj72.A0A, nj72, r1, 9), nj72.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"), C66583MXo.A03(nj72), nj72.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.MEMBER_COUNT"), A0K2, AnonymousClass9HV.A00(AnonymousClass7TE.A0l(r5)).A00(A00(nj72), 24)));
            } else {
                A072 = r6.A07(nj72, A0l, 2FW.A17);
                A072.A07(str2);
            }
            A072.A01 = p43;
            DirectShareSheetFragment A005 = A072.A00();
            AnonymousClass37D A0i = DbX.A0i(nj72);
            if (A0i != null) {
                A0i.A0J(A005);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.instagram.igds.components.textcell.IgdsListCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.instagram.igds.components.textcell.IgdsListCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.instagram.igds.components.textcell.IgdsListCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.instagram.igds.components.textcell.IgdsListCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: com.instagram.igds.components.textcell.IgdsActionCell} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.NJ7 r12) {
        /*
            com.instagram.igds.components.textcell.IgdsListCell r5 = r12.A05
            if (r5 != 0) goto L_0x000e
            java.lang.String r11 = "igdsTextCell"
        L_0x0006:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            r5.A04()
            java.lang.String r4 = r12.A00
            if (r4 == 0) goto L_0x001c
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x001c
            r5.A0H(r4)
        L_0x001c:
            boolean r0 = A08(r12)
            if (r0 == 0) goto L_0x02f7
            X.6rV r2 = r12.A0B
            X.0YZ[] r1 = A0L
            r0 = 8
            java.lang.Object r0 = X.C66940MfZ.A01(r2, r12, r1, r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x02f7
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r5.setTextCellType(r0)
            boolean r0 = r12.A01
            r5.setChecked(r0)
            r1 = 2
            X.PHt r0 = new X.PHt
            r0.<init>(r12, r1)
            r5.A0E(r0)
        L_0x0045:
            if (r4 == 0) goto L_0x0079
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x0079
            X.0eM r0 = r12.A0G
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330621550740168(0x811282000042c8, double:3.038969588134325E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0079
            r1 = 2132018624(0x7f1405c0, float:1.967556E38)
            android.content.Context r0 = r5.getContext()
            int r0 = X.2Yu.A06(r0)
            r5.A07(r1, r0)
            com.instagram.common.ui.base.IgTextView r2 = r5.getSubtitleView()
            r1 = 0
            X.Oiu r0 = new X.Oiu
            r0.<init>(r5, r12, r4, r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x0079:
            android.content.Context r5 = r12.requireContext()
            android.widget.LinearLayout r0 = r12.A03
            java.lang.String r11 = "menuOptionsContainer"
            if (r0 == 0) goto L_0x0006
            r0.removeAllViews()
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x02a3
            java.lang.String r0 = r12.A00
            if (r0 == 0) goto L_0x02a3
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02a3
            X.0eM r2 = r12.A0G
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36314562668530354(0x8103e700080ab2, double:3.0288138863609104E-306)
            boolean r10 = X.182.A06(r4, r3, r0)
            android.widget.LinearLayout r7 = r12.A03
            if (r7 == 0) goto L_0x0006
            r0 = 2131963157(0x7f132d15, float:1.956306E38)
            java.lang.CharSequence r8 = r12.getText(r0)
            X.0qQ.A07(r8)
            r0 = 7
            X.PqR r6 = new X.PqR
            r6.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r12)
            if (r10 == 0) goto L_0x02e3
            com.instagram.igds.components.textcell.IgdsListCell r3 = X.C66581MXm.A0d(r5)
            r3.A0I(r8)
            r0 = 2131238164(0x7f081d14, float:1.8092599E38)
            r3.A05(r0)
            r0 = 61
            X.Ok0 r0 = X.C71401Ok0.A00(r6, r0)
            r3.A0C(r0)
        L_0x00d1:
            X.2eS.A01(r3)
            r7.addView(r3)
            android.widget.LinearLayout r7 = r12.A03
            if (r7 == 0) goto L_0x0006
            r0 = 2131963173(0x7f132d25, float:1.9563092E38)
            java.lang.CharSequence r6 = r12.getText(r0)
            X.0qQ.A07(r6)
            if (r10 == 0) goto L_0x02cf
            com.instagram.igds.components.textcell.IgdsListCell r3 = X.C66581MXm.A0d(r5)
            r3.A0I(r6)
            r0 = 2131238210(0x7f081d42, float:1.8092692E38)
            r3.A05(r0)
            r0 = 56
            X.Ok0 r0 = X.C71401Ok0.A00(r12, r0)
            r3.A0C(r0)
        L_0x00fd:
            X.2eS.A01(r3)
            r7.addView(r3)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            r0 = 36314562668202671(0x8103e700030aaf, double:3.028813886153682E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x0152
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.9HW r3 = X.AnonymousClass9HV.A00(r0)
            X.3t3 r1 = A00(r12)
            r0 = 24
            boolean r0 = r3.A00(r1, r0)
            if (r0 == 0) goto L_0x0152
            android.widget.LinearLayout r6 = r12.A03
            if (r6 == 0) goto L_0x0006
            r0 = 2131963175(0x7f132d27, float:1.9563096E38)
            java.lang.CharSequence r4 = r12.getText(r0)
            X.0qQ.A07(r4)
            if (r10 == 0) goto L_0x02bb
            com.instagram.igds.components.textcell.IgdsListCell r3 = X.C66581MXm.A0d(r5)
            r3.A0I(r4)
            r0 = 2131238596(0x7f081ec4, float:1.8093475E38)
            r3.A05(r0)
            r0 = 58
            X.Ok0 r0 = X.C71401Ok0.A00(r12, r0)
            r3.A0C(r0)
        L_0x014c:
            X.2eS.A01(r3)
            r6.addView(r3)
        L_0x0152:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x021d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.C14290TtO.A00(r0)
            if (r0 == 0) goto L_0x021d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.9HW r3 = X.AnonymousClass9HV.A00(r0)
            X.3t3 r1 = A00(r12)
            r0 = 35
            boolean r0 = r3.A00(r1, r0)
            if (r0 == 0) goto L_0x021d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.6gx r8 = X.C313746gw.A00(r0)
            int r7 = X.C66583MXo.A03(r12)
            X.3t3 r0 = A00(r12)
            java.lang.String r6 = X.C300965yF.A07(r0)
            java.lang.String r4 = A02(r12)
            boolean r3 = A08(r12)
            X.1Ln r1 = X.DbT.A0J(r8)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x01b9
            X.DbW.A17(r1, r8)
            java.lang.String r0 = "qr_code_option_rendered"
            X.C66581MXm.A1I(r1, r0)
            r0 = 2897(0xb51, float:4.06E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A0p(r0)
            if (r3 == 0) goto L_0x02b7
            java.lang.String r0 = "creator_invite_link_details"
        L_0x01af:
            java.lang.Long r0 = X.DbZ.A0b(r1, r0, r6, r4, r7)
            r1.A0i(r0)
            r1.Cgf()
        L_0x01b9:
            android.widget.LinearLayout r7 = r12.A03
            if (r7 == 0) goto L_0x0006
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131625150(0x7f0e04be, float:1.88775E38)
            android.view.View r6 = X.DbU.A08(r1, r0)
            r0 = 2131435060(0x7f0b1e34, float:1.8491952E38)
            android.widget.ImageView r9 = X.DbX.A0J(r6, r0)
            r0 = 2131435072(0x7f0b1e40, float:1.8491976E38)
            android.widget.TextView r8 = X.AnonymousClass7TG.A0R(r6, r0)
            r0 = 2131435071(0x7f0b1e3f, float:1.8491974E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r6, r0)
            r0 = 2131436919(0x7f0b2577, float:1.8495722E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r6, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.1Av r3 = X.1Au.A00(r0)
            r0 = 2131238741(0x7f081f55, float:1.809377E38)
            r9.setImageResource(r0)
            r2 = 0
            r9.setVisibility(r2)
            r0 = 2131963167(0x7f132d1f, float:1.956308E38)
            r8.setText(r0)
            r0 = 8
            r1.setVisibility(r0)
            X.0xa r1 = r3.A01
            java.lang.String r0 = "bc_qr_code_sharing_has_seen_new_badge_in_thread_details"
            boolean r0 = r1.getBoolean(r0, r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x020f
            r2 = 8
        L_0x020f:
            r4.setVisibility(r2)
            r0 = 43
            X.C71405Ok4.A01(r6, r0, r3, r12)
            X.2eS.A01(r6)
            r7.addView(r6)
        L_0x021d:
            if (r10 == 0) goto L_0x0242
            android.widget.LinearLayout r2 = r12.A03
            if (r2 == 0) goto L_0x0006
            com.instagram.igds.components.textcell.IgdsListCell r1 = X.C66581MXm.A0d(r5)
            r0 = 2131963174(0x7f132d26, float:1.9563094E38)
            r1.A06(r0)
            r0 = 2131238772(0x7f081f74, float:1.8093832E38)
            r1.A05(r0)
            r0 = 53
            X.Ok0 r0 = X.C71401Ok0.A00(r12, r0)
            r1.A0C(r0)
            X.2eS.A01(r1)
            r2.addView(r1)
        L_0x0242:
            boolean r0 = A08(r12)
            if (r0 != 0) goto L_0x0257
            X.6rV r2 = r12.A0C
            X.0YZ[] r1 = A0L
            r0 = 5
            java.lang.Object r0 = X.C66940MfZ.A01(r2, r12, r1, r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x02a3
        L_0x0257:
            android.widget.LinearLayout r4 = r12.A03
            if (r4 == 0) goto L_0x0006
            r0 = 2131963168(0x7f132d20, float:1.9563082E38)
            java.lang.CharSequence r2 = r12.getText(r0)
            X.0qQ.A07(r2)
            if (r10 == 0) goto L_0x02a4
            com.instagram.igds.components.textcell.IgdsListCell r3 = X.C66581MXm.A0d(r5)
            r3.A0I(r2)
            r0 = 55
            X.Ok0 r0 = X.C71401Ok0.A00(r12, r0)
            r3.A0C(r0)
            int r0 = X.2Yu.A03(r5)
            int r2 = r5.getColor(r0)
            android.view.ViewGroup r1 = r3.getTextCellView()
            r0 = 2131434287(0x7f0b1b2f, float:1.8490384E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            r0.setTextColor(r2)
            r0 = 2131238720(0x7f081f40, float:1.8093727E38)
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r0)
            if (r1 == 0) goto L_0x029d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A0A(r1, r0)
        L_0x029d:
            X.2eS.A01(r3)
            r4.addView(r3)
        L_0x02a3:
            return
        L_0x02a4:
            r1 = 0
            r0 = 0
            com.instagram.igds.components.textcell.IgdsActionCell r3 = new com.instagram.igds.components.textcell.IgdsActionCell
            r3.<init>(r5, r1, r0)
            X.Nic r1 = X.C69276Nic.DESTRUCTIVE
            r0 = 54
            X.Ok0 r0 = X.C71401Ok0.A00(r12, r0)
            r3.A00(r0, r1, r2)
            goto L_0x029d
        L_0x02b7:
            java.lang.String r0 = "fan_invite_link_details"
            goto L_0x01af
        L_0x02bb:
            r1 = 0
            r0 = 0
            com.instagram.igds.components.textcell.IgdsActionCell r3 = new com.instagram.igds.components.textcell.IgdsActionCell
            r3.<init>(r5, r1, r0)
            X.Nic r1 = X.C69276Nic.EMPHASIZED
            r0 = 59
            X.Ok0 r0 = X.C71401Ok0.A00(r12, r0)
            r3.A00(r0, r1, r4)
            goto L_0x014c
        L_0x02cf:
            r1 = 0
            r0 = 0
            com.instagram.igds.components.textcell.IgdsActionCell r3 = new com.instagram.igds.components.textcell.IgdsActionCell
            r3.<init>(r5, r1, r0)
            X.Nic r1 = X.C69276Nic.EMPHASIZED
            r0 = 57
            X.Ok0 r0 = X.C71401Ok0.A00(r12, r0)
            r3.A00(r0, r1, r6)
            goto L_0x00fd
        L_0x02e3:
            r1 = 0
            r0 = 0
            com.instagram.igds.components.textcell.IgdsActionCell r3 = new com.instagram.igds.components.textcell.IgdsActionCell
            r3.<init>(r5, r1, r0)
            X.Nic r1 = X.C69276Nic.EMPHASIZED
            r0 = 61
            X.Ok0 r0 = X.C71401Ok0.A00(r6, r0)
            r3.A00(r0, r1, r8)
            goto L_0x00d1
        L_0x02f7:
            X.Njo r0 = X.C69349Njo.TYPE_UNKNOWN
            r5.setTextCellType(r0)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ7.A07(X.NJ7):void");
    }

    public static final boolean A08(NJ7 nj7) {
        return AnonymousClass7TE.A1a(C66940MfZ.A01(nj7.A0J, nj7, A0L, 4));
    }

    public final UserSession A09() {
        return AnonymousClass7TE.A0l(this.A0G);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0G);
    }

    private final String A01(Context context, String str) {
        int i;
        int i2;
        Object[] objArr;
        if (requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE") == 29) {
            C46362Dde dde = this.A07;
            AnonymousClass0YZ[] r4 = A0L;
            if (C66940MfZ.A01(dde, this, r4, 6) != null) {
                Object A012 = C66940MfZ.A01(dde, this, r4, 6);
                AnonymousClass0eM r5 = this.A0G;
                if (!C51966G9m.A1W(AnonymousClass7TE.A0l(r5), A012)) {
                    boolean A062 = 182.A06(0Tu.A05, AnonymousClass7TE.A0l(r5), 36319407391776032L);
                    User A022 = 17h.A00(AnonymousClass7TE.A0l(r5)).A02((String) C66940MfZ.A01(dde, this, r4, 6));
                    if (A022 != null) {
                        String username = A022.getUsername();
                        if (A062) {
                            i2 = 2131963154;
                        } else {
                            int i3 = 2131963155;
                            if (AnonymousClass7TE.A1a(C66940MfZ.A01(this.A0D, this, r4, 7))) {
                                i3 = 2131963177;
                            }
                            objArr = new Object[]{username, str};
                            String string = context.getString(i3, objArr);
                            0qQ.A0A(string);
                            return string;
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    i2 = 2131963156;
                    if (AnonymousClass7TE.A1a(C66940MfZ.A01(this.A0D, this, r4, 7))) {
                        i2 = 2131963178;
                    }
                }
                objArr = new Object[]{str};
                String string2 = context.getString(i3, objArr);
                0qQ.A0A(string2);
                return string2;
            }
        }
        if (AnonymousClass48O.A01(requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"))) {
            i = 2131963176;
        } else {
            boolean A063 = 182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.A0G), 36314562668726965L);
            boolean z = this.A06;
            if (A063) {
                i = 2131963162;
                if (z) {
                    i = 2131963163;
                }
            } else {
                i = 2131963160;
                if (z) {
                    i = 2131963161;
                }
            }
        }
        return DbY.A0c(context, str, i);
    }

    public static final void A06(NJ7 nj7) {
        String str;
        int i = nj7.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE");
        if (i == 29) {
            C313746gw.A00(AnonymousClass7TE.A0l(nj7.A0G)).A0T(C300965yF.A07(A00(nj7)), A02(nj7), "thread_details_link", C66583MXo.A03(nj7), A08(nj7));
        } else if (i == 32 || i == 62) {
            C69866NtU.A00(AnonymousClass7TE.A0l(nj7.A0G)).A08(C300965yF.A07(A00(nj7)), A02(nj7), A08(nj7), "thread_details_link");
        }
        C254793t3 A002 = A00(nj7);
        if (C300965yF.A02(A002) != null) {
            str = C66580MXl.A0x(A002);
        } else {
            str = null;
        }
        String A022 = A02(nj7);
        C46362Dde dde = nj7.A09;
        AnonymousClass0YZ[] r3 = A0L;
        int A032 = C66583MXo.A03(nj7);
        JoinChatStickerData joinChatStickerData = new JoinChatStickerData((ImageUrl) C66940MfZ.A01(nj7.A08, nj7, r3, 3), str, A022, (String) C66940MfZ.A01(dde, nj7, r3, 2), DbT.A12(Locale.ROOT, "THREAD_DETAILS_LINK"), A032, nj7.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.MEMBER_COUNT"), nj7.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"), A08(nj7), false, false);
        F7I.A01(nj7.requireActivity(), AnonymousClass7TE.A0l(nj7.A0G), joinChatStickerData);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-932563742);
        NJ7.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getString("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_LINK");
        this.A01 = requireArguments.getBoolean("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_LINK_MODE");
        this.A06 = requireArguments.getBoolean("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_ADMIN_APPROVAL_MODE");
        this.A02 = AnonymousClass7TF.A1V(requireArguments.getString("DirectThreadInviteLinkSettingsFragment.BROADCAST_CHAT_CREATOR_ID"));
        AnonymousClass0fD.A09(274074873, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1399993255);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_thread_invite_link_settings, viewGroup, false);
        AnonymousClass0fD.A09(1483845778, A022);
        return inflate;
    }

    public final void onDestroy() {
        C254783t2 r2;
        boolean z;
        String str;
        int A022 = AnonymousClass0fD.A02(1814612947);
        super.onDestroy();
        Bundle bundle = this.mArguments;
        String str2 = null;
        if (bundle != null) {
            r2 = AnonymousClass9H0.A00(bundle, "DirectThreadInviteLinkSettingsFragment.THREAD_ID");
        } else {
            r2 = null;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str2 = bundle2.getString("DirectThreadInviteLinkSettingsFragment.THREAD_V2_ID");
        }
        Bundle bundle3 = this.mArguments;
        int i = 0;
        if (bundle3 != null) {
            z = bundle3.getBoolean("DirectThreadInviteLinkSettingsFragment.IS_ADMIN");
        } else {
            z = false;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            i = bundle4.getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_AUDIENCE_TYPE");
        }
        if (this.A02 && r2 != null) {
            C313756gx A002 = C313746gw.A00(AnonymousClass7TE.A0l(this.A0G));
            String A072 = C300965yF.A07((C254793t3) r2);
            1Ln A0J2 = DbT.A0J(A002);
            if (DbT.A1Y(A0J2)) {
                DbW.A17(A0J2, A002);
                C66581MXm.A1I(A0J2, "exit_invite_link_sheet");
                A0J2.A0p(Pxd.A00(190));
                if (z) {
                    str = "creator_invite_link_details";
                } else {
                    str = "fan_invite_link_details";
                }
                A0J2.A0i(DbZ.A0b(A0J2, str, A072, str2, i));
                A0J2.Cgf();
            }
        }
        1Ng r22 = this.A04;
        if (r22 == null) {
            0qQ.A0F("igEventBus");
            throw AnonymousClass00P.createAndThrow();
        }
        r22.A02(this.A0H, C71914Osw.class);
        AnonymousClass0fD.A09(1235358605, A022);
    }
}
