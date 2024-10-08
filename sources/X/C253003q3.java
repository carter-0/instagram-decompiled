package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3q3  reason: invalid class name and case insensitive filesystem */
public final class C253003q3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Context A07;
    public C70441O6s A08;
    public C253043q7 A09;
    public JOI A0A;
    public MSP A0B;
    public C253023q5 A0C;
    public C253023q5 A0D;
    public CountryCodeData A0E;
    public String A0F;
    public HashMap A0G;
    public HashSet A0H;
    public HashSet A0I;
    public Map A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public final SpannableStringBuilder A0i;
    public final UserSession A0j;
    public final AnonymousClass5H7 A0k;

    /* JADX WARNING: Removed duplicated region for block: B:152:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableStringBuilder A00() {
        /*
            r23 = this;
            r0 = r23
            boolean r1 = r0.A0g
            if (r1 == 0) goto L_0x00d4
            X.5H7 r1 = r0.A0k
            if (r1 == 0) goto L_0x005c
            java.util.List r3 = r1.A05
        L_0x000c:
            java.util.Iterator r8 = r3.iterator()
        L_0x0010:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0067
            java.lang.Object r6 = r8.next()
            X.3uc r6 = (X.C255723uc) r6
            boolean r1 = r0.A0f
            r5 = 33
            if (r1 == 0) goto L_0x0030
            android.text.SpannableStringBuilder r7 = r0.A0i
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            int r2 = r6.A01
            int r1 = r6.A00
            r7.setSpan(r4, r2, r1, r5)
        L_0x0030:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.String r4 = r6.A02
            java.lang.String r2 = "#"
            java.lang.String r1 = ""
            java.lang.String r11 = r4.replace(r2, r1)
            boolean r14 = r0.A0M
            int r13 = r0.A03
            java.lang.String r12 = r0.A0F
            X.3ud r9 = new X.3ud
            r9.<init>(r10, r11, r12, r13, r14)
            X.3q7 r2 = r0.A09
            if (r2 == 0) goto L_0x0052
            X.51f r1 = new X.51f
            r1.<init>(r2, r0)
            r9.A00 = r1
        L_0x0052:
            android.text.SpannableStringBuilder r4 = r0.A0i
            int r2 = r6.A01
            int r1 = r6.A00
            r4.setSpan(r9, r2, r1, r5)
            goto L_0x0010
        L_0x005c:
            android.text.SpannableStringBuilder r1 = r0.A0i
            java.lang.String r1 = r1.toString()
            java.util.ArrayList r3 = X.C253053q8.A03(r1)
            goto L_0x000c
        L_0x0067:
            com.instagram.common.session.UserSession r1 = r0.A0j
            X.3qB r6 = X.C253073qA.A00(r1)
            android.text.SpannableStringBuilder r5 = r0.A0i
            r1 = 0
            X.0qQ.A0B(r5, r1)
            java.util.Set r1 = r6.A00
            if (r1 != 0) goto L_0x007d
            java.util.HashSet r1 = r6.A00()
            r6.A00 = r1
        L_0x007d:
            java.util.Iterator r8 = r3.iterator()
        L_0x0081:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00d4
            java.lang.Object r7 = r8.next()
            X.3uc r7 = (X.C255723uc) r7
            java.util.Set r1 = r6.A00
            X.0qQ.A0A(r1)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0081
            java.util.Set r2 = r6.A00
            X.0qQ.A0A(r2)
            java.lang.String r3 = r7.A02
            java.util.Locale r1 = java.util.Locale.getDefault()
            X.0qQ.A07(r1)
            java.lang.String r1 = r3.toLowerCase(r1)
            X.0qQ.A07(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0081
            com.instagram.common.session.UserSession r1 = r6.A01
            boolean r1 = r6.A02(r1)
            if (r1 == 0) goto L_0x0081
            int[] r2 = X.AnonymousClass5BH.A00
            r1 = 0
            X.9Xd r4 = new X.9Xd
            r4.<init>(r3, r1, r2)
            r1 = 7
            r4.A01 = r1
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            r4.A02 = r1
            int r3 = r7.A01
            int r2 = r7.A00
            r1 = 33
            r5.setSpan(r4, r3, r2, r1)
            goto L_0x0081
        L_0x00d4:
            boolean r1 = r0.A0R
            if (r1 == 0) goto L_0x0144
            X.5H7 r1 = r0.A0k
            if (r1 == 0) goto L_0x0137
            java.util.List r1 = r1.A06
        L_0x00de:
            java.util.Iterator r8 = r1.iterator()
            r7 = 0
        L_0x00e3:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0144
            java.lang.Object r1 = r8.next()
            X.3uc r1 = (X.C255723uc) r1
            java.lang.String r4 = r1.A02
            int r6 = r1.A01
            int r5 = r1.A00
            java.util.HashSet r2 = r0.A0I
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0108
            java.lang.String r1 = "@"
            java.lang.String r1 = r4.replace(r1, r3)
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0108
            goto L_0x00e3
        L_0x0108:
            boolean r1 = r0.A0Q
            if (r1 == 0) goto L_0x0117
            int r6 = r6 - r7
            int r5 = r5 + -1
            int r5 = r5 - r7
            android.text.SpannableStringBuilder r2 = r0.A0i
            int r1 = r6 + 1
            r2.replace(r6, r1, r3)
        L_0x0117:
            boolean r1 = r0.A0d
            r4 = 33
            if (r1 == 0) goto L_0x0129
            android.text.SpannableStringBuilder r3 = r0.A0i
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            int r1 = r6 + 1
            r3.setSpan(r2, r1, r5, r4)
        L_0x0129:
            android.text.SpannableStringBuilder r3 = r0.A0i
            r2 = 1
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r2)
            r3.setSpan(r1, r6, r5, r4)
            int r7 = r7 + 1
            goto L_0x00e3
        L_0x0137:
            android.text.SpannableStringBuilder r1 = r0.A0i
            java.lang.String r2 = r1.toString()
            boolean r1 = r0.A0Y
            java.util.ArrayList r1 = X.C253053q8.A05(r2, r1)
            goto L_0x00de
        L_0x0144:
            boolean r1 = r0.A0X
            if (r1 == 0) goto L_0x01ce
            X.5H7 r1 = r0.A0k
            if (r1 == 0) goto L_0x01c1
            java.util.List r1 = r1.A06
        L_0x014e:
            java.util.Iterator r11 = r1.iterator()
            r10 = 0
        L_0x0153:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x01ce
            java.lang.Object r1 = r11.next()
            X.3uc r1 = (X.C255723uc) r1
            java.lang.String r9 = r1.A02
            int r6 = r1.A01
            int r5 = r1.A00
            java.util.HashSet r2 = r0.A0I
            java.lang.String r8 = "@"
            java.lang.String r7 = ""
            if (r2 == 0) goto L_0x0178
            java.lang.String r1 = r9.replace(r8, r7)
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0178
            goto L_0x0153
        L_0x0178:
            boolean r1 = r0.A0Q
            if (r1 == 0) goto L_0x0187
            int r6 = r6 - r10
            int r5 = r5 + -1
            int r5 = r5 - r10
            android.text.SpannableStringBuilder r2 = r0.A0i
            int r1 = r6 + 1
            r2.replace(r6, r1, r7)
        L_0x0187:
            boolean r1 = r0.A0d
            r4 = 33
            if (r1 == 0) goto L_0x0199
            android.text.SpannableStringBuilder r3 = r0.A0i
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            int r1 = r6 + 1
            r3.setSpan(r2, r1, r5, r4)
        L_0x0199:
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            java.lang.String r14 = r9.replace(r8, r7)
            boolean r2 = r0.A0L
            int r1 = r0.A01
            java.lang.String r15 = r0.A0F
            X.3ud r12 = new X.3ud
            r17 = r2
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            X.3q5 r2 = r0.A0D
            if (r2 == 0) goto L_0x01b9
            X.47C r1 = new X.47C
            r1.<init>(r0, r2)
            r12.A00 = r1
        L_0x01b9:
            android.text.SpannableStringBuilder r1 = r0.A0i
            r1.setSpan(r12, r6, r5, r4)
            int r10 = r10 + 1
            goto L_0x0153
        L_0x01c1:
            android.text.SpannableStringBuilder r1 = r0.A0i
            java.lang.String r2 = r1.toString()
            boolean r1 = r0.A0Y
            java.util.ArrayList r1 = X.C253053q8.A05(r2, r1)
            goto L_0x014e
        L_0x01ce:
            boolean r1 = r0.A0W
            if (r1 == 0) goto L_0x02dd
            java.util.Map r1 = r0.A0J
            if (r1 == 0) goto L_0x02dd
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x02dd
            r12 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Map r1 = r0.A0J
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r4 = r1.iterator()
        L_0x01f1:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x021c
            java.lang.Object r3 = r4.next()
            java.util.Map r1 = r0.A0J
            java.lang.Object r2 = r1.get(r3)
            X.DTg r2 = (X.C46277DTg) r2
            if (r2 == 0) goto L_0x01f1
            int r1 = r2.getOffset()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            int r1 = r2.getOffset()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.put(r1, r3)
            goto L_0x01f1
        L_0x021c:
            java.util.Collections.sort(r5)
            java.util.Iterator r11 = r5.iterator()
        L_0x0223:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x02dd
            java.lang.Object r1 = r11.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r6 = r1.intValue()
            java.lang.Object r15 = r7.get(r1)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x0223
            java.lang.String r1 = " "
            int r2 = r1.length()
            java.lang.String r1 = "❏"
            int r8 = r1.length()
            int r2 = r2 + r8
            int r2 = r2 * r12
            int r6 = r6 + r2
            int r2 = r15.length()
            int r2 = r2 + r6
            android.text.SpannableStringBuilder r5 = r0.A0i
            int r1 = r5.length()
            int r2 = java.lang.Math.min(r2, r1)
            if (r6 > r2) goto L_0x0223
            int r1 = r5.length()
            if (r6 > r1) goto L_0x0223
            int r1 = r5.length()
            if (r2 > r1) goto L_0x0223
            java.lang.String r1 = "❏ "
            java.lang.String r1 = X.002.A0R(r1, r15)
            r5.replace(r6, r2, r1)
            if (r1 == 0) goto L_0x02db
            int r4 = r1.length()
        L_0x0276:
            int r4 = r4 + r6
            android.content.Context r2 = r0.A07
            if (r2 == 0) goto L_0x02b4
            r1 = 2131238293(0x7f081d95, float:1.809286E38)
            android.graphics.drawable.Drawable r9 = r2.getDrawable(r1)
            if (r9 == 0) goto L_0x02b4
            android.content.Context r1 = r0.A07
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131165216(0x7f070020, float:1.7944643E38)
            float r1 = r2.getDimension(r1)
            int r10 = (int) r1
            r2 = 0
            int r1 = r10 + 2
            r3 = 2
            r9.setBounds(r2, r3, r10, r1)
            android.graphics.drawable.Drawable r2 = r9.mutate()
            int r1 = r0.A01
            r2.setTint(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r2 >= r1) goto L_0x02a9
            r3 = 1
        L_0x02a9:
            android.text.style.ImageSpan r2 = new android.text.style.ImageSpan
            r2.<init>(r9, r3)
            int r8 = r8 + r6
            r1 = 18
            r5.setSpan(r2, r6, r8, r1)
        L_0x02b4:
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            boolean r3 = r0.A0L
            int r2 = r0.A01
            java.lang.String r1 = r0.A0F
            X.3ud r13 = new X.3ud
            r17 = r2
            r18 = r3
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            X.3q5 r2 = r0.A0C
            if (r2 == 0) goto L_0x02d2
            X.PGF r1 = new X.PGF
            r1.<init>(r0, r2)
            r13.A00 = r1
        L_0x02d2:
            r1 = 33
            r5.setSpan(r13, r6, r4, r1)
            int r12 = r12 + 1
            goto L_0x0223
        L_0x02db:
            r4 = 0
            goto L_0x0276
        L_0x02dd:
            boolean r1 = r0.A0h
            if (r1 == 0) goto L_0x03f5
            android.text.SpannableStringBuilder r7 = r0.A0i
            java.lang.String r1 = r7.toString()
            java.util.ArrayList r1 = X.C253053q8.A04(r1)
            java.util.Iterator r16 = r1.iterator()
            r15 = 0
        L_0x02f0:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x03f5
            java.lang.Object r3 = r16.next()
            X.3uc r3 = (X.C255723uc) r3
            java.lang.String r11 = r3.A02
            r9 = 3
            java.lang.String r2 = r11.substring(r9)
            java.util.HashMap r1 = r0.A0G
            if (r1 == 0) goto L_0x02f0
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x02f0
            java.util.HashMap r1 = r0.A0G
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r10 = r1.intValue()
            r1 = -1
            if (r10 == r1) goto L_0x02f0
            int r1 = r10 + 1
            java.lang.String r2 = java.lang.Integer.toString(r1)
            java.lang.String r1 = "❏ "
            java.lang.String r8 = X.002.A0R(r1, r2)
            int r6 = r3.A01
            int r2 = r6 - r15
            int r5 = r3.A00
            int r1 = r5 - r15
            r7.replace(r2, r1, r8)
            java.lang.String r2 = r11.substring(r9)
            java.util.HashSet r1 = r0.A0H
            if (r1 == 0) goto L_0x03f2
            boolean r1 = r1.contains(r2)
        L_0x033f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r14 = r1.booleanValue()
            java.lang.String r13 = "❏"
            android.content.Context r2 = r0.A07
            if (r2 == 0) goto L_0x0394
            r1 = 2131238054(0x7f081ca6, float:1.8092376E38)
            if (r14 == 0) goto L_0x0355
            r1 = 2131238048(0x7f081ca0, float:1.8092364E38)
        L_0x0355:
            android.graphics.drawable.Drawable r12 = r2.getDrawable(r1)
            if (r12 == 0) goto L_0x0394
            android.content.Context r1 = r0.A07
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131165216(0x7f070020, float:1.7944643E38)
            float r1 = r2.getDimension(r1)
            int r4 = (int) r1
            r2 = 0
            int r1 = r4 + 2
            r3 = 2
            r12.setBounds(r2, r3, r4, r1)
            if (r14 == 0) goto L_0x03ef
            int r2 = r0.A02
        L_0x0374:
            android.graphics.drawable.Drawable r1 = r12.mutate()
            r1.setTint(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r2 >= r1) goto L_0x0382
            r3 = 1
        L_0x0382:
            android.text.style.ImageSpan r4 = new android.text.style.ImageSpan
            r4.<init>(r12, r3)
            int r3 = r6 - r15
            int r1 = r13.length()
            int r2 = r3 + r1
            r1 = 18
            r7.setSpan(r4, r3, r2, r1)
        L_0x0394:
            java.lang.String r9 = r11.substring(r9)
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
            java.lang.String r19 = java.lang.Integer.toString(r10)
            boolean r3 = r0.A0L
            if (r14 == 0) goto L_0x03ec
            int r2 = r0.A02
        L_0x03a4:
            java.lang.String r1 = r0.A0F
            X.3ud r4 = new X.3ud
            r17 = r4
            r20 = r1
            r21 = r2
            r22 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            if (r14 != 0) goto L_0x03e2
            X.JOI r2 = r0.A0A
            if (r2 == 0) goto L_0x03c4
            boolean r1 = r0.A0c
            if (r1 != 0) goto L_0x03c4
            X.IUo r1 = new X.IUo
            r1.<init>(r2, r9)
        L_0x03c2:
            r4.A00 = r1
        L_0x03c4:
            int r3 = r6 - r15
            if (r8 == 0) goto L_0x03e0
            int r1 = r8.length()
        L_0x03cc:
            int r2 = r3 + r1
            r1 = 33
            r7.setSpan(r4, r3, r2, r1)
            int r5 = r5 - r6
            if (r8 == 0) goto L_0x03de
            int r1 = r8.length()
        L_0x03da:
            int r5 = r5 - r1
            int r15 = r15 + r5
            goto L_0x02f0
        L_0x03de:
            r1 = 0
            goto L_0x03da
        L_0x03e0:
            r1 = 0
            goto L_0x03cc
        L_0x03e2:
            android.content.Context r1 = r0.A07
            if (r1 == 0) goto L_0x03c4
            X.PGB r1 = new X.PGB
            r1.<init>(r0)
            goto L_0x03c2
        L_0x03ec:
            int r2 = r0.A01
            goto L_0x03a4
        L_0x03ef:
            int r2 = r0.A01
            goto L_0x0374
        L_0x03f2:
            r1 = 0
            goto L_0x033f
        L_0x03f5:
            boolean r1 = r0.A0V
            if (r1 == 0) goto L_0x0441
            android.content.Context r1 = r0.A07
            if (r1 == 0) goto L_0x0441
            X.5H7 r1 = r0.A0k
            if (r1 == 0) goto L_0x0434
            java.util.List r1 = r1.A02
        L_0x0403:
            java.util.Iterator r8 = r1.iterator()
        L_0x0407:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0441
            java.lang.Object r1 = r8.next()
            X.3uc r1 = (X.C255723uc) r1
            java.lang.String r3 = r1.A02
            int r7 = r1.A01
            int r6 = r1.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            java.lang.String r2 = "/"
            java.lang.String r1 = ""
            java.lang.String r4 = r3.replace(r2, r1)
            boolean r2 = r0.A0P
            int r1 = r0.A06
            X.3ud r3 = new X.3ud
            r3.<init>(r5, r4, r1, r2)
            android.text.SpannableStringBuilder r2 = r0.A0i
            r1 = 33
            r2.setSpan(r3, r7, r6, r1)
            goto L_0x0407
        L_0x0434:
            android.text.SpannableStringBuilder r1 = r0.A0i
            java.lang.String r2 = r1.toString()
            r1 = 0
            X.0qQ.A0B(r2, r1)
            X.0sn r1 = X.0sn.A00
            goto L_0x0403
        L_0x0441:
            boolean r1 = r0.A0a
            if (r1 == 0) goto L_0x047f
            X.5H7 r1 = r0.A0k
            if (r1 == 0) goto L_0x0474
            java.util.List r1 = r1.A08
        L_0x044b:
            java.util.Iterator r7 = r1.iterator()
        L_0x044f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x047f
            java.lang.Object r6 = r7.next()
            X.3uc r6 = (X.C255723uc) r6
            java.lang.Integer r4 = X.AnonymousClass05K.A0u
            java.lang.String r3 = r6.A02
            boolean r2 = r0.A0N
            int r1 = r0.A04
            X.3ud r5 = new X.3ud
            r5.<init>(r4, r3, r1, r2)
            android.text.SpannableStringBuilder r4 = r0.A0i
            int r3 = r6.A01
            int r2 = r6.A00
            r1 = 33
            r4.setSpan(r5, r3, r2, r1)
            goto L_0x044f
        L_0x0474:
            android.text.SpannableStringBuilder r1 = r0.A0i
            java.lang.String r1 = r1.toString()
            java.util.List r1 = X.C253053q8.A07(r1)
            goto L_0x044b
        L_0x047f:
            boolean r1 = r0.A0U
            if (r1 == 0) goto L_0x0556
            android.text.SpannableStringBuilder r6 = r0.A0i
            java.lang.String r8 = r6.toString()
            r1 = 94
            int r1 = r8.indexOf(r1)
            r2 = -1
            if (r1 == r2) goto L_0x0556
            r5 = 61
            int r1 = r8.indexOf(r5)
            if (r1 == r2) goto L_0x0556
            X.5H7 r1 = r0.A0k
            if (r1 == 0) goto L_0x04fe
            java.util.List r1 = r1.A01
        L_0x04a0:
            r13 = 0
            java.util.Iterator r12 = r1.iterator()
        L_0x04a5:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0556
            java.lang.Object r9 = r12.next()
            X.3uc r9 = (X.C255723uc) r9
            java.lang.String r11 = r9.A02
            int r10 = r11.indexOf(r5)
            int r2 = r10 + 1
            int r1 = r11.length()
            r4 = 1
            int r1 = r1 - r4
            java.lang.String r8 = r11.substring(r2, r1)
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            boolean r2 = r0.A0N
            int r1 = r0.A04
            X.3ud r7 = new X.3ud
            r7.<init>(r3, r8, r1, r2)
            X.PGC r1 = new X.PGC
            r1.<init>(r0)
            r7.A00 = r1
            java.lang.String r4 = r11.substring(r4, r10)
            int r3 = r9.A01
            int r2 = r3 - r13
            int r1 = r9.A00
            int r1 = r1 - r13
            r6.replace(r2, r1, r4)
            if (r4 == 0) goto L_0x04fc
            int r1 = r4.length()
        L_0x04e9:
            int r3 = r3 + r1
            int r3 = r3 - r13
            r1 = 33
            r6.setSpan(r7, r2, r3, r1)
            if (r8 == 0) goto L_0x04fa
            int r1 = r8.length()
        L_0x04f6:
            int r1 = r1 + 3
            int r13 = r13 + r1
            goto L_0x04a5
        L_0x04fa:
            r1 = 0
            goto L_0x04f6
        L_0x04fc:
            r1 = 0
            goto L_0x04e9
        L_0x04fe:
            int r1 = r8.length()
            if (r1 != 0) goto L_0x0507
            X.0sn r1 = X.0sn.A00
            goto L_0x04a0
        L_0x0507:
            java.util.regex.Pattern r1 = X.0mp.A03
            java.util.regex.Pattern r1 = android.util.Patterns.WEB_URL
            java.lang.String r1 = r1.pattern()
            X.0qQ.A07(r1)
            java.lang.String r7 = "(\\^[^\\^=]+="
            java.lang.String r4 = "/?\\^)"
            java.lang.String r1 = X.002.A0g(r7, r1, r4)
            r3 = 2
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r3)
            X.0qQ.A07(r1)
            java.util.regex.Matcher r1 = r1.matcher(r8)
            X.0qQ.A07(r1)
            java.util.ArrayList r2 = X.C253053q8.A06(r1)
            java.lang.String r1 = "instagram://.*"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.lang.String r1 = r1.pattern()
            X.0qQ.A07(r1)
            java.lang.String r1 = X.002.A0g(r7, r1, r4)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r3)
            X.0qQ.A07(r1)
            java.util.regex.Matcher r1 = r1.matcher(r8)
            X.0qQ.A07(r1)
            java.util.ArrayList r1 = X.C253053q8.A06(r1)
            java.util.ArrayList r1 = X.00k.A0S(r1, r2)
            goto L_0x04a0
        L_0x0556:
            boolean r1 = r0.A0Z
            if (r1 == 0) goto L_0x05ae
            X.5H7 r1 = r0.A0k
            if (r1 == 0) goto L_0x0589
            java.util.List r1 = r1.A07
        L_0x0560:
            java.util.Iterator r7 = r1.iterator()
        L_0x0564:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x05ae
            java.lang.Object r6 = r7.next()
            X.3uc r6 = (X.C255723uc) r6
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            java.lang.String r3 = r6.A02
            boolean r2 = r0.A0O
            int r1 = r0.A05
            X.3ud r5 = new X.3ud
            r5.<init>(r4, r3, r1, r2)
            android.text.SpannableStringBuilder r4 = r0.A0i
            int r3 = r6.A01
            int r2 = r6.A00
            r1 = 33
            r4.setSpan(r5, r3, r2, r1)
            goto L_0x0564
        L_0x0589:
            com.instagram.phonenumber.model.CountryCodeData r3 = r0.A0E
            if (r3 != 0) goto L_0x05a1
            android.text.SpannableStringBuilder r1 = r0.A0i
            java.lang.String r3 = r1.toString()
            android.content.Context r2 = X.C60960kU.A00
            X.0qQ.A07(r2)
            com.instagram.phonenumber.model.CountryCodeData r1 = X.C3270479e.A00(r2)
            java.util.ArrayList r1 = X.C253053q8.A00(r2, r1, r3)
            goto L_0x0560
        L_0x05a1:
            android.content.Context r2 = X.C60960kU.A00
            android.text.SpannableStringBuilder r1 = r0.A0i
            java.lang.String r1 = r1.toString()
            java.util.ArrayList r1 = X.C253053q8.A00(r2, r3, r1)
            goto L_0x0560
        L_0x05ae:
            boolean r1 = r0.A0T
            if (r1 == 0) goto L_0x05f2
            X.5H7 r1 = r0.A0k     // Catch:{ Exception -> 0x05ec }
            if (r1 == 0) goto L_0x05e1
            java.util.List r1 = r1.A00     // Catch:{ Exception -> 0x05ec }
        L_0x05b8:
            java.util.Iterator r7 = r1.iterator()     // Catch:{ Exception -> 0x05ec }
        L_0x05bc:
            boolean r1 = r7.hasNext()     // Catch:{ Exception -> 0x05ec }
            if (r1 == 0) goto L_0x05f2
            java.lang.Object r6 = r7.next()     // Catch:{ Exception -> 0x05ec }
            X.3uc r6 = (X.C255723uc) r6     // Catch:{ Exception -> 0x05ec }
            java.lang.Integer r4 = X.AnonymousClass05K.A0j     // Catch:{ Exception -> 0x05ec }
            java.lang.String r3 = r6.A02     // Catch:{ Exception -> 0x05ec }
            boolean r2 = r0.A0K     // Catch:{ Exception -> 0x05ec }
            int r1 = r0.A00     // Catch:{ Exception -> 0x05ec }
            X.3ud r5 = new X.3ud     // Catch:{ Exception -> 0x05ec }
            r5.<init>(r4, r3, r1, r2)     // Catch:{ Exception -> 0x05ec }
            android.text.SpannableStringBuilder r4 = r0.A0i     // Catch:{ Exception -> 0x05ec }
            int r3 = r6.A01     // Catch:{ Exception -> 0x05ec }
            int r2 = r6.A00     // Catch:{ Exception -> 0x05ec }
            r1 = 33
            r4.setSpan(r5, r3, r2, r1)     // Catch:{ Exception -> 0x05ec }
            goto L_0x05bc
        L_0x05e1:
            android.text.SpannableStringBuilder r1 = r0.A0i     // Catch:{ Exception -> 0x05ec }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05ec }
            java.util.ArrayList r1 = X.C253053q8.A02(r1)     // Catch:{ Exception -> 0x05ec }
            goto L_0x05b8
        L_0x05ec:
            r2 = move-exception
            boolean r1 = r0.A0S
            if (r1 != 0) goto L_0x05f2
            throw r2
        L_0x05f2:
            boolean r1 = r0.A0e
            if (r1 == 0) goto L_0x065f
            X.5H7 r2 = r0.A0k
            if (r2 == 0) goto L_0x065f
            java.util.List r1 = r2.A04
            java.util.List r8 = r2.A00
            java.util.List r7 = r2.A07
            java.util.Iterator r5 = r1.iterator()
        L_0x0604:
            boolean r1 = r5.hasNext()
            r6 = 33
            if (r1 == 0) goto L_0x0621
            java.lang.Object r1 = r5.next()
            X.3uc r1 = (X.C255723uc) r1
            android.text.SpannableStringBuilder r4 = r0.A0i
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            int r2 = r1.A01
            int r1 = r1.A00
            r4.setSpan(r3, r2, r1, r6)
            goto L_0x0604
        L_0x0621:
            java.util.Iterator r5 = r8.iterator()
        L_0x0625:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0640
            java.lang.Object r1 = r5.next()
            X.3uc r1 = (X.C255723uc) r1
            android.text.SpannableStringBuilder r4 = r0.A0i
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            int r2 = r1.A01
            int r1 = r1.A00
            r4.setSpan(r3, r2, r1, r6)
            goto L_0x0625
        L_0x0640:
            java.util.Iterator r5 = r7.iterator()
        L_0x0644:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x065f
            java.lang.Object r1 = r5.next()
            X.3uc r1 = (X.C255723uc) r1
            android.text.SpannableStringBuilder r4 = r0.A0i
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            int r2 = r1.A01
            int r1 = r1.A00
            r4.setSpan(r3, r2, r1, r6)
            goto L_0x0644
        L_0x065f:
            boolean r1 = r0.A0b
            if (r1 == 0) goto L_0x069c
            android.text.SpannableStringBuilder r10 = r0.A0i
            int r2 = r10.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r9 = 0
            java.lang.Object[] r8 = r10.getSpans(r9, r2, r1)
            android.text.style.URLSpan[] r8 = (android.text.style.URLSpan[]) r8
            int r7 = r8.length
        L_0x0673:
            if (r9 >= r7) goto L_0x069c
            r1 = r8[r9]
            int r6 = r10.getSpanStart(r1)
            int r5 = r10.getSpanEnd(r1)
            int r4 = r10.getSpanFlags(r1)
            r10.removeSpan(r1)
            java.lang.String r3 = r1.getURL()
            java.lang.String r2 = ""
            java.util.regex.Pattern r1 = X.0mp.A03
            if (r3 != 0) goto L_0x0691
            r3 = r2
        L_0x0691:
            com.instagram.feed.ui.text.linkifiedtext.LinkifiedTextBuilder$8 r1 = new com.instagram.feed.ui.text.linkifiedtext.LinkifiedTextBuilder$8
            r1.<init>(r0, r3)
            r10.setSpan(r1, r6, r5, r4)
            int r9 = r9 + 1
            goto L_0x0673
        L_0x069c:
            android.text.SpannableStringBuilder r0 = r0.A0i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C253003q3.A00():android.text.SpannableStringBuilder");
    }

    public final void A02(C253043q7 r2) {
        this.A09 = r2;
        this.A0g = true;
    }

    public final void A03(C253023q5 r2) {
        this.A0D = r2;
        this.A0X = true;
    }

    public C253003q3(SpannableStringBuilder spannableStringBuilder, UserSession userSession, AnonymousClass5H7 r4) {
        this.A0L = false;
        this.A0M = false;
        this.A0f = false;
        this.A0d = false;
        this.A0e = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0K = false;
        this.A0Q = false;
        this.A0g = false;
        this.A0X = false;
        this.A0R = false;
        this.A0W = false;
        this.A0h = false;
        this.A0V = false;
        this.A0Y = false;
        this.A0a = false;
        this.A0U = false;
        this.A0Z = false;
        this.A0T = false;
        this.A0S = false;
        this.A0b = false;
        this.A0c = false;
        this.A01 = 0;
        this.A06 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A02 = 0;
        this.A0F = "";
        this.A0G = null;
        this.A0H = null;
        this.A0i = spannableStringBuilder;
        this.A0j = userSession;
        this.A0k = r4;
    }

    public final void A01(Context context, JOI joi, List list) {
        this.A07 = context.getApplicationContext();
        this.A0A = joi;
        this.A0h = true;
        if (list != null) {
            this.A0G = new HashMap(list.size());
            this.A0H = new HashSet(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DT9 dt9 = (DT9) it.next();
                this.A0G.put(dt9.BRi(), Integer.valueOf(dt9.Alm()));
                if (dt9.CQ7()) {
                    this.A0H.add(dt9.BRi());
                }
            }
        }
    }

    public C253003q3(SpannableStringBuilder spannableStringBuilder, UserSession userSession) {
        this(spannableStringBuilder, userSession, (AnonymousClass5H7) null);
    }
}
