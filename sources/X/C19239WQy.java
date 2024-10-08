package X;

/* renamed from: X.WQy  reason: case insensitive filesystem */
public final class C19239WQy implements AnonymousClass1FD {
    public static final C19239WQy A00 = new C19239WQy();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r12) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r4 = 0
            r9 = 15
            r10 = 10
            X.Jw8 r3 = new X.Jw8
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r3.<init>((java.lang.Boolean) r4, (java.lang.Boolean) r5, (java.lang.String) r6, (java.util.List) r7, (kotlin.jvm.internal.DefaultConstructorMarker) r8, (int) r9, (int) r10)
            X.16L r1 = r12.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0022
            java.lang.String r1 = "JSON string for ElectionAddYoursInfo should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0022:
            X.16L r1 = r12.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x009e
            java.lang.String r1 = X.AnonymousClass7TE.A17(r12)
            if (r1 == 0) goto L_0x0099
            int r0 = r1.hashCode()
            switch(r0) {
                case -2098301001: goto L_0x0075;
                case -1114294257: goto L_0x0066;
                case 642336006: goto L_0x0057;
                case 809963074: goto L_0x0044;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "ElectionAddYoursInfoJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0040:
            r12.A0z()
            goto L_0x0022
        L_0x0044:
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r12)
            r3.A01 = r0
            goto L_0x0040
        L_0x0057:
            java.lang.String r0 = "disable_add_yours_button"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r12)
            r3.A00 = r0
            goto L_0x0040
        L_0x0066:
            java.lang.String r0 = "tray_title"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = X.C13989Tnp.A0o(r12)
            r3.A03 = r0
            goto L_0x0040
        L_0x0075:
            java.lang.String r0 = "title_options"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.16L r1 = r12.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0096
        L_0x008a:
            X.16L r1 = r12.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0096
            X.C13990Tnq.A19(r12, r2)
            goto L_0x008a
        L_0x0096:
            r3.A02 = r2
            goto L_0x0040
        L_0x0099:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x009e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19239WQy.invoke(X.16F):java.lang.Object");
    }
}
