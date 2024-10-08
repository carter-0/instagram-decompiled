package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.gallery.suggestions.database.SuggestionsDBHelper;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public final class LOH {
    public final Context A00;
    public final UserSession A01;
    public final SuggestionsDBHelper A02;
    public final C227382jA A03;
    public final GVG A04;
    public final JY1 A05;
    public final Map A06;
    public final 0sL A07;

    public final Object A01(C390879rz r8, AnonymousClass4D7 r9) {
        Object A002;
        C390879rz r3 = r8;
        Object obj = this.A06.get(r8);
        if (obj == null || (A002 = 1Eo.A00(r9, JTP.A0U(AnonymousClass12T.A00, 281480192), new C59700JUh(this, r3, obj, (AnonymousClass4D7) null, 13))) != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, com.instagram.gallery.suggestions.database.SuggestionsDBHelper] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LOH(android.content.Context r20, com.instagram.common.session.UserSession r21, X.C227382jA r22, X.GVG r23, X.JY2 r24, X.JY1 r25) {
        /*
            r19 = this;
            X.KuI r2 = com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A00
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper r1 = com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A01
            if (r1 != 0) goto L_0x0017
            monitor-enter(r2)
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper r1 = com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A01     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0016
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper r1 = new com.instagram.gallery.suggestions.database.SuggestionsDBHelper     // Catch:{ all -> 0x0013 }
            r1.<init>()     // Catch:{ all -> 0x0013 }
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A01 = r1     // Catch:{ all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0016:
            monitor-exit(r2)
        L_0x0017:
            r0 = 8
            X.0qQ.A0B(r1, r0)
            r2 = r19
            r2.<init>()
            r5 = r21
            r2.A01 = r5
            r4 = r20
            r2.A00 = r4
            r9 = r25
            r2.A05 = r9
            r7 = r22
            r2.A03 = r7
            r0 = r23
            r2.A04 = r0
            r2.A02 = r1
            r0 = 28
            X.JFt r10 = new X.JFt
            r10.<init>(r2, r0)
            r2.A07 = r10
            X.9rz r6 = X.C390879rz.AUTO_CREATED_REELS
            X.LAP r3 = new X.LAP
            r8 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r3)
            X.0eP r3 = X.AnonymousClass7TE.A1L(r6, r0)
            X.9rz r14 = X.C390879rz.SMART_ALBUMS
            X.LAP r11 = new X.LAP
            r12 = r4
            r13 = r5
            r15 = r7
            r16 = r8
            r17 = r9
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r11)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r14, r0)
            X.9rz r14 = X.C390879rz.MAGIC_MEDIA_REMIX
            X.LAP r11 = new X.LAP
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r11)
            java.util.LinkedHashMap r0 = X.DbY.A0q(r14, r0, r3, r1)
            r2.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOH.<init>(android.content.Context, com.instagram.common.session.UserSession, X.2jA, X.GVG, X.JY2, X.JY1):void");
    }

    public static final AnonymousClass2U7 A00(Context context, LOH loh, int i) {
        Calendar A002 = C361828gs.A00();
        A002.setTimeInMillis(System.currentTimeMillis());
        A002.add(5, -i);
        Date time = A002.getTime();
        0qQ.A07(time);
        int time2 = (int) (((float) C362978ip.A01(C361828gs.A00(), time).getTime()) / 1000.0f);
        return C63275KuK.A00(context, 0sn.A00, C227382jA.A00(loh.A01), time2);
    }
}
