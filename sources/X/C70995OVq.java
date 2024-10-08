package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.bugreporter.model.BugReport;
import java.io.File;

/* renamed from: X.OVq  reason: case insensitive filesystem */
public final class C70995OVq {
    public static final C70995OVq A00 = new Object();
    public static final C250863mB A01 = AnonymousClass9FA.A00(C74009Pna.A00, C250863mB.A03);

    public final Object A00(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        if (bundle.containsKey("BugReporterActivity.INTENT_EXTRA_BUGREPORT_ID")) {
            String string = bundle.getString("BugReporterActivity.INTENT_EXTRA_BUGREPORT_ID");
            if (string != null) {
                File A0s = JTO.A0s(new OV8(string).A00(), "metadata");
                A0s.mkdirs();
                File A0s2 = JTO.A0s(A0s, "bugreport.json");
                if (!A0s2.exists()) {
                    RuntimeException A15 = AnonymousClass7TE.A15(002.A0R("File does not exist: ", A0s2.getPath()));
                    0qQ.A0B(A15, 0);
                    return new 0eQ(A15);
                }
                try {
                    C250863mB r2 = A01;
                    String A002 = C272134kB.A00(A0s2, AnonymousClass15Q.A05);
                    C255463uA[] r0 = BugReport.A0P;
                    return (BugReport) r2.A00(A002, C73532PeO.A00);
                } catch (Throwable th) {
                    return new 0eQ(th);
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            try {
                Parcelable parcelable = bundle.getParcelable("BugReporterActivity.INTENT_EXTRA_BUGREPORT");
                if (parcelable != null) {
                    return parcelable;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } catch (RuntimeException e) {
                return new 0eQ(e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Intent r5, com.instagram.bugreporter.model.BugReport r6, X.0lg r7) {
        /*
            r4 = this;
            r0 = 1
            X.0Tu r2 = X.DbS.A0J(r6, r0)
            r0 = 36327889951669009(0x81100600023b11, double:3.0372421138824575E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r3 = r6.A0G
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.OV8 r0 = new X.OV8
            r0.<init>(r3)
            java.io.File r1 = r0.A00()
            java.lang.String r0 = "metadata"
            java.io.File r1 = X.JTO.A0s(r1, r0)
            r1.mkdirs()
            java.lang.String r0 = "bugreport.json"
            java.io.File r0 = X.JTO.A0s(r1, r0)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r0)
            X.3mB r1 = A01     // Catch:{ all -> 0x004b }
            X.PeO r0 = X.C73532PeO.A00     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r1.A02(r6, r0)     // Catch:{ all -> 0x004b }
            byte[] r0 = X.C66582MXn.A1a(r0)     // Catch:{ all -> 0x004b }
            r2.write(r0)     // Catch:{ all -> 0x004b }
            r2.close()
            java.lang.String r0 = "BugReporterActivity.INTENT_EXTRA_BUGREPORT_ID"
            r5.putExtra(r0, r3)
            return
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x0052:
            java.lang.String r0 = "BugReporterActivity.INTENT_EXTRA_BUGREPORT"
            r5.putExtra(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70995OVq.A01(android.content.Intent, com.instagram.bugreporter.model.BugReport, X.0lg):void");
    }
}
