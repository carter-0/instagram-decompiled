package X;

/* renamed from: X.Qmc  reason: case insensitive filesystem */
public final class C8257Qmc extends C10987S3z {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
        r1.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        throw X.C51973G9u.A0g(r4, " with args => ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ff, code lost:
        r1.setArguments(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A01(android.os.Bundle r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = X.JTR.A0F(r5)
            java.lang.String r2 = "Required value was null."
            switch(r0) {
                case -2046736275: goto L_0x00f1;
                case -1704634412: goto L_0x00e3;
                case -1168057020: goto L_0x00d5;
                case -1133036289: goto L_0x00c6;
                case -291842573: goto L_0x00b8;
                case 506456603: goto L_0x00aa;
                case 675913388: goto L_0x009b;
                case 781550889: goto L_0x007c;
                case 794693246: goto L_0x006d;
                case 1056651425: goto L_0x005d;
                case 1140065739: goto L_0x004e;
                case 1504979396: goto L_0x003d;
                case 1517249061: goto L_0x002e;
                case 1606386969: goto L_0x001d;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "{ECPFragmentFactory} Fragment is not found for identifier => "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " with args => "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r4, r0, r1)
            throw r0
        L_0x001d:
            java.lang.String r0 = "blank_bottom_sheet_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            if (r4 == 0) goto L_0x0105
            X.Qxp r1 = new X.Qxp
            r1.<init>()
            goto L_0x00ff
        L_0x002e:
            java.lang.String r0 = "content_form_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QhL r1 = new X.QhL
            r1.<init>()
            goto L_0x00ff
        L_0x003d:
            java.lang.String r0 = "bottom_sheet_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            if (r4 == 0) goto L_0x010a
            X.QhS r1 = new X.QhS
            r1.<init>()
            goto L_0x00ff
        L_0x004e:
            java.lang.String r0 = "content_nux_learn_more_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QhJ r1 = new X.QhJ
            r1.<init>()
            goto L_0x00ff
        L_0x005d:
            java.lang.String r0 = "paypal_consent_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QCE r1 = new X.QCE
            r1.<init>()
            goto L_0x00ff
        L_0x006d:
            java.lang.String r0 = "content_bottom_sheet_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QhQ r1 = new X.QhQ
            r1.<init>()
            goto L_0x00ff
        L_0x007c:
            java.lang.String r0 = "content_selection_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            if (r4 == 0) goto L_0x010f
            X.QhO r1 = new X.QhO
            r1.<init>()
            r1.setArguments(r4)
            java.lang.String r0 = "ECP_SELECTION_FRAGMENT_COMPONENT_ID"
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x0102
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x009b:
            java.lang.String r0 = "terms_condition_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QCK r1 = new X.QCK
            r1.<init>()
            goto L_0x00ff
        L_0x00aa:
            java.lang.String r0 = "ecp_container_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QhR r1 = new X.QhR
            r1.<init>()
            goto L_0x00ff
        L_0x00b8:
            java.lang.String r0 = "loading_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QhM r1 = new X.QhM
            r1.<init>()
            goto L_0x00ff
        L_0x00c6:
            java.lang.String r0 = "web_view_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QCD r1 = new X.QCD
            r1.<init>()
            goto L_0x00ff
        L_0x00d5:
            java.lang.String r0 = "content_nux_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QhP r1 = new X.QhP
            r1.<init>()
            goto L_0x00ff
        L_0x00e3:
            java.lang.String r0 = "content_confirmation_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QhN r1 = new X.QhN
            r1.<init>()
            goto L_0x00ff
        L_0x00f1:
            java.lang.String r0 = "see_item_details_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.QhK r1 = new X.QhK
            r1.<init>()
        L_0x00ff:
            r1.setArguments(r4)
        L_0x0102:
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        L_0x0105:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x010a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x010f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8257Qmc.A01(android.os.Bundle, java.lang.String):androidx.fragment.app.Fragment");
    }
}
