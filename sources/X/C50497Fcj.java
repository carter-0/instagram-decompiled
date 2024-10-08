package X;

/* renamed from: X.Fcj  reason: case insensitive filesystem */
public final class C50497Fcj implements X4E {
    public final int A00;
    public final Object A01;

    public C50497Fcj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        r0 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0136, code lost:
        r9.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0138, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0157, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C17355VSi getState(X.C17355VSi r9, java.lang.CharSequence r10, boolean r11) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x011e;
                case 1: goto L_0x00a7;
                case 2: goto L_0x0079;
                case 3: goto L_0x004c;
                case 4: goto L_0x0038;
                case 5: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r9 = 0
        L_0x0006:
            return r9
        L_0x0007:
            X.AnonymousClass7TG.A1N(r9, r10)
            java.lang.Object r1 = r8.A01
            X.E31 r1 = (X.E31) r1
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0006
            int r0 = r10.length()
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "error"
            r9.A01 = r0
            android.content.Context r1 = r1.requireContext()
            r0 = 2131972253(0x7f13509d, float:1.9581508E38)
            goto L_0x0099
        L_0x0024:
            java.util.regex.Pattern r0 = android.util.Patterns.WEB_URL
            boolean r0 = X.DbV.A1b(r10, r0)
            if (r0 != 0) goto L_0x0006
            java.lang.String r0 = "error"
            r9.A01 = r0
            android.content.Context r1 = r1.requireContext()
            r0 = 2131969961(0x7f1347a9, float:1.957686E38)
            goto L_0x0099
        L_0x0038:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0006
            java.lang.String r0 = "error"
            r9.A01 = r0
            java.lang.Object r0 = r8.A01
            android.content.Context r1 = X.DbT.A08(r0)
            r0 = 2131963022(0x7f132c8e, float:1.9562786E38)
            goto L_0x0099
        L_0x004c:
            X.AnonymousClass7TG.A1N(r9, r10)
            java.lang.Object r2 = r8.A01
            X.F2a r2 = (X.C49690F2a) r2
            com.instagram.igds.components.form.IgFormField r0 = r2.A04
            java.lang.String r1 = X.DbU.A0o(r0)
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0006
            boolean r0 = X.Dba.A1X(r10, r1)
            if (r0 != 0) goto L_0x0006
            java.lang.String r0 = r10.toString()
            if (r0 == 0) goto L_0x0006
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0006
            java.lang.String r0 = "error"
            r9.A01 = r0
            android.content.Context r1 = r2.A02
            r0 = 2131969203(0x7f1344b3, float:1.9575322E38)
            goto L_0x0099
        L_0x0079:
            r4 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r9, r10)
            int r2 = r10.length()
            r0 = 6
            java.lang.Object r1 = r8.A01
            X.F2a r1 = (X.C49690F2a) r1
            if (r2 >= r0) goto L_0x009f
            r1.A01 = r3
            com.instagram.igds.components.form.IgFormField r0 = r1.A03
            r0.A0E()
            java.lang.String r0 = "error"
            r9.A01 = r0
            android.content.Context r1 = r1.A02
            r0 = 2131969198(0x7f1344ae, float:1.9575312E38)
        L_0x0099:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0136
        L_0x009f:
            r1.A01 = r4
            com.instagram.igds.components.form.IgFormField r0 = r1.A03
            r0.A0E()
            return r9
        L_0x00a7:
            r4 = 0
            boolean r5 = X.AnonymousClass7TF.A1U(r4, r9, r10)
            java.lang.Object r3 = r8.A01
            X.E43 r3 = (X.E43) r3
            java.lang.String r7 = X.DbV.A12(r10)
            r3.A04 = r7
            java.lang.String r6 = "newFolderName"
            if (r7 == 0) goto L_0x0157
            int r1 = r7.length()
            r0 = 15
            java.lang.String r2 = "saveButton"
            if (r1 <= r0) goto L_0x00d7
            com.instagram.actionbar.ActionButton r0 = r3.A00
            if (r0 == 0) goto L_0x011a
            r0.setEnabled(r4)
            java.lang.String r0 = "error"
            r9.A01 = r0
            r0 = 2131959691(0x7f131f8b, float:1.955603E38)
        L_0x00d2:
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0136
        L_0x00d7:
            java.util.ArrayList r0 = r3.A06
            if (r0 != 0) goto L_0x00de
            java.lang.String r6 = "otherFolderNames"
            goto L_0x0157
        L_0x00de:
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x00f3
            com.instagram.actionbar.ActionButton r0 = r3.A00
            if (r0 == 0) goto L_0x011a
            r0.setEnabled(r4)
            java.lang.String r0 = "error"
            r9.A01 = r0
            r0 = 2131959690(0x7f131f8a, float:1.9556028E38)
            goto L_0x00d2
        L_0x00f3:
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x0157
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x0104
            java.lang.String r6 = "initialFolderName"
            goto L_0x0157
        L_0x0104:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0112
            com.instagram.actionbar.ActionButton r0 = r3.A00
            if (r0 == 0) goto L_0x011a
            r0.setEnabled(r5)
            return r9
        L_0x0112:
            com.instagram.actionbar.ActionButton r0 = r3.A00
            if (r0 == 0) goto L_0x011a
            r0.setEnabled(r4)
            return r9
        L_0x011a:
            X.0qQ.A0F(r2)
            goto L_0x015a
        L_0x011e:
            X.AnonymousClass7TG.A1N(r9, r10)
            boolean r0 = X.00l.A0W(r10)
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = "error"
            r9.A01 = r0
            java.lang.Object r1 = r8.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131964467(0x7f133233, float:1.9565716E38)
        L_0x0132:
            java.lang.String r0 = r1.getString(r0)
        L_0x0136:
            r9.A00 = r0
            return r9
        L_0x0139:
            int r1 = r10.length()
            r0 = 50
            if (r1 <= r0) goto L_0x014d
            java.lang.String r0 = "error"
            r9.A01 = r0
            java.lang.Object r1 = r8.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131972147(0x7f135033, float:1.9581293E38)
            goto L_0x0132
        L_0x014d:
            java.lang.Object r1 = r8.A01
            X.K61 r1 = (X.K61) r1
            java.lang.String r0 = r1.A05
            if (r0 != 0) goto L_0x015f
            java.lang.String r6 = "originalTitle"
        L_0x0157:
            X.0qQ.A0F(r6)
        L_0x015a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x015f:
            boolean r0 = r0.contentEquals(r10)
            if (r0 != 0) goto L_0x0176
            X.0mM r0 = r1.A0A
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0179
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0176
            java.lang.String r0 = "error"
            r9.A01 = r0
            java.lang.String r0 = r1.A03
            goto L_0x0136
        L_0x0176:
            java.lang.String r0 = "confirmed"
            goto L_0x017b
        L_0x0179:
            java.lang.String r0 = "loading"
        L_0x017b:
            r9.A01 = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50497Fcj.getState(X.VSi, java.lang.CharSequence, boolean):X.VSi");
    }
}
