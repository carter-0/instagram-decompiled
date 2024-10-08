package com.instagram.feed.ui.text.linkifiedtext;

import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.OHN;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.feed.ui.text.linkifiedtext.LinkExtractor$extractEmailAndAddressesAsync$1", f = "LinkExtractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LinkExtractor$extractEmailAndAddressesAsync$1 extends AnonymousClass1Ek implements 0sP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ OHN A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkExtractor$extractEmailAndAddressesAsync$1(Context context, OHN ohn, String str, AnonymousClass4D7 r5) {
        super(1, r5);
        this.A02 = str;
        this.A00 = context;
        this.A01 = ohn;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.feed.ui.text.linkifiedtext.LinkExtractor$extractEmailAndAddressesAsync$1, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r5) {
        return new LinkExtractor$extractEmailAndAddressesAsync$1(this.A00, this.A01, this.A02, r5);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((LinkExtractor$extractEmailAndAddressesAsync$1) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x018f, code lost:
        if (r2 != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a1, code lost:
        if (r2 != false) goto L_0x01a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.0eS.A00(r15)
            java.lang.String r9 = r14.A02
            android.content.Context r7 = r14.A00
            X.OHN r4 = r14.A01
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.lang.String r6 = "address"
            r5.put(r6, r0)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.lang.String r3 = "email"
            r5.put(r3, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r11 = 0
            if (r1 >= r0) goto L_0x0081
            java.lang.String r10 = android.webkit.WebView.findAddress(r9)
            r8 = r9
        L_0x002b:
            if (r10 == 0) goto L_0x0058
            r0 = 0
            int r7 = X.00l.A08(r8, r10, r0, r0)
            int r11 = r11 + r7
            if (r11 < 0) goto L_0x0058
            int r2 = X.C51966G9m.A05(r10, r11)
            java.lang.Object r1 = r5.get(r6)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0049
            X.3uc r0 = new X.3uc
            r0.<init>(r11, r2, r10)
            r1.add(r0)
        L_0x0049:
            int r0 = r10.length()
            int r7 = r7 + r0
            java.lang.String r8 = X.C66580MXl.A0z(r8, r7)
            java.lang.String r10 = android.webkit.WebView.findAddress(r8)
            r11 = r2
            goto L_0x002b
        L_0x0058:
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r10 = r0.matcher(r9)
        L_0x005e:
            boolean r0 = r10.find()
            if (r0 == 0) goto L_0x0131
            int r8 = r10.start()
            int r7 = r10.end()
            java.lang.Object r2 = r5.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x005e
            java.lang.String r1 = X.C51967G9n.A0q(r9, r8, r7)
            X.3uc r0 = new X.3uc
            r0.<init>(r8, r7, r1)
            r2.add(r0)
            goto L_0x005e
        L_0x0081:
            android.view.textclassifier.TextLinks$Request$Builder r8 = new android.view.textclassifier.TextLinks$Request$Builder
            r8.<init>(r9)
            android.view.textclassifier.TextClassifier$EntityConfig$Builder r1 = new android.view.textclassifier.TextClassifier$EntityConfig$Builder
            r1.<init>()
            java.util.List r0 = X.C66581MXm.A11(r6, r3)
            android.view.textclassifier.TextClassifier$EntityConfig$Builder r2 = r1.setIncludedTypes(r0)
            java.lang.String r1 = "datetime"
            java.lang.String r0 = "phone"
            java.util.List r0 = X.C66581MXm.A11(r1, r0)
            android.view.textclassifier.TextClassifier$EntityConfig$Builder r0 = r2.setExcludedTypes(r0)
            android.view.textclassifier.TextClassifier$EntityConfig r0 = r0.build()
            android.view.textclassifier.TextLinks$Request$Builder r0 = r8.setEntityConfig(r0)
            android.view.textclassifier.TextLinks$Request r1 = r0.build()
            X.0qQ.A07(r1)
            java.lang.Class<android.view.textclassifier.TextClassificationManager> r0 = android.view.textclassifier.TextClassificationManager.class
            java.lang.Object r0 = r7.getSystemService(r0)
            android.view.textclassifier.TextClassificationManager r0 = (android.view.textclassifier.TextClassificationManager) r0
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
            android.view.textclassifier.TextLinks r0 = r0.generateLinks(r1)
            X.0qQ.A07(r0)
            java.util.Collection r0 = r0.getLinks()
            java.util.Iterator r12 = r0.iterator()
        L_0x00c9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r10 = r12.next()
            android.view.textclassifier.TextLinks$TextLink r10 = (android.view.textclassifier.TextLinks.TextLink) r10
            float r0 = r10.getConfidenceScore(r6)
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0104
            java.lang.Object r8 = r5.get(r6)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x0104
            int r7 = r10.getStart()
            int r2 = r10.getEnd()
            int r1 = r10.getStart()
            int r0 = r10.getEnd()
            java.lang.String r1 = X.C51967G9n.A0q(r9, r1, r0)
            X.3uc r0 = new X.3uc
            r0.<init>(r7, r2, r1)
            r8.add(r0)
        L_0x0104:
            float r0 = r10.getConfidenceScore(r3)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00c9
            java.lang.Object r8 = r5.get(r3)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x00c9
            int r7 = r10.getStart()
            int r2 = r10.getEnd()
            int r1 = r10.getStart()
            int r0 = r10.getEnd()
            java.lang.String r1 = X.C51967G9n.A0q(r9, r1, r0)
            X.3uc r0 = new X.3uc
            r0.<init>(r7, r2, r1)
            r8.add(r0)
            goto L_0x00c9
        L_0x0131:
            X.7LQ r1 = r4.A03
            com.instagram.common.session.UserSession r7 = r4.A01
            java.lang.String r9 = r4.A05
            boolean r13 = r4.A06
            X.3su r0 = r4.A04
            java.util.List r10 = r0.A0t()
            java.lang.Object r11 = r5.get(r6)
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r5.get(r3)
            java.util.List r12 = (java.util.List) r12
            X.9HO r8 = r4.A02
            X.5H7 r0 = X.C3270279b.A02(r7, r8, r9, r10, r11, r12, r13)
            r1.A0H = r0
            X.3su r3 = r1.A0e
            X.0qQ.A07(r3)
            r2 = 1
            java.lang.String r0 = r7.A06
            boolean r0 = X.AnonymousClass7F3.A01(r3, r0)
            if (r0 != 0) goto L_0x01ec
            X.5H7 r0 = r1.A0H
            if (r0 == 0) goto L_0x01ef
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x01ef
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r2) goto L_0x01ef
        L_0x016f:
            X.0Tu r0 = X.0Tu.A05
            r2 = 36324715970703641(0x810d2300003119, double:3.0352348755393633E-306)
            boolean r0 = X.182.A06(r0, r7, r2)
            if (r0 == 0) goto L_0x01ec
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_CUSTOMER_DETAILS
            r1.A0C = r0
            X.5H7 r2 = r1.A0H
            r0 = 0
            if (r2 == 0) goto L_0x0187
            java.util.List r0 = r2.A00
        L_0x0187:
            r4 = 0
            if (r0 == 0) goto L_0x0191
            boolean r2 = r0.isEmpty()
            r0 = 0
            if (r2 == 0) goto L_0x0192
        L_0x0191:
            r0 = 1
        L_0x0192:
            r3 = r0 ^ 1
            X.5H7 r0 = r1.A0H
            if (r0 == 0) goto L_0x01a3
            java.util.List r0 = r0.A07
            if (r0 == 0) goto L_0x01a3
            boolean r2 = r0.isEmpty()
            r0 = 0
            if (r2 == 0) goto L_0x01a4
        L_0x01a3:
            r0 = 1
        L_0x01a4:
            r2 = r0 ^ 1
            X.5H7 r0 = r1.A0H
            if (r0 == 0) goto L_0x01b4
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x01b4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b5
        L_0x01b4:
            r4 = 1
        L_0x01b5:
            r5 = r4 ^ 1
            X.7SD r0 = r1.A0G
            X.3t3 r0 = r0.A0P
            if (r0 == 0) goto L_0x01c7
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x01c7
            java.lang.String r4 = r0.A00
            if (r4 != 0) goto L_0x01c9
        L_0x01c7:
            java.lang.String r4 = ""
        L_0x01c9:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "has_address"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "has_phone_number"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "has_email"
            java.util.LinkedHashMap r1 = X.DbY.A0q(r0, r1, r3, r2)
            java.lang.String r0 = "customer_details_nux_impression"
            X.OZ3.A00(r7, r0, r4, r1)
        L_0x01ec:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x01ef:
            X.5H7 r0 = r1.A0H
            if (r0 == 0) goto L_0x01ff
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x01ff
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r2) goto L_0x01ff
            goto L_0x016f
        L_0x01ff:
            X.5H7 r0 = r1.A0H
            if (r0 == 0) goto L_0x01ec
            java.util.List r0 = r0.A07
            if (r0 == 0) goto L_0x01ec
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r2) goto L_0x01ec
            goto L_0x016f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.ui.text.linkifiedtext.LinkExtractor$extractEmailAndAddressesAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
