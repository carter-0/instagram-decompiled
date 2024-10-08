package X;

/* renamed from: X.CkP  reason: case insensitive filesystem */
public abstract class C44753CkP {
    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Object, X.3UI] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02d5, code lost:
        if (X.0qQ.A0K(r1, "embedded_with_content_thumbnail") != false) goto L_0x02d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3UH parseFromJson(X.16F r8) {
        /*
            r3 = 0
            X.0qQ.A0B(r8, r3)
            X.3UH r2 = new X.3UH     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.<init>()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r1 == r0) goto L_0x0016
            r8.A0z()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2 = 0
            return r2
        L_0x0016:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r1 == r0) goto L_0x02f4
            java.lang.String r1 = r8.A0q()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            boolean r0 = X.C41846B3n.A1Y(r8, r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r4 = 0
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0F = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x002f:
            r8.A0z()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x0016
        L_0x0033:
            boolean r0 = X.C41845B3m.A1C(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x0040
            int r0 = r8.A1D()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A01 = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x0040:
            boolean r0 = X.C41845B3m.A1W(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.0qQ.A0B(r0, r3)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0G = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x0050:
            java.lang.String r0 = "suggestions"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x00f2
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r1 != r0) goto L_0x0076
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x0064:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r1 == r0) goto L_0x0076
            X.3UJ r0 = X.C41907B6f.parseFromJson(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x0064
            r4.add(r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x0064
        L_0x0076:
            java.util.List r0 = r2.A0P     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 != 0) goto L_0x0080
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0P = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x0080:
            r0.clear()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r4 == 0) goto L_0x00b8
            java.util.List r7 = r2.A0P     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r7 == 0) goto L_0x00b8
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r4)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x0091:
            boolean r0 = r5.hasNext()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r1 = r5.next()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.3UJ r1 = (X.AnonymousClass3UJ) r1     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.0qQ.A0B(r1, r3)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.3UL r0 = new X.3UL     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.3UI r1 = new X.3UI     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r1.<init>()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.3UJ r0 = r0.A0F     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r1.A08 = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r1.A01()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r6.add(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x0091
        L_0x00b5:
            r7.addAll(r6)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x00b8:
            java.util.List r0 = r2.A0M     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 != 0) goto L_0x00c2
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0M = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x00c2:
            r0.clear()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r4 == 0) goto L_0x00ee
            java.util.List r7 = r2.A0M     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r7 == 0) goto L_0x00ee
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r4)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x00d3:
            boolean r0 = r5.hasNext()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r1 = r5.next()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.3UJ r1 = (X.AnonymousClass3UJ) r1     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.0qQ.A0B(r1, r3)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.3UL r0 = new X.3UL     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r6.add(r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x00d3
        L_0x00eb:
            r7.addAll(r6)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x00ee:
            r2.A0N = r4     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x00f2:
            java.lang.String r0 = "suggestion_cards"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x014f
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r1 != r0) goto L_0x0118
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x0106:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r1 == r0) goto L_0x0118
            X.3Or r0 = X.C241233Ok.parseFromJson(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x0106
            r4.add(r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x0106
        L_0x0118:
            java.util.List r0 = r2.A0P     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 != 0) goto L_0x0122
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0P = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x0122:
            r0.clear()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r4 == 0) goto L_0x014b
            java.util.List r7 = r2.A0P     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r7 == 0) goto L_0x014b
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r4)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x0133:
            boolean r0 = r5.hasNext()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x0148
            java.lang.Object r1 = r5.next()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.3Or r1 = (X.C241303Or) r1     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.3UI r0 = new X.3UI     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r6.add(r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x0133
        L_0x0148:
            r7.addAll(r6)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x014b:
            r2.A0O = r4     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x014f:
            r0 = 4074(0xfea, float:5.709E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x017d
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r1 != r0) goto L_0x0179
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
        L_0x0167:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r1 == r0) goto L_0x0179
            X.5tv r0 = X.C44195CZi.parseFromJson(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x0167
            r4.add(r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x0167
        L_0x0179:
            r2.A0L = r4     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x017d:
            java.lang.String r0 = "is_dismissable"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x018d
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0Q = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x018d:
            java.lang.String r0 = "is_unit_dismissable"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x019d
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0R = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x019d:
            boolean r0 = X.C41845B3m.A1E(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.0qQ.A0B(r0, r3)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0K = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x01ae:
            boolean r0 = X.C41845B3m.A1L(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0J = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x01bc:
            java.lang.String r0 = "view_all_text"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x01cc
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0A = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x01cc:
            java.lang.String r0 = "show_bottom_cta"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x01dc
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0S = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x01dc:
            java.lang.String r0 = "should_display_community_card"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x01e9
            r8.A0d()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x01e9:
            java.lang.String r0 = "landing_site_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x01f9
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0E = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x01f9:
            java.lang.String r0 = "landing_site_title"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x0209
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0D = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x0209:
            java.lang.String r0 = "landing_site_subtitle"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x0216
            X.C41846B3n.A1A(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x0216:
            r0 = 973(0x3cd, float:1.363E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x022a
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0H = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x022a:
            r0 = 161(0xa1, float:2.26E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x023e
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0C = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x023e:
            java.lang.String r0 = "ranking_algorithm"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x024e
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0I = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x024e:
            java.lang.String r0 = "layout"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x025e
            X.4hR r0 = X.C276404tH.A00(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A03 = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x025e:
            java.lang.String r0 = "bloks_data"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x026e
            X.3xe r0 = X.C45662D0m.parseFromJson(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A04 = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x026e:
            java.lang.String r0 = "cards_size"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x027e
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A0B = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x027e:
            java.lang.String r0 = "view_state_item_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x028e
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A08 = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x028e:
            boolean r0 = X.C41845B3m.A1Y(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x029c
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A07 = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x029c:
            java.lang.String r0 = "item_client_gap_rules"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x02ac
            X.3lb r0 = X.C250523la.parseFromJson(r8)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A02 = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x02ac:
            java.lang.String r0 = "style"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x02dc
            java.lang.String r1 = r8.A1Q()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            java.lang.Integer r4 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            java.lang.String r0 = "no_content_thumbnail"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 != 0) goto L_0x02d7
            java.lang.Integer r4 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            java.lang.String r0 = "with_content_thumbnail"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 != 0) goto L_0x02d7
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            java.lang.String r0 = "embedded_with_content_thumbnail"
            boolean r1 = X.0qQ.A0K(r1, r0)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r0 = 0
            if (r1 == 0) goto L_0x02d8
        L_0x02d7:
            r0 = r4
        L_0x02d8:
            r2.A09 = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x02dc:
            java.lang.String r0 = "netego_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = r8.A1Q()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            java.util.Map r0 = X.1UQ.A01     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            X.1UQ r0 = (X.1UQ) r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            r2.A05 = r0     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            goto L_0x002f
        L_0x02f4:
            r2.A05()     // Catch:{ IOException -> 0x02fe, Exception -> 0x02f8 }
            return r2
        L_0x02f8:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x02fe:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44753CkP.parseFromJson(X.16F):X.3UH");
    }
}
