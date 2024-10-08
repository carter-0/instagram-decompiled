package com.instagram.debug.devoptions.sandboxselector;

import X.02o;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;

public final class SandboxRepository$observeServerHealth$$inlined$map$1 implements AnonymousClass0r6 {
    public final /* synthetic */ AnonymousClass0r6 $this_unsafeTransform$inlined;
    public final /* synthetic */ SandboxRepository this$0;

    public SandboxRepository$observeServerHealth$$inlined$map$1(AnonymousClass0r6 r1, SandboxRepository sandboxRepository) {
        this.$this_unsafeTransform$inlined = r1;
        this.this$0 = sandboxRepository;
    }

    public Object collect(final 02o r4, AnonymousClass4D7 r5) {
        AnonymousClass0r6 r2 = this.$this_unsafeTransform$inlined;
        final SandboxRepository sandboxRepository = this.this$0;
        return AnonymousClass7TG.A0i(r5, r2, new 02o() {
            /* JADX WARNING: type inference failed for: r4v1, types: [com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1$2$1, X.4D7] */
            /* JADX WARNING: type inference failed for: r4v4 */
            /* JADX WARNING: type inference failed for: r4v5 */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0089 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r11, X.AnonymousClass4D7 r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x00cc
                    r4 = r12
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1$2$1 r4 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                    int r2 = r4.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L_0x00cc
                    int r2 = r2 - r1
                    r4.label = r2
                L_0x0012:
                    java.lang.Object r6 = r4.result
                    X.1Hj r5 = X.1Hj.A02
                    int r0 = r4.label
                    r3 = 3
                    r8 = 2
                    r1 = 1
                    if (r0 == 0) goto L_0x004d
                    if (r0 == r1) goto L_0x003d
                    if (r0 == r8) goto L_0x0029
                    if (r0 != r3) goto L_0x00d3
                    X.0eS.A00(r6)
                L_0x0026:
                    X.0gF r5 = X.C60340gF.A00
                L_0x0028:
                    return r5
                L_0x0029:
                    java.lang.Object r9 = r4.L$3
                    com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger r9 = (com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger) r9
                    java.lang.Object r7 = r4.L$2
                    com.instagram.debug.devoptions.sandboxselector.Sandbox r7 = (com.instagram.debug.devoptions.sandboxselector.Sandbox) r7
                    java.lang.Object r11 = r4.L$1
                    X.MQ0 r11 = (X.MQ0) r11
                    java.lang.Object r2 = r4.L$0
                    X.02o r2 = (X.02o) r2
                    X.0eS.A00(r6)
                    goto L_0x00a8
                L_0x003d:
                    java.lang.Object r11 = r4.L$2
                    X.MQ0 r11 = (X.MQ0) r11
                    java.lang.Object r2 = r4.L$1
                    X.02o r2 = (X.02o) r2
                    java.lang.Object r7 = r4.L$0
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1$2 r7 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1.AnonymousClass2) r7
                    X.0eS.A00(r6)
                    goto L_0x0069
                L_0x004d:
                    X.0eS.A00(r6)
                    X.02o r2 = r4
                    X.MQ0 r11 = (X.MQ0) r11
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r1
                    X.0r6 r0 = r0.observeCurrentSandbox()
                    r4.L$0 = r10
                    r4.L$1 = r2
                    r4.L$2 = r11
                    r4.label = r1
                    java.lang.Object r6 = X.AnonymousClass10c.A02(r4, r0)
                    if (r6 == r5) goto L_0x0028
                    r7 = r10
                L_0x0069:
                    com.instagram.debug.devoptions.sandboxselector.Sandbox r6 = (com.instagram.debug.devoptions.sandboxselector.Sandbox) r6
                    boolean r0 = r11 instanceof X.C59702JUj
                    if (r0 == 0) goto L_0x008a
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r1
                    com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger r0 = r0.logger
                    r0.hostVerificationStart(r6)
                    com.instagram.debug.devoptions.sandboxselector.IgServerHealth$CheckingHealth r1 = com.instagram.debug.devoptions.sandboxselector.IgServerHealth.CheckingHealth.INSTANCE
                L_0x0078:
                    r0 = 0
                    r4.L$0 = r0
                    r4.L$1 = r0
                    r4.L$2 = r0
                    r4.L$3 = r0
                    r4.label = r3
                    java.lang.Object r0 = r2.emit(r1, r4)
                    if (r0 != r5) goto L_0x0026
                    return r5
                L_0x008a:
                    boolean r0 = X.C59678JTj.A01(r1, r11)
                    if (r0 == 0) goto L_0x00b5
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r1
                    com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger r9 = r0.logger
                    X.05G r0 = r0.corpnetStatus
                    r4.L$0 = r2
                    r4.L$1 = r11
                    r4.L$2 = r6
                    r4.L$3 = r9
                    r4.label = r8
                    java.lang.Object r0 = X.AnonymousClass10c.A02(r4, r0)
                    if (r0 == r5) goto L_0x0028
                    r7 = r6
                    r6 = r0
                L_0x00a8:
                    com.instagram.debug.devoptions.sandboxselector.CorpnetStatus r0 = com.instagram.debug.devoptions.sandboxselector.CorpnetStatus.ON_CORPNET
                    if (r6 == r0) goto L_0x00ad
                    r1 = 0
                L_0x00ad:
                    r9.hostVerificationSuccess(r7, r1)
                    X.JTj r11 = (X.C59678JTj) r11
                    java.lang.Object r1 = r11.A01
                    goto L_0x0078
                L_0x00b5:
                    boolean r0 = X.C59678JTj.A02(r11)
                    if (r0 == 0) goto L_0x00d8
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r1
                    com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger r1 = r0.logger
                    java.lang.String r0 = "UNKNOWN"
                    r1.hostVerificationFailed(r6, r0)
                    com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy$UnhealthyReason r0 = com.instagram.debug.devoptions.sandboxselector.IgServerHealth.Unhealthy.UnhealthyReason.UNKNOWN
                    com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy r1 = new com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy
                    r1.<init>(r0)
                    goto L_0x0078
                L_0x00cc:
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1$2$1 r4 = new com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1$2$1
                    r4.<init>(r12)
                    goto L_0x0012
                L_0x00d3:
                    java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
                    throw r0
                L_0x00d8:
                    X.Wub r0 = X.AnonymousClass7TE.A1K()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.4D7):java.lang.Object");
            }
        });
    }
}
