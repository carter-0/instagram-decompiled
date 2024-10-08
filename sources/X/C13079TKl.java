package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.TKl  reason: case insensitive filesystem */
public final class C13079TKl implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C11252SHm A01;
    public final /* synthetic */ C11288SJh A02;
    public final /* synthetic */ C270254gR A03;
    public final /* synthetic */ QC2 A04;
    public final /* synthetic */ RRP A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.RRP, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        if (r10.A00.A04.A0A(false) == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x018c, code lost:
        if (r6 != false) goto L_0x018e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r2 = 0
            r16 = 0
            r3 = r34
            X.SHm r1 = r3.A01     // Catch:{ Exception -> 0x02c8 }
            java.util.List r13 = r1.A04     // Catch:{ Exception -> 0x02c8 }
            X.TLo r0 = new X.TLo     // Catch:{ Exception -> 0x02c8 }
            r0.<init>()     // Catch:{ Exception -> 0x02c8 }
            java.util.Collections.sort(r13, r0)     // Catch:{ Exception -> 0x02c8 }
            boolean r0 = r13.isEmpty()     // Catch:{ Exception -> 0x02c8 }
            if (r0 == 0) goto L_0x001a
            r4 = r16
            goto L_0x0020
        L_0x001a:
            java.lang.Object r4 = r13.get(r2)     // Catch:{ Exception -> 0x02c8 }
            X.Rx6 r4 = (X.C10728Rx6) r4     // Catch:{ Exception -> 0x02c8 }
        L_0x0020:
            java.lang.Integer r7 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x02c8 }
            if (r4 != 0) goto L_0x0042
            X.QC2 r0 = r3.A04     // Catch:{ Exception -> 0x02c8 }
            r1.A00 = r0     // Catch:{ Exception -> 0x02c8 }
            X.RRP r0 = r3.A05     // Catch:{ Exception -> 0x02c8 }
            r1.A01 = r0     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r9 = r3.A07     // Catch:{ Exception -> 0x02c8 }
            r11 = r7
        L_0x002f:
            android.content.Context r4 = r3.A00     // Catch:{ Exception -> 0x02c8 }
            java.util.List r0 = r3.A08     // Catch:{ Exception -> 0x02c8 }
            r33 = r0
            X.SJh r10 = r3.A02     // Catch:{ Exception -> 0x02c8 }
            java.lang.Integer r5 = r3.A06     // Catch:{ Exception -> 0x02c8 }
            X.4gR r8 = r3.A03     // Catch:{ Exception -> 0x02c8 }
            java.lang.ref.WeakReference r0 = r1.A06     // Catch:{ Exception -> 0x02c8 }
            X.QKv r0 = X.Pxe.A0Q(r0)     // Catch:{ Exception -> 0x02c8 }
            goto L_0x004f
        L_0x0042:
            X.QC2 r0 = r4.A01     // Catch:{ Exception -> 0x02c8 }
            r1.A00 = r0     // Catch:{ Exception -> 0x02c8 }
            X.RRP r0 = r4.A02     // Catch:{ Exception -> 0x02c8 }
            r1.A01 = r0     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r9 = r4.A04     // Catch:{ Exception -> 0x02c8 }
            java.lang.Integer r11 = r4.A03     // Catch:{ Exception -> 0x02c8 }
            goto L_0x002f
        L_0x004f:
            r6 = 0
            r12 = 772805755(0x2e10147b, float:3.276E-11)
            if (r0 != 0) goto L_0x0061
            java.lang.String r1 = "prompt_name"
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            r10.A03(r5, r1, r0, r12)     // Catch:{ Exception -> 0x02c8 }
            r10.A01(r5, r6, r12)     // Catch:{ Exception -> 0x02c8 }
            return
        L_0x0061:
            if (r4 == 0) goto L_0x0078
            java.lang.String r14 = "input_method"
            java.lang.Object r15 = r4.getSystemService(r14)     // Catch:{ Exception -> 0x02c8 }
            android.view.inputmethod.InputMethodManager r15 = (android.view.inputmethod.InputMethodManager) r15     // Catch:{ Exception -> 0x02c8 }
            android.view.View r14 = r0.A02     // Catch:{ Exception -> 0x02c8 }
            if (r15 == 0) goto L_0x0078
            if (r14 == 0) goto L_0x0078
            android.os.IBinder r14 = r14.getWindowToken()     // Catch:{ Exception -> 0x02c8 }
            r15.hideSoftInputFromWindow(r14, r2)     // Catch:{ Exception -> 0x02c8 }
        L_0x0078:
            X.QC2 r14 = r1.A00     // Catch:{ Exception -> 0x02c8 }
            if (r14 == 0) goto L_0x0101
            X.7ka r14 = r0.A03     // Catch:{ Exception -> 0x02c8 }
            if (r14 == 0) goto L_0x0101
            r14.getParentFragmentManager()     // Catch:{ Exception -> 0x02c8 }
            X.QC2 r6 = r1.A00     // Catch:{ Exception -> 0x02c8 }
            X.SlI r4 = new X.SlI     // Catch:{ Exception -> 0x02c8 }
            r4.<init>(r1, r10, r5)     // Catch:{ Exception -> 0x02c8 }
            r6.A00 = r4     // Catch:{ Exception -> 0x02c8 }
            X.RzL r10 = r8.A00     // Catch:{ Exception -> 0x02c8 }
            r4 = 3
            X.JwM r6 = new X.JwM     // Catch:{ Exception -> 0x02c8 }
            r6.<init>((java.lang.Integer) r7, (java.lang.Integer) r11, (java.lang.Integer) r7, (int) r4)     // Catch:{ Exception -> 0x02c8 }
            java.lang.Integer r5 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x02c8 }
            X.JVf r4 = new X.JVf     // Catch:{ Exception -> 0x02c8 }
            r4.<init>((X.C61084JwM) r6, (java.lang.Integer) r5)     // Catch:{ Exception -> 0x02c8 }
            X.RUI.A00(r10, r4)     // Catch:{ Exception -> 0x02c8 }
            X.S5u r10 = r0.A09     // Catch:{ Exception -> 0x02c8 }
            X.QC2 r4 = r1.A00     // Catch:{ Exception -> 0x02c8 }
            boolean r4 = r4 instanceof X.QKC     // Catch:{ Exception -> 0x02c8 }
            if (r4 == 0) goto L_0x00bb
            if (r10 == 0) goto L_0x00bb
            boolean r4 = r10.A02()     // Catch:{ Exception -> 0x02c8 }
            if (r4 == 0) goto L_0x00bb
            X.RRP r4 = r1.A01     // Catch:{ Exception -> 0x02c8 }
            r0.A0D(r4)     // Catch:{ Exception -> 0x02c8 }
            X.RRP r0 = r1.A01     // Catch:{ Exception -> 0x02c8 }
            r10.A00(r0)     // Catch:{ Exception -> 0x02c8 }
            r1.A05 = r2     // Catch:{ Exception -> 0x02c8 }
            return
        L_0x00bb:
            X.QC2 r5 = r1.A00     // Catch:{ Exception -> 0x02c8 }
            X.7ka r4 = r0.A03     // Catch:{ Exception -> 0x02c8 }
            if (r4 == 0) goto L_0x00d3
            X.0hq r4 = r4.getParentFragmentManager()     // Catch:{ Exception -> 0x02c8 }
        L_0x00c5:
            r5.A0B(r4, r9)     // Catch:{ Exception -> 0x02c8 }
            X.RRP r7 = r1.A01     // Catch:{ Exception -> 0x02c8 }
            if (r7 == 0) goto L_0x010e
            X.QC2 r4 = r1.A00     // Catch:{ Exception -> 0x02c8 }
            boolean r4 = r4 instanceof X.QKC     // Catch:{ Exception -> 0x02c8 }
            if (r4 == 0) goto L_0x00fb
            goto L_0x00d5
        L_0x00d3:
            r4 = 0
            goto L_0x00c5
        L_0x00d5:
            if (r10 == 0) goto L_0x00fb
            java.lang.String r6 = "shown_automatic_autofill_consent"
            com.instagram.common.session.UserSession r4 = r10.A01     // Catch:{ Exception -> 0x02c8 }
            X.0xa r5 = X.AnonymousClass7TE.A0q(r4)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r4 = "contact_autofill_eligible_for_automatic_autofill"
            boolean r4 = r5.getBoolean(r4, r2)     // Catch:{ Exception -> 0x02c8 }
            if (r4 != 0) goto L_0x00f3
            X.4gR r4 = r10.A00     // Catch:{ Exception -> 0x02c8 }
            X.1yd r4 = r4.A04     // Catch:{ Exception -> 0x02c8 }
            boolean r5 = r4.A0A(r2)     // Catch:{ Exception -> 0x02c8 }
            r4 = 1
            if (r5 != 0) goto L_0x00f4
        L_0x00f3:
            r4 = 0
        L_0x00f4:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x02c8 }
            r7.A01(r6, r4)     // Catch:{ Exception -> 0x02c8 }
        L_0x00fb:
            X.RRP r1 = r1.A01     // Catch:{ Exception -> 0x02c8 }
            X.SUR.A0B(r8, r0, r1)     // Catch:{ Exception -> 0x02c8 }
            goto L_0x010e
        L_0x0101:
            java.lang.String r8 = "prompt_type"
            r10.A03(r5, r8, r9, r12)     // Catch:{ Exception -> 0x02c8 }
            int r8 = r9.hashCode()     // Catch:{ Exception -> 0x02c8 }
            switch(r8) {
                case -1459274090: goto L_0x01d5;
                case 161743991: goto L_0x01d2;
                case 2021963056: goto L_0x0147;
                default: goto L_0x010e;
            }     // Catch:{ Exception -> 0x02c8 }
        L_0x010e:
            int r8 = r13.size()     // Catch:{ Exception -> 0x02c8 }
            X.4gR r1 = r0.A0b     // Catch:{ Exception -> 0x02c8 }
            X.RzL r1 = r1.A00     // Catch:{ Exception -> 0x02c8 }
            X.Jvc r1 = r1.A0P     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r7 = r1.A02     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r1 = r1.A03     // Catch:{ Exception -> 0x02c8 }
            android.os.Bundle r6 = r0.A02()     // Catch:{ Exception -> 0x02c8 }
            X.0qQ.A0B(r7, r2)     // Catch:{ Exception -> 0x02c8 }
            X.SRY r5 = X.SRY.A00()     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r0 = "MERGE_AUTOFILL_DIALOG"
            X.AnonymousClass7TG.A1N(r0, r7)     // Catch:{ Exception -> 0x02c8 }
            X.RRP r4 = new X.RRP     // Catch:{ Exception -> 0x02c8 }
            r4.<init>()     // Catch:{ Exception -> 0x02c8 }
            r4.A0I = r0     // Catch:{ Exception -> 0x02c8 }
            r4.A0B = r7     // Catch:{ Exception -> 0x02c8 }
            r4.A08 = r1     // Catch:{ Exception -> 0x02c8 }
            long r0 = (long) r8     // Catch:{ Exception -> 0x02c8 }
            r4.A03 = r0     // Catch:{ Exception -> 0x02c8 }
            X.SHz r0 = r4.A00()     // Catch:{ Exception -> 0x02c8 }
            java.util.HashMap r0 = r0.A01()     // Catch:{ Exception -> 0x02c8 }
            r5.A07(r6, r0)     // Catch:{ Exception -> 0x02c8 }
            goto L_0x02c7
        L_0x0147:
            java.lang.String r7 = "BLOKS_CONTACT_USAGE"
            boolean r7 = r9.equals(r7)     // Catch:{ Exception -> 0x02c8 }
            if (r7 == 0) goto L_0x010e
            if (r4 == 0) goto L_0x010e
            X.RRP r7 = r1.A01     // Catch:{ Exception -> 0x02c8 }
            if (r7 == 0) goto L_0x0159
            X.SHz r6 = r7.A00()     // Catch:{ Exception -> 0x02c8 }
        L_0x0159:
            X.S5W r10 = r0.A0a     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r8 = "BLOKS_REQUEST_PROMPT_CONTACT_USAGE"
            r7 = 1
            X.RRP r7 = r10.A00(r8, r7)     // Catch:{ Exception -> 0x02c8 }
            X.SHz r8 = r7.A00()     // Catch:{ Exception -> 0x02c8 }
            android.os.Bundle r7 = r0.A02()     // Catch:{ Exception -> 0x02c8 }
            X.4gR r9 = r0.A0b     // Catch:{ Exception -> 0x02c8 }
            X.SUR.A0A(r7, r9, r8)     // Catch:{ Exception -> 0x02c8 }
            com.instagram.common.session.UserSession r8 = r0.A0d     // Catch:{ Exception -> 0x02c8 }
            X.S0G r7 = new X.S0G     // Catch:{ Exception -> 0x02c8 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x02c8 }
            X.QKA r8 = new X.QKA     // Catch:{ Exception -> 0x02c8 }
            r8.<init>(r9, r7)     // Catch:{ Exception -> 0x02c8 }
            android.os.Bundle r7 = r0.A02()     // Catch:{ Exception -> 0x02c8 }
            java.util.HashMap r26 = X.SUR.A06(r7, r6)     // Catch:{ Exception -> 0x02c8 }
            boolean r11 = r0.A0S     // Catch:{ Exception -> 0x02c8 }
            boolean r6 = r0.A0H()     // Catch:{ Exception -> 0x02c8 }
            if (r11 == 0) goto L_0x018e
            r11 = 1
            if (r6 == 0) goto L_0x018f
        L_0x018e:
            r11 = 0
        L_0x018f:
            boolean r6 = r0.A0J()     // Catch:{ Exception -> 0x02c8 }
            X.S4q r22 = r0.A04(r11, r6)     // Catch:{ Exception -> 0x02c8 }
            X.RzL r12 = r9.A00     // Catch:{ Exception -> 0x02c8 }
            X.QP6 r6 = r12.A05     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r11 = r6.A06     // Catch:{ Exception -> 0x02c8 }
            X.Jvc r6 = r12.A0P     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r6 = r6.A03     // Catch:{ Exception -> 0x02c8 }
            android.os.Bundle r28 = r0.A02()     // Catch:{ Exception -> 0x02c8 }
            X.SlG r21 = new X.SlG     // Catch:{ Exception -> 0x02c8 }
            r27 = r21
            r29 = r10
            r30 = r9
            r31 = r11
            r32 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33)     // Catch:{ Exception -> 0x02c8 }
            X.SRY r6 = X.SRY.A00()     // Catch:{ Exception -> 0x02c8 }
            X.SlF r10 = new X.SlF     // Catch:{ Exception -> 0x02c8 }
            r10.<init>(r7, r6, r0)     // Catch:{ Exception -> 0x02c8 }
            X.SJh r6 = r9.A02     // Catch:{ Exception -> 0x02c8 }
            r19 = r7
            r20 = r10
            r23 = r6
            r24 = r5
            r25 = r33
            r17 = r8
            r18 = r4
            r17.A05(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x02c8 }
            goto L_0x02b5
        L_0x01d2:
            java.lang.String r8 = "BLOKS_HYBRID_PAYMENT_USAGE"
            goto L_0x01d7
        L_0x01d5:
            java.lang.String r8 = "BLOKS_PAYMENT_USAGE"
        L_0x01d7:
            boolean r8 = r9.equals(r8)     // Catch:{ Exception -> 0x02c8 }
            if (r8 == 0) goto L_0x010e
            if (r4 == 0) goto L_0x010e
            X.RRP r8 = r1.A01     // Catch:{ Exception -> 0x02c8 }
            if (r8 == 0) goto L_0x01e7
            X.SHz r6 = r8.A00()     // Catch:{ Exception -> 0x02c8 }
        L_0x01e7:
            X.STY r8 = r0.A07     // Catch:{ Exception -> 0x02c8 }
            if (r8 == 0) goto L_0x0206
            java.lang.String r18 = "BLOKS_REQUEST_PROMPT_PAYMENT_USAGE"
            r23 = 1
            r19 = -1
            r21 = r19
            r17 = r8
            X.RRP r8 = r17.A07(r18, r19, r21, r23)     // Catch:{ Exception -> 0x02c8 }
            X.SHz r10 = r8.A00()     // Catch:{ Exception -> 0x02c8 }
            android.os.Bundle r9 = r0.A02()     // Catch:{ Exception -> 0x02c8 }
            X.4gR r8 = r0.A0b     // Catch:{ Exception -> 0x02c8 }
            X.SUR.A0A(r9, r8, r10)     // Catch:{ Exception -> 0x02c8 }
        L_0x0206:
            X.STY r10 = r0.A07     // Catch:{ Exception -> 0x02c8 }
            if (r10 == 0) goto L_0x02b5
            X.4gR r8 = r10.A0T     // Catch:{ Exception -> 0x02c8 }
            X.RzL r8 = r8.A00     // Catch:{ Exception -> 0x02c8 }
            X.JwI r8 = r8.A0D     // Catch:{ Exception -> 0x02c8 }
            java.lang.Object r9 = r8.A00     // Catch:{ Exception -> 0x02c8 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ Exception -> 0x02c8 }
            X.QKv r8 = r10.A04     // Catch:{ Exception -> 0x02c8 }
            boolean r8 = r8.A0L(r2)     // Catch:{ Exception -> 0x02c8 }
            java.util.List r8 = X.C11413SSl.A03(r9, r8)     // Catch:{ Exception -> 0x02c8 }
            com.google.common.collect.ImmutableList r29 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r8)     // Catch:{ Exception -> 0x02c8 }
            if (r29 == 0) goto L_0x02b5
            boolean r8 = r29.isEmpty()     // Catch:{ Exception -> 0x02c8 }
            if (r8 != 0) goto L_0x02b5
            X.4gR r8 = r0.A0b     // Catch:{ Exception -> 0x02c8 }
            com.instagram.common.session.UserSession r10 = r0.A0d     // Catch:{ Exception -> 0x02c8 }
            X.S0G r9 = new X.S0G     // Catch:{ Exception -> 0x02c8 }
            r9.<init>(r10)     // Catch:{ Exception -> 0x02c8 }
            X.QK8 r12 = new X.QK8     // Catch:{ Exception -> 0x02c8 }
            r12.<init>(r8, r9)     // Catch:{ Exception -> 0x02c8 }
            android.os.Bundle r11 = r0.A02()     // Catch:{ Exception -> 0x02c8 }
            java.util.HashMap r30 = X.SUR.A06(r11, r6)     // Catch:{ Exception -> 0x02c8 }
            boolean r9 = r0.A0H()     // Catch:{ Exception -> 0x02c8 }
            r10 = r9 ^ 1
            boolean r9 = r0.A0J()     // Catch:{ Exception -> 0x02c8 }
            X.S4q r22 = r0.A04(r10, r9)     // Catch:{ Exception -> 0x02c8 }
            if (r6 == 0) goto L_0x02c4
            java.util.HashMap r9 = r6.A01()     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r6 = "user_action"
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x02c8 }
            if (r9 == 0) goto L_0x02c4
            java.lang.String r6 = "PROMPTED_PREFETCH"
            boolean r6 = r9.equals(r6)     // Catch:{ Exception -> 0x02c8 }
            if (r6 == 0) goto L_0x02b9
            java.lang.String r26 = "PREFETCH"
        L_0x0267:
            X.SJh r15 = r8.A02     // Catch:{ Exception -> 0x02c8 }
            r6 = 6
            X.0qQ.A0B(r15, r6)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r10 = X.C51972G9s.A0n()     // Catch:{ Exception -> 0x02c8 }
            X.4gR r9 = r12.A00     // Catch:{ Exception -> 0x02c8 }
            X.SJq r14 = r9.A01     // Catch:{ Exception -> 0x02c8 }
            java.lang.Integer r8 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r6 = "PAYMENT_USAGE"
            r14.A03(r11, r8, r6, r10)     // Catch:{ Exception -> 0x02c8 }
            X.S7D r6 = new X.S7D     // Catch:{ Exception -> 0x02c8 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x02c8 }
            r6.A01(r7, r8, r10)     // Catch:{ Exception -> 0x02c8 }
            r6.A00()     // Catch:{ Exception -> 0x02c8 }
            java.util.Set r8 = r12.A02()     // Catch:{ Exception -> 0x02c8 }
            r6.A03(r8)     // Catch:{ Exception -> 0x02c8 }
            X.TTd r7 = new X.TTd     // Catch:{ Exception -> 0x02c8 }
            r19 = r11
            r20 = r12
            r21 = r6
            r23 = r14
            r24 = r15
            r25 = r5
            r27 = r10
            r28 = r33
            r31 = r8
            r17 = r7
            r18 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x02c8 }
            X.1TZ r6 = X.1TZ.A00()     // Catch:{ Exception -> 0x02c8 }
            X.Wlm r5 = new X.Wlm     // Catch:{ Exception -> 0x02c8 }
            r5.<init>(r4, r7)     // Catch:{ Exception -> 0x02c8 }
            r6.execute(r5)     // Catch:{ Exception -> 0x02c8 }
        L_0x02b5:
            r1.A05 = r2     // Catch:{ Exception -> 0x02c8 }
            goto L_0x010e
        L_0x02b9:
            java.lang.String r6 = "PROMPTED_RE_OPT_IN"
            boolean r6 = r9.equals(r6)     // Catch:{ Exception -> 0x02c8 }
            if (r6 == 0) goto L_0x02c4
            java.lang.String r26 = "RE_OPT_IN"
            goto L_0x0267
        L_0x02c4:
            java.lang.String r26 = "AUTOFILL"
            goto L_0x0267
        L_0x02c7:
            return
        L_0x02c8:
            X.SJh r6 = r3.A02
            java.lang.Integer r5 = r3.A06
            r4 = 772805755(0x2e10147b, float:3.276E-11)
            java.lang.String r1 = "prompt_name"
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            r6.A03(r5, r1, r0, r4)
            r0 = r16
            r6.A01(r5, r0, r4)
            X.SHm r0 = r3.A01
            r0.A05 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13079TKl.run():void");
    }

    public C13079TKl(Context context, C11252SHm sHm, C11288SJh sJh, C270254gR r4, QC2 qc2, RRP rrp, Integer num, String str, List list) {
        this.A01 = sHm;
        this.A04 = qc2;
        this.A05 = rrp;
        this.A07 = str;
        this.A00 = context;
        this.A08 = list;
        this.A02 = sJh;
        this.A06 = num;
        this.A03 = r4;
    }
}
