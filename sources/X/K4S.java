package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class K4S extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UpcomingEventsListFragment";
    public C62569Khz A00;
    public MUQ A01;
    public C60447Jlf A02;
    public List A03;
    public final C63670L2g A04 = new C63670L2g(this);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return "upcoming_events_list";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LY5.A01(view.requireViewById(R.id.action_bar_button_cancel), 16, this);
        DbT.A18(requireContext(), AnonymousClass7TG.A0R(view, R.id.title), 2131971951);
        RecyclerView A0c = JTR.A0c(view, R.id.events_list);
        DbY.A16(this, A0c);
        C60447Jlf jlf = this.A02;
        if (jlf == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            A0c.setAdapter(jlf);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public static final void A00(K4S k4s) {
        if (k4s.isAdded() && AnonymousClass06S.A01(k4s.getParentFragmentManager())) {
            JTS.A0z(k4s);
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-2000081394);
        K4S.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("prior_surface");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.upcomingevents.creation.enums.UpcomingEventEntryPoint");
        this.A00 = (C62569Khz) serializable;
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList("upcoming_event_ids");
        C320236s2.A03(requireArguments, stringArrayList, "upcoming_event_ids");
        this.A03 = stringArrayList;
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A05);
        C62569Khz khz = this.A00;
        if (khz == null) {
            str = "priorSurface";
        } else {
            boolean z = khz.A00;
            MUQ muq = this.A01;
            if (muq != null) {
                C60447Jlf jlf = new C60447Jlf(requireContext, A0l, this.A04, muq, z);
                List list = this.A03;
                if (list == null) {
                    str = "upcomingEventIds";
                } else {
                    C310286ak A002 = C310266ai.A00(jlf.A01);
                    List list2 = jlf.A04;
                    list2.clear();
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : list) {
                        if (A002.A00((String) next) != null) {
                            A1C.add(next);
                        }
                    }
                    list2.addAll(A1C);
                    jlf.notifyDataSetChanged();
                    this.A02 = jlf;
                    AnonymousClass0fD.A09(510490596, A022);
                    return;
                }
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(-1887191215, A022);
                throw A0y;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-214912475);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.upcoming_events_list, viewGroup, false);
        AnonymousClass0fD.A09(1639563326, A022);
        return inflate;
    }
}
