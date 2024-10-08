package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Moi  reason: case insensitive filesystem */
public final class C67488Moi {
    public C67304Mle A00;
    public List A01 = A00(this);
    public final Context A02;
    public final UserSession A03;
    public final boolean A04;
    public final AnonymousClass0iw A05;
    public final C67487Moh A06;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.Nph] */
    public static void A01(C67488Moi moi, C67304Mle mle, C331157Pu r8) {
        int i;
        Integer num;
        Context context = moi.A02;
        if (!moi.A04 || mle != C67304Mle.A05) {
            i = mle.A00;
        } else {
            i = 2131964246;
        }
        String string = context.getString(i);
        boolean A1W = AnonymousClass7TF.A1W(mle, moi.A00);
        C71399Ojy ojy = new C71399Ojy(12, r8, mle, moi);
        if (2El.A0D(moi.A03)) {
            num = mle.A02;
        } else {
            num = null;
        }
        0qQ.A0B(string, 1);
        ? obj = new Object();
        obj.A02 = string;
        obj.A03 = A1W;
        obj.A00 = ojy;
        obj.A01 = num;
        C67813MvH.A00.add(obj);
    }

    public final void A02(C67304Mle mle) {
        String str;
        boolean z = false;
        if (this.A00 != mle) {
            if (this.A01.contains(mle) || mle == C67304Mle.A05) {
                z = true;
            }
            17k.A0B(mle.toString(), "The filter type %s is not in the enabled filter list.", z);
            this.A00 = mle;
            UserSession userSession = this.A03;
            AnonymousClass0iw r1 = this.A05;
            switch (mle.ordinal()) {
                case 0:
                    str = "filter_inbox";
                    break;
                case 1:
                    str = C273654mx.A00(2384);
                    break;
                case 2:
                case 3:
                    str = C273654mx.A00(2379);
                    break;
                case 4:
                    str = "filter_close_friends";
                    break;
                case 5:
                    str = "filter_verified_accounts";
                    break;
                case 6:
                    str = "filter_subscribers";
                    break;
                case 7:
                    str = "filter_creators";
                    break;
                case 8:
                    str = "filter_businesses";
                    break;
                case 9:
                    str = C273654mx.A00(2383);
                    break;
                case 10:
                    str = C273654mx.A00(2378);
                    break;
                case 11:
                    str = C273654mx.A00(2380);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = "filter_paid";
                    break;
                case 13:
                    str = C273654mx.A00(2381);
                    break;
                case 14:
                    str = "filter_lead";
                    break;
                case 15:
                    str = "filter_people_you_follow";
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    C3265677h.A0Q(r1, userSession, "filter_creator_ai");
                    C52369GPq.A01(C54688HOt.A0H, new C52369GPq(userSession, (String) null));
                    break;
                case 19:
                    str = "filter_followers";
                    break;
                case 20:
                    str = "filter_groups";
                    break;
            }
            C3265677h.A0Q(r1, userSession, str);
            C67487Moh moh = this.A06;
            C66633Ma2 ma2 = moh.A01;
            C74504Pvz BzE = C66581MXm.A0V(ma2).BzE();
            C2611948q r2 = mle.A01;
            BzE.EoV(r2);
            C66736Mbh mbh = moh.A00;
            C2611948q r12 = C2611948q.ALL;
            boolean A1a = C51969G9p.A1a(r2, r12);
            C67141Miz miz = mbh.A0E;
            miz.A0P = A1a;
            mbh.A0B(2El.A0B(mbh.A0B));
            if (r2 == r12 && 2El.A00(ma2.A0p())) {
                miz.A0B = C69974NvE.A00(ma2.A0p(), C67486Mog.A00(r2), ma2.A0f, ma2.A0s());
                C66736Mbh.A03(mbh);
            }
        }
    }

    public C67488Moi(Context context, AnonymousClass0iw r8, UserSession userSession, C67487Moh moh, String str, boolean z) {
        C2611948q r2;
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = moh;
        this.A04 = z;
        C2611948q[] values = C2611948q.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r2 = C2611948q.ALL;
                break;
            }
            r2 = values[i];
            if (00p.A0j(r2.A00, str, true)) {
                break;
            }
            i++;
        }
        this.A00 = C67486Mog.A00(r2);
        this.A05 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r0 = X.182.A06(r9, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (r0.getFanClubId() != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (X.182.A06(X.0Tu.A06, r7, 36322293609146419L) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        if (r0 != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        r0 = X.2El.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        if (r0 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (r2 != X.C67304Mle.A0N) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        r6.add(1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c1, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        if (r2 != X.C67304Mle.A0A) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        X.C52369GPq.A01(X.C54688HOt.A0I, new X.C52369GPq(r7, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        r6.add(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A00(X.C67488Moi r10) {
        /*
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            X.Mle[] r5 = X.C67304Mle.values()
            int r4 = r5.length
            r3 = 0
        L_0x000a:
            if (r3 >= r4) goto L_0x00d8
            r2 = r5[r3]
            com.instagram.common.session.UserSession r7 = r10.A03
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r8 = 1
            X.0qQ.A0B(r7, r8)
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x00ba;
                case 2: goto L_0x0063;
                case 3: goto L_0x0024;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00b4;
                case 6: goto L_0x007b;
                case 7: goto L_0x00ae;
                case 8: goto L_0x00ae;
                case 9: goto L_0x00ba;
                case 10: goto L_0x0051;
                case 11: goto L_0x0051;
                case 12: goto L_0x0051;
                case 13: goto L_0x0051;
                case 14: goto L_0x0051;
                case 15: goto L_0x0092;
                case 16: goto L_0x0031;
                case 17: goto L_0x003f;
                case 18: goto L_0x0056;
                case 19: goto L_0x00b4;
                case 20: goto L_0x00b4;
                default: goto L_0x001f;
            }
        L_0x001f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0024:
            X.0Tu r9 = X.0Tu.A05
            r0 = 36330110449631703(0x81120b000041d7, double:3.038646365735293E-306)
            boolean r0 = X.182.A06(r9, r7, r0)
            goto L_0x00b8
        L_0x0031:
            boolean r0 = X.2El.A0D(r7)
            if (r0 == 0) goto L_0x00c1
            X.0Tu r9 = X.0Tu.A05
            r0 = 36316830411723430(0x8105f7000f12a6, double:3.0302480162876805E-306)
            goto L_0x004c
        L_0x003f:
            boolean r0 = X.2El.A0D(r7)
            if (r0 == 0) goto L_0x00c1
            X.0Tu r9 = X.0Tu.A05
            r0 = 36316830411788967(0x8105f7001012a7, double:3.0302480163291264E-306)
        L_0x004c:
            boolean r0 = X.182.A06(r9, r7, r0)
            goto L_0x00b8
        L_0x0051:
            boolean r0 = X.2El.A0D(r7)
            goto L_0x00b2
        L_0x0056:
            X.0t1 r0 = X.0eE.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = r0.A2O()
            goto L_0x00b8
        L_0x0063:
            boolean r0 = X.2El.A01(r7)
            if (r0 != 0) goto L_0x00ba
            X.0Tu r9 = X.0Tu.A05
            r0 = 36330110449631703(0x81120b000041d7, double:3.038646365735293E-306)
            boolean r0 = X.182.A06(r9, r7, r0)
            if (r0 != 0) goto L_0x00c1
            boolean r0 = X.C66700Mb7.A01(r7)
            goto L_0x00b8
        L_0x007b:
            X.0t1 r0 = X.0eE.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B3v()
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = r0.getFanClubId()
            if (r0 == 0) goto L_0x00b4
            goto L_0x00ba
        L_0x0092:
            X.0t1 r0 = X.0eE.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.2Ek.A01(r0)
            if (r0 == 0) goto L_0x00b4
            X.0Tu r9 = X.0Tu.A06
            r0 = 36322293609146419(0x810aef00002833, double:3.033702964336509E-306)
            boolean r0 = X.182.A06(r9, r7, r0)
            if (r0 == 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00ae:
            boolean r0 = X.2El.A06(r7)
        L_0x00b2:
            if (r0 != 0) goto L_0x00ba
        L_0x00b4:
            boolean r0 = X.2El.A01(r7)
        L_0x00b8:
            if (r0 == 0) goto L_0x00c1
        L_0x00ba:
            X.Mle r0 = X.C67304Mle.A0N
            if (r2 != r0) goto L_0x00c5
            r6.add(r8, r2)
        L_0x00c1:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x00c5:
            X.Mle r0 = X.C67304Mle.A0A
            if (r2 != r0) goto L_0x00d4
            r0 = 0
            X.GPq r1 = new X.GPq
            r1.<init>(r7, r0)
            X.HOt r0 = X.C54688HOt.A0I
            X.C52369GPq.A01(r0, r1)
        L_0x00d4:
            r6.add(r2)
            goto L_0x00c1
        L_0x00d8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67488Moi.A00(X.Moi):java.util.ArrayList");
    }
}
