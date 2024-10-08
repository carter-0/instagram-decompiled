package com.instagram.debug.devoptions.sandboxselector;

import X.05G;
import X.0qQ;
import X.10q;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass10H;
import X.AnonymousClass4D7;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C46329Dbx;
import X.C51974G9v;
import X.C61410nE;
import X.C61860pz;
import X.DbS;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SandboxRepository {
    public static final long CACHE_TTL = 86400;
    public static final Companion Companion = new Object();
    public final DevServerApi api;
    public final C61410nE clock;
    public final 05G corpnetStatus;
    public final DevServerDao devServerDao;
    public final GraphQLDevServerApi graphQLApi;
    public final SandboxSelectorLogger logger;
    public final C46329Dbx navigationPerfLogger;
    public final SandboxPreferences sandboxPrefs;
    public final UserSession userSession;

    public SandboxRepository(UserSession userSession2, SandboxSelectorLogger sandboxSelectorLogger, DevServerDao devServerDao2, C46329Dbx dbx, DevServerApi devServerApi, SandboxPreferences sandboxPreferences, C61410nE r8, GraphQLDevServerApi graphQLDevServerApi) {
        0qQ.A0B(userSession2, 1);
        C51974G9v.A1S(sandboxSelectorLogger, devServerDao2, dbx, devServerApi, sandboxPreferences);
        AnonymousClass7TF.A1F(r8, 7, graphQLDevServerApi);
        this.userSession = userSession2;
        this.logger = sandboxSelectorLogger;
        this.devServerDao = devServerDao2;
        this.navigationPerfLogger = dbx;
        this.api = devServerApi;
        this.sandboxPrefs = sandboxPreferences;
        this.clock = r8;
        this.graphQLApi = graphQLDevServerApi;
        this.corpnetStatus = DbS.A10(CorpnetStatus.CHECKING);
    }

    public final void setSandbox(Sandbox sandbox) {
        0qQ.A0B(sandbox, 0);
        this.sandboxPrefs.setSandbox(sandbox.url);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: private */
    public final AnonymousClass0r6 observeServerHealth() {
        return new SandboxRepository$observeServerHealth$$inlined$map$1(this.api.checkServerConnectionHealth(this.userSession), this);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object forceSandboxesRefresh(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1
            if (r0 == 0) goto L_0x0079
            r5 = r7
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1 r5 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0079
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1Hj r2 = X.1Hj.A02
            int r0 = r5.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 == r1) goto L_0x0038
            if (r0 != r3) goto L_0x007f
            java.lang.Object r3 = r5.L$1
            com.instagram.debug.devoptions.sandboxselector.Sandbox r3 = (com.instagram.debug.devoptions.sandboxselector.Sandbox) r3
            java.lang.Object r2 = r5.L$0
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository r2 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository) r2
            X.0eS.A00(r4)
        L_0x002b:
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1 r1 = new com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1
            r1.<init>(r4, r2, r3)
            X.0qC r0 = new X.0qC
            r0.<init>(r1)
            return r0
        L_0x0038:
            java.lang.Object r2 = r5.L$0
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository r2 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository) r2
            X.0eS.A00(r4)
            goto L_0x0053
        L_0x0040:
            X.0eS.A00(r4)
            X.0r6 r0 = r6.observeCurrentSandbox()
            r5.L$0 = r6
            r5.label = r1
            java.lang.Object r4 = X.AnonymousClass10c.A02(r5, r0)
            if (r4 != r2) goto L_0x0052
            return r2
        L_0x0052:
            r2 = r6
        L_0x0053:
            com.instagram.debug.devoptions.sandboxselector.Sandbox r4 = (com.instagram.debug.devoptions.sandboxselector.Sandbox) r4
            com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger r0 = r2.logger
            r0.listFetchStart(r4)
            X.05G r1 = r2.corpnetStatus
            com.instagram.debug.devoptions.sandboxselector.CorpnetStatus r0 = com.instagram.debug.devoptions.sandboxselector.CorpnetStatus.CHECKING
            r1.Epw(r0)
            X.Dbx r0 = r2.navigationPerfLogger
            X.34p r0 = r0.A00
            r0.A04()
            com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi r1 = r2.graphQLApi
            com.instagram.common.session.UserSession r0 = r2.userSession
            r5.L$0 = r2
            r5.L$1 = r4
            r5.label = r3
            java.lang.Object r0 = r1.getDevServersCategorizedAsFlow(r0, r5)
            r3 = r4
            r4 = r0
            goto L_0x002b
        L_0x0079:
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1 r5 = new com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxRepository.forceSandboxesRefresh(X.4D7):java.lang.Object");
    }

    public final Sandbox getCurrentSandbox() {
        return SandboxDataModelConverterKt.hostNameToSandbox(this.sandboxPrefs.getCurrentSandbox(), "i.instagram.com");
    }

    public final AnonymousClass0Ud observeCorpnetStatus() {
        return this.corpnetStatus;
    }

    public final AnonymousClass0r6 observeCurrentSandbox() {
        return new SandboxRepository$observeCurrentSandbox$$inlined$map$1(this.sandboxPrefs.observeCurrentSandbox());
    }

    public final void resetToDefaultSandbox() {
        this.sandboxPrefs.resetToDefaultSandbox();
    }

    public final AnonymousClass0r6 observeHealthyConnection() {
        return new C61860pz(new SandboxRepository$observeHealthyConnection$2(this.sandboxPrefs), 10q.A02(new SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1((AnonymousClass4D7) null, this), observeCurrentSandbox()));
    }

    public final AnonymousClass0r6 observeSandboxes() {
        return AnonymousClass10H.A03(new SandboxRepository$observeSandboxes$1((AnonymousClass4D7) null), this.devServerDao.getAll(AnonymousClass7TG.A0I() - CACHE_TTL), this.sandboxPrefs.observeSavedSandbox());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.instagram.debug.devoptions.sandboxselector.DevServerApi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.instagram.debug.devoptions.sandboxselector.DevServerApi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.instagram.debug.devoptions.sandboxselector.DevServerApi} */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SandboxRepository(com.instagram.common.session.UserSession r2, com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger r3, com.instagram.debug.devoptions.sandboxselector.DevServerDao r4, X.C46329Dbx r5, com.instagram.debug.devoptions.sandboxselector.DevServerApi r6, com.instagram.debug.devoptions.sandboxselector.SandboxPreferences r7, X.C61410nE r8, com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r0 = r10 & 16
            if (r0 == 0) goto L_0x0009
            com.instagram.debug.devoptions.sandboxselector.DevServerApi r6 = new com.instagram.debug.devoptions.sandboxselector.DevServerApi
            r6.<init>()
        L_0x0009:
            r0 = r10 & 32
            if (r0 == 0) goto L_0x0012
            com.instagram.debug.devoptions.sandboxselector.SandboxPreferences r7 = new com.instagram.debug.devoptions.sandboxselector.SandboxPreferences
            r7.<init>(r2)
        L_0x0012:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0018
            X.0nE r8 = X.C61410nE.A00
        L_0x0018:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0021
            com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi r9 = new com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi
            r9.<init>()
        L_0x0021:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxRepository.<init>(com.instagram.common.session.UserSession, com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger, com.instagram.debug.devoptions.sandboxselector.DevServerDao, X.Dbx, com.instagram.debug.devoptions.sandboxselector.DevServerApi, com.instagram.debug.devoptions.sandboxselector.SandboxPreferences, X.0nE, com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
