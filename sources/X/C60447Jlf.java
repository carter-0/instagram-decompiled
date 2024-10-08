package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.Jlf  reason: case insensitive filesystem */
public final class C60447Jlf extends 2Rw implements MUQ {
    public final Context A00;
    public final UserSession A01;
    public final C63670L2g A02;
    public final MUQ A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final boolean A05;

    public C60447Jlf(Context context, UserSession userSession, C63670L2g l2g, MUQ muq, boolean z) {
        DbW.A1N(userSession, 2, l2g);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = z;
        this.A03 = muq;
        this.A02 = l2g;
    }

    public final void DD2(UpcomingEvent upcomingEvent) {
        this.A03.DD2(upcomingEvent);
        C310286ak A002 = C310266ai.A00(this.A01);
        String id = upcomingEvent.getId();
        0qQ.A0B(id, 0);
        A002.A00.remove(id);
        A002.A01.add(id);
        this.A04.remove(upcomingEvent.getId());
        notifyDataSetChanged();
    }

    public final void onBindViewHolder(C249703kE r9, int i) {
        if (JTP.A07(this, r9, 0, i) != 0) {
            View view = r9.itemView;
            LY5.A01(view, 15, this);
            2eS.A01(view);
            return;
        }
        C60515Jmm jmm = (C60515Jmm) r9;
        UserSession userSession = this.A01;
        UpcomingEvent A002 = C310266ai.A00(userSession).A00(AnonymousClass7TE.A19(this.A04, i));
        if (A002 == null) {
            jmm.itemView.setVisibility(8);
            return;
        }
        jmm.itemView.setVisibility(0);
        jmm.A02.setText(A002.getTitle());
        Context context = this.A00;
        String A022 = C14240TsN.A02(context, userSession, C18810W3l.A02(A002));
        TextView textView = jmm.A01;
        int i2 = 2131976027;
        if (C18810W3l.A0B(A002)) {
            i2 = 2131976026;
        }
        JTR.A18(context, textView, context.getString(i2), A022, 2131961766);
        TextView textView2 = jmm.A00;
        textView2.setVisibility(0);
        LY7.A00(jmm.itemView, 53, A002, this);
        LY7.A00(textView2, 54, A002, this);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.3kE, X.Jmm] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.3kE, X.Jmj] */
    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            View A0D = DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.upcoming_event_item, false);
            ? r2 = new C249703kE(A0D);
            r2.A02 = AnonymousClass7TG.A0R(A0D, R.id.event_name);
            r2.A01 = AnonymousClass7TG.A0R(A0D, R.id.event_details);
            r2.A00 = AnonymousClass7TG.A0R(A0D, R.id.edit_button);
            return r2;
        } else if (i == 1) {
            View A0D2 = DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.new_upcoming_event_item, false);
            ? r22 = new C249703kE(A0D2);
            r22.A00 = A0D2;
            return r22;
        } else {
            throw AnonymousClass7TE.A0z(AnonymousClass000.A00(4152));
        }
    }

    public static final void A00(C60447Jlf jlf, MUQ muq, UpcomingEvent upcomingEvent) {
        K4S k4s = jlf.A02.A00;
        C62569Khz khz = k4s.A00;
        if (khz == null) {
            0qQ.A0F("priorSurface");
            throw AnonymousClass00P.createAndThrow();
        } else if (khz.A00) {
            C59888JbD.A01(AnonymousClass7TE.A0l(k4s.A05), new KPW(muq, upcomingEvent, true));
        } else {
            K6D k6d = new K6D();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable("prior_surface", C62569Khz.UPCOMING_EVENTS_LIST);
            A0a.putParcelable("initial_upcoming_event", upcomingEvent);
            k6d.setArguments(A0a);
            k6d.A06 = muq;
            k6d.A01 = k4s.A04;
            Dbc.A0S(k6d, k4s.requireActivity(), k4s.A05);
        }
    }

    public final void DD1(UpcomingEvent upcomingEvent) {
        this.A03.DD1(upcomingEvent);
        C310266ai.A00(this.A01).A01(upcomingEvent);
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(855619134);
        int size = this.A04.size() + 1;
        AnonymousClass0fD.A0A(333155569, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-57844363);
        int i2 = 1;
        if (i < this.A04.size()) {
            i2 = 0;
        }
        AnonymousClass0fD.A0A(441404165, A032);
        return i2;
    }
}
