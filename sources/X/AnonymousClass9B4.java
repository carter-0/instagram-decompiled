package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9B4  reason: invalid class name */
public final class AnonymousClass9B4 {
    public static final AnonymousClass9B5 A0A;
    public static final String A0B;
    public ImmutableList A00;
    public ImmutableList A01;
    public ImmutableList A02;
    public AnonymousClass9B6 A03;
    public DirectShareTarget A04;
    public boolean A05;
    public boolean A06;
    public final C290655fg A07;
    public final UserSession A08;
    public final C61480nO A09;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9B5] */
    static {
        ? obj = new Object();
        A0A = obj;
        String simpleName = obj.getClass().getSimpleName();
        0qQ.A07(simpleName);
        A0B = simpleName;
    }

    public static final void A00(ImmutableList immutableList, AnonymousClass9B4 r4) {
        Object obj;
        r4.A02 = immutableList;
        if (immutableList != null) {
            Iterator it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((User) obj).A1X()) {
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                PendingRecipient pendingRecipient = new PendingRecipient(user);
                pendingRecipient.A0H = true;
                List singletonList = Collections.singletonList(pendingRecipient);
                0qQ.A07(singletonList);
                DirectShareTarget directShareTarget = new DirectShareTarget((C254783t2) new C291175gg(singletonList), pendingRecipient);
                directShareTarget.A0I = AnonymousClass50n.A07(user);
                r4.A04 = directShareTarget;
            }
        }
    }

    public static final void A01(AnonymousClass9B7 r5, AnonymousClass9B4 r6) {
        long j;
        UserSession userSession = r6.A08;
        if (AnonymousClass9B8.A07(userSession)) {
            j = 182.A01(0Tu.A05, userSession, 36601316159721608L);
        } else {
            j = 0;
        }
        1NY r3 = new 1NY(userSession);
        r3.A08(AnonymousClass05K.A0N);
        r3.A0A("direct_v2/search_gen_ai_bots/");
        r3.A0D("num_ai_bots", j);
        r3.A0R(C384669hh.class, C39826AAx.class);
        1OC A0M = r3.A0M();
        A0M.A00 = new C385319ik(r5, r6);
        r6.A05 = true;
        AnonymousClass1HI.A00().schedule(A0M);
    }

    public static final void A02(AnonymousClass9B4 r17) {
        AnonymousClass9B4 r3 = r17;
        UserSession userSession = r3.A08;
        AnonymousClass9V7 r4 = new AnonymousClass9V7(r3);
        2IS r2 = new 2IS();
        2IS r1 = new 2IS();
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        1vm.A01(userSession).A06(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGDirectSearchMetaAINullStatePromptsQuery", r2.getParamsCopy(), r1.getParamsCopy(), AnonymousClass9VA.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_igd_search_nullstate_prompts", new ArrayList()), r4);
        r3.A06 = true;
    }

    public AnonymousClass9B4(UserSession userSession) {
        this.A08 = userSession;
        C290655fg r1 = new C290655fg(182.A06(0Tu.A05, userSession, 36323358761102441L));
        this.A07 = r1;
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        this.A09 = A002;
        this.A03 = new AnonymousClass9B6(r1, userSession);
    }
}
