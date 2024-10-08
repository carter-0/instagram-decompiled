package com.instagram.bugreporter;

import X.0eS;
import X.0lg;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C69812NsZ;
import X.C71132OdV;
import X.C74547Pwg;
import android.content.Context;
import com.instagram.bugreporter.model.BugReport;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bugreporter.BugReporterService$Companion$startService$1", f = "BugReporterService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BugReporterService$Companion$startService$1 extends AnonymousClass1Ek implements 0sP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ BugReportComposerViewModel A01;
    public final /* synthetic */ C74547Pwg A02;
    public final /* synthetic */ BugReport A03;
    public final /* synthetic */ 0lg A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BugReporterService$Companion$startService$1(Context context, BugReportComposerViewModel bugReportComposerViewModel, C74547Pwg pwg, BugReport bugReport, 0lg r6, AnonymousClass4D7 r7) {
        super(1, r7);
        this.A00 = context;
        this.A03 = bugReport;
        this.A01 = bugReportComposerViewModel;
        this.A02 = pwg;
        this.A04 = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.bugreporter.BugReporterService$Companion$startService$1, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r8) {
        return new BugReporterService$Companion$startService$1(this.A00, this.A01, this.A02, this.A03, this.A04, r8);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BugReporterService$Companion$startService$1) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        Context context = this.A00;
        BugReport bugReport = this.A03;
        BugReportComposerViewModel bugReportComposerViewModel = this.A01;
        C74547Pwg pwg = this.A02;
        try {
            C71132OdV.A00.A05(context, bugReportComposerViewModel, pwg, bugReport, this.A04);
        } catch (Exception e) {
            C69812NsZ.A00(pwg, "Failed to upload bug report.", e);
        }
        return C60340gF.A00;
    }
}
