package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.video.live.mvvm.view.postlive.IgLiveExploreLiveBaseFragment;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;

public final class LOO {
    public View A00;
    public View A01;
    public C313756gx A02;
    public LGO A03;
    public AnonymousClass3NV A04;
    public IgLiveExploreLiveBaseFragment A05;
    public M0Y A06;
    public String A07;
    public String A08;
    public String A09;
    public IgdsMediaButton A0A;
    public IgdsMediaButton A0B;
    public final Context A0C;
    public final DialogInterface.OnClickListener A0D = LV2.A00(this, 56);
    public final ViewStub A0E;
    public final 1wn A0F = new LgJ(this, 15);
    public final UserSession A0G;
    public final AnonymousClass37D A0H;
    public final ViewStub A0I;
    public final AnonymousClass4DH A0J;

    public final void A01(C65816M0i m0i) {
        View view = this.A00;
        if (view == null) {
            View inflate = this.A0I.inflate();
            this.A00 = inflate;
            this.A0B = (IgdsMediaButton) inflate.requireViewById(R.id.iglive_end_confirmation);
            this.A0A = (IgdsMediaButton) this.A00.requireViewById(R.id.iglive_end_cancel);
            2eS.A01(this.A0B);
            2eS.A01(this.A0A);
            LY2.A00(this.A0B, 16, this, m0i);
            LY3.A00(this.A0A, 5, this);
        } else {
            view.setVisibility(0);
        }
        this.A00.setImportantForAccessibility(2);
        TextView A0G2 = DbU.A0G(this.A00, R.id.iglive_end_live_video_ended_text_alternate);
        2eQ.A06(A0G2, 500);
        2eQ.A07(A0G2, A0G2.getText());
    }

    public LOO(View view, View view2, AnonymousClass4DH r5, UserSession userSession, LGO lgo, AnonymousClass3NV r8, String str, String str2) {
        this.A0J = r5;
        this.A0G = userSession;
        Context context = r5.getContext();
        this.A0C = context;
        this.A0E = DbS.A0F(view, R.id.iglive_capture_rights_manager_end_screen_stub);
        this.A0I = DbS.A0F(view, R.id.iglive_capture_end_confirmation_stub);
        this.A01 = view2;
        this.A0H = AnonymousClass37D.A00.A02(context);
        this.A04 = r8;
        this.A08 = str;
        this.A09 = str2;
        this.A03 = lgo;
        this.A02 = C313746gw.A00(userSession);
    }

    public static void A00(LOO loo, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel, String str, String str2, String str3, String str4, List list, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        UserSession userSession;
        View view;
        boolean z6;
        W0T A002;
        System.nanoTime();
        LOO loo2 = loo;
        boolean z7 = z2;
        boolean z8 = z5;
        boolean z9 = z3;
        ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel2 = existingStandaloneFundraiserForFeedModel;
        boolean z10 = z4;
        String str5 = str2;
        String str6 = str4;
        List list2 = list;
        long j3 = j;
        long j4 = j2;
        boolean z11 = z;
        if (loo2.A05 == null) {
            C2601144i.A00();
            userSession = loo2.A0G;
            Context context = loo2.A0C;
            view = loo2.A01;
            boolean A1b = AnonymousClass7TE.A1b(list2);
            AnonymousClass3NV r1 = loo2.A04;
            C357488Yc A012 = C357488Yc.A03.A01(loo2.A03.A06);
            if (A012 == null || (A002 = A012.A00()) == null) {
                z6 = true;
            } else {
                z6 = A002.A0K();
            }
            0qQ.A0B(userSession, 0);
            String str7 = str;
            C51974G9v.A1P(context, view, str7, str5);
            Bundle A0B2 = DbV.A0B(r1, 12);
            A0B2.putBoolean("ARG_IS_POLICY_VIOLATION", z11);
            A0B2.putBoolean("ARG_IS_CONTNET_MONETIZATION_POLICY_VIOLATION", z7);
            A0B2.putBoolean("ARG_HAS_BRAND_PARTNERS", A1b);
            A0B2.putString("ARG_SOURCE_BROADCAST_ID", str7);
            A0B2.putString("ARG_SOURCE_MEDIA_ID", str5);
            A0B2.putString("ARG_SOURCE_THREAD_ID", str3);
            A0B2.putBoolean("ARG_IS_SSI_CHECKPOINTED", z9);
            A0B2.putBoolean("ARG_IS_LIVE_BLOCKED", z10);
            A0B2.putString("ARG_LIVE_VISIBILITY_MODE", r1.A01);
            A0B2.putLong("ARG_LIVE_DURATION_MS", j3);
            A0B2.putString("ARG_LIVE_TITLE", str6);
            A0B2.putLong("ARG_LIVE_CREATION_DATE", j4);
            A0B2.putBoolean("ARG_IS_MODERATED_SESSION", z8);
            A0B2.putBoolean("ARG_ARE_GLASSES_IN_USE", !z6);
            if (existingStandaloneFundraiserForFeedModel != null) {
                A0B2.putParcelable("ARG_FUNDRAISER_INFO", existingStandaloneFundraiserForFeedModel2);
            }
            C2601144i.A00();
            C62260Kcu kcu = new C62260Kcu();
            kcu.setArguments(A0B2);
            0qQ.A0C(kcu, "null cannot be cast to non-null type com.instagram.video.live.mvvm.view.postlive.IgLivePostLiveBroadcasterFragment");
            LDJ ldj = new LDJ(userSession);
            ldj.A00(context, view, kcu);
            kcu.A04 = ldj;
            loo2.A05 = kcu;
            kcu.A00 = new C63686L2w(loo2);
        } else {
            userSession = loo2.A0G;
            LDJ ldj2 = new LDJ(userSession);
            IgLiveExploreLiveBaseFragment igLiveExploreLiveBaseFragment = loo2.A05;
            if (igLiveExploreLiveBaseFragment instanceof C62260Kcu) {
                M0Z m0z = ((C62260Kcu) igLiveExploreLiveBaseFragment).A03;
                if (m0z != null) {
                    M0Z.A04(m0z);
                }
                C62260Kcu kcu2 = (C62260Kcu) loo2.A05;
                kcu2.A04 = ldj2;
                kcu2.A0A = z8;
                M0Z m0z2 = kcu2.A03;
                if (m0z2 != null) {
                    m0z2.A05 = z8;
                    M0Z.A04(m0z2);
                }
            }
            Context context2 = loo2.A0C;
            IgLiveExploreLiveBaseFragment igLiveExploreLiveBaseFragment2 = loo2.A05;
            view = loo2.A01;
            ldj2.A00(context2, view, igLiveExploreLiveBaseFragment2);
        }
        AnonymousClass1Nd.A00(userSession).A01(loo2.A0F, C64671Lfx.class);
        view.setOnTouchListener(new C18903WBw(loo2, existingStandaloneFundraiserForFeedModel2, str5, str3, str6, list2, j3, j4, z11, z7, z9, z10, z8));
    }
}
