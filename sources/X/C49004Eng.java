package X;

/* renamed from: X.Eng  reason: case insensitive filesystem */
public abstract class C49004Eng {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r0 = r6.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r0 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r2.A0y(r6, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r6.equals(r0) != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(androidx.fragment.app.Fragment r7, X.C46788DlI r8) {
        /*
            r5 = 1
            java.lang.String r6 = r8.A04()
            com.instagram.api.schemas.UserMonetizationProductType r4 = r8.A02()
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            boolean r0 = r3 instanceof com.instagram.urlhandlers.creatoronboarding.CreatorOnboardingUrlHandlerActivity
            if (r0 != 0) goto L_0x006a
            X.0hq r2 = r7.getParentFragmentManager()
            boolean r0 = r2.A12()
            if (r0 != 0) goto L_0x0030
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            java.lang.String r1 = "NOTIFICATION"
            if (r4 != r0) goto L_0x0031
            boolean r0 = X.0qQ.A0K(r6, r1)
            if (r0 != 0) goto L_0x0038
            boolean r0 = r3 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L_0x0031
            com.instagram.modal.ModalActivity r3 = (com.instagram.modal.ModalActivity) r3
            r3.finish()
        L_0x0030:
            return
        L_0x0031:
            int r0 = r6.hashCode()
            switch(r0) {
                case -2077709277: goto L_0x003c;
                case -1382453013: goto L_0x004a;
                case -602962448: goto L_0x004f;
                case 2591: goto L_0x0052;
                case 523908395: goto L_0x005e;
                case 1915236889: goto L_0x0061;
                default: goto L_0x0038;
            }
        L_0x0038:
            r2.A0c()
            return
        L_0x003c:
            java.lang.String r0 = "SETTINGS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = X.FRY.A09
            r2.A0y(r0, r5)
            return
        L_0x004a:
            boolean r0 = r6.equals(r1)
            goto L_0x0058
        L_0x004f:
            java.lang.String r0 = "MONETIZATION_INBOX"
            goto L_0x0054
        L_0x0052:
            java.lang.String r0 = "QP"
        L_0x0054:
            boolean r0 = r6.equals(r0)
        L_0x0058:
            if (r0 == 0) goto L_0x0038
            r2.A0y(r6, r5)
            return
        L_0x005e:
            java.lang.String r0 = "POST_LIVE"
            goto L_0x0063
        L_0x0061:
            java.lang.String r0 = "LIVE_SCHEDULE_AUDIENCE"
        L_0x0063:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x006a
            goto L_0x0038
        L_0x006a:
            r3.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49004Eng.A00(androidx.fragment.app.Fragment, X.DlI):void");
    }
}
