package X;

import android.widget.Filter;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.AbstractMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.MsV  reason: case insensitive filesystem */
public final class C67691MsV extends Filter {
    public boolean A00;
    public final UserSession A01;
    public final OND A02 = new OND();
    public final OND A03 = new OND();
    public final List A04 = AnonymousClass7TE.A1C();
    public final C74308Psi A05;

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0132, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0136, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.1zE.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013d, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0125 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5 A[Catch:{ IOException | JSONException -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f9 A[Catch:{ IOException | JSONException -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101 A[Catch:{ IOException | JSONException -> 0x013e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r18) {
        /*
            r17 = this;
            r4 = 0
            r16 = r18
            r0 = r16
            X.0qQ.A0B(r0, r4)
            r8 = r17
            java.util.List r6 = r8.A04
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            if (r0 == 0) goto L_0x005b
            X.OND r5 = r8.A03
            android.util.SparseArray r0 = r5.A00
            r0.clear()
            java.util.Iterator r7 = r6.iterator()
        L_0x001d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r7.next()
            X.LMR r0 = (X.LMR) r0
            java.util.List r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x002f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r3.next()
            X.6nz r0 = (X.C317876nz) r0
            X.6nI r2 = new X.6nI
            r2.<init>((X.C317876nz) r0)
            java.util.List r0 = r0.A0P
            java.util.Iterator r1 = r0.iterator()
        L_0x0046:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            java.lang.String r0 = X.C66582MXn.A0w(r0)
            r5.A02(r0, r2)
            goto L_0x0046
        L_0x0058:
            r6.clear()
        L_0x005b:
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0145
            X.OND r12 = r8.A02
            X.2gp r6 = X.C226442gp.A00
            X.0qQ.A07(r6)
            com.instagram.common.session.UserSession r11 = r8.A01
            java.lang.String r5 = "Failed to parse emoji keywords."
            java.lang.Class<X.Nss> r3 = X.C69831Nss.class
            X.AnonymousClass7TF.A1B(r12, r4, r11)
            java.util.concurrent.atomic.AtomicReference r2 = X.O45.A00     // Catch:{ IOException | JSONException -> 0x013e }
            X.3Ja r1 = X.O44.A00     // Catch:{ IOException | JSONException -> 0x013e }
            r0 = 0
            java.io.File r1 = r6.A02(r1, r0, r2)     // Catch:{ IOException | JSONException -> 0x013e }
            if (r1 == 0) goto L_0x0142
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x013e }
            r0.<init>(r1)     // Catch:{ IOException | JSONException -> 0x013e }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException | JSONException -> 0x013e }
            r6.<init>(r0)     // Catch:{ IOException | JSONException -> 0x013e }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0137 }
            r2.<init>(r6)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x012b
            org.json.JSONObject r10 = X.C66580MXl.A17(r0)     // Catch:{ all -> 0x0130 }
            r2.close()     // Catch:{ all -> 0x0137 }
            r6.close()     // Catch:{ IOException | JSONException -> 0x013e }
            X.7fS r0 = X.C317486nL.A04     // Catch:{ IOException | JSONException -> 0x013e }
            X.6nL[] r9 = r0.A07(r11)     // Catch:{ IOException | JSONException -> 0x013e }
            int r7 = r9.length     // Catch:{ IOException | JSONException -> 0x013e }
            r6 = 0
        L_0x00a1:
            if (r6 >= r7) goto L_0x0129
            r13 = r9[r6]     // Catch:{ IOException | JSONException -> 0x013e }
            java.lang.String r2 = r13.A02     // Catch:{ IOException | JSONException -> 0x013e }
            boolean r0 = r10.has(r2)     // Catch:{ IOException | JSONException -> 0x013e }
            java.lang.String r1 = "null cannot be cast to non-null type org.json.JSONArray"
            if (r0 != 0) goto L_0x00bf
            char r0 = r2.charAt(r4)     // Catch:{ IOException | JSONException -> 0x013e }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x013e }
            boolean r0 = r10.has(r2)     // Catch:{ IOException | JSONException -> 0x013e }
            if (r0 != 0) goto L_0x00bf
            r2 = 0
            goto L_0x00c8
        L_0x00bf:
            java.lang.Object r2 = r10.get(r2)     // Catch:{ IOException | JSONException -> 0x013e }
            X.0qQ.A0C(r2, r1)     // Catch:{ IOException | JSONException -> 0x013e }
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch:{ IOException | JSONException -> 0x013e }
        L_0x00c8:
            X.0Tu r14 = X.0Tu.A05     // Catch:{ IOException | JSONException -> 0x013e }
            r0 = 36324535582077065(0x810cf900003089, double:3.03512079704555E-306)
            boolean r0 = X.182.A06(r14, r11, r0)     // Catch:{ IOException | JSONException -> 0x013e }
            if (r0 == 0) goto L_0x00f9
            X.PgM r1 = X.C73586PgM.A00     // Catch:{ IOException | JSONException -> 0x013e }
            java.lang.Class<X.O5v> r0 = X.C70418O5v.class
            java.lang.Object r0 = r11.A01(r0, r1)     // Catch:{ IOException | JSONException -> 0x013e }
            X.O5v r0 = (X.C70418O5v) r0     // Catch:{ IOException | JSONException -> 0x013e }
            java.lang.String r1 = r13.A02     // Catch:{ IOException | JSONException -> 0x013e }
            if (r2 == 0) goto L_0x0125
            java.util.Map r0 = r0.A00     // Catch:{ IOException | JSONException -> 0x013e }
            java.util.List r0 = X.C66580MXl.A13(r1, r0)     // Catch:{ IOException | JSONException -> 0x013e }
            if (r0 == 0) goto L_0x00fb
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IOException | JSONException -> 0x013e }
        L_0x00ef:
            boolean r0 = r1.hasNext()     // Catch:{ IOException | JSONException -> 0x013e }
            if (r0 == 0) goto L_0x00fb
            X.DbT.A1W(r1, r2)     // Catch:{ IOException | JSONException -> 0x013e }
            goto L_0x00ef
        L_0x00f9:
            if (r2 == 0) goto L_0x0125
        L_0x00fb:
            int r0 = r2.length()     // Catch:{ IOException | JSONException -> 0x013e }
            if (r0 <= 0) goto L_0x0125
            X.6nI r14 = new X.6nI     // Catch:{ IOException | JSONException -> 0x013e }
            r14.<init>((X.C317486nL) r13)     // Catch:{ IOException | JSONException -> 0x013e }
            int r15 = r2.length()     // Catch:{ IOException | JSONException -> 0x013e }
            r1 = 0
        L_0x010b:
            if (r1 >= r15) goto L_0x0120
            java.lang.Object r0 = r2.get(r1)     // Catch:{ IOException | JSONException -> 0x013e }
            X.DbS.A1Y(r0)     // Catch:{ IOException | JSONException -> 0x013e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException | JSONException -> 0x013e }
            java.lang.String r0 = X.C66582MXn.A0w(r0)     // Catch:{ IOException | JSONException -> 0x013e }
            r12.A02(r0, r14)     // Catch:{ IOException | JSONException -> 0x013e }
            int r1 = r1 + 1
            goto L_0x010b
        L_0x0120:
            java.lang.String r0 = r13.A02     // Catch:{ IOException | JSONException -> 0x013e }
            r12.A02(r0, r14)     // Catch:{ IOException | JSONException -> 0x013e }
        L_0x0125:
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x0129:
            r0 = 1
            goto L_0x0143
        L_0x012b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x0130 }
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x0137 }
            throw r0     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            X.1zE.A00(r6, r1)     // Catch:{ IOException | JSONException -> 0x013e }
            throw r0     // Catch:{ IOException | JSONException -> 0x013e }
        L_0x013e:
            r0 = move-exception
            X.0KC.A06(r3, r5, r0)
        L_0x0142:
            r0 = 0
        L_0x0143:
            r8.A00 = r0
        L_0x0145:
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = r16.toString()
            java.lang.String r2 = X.C66582MXn.A0w(r0)
            java.lang.String r1 = " "
            X.11S r0 = new X.11S
            r0.<init>(r1)
            r7 = 0
            java.util.List r0 = r0.A03(r2)
            java.lang.String[] r6 = X.DbU.A1b(r0, r4)
            int r4 = r6.length
            r9 = 0
        L_0x0167:
            if (r9 >= r4) goto L_0x01aa
            r11 = r6[r9]
            X.OND r10 = r8.A03
            java.util.LinkedHashSet r0 = r10.A00(r11)
            java.util.Iterator r2 = r0.iterator()
        L_0x0175:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0187
            java.lang.Object r1 = r2.next()
            int r0 = A00(r1, r3)
            X.C66580MXl.A1T(r1, r3, r0)
            goto L_0x0175
        L_0x0187:
            java.util.LinkedHashSet r0 = r10.A01(r11)
            java.util.Iterator r2 = r0.iterator()
        L_0x018f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r1 = r2.next()
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L_0x018f
            int r0 = A00(r1, r5)
            X.C66580MXl.A1T(r1, r5, r0)
            goto L_0x018f
        L_0x01a7:
            int r9 = r9 + 1
            goto L_0x0167
        L_0x01aa:
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x01f1
        L_0x01ae:
            if (r7 >= r4) goto L_0x01f1
            r10 = r6[r7]
            X.OND r9 = r8.A02
            java.util.LinkedHashSet r0 = r9.A00(r10)
            java.util.Iterator r2 = r0.iterator()
        L_0x01bc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r1 = r2.next()
            int r0 = A00(r1, r3)
            X.C66580MXl.A1T(r1, r3, r0)
            goto L_0x01bc
        L_0x01ce:
            java.util.LinkedHashSet r0 = r9.A01(r10)
            java.util.Iterator r2 = r0.iterator()
        L_0x01d6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r1 = r2.next()
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L_0x01d6
            int r0 = A00(r1, r5)
            X.C66580MXl.A1T(r1, r5, r0)
            goto L_0x01d6
        L_0x01ee:
            int r7 = r7 + 1
            goto L_0x01ae
        L_0x01f1:
            java.util.Set r0 = r3.keySet()
            java.util.ArrayList r4 = X.00k.A0U(r0)
            r0 = 22
            X.J6u r1 = new X.J6u
            r1.<init>(r3, r0)
            r3 = 3
            X.PcS r0 = new X.PcS
            r0.<init>((X.0sL) r1, (int) r3)
            X.01V.A1D(r4, r0)
            java.util.Set r0 = r5.keySet()
            java.util.ArrayList r2 = X.00k.A0U(r0)
            r0 = 23
            X.J6u r1 = new X.J6u
            r1.<init>(r5, r0)
            X.PcS r0 = new X.PcS
            r0.<init>((X.0sL) r1, (int) r3)
            X.01V.A1D(r2, r0)
            r4.addAll(r2)
            android.widget.Filter$FilterResults r1 = new android.widget.Filter$FilterResults
            r1.<init>()
            int r0 = r4.size()
            r1.count = r0
            r1.values = r4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67691MsV.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        0qQ.A0B(charSequence, 0);
        C74308Psi psi2 = this.A05;
        String obj2 = charSequence.toString();
        List list = null;
        if (filterResults != null) {
            obj = filterResults.values;
        } else {
            obj = null;
        }
        if (obj instanceof List) {
            list = (List) obj;
        }
        psi2.Dfc(obj2, list);
    }

    public C67691MsV(UserSession userSession, C74308Psi psi2) {
        this.A05 = psi2;
        UserSession userSession2 = userSession;
        this.A01 = userSession2;
        if (182.A06(0Tu.A05, userSession2, 36324535582077065L)) {
            Object A012 = userSession2.A01(C70418O5v.class, C73586PgM.A00);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            Locale A022 = AnonymousClass1Q2.A02();
            1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(C41845B3m.A06(C41848B3p.A1Z(A042, "locale", 002.A0T(A022.getLanguage(), A022.getCountry(), '_'))), "EmojiKeywordsQuery", A042.getParamsCopy(), A043.getParamsCopy(), C42498Bdf.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "text_app_emoji_keywords", AnonymousClass7TE.A1C()).setFreshCacheAgeMs(86400000).setMaxToleratedCacheAgeMs(604800000);
            1vm.A01(userSession2).ATL(C71559Omu.A00, new C45926DFg(A012, 3), maxToleratedCacheAgeMs);
        }
    }

    public static int A00(Object obj, AbstractMap abstractMap) {
        Number number = (Number) abstractMap.get(obj);
        if (number == null) {
            return 1;
        }
        return number.intValue() + 1;
    }
}
