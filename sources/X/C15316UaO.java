package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.survey.structuredsurvey.views.SurveyListView;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.UaO  reason: case insensitive filesystem */
public final class C15316UaO extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "RapidFeedbackSurveyFragment";
    public int A00;
    public long A01 = System.currentTimeMillis();
    public C17442VVv A02;
    public C15316UaO A03;
    public U46 A04;
    public SurveyListView A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public View A0C;
    public boolean A0D;
    public final long A0E = System.currentTimeMillis();
    public final VXA A0F = new VXA();
    public final HashMap A0G = new HashMap();
    public final Map A0H = new HashMap();
    public final Map A0I = new HashMap();
    public final AnonymousClass0eM A0J = AnonymousClass0eN.A01(C20673Wx5.A00);
    public final AnonymousClass0eM A0K = C227642jf.A02(this);
    public final View.OnClickListener A0L = new WB0(this, 24);

    public final void A05(String str, boolean z) {
        0qQ.A0B(str, 0);
        this.A0H.put(str, Boolean.valueOf(z));
        C15316UaO uaO = this.A03;
        if (uaO != null) {
            A03(uaO);
        }
    }

    public final void configureActionBar(2da r23) {
        boolean z;
        ColorFilter A062;
        2da r3 = r23;
        0qQ.A0B(r3, 0);
        r3.Eu4(true);
        r3.Eom(2131971298);
        Integer num = AnonymousClass05K.A00;
        WB0 wb0 = new WB0(this, 23);
        Iterator A0u = AnonymousClass7TF.A0u(this.A0I);
        while (true) {
            if (!A0u.hasNext()) {
                z = true;
                break;
            }
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            if (AnonymousClass7TE.A1a(A1J.getValue())) {
                Object obj = this.A0H.get(key);
                if (obj == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (!AnonymousClass7TE.A1a(obj)) {
                    z = false;
                    break;
                }
            }
        }
        Context requireContext = requireContext();
        if (z) {
            A062 = DbV.A06(requireContext, R.color.badge_color);
            r3.ARJ(true);
        } else {
            A062 = DbV.A06(requireContext, R.color.blue_3);
            r3.ARJ(false);
        }
        r3.Ett(this.A0L, true);
        r3.ErJ(new AnonymousClass57Z((Resources.Theme) null, A062, (ColorFilter) null, (Drawable) null, (Drawable) null, wb0, num, -2, -2, -2, 2131954722, R.drawable.instagram_x_pano_outline_24, 2131968361, R.drawable.nav_arrow_next, true));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = A01(requireContext(), this);
        View view2 = this.A0C;
        if (view2 == null) {
            str = "rootView";
        } else {
            SurveyListView surveyListView = (SurveyListView) AnonymousClass7TF.A0G(view2, R.id.rapidfeedback_page).requireViewById(R.id.rapidfeedback_page_list);
            this.A05 = surveyListView;
            if (surveyListView == null) {
                str = "surveyListView";
            } else {
                surveyListView.setAdapter(this.A04);
                U46 u46 = this.A04;
                if (u46 != null) {
                    u46.A00 = getActivity();
                }
                this.A03 = this;
                A03(this);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if (r1.equals(com.instagram.realtimeclient.RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        if (r1 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f1, code lost:
        return r7.AxA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0122, code lost:
        return r7.Ahc();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(X.X9A r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x000f
            java.lang.String r1 = r7.BWR()
            if (r1 == 0) goto L_0x000f
            int r0 = r1.hashCode()
            switch(r0) {
                case -1399754105: goto L_0x0014;
                case -1381030494: goto L_0x0039;
                case -1331586071: goto L_0x00a3;
                case -938285885: goto L_0x00f2;
                case 1008029668: goto L_0x00ad;
                default: goto L_0x000f;
            }
        L_0x000f:
            int r0 = r6.A00
            int r0 = r0 + 1
            return r0
        L_0x0014:
            java.lang.String r0 = "composite"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.WXZ r7 = (X.WXZ) r7
            X.WXY r0 = r7.A03
            int r1 = r6.A00(r0)
            java.util.List r0 = r7.A07
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0123
            java.util.List r0 = r7.A07
            java.lang.Object r0 = r0.get(r1)
            X.X9A r0 = (X.X9A) r0
            int r0 = r6.A00(r0)
            return r0
        L_0x0039:
            java.lang.String r0 = "branch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r5 = r7.Ahd()
            if (r5 == 0) goto L_0x011e
            X.VXA r0 = r6.A0F
            java.util.HashMap r0 = r0.A00
            java.lang.Object r4 = r0.get(r5)
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            r2 = 15
            if (r4 == 0) goto L_0x011e
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x011e
            java.util.HashMap r1 = r6.A0G
            java.lang.Object r0 = r1.get(r5)
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r1.get(r5)
            if (r0 == 0) goto L_0x0119
            X.Vc4 r0 = (X.C17673Vc4) r0
            X.Uyh r0 = r0.A02
            if (r0 == 0) goto L_0x011e
            int r0 = r0.ordinal()
            if (r0 != r2) goto L_0x011e
            java.lang.Object r0 = r4.get(r3)
            X.V3o r0 = (X.C16731V3o) r0
            int r3 = r0.A00
            java.util.List r0 = r7.Ahe()
            X.0qQ.A07(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0089:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.VSd r0 = (X.C17350VSd) r0
            int r0 = r0.A01
            if (r0 != r3) goto L_0x0089
        L_0x009a:
            X.VSd r1 = (X.C17350VSd) r1
            if (r1 == 0) goto L_0x011e
            int r0 = r1.A00
            return r0
        L_0x00a1:
            r1 = 0
            goto L_0x009a
        L_0x00a3:
            java.lang.String r0 = "direct"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ed
            goto L_0x000f
        L_0x00ad:
            java.lang.String r0 = "ans_given"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r2 = r7.Ahd()
            if (r2 == 0) goto L_0x011e
            X.VXA r0 = r6.A0F
            java.util.HashMap r0 = r0.A00
            java.lang.Object r1 = r0.get(r2)
            java.util.List r1 = (java.util.List) r1
            java.util.HashMap r0 = r6.A0G
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x011e
            if (r1 == 0) goto L_0x011e
            java.util.Iterator r2 = r1.iterator()
        L_0x00d3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.V3o r0 = (X.C16731V3o) r0
            java.lang.String r0 = r0.A02
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00d3
            if (r1 == 0) goto L_0x011e
        L_0x00ed:
            int r0 = r7.AxA()
            return r0
        L_0x00f2:
            java.lang.String r0 = "random"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.util.List r2 = r7.Bj7()
            X.0qQ.A07(r2)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0123
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            int r0 = r2.size()
            int r0 = r1.nextInt(r0)
            int r0 = X.C51971G9r.A0I(r2, r0)
            return r0
        L_0x0119:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x011e:
            int r0 = r7.Ahc()
            return r0
        L_0x0123:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15316UaO.A00(X.X9A):int");
    }

    /* JADX WARNING: type inference failed for: r0v34, types: [X.Uro, X.Vrk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v4, types: [X.V3o, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v2, types: [X.V3o, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v42, types: [X.Uro, X.Vrk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v52, types: [X.Urk, X.Vrk, java.lang.Object] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 254 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0226, code lost:
        r3 = new java.util.ArrayList();
        r3.add(X.C18273Voo.A00(r10, r2, r4, r9));
        r12 = X.C16524UwT.A03;
        r3.add(new X.C18441Vrk(r12, r2.A03));
        r15 = r2.A04.iterator();
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0249, code lost:
        if (r15.hasNext() == false) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x024b, code lost:
        r14 = (X.C17443VVw) r15.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0255, code lost:
        if (r15.hasNext() == false) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0257, code lost:
        r13 = r14.A01.A00;
        r1 = r14.A00;
        r0 = r14.A02;
        r14 = new java.lang.Object();
        r14.A00 = r1;
        r14.A02 = r0;
        r14.A01 = r13;
        r13 = r2.A03;
        r0 = new X.C18441Vrk(X.C16524UwT.A01, r13);
        r0.A00 = r14;
        r3.add(r0);
        r3.add(new X.C18441Vrk(r12, r13));
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0281, code lost:
        r13 = r14.A01.A00;
        r1 = r14.A00;
        r0 = r14.A02;
        r11 = new java.lang.Object();
        r11.A00 = r1;
        r11.A02 = r0;
        r11.A01 = r13;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0295, code lost:
        r3 = new java.util.ArrayList();
        r3.add(X.C18273Voo.A00(r10, r2, r4, r9));
        r3.add(new X.C18441Vrk(X.C16524UwT.A03, r2.A03));
        r1 = r2.A04;
        r0 = r2.A07;
        r12 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b6, code lost:
        if (r0 == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02bc, code lost:
        if (r12.hasNext() == false) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02be, code lost:
        r1 = (X.C17443VVw) r12.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c8, code lost:
        if (r12.hasNext() == false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ca, code lost:
        X.C18273Voo.A01(r2, r1, r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ce, code lost:
        X.C18273Voo.A01(r2, r1, r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d7, code lost:
        if (r12.hasNext() == false) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02d9, code lost:
        X.C18273Voo.A01(r2, (X.C17443VVw) r12.next(), r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02e5, code lost:
        if (r2.A07 == false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02e7, code lost:
        r2 = new X.C16289Urr(r11, X.C16524UwT.A02, r2.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f0, code lost:
        r3.add(r2);
        r0 = new X.C16285Urn();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02f8, code lost:
        r3.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02fb, code lost:
        r6.addAll(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0300, code lost:
        r2 = r2.A03;
        r0 = new X.C18441Vrk(X.C16524UwT.A01, r2);
        r0.A00 = r11;
        r3.add(r0);
        r0 = new X.C18441Vrk(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0105, code lost:
        if (r7.isEmpty() != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012c, code lost:
        if (r1 == null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0188, code lost:
        if (r2.hasNext() == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018a, code lost:
        r1 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0193, code lost:
        if (((X.C17673Vc4) r1).A02 != r3) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b1, code lost:
        if (r9 == -1) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b3, code lost:
        if (r4 <= r9) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b7, code lost:
        r1 = r2.A02.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bf, code lost:
        if (r1 == 15) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c2, code lost:
        if (r1 == 1) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c6, code lost:
        if (r1 == 19) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ca, code lost:
        if (r1 != 11) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cc, code lost:
        r12 = new java.util.ArrayList();
        r12.add(X.C18273Voo.A00(r10, r2, -1, r9));
        r11 = r2.A01.A00;
        r0 = new X.C18441Vrk(X.C16524UwT.A06, "");
        r0.A00 = r11;
        r12.add(r0);
        r12.add(new X.C18441Vrk(X.C16524UwT.A03, r2.A03));
        r6.addAll(r12);
        r4 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fd, code lost:
        r3 = new java.util.ArrayList();
        r3.add(X.C18273Voo.A00(r10, r2, r4, r9));
        r12 = X.C16524UwT.A03;
        r11 = r2.A03;
        r3.add(new X.C18441Vrk(r12, r11));
        r3.add(new X.C18441Vrk(X.C16524UwT.A04, r11));
        r2 = new X.C18441Vrk(r12, r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x031a A[Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0346 A[Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x034e A[Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x013c A[LOOP:2: B:64:0x013c->B:157:0x013c, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0113 A[SYNTHETIC, Splitter:B:51:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0154 A[Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a6 A[Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.U46 A01(android.content.Context r18, X.C15316UaO r19) {
        /*
            r17 = 0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r7.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r5 = r19
            X.VVv r0 = r5.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0354
            java.util.List r2 = r0.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.0qQ.A07(r2)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r3 = r5.A06     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r3 == 0) goto L_0x0052
            int r1 = r3.hashCode()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0 = -1623141468(0xffffffff9f40d3a4, float:-4.0832646E-20)
            if (r1 == r0) goto L_0x002c
            r0 = -1102672091(0xffffffffbe468f25, float:-0.19390543)
            if (r1 == r0) goto L_0x0054
            r0 = -505392060(0xffffffffe1e05444, float:-5.1726783E20)
            if (r1 != r0) goto L_0x0052
            java.lang.String r0 = "linear_bucket"
            goto L_0x0056
        L_0x002c:
            java.lang.String r0 = "control_node"
            boolean r0 = r3.equals(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0052
            int r1 = r5.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r3 = "model"
            X.VVv r0 = r5.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r1 >= 0) goto L_0x0041
            if (r0 == 0) goto L_0x0356
            X.WXZ r0 = r0.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x004d
        L_0x0041:
            if (r0 == 0) goto L_0x0356
            java.util.List r0 = r0.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.VSe r0 = (X.C17351VSe) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.WXZ r0 = r0.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x004d:
            int r1 = r5.A00(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x0060
        L_0x0052:
            r1 = -1
            goto L_0x0060
        L_0x0054:
            java.lang.String r0 = "linear"
        L_0x0056:
            boolean r0 = r3.equals(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0052
            int r0 = r5.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r1 = r0 + 1
        L_0x0060:
            r5.A00 = r1     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r1 < 0) goto L_0x0107
            X.VVv r0 = r5.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0354
            java.util.List r0 = r0.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r0 = r0.size()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r1 >= r0) goto L_0x0107
            X.VXA r3 = r5.A0F     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r1 = r5.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.List r0 = r3.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.G9w.A0x(r1, r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r0 = r5.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.VSe r0 = (X.C17351VSe) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.List r0 = r0.A01     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.0qQ.A07(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x008a:
            boolean r0 = r8.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r8.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.VO5 r0 = (X.VO5) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.0qQ.A0A(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.List r0 = r0.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.ArrayList r6 = X.DbV.A15(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x00a3:
            boolean r0 = r4.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x00be
            java.lang.Object r2 = r4.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0 = r2
            X.Vc4 r0 = (X.C17673Vc4) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.HashMap r1 = r5.A0G     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r0 = r0.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            boolean r0 = r1.containsKey(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 != 0) goto L_0x00a3
            r6.add(r2)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x00a3
        L_0x00be:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r2.<init>(r6)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Random r1 = new java.util.Random     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r1.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r0 = r2.size()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r0 = r1.nextInt(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vc4 r2 = (X.C17673Vc4) r2     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r1 = r2.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r1 == 0) goto L_0x008a
            r7.add(r2)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.HashMap r0 = r5.A0G     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.put(r1, r2)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.0eM r0 = r5.A0J     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.C13990Tnq.A1P(r1, r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x008a
        L_0x00e8:
            X.0eM r0 = r5.A0J     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r1.<init>(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            boolean r0 = X.DbT.A1b(r1)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.17k.A0E(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.List r0 = r3.A01     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.add(r1)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            boolean r0 = r7.isEmpty()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0109
        L_0x0107:
            r7 = r17
        L_0x0109:
            r8 = r18
            android.content.res.Resources r10 = r8.getResources()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r1 = "Required value was null."
            if (r7 == 0) goto L_0x034e
            java.lang.String r1 = r5.A06     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r0 = "control_node"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 != 0) goto L_0x012e
            r9 = 0
            X.VVv r0 = r5.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 != 0) goto L_0x0133
            java.lang.String r0 = "model"
            X.0qQ.A0F(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x012c:
            if (r1 == 0) goto L_0x0130
        L_0x012e:
            r9 = -1
            goto L_0x0196
        L_0x0130:
            int r9 = r9 + 1
            goto L_0x014e
        L_0x0133:
            java.util.List r0 = r0.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.0qQ.A07(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x013c:
            boolean r0 = r11.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0196
            java.lang.Object r0 = r11.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.VSe r0 = (X.C17351VSe) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.List r0 = r0.A01     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x014e:
            boolean r0 = r6.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x013c
            java.lang.Object r4 = r6.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.VO5 r4 = (X.VO5) r4     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.0qQ.A0A(r4)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.List r0 = r4.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.0qQ.A07(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x0166:
            boolean r0 = r2.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x014e
            java.lang.Object r1 = r2.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0 = r1
            X.Vc4 r0 = (X.C17673Vc4) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Uyh r0 = r0.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Uyh r3 = X.C16645Uyh.MESSAGE     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == r3) goto L_0x0166
            if (r1 == 0) goto L_0x014e
            java.util.List r0 = r4.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.0qQ.A07(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x0184:
            boolean r0 = r2.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0130
            java.lang.Object r1 = r2.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0 = r1
            X.Vc4 r0 = (X.C17673Vc4) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Uyh r0 = r0.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 != r3) goto L_0x0184
            goto L_0x012c
        L_0x0196:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r6.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Iterator r16 = r7.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r4 = 0
        L_0x01a0:
            boolean r0 = r16.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0314
            java.lang.Object r2 = r16.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vc4 r2 = (X.C17673Vc4) r2     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r2 == 0) goto L_0x01a0
            int r4 = r4 + 1
            r0 = -1
            if (r9 == r0) goto L_0x01b7
            if (r4 <= r9) goto L_0x01b7
            goto L_0x0314
        L_0x01b7:
            X.Uyh r0 = r2.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r1 = r0.ordinal()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0 = 15
            if (r1 == r0) goto L_0x0295
            r0 = 1
            if (r1 == r0) goto L_0x0226
            r0 = 19
            if (r1 == r0) goto L_0x01fd
            r0 = 11
            if (r1 != r0) goto L_0x01a0
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r12.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0 = -1
            X.Urm r0 = X.C18273Voo.A00(r10, r2, r0, r9)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r12.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.VSc r0 = r2.A01     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r11 = r0.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.UwT r3 = X.C16524UwT.MESSAGE     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r1 = ""
            X.Urk r0 = new X.Urk     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r3, r1)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.A00 = r11     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r12.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.UwT r3 = X.C16524UwT.DIVIDER     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r1 = r2.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vrk r0 = new X.Vrk     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r3, r1)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r12.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r6.addAll(r12)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r4 = r4 + -1
            goto L_0x01a0
        L_0x01fd:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Urm r0 = X.C18273Voo.A00(r10, r2, r4, r9)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.UwT r12 = X.C16524UwT.DIVIDER     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r11 = r2.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vrk r0 = new X.Vrk     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r12, r11)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.UwT r1 = X.C16524UwT.EDITTEXT     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Urq r0 = new X.Urq     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r1, r11)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vrk r2 = new X.Vrk     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r2.<init>(r12, r11)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x02f0
        L_0x0226:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Urm r0 = X.C18273Voo.A00(r10, r2, r4, r9)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.UwT r12 = X.C16524UwT.DIVIDER     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r1 = r2.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vrk r0 = new X.Vrk     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r12, r1)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.List r0 = r2.A04     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r11 = 0
        L_0x0245:
            boolean r0 = r15.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x02e3
            java.lang.Object r14 = r15.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.VVw r14 = (X.C17443VVw) r14     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            boolean r0 = r15.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0281
            X.VSc r0 = r14.A01     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r13 = r0.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r1 = r14.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r0 = r14.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.V3o r14 = new X.V3o     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r14.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r14.A00 = r1     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r14.A02 = r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r14.A01 = r13     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r13 = r2.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.UwT r1 = X.C16524UwT.CHECKBOX     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Uro r0 = new X.Uro     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r1, r13)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.A00 = r14     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vrk r0 = new X.Vrk     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r12, r13)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x0245
        L_0x0281:
            X.VSc r0 = r14.A01     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r13 = r0.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            int r1 = r14.A00     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r0 = r14.A02     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.V3o r11 = new X.V3o     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r11.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r11.A00 = r1     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r11.A02 = r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r11.A01 = r13     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x0245
        L_0x0295:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Urm r0 = X.C18273Voo.A00(r10, r2, r4, r9)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.UwT r11 = X.C16524UwT.DIVIDER     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r1 = r2.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vrk r0 = new X.Vrk     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r11, r1)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.List r1 = r2.A04     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            boolean r0 = r2.A07     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r11 = 0
            java.util.Iterator r12 = r1.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x02d3
        L_0x02b8:
            boolean r0 = r12.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x02fb
            java.lang.Object r1 = r12.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.VVw r1 = (X.C17443VVw) r1     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            boolean r0 = r12.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x02ce
            X.C18273Voo.A01(r2, r1, r3, r11)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x02b8
        L_0x02ce:
            r0 = 1
            X.C18273Voo.A01(r2, r1, r3, r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x02b8
        L_0x02d3:
            boolean r0 = r12.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x02fb
            java.lang.Object r0 = r12.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.VVw r0 = (X.C17443VVw) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.C18273Voo.A01(r2, r0, r3, r11)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x02d3
        L_0x02e3:
            boolean r0 = r2.A07     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0300
            X.UwT r1 = X.C16524UwT.CHECKBOXWRITEIN     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r0 = r2.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Urr r2 = new X.Urr     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r2.<init>(r11, r1, r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x02f0:
            r3.add(r2)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Urn r0 = new X.Urn     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x02f8:
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x02fb:
            r6.addAll(r3)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x01a0
        L_0x0300:
            java.lang.String r2 = r2.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.UwT r1 = X.C16524UwT.CHECKBOX     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Uro r0 = new X.Uro     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r1, r2)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.A00 = r11     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r3.add(r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vrk r0 = new X.Vrk     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r12, r2)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x02f8
        L_0x0314:
            boolean r0 = r6.isEmpty()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 != 0) goto L_0x0346
            r5.A0B = r6     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.U46 r4 = new X.U46     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r4.<init>(r8, r6)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x0325:
            boolean r0 = r3.hasNext()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r0 == 0) goto L_0x0343
            java.lang.Object r0 = r3.next()     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.Vc4 r0 = (X.C17673Vc4) r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.lang.String r2 = r0.A03     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            if (r2 == 0) goto L_0x0325
            java.util.Map r1 = r5.A0I     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            boolean r0 = r0.A08     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.JTP.A1R(r2, r1, r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            java.util.Map r1 = r5.A0H     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0 = 0
            X.JTP.A1R(r2, r1, r0)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            goto L_0x0325
        L_0x0343:
            r4.A02 = r5     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            return r4
        L_0x0346:
            java.lang.String r1 = "No Valid Types In Question List"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r1)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            throw r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x034e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            r0.<init>(r1)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            throw r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x0354:
            java.lang.String r3 = "model"
        L_0x0356:
            X.0qQ.A0F(r3)     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0     // Catch:{ NullPointerException -> 0x0366, IllegalArgumentException -> 0x035e }
        L_0x035e:
            r2 = move-exception
            java.lang.String r1 = "RapidFeedbackSurveyFragment"
            java.lang.String r0 = "Exception on fetching adapter"
            X.0KC.A0F(r1, r0, r2)
        L_0x0366:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15316UaO.A01(android.content.Context, X.UaO):X.U46");
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [X.VPg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v32, types: [java.lang.Object, X.VTw] */
    public static final void A02(Context context, C15316UaO uaO, String str, String str2) {
        VXA vxa = uaO.A0F;
        ArrayList arrayList = new ArrayList();
        Iterator A0s = AnonymousClass7TF.A0s(vxa.A00);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            String A13 = DbT.A13(A1J);
            ArrayList arrayList2 = new ArrayList();
            for (C16731V3o v3o : (List) A1J.getValue()) {
                arrayList2.add(v3o.A02);
            }
            ? obj = new Object();
            obj.A00 = A13;
            obj.A01 = arrayList2;
            arrayList.add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (List list : vxa.A01) {
            ? obj2 = new Object();
            obj2.A00 = list;
            arrayList3.add(obj2);
        }
        String A0j = AnonymousClass7TG.A0j();
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K2 = AnonymousClass7TF.A0K(stringWriter);
            A0K2.A0q("input");
            A0K2.A0c();
            A0K2.A0R("survey_id", str);
            16P.A03(A0K2, "answers");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C17395VTw vTw = (C17395VTw) it.next();
                if (vTw != null) {
                    A0K2.A0c();
                    String str3 = vTw.A00;
                    if (str3 != null) {
                        A0K2.A0R("question_id", str3);
                    }
                    List list2 = vTw.A01;
                    if (list2 != null) {
                        Iterator A0s2 = C41845B3m.A0s(A0K2, "answers", list2);
                        while (A0s2.hasNext()) {
                            C41846B3n.A18(A0K2, A0s2);
                        }
                        A0K2.A0Y();
                    }
                    A0K2.A0Z();
                }
            }
            A0K2.A0Y();
            16P.A03(A0K2, "pages");
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                C17279VPg vPg = (C17279VPg) it2.next();
                if (vPg != null) {
                    A0K2.A0c();
                    List list3 = vPg.A00;
                    if (list3 != null) {
                        Iterator A0s3 = C41845B3m.A0s(A0K2, "question_ids", list3);
                        while (A0s3.hasNext()) {
                            C41846B3n.A18(A0K2, A0s3);
                        }
                        A0K2.A0Y();
                    }
                    A0K2.A0Z();
                }
            }
            A0K2.A0Y();
            A0K2.A0R("session_blob", str2);
            A0K2.A0R("client_mutation_id", A0j);
            A0K2.A0R("actor_id", "0");
            A0K2.A0Z();
            1ES.A03(C13989Tnp.A0T(new C15619Ufl(24, context, uaO), new C239133Fc(D1M.class, "StructuredSurveySubmitResponseMutation", AnonymousClass7TG.A0k(A0K2, stringWriter), false), C46479Dfi.A01(DbT.A0X(uaO.A0K))));
        } catch (IOException e) {
            String A002 = AnonymousClass000.A00(444);
            0KC.A0G(__redex_internal_original_name, A002, e);
            0wb.A06(__redex_internal_original_name, A002, e);
        }
    }

    public static final void A04(C15316UaO uaO, List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        List A15 = JTO.A15(uaO.A0J);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            ArrayList A002 = VI5.A00(A18, list);
            if (A002 != null) {
                AnonymousClass7TF.A1I(A18, A002, arrayList2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            0eP A1A = JTO.A1A(it2);
            Object obj = A1A.A00;
            List<C16731V3o> list2 = (List) A1A.A01;
            ArrayList A0r = AnonymousClass7TG.A0r(list2);
            for (C16731V3o v3o : list2) {
                A0r.add(v3o.A02);
            }
            AnonymousClass7TF.A1I(obj, A0r, arrayList);
        }
        if (DbT.A1b(arrayList)) {
            VI4.A00(AnonymousClass7TE.A0l(uaO.A0K)).A03(arrayList, uaO.A0E, uaO.A01, (long) uaO.A00, false);
        } else if (!z) {
            C18635VvW A003 = VI4.A00(AnonymousClass7TE.A0l(uaO.A0K));
            long j = uaO.A0E;
            long j2 = uaO.A01;
            long j3 = (long) uaO.A00;
            if (A003.A00 != null) {
                UserSession userSession = A003.A01;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A00((AnonymousClass0iw) null, 0kJ.A05, userSession), "ig_survey_skip");
                if (A0e.isSampled()) {
                    Long[] A004 = C18635VvW.A00(j, j2, false);
                    C18509Vt6 vt6 = A003.A00;
                    if (vt6 != null) {
                        String str = vt6.A08;
                        if (str != null) {
                            A0e.AAJ("survey_id", str);
                            C18509Vt6 vt62 = A003.A00;
                            if (vt62 != null) {
                                Long l = vt62.A02;
                                if (l != null) {
                                    A0e.A9F("tessa_config_id", l);
                                    C18509Vt6 vt63 = A003.A00;
                                    if (vt63 != null) {
                                        Long l2 = vt63.A03;
                                        if (l2 != null) {
                                            C13992Tns.A0h(A0e, userSession, l2);
                                            C18509Vt6 vt64 = A003.A00;
                                            if (vt64 != null) {
                                                String str2 = vt64.A04;
                                                if (str2 != null) {
                                                    DbS.A1O(A0e, str2);
                                                    A0e.A9F("page_dwell_time", A004[1]);
                                                    C13991Tnr.A15(A0e, A004[0], j3);
                                                    A0e.A9F("bakeoff_ig_media_id", (Long) null);
                                                    A0e.A9F("bakeoff_ig_author_id", (Long) null);
                                                    A0e.AAJ("bakeoff_ranking_info_token", (String) null);
                                                    A0e.A9F("bakeoff_client_position", (Long) null);
                                                    if (A003.A00 != null) {
                                                        A0e.AAJ("detailed_survey_type", (String) null);
                                                        C18509Vt6 vt65 = A003.A00;
                                                        if (vt65 != null) {
                                                            A0e.A9F("ig_media_id", vt65.A00);
                                                            if (A003.A00 != null) {
                                                                A0e.AAJ("notification_id", (String) null);
                                                                if (A003.A00 != null) {
                                                                    A0e.AAJ("notification_channel", (String) null);
                                                                    if (A003.A00 != null) {
                                                                        A0e.AAJ("notification_type", (String) null);
                                                                        if (A003.A00 != null) {
                                                                            A0e.A9F("ad_campaign_id", (Long) null);
                                                                            if (A003.A00 != null) {
                                                                                A0e.AAJ("ad_tracking_token", (String) null);
                                                                                if (A003.A00 != null) {
                                                                                    C51965G9l.A1D(A0e, (Long) null);
                                                                                    C18509Vt6 vt66 = A003.A00;
                                                                                    if (vt66 != null) {
                                                                                        A0e.AAJ("ranking_info_token", vt66.A07);
                                                                                        if (A003.A00 != null) {
                                                                                            A0e.AAJ("canonical_inventory_source", (String) null);
                                                                                            if (A003.A00 != null) {
                                                                                                A0e.A9F("client_position", (Long) null);
                                                                                                if (A003.A00 != null) {
                                                                                                    A0e.A9F("feed_recs_post_position", (Long) null);
                                                                                                    C18509Vt6 vt67 = A003.A00;
                                                                                                    if (vt67 != null) {
                                                                                                        A0e.A9F("position_in_tray", vt67.A01);
                                                                                                        C18509Vt6 vt68 = A003.A00;
                                                                                                        if (vt68 != null) {
                                                                                                            A0e.AAJ("containing_viewer_session_id", vt68.A06);
                                                                                                            C18509Vt6 vt69 = A003.A00;
                                                                                                            if (vt69 != null) {
                                                                                                                A0e.AAJ("containing_tray_session_id", vt69.A05);
                                                                                                                DbX.A1L(A0e);
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    0qQ.A0F("baseEventFields");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0K);
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r2 = this.A0K;
        if (1NM.A02(AnonymousClass7TE.A0l(r2))) {
            List list = this.A0B;
            if (list != null) {
                A04(this, list, true);
            }
            VI4.A00(AnonymousClass7TE.A0l(r2)).A01(this.A0E, this.A01, (long) this.A00, false);
        }
        DbT.A1K(this);
        return true;
    }

    public static final void A03(C15316UaO uaO) {
        C249453jo requireActivity = uaO.requireActivity();
        0qQ.A0C(requireActivity, AnonymousClass000.A00(50));
        2dZ AYJ = requireActivity.AYJ();
        if (AYJ != null) {
            uaO.configureActionBar(AYJ);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(797301382);
        C15316UaO.super.onActivityCreated(bundle);
        if (!this.A0D) {
            String str2 = this.A07;
            if (str2 == null) {
                str = "integrationPointId";
            } else {
                String str3 = this.A0A;
                if (str3 == null) {
                    str = "surveyId";
                } else {
                    String str4 = this.A09;
                    if (str4 == null) {
                        str = "sessionBlob";
                    } else {
                        AnonymousClass0eM r1 = this.A0K;
                        VI3.A00(AnonymousClass7TE.A0l(r1), AnonymousClass05K.A0C, str2, str3, str4, (List) null);
                        if (1NM.A02(AnonymousClass7TE.A0l(r1))) {
                            C18635VvW A002 = VI4.A00(AnonymousClass7TE.A0l(r1));
                            if (A002.A00 == null) {
                                0kD.A07("RapidFeedbackLogger", "Unable to log survey enter event ig_survey_enter due to Base event fields not initialized from initial impression", (Throwable) null);
                            } else {
                                UserSession userSession = A002.A01;
                                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A00((AnonymousClass0iw) null, 0kJ.A05, userSession), "ig_survey_enter");
                                if (A0e.isSampled()) {
                                    C18509Vt6 vt6 = A002.A00;
                                    str = "baseEventFields";
                                    if (vt6 != null) {
                                        String str5 = vt6.A08;
                                        if (str5 != null) {
                                            A0e.AAJ("survey_id", str5);
                                            C18509Vt6 vt62 = A002.A00;
                                            if (vt62 != null) {
                                                Long l = vt62.A02;
                                                if (l != null) {
                                                    A0e.A9F("tessa_config_id", l);
                                                    C18509Vt6 vt63 = A002.A00;
                                                    if (vt63 != null) {
                                                        Long l2 = vt63.A03;
                                                        if (l2 != null) {
                                                            C13992Tns.A0h(A0e, userSession, l2);
                                                            C18509Vt6 vt64 = A002.A00;
                                                            if (vt64 != null) {
                                                                String str6 = vt64.A04;
                                                                if (str6 != null) {
                                                                    DbS.A1O(A0e, str6);
                                                                    if (A002.A00 != null) {
                                                                        A0e.AAJ("detailed_survey_type", (String) null);
                                                                        C18509Vt6 vt65 = A002.A00;
                                                                        if (vt65 != null) {
                                                                            A0e.A9F("ig_media_id", vt65.A00);
                                                                            if (A002.A00 != null) {
                                                                                A0e.AAJ("notification_id", (String) null);
                                                                                if (A002.A00 != null) {
                                                                                    A0e.AAJ("notification_channel", (String) null);
                                                                                    if (A002.A00 != null) {
                                                                                        A0e.AAJ("notification_type", (String) null);
                                                                                        if (A002.A00 != null) {
                                                                                            A0e.A9F("ad_campaign_id", (Long) null);
                                                                                            if (A002.A00 != null) {
                                                                                                A0e.AAJ("ad_tracking_token", (String) null);
                                                                                                if (A002.A00 != null) {
                                                                                                    C51965G9l.A1D(A0e, (Long) null);
                                                                                                    C18509Vt6 vt66 = A002.A00;
                                                                                                    if (vt66 != null) {
                                                                                                        A0e.AAJ("ranking_info_token", vt66.A07);
                                                                                                        if (A002.A00 != null) {
                                                                                                            A0e.AAJ("canonical_inventory_source", (String) null);
                                                                                                            if (A002.A00 != null) {
                                                                                                                A0e.A9F("client_position", (Long) null);
                                                                                                                if (A002.A00 != null) {
                                                                                                                    A0e.A9F("feed_recs_post_position", (Long) null);
                                                                                                                    C18509Vt6 vt67 = A002.A00;
                                                                                                                    if (vt67 != null) {
                                                                                                                        A0e.A9F("position_in_tray", vt67.A01);
                                                                                                                        C18509Vt6 vt68 = A002.A00;
                                                                                                                        if (vt68 != null) {
                                                                                                                            A0e.AAJ("containing_viewer_session_id", vt68.A06);
                                                                                                                            C18509Vt6 vt69 = A002.A00;
                                                                                                                            if (vt69 != null) {
                                                                                                                                A0e.AAJ("containing_tray_session_id", vt69.A05);
                                                                                                                                DbX.A1L(A0e);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("Required value was null.");
                                                                }
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Required value was null.");
                                                        }
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                }
                            }
                        }
                        this.A0D = true;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(1697671062, A022);
    }

    public final void onCreate(Bundle bundle) {
        Throwable th;
        int A022 = AnonymousClass0fD.A02(1564340856);
        C15316UaO.super.onCreate(bundle);
        Dbc.A0p(this);
        this.A00 = -1;
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("ARG_OUTRO_TOAST_TEXT");
        if (string != null) {
            this.A08 = string;
            String string2 = requireArguments.getString("ARG_INTEGRATION_POINT_ID");
            if (string2 != null) {
                this.A07 = string2;
                String string3 = requireArguments.getString("ARG_SURVEY_ID");
                if (string3 != null) {
                    this.A0A = string3;
                    String string4 = requireArguments.getString("ARG_SESSION_BLOB");
                    if (string4 != null) {
                        this.A09 = string4;
                        try {
                            C17442VVv parseFromJson = C18207VnX.parseFromJson(16P.A00(requireArguments.getString("ARG_SERIALIZED_MODEL_DATA")));
                            this.A02 = parseFromJson;
                            if (parseFromJson == null) {
                                0qQ.A0F("model");
                                th = AnonymousClass00P.createAndThrow();
                            } else {
                                this.A06 = parseFromJson.A01;
                                if (00k.A0u(0sr.A1P(new String[]{"linear", "linear_bucket", "control_node"}), this.A06)) {
                                    AnonymousClass0fD.A09(1243151552, A022);
                                    return;
                                }
                                th = DbT.A0m();
                            }
                            throw th;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2103771436);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.rapidfeedback_page_view, viewGroup, false);
        this.A0C = inflate;
        if (inflate == null) {
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(-1136727333, A022);
        return inflate;
    }

    public final void onPause() {
        Window window;
        int A022 = AnonymousClass0fD.A02(1033711817);
        C15316UaO.super.onPause();
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(48);
        }
        AnonymousClass0fD.A09(-2133435124, A022);
    }

    public final void onResume() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-1286123284);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(16);
        }
        AnonymousClass0fD.A09(1672787879, A022);
    }

    public final void onStop() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-835903758);
        C15316UaO.super.onStop();
        DbS.A1D(this);
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(3);
        }
        AnonymousClass0fD.A09(-1861074974, A022);
    }
}
