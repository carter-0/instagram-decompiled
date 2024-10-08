package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.W4t  reason: case insensitive filesystem */
public final class C18831W4t implements DialogInterface.OnClickListener {
    public final /* synthetic */ C45417Cvx A00;
    public final /* synthetic */ AnonymousClass3GD A01;

    public C18831W4t(C45417Cvx cvx, AnonymousClass3GD r2) {
        this.A01 = r2;
        this.A00 = cvx;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.U5b, android.widget.RelativeLayout, android.view.View, android.view.ViewGroup] */
    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass3GD r1 = this.A01;
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C46659Dig A002 = new FF8(r1.A09, R.layout.results_dialog, R.style.SurveyResultsDialog).A00();
        0qQ.A07(A002);
        C45417Cvx cvx = this.A00;
        ViewGroup viewGroup = (ViewGroup) A002.findViewById(R.id.resultsList);
        View findViewById = A002.findViewById(R.id.action_bar_textview_title);
        0qQ.A0C(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        C66581MXm.A15(A002.getContext(), (TextView) findViewById, 2131974822);
        WB9.A00(A002.findViewById(R.id.action_bar_button_back), 19, A002);
        for (VZT vzt : cvx.A04) {
            View inflate = LayoutInflater.from(A002.getContext()).inflate(R.layout.result_row, (ViewGroup) null);
            AnonymousClass7TE.A0d(inflate, R.id.question_header).setText(vzt.A03);
            ViewGroup A0E = DbS.A0E(inflate, R.id.answer_list);
            for (VY0 answer : vzt.A04) {
                Context context = A002.getContext();
                0qQ.A07(context);
                ? relativeLayout = new RelativeLayout(context, (AttributeSet) null);
                View.inflate(context, R.layout.result_row_view, relativeLayout);
                Resources resources = context.getResources();
                Paint paint = new Paint();
                AnonymousClass7TE.A1N(context, paint, R.color.grey_1);
                C13988Tno.A0u(resources, paint, R.dimen.abc_action_bar_elevation_material);
                relativeLayout.A00 = paint;
                Paint paint2 = new Paint();
                AnonymousClass7TE.A1N(context, paint2, R.color.result_bar_active_color);
                C13988Tno.A0u(resources, paint2, R.dimen.abc_action_bar_elevation_material);
                relativeLayout.A01 = paint2;
                relativeLayout.A03 = DbU.A0G(relativeLayout, R.id.response);
                relativeLayout.A02 = DbU.A0G(relativeLayout, R.id.percent);
                relativeLayout.setAnswer(answer);
                relativeLayout.setTotalQuestionResponders(vzt.A00);
                A0E.addView(relativeLayout);
            }
            TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.question_footer);
            String A0d2 = DbY.A0d(A002.getContext().getResources(), vzt.A00, R.plurals.x_survey_question_responders);
            0qQ.A07(A0d2);
            A0d.setText(A0d2);
            viewGroup.addView(inflate);
        }
        AnonymousClass0fN.A00(A002);
    }
}
