package com.instagram.bugreporter;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C331127Pr;
import X.C331157Pu;
import X.C49680F1n;
import X.C71405Ok4;
import X.C72955PQn;
import X.DbS;
import X.DbT;
import X.JTP;
import X.JTT;
import X.NgK;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BugReportSevereSwitchView extends RelativeLayout {
    public View A00;
    public IgSimpleImageView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgdsSwitch A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BugReportSevereSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final IgTextView getOptionRowDescription() {
        return this.A02;
    }

    public final IgSimpleImageView getOptionRowInfoIcon() {
        return this.A01;
    }

    public final IgTextView getOptionRowSubtitleTextView() {
        return this.A03;
    }

    public final IgdsSwitch getOptionRowSwitch() {
        return this.A05;
    }

    public final IgTextView getOptionRowTitleTextView() {
        return this.A04;
    }

    public final View getOptionRowView() {
        return this.A00;
    }

    public static final Activity A00(BugReportSevereSwitchView bugReportSevereSwitchView) {
        for (Context context = bugReportSevereSwitchView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        throw AnonymousClass7TE.A0z("Unable to get activity");
    }

    public static final boolean A01(BugReportSevereSwitchView bugReportSevereSwitchView, UserSession userSession, C49680F1n f1n, boolean z) {
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0U = new C72955PQn(0, bugReportSevereSwitchView, z);
        C331157Pu A002 = A0W.A00();
        C71405Ok4 ok4 = new C71405Ok4(4, f1n, bugReportSevereSwitchView);
        C71405Ok4 ok42 = new C71405Ok4(3, f1n, bugReportSevereSwitchView);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("SevereBugDescriptionBottomSheetFragment.ARGUMENT_INCLUDE_BUTTONS", z);
        NgK ngK = new NgK();
        ngK.setArguments(A0a);
        ngK.A00 = ok42;
        ngK.A01 = ok4;
        A002.A02(A00(bugReportSevereSwitchView), ngK);
        return true;
    }

    public final void setOptionRowDescription(IgTextView igTextView) {
        this.A02 = igTextView;
    }

    public final void setOptionRowInfoIcon(IgSimpleImageView igSimpleImageView) {
        this.A01 = igSimpleImageView;
    }

    public final void setOptionRowSubtitleTextView(IgTextView igTextView) {
        this.A03 = igTextView;
    }

    public final void setOptionRowSwitch(IgdsSwitch igdsSwitch) {
        this.A05 = igdsSwitch;
    }

    public final void setOptionRowTitleTextView(IgTextView igTextView) {
        this.A04 = igTextView;
    }

    public final void setOptionRowView(View view) {
        this.A00 = view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BugReportSevereSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View inflate = View.inflate(context, R.layout.bugreporter_row_option_layout, this);
        this.A00 = inflate;
        this.A04 = DbT.A0a(inflate, R.id.option_row_title_text_view);
        this.A03 = DbT.A0a(inflate, R.id.option_row_subtitle_text_view);
        this.A05 = (IgdsSwitch) inflate.requireViewById(R.id.option_row_ig_switch);
        this.A01 = JTP.A0T(inflate, R.id.option_row_info_icon);
        this.A02 = DbT.A0a(inflate, R.id.option_row_description);
    }

    public /* synthetic */ BugReportSevereSwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BugReportSevereSwitchView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
