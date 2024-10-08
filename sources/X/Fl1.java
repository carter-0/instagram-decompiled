package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class Fl1 implements C337237fw, G77 {
    public C336267eL A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final Context A04;
    public final Bundle A05;
    public final View A06;
    public final AnonymousClass07i A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final IgdsInlineSearchBox A0A;
    public final E9C A0B;
    public final Integer A0C;

    public Fl1(Context context, Bundle bundle, View view, AnonymousClass07i r14, AnonymousClass0iw r15, UserSession userSession, E9C e9c, IgdsInlineSearchBox igdsInlineSearchBox, Integer num) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        this.A04 = context;
        this.A09 = userSession2;
        this.A08 = r15;
        this.A07 = r14;
        IgdsInlineSearchBox igdsInlineSearchBox2 = igdsInlineSearchBox;
        this.A0A = igdsInlineSearchBox2;
        this.A06 = view;
        this.A0B = e9c;
        this.A0C = num;
        this.A05 = bundle;
        igdsInlineSearchBox2.A02 = this;
        boolean z = bundle.getBoolean("DirectShareSheetConstants.meta_ai_agent_target_enabled");
        boolean z2 = bundle.getBoolean("DirectShareSheetConstants.msys_recipients_only");
        boolean z3 = bundle.getBoolean("DirectShareSheetConstants.include_msys_threads");
        UserSession userSession3 = this.A09;
        Context context2 = this.A04;
        C336267eL A062 = C67562Mpw.A06(context2, userSession3, new C228602lw(context2, this.A07, (Integer) null), "reshare_share_sheet", C273654mx.A00(267), z ? 1 : 0, z3, z2);
        this.A00 = A062;
        A062.EcJ(this);
        C336267eL r1 = this.A00;
        if (r1 != null) {
            r1.EhX("");
        } else {
            0qQ.A0F("searchProvider");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0.length() == 0) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r10) {
        /*
            r9 = this;
            r3 = 0
            X.0qQ.A0B(r10, r3)
            X.E9C r4 = r9.A0B
            java.lang.Object r2 = r10.Bo1()
            java.util.List r2 = (java.util.List) r2
            java.lang.String r0 = r10.BiY()
            if (r0 == 0) goto L_0x0019
            int r0 = r0.length()
            r8 = 0
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r8 = 1
        L_0x001a:
            boolean r0 = r10.isLoading()
            java.lang.Integer r1 = r9.A0C
            X.AnonymousClass7TF.A1C(r2, r3, r1)
            r4.clear()
            if (r0 == 0) goto L_0x003d
            X.0eM r0 = r4.A0E
            java.lang.Object r2 = r0.getValue()
            X.0eM r0 = r4.A0F
            java.lang.Object r1 = r0.getValue()
            X.EAC r0 = r4.A08
            r4.addModel(r2, r1, r0)
        L_0x0039:
            r4.notifyDataSetChangedSmart()
            return
        L_0x003d:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0052
            android.content.Context r1 = r4.A02
            r0 = 2131968486(0x7f1341e6, float:1.9573868E38)
            java.lang.String r1 = r1.getString(r0)
            X.Dez r0 = r4.A07
            r4.addModel(r1, r0)
            goto L_0x0039
        L_0x0052:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00df
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            if (r8 == 0) goto L_0x009e
            java.util.List r1 = r4.A0C
            X.0qQ.A0B(r1, r3)
            X.01T r0 = new X.01T
            r0.<init>(r1)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x006e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r1.next()
            X.Dra r0 = (X.C47159Dra) r0
            com.instagram.model.direct.DirectShareTarget r0 = r0.A07
            X.DbY.A1U(r0, r5, r3)
            goto L_0x006e
        L_0x0080:
            java.util.List r0 = r4.A0A
            if (r0 == 0) goto L_0x009e
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x008c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.contains(r1)
            X.DbV.A1U(r1, r3, r0)
            goto L_0x008c
        L_0x009e:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.contains(r1)
            X.DbV.A1U(r1, r3, r0)
            goto L_0x00a6
        L_0x00b8:
            r5.addAll(r3)
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r5)
        L_0x00bf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r3)
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x00da
            X.3mO r1 = r4.A06
            X.3mS r0 = r4.A05
            boolean r1 = r1.A0A(r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            A00(r4, r2, r0)
            goto L_0x00bf
        L_0x00df:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0039
            com.instagram.common.session.UserSession r0 = r4.A03
            X.2Dm r7 = X.1bJ.A00(r0)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            if (r8 == 0) goto L_0x0113
            java.util.List r1 = r4.A0D
            X.0qQ.A0B(r1, r3)
            X.01T r0 = new X.01T
            r0.<init>(r1)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0101:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r1.next()
            X.Dra r0 = (X.C47159Dra) r0
            com.instagram.model.direct.DirectShareTarget r0 = r0.A07
            X.DbY.A1U(r0, r6, r3)
            goto L_0x0101
        L_0x0113:
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r1 = r6.iterator()
        L_0x011b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0131
            com.instagram.model.direct.DirectShareTarget r0 = X.DbT.A0f(r1)
            X.3U9 r0 = r7.BYf(r0)
            java.lang.String r0 = r0.C6C()
            r5.add(r0)
            goto L_0x011b
        L_0x0131:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x0139:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0152
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            java.lang.String r0 = r0.A08()
            boolean r0 = r5.contains(r0)
            X.DbV.A1U(r1, r3, r0)
            goto L_0x0139
        L_0x0152:
            r6.addAll(r3)
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r6)
        L_0x0159:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r3)
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0174
            X.3mO r1 = r4.A06
            X.3mS r0 = r4.A05
            boolean r1 = r1.A0A(r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0175
        L_0x0174:
            r0 = 0
        L_0x0175:
            A00(r4, r2, r0)
            goto L_0x0159
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fl1.Dam(X.7fy):void");
    }

    public final void onSearchCleared(String str) {
    }

    public final void onSearchTextChanged(String str) {
        0qQ.A0B(str, 0);
        C336267eL r0 = this.A00;
        if (r0 != null) {
            r0.EhX(str);
            int length = str.length();
            this.A03 = AnonymousClass7TF.A1R(length);
            if (this.A0C == AnonymousClass05K.A00) {
                UserSession userSession = this.A09;
                if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36328508426829181L)) {
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A08, userSession), "share_sheet_search_query_changed");
                    if (A0e.isSampled()) {
                        String str2 = this.A01;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = str3;
                        }
                        A0e.AAJ("query_session_id", str2);
                        String str4 = this.A02;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        A0e.AAJ("sub_query_session_id", str3);
                        A0e.A9F("query_length", DbV.A0p(A0e, "query_string", str, length));
                        A0e.Cgf();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0F("searchProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public static void A00(E9C e9c, DirectShareTarget directShareTarget, boolean z) {
        C250993mO r2 = e9c.A06;
        C251033mS r1 = e9c.A05;
        DirectShareTarget directShareTarget2 = directShareTarget;
        boolean A0B2 = r2.A0B(directShareTarget, r1);
        int A072 = r2.A07(directShareTarget, r1, 60);
        List list = e9c.A0B;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (0qQ.A0K(((C47159Dra) it.next()).A07, directShareTarget)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        e9c.addModel(new C47159Dra(directShareTarget2, e9c.A09, A072, z2, e9c.A01, z, A0B2), e9c.A04);
    }
}
