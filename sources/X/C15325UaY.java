package X;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.UaY  reason: case insensitive filesystem */
public final class C15325UaY extends AnonymousClass4DH implements AnonymousClass4DR, C227272iw {
    public static final String __redex_internal_original_name = "FeedFavoritesHomeFragment";
    public LinearLayout A00;
    public C15691Ugw A01;
    public Uh4 A02;
    public IgdsButton A03;
    public Dc2 A04;
    public boolean A05;
    public boolean A06;
    public View.OnClickListener A07;
    public LinearLayoutManager A08;
    public final C18068Vku A09 = new C18068Vku();
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(C20645Wwd.A00);
    public final AnonymousClass0eM A0B = C227642jf.A02(this);

    public final boolean COC() {
        return true;
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbX.A1A(new WB8((Object) this, 17), DbV.A0K(), r4);
        r4.Eom(2131962081);
        WB8 wb8 = new WB8((Object) this, 18);
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A06 = R.drawable.plus_24;
        r1.A05 = 2131962318;
        DbX.A19(wb8, r1, r4);
    }

    public final String getModuleName() {
        return "favorites_management";
    }

    public static final void A00(C15325UaY uaY) {
        IgdsButton igdsButton = uaY.A03;
        if (igdsButton != null) {
            igdsButton.setVisibility(DbW.A01(uaY.A05 ? 1 : 0));
        }
        IgdsButton igdsButton2 = uaY.A03;
        if (igdsButton2 != null) {
            igdsButton2.setEnabled(AnonymousClass7TE.A1b(uaY.A09.A01));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public final boolean onBackPressed() {
        String str;
        if (this.A05) {
            C358248ab A0U = DbW.A0U(this);
            A0U.A09(2131960807);
            A0U.A08(2131960808);
            A0U.A0K(new W5U(this, 17), 2131960790);
            A0U.A05();
            DbT.A1V(A0U);
        } else {
            DbX.A1I(this);
        }
        C297555rw A002 = C297545rv.A00(AnonymousClass7TE.A0l(this.A0B));
        String A0k = C13991Tnr.A0k(this.A0A);
        if (this.A05) {
            str = Pxd.A00(96);
        } else {
            str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(A002.A00, "favorites_management"), "instagram_feed_favorites_exit");
        if (!A0e.isSampled()) {
            return true;
        }
        A0e.AAJ("module", "favorites_management");
        A0e.AAJ("management_session_id", A0k);
        A0e.AAJ("detail", str);
        A0e.Cgf();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        int A022 = AnonymousClass0fD.A02(927424886);
        C15325UaY.super.onCreate(bundle);
        this.A07 = C18883WAv.A00;
        Bundle bundle2 = this.mArguments;
        String str4 = "";
        if (bundle2 != null) {
            String A002 = C66579MXk.A00(33);
            if (bundle2.containsKey(A002)) {
                str2 = bundle2.getString(A002, str4);
            } else {
                str2 = str4;
            }
            String A003 = C273654mx.A00(277);
            if (bundle2.containsKey(A003)) {
                str3 = bundle2.getString(A003, str4);
            } else {
                str3 = str4;
            }
            String A004 = AnonymousClass000.A00(358);
            if (bundle2.containsKey(A004)) {
                str4 = bundle2.getString(A004, str4);
            }
            str = str4;
            str4 = str3;
        } else {
            str = str4;
            str2 = str4;
        }
        C297555rw A005 = C297545rv.A00(AnonymousClass7TE.A0l(this.A0B));
        String A0k = C13991Tnr.A0k(this.A0A);
        0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(A005.A00, str4), "instagram_feed_favorites_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("module", str4);
            A0e.AAJ(AnonymousClass000.A00(358), str);
            A0e.AAJ(C66579MXk.A00(33), str2);
            A0e.AAJ("management_session_id", A0k);
            A0e.Cgf();
        }
        AnonymousClass0fD.A09(-430371178, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r25, android.view.ViewGroup r26, android.os.Bundle r27) {
        /*
            r24 = this;
            r0 = 1419270621(0x549859dd, float:5.2347415E12)
            int r0 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            r4 = r25
            X.0qQ.A0B(r4, r2)
            r1 = 2131626667(0x7f0e0aab, float:1.8880577E38)
            r3 = r26
            android.view.View r9 = r4.inflate(r1, r3, r2)
            r14 = r24
            android.content.Context r2 = r14.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r2)
            r14.A08 = r1
            android.content.Context r8 = r14.requireContext()
            androidx.recyclerview.widget.LinearLayoutManager r11 = r14.A08
            if (r11 != 0) goto L_0x0035
            java.lang.String r8 = "layoutManager"
        L_0x002d:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0035:
            X.0eM r1 = r14.A0B
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r1)
            X.0gy r10 = X.AnonymousClass07i.A00(r14)
            X.VMh r13 = new X.VMh
            r13.<init>(r14)
            X.Vku r12 = r14.A09
            X.0eM r2 = r14.A0A
            java.lang.String r16 = X.C13991Tnr.A0k(r2)
            X.Ugw r7 = new X.Ugw
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r14.A01 = r7
            android.content.Context r16 = r14.requireContext()
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r1)
            X.0gy r18 = X.AnonymousClass07i.A00(r14)
            X.VMi r1 = new X.VMi
            r1.<init>(r14)
            java.lang.String r23 = X.C13991Tnr.A0k(r2)
            X.Uh4 r15 = new X.Uh4
            r17 = r9
            r19 = r12
            r20 = r1
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r14.A02 = r15
            X.Ugw r1 = r14.A01
            java.lang.String r8 = "listController"
            if (r1 == 0) goto L_0x002d
            r14.registerLifecycleListener(r1)
            X.Uh4 r1 = r14.A02
            if (r1 != 0) goto L_0x0087
            java.lang.String r8 = "searchController"
            goto L_0x002d
        L_0x0087:
            r14.registerLifecycleListener(r1)
            X.0qQ.A0A(r9)
            r1 = 2131433809(0x7f0b1951, float:1.8489414E38)
            android.view.View r1 = r9.requireViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r14.A00 = r1
            r1 = 2131432758(0x7f0b1536, float:1.8487282E38)
            android.widget.TextView r4 = X.DbW.A0B(r9, r1)
            r3 = 2131962319(0x7f1329cf, float:1.956136E38)
            r1 = 2131963501(0x7f132e6d, float:1.9563757E38)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = X.DbU.A0m(r14, r1)
            java.lang.String r1 = r14.getString(r3)
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            int r6 = r2.length()
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r7, r2)
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r1)
            android.content.Context r2 = r14.requireContext()
            android.content.Context r1 = r14.getContext()
            int r1 = X.2Yu.A07(r1)
            java.lang.Integer r1 = X.DbV.A0n(r2, r1)
            X.7AK r3 = new X.7AK
            r3.<init>(r1)
            X.0eM r1 = X.0mp.A09
            int r2 = r7.length()
            int r2 = r2 + r6
            r1 = 33
            r5.setSpan(r3, r6, r2, r1)
            r4.setText(r5)
            r4.setContentDescription(r5)
            X.DbT.A1H(r4)
            android.content.Context r2 = r14.requireContext()
            r1 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r1 = r2.getColor(r1)
            r4.setHighlightColor(r1)
            r2 = 34
            X.FP5 r1 = new X.FP5
            r1.<init>(r14, r2)
            X.AnonymousClass0fU.A00(r1, r4)
            X.Ugw r2 = r14.A01
            if (r2 == 0) goto L_0x002d
            r1 = 1
            r2.A03(r1)
            r1 = -587500341(0xffffffffdcfb74cb, float:-5.66229075E17)
            X.AnonymousClass0fD.A09(r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15325UaY.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1806860546);
        super.onDestroyView();
        C15691Ugw ugw = this.A01;
        if (ugw == null) {
            str = "listController";
        } else {
            unregisterLifecycleListener(ugw);
            Uh4 uh4 = this.A02;
            if (uh4 == null) {
                str = "searchController";
            } else {
                unregisterLifecycleListener(uh4);
                AnonymousClass0fD.A09(589922485, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
