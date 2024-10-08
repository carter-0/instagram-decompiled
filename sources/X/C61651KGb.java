package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KGb  reason: case insensitive filesystem */
public final class C61651KGb extends C232232tF {
    public final 02m A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        IgImageView inflate = layoutInflater.inflate(R.layout.ai_sticker_grid_item, viewGroup, false);
        if (inflate != null) {
            return new C60534Jn5(inflate);
        }
        throw AnonymousClass7TE.A11(C273654mx.A00(10));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        C61162JyE jyE = (C61162JyE) r14;
        C60534Jn5 jn5 = (C60534Jn5) r15;
        boolean A1Z = AnonymousClass7TG.A1Z(jyE, jn5);
        IgImageView igImageView = jn5.A00;
        UserSession userSession = this.A01;
        Context context = igImageView.getContext();
        C317966o8 r9 = jyE.A02;
        C369768vI r5 = new C369768vI(context, (RingSpec) null, userSession, r9, C318046oG.AI_STICKER, (AnonymousClass3ID) null, C273654mx.A00(535));
        r5.A04();
        igImageView.setImageDrawable(r5);
        this.A00.markerEnd(31792419, 2);
        C61686KHu.A00(AnonymousClass7TE.A0m(igImageView), this, jyE, A1Z ? 1 : 0);
        27r A012 = 27p.A01(userSession);
        String str = r9.A0S;
        Long A0j = DbS.A0j(jyE.A00);
        String str2 = jyE.A03;
        0Aj A0e = AnonymousClass7TE.A0e(A012.A01, "ig_camera_sticker_impression");
        AnonymousClass283 r52 = A012.A04;
        String str3 = r52.A0L;
        if (A0e.isSampled() && str3 != null) {
            A0e.A8M(C279294yP.STORY, "camera_destination");
            JTO.A1S(A0e, str3);
            AnonymousClass7TH.A0U(A0e);
            A0e.AAJ("sticker_id", str);
            AnonymousClass7TE.A1W(A0e, "sticker_source", 8);
            AnonymousClass7TE.A1W(A0e, "entity_type", A1Z);
            C51965G9l.A1A(r52.A0C, A0e);
            A0e.AAJ("sticker_tray_session_id", r52.A0U);
            A0e.AAJ("browse_session_id", str2);
            JTS.A19(A0e, r52);
            DbY.A1C(A0e);
            A0e.A9F("position", A0j);
            A0e.A8M(C391619tN.A02, "sticker_type");
            A0e.Cgf();
        }
    }

    public final Class modelClass() {
        return C61162JyE.class;
    }

    public C61651KGb(02m r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
