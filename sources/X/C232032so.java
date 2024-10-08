package X;

/* renamed from: X.2so  reason: invalid class name and case insensitive filesystem */
public final class C232032so implements C232022sn {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (r10 != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5IN ABt(X.AnonymousClass4VR r12, X.AnonymousClass426 r13) {
        /*
            r11 = this;
            r3 = 0
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r0 = 1
            X.0qQ.A0B(r13, r0)
            X.4VQ r12 = (X.AnonymousClass4VQ) r12
            X.4UC r5 = r12.A01
            boolean r0 = r5.A0I
            if (r0 != 0) goto L_0x016a
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.4VS r0 = r12.A03
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "No creatives"
        L_0x001c:
            r2.add(r0)
        L_0x001f:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x016a
            java.lang.String r1 = "invalidContent"
            X.Soz r0 = new X.Soz
            r0.<init>(r1, r2)
            X.5IN r0 = X.AnonymousClass5IM.A02(r0, r1)
            return r0
        L_0x0031:
            X.4V7 r8 = r0.A00
            X.4VG r0 = r8.A01
            r10 = 0
            if (r0 == 0) goto L_0x003a
            r10 = 1
            r3 = r0
        L_0x003a:
            X.4VA r4 = r5.A09
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "mip_banner_ig"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r6 = 1
            if (r0 != 0) goto L_0x008c
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "deeplink_interstitial"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x008c
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "consent_flow_interstitial"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x008c
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "audio_browser_condensed_megaphone_ig"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x008c
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "barcelona_main_feed_megaphone"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x008c
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "barcelona_main_feed_megaphone_redesign"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x008c
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = r5.A06
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.A0H
            if (r1 == r0) goto L_0x008c
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.A09
            if (r1 == r0) goto L_0x008c
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.A0B
            if (r1 == r0) goto L_0x008c
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.A06
            if (r1 == r0) goto L_0x008c
            r6 = 0
        L_0x008c:
            java.lang.String r4 = "Primary Action url is null/empty"
            if (r6 == 0) goto L_0x00a5
            if (r10 == 0) goto L_0x001f
        L_0x0092:
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x009c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001f
        L_0x009c:
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x001f
            r2.add(r4)
            goto L_0x001f
        L_0x00a5:
            X.4VA r1 = r5.A09
            java.lang.String r0 = r1.A00
            java.lang.String r6 = "barcelona_main_feed_megaphone"
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r1 = r1.A00
            java.lang.String r0 = "barcelona_main_feed_megaphone_redesign"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ce
            X.4V8 r0 = r8.A09
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = ""
        L_0x00c3:
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "Title is null/empty"
            r2.add(r0)
        L_0x00ce:
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x011a
            X.4VG r0 = r8.A01
            if (r0 == 0) goto L_0x013f
            X.GVc r9 = new X.GVc
            r9.<init>(r0)
        L_0x00db:
            X.4VG r0 = r8.A02
            if (r0 == 0) goto L_0x013d
            X.GVc r7 = new X.GVc
            r7.<init>(r0)
        L_0x00e4:
            X.4VG r1 = r8.A00
            if (r1 == 0) goto L_0x013b
            X.GVc r0 = new X.GVc
            r0.<init>(r1)
        L_0x00ed:
            X.JLZ[] r0 = new X.JLZ[]{r9, r7, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0120
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0120
        L_0x00ff:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = r5.A06
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.A08
            if (r1 == r0) goto L_0x011a
            java.lang.String r1 = r5.A0D
            X.0eM r0 = X.C49293Esc.A00
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "No button dismisses promotion"
            r2.add(r0)
        L_0x011a:
            if (r10 != 0) goto L_0x0141
            java.lang.String r0 = "Primary Action is null"
            goto L_0x001c
        L_0x0120:
            java.util.Iterator r1 = r1.iterator()
        L_0x0124:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r1.next()
            X.JLZ r0 = (X.JLZ) r0
            if (r0 == 0) goto L_0x0124
            X.GVc r0 = (X.C52500GVc) r0
            X.4VG r0 = r0.A00
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0124
            goto L_0x011a
        L_0x013b:
            r0 = 0
            goto L_0x00ed
        L_0x013d:
            r7 = 0
            goto L_0x00e4
        L_0x013f:
            r9 = 0
            goto L_0x00db
        L_0x0141:
            X.4V8 r0 = r3.A00
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0149
            java.lang.String r0 = ""
        L_0x0149:
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0092
            X.4VA r1 = r5.A09
            java.lang.String r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x0092
            java.lang.String r1 = r1.A00
            java.lang.String r0 = "barcelona_main_feed_megaphone_redesign"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "Primary Action title is null/empty"
            r2.add(r0)
            goto L_0x0092
        L_0x016a:
            X.5IN r0 = X.AnonymousClass5IM.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232032so.ABt(X.4VR, X.426):X.5IN");
    }

    public final String FNO() {
        return "client_definition_validator_content";
    }
}
