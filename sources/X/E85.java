package X;

import android.content.Context;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.instagram.react.modules.base.IgReactQEModule;

public final class E85 extends C361158fl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public E85(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(C360678ey r1, Object obj, Object obj2, Object obj3, int i) {
        r1.A00(new E85(i, obj, obj2, obj3));
    }

    public final void A02() {
        if (6 - this.A00 != 0) {
            super.A02();
        } else {
            AnonymousClass0fN.A00(((UZ2) this.A02).A08);
        }
    }

    public final void A03() {
        Object obj;
        switch (this.A00) {
            case 9:
                obj = this.A02;
                break;
            case 15:
                obj = this.A01;
                break;
            case 16:
                ((F29) this.A03).A00 = false;
                return;
            default:
                super.A03();
                return;
        }
        DbS.A1V(obj);
    }

    public final void A04(C268654dm r5) {
        Throwable cause;
        C62320sa r0;
        switch (this.A00) {
            case 1:
                02m.A0p.markerEnd(39124996, 3);
                C59689JTv.A07((Context) this.A01, 2131961756);
                return;
            case 2:
                FZ1 fz1 = (FZ1) this.A01;
                fz1.A02 = false;
                Throwable A012 = r5.A01();
                if (A012 != null) {
                    0wb.A06("CheckpointManagerImpl", "Failed to get bloks challenge", A012);
                } else {
                    0wb.A03("CheckpointManagerImpl", "Failed to get bloks challenge");
                }
                F0A f0a = (F0A) this.A02;
                if (f0a != null) {
                    FZ1.A00((Context) this.A03, fz1, f0a);
                    return;
                }
                return;
            case 3:
                0qQ.A0B(r5, 0);
                ((Runnable) this.A02).run();
                ((F2Q) this.A03).A02.clear();
                Dba.A1T("MinorEducationFlowController", "Unable to fetch bloks action for Joiner Transparency", r5.A01());
                return;
            case 4:
                C59689JTv.A0B((Context) this.A01, "something_went_wrong");
                return;
            case 5:
                0qQ.A0B(r5, 0);
                Context A07 = DbT.A07(this.A01);
                if (A07 != null) {
                    C59689JTv.A03(A07, A07.getString(2131968258), "network_error", 0);
                }
                Throwable A013 = r5.A01();
                if (A013 != null && (cause = A013.getCause()) != null) {
                    0wb.A07(((AnonymousClass0iw) this.A02).getModuleName(), cause);
                    return;
                }
                return;
            case 6:
                if (((Fragment) this.A03).isResumed()) {
                    UZ2 uz2 = (UZ2) this.A02;
                    C59689JTv.A05(uz2.requireContext());
                    uz2.A08.dismiss();
                    return;
                }
                return;
            case 7:
            case 8:
                C49952FGh.A01((Context) this.A01);
                return;
            case 10:
                r0 = ((C64084LMc) this.A01).A01;
                if (r0 == null) {
                    return;
                }
                break;
            case 11:
                ((FBX) this.A02).A00.markerEnd(857808852, 3);
                r0 = ((C50954Flh) this.A03).A00;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                ((ESM) this.A03).A04 = false;
                C48916EmG.A00().A01((Window) this.A02);
                return;
            case 13:
                C59689JTv.A0F((Context) this.A01, "branded_content_tools_error", 2131954189);
                return;
            case 15:
                0qQ.A0B(r5, 0);
                Dba.A1T("INFO_CENTER_FACT", "Failed to load consent flow", r5.A01());
                ((0hq) this.A02).A0c();
                return;
            case 16:
                C59689JTv.A0A((Context) this.A01, "bloks_bottom_sheet_error");
                return;
            case 17:
                C59689JTv.A03((Context) this.A01, "error", "error", 0);
                return;
            default:
                return;
        }
        r0.invoke();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008a, code lost:
        r0 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cb, code lost:
        r0 = (X.AnonymousClass0iw) r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cf, code lost:
        r1 = X.DbT.A0N(r1, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e1, code lost:
        r1 = X.DbT.A0M((androidx.fragment.app.Fragment) r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0159, code lost:
        r1 = (X.C229382nI) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        X.C48382Edd.A00(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A05(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x014e;
                case 1: goto L_0x0147;
                case 2: goto L_0x00e9;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00ae;
                case 6: goto L_0x0093;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x008d;
                case 10: goto L_0x0082;
                case 11: goto L_0x017c;
                case 12: goto L_0x0067;
                case 13: goto L_0x0056;
                case 14: goto L_0x0045;
                case 15: goto L_0x003d;
                case 16: goto L_0x0032;
                case 17: goto L_0x015d;
                case 18: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A03
            X.0lg r0 = (X.0lg) r0
            X.F5E.A00(r0)
            java.lang.Object r1 = r7.A02
            X.2nI r1 = (X.C229382nI) r1
            r0 = 1
            r1.A00 = r0
        L_0x0017:
            X.C48382Edd.A00(r1, r8)
        L_0x001a:
            return
        L_0x001b:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r2 = r7.A03
            X.0lg r2 = (X.0lg) r2
            java.lang.Object r1 = r7.A01
            android.app.Activity r1 = (android.app.Activity) r1
            X.DbS.A1X(r1)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r7.A02
            X.4DH r0 = (X.AnonymousClass4DH) r0
            goto L_0x00cf
        L_0x0032:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A03
            X.F29 r0 = (X.F29) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            goto L_0x008a
        L_0x003d:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r1 = r7.A03
            goto L_0x0159
        L_0x0045:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r2 = r7.A03
            X.0lg r2 = (X.0lg) r2
            java.lang.Object r1 = r7.A02
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r7.A01
            X.0xG r0 = (X.0xG) r0
            goto L_0x00cf
        L_0x0056:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r2 = r7.A02
            X.0lg r2 = (X.0lg) r2
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r7.A03
            com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity r0 = (com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity) r0
            goto L_0x00cf
        L_0x0067:
            X.Di0 r8 = (X.C46620Di0) r8
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.lang.Object r0 = r7.A03
            X.ESM r0 = (X.ESM) r0
            r0.A04 = r1
            X.1ZF r1 = X.C48916EmG.A00()
            java.lang.Object r0 = r7.A02
            android.view.Window r0 = (android.view.Window) r0
            r1.A01(r0)
            java.lang.Object r1 = r7.A01
            goto L_0x0159
        L_0x0082:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r1 = r7.A03
            X.0lg r1 = (X.0lg) r1
        L_0x008a:
            java.lang.Object r0 = r7.A02
            goto L_0x00e1
        L_0x008d:
            X.Di0 r8 = (X.C46620Di0) r8
            java.lang.Object r1 = r7.A03
            goto L_0x0159
        L_0x0093:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A03
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r7.A02
            X.UZ2 r0 = (X.UZ2) r0
            X.6ST r0 = r0.A08
            r0.dismiss()
            java.lang.Object r1 = r7.A01
            goto L_0x0159
        L_0x00ae:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r2 = r7.A03
            X.0lg r2 = (X.0lg) r2
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.FragmentActivity r1 = X.DbT.A0E(r0)
            goto L_0x00cb
        L_0x00bd:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A03
            X.O8l r0 = (X.C70486O8l) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
        L_0x00cb:
            java.lang.Object r0 = r7.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
        L_0x00cf:
            X.2nI r1 = X.DbT.A0N(r1, r0, r2)
            goto L_0x0017
        L_0x00d5:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A03
            X.F2Q r0 = (X.F2Q) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            java.lang.Object r0 = r7.A01
        L_0x00e1:
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2nI r1 = X.DbT.A0M(r0, r1)
            goto L_0x0017
        L_0x00e9:
            java.lang.Object r1 = r7.A01
            X.FZ1 r1 = (X.FZ1) r1
            r3 = 0
            r1.A02 = r3
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x001a
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x001a
            X.0lg r2 = r1.A06
            boolean r0 = r2.hasEnded()
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r1.A04 = r0
            r1.A05 = r3
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.DiG r0 = X.C46636DiG.A00(r2)
            int r1 = r0.A01(r8)
            java.lang.String r0 = "ChallengeFragment.bloksAction"
            r6.putInt(r0, r1)
            java.lang.String r5 = r2.getToken()
            X.0qQ.A0B(r5, r3)
            java.lang.Object r4 = r7.A03
            android.content.Context r4 = (android.content.Context) r4
            X.0qQ.A0B(r4, r3)
            java.lang.Class<com.instagram.challenge.activity.ChallengeActivity> r0 = com.instagram.challenge.activity.ChallengeActivity.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4, r0)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r3.addFlags(r0)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "bloks"
            java.lang.String r0 = "ChallengeFragment.challengeType"
            r2.putString(r0, r1)
            X.DbS.A1A(r6, r5)
            java.lang.String r0 = "ChallengeFragment.arguments"
            r2.putBundle(r0, r6)
            r3.putExtras(r2)
            goto L_0x0191
        L_0x0147:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r1 = r7.A02
            goto L_0x0159
        L_0x014e:
            X.Di0 r8 = (X.C46620Di0) r8
            java.lang.Object r0 = r7.A02
            X.G8D r0 = (X.G8D) r0
            r0.AGV()
            java.lang.Object r1 = r7.A03
        L_0x0159:
            X.2nI r1 = (X.C229382nI) r1
            goto L_0x0017
        L_0x015d:
            X.Di0 r2 = X.DbV.A0Q(r8)
            java.lang.Object r1 = r7.A03     // Catch:{ IllegalStateException -> 0x0171 }
            X.0lg r1 = (X.0lg) r1     // Catch:{ IllegalStateException -> 0x0171 }
            java.lang.Object r0 = r7.A02     // Catch:{ IllegalStateException -> 0x0171 }
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch:{ IllegalStateException -> 0x0171 }
            X.2nI r0 = X.DbT.A0M(r0, r1)     // Catch:{ IllegalStateException -> 0x0171 }
            X.C48382Edd.A00(r0, r2)     // Catch:{ IllegalStateException -> 0x0171 }
            return
        L_0x0171:
            X.0wj r2 = X.0wj.A01
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r0 = "QM Bloks Action failed - IllegalState"
            r2.AEf(r0, r1)
            return
        L_0x017c:
            X.Di0 r1 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A01
            X.2nI r0 = (X.C229382nI) r0
            X.C48382Edd.A00(r0, r1)
            java.lang.Object r0 = r7.A03
            X.Flh r0 = (X.C50954Flh) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            return
        L_0x0191:
            X.0kR.A0B(r4, r3)     // Catch:{ IllegalStateException -> 0x0195 }
            goto L_0x01a0
        L_0x0195:
            r1 = move-exception
            r0 = 422(0x1a6, float:5.91E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A07(r0, r1)
            return
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E85.A05(java.lang.Object):void");
    }
}
