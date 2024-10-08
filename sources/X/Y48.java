package X;

import java.util.concurrent.Callable;

public final class Y48 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Y48(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r10v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r81 = this;
            r1 = r81
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x025a;
                case 1: goto L_0x0007;
                case 2: goto L_0x0007;
                case 3: goto L_0x02bc;
                case 4: goto L_0x050a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.JXF r0 = (X.JXF) r0
            X.3oI r2 = r0.A02
            java.lang.Object r1 = r1.A02
            X.1WY r1 = (X.1WY) r1
            r0 = 0
            android.database.Cursor r1 = X.1wT.A00(r2, r1, r0)
            java.lang.String r0 = "id"
            int r39 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_uploading"
            int r38 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "video_path"
            int r37 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "video_orig_rotation"
            int r36 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "video_orig_width"
            int r35 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "video_orig_height"
            int r34 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "duration"
            int r33 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "title"
            int r32 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "description"
            int r31 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "series_id"
            int r8 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_unified_video"
            int r30 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "filter_id"
            int r29 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "filter_strength"
            int r28 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "post_crop_aspect_ratio"
            int r27 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_landscape_surface"
            int r26 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_over_image_custom"
            int r25 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "cover_image_file_path"
            int r7 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "cover_image_width"
            int r24 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "cover_image_height"
            int r23 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "cover_image_video_time_mx"
            int r22 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_cover_image_fram_video_edited"
            int r21 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_preview_enabled"
            int r20 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "preview_crop_coords"
            int r6 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "profile_crop_coords"
            int r5 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_internal"
            int r19 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "group_destination_user_id"
            int r4 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "share_to_facebook"
            int r18 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "are_captions_enabled"
            int r17 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "are_comments_disabled"
            int r16 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_funded_content_deal"
            int r15 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_like_and_view_counts_disabled"
            int r14 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            r0 = 314(0x13a, float:4.4E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0505 }
            int r13 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "branded_content_info"
            int r3 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "partner_boost_enabled"
            int r12 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "shopping_info"
            int r2 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "created_timestamp"
            int r11 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "last_modified_timestamp"
            int r9 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            int r0 = r1.getCount()     // Catch:{ all -> 0x0505 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0505 }
            r10.<init>(r0)     // Catch:{ all -> 0x0505 }
        L_0x0101:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x0501
            r0 = r39
            int r52 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r38
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r67 = X.AnonymousClass7TF.A1P(r0)
            r0 = r37
            java.lang.String r45 = r1.getString(r0)     // Catch:{ all -> 0x0505 }
            r0 = r36
            int r53 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r35
            int r54 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r34
            int r55 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r33
            long r61 = r1.getLong(r0)     // Catch:{ all -> 0x0505 }
            r0 = r32
            java.lang.String r46 = r1.getString(r0)     // Catch:{ all -> 0x0505 }
            r0 = r31
            java.lang.String r47 = r1.getString(r0)     // Catch:{ all -> 0x0505 }
            boolean r0 = r1.isNull(r8)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x014a
            r48 = 0
            goto L_0x014e
        L_0x014a:
            java.lang.String r48 = r1.getString(r8)     // Catch:{ all -> 0x0505 }
        L_0x014e:
            r0 = r30
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r68 = X.AnonymousClass7TF.A1P(r0)
            r0 = r29
            int r56 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r28
            int r57 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r27
            float r51 = r1.getFloat(r0)     // Catch:{ all -> 0x0505 }
            r0 = r26
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r69 = X.AnonymousClass7TF.A1P(r0)
            r0 = r25
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r70 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r1.isNull(r7)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x0187
            r49 = 0
            goto L_0x018b
        L_0x0187:
            java.lang.String r49 = r1.getString(r7)     // Catch:{ all -> 0x0505 }
        L_0x018b:
            r0 = r24
            int r58 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r23
            int r59 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r22
            int r60 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r21
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r71 = X.AnonymousClass7TF.A1P(r0)
            r0 = r20
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r72 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r1.isNull(r6)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x01b9
            r0 = 0
            goto L_0x01bd
        L_0x01b9:
            java.lang.String r0 = r1.getString(r6)     // Catch:{ all -> 0x0505 }
        L_0x01bd:
            android.graphics.RectF r41 = X.LPY.A00(r0)     // Catch:{ all -> 0x0505 }
            boolean r0 = r1.isNull(r5)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x01c9
            r0 = 0
            goto L_0x01cd
        L_0x01c9:
            java.lang.String r0 = r1.getString(r5)     // Catch:{ all -> 0x0505 }
        L_0x01cd:
            android.graphics.RectF r42 = X.LPY.A00(r0)     // Catch:{ all -> 0x0505 }
            r0 = r19
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r73 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r1.isNull(r4)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x01e4
            r50 = 0
            goto L_0x01e8
        L_0x01e4:
            java.lang.String r50 = r1.getString(r4)     // Catch:{ all -> 0x0505 }
        L_0x01e8:
            r0 = r18
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r74 = X.AnonymousClass7TF.A1P(r0)
            r0 = r17
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r75 = X.AnonymousClass7TF.A1P(r0)
            r0 = r16
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r76 = X.AnonymousClass7TF.A1P(r0)
            int r0 = r1.getInt(r15)     // Catch:{ all -> 0x0505 }
            boolean r77 = X.AnonymousClass7TF.A1P(r0)
            int r0 = r1.getInt(r14)     // Catch:{ all -> 0x0505 }
            boolean r78 = X.AnonymousClass7TF.A1P(r0)
            int r0 = r1.getInt(r13)     // Catch:{ all -> 0x0505 }
            boolean r79 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x0226
            r0 = 0
            goto L_0x022a
        L_0x0226:
            java.lang.String r0 = r1.getString(r3)     // Catch:{ all -> 0x0505 }
        L_0x022a:
            com.instagram.igtv.persistence.draft.IGTVBrandedContentTags r43 = X.LPZ.A00(r0)     // Catch:{ all -> 0x0505 }
            int r0 = r1.getInt(r12)     // Catch:{ all -> 0x0505 }
            boolean r80 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r1.isNull(r2)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x023e
            r0 = 0
            goto L_0x0242
        L_0x023e:
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x0505 }
        L_0x0242:
            com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata r44 = X.LJ7.A00(r0)     // Catch:{ all -> 0x0505 }
            long r63 = r1.getLong(r11)     // Catch:{ all -> 0x0505 }
            long r65 = r1.getLong(r9)     // Catch:{ all -> 0x0505 }
            X.JvZ r0 = new X.JvZ     // Catch:{ all -> 0x0505 }
            r40 = r0
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r63, r65, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)     // Catch:{ all -> 0x0505 }
            r10.add(r0)     // Catch:{ all -> 0x0505 }
            goto L_0x0101
        L_0x025a:
            java.lang.Object r0 = r1.A01
            X.93J r0 = (X.AnonymousClass93J) r0
            X.3oI r2 = r0.A01
            java.lang.Object r1 = r1.A02
            X.1WY r1 = (X.1WY) r1
            r0 = 0
            android.database.Cursor r6 = X.1wT.A00(r2, r1, r0)
            java.lang.String r0 = "id"
            int r5 = X.1Wd.A01(r6, r0)     // Catch:{ all -> 0x02b7 }
            java.lang.String r0 = "type"
            int r4 = X.1Wd.A01(r6, r0)     // Catch:{ all -> 0x02b7 }
            java.lang.String r0 = "data"
            int r3 = X.1Wd.A01(r6, r0)     // Catch:{ all -> 0x02b7 }
            java.lang.String r0 = "stored_time"
            int r2 = X.1Wd.A01(r6, r0)     // Catch:{ all -> 0x02b7 }
            java.lang.String r0 = "ranking_score"
            int r1 = X.1Wd.A01(r6, r0)     // Catch:{ all -> 0x02b7 }
            int r0 = r6.getCount()     // Catch:{ all -> 0x02b7 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02b7 }
            r10.<init>(r0)     // Catch:{ all -> 0x02b7 }
        L_0x0290:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x02b7 }
            if (r0 == 0) goto L_0x02b3
            java.lang.String r12 = r6.getString(r5)     // Catch:{ all -> 0x02b7 }
            java.lang.String r13 = r6.getString(r4)     // Catch:{ all -> 0x02b7 }
            byte[] r14 = r6.getBlob(r3)     // Catch:{ all -> 0x02b7 }
            long r16 = r6.getLong(r2)     // Catch:{ all -> 0x02b7 }
            float r15 = r6.getFloat(r1)     // Catch:{ all -> 0x02b7 }
            X.5xR r11 = new X.5xR     // Catch:{ all -> 0x02b7 }
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x02b7 }
            r10.add(r11)     // Catch:{ all -> 0x02b7 }
            goto L_0x0290
        L_0x02b3:
            r6.close()
            return r10
        L_0x02b7:
            r2 = move-exception
            r6.close()
            throw r2
        L_0x02bc:
            java.lang.Object r0 = r1.A01
            X.JXF r0 = (X.JXF) r0
            X.3oI r2 = r0.A02
            java.lang.Object r1 = r1.A02
            X.1WY r1 = (X.1WY) r1
            r0 = 0
            android.database.Cursor r1 = X.1wT.A00(r2, r1, r0)
            java.lang.String r0 = "id"
            int r15 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "is_uploading"
            int r14 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "video_path"
            int r13 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "video_orig_rotation"
            int r12 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "video_orig_width"
            int r11 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "video_orig_height"
            int r10 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "duration"
            int r9 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "title"
            int r6 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "description"
            int r38 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r0 = "series_id"
            int r0 = X.1Wd.A01(r1, r0)     // Catch:{ all -> 0x0505 }
            java.lang.String r2 = "is_unified_video"
            int r37 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0505 }
            java.lang.String r2 = "filter_id"
            int r36 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0505 }
            java.lang.String r2 = "filter_strength"
            int r35 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0505 }
            java.lang.String r2 = "post_crop_aspect_ratio"
            int r34 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0505 }
            java.lang.String r2 = "is_landscape_surface"
            int r33 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0505 }
            java.lang.String r2 = "is_over_image_custom"
            int r32 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0505 }
            java.lang.String r2 = "cover_image_file_path"
            int r2 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0505 }
            java.lang.String r3 = "cover_image_width"
            int r31 = X.1Wd.A01(r1, r3)     // Catch:{ all -> 0x0505 }
            java.lang.String r3 = "cover_image_height"
            int r30 = X.1Wd.A01(r1, r3)     // Catch:{ all -> 0x0505 }
            java.lang.String r3 = "cover_image_video_time_mx"
            int r29 = X.1Wd.A01(r1, r3)     // Catch:{ all -> 0x0505 }
            java.lang.String r3 = "is_cover_image_fram_video_edited"
            int r28 = X.1Wd.A01(r1, r3)     // Catch:{ all -> 0x0505 }
            java.lang.String r3 = "is_preview_enabled"
            int r27 = X.1Wd.A01(r1, r3)     // Catch:{ all -> 0x0505 }
            java.lang.String r3 = "preview_crop_coords"
            int r3 = X.1Wd.A01(r1, r3)     // Catch:{ all -> 0x0505 }
            java.lang.String r4 = "profile_crop_coords"
            int r4 = X.1Wd.A01(r1, r4)     // Catch:{ all -> 0x0505 }
            java.lang.String r5 = "is_internal"
            int r26 = X.1Wd.A01(r1, r5)     // Catch:{ all -> 0x0505 }
            java.lang.String r5 = "group_destination_user_id"
            int r5 = X.1Wd.A01(r1, r5)     // Catch:{ all -> 0x0505 }
            java.lang.String r7 = "share_to_facebook"
            int r25 = X.1Wd.A01(r1, r7)     // Catch:{ all -> 0x0505 }
            java.lang.String r7 = "are_captions_enabled"
            int r24 = X.1Wd.A01(r1, r7)     // Catch:{ all -> 0x0505 }
            java.lang.String r7 = "are_comments_disabled"
            int r23 = X.1Wd.A01(r1, r7)     // Catch:{ all -> 0x0505 }
            java.lang.String r7 = "is_funded_content_deal"
            int r22 = X.1Wd.A01(r1, r7)     // Catch:{ all -> 0x0505 }
            java.lang.String r7 = "is_like_and_view_counts_disabled"
            int r21 = X.1Wd.A01(r1, r7)     // Catch:{ all -> 0x0505 }
            r7 = 314(0x13a, float:4.4E-43)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)     // Catch:{ all -> 0x0505 }
            int r20 = X.1Wd.A01(r1, r7)     // Catch:{ all -> 0x0505 }
            java.lang.String r7 = "branded_content_info"
            int r19 = X.1Wd.A01(r1, r7)     // Catch:{ all -> 0x0505 }
            java.lang.String r7 = "partner_boost_enabled"
            int r18 = X.1Wd.A01(r1, r7)     // Catch:{ all -> 0x0505 }
            java.lang.String r7 = "shopping_info"
            int r7 = X.1Wd.A01(r1, r7)     // Catch:{ all -> 0x0505 }
            java.lang.String r8 = "created_timestamp"
            int r17 = X.1Wd.A01(r1, r8)     // Catch:{ all -> 0x0505 }
            java.lang.String r8 = "last_modified_timestamp"
            int r8 = X.1Wd.A01(r1, r8)     // Catch:{ all -> 0x0505 }
            boolean r16 = r1.moveToFirst()     // Catch:{ all -> 0x0505 }
            if (r16 == 0) goto L_0x0500
            int r46 = r1.getInt(r15)     // Catch:{ all -> 0x0505 }
            int r14 = r1.getInt(r14)     // Catch:{ all -> 0x0505 }
            boolean r61 = X.AnonymousClass7TF.A1P(r14)
            java.lang.String r39 = r1.getString(r13)     // Catch:{ all -> 0x0505 }
            int r47 = r1.getInt(r12)     // Catch:{ all -> 0x0505 }
            int r48 = r1.getInt(r11)     // Catch:{ all -> 0x0505 }
            int r49 = r1.getInt(r10)     // Catch:{ all -> 0x0505 }
            long r55 = r1.getLong(r9)     // Catch:{ all -> 0x0505 }
            java.lang.String r40 = r1.getString(r6)     // Catch:{ all -> 0x0505 }
            r6 = r38
            java.lang.String r41 = r1.getString(r6)     // Catch:{ all -> 0x0505 }
            boolean r6 = r1.isNull(r0)     // Catch:{ all -> 0x0505 }
            if (r6 == 0) goto L_0x03e6
            r42 = 0
            goto L_0x03ea
        L_0x03e6:
            java.lang.String r42 = r1.getString(r0)     // Catch:{ all -> 0x0505 }
        L_0x03ea:
            r0 = r37
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r62 = X.AnonymousClass7TF.A1P(r0)
            r0 = r36
            int r50 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r35
            int r51 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r34
            float r45 = r1.getFloat(r0)     // Catch:{ all -> 0x0505 }
            r0 = r33
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r63 = X.AnonymousClass7TF.A1P(r0)
            r0 = r32
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r64 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r1.isNull(r2)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x0423
            r43 = 0
            goto L_0x0427
        L_0x0423:
            java.lang.String r43 = r1.getString(r2)     // Catch:{ all -> 0x0505 }
        L_0x0427:
            r0 = r31
            int r52 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r30
            int r53 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r29
            int r54 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            r0 = r28
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r65 = X.AnonymousClass7TF.A1P(r0)
            r0 = r27
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r66 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x0455
            r0 = 0
            goto L_0x0459
        L_0x0455:
            java.lang.String r0 = r1.getString(r3)     // Catch:{ all -> 0x0505 }
        L_0x0459:
            android.graphics.RectF r35 = X.LPY.A00(r0)     // Catch:{ all -> 0x0505 }
            boolean r0 = r1.isNull(r4)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x0465
            r0 = 0
            goto L_0x0469
        L_0x0465:
            java.lang.String r0 = r1.getString(r4)     // Catch:{ all -> 0x0505 }
        L_0x0469:
            android.graphics.RectF r36 = X.LPY.A00(r0)     // Catch:{ all -> 0x0505 }
            r0 = r26
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r67 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r1.isNull(r5)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x0480
            r44 = 0
            goto L_0x0484
        L_0x0480:
            java.lang.String r44 = r1.getString(r5)     // Catch:{ all -> 0x0505 }
        L_0x0484:
            r0 = r25
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r68 = X.AnonymousClass7TF.A1P(r0)
            r0 = r24
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r69 = X.AnonymousClass7TF.A1P(r0)
            r0 = r23
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r70 = X.AnonymousClass7TF.A1P(r0)
            r0 = r22
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r71 = X.AnonymousClass7TF.A1P(r0)
            r0 = r21
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r72 = X.AnonymousClass7TF.A1P(r0)
            r0 = r20
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r73 = X.AnonymousClass7TF.A1P(r0)
            r0 = r19
            boolean r0 = r1.isNull(r0)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x04ca
            r0 = 0
            goto L_0x04d0
        L_0x04ca:
            r0 = r19
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0505 }
        L_0x04d0:
            com.instagram.igtv.persistence.draft.IGTVBrandedContentTags r37 = X.LPZ.A00(r0)     // Catch:{ all -> 0x0505 }
            r0 = r18
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0505 }
            boolean r74 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r1.isNull(r7)     // Catch:{ all -> 0x0505 }
            if (r0 == 0) goto L_0x04e6
            r0 = 0
            goto L_0x04ea
        L_0x04e6:
            java.lang.String r0 = r1.getString(r7)     // Catch:{ all -> 0x0505 }
        L_0x04ea:
            com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata r38 = X.LJ7.A00(r0)     // Catch:{ all -> 0x0505 }
            r0 = r17
            long r57 = r1.getLong(r0)     // Catch:{ all -> 0x0505 }
            long r59 = r1.getLong(r8)     // Catch:{ all -> 0x0505 }
            X.JvZ r10 = new X.JvZ     // Catch:{ all -> 0x0505 }
            r34 = r10
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r57, r59, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)     // Catch:{ all -> 0x0505 }
            goto L_0x0501
        L_0x0500:
            r10 = 0
        L_0x0501:
            r1.close()
            return r10
        L_0x0505:
            r2 = move-exception
            r1.close()
            throw r2
        L_0x050a:
            java.lang.Object r0 = r1.A01
            X.LS6 r0 = (X.LS6) r0
            X.3oI r0 = r0.A01
            java.lang.Object r1 = r1.A02
            X.1WY r1 = (X.1WY) r1
            r9 = 0
            android.database.Cursor r0 = X.1wT.A00(r0, r1, r9)
            java.lang.String r2 = "signal_id"
            int r20 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "signal_type"
            int r19 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "item_id"
            int r18 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "item_type"
            int r17 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            r2 = 172(0xac, float:2.41E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)     // Catch:{ all -> 0x062d }
            int r16 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "container_module"
            int r15 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "inventory_source"
            int r14 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "signal_status"
            int r13 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "timestamp"
            int r12 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "signal_data"
            int r11 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "meta_idad_id"
            int r7 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "meta_idcampaign_id"
            int r6 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "meta_idapp_id"
            int r5 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "meta_idpage_id"
            int r4 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "meta_idactor_id"
            int r3 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "meta_idmedia_id"
            int r2 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x062d }
            int r8 = r0.getCount()     // Catch:{ all -> 0x062d }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x062d }
            r10.<init>(r8)     // Catch:{ all -> 0x062d }
        L_0x0586:
            boolean r8 = r0.moveToNext()     // Catch:{ all -> 0x062d }
            if (r8 == 0) goto L_0x0626
            r8 = r20
            java.lang.String r24 = r0.getString(r8)     // Catch:{ all -> 0x062d }
            r8 = r19
            java.lang.String r25 = r0.getString(r8)     // Catch:{ all -> 0x062d }
            r8 = r18
            java.lang.String r26 = r0.getString(r8)     // Catch:{ all -> 0x062d }
            r8 = r17
            java.lang.String r27 = r0.getString(r8)     // Catch:{ all -> 0x062d }
            r8 = r16
            java.lang.String r28 = r0.getString(r8)     // Catch:{ all -> 0x062d }
            java.lang.String r29 = r0.getString(r15)     // Catch:{ all -> 0x062d }
            java.lang.String r30 = r0.getString(r14)     // Catch:{ all -> 0x062d }
            java.lang.String r8 = r0.getString(r13)     // Catch:{ all -> 0x062d }
            X.0qQ.A0B(r8, r9)     // Catch:{ all -> 0x062d }
            X.4EC r23 = X.C63448KxD.A00(r8)     // Catch:{ all -> 0x062d }
            long r32 = r0.getLong(r12)     // Catch:{ all -> 0x062d }
            byte[] r31 = r0.getBlob(r11)     // Catch:{ all -> 0x062d }
            boolean r8 = r0.isNull(r7)     // Catch:{ all -> 0x062d }
            if (r8 == 0) goto L_0x05ce
            r35 = 0
            goto L_0x05d2
        L_0x05ce:
            java.lang.String r35 = r0.getString(r7)     // Catch:{ all -> 0x062d }
        L_0x05d2:
            boolean r8 = r0.isNull(r6)     // Catch:{ all -> 0x062d }
            if (r8 == 0) goto L_0x05db
            r36 = 0
            goto L_0x05df
        L_0x05db:
            java.lang.String r36 = r0.getString(r6)     // Catch:{ all -> 0x062d }
        L_0x05df:
            boolean r8 = r0.isNull(r5)     // Catch:{ all -> 0x062d }
            if (r8 == 0) goto L_0x05e8
            r37 = 0
            goto L_0x05ec
        L_0x05e8:
            java.lang.String r37 = r0.getString(r5)     // Catch:{ all -> 0x062d }
        L_0x05ec:
            boolean r8 = r0.isNull(r4)     // Catch:{ all -> 0x062d }
            if (r8 == 0) goto L_0x05f5
            r38 = 0
            goto L_0x05f9
        L_0x05f5:
            java.lang.String r38 = r0.getString(r4)     // Catch:{ all -> 0x062d }
        L_0x05f9:
            boolean r8 = r0.isNull(r3)     // Catch:{ all -> 0x062d }
            if (r8 == 0) goto L_0x0602
            r39 = 0
            goto L_0x0606
        L_0x0602:
            java.lang.String r39 = r0.getString(r3)     // Catch:{ all -> 0x062d }
        L_0x0606:
            boolean r8 = r0.isNull(r2)     // Catch:{ all -> 0x062d }
            if (r8 == 0) goto L_0x060f
            r40 = 0
            goto L_0x0613
        L_0x060f:
            java.lang.String r40 = r0.getString(r2)     // Catch:{ all -> 0x062d }
        L_0x0613:
            X.Ju6 r22 = new X.Ju6     // Catch:{ all -> 0x062d }
            r34 = r22
            r34.<init>(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x062d }
            X.JuU r8 = new X.JuU     // Catch:{ all -> 0x062d }
            r21 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x062d }
            r10.add(r8)     // Catch:{ all -> 0x062d }
            goto L_0x0586
        L_0x0626:
            r0.close()
            r1.A00()
            return r10
        L_0x062d:
            r2 = move-exception
            r0.close()
            r1.A00()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y48.call():java.lang.Object");
    }

    public final void finalize() {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
                ((1WY) this.A02).A00();
                return;
            default:
                super.finalize();
                return;
        }
    }
}
