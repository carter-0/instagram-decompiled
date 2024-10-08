package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.UaH  reason: case insensitive filesystem */
public final class C15310UaH extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ProfileWizardHostingFragment";
    public int A00;
    public int A01;
    public View A02;
    public ProgressBar A03;
    public 2da A04;
    public UserSession A05;
    public final View.OnClickListener A06 = new WBA((Object) this, 57);
    public final C17950Vih A07 = new Object();

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        this.A04 = r4;
        int i = requireArguments().getInt("extra_number_of_steps", -1);
        this.A01 = i;
        if (i != -1) {
            r4.Eom(2131956466);
            r4.Eu4(true);
            AnonymousClass3JR r2 = new AnonymousClass3JR();
            r2.A0K = getString(2131973923);
            r2.A0G = new WBA((Object) this, 58);
            this.A02 = C51970G9q.A0P(r2, r4);
            View A7q = r4.A7q(R.layout.layout_profile_wizard_progress);
            0qQ.A0C(A7q, C273654mx.A00(2));
            ProgressBar progressBar = (ProgressBar) A7q.requireViewById(R.id.profile_wizard_progress);
            this.A03 = progressBar;
            if (progressBar != null) {
                progressBar.setMax(this.A01);
            }
            A00(this, this.A00);
            return;
        }
        throw new IllegalStateException("extra_number_of_steps must be provided as Fragment's arguments.");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        1WW r3 = 1WW.A00;
        if (r3 != null) {
            Iterator it = r3.A03().iterator();
            while (it.hasNext()) {
                if (AnonymousClass7TE.A18(it).equals("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93")) {
                    bundle.putString("ProfileWizardPlugin_CurrentSavedStepName", r3.A02("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"));
                    return;
                }
            }
            return;
        }
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        if (bundle == null) {
            C17950Vih vih = this.A07;
            if (requireArguments.getString("DynamicFlowPlugin.extraFlowId") != null) {
                vih.A01(requireArguments, (Object) null);
            }
        }
    }

    public static final void A00(C15310UaH uaH, int i) {
        int i2;
        AnonymousClass3JR A0K;
        int i3;
        uaH.A00 = i;
        ProgressBar progressBar = uaH.A03;
        if (progressBar != null) {
            progressBar.setProgress(i + 1);
            int i4 = uaH.A00;
            int i5 = uaH.A01 - 1;
            View view = uaH.A02;
            if (i4 < i5) {
                if (view != null) {
                    i2 = 0;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (view != null) {
                i2 = 8;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            view.setVisibility(i2);
            int i6 = uaH.A00;
            2da r2 = uaH.A04;
            if (i6 == 0) {
                if (r2 != null) {
                    A0K = DbX.A0M();
                    A0K.A0G = uaH.A06;
                    i3 = 2131956164;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (r2 != null) {
                A0K = DbV.A0K();
                A0K.A0G = uaH.A06;
                i3 = 2131953555;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            A0K.A05 = i3;
            r2.ErG(new AnonymousClass3Jb(A0K));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(3805);
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A05;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        Bundle requireArguments = requireArguments();
        Integer num = AnonymousClass05K.A0Y;
        UserSession userSession = this.A05;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        C17950Vih vih = this.A07;
        String string = requireArguments.getString("DynamicFlowPlugin.extraFlowId");
        1WR A012 = 1WR.A01();
        if (string == null) {
            string = "";
        }
        String A022 = A012.A02(string);
        0qQ.A07(A022);
        F74.A01(userSession, num, A022);
        AnonymousClass4DR A0P = getChildFragmentManager().A0P(R.id.content_panel);
        if ((A0P instanceof AnonymousClass4DR) && A0P.onBackPressed()) {
            return true;
        }
        if (requireArguments.getString("DynamicFlowPlugin.extraFlowId") == null) {
            return false;
        }
        vih.A00(requireArguments, (Object) null);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        FragmentActivity activity;
        int A022 = AnonymousClass0fD.A02(1963845605);
        C15310UaH.super.onCreate(bundle);
        requireArguments();
        this.A05 = DbX.A0U(this);
        if (!(bundle == null || (activity = getActivity()) == null)) {
            1WW r4 = 1WW.A00;
            if (r4 != null) {
                UserSession A0U = DbX.A0U(this);
                if (1WR.A01().A01.get("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93") == null) {
                    if (bundle.getString("ProfileWizardPlugin_CurrentSavedStepName") != null) {
                        new C309516Yo(activity, A0U).A0G(V1b.ENTRY_POINT.toString(), 1);
                    }
                    r4.A07(activity, A0U);
                }
            } else {
                0qQ.A0F("instance");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        AnonymousClass0fD.A09(1872635083, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1760930034);
        0qQ.A0B(layoutInflater, 0);
        requireArguments();
        View inflate = layoutInflater.inflate(R.layout.layout_profile_completion_wizard, viewGroup, false);
        AnonymousClass0fD.A09(-1068597409, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1807364512);
        super.onDestroyView();
        this.A03 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(868683934, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1038449565);
        C15310UaH.super.onPause();
        Dbc.A0q(this, 0);
        AnonymousClass0fD.A09(1445313194, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-79830542);
        super.onResume();
        Dbc.A0q(this, 8);
        AnonymousClass0fD.A09(738816178, A022);
    }
}
