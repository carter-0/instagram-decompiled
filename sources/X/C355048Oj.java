package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.ui.widget.colourwheel.ColourWheelView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Oj  reason: invalid class name and case insensitive filesystem */
public final class C355048Oj {
    public RecyclerView A00;
    public C355078Om A01;
    public C3499582p A02;
    public AnonymousClass9YE A03;
    public C351968Bd A04;
    public AnonymousClass80V A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public C3511387s A0B;
    public AnonymousClass80X A0C;
    public boolean A0D;
    public boolean A0E;
    public final Context A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final View A0N;
    public final ViewGroup A0O;
    public final ViewGroup A0P;
    public final ImageView A0Q;
    public final ImageView A0R;
    public final ImageView A0S;
    public final ImageView A0T;
    public final ImageView A0U;
    public final ImageView A0V;
    public final ImageView A0W;
    public final ImageView A0X;
    public final ImageView A0Y;
    public final ImageView A0Z;
    public final ImageView A0a;
    public final ProgressBar A0b;
    public final ProgressBar A0c;
    public final UserSession A0d;
    public final C252063oV A0e;
    public final C252063oV A0f;
    public final C252063oV A0g;
    public final C252063oV A0h;
    public final C252063oV A0i;
    public final C252063oV A0j;
    public final C252063oV A0k;
    public final C252063oV A0l;
    public final C252063oV A0m;
    public final C252063oV A0n;
    public final C252063oV A0o;
    public final C355028Oh A0p;
    public final C351978Be A0q;
    public final AnonymousClass8GE A0r;
    public final AnonymousClass846 A0s;
    public final AnonymousClass8B2 A0t;
    public final C355148Ov A0u;
    public final ColourWheelView A0v;
    public final WeakReference A0w;
    public final ArrayList A0x;
    public final AnonymousClass0eM A0y = AnonymousClass1YB.A00(new C377269Le(this, 39));
    public final AnonymousClass0eM A0z = AnonymousClass1YB.A00(new C377269Le(this, 40));
    public final AnonymousClass0eM A10 = AnonymousClass1YB.A00(new C377269Le(this, 41));
    public final AnonymousClass0eM A11 = AnonymousClass1YB.A00(new C377269Le(this, 42));
    public final AnonymousClass0eM A12 = AnonymousClass1YB.A00(new C377269Le(this, 43));
    public final AnonymousClass0eM A13 = AnonymousClass1YB.A00(new C377269Le(this, 44));
    public final AnonymousClass0eM A14;
    public final AnonymousClass0eM A15;
    public final boolean A16;
    public final boolean A17;
    public final View.OnTouchListener A18;
    public final C3503284f A19;
    public final C357638Yz A1A;
    public final AnonymousClass88B A1B;
    public final AnonymousClass0eM A1C;
    public final boolean A1D;

    public static final Drawable A00(C355048Oj r13) {
        ImageUrl imageUrl;
        MusicOverlayStickerModel A0R2 = r13.A0p.A00.A0R();
        if (!(A0R2 == null || (imageUrl = A0R2.A03) == null)) {
            if (182.A06(0Tu.A05, r13.A0d, 36326030230828507L)) {
                Context context = r13.A0F;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                GIH gih = new GIH(context, (GJO) null, dimensionPixelSize, dimensionPixelSize / 2, context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), context.getColor(R.color.canvas_bottom_sheet_description_text_color), 1, -1, false);
                gih.A04(imageUrl);
                return gih;
            }
        }
        return r13.A0F.getDrawable(R.drawable.instagram_music_pano_outline_24);
    }

    public static final List A01(C355048Oj r9) {
        Boolean A002;
        UserSession userSession = r9.A0d;
        0Tu r7 = 0Tu.A05;
        if (!182.A06(r7, userSession, 2342162927708282615L)) {
            return 0sn.A00;
        }
        List A1P = 0sr.A1P(new C362088hK[]{C362088hK.A0B, C362088hK.A09});
        ArrayList arrayList = new ArrayList();
        for (Object next : A1P) {
            C362088hK r0 = (C362088hK) next;
            0qQ.A0B(r0, 1);
            int ordinal = r0.ordinal();
            if (ordinal == 0) {
                A002 = C364778lz.A00(userSession);
            } else if (ordinal == 1) {
                A002 = C364768ly.A00(userSession);
            } else if (ordinal == 2) {
                A002 = Boolean.valueOf(182.A06(r7, userSession, 36329504859242656L));
            } else {
                throw new RuntimeException();
            }
            if (A002.booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final void A02(View view, C355048Oj r4) {
        ImageView imageView = r4.A0R;
        if (imageView.getVisibility() == 0) {
            C355098Oo.A05(new View[]{imageView}, false);
        }
        27p.A01(r4.A0d).A01.A00();
        r4.A0q.A02();
        if (r4.A16) {
            view.performClick();
        }
    }

    public static final void A03(C355048Oj r20) {
        C355048Oj r4 = r20;
        C252063oV r1 = r4.A0i;
        if (r1.CVM()) {
            C355098Oo.A05(new View[]{r1.getView()}, false);
        }
        ArrayList arrayList = r4.A0x;
        Context context = r4.A0F;
        String string = context.getString(2131961541);
        0qQ.A07(string);
        boolean booleanValue = C306096Kt.A00(r4.A0d).booleanValue();
        int i = R.drawable.instagram_sparkles_pano_outline_24;
        if (booleanValue) {
            i = R.drawable.instagram_effects_pano_outline_24;
        }
        arrayList.add(new C367618rI((Drawable) null, context.getDrawable(i), (C15048ULb) null, new C369938vZ(r4), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A04(C355048Oj r19) {
        C355048Oj r3 = r19;
        C252063oV r1 = r3.A0g;
        if (r1.CVM()) {
            C355098Oo.A05(new View[]{r1.getView()}, false);
        }
        ArrayList arrayList = r3.A0x;
        Context context = r3.A0F;
        String string = context.getString(2131954768);
        0qQ.A07(string);
        arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_closed_captions_enabled_pano_outline_24), (C15048ULb) null, new C40531Ade(r3), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A05(C355048Oj r19) {
        C355048Oj r3 = r19;
        C355098Oo.A05(new View[]{r3.A0I}, false);
        ArrayList arrayList = r3.A0x;
        Context context = r3.A0F;
        String string = context.getString(2131961052);
        0qQ.A07(string);
        arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_draw_pano_outline_24), (C15048ULb) null, new C366938pv(r3), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r4 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C355048Oj r29) {
        /*
            r3 = r29
            X.82p r0 = r3.A02
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.8Cl r2 = r0.A03()
            r12 = 0
            if (r2 == 0) goto L_0x0099
            java.lang.String r0 = r2.A0l
            java.lang.String r4 = r2.A0m
            boolean r1 = r2.A0E()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            if (r4 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x0099
            if (r0 == 0) goto L_0x0099
            com.instagram.common.session.UserSession r5 = r3.A0d
            X.0Tu r4 = X.0Tu.A05
            r0 = 36327258594162995(0x810f73002b3933, double:3.0368428408533817E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0099
            java.util.ArrayList r1 = r3.A0x
            android.content.Context r4 = r3.A0F
            r0 = 2131963123(0x7f132cf3, float:1.956299E38)
            java.lang.String r11 = r4.getString(r0)
            X.0qQ.A07(r11)
            r0 = 2131238916(0x7f082004, float:1.8094124E38)
            android.graphics.drawable.Drawable r7 = r4.getDrawable(r0)
            X.Adq r9 = new X.Adq
            r9.<init>(r3, r2)
            r6 = 0
            r16 = 1
            r23 = 1
            X.8rI r5 = new X.8rI
            r8 = r6
            r10 = r6
            r13 = r12
            r14 = r12
            r15 = r12
            r17 = r12
            r18 = r16
            r19 = r12
            r20 = r12
            r21 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.add(r5)
            r0 = 2131953593(0x7f1307b9, float:1.9543661E38)
            java.lang.String r19 = r4.getString(r0)
            X.0qQ.A07(r19)
            r0 = 2131238912(0x7f082000, float:1.8094116E38)
            android.graphics.drawable.Drawable r15 = r4.getDrawable(r0)
            X.Adr r0 = new X.Adr
            r0.<init>(r3, r2)
            X.8rI r13 = new X.8rI
            r14 = r6
            r16 = r6
            r17 = r0
            r18 = r6
            r22 = r12
            r24 = r12
            r25 = r12
            r26 = r23
            r27 = r12
            r28 = r12
            r29 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.add(r13)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355048Oj.A06(X.8Oj):void");
    }

    public static final void A07(C355048Oj r19) {
        C355048Oj r3 = r19;
        ArrayList arrayList = r3.A0x;
        Context context = r3.A0F;
        String string = context.getString(2131964565);
        0qQ.A07(string);
        arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_third_party_gen_ai_pano_outline_24), (C15048ULb) null, new C366958px(r3), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A08(C355048Oj r19) {
        C355048Oj r3 = r19;
        C355098Oo.A05(new View[]{r3.A0M}, false);
        ArrayList arrayList = r3.A0x;
        Context context = r3.A0F;
        String string = context.getString(2131972502);
        0qQ.A07(string);
        arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_download_pano_outline_24), (C15048ULb) null, new C366948pw(r3), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A09(C355048Oj r19) {
        C355048Oj r3 = r19;
        C355098Oo.A05(new View[]{r3.A0m.getView()}, false);
        ArrayList arrayList = r3.A0x;
        Context context = r3.A0F;
        String string = context.getString(2131974089);
        0qQ.A07(string);
        arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_add_users_pano_outline_24), (C15048ULb) null, new C40534Adh(r3), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A0A(C355048Oj r19) {
        C355048Oj r3 = r19;
        UserSession userSession = r3.A0d;
        if (!1Au.A00(userSession).A01.getBoolean("has_story_comments_global_setting_disabled", false) && r3.A0A && 182.A06(0Tu.A05, userSession, 36318247749949468L)) {
            ArrayList arrayList = r3.A0x;
            Context context = r3.A0F;
            String string = context.getString(2131975569);
            0qQ.A07(string);
            arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_comments_off_pano_outline_24), (C15048ULb) null, new C366968py(r3), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
        }
    }

    public static final void A0B(C355048Oj r19) {
        C355048Oj r3 = r19;
        UserSession userSession = r3.A0d;
        if (!1Au.A00(userSession).A01.getBoolean("has_story_comments_global_setting_disabled", false) && !r3.A0A && 182.A06(0Tu.A05, userSession, 36318247749949468L)) {
            ArrayList arrayList = r3.A0x;
            Context context = r3.A0F;
            String string = context.getString(2131975592);
            0qQ.A07(string);
            arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_comment_pano_outline_24), (C15048ULb) null, new C40535Adi(r3), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
        }
    }

    public static final void A0C(C355048Oj r19) {
        C355048Oj r3 = r19;
        C252063oV r1 = r3.A0n;
        if (r1.CVM()) {
            C355098Oo.A05(new View[]{r1.getView()}, false);
        }
        ArrayList arrayList = r3.A0x;
        Context context = r3.A0F;
        String string = context.getString(2131976720);
        0qQ.A07(string);
        arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_microphone_pano_outline_24), (C15048ULb) null, new C40536Adj(r3), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A0D(C355048Oj r19) {
        C355048Oj r3 = r19;
        C252063oV r1 = r3.A0o;
        if (r1.CVM()) {
            C355098Oo.A05(new View[]{r1.getView()}, false);
        }
        ArrayList arrayList = r3.A0x;
        Context context = r3.A0F;
        String string = context.getString(2131976722);
        0qQ.A07(string);
        arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_sliders_pano_outline_24), (C15048ULb) null, new C40537Adk(r3), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A0E(C355048Oj r4) {
        C349317zw A002;
        if (r4.A02.A01 == 28D.A5G) {
            AnonymousClass846 r2 = r4.A0s;
            C349317zw A003 = r2.A00();
            if ((A003 == null || !A003.A01) && (A002 = r2.A00()) != null) {
                A002.A01(r4.A0N(), r4.A0r.A03, C366978pz.A0G);
            }
        }
    }

    public static final void A0F(C355048Oj r4) {
        C349317zw A002;
        AnonymousClass846 r2 = r4.A0s;
        C349317zw A003 = r2.A00();
        if (A003 == null || !A003.A01) {
            View view = r4.A0J;
            if (view.getVisibility() == 0 && (A002 = r2.A00()) != null) {
                A002.A01(r4.A0N(), view, C366978pz.A0a);
            }
        }
    }

    public static final void A0G(C355048Oj r4) {
        C349317zw A002;
        if (r4.A0p.A00() instanceof AnonymousClass80O) {
            AnonymousClass846 r2 = r4.A0s;
            C349317zw A003 = r2.A00();
            if (A003 == null || !A003.A01) {
                View view = r4.A0G;
                if (view.getVisibility() == 0 && (A002 = r2.A00()) != null) {
                    A002.A01(r4.A0N(), view, C366978pz.A0n);
                }
            }
        }
    }

    public static final void A0H(C355048Oj r8) {
        27p.A01(r8.A0d).A03.A07("clips_post_cap_audio_button");
        AnonymousClass8BA r3 = r8.A0q.A00;
        27p.A01(r3.A0v).A1Q(C59725JVj.POST_CAPTURE, "AUDIO_CONTROLS_ADD_MUSIC");
        r3.A1R.A03(C3515589i.POST_CAPTURE_AUDIO_BUTTON, (AudioOverlayTrack) null, (String) null, (0eP) null, false, false, false, false);
    }

    public static final void A0I(C355048Oj r8) {
        r8.A0u.A02(r8.A0x);
        if (!r8.A07) {
            r8.A07 = true;
            ImageView imageView = r8.A0V;
            imageView.setImageResource(R.drawable.instagram_chevron_left_pano_outline_rtl_24);
            Context context = r8.A0F;
            imageView.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
            View view = r8.A0I;
            0qQ.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) view;
            imageView2.setImageResource(R.drawable.instagram_draw_pano_outline_24);
            imageView2.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
            View view2 = r8.A0M;
            0qQ.A0C(view2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView3 = (ImageView) view2;
            imageView3.setImageResource(R.drawable.instagram_download_pano_outline_24);
            imageView3.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            View view3 = r8.A0K;
            0qQ.A0C(view3, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView4 = (ImageView) view3;
            imageView4.setImageResource(R.drawable.instagram_fit_pano_outline_24);
            imageView4.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
            imageView4.setScaleType(scaleType);
            ImageView imageView5 = r8.A0a;
            if (imageView5 != null) {
                imageView5.setImageResource(R.drawable.instagram_text_pano_outline_24);
                imageView5.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
            }
            ImageView imageView6 = r8.A0Q;
            if (imageView6 != null) {
                imageView6.setImageResource(R.drawable.instagram_sticker_pano_outline_24);
                imageView6.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
            }
            C252063oV r1 = r8.A0k;
            if (r1.CVM()) {
                View view4 = r1.getView();
                0qQ.A0C(view4, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView7 = (ImageView) view4;
                imageView7.setImageResource(R.drawable.instagram_layout_pano_outline_24);
                imageView7.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
            }
            r8.A0Z.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
            r8.A0j.EeU(new C366998q1(r8));
        }
        Context context2 = r8.A0F;
        ViewGroup viewGroup = r8.A0O;
        0qQ.A0B(viewGroup, 1);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setSize(context2.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), context2.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_secondary_button_on_media_panavision_updated)));
                gradientDrawable.setCornerRadius(0nA.A04(context2, 30));
                childAt.setBackground(gradientDrawable);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r2.A02().A09 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0J(X.C355048Oj r12) {
        /*
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x00fb
            X.80X r1 = r12.A0C
            X.80V r0 = r12.A05
            boolean r0 = X.C355098Oo.A08(r0, r1)
            if (r0 != 0) goto L_0x00fa
            X.8Oh r0 = r12.A0p
            X.4yO r0 = r0.A00()
            boolean r0 = r0 instanceof X.AnonymousClass80O
            r11 = 0
            if (r0 == 0) goto L_0x0020
            androidx.recyclerview.widget.RecyclerView r0 = r12.A00
            if (r0 == 0) goto L_0x0020
            r0.setVisibility(r11)
        L_0x0020:
            android.view.ViewGroup r0 = r12.A0O
            r0.setVisibility(r11)
            android.view.ViewGroup r0 = r12.A0P
            r0.setVisibility(r11)
            X.8Be r1 = r12.A0q
            android.view.View r7 = r12.A0G
            X.8BA r4 = r1.A00
            r4.A03 = r7
            boolean r0 = r4.A0Z
            if (r0 != 0) goto L_0x0050
            X.80U r0 = r4.A1M
            boolean r0 = r0.CZU()
            if (r0 == 0) goto L_0x0069
            X.82o r0 = r4.A14
            X.82Y r2 = r0.A01
            X.802 r0 = r2.A02()
            if (r0 == 0) goto L_0x0069
            X.802 r0 = r2.A02()
            java.lang.String r0 = r0.A09
            if (r0 == 0) goto L_0x0069
        L_0x0050:
            X.846 r0 = r4.A1X
            X.7zw r5 = r0.A00()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r4.A1s
            X.8pz r8 = X.C366978pz.A14
            boolean r12 = r4.A0Z
            java.lang.String r10 = r4.A0W
            r9 = 0
            X.0qQ.A0B(r6, r11)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r5.A02(r6, r7, r8, r9, r10, r11, r12)
        L_0x0069:
            r4.A0Z = r11
            X.8Yz r0 = r4.A0w
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r6 = r0 instanceof X.AnonymousClass80O
            if (r6 != 0) goto L_0x007b
            boolean r0 = X.AnonymousClass8BA.A0K(r4)
            if (r0 == 0) goto L_0x00ba
        L_0x007b:
            X.846 r5 = r4.A1X
            X.7zw r2 = r5.A00()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r4.A1s
            X.8pz r0 = X.C366978pz.A0z
            r2.A01(r3, r7, r0)
            if (r6 == 0) goto L_0x00ba
            X.7zw r2 = r5.A00()
            X.8pz r0 = X.C366978pz.A0x
            r2.A01(r3, r7, r0)
            X.7zw r2 = r5.A00()
            X.8pz r0 = X.C366978pz.A0u
            r2.A01(r3, r7, r0)
            X.7zw r2 = r5.A00()
            X.8pz r0 = X.C366978pz.A0e
            r2.A01(r3, r7, r0)
            boolean r0 = r4.A0g
            if (r0 == 0) goto L_0x00ba
            X.7zw r0 = r5.A00()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x00ba
            X.7zw r2 = r5.A00()
            X.8pz r0 = X.C366978pz.A0T
            r2.A01(r3, r7, r0)
        L_0x00ba:
            java.lang.String r2 = r4.A0X
            java.lang.String r0 = "product_item_sticker_id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00d7
            X.846 r0 = r4.A1X
            X.7zw r3 = r0.A00()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r4.A1s
            X.8pz r0 = X.C366978pz.A0t
            boolean r0 = r3.A01(r2, r7, r0)
            if (r0 == 0) goto L_0x00d7
            X.AnonymousClass8BA.A0G(r4, r11, r11)
        L_0x00d7:
            java.lang.Runnable r0 = r4.A0U
            if (r0 == 0) goto L_0x00e1
            r0.run()
            r0 = 0
            r4.A0U = r0
        L_0x00e1:
            boolean r0 = X.AnonymousClass8BA.A0K(r4)
            if (r0 == 0) goto L_0x00fa
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r0)
            X.8qG r2 = new X.8qG
            r2.<init>(r7, r1)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x00fa:
            return
        L_0x00fb:
            androidx.recyclerview.widget.RecyclerView r0 = r12.A00
            r1 = 8
            if (r0 == 0) goto L_0x0104
            r0.setVisibility(r1)
        L_0x0104:
            android.view.ViewGroup r0 = r12.A0O
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r12.A0P
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355048Oj.A0J(X.8Oj):void");
    }

    public static final void A0K(C355048Oj r5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new AnonymousClass9IQ(C62636KjH.A0R));
        }
        if (z2) {
            arrayList.add(new AnonymousClass9IQ(C62636KjH.A0I));
        }
        if (z3) {
            arrayList.add(new AnonymousClass9IQ(C62636KjH.A06));
        }
        if (z4) {
            arrayList.add(new AnonymousClass9IQ(C62636KjH.A05));
        }
        if (z5) {
            arrayList.add(new AnonymousClass9IQ(C62636KjH.A08));
        }
        if (z7) {
            arrayList.add(new AnonymousClass9IQ(C62636KjH.A0f));
        }
        if (z8) {
            arrayList.add(new AnonymousClass9IQ(C62636KjH.A03));
        }
        if (z9) {
            arrayList.add(new AnonymousClass9IQ(C62636KjH.A0F));
        }
        if (z10) {
            arrayList.add(new AnonymousClass9IQ(C62636KjH.A0h));
        }
        if (z6) {
            UserSession userSession = r5.A0d;
            0Tu r3 = 0Tu.A06;
            if (!182.A06(r3, userSession, 36327327310887248L) && !182.A06(r3, userSession, 36327327310952785L)) {
                arrayList.add(new AnonymousClass9IQ(C62636KjH.A0W));
            }
        }
        C355078Om r0 = r5.A01;
        if (r0 != null) {
            r0.notifyDataSetChanged();
            r0.A00 = arrayList;
        }
    }

    public static final boolean A0L(C355048Oj r1) {
        C353508Hx r0;
        C357638Yz r02 = r1.A1A;
        if (r02 == null || !(r02.A08.A00 instanceof AnonymousClass80O) || (((r0 = r1.A0p.A00.A0E) != null && r0.CTi()) || r1.A02.A02.A0C())) {
            return false;
        }
        return true;
    }

    public static final View[] A0M(C355048Oj r42) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        View[] viewArr = new View[29];
        C355048Oj r6 = r42;
        ImageView imageView = r6.A0V;
        ImageView imageView2 = r6.A0U;
        C252063oV r2 = r6.A0m;
        View view10 = null;
        if (r2.CVM()) {
            view = r2.getView();
        } else {
            view = null;
        }
        C252063oV r22 = r6.A0l;
        if (r22.CVM()) {
            view2 = r22.getView();
        } else {
            view2 = null;
        }
        C252063oV r23 = r6.A0g;
        if (r23.CVM()) {
            view3 = r23.getView();
        } else {
            view3 = null;
        }
        C252063oV r24 = r6.A0n;
        if (r24.CVM()) {
            view4 = r24.getView();
        } else {
            view4 = null;
        }
        C252063oV r25 = r6.A0o;
        if (r25.CVM()) {
            view5 = r25.getView();
        } else {
            view5 = null;
        }
        C252063oV r26 = r6.A0i;
        if (r26.CVM()) {
            view6 = r26.getView();
        } else {
            view6 = null;
        }
        ImageView imageView3 = r6.A0S;
        ImageView imageView4 = r6.A0p.A00.A1D.A00;
        C252063oV r27 = r6.A0f;
        if (r27.CVM()) {
            view7 = r27.getView();
        } else {
            view7 = null;
        }
        C252063oV r28 = r6.A0k;
        if (r28.CVM()) {
            view8 = r28.getView();
        } else {
            view8 = null;
        }
        AnonymousClass8B2 r0 = r6.A0t;
        if (r0 == null || !r0.A03) {
            view9 = r6.A0K;
        } else {
            view9 = null;
        }
        C252063oV r1 = r6.A0j;
        if (r1.CVM()) {
            view10 = r1.getView();
        }
        System.arraycopy(new View[]{imageView, imageView2, view, view2, view3, view4, view5, view6, imageView3, imageView4, view7, view8, view9, view10, (View) r6.A0y.getValue(), r6.A0M, r6.A0Q, r6.A0W, r6.A0T, r6.A0Y, (View) r6.A10.getValue(), (View) r6.A0z.getValue(), (View) r6.A12.getValue(), r6.A0X, r6.A0I, r6.A0a, r6.A0Z}, 0, viewArr, 0, 27);
        System.arraycopy(new View[]{r6.A0J, r6.A0r.A03}, 0, viewArr, 27, 2);
        return viewArr;
    }

    public final View A0N() {
        Object value = this.A1C.getValue();
        0qQ.A07(value);
        return (View) value;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r8 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P(boolean r8) {
        /*
            r7 = this;
            r7.A0D = r8
            X.9YE r6 = r7.A03
            if (r6 == 0) goto L_0x0026
            X.05G r5 = r6.A0M
        L_0x0008:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.9PK r3 = (X.AnonymousClass9PK) r3
            r2 = 0
            boolean r0 = X.AnonymousClass9YE.A09(r6)
            if (r0 == 0) goto L_0x0019
            r1 = 1
            if (r8 != 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r0 = 1019(0x3fb, float:1.428E-42)
            X.9PK r0 = X.AnonymousClass9PK.A00(r3, r2, (X.AnonymousClass80X) null, (java.lang.Integer) null, (java.lang.Integer) null, r2, r0, r1, false, false, false, false)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0008
        L_0x0026:
            A0J(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355048Oj.A0P(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0d, 36327340195723608L) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r4.A0L.Epw(java.lang.Boolean.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0d, 36327340195854682L) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0d, 36327340195789145L) == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q(boolean r7) {
        /*
            r6 = this;
            X.9YE r4 = r6.A03
            if (r4 == 0) goto L_0x005d
            X.8Oh r5 = r6.A0p
            X.4yO r1 = r5.A00()
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0021
            com.instagram.common.session.UserSession r3 = r6.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327340195854682(0x810f860002395a, double:3.036894446091788E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0053
        L_0x0021:
            X.4yO r0 = r5.A00()
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r3 = r6.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327340195789145(0x810f8600013959, double:3.036894446050342E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0053
        L_0x0038:
            X.4yO r1 = r5.A00()
            X.80M r0 = X.AnonymousClass80M.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005d
            com.instagram.common.session.UserSession r3 = r6.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327340195723608(0x810f8600003958, double:3.0368944460088964E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x005d
        L_0x0053:
            X.05G r1 = r4.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.Epw(r0)
        L_0x005c:
            return
        L_0x005d:
            if (r7 == 0) goto L_0x005c
            android.view.View[] r2 = A0M(r6)
            android.view.View r1 = r6.A0L
            r5 = 0
            android.view.View r0 = r6.A0G
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            java.lang.Object[] r4 = X.0Yw.A0a(r2, r0)
            android.view.View[] r4 = (android.view.View[]) r4
            int r3 = r4.length
            r2 = 0
        L_0x0074:
            if (r2 >= r3) goto L_0x005c
            r1 = r4[r2]
            android.widget.ImageView r0 = r6.A0X
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x009f
            android.widget.ImageView r0 = r6.A0V
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x009f
            android.view.View r0 = r6.A0K
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x009f
            android.widget.ImageView r0 = r6.A0Q
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x009f
            android.view.View[] r0 = new android.view.View[]{r1}
            X.C355098Oo.A05(r0, r5)
        L_0x009f:
            int r2 = r2 + 1
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355048Oj.A0Q(boolean):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.07Z, androidx.fragment.app.Fragment] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0170: MOVE  (r0v247 com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout) = 
          (r13v1 com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public C355048Oj(android.app.Activity r27, android.content.Context r28, android.view.View r29, android.view.ViewStub r30, X.AnonymousClass4DH r31, X.C3503284f r32, com.instagram.common.session.UserSession r33, X.C357638Yz r34, X.C355028Oh r35, X.C351978Be r36, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r37, X.C3499582p r38, X.AnonymousClass846 r39, X.AnonymousClass8B2 r40, X.AnonymousClass88B r41, int r42, boolean r43, boolean r44, boolean r45) {
        /*
            r26 = this;
            r6 = 1
            r0 = 6
            r1 = r35
            X.0qQ.A0B(r1, r0)
            r3 = r26
            r3.<init>()
            r8 = r28
            r3.A0F = r8
            r5 = r33
            r3.A0d = r5
            r3.A0p = r1
            r4 = r36
            r3.A0q = r4
            r0 = r32
            r3.A19 = r0
            r0 = r38
            r3.A02 = r0
            r0 = r39
            r3.A0s = r0
            r0 = r34
            r3.A1A = r0
            r0 = r41
            r3.A1B = r0
            r0 = r43
            r3.A17 = r0
            r11 = r44
            r3.A16 = r11
            r0 = r45
            r3.A1D = r0
            r0 = r40
            r3.A0t = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = r27
            r0.<init>(r1)
            r3.A0w = r0
            r1 = 45
            X.9Le r0 = new X.9Le
            r7 = r37
            r0.<init>(r7, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A14 = r0
            r1 = 14
            X.9Lu r0 = new X.9Lu
            r2 = r30
            r10 = r29
            r0.<init>(r1, r10, r2)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A1C = r0
            r1 = 39
            X.9Le r0 = new X.9Le
            r0.<init>(r3, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A0y = r0
            r1 = 41
            X.9Le r0 = new X.9Le
            r0.<init>(r3, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A10 = r0
            r1 = 42
            X.9Le r0 = new X.9Le
            r0.<init>(r3, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A11 = r0
            r1 = 40
            X.9Le r0 = new X.9Le
            r0.<init>(r3, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A0z = r0
            r1 = 43
            X.9Le r0 = new X.9Le
            r0.<init>(r3, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A12 = r0
            r3.A0A = r6
            r1 = 44
            X.9Le r0 = new X.9Le
            r0.<init>(r3, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A13 = r0
            X.8Ok r2 = new X.8Ok
            r2.<init>(r3)
            r3.A18 = r2
            r1 = 46
            X.9Le r0 = new X.9Le
            r0.<init>(r3, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A15 = r0
            r9 = 0
            if (r29 == 0) goto L_0x00d5
            android.view.View r0 = r3.A0N()
            r0.setVisibility(r9)
        L_0x00d5:
            if (r44 != 0) goto L_0x0153
            X.0eM r0 = r3.A15
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0153
            android.view.View r1 = r3.A0N()
            r0 = 2131437975(0x7f0b2997, float:1.8497864E38)
            android.view.View r1 = r1.requireViewById(r0)
            X.0qQ.A07(r1)
            r10 = r7
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r10 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r10
            X.81W r0 = r10.A0K
            int r0 = r0.getHeight()
            X.0nA.A0V(r1, r0)
            r1.setVisibility(r9)
            android.view.View r1 = r3.A0N()
            r0 = 2131430983(0x7f0b0e47, float:1.8483682E38)
            android.view.View r0 = r1.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r3.A00 = r0
            int r12 = r10.A06
            android.view.View r0 = r3.A0N()
            android.content.Context r10 = r0.getContext()
            X.0qQ.A07(r10)
            X.8Ol r1 = new X.8Ol
            r1.<init>(r3)
            X.8Om r0 = new X.8Om
            r0.<init>(r10, r5, r1, r12)
            r3.A01 = r0
            androidx.recyclerview.widget.RecyclerView r10 = r3.A00
            if (r10 == 0) goto L_0x013e
            android.view.View r0 = r3.A0N()
            android.content.Context r1 = r0.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r1, r9, r9)
            r10.setLayoutManager(r0)
        L_0x013e:
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            if (r1 == 0) goto L_0x0147
            X.8Om r0 = r3.A01
            r1.setAdapter(r0)
        L_0x0147:
            X.8On r1 = new X.8On
            r1.<init>(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            if (r0 == 0) goto L_0x0153
            r0.A11(r1)
        L_0x0153:
            android.view.View r0 = r3.A0N()
            r1 = r42
            X.C355098Oo.A00(r0, r1)
            android.view.View r1 = r3.A0N()
            r0 = 2131432173(0x7f0b12ed, float:1.8486096E38)
            android.view.View r13 = r1.requireViewById(r0)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r3.A0O = r13
            boolean r0 = r13 instanceof com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout
            if (r0 == 0) goto L_0x0177
            r0 = r13
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout) r0
            if (r0 == 0) goto L_0x0177
            r0.CNi(r2)
        L_0x0177:
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r12, r0)
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            r10 = 2131165218(0x7f070022, float:1.7944647E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r8.getResources()
            int r1 = r0.getDimensionPixelSize(r10)
            android.content.res.Resources r0 = r8.getResources()
            int r0 = r0.getDimensionPixelSize(r10)
            r12.setMargins(r2, r1, r0, r9)
            r13.setLayoutParams(r12)
            android.view.View r1 = r3.A0N()
            r0 = 2131437940(0x7f0b2974, float:1.8497793E38)
            android.view.View r2 = r1.requireViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3.A0P = r2
            android.view.View r1 = r3.A0N()
            r0 = 2131428162(0x7f0b0342, float:1.847796E38)
            android.view.View r10 = r1.requireViewById(r0)
            r3.A0G = r10
            android.view.View r1 = r3.A0N()
            if (r44 == 0) goto L_0x04b4
            r0 = 2131432746(0x7f0b152a, float:1.8487258E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0Q = r0
            r0 = 8
            r10.setVisibility(r0)
        L_0x01d8:
            android.view.View r1 = r3.A0N()
            r0 = 2131437943(0x7f0b2977, float:1.8497799E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r3.A0b = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131443638(0x7f0b3fb6, float:1.850935E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0R = r0
            X.8BA r10 = r4.A00
            X.6if r12 = r10.A1g
            r4 = r31
            if (r12 == 0) goto L_0x0230
            java.lang.Object r0 = r12.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            X.8Nu r0 = r0.A0v
            X.2Fk r11 = r0.A01
            r0 = 18
            X.9Ks r1 = new X.9Ks
            r1.<init>(r3, r0)
            X.8Oq r0 = new X.8Oq
            r0.<init>(r1)
            r11.A06(r4, r0)
            java.lang.Object r0 = r12.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            X.8Nu r0 = r0.A0v
            X.2Fk r11 = r0.A02
            r0 = 19
            X.9Ks r1 = new X.9Ks
            r1.<init>(r3, r0)
            X.8Oq r0 = new X.8Oq
            r0.<init>(r1)
            r11.A06(r4, r0)
        L_0x0230:
            android.view.View r1 = r3.A0N()
            r0 = 2131433479(0x7f0b1807, float:1.8488745E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0W = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131427752(0x7f0b01a8, float:1.847713E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0a = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131439802(0x7f0b30ba, float:1.850157E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0Z = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131432066(0x7f0b1282, float:1.8485879E38)
            android.view.View r0 = r1.requireViewById(r0)
            r3.A0I = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            android.view.View r0 = r1.requireViewById(r0)
            r3.A0H = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131443370(0x7f0b3eaa, float:1.8508806E38)
            android.view.View r0 = r1.requireViewById(r0)
            r3.A0N = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131429534(0x7f0b089e, float:1.8480743E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0V = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131429418(0x7f0b082a, float:1.8480508E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0U = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131443713(0x7f0b4001, float:1.8509502E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0S = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131428279(0x7f0b03b7, float:1.8478198E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0T = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131436643(0x7f0b2463, float:1.8495162E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0Y = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131434609(0x7f0b1c71, float:1.8491037E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0X = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131428536(0x7f0b04b8, float:1.847872E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0e = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131437947(0x7f0b297b, float:1.8497807E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0g = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131437986(0x7f0b29a2, float:1.8497886E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0n = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131437987(0x7f0b29a3, float:1.8497888E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0o = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131437955(0x7f0b2983, float:1.8497823E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0h = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131437965(0x7f0b298d, float:1.8497844E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0i = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131440621(0x7f0b33ed, float:1.850323E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            r3.A0M = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131437972(0x7f0b2994, float:1.8497858E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            r3.A0L = r1
            r0 = 2131437945(0x7f0b2979, float:1.8497803E38)
            android.view.View r0 = r1.requireViewById(r0)
            r3.A0K = r0
            r0 = 2131437946(0x7f0b297a, float:1.8497805E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r3.A0c = r0
            X.8Bc r11 = r10.A1H
            X.2Fk r10 = r11.A00
            r0 = 20
            X.9Ks r1 = new X.9Ks
            r1.<init>(r3, r0)
            X.8Oq r0 = new X.8Oq
            r0.<init>(r1)
            r10.A06(r4, r0)
            X.2Fk r10 = r11.A01
            r0 = 21
            X.9Ks r1 = new X.9Ks
            r1.<init>(r3, r0)
            X.8Oq r0 = new X.8Oq
            r0.<init>(r1)
            r10.A06(r4, r0)
            android.view.View r1 = r3.A0N()
            r0 = 2131437971(0x7f0b2993, float:1.8497856E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0j = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131437937(0x7f0b2971, float:1.8497787E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0f = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131437970(0x7f0b2992, float:1.8497854E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0k = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131430453(0x7f0b0c35, float:1.8482607E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r12 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.colourwheel.ColourWheelView"
            X.0qQ.A0C(r12, r0)
            com.instagram.ui.widget.colourwheel.ColourWheelView r12 = (com.instagram.ui.widget.colourwheel.ColourWheelView) r12
            r3.A0v = r12
            android.view.View r1 = r3.A0N()
            r0 = 2131441865(0x7f0b38c9, float:1.8505754E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0l = r0
            android.view.View r1 = r3.A0N()
            r0 = 2131441849(0x7f0b38b9, float:1.8505721E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r9, r9)
            r3.A0m = r0
            r0 = 2131430442(0x7f0b0c2a, float:1.8482585E38)
            android.view.View r11 = r12.requireViewById(r0)
            X.0qQ.A07(r11)
            r0 = 26
            float r10 = X.0nA.A04(r8, r0)
            r0 = 2
            float r9 = X.0nA.A04(r8, r0)
            float r1 = X.0nA.A04(r8, r6)
            X.8GE r0 = new X.8GE
            r0.<init>(r11, r10, r9, r1)
            r3.A0r = r0
            float r0 = r0.A00
            r12.setColourWheelStrokeWidth(r0)
            android.view.View r1 = r3.A0N()
            r0 = 2131437393(0x7f0b2751, float:1.8496683E38)
            android.view.View r0 = r1.requireViewById(r0)
            r3.A0J = r0
            r0 = 2131239407(0x7f0821ef, float:1.809512E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.8Ov r0 = new X.8Ov
            r0.<init>(r8, r5, r1, r6)
            r3.A0u = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.A0x = r0
            android.view.View r0 = r3.A0H
            r25 = r0
            android.view.View r15 = r3.A0N
            android.view.View r14 = r3.A0K
            android.widget.ImageView r13 = r3.A0Y
            X.0eM r0 = r3.A10
            java.lang.Object r12 = r0.getValue()
            android.view.View r12 = (android.view.View) r12
            X.0eM r0 = r3.A0z
            java.lang.Object r11 = r0.getValue()
            android.view.View r11 = (android.view.View) r11
            X.0eM r0 = r3.A12
            java.lang.Object r10 = r0.getValue()
            android.view.View r10 = (android.view.View) r10
            android.widget.ImageView r9 = r3.A0X
            android.view.View r8 = r3.A0M
            android.view.View r1 = r3.A0I
            android.view.View r0 = r3.A0J
            r24 = r0
            r23 = r1
            r22 = r8
            r21 = r9
            r20 = r10
            r19 = r11
            r18 = r12
            r17 = r13
            r16 = r14
            r14 = r25
            android.view.View[] r0 = new android.view.View[]{r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x04a2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04c1
            java.lang.Object r1 = r8.next()
            android.view.View r1 = (android.view.View) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r1, r0)
            goto L_0x04a2
        L_0x04b4:
            r0 = 2131428161(0x7f0b0341, float:1.8477959E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A0Q = r0
            goto L_0x01d8
        L_0x04c1:
            X.3oV r1 = r3.A0f
            X.8Ow r0 = new X.8Ow
            r0.<init>(r3)
            r1.EeU(r0)
            X.3oV r1 = r3.A0k
            X.8Ox r0 = new X.8Ox
            r0.<init>(r3)
            r1.EeU(r0)
            X.3oV r1 = r3.A0l
            X.8Oy r0 = new X.8Oy
            r0.<init>(r3)
            r1.EeU(r0)
            X.3oV r1 = r3.A0m
            X.8Oz r0 = new X.8Oz
            r0.<init>(r3)
            r1.EeU(r0)
            X.8GE r0 = r3.A0r
            X.8GF r1 = r0.CrP()
            X.8P0 r0 = new X.8P0
            r0.<init>(r3)
            r1.A00 = r0
            X.8P1 r0 = new X.8P1
            r0.<init>(r3)
            r1.A01 = r0
            r1.A00()
            com.instagram.ui.widget.colourwheel.ColourWheelView r0 = r3.A0v
            X.8P3 r1 = new X.8P3
            r1.<init>(r3)
            java.util.Set r0 = r0.A0N
            r0.add(r1)
            android.widget.ImageView r0 = r3.A0Q
            if (r0 == 0) goto L_0x051f
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8P4 r0 = new X.8P4
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
        L_0x051f:
            android.widget.ImageView r0 = r3.A0a
            if (r0 == 0) goto L_0x0532
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8P5 r0 = new X.8P5
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
        L_0x0532:
            android.widget.ImageView r0 = r3.A0W
            if (r0 == 0) goto L_0x0545
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.9k7 r0 = new X.9k7
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
        L_0x0545:
            android.widget.ImageView r0 = r3.A0S
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8P6 r0 = new X.8P6
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            android.view.View r0 = r3.A0I
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8P7 r0 = new X.8P7
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            X.3oV r1 = r3.A0g
            X.8P8 r0 = new X.8P8
            r0.<init>(r3)
            r1.EeU(r0)
            X.3oV r1 = r3.A0n
            X.8P9 r0 = new X.8P9
            r0.<init>(r3)
            r1.EeU(r0)
            X.3oV r1 = r3.A0o
            X.8PA r0 = new X.8PA
            r0.<init>(r3)
            r1.EeU(r0)
            X.3oV r1 = r3.A0h
            X.8PB r0 = new X.8PB
            r0.<init>(r3)
            r1.EeU(r0)
            X.3oV r1 = r3.A0i
            X.8PC r0 = new X.8PC
            r0.<init>(r3)
            r1.EeU(r0)
            android.widget.ImageView r0 = r3.A0V
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PD r0 = new X.8PD
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            android.widget.ImageView r0 = r3.A0U
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PE r0 = new X.8PE
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            android.view.View r0 = r3.A0H
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PF r0 = new X.8PF
            r0.<init>(r3)
            r1.A04 = r0
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r1.A05 = r8
            r1.A00()
            android.view.View r0 = r3.A0N
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PG r0 = new X.8PG
            r0.<init>(r3)
            r1.A04 = r0
            r1.A05 = r8
            r1.A00()
            X.3oV r1 = r3.A0e
            X.8PH r0 = new X.8PH
            r0.<init>(r3)
            r1.EeU(r0)
            android.view.View r0 = r3.A0K
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PI r0 = new X.8PI
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            android.view.View r0 = r3.A0M
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PJ r0 = new X.8PJ
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            android.widget.ImageView r0 = r3.A0T
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PK r0 = new X.8PK
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            android.widget.ImageView r0 = r3.A0Y
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PL r0 = new X.8PL
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            X.0eM r0 = r3.A10
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PM r0 = new X.8PM
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            X.0eM r0 = r3.A0z
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PN r0 = new X.8PN
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            X.0eM r0 = r3.A0y
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PO r0 = new X.8PO
            r0.<init>(r3)
            r1.A04 = r0
            r1.A05 = r8
            r1.A00()
            X.0eM r0 = r3.A12
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PP r0 = new X.8PP
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            android.widget.ImageView r0 = r3.A0X
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PQ r0 = new X.8PQ
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            android.view.View r0 = r3.A0J
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PR r0 = new X.8PR
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            android.widget.ImageView r0 = r3.A0Z
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.8PS r0 = new X.8PS
            r0.<init>(r3)
            r1.A04 = r0
            r1.A00()
            X.8Om r0 = r3.A01
            if (r0 == 0) goto L_0x06c8
            r0.A01 = r6
        L_0x06c8:
            X.AnonymousClass81Y.A03(r2, r7)
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x0741
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.87r r0 = new X.87r
            r0.<init>(r1, r5)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r2)
            java.lang.Class<X.87s> r0 = X.C3511387s.class
            X.2YL r0 = r1.A00(r0)
            X.87s r0 = (X.C3511387s) r0
            r3.A0B = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327340195723608(0x810f8600003958, double:3.0368944460088964E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0710
            r0 = 36327340195789145(0x810f8600013959, double:3.036894446050342E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0710
            r0 = 36327340195854682(0x810f860002395a, double:3.036894446091788E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0741
        L_0x0710:
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.82p r1 = r3.A02
            X.9jJ r0 = new X.9jJ
            r0.<init>(r5, r1)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r2)
            java.lang.Class<X.9YE> r0 = X.AnonymousClass9YE.class
            X.2YL r0 = r1.A00(r0)
            X.9YE r0 = (X.AnonymousClass9YE) r0
            r3.A03 = r0
            X.07U r6 = X.07U.A05
            X.07Z r5 = r4.getViewLifecycleOwner()
            X.0xx r1 = X.AnonymousClass07a.A00(r5)
            r8 = 0
            r9 = 3
            X.MHJ r4 = new X.MHJ
            r7 = r3
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r9)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r4, r1)
        L_0x0741:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355048Oj.<init>(android.app.Activity, android.content.Context, android.view.View, android.view.ViewStub, X.4DH, X.84f, com.instagram.common.session.UserSession, X.8Yz, X.8Oh, X.8Be, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.82p, X.846, X.8B2, X.88B, int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02e0, code lost:
        if (r84 != false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02f0, code lost:
        if (r84 != false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0303, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A0d, 36316800346231438L) == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0305, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0307, code lost:
        r3 = r67;
        r6 = r3.A0M;
        r9 = r3.A0Q;
        r35 = X.AnonymousClass80V.MEDIA_EDIT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0313, code lost:
        if (r69 != r35) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0315, code lost:
        if (r78 != false) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0317, code lost:
        if (r79 != false) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0319, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x031a, code lost:
        if (r83 == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x031c, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x031d, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x031e, code lost:
        if (r90 == false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0320, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0321, code lost:
        if (r4 != false) goto L_0x0977;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0323, code lost:
        if (r3 != false) goto L_0x0977;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0325, code lost:
        r32 = X.AnonymousClass05K.A0C;
        r65 = r32;
        r20 = false;
        r41 = false;
        r42 = false;
        r33 = false;
        r6 = false;
        r23 = false;
        r40 = false;
        r7 = false;
        r37 = false;
        r22 = false;
        r31 = false;
        r14 = false;
        r43 = false;
        r28 = false;
        r16 = false;
        r38 = false;
        r8 = false;
        r19 = false;
        r30 = false;
        r29 = false;
        r25 = false;
        r21 = false;
        r24 = false;
        r27 = false;
        r26 = false;
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0358, code lost:
        if (r2 == false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x035a, code lost:
        A0K(r0, r14, r7, r40, r23, r6, r33, r8, r8, r8, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0373, code lost:
        if (r43 == false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0379, code lost:
        if (r0.A04 == X.C351968Bd.SMART_TRACKING_PROCESSING_INVALID) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x037b, code lost:
        r3 = r0.A0t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x037d, code lost:
        if (r3 == null) goto L_0x0974;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0381, code lost:
        if (r3.A03 != r1) goto L_0x0974;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0383, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0384, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0L}, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x038e, code lost:
        if (r43 == false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0390, code lost:
        r0.A0q.A0D(r0.A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0397, code lost:
        if (r42 != false) goto L_0x0938;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0399, code lost:
        r9 = r0.A0j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x039f, code lost:
        if (r9.CVM() == false) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03a1, code lost:
        X.C355098Oo.A05(new android.view.View[]{r9.getView()}, r42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03ae, code lost:
        if (r41 == false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03b0, code lost:
        r10 = r0.A0y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03bc, code lost:
        if (((android.view.View) r10.getValue()).getVisibility() == 0) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03be, code lost:
        X.27p.A01(r0.A0d).A14(r62.A00().A00, X.AnonymousClass80P.AI_CONTEXTUAL_BACKGROUND);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03cf, code lost:
        r9 = r0.A0F;
        ((android.widget.ImageView) r10.getValue()).setColorFilter(r9.getColor(X.2Yu.A0H(r9, com.instagram.android.R.attr.igds_color_primary_button_on_media)));
        ((android.widget.ImageView) r10.getValue()).setScaleType(android.widget.ImageView.ScaleType.CENTER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03f0, code lost:
        r54 = r0.A0y;
        X.C355098Oo.A05(new android.view.View[]{(android.view.View) r54.getValue()}, r41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0403, code lost:
        if (r2 == false) goto L_0x092b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0409, code lost:
        if (r69 != r35) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0418, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A0d, 36327327310887248L) == false) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x041a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0427, code lost:
        if (((java.lang.Boolean) r0.A15.getValue()).booleanValue() == false) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0429, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x042a, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0M}, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0433, code lost:
        if (r31 != false) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x043b, code lost:
        if (r0.A0l.CVM() == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x043d, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0l.getView()}, r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x044c, code lost:
        if (r2 == false) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x044e, code lost:
        if (r8 != false) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0456, code lost:
        if (r0.A0g.CVM() == false) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0458, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0g.getView()}, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0465, code lost:
        if (r8 != false) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x046d, code lost:
        if (r0.A0n.CVM() == false) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x046f, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0n.getView()}, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x047c, code lost:
        if (r7 != false) goto L_0x0486;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0484, code lost:
        if (r0.A0h.CVM() == false) goto L_0x0493;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0486, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0h.getView()}, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0493, code lost:
        if (r6 != false) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x049b, code lost:
        if (r0.A0i.CVM() == false) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x049d, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0i.getView()}, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04aa, code lost:
        r5 = r0.A0k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04ae, code lost:
        if (r28 == false) goto L_0x088f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04b0, code lost:
        r10 = r5.getView();
        X.C355098Oo.A05(new android.view.View[]{r10}, r1);
        r4 = r0.A0q.A00;
        r4.A1X.A00().A01(r4.A1s, r10, X.C366978pz.A0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04cc, code lost:
        if (r20 != false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04d4, code lost:
        if (r0.A0f.CVM() == false) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04d6, code lost:
        r5 = r0.A0f;
        X.C355098Oo.A05(new android.view.View[]{r5.getView()}, r20);
        r4 = r0.A0q;
        r10 = r5.getView();
        r4 = r4.A00;
        r4.A1X.A00().A01(r4.A1s, r10, X.C366978pz.A0J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04fa, code lost:
        r5 = r0.A0a;
        r9 = new android.view.View[]{r5};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0500, code lost:
        if (r2 == false) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0502, code lost:
        X.C355098Oo.A05(r9, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0505, code lost:
        r11 = X.AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0509, code lost:
        if (r69 != r11) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x050b, code lost:
        if (r91 != false) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x050d, code lost:
        X.C355098Oo.A05(new android.view.View[]{r5}, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0514, code lost:
        if (r16 != false) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x051c, code lost:
        if (r0.A0m.CVM() == false) goto L_0x054d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x051e, code lost:
        r9 = X.182.A06(X.0Tu.A05, r0.A0d, 36327941491211079L);
        r5 = r0.A0m;
        X.C355098Oo.A05(new android.view.View[]{r5.getView()}, r9);
        r4 = r0.A0q;
        r10 = r5.getView();
        r4 = r4.A00;
        r4.A1X.A00().A01(r4.A1s, r10, X.C366978pz.A11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x054d, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0I}, r37);
        X.C355098Oo.A05(new android.view.View[]{r0.A0H}, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0563, code lost:
        if (r2 == false) goto L_0x0816;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0569, code lost:
        if (r69 != r35) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0578, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A0d, 36327327310952785L) == false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0586, code lost:
        if (((java.lang.Boolean) r0.A15.getValue()).booleanValue() != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x058e, code lost:
        if ((r62.A00() instanceof X.AnonymousClass80O) == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0590, code lost:
        r5 = r0.A0F;
        r43 = r5.getString(2131972502);
        X.0qQ.A07(r43);
        r50 = r1;
        r6 = r63;
        r6.add(new X.C367618rI((android.graphics.drawable.Drawable) null, r5.getDrawable(com.instagram.android.R.drawable.instagram_download_pano_outline_24), (X.C15048ULb) null, new X.C40532Adf(r0), (java.lang.Integer) null, r43, 0, 0, 0, false, false, false, r50, false, false, false));
        r43 = r5.getString(2131972522);
        X.0qQ.A07(r43);
        r6.add(new X.C367618rI((android.graphics.drawable.Drawable) null, r5.getDrawable(com.instagram.android.R.drawable.instagram_draft_pano_outline_24), (X.C15048ULb) null, new X.C40533Adg(r0), (java.lang.Integer) null, r43, 0, 0, 0, false, false, false, r50, false, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05f2, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05f7, code lost:
        if (r63.isEmpty() == false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05f9, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05fa, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0J}, r5);
        r0.A0r.Eql(r22, false);
        r5 = r0.A0v;
        r4 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x060e, code lost:
        if (r22 == false) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0610, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0611, code lost:
        r5.setVisibility(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0618, code lost:
        if (r68.A0F() != false) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x061e, code lost:
        if (r68.A0B() != false) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0624, code lost:
        if (r67.A0O == false) goto L_0x0635;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0633, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A0d, 36325154057368226L) != false) goto L_0x0637;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0635, code lost:
        r32 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0637, code lost:
        X.C355098Oo.A04(r0.A0S, r32);
        r5 = r0.A0T;
        r4 = new android.view.View[]{r5};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0644, code lost:
        if (r2 == false) goto L_0x0811;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0646, code lost:
        X.C355098Oo.A05(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0649, code lost:
        if (r80 == false) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x064b, code lost:
        if (r14 == false) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x064d, code lost:
        r0.A0q.A0C(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0658, code lost:
        if (r68.A03() != X.AnonymousClass05K.A1I) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x065a, code lost:
        r5.setImageResource(com.instagram.android.R.drawable.instagram_music_outline_44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0660, code lost:
        r4 = r0.A0V;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0667, code lost:
        if (r4.getVisibility() != 0) goto L_0x066a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0669, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x066a, code lost:
        if (r2 == false) goto L_0x0805;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0670, code lost:
        if (r69 != r35) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x067e, code lost:
        if (((java.lang.Boolean) r0.A15.getValue()).booleanValue() != false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0680, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0681, code lost:
        if (r19 != false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0683, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0684, code lost:
        r5 = new android.view.View[]{r4};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0688, code lost:
        X.C355098Oo.A05(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x068b, code lost:
        if (r19 == false) goto L_0x0694;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x068d, code lost:
        if (r7 == false) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x068f, code lost:
        if (r80 == false) goto L_0x0694;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0691, code lost:
        r4.sendAccessibilityEvent(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0694, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0U}, r25);
        X.C355098Oo.A05(new android.view.View[]{r62.A00.A1D.A00}, r21);
        r7 = r0.A0Y;
        X.C355098Oo.A05(new android.view.View[]{r7}, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x06bb, code lost:
        if (r24 == false) goto L_0x06d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06bd, code lost:
        r7.setImageDrawable(A00(r0));
        r5 = r0.A0q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x06c6, code lost:
        if (r88 == false) goto L_0x06d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06c8, code lost:
        r5 = r5.A00;
        r5.A1X.A00().A01(r5.A1s, r7, X.C366978pz.A12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06d7, code lost:
        r8 = r0.A10;
        X.C355098Oo.A05(new android.view.View[]{(android.view.View) r8.getValue()}, r27);
        r7 = r0.A0z;
        X.C355098Oo.A05(new android.view.View[]{(android.view.View) r7.getValue()}, r26);
        r6 = r0.A12;
        X.C355098Oo.A05(new android.view.View[]{(android.view.View) r6.getValue()}, r15);
        X.C355098Oo.A05(new android.view.View[]{r0.A0X}, r30);
        X.C355098Oo.A05(new android.view.View[]{r0.A0Z}, r29);
        r5 = r0.A0G;
        r9 = new android.view.View[]{r5};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0724, code lost:
        if (r2 == false) goto L_0x07fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0726, code lost:
        X.C355098Oo.A05(r9, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0729, code lost:
        r2 = r0.A0d;
        X.C355098Oo.A01(r0.A0R, r2, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0734, code lost:
        if (r69 != r11) goto L_0x073f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0736, code lost:
        if (r91 != false) goto L_0x073f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0738, code lost:
        X.C355098Oo.A05(new android.view.View[]{r5}, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x073f, code lost:
        A0F(r0);
        A0G(r0);
        A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x074c, code lost:
        if (r5.getVisibility() != 0) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x074e, code lost:
        r10 = r0.A0s;
        r9 = r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0754, code lost:
        if (r9 == null) goto L_0x07cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0758, code lost:
        if (r9.A01 != r1) goto L_0x07cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x075a, code lost:
        r10 = X.0sr.A1P(new X.0eP[]{new X.0eP(r8.getValue(), X.C366978pz.A0h), new X.0eP(r7.getValue(), X.C366978pz.A0g), new X.0eP(r6.getValue(), X.C366978pz.A0j), new X.0eP(r54.getValue(), X.C366978pz.A0A)}).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0796, code lost:
        if (r10.hasNext() == false) goto L_0x0d4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0798, code lost:
        r5 = (X.0eP) r10.next();
        r3 = r0.A0s;
        r2 = r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x07a4, code lost:
        if (r2 == null) goto L_0x07ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x07a8, code lost:
        if (r2.A01 != r1) goto L_0x07ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x07ab, code lost:
        r9 = (android.view.View) r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x07b3, code lost:
        if (r9.getVisibility() != 0) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x07b5, code lost:
        r8 = r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x07b9, code lost:
        if (r8 == null) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07bb, code lost:
        r7 = A0N();
        r6 = (X.C366978pz) r5.A01;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x07c8, code lost:
        if (r13.A01 != X.28D.A2x) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x07ca, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07cb, code lost:
        r8.A03(r7, r9, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07cf, code lost:
        r14 = r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x07d3, code lost:
        if (r14 == null) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x07d5, code lost:
        r15 = A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x07db, code lost:
        if (r0.A06 != false) goto L_0x07f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07dd, code lost:
        if (r89 == false) goto L_0x07f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x07df, code lost:
        r0.A06 = r1;
        r17 = X.C366978pz.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x07e3, code lost:
        r14.A02(r15, r5, r17, X.26G.A00(r2), (java.lang.String) null, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07f6, code lost:
        if (r0.A17 == false) goto L_0x07fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x07f8, code lost:
        r17 = X.C366978pz.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07fb, code lost:
        r17 = X.C366978pz.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07fe, code lost:
        X.C355098Oo.A05(r9, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0805, code lost:
        r5 = new android.view.View[]{r4};
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x080d, code lost:
        if (r14 == false) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0811, code lost:
        X.C355098Oo.A05(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0816, code lost:
        if (r38 == false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0818, code lost:
        r5 = r62.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x081e, code lost:
        if (r5 != X.AnonymousClass9QA.A00) goto L_0x086b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0820, code lost:
        if (r6 == false) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x082f, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A0d, 36319360146742448L) == false) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0831, code lost:
        A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0834, code lost:
        if (r37 == false) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0836, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0839, code lost:
        if (r33 == false) goto L_0x083e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x083b, code lost:
        A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x083e, code lost:
        r7 = r0.A0d;
        r6 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x084b, code lost:
        if (X.182.A06(r6, r7, 36324475452534894L) == false) goto L_0x0850;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x084d, code lost:
        A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0850, code lost:
        A0A(r0);
        A0B(r0);
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0859, code lost:
        if (r16 == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0864, code lost:
        if (X.182.A06(r6, r7, 36327941491211079L) != false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0866, code lost:
        A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x086d, code lost:
        if ((r5 instanceof X.AnonymousClass80O) == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x086f, code lost:
        if (r7 == false) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0871, code lost:
        A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0874, code lost:
        if (r8 == false) goto L_0x087c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0876, code lost:
        A04(r0);
        A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x087c, code lost:
        if (r18 == false) goto L_0x0881;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x087e, code lost:
        A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0881, code lost:
        if (r33 == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0883, code lost:
        A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0888, code lost:
        X.C355098Oo.A05(r9, r40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0893, code lost:
        if (r5.CFV() == 8) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0895, code lost:
        X.C355098Oo.A05(new android.view.View[]{r5.getView()}, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x08a2, code lost:
        if (r8 != false) goto L_0x08ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x08aa, code lost:
        if (r0.A0g.CVM() == false) goto L_0x08bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x08ac, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0g.getView()}, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x08b9, code lost:
        if (r8 != false) goto L_0x08c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x08c1, code lost:
        if (r0.A0n.CVM() == false) goto L_0x08d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x08c3, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0n.getView()}, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08d0, code lost:
        if (r7 != false) goto L_0x08da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x08d8, code lost:
        if (r0.A0h.CVM() == false) goto L_0x08e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x08da, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0h.getView()}, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x08e7, code lost:
        if (r6 != false) goto L_0x08f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x08ef, code lost:
        if (r0.A0i.CVM() == false) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x08f1, code lost:
        r5 = r0.A0i;
        X.C355098Oo.A05(new android.view.View[]{r5.getView()}, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0906, code lost:
        if (r5.getView().getVisibility() != 0) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0908, code lost:
        r9 = r0.A0s;
        r4 = r9.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x090e, code lost:
        if (r4 == null) goto L_0x0916;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0912, code lost:
        if (r4.A01 != r1) goto L_0x0916;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0916, code lost:
        r10 = r9.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x091a, code lost:
        if (r10 == null) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x091c, code lost:
        r10.A01(A0N(), r5.getView(), X.C366978pz.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x092b, code lost:
        X.C355098Oo.A05(new android.view.View[]{r0.A0M}, r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0938, code lost:
        X.27p.A01(r0.A0d).A14(r62.A00().A00, X.AnonymousClass80P.AI_EXPANDER);
        r9 = r0.A0j;
        r5 = r9.getView().requireViewById(com.instagram.android.R.id.post_capture_camera_genai_expand_button);
        X.0qQ.A0C(r5, "null cannot be cast to non-null type android.widget.ImageView");
        r5 = (android.widget.ImageView) r5;
        r10 = r0.A0F;
        r5.setColorFilter(r10.getColor(X.2Yu.A0H(r10, com.instagram.android.R.attr.igds_color_primary_button_on_media)));
        r5.setScaleType(android.widget.ImageView.ScaleType.CENTER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0974, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0977, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x097c, code lost:
        if (r67.A0G == null) goto L_0x097f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x097e, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x097f, code lost:
        r3 = r62.A00();
        r10 = X.AnonymousClass9QA.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0985, code lost:
        if (r3 != r10) goto L_0x0998;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0987, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0996, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A0d, 36327941491145542L) != false) goto L_0x099a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0998, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x099a, code lost:
        r4 = r67.A0D;
        r32 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x09a2, code lost:
        if (r4 == r32) goto L_0x09bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x09a4, code lost:
        if (r8 != false) goto L_0x09bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0150, code lost:
        if (r8 != X.AnonymousClass8JI.REMIX) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x09aa, code lost:
        if (r67.A0U != false) goto L_0x09bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x09b2, code lost:
        if (r68.A03() != X.AnonymousClass05K.A0N) goto L_0x09bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x09b4, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x09bb, code lost:
        if (X.C305756Jk.A00(r0.A0F) != false) goto L_0x09be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x09bd, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x09be, code lost:
        r3 = r67.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x09c2, code lost:
        if (r3 == null) goto L_0x09d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x09c4, code lost:
        r3 = r3.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x09c6, code lost:
        if (r3 == null) goto L_0x09d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x09c8, code lost:
        r3 = r3.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x09ca, code lost:
        if (r3 == null) goto L_0x09d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09d0, code lost:
        if (r3.booleanValue() != false) goto L_0x09e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x09d2, code lost:
        r4 = r67.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x09d6, code lost:
        if (r4 == null) goto L_0x09e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x09da, code lost:
        if (r4.A1I != false) goto L_0x09e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x09de, code lost:
        if (r4.A13 == false) goto L_0x09e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x09e0, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x09e5, code lost:
        if (r62.A00() == r10) goto L_0x09e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x09e7, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x09e8, code lost:
        if (r5 != false) goto L_0x09ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x09ea, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x09ec, code lost:
        if (r4 == false) goto L_0x09f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x09ee, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x09f0, code lost:
        if (r8 != false) goto L_0x09fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x09f2, code lost:
        r28 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x09f8, code lost:
        if (r68.A0D() != false) goto L_0x09fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x09fa, code lost:
        r28 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0a00, code lost:
        if (r68.A0G() != false) goto L_0x0a18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a02, code lost:
        r5 = r0.A0d;
        r4 = X.C255193tj.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0a08, code lost:
        if (r4 == null) goto L_0x0a18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0a0c, code lost:
        if (r4.A00 <= 0) goto L_0x0a18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0a12, code lost:
        if (X.C255193tj.A03(r5, r4) == false) goto L_0x0a18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0a14, code lost:
        r20 = false;
        r28 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0a18, code lost:
        r5 = r62.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0a1c, code lost:
        if (r26 != false) goto L_0x0d43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0a22, code lost:
        if (r13.A01 == X.28D.A2D) goto L_0x0d43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0a24, code lost:
        if (r6 != false) goto L_0x0d43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0a26, code lost:
        if (r87 != false) goto L_0x0d43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0a2c, code lost:
        if (r67.A0q != false) goto L_0x0d43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0a34, code lost:
        if (X.C305756Jk.A00(r0.A0F) == false) goto L_0x0d43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015c, code lost:
        if (r5 == null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0a46, code lost:
        if (X.C365958nx.A00(r0.A0d, r5, false).A00(r0.A19, r0.A02) == false) goto L_0x0a4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0a48, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a49, code lost:
        if (r27 == false) goto L_0x0a4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0a4b, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0a4c, code lost:
        if (r79 != false) goto L_0x0a60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0a4e, code lost:
        if (r83 != false) goto L_0x0a60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0a56, code lost:
        if (r68.A03() != X.AnonymousClass05K.A1I) goto L_0x0a60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0a58, code lost:
        r3 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0a5a, code lost:
        if (r3 == null) goto L_0x0d31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a5e, code lost:
        if (r3.A04 == null) goto L_0x0d31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0a60, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0a61, code lost:
        if (r2 != false) goto L_0x0d22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0a63, code lost:
        if (r7 == false) goto L_0x0d22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0a65, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0a66, code lost:
        r29 = r0.A0F;
        r8 = r0.A0d;
        r11 = r0.A02.A02;
        r43 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a76, code lost:
        if (X.0qQ.A0K(r5, r10) == false) goto L_0x0cbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0a7c, code lost:
        if (r11.A0B() != false) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0a7e, code lost:
        r4 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0a82, code lost:
        if (r4.A0O != false) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a86, code lost:
        if (r4.A0J == false) goto L_0x0cbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a88, code lost:
        r42 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0a8e, code lost:
        if (X.0qQ.A0K(r5, r10) == false) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0a9a, code lost:
        if (r0.A02.A02.A01() != X.C365758nd.A04) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0aa7, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36329504859242656L) == false) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0aa9, code lost:
        r3 = r0.A0t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0aab, code lost:
        if (r3 == null) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0ab9, code lost:
        if (((java.lang.Boolean) r3.A00.getValue()).booleanValue() != r1) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0abb, code lost:
        r41 = X.C366898pr.A00.A00(r8, r5, r68);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0ac7, code lost:
        if (X.C355098Oo.A07(r68) == false) goto L_0x0ad1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0ac9, code lost:
        r33 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0acf, code lost:
        if (r13.A01 != X.28D.A2D) goto L_0x0ad3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0ad1, code lost:
        r33 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0ad3, code lost:
        r25 = r62.A03();
        r19 = !r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0add, code lost:
        if (r68.A0C() != false) goto L_0x0aff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0ae3, code lost:
        if (r67.A02() == null) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0ae5, code lost:
        r3 = r67.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0ae9, code lost:
        if (r3 == null) goto L_0x0aff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0aed, code lost:
        if (r3.A0F != r1) goto L_0x0aff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0aef, code lost:
        if (r24 != false) goto L_0x0aff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0af5, code lost:
        if (r13.A01 == X.28D.A2D) goto L_0x0aff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0af7, code lost:
        if (r9 != false) goto L_0x0aff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0af9, code lost:
        r37 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0afd, code lost:
        if ((r5 instanceof X.AnonymousClass80O) == false) goto L_0x0b01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0aff, code lost:
        r37 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0b03, code lost:
        if (r0.A0E != false) goto L_0x0b1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0b05, code lost:
        r3 = r62.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0b1d, code lost:
        if ((!X.C366908ps.A00(r3.A14, ((X.AnonymousClass8ME) r3.A1g.get()).A17())) == false) goto L_0x0b22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0b1f, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0b20, code lost:
        if (r80 == false) goto L_0x0b23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0b22, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0b23, code lost:
        r0.A0E = r3;
        r3 = r62.A00;
        r22 = X.AnonymousClass8BA.A0N(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0b2d, code lost:
        if (r26 != false) goto L_0x0b35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0b2f, code lost:
        if (r18 != false) goto L_0x0b35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0b31, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0b33, code lost:
        if (r27 == false) goto L_0x0b37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0b35, code lost:
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0b37, code lost:
        if (r24 == false) goto L_0x0b3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0b39, code lost:
        r40 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0b3b, code lost:
        if (r21 == false) goto L_0x0b3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0b3d, code lost:
        r40 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0b43, code lost:
        if (r3.A1D.A00 == null) goto L_0x0b53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0b4b, code lost:
        if (r68.A03() == X.AnonymousClass05K.A1I) goto L_0x0b53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0b4d, code lost:
        if (r26 != false) goto L_0x0b53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0b4f, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0b51, code lost:
        if (r18 == false) goto L_0x0b55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0b53, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0b55, code lost:
        if (r79 != false) goto L_0x0b69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0b57, code lost:
        if (r83 != false) goto L_0x0b69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0b5f, code lost:
        if (r68.A03() != X.AnonymousClass05K.A1I) goto L_0x0b69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0b61, code lost:
        r3 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0b63, code lost:
        if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0b67, code lost:
        if (r3.A04 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0b69, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0b6a, code lost:
        if (r5 != r10) goto L_0x0ca6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0b70, code lost:
        if (r13.A01 == X.28D.A2D) goto L_0x0ca6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0b72, code lost:
        if (r18 != false) goto L_0x0ca6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0b74, code lost:
        if (r9 != false) goto L_0x0ca6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b7e, code lost:
        if (X.C349167zh.A00(r8).booleanValue() == false) goto L_0x0c97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0b8b, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36319360146480303L) == false) goto L_0x0c97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0b8d, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b8f, code lost:
        r3 = r68.A03();
        r4 = X.AnonymousClass05K.A1I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0b95, code lost:
        if (r3 != r4) goto L_0x0ba1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b97, code lost:
        if (r14 == false) goto L_0x0ba1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b99, code lost:
        r39 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b9f, code lost:
        if (X.AnonymousClass30D.A02(r8) == false) goto L_0x0ba3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0ba1, code lost:
        r39 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0ba7, code lost:
        if (r68.A03() == r4) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0ba9, code lost:
        if (r26 != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0baf, code lost:
        if (r13.A01 == X.28D.A2D) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0bb1, code lost:
        if (r18 != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0bb3, code lost:
        if (r9 == false) goto L_0x0bc1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0bb9, code lost:
        if (r68.A03() != r4) goto L_0x0c93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0bbb, code lost:
        if (r2 != false) goto L_0x0c93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0bbd, code lost:
        if (r39 == false) goto L_0x0c93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0bbf, code lost:
        if (r33 == false) goto L_0x0c93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0bc1, code lost:
        r38 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0bc3, code lost:
        r3 = r67.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0bc7, code lost:
        if (r3 == null) goto L_0x0bf9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0bcd, code lost:
        if (r3.A0E() != r1) goto L_0x0bf9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0bcf, code lost:
        r27 = false;
        r26 = false;
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0bd4, code lost:
        r30 = X.C366928pu.A00(r8, r5, r68);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0bde, code lost:
        if (r68.A03() != r4) goto L_0x0bf0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0be0, code lost:
        r3 = r0.A1B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0be2, code lost:
        if (r3 == null) goto L_0x0bf0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0be4, code lost:
        r3 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0be6, code lost:
        if (r3 == null) goto L_0x0bf7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0be8, code lost:
        r4 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0bea, code lost:
        r29 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0bee, code lost:
        if (r4 == X.AnonymousClass8JI.REMIX) goto L_0x0bf2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0bf0, code lost:
        r29 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0bf2, code lost:
        r18 = r39;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0bf7, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0bf9, code lost:
        r3 = X.C366918pt.A00;
        r11 = r13.A01;
        r10 = r68.A01();
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0c06, code lost:
        if (r67.A02() == null) goto L_0x0c09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0c08, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0c0d, code lost:
        if (r3.A00(r11, r5, r10, r9) == false) goto L_0x0bcf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0c0f, code lost:
        r10 = A01(r0);
        r12 = new java.util.ArrayList(X.0Yv.A1E(r10, 10));
        r26 = r10.iterator();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0c27, code lost:
        if (r26.hasNext() == false) goto L_0x0c7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0c29, code lost:
        r9 = r26.next();
        r18 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0c2f, code lost:
        if (r10 >= 0) goto L_0x0c39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c31, code lost:
        X.0sr.A1T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c38, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c39, code lost:
        r9 = (X.C362088hK) r9;
        r11 = r29;
        r50 = r11.getString(r9.A04);
        X.0qQ.A07(r50);
        r12.add(new X.C367618rI((android.graphics.drawable.Drawable) null, r11.getDrawable(r9.A00), (X.C15048ULb) null, new X.C40547Adu(r0, r9, r10), (java.lang.Integer) null, r50, 0, 0, 0, false, false, false, r1, false, false, false));
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c7a, code lost:
        ((X.C355148Ov) r0.A11.getValue()).A02(r12);
        r27 = r3.A02(r8);
        r26 = r3.A01(r8);
        r15 = r3.A03(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c93, code lost:
        r38 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c7, code lost:
        if (r5.A01.A0O == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0ca2, code lost:
        if (X.182.A06(X.0Tu.A06, r8, 36323960056458883L) == false) goto L_0x0ca6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0ca6, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0cac, code lost:
        if (r5 != X.C3493880e.A00) goto L_0x0cb2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0cb0, code lost:
        if (r0.A1D != false) goto L_0x0b69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0cb2, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0cb7, code lost:
        if (X.AnonymousClass30D.A08(r8) != false) goto L_0x0b6a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0cbb, code lost:
        r42 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0cbf, code lost:
        r3 = r11.A01;
        r11 = r3.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0cc7, code lost:
        if (r11 == null) goto L_0x0d07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0ccd, code lost:
        if (X.0qQ.A0K(r10, r5) == false) goto L_0x0d07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0ccf, code lost:
        r3 = r3.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0cd1, code lost:
        if (r3 == null) goto L_0x0ce3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0cdf, code lost:
        if (((java.util.Set) r3.A09.A00).contains(X.C358088aL.A0C) == false) goto L_0x0ce3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0ce3, code lost:
        r4 = (((float) r11.A09) * 1.0f) / ((float) r11.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0cef, code lost:
        if ((r11.A07 % 180) == 0) goto L_0x0cf3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d4, code lost:
        if (X.182.A06(r4, r3.A0J, 36325154057368226L) == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0cf1, code lost:
        r4 = 1.0f / r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0cff, code lost:
        if (java.lang.Math.abs(r4 - 0.5625f) < 0.01f) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0d01, code lost:
        r43 = X.AnonymousClass8KI.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0d07, code lost:
        r3 = r3.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0d0b, code lost:
        if (r3 == null) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0d1a, code lost:
        if (((((float) r3.A0K) * 1.0f) / ((float) r3.A08)) < 0.5725f) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0d1c, code lost:
        r43 = X.0qQ.A0K(r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0d22, code lost:
        if (r6 == false) goto L_0x0a66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0d24, code lost:
        if (r11 == false) goto L_0x0a66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0d26, code lost:
        X.27p.A01(r0.A0d).A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0d31, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0d3f, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A0d, 36323805438029337L) != false) goto L_0x0a61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0d43, code lost:
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0d4f, code lost:
        r5 = r0.A0F.getResources();
        r2 = r66.getLayoutParams();
        X.0qQ.A0C(r2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        r2 = (android.view.ViewGroup.MarginLayoutParams) r2;
        r8 = r2.getMarginEnd() + r2.getMarginStart();
        A0I(r0);
        ((X.C367008q2) r0.A14.getValue()).A00(r66, (android.view.View[]) java.util.Arrays.copyOf(A0M(r0), 29), r8, r5.getDimensionPixelSize(com.instagram.android.R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), r5.getDimensionPixelSize(com.instagram.android.R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
        r1 = A0L(r0);
        r0 = com.instagram.android.R.drawable.instagram_chevron_left_pano_outline_rtl_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0d9c, code lost:
        if (r1 == false) goto L_0x0da1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0d9e, code lost:
        r0 = com.instagram.android.R.drawable.instagram_x_outline_44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0da1, code lost:
        r4.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0da4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0257, code lost:
        if (r4.A06().A02 != true) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x026c, code lost:
        if (r0.A0i.CFV() != 0) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029c, code lost:
        if (r82 != false) goto L_0x0292;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(X.C3499582p r74, X.AnonymousClass80V r75, X.AnonymousClass80X r76, java.lang.Integer r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85, boolean r86, boolean r87, boolean r88, boolean r89, boolean r90, boolean r91) {
        /*
            r73 = this;
            r65 = r77
            r31 = r85
            r69 = r75
            r0 = r73
            r1 = r69
            r0.A05 = r1
            r11 = r76
            r0.A0C = r11
            r13 = r74
            r0.A02 = r13
            r36 = r89
            r1 = r36
            r0.A09 = r1
            r34 = r91
            r1 = r34
            r0.A08 = r1
            r1 = r69
            boolean r1 = X.C355098Oo.A08(r1, r11)
            if (r1 != 0) goto L_0x0226
            X.9YE r3 = r0.A03
            r10 = r84
            r14 = r83
            r44 = r82
            r18 = r81
            r61 = r80
            r12 = r79
            r16 = r90
            r15 = r78
            r64 = r88
            r19 = r87
            if (r3 == 0) goto L_0x0242
            com.instagram.common.session.UserSession r5 = r0.A0d
            X.0Tu r4 = X.0Tu.A05
            r1 = 36327340195723608(0x810f8600003958, double:3.0368944460088964E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 != 0) goto L_0x0065
            r1 = 36327340195789145(0x810f8600013959, double:3.036894446050342E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 != 0) goto L_0x0065
            r1 = 36327340195854682(0x810f860002395a, double:3.036894446091788E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x0242
        L_0x0065:
            X.84f r1 = r0.A19
            r3.A00 = r1
            X.8Oh r6 = r0.A0p
            X.4yO r2 = r6.A00()
            r7 = 0
            X.0qQ.A0B(r2, r7)
            r3.A01 = r2
            X.9QA r1 = X.AnonymousClass9QA.A00
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x022a
            java.lang.Integer r35 = X.AnonymousClass05K.A00
        L_0x007f:
            X.05G r1 = r3.A0M
        L_0x0081:
            java.lang.Object r5 = r1.getValue()
            r8 = r5
            X.9PK r8 = (X.AnonymousClass9PK) r8
            r2 = 0
            r38 = 1022(0x3fe, float:1.432E-42)
            r34 = r2
            r36 = r2
            r37 = r2
            r40 = r7
            r41 = r7
            r42 = r7
            r43 = r7
            r32 = r8
            r33 = r2
            r39 = r7
            X.9PK r8 = X.AnonymousClass9PK.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            boolean r5 = r1.AIY(r5, r8)
            if (r5 == 0) goto L_0x0081
            X.8BA r9 = r6.A00
            X.8C9 r5 = r9.A1D
            android.widget.ImageView r8 = r5.A00
            r5 = 0
            if (r8 == 0) goto L_0x00b3
            r5 = 1
        L_0x00b3:
            r3.A06 = r5
            boolean r5 = X.AnonymousClass8BA.A0N(r9)
            r3.A08 = r5
            boolean r5 = r6.A03()
            r3.A0E = r5
        L_0x00c1:
            java.lang.Object r9 = r1.getValue()
            r8 = r9
            X.9PK r8 = (X.AnonymousClass9PK) r8
            r6 = 1007(0x3ef, float:1.411E-42)
            r5 = r69
            X.9PK r5 = X.AnonymousClass9PK.A00(r8, r5, (X.AnonymousClass80X) null, (java.lang.Integer) null, (java.lang.Integer) null, r2, r6, r7, false, false, false, false)
            boolean r5 = r1.AIY(r9, r5)
            if (r5 == 0) goto L_0x00c1
            r3.A0G = r15
            r3.A0B = r12
            r3.A02 = r13
            X.82o r5 = r13.A02
            r3.A03 = r5
        L_0x00e0:
            java.lang.Object r6 = r1.getValue()
            r5 = r6
            X.9PK r5 = (X.AnonymousClass9PK) r5
            r38 = 1015(0x3f7, float:1.422E-42)
            r34 = r11
            r35 = r2
            r32 = r5
            X.9PK r5 = X.AnonymousClass9PK.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            boolean r5 = r1.AIY(r6, r5)
            if (r5 == 0) goto L_0x00e0
        L_0x00f9:
            java.lang.Object r6 = r1.getValue()
            r5 = r6
            X.9PK r5 = (X.AnonymousClass9PK) r5
            r58 = 895(0x37f, float:1.254E-42)
            r52 = r5
            r53 = r2
            r54 = r2
            r55 = r2
            r56 = r2
            r57 = r2
            r59 = r7
            r60 = r7
            r62 = r7
            r63 = r7
            X.9PK r5 = X.AnonymousClass9PK.A00(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            boolean r5 = r1.AIY(r6, r5)
            if (r5 == 0) goto L_0x00f9
            r5 = r18
            r3.A0C = r5
        L_0x0124:
            java.lang.Object r6 = r1.getValue()
            r5 = r6
            X.9PK r5 = (X.AnonymousClass9PK) r5
            r40 = 767(0x2ff, float:1.075E-42)
            r38 = r2
            r39 = r2
            r45 = r7
            r34 = r5
            X.9PK r5 = X.AnonymousClass9PK.A00(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r5 = r1.AIY(r6, r5)
            if (r5 == 0) goto L_0x0124
            r3.A0F = r14
            r3.A0H = r10
            X.88B r5 = r0.A1B
            if (r5 == 0) goto L_0x0152
            X.82i r5 = r5.A00
            if (r5 == 0) goto L_0x0227
            X.8JI r8 = r5.A00
        L_0x014d:
            X.8JI r6 = X.AnonymousClass8JI.REMIX
            r5 = 1
            if (r8 == r6) goto L_0x0153
        L_0x0152:
            r5 = 0
        L_0x0153:
            r3.A09 = r5
            X.87s r0 = r0.A0B
            if (r0 == 0) goto L_0x015e
            X.4gw r5 = r0.A04
            r0 = 1
            if (r5 != 0) goto L_0x015f
        L_0x015e:
            r0 = 0
        L_0x015f:
            r3.A0A = r0
            r0 = r31
            r3.A07 = r0
        L_0x0165:
            java.lang.Object r5 = r1.getValue()
            r0 = r5
            X.9PK r0 = (X.AnonymousClass9PK) r0
            r26 = 959(0x3bf, float:1.344E-42)
            r28 = r86
            r20 = r0
            r21 = r2
            r22 = r2
            r23 = r2
            r24 = r2
            r25 = r2
            r27 = r7
            r29 = r7
            r30 = r7
            r31 = r7
            X.9PK r0 = X.AnonymousClass9PK.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r0 = r1.AIY(r5, r0)
            if (r0 == 0) goto L_0x0165
            r0 = r19
            r3.A05 = r0
        L_0x0192:
            java.lang.Object r5 = r1.getValue()
            r0 = r5
            X.9PK r0 = (X.AnonymousClass9PK) r0
            r59 = 511(0x1ff, float:7.16E-43)
            r53 = r0
            r58 = r2
            r61 = r7
            X.9PK r0 = X.AnonymousClass9PK.A00(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            boolean r0 = r1.AIY(r5, r0)
            if (r0 == 0) goto L_0x0192
            r0 = r16
            r3.A0D = r0
            boolean r0 = X.AnonymousClass9YE.A09(r3)
            if (r0 == 0) goto L_0x01d6
            X.82o r5 = r3.A03
            boolean r0 = r5.A0F()
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r5.A0B()
            if (r0 != 0) goto L_0x01c9
            X.82Y r0 = r5.A01
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x01d8
        L_0x01c9:
            com.instagram.common.session.UserSession r0 = r3.A0J
            r5 = 36325154057368226(0x810d89000032a2, double:3.03551192331008E-306)
            boolean r0 = X.182.A06(r4, r0, r5)
            if (r0 == 0) goto L_0x01d8
        L_0x01d6:
            java.lang.Integer r65 = X.AnonymousClass05K.A0C
        L_0x01d8:
            java.lang.Object r4 = r1.getValue()
            r0 = r4
            X.9PK r0 = (X.AnonymousClass9PK) r0
            r67 = 991(0x3df, float:1.389E-42)
            r61 = r0
            r62 = r2
            r63 = r2
            r64 = r2
            r66 = r2
            r68 = r7
            r69 = r7
            r70 = r7
            r71 = r7
            r72 = r7
            X.9PK r0 = X.AnonymousClass9PK.A00(r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            boolean r0 = r1.AIY(r4, r0)
            if (r0 == 0) goto L_0x01d8
        L_0x01ff:
            java.lang.Object r7 = r1.getValue()
            r6 = r7
            X.9PK r6 = (X.AnonymousClass9PK) r6
            X.05G r0 = r3.A0L
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.util.List r5 = X.AnonymousClass9YE.A00(r3, r0)
            boolean r4 = X.AnonymousClass9YE.A09(r3)
            r0 = 1017(0x3f9, float:1.425E-42)
            X.9PK r0 = X.AnonymousClass9PK.A00(r6, r2, (X.AnonymousClass80X) null, (java.lang.Integer) null, (java.lang.Integer) null, r5, r0, r4, false, false, false, false)
            boolean r0 = r1.AIY(r7, r0)
            if (r0 == 0) goto L_0x01ff
        L_0x0226:
            return
        L_0x0227:
            r8 = 0
            goto L_0x014d
        L_0x022a:
            boolean r1 = r2 instanceof X.AnonymousClass80O
            if (r1 == 0) goto L_0x0232
            java.lang.Integer r35 = X.AnonymousClass05K.A01
            goto L_0x007f
        L_0x0232:
            X.80M r1 = X.AnonymousClass80M.A00
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x023e
            java.lang.Integer r35 = X.AnonymousClass05K.A0C
            goto L_0x007f
        L_0x023e:
            java.lang.Integer r35 = X.AnonymousClass05K.A0N
            goto L_0x007f
        L_0x0242:
            X.82o r1 = r13.A02
            r68 = r1
            X.82Y r1 = r1.A01
            r67 = r1
            X.8Yz r4 = r1.A0X
            if (r4 == 0) goto L_0x0259
            com.instagram.creation.cameraconfiguration.CameraConfiguration r1 = r4.A06()
            boolean r2 = r1.A02
            r1 = 1
            r27 = 1
            if (r2 == r1) goto L_0x025b
        L_0x0259:
            r27 = 0
        L_0x025b:
            android.view.ViewGroup r1 = r0.A0O
            r66 = r1
            int r1 = r66.getVisibility()
            if (r1 != 0) goto L_0x026e
            X.3oV r1 = r0.A0i
            int r1 = r1.CFV()
            r11 = 0
            if (r1 == 0) goto L_0x026f
        L_0x026e:
            r11 = 1
        L_0x026f:
            A0J(r0)
            java.util.ArrayList r1 = r0.A0x
            r63 = r1
            r63.clear()
            X.8Oh r1 = r0.A0p
            r62 = r1
            X.4yO r1 = r62.A00()
            boolean r2 = r1 instanceof X.AnonymousClass80O
            if (r2 == 0) goto L_0x029a
            r1 = 1
            if (r82 == 0) goto L_0x029f
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            r2 = 0
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C355098Oo.A06(r0, r2, r1)
        L_0x0292:
            android.view.View[] r0 = new android.view.View[]{r66}
            X.C355098Oo.A06(r0, r2, r1)
            return
        L_0x029a:
            r2 = 0
            r1 = 1
            if (r82 == 0) goto L_0x02a8
            goto L_0x0292
        L_0x029f:
            androidx.recyclerview.widget.RecyclerView r3 = r0.A00
            android.view.View[] r3 = new android.view.View[]{r3}
            X.C355098Oo.A06(r3, r1, r1)
        L_0x02a8:
            android.view.View[] r3 = new android.view.View[]{r66}
            X.C355098Oo.A06(r3, r1, r1)
            int r3 = r69.ordinal()
            switch(r3) {
                case 4: goto L_0x0d4b;
                case 7: goto L_0x0d4b;
                case 8: goto L_0x0d4b;
                case 12: goto L_0x0d4b;
                case 13: goto L_0x0d4b;
                case 17: goto L_0x0d4b;
                case 19: goto L_0x0d4b;
                case 20: goto L_0x0d4b;
                case 21: goto L_0x0d4b;
                case 25: goto L_0x0d4b;
                case 26: goto L_0x0d4b;
                case 27: goto L_0x0d4b;
                case 28: goto L_0x0d4b;
                case 29: goto L_0x0d4b;
                case 30: goto L_0x0d4b;
                case 31: goto L_0x0d4b;
                case 33: goto L_0x0d4b;
                case 35: goto L_0x0d4b;
                case 36: goto L_0x0d4b;
                case 60: goto L_0x0d4b;
                case 61: goto L_0x0d4b;
                case 64: goto L_0x0d4b;
                case 66: goto L_0x0d4b;
                case 67: goto L_0x0d4b;
                case 68: goto L_0x0d4b;
                case 74: goto L_0x0d4b;
                case 75: goto L_0x0d4b;
                case 78: goto L_0x0d4b;
                case 83: goto L_0x0d4b;
                case 84: goto L_0x0d4b;
                default: goto L_0x02b6;
            }
        L_0x02b6:
            r17 = 0
        L_0x02b8:
            if (r79 != 0) goto L_0x0d47
            if (r83 != 0) goto L_0x0d47
            android.view.View r3 = r0.A0N
            r5 = 0
            android.view.View[] r3 = new android.view.View[]{r3}
            X.C355098Oo.A05(r3, r5)
        L_0x02c6:
            if (r81 == 0) goto L_0x02ca
            r17 = 0
        L_0x02ca:
            java.lang.String r3 = "Required value was null."
            if (r4 == 0) goto L_0x0da5
            X.8aL r5 = X.C358088aL.A0o
            r18 = 0
            X.8aL r3 = X.C358088aL.A0p
            X.8aL[] r3 = new X.C358088aL[]{r5, r3}
            boolean r3 = r4.A0V(r3)
            if (r3 != 0) goto L_0x02e2
            r26 = 0
            if (r84 == 0) goto L_0x02e4
        L_0x02e2:
            r26 = 1
        L_0x02e4:
            X.8aL[] r3 = new X.C358088aL[]{r5}
            boolean r3 = r4.A0V(r3)
            if (r3 != 0) goto L_0x02f2
            r24 = 0
            if (r84 == 0) goto L_0x0305
        L_0x02f2:
            r24 = 1
            com.instagram.common.session.UserSession r6 = r0.A0d
            X.0Tu r5 = X.0Tu.A05
            r3 = 36316800346231438(0x8105f00004128e, double:3.030229002749481E-306)
            boolean r3 = X.182.A06(r5, r6, r3)
            r21 = 1
            if (r3 != 0) goto L_0x0307
        L_0x0305:
            r21 = 0
        L_0x0307:
            r3 = r67
            boolean r6 = r3.A0M
            boolean r9 = r3.A0Q
            X.80V r35 = X.AnonymousClass80V.MEDIA_EDIT
            r4 = r35
            r3 = r69
            if (r3 != r4) goto L_0x031c
            if (r78 != 0) goto L_0x031c
            if (r79 != 0) goto L_0x031c
            r4 = 1
            if (r83 == 0) goto L_0x031d
        L_0x031c:
            r4 = 0
        L_0x031d:
            r3 = 0
            if (r90 == 0) goto L_0x0321
            r3 = 1
        L_0x0321:
            if (r4 != 0) goto L_0x0977
            if (r3 != 0) goto L_0x0977
            java.lang.Integer r32 = X.AnonymousClass05K.A0C
            r65 = r32
            r20 = 0
            r41 = 0
            r42 = 0
            r33 = 0
            r6 = 0
            r23 = 0
            r40 = 0
            r7 = 0
            r37 = 0
            r22 = 0
            r31 = 0
            r14 = 0
            r43 = 0
            r28 = 0
            r16 = 0
            r38 = 0
            r8 = 0
            r19 = 0
            r30 = 0
            r29 = 0
            r25 = 0
            r21 = 0
            r24 = 0
            r27 = 0
            r26 = 0
            r15 = 0
        L_0x0358:
            if (r2 == 0) goto L_0x0373
            r44 = r0
            r45 = r14
            r46 = r7
            r47 = r40
            r48 = r23
            r49 = r6
            r50 = r33
            r51 = r8
            r52 = r8
            r53 = r8
            r54 = r18
            A0K(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
        L_0x0373:
            if (r43 == 0) goto L_0x0383
            X.8Bd r4 = r0.A04
            X.8Bd r3 = X.C351968Bd.SMART_TRACKING_PROCESSING_INVALID
            if (r4 == r3) goto L_0x0383
            X.8B2 r3 = r0.A0t
            if (r3 == 0) goto L_0x0974
            boolean r3 = r3.A03
            if (r3 != r1) goto L_0x0974
        L_0x0383:
            r5 = 0
        L_0x0384:
            android.view.View r4 = r0.A0L
            r3 = 0
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r5)
            if (r43 == 0) goto L_0x0397
            X.8Be r5 = r0.A0q
            android.view.View r4 = r0.A0K
            r5.A0D(r4)
        L_0x0397:
            if (r42 != 0) goto L_0x0938
            X.3oV r9 = r0.A0j
            boolean r4 = r9.CVM()
            if (r4 == 0) goto L_0x03ae
        L_0x03a1:
            android.view.View r4 = r9.getView()
            android.view.View[] r5 = new android.view.View[]{r4}
            r4 = r42
            X.C355098Oo.A05(r5, r4)
        L_0x03ae:
            if (r41 == 0) goto L_0x03f0
            X.0eM r10 = r0.A0y
            java.lang.Object r4 = r10.getValue()
            android.view.View r4 = (android.view.View) r4
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L_0x03cf
            com.instagram.common.session.UserSession r4 = r0.A0d
            X.27r r9 = X.27p.A01(r4)
            X.80P r5 = X.AnonymousClass80P.AI_CONTEXTUAL_BACKGROUND
            X.4yO r4 = r62.A00()
            X.4yP r4 = r4.A00
            r9.A14(r4, r5)
        L_0x03cf:
            java.lang.Object r5 = r10.getValue()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.Context r9 = r0.A0F
            r4 = 2130970272(0x7f0406a0, float:1.754925E38)
            int r4 = X.2Yu.A0H(r9, r4)
            int r4 = r9.getColor(r4)
            r5.setColorFilter(r4)
            java.lang.Object r5 = r10.getValue()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER
            r5.setScaleType(r4)
        L_0x03f0:
            X.0eM r4 = r0.A0y
            r54 = r4
            java.lang.Object r4 = r54.getValue()
            android.view.View r4 = (android.view.View) r4
            android.view.View[] r5 = new android.view.View[]{r4}
            r4 = r41
            X.C355098Oo.A05(r5, r4)
            if (r2 == 0) goto L_0x092b
            r5 = r35
            r4 = r69
            if (r4 != r5) goto L_0x0429
            com.instagram.common.session.UserSession r10 = r0.A0d
            X.0Tu r9 = X.0Tu.A05
            r4 = 36327327310887248(0x810f8300013950, double:3.036886297586499E-306)
            boolean r4 = X.182.A06(r9, r10, r4)
            if (r4 == 0) goto L_0x0429
            X.0eM r4 = r0.A15
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 1
            if (r4 == 0) goto L_0x042a
        L_0x0429:
            r5 = 0
        L_0x042a:
            android.view.View r4 = r0.A0M
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r5)
        L_0x0433:
            if (r31 != 0) goto L_0x043d
            X.3oV r4 = r0.A0l
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x044c
        L_0x043d:
            X.3oV r4 = r0.A0l
            android.view.View r4 = r4.getView()
            android.view.View[] r5 = new android.view.View[]{r4}
            r4 = r31
            X.C355098Oo.A05(r5, r4)
        L_0x044c:
            if (r2 == 0) goto L_0x08a2
            if (r8 != 0) goto L_0x0458
            X.3oV r4 = r0.A0g
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x0467
        L_0x0458:
            X.3oV r4 = r0.A0g
            android.view.View r4 = r4.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r3)
            if (r8 != 0) goto L_0x046f
        L_0x0467:
            X.3oV r4 = r0.A0n
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x047c
        L_0x046f:
            X.3oV r4 = r0.A0n
            android.view.View r4 = r4.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r3)
        L_0x047c:
            if (r7 != 0) goto L_0x0486
            X.3oV r4 = r0.A0h
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x0493
        L_0x0486:
            X.3oV r4 = r0.A0h
            android.view.View r4 = r4.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r3)
        L_0x0493:
            if (r6 != 0) goto L_0x049d
            X.3oV r4 = r0.A0i
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x04aa
        L_0x049d:
            X.3oV r4 = r0.A0i
            android.view.View r4 = r4.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r3)
        L_0x04aa:
            r12 = 8
            X.3oV r5 = r0.A0k
            if (r28 == 0) goto L_0x088f
            android.view.View r10 = r5.getView()
            android.view.View[] r4 = new android.view.View[]{r10}
            X.C355098Oo.A05(r4, r1)
            X.8Be r4 = r0.A0q
            X.8BA r4 = r4.A00
            X.846 r5 = r4.A1X
            X.7zw r9 = r5.A00()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r4.A1s
            X.8pz r4 = X.C366978pz.A0f
            r9.A01(r5, r10, r4)
        L_0x04cc:
            if (r20 != 0) goto L_0x04d6
            X.3oV r4 = r0.A0f
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x04fa
        L_0x04d6:
            X.3oV r5 = r0.A0f
            android.view.View r4 = r5.getView()
            android.view.View[] r9 = new android.view.View[]{r4}
            r4 = r20
            X.C355098Oo.A05(r9, r4)
            X.8Be r4 = r0.A0q
            android.view.View r10 = r5.getView()
            X.8BA r4 = r4.A00
            X.846 r5 = r4.A1X
            X.7zw r9 = r5.A00()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r4.A1s
            X.8pz r4 = X.C366978pz.A0J
            r9.A01(r5, r10, r4)
        L_0x04fa:
            android.widget.ImageView r5 = r0.A0a
            android.view.View[] r9 = new android.view.View[]{r5}
            if (r2 == 0) goto L_0x0888
            X.C355098Oo.A05(r9, r3)
        L_0x0505:
            X.80V r11 = X.AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE
            r4 = r69
            if (r4 != r11) goto L_0x0514
            if (r91 != 0) goto L_0x0514
            android.view.View[] r4 = new android.view.View[]{r5}
            X.C355098Oo.A05(r4, r1)
        L_0x0514:
            if (r16 != 0) goto L_0x051e
            X.3oV r4 = r0.A0m
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x054d
        L_0x051e:
            com.instagram.common.session.UserSession r10 = r0.A0d
            X.0Tu r9 = X.0Tu.A05
            r4 = 36327941491211079(0x81101200013b47, double:3.037274707696396E-306)
            boolean r9 = X.182.A06(r9, r10, r4)
            X.3oV r5 = r0.A0m
            android.view.View r4 = r5.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r9)
            X.8Be r4 = r0.A0q
            android.view.View r10 = r5.getView()
            X.8BA r4 = r4.A00
            X.846 r5 = r4.A1X
            X.7zw r9 = r5.A00()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r4.A1s
            X.8pz r4 = X.C366978pz.A11
            r9.A01(r5, r10, r4)
        L_0x054d:
            android.view.View r4 = r0.A0I
            android.view.View[] r5 = new android.view.View[]{r4}
            r4 = r37
            X.C355098Oo.A05(r5, r4)
            android.view.View r4 = r0.A0H
            android.view.View[] r5 = new android.view.View[]{r4}
            r4 = r17
            X.C355098Oo.A05(r5, r4)
            if (r2 == 0) goto L_0x0816
            r5 = r35
            r4 = r69
            if (r4 != r5) goto L_0x05f9
            com.instagram.common.session.UserSession r7 = r0.A0d
            X.0Tu r6 = X.0Tu.A05
            r4 = 36327327310952785(0x810f8300023951, double:3.036886297627945E-306)
            boolean r4 = X.182.A06(r6, r7, r4)
            if (r4 == 0) goto L_0x05f9
            X.0eM r4 = r0.A15
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x05f9
            X.4yO r4 = r62.A00()
            boolean r4 = r4 instanceof X.AnonymousClass80O
            if (r4 == 0) goto L_0x05f2
            android.content.Context r5 = r0.A0F
            r4 = 2131972502(0x7f135196, float:1.9582013E38)
            java.lang.String r43 = r5.getString(r4)
            X.0qQ.A07(r43)
            r4 = 2131238227(0x7f081d53, float:1.8092727E38)
            android.graphics.drawable.Drawable r39 = r5.getDrawable(r4)
            X.Adf r6 = new X.Adf
            r6.<init>(r0)
            r38 = 0
            X.8rI r4 = new X.8rI
            r37 = r4
            r40 = r38
            r41 = r6
            r42 = r38
            r44 = r3
            r45 = r3
            r46 = r3
            r47 = r3
            r48 = r3
            r49 = r3
            r50 = r1
            r51 = r3
            r52 = r3
            r53 = r3
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r6 = r63
            r6.add(r4)
            r4 = 2131972522(0x7f1351aa, float:1.9582054E38)
            java.lang.String r43 = r5.getString(r4)
            X.0qQ.A07(r43)
            r4 = 2131238228(0x7f081d54, float:1.8092729E38)
            android.graphics.drawable.Drawable r39 = r5.getDrawable(r4)
            X.Adg r4 = new X.Adg
            r4.<init>(r0)
            X.8rI r5 = new X.8rI
            r37 = r5
            r41 = r4
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r6.add(r5)
        L_0x05f2:
            boolean r4 = r63.isEmpty()
            r5 = 1
            if (r4 == 0) goto L_0x05fa
        L_0x05f9:
            r5 = 0
        L_0x05fa:
            android.view.View r4 = r0.A0J
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r5)
            X.8GE r4 = r0.A0r
            r5 = r22
            r4.Eql(r5, r3)
            com.instagram.ui.widget.colourwheel.ColourWheelView r5 = r0.A0v
            r4 = 8
            if (r22 == 0) goto L_0x0611
            r4 = 0
        L_0x0611:
            r5.setVisibility(r4)
            boolean r4 = r68.A0F()
            if (r4 != 0) goto L_0x0626
            boolean r4 = r68.A0B()
            if (r4 != 0) goto L_0x0626
            r4 = r67
            boolean r4 = r4.A0O
            if (r4 == 0) goto L_0x0635
        L_0x0626:
            com.instagram.common.session.UserSession r7 = r0.A0d
            X.0Tu r6 = X.0Tu.A05
            r4 = 36325154057368226(0x810d89000032a2, double:3.03551192331008E-306)
            boolean r4 = X.182.A06(r6, r7, r4)
            if (r4 != 0) goto L_0x0637
        L_0x0635:
            r32 = r65
        L_0x0637:
            android.widget.ImageView r5 = r0.A0S
            r4 = r32
            X.C355098Oo.A04(r5, r4)
            android.widget.ImageView r5 = r0.A0T
            android.view.View[] r4 = new android.view.View[]{r5}
            if (r2 == 0) goto L_0x0811
            X.C355098Oo.A05(r4, r3)
        L_0x0649:
            if (r80 == 0) goto L_0x080d
            if (r14 == 0) goto L_0x0660
            X.8Be r4 = r0.A0q
            r4.A0C(r5)
        L_0x0652:
            java.lang.Integer r6 = r68.A03()
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            if (r6 != r4) goto L_0x0660
            r4 = 2131238576(0x7f081eb0, float:1.8093435E38)
            r5.setImageResource(r4)
        L_0x0660:
            android.widget.ImageView r4 = r0.A0V
            int r5 = r4.getVisibility()
            r7 = 0
            if (r5 != 0) goto L_0x066a
            r7 = 1
        L_0x066a:
            if (r2 == 0) goto L_0x0805
            r6 = r35
            r5 = r69
            if (r5 != r6) goto L_0x0683
            X.0eM r5 = r0.A15
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0683
            r6 = 1
            if (r19 != 0) goto L_0x0684
        L_0x0683:
            r6 = 0
        L_0x0684:
            android.view.View[] r5 = new android.view.View[]{r4}
        L_0x0688:
            X.C355098Oo.A05(r5, r6)
            if (r19 == 0) goto L_0x0694
            if (r7 == 0) goto L_0x0691
            if (r80 == 0) goto L_0x0694
        L_0x0691:
            r4.sendAccessibilityEvent(r12)
        L_0x0694:
            android.widget.ImageView r5 = r0.A0U
            android.view.View[] r6 = new android.view.View[]{r5}
            r5 = r25
            X.C355098Oo.A05(r6, r5)
            r5 = r62
            X.8BA r5 = r5.A00
            X.8C9 r5 = r5.A1D
            android.widget.ImageView r5 = r5.A00
            android.view.View[] r6 = new android.view.View[]{r5}
            r5 = r21
            X.C355098Oo.A05(r6, r5)
            android.widget.ImageView r7 = r0.A0Y
            android.view.View[] r6 = new android.view.View[]{r7}
            r5 = r24
            X.C355098Oo.A05(r6, r5)
            if (r24 == 0) goto L_0x06d7
            android.graphics.drawable.Drawable r5 = A00(r0)
            r7.setImageDrawable(r5)
            X.8Be r5 = r0.A0q
            if (r88 == 0) goto L_0x06d7
            X.8BA r5 = r5.A00
            X.846 r6 = r5.A1X
            X.7zw r8 = r6.A00()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r5.A1s
            X.8pz r5 = X.C366978pz.A12
            r8.A01(r6, r7, r5)
        L_0x06d7:
            X.0eM r8 = r0.A10
            java.lang.Object r5 = r8.getValue()
            android.view.View r5 = (android.view.View) r5
            android.view.View[] r5 = new android.view.View[]{r5}
            r6 = r27
            X.C355098Oo.A05(r5, r6)
            X.0eM r7 = r0.A0z
            java.lang.Object r5 = r7.getValue()
            android.view.View r5 = (android.view.View) r5
            android.view.View[] r5 = new android.view.View[]{r5}
            r6 = r26
            X.C355098Oo.A05(r5, r6)
            X.0eM r6 = r0.A12
            java.lang.Object r5 = r6.getValue()
            android.view.View r5 = (android.view.View) r5
            android.view.View[] r5 = new android.view.View[]{r5}
            X.C355098Oo.A05(r5, r15)
            android.widget.ImageView r5 = r0.A0X
            android.view.View[] r5 = new android.view.View[]{r5}
            r9 = r30
            X.C355098Oo.A05(r5, r9)
            android.widget.ImageView r5 = r0.A0Z
            android.view.View[] r9 = new android.view.View[]{r5}
            r5 = r29
            X.C355098Oo.A05(r9, r5)
            android.view.View r5 = r0.A0G
            android.view.View[] r9 = new android.view.View[]{r5}
            if (r2 == 0) goto L_0x07fe
            X.C355098Oo.A05(r9, r3)
        L_0x0729:
            com.instagram.common.session.UserSession r2 = r0.A0d
            android.widget.ImageView r10 = r0.A0R
            r9 = r23
            X.C355098Oo.A01(r10, r2, r9)
            r9 = r69
            if (r9 != r11) goto L_0x073f
            if (r91 != 0) goto L_0x073f
            android.view.View[] r9 = new android.view.View[]{r5}
            X.C355098Oo.A05(r9, r1)
        L_0x073f:
            A0F(r0)
            A0G(r0)
            A0E(r0)
            int r9 = r5.getVisibility()
            if (r9 != 0) goto L_0x075a
            X.846 r10 = r0.A0s
            X.7zw r9 = r10.A00()
            if (r9 == 0) goto L_0x07cf
            boolean r9 = r9.A01
            if (r9 != r1) goto L_0x07cf
        L_0x075a:
            java.lang.Object r3 = r8.getValue()
            X.8pz r2 = X.C366978pz.A0h
            X.0eP r8 = new X.0eP
            r8.<init>(r3, r2)
            java.lang.Object r3 = r7.getValue()
            X.8pz r2 = X.C366978pz.A0g
            X.0eP r7 = new X.0eP
            r7.<init>(r3, r2)
            java.lang.Object r3 = r6.getValue()
            X.8pz r2 = X.C366978pz.A0j
            X.0eP r6 = new X.0eP
            r6.<init>(r3, r2)
            java.lang.Object r5 = r54.getValue()
            X.8pz r3 = X.C366978pz.A0A
            X.0eP r2 = new X.0eP
            r2.<init>(r5, r3)
            X.0eP[] r2 = new X.0eP[]{r8, r7, r6, r2}
            java.util.List r2 = X.0sr.A1P(r2)
            java.util.Iterator r10 = r2.iterator()
        L_0x0792:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0d4f
            java.lang.Object r5 = r10.next()
            X.0eP r5 = (X.0eP) r5
            X.846 r3 = r0.A0s
            X.7zw r2 = r3.A00()
            if (r2 == 0) goto L_0x07ab
            boolean r2 = r2.A01
            if (r2 != r1) goto L_0x07ab
            goto L_0x0792
        L_0x07ab:
            java.lang.Object r9 = r5.A00
            android.view.View r9 = (android.view.View) r9
            int r2 = r9.getVisibility()
            if (r2 != 0) goto L_0x0792
            X.7zw r8 = r3.A00()
            if (r8 == 0) goto L_0x0792
            android.view.View r7 = r0.A0N()
            java.lang.Object r6 = r5.A01
            X.8pz r6 = (X.C366978pz) r6
            X.28D r5 = r13.A01
            X.28D r3 = X.28D.A2x
            r2 = 0
            if (r5 != r3) goto L_0x07cb
            r2 = 1
        L_0x07cb:
            r8.A03(r7, r9, r6, r2)
            goto L_0x0792
        L_0x07cf:
            X.7zw r14 = r10.A00()
            if (r14 == 0) goto L_0x075a
            android.view.View r15 = r0.A0N()
            boolean r9 = r0.A06
            if (r9 != 0) goto L_0x07f4
            if (r89 == 0) goto L_0x07f4
            r0.A06 = r1
            X.8pz r17 = X.C366978pz.A0D
        L_0x07e3:
            r19 = 0
            X.26t r18 = X.26G.A00(r2)
            r16 = r5
            r20 = r3
            r21 = r3
            r14.A02(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x075a
        L_0x07f4:
            boolean r9 = r0.A17
            if (r9 == 0) goto L_0x07fb
            X.8pz r17 = X.C366978pz.A0F
            goto L_0x07e3
        L_0x07fb:
            X.8pz r17 = X.C366978pz.A0E
            goto L_0x07e3
        L_0x07fe:
            r2 = r23
            X.C355098Oo.A05(r9, r2)
            goto L_0x0729
        L_0x0805:
            android.view.View[] r5 = new android.view.View[]{r4}
            r6 = r19
            goto L_0x0688
        L_0x080d:
            if (r14 == 0) goto L_0x0660
            goto L_0x0652
        L_0x0811:
            X.C355098Oo.A05(r4, r14)
            goto L_0x0649
        L_0x0816:
            if (r38 == 0) goto L_0x05f9
            X.4yO r5 = r62.A00()
            X.9QA r4 = X.AnonymousClass9QA.A00
            if (r5 != r4) goto L_0x086b
            if (r6 == 0) goto L_0x0834
            com.instagram.common.session.UserSession r7 = r0.A0d
            X.0Tu r6 = X.0Tu.A05
            r4 = 36319360146742448(0x81084400041cb0, double:3.031847830900133E-306)
            boolean r4 = X.182.A06(r6, r7, r4)
            if (r4 == 0) goto L_0x0834
            A03(r0)
        L_0x0834:
            if (r37 == 0) goto L_0x0839
            A05(r0)
        L_0x0839:
            if (r33 == 0) goto L_0x083e
            A08(r0)
        L_0x083e:
            com.instagram.common.session.UserSession r7 = r0.A0d
            X.0Tu r6 = X.0Tu.A05
            r4 = 36324475452534894(0x810ceb0000306e, double:3.035082770880959E-306)
            boolean r4 = X.182.A06(r6, r7, r4)
            if (r4 == 0) goto L_0x0850
            A07(r0)
        L_0x0850:
            A0A(r0)
            A0B(r0)
            A06(r0)
            if (r16 == 0) goto L_0x05f2
            r4 = 36327941491211079(0x81101200013b47, double:3.037274707696396E-306)
            boolean r4 = X.182.A06(r6, r7, r4)
            if (r4 != 0) goto L_0x05f2
            A09(r0)
            goto L_0x05f2
        L_0x086b:
            boolean r4 = r5 instanceof X.AnonymousClass80O
            if (r4 == 0) goto L_0x05f2
            if (r7 == 0) goto L_0x0874
            A03(r0)
        L_0x0874:
            if (r8 == 0) goto L_0x087c
            A04(r0)
            A0C(r0)
        L_0x087c:
            if (r18 == 0) goto L_0x0881
            A0D(r0)
        L_0x0881:
            if (r33 == 0) goto L_0x05f2
            A08(r0)
            goto L_0x05f2
        L_0x0888:
            r4 = r40
            X.C355098Oo.A05(r9, r4)
            goto L_0x0505
        L_0x088f:
            int r4 = r5.CFV()
            if (r4 == r12) goto L_0x04cc
            android.view.View r4 = r5.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r3)
            goto L_0x04cc
        L_0x08a2:
            if (r8 != 0) goto L_0x08ac
            X.3oV r4 = r0.A0g
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x08bb
        L_0x08ac:
            X.3oV r4 = r0.A0g
            android.view.View r4 = r4.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r8)
            if (r8 != 0) goto L_0x08c3
        L_0x08bb:
            X.3oV r4 = r0.A0n
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x08d0
        L_0x08c3:
            X.3oV r4 = r0.A0n
            android.view.View r4 = r4.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r8)
        L_0x08d0:
            if (r7 != 0) goto L_0x08da
            X.3oV r4 = r0.A0h
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x08e7
        L_0x08da:
            X.3oV r4 = r0.A0h
            android.view.View r4 = r4.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r7)
        L_0x08e7:
            if (r6 != 0) goto L_0x08f1
            X.3oV r4 = r0.A0i
            boolean r4 = r4.CVM()
            if (r4 == 0) goto L_0x04aa
        L_0x08f1:
            X.3oV r5 = r0.A0i
            android.view.View r4 = r5.getView()
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C355098Oo.A05(r4, r6)
            android.view.View r4 = r5.getView()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x04aa
            X.846 r9 = r0.A0s
            X.7zw r4 = r9.A00()
            if (r4 == 0) goto L_0x0916
            boolean r4 = r4.A01
            if (r4 != r1) goto L_0x0916
            goto L_0x04aa
        L_0x0916:
            X.7zw r10 = r9.A00()
            if (r10 == 0) goto L_0x04aa
            android.view.View r9 = r0.A0N()
            android.view.View r5 = r5.getView()
            X.8pz r4 = X.C366978pz.A0B
            r10.A01(r9, r5, r4)
            goto L_0x04aa
        L_0x092b:
            android.view.View r4 = r0.A0M
            android.view.View[] r5 = new android.view.View[]{r4}
            r4 = r33
            X.C355098Oo.A05(r5, r4)
            goto L_0x0433
        L_0x0938:
            com.instagram.common.session.UserSession r4 = r0.A0d
            X.27r r9 = X.27p.A01(r4)
            X.80P r5 = X.AnonymousClass80P.AI_EXPANDER
            X.4yO r4 = r62.A00()
            X.4yP r4 = r4.A00
            r9.A14(r4, r5)
            X.3oV r9 = r0.A0j
            android.view.View r5 = r9.getView()
            r4 = 2131437944(0x7f0b2978, float:1.84978E38)
            android.view.View r5 = r5.requireViewById(r4)
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r5, r4)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.Context r10 = r0.A0F
            r4 = 2130970272(0x7f0406a0, float:1.754925E38)
            int r4 = X.2Yu.A0H(r10, r4)
            int r4 = r10.getColor(r4)
            r5.setColorFilter(r4)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER
            r5.setScaleType(r4)
            goto L_0x03a1
        L_0x0974:
            r5 = 1
            goto L_0x0384
        L_0x0977:
            r3 = r67
            java.lang.String r3 = r3.A0G
            r8 = 0
            if (r3 == 0) goto L_0x097f
            r8 = 1
        L_0x097f:
            X.4yO r3 = r62.A00()
            X.9QA r10 = X.AnonymousClass9QA.A00
            if (r3 != r10) goto L_0x0998
            com.instagram.common.session.UserSession r7 = r0.A0d
            X.0Tu r5 = X.0Tu.A05
            r3 = 36327941491145542(0x81101200003b46, double:3.03727470765495E-306)
            boolean r3 = X.182.A06(r5, r7, r3)
            r16 = 1
            if (r3 != 0) goto L_0x099a
        L_0x0998:
            r16 = 0
        L_0x099a:
            r3 = r67
            java.lang.Integer r4 = r3.A0D
            java.lang.Integer r32 = X.AnonymousClass05K.A0C
            r3 = r32
            if (r4 == r3) goto L_0x09bd
            if (r8 != 0) goto L_0x09bd
            r3 = r67
            boolean r3 = r3.A0U
            if (r3 != 0) goto L_0x09bd
            java.lang.Integer r4 = r68.A03()
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            if (r4 != r3) goto L_0x09bd
            android.content.Context r3 = r0.A0F
            boolean r3 = X.C305756Jk.A00(r3)
            r5 = 1
            if (r3 != 0) goto L_0x09be
        L_0x09bd:
            r5 = 0
        L_0x09be:
            X.8Cl r3 = r67.A03()
            if (r3 == 0) goto L_0x09d2
            com.instagram.common.gallery.Medium r3 = r3.A0F
            if (r3 == 0) goto L_0x09d2
            java.lang.Boolean r3 = r3.A0I
            if (r3 == 0) goto L_0x09d2
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x09e0
        L_0x09d2:
            X.7zv r4 = r67.A04()
            if (r4 == 0) goto L_0x09e7
            boolean r3 = r4.A1I
            if (r3 != 0) goto L_0x09e0
            boolean r3 = r4.A13
            if (r3 == 0) goto L_0x09e7
        L_0x09e0:
            X.4yO r3 = r62.A00()
            r4 = 1
            if (r3 == r10) goto L_0x09e8
        L_0x09e7:
            r4 = 0
        L_0x09e8:
            if (r5 != 0) goto L_0x09ee
            r20 = 0
            if (r4 == 0) goto L_0x09f0
        L_0x09ee:
            r20 = 1
        L_0x09f0:
            if (r8 != 0) goto L_0x09fa
            boolean r3 = r68.A0D()
            r28 = 1
            if (r3 != 0) goto L_0x09fc
        L_0x09fa:
            r28 = 0
        L_0x09fc:
            boolean r3 = r68.A0G()
            if (r3 != 0) goto L_0x0a18
            com.instagram.common.session.UserSession r5 = r0.A0d
            X.8ka r4 = X.C255193tj.A00(r5)
            if (r4 == 0) goto L_0x0a18
            int r3 = r4.A00
            if (r3 <= 0) goto L_0x0a18
            boolean r3 = X.C255193tj.A03(r5, r4)
            if (r3 == 0) goto L_0x0a18
            r20 = 0
            r28 = 0
        L_0x0a18:
            X.4yO r5 = r62.A00()
            if (r26 != 0) goto L_0x0d43
            X.28D r4 = r13.A01
            X.28D r3 = X.28D.A2D
            if (r4 == r3) goto L_0x0d43
            if (r6 != 0) goto L_0x0d43
            if (r87 != 0) goto L_0x0d43
            r3 = r67
            boolean r3 = r3.A0q
            if (r3 != 0) goto L_0x0d43
            android.content.Context r3 = r0.A0F
            boolean r3 = X.C305756Jk.A00(r3)
            if (r3 == 0) goto L_0x0d43
            com.instagram.common.session.UserSession r4 = r0.A0d
            r3 = r18
            X.8o0 r6 = X.C365958nx.A00(r4, r5, r3)
            X.82p r4 = r0.A02
            X.84f r3 = r0.A19
            boolean r3 = r6.A00(r3, r4)
            if (r3 == 0) goto L_0x0a4b
            r6 = 1
            if (r27 == 0) goto L_0x0a4c
        L_0x0a4b:
            r6 = 0
        L_0x0a4c:
            if (r79 != 0) goto L_0x0a60
            if (r83 != 0) goto L_0x0a60
            java.lang.Integer r4 = r68.A03()
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            if (r4 != r3) goto L_0x0a60
            X.87s r3 = r0.A0B
            if (r3 == 0) goto L_0x0d31
            X.4gw r3 = r3.A04
            if (r3 == 0) goto L_0x0d31
        L_0x0a60:
            r7 = 0
        L_0x0a61:
            if (r2 != 0) goto L_0x0d22
            if (r7 == 0) goto L_0x0d22
            r6 = 0
        L_0x0a66:
            android.content.Context r3 = r0.A0F
            r29 = r3
            com.instagram.common.session.UserSession r8 = r0.A0d
            X.82p r3 = r0.A02
            X.82o r11 = r3.A02
            boolean r3 = X.0qQ.A0K(r5, r10)
            r43 = 0
            if (r3 == 0) goto L_0x0cbf
            boolean r3 = r11.A0B()
            if (r3 != 0) goto L_0x0a88
            X.82Y r4 = r11.A01
            boolean r3 = r4.A0O
            if (r3 != 0) goto L_0x0a88
            boolean r3 = r4.A0J
            if (r3 == 0) goto L_0x0cbf
        L_0x0a88:
            boolean r3 = X.0qQ.A0K(r5, r10)
            r42 = 1
            if (r3 == 0) goto L_0x0cbb
            X.82p r3 = r0.A02
            X.82o r3 = r3.A02
            X.8nd r4 = r3.A01()
            X.8nd r3 = X.C365758nd.A04
            if (r4 != r3) goto L_0x0cbb
            X.0Tu r11 = X.0Tu.A05
            r3 = 36329504859242656(0x81117e000040a0, double:3.038263387934743E-306)
            boolean r3 = X.182.A06(r11, r8, r3)
            if (r3 == 0) goto L_0x0cbb
            X.8B2 r3 = r0.A0t
            if (r3 == 0) goto L_0x0cbb
            X.05G r3 = r3.A00
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != r1) goto L_0x0cbb
        L_0x0abb:
            X.8pr r4 = X.C366898pr.A00
            r3 = r68
            boolean r41 = r4.A00(r8, r5, r3)
            boolean r3 = X.C355098Oo.A07(r68)
            if (r3 == 0) goto L_0x0ad1
            X.28D r4 = r13.A01
            X.28D r3 = X.28D.A2D
            r33 = 1
            if (r4 != r3) goto L_0x0ad3
        L_0x0ad1:
            r33 = 0
        L_0x0ad3:
            boolean r25 = r62.A03()
            r19 = r25 ^ 1
            boolean r3 = r68.A0C()
            if (r3 != 0) goto L_0x0aff
            X.802 r3 = r67.A02()
            if (r3 == 0) goto L_0x0aef
            X.802 r3 = r67.A02()
            if (r3 == 0) goto L_0x0aff
            boolean r3 = r3.A0F
            if (r3 != r1) goto L_0x0aff
        L_0x0aef:
            if (r24 != 0) goto L_0x0aff
            X.28D r4 = r13.A01
            X.28D r3 = X.28D.A2D
            if (r4 == r3) goto L_0x0aff
            if (r9 != 0) goto L_0x0aff
            boolean r3 = r5 instanceof X.AnonymousClass80O
            r37 = 1
            if (r3 == 0) goto L_0x0b01
        L_0x0aff:
            r37 = 0
        L_0x0b01:
            boolean r3 = r0.A0E
            if (r3 != 0) goto L_0x0b1f
            r3 = r62
            X.8BA r3 = r3.A00
            X.82o r4 = r3.A14
            X.6if r3 = r3.A1g
            java.lang.Object r3 = r3.get()
            X.8ME r3 = (X.AnonymousClass8ME) r3
            java.util.ArrayList r3 = r3.A17()
            boolean r3 = X.C366908ps.A00(r4, r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0b22
        L_0x0b1f:
            r3 = 1
            if (r80 == 0) goto L_0x0b23
        L_0x0b22:
            r3 = 0
        L_0x0b23:
            r0.A0E = r3
            r3 = r62
            X.8BA r3 = r3.A00
            boolean r22 = X.AnonymousClass8BA.A0N(r3)
            if (r26 != 0) goto L_0x0b35
            if (r18 != 0) goto L_0x0b35
            r23 = 1
            if (r27 == 0) goto L_0x0b37
        L_0x0b35:
            r23 = 0
        L_0x0b37:
            if (r24 == 0) goto L_0x0b3d
            r40 = 0
            if (r21 == 0) goto L_0x0b3f
        L_0x0b3d:
            r40 = 1
        L_0x0b3f:
            X.8C9 r3 = r3.A1D
            android.widget.ImageView r3 = r3.A00
            if (r3 == 0) goto L_0x0b53
            java.lang.Integer r4 = r68.A03()
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            if (r4 == r3) goto L_0x0b53
            if (r26 != 0) goto L_0x0b53
            r21 = 1
            if (r18 == 0) goto L_0x0b55
        L_0x0b53:
            r21 = 0
        L_0x0b55:
            if (r79 != 0) goto L_0x0b69
            if (r83 != 0) goto L_0x0b69
            java.lang.Integer r4 = r68.A03()
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            if (r4 != r3) goto L_0x0b69
            X.87s r3 = r0.A0B
            if (r3 == 0) goto L_0x0caa
            X.4gw r3 = r3.A04
            if (r3 == 0) goto L_0x0caa
        L_0x0b69:
            r14 = 0
        L_0x0b6a:
            if (r5 != r10) goto L_0x0ca6
            X.28D r4 = r13.A01
            X.28D r3 = X.28D.A2D
            if (r4 == r3) goto L_0x0ca6
            if (r18 != 0) goto L_0x0ca6
            if (r9 != 0) goto L_0x0ca6
            java.lang.Boolean r3 = X.C349167zh.A00(r8)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0c97
            X.0Tu r10 = X.0Tu.A05
            r3 = 36319360146480303(0x81084400001caf, double:3.031847830734351E-306)
            boolean r3 = X.182.A06(r10, r8, r3)
            if (r3 == 0) goto L_0x0c97
        L_0x0b8d:
            r24 = 1
        L_0x0b8f:
            java.lang.Integer r3 = r68.A03()
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            if (r3 != r4) goto L_0x0ba1
            if (r14 == 0) goto L_0x0ba1
            boolean r3 = X.AnonymousClass30D.A02(r8)
            r39 = 1
            if (r3 == 0) goto L_0x0ba3
        L_0x0ba1:
            r39 = 0
        L_0x0ba3:
            java.lang.Integer r3 = r68.A03()
            if (r3 == r4) goto L_0x0bb5
            if (r26 != 0) goto L_0x0bb5
            X.28D r10 = r13.A01
            X.28D r3 = X.28D.A2D
            if (r10 == r3) goto L_0x0bb5
            if (r18 != 0) goto L_0x0bb5
            if (r9 == 0) goto L_0x0bc1
        L_0x0bb5:
            java.lang.Integer r3 = r68.A03()
            if (r3 != r4) goto L_0x0c93
            if (r2 != 0) goto L_0x0c93
            if (r39 == 0) goto L_0x0c93
            if (r33 == 0) goto L_0x0c93
        L_0x0bc1:
            r38 = 1
        L_0x0bc3:
            X.8Cl r3 = r67.A03()
            if (r3 == 0) goto L_0x0bf9
            boolean r3 = r3.A0E()
            if (r3 != r1) goto L_0x0bf9
        L_0x0bcf:
            r27 = 0
            r26 = 0
            r15 = 0
        L_0x0bd4:
            r3 = r68
            boolean r30 = X.C366928pu.A00(r8, r5, r3)
            java.lang.Integer r3 = r68.A03()
            if (r3 != r4) goto L_0x0bf0
            X.88B r3 = r0.A1B
            if (r3 == 0) goto L_0x0bf0
            X.82i r3 = r3.A00
            if (r3 == 0) goto L_0x0bf7
            X.8JI r4 = r3.A00
        L_0x0bea:
            X.8JI r3 = X.AnonymousClass8JI.REMIX
            r29 = 1
            if (r4 == r3) goto L_0x0bf2
        L_0x0bf0:
            r29 = 0
        L_0x0bf2:
            r18 = r39
            r8 = r2
            goto L_0x0358
        L_0x0bf7:
            r4 = 0
            goto L_0x0bea
        L_0x0bf9:
            X.8pt r3 = X.C366918pt.A00
            X.28D r11 = r13.A01
            X.8nd r10 = r68.A01()
            X.802 r12 = r67.A02()
            r9 = 0
            if (r12 == 0) goto L_0x0c09
            r9 = 1
        L_0x0c09:
            boolean r9 = r3.A00(r11, r5, r10, r9)
            if (r9 == 0) goto L_0x0bcf
            java.util.List r10 = A01(r0)
            r9 = 10
            int r9 = X.0Yv.A1E(r10, r9)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            java.util.Iterator r26 = r10.iterator()
            r10 = 0
        L_0x0c23:
            boolean r9 = r26.hasNext()
            if (r9 == 0) goto L_0x0c7a
            java.lang.Object r9 = r26.next()
            int r18 = r10 + 1
            if (r10 >= 0) goto L_0x0c39
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c39:
            X.8hK r9 = (X.C362088hK) r9
            int r15 = r9.A04
            r11 = r29
            java.lang.String r50 = r11.getString(r15)
            X.0qQ.A07(r50)
            int r15 = r9.A00
            android.graphics.drawable.Drawable r46 = r11.getDrawable(r15)
            X.Adu r11 = new X.Adu
            r11.<init>(r0, r9, r10)
            r45 = 0
            r51 = 0
            X.8rI r9 = new X.8rI
            r44 = r9
            r47 = r45
            r48 = r11
            r49 = r45
            r52 = r51
            r53 = r51
            r54 = r51
            r55 = r51
            r56 = r51
            r57 = r1
            r58 = r51
            r59 = r51
            r60 = r51
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            r12.add(r9)
            r10 = r18
            goto L_0x0c23
        L_0x0c7a:
            X.0eM r9 = r0.A11
            java.lang.Object r9 = r9.getValue()
            X.8Ov r9 = (X.C355148Ov) r9
            r9.A02(r12)
            boolean r27 = r3.A02(r8)
            boolean r26 = r3.A01(r8)
            boolean r15 = r3.A03(r8)
            goto L_0x0bd4
        L_0x0c93:
            r38 = 0
            goto L_0x0bc3
        L_0x0c97:
            X.0Tu r10 = X.0Tu.A06
            r3 = 36323960056458883(0x810c7300002e83, double:3.034756832327156E-306)
            boolean r3 = X.182.A06(r10, r8, r3)
            if (r3 == 0) goto L_0x0ca6
            goto L_0x0b8d
        L_0x0ca6:
            r24 = 0
            goto L_0x0b8f
        L_0x0caa:
            X.80e r3 = X.C3493880e.A00
            if (r5 != r3) goto L_0x0cb2
            boolean r3 = r0.A1D
            if (r3 != 0) goto L_0x0b69
        L_0x0cb2:
            boolean r3 = X.AnonymousClass30D.A08(r8)
            r14 = 1
            if (r3 != 0) goto L_0x0b6a
            goto L_0x0b69
        L_0x0cbb:
            r42 = 0
            goto L_0x0abb
        L_0x0cbf:
            X.82Y r3 = r11.A01
            X.8Cl r11 = r3.A03()
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x0d07
            boolean r4 = X.0qQ.A0K(r10, r5)
            if (r4 == 0) goto L_0x0d07
            X.8Yz r3 = r3.A0X
            if (r3 == 0) goto L_0x0ce3
            X.80m r3 = r3.A09
            java.lang.Object r4 = r3.A00
            java.util.Set r4 = (java.util.Set) r4
            X.8aL r3 = X.C358088aL.A0C
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0ce3
            goto L_0x0a88
        L_0x0ce3:
            int r3 = r11.A09
            float r4 = (float) r3
            float r4 = r4 * r15
            int r3 = r11.A06
            float r3 = (float) r3
            float r4 = r4 / r3
            int r3 = r11.A07
            int r3 = r3 % 180
            if (r3 == 0) goto L_0x0cf3
            float r4 = r15 / r4
        L_0x0cf3:
            r3 = 1058013184(0x3f100000, float:0.5625)
            float r4 = r4 - r3
            float r4 = java.lang.Math.abs(r4)
            r3 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0a88
            boolean r43 = X.AnonymousClass8KI.A00(r8)
            goto L_0x0a88
        L_0x0d07:
            X.7zv r3 = r3.A04()
            if (r3 == 0) goto L_0x0a88
            int r4 = r3.A0K
            float r4 = (float) r4
            float r4 = r4 * r15
            int r3 = r3.A08
            float r3 = (float) r3
            float r4 = r4 / r3
            r3 = 1058180956(0x3f128f5c, float:0.5725)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0a88
            boolean r43 = X.0qQ.A0K(r10, r5)
            goto L_0x0a88
        L_0x0d22:
            if (r6 == 0) goto L_0x0a66
            if (r11 == 0) goto L_0x0a66
            com.instagram.common.session.UserSession r3 = r0.A0d
            X.27r r3 = X.27p.A01(r3)
            r3.A0g()
            goto L_0x0a66
        L_0x0d31:
            com.instagram.common.session.UserSession r8 = r0.A0d
            X.0Tu r7 = X.0Tu.A05
            r3 = 36323805438029337(0x810c4f00062e19, double:3.0346590510097127E-306)
            boolean r3 = X.182.A06(r7, r8, r3)
            r7 = 1
            if (r3 != 0) goto L_0x0a61
            goto L_0x0a60
        L_0x0d43:
            r18 = r6
            goto L_0x0a4b
        L_0x0d47:
            r17 = 1
            goto L_0x02c6
        L_0x0d4b:
            r17 = 1
            goto L_0x02b8
        L_0x0d4f:
            android.content.Context r1 = r0.A0F
            android.content.res.Resources r5 = r1.getResources()
            android.view.ViewGroup$LayoutParams r2 = r66.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r2, r1)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r2.getMarginStart()
            int r8 = r2.getMarginEnd()
            int r8 = r8 + r1
            A0I(r0)
            X.0eM r1 = r0.A14
            java.lang.Object r3 = r1.getValue()
            X.8q2 r3 = (X.C367008q2) r3
            r1 = 2131165250(0x7f070042, float:1.7944712E38)
            int r9 = r5.getDimensionPixelSize(r1)
            r1 = 2131165293(0x7f07006d, float:1.79448E38)
            int r10 = r5.getDimensionPixelSize(r1)
            android.view.View[] r2 = A0M(r0)
            r1 = 29
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            android.view.View[] r1 = (android.view.View[]) r1
            r5 = r3
            r6 = r66
            r7 = r1
            r5.A00(r6, r7, r8, r9, r10)
            boolean r1 = A0L(r0)
            r0 = 2131238083(0x7f081cc3, float:1.8092435E38)
            if (r1 == 0) goto L_0x0da1
            r0 = 2131239020(0x7f08206c, float:1.8094335E38)
        L_0x0da1:
            r4.setImageResource(r0)
            return
        L_0x0da5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355048Oj.A0O(X.82p, X.80V, X.80X, java.lang.Integer, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
