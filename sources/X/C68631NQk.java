package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import java.util.List;
import java.util.Map;

/* renamed from: X.NQk  reason: case insensitive filesystem */
public final class C68631NQk extends C268694dq {
    public final Context A00;
    public final UserSession A01;
    public final Integer A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final List A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Map A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final Paint A0F;
    public final Paint A0G;

    public final void draw(Canvas canvas) {
        Map map;
        0qQ.A0B(canvas, 0);
        if (!AnonymousClass4AJ.A09(this.A01) || this.A0D) {
            float A062 = ((float) JTP.A06(this)) / 2.0f;
            float min = Math.min(new float[]{(float) AnonymousClass7TF.A06(this), A062}[0], A062);
            canvas.drawCircle((float) AnonymousClass7TF.A04(this), (float) getBounds().centerY(), min - 1.0f, this.A0F);
            canvas.drawCircle((float) AnonymousClass7TF.A04(this), (float) getBounds().centerY(), min, this.A0G);
        }
        int i = 0;
        for (Object next : this.A03) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            Drawable drawable = (Drawable) next;
            int intValue = this.A02.intValue();
            if (intValue == 0) {
                map = this.A09;
            } else if (intValue == 1) {
                map = this.A05;
            } else if (intValue == 2) {
                map = this.A0B;
            } else if (intValue == 3) {
                map = this.A07;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            Rect rect = (Rect) C51968G9o.A10(map, i);
            if (rect != null) {
                drawable.setBounds(rect);
                drawable.draw(canvas);
            }
            i = i2;
        }
    }

    public final void onBoundsChange(Rect rect) {
        Rect A082;
        Rect A083;
        Rect A084;
        int A022;
        int A023;
        int A024;
        double A012;
        Rect rect2 = rect;
        0qQ.A0B(rect2, 0);
        super.onBoundsChange(rect2);
        UserSession userSession = this.A01;
        boolean A092 = AnonymousClass4AJ.A09(userSession);
        Integer A0q = C66580MXl.A0q();
        if (!A092 || !this.A0D) {
            boolean A093 = AnonymousClass4AJ.A09(userSession);
            Map map = this.A09;
            double A002 = C66580MXl.A00(rect2);
            if (A093) {
                A082 = C66581MXm.A08(C66580MXl.A01(rect2) * 0.27d, C66580MXl.A02(C66581MXm.A00(rect2, 0, C66580MXl.A0C(C66580MXl.A02(A002, 0.081d), C66582MXn.A02(rect2, 0.081d), C66582MXn.A03(rect2, 0.081d), C66582MXn.A02(rect2, 0.081d)), map), 0.04d), C66580MXl.A02(C66580MXl.A01(rect2), 0.162d), C66580MXl.A02(C66580MXl.A00(rect2), 0.392d));
                A083 = C66581MXm.A08(C66580MXl.A01(rect2) * 0.973d, C66580MXl.A02(C66580MXl.A00(rect2), 0.554d), C66580MXl.A02(C66580MXl.A01(rect2), 0.595d), C66580MXl.A02(C66580MXl.A00(rect2), 0.932d));
                A084 = C66581MXm.A08(C66580MXl.A01(rect2) * 0.432d, C66580MXl.A02(C66580MXl.A00(rect2), 0.649d), C66580MXl.A02(C66580MXl.A01(rect2), 0.243d), C66580MXl.A02(C66580MXl.A00(rect2), 0.027d));
                A022 = C66580MXl.A02(C66580MXl.A00(rect2), 0.283d);
                A023 = C66580MXl.A02(C66580MXl.A01(rect2), 0.757d);
                A024 = C66580MXl.A02(C66580MXl.A00(rect2), 0.473d);
                A012 = C66580MXl.A01(rect2) * 0.0d;
            } else {
                map.put(0, C66580MXl.A0C(C66580MXl.A02(A002, 0.208d), C66582MXn.A02(rect2, 0.208d), C66582MXn.A03(rect2, 0.791d), C66582MXn.A02(rect2, 0.791d)));
                Map map2 = this.A05;
                map2.put(1, C66581MXm.A08(C66580MXl.A01(rect2) * 0.819d, C66580MXl.A02(C66581MXm.A00(rect2, 0, C66581MXm.A08(C66580MXl.A01(rect2) * 0.625d, C66580MXl.A02(C66580MXl.A00(rect2), 0.194d), C66580MXl.A02(C66580MXl.A01(rect2), 0.236d), C66580MXl.A02(C66580MXl.A00(rect2), 0.583d)), map2), 0.541d), C66580MXl.A02(C66580MXl.A01(rect2), 0.514d), C66580MXl.A02(C66580MXl.A00(rect2), 0.846d)));
                Map map3 = this.A0B;
                map3.put(A0q, C66581MXm.A08(C66580MXl.A01(rect2) * 0.833d, C66580MXl.A02(C66581MXm.A00(rect2, 1, C66580MXl.A0C(C66580MXl.A02(C66581MXm.A00(rect2, 0, C66581MXm.A08(C66580MXl.A01(rect2) * 0.555d, C66582MXn.A03(rect2, 0.236d), C66580MXl.A02(C66580MXl.A01(rect2), 0.166d), C66582MXn.A03(rect2, 0.625d)), map3), 0.583d), C66580MXl.A02(C66580MXl.A01(rect2), 0.444d), C66580MXl.A02(C66580MXl.A00(rect2), 0.888d), C66582MXn.A02(rect2, 0.888d)), map3), 0.277d), C66580MXl.A02(C66580MXl.A01(rect2), 0.583d), C66580MXl.A02(C66580MXl.A00(rect2), 0.527d)));
                Map map4 = this.A07;
                map4.put(A0q, C66581MXm.A08(C66580MXl.A01(rect2) * 0.847d, C66580MXl.A02(C66581MXm.A00(rect2, 1, C66580MXl.A0C(C66580MXl.A02(C66581MXm.A00(rect2, 0, C66581MXm.A08(C66580MXl.A01(rect2) * 0.541d, C66580MXl.A02(C66580MXl.A00(rect2), 0.18d), C66580MXl.A02(C66580MXl.A01(rect2), 0.152d), C66580MXl.A02(C66580MXl.A00(rect2), 0.569d)), map4), 0.597d), C66580MXl.A02(C66580MXl.A01(rect2), 0.319d), C66580MXl.A02(C66580MXl.A00(rect2), 0.875d), C66582MXn.A02(rect2, 0.597d)), map4), 0.263d), C66582MXn.A02(rect2, 0.597d), C66580MXl.A02(C66580MXl.A00(rect2), 0.513d)));
                map4.put(3, C66580MXl.A0C(C66582MXn.A03(rect2, 0.569d), C66580MXl.A02(C66580MXl.A01(rect2), 0.652d), C66580MXl.A02(C66580MXl.A00(rect2), 0.736d), C66582MXn.A02(rect2, 0.819d)));
                return;
            }
        } else {
            A082 = C66580MXl.A0C(C66580MXl.A02(C66581MXm.A00(rect2, 0, C66580MXl.A0C(C66582MXn.A03(rect2, 0.208d), C66582MXn.A02(rect2, 0.208d), C66582MXn.A03(rect2, 0.791d), C66582MXn.A02(rect2, 0.791d)), this.A09), 0.115d), C66580MXl.A02(C66580MXl.A01(rect2), 0.149d), C66582MXn.A03(rect2, 0.115d), C66582MXn.A02(rect2, 0.149d));
            A083 = C66580MXl.A0C(C66580MXl.A02(C66580MXl.A00(rect2), 0.543d), C66580MXl.A02(C66580MXl.A01(rect2), 0.512d), C66580MXl.A02(C66580MXl.A00(rect2), 0.1d), C66582MXn.A02(rect2, 0.1d));
            A084 = C66580MXl.A0C(C66580MXl.A02(C66580MXl.A00(rect2), 0.613d), C66580MXl.A02(C66580MXl.A01(rect2), 0.216d), C66580MXl.A02(C66580MXl.A00(rect2), 0.027d), C66582MXn.A02(rect2, 0.216d));
            A022 = C66580MXl.A02(C66580MXl.A00(rect2), 0.317d);
            A023 = C66580MXl.A02(C66580MXl.A01(rect2), 0.648d);
            A024 = C66580MXl.A02(C66580MXl.A00(rect2), 0.473d);
            A012 = C66580MXl.A01(rect2) * 0.0d;
        }
        Rect A085 = C66581MXm.A08(A012, A022, A023, A024);
        Map map5 = this.A05;
        map5.put(0, A082);
        map5.put(1, A083);
        Map map6 = this.A0B;
        map6.put(0, A082);
        map6.put(1, A083);
        map6.put(A0q, A084);
        Map map7 = this.A07;
        map7.put(0, A082);
        map7.put(1, A083);
        map7.put(A0q, A084);
        map7.put(3, A085);
    }

    public C68631NQk(Context context, UserSession userSession, List list, boolean z, boolean z2) {
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        Resources resources3;
        int i3;
        Resources resources4;
        int i4;
        Resources resources5;
        int i5;
        Resources resources6;
        int i6;
        Integer num;
        Context context2;
        int i7;
        Map map;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        Context context3 = context;
        this.A00 = context3;
        this.A01 = userSession2;
        List list2 = list;
        this.A04 = list2;
        this.A0D = z;
        this.A0E = z2;
        if (!AnonymousClass4AJ.A09(userSession2) || z) {
            resources = context3.getResources();
            i = R.dimen.account_group_management_title_text_horizontal_padding;
        } else {
            resources = context3.getResources();
            i = R.dimen.action_bar_plus_shadow_height;
        }
        float dimension = resources.getDimension(i);
        if (!AnonymousClass4AJ.A09(userSession2) || !z) {
            boolean A092 = AnonymousClass4AJ.A09(userSession2);
            resources2 = context3.getResources();
            i2 = R.dimen.add_account_icon_circle_radius;
            if (A092) {
                i2 = R.dimen.account_group_management_title_text_horizontal_padding;
            }
        } else {
            resources2 = context3.getResources();
            i2 = R.dimen.audition_flow_picker_subtitle_margin_bottom;
        }
        float dimension2 = resources2.getDimension(i2);
        if (!AnonymousClass4AJ.A09(userSession2) || !z) {
            boolean A093 = AnonymousClass4AJ.A09(userSession2);
            resources3 = context3.getResources();
            i3 = R.dimen.ai_agent_share_profile_sticker_padding;
            if (A093) {
                i3 = R.dimen.add_account_icon_circle_radius;
            }
        } else {
            resources3 = context3.getResources();
            i3 = R.dimen.prompt_facepilev2_stacked_pog_avatar_large_width;
        }
        float dimension3 = resources3.getDimension(i3);
        if (!AnonymousClass4AJ.A09(userSession2) || !z) {
            boolean A094 = AnonymousClass4AJ.A09(userSession2);
            resources4 = context3.getResources();
            i4 = R.dimen.abc_dialog_padding_top_material;
            if (A094) {
                i4 = R.dimen.abc_dialog_padding_material;
            }
        } else {
            resources4 = context3.getResources();
            i4 = R.dimen.abc_select_dialog_padding_start_material;
        }
        float dimension4 = resources4.getDimension(i4);
        if (!AnonymousClass4AJ.A09(userSession2) || !z) {
            boolean A095 = AnonymousClass4AJ.A09(userSession2);
            resources5 = context3.getResources();
            i5 = R.dimen.account_discovery_bottom_gap;
            if (A095) {
                i5 = R.dimen.abc_dialog_padding_top_material;
            }
        } else {
            resources5 = context3.getResources();
            i5 = R.dimen.ad4ad_button_bottom_margin;
        }
        float dimension5 = resources5.getDimension(i5);
        if (!AnonymousClass4AJ.A09(userSession2) || !z) {
            boolean A096 = AnonymousClass4AJ.A09(userSession2);
            resources6 = context3.getResources();
            i6 = R.dimen.abc_select_dialog_padding_start_material;
            if (A096) {
                i6 = R.dimen.add_account_icon_circle_radius;
            }
        } else {
            resources6 = context3.getResources();
            i6 = R.dimen.prompt_facepilev2_stacked_pog_avatar_large_width;
        }
        float dimension6 = resources6.getDimension(i6);
        this.A0A = AnonymousClass7TF.A0w(0, Integer.valueOf((int) (dimension * 1.0f)));
        Integer valueOf = Integer.valueOf((int) (dimension2 * 1.0f));
        0eP A1L = AnonymousClass7TE.A1L(0, valueOf);
        Integer valueOf2 = Integer.valueOf((int) (dimension3 * 1.0f));
        this.A06 = DbY.A0p(1, valueOf2, A1L);
        0eP A1L2 = AnonymousClass7TE.A1L(0, valueOf);
        0eP A1L3 = AnonymousClass7TE.A1L(1, valueOf2);
        Integer valueOf3 = Integer.valueOf((int) (dimension4 * 1.0f));
        this.A0C = DbY.A0q(2, valueOf3, A1L2, A1L3);
        this.A08 = 0Yt.A06(AnonymousClass7TH.A0h(3, Integer.valueOf((int) (dimension5 * 1.0f)), AnonymousClass7TE.A1L(0, valueOf), AnonymousClass7TF.A0x(1, (int) (dimension6 * 1.0f)), AnonymousClass7TE.A1L(2, valueOf3)));
        this.A09 = AnonymousClass7TE.A1H();
        this.A05 = AnonymousClass7TE.A1H();
        this.A0B = AnonymousClass7TE.A1H();
        this.A07 = AnonymousClass7TE.A1H();
        Paint A0V = AnonymousClass7TE.A0V(1);
        AnonymousClass7TE.A1N(context3, A0V, R.color.igds_secondary_background);
        A0V.setStyle(Paint.Style.FILL);
        this.A0F = A0V;
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        AnonymousClass7TE.A1N(context3, A0V2, R.color.igds_photo_border);
        A0V2.setStyle(Paint.Style.STROKE);
        this.A0G = A0V2;
        int size = list2.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A0C;
                }
            }
            num = AnonymousClass05K.A01;
        } else {
            if (!z2) {
                num = AnonymousClass05K.A00;
            }
            num = AnonymousClass05K.A01;
        }
        this.A02 = num;
        List list3 = this.A04;
        int i8 = 0;
        for (Object next : list3) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            ImageUrlBase imageUrlBase = (ImageUrlBase) next;
            if (i8 < list3.size()) {
                int intValue = this.A02.intValue();
                if (intValue == 0) {
                    map = this.A0A;
                } else if (intValue == 1) {
                    map = this.A06;
                } else if (intValue == 2) {
                    map = this.A0C;
                } else if (intValue == 3) {
                    map = this.A08;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                Number number = (Number) C51968G9o.A10(map, i8);
                if (number != null) {
                    C244303ay r10 = new C244303ay(imageUrlBase, "PromptNotePogAvatarDrawable", number.intValue(), 0, 0, this.A00.getColor(R.color.fds_transparent));
                    r10.setCallback(this);
                    this.A03.add(r10);
                }
            }
            i8 = i9;
        }
        if (this.A0E) {
            if (!AnonymousClass4AJ.A09(this.A01) || this.A0D) {
                context2 = this.A00;
                i7 = R.drawable.prompt_pog_avatar_plus_icon;
            } else {
                context2 = this.A00;
                i7 = R.drawable.prompt_pog_avatar_plus_icon_facepile_v2;
            }
            Drawable drawable = context2.getDrawable(i7);
            if (drawable != null) {
                this.A03.add(drawable);
            }
        }
    }

    public final List A07() {
        return this.A03;
    }

    public final void setAlpha(int i) {
        this.A0F.setAlpha(i);
        invalidateSelf();
    }
}
