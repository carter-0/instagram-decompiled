package X;

import android.os.Bundle;
import com.instagram.common.gallery.Medium;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.prompts.DirectPromptTypes;

/* renamed from: X.Mu0  reason: case insensitive filesystem */
public final class C67747Mu0 extends 2YL {
    public Medium A00;
    public String A01;
    public final int A02;
    public final DirectPromptTypes A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final 05G A08;
    public final 05G A09;

    public C67747Mu0(Bundle bundle) {
        0qQ.A0B(bundle, 1);
        String string = bundle.getString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if (string != null) {
            this.A06 = string;
            this.A03 = DirectPromptTypes.DAILY_PROMPT;
            String A0t = C66580MXl.A0t(bundle);
            this.A04 = A0t == null ? "" : A0t;
            String string2 = bundle.getString("card_gallery_collection_title");
            this.A05 = string2 == null ? "" : string2;
            this.A02 = bundle.getInt("direct_channel_audience_type");
            String string3 = bundle.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_V2_ID");
            this.A07 = string3 == null ? "" : string3;
            this.A01 = "";
            this.A08 = C51970G9q.A10(false);
            this.A09 = DbS.A10(C69325NjQ.TEXT);
            return;
        }
        throw C66580MXl.A0p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (X.00l.A0W(X.DbV.A12(r4.A01)) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r4.A00 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C67747Mu0 r4) {
        /*
            X.05G r3 = r4.A08
            X.05G r0 = r4.A09
            java.lang.Object r0 = r0.getValue()
            X.NjQ r0 = (X.C69325NjQ) r0
            int r2 = r0.ordinal()
            r1 = 0
            if (r2 == r1) goto L_0x001d
            r0 = 1
            if (r2 != r0) goto L_0x002a
            com.instagram.common.gallery.Medium r0 = r4.A00
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            X.AnonymousClass7TF.A1O(r3, r1)
            return
        L_0x001d:
            java.lang.String r0 = r4.A01
            java.lang.String r0 = X.DbV.A12(r0)
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0019
            goto L_0x0018
        L_0x002a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67747Mu0.A00(X.Mu0):void");
    }
}
