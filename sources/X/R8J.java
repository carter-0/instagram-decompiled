package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

public final class R8J extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EventInfoStringFragment";
    public TextView A00;
    public ScrollView A01;
    public AnalyticsEventDebugInfo A02;
    public final String A03 = "dict_debug";
    public final AnonymousClass0eM A04 = C227642jf.A01(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        AnalyticsEventDebugInfo analyticsEventDebugInfo = this.A02;
        if (analyticsEventDebugInfo == null) {
            0qQ.A0F("analyticsEventDebugInfo");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.setTitle(analyticsEventDebugInfo.A00);
        r3.Eu4(true);
        r3.AA8("COPY", new C11495SbI(this, 1));
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-337325863);
        R8J.super.onCreate(bundle);
        this.A02 = C320236s2.A00(requireArguments(), AnalyticsEventDebugInfo.class, "EventInfoFragment.EventInfo");
        AnonymousClass0fD.A09(2006611628, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1098474441);
        0qQ.A0B(layoutInflater, 0);
        R8J.super.onCreateView(layoutInflater, viewGroup, bundle);
        this.A01 = new ScrollView(getActivity());
        TextView textView = new TextView(getActivity());
        this.A00 = textView;
        AnalyticsEventDebugInfo analyticsEventDebugInfo = this.A02;
        if (analyticsEventDebugInfo == null) {
            str = "analyticsEventDebugInfo";
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("{\n");
            AnalyticsEventDebugInfo.A03(analyticsEventDebugInfo, "| ", A1A, true);
            textView.setText(AnonymousClass7TF.A0l("}", A1A));
            TextView textView2 = this.A00;
            str = "textView";
            if (textView2 != null) {
                textView2.setTextSize(12.0f);
                TextView textView3 = this.A00;
                if (textView3 != null) {
                    textView3.setLineSpacing(5.0f, 1.0f);
                    TextView textView4 = this.A00;
                    if (textView4 != null) {
                        textView4.setPadding(50, 50, 50, 50);
                        ScrollView scrollView = this.A01;
                        if (scrollView != null) {
                            TextView textView5 = this.A00;
                            if (textView5 != null) {
                                scrollView.addView(textView5);
                                ScrollView scrollView2 = this.A01;
                                if (scrollView2 != null) {
                                    AnonymousClass0fD.A09(-373379740, A022);
                                    return scrollView2;
                                }
                            }
                        }
                        0qQ.A0F("scrollView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
