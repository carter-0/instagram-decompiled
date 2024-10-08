package X;

import android.net.Uri;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OOk  reason: case insensitive filesystem */
public abstract class C70855OOk {
    public static final List A00(Uri uri, 0lg r2) {
        0qQ.A0B(uri, 0);
        List<File> A00 = C69815Nsc.A00(r2, C69680Nq2.A00(uri), C74174PqG.A00);
        ArrayList A0r = AnonymousClass7TG.A0r(A00);
        for (File fromFile : A00) {
            A0r.add(Uri.fromFile(fromFile));
        }
        return A0r;
    }

    public static final List A01(0lg r9, BugReportAttachment bugReportAttachment) {
        boolean A1Z = AnonymousClass7TG.A1Z(bugReportAttachment, r9);
        List<File> A00 = C69815Nsc.A00(r9, AnonymousClass7TE.A0t(bugReportAttachment.A03), C74174PqG.A00);
        ArrayList A0r = AnonymousClass7TG.A0r(A00);
        for (File canonicalPath : A00) {
            String canonicalPath2 = canonicalPath.getCanonicalPath();
            0qQ.A07(canonicalPath2);
            String str = bugReportAttachment.A02;
            BugReportAttachmentMediaType bugReportAttachmentMediaType = bugReportAttachment.A01;
            BugReportAttachmentMediaSource bugReportAttachmentMediaSource = bugReportAttachment.A00;
            boolean z = bugReportAttachment.A04;
            DbZ.A0t(A1Z ? 1 : 0, str, bugReportAttachmentMediaType, bugReportAttachmentMediaSource);
            A0r.add(new BugReportAttachment(bugReportAttachmentMediaSource, bugReportAttachmentMediaType, canonicalPath2, str, z));
        }
        return A0r;
    }
}
