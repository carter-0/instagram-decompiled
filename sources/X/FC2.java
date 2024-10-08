package X;

import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

public abstract class FC2 {
    public static C51901G6v A02(UserSession userSession, ChannelCreationSource channelCreationSource, EV0 ev0) {
        ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = new ChannelCreationFlowExtraArgs((CategorySelectionScreenArgs) null, (String) null, (String) null);
        0qQ.A0B(userSession, 0);
        return A00(userSession, channelCreationFlowExtraArgs, channelCreationSource, ev0, false).A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (r5.A02 == null) goto L_0x0030;
     */
    @kotlin.Deprecated(message = "Should only be used internally once already in the creation flow", replaceWith = @kotlin.ReplaceWith(expression = "getInstance", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.F2C A00(com.instagram.common.session.UserSession r4, com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r5, com.instagram.direct.channels.analytics.ChannelCreationSource r6, X.EV0 r7, boolean r8) {
        /*
            X.AnonymousClass7TG.A1N(r4, r6)
            r0 = 3
            android.os.Bundle r0 = X.DbV.A0B(r5, r0)
            X.F2C r3 = new X.F2C
            r3.<init>(r0)
            X.Faa r0 = new X.Faa
            r0.<init>()
            java.util.concurrent.ConcurrentLinkedQueue r2 = r3.A01
            r2.add(r0)
            X.Fab r0 = new X.Fab
            r0.<init>(r6)
            r2.add(r0)
            X.Fac r0 = new X.Fac
            r0.<init>(r4)
            r2.add(r0)
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r5.A02
            r1 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            X.Faf r0 = new X.Faf
            r0.<init>(r4, r1)
            r2.add(r0)
            X.Fae r0 = new X.Fae
            r0.<init>(r4, r7)
            r2.add(r0)
            X.Fad r0 = new X.Fad
            r0.<init>(r5)
            r2.add(r0)
            if (r8 != 0) goto L_0x0057
            android.os.Bundle r0 = r3.A00
            X.Fai r1 = new X.Fai
            r1.<init>(r0, r4)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A02
            r0.add(r1)
        L_0x0057:
            android.os.Bundle r2 = r3.A00
            X.Faj r0 = new X.Faj
            r0.<init>(r2, r4)
            java.util.concurrent.ConcurrentLinkedQueue r1 = r3.A02
            r1.add(r0)
            X.Fal r0 = new X.Fal
            r0.<init>(r2, r4)
            r1.add(r0)
            X.Fak r0 = new X.Fak
            r0.<init>(r2, r4)
            r1.add(r0)
            X.Fah r0 = new X.Fah
            r0.<init>(r2, r4)
            r1.add(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FC2.A00(com.instagram.common.session.UserSession, com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs, com.instagram.direct.channels.analytics.ChannelCreationSource, X.EV0, boolean):X.F2C");
    }

    public static C51901G6v A01(UserSession userSession, ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs, ChannelCreationSource channelCreationSource, EV0 ev0, boolean z) {
        return A00(userSession, channelCreationFlowExtraArgs, channelCreationSource, ev0, z).A00();
    }
}
