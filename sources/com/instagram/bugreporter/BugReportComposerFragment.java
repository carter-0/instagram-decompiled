package com.instagram.bugreporter;

import X.00k;
import X.00l;
import X.02m;
import X.0Tu;
import X.0nA;
import X.0qQ;
import X.0sn;
import X.182;
import X.1CI;
import X.1ES;
import X.1OP;
import X.2Yu;
import X.2dZ;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0fN;
import X.AnonymousClass0fU;
import X.AnonymousClass0wW;
import X.AnonymousClass1GD;
import X.AnonymousClass1QO;
import X.AnonymousClass3JR;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass6ST;
import X.AnonymousClass7AV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C11495SbI;
import X.C18900WBt;
import X.C227642jf;
import X.C296235pj;
import X.C320236s2;
import X.C46678Dj7;
import X.C49673F1f;
import X.C49680F1n;
import X.C51965G9l;
import X.C51969G9p;
import X.C61120lW;
import X.C66580MXl;
import X.C66581MXm;
import X.C67620Mqs;
import X.C69813Nsa;
import X.C70853OOi;
import X.C71273OhE;
import X.C71403Ok2;
import X.C74547Pwg;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.DbY;
import X.FBU;
import X.FQP;
import X.JUE;
import X.LS4;
import X.LY8;
import X.NMM;
import X.NQV;
import X.OKE;
import X.OWB;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.android.R;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;

public final class BugReportComposerFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public long A00;
    public EditText A01;
    public GridLayout A02;
    public UserFlowLogger A03;
    public BugReportComposerViewModel A04;
    public BugReportSevereSwitchView A05;
    public C49673F1f A06;
    public C74547Pwg A07;
    public BugReport A08;
    public boolean A09;
    public boolean A0A;
    public OKE A0B;
    public C67620Mqs A0C;
    public final String A0D = "bugreporter_composer";
    public final AnonymousClass0eM A0E = C227642jf.A01(this);

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDi, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.bugreporter.BugReportComposerFragment r12, X.AnonymousClass4D7 r13, int r14) {
        /*
            r7 = 1
            boolean r0 = X.C66130MDi.A01(r7, r13)
            if (r0 == 0) goto L_0x00da
            r4 = r13
            X.MDi r4 = (X.C66130MDi) r4
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00da
            int r2 = r2 - r1
            r4.A01 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A01
            r5 = 2
            java.lang.String r11 = "bugReport"
            r2 = 0
            if (r0 == 0) goto L_0x0045
            if (r0 == r7) goto L_0x00a4
            if (r0 != r5) goto L_0x00e1
            int r14 = r4.A00
            java.lang.Object r12 = r4.A02
            com.instagram.bugreporter.BugReportComposerFragment r12 = (com.instagram.bugreporter.BugReportComposerFragment) r12
            X.0eS.A00(r1)
        L_0x002e:
            com.instagram.bugreporter.model.BugReport r0 = r12.A08
            if (r0 == 0) goto L_0x00e6
            java.util.List r1 = r0.A0L
            X.0sn r0 = X.0sn.A00
            r1.set(r14, r0)
            com.instagram.bugreporter.model.BugReport r0 = r12.A08
            if (r0 == 0) goto L_0x00e6
            java.util.List r0 = r0.A0L
            r0.remove(r14)
        L_0x0042:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0045:
            X.0eS.A00(r1)
            com.instagram.bugreporter.model.BugReport r0 = r12.A08
            if (r0 == 0) goto L_0x00e6
            java.util.List r0 = r0.A0K
            java.lang.Object r10 = r0.get(r14)
            com.meta.flytrap.attachment.model.BugReportAttachment r10 = (com.meta.flytrap.attachment.model.BugReportAttachment) r10
            java.lang.String r0 = r10.A03
            java.io.File r8 = X.AnonymousClass7TE.A0t(r0)
            java.lang.String r9 = r8.getName()
            X.0qQ.A07(r9)
            r6 = 0
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = "video/mp4"
            java.lang.String r0 = r1.getExtensionFromMimeType(r0)
            if (r0 == 0) goto L_0x0072
            boolean r6 = r9.endsWith(r0)
        L_0x0072:
            com.instagram.bugreporter.model.BugReport r0 = r12.A08
            if (r6 == 0) goto L_0x009f
            if (r0 == 0) goto L_0x00e6
            com.meta.flytrap.attachment.model.AttachmentCounter r6 = r0.A04
        L_0x007a:
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r1 = r10.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.ArrayList r0 = r6.A00
            r0.add(r1)
            X.12T r0 = X.AnonymousClass12T.A00
            X.0nV r6 = X.DbX.A0c(r0)
            r1 = 38
            X.JVD r0 = new X.JVD
            r0.<init>(r8, r2, r1)
            r4.A02 = r12
            r4.A00 = r14
            r4.A01 = r7
            java.lang.Object r0 = X.1Eo.A00(r4, r6, r0)
            if (r0 != r3) goto L_0x00ad
            return r3
        L_0x009f:
            if (r0 == 0) goto L_0x00e6
            com.meta.flytrap.attachment.model.AttachmentCounter r6 = r0.A02
            goto L_0x007a
        L_0x00a4:
            int r14 = r4.A00
            java.lang.Object r12 = r4.A02
            com.instagram.bugreporter.BugReportComposerFragment r12 = (com.instagram.bugreporter.BugReportComposerFragment) r12
            X.0eS.A00(r1)
        L_0x00ad:
            com.instagram.bugreporter.model.BugReport r0 = r12.A08
            if (r0 == 0) goto L_0x00e6
            java.util.List r0 = r0.A0K
            r0.remove(r14)
            com.instagram.bugreporter.model.BugReport r0 = r12.A08
            if (r0 == 0) goto L_0x00e6
            java.util.List r0 = r0.A0L
            int r0 = r0.size()
            if (r14 >= r0) goto L_0x0042
            X.12T r0 = X.AnonymousClass12T.A00
            X.0nV r1 = X.DbX.A0c(r0)
            X.MH8 r0 = new X.MH8
            r0.<init>((com.instagram.bugreporter.BugReportComposerFragment) r12, (X.AnonymousClass4D7) r2, (int) r14)
            r4.A02 = r12
            r4.A00 = r14
            r4.A01 = r5
            java.lang.Object r0 = X.1Eo.A00(r4, r1, r0)
            if (r0 != r3) goto L_0x002e
            return r3
        L_0x00da:
            X.MDi r4 = new X.MDi
            r4.<init>(r12, r13, r7)
            goto L_0x0015
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e6:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bugreporter.BugReportComposerFragment.A02(com.instagram.bugreporter.BugReportComposerFragment, X.4D7, int):java.lang.Object");
    }

    public final void configureActionBar(2da r5) {
        UserSession userSession;
        0qQ.A0B(r5, 0);
        if (getSession() instanceof UserSession) {
            AnonymousClass0wW session = getSession();
            0qQ.A0C(session, AnonymousClass000.A00(2));
            userSession = (UserSession) session;
        } else {
            userSession = null;
        }
        r5.ETj(userSession, R.layout.bugreporter_actionbar_header, 0, 0);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131973082);
        DbX.A19(new C71403Ok2(this, 10), A0K, r5);
        r5.Eu5(new C71403Ok2(this, 11), true);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        BugReport bugReport = this.A08;
        if (bugReport == null) {
            0qQ.A0F("bugReport");
            throw AnonymousClass00P.createAndThrow();
        } else {
            bundle.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", bugReport);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession session = getSession();
        if (session instanceof UserSession) {
            UserSession userSession = session;
            boolean A002 = 1CI.A00(userSession);
            BugReportSevereSwitchView bugReportSevereSwitchView = this.A05;
            this.A01 = DbU.A0E(view, R.id.description_field);
            if (A002 && bugReportSevereSwitchView != null && 182.A06(0Tu.A05, session, 36317410231325809L)) {
                0qQ.A0B(userSession, 0);
                AnonymousClass7TH.A0R(bugReportSevereSwitchView.A02);
                IgTextView igTextView = bugReportSevereSwitchView.A04;
                if (igTextView != null) {
                    igTextView.setText(2131973432);
                }
                IgTextView igTextView2 = bugReportSevereSwitchView.A03;
                if (igTextView2 != null) {
                    igTextView2.setText(2131973431);
                }
                IgdsSwitch igdsSwitch = bugReportSevereSwitchView.A05;
                if (igdsSwitch != null) {
                    igdsSwitch.setChecked(false);
                }
                Context A0S = AnonymousClass7TE.A0S(bugReportSevereSwitchView);
                boolean A1a = C51969G9p.A1a(FBU.A00(C61120lW.A01(A0S), C66581MXm.A06()), AnonymousClass05K.A00);
                IgdsSwitch igdsSwitch2 = bugReportSevereSwitchView.A05;
                if (igdsSwitch2 != null) {
                    igdsSwitch2.setEnabled(!A1a);
                }
                C49680F1n f1n = new C49680F1n(userSession);
                IgdsSwitch igdsSwitch3 = bugReportSevereSwitchView.A05;
                if (igdsSwitch3 != null) {
                    igdsSwitch3.setOnCheckedChangeListener(new FQP(1, (Object) userSession, (Object) f1n, (Object) bugReportSevereSwitchView));
                }
                IgSimpleImageView igSimpleImageView = bugReportSevereSwitchView.A01;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setOnTouchListener(new C18900WBt(0, bugReportSevereSwitchView, userSession, f1n));
                }
                bugReportSevereSwitchView.setVisibility(0);
            }
        }
    }

    public static final BugReport A00(BugReportComposerFragment bugReportComposerFragment, BugReport bugReport, 0sn r4, 0sn r5) {
        OWB owb;
        IgdsSwitch igdsSwitch;
        if (r4 == null) {
            r4 = 0sn.A00;
        }
        if (r5 == null) {
            r5 = 0sn.A00;
        }
        BugReportSevereSwitchView bugReportSevereSwitchView = bugReportComposerFragment.A05;
        if (bugReportSevereSwitchView == null || (igdsSwitch = bugReportSevereSwitchView.A05) == null || !igdsSwitch.isChecked()) {
            String str = bugReport.A0A;
            if (str == null || !00l.A0d(str, "#assigntome", true)) {
                owb = new OWB();
                owb.A02(bugReport);
                owb.A0J = AnonymousClass7TE.A1D(r4);
                owb.A0M = r5;
            } else {
                owb = new OWB();
                owb.A02(bugReport);
                owb.A08 = "488095777480313";
                owb.A0J = AnonymousClass7TE.A1D(r4);
            }
        } else {
            owb = new OWB();
            owb.A02(bugReport);
            owb.A0J = AnonymousClass7TE.A1D(r4);
            owb.A0M = r5;
            owb.A08 = "701258024912781";
        }
        return owb.A01();
    }

    public final String getModuleName() {
        return this.A0D;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b3, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.meta.flytrap.attachment.model.BugReportAttachment A01(android.content.Context r6, android.net.Uri r7, com.instagram.bugreporter.BugReportComposerFragment r8, com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r9, int r10) {
        /*
            java.lang.String r1 = r7.getScheme()
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r1)
            r3 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = r7.getPath()
            if (r1 == 0) goto L_0x0017
            java.lang.String r3 = X.0mf.A00(r1)
        L_0x0017:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r0)
        L_0x0021:
            if (r3 == 0) goto L_0x00a8
            goto L_0x003a
        L_0x0024:
            android.content.ContentResolver r0 = r6.getContentResolver()
            X.0qQ.A07(r0)
            java.lang.String r3 = r0.getType(r7)
            java.io.InputStream r2 = r0.openInputStream(r7)
            if (r2 != 0) goto L_0x0021
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x003a:
            X.OKE r1 = r8.A0B     // Catch:{ all -> 0x00b0 }
            if (r1 != 0) goto L_0x0048
            java.lang.String r0 = "bugReportFilesUtil"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x00b0 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x00af
        L_0x0048:
            java.lang.String r0 = "image/"
            r8 = 1
            boolean r0 = X.C66580MXl.A1a(r0, r8, r3)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x007c
            X.OV8 r0 = r1.A00     // Catch:{ all -> 0x00b0 }
            java.io.File r3 = r0.A00()     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "screenshot_"
            java.lang.String r0 = ".png"
            java.lang.String r0 = X.002.A0c(r1, r0, r10)     // Catch:{ all -> 0x00b0 }
            java.io.File r1 = X.JTO.A0s(r3, r0)     // Catch:{ all -> 0x00b0 }
            X.0mb.A09(r1, r2)     // Catch:{ all -> 0x00b0 }
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r5 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.SCREENSHOT     // Catch:{ all -> 0x00b0 }
        L_0x0068:
            X.3uA[] r0 = com.meta.flytrap.attachment.model.BugReportAttachment.A05     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = r1.getCanonicalPath()     // Catch:{ all -> 0x00b0 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x00b0 }
            r4 = r9
            java.lang.String r7 = r9.name()     // Catch:{ all -> 0x00b0 }
            com.meta.flytrap.attachment.model.BugReportAttachment r3 = new com.meta.flytrap.attachment.model.BugReportAttachment     // Catch:{ all -> 0x00b0 }
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b0 }
            goto L_0x009c
        L_0x007c:
            java.lang.String r0 = "video/"
            boolean r0 = X.C66580MXl.A1a(r0, r8, r3)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00a0
            X.OV8 r0 = r1.A00     // Catch:{ all -> 0x00b0 }
            java.io.File r3 = r0.A00()     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "video_"
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = X.002.A0c(r1, r0, r10)     // Catch:{ all -> 0x00b0 }
            java.io.File r1 = X.JTO.A0s(r3, r0)     // Catch:{ all -> 0x00b0 }
            X.0mb.A09(r1, r2)     // Catch:{ all -> 0x00b0 }
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r5 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.VIDEO     // Catch:{ all -> 0x00b0 }
            goto L_0x0068
        L_0x009c:
            r2.close()
            return r3
        L_0x00a0:
            java.lang.String r1 = "Unsupported media type."
            X.Ni9 r0 = new X.Ni9     // Catch:{ all -> 0x00b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x00af
        L_0x00a8:
            java.lang.String r1 = "Could not determine MIME type of external file."
            X.NnA r0 = new X.NnA     // Catch:{ all -> 0x00b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bugreporter.BugReportComposerFragment.A01(android.content.Context, android.net.Uri, com.instagram.bugreporter.BugReportComposerFragment, com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource, int):com.meta.flytrap.attachment.model.BugReportAttachment");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.5n1] */
    private final void A03(View.OnClickListener onClickListener, View view, int i, int i2, int i3) {
        View A0G = AnonymousClass7TF.A0G(view, i);
        A0G.setVisibility(0);
        if (A0G instanceof IgdsMediaButton) {
            IgdsMediaButton igdsMediaButton = (IgdsMediaButton) A0G;
            ? obj = new Object();
            obj.A00 = i2;
            igdsMediaButton.setStartAddOn(obj, requireContext().getString(i3));
            igdsMediaButton.setLabel(requireContext().getString(i3));
            if (AnonymousClass1GD.A03()) {
                igdsMediaButton.setButtonStyle(C296235pj.DEFAULT_ON_BLACK);
            }
        }
        A0G.setBackground((Drawable) null);
        AnonymousClass0fU.A00(new LY8(23, onClickListener, this), A0G);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.NQV, X.11X] */
    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            Uri uri = null;
            if (intent != null) {
                uri = intent.getData();
            }
            Context requireContext = requireContext();
            AnonymousClass6ST r7 = new AnonymousClass6ST(requireContext, true);
            r7.A00(requireContext.getString(2131954331));
            AnonymousClass0fN.A00(r7);
            ? nqv = new NQV(0, requireContext, uri, this, r7);
            C74547Pwg pwg = this.A07;
            if (pwg == null) {
                0qQ.A0F("userFlowLoggerV2");
                throw AnonymousClass00P.createAndThrow();
            }
            pwg.AVy("save_external_media_start");
            1ES.A03(nqv);
        }
    }

    public final boolean onBackPressed() {
        String str;
        String A012 = C320236s2.A01(requireArguments(), "IgSessionManager.SESSION_TOKEN_KEY");
        BugReport bugReport = this.A08;
        if (bugReport == null) {
            str = "bugReport";
        } else {
            BugReportComposerViewModel bugReportComposerViewModel = this.A04;
            if (bugReportComposerViewModel == null) {
                str = "viewModel";
            } else {
                C74547Pwg pwg = this.A07;
                if (pwg == null) {
                    str = "userFlowLoggerV2";
                } else {
                    DbY.A14(C69813Nsa.A00(bugReport, bugReportComposerViewModel, pwg, A012), requireActivity(), getSession());
                    return true;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        BugReport bugReport;
        String str;
        C67620Mqs mqs;
        int A022 = AnonymousClass0fD.A02(-1726677440);
        UserSession session = getSession();
        BugReportComposerFragment.super.onCreate(bundle);
        this.A04 = (BugReportComposerViewModel) C320236s2.A00(requireArguments(), BugReportComposerViewModel.class, "BugReportComposerFragment.ARGUMENT_VIEWMODEL");
        this.A03 = AnonymousClass1QO.A00(session);
        if (bundle == null || (bugReport = (BugReport) C320236s2.A00(bundle, BugReport.class, "BugReportComposerFragment.ARGUMENT_BUGREPORT")) == null) {
            bugReport = (BugReport) C320236s2.A00(requireArguments(), BugReport.class, "BugReportComposerFragment.ARGUMENT_BUGREPORT");
        }
        this.A08 = bugReport;
        C74547Pwg A002 = C70853OOi.A00(requireArguments(), session);
        this.A07 = A002;
        if (A002 == null) {
            str = "userFlowLoggerV2";
        } else {
            A002.AVy("composer_fragment");
            if (session instanceof UserSession) {
                UserSession userSession = session;
                if (1OP.A05(userSession).A0d()) {
                    LS4.A01(userSession, this.A0D, "reel_tray_empty_on_bug_report_filed");
                }
            }
            OWB owb = new OWB();
            BugReport bugReport2 = this.A08;
            str = "bugReport";
            if (bugReport2 != null) {
                owb.A02(bugReport2);
                BugReport bugReport3 = this.A08;
                if (bugReport3 != null) {
                    String str2 = bugReport3.A0A;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    owb.A0A = str2;
                    String str4 = bugReport3.A07;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    owb.A07 = str3;
                    BugReport A012 = owb.A01();
                    this.A08 = A012;
                    List list = A012.A0J;
                    ArrayList A0U = 00k.A0U(A012.A0M);
                    BugReportComposerViewModel bugReportComposerViewModel = this.A04;
                    if (bugReportComposerViewModel == null) {
                        str = "viewModel";
                    } else {
                        if (bugReportComposerViewModel.A03 && (((mqs = this.A0C) == null || mqs.A03 != AnonymousClass05K.A01) && list.isEmpty() && A0U.isEmpty())) {
                            NMM nmm = new NMM(this, list, A0U);
                            nmm.A02(new Void[0]);
                            this.A0C = nmm;
                        }
                        this.A06 = new C49673F1f(session, this.A0D);
                        BugReport bugReport4 = this.A08;
                        if (bugReport4 != null) {
                            this.A0B = new OKE(bugReport4, session);
                            AnonymousClass0fD.A09(-2092774652, A022);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1688910477);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View A0D2 = DbT.A0D(layoutInflater2, viewGroup, R.layout.feedback_public_composer, false);
        View requireViewById = A0D2.requireViewById(R.id.description_field);
        EditText editText = (EditText) requireViewById;
        this.A01 = editText;
        0qQ.A07(requireViewById);
        BugReport bugReport = this.A08;
        if (bugReport != null) {
            editText.setText(bugReport.A0A);
            BugReportComposerViewModel bugReportComposerViewModel = this.A04;
            if (bugReportComposerViewModel != null) {
                editText.setHint(bugReportComposerViewModel.A01);
                C71273OhE.A00(editText, this, 0);
                this.A02 = (GridLayout) A0D2.requireViewById(R.id.screenshot_section);
                BugReport bugReport2 = this.A08;
                if (bugReport2 != null) {
                    int size = bugReport2.A0K.size();
                    for (int i = 0; i < size; i++) {
                        BugReportAttachmentMediaSource bugReportAttachmentMediaSource = BugReportAttachmentMediaSource.BUG_REPORTER;
                        AnonymousClass7TE.A1Z(new JUE(this, bugReportAttachmentMediaSource, (AnonymousClass4D7) null, i, 3), DbV.A0J(this));
                    }
                    DbV.A0T(A0D2, R.id.feedback_composer_buttons_with_record_video_stub, false).setVisibility(0);
                    View view = A0D2;
                    A03(new C11495SbI(this, 3), view, R.id.gallery_button, R.drawable.instagram_photo_selector, 2131971295);
                    A03(new C71403Ok2(this, 12), view, R.id.camera_button, R.drawable.instagram_camera_pano_outline_24, 2131954340);
                    getSession();
                    AnonymousClass7TF.A0G(A0D2, R.id.record_video_button).setVisibility(8);
                    GridLayout gridLayout = (GridLayout) A0D2.findViewById(R.id.screenshot_section);
                    this.A02 = gridLayout;
                    BugReportComposerViewModel bugReportComposerViewModel2 = this.A04;
                    if (bugReportComposerViewModel2 != null) {
                        if (bugReportComposerViewModel2.A04) {
                            if (gridLayout != null) {
                                gridLayout.setVisibility(8);
                            }
                            String A0m = DbU.A0m(this, 2131954327);
                            String A0m2 = DbU.A0m(this, 2131954326);
                            String string = getString(2131954329, new Object[]{A0m, A0m2});
                            0qQ.A07(string);
                            Uri A092 = DbT.A09("https://help.instagram.com/581066165581870");
                            C46678Dj7 dj7 = new C46678Dj7(A092);
                            C46678Dj7 dj72 = new C46678Dj7(A092);
                            SpannableStringBuilder A0C2 = DbS.A0C(string);
                            AnonymousClass7AV.A05(A0C2, dj7, A0m);
                            AnonymousClass7AV.A05(A0C2, dj72, A0m2);
                            int A0F = 2Yu.A0F(getContext(), R.attr.igds_color_link);
                            A0C2.setSpan(C66580MXl.A0E(A0F), A0C2.getSpanStart(dj7), A0C2.getSpanEnd(dj7), 0);
                            A0C2.setSpan(C66580MXl.A0E(A0F), A0C2.getSpanStart(dj72), A0C2.getSpanEnd(dj72), 0);
                            TextView A0R = AnonymousClass7TG.A0R(A0D2, R.id.legal_info_footer);
                            DbX.A1G(A0R, A0C2);
                            A0R.setVisibility(0);
                        }
                        this.A05 = (BugReportSevereSwitchView) A0D2.requireViewById(R.id.bugreport_severe_switch_view);
                        AnonymousClass0fD.A09(1113393155, A022);
                        return A0D2;
                    }
                }
            }
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("bugReport");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(891033987);
        super.onDestroyView();
        C67620Mqs mqs = this.A0C;
        if (mqs != null) {
            mqs.A01.cancel(true);
        }
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        AnonymousClass0fD.A09(-137866853, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(446996840);
        BugReportComposerFragment.super.onPause();
        0nA.A0N(this.A01);
        AnonymousClass0fD.A09(1723454799, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1915624522);
        super.onResume();
        2dZ.A0t.A03(getActivity()).A0X(this);
        BugReportSevereSwitchView bugReportSevereSwitchView = this.A05;
        if (bugReportSevereSwitchView != null && bugReportSevereSwitchView.getVisibility() == 8) {
            EditText editText = this.A01;
            if (editText != null) {
                editText.requestFocus();
            }
            EditText editText2 = this.A01;
            if (editText2 != null) {
                0nA.A0Q(editText2);
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(773710555, A022);
                throw A0y;
            }
        }
        AnonymousClass0fD.A09(1553916957, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1872127886);
        BugReportComposerFragment.super.onStart();
        getSession();
        02m A0l = C51965G9l.A0l();
        A0l.markerStart(391254427, 0);
        A0l.markerEnd(391254427, 0, 2);
        AnonymousClass0fD.A09(1221637485, A022);
    }
}
