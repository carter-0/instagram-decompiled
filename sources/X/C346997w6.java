package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7w6  reason: invalid class name and case insensitive filesystem */
public final class C346997w6 extends C299875vz implements C268714ds, C300645xY {
    public final int A00;
    public final MusicPickStickerModel A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final Drawable A06;
    public final Drawable A07;
    public final Drawable A08;
    public final Drawable A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final UserSession A0E;

    public C346997w6(Context context, UserSession userSession, MusicPickStickerModel musicPickStickerModel, String str) {
        Drawable drawable;
        ImageUrl imageUrl;
        AnonymousClass6KL r0;
        String str2;
        User user;
        String displayArtist;
        0qQ.A0B(musicPickStickerModel, 2);
        this.A05 = context;
        this.A01 = musicPickStickerModel;
        this.A0E = userSession;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.intent_aware_ad_rifu_card_large_width);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        StoryMusicPickTappableData storyMusicPickTappableData = musicPickStickerModel.A00;
        TrackData trackData = storyMusicPickTappableData.A04;
        String str3 = null;
        if (trackData != null) {
            drawable = new HCF(context, trackData.Arr(), false);
        } else {
            OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
            if (originalSoundData != null) {
                User user2 = originalSoundData.A03;
                if (user2 != null) {
                    imageUrl = user2.Bh3();
                } else {
                    imageUrl = null;
                }
                drawable = new HCF(context, imageUrl, AnonymousClass30D.A0C(userSession));
            } else {
                drawable = context.getDrawable(R.drawable.music_pick_sticker_album_background);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        this.A08 = drawable;
        StoryMusicPickTappableData storyMusicPickTappableData2 = musicPickStickerModel.A00;
        if (storyMusicPickTappableData2.A04 == null && storyMusicPickTappableData2.A01 == null) {
            Drawable drawable2 = context.getDrawable(R.drawable.music_pick_add_drawable);
            r0 = drawable2;
            if (drawable2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            AnonymousClass6KL A002 = AER.A00(context);
            A002.A05 = true;
            A002.invalidateSelf();
            r0 = A002;
        }
        this.A0B = r0;
        TrackData trackData2 = musicPickStickerModel.A00.A04;
        if (trackData2 == null || (str2 = trackData2.getTitle()) == null) {
            OriginalSoundData originalSoundData2 = musicPickStickerModel.A00.A01;
            if (originalSoundData2 != null) {
                str2 = originalSoundData2.A0M;
            } else {
                str2 = null;
            }
        }
        this.A0D = AER.A02(context, str2 == null ? "" : str2, R.dimen.music_pick_author_container_size, R.color.igds_icon_on_color, R.dimen.account_discovery_bottom_gap);
        TrackData trackData3 = musicPickStickerModel.A00.A04;
        if (trackData3 == null || (displayArtist = trackData3.getDisplayArtist()) == null) {
            OriginalSoundData originalSoundData3 = musicPickStickerModel.A00.A01;
            if (!(originalSoundData3 == null || (user = originalSoundData3.A03) == null)) {
                str3 = user.getUsername();
            }
        } else {
            str3 = displayArtist;
        }
        this.A09 = AER.A02(context, str3 == null ? "" : str3, R.dimen.music_pick_author_container_size, R.color.bright_foreground_disabled_material_dark, R.dimen.account_discovery_bottom_gap);
        String string = context.getString(2131967829);
        this.A06 = AER.A02(context, string == null ? "" : string, R.dimen.music_pick_author_container_size, R.color.bright_foreground_disabled_material_dark, R.dimen.action_bar_item_spacing_right);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        Drawable drawable3 = context.getDrawable(R.drawable.music_pick_sticker_prompt_background);
        if (drawable3 != null) {
            this.A0C = drawable3;
            String string2 = context.getResources().getString(2131970878);
            0qQ.A07(string2);
            this.A07 = AER.A02(context, string2, R.dimen.add_to_story_dual_destination_share_sheet_story_row_height, R.color.clips_remix_camera_outer_container_default_background, R.dimen.abc_edit_text_inset_top_material);
            StoryMusicPickTappableData storyMusicPickTappableData3 = musicPickStickerModel.A00;
            this.A0A = AER.A01(context, str, storyMusicPickTappableData3.A09, storyMusicPickTappableData3.A00);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String C4F() {
        return C273654mx.A00(168);
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        0qQ.A0B(canvas, 0);
        this.A08.draw(canvas);
        this.A0B.draw(canvas);
        MusicPickStickerModel musicPickStickerModel = this.A01;
        StoryMusicPickTappableData storyMusicPickTappableData = musicPickStickerModel.A00;
        if (storyMusicPickTappableData.A04 == null && storyMusicPickTappableData.A01 == null) {
            drawable = this.A06;
        } else {
            this.A0D.draw(canvas);
            drawable = this.A09;
        }
        drawable.draw(canvas);
        this.A0C.draw(canvas);
        this.A0A.draw(canvas);
        if (musicPickStickerModel.A01 == 0) {
            this.A07.draw(canvas);
        }
        invalidateSelf();
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A08, this.A0B, this.A0D, this.A09, this.A0C, this.A07, this.A0A});
    }

    public final C2802350v BzV() {
        return this.A01;
    }

    public final int getIntrinsicHeight() {
        return this.A08.getIntrinsicHeight() + this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        int i5;
        int intrinsicWidth;
        int intrinsicHeight;
        int i6 = i;
        super.setBounds(i6, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        int i7 = this.A00;
        float f3 = ((float) i7) / 2.0f;
        float intrinsicHeight2 = f2 - (((float) getIntrinsicHeight()) / 2.0f);
        Drawable drawable2 = this.A08;
        int i8 = (int) (f - f3);
        int i9 = (int) intrinsicHeight2;
        int i10 = (int) (f + f3);
        int intrinsicHeight3 = (int) (f2 + (((float) getIntrinsicHeight()) / 2.0f));
        int i11 = this.A02;
        int i12 = intrinsicHeight3 - i11;
        drawable2.setBounds(i8, i9, i10, i12);
        Drawable drawable3 = this.A0B;
        drawable3.setBounds(i8, i9, i10, i12);
        StoryMusicPickTappableData storyMusicPickTappableData = this.A01.A00;
        if (storyMusicPickTappableData.A04 == null && storyMusicPickTappableData.A01 == null) {
            drawable = this.A06;
            int i13 = i7 / 2;
            intrinsicWidth = (i13 + i8) - (drawable.getIntrinsicWidth() / 2);
            intrinsicHeight = this.A03 + i9 + (drawable3.getIntrinsicHeight() / 2) + (drawable2.getIntrinsicHeight() / 2);
            i5 = i10 - i13;
        } else {
            Drawable drawable4 = this.A0D;
            int i14 = i7 / 2;
            int i15 = i14 + i8;
            int i16 = this.A04;
            drawable = this.A09;
            i5 = i10 - i14;
            drawable4.setBounds(i15 - (drawable4.getIntrinsicWidth() / 2), (((drawable2.getIntrinsicHeight() + i9) - i16) - drawable.getIntrinsicHeight()) - drawable4.getIntrinsicHeight(), (drawable4.getIntrinsicWidth() / 2) + i5, intrinsicHeight3);
            intrinsicWidth = i15 - (drawable.getIntrinsicWidth() / 2);
            intrinsicHeight = ((drawable2.getIntrinsicHeight() + i9) - i16) - drawable.getIntrinsicHeight();
        }
        drawable.setBounds(intrinsicWidth, intrinsicHeight, i5 + (drawable.getIntrinsicWidth() / 2), intrinsicHeight3);
        this.A0C.setBounds(i8, drawable2.getIntrinsicHeight() + i9, i10, intrinsicHeight3);
        Drawable drawable5 = this.A0A;
        int i17 = this.A04;
        int i18 = i11 / 2;
        drawable5.setBounds(i17 + i8, drawable2.getIntrinsicHeight() + i9 + (i18 - (drawable5.getIntrinsicHeight() / 2)), (i10 - i7) + drawable5.getIntrinsicWidth() + i17, intrinsicHeight3 - (i18 - (drawable5.getIntrinsicHeight() / 2)));
        Drawable drawable6 = this.A07;
        drawable6.setBounds(((i8 + i7) - drawable6.getIntrinsicWidth()) - i17, i9 + drawable2.getIntrinsicHeight() + (i18 - (drawable6.getIntrinsicHeight() / 2)), i10 - i17, intrinsicHeight3 - (i18 - (drawable6.getIntrinsicHeight() / 2)));
    }
}
