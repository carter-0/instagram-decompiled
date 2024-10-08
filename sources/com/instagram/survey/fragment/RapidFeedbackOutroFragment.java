package com.instagram.survey.fragment;

import X.0qQ;
import X.1NM;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C16524UwT;
import X.C18441Vrk;
import X.C18635VvW;
import X.C227642jf;
import X.C320236s2;
import X.DbS;
import X.DbT;
import X.Dbc;
import X.U46;
import X.VI4;
import X.WB0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class RapidFeedbackOutroFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public String A00;
    public Long A01;
    public Long A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final long A04 = System.currentTimeMillis();
    public View rootView;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eu4(false);
        r4.Eom(2131971298);
        r4.ErD(new WB0(this, 22), R.drawable.instagram_check_pano_outline_24);
    }

    public final String getModuleName() {
        return "RapidFeedbackOutroFragment";
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.Urk, X.Vrk, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.rootView;
        if (view2 != null) {
            AbsListView absListView = (AbsListView) AnonymousClass7TF.A0F(AnonymousClass7TF.A0G(view2, R.id.rapidfeedback_page), R.id.rapidfeedback_page_list);
            Context context = getContext();
            if (context != null) {
                ArrayList arrayList = new ArrayList();
                String str = this.A00;
                if (str == null) {
                    0qQ.A0F("outroToast");
                    throw AnonymousClass00P.createAndThrow();
                }
                ? vrk = new C18441Vrk(C16524UwT.MESSAGE, "");
                vrk.A00 = str;
                arrayList.add(vrk);
                absListView.setAdapter(new U46(context, arrayList));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2119421527);
        RapidFeedbackOutroFragment.super.onCreate(bundle);
        this.A00 = C320236s2.A01(requireArguments(), "ARG_TOAST_TEXT");
        this.A02 = C13988Tno.A0T(requireArguments(), "ARG_SURVEY_START_TIME");
        this.A01 = C13988Tno.A0T(requireArguments(), "ARG_PAGE_ID");
        Dbc.A0p(this);
        AnonymousClass0fD.A09(-1223269361, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(647407664);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.rapidfeedback_outro_view, viewGroup, false);
        this.rootView = inflate;
        AnonymousClass0fD.A09(-146751303, A022);
        return inflate;
    }

    public final void onDestroyView() {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-430863931);
        super.onDestroyView();
        AnonymousClass0eM r1 = this.A03;
        if (1NM.A02(AnonymousClass7TE.A0l(r1))) {
            C18635VvW A002 = VI4.A00(AnonymousClass7TE.A0l(r1));
            Long l = this.A02;
            if (l != null) {
                long longValue = l.longValue();
                long j = this.A04;
                Long l2 = this.A01;
                if (l2 != null) {
                    A002.A01(longValue, j, l2.longValue(), false);
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i = 964567427;
                }
            } else {
                illegalStateException = new IllegalStateException("Required value was null.");
                i = 1052709127;
            }
            AnonymousClass0fD.A09(i, A022);
            throw illegalStateException;
        }
        this.rootView = null;
        AnonymousClass0fD.A09(1264411690, A022);
    }
}
