package X;

import android.widget.Filter;
import java.util.Collection;

/* renamed from: X.MsU  reason: case insensitive filesystem */
public final class C67690MsU extends Filter {
    public final /* synthetic */ C67685MsN A00;

    public C67690MsU(C67685MsN msN) {
        this.A00 = msN;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r6 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r8) {
        /*
            r7 = this;
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            if (r8 == 0) goto L_0x005a
            java.lang.String r0 = r8.toString()
            java.lang.String r0 = X.C66582MXn.A0w(r0)
            java.lang.String r6 = X.DbV.A12(r0)
            if (r6 == 0) goto L_0x005d
        L_0x0015:
            int r0 = r6.length()
            if (r0 == 0) goto L_0x005d
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.MsN r0 = r7.A00
            java.util.ArrayList r0 = r0.A01
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r0)
        L_0x0027:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r3)
            com.instagram.direct.appwidget.DirectThreadWidgetItem r2 = (com.instagram.direct.appwidget.DirectThreadWidgetItem) r2
            java.lang.String r0 = r2.A04
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = ""
        L_0x0039:
            java.lang.String r0 = r0.toLowerCase()
            X.0qQ.A07(r0)
            r1 = 0
            boolean r0 = X.00l.A0d(r0, r6, r1)
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = r2.A05
            java.lang.String r0 = r0.toLowerCase()
            X.0qQ.A07(r0)
            boolean r0 = X.00l.A0d(r0, r6, r1)
            if (r0 == 0) goto L_0x0027
        L_0x0056:
            r5.add(r2)
            goto L_0x0027
        L_0x005a:
            java.lang.String r6 = ""
            goto L_0x0015
        L_0x005d:
            X.MsN r0 = r7.A00
            java.util.ArrayList r5 = r0.A01
        L_0x0061:
            r4.values = r5
            int r0 = r5.size()
            r4.count = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67690MsU.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        if (filterResults != null) {
            obj = filterResults.values;
        } else {
            obj = null;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.appwidget.DirectThreadWidgetItem>");
        C67685MsN msN = this.A00;
        msN.clear();
        msN.addAll((Collection) obj);
    }
}
