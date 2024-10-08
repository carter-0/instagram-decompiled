package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public abstract class W3F {
    public static void A04(17Z r2, C16597Uxr uxr) {
        0qQ.A0B(uxr, 0);
        r2.A0R("sticker_type", uxr.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.17Z] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.17Z r6, X.X5I r7) {
        /*
            r3 = 1
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.getTypeName()
            r6.A0q(r0)
            boolean r0 = r7 instanceof X.C15089UOh
            if (r0 == 0) goto L_0x0102
            X.UOh r7 = (X.C15089UOh) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0O
            A06(r6, r0)
            X.Uxr r0 = r7.A09
            A04(r6, r0)
            X.UKv r0 = r7.A08
            A03(r6, r0)
            X.ULH r0 = r7.A07
            A02(r6, r0)
            X.ULw r0 = r7.A06
            A00(r0, r6)
            int r0 = r7.A04
            A01(r6, r0)
            java.lang.String r1 = r7.A0I
            java.lang.String r0 = "media_id"
            r6.A0R(r0, r1)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "carousel_child_media_id"
            r6.A0R(r0, r1)
            java.lang.String r1 = r7.A0J
            java.lang.String r0 = "media_owner_id"
            r6.A0R(r0, r1)
            java.lang.String r1 = r7.A0N
            java.lang.String r0 = X.Dbe.A01()
            r6.A0R(r0, r1)
            java.lang.String r1 = r7.A0M
            if (r1 == 0) goto L_0x005f
            java.lang.String r0 = "user_attribution"
            r6.A0R(r0, r1)
        L_0x005f:
            java.lang.String r1 = r7.A0K
            java.lang.String r0 = "profile_pic_url"
            r6.A0R(r0, r1)
            boolean r1 = r7.A0R
            java.lang.String r0 = "has_product_tags"
            r6.A0S(r0, r1)
            boolean r1 = r7.A0P
            java.lang.String r0 = "carousel_child_has_product_tags"
            r6.A0S(r0, r1)
            boolean r1 = r7.A0Q
            java.lang.String r0 = "has_collaborators"
            r6.A0S(r0, r1)
            boolean r1 = r7.A0U
            java.lang.String r0 = "is_media_author_seller"
            r6.A0S(r0, r1)
            java.lang.String r0 = r7.A0L
            X.C41846B3n.A10(r6, r0)
            java.lang.String r1 = r7.A0C
            if (r1 == 0) goto L_0x0090
            java.lang.String r0 = "duration"
            r6.A0R(r0, r1)
        L_0x0090:
            java.lang.Long r0 = r7.A0A
            if (r0 == 0) goto L_0x009d
            long r1 = r0.longValue()
            java.lang.String r0 = "duration_ms"
            r6.A0Q(r0, r1)
        L_0x009d:
            java.lang.String r1 = r7.A0E
            if (r1 == 0) goto L_0x00a6
            java.lang.String r0 = "event_id"
            r6.A0R(r0, r1)
        L_0x00a6:
            java.lang.String r1 = r7.A0G
            if (r1 == 0) goto L_0x00af
            java.lang.String r0 = "event_title"
            r6.A0R(r0, r1)
        L_0x00af:
            java.lang.String r1 = r7.A0F
            if (r1 == 0) goto L_0x00b8
            java.lang.String r0 = "event_time"
            r6.A0R(r0, r1)
        L_0x00b8:
            java.lang.String r1 = r7.A0D
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = "event_action_button_text"
            r6.A0R(r0, r1)
        L_0x00c1:
            boolean r1 = r7.A0S
            java.lang.String r0 = "is_autoplay"
            r6.A0S(r0, r1)
            boolean r1 = r7.A0T
            java.lang.String r0 = "is_carousel"
            r6.A0S(r0, r1)
            java.lang.String r1 = r7.A0H
            if (r1 == 0) goto L_0x00d8
            java.lang.String r0 = "fundraiser_id"
            r6.A0R(r0, r1)
        L_0x00d8:
            int r1 = r7.A05
            java.lang.String r0 = "width"
            r6.A0P(r0, r1)
            int r1 = r7.A00
            java.lang.String r0 = "height"
            r6.A0P(r0, r1)
            int r1 = r7.A01
            java.lang.String r0 = "padding_x"
            r6.A0P(r0, r1)
            int r1 = r7.A02
            java.lang.String r0 = "padding_y"
            r6.A0P(r0, r1)
            int r1 = r7.A03
            java.lang.String r0 = "repost_pill_width"
        L_0x00f8:
            r6.A0P(r0, r1)
        L_0x00fb:
            r6.A0Z()
        L_0x00fe:
            r6.A0Z()
            return
        L_0x0102:
            boolean r0 = r7 instanceof X.UOU
            if (r0 == 0) goto L_0x014d
            X.UOU r7 = (X.UOU) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0A
            A06(r6, r0)
            X.Uxr r0 = r7.A08
            A04(r6, r0)
            X.UKv r0 = r7.A07
            A03(r6, r0)
            X.ULH r0 = r7.A06
            A02(r6, r0)
            X.ULw r0 = r7.A05
            A00(r0, r6)
            int r0 = r7.A04
            A01(r6, r0)
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "image_file_path"
            r6.A0R(r0, r1)
            int r1 = r7.A01
            java.lang.String r0 = "rect_left"
            r6.A0P(r0, r1)
            int r1 = r7.A03
            java.lang.String r0 = "rect_top"
            r6.A0P(r0, r1)
            int r1 = r7.A02
            java.lang.String r0 = "rect_right"
            r6.A0P(r0, r1)
            int r1 = r7.A00
            java.lang.String r0 = "rect_bottom"
            goto L_0x00f8
        L_0x014d:
            boolean r0 = r7 instanceof X.UOd
            if (r0 == 0) goto L_0x0201
            X.UOd r7 = (X.UOd) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0I
            A06(r6, r0)
            X.Uxr r0 = r7.A05
            A04(r6, r0)
            X.UKv r0 = r7.A03
            A03(r6, r0)
            X.ULH r0 = r7.A02
            A02(r6, r0)
            X.ULw r0 = r7.A01
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            X.UKp r1 = r7.A04
            if (r1 == 0) goto L_0x0183
            java.lang.String r0 = "attribution"
            r6.A0q(r0)
            X.C17109VIf.A00(r6, r1)
        L_0x0183:
            java.lang.String r1 = r7.A0A
            if (r1 == 0) goto L_0x0190
            r0 = 1128(0x468, float:1.58E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
        L_0x0190:
            java.lang.String r1 = r7.A0B
            if (r1 == 0) goto L_0x019d
            r0 = 261(0x105, float:3.66E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0R(r0, r1)
        L_0x019d:
            java.lang.String r1 = r7.A0C
            if (r1 == 0) goto L_0x01a6
            java.lang.String r0 = "digit_card_color"
            r6.A0R(r0, r1)
        L_0x01a6:
            java.lang.String r1 = r7.A0D
            if (r1 == 0) goto L_0x01af
            java.lang.String r0 = "digit_color"
            r6.A0R(r0, r1)
        L_0x01af:
            java.lang.String r1 = r7.A0E
            if (r1 == 0) goto L_0x01b8
            java.lang.String r0 = "end_background_color"
            r6.A0R(r0, r1)
        L_0x01b8:
            java.lang.Long r0 = r7.A09
            if (r0 == 0) goto L_0x01c5
            long r1 = r0.longValue()
            java.lang.String r0 = "end_ts"
            r6.A0Q(r0, r1)
        L_0x01c5:
            java.lang.Boolean r0 = r7.A06
            if (r0 == 0) goto L_0x01d2
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "following_enabled"
            r6.A0S(r0, r1)
        L_0x01d2:
            java.lang.Boolean r0 = r7.A07
            if (r0 == 0) goto L_0x01df
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_owner"
            r6.A0S(r0, r1)
        L_0x01df:
            java.lang.String r1 = r7.A0F
            if (r1 == 0) goto L_0x01e8
            java.lang.String r0 = "start_background_color"
            r6.A0R(r0, r1)
        L_0x01e8:
            java.lang.String r0 = r7.A0G
            X.C41846B3n.A0z(r6, r0)
            java.lang.String r0 = r7.A0H
            X.C13988Tno.A1G(r6, r0)
            java.lang.Boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00fb
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "viewer_is_following"
        L_0x01fc:
            r6.A0S(r0, r1)
            goto L_0x00fb
        L_0x0201:
            boolean r0 = r7 instanceof X.UOM
            if (r0 == 0) goto L_0x0234
            X.UOM r7 = (X.UOM) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A06
            A06(r6, r0)
            X.Uxr r0 = r7.A05
            A04(r6, r0)
            X.UKv r0 = r7.A04
            A03(r6, r0)
            X.ULH r0 = r7.A03
            A02(r6, r0)
            X.ULw r0 = r7.A02
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            long r1 = r7.A01
            java.lang.String r0 = "timestamp_ms"
            r6.A0Q(r0, r1)
            goto L_0x00fb
        L_0x0234:
            boolean r0 = r7 instanceof X.UOO
            if (r0 == 0) goto L_0x03c3
            X.UOO r7 = (X.UOO) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A08
            A06(r6, r0)
            X.Uxr r0 = r7.A07
            A04(r6, r0)
            X.UKv r0 = r7.A05
            A03(r6, r0)
            X.ULH r0 = r7.A04
            A02(r6, r0)
            X.ULw r0 = r7.A03
            A00(r0, r6)
            int r0 = r7.A02
            A01(r6, r0)
            java.lang.String r0 = "medium"
            r6.A0q(r0)
            X.ULz r2 = r7.A06
            X.0qQ.A0B(r2, r3)
            r6.A0c()
            int r1 = r2.A05
            java.lang.String r0 = "id"
            r6.A0P(r0, r1)
            int r1 = r2.A08
            java.lang.String r0 = "type"
            r6.A0P(r0, r1)
            java.lang.String r1 = r2.A0X
            java.lang.String r0 = "path"
            r6.A0R(r0, r1)
            int r1 = r2.A02
            java.lang.String r0 = "bucket_id"
            r6.A0P(r0, r1)
            java.lang.String r1 = r2.A0O
            if (r1 == 0) goto L_0x0294
            r0 = 1145(0x479, float:1.604E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
        L_0x0294:
            int r1 = r2.A07
            java.lang.String r0 = "rotation"
            r6.A0P(r0, r1)
            int r1 = r2.A03
            java.lang.String r0 = "duration_in_ms"
            r6.A0P(r0, r1)
            long r0 = r2.A0D
            java.lang.String r4 = "date_taken"
            r6.A0Q(r4, r0)
            long r0 = r2.A0C
            java.lang.String r4 = "date_added"
            r6.A0Q(r4, r0)
            boolean r1 = r2.A0g
            java.lang.String r0 = "is_favorite"
            r6.A0S(r0, r1)
            java.lang.String r1 = r2.A0c
            if (r1 == 0) goto L_0x02c0
            java.lang.String r0 = "uri"
            r6.A0R(r0, r1)
        L_0x02c0:
            java.lang.String r1 = r2.A0U
            if (r1 == 0) goto L_0x02c9
            java.lang.String r0 = "friendly_duration"
            r6.A0R(r0, r1)
        L_0x02c9:
            java.lang.String r1 = r2.A0a
            if (r1 == 0) goto L_0x02d2
            java.lang.String r0 = "thumbnail_path"
            r6.A0R(r0, r1)
        L_0x02d2:
            int r1 = r2.A06
            java.lang.String r0 = "max_sample_size"
            r6.A0P(r0, r1)
            java.lang.String r1 = r2.A0J
            if (r1 == 0) goto L_0x02e6
            r0 = 508(0x1fc, float:7.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
        L_0x02e6:
            java.lang.String r1 = r2.A0K
            if (r1 == 0) goto L_0x02ef
            java.lang.String r0 = "app_attribution_raw_namespace"
            r6.A0R(r0, r1)
        L_0x02ef:
            java.lang.String r1 = r2.A0d
            if (r1 == 0) goto L_0x02f8
            java.lang.String r0 = "wearables_media_id"
            r6.A0R(r0, r1)
        L_0x02f8:
            java.lang.String r1 = r2.A0M
            if (r1 == 0) goto L_0x0305
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
        L_0x0305:
            X.Gms r4 = r2.A0E
            if (r4 == 0) goto L_0x0326
            r0 = 260(0x104, float:3.64E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0q(r0)
            r6.A0c()
            int r1 = r4.A01
            java.lang.String r0 = "top_color"
            r6.A0P(r0, r1)
            int r1 = r4.A00
            java.lang.String r0 = "bottom_color"
            r6.A0P(r0, r1)
            r6.A0Z()
        L_0x0326:
            java.lang.String r1 = r2.A0N
            if (r1 == 0) goto L_0x0333
            r0 = 257(0x101, float:3.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
        L_0x0333:
            boolean r1 = r2.A0i
            r0 = 3990(0xf96, float:5.591E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0S(r0, r1)
            boolean r1 = r2.A0f
            java.lang.String r0 = "has_lat_lng"
            r6.A0S(r0, r1)
            double r0 = r2.A00
            java.lang.String r4 = "latitude"
            r6.A0N(r4, r0)
            double r0 = r2.A01
            java.lang.String r4 = "longitude"
            r6.A0N(r4, r0)
            int r1 = r2.A0B
            java.lang.String r0 = "width"
            r6.A0P(r0, r1)
            int r1 = r2.A04
            java.lang.String r0 = "height"
            r6.A0P(r0, r1)
            java.lang.String r1 = r2.A0V
            if (r1 == 0) goto L_0x036a
            java.lang.String r0 = "locality"
            r6.A0R(r0, r1)
        L_0x036a:
            java.lang.String r1 = r2.A0T
            if (r1 == 0) goto L_0x0373
            java.lang.String r0 = "feature_name"
            r6.A0R(r0, r1)
        L_0x0373:
            java.lang.String r1 = r2.A0Z
            if (r1 == 0) goto L_0x037c
            java.lang.String r0 = "sub_admin_area"
            r6.A0R(r0, r1)
        L_0x037c:
            java.lang.String r1 = r2.A0G
            if (r1 == 0) goto L_0x0385
            java.lang.String r0 = "admin_area"
            r6.A0R(r0, r1)
        L_0x0385:
            java.lang.String r1 = r2.A0R
            if (r1 == 0) goto L_0x038e
            java.lang.String r0 = "country_name"
            r6.A0R(r0, r1)
        L_0x038e:
            java.util.List r1 = r2.A0e
            if (r1 == 0) goto L_0x0efe
            java.lang.String r0 = "faces"
            java.util.Iterator r5 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0398:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0efb
            java.lang.Object r4 = r5.next()
            X.Gmf r4 = (X.C53355Gmf) r4
            X.0qQ.A0B(r4, r3)
            r6.A0c()
            float r1 = r4.A01
            java.lang.String r0 = "x"
            r6.A0O(r0, r1)
            float r1 = r4.A02
            java.lang.String r0 = "y"
            r6.A0O(r0, r1)
            float r1 = r4.A00
            java.lang.String r0 = "confidence"
            r6.A0O(r0, r1)
            r6.A0Z()
            goto L_0x0398
        L_0x03c3:
            boolean r0 = r7 instanceof X.UOP
            if (r0 == 0) goto L_0x0401
            X.UOP r7 = (X.UOP) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A08
            A06(r6, r0)
            X.Uxr r0 = r7.A06
            A04(r6, r0)
            X.UKv r0 = r7.A05
            A03(r6, r0)
            X.ULH r0 = r7.A04
            A02(r6, r0)
            X.ULw r0 = r7.A03
            A00(r0, r6)
            int r0 = r7.A02
            A01(r6, r0)
            java.lang.String r1 = r7.A07
            java.lang.String r0 = "text"
            r6.A0R(r0, r1)
            float r1 = r7.A00
            java.lang.String r0 = "text_size"
            r6.A0O(r0, r1)
            int r1 = r7.A01
            java.lang.String r0 = "max_width"
            goto L_0x00f8
        L_0x0401:
            boolean r0 = r7 instanceof X.UOV
            if (r0 == 0) goto L_0x0476
            X.UOV r7 = (X.UOV) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0B
            A06(r6, r0)
            X.Uxr r0 = r7.A08
            A04(r6, r0)
            X.UKv r0 = r7.A07
            A03(r6, r0)
            X.ULH r0 = r7.A06
            A02(r6, r0)
            X.ULw r0 = r7.A05
            A00(r0, r6)
            int r0 = r7.A04
            A01(r6, r0)
            java.lang.String r1 = r7.A0A
            if (r1 == 0) goto L_0x0434
            java.lang.String r0 = "original_media_id"
            r6.A0R(r0, r1)
        L_0x0434:
            java.lang.String r1 = r7.A09
            if (r1 == 0) goto L_0x0441
            r0 = 340(0x154, float:4.76E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0R(r0, r1)
        L_0x0441:
            int r1 = r7.A03
            java.lang.String r0 = "media_duration"
            r6.A0P(r0, r1)
            int r1 = r7.A02
            r0 = 259(0x103, float:3.63E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0P(r0, r1)
            int r1 = r7.A01
            java.lang.String r0 = "container_height"
            r6.A0P(r0, r1)
            float r1 = r7.A00
            r0 = 46
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0O(r0, r1)
            boolean r1 = r7.A0D
            r0 = 325(0x145, float:4.55E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0S(r0, r1)
            boolean r1 = r7.A0C
            java.lang.String r0 = "has_collaborators"
            goto L_0x01fc
        L_0x0476:
            boolean r0 = r7 instanceof X.UOQ
            if (r0 == 0) goto L_0x04bc
            X.UOQ r7 = (X.UOQ) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A06
            A06(r6, r0)
            X.Uxr r0 = r7.A05
            A04(r6, r0)
            X.UKv r0 = r7.A04
            A03(r6, r0)
            X.ULH r0 = r7.A03
            A02(r6, r0)
            X.ULw r0 = r7.A02
            A00(r0, r6)
            int r0 = r7.A01
            A01(r6, r0)
            int r1 = r7.A00
            java.lang.String r0 = "max_width"
            r6.A0P(r0, r1)
            boolean r1 = r7.A07
            r0 = 317(0x13d, float:4.44E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0S(r0, r1)
            boolean r1 = r7.A08
            r0 = 321(0x141, float:4.5E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x01fc
        L_0x04bc:
            boolean r0 = r7 instanceof X.C15087UOf
            if (r0 == 0) goto L_0x0595
            X.UOf r7 = (X.C15087UOf) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0N
            A06(r6, r0)
            X.Uxr r0 = r7.A07
            A04(r6, r0)
            X.UKv r0 = r7.A03
            A03(r6, r0)
            X.ULH r0 = r7.A02
            A02(r6, r0)
            X.ULw r0 = r7.A01
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            java.lang.Integer r0 = r7.A0A
            if (r0 == 0) goto L_0x04f3
            int r1 = r0.intValue()
            java.lang.String r0 = "active_member_count"
            r6.A0P(r0, r1)
        L_0x04f3:
            java.lang.Integer r0 = r7.A0B
            if (r0 == 0) goto L_0x0500
            int r1 = r0.intValue()
            java.lang.String r0 = "audience_type"
            r6.A0P(r0, r1)
        L_0x0500:
            X.UxY r0 = r7.A04
            if (r0 == 0) goto L_0x050b
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "chat_type"
            r6.A0R(r0, r1)
        L_0x050b:
            java.lang.Integer r0 = r7.A0C
            if (r0 == 0) goto L_0x0518
            int r1 = r0.intValue()
            java.lang.String r0 = "connected_member_count"
            r6.A0P(r0, r1)
        L_0x0518:
            java.lang.String r1 = r7.A0F
            if (r1 == 0) goto L_0x0521
            java.lang.String r0 = "deeplink_url"
            r6.A0R(r0, r1)
        L_0x0521:
            java.lang.Long r0 = r7.A0E
            if (r0 == 0) goto L_0x052e
            long r1 = r0.longValue()
            java.lang.String r0 = "duration_s"
            r6.A0Q(r0, r1)
        L_0x052e:
            java.lang.String r1 = r7.A0G
            if (r1 == 0) goto L_0x0537
            java.lang.String r0 = "entry_point"
            r6.A0R(r0, r1)
        L_0x0537:
            java.lang.String r1 = r7.A0H
            if (r1 == 0) goto L_0x0540
            java.lang.String r0 = "group_image_uri"
            r6.A0R(r0, r1)
        L_0x0540:
            java.lang.Boolean r0 = r7.A08
            if (r0 == 0) goto L_0x054d
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_creation"
            r6.A0S(r0, r1)
        L_0x054d:
            java.lang.Boolean r0 = r7.A09
            if (r0 == 0) goto L_0x055a
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_editing_enabled"
            r6.A0S(r0, r1)
        L_0x055a:
            java.lang.Integer r0 = r7.A0D
            if (r0 == 0) goto L_0x0567
            int r1 = r0.intValue()
            java.lang.String r0 = "member_count"
            r6.A0P(r0, r1)
        L_0x0567:
            X.UxS r0 = r7.A05
            if (r0 == 0) goto L_0x0572
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "member_status"
            r6.A0R(r0, r1)
        L_0x0572:
            java.lang.String r1 = r7.A0I
            if (r1 == 0) goto L_0x057b
            java.lang.String r0 = "share_source"
            r6.A0R(r0, r1)
        L_0x057b:
            java.util.List r1 = r7.A0O
            if (r1 == 0) goto L_0x12eb
            java.lang.String r0 = "social_context_users"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0585:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x12e8
            java.lang.Object r0 = r1.next()
            X.UKp r0 = (X.C15036UKp) r0
            X.C17109VIf.A00(r6, r0)
            goto L_0x0585
        L_0x0595:
            boolean r0 = r7 instanceof X.UOY
            if (r0 == 0) goto L_0x0619
            X.UOY r7 = (X.UOY) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0D
            A06(r6, r0)
            X.Uxr r0 = r7.A08
            boolean r2 = A07(r6, r0)
            X.UKv r0 = r7.A06
            A03(r6, r0)
            X.ULH r0 = r7.A05
            A02(r6, r0)
            X.ULw r0 = r7.A04
            A00(r0, r6)
            int r0 = r7.A03
            A01(r6, r0)
            java.lang.String r0 = "tokens"
            X.16P.A03(r6, r0)
            java.util.List r0 = r7.A0E
            java.util.Iterator r5 = r0.iterator()
        L_0x05cb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0f95
            java.lang.Object r4 = r5.next()
            X.UKe r4 = (X.C15025UKe) r4
            X.0qQ.A0B(r4, r3)
            r6.A0c()
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "written"
            r6.A0R(r0, r1)
            float r1 = r4.A00
            java.lang.String r0 = "confidence"
            r6.A0O(r0, r1)
            int r1 = r4.A04
            java.lang.String r0 = "start_time_ms"
            r6.A0P(r0, r1)
            int r1 = r4.A02
            java.lang.String r0 = "end_time_ms"
            r6.A0P(r0, r1)
            boolean r1 = r4.A07
            java.lang.String r0 = "profanity"
            r6.A0S(r0, r1)
            int r1 = r4.A03
            java.lang.String r0 = "offset"
            r6.A0P(r0, r1)
            float r1 = r4.A01
            java.lang.String r0 = "speed"
            r6.A0O(r0, r1)
            java.lang.String r1 = r4.A05
            java.lang.String r0 = "id"
            r6.A0R(r0, r1)
            r6.A0Z()
            goto L_0x05cb
        L_0x0619:
            boolean r0 = r7 instanceof X.UOZ
            if (r0 == 0) goto L_0x06b0
            X.UOZ r7 = (X.UOZ) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0F
            A06(r6, r0)
            X.Uxr r0 = r7.A04
            A04(r6, r0)
            X.UKv r0 = r7.A03
            A03(r6, r0)
            X.ULH r0 = r7.A02
            A02(r6, r0)
            X.ULw r0 = r7.A01
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            java.lang.String r1 = r7.A09
            if (r1 == 0) goto L_0x064c
            java.lang.String r0 = "click_id"
            r6.A0R(r0, r1)
        L_0x064c:
            java.lang.String r1 = r7.A0A
            if (r1 == 0) goto L_0x0655
            java.lang.String r0 = "custom_cta"
            r6.A0R(r0, r1)
        L_0x0655:
            java.lang.String r1 = r7.A0B
            if (r1 == 0) goto L_0x065e
            java.lang.String r0 = "display_url"
            r6.A0R(r0, r1)
        L_0x065e:
            java.lang.Boolean r0 = r7.A06
            if (r0 == 0) goto L_0x066b
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_universal_link"
            r6.A0S(r0, r1)
        L_0x066b:
            java.lang.String r1 = r7.A0C
            if (r1 == 0) goto L_0x0674
            java.lang.String r0 = "link_title"
            r6.A0R(r0, r1)
        L_0x0674:
            java.lang.String r1 = r7.A0D
            if (r1 == 0) goto L_0x067d
            java.lang.String r0 = "link_type"
            r6.A0R(r0, r1)
        L_0x067d:
            java.lang.Boolean r0 = r7.A07
            if (r0 == 0) goto L_0x068a
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "open_external_browser"
            r6.A0S(r0, r1)
        L_0x068a:
            java.lang.String r1 = r7.A0E
            if (r1 == 0) goto L_0x0693
            java.lang.String r0 = "url"
            r6.A0R(r0, r1)
        L_0x0693:
            java.lang.Boolean r0 = r7.A05
            if (r0 == 0) goto L_0x06a0
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_dynamic_dwell_enabled"
            r6.A0S(r0, r1)
        L_0x06a0:
            java.lang.Boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00fb
            boolean r1 = r0.booleanValue()
            r0 = 391(0x187, float:5.48E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x01fc
        L_0x06b0:
            boolean r0 = r7 instanceof X.UON
            if (r0 == 0) goto L_0x06f0
            X.UON r7 = (X.UON) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A07
            A06(r6, r0)
            X.Uxr r0 = r7.A05
            A04(r6, r0)
            X.UKv r0 = r7.A03
            A03(r6, r0)
            X.ULH r0 = r7.A02
            A02(r6, r0)
            X.ULw r0 = r7.A01
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            java.lang.String r0 = "venue"
            r6.A0q(r0)
            X.XMC r0 = r7.A04
            X.XXr.A00(r6, r0)
            java.lang.Integer r0 = r7.A06
            if (r0 == 0) goto L_0x00fb
            int r1 = r0.intValue()
            java.lang.String r0 = "themed_color"
            goto L_0x00f8
        L_0x06f0:
            boolean r0 = r7 instanceof X.UOS
            if (r0 == 0) goto L_0x07b7
            X.UOS r7 = (X.UOS) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A08
            A06(r6, r0)
            X.Uxr r0 = r7.A07
            boolean r1 = A07(r6, r0)
            X.UKv r0 = r7.A04
            A03(r6, r0)
            X.ULH r0 = r7.A03
            A02(r6, r0)
            X.ULw r0 = r7.A02
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            X.Uxf r0 = r7.A06
            X.0qQ.A0B(r0, r1)
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "music_sticker_display_type"
            r6.A0R(r0, r1)
            java.lang.String r0 = "music_overlay_model"
            r6.A0q(r0)
            X.ULm r0 = r7.A05
            X.C17112VIi.A00(r6, r0)
            r0 = 345(0x159, float:4.83E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.16P.A03(r6, r0)
            java.util.List r0 = r7.A09
            java.util.Iterator r5 = r0.iterator()
        L_0x0740:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0fdc
            java.lang.Object r2 = r5.next()
            X.MbR r2 = (X.C66720MbR) r2
            X.0qQ.A0B(r2, r3)
            r6.A0c()
            int r1 = r2.A01
            java.lang.String r0 = "start_time_in_ms"
            r6.A0P(r0, r1)
            int r1 = r2.A00
            r0 = 1308(0x51c, float:1.833E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0P(r0, r1)
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "phrase"
            r6.A0R(r0, r1)
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x07b3
            java.lang.String r0 = "word_offsets"
            java.util.Iterator r4 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0777:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x07b0
            java.lang.Object r2 = r4.next()
            X.ULD r2 = (X.ULD) r2
            X.0qQ.A0B(r2, r3)
            r6.A0c()
            int r1 = r2.A02
            java.lang.String r0 = "start_index"
            r6.A0P(r0, r1)
            int r1 = r2.A00
            java.lang.String r0 = "end_index"
            r6.A0P(r0, r1)
            int r1 = r2.A03
            java.lang.String r0 = "start_offset_ms"
            r6.A0P(r0, r1)
            int r1 = r2.A01
            java.lang.String r0 = "end_offset_ms"
            r6.A0P(r0, r1)
            boolean r1 = r2.A04
            java.lang.String r0 = "trailing_space"
            r6.A0S(r0, r1)
            r6.A0Z()
            goto L_0x0777
        L_0x07b0:
            r6.A0Y()
        L_0x07b3:
            r6.A0Z()
            goto L_0x0740
        L_0x07b7:
            boolean r0 = r7 instanceof X.UOT
            if (r0 == 0) goto L_0x0804
            X.UOT r7 = (X.UOT) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A09
            A06(r6, r0)
            X.Uxr r0 = r7.A07
            A04(r6, r0)
            X.UKv r0 = r7.A05
            A03(r6, r0)
            X.ULH r0 = r7.A04
            A02(r6, r0)
            X.ULw r0 = r7.A03
            A00(r0, r6)
            int r0 = r7.A02
            A01(r6, r0)
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "text"
            r6.A0R(r0, r1)
            float r1 = r7.A00
            java.lang.String r0 = "text_size"
            r6.A0O(r0, r1)
            int r1 = r7.A01
            java.lang.String r0 = "max_width"
            r6.A0P(r0, r1)
            X.UKp r1 = r7.A06
            if (r1 == 0) goto L_0x00fb
            java.lang.String r0 = "user"
            r6.A0q(r0)
            X.C17109VIf.A00(r6, r1)
            goto L_0x00fb
        L_0x0804:
            boolean r0 = r7 instanceof X.UOR
            if (r0 == 0) goto L_0x084b
            X.UOR r7 = (X.UOR) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A08
            A06(r6, r0)
            X.Uxr r0 = r7.A07
            boolean r1 = A07(r6, r0)
            X.UKv r0 = r7.A04
            A03(r6, r0)
            X.ULH r0 = r7.A03
            A02(r6, r0)
            X.ULw r0 = r7.A02
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            X.Uxf r0 = r7.A06
            X.0qQ.A0B(r0, r1)
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "music_sticker_display_type"
            r6.A0R(r0, r1)
            java.lang.String r0 = "music_overlay_model"
            r6.A0q(r0)
            X.ULm r0 = r7.A05
            X.C17112VIi.A00(r6, r0)
            int r1 = r7.A01
            java.lang.String r0 = "text_color"
            goto L_0x00f8
        L_0x084b:
            boolean r0 = r7 instanceof X.UOW
            if (r0 == 0) goto L_0x08ae
            X.UOW r7 = (X.UOW) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0D
            A06(r6, r0)
            X.Uxr r0 = r7.A09
            A04(r6, r0)
            X.UKv r0 = r7.A08
            A03(r6, r0)
            X.ULH r0 = r7.A07
            A02(r6, r0)
            X.ULw r0 = r7.A06
            A00(r0, r6)
            int r0 = r7.A05
            A01(r6, r0)
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = "first_option_string"
            r6.A0R(r0, r1)
            java.lang.String r1 = r7.A0C
            java.lang.String r0 = "second_option_string"
            r6.A0R(r0, r1)
            float r1 = r7.A00
            java.lang.String r0 = "first_option_text_size"
            r6.A0O(r0, r1)
            float r1 = r7.A02
            java.lang.String r0 = "second_option_text_size"
            r6.A0O(r0, r1)
            java.lang.String r1 = r7.A0B
            if (r1 == 0) goto L_0x089a
            java.lang.String r0 = "question"
            r6.A0R(r0, r1)
        L_0x089a:
            float r1 = r7.A01
            java.lang.String r0 = "question_text_size"
            r6.A0O(r0, r1)
            int r1 = r7.A03
            java.lang.String r0 = "question_max_width"
            r6.A0P(r0, r1)
            int r1 = r7.A04
            java.lang.String r0 = "question_padding_bottom"
            goto L_0x00f8
        L_0x08ae:
            boolean r0 = r7 instanceof X.UOX
            if (r0 == 0) goto L_0x093a
            X.UOX r7 = (X.UOX) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A09
            A06(r6, r0)
            X.Uxr r0 = r7.A04
            A04(r6, r0)
            X.UKv r0 = r7.A03
            A03(r6, r0)
            X.ULH r0 = r7.A02
            A02(r6, r0)
            X.ULw r0 = r7.A01
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            java.lang.String r1 = r7.A07
            java.lang.String r0 = "poll_id"
            r6.A0R(r0, r1)
            java.lang.String r1 = r7.A08
            if (r1 == 0) goto L_0x08e8
            java.lang.String r0 = "question"
            r6.A0R(r0, r1)
        L_0x08e8:
            java.lang.Integer r0 = r7.A05
            if (r0 == 0) goto L_0x08f5
            int r1 = r0.intValue()
            java.lang.String r0 = "viewer_vote"
            r6.A0P(r0, r1)
        L_0x08f5:
            boolean r1 = r7.A0D
            java.lang.String r0 = "viewer_can_vote"
            r6.A0S(r0, r1)
            boolean r1 = r7.A0C
            java.lang.String r0 = "is_shared_result"
            r6.A0S(r0, r1)
            java.lang.String r0 = "tallies"
            X.16P.A03(r6, r0)
            java.util.List r0 = r7.A0B
            java.util.Iterator r4 = r0.iterator()
        L_0x090e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0fe5
            java.lang.Object r2 = r4.next()
            X.JwE r2 = (X.C61076JwE) r2
            X.0qQ.A0B(r2, r3)
            r6.A0c()
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "text"
            r6.A0R(r0, r1)
            java.lang.Object r0 = r2.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0936
            int r1 = r0.intValue()
            java.lang.String r0 = "count"
            r6.A0P(r0, r1)
        L_0x0936:
            r6.A0Z()
            goto L_0x090e
        L_0x093a:
            boolean r0 = r7 instanceof X.C15090UOi
            if (r0 == 0) goto L_0x09c7
            X.UOi r7 = (X.C15090UOi) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0T
            A06(r6, r0)
            X.Uxr r0 = r7.A0A
            boolean r2 = A07(r6, r0)
            X.UKv r0 = r7.A06
            A03(r6, r0)
            X.ULH r0 = r7.A05
            A02(r6, r0)
            X.ULw r0 = r7.A04
            A00(r0, r6)
            int r0 = r7.A01
            A01(r6, r0)
            java.lang.String r1 = r7.A0N
            if (r1 == 0) goto L_0x096e
            java.lang.String r0 = "background_color"
            r6.A0R(r0, r1)
        L_0x096e:
            X.Ux2 r0 = r7.A08
            X.0qQ.A0B(r0, r2)
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "disablement_state"
            r6.A0R(r0, r1)
            X.Jw8 r2 = r7.A02
            if (r2 == 0) goto L_0x100f
            java.lang.String r0 = "election_add_yours_info"
            r6.A0q(r0)
            r6.A0c()
            java.lang.Object r0 = r2.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0995
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "disable_add_yours_button"
            r6.A0S(r0, r1)
        L_0x0995:
            java.lang.Object r0 = r2.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x09a8
            boolean r1 = r0.booleanValue()
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0S(r0, r1)
        L_0x09a8:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x09b1
            java.lang.String r0 = "tray_title"
            r6.A0R(r0, r1)
        L_0x09b1:
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x100c
            java.lang.String r0 = "title_options"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x09bd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1009
            X.C13988Tno.A1H(r6, r1)
            goto L_0x09bd
        L_0x09c7:
            boolean r0 = r7 instanceof X.C15085UOc
            if (r0 == 0) goto L_0x0a73
            X.UOc r7 = (X.C15085UOc) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0F
            A06(r6, r0)
            X.Uxr r0 = r7.A05
            boolean r3 = A07(r6, r0)
            X.UKv r0 = r7.A03
            A03(r6, r0)
            X.ULH r0 = r7.A02
            A02(r6, r0)
            X.ULw r0 = r7.A01
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            java.lang.String r1 = r7.A09
            if (r1 == 0) goto L_0x09fb
            java.lang.String r0 = "background_color"
            r6.A0R(r0, r1)
        L_0x09fb:
            java.lang.Boolean r0 = r7.A06
            if (r0 == 0) goto L_0x0a08
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_clips_v2_media"
            r6.A0S(r0, r1)
        L_0x0a08:
            java.lang.String r0 = r7.A0A
            X.C41846B3n.A11(r6, r0)
            java.lang.String r1 = r7.A0B
            if (r1 == 0) goto L_0x0a16
            java.lang.String r0 = "profile_pic_url"
            r6.A0R(r0, r1)
        L_0x0a16:
            java.lang.String r1 = r7.A0C
            if (r1 == 0) goto L_0x0a1f
            java.lang.String r0 = "question"
            r6.A0R(r0, r1)
        L_0x0a1f:
            java.lang.String r1 = r7.A0D
            if (r1 == 0) goto L_0x0a28
            java.lang.String r0 = "question_id"
            r6.A0R(r0, r1)
        L_0x0a28:
            java.lang.Long r0 = r7.A08
            if (r0 == 0) goto L_0x0a35
            long r1 = r0.longValue()
            java.lang.String r0 = "question_response_count"
            r6.A0Q(r0, r1)
        L_0x0a35:
            X.UxO r0 = r7.A04
            if (r0 == 0) goto L_0x0a40
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "question_type"
            r6.A0R(r0, r1)
        L_0x0a40:
            java.util.List r1 = r7.A0G
            if (r1 == 0) goto L_0x0a62
            java.lang.String r0 = "response_types"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0a4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a5f
            java.lang.Object r0 = r1.next()
            X.UxN r0 = (X.C16570UxN) r0
            X.0qQ.A0B(r0, r3)
            java.lang.String r0 = r0.A00
            r6.A0t(r0)
            goto L_0x0a4a
        L_0x0a5f:
            r6.A0Y()
        L_0x0a62:
            java.lang.String r0 = r7.A0E
            X.C13988Tno.A1G(r6, r0)
            java.lang.Boolean r0 = r7.A07
            if (r0 == 0) goto L_0x00fb
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "viewer_can_interact"
            goto L_0x01fc
        L_0x0a73:
            boolean r0 = r7 instanceof X.C15086UOe
            if (r0 == 0) goto L_0x0b41
            X.UOe r7 = (X.C15086UOe) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0G
            A06(r6, r0)
            X.Uxr r0 = r7.A04
            A04(r6, r0)
            X.UKv r0 = r7.A03
            A03(r6, r0)
            X.ULH r0 = r7.A02
            A02(r6, r0)
            X.ULw r0 = r7.A01
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            java.lang.Integer r0 = r7.A07
            if (r0 == 0) goto L_0x0aaa
            int r1 = r0.intValue()
            java.lang.String r0 = "correct_answer"
            r6.A0P(r0, r1)
        L_0x0aaa:
            java.lang.String r1 = r7.A09
            if (r1 == 0) goto L_0x0ab3
            java.lang.String r0 = "default_prompt"
            r6.A0R(r0, r1)
        L_0x0ab3:
            java.lang.String r1 = r7.A0A
            if (r1 == 0) goto L_0x0abc
            java.lang.String r0 = "end_background_color"
            r6.A0R(r0, r1)
        L_0x0abc:
            java.lang.Boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0ac9
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "finished"
            r6.A0S(r0, r1)
        L_0x0ac9:
            java.lang.String r0 = r7.A0B
            X.C41846B3n.A0y(r6, r0)
            java.util.List r1 = r7.A0H
            if (r1 == 0) goto L_0x0aeb
            java.lang.String r0 = "options"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0ad8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0ae8
            java.lang.Object r0 = r1.next()
            X.GSY r0 = (X.GSY) r0
            X.C17110VIg.A00(r0, r6)
            goto L_0x0ad8
        L_0x0ae8:
            r6.A0Y()
        L_0x0aeb:
            java.lang.String r1 = r7.A0C
            if (r1 == 0) goto L_0x0af4
            java.lang.String r0 = "question"
            r6.A0R(r0, r1)
        L_0x0af4:
            java.lang.String r1 = r7.A0D
            if (r1 == 0) goto L_0x0afd
            java.lang.String r0 = "quiz_id"
            r6.A0R(r0, r1)
        L_0x0afd:
            java.lang.String r1 = r7.A0E
            if (r1 == 0) goto L_0x0b06
            java.lang.String r0 = "start_background_color"
            r6.A0R(r0, r1)
        L_0x0b06:
            java.util.List r1 = r7.A0I
            if (r1 == 0) goto L_0x0b23
            java.lang.String r0 = "tallies"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0b10:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b20
            java.lang.Object r0 = r1.next()
            X.GSY r0 = (X.GSY) r0
            X.C17110VIg.A00(r0, r6)
            goto L_0x0b10
        L_0x0b20:
            r6.A0Y()
        L_0x0b23:
            java.lang.String r0 = r7.A0F
            X.C13988Tno.A1G(r6, r0)
            java.lang.Integer r0 = r7.A08
            if (r0 == 0) goto L_0x0b35
            int r1 = r0.intValue()
            java.lang.String r0 = "viewer_answer"
            r6.A0P(r0, r1)
        L_0x0b35:
            java.lang.Boolean r0 = r7.A06
            if (r0 == 0) goto L_0x00fb
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "viewer_can_answer"
            goto L_0x01fc
        L_0x0b41:
            boolean r0 = r7 instanceof X.C15083UOa
            if (r0 == 0) goto L_0x0bdb
            X.UOa r7 = (X.C15083UOa) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0F
            A06(r6, r0)
            X.Uxr r0 = r7.A04
            A04(r6, r0)
            X.UKv r0 = r7.A03
            A03(r6, r0)
            X.ULH r0 = r7.A02
            A02(r6, r0)
            X.ULw r0 = r7.A01
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            java.lang.String r1 = r7.A0A
            if (r1 == 0) goto L_0x0b74
            java.lang.String r0 = "background_color"
            r6.A0R(r0, r1)
        L_0x0b74:
            java.lang.String r1 = r7.A0B
            if (r1 == 0) goto L_0x0b7d
            java.lang.String r0 = "emoji"
            r6.A0R(r0, r1)
        L_0x0b7d:
            java.lang.Boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0b8e
            boolean r1 = r0.booleanValue()
            r0 = 3439(0xd6f, float:4.819E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0S(r0, r1)
        L_0x0b8e:
            java.lang.String r1 = r7.A0C
            if (r1 == 0) goto L_0x0b97
            java.lang.String r0 = "question"
            r6.A0R(r0, r1)
        L_0x0b97:
            java.lang.String r1 = r7.A0D
            if (r1 == 0) goto L_0x0ba0
            java.lang.String r0 = "slider_id"
            r6.A0R(r0, r1)
        L_0x0ba0:
            java.lang.Float r0 = r7.A07
            if (r0 == 0) goto L_0x0bad
            float r1 = r0.floatValue()
            java.lang.String r0 = "slider_vote_average"
            r6.A0O(r0, r1)
        L_0x0bad:
            java.lang.Integer r0 = r7.A09
            if (r0 == 0) goto L_0x0bba
            int r1 = r0.intValue()
            java.lang.String r0 = "slider_vote_count"
            r6.A0P(r0, r1)
        L_0x0bba:
            java.lang.String r0 = r7.A0E
            X.C13988Tno.A1G(r6, r0)
            java.lang.Boolean r0 = r7.A06
            if (r0 == 0) goto L_0x0bcc
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "viewer_can_vote"
            r6.A0S(r0, r1)
        L_0x0bcc:
            java.lang.Float r0 = r7.A08
            if (r0 == 0) goto L_0x00fb
            float r1 = r0.floatValue()
            java.lang.String r0 = "viewer_vote"
            r6.A0O(r0, r1)
            goto L_0x00fb
        L_0x0bdb:
            boolean r0 = r7 instanceof X.C15091UOj
            if (r0 == 0) goto L_0x1130
            X.UOj r7 = (X.C15091UOj) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0K
            A06(r6, r0)
            X.Uxr r0 = r7.A06
            A04(r6, r0)
            X.UKv r0 = r7.A04
            A03(r6, r0)
            X.ULH r0 = r7.A03
            A02(r6, r0)
            X.ULw r0 = r7.A02
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            java.lang.String r0 = r7.A0G
            java.lang.String r4 = "id"
            r6.A0R(r4, r0)
            java.util.List r1 = r7.A0P
            if (r1 == 0) goto L_0x0c29
            java.lang.String r0 = "stickers"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0c16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c26
            java.lang.Object r0 = r1.next()
            X.ULl r0 = (X.ULl) r0
            X.C17111VIh.A00(r6, r0)
            goto L_0x0c16
        L_0x0c26:
            r6.A0Y()
        L_0x0c29:
            java.util.List r1 = r7.A0M
            if (r1 == 0) goto L_0x0c40
            java.lang.String r0 = "keywords"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0c33:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c3d
            X.C13988Tno.A1H(r6, r1)
            goto L_0x0c33
        L_0x0c3d:
            r6.A0Y()
        L_0x0c40:
            java.util.List r1 = r7.A0R
            if (r1 == 0) goto L_0x0c57
            java.lang.String r0 = "titles"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0c4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c54
            X.C13988Tno.A1H(r6, r1)
            goto L_0x0c4a
        L_0x0c54:
            r6.A0Y()
        L_0x0c57:
            boolean r1 = r7.A0T
            java.lang.String r0 = "include_in_recent"
            r6.A0S(r0, r1)
            java.lang.String r1 = r7.A0F
            if (r1 == 0) goto L_0x0c67
            java.lang.String r0 = "help_text"
            r6.A0R(r0, r1)
        L_0x0c67:
            java.lang.String r1 = r7.A0J
            if (r1 == 0) goto L_0x0c70
            java.lang.String r0 = "secondary_text"
            r6.A0R(r0, r1)
        L_0x0c70:
            java.lang.String r1 = r7.A0H
            if (r1 == 0) goto L_0x0c79
            java.lang.String r0 = "prompt"
            r6.A0R(r0, r1)
        L_0x0c79:
            java.lang.String r1 = r7.A0E
            if (r1 == 0) goto L_0x0c82
            java.lang.String r0 = "default_prompt"
            r6.A0R(r0, r1)
        L_0x0c82:
            java.util.List r1 = r7.A0L
            if (r1 == 0) goto L_0x0c99
            java.lang.String r0 = "button_texts"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0c8c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c96
            X.C13988Tno.A1H(r6, r1)
            goto L_0x0c8c
        L_0x0c96:
            r6.A0Y()
        L_0x0c99:
            java.util.List r1 = r7.A0O
            if (r1 == 0) goto L_0x0cb0
            java.lang.String r0 = "prompts"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0ca3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0cad
            X.C13988Tno.A1H(r6, r1)
            goto L_0x0ca3
        L_0x0cad:
            r6.A0Y()
        L_0x0cb0:
            java.lang.Float r0 = r7.A0C
            if (r0 == 0) goto L_0x0cbd
            float r1 = r0.floatValue()
            java.lang.String r0 = "minimum_scale"
            r6.A0O(r0, r1)
        L_0x0cbd:
            java.lang.Float r0 = r7.A0B
            if (r0 == 0) goto L_0x0cca
            float r1 = r0.floatValue()
            java.lang.String r0 = "maximum_scale"
            r6.A0O(r0, r1)
        L_0x0cca:
            java.lang.Boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0cdb
            boolean r1 = r0.booleanValue()
            r0 = 2719(0xa9f, float:3.81E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0S(r0, r1)
        L_0x0cdb:
            java.lang.Integer r0 = r7.A0D
            if (r0 == 0) goto L_0x0cec
            int r1 = r0.intValue()
            r0 = 3856(0xf10, float:5.403E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0P(r0, r1)
        L_0x0cec:
            java.lang.String r1 = r7.A0I
            if (r1 == 0) goto L_0x0cf5
            java.lang.String r0 = "render_framework"
            r6.A0R(r0, r1)
        L_0x0cf5:
            boolean r1 = r7.A0S
            java.lang.String r0 = "has_attribution"
            r6.A0S(r0, r1)
            boolean r1 = r7.A0U
            java.lang.String r0 = "partnered_account"
            r6.A0S(r0, r1)
            X.UKb r2 = r7.A05
            if (r2 == 0) goto L_0x0d6b
            java.lang.String r0 = "ring_spec"
            r6.A0q(r0)
            r6.A0c()
            java.util.List r1 = r2.A05
            if (r1 == 0) goto L_0x0d26
            java.lang.String r0 = "colors"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0d19:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0d23
            X.C13988Tno.A1H(r6, r1)
            goto L_0x0d19
        L_0x0d23:
            r6.A0Y()
        L_0x0d26:
            float r1 = r2.A02
            java.lang.String r0 = "start_point_x"
            r6.A0O(r0, r1)
            float r1 = r2.A03
            java.lang.String r0 = "start_point_y"
            r6.A0O(r0, r1)
            float r1 = r2.A00
            java.lang.String r0 = "end_point_x"
            r6.A0O(r0, r1)
            float r1 = r2.A01
            java.lang.String r0 = "end_point_y"
            r6.A0O(r0, r1)
            java.util.List r1 = r2.A06
            if (r1 == 0) goto L_0x0d61
            java.lang.String r0 = "locations"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0d4c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0d5e
            java.lang.Object r0 = r1.next()
            float r0 = X.AnonymousClass7TE.A04(r0)
            r6.A0f(r0)
            goto L_0x0d4c
        L_0x0d5e:
            r6.A0Y()
        L_0x0d61:
            java.lang.String r1 = r2.A04
            java.lang.String r0 = "name"
            r6.A0R(r0, r1)
            r6.A0Z()
        L_0x0d6b:
            X.Jvb r2 = r7.A01
            if (r2 == 0) goto L_0x0d95
            java.lang.String r0 = "ring_glyph"
            r6.A0q(r0)
            r6.A0c()
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "image_url"
            r6.A0R(r0, r1)
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0d8b
            r0 = 306(0x132, float:4.29E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
        L_0x0d8b:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "name"
            r6.A0R(r0, r1)
            r6.A0Z()
        L_0x0d95:
            X.ULG r2 = r7.A07
            if (r2 == 0) goto L_0x0e96
            java.lang.String r0 = "track"
            r6.A0q(r0)
            r6.A0c()
            boolean r1 = r2.A0M
            java.lang.String r0 = "allows_saving"
            r6.A0S(r0, r1)
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x0db1
            java.lang.String r0 = "artist_id"
            r6.A0R(r0, r1)
        L_0x0db1:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x0dba
            java.lang.String r0 = "audio_asset_id"
            r6.A0R(r0, r1)
        L_0x0dba:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x0dc3
            java.lang.String r0 = "audio_cluster_id"
            r6.A0R(r0, r1)
        L_0x0dc3:
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x0dcc
            java.lang.String r0 = "cover_artwork_thumbnail_uri"
            r6.A0R(r0, r1)
        L_0x0dcc:
            java.lang.String r1 = r2.A08
            if (r1 == 0) goto L_0x0dd5
            java.lang.String r0 = "cover_artwork_uri"
            r6.A0R(r0, r1)
        L_0x0dd5:
            java.lang.String r1 = r2.A09
            if (r1 == 0) goto L_0x0dde
            java.lang.String r0 = "dark_message"
            r6.A0R(r0, r1)
        L_0x0dde:
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L_0x0de7
            java.lang.String r0 = "dash_manifest"
            r6.A0R(r0, r1)
        L_0x0de7:
            java.lang.String r1 = r2.A0B
            if (r1 == 0) goto L_0x0df0
            java.lang.String r0 = "display_artist"
            r6.A0R(r0, r1)
        L_0x0df0:
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x0dfd
            int r1 = r0.intValue()
            java.lang.String r0 = "duration_in_ms"
            r6.A0P(r0, r1)
        L_0x0dfd:
            java.lang.String r1 = r2.A0C
            if (r1 == 0) goto L_0x0e06
            java.lang.String r0 = "fast_start_progressive_download_url"
            r6.A0R(r0, r1)
        L_0x0e06:
            java.lang.Boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0e13
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_lyrics"
            r6.A0S(r0, r1)
        L_0x0e13:
            java.util.List r1 = r2.A0L
            if (r1 == 0) goto L_0x0e2e
            java.lang.String r0 = "highlight_start_times_in_ms"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0e1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0e2b
            int r0 = X.AnonymousClass7TG.A0F(r1)
            r6.A0g(r0)
            goto L_0x0e1d
        L_0x0e2b:
            r6.A0Y()
        L_0x0e2e:
            java.lang.String r0 = r2.A0D
            r6.A0R(r4, r0)
            java.lang.String r1 = r2.A0E
            if (r1 == 0) goto L_0x0e3c
            java.lang.String r0 = "ig_username"
            r6.A0R(r0, r1)
        L_0x0e3c:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0e49
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_eligible_for_audio_effects"
            r6.A0S(r0, r1)
        L_0x0e49:
            java.lang.Boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0e56
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_eligible_for_vinyl_sticker"
            r6.A0S(r0, r1)
        L_0x0e56:
            boolean r1 = r2.A0N
            java.lang.String r0 = "is_explicit"
            r6.A0S(r0, r1)
            java.lang.String r1 = r2.A0F
            if (r1 == 0) goto L_0x0e66
            java.lang.String r0 = "progressive_download_url"
            r6.A0R(r0, r1)
        L_0x0e66:
            java.lang.String r1 = r2.A0G
            if (r1 == 0) goto L_0x0e73
            r0 = 25
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.A0R(r0, r1)
        L_0x0e73:
            java.lang.String r1 = r2.A0H
            if (r1 == 0) goto L_0x0e7c
            java.lang.String r0 = "sanitized_title"
            r6.A0R(r0, r1)
        L_0x0e7c:
            java.lang.String r1 = r2.A0I
            if (r1 == 0) goto L_0x0e85
            java.lang.String r0 = "subtitle"
            r6.A0R(r0, r1)
        L_0x0e85:
            java.lang.String r0 = r2.A0J
            X.C41846B3n.A10(r6, r0)
            java.lang.String r1 = r2.A0K
            if (r1 == 0) goto L_0x0e93
            java.lang.String r0 = "web_30s_preview_download_url"
            r6.A0R(r0, r1)
        L_0x0e93:
            r6.A0Z()
        L_0x0e96:
            java.util.List r1 = r7.A0Q
            if (r1 == 0) goto L_0x0eb1
            r0 = 42
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0ea4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0eae
            X.C13988Tno.A1H(r6, r1)
            goto L_0x0ea4
        L_0x0eae:
            r6.A0Y()
        L_0x0eb1:
            java.lang.Boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0ebe
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_avatar"
            r6.A0S(r0, r1)
        L_0x0ebe:
            java.util.List r1 = r7.A0N
            if (r1 == 0) goto L_0x0eef
            java.lang.String r0 = "prompt_titles"
            java.util.Iterator r4 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0ec8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0eec
            java.lang.Object r2 = r4.next()
            X.ULg r2 = (X.C15050ULg) r2
            X.0qQ.A0B(r2, r3)
            r6.A0c()
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "first"
            r6.A0R(r0, r1)
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "second"
            r6.A0R(r0, r1)
            r6.A0Z()
            goto L_0x0ec8
        L_0x0eec:
            r6.A0Y()
        L_0x0eef:
            java.lang.Boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x00fb
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_boost_eligible"
            goto L_0x01fc
        L_0x0efb:
            r6.A0Y()
        L_0x0efe:
            java.lang.String r1 = r2.A0Y
            if (r1 == 0) goto L_0x0f07
            java.lang.String r0 = "source_media_id"
            r6.A0R(r0, r1)
        L_0x0f07:
            java.lang.String r1 = r2.A0L
            if (r1 == 0) goto L_0x0f10
            java.lang.String r0 = "ar_effect_id"
            r6.A0R(r0, r1)
        L_0x0f10:
            java.lang.String r1 = r2.A0Q
            if (r1 == 0) goto L_0x0f1d
            r0 = 540(0x21c, float:7.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
        L_0x0f1d:
            java.lang.String r1 = r2.A0P
            if (r1 == 0) goto L_0x0f26
            java.lang.String r0 = "camera_position"
            r6.A0R(r0, r1)
        L_0x0f26:
            java.lang.String r1 = r2.A0S
            if (r1 == 0) goto L_0x0f33
            r0 = 282(0x11a, float:3.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
        L_0x0f33:
            int r1 = r2.A0A
            r0 = 4193(0x1061, float:5.876E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0P(r0, r1)
            int r1 = r2.A09
            r0 = 4192(0x1060, float:5.874E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0P(r0, r1)
            java.lang.String r1 = r2.A0b
            if (r1 == 0) goto L_0x0f52
            java.lang.String r0 = "upload_media_source"
            r6.A0R(r0, r1)
        L_0x0f52:
            boolean r1 = r2.A0h
            java.lang.String r0 = "is_meta_gallery"
            r6.A0S(r0, r1)
            java.lang.String r1 = r2.A0H
            if (r1 == 0) goto L_0x0f62
            java.lang.String r0 = "album_name"
            r6.A0R(r0, r1)
        L_0x0f62:
            java.lang.String r1 = r2.A0I
            if (r1 == 0) goto L_0x0f6f
            r0 = 248(0xf8, float:3.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
        L_0x0f6f:
            java.lang.String r1 = r2.A0W
            if (r1 == 0) goto L_0x0f78
            java.lang.String r0 = "original_media_uri"
            r6.A0R(r0, r1)
        L_0x0f78:
            java.lang.Boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x0f85
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_motion_photo"
            r6.A0S(r0, r1)
        L_0x0f85:
            r6.A0Z()
            int r1 = r7.A01
            java.lang.String r0 = "max_width"
            r6.A0P(r0, r1)
            int r1 = r7.A00
            java.lang.String r0 = "max_height"
            goto L_0x00f8
        L_0x0f95:
            r6.A0Y()
            int r1 = r7.A01
            java.lang.String r0 = "duration"
            r6.A0P(r0, r1)
            X.Uxc r0 = r7.A07
            X.0qQ.A0B(r0, r2)
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "karaoke_sticker_display_type"
            r6.A0R(r0, r1)
            int r1 = r7.A00
            java.lang.String r0 = "color"
            r6.A0P(r0, r1)
            int r1 = r7.A02
            java.lang.String r0 = "emphasis_state"
            r6.A0P(r0, r1)
            java.lang.String r1 = r7.A0B
            if (r1 == 0) goto L_0x0fc2
            java.lang.String r0 = "sticker_id"
            r6.A0R(r0, r1)
        L_0x0fc2:
            java.lang.Boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0fcf
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_clips_v2_media"
            r6.A0S(r0, r1)
        L_0x0fcf:
            java.lang.String r0 = r7.A0C
            X.C13988Tno.A1G(r6, r0)
            java.lang.String r1 = r7.A0A
            if (r1 == 0) goto L_0x00fb
            java.lang.String r0 = "background_color"
            goto L_0x1317
        L_0x0fdc:
            r6.A0Y()
            int r1 = r7.A01
            java.lang.String r0 = "text_color"
            goto L_0x00f8
        L_0x0fe5:
            r6.A0Y()
            java.util.List r1 = r7.A0A
            if (r1 == 0) goto L_0x1003
            java.lang.String r0 = "option_tally_ratios"
            java.util.Iterator r1 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x0ff2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1000
            int r0 = X.AnonymousClass7TG.A0F(r1)
            r6.A0g(r0)
            goto L_0x0ff2
        L_0x1000:
            r6.A0Y()
        L_0x1003:
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "color"
            goto L_0x1317
        L_0x1009:
            r6.A0Y()
        L_0x100c:
            r6.A0Z()
        L_0x100f:
            java.lang.String r0 = "facepile_top_participants"
            X.16P.A03(r6, r0)
            java.util.List r0 = r7.A0U
            java.util.Iterator r1 = r0.iterator()
        L_0x101a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x102a
            java.lang.Object r0 = r1.next()
            X.UKp r0 = (X.C15036UKp) r0
            X.C17109VIf.A00(r6, r0)
            goto L_0x101a
        L_0x102a:
            r6.A0Y()
            java.lang.Boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x103a
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_participated"
            r6.A0S(r0, r1)
        L_0x103a:
            java.lang.String r1 = r7.A0O
            java.lang.String r0 = "id"
            r6.A0R(r0, r1)
            java.lang.Boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x104e
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_before_and_after"
            r6.A0S(r0, r1)
        L_0x104e:
            java.lang.Boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x105b
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_clips_v2_media"
            r6.A0S(r0, r1)
        L_0x105b:
            java.lang.Boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x1068
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_created_from_add_yours_browsing"
            r6.A0S(r0, r1)
        L_0x1068:
            java.lang.Boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x1075
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_from_add_yours_camera_tool"
            r6.A0S(r0, r1)
        L_0x1075:
            java.lang.Boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x1082
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_icon_disabled"
            r6.A0S(r0, r1)
        L_0x1082:
            java.lang.Boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x108f
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_original_prompt_media"
            r6.A0S(r0, r1)
        L_0x108f:
            java.lang.Boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x109c
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_pinned_by_creator"
            r6.A0S(r0, r1)
        L_0x109c:
            java.lang.Boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x10a9
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_speakeasy"
            r6.A0S(r0, r1)
        L_0x10a9:
            java.lang.Boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x10b6
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_story_trending_prompt"
            r6.A0S(r0, r1)
        L_0x10b6:
            java.lang.Boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x10c3
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_trending_prompt"
            r6.A0S(r0, r1)
        L_0x10c3:
            java.lang.Boolean r0 = r7.A0M
            if (r0 == 0) goto L_0x10d0
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_viewer_original_author"
            r6.A0S(r0, r1)
        L_0x10d0:
            java.lang.String r0 = r7.A0P
            X.C41846B3n.A11(r6, r0)
            X.UKp r1 = r7.A07
            if (r1 == 0) goto L_0x10e1
            java.lang.String r0 = "original_author"
            r6.A0q(r0)
            X.C17109VIf.A00(r6, r1)
        L_0x10e1:
            int r1 = r7.A00
            java.lang.String r0 = "participant_count"
            r6.A0P(r0, r1)
            X.ULg r2 = r7.A03
            if (r2 == 0) goto L_0x110d
            java.lang.String r0 = "prompt_failure_tooltip"
            r6.A0q(r0)
            r6.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x10fd
            java.lang.String r0 = "error_message_body"
            r6.A0R(r0, r1)
        L_0x10fd:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x110a
            r0 = 147(0x93, float:2.06E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0R(r0, r1)
        L_0x110a:
            r6.A0Z()
        L_0x110d:
            java.lang.String r1 = r7.A0Q
            if (r1 == 0) goto L_0x1116
            java.lang.String r0 = "prompt_style"
            r6.A0R(r0, r1)
        L_0x1116:
            X.Uxh r0 = r7.A09
            if (r0 == 0) goto L_0x1121
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "prompt_type"
            r6.A0R(r0, r1)
        L_0x1121:
            java.lang.String r1 = r7.A0R
            if (r1 == 0) goto L_0x112a
            java.lang.String r0 = "sticker_style_str"
            r6.A0R(r0, r1)
        L_0x112a:
            java.lang.String r1 = r7.A0S
            java.lang.String r0 = "text"
            goto L_0x1317
        L_0x1130:
            boolean r0 = r7 instanceof X.C15088UOg
            if (r0 == 0) goto L_0x1265
            X.UOg r7 = (X.C15088UOg) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0N
            A06(r6, r0)
            X.Uxr r0 = r7.A0K
            boolean r4 = A07(r6, r0)
            X.UKv r0 = r7.A0F
            A03(r6, r0)
            X.ULH r0 = r7.A0E
            A02(r6, r0)
            X.ULw r0 = r7.A0D
            A00(r0, r6)
            int r0 = r7.A08
            A01(r6, r0)
            java.lang.String r0 = r7.A0L
            X.C41846B3n.A0z(r6, r0)
            float r1 = r7.A05
            java.lang.String r0 = "playback_duration"
            r6.A0O(r0, r1)
            java.util.List r1 = r7.A0O
            if (r1 == 0) goto L_0x11b2
            java.lang.String r0 = "span_metadata"
            java.util.Iterator r5 = X.C41845B3m.A0s(r6, r0, r1)
        L_0x1171:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x11af
            java.lang.Object r2 = r5.next()
            X.UKP r2 = (X.UKP) r2
            X.0qQ.A0B(r2, r3)
            r6.A0c()
            int r1 = r2.A02
            java.lang.String r0 = "span_start"
            r6.A0P(r0, r1)
            int r1 = r2.A00
            java.lang.String r0 = "span_end"
            r6.A0P(r0, r1)
            int r1 = r2.A01
            java.lang.String r0 = "span_flags"
            r6.A0P(r0, r1)
            java.lang.String r1 = r2.A04
            java.lang.String r0 = "metadata_model"
            r6.A0R(r0, r1)
            X.Uxm r0 = r2.A03
            X.0qQ.A0B(r0, r4)
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "metadata_model_type"
            r6.A0R(r0, r1)
            r6.A0Z()
            goto L_0x1171
        L_0x11af:
            r6.A0Y()
        L_0x11b2:
            X.Ux1 r0 = r7.A0G
            if (r0 == 0) goto L_0x11bd
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "text_alignment"
            r6.A0R(r0, r1)
        L_0x11bd:
            float r1 = r7.A03
            java.lang.String r0 = "padding_x"
            r6.A0O(r0, r1)
            float r1 = r7.A04
            java.lang.String r0 = "padding_y"
            r6.A0O(r0, r1)
            int r1 = r7.A09
            java.lang.String r0 = "text_color"
            r6.A0P(r0, r1)
            float r1 = r7.A06
            java.lang.String r0 = "text_size"
            r6.A0O(r0, r1)
            X.GbN r2 = r7.A0C
            if (r2 == 0) goto L_0x1204
            java.lang.String r0 = "shadow_layer"
            r6.A0q(r0)
            r6.A0c()
            float r1 = r2.A02
            java.lang.String r0 = "shadow_layer_radius"
            r6.A0O(r0, r1)
            float r1 = r2.A00
            java.lang.String r0 = "shadow_layer_dx"
            r6.A0O(r0, r1)
            float r1 = r2.A01
            java.lang.String r0 = "shadow_layer_dy"
            r6.A0O(r0, r1)
            int r1 = r2.A03
            java.lang.String r0 = "shadow_layer_color"
            r6.A0P(r0, r1)
            r6.A0Z()
        L_0x1204:
            float r1 = r7.A01
            java.lang.String r0 = "line_spacing_add"
            r6.A0O(r0, r1)
            float r1 = r7.A02
            java.lang.String r0 = "line_spacing_mult"
            r6.A0O(r0, r1)
            float r1 = r7.A00
            java.lang.String r0 = "letter_spacing"
            r6.A0O(r0, r1)
            int r1 = r7.A0B
            java.lang.String r0 = "truncation_max_lines"
            r6.A0P(r0, r1)
            java.lang.String r1 = r7.A0M
            if (r1 == 0) goto L_0x1229
            java.lang.String r0 = "truncation_suffix"
            r6.A0R(r0, r1)
        L_0x1229:
            boolean r1 = r7.A0P
            java.lang.String r0 = "is_animated"
            r6.A0S(r0, r1)
            int r1 = r7.A07
            java.lang.String r0 = "safe_width"
            r6.A0P(r0, r1)
            X.Uwo r0 = r7.A0J
            if (r0 == 0) goto L_0x1242
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "drawable_source"
            r6.A0R(r0, r1)
        L_0x1242:
            boolean r1 = r7.A0Q
            java.lang.String r0 = "is_story_text_drawable"
            r6.A0S(r0, r1)
            X.9sR r0 = r7.A0H
            if (r0 == 0) goto L_0x1254
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "animation_id"
            r6.A0R(r0, r1)
        L_0x1254:
            X.UxM r0 = r7.A0I
            if (r0 == 0) goto L_0x125f
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "effect_id"
            r6.A0R(r0, r1)
        L_0x125f:
            int r1 = r7.A0A
            java.lang.String r0 = "text_effect_color"
            goto L_0x00f8
        L_0x1265:
            boolean r0 = r7 instanceof X.C15084UOb
            if (r0 == 0) goto L_0x00fe
            X.UOb r7 = (X.C15084UOb) r7
            X.0qQ.A0B(r7, r3)
            r6.A0c()
            java.lang.String r0 = r7.A0E
            A06(r6, r0)
            X.Uxr r0 = r7.A05
            A04(r6, r0)
            X.UKv r0 = r7.A03
            A03(r6, r0)
            X.ULH r0 = r7.A02
            A02(r6, r0)
            X.ULw r0 = r7.A01
            A00(r0, r6)
            int r0 = r7.A00
            A01(r6, r0)
            boolean r1 = r7.A0F
            r0 = 2766(0xace, float:3.876E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0S(r0, r1)
            java.lang.String r1 = r7.A08
            if (r1 == 0) goto L_0x12a3
            java.lang.String r0 = "end_background_color"
            r6.A0R(r0, r1)
        L_0x12a3:
            java.lang.Float r0 = r7.A06
            X.C41846B3n.A0w(r6, r0)
            r0 = 1657(0x679, float:2.322E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0q(r0)
            X.UKp r0 = r7.A04
            X.C17109VIf.A00(r6, r0)
            java.lang.String r1 = r7.A09
            r0 = 1658(0x67a, float:2.323E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
            java.lang.String r1 = r7.A0A
            r0 = 1659(0x67b, float:2.325E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r1)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "original_media_id"
            r6.A0R(r0, r1)
            java.lang.String r1 = r7.A0C
            if (r1 == 0) goto L_0x12dc
            java.lang.String r0 = "start_background_color"
            r6.A0R(r0, r1)
        L_0x12dc:
            java.lang.Float r0 = r7.A07
            X.C41846B3n.A0x(r6, r0)
            java.lang.String r1 = r7.A0D
            if (r1 == 0) goto L_0x00fb
            java.lang.String r0 = "text_color"
            goto L_0x1317
        L_0x12e8:
            r6.A0Y()
        L_0x12eb:
            X.UxL r0 = r7.A06
            if (r0 == 0) goto L_0x12f6
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "chat_sticker_type"
            r6.A0R(r0, r1)
        L_0x12f6:
            java.lang.String r1 = r7.A0J
            if (r1 == 0) goto L_0x12ff
            java.lang.String r0 = "story_chat_id"
            r6.A0R(r0, r1)
        L_0x12ff:
            java.lang.String r1 = r7.A0K
            if (r1 == 0) goto L_0x1308
            java.lang.String r0 = "thread_id"
            r6.A0R(r0, r1)
        L_0x1308:
            java.lang.String r1 = r7.A0L
            if (r1 == 0) goto L_0x1311
            java.lang.String r0 = "thread_id_v2"
            r6.A0R(r0, r1)
        L_0x1311:
            java.lang.String r1 = r7.A0M
            if (r1 == 0) goto L_0x00fb
            java.lang.String r0 = "title"
        L_0x1317:
            r6.A0R(r0, r1)
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3F.A05(X.17Z, X.X5I):void");
    }

    public static boolean A07(17Z r3, C16597Uxr uxr) {
        0qQ.A0B(uxr, 0);
        r3.A0R("sticker_type", uxr.A00);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d6, code lost:
        r1 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.X5I parseFromJson(X.16F r3) {
        /*
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.16L r2 = r3.A11()
            X.16L r0 = X.16L.A0D
            r1 = 0
            if (r2 != r0) goto L_0x01da
            r3.A1J()
            X.16L r2 = r3.A11()
            X.16L r0 = X.16L.A0A
            if (r2 != r0) goto L_0x01da
            java.lang.String r2 = r3.A1P()
            r3.A1J()
            if (r2 == 0) goto L_0x0028
            int r0 = r2.hashCode()
            switch(r0) {
                case -1918357458: goto L_0x01c6;
                case -1735070316: goto L_0x01b5;
                case -1663998810: goto L_0x01a4;
                case -1556414034: goto L_0x0193;
                case -1356145441: goto L_0x0182;
                case -1292394314: goto L_0x0171;
                case -1181643135: goto L_0x0160;
                case -242175373: goto L_0x014f;
                case -195726559: goto L_0x013d;
                case -104826055: goto L_0x012b;
                case -57125436: goto L_0x0119;
                case -44787250: goto L_0x0107;
                case 65464871: goto L_0x00f5;
                case 87605407: goto L_0x00e3;
                case 569531759: goto L_0x00d1;
                case 579256717: goto L_0x00bf;
                case 653008301: goto L_0x00ad;
                case 698858472: goto L_0x009b;
                case 962921784: goto L_0x0089;
                case 1301426933: goto L_0x0077;
                case 1575842202: goto L_0x0065;
                case 1632313117: goto L_0x0053;
                case 1737086128: goto L_0x0041;
                case 2016406553: goto L_0x002f;
                default: goto L_0x0028;
            }
        L_0x0028:
            r3.A0z()
        L_0x002b:
            r3.A1J()
            return r1
        L_0x002f:
            java.lang.String r0 = "media_music_overlay_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRJ r0 = X.WRJ.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOR r1 = (X.UOR) r1
            goto L_0x01d6
        L_0x0041:
            java.lang.String r0 = "media_join_chat_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRC r0 = X.WRC.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOf r1 = (X.C15087UOf) r1
            goto L_0x01d6
        L_0x0053:
            java.lang.String r0 = "media_prompt_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRN r0 = X.WRN.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOi r1 = (X.C15090UOi) r1
            goto L_0x01d6
        L_0x0065:
            java.lang.String r0 = "media_slider_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRR r0 = X.WRR.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOa r1 = (X.C15083UOa) r1
            goto L_0x01d6
        L_0x0077:
            java.lang.String r0 = "media_gallery_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WR7 r0 = X.WR7.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOO r1 = (X.UOO) r1
            goto L_0x01d6
        L_0x0089:
            java.lang.String r0 = "media_poll_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRK r0 = X.WRK.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOW r1 = (X.UOW) r1
            goto L_0x01d6
        L_0x009b:
            java.lang.String r0 = "media_bitmap_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WR4 r0 = X.WR4.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOU r1 = (X.UOU) r1
            goto L_0x01d6
        L_0x00ad:
            java.lang.String r0 = "media_lyrics_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRG r0 = X.WRG.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOS r1 = (X.UOS) r1
            goto L_0x01d6
        L_0x00bf:
            java.lang.String r0 = "media_mention_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRI r0 = X.WRI.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOT r1 = (X.UOT) r1
            goto L_0x01d6
        L_0x00d1:
            java.lang.String r0 = "media_hashtag_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WR9 r0 = X.WR9.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOP r1 = (X.UOP) r1
            goto L_0x01d6
        L_0x00e3:
            java.lang.String r0 = "media_poll_v2_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRL r0 = X.WRL.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOX r1 = (X.UOX) r1
            goto L_0x01d6
        L_0x00f5:
            java.lang.String r0 = "media_static_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRT r0 = X.WRT.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOj r1 = (X.C15091UOj) r1
            goto L_0x01d6
        L_0x0107:
            java.lang.String r0 = "media_quiz_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRP r0 = X.WRP.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOe r1 = (X.C15086UOe) r1
            goto L_0x01d6
        L_0x0119:
            java.lang.String r0 = "media_visual_comment_reply_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRW r0 = X.WRW.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOb r1 = (X.C15084UOb) r1
            goto L_0x01d6
        L_0x012b:
            java.lang.String r0 = "media_igtv_share_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRA r0 = X.WRA.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOV r1 = (X.UOV) r1
            goto L_0x01d6
        L_0x013d:
            java.lang.String r0 = "media_date_time_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WR6 r0 = X.WR6.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOM r1 = (X.UOM) r1
            goto L_0x01d6
        L_0x014f:
            java.lang.String r0 = "media_link_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRE r0 = X.WRE.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOZ r1 = (X.UOZ) r1
            goto L_0x01d6
        L_0x0160:
            java.lang.String r0 = "ig_media_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WR1 r0 = X.WR1.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOh r1 = (X.C15089UOh) r1
            goto L_0x01d6
        L_0x0171:
            java.lang.String r0 = "media_internal_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRB r0 = X.WRB.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOQ r1 = (X.UOQ) r1
            goto L_0x01d6
        L_0x0182:
            java.lang.String r0 = "media_question_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRO r0 = X.WRO.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOc r1 = (X.C15085UOc) r1
            goto L_0x01d6
        L_0x0193:
            java.lang.String r0 = "media_location_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRF r0 = X.WRF.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UON r1 = (X.UON) r1
            goto L_0x01d6
        L_0x01a4:
            java.lang.String r0 = "media_text_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRV r0 = X.WRV.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOg r1 = (X.C15088UOg) r1
            goto L_0x01d6
        L_0x01b5:
            java.lang.String r0 = "media_countdown_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WR5 r0 = X.WR5.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOd r1 = (X.UOd) r1
            goto L_0x01d6
        L_0x01c6:
            java.lang.String r0 = "media_karaoke_caption_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.WRD r0 = X.WRD.A00
            java.lang.Object r1 = X.16P.A01(r3, r0)
            X.UOY r1 = (X.UOY) r1
        L_0x01d6:
            X.X5I r1 = (X.X5I) r1
            goto L_0x002b
        L_0x01da:
            r3.A0z()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3F.parseFromJson(X.16F):X.X5I");
    }

    public static void A00(ULw uLw, 17Z r3) {
        if (uLw != null) {
            r3.A0q("timed_info");
            r3.A0c();
            r3.A0P("start_time_ms", uLw.A01);
            r3.A0P("end_time_ms", uLw.A00);
            String str = uLw.A04;
            if (str != null) {
                r3.A0R("tts_voice_id", str);
            }
            String str2 = uLw.A05;
            if (str2 != null) {
                r3.A0R("tts_voice_name", str2);
            }
            String str3 = uLw.A02;
            if (str3 != null) {
                r3.A0R("tts_sfx", str3);
            }
            String str4 = uLw.A03;
            if (str4 != null) {
                r3.A0R("tts_shortwave_id", str4);
            }
            r3.A0Z();
        }
    }

    public static void A01(17Z r1, int i) {
        r1.A0P("selected_variant_index", i);
    }

    public static void A02(17Z r1, ULH ulh) {
        if (ulh != null) {
            r1.A0q("drawable_config");
            C17108VIe.A00(r1, ulh);
        }
    }

    public static void A03(17Z r2, C15042UKv uKv) {
        if (uKv != null) {
            r2.A0q("drawable_transform");
            r2.A0c();
            r2.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID, uKv.A08);
            r2.A0R("uuid", uKv.A0C);
            r2.A0P(IgReactMediaPickerNativeModule.WIDTH, uKv.A0A);
            r2.A0P(IgReactMediaPickerNativeModule.HEIGHT, uKv.A07);
            r2.A0P("layer", uKv.A09);
            r2.A0P("z", uKv.A0B);
            r2.A0O("pivot_x", uKv.A03);
            r2.A0O("pivot_y", uKv.A04);
            r2.A0O("offset_x", uKv.A01);
            r2.A0O("offset_y", uKv.A02);
            r2.A0O("rotation", uKv.A05);
            r2.A0O("scale", uKv.A06);
            r2.A0O("bouncing_scale", uKv.A00);
            r2.A0S(C273654mx.A00(323), uKv.A0D);
            r2.A0Z();
        }
    }

    public static void A06(17Z r1, String str) {
        r1.A0R("uuid", str);
    }
}
