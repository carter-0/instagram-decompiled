package com.instagram.debug.devoptions.direct.burner;

import X.0Yg;
import X.0sP;
import X.AnonymousClass2Ep;
import X.C60340gF;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.user.model.User;

public final class BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1 extends 0Yg implements 0sP {
    public final /* synthetic */ 0sP $callback;
    public final /* synthetic */ BurnerSendSettingsConfig $config;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1(UserSession userSession, 0sP r3, Context context, BurnerSendSettingsConfig burnerSendSettingsConfig) {
        super(1);
        this.$userSession = userSession;
        this.$callback = r3;
        this.$context = context;
        this.$config = burnerSendSettingsConfig;
    }

    public final void invoke(User user) {
        final User user2 = user;
        if (user == null) {
            this.$callback.invoke(BurnerSendSettingsHelper.BurnerResponse.INVALID_USERID);
            return;
        }
        BurnerSendSettingsHelper.Companion companion = BurnerSendSettingsHelper.Companion;
        final UserSession userSession = this.$userSession;
        final 0sP r2 = this.$callback;
        final Context context = this.$context;
        final BurnerSendSettingsConfig burnerSendSettingsConfig = this.$config;
        companion.isFollowing(userSession, user, new 0sP() {
            public final void invoke(Boolean bool) {
                0sP r1;
                BurnerSendSettingsHelper.BurnerResponse burnerResponse;
                if (bool == null) {
                    r1 = r2;
                    burnerResponse = BurnerSendSettingsHelper.BurnerResponse.INVALID_FOLLOWING_STATUS;
                } else if (!bool.booleanValue()) {
                    r1 = r2;
                    burnerResponse = BurnerSendSettingsHelper.BurnerResponse.NOT_FOLLOWING;
                } else {
                    BurnerSendSettingsHelper.Companion companion = BurnerSendSettingsHelper.Companion;
                    final UserSession userSession = userSession;
                    User user = user2;
                    final Context context = context;
                    final BurnerSendSettingsConfig burnerSendSettingsConfig = burnerSendSettingsConfig;
                    final 0sP r12 = r2;
                    companion.getOrCreateDirectThread(userSession, user, new 0sP() {
                        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
                            r2 = X.C66662MaV.A00(r1, X.AnonymousClass48M.A01(r10.BRZ()));
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void invoke(X.AnonymousClass2Ep r10) {
                            /*
                                r9 = this;
                                r6 = r10
                                if (r10 != 0) goto L_0x000b
                                X.0sP r1 = r1
                                com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$BurnerResponse r0 = com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper.BurnerResponse.COULD_NOT_CREATE_THREAD
                            L_0x0007:
                                r1.invoke(r0)
                                return
                            L_0x000b:
                                java.lang.String r1 = r10.C6C()
                                if (r1 == 0) goto L_0x0034
                                java.util.List r0 = r10.BRZ()
                                java.util.ArrayList r0 = X.AnonymousClass48M.A01(r0)
                                X.3t1 r2 = X.C66662MaV.A00(r1, r0)
                                if (r2 == 0) goto L_0x0034
                                com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion r3 = com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper.Companion
                                android.content.Context r4 = r3
                                com.instagram.common.session.UserSession r5 = r5
                                com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsConfig r1 = r2
                                boolean r7 = r1.isTLC
                                X.0sP r0 = r1
                                com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1$1$1$1 r8 = new com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1$1$1$1
                                r8.<init>(r0, r5, r2, r1)
                                r3.ensureCutover(r4, r5, r6, r7, r8)
                                return
                            L_0x0034:
                                X.0sP r1 = r1
                                com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$BurnerResponse r0 = com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper.BurnerResponse.COULD_NOT_CREATE_THREAD_SERVER
                                goto L_0x0007
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1.AnonymousClass1.AnonymousClass1.invoke(X.2Ep):void");
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((AnonymousClass2Ep) obj);
                            return C60340gF.A00;
                        }
                    });
                    return;
                }
                r1.invoke(burnerResponse);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C60340gF.A00;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((User) obj);
        return C60340gF.A00;
    }
}
