package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import java.util.List;

public final class OVX {
    public AnonymousClass0iw A00;
    public 1wn A01;
    public C71662eb A02;
    public C69670Nps A03;
    public View A04;
    public C67806MvA A05;
    public final 1Ng A06;
    public final UserSession A07;
    public final C74447Pv2 A08;
    public final C66777McN A09;
    public final RecyclerView A0A;

    public static void A00(OVX ovx) {
        C71401Ok0 ok0;
        int i;
        int i2;
        int i3;
        IgdsEmptyState igdsEmptyState;
        View view = ovx.A04;
        view.setVisibility(8);
        C71662eb r8 = ovx.A02;
        r8.A03(8);
        RecyclerView recyclerView = ovx.A0A;
        recyclerView.setVisibility(8);
        C66777McN mcN = ovx.A09;
        if (!mcN.A02) {
            boolean z = mcN.A03;
            UserSession userSession = ovx.A07;
            AnonymousClass0iw r3 = ovx.A00;
            C69670Nps nps = ovx.A03;
            String str = nps.A01;
            String str2 = nps.A02;
            if (!z) {
                AnonymousClass7TG.A1Q(str, str2);
                DbU.A1R(C3265677h.A01(r3, "list_impression_loading", str, str2), userSession);
                view.setVisibility(0);
                return;
            }
            AnonymousClass7TG.A1Q(str, str2);
            DbU.A1R(C3265677h.A01(r3, "list_impression_retry", str, str2), userSession);
            ok0 = C71401Ok0.A00(ovx, 26);
            i = 2131960265;
            i2 = 2131960264;
            i3 = 2131960091;
            r8.A03(0);
            igdsEmptyState = (IgdsEmptyState) r8.A01();
            igdsEmptyState.EZe(0, false);
        } else {
            view.setVisibility(8);
            List A042 = mcN.A04();
            C67806MvA mvA = ovx.A05;
            DbW.A0z(mvA, A042, mvA.A03);
            if (mvA.getItemCount() > 1) {
                recyclerView.setVisibility(0);
                return;
            }
            ok0 = C71401Ok0.A00(ovx, 27);
            i = 2131960093;
            i2 = 2131960092;
            i3 = 2131960266;
            r8.A03(0);
            igdsEmptyState = (IgdsEmptyState) r8.A01();
            igdsEmptyState.EZe(R.drawable.instagram_reply_outline_96, true);
        }
        igdsEmptyState.setHeadline(i);
        igdsEmptyState.setBody(i2);
        igdsEmptyState.ENc(ok0, i3);
    }

    public final void A01() {
        C66777McN mcN = this.A09;
        if (mcN.A02) {
            UserSession userSession = this.A07;
            AnonymousClass0iw r5 = this.A00;
            C69670Nps nps = this.A03;
            String str = nps.A01;
            String str2 = nps.A02;
            String str3 = nps.A00;
            int size = mcN.A04().size();
            AnonymousClass7TG.A1Q(str, str2);
            0xI A012 = C3265677h.A01(r5, "list_impression", str, str2);
            A012.A08(Integer.valueOf(size), "count");
            if (str3 != null) {
                A012.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
            }
            DbU.A1R(A012, userSession);
        }
    }

    public OVX(View view, RecyclerView recyclerView, AnonymousClass0iw r7, UserSession userSession, C71662eb r9, C69670Nps nps, C74447Pv2 pv2, C66777McN mcN) {
        this.A07 = userSession;
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        this.A06 = A002;
        this.A08 = pv2;
        this.A0A = recyclerView;
        this.A09 = mcN;
        this.A02 = r9;
        this.A04 = view;
        Context context = recyclerView.getContext();
        recyclerView.A0S = true;
        DbV.A1B(context, recyclerView);
        C67806MvA mvA = new C67806MvA(context, userSession, pv2);
        this.A05 = mvA;
        recyclerView.setAdapter(mvA);
        this.A00 = r7;
        this.A03 = nps;
        recyclerView.A11(new C67830MvY(AnonymousClass7TF.A03(context, R.attr.igds_color_elevated_separator), DbS.A03(recyclerView.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding)));
        C71932OtG A003 = C71932OtG.A00(this, 14);
        this.A01 = A003;
        A002.A01(A003, C67583MqH.class);
        A00(this);
    }
}
