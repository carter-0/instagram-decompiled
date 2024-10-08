package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.model.BugReport;

public final class NMP extends C67620Mqs {
    public C74547Pwg A00;
    public BugReport A01;
    public AnonymousClass6ST A02;
    public final Activity A03;
    public final Bitmap A04;
    public final BugReportComposerViewModel A05;
    public final C74547Pwg A06;
    public final OKE A07;
    public final 0lg A08;

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        Intent intent = (Intent) obj;
        0qQ.A0B(intent, 0);
        Activity activity = this.A03;
        A06();
        0lg r4 = this.A08;
        C74547Pwg pwg = this.A00;
        if (pwg == null) {
            0qQ.A0F("userFlowLoggerV2");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0B(r4, 0);
        C71936OtM otM = (C71936OtM) r4.A01(C71936OtM.class, new C20606Wvn(r4, 2));
        otM.A04 = pwg;
        0lU.A07(otM);
        0kR.A0B(activity, intent);
    }

    public final void A06() {
        if (this.A02 != null && !this.A03.isDestroyed()) {
            AnonymousClass6ST r0 = this.A02;
            if (r0 != null) {
                r0.dismiss();
            }
            this.A02 = null;
        }
    }

    public NMP(Activity activity, Bitmap bitmap, BugReportComposerViewModel bugReportComposerViewModel, C74547Pwg pwg, BugReport bugReport, 0lg r7) {
        AnonymousClass7TG.A1O(r7, activity);
        this.A08 = r7;
        this.A03 = activity;
        this.A01 = bugReport;
        this.A04 = bitmap;
        this.A05 = bugReportComposerViewModel;
        this.A06 = pwg;
        this.A07 = new OKE(bugReport, r7);
    }
}
