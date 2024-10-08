package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3jE  reason: invalid class name and case insensitive filesystem */
public final class C249163jE extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249163jE(2Lk r7) {
        super("DirectThreadPreload", 948467465, 4, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        Throwable th;
        int i;
        if (0yU.A07(AnonymousClass0yP.A00(36328242139315325L))) {
            2Lk r1 = this.A00;
            CallerContext callerContext = 2Lk.A08;
            UserSession userSession = r1.A04;
            0qQ.A0B(userSession, 0);
            List singletonList = Collections.singletonList(new PendingRecipient(userSession.A06));
            0qQ.A07(singletonList);
            C291175gg r8 = new C291175gg(singletonList);
            C376169Gw r2 = C376169Gw.A00;
            0sn r0 = 0sn.A00;
            Capabilities createWithAdditionalCapabilities = r2.createWithAdditionalCapabilities(r0, r0);
            0qQ.A0B(r8, 0);
            0qQ.A0B(createWithAdditionalCapabilities, 4);
            Bundle bundle = new Bundle();
            AnonymousClass9H0.A02(bundle, r8, AnonymousClass000.A00(906));
            bundle.putBoolean("DirectThreadFragment.DIRECT_FRAGMENT_FIRST_MESSAGE_SENT", false);
            bundle.putBoolean(AnonymousClass000.A00(2203), false);
            bundle.putString(AnonymousClass000.A00(905), (String) null);
            bundle.putBoolean("DirectThreadFragment.ARGUMENT_SHOW_PERMISSIONS", false);
            bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", createWithAdditionalCapabilities);
            bundle.putInt("DirectThreadFragment.ARGUMENT_OPEN_TO", 0);
            bundle.putString(AnonymousClass000.A00(431), "direct_thread_preload");
            bundle.putBoolean(AnonymousClass000.A00(587), false);
            bundle.putInt(AnonymousClass000.A00(2200), 0);
            bundle.putBoolean(AnonymousClass000.A00(60), false);
            bundle.putBoolean("DirectFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_CREATE_BACKSTACK", false);
            bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_GROUP_INVITE", false);
            bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SHOULD_DELETE_SEEN_MESSAGE_IN_MIX_VM", false);
            bundle.putBoolean(AnonymousClass000.A00(429), false);
            bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SKIP_ENTER_THREAD_LOGGING", true);
            bundle.putBoolean(AnonymousClass000.A00(4540), false);
            bundle.putBoolean(AnonymousClass000.A00(2236), false);
            bundle.putBoolean(AnonymousClass000.A00(2238), false);
            C227642jf.A03(bundle, userSession);
            if (Systrace.A0E(1)) {
                0fS.A01("PreloadThreadToggleFragment", -358925796);
            }
            try {
                AnonymousClass9H7 A002 = AnonymousClass9H2.A00(bundle, new C273484me(), userSession, true);
                if (Systrace.A0E(1)) {
                    0fS.A00(2081485051);
                }
                if (Systrace.A0E(1)) {
                    0fS.A01("PreloadThreadFragment", 1636856865);
                }
                try {
                    C331767Sh r13 = new C331767Sh(A002.A1J, A002.A1M);
                    UserSession userSession2 = A002.A10;
                    C331617Rr r12 = A002.A1L;
                    C331777Si r7 = new C331777Si(userSession2, A002.A1F, A002.A1H, A002.A0K, r12, r13);
                    UserSession userSession3 = r7.A00;
                    C331617Rr r14 = r7.A04;
                    A002.A0J = new C331787Sj(userSession3, r7.A01, r7.A02, r7.A03, r14, r7.A05);
                    if (userSession2.A07.intValue() == 0) {
                        AnonymousClass9H7.A02(A002.A0r, A002, true);
                    }
                    if (Systrace.A0E(1)) {
                        0fS.A00(495906161);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (Systrace.A0E(1)) {
                        i = -281017705;
                        0fS.A00(i);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (Systrace.A0E(1)) {
                    i = 515624541;
                    0fS.A00(i);
                }
                throw th;
            }
        }
    }
}
