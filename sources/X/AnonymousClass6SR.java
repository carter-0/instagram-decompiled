package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6SR  reason: invalid class name */
public final class AnonymousClass6SR {
    public static AnonymousClass6SR A0Z;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07 = -1;
    public int A08;
    public int A09;
    public ExistingStandaloneFundraiserForFeedModel A0A;
    public String A0B;
    public String A0C = "";
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public final List A0Y = new ArrayList();

    private 0xI A00(String str, String str2) {
        0xI A042 = 1Q9.A01("capture_flow_v2").A04("ig_creation_flow_step");
        A042.A0C("step", str);
        A042.A0C("next_step", str2);
        A042.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A0C);
        return A042;
    }

    public static AnonymousClass6SR A01() {
        AnonymousClass6SR r0 = A0Z;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass6SR r02 = new AnonymousClass6SR();
        A0Z = r02;
        return r02;
    }

    public static String A02() {
        return 1Q9.A01("capture_flow_v2").A05();
    }

    public final void A03(UserSession userSession, String str) {
        String str2;
        String str3;
        0xI A002 = A00("edit_carousel", str);
        A002.A08(Integer.valueOf(this.A04), "long_press_count");
        A002.A08(Integer.valueOf(this.A09), "rearrange_count");
        A002.A08(Integer.valueOf(this.A00), "tap_add_media_count");
        A002.A08(Integer.valueOf(this.A01), "delete_media_count");
        A002.A08(Integer.valueOf(this.A02), "edit_sub_media_count");
        A002.A08(Integer.valueOf(this.A03), "last_filter_id");
        if (this.A0N) {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str2 = "0";
        }
        A002.A0C("filter_strength_toggle", str2);
        if (this.A0Q) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        A002.A0C("mute_all_audio_toggle", str3);
        C60510iO.A00(userSession).EFq(A002);
        this.A04 = 0;
        this.A09 = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A0N = false;
        this.A0Q = false;
    }

    public final void A04(UserSession userSession, String str) {
        C60510iO.A00(userSession).EFq(A00("media_crop", str));
        this.A0L = false;
    }

    public final void A05(UserSession userSession, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        0xI A002 = A00("gallery", str);
        if (this.A0R) {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str2 = "0";
        }
        A002.A0C("nonsquare_toggle", str2);
        if (this.A0J) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        A002.A0C("carousel_toggle", str3);
        if (this.A0P) {
            str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str4 = "0";
        }
        A002.A0C("draft_manage_toggle", str4);
        if (this.A0K) {
            str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str5 = "0";
        }
        A002.A0C("draft_select_toggle", str5);
        A002.A08(0, "draft_count");
        if (this.A0I) {
            str6 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str6 = "0";
        }
        A002.A0C("carousel_long_press_toggle", str6);
        A002.A08(Integer.valueOf(this.A06), "media_selected");
        A002.A08(Integer.valueOf(this.A05), "max_media_selected");
        C60510iO.A00(userSession).EFq(A002);
        this.A0M = false;
        this.A0R = false;
        this.A0J = false;
        this.A0I = false;
        this.A0P = false;
        this.A0K = false;
        this.A06 = 0;
        this.A05 = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(com.instagram.common.session.UserSession r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "share_screen"
            X.0xI r2 = r6.A00(r0, r8)
            int r0 = r6.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "m_t"
            r2.A08(r0, r4)
            java.lang.String r1 = "0"
            r3 = r1
            java.lang.String r0 = "share_destination_toggle"
            r2.A0C(r0, r1)
            boolean r0 = r6.A0T
            if (r0 == 0) goto L_0x001f
            java.lang.String r1 = "1"
        L_0x001f:
            java.lang.String r0 = "preview_toggle"
            r2.A0C(r0, r1)
            boolean r0 = r6.A0S
            if (r0 == 0) goto L_0x011c
            java.lang.String r1 = "1"
        L_0x002a:
            java.lang.String r0 = "tag_people_toggle"
            r2.A0C(r0, r1)
            r1 = r3
            java.lang.String r0 = "tag_toggle"
            r2.A0C(r0, r3)
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = "1"
        L_0x003b:
            java.lang.String r0 = "add_location_toggle"
            r2.A0C(r0, r1)
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x0119
            java.lang.String r1 = "1"
        L_0x0046:
            java.lang.String r0 = "caption_toggle"
            r2.A0C(r0, r1)
            boolean r0 = r6.A0E
            if (r0 != 0) goto L_0x0115
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x0074
            r1 = r3
        L_0x0054:
            java.lang.String r0 = "tag_sponsor_toggle"
            r2.A0C(r0, r1)
            r5 = r3
            java.lang.String r0 = "tag_sponsor_search_toggle"
            r2.A0C(r0, r3)
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sponsor_tag_count"
            r2.A08(r1, r0)
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x006f
            java.lang.String r5 = "1"
        L_0x006f:
            java.lang.String r0 = "bc_help_link_click"
            r2.A0C(r0, r5)
        L_0x0074:
            boolean r0 = r6.A0W
            if (r0 == 0) goto L_0x0099
            boolean r0 = r6.A0U
            if (r0 == 0) goto L_0x0112
            java.lang.String r1 = "1"
        L_0x007e:
            java.lang.String r0 = "tag_products_toggle"
            r2.A0C(r0, r1)
            boolean r0 = r6.A0V
            if (r0 == 0) goto L_0x0089
            java.lang.String r3 = "1"
        L_0x0089:
            java.lang.String r0 = "tag_products_search_toggle"
            r2.A0C(r0, r3)
            int r0 = r6.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "product_tag_count"
            r2.A08(r1, r0)
        L_0x0099:
            boolean r0 = r6.A0F
            if (r0 == 0) goto L_0x00a7
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "can_tag_sponsor"
            r2.A08(r1, r0)
        L_0x00a7:
            java.lang.String r1 = r6.A0B
            if (r1 == 0) goto L_0x00b6
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "branded_content_upsell_action"
            r2.A0C(r0, r1)
        L_0x00b6:
            java.util.List r3 = r6.A0Y
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "branded_content_upsell_signals"
            r2.A0D(r0, r3)
        L_0x00c3:
            X.0xN r0 = X.C60510iO.A00(r7)
            r0.EFq(r2)
            java.lang.String r1 = "post_attempt"
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = "exit"
            X.0xI r2 = r6.A00(r1, r0)
            int r0 = r6.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A08(r0, r4)
            r0 = 1806(0x70e, float:2.531E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "new_post"
            r2.A0C(r1, r0)
            X.0xN r0 = X.C60510iO.A00(r7)
            r0.EFq(r2)
        L_0x00f3:
            r0 = -1
            r6.A07 = r0
            r0 = 0
            r6.A0T = r0
            r6.A0S = r0
            r6.A0U = r0
            r6.A0V = r0
            r6.A08 = r0
            r6.A0O = r0
            r6.A0H = r0
            r6.A0E = r0
            r6.A0G = r0
            r6.A0F = r0
            r0 = 0
            r6.A0B = r0
            r3.clear()
            return
        L_0x0112:
            r1 = r3
            goto L_0x007e
        L_0x0115:
            java.lang.String r1 = "1"
            goto L_0x0054
        L_0x0119:
            r1 = r3
            goto L_0x0046
        L_0x011c:
            r1 = r3
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6SR.A06(com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public final void A07(UserSession userSession, String str, boolean z) {
        String str2;
        if (z) {
            str2 = "edit_video";
        } else {
            str2 = "edit_photo";
        }
        C60510iO.A00(userSession).EFq(A00(str2, str));
    }
}
