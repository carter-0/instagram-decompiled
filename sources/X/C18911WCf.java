package X;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

/* renamed from: X.WCf  reason: case insensitive filesystem */
public final class C18911WCf implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C45417Cvx A00;
    public final /* synthetic */ AnonymousClass3GD A01;

    public C18911WCf(C45417Cvx cvx, AnonymousClass3GD r2) {
        this.A01 = r2;
        this.A00 = cvx;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass3GD r4 = this.A01;
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        if (r4.A06) {
            C45417Cvx cvx = this.A00;
            VZT vzt = (VZT) cvx.A04.get(r4.A00);
            if (vzt.A01 == AnonymousClass05K.A01) {
                VY0 vy0 = (VY0) vzt.A04.get(i);
                vy0.A03 = !vy0.A03;
                Adapter adapter = adapterView.getAdapter();
                0qQ.A0C(adapter, "null cannot be cast to non-null type com.instagram.feed.survey.MultiQuestionSurveyAdapter");
                ((C15451Ud2) adapter).A0C();
                return;
            }
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            0qQ.A0C(itemAtPosition, "null cannot be cast to non-null type com.instagram.feed.model.MultiQuestionSurvey.PossibleAnswer");
            VY0 vy02 = (VY0) itemAtPosition;
            vy02.A00++;
            AnonymousClass3GD.A01(cvx, r4, new String[]{vy02.A02});
        }
    }
}
