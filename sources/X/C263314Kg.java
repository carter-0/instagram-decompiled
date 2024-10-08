package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.4Kg  reason: invalid class name and case insensitive filesystem */
public final class C263314Kg {
    public static final C263314Kg A00 = new Object();

    public static final Drawable A00(Context context, Integer num, int i) {
        int i2;
        int intValue = num.intValue();
        if (intValue != 0) {
            int i3 = R.attr.igds_color_icon_on_white;
            if (intValue != 1) {
                i3 = R.attr.igds_color_secondary_text_on_media;
            }
            i2 = 2Yu.A0H(context, i3);
        } else {
            i2 = R.color.canvas_bottom_sheet_description_text_color;
        }
        Drawable A01 = AnonymousClass4Ed.A01(context, i, i2);
        if (A01 != null) {
            return A01;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final GAM A01(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, AnonymousClass4Ke r9, Integer num) {
        Drawable drawable;
        int i;
        Object obj;
        0qQ.A0B(spannableStringBuilder, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(userSession, 3);
        Context context2 = context;
        if (r9.A05 || r9.A08) {
            drawable = null;
        } else if (r9.A0A) {
            drawable = A00(context, num, R.drawable.clips_trending_arrow);
        } else if (!r9.A06 || !AnonymousClass8IK.A02(userSession)) {
            C376489Ie r3 = r9.A01;
            if (r3 != null) {
                obj = r3.A03;
            } else {
                obj = null;
            }
            OriginalAudioSubtype originalAudioSubtype = OriginalAudioSubtype.A06;
            if (obj != originalAudioSubtype) {
                drawable = A00(context, num, R.drawable.instagram_music_pano_filled_12);
            } else if (r3 == null || r3.A03 != originalAudioSubtype || !182.A06(0Tu.A05, userSession, 36321395961177412L)) {
                drawable = A00(context, num, R.drawable.instagram_mix_pano_filled_12);
            } else {
                int dimension = (int) context.getResources().getDimension(R.dimen.account_discovery_bottom_gap);
                Bitmap A002 = C62953Kp5.A00(A00(context, num, R.drawable.instagram_multi_track_pano_filled_24), dimension, dimension);
                Resources resources = context.getResources();
                0qQ.A07(resources);
                drawable = new BitmapDrawable(resources, A002);
            }
        } else {
            drawable = A00.A06(context, num);
        }
        int i2 = r9.A00;
        int intValue = num.intValue();
        if (intValue != 0) {
            int i3 = R.attr.igds_color_icon_on_white;
            if (intValue != 1) {
                i3 = R.attr.igds_color_secondary_text_on_media;
            }
            i = 2Yu.A0H(context2, i3);
        } else {
            i = R.color.canvas_bottom_sheet_description_text_color;
        }
        int color = context2.getColor(i);
        Integer num2 = AnonymousClass05K.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        0qQ.A08(typeface);
        return new GAM(context2, 0oh.A03((Context) null, typeface, num2), drawable, spannableStringBuilder, userSession, i2, color);
    }

    public static final void A04(UserSession userSession, C2806752y r4, C2806852z r5, AnonymousClass4Ke r6) {
        0qQ.A0B(r6, 1);
        A00.A05(userSession, r5, r6);
        if (r4 != null) {
            AnonymousClass531 r3 = new AnonymousClass531(r4);
            View.OnTouchListener DSj = r4.DSj();
            ViewGroup viewGroup = r5.A01;
            View view = r5.A03;
            if (viewGroup != null) {
                AnonymousClass0fU.A00(r3, viewGroup);
                if (DSj != null) {
                    viewGroup.setOnTouchListener(DSj);
                }
                view = r5.A02;
                if (view == null) {
                    return;
                }
            } else if (view != null) {
                AnonymousClass0fU.A00(r3, view);
                if (DSj != null) {
                    view.setOnTouchListener(DSj);
                }
            } else {
                return;
            }
            2eS.A04(view, AnonymousClass05K.A01);
        }
    }

    public static final AnonymousClass4Ke A02(MusicOverlayStickerModel musicOverlayStickerModel) {
        String str = musicOverlayStickerModel.A0Y;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = musicOverlayStickerModel.A0m;
        if (str3 != null) {
            str2 = str3;
        }
        boolean z = false;
        if (musicOverlayStickerModel.A05 != null) {
            z = true;
        }
        return new AnonymousClass4Ke((C376489Ie) null, (C67061rp) null, str, str2, R.dimen.add_payment_bottom_sheet_row_subtitle_size, z, musicOverlayStickerModel.A0s, false, false, true, true, musicOverlayStickerModel.A0t, false, false);
    }

    public static final void A03(UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, C2806852z r4) {
        A00.A05(userSession, r4, A02(musicOverlayStickerModel));
    }

    private final void A05(UserSession userSession, C2806852z r15, AnonymousClass4Ke r16) {
        AnonymousClass0eM r0;
        TextView textView;
        ViewStub viewStub = r15.A09;
        if (viewStub != null && r15.A01 == null) {
            ImageView imageView = null;
            View inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            r15.A01 = viewGroup;
            if (viewGroup != null) {
                textView = (TextView) viewGroup.findViewById(R.id.music_attribution_label);
            } else {
                textView = null;
            }
            r15.A03 = textView;
            ViewGroup viewGroup2 = r15.A01;
            if (viewGroup2 != null) {
                imageView = (ImageView) viewGroup2.findViewById(R.id.music_attribution_label_marquee);
            }
            r15.A02 = imageView;
        }
        ViewGroup viewGroup3 = r15.A01;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        AnonymousClass4Ke r02 = r15.A05;
        AnonymousClass4Ke r11 = r16;
        r15.A05 = r11;
        if (!0qQ.A0K(r11, r02)) {
            Resources resources = r15.A08;
            SpannableStringBuilder A03 = AnonymousClass4Kf.A03(resources, (Drawable) r15.A0C.getValue(), (Drawable) r15.A0A.getValue(), userSession, r11, true);
            if (r15.A03 != null) {
                Context context = r15.A07;
                boolean z = r11.A0A;
                boolean z2 = r11.A06;
                if (z) {
                    r0 = r15.A0F;
                } else if (z2) {
                    r0 = r15.A0B;
                } else if (r15.A0G) {
                    r0 = r15.A0D;
                } else {
                    r0 = r15.A0E;
                }
                Drawable drawable = (Drawable) r0.getValue();
                r15.A00 = drawable;
                if (drawable != null) {
                    TextView textView2 = r15.A03;
                    if (textView2 != null) {
                        if (z) {
                            Context context2 = textView2.getContext();
                            0qQ.A07(context2);
                            AnonymousClass4Kf.A05(context2, drawable, A03, r11, R.dimen.music_attribution_trending_icon_size);
                        } else {
                            Drawable drawable2 = null;
                            if (r11.A0C) {
                                drawable2 = drawable;
                            }
                            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        if (r11.A0C) {
                            AnonymousClass4Kf.A06(context, drawable, r11);
                            textView2.setCompoundDrawablePadding(resources.getDimensionPixelSize(R.dimen.accent_edge_thickness));
                            textView2.setPaddingRelative(r15.A06 + textView2.getPaddingStart(), textView2.getPaddingTop(), textView2.getPaddingEnd(), textView2.getPaddingBottom());
                        }
                        textView2.setText(A03);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } else if (r15.A02 != null) {
                ViewGroup viewGroup4 = r15.A01;
                if (viewGroup4 != null) {
                    Context applicationContext = viewGroup4.getContext().getApplicationContext();
                    0qQ.A07(applicationContext);
                    GAM A01 = A01(applicationContext, A03, userSession, r11, AnonymousClass05K.A00);
                    A01.A00();
                    r15.A04 = A01;
                    ImageView imageView2 = r15.A02;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(A01);
                        ImageView imageView3 = r15.A02;
                        if (imageView3 != null) {
                            imageView3.setContentDescription(A03.toString());
                        }
                        Drawable drawable3 = r15.A00;
                        if (drawable3 instanceof AnonymousClass6KL) {
                            0qQ.A0C(drawable3, "null cannot be cast to non-null type com.instagram.music.common.ui.MusicSoundWaveDrawable");
                            AnonymousClass6KL r1 = (AnonymousClass6KL) drawable3;
                            r1.A05 = true;
                            r1.invalidateSelf();
                        }
                        ImageView imageView4 = r15.A02;
                        if (imageView4 != null) {
                            imageView4.addOnAttachStateChangeListener(new ALx(r15));
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final BitmapDrawable A06(Context context, Integer num) {
        int dimension = (int) context.getResources().getDimension(R.dimen.account_discovery_bottom_gap);
        Bitmap A002 = C62953Kp5.A00(A00(context, num, R.drawable.instagram_music_effects_pano_filled_24), dimension, dimension);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        return new BitmapDrawable(resources, A002);
    }
}
