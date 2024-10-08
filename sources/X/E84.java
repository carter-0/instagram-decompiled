package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;

public final class E84 extends C361158fl {
    public final int A00;
    public final Object A01;

    public E84(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C360678ey r1, Object obj, int i) {
        r1.A00(new E84(obj, i));
    }

    public final void A02() {
        AnonymousClass37D r0;
        switch (this.A00) {
            case 25:
                C67614Mqm mqm = (C67614Mqm) this.A01;
                C67614Mqm.A00(C21123XFn.FETCHING_START, mqm);
                if (!mqm.A02 && (r0 = mqm.A07) != null && !((AnonymousClass37F) r0).A0g) {
                    mqm.A02 = true;
                    C67614Mqm.A02(mqm);
                }
                mqm.A08.A02();
                return;
            case 28:
                return;
            default:
                super.A02();
                return;
        }
    }

    public final void A03() {
        switch (this.A00) {
            case 9:
            case 15:
                return;
            case 25:
                C67614Mqm mqm = (C67614Mqm) this.A01;
                mqm.A01 = true;
                mqm.A02 = false;
                return;
            default:
                super.A03();
                return;
        }
    }

    public final void A04(C268654dm r6) {
        FragmentActivity fragmentActivity;
        C268654dm r1;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r6, 0);
                Throwable A012 = r6.A01();
                FBO fbo = ((ExR) this.A01).A01;
                1Kn.A00((C307786Rm) null, "BKAsyncActionInvoker", 002.A0R("Bloks Async Action Request Failed - ", fbo.A05), A012);
                C51897G6n g6n = fbo.A02;
                if (g6n != null) {
                    g6n.onFailure(A012);
                }
                Q3B q3b = fbo.A00;
                if (q3b != null) {
                    q3b.A04((C307896Rx) null, DbY.A0Q((Object) null));
                    return;
                }
                return;
            case 1:
                0qQ.A0B(r6, 0);
                1Kn.A00(((C307896Rx) this.A01).A03, "BKBloksActionMetaaiAsyncFetchResponseStreamImpl", "Unexpected error happened when fetching Meta AI response stream.", r6.A01());
                return;
            case 3:
                C59689JTv.A07(DbT.A07(this.A01), 2131954189);
                return;
            case 5:
                0qQ.A0B(r6, 0);
                F2R f2r = (F2R) this.A01;
                C59689JTv.A0B(f2r.A00, "something_went_wrong");
                UserSession userSession = f2r.A02;
                AnonymousClass0iw r0 = f2r.A01;
                C54963HZt.A00(AnonymousClass0kN.A01(r0, userSession), r6, f2r.A03);
                return;
            case 6:
                ELX elx = (ELX) this.A01;
                UserSession userSession2 = elx.A00;
                String str = elx.A01;
                if (elx instanceof ELW) {
                    AnonymousClass7TG.A1N(userSession2, str);
                    FG9.A00(userSession2, "initial_async_controller_request_error", str);
                }
                C48916EmG.A00().A01(elx.A00);
                elx.A01.A01().setVisibility(0);
                return;
            case 7:
                C49952FGh.A01(DbT.A08(this.A01));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C59689JTv.A0F(((C3250870z) this.A01).A07.getContext(), "branded_content_tools_error", 2131954189);
                return;
            case 13:
                0qQ.A0B(r6, 0);
                Context context = ((FV7) this.A01).A00;
                C59689JTv.A03(context, context.getString(2131968258), "save_to_creator_list_failed", 0);
                Dba.A1T("BrandedContentAddToList", "Error in fetching bloks BC Creators AddToList bottom sheet", r6.A01());
                return;
            case 25:
                0qQ.A0B(r6, 0);
                C67614Mqm mqm = (C67614Mqm) this.A01;
                AnonymousClass37D r02 = mqm.A07;
                if (r02 == null || ((AnonymousClass37F) r02).A0g) {
                    Throwable A013 = r6.A01();
                    if (A013 != null) {
                        r1 = new C268664dn(A013);
                    } else {
                        AnonymousClass9JA r03 = (AnonymousClass9JA) r6.A00();
                        if (r03 != null) {
                            r1 = new C268674do(new OAQ(r03.A02));
                        } else {
                            C49727F3r f3r = mqm.A08;
                            f3r.A01();
                            C49960FGs.A03(mqm.A03);
                            f3r.A05((HashMap) null);
                            return;
                        }
                    }
                    C67614Mqm.A01(r1, mqm);
                    return;
                }
                return;
            case 26:
                0qQ.A0B(r6, 0);
                fragmentActivity = ((EQQ) this.A01).A02;
                break;
            case 27:
                0qQ.A0B(r6, 0);
                fragmentActivity = ((EQP) this.A01).A01;
                break;
            case 28:
                C59689JTv.A0B(DbT.A08(this.A01), "something_went_wrong");
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                0qQ.A0B(r6, 0);
                fragmentActivity = ((EQO) this.A01).A00.getActivity();
                if (fragmentActivity == null) {
                    return;
                }
                break;
            default:
                return;
        }
        C49952FGh.A03(fragmentActivity, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bf, code lost:
        r1 = X.DbT.A0M(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        X.C48382Edd.A00(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0252, code lost:
        r0 = X.DbT.A0M(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x025f, code lost:
        X.C48382Edd.A00(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0262, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        r1 = X.DbY.A0L(r1, r2, r0);
        r1.A00 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A05(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x015f;
                case 1: goto L_0x0263;
                case 2: goto L_0x0257;
                case 3: goto L_0x0244;
                case 4: goto L_0x022c;
                case 5: goto L_0x0120;
                case 6: goto L_0x0202;
                case 7: goto L_0x0101;
                case 8: goto L_0x00ed;
                case 9: goto L_0x00d5;
                case 10: goto L_0x0005;
                case 11: goto L_0x00c5;
                case 12: goto L_0x00b3;
                case 13: goto L_0x00a6;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0099;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x008d;
                case 25: goto L_0x004a;
                case 26: goto L_0x0034;
                case 27: goto L_0x0025;
                case 28: goto L_0x01b0;
                case 29: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r1 = r9.A01
            X.2nI r1 = (X.C229382nI) r1
        L_0x000d:
            X.C48382Edd.A00(r1, r10)
        L_0x0010:
            return
        L_0x0011:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r0 = r9.A01
            X.EQO r0 = (X.EQO) r0
            X.0lg r1 = r0.A01
            X.4DH r0 = r0.A00
            X.2nI r1 = X.DbT.A0M(r0, r1)
            r0 = 1
            r1.A00 = r0
            goto L_0x000d
        L_0x0025:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r0 = r9.A01
            X.EQP r0 = (X.EQP) r0
            X.0lg r2 = r0.A02
            com.instagram.base.activity.IgFragmentActivity r1 = r0.A01
            java.lang.String r0 = "Security Checkup"
            goto L_0x0042
        L_0x0034:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r0 = r9.A01
            X.EQQ r0 = (X.EQQ) r0
            X.0aP r2 = r0.A03
            com.instagram.base.activity.IgFragmentActivity r1 = r0.A02
            java.lang.String r0 = "Password Reset"
        L_0x0042:
            X.2nI r1 = X.DbY.A0L(r1, r2, r0)
            r0 = 1
            r1.A00 = r0
            goto L_0x000d
        L_0x004a:
            X.Di0 r6 = X.DbV.A0Q(r10)
            java.lang.Object r7 = r9.A01
            X.Mqm r7 = (X.C67614Mqm) r7
            X.37D r0 = r7.A07
            if (r0 == 0) goto L_0x005d
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != 0) goto L_0x005d
            return
        L_0x005d:
            X.7Pu r5 = r7.A00
            if (r5 == 0) goto L_0x0010
            X.XFn r0 = X.C21123XFn.FETCHING_DONE
            X.C67614Mqm.A00(r0, r7)
            X.F3r r4 = r7.A08
            r3 = 0
            r4.A04(r3)
            com.instagram.common.session.UserSession r2 = r7.A06
            androidx.fragment.app.FragmentActivity r1 = r7.A03
            X.0iw r0 = r7.A05
            X.2nI r2 = X.C229382nI.A01(r3, r1, r0, r2)
            r0 = 2131428979(0x7f0b0673, float:1.8479618E38)
            android.util.SparseArray r1 = r2.A01
            r1.put(r0, r5)
            r0 = 2131435100(0x7f0b1e5c, float:1.8492033E38)
            r1.put(r0, r4)
            X.Ftk r0 = new X.Ftk
            r0.<init>(r2, r6)
            X.C245983dn.A01(r0)
            return
        L_0x008d:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r1 = r9.A01
            X.2nI r1 = (X.C229382nI) r1
            if (r1 == 0) goto L_0x0010
            goto L_0x000d
        L_0x0099:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r0 = r9.A01
            X.EyM r0 = (X.EyM) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.4DH r0 = r0.A00
            goto L_0x00bf
        L_0x00a6:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r0 = r9.A01
            X.FV7 r0 = (X.FV7) r0
            com.instagram.common.session.UserSession r1 = r0.A07
            X.4DH r0 = r0.A04
            goto L_0x00bf
        L_0x00b3:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r0 = r9.A01
            X.70z r0 = (X.C3250870z) r0
            com.instagram.common.session.UserSession r1 = r0.A05
            com.instagram.profile.fragment.UserDetailFragment r0 = r0.A07
        L_0x00bf:
            X.2nI r1 = X.DbT.A0M(r0, r1)
            goto L_0x000d
        L_0x00c5:
            X.Di0 r10 = (X.C46620Di0) r10
            java.lang.Object r0 = r9.A01
            X.EDa r0 = (X.C47691EDa) r0
            java.lang.Object r0 = r0.A01
            X.FPH r0 = (X.FPH) r0
            java.lang.Object r1 = r0.A03
            X.2nI r1 = (X.C229382nI) r1
            goto L_0x000d
        L_0x00d5:
            X.Di0 r10 = (X.C46620Di0) r10
            java.lang.Object r1 = r9.A01
            X.EEM r1 = (X.EEM) r1
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            X.0aP r3 = r1.A08
            X.4DH r2 = r1.A06
            X.FUD r1 = new X.FUD
            r1.<init>()
            r0 = 0
            X.2nI r1 = X.C229382nI.A02(r2, r1, r3, r0)
            goto L_0x000d
        L_0x00ed:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r1 = r9.A01
            X.E4f r1 = (X.C47480E4f) r1
            X.0eM r0 = r1.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2nI r1 = X.DbT.A0M(r1, r0)
            goto L_0x000d
        L_0x0101:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r3 = r9.A01
            X.E25 r3 = (X.E25) r3
            X.0aP r0 = r3.A06
            java.lang.String r2 = "loggedOutSession"
            r1 = 0
            if (r0 == 0) goto L_0x027a
            X.F5E.A00(r0)
            X.0aP r0 = r3.A06
            if (r0 == 0) goto L_0x027a
            X.2nI r1 = X.C229382nI.A03(r3, r0, r1)
            r0 = 1
            r1.A00 = r0
            goto L_0x000d
        L_0x0120:
            X.Di0 r4 = X.DbV.A0Q(r10)
            java.lang.Object r3 = r9.A01
            X.F2R r3 = (X.F2R) r3
            com.instagram.common.session.UserSession r2 = r3.A02
            androidx.fragment.app.FragmentActivity r0 = r3.A00
            X.0iw r1 = r3.A01
            X.2nI r0 = X.DbT.A0N(r0, r1, r2)
            X.C48382Edd.A00(r0, r4)
            java.lang.String r3 = r3.A03
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r2)
            r0 = 3240(0xca8, float:4.54E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 165(0xa5, float:2.31E-43)
            X.1Ln r1 = new X.1Ln
            r1.<init>(r2, r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0010
            r0 = 172(0xac, float:2.41E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.A0R(r0, r3)
            r1.Cgf()
            return
        L_0x015f:
            X.Di0 r10 = (X.C46620Di0) r10
            r8 = 0
            X.0qQ.A0B(r10, r8)
            java.lang.Object r1 = r9.A01
            X.ExR r1 = (X.ExR) r1
            X.0sm r0 = X.0Yt.A0E()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>(r0)
            X.FBO r6 = r1.A01
            java.util.Map r0 = r6.A03
            if (r0 == 0) goto L_0x017b
            r7.putAll(r0)
        L_0x017b:
            android.content.Context r5 = r1.A00
            X.2nJ r4 = r1.A02
            r3 = 0
            X.Q3B r2 = r6.A01
            X.Q3B r1 = r6.A00
            X.4uI r0 = r10.A02
            if (r0 != 0) goto L_0x0199
            if (r1 == 0) goto L_0x0191
            X.6Tm r0 = X.DbY.A0Q(r3)
            r1.A04(r3, r0)
        L_0x0191:
            X.G6n r0 = r6.A02
            if (r0 == 0) goto L_0x0010
            r0.onSuccess()
            return
        L_0x0199:
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            java.lang.Object r1 = X.C307886Rw.A02(r5, r10, r4, r0, r7)
            if (r2 == 0) goto L_0x0191
            X.6Tl r0 = X.DbS.A0P()
            r0.A03(r1, r8)
            X.6Tm r0 = X.DbT.A0V(r0, r3)
            r2.A04(r3, r0)
            goto L_0x0191
        L_0x01b0:
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.Object r2 = r9.A01
            X.E6Y r2 = (X.E6Y) r2
            com.instagram.common.session.UserSession r0 = r2.A00
            X.DiG r0 = X.C46636DiG.A00(r0)
            int r1 = r0.A01(r10)
            java.lang.String r0 = "ChallengeFragment.bloksAction"
            r6.putInt(r0, r1)
            r1 = 0
            com.instagram.common.session.UserSession r0 = r2.A00
            java.lang.String r5 = r0.A05
            android.content.Context r4 = X.DbT.A06(r2, r5, r1)
            java.lang.Class<com.instagram.challenge.activity.ChallengeActivity> r0 = com.instagram.challenge.activity.ChallengeActivity.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r3.addFlags(r0)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "bloks"
            java.lang.String r0 = "ChallengeFragment.challengeType"
            r2.putString(r0, r1)
            X.DbS.A1A(r6, r5)
            java.lang.String r0 = "ChallengeFragment.arguments"
            r2.putBundle(r0, r6)
            r3.putExtras(r2)
            X.0kR.A0B(r4, r3)     // Catch:{ IllegalStateException -> 0x01f6 }
            goto L_0x0201
        L_0x01f6:
            r1 = move-exception
            r0 = 422(0x1a6, float:5.91E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A07(r0, r1)
            return
        L_0x0201:
            return
        L_0x0202:
            X.Di0 r10 = (X.C46620Di0) r10
            java.lang.Object r3 = r9.A01
            X.ELX r3 = (X.ELX) r3
            com.instagram.common.session.UserSession r2 = r3.A00
            java.lang.String r1 = r3.A01
            boolean r0 = r3 instanceof X.ELW
            if (r0 == 0) goto L_0x0218
            X.AnonymousClass7TG.A1N(r2, r1)
            java.lang.String r0 = "initial_async_controller_request_success"
            X.FG9.A00(r2, r0, r1)
        L_0x0218:
            X.2eb r1 = r3.A01
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x0229
            android.view.View r1 = r1.A01()
            r0 = 8
            r1.setVisibility(r0)
        L_0x0229:
            com.instagram.common.session.UserSession r0 = r3.A00
            goto L_0x0252
        L_0x022c:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r0 = r9.A01
            X.FTx r0 = (X.C50217FTx) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            X.4DH r2 = r0.A00
            java.lang.String r0 = "pro_to_pro.framework.async.controller.entry"
            X.0xG r1 = X.DbS.A0O(r0)
            r0 = 0
            X.2nI r0 = X.C229382nI.A02(r2, r1, r3, r0)
            goto L_0x025f
        L_0x0244:
            X.Di0 r10 = X.DbV.A0Q(r10)
            java.lang.Object r3 = r9.A01
            X.E47 r3 = (X.E47) r3
            X.0eM r0 = r3.A03
            X.0lg r0 = X.DbT.A0X(r0)
        L_0x0252:
            X.2nI r0 = X.DbT.A0M(r3, r0)
            goto L_0x025f
        L_0x0257:
            X.Di0 r10 = (X.C46620Di0) r10
            java.lang.Object r0 = r9.A01
            X.E7D r0 = (X.E7D) r0
            X.2nI r0 = r0.A00
        L_0x025f:
            X.C48382Edd.A00(r0, r10)
            return
        L_0x0263:
            X.Di0 r4 = X.DbV.A0Q(r10)
            java.lang.Object r3 = r9.A01
            X.6Rx r3 = (X.C307896Rx) r3
            X.0sm r2 = X.0Yt.A0E()
            X.G39 r1 = X.G39.A00
            X.Q3B r0 = new X.Q3B
            r0.<init>(r1)
            X.C307886Rw.A05(r4, r0, r3, r2)
            return
        L_0x027a:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E84.A05(java.lang.Object):void");
    }
}
