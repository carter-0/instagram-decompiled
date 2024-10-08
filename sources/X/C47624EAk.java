package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.EAk  reason: case insensitive filesystem */
public final class C47624EAk extends C231632rz {
    public final ReelDashboardFragment A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        DUR A002 = C14628Tza.A00((C255773uh) obj);
        A002.getClass();
        String fundraiserId = A002.getFundraiserId();
        fundraiserId.getClass();
        return fundraiserId.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        DUR A002 = C14628Tza.A00((C255773uh) obj);
        A002.getClass();
        String AbN = A002.AbN();
        AbN.getClass();
        return AbN.hashCode();
    }

    public C47624EAk(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        int A03 = AnonymousClass0fD.A03(-2089600162);
        EyD eyD = (EyD) DbT.A0o(view);
        DUR A002 = C14628Tza.A00((C255773uh) obj);
        A002.getClass();
        C46295DTy AyW = A002.AyW();
        AyW.getClass();
        boolean z = !AnonymousClass3S1.A04(AyW.AyX());
        C71662eb r0 = eyD.A02;
        if (z) {
            r0.A03(0);
            View A01 = r0.A01();
            DbU.A0G(A01, R.id.fundraiser_results_summary_amount_raised_text).setText(A002.AbN());
            FP2.A00(A01.requireViewById(R.id.fundraiser_results_summary_amount_raised_disclaimer_icon), 23, this);
            textView = eyD.A01;
            0nA.A0c(textView, 0);
        } else {
            r0.A02();
            textView = eyD.A01;
            0nA.A0c(textView, AnonymousClass7TG.A02(eyD.A00));
        }
        User Amt = A002.Amt();
        Amt.getClass();
        String username = Amt.getUsername();
        Context context = eyD.A00;
        int i2 = 2131971485;
        if (z) {
            i2 = 2131971484;
        }
        AnonymousClass7AV.A07(new C46684DjD(2, this, Amt), textView, username, DbW.A0h(context, username, i2));
        AnonymousClass0fD.A0A(1412637494, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(228837986);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.reel_dashboard_fundraiser_results_summary);
        A0C.setTag(new EyD(A0C));
        AnonymousClass0fD.A0A(-1030161487, A03);
        return A0C;
    }
}
