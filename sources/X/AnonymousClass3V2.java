package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.tagging.widget.MediaTagHintsLayout;
import com.instagram.tagging.widget.TagsLayout;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3V2  reason: invalid class name */
public final class AnonymousClass3V2 extends C249703kE implements AnonymousClass3V3, AnonymousClass2xU {
    public static final int[] A0K = {R.id.collection_thumbnail_1, R.id.collection_thumbnail_2, R.id.collection_thumbnail_3, R.id.collection_thumbnail_4, R.id.collection_thumbnail_5, R.id.collection_thumbnail_6, R.id.collection_thumbnail_7, R.id.collection_thumbnail_8, R.id.collection_thumbnail_9};
    public AnonymousClass3W1 A00;
    public final View A01;
    public final View A02;
    public final AnonymousClass3TS A03;
    public final IgFrameLayout A04;
    public final AnonymousClass3V6 A05;
    public final AnonymousClass3TW A06;
    public final AnonymousClass3V8 A07;
    public final AnonymousClass3V4 A08;
    public final AnonymousClass3Ux A09;
    public final IgProgressImageView A0A;
    public final AnonymousClass3V9 A0B;
    public final AnonymousClass3VF A0C;
    public final LikeActionView A0D;
    public final MediaActionsView A0E;
    public final MediaFrameLayout A0F;
    public final Map A0G;
    public final View A0H;
    public final AnonymousClass3VC A0I;
    public final AnonymousClass3VD A0J;

    public final C256043v8 B5X() {
        return null;
    }

    public final C247233fz BQv() {
        return null;
    }

    public final C258253yi BRL() {
        return null;
    }

    public final void DQp(AnonymousClass3W1 r2, int i) {
        0qQ.A0B(r2, 0);
        this.A09.DQp(r2, i);
    }

    public final void Epi(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r2, 1);
        this.A0A.A09(r2, imageUrl, z);
    }

    public final AnonymousClass3TS Adf() {
        return this.A03;
    }

    public final AnonymousClass3TN B5Y() {
        return this.A0E;
    }

    public final View BG1() {
        return this.A0A;
    }

    public final View BQB() {
        return this.A0F;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A00;
    }

    public final C242423Ua C5r() {
        return this.A0F;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A0E.getWidth();
    }

    public final void EEI(int i) {
        this.A0A.A06(i);
    }

    public AnonymousClass3V2(View view, AnonymousClass0iw r9, UserSession userSession, AnonymousClass3Ux r11) {
        super(view);
        View requireViewById = view.requireViewById(R.id.collection_root_view);
        0qQ.A07(requireViewById);
        this.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.vertical_collection_view);
        0qQ.A07(requireViewById2);
        this.A02 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.collection_main_media_group);
        0qQ.A07(requireViewById3);
        this.A0F = (MediaFrameLayout) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.collection_media_view);
        0qQ.A07(requireViewById4);
        this.A0H = requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.collection_main_image);
        0qQ.A07(requireViewById5);
        this.A0A = (IgProgressImageView) requireViewById5;
        this.A08 = new AnonymousClass3V4((ViewStub) view.requireViewById(R.id.zero_rating_video_play_button_stub));
        View requireViewById6 = view.requireViewById(R.id.row_feed_media_actions);
        0qQ.A07(requireViewById6);
        this.A0E = (MediaActionsView) requireViewById6;
        this.A03 = new AnonymousClass3TS((ViewStub) view.requireViewById(R.id.audio_icon_view_stub));
        View requireViewById7 = view.requireViewById(R.id.like_heart);
        0qQ.A07(requireViewById7);
        this.A0D = (LikeActionView) requireViewById7;
        View requireViewById8 = requireViewById.requireViewById(R.id.collection_thumbnails);
        0qQ.A07(requireViewById8);
        this.A04 = (IgFrameLayout) requireViewById8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int[] iArr = A0K;
        int i = 0;
        do {
            int i2 = iArr[i];
            View requireViewById9 = this.A01.requireViewById(i2);
            0qQ.A07(requireViewById9);
            linkedHashMap.put(Integer.valueOf(i2), new AnonymousClass3V5((MediaFrameLayout) requireViewById9));
            i++;
        } while (i < 9);
        this.A0G = linkedHashMap;
        View requireViewById10 = view.requireViewById(R.id.collection_thumbnail_hscroll_row_stub);
        0qQ.A07(requireViewById10);
        this.A05 = new AnonymousClass3V6((ViewStub) requireViewById10, userSession);
        View requireViewById11 = view.requireViewById(R.id.save_to_collection_upsell_view_stub);
        0qQ.A07(requireViewById11);
        ViewStub viewStub = (ViewStub) requireViewById11;
        0qQ.A0B(viewStub, 0);
        this.A06 = new AnonymousClass3TW(viewStub, r9);
        View requireViewById12 = view.requireViewById(R.id.main_media);
        0qQ.A07(requireViewById12);
        this.A07 = new AnonymousClass3V8(requireViewById12);
        AnonymousClass3V9 r2 = new AnonymousClass3V9(view, userSession, R.id.row_feed_media_tag_indicator_stub);
        this.A0B = r2;
        View requireViewById13 = view.requireViewById(R.id.row_feed_photo_media_tag_hints);
        0qQ.A07(requireViewById13);
        AnonymousClass3VC r1 = new AnonymousClass3VC(userSession, (MediaTagHintsLayout) requireViewById13);
        this.A0I = r1;
        View requireViewById14 = view.requireViewById(R.id.row_feed_photo_tags);
        0qQ.A07(requireViewById14);
        AnonymousClass3VD r5 = new AnonymousClass3VD((TagsLayout) requireViewById14);
        this.A0J = r5;
        this.A09 = r11;
        this.A0C = new AnonymousClass3VF(r1, r2, (AnonymousClass3V9) null, (AnonymousClass3V9) null, r5, new AnonymousClass3VE(view));
    }
}
