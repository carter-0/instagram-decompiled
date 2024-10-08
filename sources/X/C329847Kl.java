package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.7Kl  reason: invalid class name and case insensitive filesystem */
public final class C329847Kl {
    public int A00;
    public int A01;
    public ViewGroup A02;
    public C66777McN A03;
    public C70965OTm A04;
    public OVJ A05;
    public C70575OBx A06;
    public C3725591j A07;
    public SmartSuggestion A08;
    public OWQ A09;
    public OGH A0A;
    public Integer A0B;
    public Integer A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public LinearLayout A0H;
    public final Activity A0I;
    public final Context A0J;
    public final UserSession A0K;
    public final C329107Hp A0L;
    public final C254773t1 A0M;
    public final List A0N;
    public final LayoutInflater A0O;
    public final ViewStub A0P;
    public final AnonymousClass0iw A0Q;

    public C329847Kl(Activity activity, Context context, LayoutInflater layoutInflater, ViewStub viewStub, AnonymousClass0iw r6, UserSession userSession, C329107Hp r8, C254773t1 r9, List list) {
        0qQ.A0B(viewStub, 6);
        0qQ.A0B(list, 9);
        this.A0M = r9;
        this.A0J = context;
        this.A0K = userSession;
        this.A0Q = r6;
        this.A0I = activity;
        this.A0P = viewStub;
        this.A0L = r8;
        this.A0O = layoutInflater;
        this.A0N = list;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A0D = obj;
    }

    public static final void A00(C329847Kl r3) {
        ViewGroup viewGroup = r3.A02;
        if (viewGroup == null) {
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.A00 = Math.min(r3.A0G, r3.A01);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = r3.A00;
        viewGroup.setLayoutParams(layoutParams);
    }

    public static final void A01(C329847Kl r17, C255273tr r18, String str) {
        String str2;
        C329847Kl r4 = r17;
        if (r4.A02 == null) {
            ViewStub viewStub = r4.A0P;
            viewStub.setLayoutResource(R.layout.suggested_reply_container);
            View inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            r4.A02 = viewGroup;
            if (viewGroup == null) {
                str2 = "rootView";
            } else {
                r4.A0H = (LinearLayout) viewGroup.findViewById(R.id.suggested_reply_container);
                UserSession userSession = r4.A0K;
                r4.A03 = C66778McO.A00(userSession);
                AnonymousClass4KK.A02(r4.A0M);
                OVJ ovj = new OVJ(userSession, (String) 00k.A0O(r4.A0N, 0));
                r4.A05 = ovj;
                UserSession userSession2 = ovj.A02;
                if (182.A06(0Tu.A06, userSession2, 36316194755973211L)) {
                    2IS r6 = new 2IS();
                    2IS r1 = new 2IS();
                    AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
                    1Ef freshCacheAgeMs = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGPreviousReplyMessageSuggestionListQuery", r6.getParamsCopy(), r1.getParamsCopy(), C43008Bpy.class, false, PandoRealtimeInfoJNI.forLiveQuery("igd_business_my_sayt_list_query"), 0, (String) null, "xig_igd_business_ml_sayt_list_query", new ArrayList()).setFreshCacheAgeMs(86400000);
                    1vm.A01(userSession2).ATL(DF3.A00, new C71569On4(ovj), freshCacheAgeMs);
                } else {
                    ovj.A01.A02(C66594MYg.A03.A02(userSession2, AnonymousClass61K.DIRECT_THREAD).A01.A05.A0M(new C71999OuZ()).A0L(new C72013Oun(ovj)), PTY.A00);
                }
                AnonymousClass0iw r2 = r4.A0Q;
                r4.A09 = new OWQ(r2, userSession);
                r4.A07 = new C3725591j(r2, userSession, C3725391h.A04);
                r4.A06 = new C70575OBx(r2, userSession);
                Context context = r4.A0J;
                OWQ owq = r4.A09;
                if (owq == null) {
                    str2 = "suggestedReplyLogger";
                } else {
                    r4.A04 = new C70965OTm(context, userSession, new C70475O8a(r4), owq);
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        C70965OTm oTm = r4.A04;
        str2 = "bottomSheetController";
        if (oTm != null) {
            C255273tr r3 = r18;
            0qQ.A0B(r3, 0);
            oTm.A00 = r3;
            C70965OTm oTm2 = r4.A04;
            if (oTm2 != null) {
                oTm2.A03 = str;
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0104, code lost:
        if (r6 < 3) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C329847Kl r25, java.util.List r26, X.0sP r27) {
        /*
            r12 = r25
            android.content.Context r10 = r12.A0J
            int r18 = X.0nA.A09(r10)
            android.widget.LinearLayout r0 = r12.A0H
            java.lang.String r17 = "replyContainerView"
            if (r0 == 0) goto L_0x0163
            r0.removeAllViews()
            java.lang.Integer r0 = r12.A0B
            if (r0 == 0) goto L_0x002f
            int r4 = r0.intValue()
            com.instagram.common.session.UserSession r3 = r12.A0K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314047272126847(0x81036f0003097f, double:3.028487947599998E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002f
            android.widget.LinearLayout r0 = r12.A0H
            if (r0 == 0) goto L_0x0163
            r0.setBackgroundColor(r4)
        L_0x002f:
            com.instagram.common.session.UserSession r9 = r12.A0K
            r8 = 0
            X.0Tu r2 = X.0Tu.A06
            r0 = 36329702427738374(0x8111ac00004106, double:3.038388331046979E-306)
            boolean r25 = X.182.A06(r2, r9, r0)
            r11 = r26
            int r16 = r11.size()
            r7 = 0
            r6 = 0
        L_0x0045:
            r0 = r16
            if (r6 >= r0) goto L_0x015d
            android.view.LayoutInflater r2 = r12.A0O
            r1 = 2131629550(0x7f0e15ee, float:1.8886424E38)
            android.widget.LinearLayout r0 = r12.A0H
            if (r0 == 0) goto L_0x0163
            android.view.View r5 = r2.inflate(r1, r0, r8)
            java.lang.Object r0 = r11.get(r6)
            X.OGH r0 = (X.OGH) r0
            X.3ts r0 = r0.A01
            X.3tr r0 = (X.C255273tr) r0
            int r0 = r0.A00
            java.lang.String r2 = r10.getString(r0)
            X.0qQ.A07(r2)
            java.lang.Object r0 = r11.get(r6)
            X.OGH r0 = (X.OGH) r0
            java.lang.Integer r0 = r0.A02
            r21 = r0
            r0 = 2131442144(0x7f0b39e0, float:1.850632E38)
            android.view.View r4 = r5.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r25 == 0) goto L_0x008a
            int r0 = X.OPZ.A00(r21)
            if (r0 != 0) goto L_0x0107
            android.text.SpannedString r0 = new android.text.SpannedString
            r0.<init>(r2)
        L_0x0089:
            r2 = r0
        L_0x008a:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r4.setText(r2)
            r0 = 2131442145(0x7f0b39e1, float:1.8506322E38)
            android.view.View r13 = r5.findViewById(r0)
            android.widget.TextView r13 = (android.widget.TextView) r13
            java.lang.Object r0 = r11.get(r6)
            X.OGH r0 = (X.OGH) r0
            android.text.SpannableString r0 = r0.A00
            r13.setText(r0)
            java.lang.Integer r0 = r12.A0C
            if (r0 == 0) goto L_0x00be
            int r3 = r0.intValue()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314047272126847(0x81036f0003097f, double:3.028487947599998E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00be
            r4.setTextColor(r3)
            r13.setTextColor(r3)
        L_0x00be:
            X.OjI r0 = new X.OjI
            r23 = r27
            r19 = r0
            r20 = r12
            r22 = r11
            r24 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.AnonymousClass0fU.A00(r0, r5)
            if (r6 != 0) goto L_0x0103
            r0 = 2131442074(0x7f0b399a, float:1.8506178E38)
            android.view.View r1 = r5.findViewById(r0)
            r1.setVisibility(r8)
            X.Ohu r0 = new X.Ohu
            r0.<init>(r12)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00e4:
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r18
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r8)
            r5.measure(r1, r0)
            int r0 = r5.getMeasuredHeight()
            int r7 = r7 + r0
        L_0x00f8:
            android.widget.LinearLayout r0 = r12.A0H
            if (r0 == 0) goto L_0x0163
            r0.addView(r5)
            int r6 = r6 + 1
            goto L_0x0045
        L_0x0103:
            r0 = 3
            if (r6 >= r0) goto L_0x00f8
            goto L_0x00e4
        L_0x0107:
            java.lang.String r15 = r10.getString(r0)
            X.0qQ.A07(r15)
            r1 = 2131954368(0x7f130ac0, float:1.9545233E38)
            r14 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r15}
            java.lang.String r1 = r10.getString(r1, r0)
            X.0qQ.A07(r1)
            int r13 = r1.length()
            java.lang.Integer r0 = X.C69998Nvc.A00(r21)
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r1)
            r2 = 33
            if (r0 == 0) goto L_0x0148
            int r0 = r0.intValue()
            int r0 = X.2Yu.A0H(r10, r0)
            int r0 = r10.getColor(r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r15.length()
            int r0 = r13 - r0
            r3.setSpan(r1, r0, r13, r2)
        L_0x0148:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r14)
            int r1 = r15.length()
            int r1 = r13 - r1
            r3.setSpan(r0, r1, r13, r2)
            android.text.SpannedString r0 = new android.text.SpannedString
            r0.<init>(r3)
            goto L_0x0089
        L_0x015d:
            r12.A0G = r7
            A00(r12)
            return
        L_0x0163:
            X.0qQ.A0F(r17)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329847Kl.A02(X.7Kl, java.util.List, X.0sP):void");
    }
}
