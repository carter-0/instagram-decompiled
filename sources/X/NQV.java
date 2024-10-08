package X;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.bugreporter.model.BugReport;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import java.util.List;

public final class NQV extends 2Cl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public NQV(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.A00 != 0) {
            return FH1.A02((Context) this.A02, (AnonymousClass0iw) this.A03, (0lg) this.A04, "login");
        }
        BugReportComposerFragment bugReportComposerFragment = (BugReportComposerFragment) this.A04;
        Context context = (Context) this.A01;
        Uri uri = (Uri) this.A02;
        if (uri != null) {
            BugReport bugReport = bugReportComposerFragment.A08;
            if (bugReport == null) {
                0qQ.A0F("bugReport");
                throw AnonymousClass00P.createAndThrow();
            }
            BugReportAttachment A012 = BugReportComposerFragment.A01(context, uri, bugReportComposerFragment, BugReportAttachmentMediaSource.CAMERA_ROLL, bugReport.A0K.size());
            return AnonymousClass7TE.A1L(A012, C70855OOk.A01(bugReportComposerFragment.getSession(), A012));
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int getRunnableId() {
        if (this.A00 != 0) {
            return 530;
        }
        return 254;
    }

    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            C49941FFu.A02((C49941FFu) this.A01);
            return;
        }
        0qQ.A0B(exc, 0);
        C74547Pwg pwg = ((BugReportComposerFragment) this.A04).A07;
        if (pwg == null) {
            0qQ.A0F("userFlowLoggerV2");
            throw AnonymousClass00P.createAndThrow();
        }
        pwg.AW0("save_external_media_failure", new C58728Iwb(exc, 25));
        0KC.A0F("BugReportComposerFragment", "Failed to load external media file.", exc);
        ((Dialog) this.A03).dismiss();
        C59689JTv.A07(C60960kU.A00, 2131954330);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        AttachmentCounter attachmentCounter;
        if (this.A00 != 0) {
            List list = (List) obj;
            if (!list.isEmpty()) {
                Object obj2 = this.A01;
                1OC A0E = FHA.A0E((0lg) this.A04, list);
                A0E.A00 = new C47691EDa(obj2, 0);
                1ES.A03(A0E);
                return;
            }
            C49941FFu.A02((C49941FFu) this.A01);
            return;
        }
        0eP r13 = (0eP) obj;
        0qQ.A0B(r13, 0);
        BugReportComposerFragment bugReportComposerFragment = (BugReportComposerFragment) this.A04;
        C74547Pwg pwg = bugReportComposerFragment.A07;
        if (pwg == null) {
            str = "userFlowLoggerV2";
        } else {
            pwg.AVy("save_external_media_success");
            BugReport bugReport = bugReportComposerFragment.A08;
            str = "bugReport";
            if (bugReport != null) {
                List list2 = bugReport.A0K;
                Object obj3 = r13.A00;
                list2.add(obj3);
                BugReport bugReport2 = bugReportComposerFragment.A08;
                if (bugReport2 != null) {
                    bugReport2.A0L.add(r13.A01);
                    BugReportAttachment bugReportAttachment = (BugReportAttachment) obj3;
                    String str2 = bugReportAttachment.A03;
                    boolean z = false;
                    0qQ.A0B(str2, 0);
                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType("video/mp4");
                    if (extensionFromMimeType != null) {
                        z = str2.endsWith(extensionFromMimeType);
                    }
                    BugReport bugReport3 = bugReportComposerFragment.A08;
                    if (z) {
                        if (bugReport3 != null) {
                            attachmentCounter = bugReport3.A03;
                        }
                    } else if (bugReport3 != null) {
                        attachmentCounter = bugReport3.A01;
                    }
                    BugReportAttachmentMediaSource bugReportAttachmentMediaSource = bugReportAttachment.A00;
                    0qQ.A0B(bugReportAttachmentMediaSource, 0);
                    attachmentCounter.A00.add(bugReportAttachmentMediaSource);
                    BugReport bugReport4 = bugReportComposerFragment.A08;
                    if (bugReport4 != null) {
                        int A06 = C51966G9m.A06(bugReport4.A0K);
                        BugReportAttachmentMediaSource bugReportAttachmentMediaSource2 = BugReportAttachmentMediaSource.CAMERA_ROLL;
                        AnonymousClass7TE.A1Z(new JUE(bugReportComposerFragment, bugReportAttachmentMediaSource2, (AnonymousClass4D7) null, A06, 3), DbV.A0J(bugReportComposerFragment));
                        ((Dialog) this.A03).dismiss();
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
