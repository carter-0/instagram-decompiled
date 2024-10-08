package X;

import android.view.View;
import java.util.Map;

/* renamed from: X.5uv  reason: invalid class name and case insensitive filesystem */
public final class C299315uv extends AnonymousClass59E {
    public final Object A00;
    public final View A01;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0138, code lost:
        if (r13 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C299315uv(android.view.View r20, X.C244063aa r21, java.lang.Object r22, java.lang.String r23) {
        /*
            r19 = this;
            r1 = r19
            r15 = r20
            r0 = r21
            r13 = r22
            r1.<init>(r15, r0)
            r1.A01 = r15
            r1.A00 = r13
            java.util.Map r0 = r1.A01
            r18 = r0
            r17 = 0
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            boolean r0 = r13 instanceof X.1Xj
            java.lang.String r12 = "Required value was null."
            java.lang.String r11 = "EXTRACT_FROM_MEDIA"
            java.lang.String r10 = "thumbnail_url"
            java.lang.String r2 = "has_audio"
            java.lang.String r14 = "index_of_card"
            java.lang.String r6 = "view_rendering_component_type"
            java.lang.String r4 = "video_duration_sec"
            java.lang.String r3 = "has_subtitle"
            java.lang.String r7 = "video_ids"
            java.lang.String r9 = "media_urls"
            java.lang.String r8 = "video"
            java.lang.String r1 = "component_type"
            r16 = r23
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r13 instanceof X.C267324bN
            if (r0 == 0) goto L_0x00c6
            X.4bN r13 = (X.C267324bN) r13
            X.1Xj r13 = r13.A02
        L_0x0040:
            if (r13 == 0) goto L_0x020e
            X.59A r15 = X.AnonymousClass59A.A00
            r0 = r16
            java.lang.Integer r15 = r15.A06(r0)
            if (r15 == 0) goto L_0x006e
            int r0 = r15.intValue()
            X.1Xj r16 = r13.A1c(r0)
            if (r16 != 0) goto L_0x0058
            r16 = r13
        L_0x0058:
            boolean r16 = r16.CeS()
            if (r16 == 0) goto L_0x006e
            X.1Xj r16 = r13.A1c(r0)
            if (r16 != 0) goto L_0x0066
            r16 = r13
        L_0x0066:
            r5.put(r14, r15)
            A00(r13, r5, r0)
            r13 = r16
        L_0x006e:
            boolean r0 = r13.CeS()
            if (r0 == 0) goto L_0x020e
            r5.put(r1, r8)
            X.3WR r0 = r13.CEL()
            java.util.List r0 = r0.A06()
            java.lang.String r0 = r0.toString()
            r5.put(r9, r0)
            X.3WR r0 = r13.CEL()
            java.util.List r0 = r0.A05()
            java.lang.String r0 = r0.toString()
            r5.put(r7, r0)
            boolean r0 = r13.A4Y()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.put(r2, r0)
            boolean r0 = r13.A51()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.put(r3, r0)
            double r0 = r13.A0k()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.put(r4, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r13.A1Q()
            if (r0 != 0) goto L_0x01b9
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x00c2:
            X.1Xj r13 = (X.1Xj) r13
            goto L_0x0040
        L_0x00c6:
            boolean r0 = r13 instanceof X.C255773uh
            if (r0 == 0) goto L_0x013b
            X.59A r15 = X.AnonymousClass59A.A00
            r0 = r16
            java.lang.Integer r0 = r15.A06(r0)
            X.3uh r13 = (X.C255773uh) r13
            X.1Xj r13 = r13.A0b
            if (r0 == 0) goto L_0x0138
            r5.put(r14, r0)
            if (r13 == 0) goto L_0x020e
            int r0 = r0.intValue()
            A00(r13, r5, r0)
        L_0x00e4:
            boolean r0 = r13.CeS()
            if (r0 == 0) goto L_0x020e
            r5.put(r1, r8)
            X.3WR r0 = r13.CEL()
            java.util.List r0 = r0.A06()
            java.lang.String r0 = r0.toString()
            r5.put(r9, r0)
            X.3WR r0 = r13.CEL()
            java.util.List r0 = r0.A05()
            java.lang.String r0 = r0.toString()
            r5.put(r7, r0)
            boolean r0 = r13.A4Y()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.put(r2, r0)
            boolean r0 = r13.A51()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.put(r3, r0)
            double r0 = r13.A0k()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.put(r4, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r13.A1Q()
            if (r0 != 0) goto L_0x01b9
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x0138:
            if (r13 == 0) goto L_0x020e
            goto L_0x00e4
        L_0x013b:
            boolean r0 = r13 instanceof X.C53288Gla
            r16 = 0
            if (r0 == 0) goto L_0x01c1
            X.Gla r13 = (X.C53288Gla) r13
            X.Gz1 r0 = r13.A03
            java.util.List r15 = r0.A0B
            int r0 = r13.A00
            java.lang.Object r0 = r15.get(r0)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r13 = r0.A00()
            boolean r0 = r13.A5D()
            if (r0 == 0) goto L_0x0165
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r5.put(r14, r0)
            r0 = r17
            A00(r13, r5, r0)
        L_0x0165:
            boolean r0 = r13.CeS()
            if (r0 == 0) goto L_0x020e
            r5.put(r1, r8)
            X.3WR r0 = r13.CEL()
            java.util.List r0 = r0.A06()
            java.lang.String r0 = r0.toString()
            r5.put(r9, r0)
            X.3WR r0 = r13.CEL()
            java.util.List r0 = r0.A05()
            java.lang.String r0 = r0.toString()
            r5.put(r7, r0)
            boolean r0 = r13.A4Y()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.put(r2, r0)
            boolean r0 = r13.A51()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.put(r3, r0)
            double r0 = r13.A0k()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.put(r4, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r13.A1Q()
            if (r0 != 0) goto L_0x01b9
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x01b9:
            java.lang.String r0 = r0.getUrl()
            r5.put(r10, r0)
            goto L_0x020b
        L_0x01c1:
            boolean r0 = r15 instanceof com.instagram.ui.simplevideolayout.SimpleVideoLayout
            if (r0 == 0) goto L_0x020e
            r0 = 2131428813(0x7f0b05cd, float:1.8479281E38)
            java.lang.Object r2 = r15.getTag(r0)
            boolean r0 = r2 instanceof X.OI0
            if (r0 == 0) goto L_0x020e
            X.OI0 r2 = (X.OI0) r2
            if (r2 == 0) goto L_0x020e
            r5.put(r1, r8)
            X.3WR r1 = r2.A05
            java.util.List r0 = r1.A06()
            java.lang.String r0 = r0.toString()
            r5.put(r9, r0)
            java.util.List r0 = r1.A05()
            java.lang.String r0 = r0.toString()
            r5.put(r7, r0)
            java.lang.String r0 = r1.A0I
            if (r0 == 0) goto L_0x01f5
            r16 = 1
        L_0x01f5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r5.put(r3, r0)
            long r2 = r2.A03
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            double r0 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.put(r4, r0)
            java.lang.String r11 = "BLOKS"
        L_0x020b:
            r5.put(r6, r11)
        L_0x020e:
            r0 = r18
            r0.putAll(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299315uv.<init>(android.view.View, X.3aa, java.lang.Object, java.lang.String):void");
    }

    public static final void A00(1Xj r2, Map map, int i) {
        1Xj A1c = r2.A1c(i);
        if (A1c == null) {
            A1c = r2;
        }
        String id = A1c.getId();
        if (id != null) {
            map.put("carousel_media_id", id);
            1Xj A1c2 = r2.A1c(i);
            if (A1c2 == null) {
                A1c2 = r2;
            }
            map.put("carousel_media_type", A1c2.BR7().name());
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
