package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.question.model.QuestionResponsesModel;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.Uep  reason: case insensitive filesystem */
public final class C15561Uep extends C231632rz {
    public final AnonymousClass07V A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final ReelDashboardFragment A03;
    public final Integer A04;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((QuestionResponsesModel) obj).A08.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return ((QuestionResponsesModel) obj).A00;
    }

    public C15561Uep(AnonymousClass07V r1, AnonymousClass0iw r2, UserSession userSession, ReelDashboardFragment reelDashboardFragment, Integer num) {
        this.A00 = r1;
        this.A02 = userSession;
        this.A03 = reelDashboardFragment;
        this.A04 = num;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(1790784485);
        UAU uau = new UAU(this.A00, this.A01, this.A02, this.A03, this.A04);
        ((RecyclerView) view).setAdapter(uau);
        uau.A00 = (QuestionResponsesModel) obj;
        List list = uau.A02;
        list.clear();
        list.addAll(uau.A00.A0A);
        UAU.A00(uau);
        AnonymousClass0fD.A0A(-1953902624, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(583779263);
        Context context = viewGroup.getContext();
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.reels_question_responses_list, viewGroup, false);
        DbV.A1A(context, recyclerView);
        AnonymousClass0fD.A0A(1228259415, A032);
        return recyclerView;
    }
}
