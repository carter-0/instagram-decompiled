package X;

import android.content.Context;
import com.facebook.rsys.devxagent.gen.DevXAgentAppProxy;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.NCw  reason: case insensitive filesystem */
public final class C68369NCw extends DevXAgentAppProxy {
    public final Context A00;
    public final UserSession A01;
    public final O9J A02;
    public final 2Dm A03;

    public final void appCommand(String str) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0017: MOVE  (r4v2 androidx.fragment.app.FragmentActivity) = (r4v1 androidx.fragment.app.FragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void startCall(com.facebook.rsys.devxagent.gen.DevXAgentCallStartParams r11) {
        /*
            r10 = this;
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.lang.String r0 = r11.userid
            java.lang.Long r1 = X.DbZ.A0d(r0)
            boolean r0 = r11.metaAiCall
            r5 = r10
            if (r0 == 0) goto L_0x0039
            X.2ZQ r4 = X.C71172bH.A00()
            boolean r0 = r4 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0038
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            if (r4 == 0) goto L_0x0038
            r0 = 2131435221(0x7f0b1ed5, float:1.8492278E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 != 0) goto L_0x0030
            X.1pC r3 = X.C69997Nvb.A00()
            android.content.Context r2 = r10.A00
            r1 = 0
            java.lang.String r0 = "all"
            r3.A00(r2, r1, r0)
        L_0x0030:
            X.PZo r0 = new X.PZo
            r0.<init>(r4, r10)
            X.11Z.A03(r0)
        L_0x0038:
            return
        L_0x0039:
            if (r1 == 0) goto L_0x007f
            long r6 = r1.longValue()
            boolean r8 = r11.isVideo
            boolean r9 = r11.creatorAiCall
            com.instagram.common.session.UserSession r0 = r10.A01
            X.17i r0 = X.17h.A00(r0)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            com.instagram.user.model.User r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x007b
            X.O9J r0 = r10.A02
            X.0qQ.A0B(r1, r2)
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "users/user_by_fbid/"
            r2.A0A(r0)
            java.lang.String r0 = "user_fbid"
            r2.A9m(r0, r1)
            java.lang.Class<X.DvP> r1 = X.DvP.class
            java.lang.Class<X.F7w> r0 = X.C49809F7w.class
            X.1OC r0 = X.DbU.A0S(r2, r1, r0)
            X.NM3 r4 = new X.NM3
            r4.<init>(r5, r6, r8, r9)
            r0.A00 = r4
            X.1ES.A03(r0)
            return
        L_0x007b:
            r10.A00(r6, r8, r9)
            return
        L_0x007f:
            java.lang.String r0 = r11.userid
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "IgDevXAgentAppProxy"
            java.lang.String r0 = "Invalid peer ID provided: %s. Cannot start call from DevXAgent."
            X.0KC.A0P(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68369NCw.startCall(com.facebook.rsys.devxagent.gen.DevXAgentCallStartParams):void");
    }

    public final void A00(long j, boolean z, boolean z2) {
        C331537Rj r4;
        String str;
        UserSession userSession = this.A01;
        User A022 = 17h.A00(userSession).A02(String.valueOf(j));
        if (A022 == null) {
            str = "Could not retrieve user for peer ID provided. Cannot start call from DevXAgent.";
        } else {
            2Dm r1 = this.A03;
            List A0n = DbW.A0n(A022);
            0qQ.A07(A0n);
            AnonymousClass3U9 BYg = r1.BYg((CreatorBroadcastThreadInfo) null, (String) null, (String) null, A0n);
            if (BYg.BJz().A00 == null) {
                str = "Could not retrieve threadId for peer user provided. Cannot start call from DevXAgent.";
            } else {
                Long BST = A022.BST();
                if (BST == null) {
                    str = "Could not retrieve EIMU ID for peer ID provided. Cannot start call from DevXAgent.";
                } else {
                    0sn r14 = 0sn.A00;
                    RtcCallAudience rtcCallAudience = new RtcCallAudience(DbS.A0V(""), "", "", userSession.A06, r14, AnonymousClass7TE.A1I(BST.toString()), false);
                    C69277Nid nid = C69277Nid.NO_E2EE;
                    if (z2) {
                        r4 = C331537Rj.CREATOR_AI_CANONICAL_THREAD;
                    } else {
                        r4 = C331537Rj.DEVXAGENT_INTERNAL;
                    }
                    RtcCreateCallArgs rtcCreateCallArgs = new RtcCreateCallArgs((C69465Nm9) null, nid, rtcCallAudience, (RtcCallFunnelSessionId) null, new RtcCallSource((C69465Nm9) null, r4, new RtcThreadKey(BYg.BJz(), (String) null, (String) null, (String) null)), (RtcIgNotification) null, (RtcStartCoWatchPlaybackArguments) null, (String) null, -1, z, false, false);
                    Context context = this.A00;
                    0kR.A0B(context, C70319O1x.A00(context, userSession, rtcCreateCallArgs));
                    return;
                }
            }
        }
        0KC.A0D("IgDevXAgentAppProxy", str);
    }

    public C68369NCw(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = 1bJ.A00(userSession);
        this.A02 = new O9J(userSession);
    }
}
