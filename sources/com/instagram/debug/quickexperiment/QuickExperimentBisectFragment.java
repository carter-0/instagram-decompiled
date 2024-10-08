package com.instagram.debug.quickexperiment;

import X.002;
import X.02m;
import X.0KC;
import X.0tS;
import X.0xY;
import X.0yO;
import X.183;
import X.2Yu;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C273654mx;
import X.C293395kf;
import X.C47518E6c;
import X.C51965G9l;
import X.C59689JTv;
import X.C66580MXl;
import X.C67293MlS;
import X.C71277OhI;
import X.C74369Ptj;
import X.C74494Pvo;
import X.DbS;
import X.DbV;
import X.FGF;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public class QuickExperimentBisectFragment extends C47518E6c implements AnonymousClass4DS {
    public static final String TAG = "QuickExperimentBisectFragment";
    public C74494Pvo mBisectState = null;
    public final C74369Ptj mEditDelegate = new QuickExperimentBisectFragment$$ExternalSyntheticLambda7();
    public final TextView.OnEditorActionListener mTextDelegate = new QuickExperimentBisectFragment$$ExternalSyntheticLambda6();
    public UserSession mUserSession = null;
    public final 183 qeFactory = 183.A01;

    public static /* synthetic */ boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    public static /* synthetic */ void lambda$new$1(String str) {
    }

    public String getModuleName() {
        return TAG;
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$1  reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$configuration$intf$SynchronizationResult;

        static {
            int[] iArr = new int[C293395kf.values().length];
            $SwitchMap$com$instagram$configuration$intf$SynchronizationResult = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void forceSyncStartBisect(C71277OhI ohI, AnonymousClass0wW r4, 183 r5) {
        r5.A00(r4, 0yO.A03).A00(new QuickExperimentBisectFragment$$ExternalSyntheticLambda0(this, ohI));
    }

    private C71277OhI getBisectIdEditText(String str) {
        return new C71277OhI(this.mTextDelegate, this.mEditDelegate, C66580MXl.A0q(), "Enter user's IGID to start bisect on", str, false);
    }

    private List getBisectResponseButtons(boolean z) {
        QuickExperimentBisectFragment$$ExternalSyntheticLambda1 quickExperimentBisectFragment$$ExternalSyntheticLambda1 = new QuickExperimentBisectFragment$$ExternalSyntheticLambda1(this);
        QuickExperimentBisectFragment$$ExternalSyntheticLambda2 quickExperimentBisectFragment$$ExternalSyntheticLambda2 = new QuickExperimentBisectFragment$$ExternalSyntheticLambda2(this);
        QuickExperimentBisectFragment$$ExternalSyntheticLambda3 quickExperimentBisectFragment$$ExternalSyntheticLambda3 = new QuickExperimentBisectFragment$$ExternalSyntheticLambda3(this);
        QuickExperimentBisectFragment$$ExternalSyntheticLambda4 quickExperimentBisectFragment$$ExternalSyntheticLambda4 = new QuickExperimentBisectFragment$$ExternalSyntheticLambda4(this);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new C67293MlS((View.OnClickListener) quickExperimentBisectFragment$$ExternalSyntheticLambda4, 0.8f, 2131953828, 2Yu.A0D(requireContext())));
        if (!z) {
            A1C.add(new C67293MlS((View.OnClickListener) quickExperimentBisectFragment$$ExternalSyntheticLambda1, 0.8f, 2131953826, 2Yu.A0D(requireContext())));
            A1C.add(new C67293MlS((View.OnClickListener) quickExperimentBisectFragment$$ExternalSyntheticLambda2, 0.8f, 2131953824, 2Yu.A0D(requireContext())));
        }
        A1C.add(new C67293MlS((View.OnClickListener) quickExperimentBisectFragment$$ExternalSyntheticLambda3, 0.8f, 2131953825, 2Yu.A0D(requireContext())));
        return A1C;
    }

    public static FGF getNoBisectionStatusItem() {
        return new FGF((CharSequence) "QE Bisect Status: Not bisecting right now");
    }

    private C67293MlS getStartBisectButton(C71277OhI ohI) {
        return new C67293MlS((View.OnClickListener) new QuickExperimentBisectFragment$$ExternalSyntheticLambda5(this, ohI), 0.8f, 2131953827, 2Yu.A0D(requireContext()));
    }

    public void configureActionBar(2da r2) {
        r2.setTitle("QE Bisect");
    }

    public AnonymousClass0wW getSession() {
        return this.mUserSession;
    }

    /* renamed from: lambda$forceSyncStartBisect$7$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m73lambda$forceSyncStartBisect$7$cominstagramdebugquickexperimentQuickExperimentBisectFragment(C71277OhI ohI, C293395kf r7) {
        int ordinal;
        String str = "Failed to start Bisect due to a sync error.";
        if (!(r7 == null || (ordinal = r7.ordinal()) == 1 || ordinal == 0)) {
            if (ordinal == 3 || ordinal == 2) {
                String str2 = ohI.A00;
                if (this.mUserSession == null || MobileConfigBisection.startBisect(requireContext(), str2, this.mUserSession, 02m.A0p)) {
                    0tS A00 = 0tS.A00();
                    DbS.A1a(A00, str2, A00.A2N, 0tS.A4G, 23);
                    this.mBisectState = MobileConfigBisection.getBisectState();
                    setContent();
                    displayRestartMessage();
                    return;
                }
                str = "Failed to start QE Bisect";
                0KC.A0C(TAG, str);
            } else {
                return;
            }
        }
        displayError(str);
    }

    /* renamed from: lambda$getStartBisectButton$6$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m78lambda$getStartBisectButton$6$cominstagramdebugquickexperimentQuickExperimentBisectFragment(C71277OhI ohI, View view) {
        UserSession userSession = this.mUserSession;
        183 r2 = this.qeFactory;
        if (!0tS.A00().A0Q() && r2 != null && userSession != null) {
            C59689JTv.A09(getContext(), "Syncing configs and starting bisection, please wait.");
            forceSyncStartBisect(ohI, userSession, r2);
        } else if (0tS.A00().A0Q()) {
            0tS A00 = 0tS.A00();
            displayError(002.A0R("Already started bisect on", DbV.A13(A00, A00.A2N, 0tS.A4G, 23)));
        } else {
            0KC.A0C(TAG, "Tried to bisect but QuickExperimentManagerFactory is null");
        }
    }

    private void displayError(String str) {
        C59689JTv.A09(getContext(), str);
    }

    private void displayRestartMessage() {
        C59689JTv.A09(getContext(), "Relaunch the application for the changes to take effect. ");
    }

    private List getBisectionStateSummaryItems(int i, int i2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        SpannableStringBuilder A0E = C51965G9l.A0E();
        A0E.append("# of steps made: ");
        A0E.setSpan(new StyleSpan(1), 0, A0E.length(), 33);
        A0E.append(Integer.toString(i));
        A1C.add(new FGF(A0E));
        SpannableStringBuilder A0E2 = C51965G9l.A0E();
        A0E2.append("# of steps left: ");
        A0E2.setSpan(new StyleSpan(1), 0, A0E2.length(), 33);
        A0E2.append(Integer.toString(i2));
        A1C.add(new FGF(A0E2));
        SpannableStringBuilder A0E3 = C51965G9l.A0E();
        A0E3.append("Culprit:\n");
        A0E3.setSpan(new StyleSpan(1), 0, A0E3.length(), 33);
        C74494Pvo pvo = this.mBisectState;
        if (pvo != null) {
            A0E3.append(pvo.getCulprit());
        }
        A1C.add(new FGF(A0E3));
        return A1C;
    }

    public static FGF getBisectionStatusItem(int i, int i2, boolean z) {
        String str;
        SpannableStringBuilder A0E = C51965G9l.A0E();
        A0E.append(C273654mx.A00(506));
        A0E.setSpan(new StyleSpan(1), 0, A0E.length(), 33);
        if (!z) {
            A0E.append("Bisecting on ");
            A0E.append(Integer.toString(i));
            A0E.append("/");
            A0E.append(Integer.toString(i2));
            str = " experiments.";
        } else {
            str = "Culprit has been found.";
        }
        A0E.append(str);
        return new FGF(A0E);
    }

    private void setContent() {
        C74494Pvo pvo;
        int i;
        ArrayList A1C = AnonymousClass7TE.A1C();
        String str = "";
        if (!0tS.A00().A0Q() || (pvo = this.mBisectState) == null || !pvo.isRunning()) {
            C71277OhI bisectIdEditText = getBisectIdEditText(str);
            A1C.add(new FGF((CharSequence) "QE Bisect Status: Not bisecting right now"));
            A1C.add(bisectIdEditText);
            A1C.add(getStartBisectButton(bisectIdEditText));
        } else {
            0tS A00 = 0tS.A00();
            String A13 = DbV.A13(A00, A00.A2N, 0tS.A4G, 23);
            if (A13 != null) {
                str = A13;
            }
            C71277OhI bisectIdEditText2 = getBisectIdEditText(str);
            boolean z = !this.mBisectState.getCulprit().isEmpty();
            int size = this.mBisectState.getSize();
            int right = (this.mBisectState.getRight() - this.mBisectState.getLeft()) + 1;
            if (this.mBisectState.getCulprit().isEmpty()) {
                i = this.mBisectState.getNumberOfStepsRemaining();
            } else {
                i = 0;
            }
            int numberOfStepsMade = this.mBisectState.getNumberOfStepsMade();
            A1C.add(getBisectionStatusItem(right, size, z));
            A1C.addAll(getBisectionStateSummaryItems(numberOfStepsMade, i));
            A1C.add(bisectIdEditText2);
            A1C.addAll(getBisectResponseButtons(z));
        }
        setItems(A1C);
    }

    /* renamed from: lambda$getBisectResponseButtons$2$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m74lambda$getBisectResponseButtons$2$cominstagramdebugquickexperimentQuickExperimentBisectFragment(View view) {
        if (MobileConfigBisection.userDidNotReproduceBug()) {
            C74494Pvo bisectState = MobileConfigBisection.getBisectState();
            this.mBisectState = bisectState;
            if (bisectState != null) {
                bisectState.getLeft();
                this.mBisectState.getRight();
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError("Bisection failed. Please restart the application and try again.");
    }

    /* renamed from: lambda$getBisectResponseButtons$3$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m75lambda$getBisectResponseButtons$3$cominstagramdebugquickexperimentQuickExperimentBisectFragment(View view) {
        if (MobileConfigBisection.userDidReproduceBug()) {
            C74494Pvo bisectState = MobileConfigBisection.getBisectState();
            this.mBisectState = bisectState;
            if (bisectState != null) {
                bisectState.getLeft();
                this.mBisectState.getRight();
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError("Bisection failed. Please restart the application and try again.");
    }

    /* renamed from: lambda$getBisectResponseButtons$4$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m76lambda$getBisectResponseButtons$4$cominstagramdebugquickexperimentQuickExperimentBisectFragment(View view) {
        if (!MobileConfigBisection.stopBisection()) {
            displayError("Could not stop bisection. Please restart the application and try again.");
            return;
        }
        0xY AR4 = 0tS.A00().A00.AR4();
        AR4.ED3("qe_user_bisect_id");
        AR4.apply();
        0tS.A00().A0C((String) null);
        this.mBisectState = MobileConfigBisection.getBisectState();
        if (getActivity() != null) {
            setContent();
            displayRestartMessage();
        }
    }

    /* renamed from: lambda$getBisectResponseButtons$5$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m77lambda$getBisectResponseButtons$5$cominstagramdebugquickexperimentQuickExperimentBisectFragment(View view) {
        if (MobileConfigBisection.goBackOneStep()) {
            C74494Pvo bisectState = MobileConfigBisection.getBisectState();
            this.mBisectState = bisectState;
            if (bisectState != null) {
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError("Bisection failed. Please restart the application and try again.");
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(897907974);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.mUserSession = DbS.A0U(bundle2);
        }
        AnonymousClass0fD.A09(-395985024, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UserSession userSession = this.mUserSession;
        if (0tS.A00().A0Q() && userSession != null) {
            0tS A00 = 0tS.A00();
            String A13 = DbV.A13(A00, A00.A2N, 0tS.A4G, 23);
            Context requireContext = requireContext();
            if (A13 == null) {
                A13 = "";
            }
            MobileConfigBisection.initialize(requireContext, A13, userSession, 02m.A0p);
            this.mBisectState = MobileConfigBisection.getBisectState();
        }
        setContent();
    }
}
