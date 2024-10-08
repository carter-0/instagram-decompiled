package X;

public final class USG extends C19068WIz {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        super.EhN(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r6.equals("maximumValue") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        switch(r0) {
            case 6: goto L_0x00be;
            case 7: goto L_0x00ca;
            case 8: goto L_0x009b;
            case 9: goto L_0x00d8;
            case 10: goto L_0x009b;
            case 11: goto L_0x00e7;
            default: goto L_0x009b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        if (r6.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00be, code lost:
        if (r5 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        r1 = X.JTO.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c4, code lost:
        ((X.U6D) r4).setStep(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        r0 = (com.facebook.fbreact.views.slider.ReactSliderManager) r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
        if (r5 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d0, code lost:
        r1 = X.JTO.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d4, code lost:
        r0.setValue(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d8, code lost:
        if (r5 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00da, code lost:
        r0 = 1.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00dc, code lost:
        ((X.U6D) r4).setMaxValue(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e2, code lost:
        r0 = X.JTO.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e7, code lost:
        if (r5 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e9, code lost:
        r1 = X.JTO.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ed, code lost:
        ((X.U6D) r4).setMinValue(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EhN(android.view.View r4, java.lang.Object r5, java.lang.String r6) {
        /*
            r3 = this;
            int r0 = r6.hashCode()
            r1 = 1
            switch(r0) {
                case -1900655011: goto L_0x000c;
                case -1736983259: goto L_0x0024;
                case -1609594047: goto L_0x0027;
                case -1021497397: goto L_0x0037;
                case -981448432: goto L_0x004f;
                case -877170387: goto L_0x0052;
                case 3540684: goto L_0x0069;
                case 111972721: goto L_0x0073;
                case 270940796: goto L_0x007d;
                case 718061361: goto L_0x0080;
                case 1139400400: goto L_0x0089;
                case 1192487427: goto L_0x008c;
                case 1333596542: goto L_0x009c;
                case 1912319986: goto L_0x00a6;
                default: goto L_0x0008;
            }
        L_0x0008:
            super.EhN(r4, r5, r6)
        L_0x000b:
            return
        L_0x000c:
            java.lang.String r0 = "maximumTrackTintColor"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            com.facebook.react.uimanager.BaseViewManager r1 = r3.A00
            com.facebook.fbreact.views.slider.ReactSliderManager r1 = (com.facebook.fbreact.views.slider.ReactSliderManager) r1
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r0 = X.SPt.A00(r0, r5)
            r1.setMaximumTrackTintColor((android.view.View) r4, (java.lang.Integer) r0)
            return
        L_0x0024:
            java.lang.String r0 = "thumbImage"
            goto L_0x009e
        L_0x0027:
            java.lang.String r0 = "enabled"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            boolean r0 = X.Pxi.A1Y(r5, r1)
            r4.setEnabled(r0)
            return
        L_0x0037:
            java.lang.String r0 = "minimumTrackTintColor"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            com.facebook.react.uimanager.BaseViewManager r1 = r3.A00
            com.facebook.fbreact.views.slider.ReactSliderManager r1 = (com.facebook.fbreact.views.slider.ReactSliderManager) r1
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r0 = X.SPt.A00(r0, r5)
            r1.setMinimumTrackTintColor((android.view.View) r4, (java.lang.Integer) r0)
            return
        L_0x004f:
            java.lang.String r0 = "maximumTrackImage"
            goto L_0x009e
        L_0x0052:
            java.lang.String r0 = "testID"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            com.facebook.react.uimanager.BaseViewManager r0 = r3.A00
            com.facebook.fbreact.views.slider.ReactSliderManager r0 = (com.facebook.fbreact.views.slider.ReactSliderManager) r0
            if (r5 != 0) goto L_0x0066
            java.lang.String r5 = ""
        L_0x0062:
            r0.setTestID((android.view.View) r4, (java.lang.String) r5)
            return
        L_0x0066:
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0062
        L_0x0069:
            java.lang.String r0 = "step"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            r0 = 6
            goto L_0x0096
        L_0x0073:
            java.lang.String r0 = "value"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            r0 = 7
            goto L_0x0096
        L_0x007d:
            java.lang.String r0 = "disabled"
            goto L_0x009e
        L_0x0080:
            java.lang.String r0 = "maximumValue"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00d8
            goto L_0x0008
        L_0x0089:
            java.lang.String r0 = "trackImage"
            goto L_0x009e
        L_0x008c:
            java.lang.String r0 = "minimumValue"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            r0 = 11
        L_0x0096:
            r1 = 0
            switch(r0) {
                case 6: goto L_0x00be;
                case 7: goto L_0x00ca;
                case 8: goto L_0x009b;
                case 9: goto L_0x00d8;
                case 10: goto L_0x009b;
                case 11: goto L_0x00e7;
                default: goto L_0x009b;
            }
        L_0x009b:
            return
        L_0x009c:
            java.lang.String r0 = "minimumTrackImage"
        L_0x009e:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x000b
            goto L_0x0008
        L_0x00a6:
            java.lang.String r0 = "thumbTintColor"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            com.facebook.react.uimanager.BaseViewManager r1 = r3.A00
            com.facebook.fbreact.views.slider.ReactSliderManager r1 = (com.facebook.fbreact.views.slider.ReactSliderManager) r1
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r0 = X.SPt.A00(r0, r5)
            r1.setThumbTintColor((android.view.View) r4, (java.lang.Integer) r0)
            return
        L_0x00be:
            if (r5 == 0) goto L_0x00c4
            double r1 = X.JTO.A00(r5)
        L_0x00c4:
            X.U6D r4 = (X.U6D) r4
            r4.setStep(r1)
            return
        L_0x00ca:
            com.facebook.react.uimanager.BaseViewManager r0 = r3.A00
            com.facebook.fbreact.views.slider.ReactSliderManager r0 = (com.facebook.fbreact.views.slider.ReactSliderManager) r0
            if (r5 == 0) goto L_0x00d4
            double r1 = X.JTO.A00(r5)
        L_0x00d4:
            r0.setValue((android.view.View) r4, (double) r1)
            return
        L_0x00d8:
            if (r5 != 0) goto L_0x00e2
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x00dc:
            X.U6D r4 = (X.U6D) r4
            r4.setMaxValue(r0)
            return
        L_0x00e2:
            double r0 = X.JTO.A00(r5)
            goto L_0x00dc
        L_0x00e7:
            if (r5 == 0) goto L_0x00ed
            double r1 = X.JTO.A00(r5)
        L_0x00ed:
            X.U6D r4 = (X.U6D) r4
            r4.setMinValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.USG.EhN(android.view.View, java.lang.Object, java.lang.String):void");
    }
}
