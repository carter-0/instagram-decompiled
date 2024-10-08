package com.instagram.debug.devoptions.sandboxselector;

import X.02o;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;

public final class SandboxRepository$forceSandboxesRefresh$$inlined$map$1 implements AnonymousClass0r6 {
    public final /* synthetic */ Sandbox $currentSandbox$inlined;
    public final /* synthetic */ AnonymousClass0r6 $this_unsafeTransform$inlined;
    public final /* synthetic */ SandboxRepository this$0;

    public SandboxRepository$forceSandboxesRefresh$$inlined$map$1(AnonymousClass0r6 r1, SandboxRepository sandboxRepository, Sandbox sandbox) {
        this.$this_unsafeTransform$inlined = r1;
        this.this$0 = sandboxRepository;
        this.$currentSandbox$inlined = sandbox;
    }

    public Object collect(final 02o r5, AnonymousClass4D7 r6) {
        AnonymousClass0r6 r3 = this.$this_unsafeTransform$inlined;
        final SandboxRepository sandboxRepository = this.this$0;
        final Sandbox sandbox = this.$currentSandbox$inlined;
        return AnonymousClass7TG.A0i(r6, r3, new 02o() {
            /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1$2$1] */
            /* JADX WARNING: type inference failed for: r6v4 */
            /* JADX WARNING: type inference failed for: r6v5 */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00bc  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00d1  */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r11, X.AnonymousClass4D7 r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x00d4
                    r6 = r12
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1$2$1 r6 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                    int r2 = r6.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L_0x00d4
                    int r2 = r2 - r1
                    r6.label = r2
                L_0x0012:
                    java.lang.Object r1 = r6.result
                    X.1Hj r5 = X.1Hj.A02
                    int r0 = r6.label
                    r7 = 2
                    r8 = 1
                    r4 = 0
                    if (r0 == 0) goto L_0x0027
                    if (r0 == r8) goto L_0x0088
                    if (r0 != r7) goto L_0x00db
                    X.0eS.A00(r1)
                L_0x0024:
                    X.0gF r5 = X.C60340gF.A00
                    return r5
                L_0x0027:
                    X.0eS.A00(r1)
                    X.02o r3 = r5
                    X.3Ii r11 = (X.C239803Ii) r11
                    boolean r0 = r11 instanceof X.C297815sO
                    if (r0 == 0) goto L_0x0051
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r2
                    X.Dbx r0 = r0.navigationPerfLogger
                    X.34p r0 = r0.A00
                    r0.A01()
                    X.5sO r11 = (X.C297815sO) r11
                    java.lang.Object r0 = r11.A00
                    com.instagram.debug.devoptions.sandboxselector.DevserverListError r0 = (com.instagram.debug.devoptions.sandboxselector.DevserverListError) r0
                    com.instagram.debug.devoptions.sandboxselector.SandboxErrorInfo r8 = com.instagram.debug.devoptions.sandboxselector.SandboxDataModelConverterKt.toSandboxError((com.instagram.debug.devoptions.sandboxselector.DevserverListError) r0)
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r2
                    com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger r2 = r0.logger
                    com.instagram.debug.devoptions.sandboxselector.Sandbox r1 = r1
                    java.lang.String r0 = r8.logMessage
                    r2.listFetchFailed(r1, r0)
                    goto L_0x00c2
                L_0x0051:
                    boolean r0 = r11 instanceof X.C239793Ih
                    if (r0 == 0) goto L_0x00e0
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r2
                    X.Dbx r0 = r0.navigationPerfLogger
                    X.34p r0 = r0.A00
                    r0.A05()
                    r0 = r11
                    X.3Ih r0 = (X.C239793Ih) r0
                    java.lang.Object r0 = r0.A00
                    com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse r0 = (com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse) r0
                    com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse$XdtApiV1DevserversListCategorized r0 = r0.getXdtApiV1DevserversListCategorized()
                    com.google.common.collect.ImmutableList r2 = r0.getDevserverCategories()
                    if (r2 == 0) goto L_0x0086
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r2
                    com.instagram.debug.devoptions.sandboxselector.DevServerDao r1 = r0.devServerDao
                    java.util.List r0 = com.instagram.debug.devoptions.sandboxselector.DevServerEntityConverterKt.pandoToEntities(r2)
                    r6.L$0 = r10
                    r6.L$1 = r3
                    r6.L$2 = r11
                    r6.label = r8
                    java.lang.Object r0 = r1.insertAll(r0, r6)
                    if (r0 != r5) goto L_0x0086
                    return r5
                L_0x0086:
                    r9 = r10
                    goto L_0x0097
                L_0x0088:
                    java.lang.Object r11 = r6.L$2
                    X.3Ii r11 = (X.C239803Ii) r11
                    java.lang.Object r3 = r6.L$1
                    X.02o r3 = (X.02o) r3
                    java.lang.Object r9 = r6.L$0
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1$2 r9 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1.AnonymousClass2) r9
                    X.0eS.A00(r1)
                L_0x0097:
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r2
                    com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger r8 = r0.logger
                    com.instagram.debug.devoptions.sandboxselector.Sandbox r1 = r1
                    X.3Ih r11 = (X.C239793Ih) r11
                    java.lang.Object r2 = r11.A00
                    com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse r2 = (com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse) r2
                    com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse$XdtApiV1DevserversListCategorized r0 = r2.getXdtApiV1DevserversListCategorized()
                    boolean r0 = r0.isInternal()
                    r8.listFetchSuccess(r1, r0)
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository r0 = r2
                    X.05G r1 = r0.corpnetStatus
                    com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse$XdtApiV1DevserversListCategorized r0 = r2.getXdtApiV1DevserversListCategorized()
                    boolean r0 = r0.isInternal()
                    if (r0 == 0) goto L_0x00d1
                    com.instagram.debug.devoptions.sandboxselector.CorpnetStatus r0 = com.instagram.debug.devoptions.sandboxselector.CorpnetStatus.ON_CORPNET
                L_0x00be:
                    r1.Epw(r0)
                    r8 = r4
                L_0x00c2:
                    r6.L$0 = r4
                    r6.L$1 = r4
                    r6.L$2 = r4
                    r6.label = r7
                    java.lang.Object r0 = r3.emit(r8, r6)
                    if (r0 != r5) goto L_0x0024
                    return r5
                L_0x00d1:
                    com.instagram.debug.devoptions.sandboxselector.CorpnetStatus r0 = com.instagram.debug.devoptions.sandboxselector.CorpnetStatus.OFF_CORPNET
                    goto L_0x00be
                L_0x00d4:
                    com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1$2$1 r6 = new com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1$2$1
                    r6.<init>(r12)
                    goto L_0x0012
                L_0x00db:
                    java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
                    throw r0
                L_0x00e0:
                    X.Wub r0 = X.AnonymousClass7TE.A1K()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.4D7):java.lang.Object");
            }
        });
    }
}
