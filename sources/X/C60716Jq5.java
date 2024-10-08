package X;

/* renamed from: X.Jq5  reason: case insensitive filesystem */
public final class C60716Jq5 extends 2NZ {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60716Jq5(C251983oI r1, Object obj, int i) {
        super(r1);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass1WV r6, Object obj) {
        if (this.A00 != 0) {
            C61035JvZ jvZ = (C61035JvZ) obj;
            long j = (long) jvZ.A06;
            C61035JvZ.A01(r6, jvZ, j);
            JTT.A17(r6, jvZ.A0K, 10);
            C61035JvZ.A00(r6, jvZ);
            JTT.A17(r6, jvZ.A0H, 17);
            JTT.A17(r6, LPY.A02(r6, jvZ), 23);
            JTT.A17(r6, LPY.A01(jvZ.A0E), 24);
            r6.ADa(25, jvZ.A0S ? 1 : 0);
            JTT.A17(r6, jvZ.A0J, 26);
            JTT.A17(r6, LPZ.A01(r6, jvZ), 33);
            r6.ADa(34, jvZ.A0Z ? 1 : 0);
            JTT.A17(r6, LJ7.A01(jvZ.A0G), 35);
            r6.ADa(36, jvZ.A0A);
            r6.ADa(37, jvZ.A0C);
            r6.ADa(38, j);
            return;
        }
        C61018JvI jvI = (C61018JvI) obj;
        String str = jvI.A08;
        C61018JvI.A00(r6, jvI, str);
        JTU.A0s(r6, jvI.A06, 6);
        JTU.A0s(r6, jvI.A07, 7);
        JTT.A17(r6, jvI.A0A, 8);
        JTT.A17(r6, jvI.A0B, 9);
        JTT.A17(r6, jvI.A09, 10);
        JTU.A0s(r6, jvI.A05, 11);
        Double d = jvI.A03;
        if (d == null) {
            r6.ADb(12);
        } else {
            r6.ADY(12, d.doubleValue());
        }
        Double d2 = jvI.A04;
        if (d2 == null) {
            r6.ADb(13);
        } else {
            r6.ADY(13, d2.doubleValue());
        }
        r6.ADa(14, jvI.A0D ? 1 : 0);
        r6.ADh(15, str);
    }

    public final String createQuery() {
        if (this.A00 != 0) {
            return "UPDATE OR REPLACE `drafts` SET `id` = ?,`is_uploading` = ?,`video_path` = ?,`video_orig_rotation` = ?,`video_orig_width` = ?,`video_orig_height` = ?,`duration` = ?,`title` = ?,`description` = ?,`series_id` = ?,`is_unified_video` = ?,`filter_id` = ?,`filter_strength` = ?,`post_crop_aspect_ratio` = ?,`is_landscape_surface` = ?,`is_over_image_custom` = ?,`cover_image_file_path` = ?,`cover_image_width` = ?,`cover_image_height` = ?,`cover_image_video_time_mx` = ?,`is_cover_image_fram_video_edited` = ?,`is_preview_enabled` = ?,`preview_crop_coords` = ?,`profile_crop_coords` = ?,`is_internal` = ?,`group_destination_user_id` = ?,`share_to_facebook` = ?,`are_captions_enabled` = ?,`are_comments_disabled` = ?,`is_funded_content_deal` = ?,`is_like_and_view_counts_disabled` = ?,`is_paid_partnership` = ?,`branded_content_info` = ?,`partner_boost_enabled` = ?,`shopping_info` = ?,`created_timestamp` = ?,`last_modified_timestamp` = ? WHERE `id` = ?";
        }
        return "UPDATE OR ABORT `security_alert` SET `id` = ?,`user_id` = ?,`crypto_mailbox_type` = ?,`device_change_type` = ?,`device_id` = ?,`created_timestamp_ms` = ?,`first_read_timestamp_ms` = ?,`model` = ?,`platform` = ?,`location` = ?,`activity_feed_read_timestamp_ms` = ?,`latitude` = ?,`longitude` = ?,`is_confirm` = ? WHERE `id` = ?";
    }
}
