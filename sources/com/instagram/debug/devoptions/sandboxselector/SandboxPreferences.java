package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.0tS;
import X.11M;
import X.1Ma;
import X.AnonymousClass05K;
import X.AnonymousClass0Zq;
import X.AnonymousClass0r6;
import X.AnonymousClass11E;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.C60670iy;
import X.C62320sa;
import X.DbS;
import X.DbT;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.L;

public final class SandboxPreferences {
    public final 0tS devPrefs;
    public final SandboxUrlHelper urlHelper;
    public final UserSession userSession;

    private final AnonymousClass0r6 observeDevPreference(C62320sa r4) {
        return AnonymousClass11E.A01(11M.A00(AnonymousClass05K.A00, AnonymousClass0Zq.A00(new SandboxPreferences$observeDevPreference$1(this, r4, (AnonymousClass4D7) null)), -1));
    }

    public final AnonymousClass0r6 observeCurrentSandbox() {
        return AnonymousClass11E.A01(11M.A00(AnonymousClass05K.A00, AnonymousClass0Zq.A00(new SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1(this, (AnonymousClass4D7) null, this)), -1));
    }

    public final AnonymousClass0r6 observeSavedSandbox() {
        return AnonymousClass11E.A01(11M.A00(AnonymousClass05K.A00, AnonymousClass0Zq.A00(new SandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1(this, (AnonymousClass4D7) null, this)), -1));
    }

    public final void setSandbox(String str) {
        0qQ.A0B(str, 0);
        0tS r3 = this.devPrefs;
        boolean z = !str.equals("i.instagram.com");
        if (z) {
            String A05 = 1Ma.A05(str);
            0qQ.A07(A05);
            r3.A0E(A05);
        }
        r3.A0I(z);
        if (L.ig_android_other_category_sandbox_and_gql_endpoint_selectors_unified_experience_variants.is_enabled.getAndExpose(this.userSession).booleanValue()) {
            this.devPrefs.A0F(str);
            this.devPrefs.A0J(true);
            String A04 = 1Ma.A04(str);
            0qQ.A07(A04);
            C60670iy.A00().A01(A04);
        }
        1Ma.A07();
    }

    public final void updateServerHealthStatus(IgServerHealth igServerHealth) {
        0qQ.A0B(igServerHealth, 0);
        0tS r4 = this.devPrefs;
        String str = igServerHealth.healthStatusString;
        0qQ.A0B(str, 0);
        DbS.A1a(r4, str, r4.A0r, 0tS.A4G, 52);
    }

    /* access modifiers changed from: private */
    public final String getSavedSandbox() {
        String A05 = this.devPrefs.A05();
        if (A05.length() == 0) {
            return null;
        }
        return A05;
    }

    public final String getCurrentSandbox() {
        if (this.devPrefs.A0f()) {
            return this.devPrefs.A05();
        }
        return "i.instagram.com";
    }

    public final void resetToDefaultSandbox() {
        this.devPrefs.A0I(false);
        if (L.ig_android_other_category_sandbox_and_gql_endpoint_selectors_unified_experience_variants.is_enabled.getAndExpose(this.userSession).booleanValue()) {
            this.devPrefs.A0F("");
            this.devPrefs.A0J(false);
            C60670iy.A00().A01("");
        }
        1Ma.A07();
    }

    public SandboxPreferences(0tS r1, SandboxUrlHelper sandboxUrlHelper, UserSession userSession2) {
        AnonymousClass7TG.A1U(r1, sandboxUrlHelper, userSession2);
        this.devPrefs = r1;
        this.urlHelper = sandboxUrlHelper;
        this.userSession = userSession2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.instagram.debug.devoptions.sandboxselector.SandboxUrlHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.instagram.debug.devoptions.sandboxselector.SandboxUrlHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.instagram.debug.devoptions.sandboxselector.SandboxUrlHelper} */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SandboxPreferences(X.0tS r2, com.instagram.debug.devoptions.sandboxselector.SandboxUrlHelper r3, com.instagram.common.session.UserSession r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r1 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L_0x0008
            X.0tS r2 = X.DbT.A0h()
        L_0x0008:
            r0 = r5 & 2
            if (r0 == 0) goto L_0x0011
            com.instagram.debug.devoptions.sandboxselector.SandboxUrlHelper r3 = new com.instagram.debug.devoptions.sandboxselector.SandboxUrlHelper
            r3.<init>()
        L_0x0011:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxPreferences.<init>(X.0tS, com.instagram.debug.devoptions.sandboxselector.SandboxUrlHelper, com.instagram.common.session.UserSession, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.instagram.debug.devoptions.sandboxselector.SandboxUrlHelper] */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SandboxPreferences(UserSession userSession2) {
        this(DbT.A0h(), new Object(), userSession2);
        0qQ.A0B(userSession2, 1);
    }
}
