package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class K8O extends MYR implements X9V, G7P, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IgLivePostLiveModeratorActionsFragment";
    public C270194gL A00;
    public String A01;
    public String A02;
    public final AnonymousClass0eM A03 = C66302MMl.A00(this, 20);
    public final AnonymousClass0eM A04 = C66302MMl.A00(this, 21);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final /* synthetic */ void Ct1(User user) {
    }

    public final /* synthetic */ void Cu9(User user, String str) {
    }

    public final /* synthetic */ void D0X(User user) {
    }

    public final /* synthetic */ void DGW(String str) {
    }

    public final /* synthetic */ void DLc(User user, Integer num) {
    }

    public final /* synthetic */ void DNI() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.ICh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.LXb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: X.LXb} */
    /* JADX WARNING: type inference failed for: r5v5, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DSL(X.G7P r22, com.instagram.user.model.User r23) {
        /*
            r21 = this;
            r4 = 0
            r11 = r23
            X.0qQ.A0B(r11, r4)
            r7 = r21
            X.0eM r1 = r7.A05
            X.0lg r12 = X.DbT.A0X(r1)
            X.0eM r0 = r7.A04
            java.lang.Object r8 = r0.getValue()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.LF6 r10 = new X.LF6
            r10.<init>(r7, r0)
            java.lang.String r13 = r7.A01
            if (r13 != 0) goto L_0x002b
            java.lang.String r0 = "broadcastId"
        L_0x0023:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002b:
            java.lang.String r14 = r7.A02
            if (r14 != 0) goto L_0x0032
            java.lang.String r0 = "mediaId"
            goto L_0x0023
        L_0x0032:
            android.content.Context r0 = r7.requireContext()
            X.Dg1 r2 = new X.Dg1
            r2.<init>(r0, r12)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            boolean r0 = r11.CPV()
            boolean r5 = X.AnonymousClass7TF.A1Q(r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131965403(0x7f1335db, float:1.9567615E38)
            if (r5 == 0) goto L_0x0053
            r0 = 2131965167(0x7f1334ef, float:1.9567136E38)
        L_0x0053:
            java.lang.String r0 = X.DbY.A0b(r1, r11, r0)
            X.0qQ.A07(r0)
            r3.add(r0)
            boolean r0 = r11.A2A()
            if (r0 == 0) goto L_0x0071
            android.content.Context r1 = r7.requireContext()
            r0 = 2131972018(0x7f134fb2, float:1.9581032E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r3.add(r0)
        L_0x0071:
            boolean r0 = r11.A1w()
            if (r0 != 0) goto L_0x0088
            android.content.Context r1 = r7.requireContext()
            r0 = 2131966693(0x7f133ae5, float:1.9570231E38)
            java.lang.String r0 = X.DbY.A0b(r1, r11, r0)
            X.0qQ.A07(r0)
            r3.add(r0)
        L_0x0088:
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r4]
            java.lang.Object[] r1 = r3.toArray(r0)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            int r3 = r1.length
            r0 = 0
        L_0x0092:
            if (r0 >= r3) goto L_0x00f1
            r6 = r1[r0]
            android.content.Context r5 = r7.requireContext()
            r4 = 2131965167(0x7f1334ef, float:1.9567136E38)
            java.lang.String r4 = X.DbY.A0b(r5, r11, r4)
            boolean r4 = X.0qQ.A0K(r6, r4)
            if (r4 == 0) goto L_0x00c0
            java.lang.String r4 = r6.toString()
            r16 = 9
            X.LXb r15 = new X.LXb
            r17 = r7
            r18 = r11
            r19 = r12
            r20 = r7
            r15.<init>(r16, r17, r18, r19, r20)
            r2.A0A(r4, r15)
        L_0x00bd:
            int r0 = r0 + 1
            goto L_0x0092
        L_0x00c0:
            android.content.Context r5 = r7.requireContext()
            r4 = 2131965403(0x7f1335db, float:1.9567615E38)
            java.lang.String r4 = X.DbY.A0b(r5, r11, r4)
            boolean r5 = X.0qQ.A0K(r6, r4)
            java.lang.String r4 = r6.toString()
            if (r5 == 0) goto L_0x00e9
            r16 = 10
            X.LXb r5 = new X.LXb
            r15 = r5
            r17 = r7
            r18 = r11
            r19 = r12
            r20 = r7
            r15.<init>(r16, r17, r18, r19, r20)
        L_0x00e5:
            r2.A0C(r4, r5)
            goto L_0x00bd
        L_0x00e9:
            r15 = 2
            X.ICh r5 = new X.ICh
            r9 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00e5
        L_0x00f1:
            X.FFy r1 = new X.FFy
            r1.<init>(r2)
            android.content.Context r0 = r7.requireContext()
            r1.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K8O.DSL(X.G7P, com.instagram.user.model.User):void");
    }

    public final void Dc4() {
    }

    public final void Dc5(User user, boolean z) {
    }

    public final /* synthetic */ void DdZ(User user) {
    }

    public final void Dw8(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass0eM r6 = this.A05;
        Bundle A012 = C46447Df9.A02().A01(AnonymousClass7TE.A0l(r6), C46548Dgp.A01(AnonymousClass7TE.A0l(r6), str, C273654mx.A00(929), "IgLiveModeratorActionsFragment").A04());
        DbT.A1L(this, DbV.A0Y(requireActivity(), A012, DbT.A0X(r6), ModalActivity.class, "IgLiveModeratorActionsFragment"));
    }

    public final /* synthetic */ void E0E(1P0 r1, C21478XcN xcN, User user, Integer num) {
    }

    public final String getModuleName() {
        return "IgLiveModeratorActionsFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Set A06;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r8 = this.A05;
        0lg A0X = DbT.A0X(r8);
        String str2 = this.A01;
        if (str2 != null) {
            0qQ.A0B(A0X, 0);
            1NY A0b = AnonymousClass7TG.A0b(A0X);
            A0b.A0K("live/%s/moderator/get_summary/", new Object[]{str2});
            1OC A0R = DbT.A0R((15p) null, A0b, K1Q.class, LK8.class, true);
            C61500KAf.A00(A0R, this, 40);
            schedule(A0R);
            0wc A012 = AnonymousClass0kN.A01(this, AnonymousClass7TF.A0L(r8, 1));
            String str3 = this.A01;
            Set set = null;
            if (str3 != null) {
                String A0u = DbU.A0u(r8);
                String str4 = this.A02;
                if (str4 == null) {
                    str = "mediaId";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                C270194gL r0 = this.A00;
                if (!(r0 == null || (A06 = r0.A06()) == null)) {
                    ArrayList A0r = AnonymousClass7TG.A0r(A06);
                    Iterator it = A06.iterator();
                    while (it.hasNext()) {
                        DbY.A1W(A0r, it);
                    }
                    set = 00k.A0k(A0r);
                }
                0Aj A0e = AnonymousClass7TE.A0e(A012, "ig_live_moderator_review");
                JTQ.A14(A0e, A0u);
                DbS.A1H(A0e, "impression");
                JTQ.A10(A0e, DbZ.A07(str3));
                C51965G9l.A1I(A0e, str4);
                C51969G9p.A1A(A0e, this);
                JTP.A1G(A0e);
                JTQ.A16(A0e, JTT.A0t(set));
                return;
            }
        }
        str = "broadcastId";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Collection getDefinitions() {
        return JTT.A0s(new KG8(C66365MOw.A00), new C15796Uif(this, AnonymousClass7TE.A0l(this.A05), this, C313666go.BROADCASTER, this, MP0.A00));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(MP1.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131965271);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1579101844);
        K8O.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("moderator_broadcast_id", "0");
        this.A02 = requireArguments.getString("moderator_media_id", "0");
        ReelStore A052 = 1OP.A05(AnonymousClass7TE.A0l(this.A05));
        String str = this.A01;
        if (str == null) {
            0qQ.A0F("broadcastId");
            throw AnonymousClass00P.createAndThrow();
        }
        Reel A0M = A052.A0M(str);
        if (A0M != null) {
            this.A00 = A0M.A0H;
        }
        AnonymousClass0fD.A09(566661708, A022);
    }
}
