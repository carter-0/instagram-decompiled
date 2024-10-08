package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;
import java.util.Map;

/* renamed from: X.ONg  reason: case insensitive filesystem */
public final class C70834ONg {
    public AnonymousClass5D7 A00;
    public ImageView A01;
    public AnonymousClass61R A02;
    public Map A03;
    public final Context A04;
    public final UserSession A05;
    public final RewriteTextBubbleViewPager A06;
    public final View A07;

    public C70834ONg(Context context, View view, UserSession userSession, RewriteTextBubbleViewPager rewriteTextBubbleViewPager) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A06 = rewriteTextBubbleViewPager;
        this.A07 = view;
        this.A04 = context;
        this.A00 = AnonymousClass5D5.A00(userSession);
        this.A03 = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L(context.getString(2131972152), "REPHRASE"), AnonymousClass7TE.A1L(context.getString(2131965815), "FUNNY"), AnonymousClass7TE.A1L(context.getString(2131952298), "EMOJI"), AnonymousClass7TE.A1L(context.getString(2131952342), "PUNS"), AnonymousClass7TE.A1L(context.getString(2131965819), "SARCASTIC"), AnonymousClass7TE.A1L(context.getString(2131965820), "SHORTER"), AnonymousClass7TE.A1L(context.getString(2131962511), "PROOFREAD"), AnonymousClass7TE.A1L(context.getString(2131965821), "SUPPORTIVE")});
        this.A01 = DbU.A0F(view, R.id.loading_animation);
        AnonymousClass61R A002 = C303756Aq.A00(view.getContext(), R.raw.gen_ai_loader_write_with_ai_signals_3s_igd);
        this.A02 = A002;
        ImageView imageView = this.A01;
        if (imageView != null) {
            imageView.setImageDrawable(A002);
        }
    }

    public final void A02(String str, String str2, C62320sa r23, 0sP r24, boolean z) {
        0Df A032;
        String str3 = str2;
        0qQ.A0B(str3, 1);
        UserSession userSession = this.A05;
        1vn A012 = 1vm.A01(userSession);
        0Tu r2 = 0Tu.A05;
        String A042 = 182.A04(r2, userSession, 36886463333401291L);
        String A043 = 182.A04(r2, userSession, 36886463333335754L);
        String str4 = str;
        if (str != null && str4.length() != 0 && A043.length() != 0 && A042.length() != 0 && str3.length() != 0) {
            AnonymousClass0K0 r7 = GraphQlCallInput.A02;
            AnonymousClass5D7 r5 = this.A00;
            if (z) {
                r5.A02("custom");
                A032 = C41845B3m.A03(r7, str3, "custom_modifier");
            } else {
                r5.A02(str3);
                A032 = C41845B3m.A03(r7, this.A03.get(str3), "modifier_type");
            }
            0Df A022 = r7.A02();
            A022.A0E(A032, "write_with_ai");
            0Df A033 = C41845B3m.A03(r7, "IGD__THREAD__WRITE_WITH_AI", "entrypoint");
            2IS A044 = C41845B3m.A04();
            2IS A045 = C41845B3m.A04();
            A044.A04("metagen_key", A043);
            A044.A04("agent_id", A042);
            A044.A04("content", str4);
            A044.A04("role", "USER");
            2IV r6 = A044.A00;
            r6.A02().A0E(A022, "plugin_request_options");
            r6.A02().A0E(A033, "runtime_params");
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGWriteWithAIQuery", A044.getParamsCopy(), A045.getParamsCopy(), C42784BiK.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_genai_platform_agent_sync_chat", AnonymousClass7TE.A1C());
            A00();
            C62320sa r62 = r23;
            0sP r52 = r24;
            A012.ATM(new DFB(this, r62, r52, 2), new DFZ(this, str3, str4, r62, r52), pandoGraphQLRequest, new 0nX(1316683298));
        }
    }

    public final void A00() {
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager = this.A06;
        if (rewriteTextBubbleViewPager != null) {
            AnonymousClass7TF.A16(this.A01);
            if (rewriteTextBubbleViewPager instanceof View) {
                rewriteTextBubbleViewPager.setVisibility(8);
            }
            AnonymousClass61R r0 = this.A02;
            if (r0 != null) {
                r0.EFK();
                r0.E2p();
            }
        }
    }

    public final void A01() {
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager = this.A06;
        if (rewriteTextBubbleViewPager != null) {
            AnonymousClass61R r0 = this.A02;
            if (r0 != null) {
                r0.stop();
            }
            AnonymousClass7TH.A0R(this.A01);
            if (rewriteTextBubbleViewPager instanceof View) {
                rewriteTextBubbleViewPager.setVisibility(0);
            }
        }
    }
}
