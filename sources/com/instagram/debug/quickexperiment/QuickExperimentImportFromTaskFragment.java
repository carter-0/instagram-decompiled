package com.instagram.debug.quickexperiment;

import X.002;
import X.0Je;
import X.0b6;
import X.182;
import X.19z;
import X.1AA;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C358248ab;
import X.C46448DfA;
import X.C47518E6c;
import X.C51970G9q;
import X.C66580MXl;
import X.C67293MlS;
import X.C71277OhI;
import X.C74369Ptj;
import X.DbS;
import X.DbT;
import X.DbW;
import X.DbX;
import X.FGF;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.troubleshooting.MobileConfigOverridesWriterHolder;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public class QuickExperimentImportFromTaskFragment extends C47518E6c implements DialogInterface.OnClickListener, AnonymousClass4DS {
    public final C74369Ptj mEditDelegate = new QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda1();
    public final TextView.OnEditorActionListener mTextDelegate = new QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda0();
    public UserSession mUserSession;

    public static /* synthetic */ boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    public static /* synthetic */ void lambda$new$1(String str) {
    }

    public String getModuleName() {
        return "QuickExperimentImportFromTaskFragment";
    }

    private View.OnClickListener getImportOverridesFromTaskClickListener(C71277OhI ohI) {
        return new QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda2(this, ohI);
    }

    public void configureActionBar(2da r2) {
        r2.setTitle("Import overrides from task");
    }

    public AnonymousClass0wW getSession() {
        return this.mUserSession;
    }

    /* renamed from: lambda$getImportOverridesFromTaskClickListener$2$com-instagram-debug-quickexperiment-QuickExperimentImportFromTaskFragment  reason: not valid java name */
    public /* synthetic */ void m79lambda$getImportOverridesFromTaskClickListener$2$cominstagramdebugquickexperimentQuickExperimentImportFromTaskFragment(C71277OhI ohI, View view) {
        String str;
        String str2 = ohI.A00;
        1AA A02 = 182.A02(this.mUserSession, 0);
        if (A02 != null) {
            MobileConfigManagerHolderImpl A00 = 19z.A00(A02.A0A());
            if (A00 != null) {
                str = new MobileConfigOverridesWriterHolder(A00).importOverridesFromTask(str2);
                if (str.isEmpty()) {
                    showRefreshAppDialog(str2);
                    return;
                }
            } else {
                str = "";
            }
        } else {
            str = "Skip importing, MobileConfig xplat runtime is not ready yet.";
        }
        if (str.contains("ErrorDomain")) {
            str = 002.A0g(str, ". ", "This feature utilizes a WWW method for reading task attachment content, which might be malfunctioning. Refer to fburl.com/mc_task_import_issue for possible workarounds");
        }
        showErrorDialog(str2, str);
    }

    private List getImportOverridesFromTaskMenu() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C46448DfA dfA = new C46448DfA((CharSequence) "Import overrides");
        FGF fgf = new FGF(2131964184);
        C71277OhI ohI = new C71277OhI(this.mTextDelegate, this.mEditDelegate, C66580MXl.A0q(), "Task# (e.g: 1234567)", "", true);
        C67293MlS mlS = new C67293MlS(requireContext(), (View.OnClickListener) new QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda2(this, ohI), 2131964183);
        C51970G9q.A1P(dfA, fgf, ohI, A1C);
        A1C.add(mlS);
        return A1C;
    }

    private void launchHomeActivity() {
        Intent A09 = DbS.A09();
        A09.setClassName(requireContext(), "com.instagram.mainactivity.InstagramMainActivity");
        A09.setFlags(268468224);
        0b6.A00().A07().A0G(requireContext(), A09);
    }

    private void showErrorDialog(String str, String str2) {
        C358248ab A0U = DbW.A0U(this);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to import overrides from task T%s. Error: %s", str, str2);
        A0U.A0r(true);
        A0U.A0q(formatStrLocaleSafe);
        A0U.A0b((DialogInterface.OnClickListener) null, "OK");
        DbT.A1V(A0U);
    }

    private void showRefreshAppDialog(String str) {
        C358248ab A0U = DbW.A0U(this);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Successfully imported overrides from task T%s. Restart app now?", str);
        A0U.A05 = "Restart app";
        A0U.A0r(true);
        A0U.A0q(formatStrLocaleSafe);
        A0U.A0c(this, "Restart");
        A0U.A0b((DialogInterface.OnClickListener) null, "Later");
        DbT.A1V(A0U);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        launchHomeActivity();
        0Je.A01("Intentional app restart after successfully importing MetaConfig overrides from task.");
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-365316749);
        super.onCreate(bundle);
        this.mUserSession = DbX.A0U(this);
        AnonymousClass0fD.A09(1144568192, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setItems(AnonymousClass7TE.A1D(getImportOverridesFromTaskMenu()));
    }
}
