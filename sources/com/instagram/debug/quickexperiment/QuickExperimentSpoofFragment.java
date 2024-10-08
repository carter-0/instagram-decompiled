package com.instagram.debug.quickexperiment;

import X.002;
import X.0KC;
import X.0tS;
import X.183;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C47518E6c;
import X.C51970G9q;
import X.C59689JTv;
import X.C66580MXl;
import X.C66583MXo;
import X.C67293MlS;
import X.C69642NpP;
import X.C71277OhI;
import X.C74264Prs;
import X.C74369Ptj;
import X.DbV;
import X.DbX;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public class QuickExperimentSpoofFragment extends C47518E6c implements AnonymousClass4DS {
    public final C74369Ptj mEditDelegate = new C74369Ptj() {
        public void onTextChanged(String str) {
        }
    };
    public final C74264Prs mSpoofOverlayDelegate = new C74264Prs() {
        public void onOperationStart() {
        }
    };
    public final TextView.OnEditorActionListener mTextDelegate = new TextView.OnEditorActionListener() {
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    };
    public UserSession mUserSession;

    public String getModuleName() {
        return "QuickExperimentSpoofFragment";
    }

    public void configureActionBar(2da r2) {
        r2.setTitle("Spoof menu");
    }

    public AnonymousClass0wW getSession() {
        return this.mUserSession;
    }

    private List getDeviceSpoofOptions() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        final UserSession A0U = DbX.A0U(this);
        final 0tS A00 = 0tS.A00();
        C66583MXo.A1J("Device Spoof", A1C);
        String A13 = DbV.A13(A00, A00.A0N, 0tS.A4G, 26);
        if (A13 == null) {
            A13 = "";
        }
        final C71277OhI ohI = new C71277OhI(this.mTextDelegate, this.mEditDelegate, Integer.valueOf(Constants.LOAD_RESULT_WITH_VDEX_ODEX), "Enter spoofed device's id", A13, true);
        C51970G9q.A1P(ohI, new C67293MlS(requireContext(), (View.OnClickListener) new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0fD.A05(1957219772);
                if (A00.A0O()) {
                    FragmentActivity activity = QuickExperimentSpoofFragment.this.getActivity();
                    0tS r3 = A00;
                    C59689JTv.A09(activity, 002.A0g("Already Spoofing on ", DbV.A13(r3, r3.A0N, 0tS.A4G, 26), ". Clear spoof before spoofing again."));
                } else {
                    183 r32 = 183.A01;
                    if (r32 != null) {
                        String str = ohI.A00;
                        r32.A00 = QuickExperimentSpoofFragment.this.mSpoofOverlayDelegate;
                        r32.A05(A0U, str, 1);
                    } else {
                        0KC.A0C("QuickExperimentSpoofFragment", "QuickExperimentManagerFactory is null");
                    }
                }
                AnonymousClass0fD.A0C(766395888, A05);
            }
        }, 2131974150), new C67293MlS(requireContext(), (View.OnClickListener) new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0fD.A05(479793891);
                0tS A00 = 0tS.A00();
                C69642NpP.A00 = null;
                A00.A0C((String) null);
                0tS.A00().A0C((String) null);
                AnonymousClass0fD.A0C(50143147, A05);
            }
        }, 2131955142), A1C);
        return A1C;
    }

    private List getUserSpoofOptions() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        final 0tS A00 = 0tS.A00();
        String A13 = DbV.A13(A00, A00.A0P, 0tS.A4G, 25);
        C66583MXo.A1J("User Spoof", A1C);
        if (A13 == null) {
            A13 = "";
        }
        final C71277OhI ohI = new C71277OhI(this.mTextDelegate, this.mEditDelegate, C66580MXl.A0q(), "Enter spoofed user's IGID", A13, true);
        C51970G9q.A1P(ohI, new C67293MlS(requireContext(), (View.OnClickListener) new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0fD.A05(-1135532999);
                if (A00.A0P()) {
                    FragmentActivity activity = QuickExperimentSpoofFragment.this.getActivity();
                    0tS r3 = A00;
                    C59689JTv.A09(activity, 002.A0g("Already Spoofing on ", DbV.A13(r3, r3.A0P, 0tS.A4G, 25), ". Clear spoof before spoofing again."));
                } else {
                    183 r32 = 183.A01;
                    if (r32 != null) {
                        String str = ohI.A00;
                        QuickExperimentSpoofFragment quickExperimentSpoofFragment = QuickExperimentSpoofFragment.this;
                        r32.A00 = quickExperimentSpoofFragment.mSpoofOverlayDelegate;
                        r32.A05(quickExperimentSpoofFragment.mUserSession, str, 2);
                    } else {
                        0KC.A0C("QuickExperimentSpoofFragment", "QuickExperimentManagerFactory is null");
                    }
                }
                AnonymousClass0fD.A0C(-262103899, A05);
            }
        }, 2131974151), new C67293MlS(requireContext(), (View.OnClickListener) new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0fD.A05(2050375452);
                0tS A00 = 0tS.A00();
                C69642NpP.A01 = null;
                A00.A0D((String) null);
                0tS.A00().A0D((String) null);
                AnonymousClass0fD.A0C(685853219, A05);
            }
        }, 2131955143), A1C);
        return A1C;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-790715324);
        super.onCreate(bundle);
        this.mUserSession = DbX.A0U(this);
        AnonymousClass0fD.A09(732412857, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(getUserSpoofOptions());
        DbV.A1W(A1C, true);
        A1C.addAll(getDeviceSpoofOptions());
        setItems(A1C);
    }
}
