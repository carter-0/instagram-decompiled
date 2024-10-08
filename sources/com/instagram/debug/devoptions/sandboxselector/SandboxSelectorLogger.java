package com.instagram.debug.devoptions.sandboxselector;

import X.0Aj;
import X.0qQ;
import X.0wc;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C69492Nma;
import X.C74221Pr8;
import X.C74222Pr9;
import X.DbW;
import X.N0U;
import com.instagram.common.session.UserSession;

public final class SandboxSelectorLogger {
    public final 0wc logger;

    public final void enter(Sandbox sandbox) {
        0qQ.A0B(sandbox, 0);
        C74222Pr9 create = create(C69492Nma.ENTERED);
        if (create != null) {
            N0U n0u = (N0U) setSandbox(create, sandbox);
            n0u.A0R("corpnet_status", "unknown");
            n0u.Cgf();
        }
    }

    public final void exit(Sandbox sandbox) {
        0qQ.A0B(sandbox, 0);
        C74222Pr9 create = create(C69492Nma.EXITED);
        if (create != null) {
            N0U n0u = (N0U) setSandbox(create, sandbox);
            n0u.A0R("corpnet_status", "unknown");
            n0u.Cgf();
        }
    }

    public final void hostSelected(Sandbox sandbox) {
        0qQ.A0B(sandbox, 0);
        C74222Pr9 create = create(C69492Nma.HOST_SELECTED);
        if (create != null) {
            N0U n0u = (N0U) setSandbox(create, sandbox);
            n0u.A0R("corpnet_status", "unknown");
            n0u.Cgf();
        }
    }

    public final void hostVerificationStart(Sandbox sandbox) {
        0qQ.A0B(sandbox, 0);
        C74222Pr9 create = create(C69492Nma.HOST_VERIFICATION_STARTED);
        if (create != null) {
            N0U n0u = (N0U) setSandbox(create, sandbox);
            n0u.A0R("corpnet_status", "unknown");
            n0u.Cgf();
        }
    }

    public final void hostVerificationSuccess(Sandbox sandbox, boolean z) {
        0qQ.A0B(sandbox, 0);
        C74222Pr9 create = create(C69492Nma.HOST_VERIFICATION_SUCESS);
        if (create != null) {
            setCorpnetStatus(setSandbox(create, sandbox), z).Cgf();
        }
    }

    public final void listFetchStart(Sandbox sandbox) {
        0qQ.A0B(sandbox, 0);
        C74222Pr9 create = create(C69492Nma.LIST_FETCH_STARTED);
        if (create != null) {
            N0U n0u = (N0U) setSandbox(create, sandbox);
            n0u.A0R("corpnet_status", "unknown");
            n0u.Cgf();
        }
    }

    public final void listFetchSuccess(Sandbox sandbox, boolean z) {
        0qQ.A0B(sandbox, 0);
        C74222Pr9 create = create(C69492Nma.LIST_FETCHED_SUCESSS);
        if (create != null) {
            setCorpnetStatus(setSandbox(create, sandbox), z).Cgf();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                com.instagram.debug.devoptions.sandboxselector.SandboxType[] r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.instagram.debug.devoptions.sandboxselector.SandboxType r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.PRODUCTION     // Catch:{ NoSuchFieldError -> 0x000c }
                X.C66581MXm.A1N(r0, r2)     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                com.instagram.debug.devoptions.sandboxselector.SandboxType r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.DEDICATED     // Catch:{ NoSuchFieldError -> 0x0011 }
                X.C51970G9q.A1M(r0, r2)     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                com.instagram.debug.devoptions.sandboxselector.SandboxType r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.ON_DEMAND     // Catch:{ NoSuchFieldError -> 0x0016 }
                X.C66581MXm.A1O(r0, r2)     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                com.instagram.debug.devoptions.sandboxselector.SandboxType r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.OTHER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                $EnumSwitchMapping$0 = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0Ak, java.lang.Object, X.Pr9] */
    private final C74222Pr9 create(C69492Nma nma) {
        0Aj A0e = AnonymousClass7TE.A0e(this.logger, "ig_sandbox_selector");
        ? obj = new Object();
        obj.A00 = A0e;
        if (!A0e.isSampled()) {
            return null;
        }
        obj.A0M(nma, "action");
        return obj;
    }

    private final N0U setCorpnetStatus(C74221Pr8 pr8, boolean z) {
        String str;
        if (z) {
            str = "on_corpnet";
        } else {
            str = "off_corpnet";
        }
        N0U n0u = (N0U) pr8;
        n0u.A0R("corpnet_status", str);
        return n0u;
    }

    private final C74221Pr8 setSandbox(C74222Pr9 pr9, Sandbox sandbox) {
        String A00;
        int ordinal = sandbox.type.ordinal();
        if (ordinal == 0) {
            A00 = AnonymousClass000.A00(3793);
        } else if (ordinal == 1) {
            A00 = "dedicated_devserver";
        } else if (ordinal == 2) {
            A00 = "ondemand";
        } else if (ordinal == 3) {
            A00 = "other";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        N0U n0u = (N0U) pr9;
        n0u.A0R(DevServerEntity.COLUMN_HOST_TYPE, A00);
        n0u.A0R("hostname", sandbox.url);
        return n0u;
    }

    public SandboxSelectorLogger(UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.logger = DbW.A0J(userSession, str);
    }

    public final void hostVerificationFailed(Sandbox sandbox, String str) {
        AnonymousClass7TG.A1N(sandbox, str);
        C74222Pr9 create = create(C69492Nma.HOST_VERIFICATION_FAILED);
        if (create != null) {
            N0U n0u = (N0U) setSandbox(create, sandbox);
            n0u.A0R("corpnet_status", "unknown");
            n0u.A0R("error_detail", str);
            n0u.Cgf();
        }
    }

    public final void listFetchFailed(Sandbox sandbox, String str) {
        AnonymousClass7TG.A1N(sandbox, str);
        C74222Pr9 create = create(C69492Nma.LIST_FETCHED_FAILED);
        if (create != null) {
            N0U n0u = (N0U) setSandbox(create, sandbox);
            n0u.A0R("corpnet_status", "unknown");
            n0u.A0R("error_detail", str);
            n0u.Cgf();
        }
    }
}
