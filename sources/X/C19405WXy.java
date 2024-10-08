package X;

import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.WXy  reason: case insensitive filesystem */
public final class C19405WXy implements X4E {
    public final /* synthetic */ IgFormField A00;
    public final /* synthetic */ LeadGenFormBaseQuestion A01;
    public final /* synthetic */ C14746U6n A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C19405WXy(IgFormField igFormField, LeadGenFormBaseQuestion leadGenFormBaseQuestion, C14746U6n u6n, boolean z, boolean z2) {
        this.A02 = u6n;
        this.A01 = leadGenFormBaseQuestion;
        this.A04 = z;
        this.A00 = igFormField;
        this.A03 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r9.A04 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (X.00l.A0B(r11).length() > 0) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C17355VSi getState(X.C17355VSi r10, java.lang.CharSequence r11, boolean r12) {
        /*
            r9 = this;
            r8 = 0
            X.AnonymousClass7TF.A1H(r10, r11)
            X.U6n r2 = r9.A02
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x002e
            if (r12 == 0) goto L_0x002e
            java.lang.String r0 = r11.toString()
            java.lang.String r3 = r2.A0D(r0)
            java.lang.String r0 = r2.A03
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x002b
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x002b
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = r9.A01
            X.X4J r0 = r2.A02
            if (r0 == 0) goto L_0x002b
            r0.DwH(r1)
        L_0x002b:
            r2.setLastKnownInput(r3)
        L_0x002e:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0038
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = r9.A01
            boolean r0 = r0.A0I
            if (r0 != 0) goto L_0x003d
        L_0x0038:
            boolean r0 = r9.A04
            r4 = 0
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r4 = 1
        L_0x003e:
            boolean r0 = X.00l.A0W(r11)
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x00cf
            com.instagram.igds.components.form.IgFormField r3 = r9.A00
            java.lang.String r0 = ""
        L_0x004c:
            r3.setLabelText(r0)
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x00ba
            java.text.SimpleDateFormat r0 = X.W33.A04
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r5 = r9.A01
            java.lang.String r1 = r5.A05
            X.Uxp r0 = r5.A03
            java.lang.String r0 = X.W33.A03(r3, r0, r1)
        L_0x0063:
            X.Vtk r3 = X.C18532Vtk.A00
            java.lang.String r1 = r11.toString()
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = r5.A00
        L_0x006d:
            boolean r1 = X.00l.A0W(r1)
            if (r1 == 0) goto L_0x007a
            if (r4 == 0) goto L_0x007a
        L_0x0075:
            java.lang.String r0 = "confirmed"
            r10.A01 = r0
        L_0x0079:
            return r10
        L_0x007a:
            java.lang.String r1 = r11.toString()
            if (r1 != 0) goto L_0x0082
            java.lang.String r1 = r5.A00
        L_0x0082:
            boolean r1 = X.00l.A0W(r1)
            if (r1 == 0) goto L_0x0091
            if (r4 != 0) goto L_0x0091
            java.lang.String r1 = "error"
            r10.A01 = r1
        L_0x008e:
            r10.A00 = r0
            return r10
        L_0x0091:
            boolean r7 = r9.A03
            r4 = 0
            X.0sn r6 = X.0sn.A00
            boolean r0 = r3.A00(r4, r5, r6, r7, r8)
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = "error"
            r10.A01 = r0
            java.text.SimpleDateFormat r0 = X.W33.A04
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r2)
            java.lang.String r1 = r5.A05
            X.Uxp r0 = r5.A03
            java.lang.String r0 = X.W33.A03(r2, r0, r1)
            goto L_0x008e
        L_0x00af:
            java.lang.CharSequence r0 = X.00l.A0B(r11)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0079
            goto L_0x0075
        L_0x00ba:
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r5 = r9.A01
            boolean r0 = r2 instanceof com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView
            if (r0 == 0) goto L_0x00cc
            android.content.Context r1 = r2.getContext()
            r0 = 2131964826(0x7f13339a, float:1.9566445E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            goto L_0x0063
        L_0x00cc:
            java.lang.String r0 = r5.A0A
            goto L_0x0063
        L_0x00cf:
            com.instagram.igds.components.form.IgFormField r3 = r9.A00
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = r9.A01
            boolean r0 = r2 instanceof com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView
            if (r0 == 0) goto L_0x00e4
            android.content.Context r1 = r2.getContext()
            r0 = 2131964826(0x7f13339a, float:1.9566445E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            goto L_0x004c
        L_0x00e4:
            java.lang.String r0 = r1.A0A
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19405WXy.getState(X.VSi, java.lang.CharSequence, boolean):X.VSi");
    }
}
