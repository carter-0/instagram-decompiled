package com.instagram.igtv.uploadflow;

import X.002;
import X.09i;
import X.0qQ;
import X.0wb;
import X.1Au;
import X.1Av;
import X.1NY;
import X.1OC;
import X.1wn;
import X.1xC;
import X.28D;
import X.2dY;
import X.2dZ;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass1GD;
import X.AnonymousClass1YB;
import X.AnonymousClass3GP;
import X.AnonymousClass3GR;
import X.AnonymousClass3M8;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C249453jo;
import X.C249463jp;
import X.C2594141p;
import X.C318116oQ;
import X.C320236s2;
import X.C50128FQl;
import X.C51966G9m;
import X.C58185Inp;
import X.C61500KAf;
import X.C62091KZv;
import X.C63301Kuk;
import X.C63653L1p;
import X.C63722L4g;
import X.C64147LQk;
import X.C64698LgT;
import X.C65406Lsm;
import X.C65414Lsu;
import X.C66306MMp;
import X.C66399MQf;
import X.DbS;
import X.DbU;
import X.DbW;
import X.JTO;
import X.JTP;
import X.JTR;
import X.KTW;
import X.KTX;
import X.KTY;
import X.LBS;
import X.LCp;
import X.LF3;
import X.LJ5;
import X.LJ9;
import X.LMX;
import X.MGF;
import X.MH0;
import X.ML5;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.igtv.model.IGTVCreationToolsResponse;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.List;

public final class IGTVUploadActivity extends IgFragmentActivity implements C249453jo, C249463jp {
    public Bundle A00;
    public 28D A01;
    public UserSession A02;
    public Integer A03;
    public final LMX A04 = new LMX(this);
    public final AnonymousClass0eM A05 = C66306MMp.A01(this, 10);
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(ML5.A00);
    public final AnonymousClass0eM A07 = DbS.A0I(C66306MMp.A02(this, 11), C66306MMp.A02(this, 12), new C58185Inp(47, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class));
    public final 1wn A08 = C64698LgT.A00(this, 66);
    public final 1wn A09 = C64698LgT.A00(this, 67);

    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        long j;
        0qQ.A0B(bundle, 0);
        IGTVUploadActivity.super.onSaveInstanceState(bundle);
        bundle.putBoolean("uploadflow.extra.is_activity_restart", true);
        AnonymousClass0eM r2 = this.A07;
        IGTVUploadViewModel A0k = JTO.A0k(r2);
        C64147LQk lQk = A0k.A08;
        LCp lCp = new LCp();
        C62091KZv kZv = lQk.A07;
        Object obj = kZv.A00.first;
        0qQ.A07(obj);
        C66399MQf mQf = (C66399MQf) obj;
        0qQ.A0B(mQf, 2);
        lCp.A00(bundle, mQf, "uploadnavigator.extra.saved_current_state");
        C66399MQf mQf2 = lQk.A08.A00;
        if (mQf2 == null) {
            mQf2 = C65406Lsm.A00;
        }
        lCp.A00(bundle, mQf2, "uploadnavigator.extra.saved_start_state");
        int i2 = lQk.A00 + 1;
        lQk.A00 = i2;
        bundle.putInt("uploadnavigator.extra.num_system_save", i2);
        bundle.putParcelable("uploadnavigator.extra.upload_flow_progress", lQk.A01);
        lQk.A0A.getValue();
        0qQ.A07(kZv.A00.first);
        C65414Lsu lsu = A0k.A0M;
        bundle.putString("uploadviewmodel.key.title", lsu.A0N);
        bundle.putString("uploadviewmodel.key.caption", lsu.A0H);
        List list = lsu.A0P;
        0qQ.A0C(list, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.model.people.PeopleTag>");
        bundle.putParcelableArrayList("uploadviewmodel.key.people_tags", (ArrayList) list);
        String str = lsu.A0I;
        if (!(str == null || str.length() == 0)) {
            bundle.putString("uploadviewmodel.key.collaborator_id", str);
        }
        bundle.putInt("uploadviewmodel.key.filter_id", lsu.A05);
        bundle.putInt("uploadviewmodel.key.filter_strength", lsu.A06);
        bundle.putFloat("uploadviewmodel.key.post_crop_aspect_ratio", lsu.A00);
        bundle.putBoolean("uploadviewmodel.key.is_landscape_surface", lsu.A0d);
        bundle.putBoolean("uploadviewmodel.key.is_cover_image_custom", lsu.A0Y);
        String str2 = lsu.A0J;
        if (!(str2 == null || str2.length() == 0)) {
            bundle.putString("uploadviewmodel.key.cover_image_file_path", str2);
        }
        bundle.putInt("uploadviewmodel.key.cover_image_width", lsu.A04);
        bundle.putInt("uploadviewmodel.key.cover_image_height", lsu.A03);
        bundle.putInt("uploadviewmodel.key.cover_frame_time_ms", lsu.A02);
        bundle.putBoolean("uploadviewmodel.key.is_cover_frame_edited", lsu.A0Z);
        MediaCroppingCoordinates mediaCroppingCoordinates = lsu.A09;
        if (mediaCroppingCoordinates != null) {
            bundle.putParcelable("uploadviewmodel.key.feed_preview_crop_coordinates", mediaCroppingCoordinates);
        }
        MediaCroppingCoordinates mediaCroppingCoordinates2 = lsu.A0A;
        if (mediaCroppingCoordinates2 != null) {
            bundle.putParcelable("uploadviewmodel.key.profile_crop_coordinates", mediaCroppingCoordinates2);
        }
        List list2 = lsu.A0O;
        if (list2 != null) {
            bundle.putParcelableArrayList("uploadviewmodel.key.branded_content_tag", AnonymousClass7TE.A1D(list2));
        }
        bundle.putBoolean("uploadviewmodel.key.is_paid_partnership", lsu.A0f);
        bundle.putParcelable("uploadviewmodel.key.media_gating_info", lsu.A07);
        bundle.putParcelable("uploadviewmodel.key.branded_content_project_metadata", lsu.A08);
        bundle.putBoolean("uploadviewmodel.key.is_funded_content_deal", lsu.A0a);
        bundle.putBoolean("uploadviewmodel.key.is_like_and_view_counts_disabled", lsu.A0e);
        bundle.putBoolean("uploadviewmodel.key.are_captions_enabled", lsu.A0Q);
        bundle.putBoolean("uploadviewmodel.key.are_comments_disabled", lsu.A0R);
        bundle.putBoolean("uploadviewmodel.key.check_ads_toggle_turned_off", lsu.A0S);
        bundle.putBoolean("uploadviewmodel.key.has_shown_ads_toggle_tooltip", lsu.A0V);
        bundle.putString("uploadviewmodel.key.group_destination_user_id", lsu.A0M);
        bundle.putBoolean("uploadviewmodel.key.share_to_facebook", lsu.A0h);
        bundle.putParcelable("uploadviewmodel.key.shopping_metadata", lsu.A0B);
        bundle.putParcelable("uploadviewmodel.key.shopping_multi_select_state", lsu.A0F);
        bundle.putParcelable("uploadviewmodel.key.new_fundraiser_model", lsu.A0E);
        bundle.putParcelable("uploadviewmodel.key.fundraiser_to_attach", lsu.A0G);
        bundle.putString("uploadviewmodel.key.existing_fundraiser_id", lsu.A0L);
        bundle.putBoolean("uploadviewmodel.key.show_fundraiser_row", lsu.A0i);
        bundle.putBoolean("uploadviewmodel.key.is_internal_only", lsu.A0b);
        C63722L4g l4g = lsu.A0C;
        if (l4g != null) {
            i = l4g.A00;
        } else {
            i = -1;
        }
        bundle.putInt("uploadviewmodel.key.draft_id", i);
        C63722L4g l4g2 = lsu.A0C;
        if (l4g2 != null) {
            j = l4g2.A01;
        } else {
            j = 0;
        }
        bundle.putLong("uploadviewmodel.key.draft_creation_ts", j);
        String str3 = lsu.A0K;
        if (!(str3 == null || str3.length() == 0)) {
            bundle.putString("uploadviewmodel.key.draft_series_id", str3);
        }
        bundle.putBoolean("uploadviewmodel.key.draft_is_unified_video", lsu.A0g);
        Integer num = this.A03;
        if (num == null) {
            0qQ.A0F("startingScreen");
            throw AnonymousClass00P.createAndThrow();
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            if (JTO.A0k(r2).A01 instanceof KTX) {
                KTX A0o = JTR.A0o(r2);
                bundle.putString("uploadflow.extra.igtv_pending_media_key", A0o.A02.A35);
                bundle.putParcelable("uploadflow.extra.gallery_medium", A0o.A00);
            }
        } else if (intValue != 2) {
        } else {
            if (JTO.A0k(r2).A0M.A0D != null) {
                LBS lbs = JTO.A0k(r2).A0M.A0D;
                0qQ.A0A(lbs);
                bundle.putString("post_live.extra.live_pending_media_id", lbs.A0C);
                bundle.putString("post_live.extra.live_broadcast_id", lbs.A09);
                bundle.putLong("post_live.extra.live_duration_ms", lbs.A08);
                bundle.putBoolean("post_live.extra.is_landscape", lbs.A0H);
                bundle.putBoolean("post_live.extra.live_has_shopping", lbs.A03);
                bundle.putParcelableArrayList("post_live.extra.live_branded_content_tag", lbs.A02);
                bundle.putInt("post_live.extra.cover_image_width", lbs.A01);
                bundle.putInt("post_live.extra.cover_image_height", lbs.A00);
                bundle.putBoolean("post_live.extra.is_custom_cover_photo", lbs.A0G);
                bundle.putString("post_live.extra.cover_photo_path", lbs.A0B);
                bundle.putInt("post_live.extra.cover_picker_progress", lbs.A07);
                bundle.putString("post_live.extra.caption", lbs.A0A);
                bundle.putBoolean("post_live.extra.caption", lbs.A0F);
                bundle.putBoolean("post_live.extra.share_preview_to_feed", lbs.A0I);
                bundle.putString("post_live.extra.title", lbs.A0E);
                bundle.putString("post_live.extra.caption", lbs.A0D);
                bundle.putBoolean("post_live.extra.internal", lbs.A05);
                bundle.putBoolean("post_live.extra.internal.switch.enabled", lbs.A06);
                bundle.putBoolean("post_live.extra.exclusive_post", lbs.A04);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.os.Bundle r9, com.instagram.igtv.uploadflow.IGTVUploadActivity r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 33
            boolean r0 = X.C66137MDp.A02(r3, r11)
            if (r0 == 0) goto L_0x00d7
            r6 = r11
            X.MDp r6 = (X.C66137MDp) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d7
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r6.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r6.A00
            r8 = 0
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005e
            if (r0 != r7) goto L_0x00dd
            java.lang.Object r10 = r6.A01
            com.instagram.igtv.uploadflow.IGTVUploadActivity r10 = (com.instagram.igtv.uploadflow.IGTVUploadActivity) r10
            X.0eS.A00(r4)
        L_0x002a:
            X.LJ9 r4 = (X.LJ9) r4
            boolean r0 = r4 instanceof X.KTX
            if (r0 == 0) goto L_0x0033
            X.KTJ r8 = X.KTJ.A00
        L_0x0032:
            return r8
        L_0x0033:
            boolean r0 = r4 instanceof X.KTW
            if (r0 == 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Cannot convert Medium to PendingMedia, entry point: "
            r1.append(r0)
            X.0eM r0 = r10.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r0)
            X.28D r0 = r0.A00
            r1.append(r0)
            java.lang.String r0 = ", reason: "
            r1.append(r0)
            X.KTW r4 = (X.KTW) r4
            java.lang.String r0 = r4.A00
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r0 = "IGTVUploadActivity.initialize"
            X.0wb.A03(r0, r1)
            return r8
        L_0x005e:
            X.0eS.A00(r4)
            java.lang.Integer r0 = r10.A03
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "startingScreen"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006f:
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x00ee
            if (r1 == r7) goto L_0x008a
            r0 = 2
            if (r1 != r0) goto L_0x00e2
            X.LBS r1 = X.C63301Kuk.A00(r9)
            X.0eM r0 = r10.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r0)
            r0.A05(r1)
            X.KTN r8 = X.KTN.A00
            return r8
        L_0x008a:
            java.lang.String r0 = "uploadflow.extra.gallery_medium"
            android.os.Parcelable r5 = r9.getParcelable(r0)
            com.instagram.common.gallery.Medium r5 = (com.instagram.common.gallery.Medium) r5
            java.lang.String r0 = "uploadflow.extra.crop_to_square"
            boolean r4 = r9.getBoolean(r0)
            r2 = -1
            java.lang.String r0 = "uploadflow.extra.draft_id"
            int r1 = r9.getInt(r0, r2)
            r6.A01 = r10
            r6.A00 = r7
            X.0eM r0 = r10.A07
            if (r1 == r2) goto L_0x00b2
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r0)
            java.lang.Object r4 = r0.A03(r1, r6)
        L_0x00af:
            if (r4 != r3) goto L_0x002a
            return r3
        L_0x00b2:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r0)
            if (r5 == 0) goto L_0x00e7
            X.LF3 r0 = r2.A09
            X.LJ9 r0 = r0.A01(r5, r2, r4)
            r2.A01 = r0
            boolean r0 = r0 instanceof X.KTX
            if (r0 == 0) goto L_0x00d4
            X.KTX r0 = r2.A02()
            X.3Q2 r0 = r0.A02
            float r1 = r0.A02
        L_0x00cc:
            X.Lsu r0 = r2.A0M
            r0.A00(r1)
            X.LJ9 r4 = r2.A01
            goto L_0x00af
        L_0x00d4:
            r1 = 1058013184(0x3f100000, float:0.5625)
            goto L_0x00cc
        L_0x00d7:
            X.MDp r6 = X.C66137MDp.A00(r10, r11, r3)
            goto L_0x0016
        L_0x00dd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e7:
            java.lang.String r0 = "Null medium"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00ee:
            X.KTK r8 = X.KTK.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.IGTVUploadActivity.A00(android.os.Bundle, com.instagram.igtv.uploadflow.IGTVUploadActivity, X.4D7):java.lang.Object");
    }

    /* renamed from: A01 */
    public final UserSession getSession() {
        UserSession userSession = this.A02;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 2dZ AYJ() {
        2dZ r0 = this.A04.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("actionBarService");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass3M8 Bx5() {
        return (AnonymousClass3M8) this.A05.getValue();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.igtv.uploadflow.IGTVUploadActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r2 == r1) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r4 = this;
            com.instagram.igtv.uploadflow.IGTVUploadActivity.super.finish()
            X.0eM r0 = r4.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r0)
            X.28D r1 = r2.A00
            X.28D r0 = X.28D.A38
            r3 = 0
            if (r1 != r0) goto L_0x0029
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0029
            java.lang.Integer r2 = r4.A03
            if (r2 != 0) goto L_0x0022
            java.lang.String r0 = "startingScreen"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0022:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            if (r2 != r1) goto L_0x002c
        L_0x0029:
            r0 = 2130771975(0x7f010007, float:1.7147055E38)
        L_0x002c:
            r4.overridePendingTransition(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.IGTVUploadActivity.finish():void");
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.07Z, android.content.Context, java.lang.Object, com.instagram.igtv.uploadflow.IGTVUploadActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        28D r1;
        Integer num;
        String str;
        String str2;
        String str3;
        LJ9 lj9;
        C63722L4g l4g;
        String str4;
        int A002 = AnonymousClass0fD.A00(1823413795);
        AnonymousClass1GD.A01(this);
        setupColorTheme();
        setContentView((int) R.layout.upload_flow_activity);
        Bundle A062 = DbU.A06(this);
        0qQ.A0A(A062);
        this.A02 = 09i.A0A.A06(A062);
        this.A00 = bundle;
        Object obj = A062.get("igtv_creation_entry_point_arg");
        if (!(obj instanceof 28D) || (r1 = (28D) obj) == null) {
            r1 = 28D.A5J;
        }
        this.A01 = r1;
        AnonymousClass0eM r3 = this.A07;
        IGTVUploadViewModel A0k = JTO.A0k(r3);
        28D r0 = this.A01;
        if (r0 == null) {
            str = "entryPoint";
        } else {
            A0k.A00 = r0;
            LMX lmx = this.A04;
            AppCompatActivity appCompatActivity = lmx.A02;
            ViewGroup viewGroup = (ViewGroup) appCompatActivity.findViewById(R.id.action_bar_container);
            0qQ.A0A(viewGroup);
            lmx.A00 = 2dY.A01(lmx.A01, viewGroup);
            appCompatActivity.getSupportFragmentManager().A0s(new C50128FQl(lmx, 0));
            String string = A062.getString("uploadflow.extra.start_screen");
            if (string == null || string.equals("GALLERY")) {
                num = AnonymousClass05K.A00;
            } else if (string.equals("CANVAS")) {
                num = AnonymousClass05K.A01;
            } else if (string.equals("POST_LIVE_CANVAS")) {
                num = AnonymousClass05K.A0C;
            } else {
                throw AnonymousClass7TE.A0w(string);
            }
            this.A03 = num;
            ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = (ExistingStandaloneFundraiserForFeedModel) A062.getParcelable("post_live.extra.fundraiser_info");
            if (existingStandaloneFundraiserForFeedModel != null) {
                IGTVUploadViewModel A0k2 = JTO.A0k(r3);
                String str5 = existingStandaloneFundraiserForFeedModel.A03;
                A0k2.A0M.A0L = str5;
                JTO.A0k(r3).A0M.A0G = existingStandaloneFundraiserForFeedModel;
                JTO.A0k(r3).A0M.A0i = C51966G9m.A1a(str5, "0");
            }
            if (bundle != null) {
                Integer num2 = this.A03;
                str = "startingScreen";
                if (num2 != null) {
                    int intValue = num2.intValue();
                    if (intValue == 0) {
                        IGTVUploadViewModel A0k3 = JTO.A0k(r3);
                        LF3 lf3 = A0k3.A09;
                        Medium medium = (Medium) bundle.getParcelable("uploadflow.extra.gallery_medium");
                        if (medium != null) {
                            lj9 = lf3.A00(medium, A0k3, bundle.getString("uploadflow.extra.igtv_pending_media_key"));
                        } else {
                            lj9 = KTY.A00;
                        }
                        A0k3.A01 = lj9;
                        if (lj9 instanceof KTW) {
                            StringBuilder A0n = AnonymousClass7TF.A0n("Cannot convert Medium to PendingMedia, entry point: ");
                            A0n.append(JTO.A0k(r3).A00);
                            A0n.append(", reason: ");
                            str3 = AnonymousClass7TF.A0l(((KTW) lj9).A00, A0n);
                            str2 = "IGTVUploadActivity.initializeUploadAsset.GALLERY";
                            0wb.A03(str2, str3);
                            finish();
                        }
                    } else if (intValue == 1) {
                        IGTVUploadViewModel A0k4 = JTO.A0k(r3);
                        LJ9 A003 = A0k4.A09.A00((Medium) C320236s2.A00(bundle, Medium.class, "uploadflow.extra.gallery_medium"), A0k4, bundle.getString("uploadflow.extra.igtv_pending_media_key"));
                        A0k4.A01 = A003;
                        if (A003 instanceof KTW) {
                            Integer num3 = this.A03;
                            if (num3 != null) {
                                switch (num3.intValue()) {
                                    case 1:
                                        str4 = "CANVAS";
                                        break;
                                    case 2:
                                        str4 = "POST_LIVE_CANVAS";
                                        break;
                                    default:
                                        str4 = "GALLERY";
                                        break;
                                }
                                str2 = 002.A0R("IGTVUploadActivity.initializeUploadAsset.", str4);
                                StringBuilder A0n2 = AnonymousClass7TF.A0n("Cannot convert Medium to PendingMedia, entry point: ");
                                A0n2.append(JTO.A0k(r3).A00);
                                A0n2.append(", reason: ");
                                str3 = AnonymousClass7TF.A0l(((KTW) A003).A00, A0n2);
                                0wb.A03(str2, str3);
                                finish();
                            }
                        }
                    } else if (intValue == 2) {
                        JTO.A0k(r3).A05(C63301Kuk.A00(bundle));
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    C65414Lsu lsu = JTO.A0k(r3).A0M;
                    lsu.setTitle(bundle.getString("uploadviewmodel.key.title", ""));
                    lsu.ER5(bundle.getString("uploadviewmodel.key.caption", ""));
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("uploadviewmodel.key.people_tags");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = AnonymousClass7TE.A1C();
                    }
                    lsu.A0P = parcelableArrayList;
                    lsu.A0I = bundle.getString("uploadviewmodel.key.collaborator_id", (String) null);
                    lsu.A05 = bundle.getInt("uploadviewmodel.key.filter_id");
                    lsu.A06 = bundle.getInt("uploadviewmodel.key.filter_strength");
                    lsu.EgG(bundle.getFloat("uploadviewmodel.key.post_crop_aspect_ratio"));
                    lsu.A0d = bundle.getBoolean("uploadviewmodel.key.is_landscape_surface");
                    lsu.A0Y = bundle.getBoolean("uploadviewmodel.key.is_cover_image_custom");
                    lsu.A0J = bundle.getString("uploadviewmodel.key.cover_image_file_path", (String) null);
                    lsu.A04 = bundle.getInt("uploadviewmodel.key.cover_image_width");
                    lsu.A03 = bundle.getInt("uploadviewmodel.key.cover_image_height");
                    lsu.A02 = bundle.getInt("uploadviewmodel.key.cover_frame_time_ms");
                    lsu.A0Z = bundle.getBoolean("uploadviewmodel.key.is_cover_frame_edited");
                    lsu.A09 = bundle.getParcelable("uploadviewmodel.key.feed_preview_crop_coordinates");
                    lsu.A0A = bundle.getParcelable("uploadviewmodel.key.profile_crop_coordinates");
                    ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("uploadviewmodel.key.branded_content_tag");
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = AnonymousClass7TE.A1C();
                    }
                    lsu.A0O = parcelableArrayList2;
                    lsu.A0f = bundle.getBoolean("uploadviewmodel.key.is_paid_partnership");
                    lsu.A07 = (BrandedContentGatingInfoIntf) bundle.getParcelable("uploadviewmodel.key.media_gating_info");
                    lsu.A08 = (BrandedContentProjectMetadataIntf) bundle.getParcelable("uploadviewmodel.key.branded_content_project_metadata");
                    lsu.A0a = bundle.getBoolean("uploadviewmodel.key.is_funded_content_deal");
                    lsu.A0e = bundle.getBoolean("uploadviewmodel.key.is_like_and_view_counts_disabled");
                    lsu.A0Q = bundle.getBoolean("uploadviewmodel.key.are_captions_enabled");
                    lsu.A0R = bundle.getBoolean("uploadviewmodel.key.are_comments_disabled");
                    lsu.A0S = bundle.getBoolean("uploadviewmodel.key.check_ads_toggle_turned_off");
                    lsu.A0V = bundle.getBoolean("uploadviewmodel.key.has_shown_ads_toggle_tooltip");
                    lsu.A0T = bundle.getBoolean("uploadeviewmodel.key.enable_branded_content_partner_boost");
                    lsu.A0U = bundle.getBoolean("uploadviewmodel.key.exclusive_posts");
                    lsu.A0M = bundle.getString("uploadviewmodel.key.group_destination_user_id");
                    lsu.A0h = bundle.getBoolean("uploadviewmodel.key.share_to_facebook");
                    lsu.A0B = (IGTVShoppingMetadata) bundle.getParcelable("uploadviewmodel.key.shopping_metadata");
                    lsu.A0F = (TaggingFeedMultiSelectState) bundle.getParcelable("uploadviewmodel.key.shopping_multi_select_state");
                    lsu.A0E = (NewFundraiserInfo) bundle.getParcelable("uploadviewmodel.key.new_fundraiser_model");
                    lsu.A0G = (ExistingStandaloneFundraiserForFeedModel) bundle.getParcelable("uploadviewmodel.key.fundraiser_to_attach");
                    lsu.A0L = bundle.getString("uploadviewmodel.key.existing_fundraiser_id");
                    lsu.A0i = bundle.getBoolean("uploadviewmodel.key.show_fundraiser_row");
                    lsu.A0b = bundle.getBoolean("uploadviewmodel.key.is_internal_only");
                    int i = bundle.getInt("uploadviewmodel.key.draft_id", -1);
                    if (i != -1) {
                        l4g = new C63722L4g(i, bundle.getLong("uploadviewmodel.key.draft_creation_ts", 0));
                    } else {
                        l4g = null;
                    }
                    lsu.A0C = l4g;
                    lsu.A0K = bundle.getString("uploadviewmodel.key.draft_series_id", (String) null);
                    lsu.A0g = bundle.getBoolean("uploadviewmodel.key.draft_is_unified_video");
                    if (JTO.A0k(r3).A01 instanceof KTX) {
                        JTR.A0o(r3).A01();
                    }
                }
            }
            super.onCreate(bundle);
            C2594141p.A00(this, 1);
            if (bundle == null || 0qQ.A0K(JTO.A0k(r3).A01, KTY.A00)) {
                AnonymousClass7TE.A1Z(new MH0((Object) A062, (Object) this, (AnonymousClass4D7) null, 31), DbW.A0E(this));
                IGTVUploadViewModel A0k5 = JTO.A0k(r3);
                UserSession A012 = getSession();
                C63653L1p l1p = new C63653L1p(A0k5);
                1NY A0b = AnonymousClass7TG.A0b(A012);
                A0b.A0A("igtv/igtv_creation_tools/");
                1OC A0S = DbU.A0S(A0b, IGTVCreationToolsResponse.class, LJ5.class);
                C61500KAf.A00(A0S, l1p, 27);
                schedule(A0S);
            }
            AnonymousClass0fD.A07(241762281, A002);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(-1864446841);
        IGTVUploadViewModel A0k = JTO.A0k(this.A07);
        if (A0k.A0M.A0C != null) {
            IGTVDraftsRepository A0a = JTP.A0a(A0k);
            A0a.A00.remove(A0k.A0B);
        }
        super.onDestroy();
        AnonymousClass0fD.A07(1718785802, A002);
    }

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(-1997407162);
        super.onPause();
        1xC r2 = 1xC.A01;
        r2.A03(this.A09, AnonymousClass3GP.class);
        r2.A03(this.A08, AnonymousClass3GR.class);
        AnonymousClass0fD.A07(1170322176, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-2075984166);
        super.onResume();
        LMX.A00(this.A04);
        1xC r2 = 1xC.A01;
        r2.A02(this.A09, AnonymousClass3GP.class);
        r2.A02(this.A08, AnonymousClass3GR.class);
        AnonymousClass0fD.A07(677718841, A002);
    }

    public final void onStart() {
        int A002 = AnonymousClass0fD.A00(762515493);
        super.onStart();
        IGTVUploadViewModel A0k = JTO.A0k(this.A07);
        1Av A003 = 1Au.A00(A0k.A06);
        long A062 = DbW.A06(A003.A01, "igtv_drafts_cleanup_last_check_ts");
        long currentTimeMillis = System.currentTimeMillis() - IGTVUploadViewModel.A0N;
        if (1 <= A062 && A062 < currentTimeMillis) {
            AnonymousClass7TE.A1Z(new MGF(A003, A0k, (AnonymousClass4D7) null, 10, currentTimeMillis), C318116oQ.A00(A0k));
        }
        AnonymousClass0fD.A07(1861987413, A002);
    }
}
