package X;

/* renamed from: X.4Vj  reason: invalid class name and case insensitive filesystem */
public final class C265594Vj {
    public final C265604Vk A00;
    public final C265584Vi A01;
    public final ClassLoader A02;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        if (X.C283725Iz.A00(X.002.A0g("WindowLayoutComponent#addWindowLayoutInfoListener(", android.content.Context.class.getName(), ", androidx.window.extensions.core.util.function.Consumer) is not valid"), new X.C13347TVu((java.lang.Object) r4, 20)) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (X.C283725Iz.A00("FoldingFeature class is not valid", new X.C377179Kv(r4, 1)) == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.window.extensions.layout.WindowLayoutComponent A00() {
        /*
            r4 = this;
            X.4Vk r2 = r4.A00
            r1 = 48
            X.9L8 r0 = new X.9L8
            r0.<init>(r2, r1)
            r0.invoke()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0038 }
            r0 = 49
            X.9L8 r1 = new X.9L8
            r1.<init>(r2, r0)
            java.lang.String r0 = "WindowExtensionsProvider#getWindowExtensions is not valid"
            boolean r0 = X.C283725Iz.A00(r0, r1)
            if (r0 == 0) goto L_0x0038
            r0 = 3
            X.9Kv r1 = new X.9Kv
            r1.<init>(r4, r0)
            java.lang.String r0 = "WindowExtensions#getWindowLayoutComponent is not valid"
            boolean r0 = X.C283725Iz.A00(r0, r1)
            if (r0 == 0) goto L_0x0038
            r0 = 1
            X.9Kv r1 = new X.9Kv
            r1.<init>(r4, r0)
            java.lang.String r0 = "FoldingFeature class is not valid"
            boolean r1 = X.C283725Iz.A00(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            r1 = 0
            if (r0 == 0) goto L_0x005b
            int r2 = X.AnonymousClass5J0.A00()
            r0 = 1
            if (r2 != r0) goto L_0x005f
            java.lang.String r2 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ", java.util.function.Consumer) is not valid"
            java.lang.String r2 = X.002.A0g(r2, r1, r0)
            r1 = 2
            X.9Kv r0 = new X.9Kv
            r0.<init>(r4, r1)
            boolean r1 = X.C283725Iz.A00(r2, r0)
        L_0x005b:
            r0 = 0
            if (r1 == 0) goto L_0x009f
            goto L_0x0097
        L_0x005f:
            r3 = 2
            if (r3 > r2) goto L_0x005b
            java.lang.String r2 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ", java.util.function.Consumer) is not valid"
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            X.9Kv r0 = new X.9Kv
            r0.<init>(r4, r3)
            boolean r0 = X.C283725Iz.A00(r1, r0)
            if (r0 == 0) goto L_0x0095
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ", androidx.window.extensions.core.util.function.Consumer) is not valid"
            java.lang.String r2 = X.002.A0g(r2, r1, r0)
            r1 = 20
            X.TVu r0 = new X.TVu
            r0.<init>((java.lang.Object) r4, (int) r1)
            boolean r0 = X.C283725Iz.A00(r2, r0)
            r1 = 1
            if (r0 != 0) goto L_0x005b
        L_0x0095:
            r1 = 0
            goto L_0x005b
        L_0x0097:
            androidx.window.extensions.WindowExtensions r1 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions()     // Catch:{ UnsupportedOperationException -> 0x009f }
            androidx.window.extensions.layout.WindowLayoutComponent r0 = r1.getWindowLayoutComponent()     // Catch:{ UnsupportedOperationException -> 0x009f }
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265594Vj.A00():androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public C265594Vj(C265584Vi r2, ClassLoader classLoader) {
        this.A02 = classLoader;
        this.A01 = r2;
        this.A00 = new C265604Vk(classLoader);
    }
}
