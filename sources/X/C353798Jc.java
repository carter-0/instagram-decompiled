package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.widget.colourwheel.ColourWheelView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.8Jc  reason: invalid class name and case insensitive filesystem */
public final class C353798Jc implements AnonymousClass88G, AnonymousClass88H, AnonymousClass85Y, C353808Jd, C252213ok, C3509486z {
    public static boolean A0e;
    public int A00;
    public int A01;
    public GestureDetector A02;
    public View.OnTouchListener A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public AnonymousClass91a A08;
    public AnonymousClass91N A09;
    public C360778f8 A0A;
    public AIY A0B;
    public AnonymousClass8WF A0C;
    public ConstrainedEditText A0D;
    public TextColorScheme A0E = TextColorScheme.A08;
    public C306386Ly A0F;
    public ColourWheelView A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public Integer A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;
    public CameraConfiguration A0O;
    public final Context A0P;
    public final View A0Q;
    public final View A0R;
    public final View A0S;
    public final ViewStub A0T;
    public final UserSession A0U;
    public final AnonymousClass3E6 A0V;
    public final TargetViewSizeProvider A0W;
    public final C3509286x A0X;
    public final C3497281m A0Y;
    public final AnonymousClass80U A0Z;
    public final AnonymousClass80F A0a;
    public final DirectCameraViewModel A0b;
    public final InteractiveDrawableContainer A0c;
    public final AnonymousClass85s A0d;

    public final boolean CKM() {
        return true;
    }

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final /* synthetic */ void D4Z(int i) {
    }

    public final /* synthetic */ void D4a(int i) {
    }

    public final void D4b() {
        this.A0K = false;
    }

    public final void D4d() {
        this.A0K = true;
        this.A0Y.A00().FMB(false);
        C3509286x r4 = this.A0X;
        C3508086k r1 = r4.A0J;
        if (r1.A00().isVisible()) {
            C294975nL.A05(new View[]{r1.A00().getView()}, true);
            AnonymousClass8S4 r2 = r4.A01;
            if (r2.A00.A0V(C358088aL.A0C)) {
                r2.A02.A0G.A0B(true);
            }
            C71662eb r12 = r4.A0D;
            if (r12.A04()) {
                C294975nL.A05(new View[]{r12.A01()}, true);
            }
        }
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final /* synthetic */ void DdI(Drawable drawable, int i, boolean z) {
    }

    public final /* synthetic */ void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    public final /* synthetic */ void Dsb() {
    }

    public final void EI6() {
    }

    private void A00() {
        ConstrainedEditText constrainedEditText = this.A0D;
        if (constrainedEditText != null) {
            Editable text = constrainedEditText.getText();
            0qQ.A0B(text, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text.toString());
            C263324Kh.A04(spannableStringBuilder, text, (Class[]) Arrays.copyOf(new Class[]{AnonymousClass6MP.class, AnonymousClass91T.class, C358848bZ.class, AnonymousClass91V.class, C358868bb.class, AnonymousClass91X.class}, 6));
            C306386Ly r2 = this.A0F;
            r2.getClass();
            r2.A0B(this.A0D.getLineSpacingExtra(), this.A0D.getLineSpacingMultiplier());
            C306386Ly r0 = this.A0F;
            r0.getClass();
            r0.A0L(spannableStringBuilder);
            C306386Ly r02 = this.A0F;
            r02.getClass();
            A01(r02, this);
            A07(this);
            A0A(this);
            ConstrainedEditText constrainedEditText2 = this.A0D;
            if (constrainedEditText2 != null) {
                Editable text2 = constrainedEditText2.getText();
                0qQ.A0A(text2);
                C358948bj.A03(text2);
                constrainedEditText2.invalidate();
            }
            A0E(this);
            if (!(this.A0D == null || this.A0F == null)) {
                C360778f8 r03 = this.A0A;
                r03.getClass();
                r03.A07();
                Context context = this.A0P;
                0qQ.A0B(context, 1);
                int A002 = AnonymousClass8XF.A00(context) - (context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height) * 2);
                C306386Ly r5 = this.A0F;
                this.A0c.A0o(r5, Math.min(1.0f, ((float) A002) / ((float) r5.A06)));
            }
            A0G(this);
            C306386Ly r04 = this.A0F;
            r04.getClass();
            r04.setVisible(true, false);
            C306386Ly r05 = this.A0F;
            r05.getClass();
            r05.invalidateSelf();
        }
    }

    public static void A02(C39889ADn aDn, C353798Jc r8) {
        int i;
        int i2;
        int i3;
        int i4;
        AIY aiy = r8.A0B;
        if (aiy != null) {
            C352048Bm r2 = aiy.A01;
            if (r2 == null) {
                i = 0;
            } else {
                i = r2.A00;
            }
            aDn.A01 = i;
            if (r2 == null) {
                0kD.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null when adding background metadata");
                return;
            }
            int i5 = r2.A00;
            if (i5 == -1 || (i4 = r2.A01) != i5) {
                r2.A01();
                1Av r1 = aiy.A0E;
                String str = aiy.A03.A09;
                0qQ.A0B(str, 0);
                0xa r22 = r1.A01;
                0xY AR4 = r22.AR4();
                AR4.E5Z(002.A0R("text_to_camera_custom_text_color_scheme_index_", str), -1);
                AR4.apply();
                String str2 = aiy.A03.A09;
                C352048Bm r0 = aiy.A01;
                if (r0 == null) {
                    i2 = 0;
                } else {
                    i2 = r0.A00;
                }
                0qQ.A0B(str2, 0);
                0xY AR42 = r22.AR4();
                AR42.E5Z(002.A0R("text_to_camera_gradient_background_index_", str2), i2);
                AR42.apply();
                r2 = aiy.A01;
                if (r2 == null) {
                    i3 = 0;
                } else {
                    i3 = r2.A00;
                }
                aDn.A01 = i3;
            } else {
                aDn.A03 = i4;
                aDn.A02 = aiy.A00;
            }
            aDn.A0A = r2.A05;
        }
    }

    public static void A03(C353798Jc r1) {
        ConstrainedEditText constrainedEditText = r1.A0D;
        if (constrainedEditText != null && constrainedEditText.hasFocus()) {
            r1.A0D.clearFocus();
        }
    }

    public static void A04(C353798Jc r36) {
        C353798Jc r2 = r36;
        if (r2.A0F == null) {
            C360778f8 r0 = r2.A0A;
            r0.getClass();
            C358868bb A072 = r0.A07();
            Context context = r2.A0P;
            C358938bi r7 = A072.A06;
            C306386Ly r5 = new C306386Ly(context, r7.A00(context));
            r5.A0I(AnonymousClass0qo.A00(context).A02(0qm.A0z));
            r5.A09();
            TextColorScheme textColorScheme = r2.A0E;
            0qQ.A0B(context, 1);
            Editable A002 = AEU.A00(r5.A0F);
            if (A002 != null) {
                TextColors ALC = C358888bd.A01.ALC(textColorScheme.A02);
                int alpha = Color.alpha(-1);
                C358848bZ r02 = (C358848bZ) C263324Kh.A00(A002, C358848bZ.class);
                if (r02 == null) {
                    C358848bZ r1 = new C358848bZ(context, ALC);
                    r1.A03 = Integer.valueOf(alpha);
                    AnonymousClass7TG.A17(A002, r1);
                } else {
                    r02.A00(ALC);
                }
                r5.A0L(A002);
                r5.invalidateSelf();
            }
            r2.A0F = r5;
            r2.A00();
            r2.A0c.A0K(r5, new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) "TextModeComposerController", (String) null, (List) null, -1.0f, r7.A02, -1.0f, -1.0f, -1.0f, 0, true, false, true, false, false, false, true, true, true, true, true, true, false, false), false, false, false);
            A07(r2);
        } else {
            r2.A00();
            B3f A003 = InteractiveDrawableContainer.A00(r2.A0F, r2.A0c);
            if (A003 != null) {
                A003.Cno(true);
            }
        }
        A05(r2);
    }

    public static void A05(C353798Jc r2) {
        A0H(r2, AnonymousClass05K.A0C);
        ConstrainedEditText constrainedEditText = r2.A0D;
        if (constrainedEditText != null) {
            0nA.A0N(constrainedEditText);
        }
        if (!r2.A0M && r2.A0Z.CQ0(AnonymousClass80V.CAPTURE) && A0I(r2) && r2.A0b == null) {
            A06(r2);
        }
    }

    public static void A06(C353798Jc r6) {
        C279294yP r1 = C279294yP.STORY;
        CameraConfiguration cameraConfiguration = r6.A0O;
        if (cameraConfiguration != null) {
            r1 = cameraConfiguration.A03.A00;
        }
        27p.A01(r6.A0U).A0y(r1, 28t.A04, C59725JVj.CREATE, (String) null, (String) null);
        AnonymousClass8WF r12 = r6.A0C;
        C364688lp.A00(r12.A07);
        r12.A06.A05();
    }

    public static void A07(C353798Jc r7) {
        if (r7.A0D != null && r7.A0F != null) {
            AnonymousClass91a r0 = r7.A08;
            r0.getClass();
            Integer num = r0.A00;
            AnonymousClass9UR.A0A(r7.A0F);
            C306386Ly r1 = r7.A0F;
            r1.A0K(AnonymousClass9UR.A00(r1, num));
            Rect bounds = r7.A0F.getBounds();
            float exactCenterY = bounds.exactCenterY();
            float width = (float) bounds.width();
            float f = 0.0f;
            int intValue = num.intValue();
            if (intValue == 0) {
                f = ((float) (r7.A0c.getLeft() + r7.A0D.getPaddingLeft())) + (width / 2.0f);
            } else if (intValue == 1) {
                InteractiveDrawableContainer interactiveDrawableContainer = r7.A0c;
                f = (float) ((interactiveDrawableContainer.getLeft() / 2) + (interactiveDrawableContainer.getRight() / 2));
            } else if (intValue == 2) {
                f = ((float) (r7.A0c.getRight() - r7.A0D.getPaddingRight())) - (width / 2.0f);
            }
            AEV.A02(InteractiveDrawableContainer.A00(r7.A0F, r7.A0c), f, exactCenterY);
        }
    }

    public static void A08(C353798Jc r2) {
        AnonymousClass91a r0 = r2.A08;
        r0.getClass();
        C294975nL.A04((C295005nO) null, new View[]{r0.A01}, false);
    }

    public static void A09(C353798Jc r2) {
        ConstrainedEditText constrainedEditText = r2.A0D;
        if (constrainedEditText != null) {
            C306386Ly r0 = r2.A0F;
            if (r0 != null) {
                Spannable spannable = r0.A0F;
                constrainedEditText.setText(spannable);
                r2.A0D.setSelection(spannable.length());
                return;
            }
            constrainedEditText.setText("");
        }
    }

    public static void A0A(C353798Jc r5) {
        Spannable text;
        ConstrainedEditText constrainedEditText = r5.A0D;
        if (constrainedEditText != null) {
            Context context = r5.A0P;
            C306386Ly r0 = r5.A0F;
            if (r0 != null) {
                text = r0.A0F;
            } else {
                text = constrainedEditText.getText();
            }
            C358838bY.A01(context, text, r5.A0D.getSelectionStart(), r5.A0D.getSelectionEnd(), r5.A0E.A02);
        }
    }

    public static void A0B(C353798Jc r5) {
        ConstrainedEditText constrainedEditText = r5.A0D;
        constrainedEditText.getClass();
        C360778f8 r2 = r5.A0A;
        r2.getClass();
        AnonymousClass91N r1 = r5.A09;
        r1.getClass();
        ViewGroup viewGroup = r5.A06;
        viewGroup.getClass();
        AnonymousClass9UR.A04(viewGroup, r1, r2, constrainedEditText, false, false);
    }

    public static void A0C(C353798Jc r5) {
        if (r5.A0D != null) {
            AnonymousClass91a r0 = r5.A08;
            r0.getClass();
            Integer num = r0.A00;
            int intValue = num.intValue();
            int i = 3;
            if (intValue != 0) {
                if (intValue == 1) {
                    i = 1;
                } else if (intValue == 2) {
                    i = 5;
                } else {
                    throw new IllegalStateException(002.A0R("Unknown alignment: ", AnonymousClass9UV.A00(num)));
                }
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r5.A0D.getLayoutParams();
            int i2 = i | 16;
            layoutParams.gravity = i2;
            r5.A0D.setLayoutParams(layoutParams);
            if (r5.A0D.getText().length() == 0) {
                r5.A0D.setGravity(8388627);
            } else {
                r5.A0D.setGravity(i2);
            }
        }
    }

    public static void A0D(C353798Jc r2) {
        CharSequence charSequence;
        ConstrainedEditText constrainedEditText = r2.A0D;
        if (constrainedEditText != null) {
            if (constrainedEditText.hasFocus()) {
                charSequence = r2.A0H;
            } else {
                charSequence = r2.A0I;
            }
            constrainedEditText.setHint(charSequence);
            AEU.A01(r2.A0D, r2.A0E);
            C360778f8 r0 = r2.A0A;
            r0.getClass();
            AEU.A02(r2.A0D, r0.A07());
        }
    }

    public static void A0E(C353798Jc r7) {
        if (r7.A0D != null && r7.A0F != null) {
            C360778f8 r0 = r7.A0A;
            r0.getClass();
            C358868bb A072 = r0.A07();
            Editable text = r7.A0D.getText();
            float textSize = r7.A0D.getTextSize();
            C306386Ly r3 = r7.A0F;
            Context context = r7.A0P;
            r3.A0C(C39815AAm.A00(context, text, A072, r3, textSize), C39815AAm.A01(context, text, A072, r7.A0F, textSize));
        }
    }

    public static void A0F(C353798Jc r5) {
        if (r5.A0D != null) {
            C360778f8 r0 = r5.A0A;
            r0.getClass();
            C358938bi r1 = r0.A07().A06;
            Context context = r5.A0P;
            int A002 = r1.A00(context);
            0qQ.A0B(context, 1);
            int A012 = (int) (((1.0f - r1.A03) * ((float) AnonymousClass8XF.A01(context))) / 2.0f);
            ConstrainedEditText constrainedEditText = r5.A0D;
            constrainedEditText.setPadding(A012, constrainedEditText.getPaddingTop(), A012, r5.A0D.getPaddingBottom());
            C306386Ly r02 = r5.A0F;
            if (r02 != null) {
                r02.A0E(A002);
                A07(r5);
            }
        }
    }

    public static void A0G(C353798Jc r5) {
        C360778f8 r0;
        if (r5.A0D != null && (r0 = r5.A0A) != null) {
            C358868bb A072 = r0.A07();
            int length = r5.A0D.getText().length();
            C358938bi r2 = A072.A06;
            Context context = r5.A0P;
            0qQ.A0B(context, 0);
            Resources resources = context.getResources();
            if (length == 0) {
                r5.A0D.setTextSize(0, (float) resources.getDimensionPixelSize(r2.A06));
                return;
            }
            float dimensionPixelSize = (float) resources.getDimensionPixelSize(r2.A05);
            r5.A0D.setTextSize(0, dimensionPixelSize);
            C306386Ly r02 = r5.A0F;
            if (r02 != null) {
                r02.A0A(dimensionPixelSize);
                A01(r5.A0F, r5);
                A07(r5);
            }
        }
    }

    public static void A0H(C353798Jc r12, Integer num) {
        List list;
        Integer num2 = r12.A0J;
        if (num2 != num) {
            r12.A0J = num;
            int intValue = num.intValue();
            if (intValue == 1) {
                if (r12.A01 == 0) {
                    r12.A0V.EEH(r12);
                }
                InteractiveDrawableContainer interactiveDrawableContainer = r12.A0c;
                interactiveDrawableContainer.A0z(r12);
                if (num2 != AnonymousClass05K.A00) {
                    if (r12.A0F != null && !r12.A0Z.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                        interactiveDrawableContainer.A0t(r12.A0F, false);
                        r12.A0F.setVisible(false, false);
                    }
                    AnonymousClass8WF r1 = r12.A0C;
                    View[] viewArr = {r1.A00};
                    C71392co r0 = C315596kB.A02;
                    C294975nL.A04((C295005nO) null, viewArr, true);
                    if (r1.A07.CZe()) {
                        AnonymousClass88F r02 = r1.A08;
                        if ((r02 == null || r02.A03 == null) && !r1.A0A && !r1.A03.CKM()) {
                            C315596kB.A08(new View[]{r1.A09}, false);
                        }
                        AnonymousClass8WF.A00(r1);
                    }
                }
                C360778f8 r13 = r12.A0A;
                r13.getClass();
                if (r13.A0F) {
                    C315596kB.A08(new View[]{r13.A08}, false);
                }
            } else if (intValue == 2) {
                r12.A0V.A9Y(r12);
                InteractiveDrawableContainer interactiveDrawableContainer2 = r12.A0c;
                interactiveDrawableContainer2.A0y(r12);
                interactiveDrawableContainer2.A0S = true;
                ConstrainedEditText constrainedEditText = r12.A0D;
                constrainedEditText.getClass();
                constrainedEditText.setFocusableInTouchMode(true);
                boolean A0I2 = A0I(r12);
                View[] viewArr2 = {r12.A04};
                if (A0I2) {
                    C294975nL.A05(viewArr2, false);
                } else {
                    C294975nL.A04((C295005nO) null, viewArr2, false);
                }
                A0D(r12);
                C294975nL.A04((C295005nO) null, new View[]{r12.A0D}, false);
                C294975nL.A05(new View[]{r12.A07}, false);
                r12.A0P(false, false);
                AnonymousClass8WF r14 = r12.A0C;
                C315596kB.A08(new View[]{r14.A00}, true);
                C294975nL.A04((C295005nO) null, new View[]{r14.A09}, false);
                AnonymousClass8WF.A00(r14);
                C306386Ly r15 = r12.A0F;
                if (r15 != null) {
                    interactiveDrawableContainer2.A0t(r15, r12.A0a.A02);
                    r12.A0F.setVisible(true, false);
                }
                C3509286x r7 = r12.A0X;
                AnonymousClass876 r5 = r7.A0H;
                if (r5.isEmpty()) {
                    boolean z = false;
                    if (r7.A01.A03.A1s.getInteractiveDrawables().size() > 0) {
                        z = true;
                    }
                    r7.A03 = z;
                    if (z || !r7.A0N) {
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(r7.A00.A03());
                        list = arrayList;
                    } else {
                        list = r7.A00.A04(false);
                    }
                    AnonymousClass87G r9 = r7.A00;
                    if (r9 != null) {
                        AnonymousClass87I r16 = r9.A04;
                        if (r16 == null) {
                            r16 = AnonymousClass87I.EMPTY;
                        }
                        if (r16 == AnonymousClass87I.END_OF_YEAR || r16 == AnonymousClass87I.BIRTHDAY_HIGHLIGHTS || r16 == AnonymousClass87I.SUPERLATIVE) {
                            list.add(0, r9);
                        }
                    }
                    AnonymousClass87B r10 = r7.A0F;
                    if (r10.A01 == null) {
                        View view = r10.A07;
                        View inflate = ((ViewStub) view.requireViewById(R.id.active_canvas_element_view_stub)).inflate();
                        r10.A01 = inflate;
                        r10.A00 = inflate.requireViewById(R.id.active_canvas_element_view);
                        TouchInterceptorFrameLayout requireViewById = view.requireViewById(R.id.loading_mask_overlay);
                        r10.A04 = requireViewById;
                        requireViewById.setOnTouchListener(new C40039AOv(r10));
                        GradientSpinner gradientSpinner = (GradientSpinner) r10.A04.requireViewById(R.id.loading_mask_overlay_gradient);
                        gradientSpinner.setGradientColors((int) R.style.ViewerLoadingGradientStyle);
                        gradientSpinner.A06();
                        View A012 = r10.A08.A01();
                        r10.A02 = (ImageView) A012.requireViewById(R.id.active_canvas_element_dice_view);
                        AnonymousClass61R A002 = C303756Aq.A00(r10.A06, R.raw.canvas_dice_animation);
                        if (A002 != null) {
                            A002.AB9(true);
                        }
                        r10.A02.setImageDrawable(A002);
                        AnonymousClass0fU.A00(new ANL(A002, r10), r10.A02);
                        IgTextView requireViewById2 = A012.requireViewById(R.id.active_canvas_element_see_all_view);
                        r10.A03 = requireViewById2;
                        AnonymousClass0fU.A00(new AM9(r10), requireViewById2);
                        ImageView imageView = r10.A02;
                        int A0C2 = 0nA.A0C(imageView);
                        int i = r10.A05;
                        0nA.A0e(imageView, A0C2 + i);
                        IgTextView igTextView = r10.A03;
                        0nA.A0e(igTextView, 0nA.A0C(igTextView) + i);
                        View view2 = r10.A00;
                        view2.post(new C41020An4(view2, r10));
                        AnonymousClass87D r92 = r10.A09;
                        View view3 = r10.A01;
                        r92.A01 = view3.findViewById(R.id.active_canvas_element_view);
                        C71662eb r17 = new C71662eb((ViewStub) view3.findViewById(R.id.active_canvas_element_text_view_with_header_stub));
                        r92.A06 = r17;
                        r17.A02 = new AZW(r92);
                        r92.A05 = new C71662eb((ViewStub) view3.findViewById(R.id.active_canvas_element_background_view_stub));
                        r92.A04 = new C71662eb((ViewStub) view3.findViewById(R.id.canvas_text_view_suggestions_recycler_view_stub));
                        View A013 = r92.A06.A01();
                        SearchEditText searchEditText = (SearchEditText) A013.requireViewById(R.id.canvas_text_view_input_text);
                        r92.A07 = searchEditText;
                        searchEditText.setAllowTextSelection(true);
                        r92.A03 = A013.requireViewById(R.id.canvas_text_view_error);
                        r92.A0D.A03(r92.A06.A01());
                    }
                    r7.A0J.A00().EXs(false);
                    r5.A06(list);
                }
                r7.A05 = true;
                C3508086k r8 = r7.A0J;
                r8.A00().AIy(r5, r7.A0I);
                r8.A00().EXs(true);
                r8.A00().show();
                0fE.A00(r5, 1459048036);
                C71662eb r18 = r7.A0D;
                if (r18.A04()) {
                    C294975nL.A04((C295005nO) null, new View[]{r18.A01()}, true);
                }
                UserSession userSession = r7.A0C;
                0qQ.A06(userSession);
                AnonymousClass29X r72 = 27p.A01(userSession).A0D;
                0wc r52 = r72.A01;
                0Aj A003 = r52.A00(r52.A00, "ig_camera_start_session");
                AnonymousClass283 r93 = r72.A04;
                C59725JVj jVj = C59725JVj.CREATE;
                r93.A0C = jVj;
                if (r72.A0P() && A003.isSampled()) {
                    A003.AAJ("legacy_falco_event_name", "IG_CAMERA_START_CREATE_MODE_SESSION");
                    A003.AAJ("entity", "CREATE_MODE");
                    String str = r93.A0L;
                    if (str == null) {
                        str = "";
                    }
                    A003.AAJ("camera_session_id", str);
                    int i2 = 2;
                    if (r93.A01 != 2) {
                        i2 = 1;
                    }
                    A003.A8k("camera_position", Integer.valueOf(i2));
                    A003.A8M(r72.A0I(), "capture_type");
                    A003.A8M(r93.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A003.A8k("event_type", 2);
                    A003.A8M(r93.A0A, "media_type");
                    A003.AAJ("module", 27x.A08.getModuleName());
                    A003.A8M(jVj, "surface");
                    A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A003.AAK(2AL.A07(r72.A00, r72.A03), "system_info");
                    A003.AAJ("device_fold_orientation", C254483sY.A00);
                    A003.AAJ("device_fold_state", C254493sZ.A00);
                    A003.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                    A003.AAJ("device_aspect_ratio_category", C254473sX.A00);
                    A003.Cgf();
                }
            } else if (intValue == 3) {
                r12.A0c.A0S = false;
                C294975nL.A04(new C40634Afw(r12), new View[]{r12.A0D}, true);
                TextView textView = r12.A07;
                textView.getClass();
                C294975nL A014 = C294975nL.A01(textView, 0);
                A014.A0G();
                A014.A04 = 0;
                A014.A0M(0.0f, 1.0f);
                A014.A0F(true).A0H();
                C360778f8 r53 = r12.A0A;
                r53.getClass();
                if (r53.A0F) {
                    View[] viewArr3 = {r53.A08};
                    C71392co r03 = C315596kB.A02;
                    C294975nL.A04((C295005nO) null, viewArr3, false);
                }
                r53.A09();
                A0A(r12);
            }
            AIY aiy = r12.A0B;
            if (aiy != null) {
                boolean z2 = true;
                if (intValue != 1) {
                    if (intValue == 2) {
                        if (!aiy.A0D.A03 || aiy.A04) {
                            z2 = false;
                        }
                        AIY.A02(aiy, z2);
                        aiy.A04 = false;
                    }
                } else if (aiy.A0D.A03) {
                    aiy.A08.A06(0.0d);
                } else {
                    aiy.A07.setVisibility(8);
                    aiy.A0A.setVisibility(8);
                }
            }
        }
    }

    public static boolean A0I(C353798Jc r3) {
        ConstrainedEditText constrainedEditText;
        if (r3.A0J == AnonymousClass05K.A00 || (constrainedEditText = r3.A0D) == null) {
            return false;
        }
        Editable text = constrainedEditText.getText();
        if (TextUtils.isEmpty(text) || TextUtils.isEmpty(text.toString().trim())) {
            return false;
        }
        return true;
    }

    public final C39889ADn A0J(boolean z, boolean z2) {
        C39889ADn aDn = new C39889ADn(this.A0P);
        ConstrainedEditText constrainedEditText = this.A0D;
        if (constrainedEditText != null) {
            aDn.A04 = constrainedEditText.getText();
            aDn.A05 = Layout.Alignment.ALIGN_CENTER;
            aDn.A00 = 0.0f;
            C360778f8 r0 = this.A0A;
            r0.getClass();
            aDn.A07 = r0.A07();
        }
        aDn.A0E = z2;
        aDn.A0D = z;
        A0L(aDn);
        A02(aDn, this);
        return aDn;
    }

    public final void A0K() {
        if (this.A0L) {
            C306386Ly r0 = this.A0F;
            if (r0 != null) {
                r0.setVisible(false, false);
            }
            C294975nL.A04((C295005nO) null, new View[]{this.A04}, false);
            ConstrainedEditText constrainedEditText = this.A0D;
            constrainedEditText.getClass();
            constrainedEditText.requestFocus();
            ConstrainedEditText constrainedEditText2 = this.A0D;
            constrainedEditText2.getClass();
            0nA.A0Q(constrainedEditText2);
        }
    }

    public final void A0L(C39889ADn aDn) {
        C3509286x r2 = this.A0X;
        AnonymousClass87G A012 = r2.A0H.A01();
        if (A012 == null) {
            return;
        }
        if (r2.A0A()) {
            AnonymousClass87I r0 = A012.A04;
            if (r0 == null) {
                r0 = AnonymousClass87I.EMPTY;
            }
            aDn.A06 = r0;
            r2.A02(A012).A0B(aDn);
        } else if (C3509386y.A01(A012)) {
            AnonymousClass87I r02 = A012.A04;
            if (r02 == null) {
                r02 = AnonymousClass87I.EMPTY;
            }
            aDn.A06 = r02;
        }
    }

    public final void A0N(boolean z) {
        Integer num;
        if (this.A0J != AnonymousClass05K.A00) {
            if (z) {
                if (!this.A0X.A0A()) {
                    C294975nL.A04((C295005nO) null, new View[]{this.A05, this.A0D}, this.A0a.A03);
                }
                ColourWheelView colourWheelView = this.A0G;
                if (colourWheelView != null) {
                    colourWheelView.postDelayed(new C40855AkP(this), 1000);
                }
                num = AnonymousClass05K.A0C;
            } else {
                boolean z2 = this.A0a.A03;
                C294975nL.A05(new View[]{this.A0D, this.A05}, z2);
                C294975nL.A04((C295005nO) null, new View[]{this.A0Q}, z2);
                A03(this);
                num = AnonymousClass05K.A01;
            }
            A0H(this, num);
        }
    }

    public final void A0O(boolean z) {
        if (this.A0J != AnonymousClass05K.A00) {
            View[] viewArr = {this.A0D};
            if (z) {
                C294975nL.A04((C295005nO) null, viewArr, false);
            } else {
                C294975nL.A05(viewArr, false);
            }
        }
    }

    public final void A0P(boolean z, boolean z2) {
        ViewGroup viewGroup;
        if (this.A0J != AnonymousClass05K.A00 && (viewGroup = this.A06) != null) {
            View[] viewArr = {viewGroup};
            if (z) {
                C294975nL.A04((C295005nO) null, viewArr, z2);
            } else {
                C294975nL.A05(viewArr, z2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean A76(Object obj, Object obj2) {
        Integer num = this.A0J;
        if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A00 || obj != AnonymousClass80V.MEDIA_EDIT) {
            return true;
        }
        if (obj2 instanceof AnonymousClass8TZ) {
            this.A0N = ((AnonymousClass8TZ) obj2).A00;
        } else if (!(obj2 instanceof AnonymousClass8TY)) {
            if (!(obj2 instanceof AnonymousClass8T3)) {
                return true;
            }
            this.A0C.A01();
            return true;
        }
        return false;
    }

    public final void D4c() {
        this.A0Y.A00().FMB(true);
        C3509286x r5 = this.A0X;
        C3508086k r1 = r5.A0J;
        if (r1.A00().isVisible()) {
            C294975nL.A04((C295005nO) null, new View[]{r1.A00().getView()}, true);
            AnonymousClass8S4 r2 = r5.A01;
            if (r2.A00.A0V(C358088aL.A0C)) {
                r2.A02.A0G.A0C(true);
            }
            C71662eb r12 = r5.A0D;
            if (r12.A04()) {
                C294975nL.A04((C295005nO) null, new View[]{r12.A01()}, true);
            }
        }
    }

    public final void DMr(int i, boolean z) {
        int i2;
        this.A01 = i;
        int i3 = 0;
        boolean z2 = false;
        if (i == 0) {
            z2 = true;
        }
        ConstrainedEditText constrainedEditText = this.A0D;
        if (constrainedEditText != null) {
            constrainedEditText.DMr(i, z);
            ConstrainedEditText constrainedEditText2 = this.A0D;
            C360778f8 r0 = this.A0A;
            r0.getClass();
            int height = r0.A08.getHeight();
            if (z2) {
                i2 = this.A00;
            } else {
                i2 = 0;
            }
            constrainedEditText2.A01 = height;
            constrainedEditText2.A00 = i2;
            ConstrainedEditText.A00(constrainedEditText2);
            if (i > 0) {
                View view = this.A04;
                view.getClass();
                if (view.getVisibility() == 0 && this.A0D.getVisibility() == 0) {
                    this.A0D.requestFocus();
                }
            }
        }
        if (z) {
            i3 = -i;
        }
        float f = (float) i3;
        AnonymousClass8WF r6 = this.A0C;
        C355948Rz r5 = r6.A02;
        boolean z3 = true;
        boolean z4 = false;
        if (f != 0.0f) {
            z4 = true;
        }
        r5.A01 = z4;
        AnonymousClass80U r2 = r5.A0N;
        if (r2.Ats() == AnonymousClass80X.PRE_CAPTURE && r2.Atr() != AnonymousClass80V.MEDIA_EDIT) {
            C355948Rz.A06(r5);
        }
        AnonymousClass8FA r1 = r6.A05;
        if (f == 0.0f) {
            z3 = false;
        }
        r1.A01.Epw(Boolean.valueOf(z3));
        if (z2 && this.A0J == AnonymousClass05K.A01) {
            this.A0V.EEH(this);
        }
    }

    public final void DlC(Drawable drawable, int i, float f, float f2) {
        if (drawable instanceof C306386Ly) {
            this.A0F = (C306386Ly) drawable;
            A09(this);
            A0K();
            return;
        }
        C3509286x r1 = this.A0X;
        if (r1.A0A()) {
            AnonymousClass87G A012 = r1.A0H.A01();
            A012.getClass();
            r1.A02(A012).A09(drawable);
        }
    }

    public final void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        if (drawable == null) {
            this.A0F = null;
            A09(this);
            A0K();
        } else if (drawable instanceof C306386Ly) {
            DlC(drawable, i, f, f2);
        } else {
            C3509286x r1 = this.A0X;
            if (r1.A0A()) {
                AnonymousClass87G A012 = r1.A0H.A01();
                A012.getClass();
                AA8 A022 = r1.A02(A012);
                if (A022 instanceof C387529mM) {
                    C387529mM r3 = (C387529mM) A022;
                    if (drawable.equals(r3.A02)) {
                        r3.A00 = AnonymousClass7TG.A0G(r3.A04, r3.A00 + 1);
                        r3.A0L();
                    }
                } else if (A022 instanceof C387499mJ) {
                    C387499mJ r32 = (C387499mJ) A022;
                    if (drawable == r32.A03) {
                        int A0G2 = AnonymousClass7TG.A0G(r32.A04, r32.A00 + 1);
                        r32.A00 = A0G2;
                        C387499mJ.A00(AnonymousClass57C.CREATE_MODE_TAP_TO_CYCLE_SELECTION, r32, A0G2);
                    }
                } else if (A022 instanceof C387509mK) {
                    C387509mK r33 = (C387509mK) A022;
                    AnonymousClass57C r2 = AnonymousClass57C.CREATE_MODE_TAP_TO_CYCLE_SELECTION;
                    r33.A00 = AnonymousClass7TG.A0G(r33.A06, r33.A00 + 1);
                    C387509mK.A00(r2, r33);
                } else if (A022 instanceof C387559mP) {
                    C387559mP r34 = (C387559mP) A022;
                    if (r34.A02) {
                        AnonymousClass57C r22 = AnonymousClass57C.CREATE_MODE_TAP_TO_CYCLE_SELECTION;
                        int A0G3 = AnonymousClass7TG.A0G(r34.A01, r34.A00 + 1);
                        r34.A00 = A0G3;
                        C387559mP.A00(r22, r34, (C19476WaO) r34.A01.get(A0G3));
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void Dtk(Object obj) {
        this.A0C.A01();
    }

    public final /* bridge */ /* synthetic */ void Dto(Object obj) {
        if (obj == AnonymousClass80V.MEDIA_EDIT) {
            if (this.A0N || this.A0J == AnonymousClass05K.A0j) {
                this.A0C.A01();
            } else {
                AnonymousClass8WF r0 = this.A0C;
                CharSequence charSequence = this.A0I;
                TextColorScheme textColorScheme = this.A0E;
                View.OnTouchListener onTouchListener = this.A03;
                C358368an r2 = (C358368an) ((AnonymousClass8ME) r0.A03.A1g.get()).A1e.get();
                ConstrainedEditText constrainedEditText = r2.A1j;
                C294975nL.A04((C295005nO) null, new View[]{constrainedEditText}, true);
                constrainedEditText.setHint(charSequence);
                constrainedEditText.setOnTouchListener(onTouchListener);
                C314676if r1 = r2.A1g;
                AEU.A02(constrainedEditText, ((C360778f8) r1.get()).A07());
                AEU.A01(constrainedEditText, textColorScheme);
                AnonymousClass9UR.A07(constrainedEditText, ((C360778f8) r1.get()).A07(), r2.A0L, ((C360778f8) r1.get()).A07().A06.A00 * 24.0f);
            }
            this.A0Z.E3H(new Object());
        }
    }

    public final void EF8(Canvas canvas, int i, boolean z, boolean z2) {
        this.A0c.draw(canvas);
    }

    public final boolean isVisible() {
        Integer num = this.A0J;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N) {
            return true;
        }
        return false;
    }

    public final void onPause() {
        Integer num = this.A0J;
        if (num != AnonymousClass05K.A01 && num != AnonymousClass05K.A00) {
            A03(this);
            this.A0d.onPause();
        }
    }

    public final void onResume() {
        Integer num = this.A0J;
        if (num != AnonymousClass05K.A01 && num != AnonymousClass05K.A00) {
            this.A0d.onResume();
        }
    }

    public C353798Jc(View view, View view2, ViewStub viewStub, UserSession userSession, AnonymousClass3E6 r6, CameraConfiguration cameraConfiguration, TargetViewSizeProvider targetViewSizeProvider, C3509286x r9, C3497281m r10, AnonymousClass80U r11, AnonymousClass80F r12, DirectCameraViewModel directCameraViewModel, AnonymousClass85s r14, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A0Z = r11;
        this.A0d = r14;
        this.A0Y = r10;
        this.A0P = view.getContext();
        this.A0R = view;
        this.A0c = interactiveDrawableContainer;
        this.A0S = view2;
        this.A0T = viewStub;
        this.A0V = r6;
        this.A0U = userSession;
        this.A0a = r12;
        this.A0b = directCameraViewModel;
        this.A0X = r9;
        this.A0Q = view.findViewById(R.id.camera_shutter_button_container);
        this.A0W = targetViewSizeProvider;
        this.A0O = cameraConfiguration;
        A0H(this, AnonymousClass05K.A00);
    }

    public static void A01(Drawable drawable, C353798Jc r6) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        InteractiveDrawableContainer interactiveDrawableContainer = r6.A0c;
        int width = (interactiveDrawableContainer.getWidth() / 2) - (intrinsicWidth / 2);
        int height = (interactiveDrawableContainer.getHeight() / 2) - (intrinsicHeight / 2);
        drawable.setBounds(width, height, intrinsicWidth + width, intrinsicHeight + height);
    }

    public final void A0M(B25 b25) {
        A03(this);
        if (!this.A0M) {
            this.A0M = true;
            if (this.A0J != AnonymousClass05K.A00) {
                A0H(this, AnonymousClass05K.A0Y);
            }
            0nA.A0p(this.A0R, new C41061Anj(b25, this));
        }
    }

    public final boolean CKR(boolean z, boolean z2) {
        return true;
    }
}
