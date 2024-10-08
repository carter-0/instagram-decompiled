package X;

import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.TextView;

public final class FKk implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public FKk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new FKk(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v72, types: [java.lang.Object, X.EbD] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0127, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (X.DbV.A12(r14.toString()).length() == 0) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0136, code lost:
        if (r14.length() == 0) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017c, code lost:
        if (r0 != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017e, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0180, code lost:
        r2.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0183, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0196, code lost:
        if ((!X.00l.A0W(r14)) == true) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0198, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0199, code lost:
        r3.setEnabled(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x023e;
                case 1: goto L_0x0184;
                case 2: goto L_0x00a6;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0169;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0233;
                case 10: goto L_0x022b;
                case 11: goto L_0x013c;
                case 12: goto L_0x0005;
                case 13: goto L_0x011d;
                case 14: goto L_0x0220;
                case 15: goto L_0x003a;
                case 16: goto L_0x0214;
                case 17: goto L_0x0209;
                case 18: goto L_0x00e8;
                case 19: goto L_0x00da;
                case 20: goto L_0x002a;
                case 21: goto L_0x0006;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x01eb;
                case 25: goto L_0x00be;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.0qQ.A0B(r14, r0)
            boolean r0 = X.00l.A0W(r14)
            if (r0 == 0) goto L_0x0013
            r14.clear()
        L_0x0013:
            java.lang.Object r0 = r13.A01
            X.F0k r0 = (X.C49653F0k) r0
            android.view.View r2 = r0.A02
            java.lang.String r0 = r14.toString()
            java.lang.String r0 = X.DbV.A12(r0)
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x0180
            goto L_0x017e
        L_0x002a:
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.Object r0 = r13.A01
            X.E6N r0 = (X.E6N) r0
            X.FQS r1 = r0.A01
            if (r1 != 0) goto L_0x019d
            java.lang.String r6 = "adapter"
            goto L_0x0127
        L_0x003a:
            java.lang.Object r4 = r13.A01
            X.FGB r4 = (X.FGB) r4
            r0 = 1
            r4.A03 = r0
            android.widget.EditText r1 = r4.A06
            X.5mQ r0 = r4.A0F
            r5 = 0
            java.lang.String r3 = X.C294435mR.A03(r1, r0, r5)
            X.FGB.A01(r4)
            X.Ewk r2 = r4.A0E
            X.0JR r0 = r2.A01
            long r0 = r0.now()
            r2.A00 = r0
            java.lang.String r2 = ""
            java.lang.String r6 = "bioEntitySearchResultProvider"
            if (r3 == 0) goto L_0x009e
            java.lang.String r0 = "@"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x008f
            X.7eJ r0 = r4.A02
            if (r0 == 0) goto L_0x0127
            r0.EhX(r2)
            com.instagram.common.session.UserSession r0 = r4.A0D
            java.util.List r0 = X.0Gl.A03(r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x007a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ae
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            X.EbD r0 = new X.EbD
            r0.<init>()
            r0.A01 = r1
            r3.add(r0)
            goto L_0x007a
        L_0x008f:
            int r1 = r3.length()
            r0 = 2
            if (r1 < r0) goto L_0x009e
            X.7eJ r0 = r4.A02
            if (r0 == 0) goto L_0x0127
            r0.EhX(r3)
            return
        L_0x009e:
            X.7eJ r0 = r4.A02
            if (r0 == 0) goto L_0x0127
            r0.EhX(r2)
            return
        L_0x00a6:
            java.lang.Object r5 = r13.A01
            X.AZV r5 = (X.AZV) r5
            X.0eM r0 = r5.A0E
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            boolean r0 = r0.hasFocus()
            r1 = 0
            if (r0 == 0) goto L_0x01e6
            X.9m3 r6 = r5.A00
            if (r6 != 0) goto L_0x01b3
            java.lang.String r6 = "model"
            goto L_0x0127
        L_0x00be:
            r1 = 0
            if (r14 == 0) goto L_0x00ce
            java.lang.CharSequence r0 = X.00l.A0B(r14)
            if (r0 == 0) goto L_0x00ce
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            java.lang.Object r0 = r13.A01
            X.K7i r0 = (X.C61433K7i) r0
            X.7Pu r0 = r0.A01
            if (r0 == 0) goto L_0x0005
            r0.A0Q(r1)
            return
        L_0x00da:
            java.lang.Object r0 = r13.A01
            X.E31 r0 = (X.E31) r0
            com.instagram.actionbar.ActionButton r3 = r0.A00
            if (r3 == 0) goto L_0x0005
            boolean r2 = X.E31.A01(r0)
            goto L_0x0199
        L_0x00e8:
            java.lang.Object r2 = r13.A01
            X.E33 r2 = (X.E33) r2
            com.instagram.actionbar.ActionButton r0 = r2.A02
            r1 = 0
            if (r0 == 0) goto L_0x00f4
            r0.setEnabled(r1)
        L_0x00f4:
            com.instagram.igds.components.form.IgFormField r0 = r2.A03
            if (r0 == 0) goto L_0x0108
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0108
            android.view.View r0 = r2.A00
            X.AnonymousClass7TH.A0R(r0)
            return
        L_0x0108:
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x010f
            r0.setVisibility(r1)
        L_0x010f:
            X.Dj0 r3 = r2.A04
            if (r3 == 0) goto L_0x0005
            r2 = 1
            r3.removeMessages(r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x011d:
            java.lang.Object r0 = r13.A01
            X.E4P r0 = (X.E4P) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r0.A05
            if (r3 != 0) goto L_0x012f
            java.lang.String r6 = "loginButton"
        L_0x0127:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x012f:
            if (r14 == 0) goto L_0x0138
            int r1 = r14.length()
            r0 = 0
            if (r1 != 0) goto L_0x0139
        L_0x0138:
            r0 = 1
        L_0x0139:
            r2 = r0 ^ 1
            goto L_0x0199
        L_0x013c:
            java.lang.Object r1 = r13.A01
            X.E1v r1 = (X.C47427E1v) r1
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A07
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x015c
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A06
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x015c
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r1.A05
            r2 = 0
            goto L_0x0199
        L_0x015c:
            java.lang.String r0 = r14.toString()
            boolean r0 = X.0mp.A0C(r0)
            if (r0 == 0) goto L_0x0005
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r1.A05
            goto L_0x0198
        L_0x0169:
            java.lang.Object r1 = r13.A01
            X.E5H r1 = (X.E5H) r1
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r1.A07
            if (r0 == 0) goto L_0x0005
            java.lang.String r0 = r14.toString()
            boolean r0 = r0.isEmpty()
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r1.A07
            r1 = 0
            if (r0 == 0) goto L_0x0180
        L_0x017e:
            r1 = 8
        L_0x0180:
            r2.setVisibility(r1)
            return
        L_0x0184:
            java.lang.Object r0 = r13.A01
            X.K50 r0 = (X.K50) r0
            android.view.View r3 = r0.A00
            if (r3 == 0) goto L_0x0005
            r2 = 0
            r1 = 1
            if (r14 == 0) goto L_0x0199
            boolean r0 = X.00l.A0W(r14)
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x0199
        L_0x0198:
            r2 = 1
        L_0x0199:
            r3.setEnabled(r2)
            return
        L_0x019d:
            java.lang.String r0 = r14.toString()
            X.0qQ.A0B(r0, r2)
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r0)
            r1.A00 = r0
            X.FQS.A00(r1)
            return
        L_0x01ae:
            r0 = 0
            X.FGB.A03(r4, r0, r3, r5)
            return
        L_0x01b3:
            if (r14 == 0) goto L_0x01c1
            java.lang.String r11 = r14.toString()
            if (r11 == 0) goto L_0x01c1
            int r0 = r11.length()
            if (r0 != 0) goto L_0x01c2
        L_0x01c1:
            r11 = r1
        L_0x01c2:
            com.instagram.api.schemas.StoryGroupMentionTappableData r0 = r6.A00
            r4 = 1
            X.0qQ.A0B(r0, r4)
            java.lang.String r9 = r0.A01
            java.lang.String r10 = r0.A02
            java.util.List r12 = r0.A04
            java.lang.Integer r8 = r0.A00
            X.1hu r3 = new X.1hu
            r3.<init>(r1)
            r2 = 0
            r1 = 6
            X.1E9 r0 = new X.1E9
            r0.<init>(r3, r1, r2)
            com.instagram.api.schemas.StoryGroupMentionTappableData r7 = new com.instagram.api.schemas.StoryGroupMentionTappableData
            r7.<init>(r8, r9, r10, r11, r12)
            r6.A00 = r7
            X.AZV.A04(r5, r4)
        L_0x01e6:
            r0 = 0
            X.AZV.A03(r5, r0)
            return
        L_0x01eb:
            java.lang.Object r3 = r13.A01
            X.EQr r3 = (X.C48008EQr) r3
            int r0 = r14.length()
            boolean r2 = X.AnonymousClass7TF.A1R(r0)
            android.widget.TextView r0 = r3.A03
            r0.setEnabled(r2)
            android.widget.TextView r1 = r3.A03
            if (r2 == 0) goto L_0x0206
            int r0 = r3.A01
        L_0x0202:
            r1.setTextColor(r0)
            return
        L_0x0206:
            int r0 = r3.A00
            goto L_0x0202
        L_0x0209:
            java.lang.Object r1 = r13.A01
            X.E70 r1 = (X.E70) r1
            r0 = 1
            r1.A05 = r0
            X.E70.A00(r1)
            return
        L_0x0214:
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r0 = r13.A01
            X.FGB r0 = (X.FGB) r0
            X.FGB.A00(r14, r0)
            return
        L_0x0220:
            java.lang.Object r1 = r13.A01
            X.E54 r1 = (X.E54) r1
            r0 = 0
            r1.A0G = r0
            X.E54.A00(r1)
            return
        L_0x022b:
            java.lang.Object r0 = r13.A01
            X.E3Q r0 = (X.E3Q) r0
            X.E3Q.A00(r0)
            return
        L_0x0233:
            java.lang.Object r1 = r13.A01
            X.E75 r1 = (X.E75) r1
            r0 = 0
            r1.A06 = r0
            X.E75.A01(r1)
            return
        L_0x023e:
            java.lang.Object r0 = r13.A01
            X.E4W r0 = (X.E4W) r0
            X.E4W.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FKk.afterTextChanged(android.text.Editable):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextView textView;
        if (15 - this.A00 == 0) {
            0qQ.A0B(charSequence, 0);
            FGB fgb = (FGB) this.A01;
            if (DbU.A1Z(fgb.A0D) && i2 - i3 == 1) {
                String obj = charSequence.subSequence(i3 + i, i + i2).toString();
                0qQ.A0B(obj, 0);
                if ("@".equals(obj)) {
                    textView = fgb.A08;
                } else if ("#".equals(obj)) {
                    textView = fgb.A07;
                } else {
                    return;
                }
                if (textView != null) {
                    textView.setClickable(true);
                    textView.setSelected(false);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ed, code lost:
        r3.setEnabled(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0217, code lost:
        if (r1 != false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021e, code lost:
        r4.Epw(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0221, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (r7.length() == 0) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01cd, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d4, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 3: goto L_0x01f3;
                case 4: goto L_0x00a1;
                case 6: goto L_0x0068;
                case 7: goto L_0x0006;
                case 8: goto L_0x00e1;
                case 12: goto L_0x01c3;
                case 22: goto L_0x00cf;
                case 23: goto L_0x00b5;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.lang.Object r0 = r6.A01
            X.F0X r0 = (X.F0X) r0
            X.0eM r0 = r0.A06
            java.lang.Object r2 = r0.getValue()
            X.DlA r2 = (X.C46782DlA) r2
            X.0Ud r1 = r2.A09
            java.lang.Object r0 = r1.getValue()
            X.Jw4 r0 = (X.C61066Jw4) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0040
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0040
            X.05G r4 = r2.A06
            java.lang.Object r0 = r4.getValue()
            X.Jw4 r0 = (X.C61066Jw4) r0
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            r1 = 1
            X.0qQ.A0B(r2, r1)
            r0 = 4
            X.Jw4 r3 = new X.Jw4
            r3.<init>((boolean) r1, (java.util.List) r2, (boolean) r1, (int) r0)
            goto L_0x021e
        L_0x0040:
            java.lang.Object r0 = r1.getValue()
            X.Jw4 r0 = (X.C61066Jw4) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0005
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0005
            X.05G r4 = r2.A06
            java.lang.Object r0 = r4.getValue()
            X.Jw4 r0 = (X.C61066Jw4) r0
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            r1 = 1
            X.0qQ.A0B(r2, r1)
            r0 = 4
            X.Jw4 r3 = new X.Jw4
            r3.<init>((boolean) r5, (java.util.List) r2, (boolean) r1, (int) r0)
            goto L_0x021e
        L_0x0068:
            r2 = 0
            X.0qQ.A0B(r7, r2)
            java.lang.Object r1 = r6.A01
            X.EIw r1 = (X.C47824EIw) r1
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x008a
            int r0 = r7.length()
            if (r0 != 0) goto L_0x008a
            android.view.View r0 = r1.A07
            X.Dbc.A0N(r0)
            r0 = 1
            r1.A06 = r0
            android.view.View r0 = r1.A01
            if (r0 == 0) goto L_0x0005
            r0.setVisibility(r2)
            return
        L_0x008a:
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x0005
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0005
            android.view.View r0 = r1.A07
            X.Dbc.A0N(r0)
            r1.A06 = r2
            android.view.View r0 = r1.A01
            X.AnonymousClass7TH.A0R(r0)
            return
        L_0x00a1:
            java.lang.Object r0 = r6.A01
            X.E5J r0 = (X.E5J) r0
            X.8Ca r1 = r0.A05
            if (r1 == 0) goto L_0x0005
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.05G r4 = r1.A01
            java.lang.String r3 = r7.toString()
            goto L_0x021e
        L_0x00b5:
            java.lang.Object r0 = r6.A01
            X.E6J r0 = (X.E6J) r0
            com.instagram.common.ui.base.IgTextView r3 = r0.A01
            if (r3 != 0) goto L_0x00c1
            java.lang.String r0 = "sendButton"
            goto L_0x01cd
        L_0x00c1:
            if (r7 == 0) goto L_0x00ca
            int r1 = r7.length()
            r0 = 0
            if (r1 != 0) goto L_0x00cb
        L_0x00ca:
            r0 = 1
        L_0x00cb:
            r2 = r0 ^ 1
            goto L_0x01ed
        L_0x00cf:
            java.lang.Object r1 = r6.A01
            X.0sP r1 = (X.0sP) r1
            if (r7 == 0) goto L_0x00db
            java.lang.String r0 = r7.toString()
            if (r0 != 0) goto L_0x00dd
        L_0x00db:
            java.lang.String r0 = ""
        L_0x00dd:
            r1.invoke(r0)
            return
        L_0x00e1:
            java.lang.Object r2 = r6.A01
            X.E3B r2 = (X.E3B) r2
            com.instagram.common.session.UserSession r4 = r2.A07
            if (r4 == 0) goto L_0x01c0
            X.0Tu r3 = X.0Tu.A06
            r0 = 36595530838640794(0x8203710001089a, double:3.2064992885067635E-306)
            int r4 = X.DbS.A04(r3, r4, r0)
            android.widget.EditText r0 = r2.A05()
            java.lang.String r5 = X.AnonymousClass7TF.A0f(r0)
            java.util.regex.Pattern r0 = X.0mp.A01
            java.util.regex.Pattern r0 = android.util.Patterns.WEB_URL
            java.util.regex.Matcher r0 = r0.matcher(r5)
            X.0qQ.A07(r0)
            int r1 = r5.length()
            if (r1 != 0) goto L_0x01a0
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
        L_0x010f:
            r0 = 0
            r2.A0C = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r3 != r0) goto L_0x0143
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x01bd
            android.content.Context r0 = r2.A04()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131960744(0x7f1323a8, float:1.9558165E38)
        L_0x0125:
            java.lang.String r0 = r1.getString(r0)
        L_0x0129:
            r3.setText(r0)
            android.widget.TextView r4 = r2.A05
            if (r4 == 0) goto L_0x01bd
            android.content.Context r3 = r2.A04()
            android.content.Context r1 = r2.A04()
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
        L_0x013b:
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A17(r3, r4, r0)
            return
        L_0x0143:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1 = 1
            if (r3 != r0) goto L_0x015c
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x01bd
            android.content.Context r0 = r2.A04()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131820682(0x7f11008a, float:1.9274086E38)
            java.lang.String r0 = X.DbY.A0d(r1, r4, r0)
            goto L_0x0129
        L_0x015c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 != r0) goto L_0x0170
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x01bd
            android.content.Context r0 = r2.A04()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131960749(0x7f1323ad, float:1.9558175E38)
            goto L_0x0125
        L_0x0170:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r3 != r0) goto L_0x0184
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x01bd
            android.content.Context r0 = r2.A04()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131960750(0x7f1323ae, float:1.9558177E38)
            goto L_0x0125
        L_0x0184:
            r2.A0C = r1
            android.widget.TextView r1 = r2.A05
            if (r1 == 0) goto L_0x01bd
            r0 = 2131960751(0x7f1323af, float:1.955818E38)
            r1.setText(r0)
            android.widget.TextView r4 = r2.A05
            if (r4 == 0) goto L_0x01bd
            android.content.Context r3 = r2.A04()
            android.content.Context r1 = r2.A04()
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            goto L_0x013b
        L_0x01a0:
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x01aa
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x010f
        L_0x01aa:
            java.lang.String r0 = "\n"
            r3 = 0
            boolean r0 = X.DbU.A1a(r5, r0)
            if (r0 == 0) goto L_0x01b7
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x010f
        L_0x01b7:
            if (r1 <= r4) goto L_0x010f
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x010f
        L_0x01bd:
            java.lang.String r0 = "messageTitle"
            goto L_0x01cd
        L_0x01c0:
            java.lang.String r0 = "userSession"
            goto L_0x01cd
        L_0x01c3:
            java.lang.Object r0 = r6.A01
            X.E2M r0 = (X.E2M) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r0.A01
            if (r3 != 0) goto L_0x01d5
            java.lang.String r0 = "nextButton"
        L_0x01cd:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d5:
            com.instagram.igds.components.form.IgFormField r0 = r0.A00
            if (r0 != 0) goto L_0x01dc
            java.lang.String r0 = "emailFormField"
            goto L_0x01cd
        L_0x01dc:
            java.lang.String r1 = X.DbU.A0o(r0)
            int r0 = r1.length()
            r2 = 1
            if (r0 <= 0) goto L_0x01f1
            boolean r0 = X.0mp.A0C(r1)
            if (r0 == 0) goto L_0x01f1
        L_0x01ed:
            r3.setEnabled(r2)
            return
        L_0x01f1:
            r2 = 0
            goto L_0x01ed
        L_0x01f3:
            java.lang.Object r0 = r6.A01
            X.E4V r0 = (X.E4V) r0
            X.DkL r2 = X.E4V.A00(r0)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.05G r0 = r2.A0D
            r0.Epw(r1)
            X.05G r4 = r2.A0E
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0219
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x021a
        L_0x0219:
            r0 = 1
        L_0x021a:
            java.lang.Boolean r3 = X.DbT.A0l(r0)
        L_0x021e:
            r4.Epw(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FKk.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
