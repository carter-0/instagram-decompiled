package X;

import java.util.HashMap;

/* renamed from: X.UfV  reason: case insensitive filesystem */
public final class C15603UfV extends 1P0 {
    public final /* synthetic */ C16298UsI A00;

    public C15603UfV(C16298UsI usI) {
        this.A00 = usI;
    }

    public final void onFail(C268654dm r10) {
        String str;
        int A0D = AnonymousClass7TG.A0D(r10, -1672821940);
        Throwable A01 = r10.A01();
        if (A01 != null) {
            C16298UsI usI = this.A00;
            0wc r7 = usI.A03;
            if (r7 == null) {
                DbS.A12();
                throw AnonymousClass00P.createAndThrow();
            }
            C16655Uyr uyr = usI.A04;
            boolean z = usI.A06;
            HashMap hashMap = new HashMap();
            if (uyr != null) {
                hashMap.put("preference", AnonymousClass7TF.A0j(DbT.A10(uyr)));
            }
            if (z) {
                str = "BPAT";
            } else {
                str = "FBAT";
            }
            hashMap.put("token_info", str);
            hashMap.put("has_permission", String.valueOf(z));
            0Aj A0e = AnonymousClass7TE.A0e(r7, "fulcrum_error_event");
            A0e.AAJ("event", "fulcrum_init_fetch_error");
            A0e.A9H("selected_values", hashMap);
            DbS.A1N(A0e, "fulcrum_nexus");
            StackTraceElement[] stackTrace = A01.getStackTrace();
            0qQ.A07(stackTrace);
            A0e.A9H("server_exception", AnonymousClass7TF.A0w("exception", 03t.A07(", ", "[", "]", (0sP) null, stackTrace)));
            A0e.AAJ("error_identifier", A01.getMessage());
            A0e.Cgf();
        }
        C15603UfV.super.onFail(r10);
        AnonymousClass0fD.A0A(-277708790, A0D);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1069048807);
        C16298UsI usI = this.A00;
        usI.A07 = false;
        ? r1 = usI.A01;
        if (r1 == 0) {
            0qQ.A0F("activity");
            throw AnonymousClass00P.createAndThrow();
        }
        C51970G9q.A12(r1);
        AnonymousClass0fD.A0A(1211970685, A03);
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r2.A06("eligible_for_tokenless_promote") != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = -865245416(0xffffffffcc6d6718, float:-6.2233696E7)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3JC r13 = (X.AnonymousClass3JC) r13
            r0 = 368981843(0x15fe3753, float:1.0267707E-25)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r2 = r13.A01
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            if (r2 == 0) goto L_0x00e6
            java.lang.Class<X.UJ7> r1 = X.UJ7.class
            java.lang.String r0 = "shadow_instagram_user"
            X.3FZ r2 = r2.A00(r1, r0)
            if (r2 == 0) goto L_0x00e6
            X.VeS r6 = X.WGP.A00
            X.UsI r5 = r12.A00
            X.0wc r7 = r5.A03
            if (r7 == 0) goto L_0x00e3
            X.Uyr r8 = r5.A04
            boolean r11 = r5.A06
            r10 = 0
            java.lang.String r9 = "fulcrum_init_fetch"
            X.1Ln r0 = r6.A00(r7, r8, r9, r10, r11)
            java.lang.String r7 = "fulcrum_nexus"
            java.lang.String r6 = "entry_point"
            r0.A0R(r6, r7)
            r0.Cgf()
            java.lang.String r0 = "can_run_ig_backed_ads"
            boolean r0 = r2.A06(r0)
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "eligible_for_tokenless_promote"
            boolean r1 = r2.A06(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            r5.A06 = r0
            X.Uyr r1 = X.C16655Uyr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "promote_ad_account_link_preference"
            java.lang.Enum r0 = r2.A04(r0, r1)
            X.Uyr r0 = (X.C16655Uyr) r0
            r5.A04 = r0
            java.lang.Class<X.UJ6> r1 = X.UJ6.class
            java.lang.String r0 = "existing_default_ad_account"
            X.3FZ r1 = r2.A00(r1, r0)
            if (r1 == 0) goto L_0x006f
            java.lang.String r0 = "name"
            java.lang.String r9 = r1.A05(r0)
            if (r9 != 0) goto L_0x00bb
        L_0x006f:
            X.0wc r2 = r5.A03
            if (r2 == 0) goto L_0x00e3
            X.Uyr r0 = r5.A04
            boolean r10 = r5.A06
            java.lang.String r9 = "fulcrum_init_fetch_error"
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = X.DbT.A10(r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r0)
            java.lang.String r0 = "preference"
            r8.put(r0, r1)
        L_0x008d:
            java.lang.String r1 = "token_info"
            if (r10 == 0) goto L_0x00e0
            java.lang.String r0 = "BPAT"
        L_0x0093:
            r8.put(r1, r0)
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "has_permission"
            r8.put(r0, r1)
            java.lang.String r0 = "fulcrum_error_event"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r0 = "event"
            r2.AAJ(r0, r9)
            java.lang.String r0 = "selected_values"
            r2.A9H(r0, r8)
            java.lang.String r1 = "Cannot fetch ad account name"
            java.lang.String r0 = "error_identifier"
            r2.AAJ(r0, r1)
            r2.AAJ(r6, r7)
            java.lang.String r9 = ""
        L_0x00bb:
            X.Uyr r0 = r5.A04
            X.Uyr r6 = X.C16655Uyr.INSTAGRAM_BACKED_ADS
            if (r0 != r6) goto L_0x00cd
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r5.A08
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            java.lang.String r9 = r0.getUsername()
        L_0x00cd:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.Vc7 r8 = r5.A05
            if (r8 != 0) goto L_0x00ea
            java.lang.String r0 = "promotePaymentsInterstitialController"
        L_0x00d8:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e0:
            java.lang.String r0 = "FBAT"
            goto L_0x0093
        L_0x00e3:
            java.lang.String r0 = "logger"
            goto L_0x00d8
        L_0x00e6:
            r0 = -1043637(0xfffffffffff0134b, float:NaN)
            goto L_0x014b
        L_0x00ea:
            boolean r1 = r5.A06
            X.Uyr r0 = r5.A04
            r8.A02 = r1
            r8.A00 = r0
            r8.A01 = r9
            r2 = 2131970705(0x7f134a91, float:1.9578369E38)
            r1 = 25
            X.WBC r0 = new X.WBC
            r0.<init>(r8, r1)
            X.OTn r1 = new X.OTn
            r1.<init>((android.view.View.OnClickListener) r0, (int) r2)
            r1.A03 = r9
            r0 = 1
            r1.A06 = r0
            r7.add(r1)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0145
            X.Uyr r0 = X.C16655Uyr.HARD_LINKED_AD_ACCOUNT
            X.Uyr[] r0 = new X.C16655Uyr[]{r0, r6}
            java.util.List r1 = X.0sr.A1P(r0)
            X.Uyr r0 = r8.A00
            boolean r0 = X.00k.A0u(r1, r0)
            if (r0 == 0) goto L_0x0145
            r6 = 2131975501(0x7f135d4d, float:1.9588096E38)
            r1 = 24
            X.WBC r0 = new X.WBC
            r0.<init>(r8, r1)
            X.FAc r2 = new X.FAc
            r2.<init>((android.view.View.OnClickListener) r0, (int) r6)
            X.UsI r0 = r8.A07
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.base.activity.BaseFragmentActivity r0 = r8.A03
            int r0 = X.2Yu.A0D(r0)
            int r0 = r1.getColor(r0)
            r2.A03 = r0
            r7.add(r2)
        L_0x0145:
            r5.setItems(r7)
            r0 = -1958350828(0xffffffff8b45f014, float:-3.8121435E-32)
        L_0x014b:
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1159285068(0xffffffffbae6b6b4, float:-0.0017602057)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15603UfV.onSuccess(java.lang.Object):void");
    }
}
