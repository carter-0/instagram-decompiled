package X;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Djo  reason: case insensitive filesystem */
public final class C46717Djo extends Filter {
    public final C49366EuU A00;
    public final /* synthetic */ C46713Djj A01;

    public static String A00(G8G g8g, String str) {
        if (str != null) {
            try {
                String A012 = A01(g8g.Bby());
                int length = str.length();
                boolean z = false;
                if (length <= A012.length()) {
                    if (length >= 3) {
                        0mp.A0F(A012, str);
                    }
                    z = 0mp.A0F(A012, str);
                }
                if (z) {
                    return g8g.Bby();
                }
                String A013 = A01(g8g.B0m());
                boolean z2 = false;
                if (length <= A013.length()) {
                    if (length >= 3) {
                        0mp.A0F(A013, str);
                    }
                    z2 = 0mp.A0F(A013, str);
                }
                if (z2) {
                    return g8g.B0m();
                }
                String A014 = A01(g8g.getUsername());
                boolean z3 = false;
                if (length <= A014.length()) {
                    if (length >= 3) {
                        0mp.A0F(A014, str);
                    }
                    z3 = 0mp.A0F(A014, str);
                }
                if (z3) {
                    if (g8g.EHj()) {
                        return g8g.getFullName();
                    }
                    return g8g.getUsername();
                }
            } catch (RuntimeException e) {
                0wb.A03("Auto Complete User Adapter Subsequence Match", e.toString());
            }
        }
        return null;
    }

    public C46717Djo(C49366EuU euU, C46713Djj djj) {
        this.A01 = djj;
        this.A00 = euU;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r7.A07.CO7(r2.getUserId()) != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r9) {
        /*
            r8 = this;
            android.widget.Filter$FilterResults r6 = new android.widget.Filter$FilterResults
            r6.<init>()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x001c
            X.Djj r7 = r8.A01
            monitor-enter(r7)
            java.util.List r0 = r7.A09     // Catch:{ all -> 0x0019 }
            r5.addAll(r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r7)     // Catch:{ all -> 0x0019 }
            goto L_0x0058
        L_0x0019:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x001c:
            java.lang.String r0 = r9.toString()
            java.lang.String r4 = A01(r0)
            X.Djj r7 = r8.A01
            monitor-enter(r7)
            java.util.List r0 = r7.A09     // Catch:{ all -> 0x0066 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0066 }
        L_0x002d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0066 }
            X.G8G r2 = (X.G8G) r2     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = A00(r2, r4)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0050
            boolean r0 = r7.A02     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0050
            X.0BQ r1 = r7.A07     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r2.getUserId()     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.CO7(r0)     // Catch:{ all -> 0x0066 }
            r0 = 1
            if (r1 == 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 == 0) goto L_0x002d
            r5.add(r2)     // Catch:{ all -> 0x0066 }
            goto L_0x002d
        L_0x0057:
            monitor-exit(r7)     // Catch:{ all -> 0x0066 }
        L_0x0058:
            java.util.Comparator r0 = r7.A08
            java.util.Collections.sort(r5, r0)
            int r0 = r5.size()
            r6.count = r0
            r6.values = r5
            return r6
        L_0x0066:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46717Djo.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        C46713Djj djj = this.A01;
        Object obj = filterResults.values;
        if (obj == null) {
            list = Collections.emptyList();
        } else {
            list = (List) obj;
        }
        djj.A01 = list;
        if (charSequence == null) {
            charSequence = "";
        }
        djj.A00 = charSequence;
        if (!list.isEmpty()) {
            0fE.A00(djj, -748582001);
        } else {
            0fE.A01(djj, -308373175);
        }
    }

    public static String A01(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        return charSequence.toString().toLowerCase(Locale.US);
    }
}
