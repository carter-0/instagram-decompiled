package com.instagram.debug.devoptions.avatars;

import X.05G;
import X.0qQ;
import X.2YL;
import X.AnonymousClass0Ud;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C228042kh;
import X.C318116oQ;
import X.DbS;
import com.instagram.common.session.UserSession;

public final class ImmersiveAvatarViewerEffectConfigViewModel extends 2YL {
    public final 05G _effectConfig;
    public final ImmersiveAvatarConfigRepository repository;
    public final UserSession userSession;

    public final class EffectConfigViewState {
        public final String effectId;
        public final boolean isLoaded;

        public final String getEffectId() {
            return this.effectId;
        }

        public final boolean isLoaded() {
            return this.isLoaded;
        }

        public EffectConfigViewState(boolean z, String str) {
            this.isLoaded = z;
            this.effectId = str;
        }
    }

    public final class Factory extends C228042kh {
        public final UserSession userSession;

        public Factory(UserSession userSession2) {
            0qQ.A0B(userSession2, 1);
            this.userSession = userSession2;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository, java.lang.Object] */
        public ImmersiveAvatarViewerEffectConfigViewModel create() {
            return new ImmersiveAvatarViewerEffectConfigViewModel(this.userSession, new Object());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository} */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ImmersiveAvatarViewerEffectConfigViewModel(com.instagram.common.session.UserSession r2, com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0009
            com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository r3 = new com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository
            r3.<init>()
        L_0x0009:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel.<init>(com.instagram.common.session.UserSession, com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final AnonymousClass0Ud getEffectConfig() {
        return this._effectConfig;
    }

    private final void fetchImmersiveViewerConfig() {
        AnonymousClass7TE.A1Z(new ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1(this, (AnonymousClass4D7) null), C318116oQ.A00(this));
    }

    public ImmersiveAvatarViewerEffectConfigViewModel(UserSession userSession2, ImmersiveAvatarConfigRepository immersiveAvatarConfigRepository) {
        AnonymousClass7TG.A1O(userSession2, immersiveAvatarConfigRepository);
        this.userSession = userSession2;
        this.repository = immersiveAvatarConfigRepository;
        this._effectConfig = DbS.A10(new EffectConfigViewState(false, ""));
        fetchImmersiveViewerConfig();
    }
}
