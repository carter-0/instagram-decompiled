package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "Deprecated interactivity API", replaceWith = @ReplaceWith(expression = "ShowreelInteractivityListener", imports = {"com.facebook.showreel.core.interactivity"}))
/* renamed from: X.62E  reason: invalid class name */
public final class AnonymousClass62E {
    public final Map A00 = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        if (r1 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.graphics.PointF r8, android.graphics.RectF r9, android.view.View r10, X.C59541JNn r11, X.C14526Txm r12, java.lang.Object r13) {
        /*
            r7 = this;
            r6 = 0
            r5 = 1
            java.util.Map r2 = r7.A00
            java.lang.Object r1 = r2.get(r9)
            boolean r0 = r1 instanceof X.C255783ui
            r3 = 0
            if (r0 == 0) goto L_0x001e
            X.3ui r1 = (X.C255783ui) r1
        L_0x000f:
            java.lang.String r4 = r12.A00
            java.lang.String r0 = "hashtag"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x0034
            if (r1 != 0) goto L_0x00bb
            java.lang.String r1 = r12.A01
            goto L_0x0020
        L_0x001e:
            r1 = r3
            goto L_0x000f
        L_0x0020:
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ UnsupportedEncodingException -> 0x002b }
            java.lang.String r0 = r0.name()     // Catch:{ UnsupportedEncodingException -> 0x002b }
            java.lang.String r0 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x002b }
            goto L_0x00a8
        L_0x002b:
            r2 = move-exception
            java.lang.String r1 = "Bad encoding type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        L_0x0034:
            java.lang.String r0 = "mention"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x006b
            if (r1 != 0) goto L_0x00bb
            java.lang.String r1 = r12.A01
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            java.lang.String r0 = r0.name()     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            boolean r0 = r13 instanceof X.C255773uh
            if (r0 == 0) goto L_0x00a7
            X.3uh r13 = (X.C255773uh) r13
            if (r13 == 0) goto L_0x005c
            X.6LR r0 = r13.A0G()
            if (r0 == 0) goto L_0x005c
            com.instagram.user.model.User r3 = X.AnonymousClass6MG.A02(r0, r1)
        L_0x005c:
            X.3ui r1 = new X.3ui
            r1.<init>((com.instagram.user.model.User) r3)
            goto L_0x00b8
        L_0x0062:
            r2 = move-exception
            java.lang.String r1 = "Bad encoding type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        L_0x006b:
            java.lang.String r0 = "media"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x00a5
            if (r1 != 0) goto L_0x009e
            X.3ui r1 = new X.3ui
            r1.<init>()
            X.3WT r0 = X.AnonymousClass3WT.DPA
            r1.A11 = r0
            java.lang.String r0 = r12.A01
            r1.A1a = r0
            boolean r0 = r13 instanceof X.C255773uh
            if (r0 == 0) goto L_0x00a7
            X.3uh r13 = (X.C255773uh) r13
            if (r13 == 0) goto L_0x00a7
            android.content.Context r0 = r10.getContext()
            X.0qQ.A07(r0)
            java.lang.CharSequence r0 = X.AnonymousClass4EQ.A05(r0, r3, r13)
            java.lang.String r0 = r0.toString()
            r1.A1R = r0
            r2.put(r9, r1)
        L_0x009e:
            float r0 = r8.x
            r1.A03 = r0
            float r0 = r8.y
            goto L_0x00c5
        L_0x00a5:
            if (r1 != 0) goto L_0x00c7
        L_0x00a7:
            return r6
        L_0x00a8:
            java.lang.String r0 = r0.toLowerCase()
            X.0qQ.A07(r0)
            com.instagram.model.hashtag.HashtagImpl r0 = X.C281965Ag.A01(r0, r0)
            X.3ui r1 = new X.3ui
            r1.<init>((com.instagram.model.hashtag.Hashtag) r0)
        L_0x00b8:
            r2.put(r9, r1)
        L_0x00bb:
            float r0 = r9.centerX()
            r1.A03 = r0
            float r0 = r9.centerY()
        L_0x00c5:
            r1.A04 = r0
        L_0x00c7:
            float r0 = r9.height()
            r1.A00 = r0
            if (r11 == 0) goto L_0x00a7
            r11.Dkd(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass62E.A00(android.graphics.PointF, android.graphics.RectF, android.view.View, X.JNn, X.Txm, java.lang.Object):boolean");
    }
}
