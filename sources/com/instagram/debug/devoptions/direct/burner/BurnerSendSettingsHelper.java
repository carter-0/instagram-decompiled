package com.instagram.debug.devoptions.direct.burner;

import X.00l;
import X.0oU;
import X.0qQ;
import X.0sP;
import X.15p;
import X.1ES;
import X.1NY;
import X.1OC;
import X.2L2;
import X.AnonymousClass2Ep;
import X.AnonymousClass3U9;
import X.AnonymousClass441;
import X.AnonymousClass48M;
import X.AnonymousClass7L5;
import X.AnonymousClass7L7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C254773t1;
import X.C320126ro;
import X.C331057Pi;
import X.C333527Zh;
import X.C51968G9o;
import X.C51970G9q;
import X.C51974G9v;
import X.C62320sa;
import X.C69849NtD;
import X.C71146Oe3;
import X.NHZ;
import X.OKL;
import X.OQJ;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsConfig;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.user.model.User;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BurnerSendSettingsHelper {
    public static final int $stable = 0;
    public static final Companion Companion = new Object();
    public static final int MESSAGE_SEND_BATCH_DELAY_IN_MS = 30000;
    public static final int MESSAGE_SEND_BATCH_SIZE = 50;

    public enum BurnerResponse {
        NO_ERROR("No error"),
        INVALID_USERID("Could not find target user id"),
        INVALID_FOLLOWING_STATUS("Could not check if followed/following"),
        NOT_FOLLOWING("Target user is not followed/following"),
        COULD_NOT_CREATE_THREAD("Could not create thread"),
        COULD_NOT_CREATE_THREAD_SERVER("Could not create thread (null threadId)"),
        COULD_NOT_CUTOVER_THREAD("Could not cutover thread");
        
        public final String errorMsg;

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* access modifiers changed from: public */
        static {
            BurnerResponse[] $values;
            $ENTRIES = 0oU.A00($values);
        }

        public final String getErrorMsg() {
            return this.errorMsg;
        }

        /* access modifiers changed from: public */
        BurnerResponse(String str) {
            this.errorMsg = str;
        }
    }

    public final class Companion {
        /* access modifiers changed from: private */
        public final void isFollowing(UserSession userSession, User user, 0sP r6) {
            AnonymousClass7TF.A1H(user, userSession);
            1OC A02 = C320126ro.A02(userSession, user.getId(), false);
            A02.A00 = new BurnerSendSettingsHelper$Companion$isFollowing$task$1(r6);
            1ES.A06(A02, 809649118, false);
        }

        /* JADX WARNING: type inference failed for: r9v1, types: [com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$sendMessageToThread$1$1, X.11X] */
        public final void sendMessageToThread(UserSession userSession, C254773t1 r20, String str, BurnerSendSettingsConfig.MessageType messageType, int i) {
            UserSession userSession2 = userSession;
            String str2 = str;
            AnonymousClass7TF.A1B(userSession2, 0, str2);
            0qQ.A0B(messageType, 3);
            AnonymousClass7L7 r8 = new AnonymousClass7L7(userSession2, new AnonymousClass7L5((Bundle) null, "burner", "burner", (C62320sa) null), (OKL) null, C333527Zh.A00(userSession2), new BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$1(r20), BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$2.INSTANCE, BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$3.INSTANCE, BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$4.INSTANCE, BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$5.INSTANCE);
            int i2 = i;
            int A1U = (i / 50) + C51970G9q.A1U(i % 50);
            for (int i3 = 0; i3 < A1U; i3++) {
                int i4 = i3 * 50;
                1ES.A04(new BurnerSendSettingsHelper$Companion$sendMessageToThread$1$1(Math.min(i2, i4 + 50), i4, r8, str2), 1334005072, 3, i3 * 30000, false, false);
            }
        }

        private final void fetchUser(UserSession userSession, BurnerSendSettingsConfig burnerSendSettingsConfig, 0sP r6) {
            String str = burnerSendSettingsConfig.targetUserId;
            if (str == null) {
                return;
            }
            if (00l.A0W(str)) {
                r6.invoke((Object) null);
            } else {
                AnonymousClass441.A02.A02(userSession, new BurnerSendSettingsHelper$Companion$fetchUser$2$1(r6), str);
            }
        }

        public Companion() {
        }

        /* access modifiers changed from: private */
        public final void ensureCutover(Context context, UserSession userSession, AnonymousClass2Ep r12, boolean z, 0sP r14) {
            if (C331057Pi.A02(r12.AiM())) {
                C51968G9o.A1O(r14, true);
                return;
            }
            String C6C = r12.C6C();
            if (C6C != null) {
                Context context2 = context;
                UserSession userSession2 = userSession;
                C69849NtD.A00(context2, userSession2, C6C, new BurnerSendSettingsHelper$Companion$ensureCutover$1$1(r14, r12, z), -1, z, false, false);
            }
        }

        /* access modifiers changed from: private */
        public final void getOrCreateDirectThread(UserSession userSession, User user, 0sP r9) {
            AnonymousClass3U9 BYg = 2L2.A00(userSession).BYg((CreatorBroadcastThreadInfo) null, (String) null, (String) null, AnonymousClass48M.A01(AnonymousClass7TE.A1I(user)));
            if (BYg.C6C() != null) {
                r9.invoke(BYg);
                return;
            }
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("direct_v2/threads/broadcast/text/");
            A0a.A0O((15p) null, NHZ.class, OQJ.class, false);
            A0a.A9m("text", "create/bump thread");
            A0a.A9m("action", "send_item");
            C71146Oe3.A09(A0a, BYg.BJz());
            1OC A0M = A0a.A0M();
            A0M.A00 = new BurnerSendSettingsHelper$Companion$getOrCreateDirectThread$task$1(r9, userSession);
            1ES.A06(A0M, 744669200, false);
        }

        public final void createCutoverThreadAndSendMessage(Context context, UserSession userSession, BurnerSendSettingsConfig burnerSendSettingsConfig, 0sP r5) {
            C51974G9v.A1O(context, userSession, burnerSendSettingsConfig, r5);
            fetchUser(userSession, burnerSendSettingsConfig, new BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1(userSession, r5, context, burnerSendSettingsConfig));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final void sendMessageToThread(UserSession userSession, C254773t1 r2, String str, BurnerSendSettingsConfig.MessageType messageType, int i) {
        Companion.sendMessageToThread(userSession, r2, str, messageType, i);
    }
}
