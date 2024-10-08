package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.gallery.suggestions.database.SuggestionsDBHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class JY3 {
    public final Context A00;
    public final UserSession A01;
    public final SuggestionsDBHelper A02;
    public final GVG A03;
    public final JY2 A04;
    public final Map A05;

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, com.instagram.gallery.suggestions.database.SuggestionsDBHelper] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ JY3(android.content.Context r5, com.instagram.common.session.UserSession r6, X.JY2 r7) {
        /*
            r4 = this;
            X.GVG r3 = new X.GVG
            r3.<init>(r6)
            X.KuI r2 = com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A00
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper r1 = com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A01
            if (r1 != 0) goto L_0x001c
            monitor-enter(r2)
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper r1 = com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A01     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x001b
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper r1 = new com.instagram.gallery.suggestions.database.SuggestionsDBHelper     // Catch:{ all -> 0x0018 }
            r1.<init>()     // Catch:{ all -> 0x0018 }
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A01 = r1     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001b:
            monitor-exit(r2)
        L_0x001c:
            X.AnonymousClass7TG.A1Q(r6, r7)
            r0 = 6
            X.0qQ.A0B(r1, r0)
            r4.<init>()
            r4.A00 = r5
            r4.A01 = r6
            r4.A04 = r7
            r4.A03 = r3
            r4.A02 = r1
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY3.<init>(android.content.Context, com.instagram.common.session.UserSession, X.JY2):void");
    }

    public static final List A00(JY3 jy3, List list) {
        0sl stringSet = JTS.A0V(jy3.A04).getStringSet("suggestions_hide_prefs_key", (Set) null);
        if (stringSet == null) {
            stringSet = 0sl.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!stringSet.contains(((C60998Juu) next).A00())) {
                A1C.add(next);
            }
        }
        return A1C;
    }
}
