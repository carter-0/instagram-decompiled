package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

/* renamed from: X.Pcw  reason: case insensitive filesystem */
public final class C73454Pcw implements Supplier {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    public C73454Pcw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i, long j) {
        this.A00 = i;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A08 = str;
        this.A07 = obj;
        this.A01 = j;
        this.A06 = obj5;
        this.A04 = obj6;
        this.A03 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        if (this.A00 != 0) {
            ONP onp = (ONP) this.A02;
            Object obj = this.A06;
            onp.A02("view_hierarchy.txt", "ViewHierarchyMetadataTransformer", this.A08);
            UserFlowLogger userFlowLogger = (UserFlowLogger) this.A07;
            long j = this.A01;
            C66583MXo.A1E(userFlowLogger, "ViewHierarchyMetadataTransformer", "_START", j);
            try {
                BugReport bugReport = (BugReport) this.A03;
                0lg r9 = (0lg) this.A05;
                File A002 = new OKE(bugReport, r9).A00("view_hierarchy.txt", (String) null);
                C71055OaX.A00(r9, (ExecutorService) this.A04, new C58696Iw5(46, bugReport, A002, obj));
                Uri fromFile = Uri.fromFile(A002);
                0qQ.A0A(fromFile);
                C71055OaX.A01(fromFile, r9, true);
                List A003 = C70855OOk.A00(fromFile, r9);
                ArrayList A0r = AnonymousClass7TG.A0r(A003);
                Iterator it = A003.iterator();
                while (it.hasNext()) {
                    C66584MXp.A17(A0r, it);
                }
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    if (str3 != null) {
                        C66583MXo.A1E(userFlowLogger, "ViewHierarchyMetadataTransformer", "_SUCCEEDED", j);
                        onp.A00(AnonymousClass05K.A00, "view_hierarchy.txt", A002.length());
                        C255463uA[] r2 = BugReportAttachment.A05;
                        return AnonymousClass7TE.A1I(new BugReportAttachment(BugReportAttachmentMediaSource.NON_MEDIA, BugReportAttachmentMediaType.NON_MEDIA, str3, "ViewHierarchyMetadataTransformer", true));
                    }
                    C66583MXo.A1E(userFlowLogger, "ViewHierarchyMetadataTransformer", "_FAILED_URI_IS_NULL", j);
                    onp.A01("view_hierarchy.txt", "URI is null");
                }
            } catch (IOException e) {
                e = e;
                0KC.A0F("BugReportComposerFragment", "Could not create log file for file attachment.", e);
                sb2 = AnonymousClass7TF.A0n("ViewHierarchyMetadataTransformer");
                str2 = "_FAILED_URI_IO_EXCEPTION";
                userFlowLogger.flowMarkPoint(j, AnonymousClass7TF.A0l(str2, sb2));
                onp.A01("view_hierarchy.txt", e.toString());
            } catch (TimeoutException e2) {
                0KC.A0F("BugReportComposerFragment", 002.A0r("Could not create log file for attachment within timeout of ", "ms for ", "ViewHierarchyMetadataTransformer", 182.A01(0Tu.A05, (0lg) this.A05, 36605834465908036L)), e2);
                C66583MXo.A1E(userFlowLogger, "ViewHierarchyMetadataTransformer", "_TIMEOUT", j);
                onp.A01("view_hierarchy.txt", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            } catch (ExecutionException e3) {
                e = e3;
                0KC.A0F("BugReportComposerFragment", "Failed generating attachment", e);
                sb2 = AnonymousClass7TF.A0n("ViewHierarchyMetadataTransformer");
                str2 = "_FAILED_EXECUTION_EXCEPTION";
                userFlowLogger.flowMarkPoint(j, AnonymousClass7TF.A0l(str2, sb2));
                onp.A01("view_hierarchy.txt", e.toString());
            }
        } else {
            29P r10 = (29P) this.A05;
            String filenamePrefix = r10.getFilenamePrefix();
            String filenameSuffix = r10.getFilenameSuffix();
            if (filenameSuffix != null) {
                filenamePrefix = 002.A0R(filenamePrefix, filenameSuffix);
            }
            ONP onp2 = (ONP) this.A02;
            String tag = r10.getTag();
            onp2.A02(filenamePrefix, tag, this.A08);
            UserFlowLogger userFlowLogger2 = (UserFlowLogger) this.A07;
            long j2 = this.A01;
            C66583MXo.A1E(userFlowLogger2, tag, "_START", j2);
            UserSession userSession = (UserSession) this.A06;
            try {
                File file = (File) C71055OaX.A00(userSession, (ExecutorService) this.A04, new C41566AwY(0, this.A03, r10));
                r10.FOF(userSession, file);
                Uri fromFile2 = Uri.fromFile(file);
                0qQ.A0A(fromFile2);
                C71055OaX.A01(fromFile2, userSession, r10.Bu8());
                List A004 = C70855OOk.A00(fromFile2, userSession);
                ArrayList A0r2 = AnonymousClass7TG.A0r(A004);
                Iterator it3 = A004.iterator();
                while (it3.hasNext()) {
                    C66584MXp.A17(A0r2, it3);
                }
                Iterator it4 = A0r2.iterator();
                while (it4.hasNext()) {
                    String str4 = (String) it4.next();
                    if (str4 != null) {
                        C66583MXo.A1E(userFlowLogger2, tag, "_SUCCEEDED", j2);
                        onp2.A00(AnonymousClass05K.A00, filenamePrefix, file.length());
                        C255463uA[] r22 = BugReportAttachment.A05;
                        return AnonymousClass7TE.A1I(new BugReportAttachment(BugReportAttachmentMediaSource.NON_MEDIA, BugReportAttachmentMediaType.NON_MEDIA, str4, tag, true));
                    }
                    C66583MXo.A1E(userFlowLogger2, tag, "_FAILED_URI_IS_NULL", j2);
                    onp2.A01(filenamePrefix, "URI is null");
                }
            } catch (IOException e4) {
                e = e4;
                0KC.A0F("BugReportComposerFragment", "Could not create log file for file attachment.", e);
                sb = AnonymousClass7TF.A0n(tag);
                str = "_FAILED_URI_IO_EXCEPTION";
                userFlowLogger2.flowMarkPoint(j2, AnonymousClass7TF.A0l(str, sb));
                onp2.A01(filenamePrefix, e.toString());
            } catch (TimeoutException e5) {
                0KC.A0F("BugReportComposerFragment", 002.A0r("Could not create log file for attachment within timeout of ", "ms for ", tag, 182.A01(0Tu.A05, userSession, 36605834465908036L)), e5);
                C66583MXo.A1E(userFlowLogger2, tag, "_TIMEOUT", j2);
                onp2.A01(filenamePrefix, PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            } catch (ExecutionException e6) {
                e = e6;
                0KC.A0F("BugReportComposerFragment", "Failed generating attachment", e);
                sb = AnonymousClass7TF.A0n(tag);
                str = "_FAILED_EXECUTION_EXCEPTION";
                userFlowLogger2.flowMarkPoint(j2, AnonymousClass7TF.A0l(str, sb));
                onp2.A01(filenamePrefix, e.toString());
            }
        }
        return 0sn.A00;
    }
}
