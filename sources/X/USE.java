package X;

public final class USE extends C19068WIz {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r6.equals(com.facebook.react.modules.dialog.DialogModule.KEY_ITEMS) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r6.equals("selected") == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        switch(r1) {
            case 2: goto L_0x006a;
            case 3: goto L_0x0079;
            case 4: goto L_0x0083;
            default: goto L_0x005b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r5 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r0 = java.lang.Integer.valueOf(X.AnonymousClass7TE.A0M(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        ((X.U6E) r4).A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        super.EhN(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r5 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        r0 = java.lang.Integer.valueOf(X.AnonymousClass7TE.A0M(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        ((X.U6E) r4).A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        ((com.facebook.fbreact.views.picker.ReactDialogPickerManager) r3.A00).setItems(r4, (com.facebook.react.bridge.ReadableArray) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r5 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r2 = X.AnonymousClass7TE.A0M(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        ((X.U6E) r4).setStagedSelection(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EhN(android.view.View r4, java.lang.Object r5, java.lang.String r6) {
        /*
            r3 = this;
            int r0 = r6.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1609594047: goto L_0x000d;
                case -979805852: goto L_0x001d;
                case 94842723: goto L_0x0032;
                case 100526016: goto L_0x003c;
                case 1191572123: goto L_0x0045;
                case 1287124693: goto L_0x004e;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.EhN(r4, r5, r6)
            return
        L_0x000d:
            java.lang.String r0 = "enabled"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.Pxi.A1Y(r5, r1)
            r4.setEnabled(r0)
            return
        L_0x001d:
            java.lang.String r0 = "prompt"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            if (r5 != 0) goto L_0x002f
            java.lang.String r5 = ""
        L_0x0029:
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r4.setPrompt(r5)
            return
        L_0x002f:
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0029
        L_0x0032:
            java.lang.String r0 = "color"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            r1 = 2
            goto L_0x0057
        L_0x003c:
            java.lang.String r0 = "items"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0079
            goto L_0x0009
        L_0x0045:
            java.lang.String r0 = "selected"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0083
            goto L_0x0009
        L_0x004e:
            java.lang.String r0 = "backgroundColor"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            r1 = 5
        L_0x0057:
            r0 = 0
            switch(r1) {
                case 2: goto L_0x006a;
                case 3: goto L_0x0079;
                case 4: goto L_0x0083;
                default: goto L_0x005b;
            }
        L_0x005b:
            if (r5 == 0) goto L_0x0065
            int r0 = X.AnonymousClass7TE.A0M(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0065:
            X.U6E r4 = (X.U6E) r4
            r4.A01 = r0
            return
        L_0x006a:
            if (r5 == 0) goto L_0x0074
            int r0 = X.AnonymousClass7TE.A0M(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0074:
            X.U6E r4 = (X.U6E) r4
            r4.A02 = r0
            return
        L_0x0079:
            com.facebook.react.uimanager.BaseViewManager r0 = r3.A00
            com.facebook.fbreact.views.picker.ReactDialogPickerManager r0 = (com.facebook.fbreact.views.picker.ReactDialogPickerManager) r0
            com.facebook.react.bridge.ReadableArray r5 = (com.facebook.react.bridge.ReadableArray) r5
            r0.setItems(r4, r5)
            return
        L_0x0083:
            if (r5 == 0) goto L_0x0089
            int r2 = X.AnonymousClass7TE.A0M(r5)
        L_0x0089:
            X.U6E r4 = (X.U6E) r4
            r4.setStagedSelection(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.USE.EhN(android.view.View, java.lang.Object, java.lang.String):void");
    }
}
