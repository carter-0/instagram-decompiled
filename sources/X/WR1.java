package X;

public final class WR1 implements AnonymousClass1FD {
    public static final WR1 A00 = new WR1();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            X.Uxr r0 = X.C16597Uxr.UNKNOWN
            X.UOh r2 = new X.UOh
            r2.<init>(r0, r1)
            X.16L r1 = r4.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x001f
            java.lang.String r1 = "JSON string for IgMediaSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x001f:
            X.16L r1 = r4.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0281
            java.lang.String r1 = X.AnonymousClass7TE.A17(r4)
            if (r1 == 0) goto L_0x027c
            int r0 = r1.hashCode()
            switch(r0) {
                case -2030994180: goto L_0x0041;
                case -2007375800: goto L_0x0060;
                case -2000617044: goto L_0x006f;
                case -1992012396: goto L_0x007e;
                case -1985806860: goto L_0x008d;
                case -1870102005: goto L_0x009c;
                case -1798207542: goto L_0x00ab;
                case -1798207541: goto L_0x00ba;
                case -1263142544: goto L_0x00ca;
                case -1221029593: goto L_0x00da;
                case -1203619573: goto L_0x00ea;
                case -918445096: goto L_0x00fe;
                case -900774058: goto L_0x0118;
                case -761937713: goto L_0x0132;
                case -732121899: goto L_0x0142;
                case -478065615: goto L_0x0152;
                case -450937106: goto L_0x0162;
                case -265713450: goto L_0x0172;
                case -15119530: goto L_0x018e;
                case 3601339: goto L_0x019e;
                case 110371416: goto L_0x01b8;
                case 113126854: goto L_0x01c8;
                case 278118624: goto L_0x01d8;
                case 450436211: goto L_0x01e8;
                case 704531672: goto L_0x01f8;
                case 984361298: goto L_0x0208;
                case 1260322998: goto L_0x0218;
                case 1353515042: goto L_0x0228;
                case 1594256643: goto L_0x0242;
                case 1776071171: goto L_0x0252;
                case 1782139044: goto L_0x0262;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "IgMediaStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x003d:
            r4.A0z()
            goto L_0x001f
        L_0x0041:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.16L r1 = r4.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x003d
            java.lang.String r0 = r4.A1P()
            if (r0 == 0) goto L_0x003d
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x003d
            r2.A09 = r0
            goto L_0x003d
        L_0x0060:
            java.lang.String r0 = "has_collaborators"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.A0d()
            r2.A0Q = r0
            goto L_0x003d
        L_0x006f:
            java.lang.String r0 = "repost_pill_width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            int r0 = r4.A1D()
            r2.A03 = r0
            goto L_0x003d
        L_0x007e:
            java.lang.String r0 = "duration"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r2.A0C = r0
            goto L_0x003d
        L_0x008d:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            int r0 = r4.A1D()
            r2.A04 = r0
            goto L_0x003d
        L_0x009c:
            java.lang.String r0 = "user_attribution"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r2.A0M = r0
            goto L_0x003d
        L_0x00ab:
            java.lang.String r0 = "padding_x"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            int r0 = r4.A1D()
            r2.A01 = r0
            goto L_0x003d
        L_0x00ba:
            java.lang.String r0 = "padding_y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            int r0 = r4.A1D()
            r2.A02 = r0
            goto L_0x003d
        L_0x00ca:
            java.lang.String r0 = "carousel_child_has_product_tags"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.A0d()
            r2.A0P = r0
            goto L_0x003d
        L_0x00da:
            java.lang.String r0 = "height"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            int r0 = r4.A1D()
            r2.A00 = r0
            goto L_0x003d
        L_0x00ea:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r4, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r2.A08 = r0
            goto L_0x003d
        L_0x00fe:
            java.lang.String r0 = "carousel_child_media_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.16L r1 = r4.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x003d
            java.lang.String r0 = r4.A1P()
            if (r0 == 0) goto L_0x003d
            r2.A0B = r0
            goto L_0x003d
        L_0x0118:
            java.lang.String r0 = "media_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.16L r1 = r4.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x003d
            java.lang.String r0 = r4.A1P()
            if (r0 == 0) goto L_0x003d
            r2.A0I = r0
            goto L_0x003d
        L_0x0132:
            java.lang.String r0 = "fundraiser_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r2.A0H = r0
            goto L_0x003d
        L_0x0142:
            java.lang.String r0 = "is_carousel"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.A0d()
            r2.A0T = r0
            goto L_0x003d
        L_0x0152:
            java.lang.String r0 = "duration_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.Long r0 = X.AnonymousClass7TF.A0Z(r4)
            r2.A0A = r0
            goto L_0x003d
        L_0x0162:
            java.lang.String r0 = "has_product_tags"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.A0d()
            r2.A0R = r0
            goto L_0x003d
        L_0x0172:
            java.lang.String r0 = X.Dbe.A01()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.16L r1 = r4.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x003d
            java.lang.String r0 = r4.A1P()
            if (r0 == 0) goto L_0x003d
            r2.A0N = r0
            goto L_0x003d
        L_0x018e:
            java.lang.String r0 = "event_action_button_text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r2.A0D = r0
            goto L_0x003d
        L_0x019e:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.16L r1 = r4.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x003d
            java.lang.String r0 = r4.A1P()
            if (r0 == 0) goto L_0x003d
            r2.A0O = r0
            goto L_0x003d
        L_0x01b8:
            java.lang.String r0 = "title"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r2.A0L = r0
            goto L_0x003d
        L_0x01c8:
            java.lang.String r0 = "width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            int r0 = r4.A1D()
            r2.A05 = r0
            goto L_0x003d
        L_0x01d8:
            java.lang.String r0 = "event_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r2.A0E = r0
            goto L_0x003d
        L_0x01e8:
            java.lang.String r0 = "event_title"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r2.A0G = r0
            goto L_0x003d
        L_0x01f8:
            java.lang.String r0 = "is_autoplay"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.A0d()
            r2.A0S = r0
            goto L_0x003d
        L_0x0208:
            java.lang.String r0 = "event_time"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r2.A0F = r0
            goto L_0x003d
        L_0x0218:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.ULw r0 = X.C13988Tno.A0H(r4)
            r2.A06 = r0
            goto L_0x003d
        L_0x0228:
            java.lang.String r0 = "media_owner_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.16L r1 = r4.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x003d
            java.lang.String r0 = r4.A1P()
            if (r0 == 0) goto L_0x003d
            r2.A0J = r0
            goto L_0x003d
        L_0x0242:
            java.lang.String r0 = "is_media_author_seller"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.A0d()
            r2.A0U = r0
            goto L_0x003d
        L_0x0252:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.ULH r0 = X.C13988Tno.A0N(r4)
            r2.A07 = r0
            goto L_0x003d
        L_0x0262:
            java.lang.String r0 = "profile_pic_url"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.16L r1 = r4.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x003d
            java.lang.String r0 = r4.A1P()
            if (r0 == 0) goto L_0x003d
            r2.A0K = r0
            goto L_0x003d
        L_0x027c:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0281:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WR1.invoke(X.16F):java.lang.Object");
    }
}
