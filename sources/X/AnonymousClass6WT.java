package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6WT  reason: invalid class name */
public abstract class AnonymousClass6WT {
    public static final void A00(UserSession userSession, C255773uh r4, C316866mL r5) {
        ArrayList arrayList;
        C255783ui r0;
        BHJ bhj;
        Boolean bool;
        List Bkd = r4.Bkd(AnonymousClass3WT.MUSIC_OVERLAY);
        if (Bkd != null) {
            arrayList = new ArrayList(Bkd);
        } else {
            arrayList = null;
        }
        List Bkd2 = r4.Bkd(AnonymousClass3WT.SLIDER);
        if (Bkd2 == null || (r0 = (C255783ui) 00k.A0J(Bkd2)) == null || (bhj = r0.A0b) == null || (bool = bhj.A00) == null || !bool.booleanValue()) {
            A01(userSession, r5, arrayList, r4.A00());
        }
    }

    public static final void A01(UserSession userSession, C316866mL r17, ArrayList arrayList, float f) {
        String str;
        int i;
        int i2;
        int dimensionPixelSize;
        int i3;
        ArrayList arrayList2 = arrayList;
        if (arrayList != null && !arrayList2.isEmpty()) {
            C255783ui A00 = C289745e8.A00(AnonymousClass3WT.MUSIC_OVERLAY, arrayList2);
            C316866mL r6 = r17;
            if (!(A00 == null || (str = A00.A1g) == null || str.length() == 0)) {
                FrameLayout frameLayout = r6.A00;
                if (frameLayout == null) {
                    View inflate = r6.A02.inflate();
                    0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    frameLayout = (FrameLayout) inflate;
                    View findViewById = frameLayout.findViewById(R.id.music_sound_wave);
                    0qQ.A0C(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    r6.A01 = (ImageView) findViewById;
                    r6.A00 = frameLayout;
                }
                frameLayout.setVisibility(0);
                MusicOverlayStickerModel musicOverlayStickerModel = A00.A0u;
                if (musicOverlayStickerModel == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (0qQ.A0K(musicOverlayStickerModel.A0I, true)) {
                    FrameLayout frameLayout2 = r6.A00;
                    if (frameLayout2 != null) {
                        Context context = frameLayout2.getContext();
                        Resources resources = context.getResources();
                        String str2 = A00.A1g;
                        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
                        UserSession userSession2 = userSession;
                        if (0qQ.A0K(str2, AnonymousClass6KJ.SMALL_ART_SOLID.A02) || 0qQ.A0K(str2, AnonymousClass6KJ.SMALL_ART_FROSTED.A02) || 0qQ.A0K(str2, AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE.A02)) {
                            C380089Wp r0 = new AnonymousClass9XG(context, userSession2, musicOverlayStickerModel, 0, false).A06;
                            i = r0.A09;
                            i2 = r0.A06;
                            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                            i3 = dimensionPixelSize;
                        } else if (0qQ.A0K(str2, AnonymousClass6KJ.MUSIC_OVERLAY_ALBUM_ART.A02) || 0qQ.A0K(str2, AnonymousClass6KJ.LARGE_ART_ALBUM.A02)) {
                            C380139Wu r02 = new AnonymousClass9XH(context, userSession2, musicOverlayStickerModel, 0, false, false).A08;
                            i = r02.A08;
                            i2 = r02.A05;
                            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
                            i3 = (resources.getDimensionPixelSize(R.dimen.album_music_sticker_album_art_size) - dimensionPixelSize) - dimensionPixelSize2;
                        }
                        AnonymousClass6KL A002 = AnonymousClass6KK.A00(0.75f, resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), false);
                        A002.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
                        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
                        int color = context.getColor(R.color.black_30_transparent);
                        A002.A01 = dimensionPixelSize3;
                        A002.A09.setColor(color);
                        A002.invalidateSelf();
                        ImageView imageView = r6.A01;
                        if (imageView != null) {
                            imageView.setImageDrawable(A002);
                            ImageView imageView2 = r6.A01;
                            if (imageView2 != null) {
                                0nA.A0e(imageView2, i3);
                                ImageView imageView3 = r6.A01;
                                if (imageView3 != null) {
                                    0nA.A0d(imageView3, dimensionPixelSize);
                                    frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
                                    FrameLayout frameLayout3 = r6.A00;
                                    if (frameLayout3 != null) {
                                        0nA.A0q(frameLayout3, new C41180Ape(A00, r6, f));
                                        return;
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
            FrameLayout frameLayout4 = r6.A00;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(8);
            }
        }
    }
}
