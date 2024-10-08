package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.GradientDrawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import com.instagram.ui.widget.colourwheel.ColourWheelView;
import java.util.ArrayList;
import java.util.Iterator;

public final class AIY {
    public int A00;
    public C352048Bm A01;
    public ALv A02;
    public C358868bb A03;
    public boolean A04;
    public boolean A05 = true;
    public final Context A06;
    public final View A07;
    public final 2cs A08;
    public final UserSession A09;
    public final C252063oV A0A;
    public final AnonymousClass8GE A0B;
    public final C39657A3x A0C;
    public final AnonymousClass80F A0D;
    public final 1Av A0E;
    public final ColourWheelView A0F;

    public static void A01(AIY aiy, boolean z) {
        C252063oV r3;
        String str;
        C352048Bm r0 = aiy.A01;
        if (r0 == null) {
            0kD.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null while trying to move to next background");
            return;
        }
        r0.A00();
        if (z) {
            1Av r1 = aiy.A0E;
            String str2 = aiy.A03.A09;
            int i = aiy.A01.A00;
            0qQ.A0B(str2, 0);
            0xY A0p = AnonymousClass7TE.A0p(r1);
            A0p.E5Z(002.A0R("text_to_camera_gradient_background_index_", str2), i);
            A0p.apply();
        }
        TextColorScheme A032 = aiy.A03();
        if (A032.A05 != null) {
            ALv aLv = aiy.A02;
            if (aLv == null) {
                aLv = new ALv(aiy.A06, aiy.A09);
                aiy.A02 = aLv;
            }
            r3 = aiy.A0A;
            TextureView textureView = (TextureView) r3.getView();
            Integer num = A032.A05;
            boolean A1U = AnonymousClass7TF.A1U(0, textureView, num);
            AnonymousClass0eM r7 = aLv.A05;
            C41517AvL avL = (C41517AvL) r7.getValue();
            int intValue = num.intValue();
            if (intValue == 0) {
                str = "iglu/filters/multi_color_gradient_v2/gradient_orange.png";
            } else if (intValue == A1U) {
                str = "iglu/filters/multi_color_gradient_v2/gradient_pink.png";
            } else if (intValue == 2) {
                str = "iglu/filters/multi_color_gradient_v2/gradient_purple.png";
            } else if (intValue == 3) {
                str = "iglu/filters/multi_color_gradient_v2/gradient_blue.png";
            } else if (intValue == 4) {
                str = "iglu/filters/multi_color_gradient_v2/gradient_rainbow.png";
            } else {
                throw AnonymousClass7TE.A1K();
            }
            synchronized (avL) {
                avL.A01 = str;
            }
            if (textureView.getSurfaceTextureListener() == null) {
                textureView.setSurfaceTextureListener(aLv);
                if (textureView.isAvailable() && textureView.getSurfaceTexture() != null) {
                    C41517AvL avL2 = (C41517AvL) r7.getValue();
                    SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        synchronized (avL2) {
                            avL2.A00 = surfaceTexture;
                        }
                        avL2.A03 = A1U;
                        avL2.start();
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            ((C41517AvL) r7.getValue()).A02 = A1U;
            if (aiy.A03().A05 != null) {
                r3.setVisibility(0);
            }
        } else {
            GradientDrawable.Orientation orientation = A032.A03;
            orientation.getClass();
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, A032.A01());
            gradientDrawable.setDither(true);
            View view = aiy.A07;
            RectF rectF = 0nA.A01;
            view.setBackground(gradientDrawable);
            view.setVisibility(0);
            r3 = aiy.A0A;
            r3.setVisibility(8);
        }
        AnonymousClass8GE r2 = aiy.A0B;
        GradientDrawable.Orientation orientation2 = A032.A03;
        orientation2.getClass();
        r2.A02(orientation2, A032.A01(), 0);
        C353798Jc r02 = aiy.A0C.A00;
        r02.A0E = A032;
        C353798Jc.A0A(r02);
        C353798Jc.A0D(r02);
        Iterator it = r02.A0C.A09.A0T(new C12609Szt(2)).iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onBackgroundUpdated");
        }
        View view2 = aiy.A07;
        if (view2.getVisibility() == 0 || r3.CFV() == 0) {
            if (aiy.A0D.A03) {
                aiy.A08.A01();
            }
            view2.setAlpha(1.0f);
            if (r3.CVM()) {
                r3.getView().setAlpha(1.0f);
            }
        }
    }

    public static void A02(AIY aiy, boolean z) {
        if (!z) {
            aiy.A07.setVisibility(0);
            if (aiy.A03().A05 != null) {
                aiy.A0A.setVisibility(0);
            }
            aiy.A08.A08(1.0d, true);
        }
        aiy.A08.A06(1.0d);
    }

    public final TextColorScheme A03() {
        String str;
        C352048Bm r0 = this.A01;
        if (r0 == null) {
            str = "mTextColorSchemeList is null";
        } else {
            TextColorScheme textColorScheme = r0.A02;
            if (textColorScheme != null) {
                return textColorScheme;
            }
            str = "mTextColorSchemeList.getCurrentTextColorScheme() is null";
        }
        0kD.A01("TextModeComposerGradientBackgroundController", str);
        return TextColorScheme.A08;
    }

    public final void A04(BackgroundGradientColors backgroundGradientColors, C358868bb r16) {
        int i;
        C353818Jf r9;
        ArrayList A012;
        int i2;
        Object obj;
        C358868bb r1 = r16;
        this.A03 = r1;
        1Av r0 = this.A0E;
        String str = r1.A09;
        0qQ.A0B(str, 0);
        0xa r4 = r0.A01;
        int i3 = r4.getInt(002.A0R("text_to_camera_custom_text_color_scheme_index_", str), -1);
        this.A00 = r4.getInt(002.A0R("text_to_camera_custom_text_color_scheme_colour_", str), 0);
        Boolean bool = C365768ne.A0A.A00().A04;
        boolean z = this.A05;
        if (bool == null) {
            Context context = this.A06;
            if (z) {
                A012 = AnonymousClass802.A02(context);
            } else {
                A012 = AnonymousClass802.A01(context);
            }
            int i4 = 1;
            if (i3 == -1) {
                i4 = 0;
            }
            i2 = r4.getInt(002.A0R("text_to_camera_gradient_background_index_", str), 0) % (A012.size() + i4);
        } else {
            Context context2 = this.A06;
            TextColorScheme[] textColorSchemeArr = new TextColorScheme[7];
            C353818Jf r12 = new C353818Jf();
            r12.A02 = context2.getColor(2Yu.A0A(context2));
            if (z) {
                int A032 = AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_yellow);
                i = R.attr.igds_color_creation_tools_pink;
                C353818Jf.A01(context2, r12, 2Yu.A0H(context2, R.attr.igds_color_creation_tools_pink), A032);
                r12.A05 = AnonymousClass05K.A00;
                C353818Jf A002 = A00(context2, r12, textColorSchemeArr, R.attr.igds_color_creation_tools_blue, 0);
                C353818Jf.A01(context2, A002, 2Yu.A0H(context2, R.attr.igds_color_creation_tools_purple), AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_pink));
                A002.A05 = AnonymousClass05K.A01;
                C353818Jf A003 = A00(context2, A002, textColorSchemeArr, R.attr.igds_color_creation_tools_yellow, 1);
                C353818Jf.A01(context2, A003, 2Yu.A0H(context2, R.attr.igds_color_creation_tools_purple), AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_blue));
                A003.A05 = AnonymousClass05K.A0C;
                C353818Jf A004 = A00(context2, A003, textColorSchemeArr, R.attr.igds_color_creation_tools_yellow, 2);
                C353818Jf.A01(context2, A004, 2Yu.A0H(context2, R.attr.igds_color_creation_tools_blue), AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_green));
                A004.A05 = AnonymousClass05K.A0N;
                A004.A01 = AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_pink);
                textColorSchemeArr[3] = new TextColorScheme(A004);
                r9 = new C353818Jf();
                r9.A02 = context2.getColor(2Yu.A0A(context2));
                r9.A02(AnonymousClass5BH.A01);
                r9.A05 = AnonymousClass05K.A0Y;
            } else {
                int A033 = AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_yellow);
                i = R.attr.igds_color_creation_tools_pink;
                C353818Jf.A01(context2, r12, 2Yu.A0H(context2, R.attr.igds_color_creation_tools_pink), A033);
                C353818Jf A005 = A00(context2, r12, textColorSchemeArr, R.attr.igds_color_creation_tools_blue, 0);
                C353818Jf.A01(context2, A005, 2Yu.A0H(context2, R.attr.igds_color_creation_tools_purple), AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_pink));
                C353818Jf A006 = A00(context2, A005, textColorSchemeArr, R.attr.igds_color_creation_tools_yellow, 1);
                C353818Jf.A01(context2, A006, 2Yu.A0H(context2, R.attr.igds_color_creation_tools_purple), AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_blue));
                C353818Jf A007 = A00(context2, A006, textColorSchemeArr, R.attr.igds_color_creation_tools_yellow, 2);
                C353818Jf.A01(context2, A007, 2Yu.A0H(context2, R.attr.igds_color_creation_tools_blue), AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_green));
                A007.A01 = AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_pink);
                textColorSchemeArr[3] = new TextColorScheme(A007);
                r9 = new C353818Jf();
                r9.A02 = context2.getColor(2Yu.A0A(context2));
                r9.A02(AnonymousClass5BH.A01);
            }
            r9.A01 = AnonymousClass7TF.A03(context2, i);
            textColorSchemeArr[4] = new TextColorScheme(r9);
            C353818Jf r2 = new C353818Jf();
            r2.A02 = AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_grey_09);
            r2.A04 = new TextColors(TextShadow.A03, context2.getColor(R.color.grey_9_50_transparent));
            C353818Jf.A01(context2, r2, R.color.barcelona_story_share_light_mode, context2.getColor(R.color.barcelona_story_share_light_mode));
            r2.A01 = AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_red);
            textColorSchemeArr[5] = new TextColorScheme(r2);
            C353818Jf r22 = new C353818Jf();
            r22.A02 = AnonymousClass7TF.A03(context2, R.attr.igds_color_primary_text_on_media);
            C353818Jf.A01(context2, r22, R.color.barcelona_story_share_dark_mode, context2.getColor(R.color.barcelona_story_share_dark_mode));
            r22.A01 = AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_red);
            textColorSchemeArr[6] = new TextColorScheme(r22);
            A012 = C256393vh.A01(textColorSchemeArr);
            int i5 = 1;
            if (i3 == -1) {
                i5 = 0;
            }
            int size = A012.size() + i5;
            i2 = size - 2;
            if (bool.booleanValue()) {
                i2 = size - 1;
            }
        }
        if (backgroundGradientColors != null) {
            ArrayList arrayList = new ArrayList(A012.size());
            for (int i6 = 0; i6 < A012.size(); i6++) {
                if (((TextColorScheme) A012.get(i6)).A01().length > 2) {
                    obj = new TextColorScheme(new C353818Jf()).A00(backgroundGradientColors.A01, backgroundGradientColors.A00);
                } else {
                    obj = A012.get(i6);
                }
                arrayList.add(obj);
            }
            A012 = arrayList;
        }
        this.A01 = new C352048Bm(A012, new int[]{this.A00}, i2, i3);
        A01(this, true);
    }

    public AIY(Context context, View view, ViewStub viewStub, UserSession userSession, AnonymousClass8GE r10, C39657A3x a3x, AnonymousClass80F r12, ColourWheelView colourWheelView) {
        this.A06 = context;
        this.A09 = userSession;
        this.A0C = a3x;
        this.A0D = r12;
        this.A0E = 1Au.A00(userSession);
        this.A0B = r10;
        this.A07 = view;
        this.A0A = 2b1.A01(viewStub, false, false);
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A06 = true;
        A0J.A0A(new C383699g0(this, 0));
        this.A08 = A0J;
        AnonymousClass8GF CrP = r10.CrP();
        CrP.A00 = new C40302AZr(this, 3);
        this.A0F = colourWheelView;
        if (colourWheelView != null) {
            float f = r10.A00;
            colourWheelView.setColourWheelStrokeWidth(f);
            CrP.A01 = new C40303AZs(this, colourWheelView);
            colourWheelView.A0N.add(new C40664Age(this, colourWheelView));
            colourWheelView.A01 = (r10.A01 / 2.0f) - f;
        }
        CrP.A00();
        A04((BackgroundGradientColors) null, C358878bc.A01("classic_v2", false, false, false, false));
    }

    public static C353818Jf A00(Context context, C353818Jf r3, Object[] objArr, int i, int i2) {
        r3.A01 = context.getColor(2Yu.A0H(context, i));
        objArr[i2] = new TextColorScheme(r3);
        C353818Jf r1 = new C353818Jf();
        r1.A02 = context.getColor(2Yu.A0A(context));
        return r1;
    }
}
