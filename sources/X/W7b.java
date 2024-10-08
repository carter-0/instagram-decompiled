package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.instagram.igds.components.form.IgFormField;

public final class W7b implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public W7b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static EditText A00(IgFormField igFormField, Object obj, int i) {
        igFormField.A0G(new W7b(obj, i));
        return igFormField.getMEditText();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: X.UZo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: X.UZ7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: X.UZo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: X.UZo} */
    /* JADX WARNING: type inference failed for: r5v3, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026b, code lost:
        if (r14.length() <= 0) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r19 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0324, code lost:
        r12 = new X.C15421UcX(r13, r14, r15, r16, r17);
        r7 = new java.lang.Object();
        r6 = X.AnonymousClass7TF.A0D();
        r5 = new X.C19304WTm(2, r4, r7);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (X.00l.A0W(r14) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03aa, code lost:
        r3 = new X.0mM(r6, r5, 300);
        r7.A00 = r3;
        r0 = new X.C17971Vj8(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x041f, code lost:
        r3.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0422, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0423, code lost:
        r8 = "dataFetcher";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0425, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x042c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r9 = r2.A00;
        r11 = r2.A02;
        r10 = r2.A01;
        X.AnonymousClass7TG.A1T(r9, r12, r11);
        X.0qQ.A0B(r10, 4);
        r6.Epw(new X.UOK(r9, r10, r11, r12, !r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r19 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r14.length() != 1) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r0 = X.U91.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r0 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r8 = r0.A01.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r8 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (r5.A00 != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r5.A01 != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A0B.A00, 36323758192995785L) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        X.AnonymousClass7TE.A1Z(new X.MGD(r8, r5, (X.AnonymousClass4D7) null, 4), X.C318116oQ.A00(r5));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r19) {
        /*
            r18 = this;
            r2 = r18
            int r0 = r2.A00
            r14 = r19
            switch(r0) {
                case 1: goto L_0x0256;
                case 2: goto L_0x0233;
                case 3: goto L_0x03b9;
                case 4: goto L_0x0339;
                case 5: goto L_0x02bd;
                case 6: goto L_0x01c6;
                case 7: goto L_0x0169;
                case 8: goto L_0x0009;
                case 9: goto L_0x0125;
                case 10: goto L_0x0105;
                case 11: goto L_0x0009;
                case 12: goto L_0x0272;
                case 13: goto L_0x00ec;
                case 14: goto L_0x0272;
                case 15: goto L_0x00cf;
                case 16: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r0 = r2.A01
            X.VtD r0 = (X.C18514VtD) r0
            X.U91 r5 = X.C18514VtD.A00(r0)
            X.0Ud r0 = r5.A0G
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof X.UOK
            r4 = 0
            if (r0 == 0) goto L_0x00cc
            X.UOK r2 = (X.UOK) r2
        L_0x001f:
            r3 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0089
            X.05G r6 = r5.A0E
            if (r19 == 0) goto L_0x002d
            java.lang.String r12 = r14.toString()
            if (r12 != 0) goto L_0x0031
        L_0x002d:
            java.lang.String r12 = ""
            if (r19 == 0) goto L_0x0038
        L_0x0031:
            boolean r1 = X.00l.A0W(r14)
            r0 = 0
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            r13 = r0 ^ 1
            X.X1e r9 = r2.A00
            java.lang.Integer r11 = r2.A02
            X.X1f r10 = r2.A01
            X.AnonymousClass7TG.A1T(r9, r12, r11)
            r2 = 4
            X.0qQ.A0B(r10, r2)
            X.UOK r8 = new X.UOK
            r8.<init>(r9, r10, r11, r12, r13)
            r6.Epw(r8)
            if (r19 == 0) goto L_0x0089
            int r0 = r14.length()
            if (r0 != r7) goto L_0x0089
            X.UOF r0 = X.U91.A00(r5)
            if (r0 == 0) goto L_0x0089
            X.3uh r0 = r0.A01
            X.1Xj r8 = r0.A0b
            if (r8 == 0) goto L_0x0089
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0089
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0089
            X.VgI r0 = r5.A0B
            com.instagram.common.session.UserSession r7 = r0.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36323758192995785(0x810c4400002dc9, double:3.034629173060254E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0089
            X.6oS r1 = X.C318116oQ.A00(r5)
            X.MGD r0 = new X.MGD
            r0.<init>(r8, r5, r4, r2)
            X.AnonymousClass7TE.A1Z(r0, r1)
        L_0x0089:
            X.Vj6 r1 = r5.A06
            if (r19 == 0) goto L_0x0093
            boolean r0 = X.00l.A0W(r14)
            if (r0 == 0) goto L_0x0094
        L_0x0093:
            r3 = 1
        L_0x0094:
            r1.A00(r3)
            X.UOF r0 = X.U91.A00(r5)
            if (r0 == 0) goto L_0x0009
            com.instagram.user.model.User r0 = X.C17103VHz.A00(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r6 = r0.getId()
            X.VgI r0 = r5.A0B
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36320970759414768(0x8109bb000323f0, double:3.0328663888395246E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0009
            X.4Cq r2 = r5.A0C
            X.4Cc r0 = r2.ArX()
            X.AnonymousClass5H8.A02(r0)
            r1 = 22
            X.MH6 r0 = new X.MH6
            r0.<init>((java.lang.Object) r5, (java.lang.String) r6, (X.AnonymousClass4D7) r4, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            return
        L_0x00cc:
            r2 = r4
            goto L_0x001f
        L_0x00cf:
            if (r19 == 0) goto L_0x0009
            java.lang.String r0 = r14.toString()
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = X.DbV.A12(r0)
            if (r1 == 0) goto L_0x0009
            java.lang.Object r0 = r2.A01
            X.UaA r0 = (X.C15303UaA) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.U8X r0 = (X.U8X) r0
            r0.A00 = r1
            return
        L_0x00ec:
            if (r19 == 0) goto L_0x0009
            java.lang.String r0 = r14.toString()
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = X.DbV.A12(r0)
            if (r1 == 0) goto L_0x0009
            java.lang.Object r0 = r2.A01
            X.Ua3 r0 = (X.C15297Ua3) r0
            X.U8f r0 = r0.A00()
            r0.A00 = r1
            return
        L_0x0105:
            r3 = 0
            X.0qQ.A0B(r14, r3)
            java.lang.Object r5 = r2.A01
            com.instagram.igds.components.form.IgFormField r5 = (com.instagram.igds.components.form.IgFormField) r5
            boolean r0 = r5.A0G
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = r14.toString()
            int r0 = r1.length()
            int r0 = r1.codePointCount(r3, r0)
            android.widget.TextView r4 = r5.A0A
            if (r4 != 0) goto L_0x0278
            java.lang.String r8 = "textLimitView"
            goto L_0x0425
        L_0x0125:
            r6 = 0
            X.0qQ.A0B(r14, r6)
            int r0 = r14.length()
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x014b
            r4 = 0
            java.lang.Object r0 = r2.A01
            com.instagram.igds.components.form.IgFormField r0 = (com.instagram.igds.components.form.IgFormField) r0
            X.ViC r3 = r0.A0F
            java.lang.String r8 = "labelAnimationHelper"
            if (r3 == 0) goto L_0x0425
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "inline"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "top"
            r3.A00(r0, r6)
        L_0x014b:
            java.lang.Object r2 = r2.A01
            com.instagram.igds.components.form.IgFormField r2 = (com.instagram.igds.components.form.IgFormField) r2
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x0009
            android.widget.TextView r1 = r2.getInlineLabel()
            r0 = 4
            if (r4 == 0) goto L_0x015b
            r0 = 0
        L_0x015b:
            r1.setVisibility(r0)
            android.widget.TextView r0 = r2.getTopLabel()
            if (r4 == 0) goto L_0x0165
            r5 = 4
        L_0x0165:
            r0.setVisibility(r5)
            return
        L_0x0169:
            r7 = 0
            X.0qQ.A0B(r14, r7)
            int r0 = r14.length()
            java.lang.String r8 = "addressTypeaheadAdapter"
            java.lang.Object r15 = r2.A01
            X.UZN r15 = (X.UZN) r15
            if (r0 != 0) goto L_0x0188
            X.U9o r1 = r15.A04
            if (r1 == 0) goto L_0x0425
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0182:
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        L_0x0188:
            X.Vin r2 = r15.A08
            java.lang.String r0 = r14.toString()
            X.0qQ.A0B(r0, r7)
            java.util.Map r1 = r2.A00
            java.lang.String r0 = X.DbY.A0j(r0)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x01aa
            X.U9o r1 = r15.A04
            if (r1 == 0) goto L_0x0425
            java.lang.String r0 = r14.toString()
            java.util.List r0 = r2.A00(r0)
            goto L_0x0182
        L_0x01aa:
            X.VRe r3 = r15.A03
            if (r3 == 0) goto L_0x0009
            java.lang.String r6 = r14.toString()
            java.lang.String r1 = "ads/promote/regional_location_typeahead/"
            int r0 = r1.length()
            int r0 = r0 + -1
            java.lang.String r16 = X.C13991Tnr.A0a(r0, r1)
            X.WGU r13 = r15.A02
            if (r13 != 0) goto L_0x0298
            java.lang.String r8 = "logger"
            goto L_0x0425
        L_0x01c6:
            r1 = 0
            X.0qQ.A0B(r14, r1)
            int r0 = r14.length()
            r3 = 1
            java.lang.Object r15 = r2.A01
            X.UZ7 r15 = (X.UZ7) r15
            if (r0 != 0) goto L_0x01de
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.UZ7.A00(r15, r0)
            return
        L_0x01de:
            X.Vin r2 = r15.A07
            java.lang.String r0 = r14.toString()
            X.0qQ.A0B(r0, r1)
            java.util.Map r1 = r2.A00
            java.lang.String r0 = X.DbY.A0j(r0)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0210
            java.lang.String r0 = r14.toString()
            java.util.List r1 = r2.A00(r0)
            X.0eM r0 = r15.A0B
            java.lang.Object r0 = r0.getValue()
            X.U92 r0 = (X.U92) r0
            X.ULF r0 = r0.A0A()
            java.util.List r0 = r0.A05
            r1.removeAll(r0)
            X.UZ7.A00(r15, r1)
            return
        L_0x0210:
            X.0eM r0 = r15.A08
            java.lang.Object r4 = r0.getValue()
            X.VRe r4 = (X.C17325VRe) r4
            if (r4 == 0) goto L_0x0009
            java.lang.String r2 = r14.toString()
            java.lang.String r1 = "ads/promote/regional_location_typeahead/"
            int r0 = r1.length()
            int r0 = r0 - r3
            java.lang.String r16 = X.C13991Tnr.A0a(r0, r1)
            X.0eM r0 = r15.A09
            X.WGU r13 = X.C13990Tnq.A0M(r0)
            r17 = 6
            goto L_0x0324
        L_0x0233:
            java.lang.Object r2 = r2.A01
            com.google.android.material.textfield.TextInputLayout r2 = (com.google.android.material.textfield.TextInputLayout) r2
            boolean r0 = r2.A0U
            r1 = r0 ^ 1
            r0 = 0
            com.google.android.material.textfield.TextInputLayout.A0L(r2, r1, r0)
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x024a
            int r0 = r14.length()
            r2.A0R(r0)
        L_0x024a:
            boolean r0 = r2.A0T
            if (r0 == 0) goto L_0x0009
            int r0 = r14.length()
            com.google.android.material.textfield.TextInputLayout.A0K(r2, r0)
            return
        L_0x0256:
            java.lang.Object r2 = r2.A01
            X.UWa r2 = (X.C15223UWa) r2
            com.google.android.material.textfield.TextInputLayout r1 = r2.A02
            java.lang.CharSequence r0 = r1.A0N
            if (r0 != 0) goto L_0x0009
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x026d
            int r1 = r14.length()
            r0 = 1
            if (r1 > 0) goto L_0x026e
        L_0x026d:
            r0 = 0
        L_0x026e:
            X.C15223UWa.A00(r2, r0)
            return
        L_0x0272:
            java.lang.Object r0 = r2.A01
            X.C51965G9l.A1W(r0, r14)
            return
        L_0x0278:
            java.lang.String r3 = X.C13989Tnp.A0m(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.NumberFormat r2 = java.text.NumberFormat.getInstance(r0)
            int r0 = r5.A02
            long r0 = (long) r0
            java.lang.String r1 = r2.format(r0)
            java.lang.String r0 = "/"
            java.lang.String r0 = X.002.A0g(r3, r0, r1)
            X.0qQ.A07(r0)
            r4.setText(r0)
            return
        L_0x0298:
            r17 = 7
            X.UcX r12 = new X.UcX
            r12.<init>(r13, r14, r15, r16, r17)
            X.0rm r5 = new X.0rm
            r5.<init>()
            android.os.Handler r4 = X.AnonymousClass7TF.A0D()
            X.WTm r2 = new X.WTm
            r2.<init>(r7, r3, r5)
            r0 = 300(0x12c, double:1.48E-321)
            X.0mM r3 = new X.0mM
            r3.<init>(r4, r2, r0)
            r5.A00 = r3
            X.Vj8 r0 = new X.Vj8
            r0.<init>(r12, r6)
            goto L_0x041f
        L_0x02bd:
            r1 = 0
            X.0qQ.A0B(r14, r1)
            int r0 = r14.length()
            r3 = 1
            java.lang.Object r15 = r2.A01
            X.UZo r15 = (X.C15284UZo) r15
            if (r0 != 0) goto L_0x02d5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.C15284UZo.A01(r15, r0)
            return
        L_0x02d5:
            X.Vin r2 = r15.A0B
            java.lang.String r0 = r14.toString()
            X.0qQ.A0B(r0, r1)
            java.util.Map r1 = r2.A00
            java.lang.String r0 = X.DbY.A0j(r0)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0305
            java.lang.String r0 = r14.toString()
            java.util.List r1 = r2.A00(r0)
            X.0eM r0 = r15.A0E
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            com.instagram.business.promote.model.PendingLocation r0 = r0.A0o
            java.util.List r0 = r0.A05
            r1.removeAll(r0)
            X.C15284UZo.A01(r15, r1)
            return
        L_0x0305:
            X.0eM r0 = r15.A0C
            java.lang.Object r4 = r0.getValue()
            X.VRe r4 = (X.C17325VRe) r4
            java.lang.String r2 = r14.toString()
            java.lang.String r1 = "ads/promote/regional_location_typeahead/"
            int r0 = r1.length()
            int r0 = r0 - r3
            java.lang.String r16 = X.C13991Tnr.A0a(r0, r1)
            X.0eM r0 = r15.A0D
            X.WGU r13 = X.C13990Tnq.A0M(r0)
            r17 = 5
        L_0x0324:
            X.UcX r12 = new X.UcX
            r12.<init>(r13, r14, r15, r16, r17)
            X.0rm r7 = new X.0rm
            r7.<init>()
            android.os.Handler r6 = X.AnonymousClass7TF.A0D()
            r0 = 2
            X.WTm r5 = new X.WTm
            r5.<init>(r0, r4, r7)
            goto L_0x03aa
        L_0x0339:
            r1 = 0
            X.0qQ.A0B(r14, r1)
            int r0 = r14.length()
            r4 = 1
            if (r0 != 0) goto L_0x0353
            java.util.List r1 = java.util.Collections.emptyList()
            X.0qQ.A07(r1)
            java.lang.Object r0 = r2.A01
            X.UZV r0 = (X.UZV) r0
            X.UZV.A02(r0, r1)
            return
        L_0x0353:
            java.lang.Object r15 = r2.A01
            X.UZV r15 = (X.UZV) r15
            X.Vin r2 = r15.A0C
            java.lang.String r0 = r14.toString()
            X.0qQ.A0B(r0, r1)
            java.util.Map r1 = r2.A00
            java.lang.String r0 = X.DbY.A0j(r0)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x037c
            java.lang.String r0 = r14.toString()
            java.util.List r0 = r2.A00(r0)
            java.util.List r0 = X.00k.A0a(r0)
            X.UZV.A02(r15, r0)
            return
        L_0x037c:
            X.VRe r3 = r15.A04
            if (r3 == 0) goto L_0x0423
            java.lang.String r2 = r14.toString()
            java.lang.String r1 = "ads/promote/interest_typeahead/"
            int r0 = r1.length()
            int r0 = r0 - r4
            java.lang.String r16 = X.C13991Tnr.A0a(r0, r1)
            X.0eM r0 = r15.A0D
            X.WGU r13 = X.C13990Tnq.A0M(r0)
            r17 = 4
            X.UcX r12 = new X.UcX
            r12.<init>(r13, r14, r15, r16, r17)
            X.0rm r7 = new X.0rm
            r7.<init>()
            android.os.Handler r6 = X.AnonymousClass7TF.A0D()
            X.WTm r5 = new X.WTm
            r5.<init>(r4, r3, r7)
        L_0x03aa:
            r0 = 300(0x12c, double:1.48E-321)
            X.0mM r3 = new X.0mM
            r3.<init>(r6, r5, r0)
            r7.A00 = r3
            X.Vj8 r0 = new X.Vj8
            r0.<init>(r12, r2)
            goto L_0x041f
        L_0x03b9:
            r1 = 0
            X.0qQ.A0B(r14, r1)
            int r0 = r14.length()
            r4 = 1
            if (r0 != 0) goto L_0x03d3
            java.util.List r1 = java.util.Collections.emptyList()
            X.0qQ.A07(r1)
            java.lang.Object r0 = r2.A01
            X.UZW r0 = (X.UZW) r0
            X.UZW.A02(r0, r1)
            return
        L_0x03d3:
            java.lang.Object r15 = r2.A01
            X.UZW r15 = (X.UZW) r15
            X.Vin r2 = r15.A0G
            java.lang.String r0 = r14.toString()
            X.0qQ.A0B(r0, r1)
            java.util.Map r1 = r2.A00
            java.lang.String r0 = X.DbY.A0j(r0)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x03fc
            java.lang.String r0 = r14.toString()
            java.util.List r0 = r2.A00(r0)
            java.util.List r0 = X.00k.A0a(r0)
            X.UZW.A02(r15, r0)
            return
        L_0x03fc:
            X.W1k r3 = r15.A05
            if (r3 == 0) goto L_0x0423
            java.lang.String r2 = r14.toString()
            java.lang.String r1 = "ads/promote/interest_typeahead/"
            int r0 = r1.length()
            int r0 = r0 - r4
            java.lang.String r16 = X.C13991Tnr.A0a(r0, r1)
            X.WGU r13 = r15.A04
            r17 = 3
            X.UcX r12 = new X.UcX
            r12.<init>(r13, r14, r15, r16, r17)
            X.0mM r3 = r3.A09
            X.Vuu r0 = new X.Vuu
            r0.<init>(r12, r2)
        L_0x041f:
            r3.A01(r0)
            return
        L_0x0423:
            java.lang.String r8 = "dataFetcher"
        L_0x0425:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W7b.afterTextChanged(android.text.Editable):void");
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        String obj;
        switch (this.A00) {
            case 0:
                SearchView searchView = (SearchView) this.A01;
                Editable text = searchView.A0d.getText();
                searchView.A07 = text;
                boolean A1a = C13990Tnq.A1a(text);
                SearchView.A03(searchView, A1a);
                boolean z = !A1a;
                int i4 = 8;
                if (searchView.A0C && !searchView.A08 && z) {
                    searchView.A0a.setVisibility(8);
                    i4 = 0;
                }
                searchView.A0c.setVisibility(i4);
                SearchView.A01(searchView);
                SearchView.A02(searchView);
                if (searchView.A04 != null && !TextUtils.equals(charSequence, searchView.A06)) {
                    C74219Pr6 pr6 = searchView.A04;
                    String charSequence2 = charSequence.toString();
                    0qQ.A0B(charSequence2, 0);
                    C67685MsN msN = ((C71483OlY) pr6).A00.A01;
                    if (msN == null) {
                        DbS.A13();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    msN.getFilter().filter(charSequence2);
                }
                searchView.A06 = charSequence.toString();
                return;
            case 8:
                ((C19319WUb) this.A01).A0E = String.valueOf(charSequence);
                return;
            case 11:
                C14786U8w A02 = ((C15315UaN) this.A01).A02();
                if (charSequence == null || (obj = charSequence.toString()) == null || (str = DbV.A12(obj)) == null) {
                    str = "";
                }
                if (A02 instanceof C16045UnY) {
                    ((C16045UnY) A02).A04.A05 = str;
                    return;
                } else {
                    ((C16046UnZ) A02).A02.A1O = str;
                    return;
                }
            default:
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
