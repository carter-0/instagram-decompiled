package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import java.util.regex.Pattern;

/* renamed from: X.6ML  reason: invalid class name */
public final class AnonymousClass6ML extends AnonymousClass6MD {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public IgTextView A04;
    public AnonymousClass6MH A05;
    public CharSequence A06;
    public boolean A07;
    public boolean A08;
    public 0rN A09;
    public final IgFrameLayout A0A;
    public final C252063oV A0B;
    public final C255773uh A0C;
    public final C250973mM A0D;
    public final A88 A0E;
    public final C309426Yf A0F;
    public final AnonymousClass6M6 A0G;
    public final C309846Zv A0H;
    public final AnonymousClass6MA A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final double A0L;
    public final UserSession A0M;
    public final AnonymousClass6M9 A0N;
    public final AnonymousClass6M8 A0O;
    public final String A0P;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6ML(com.instagram.common.session.UserSession r14, X.C252063oV r15, X.C255773uh r16, X.C250973mM r17, X.AnonymousClass6M9 r18, X.C309426Yf r19, X.AnonymousClass6M8 r20, X.AnonymousClass6M6 r21, X.C309846Zv r22, X.AnonymousClass6MA r23) {
        /*
            r13 = this;
            r7 = 1
            X.0qQ.A0B(r15, r7)
            r8 = 2
            r2 = r21
            X.0qQ.A0B(r2, r8)
            r5 = 10
            X.6ME r0 = X.AnonymousClass6ME.CAPTION
            r13.<init>(r2, r0)
            r13.A0B = r15
            r13.A0G = r2
            r0 = r20
            r13.A0O = r0
            r0 = r17
            r13.A0D = r0
            r6 = r16
            r13.A0C = r6
            r3 = r19
            r13.A0F = r3
            r13.A0M = r14
            r0 = r18
            r13.A0N = r0
            r0 = r23
            r13.A0I = r0
            r0 = r22
            r13.A0H = r0
            android.view.View r10 = r15.getView()
            com.instagram.common.ui.base.IgFrameLayout r10 = (com.instagram.common.ui.base.IgFrameLayout) r10
            r13.A0A = r10
            X.A88 r4 = r6.A0I()
            if (r4 == 0) goto L_0x0154
            r13.A0E = r4
            java.lang.String r0 = r4.A0B
            if (r0 == 0) goto L_0x0144
            java.lang.String r6 = X.0rw.A0t(r0)
            java.lang.String r0 = "\\s+"
            X.11S r1 = new X.11S
            r1.<init>(r0)
            java.lang.String r0 = " "
            java.lang.String r0 = r1.A00(r6, r0)
            java.lang.CharSequence r0 = X.00l.A0B(r0)
            java.lang.String r0 = r0.toString()
            r13.A0P = r0
            X.9L1 r0 = new X.9L1
            r0.<init>(r13, r5)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r13.A0K = r0
            r1 = 9
            X.9L1 r0 = new X.9L1
            r0.<init>(r13, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r13.A0J = r0
            r9 = -1
            r13.A03 = r9
            X.6MH r0 = X.AnonymousClass6MH.A05
            r13.A05 = r0
            int r0 = r2.A0E
            double r0 = (double) r0
            r5 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r0 = r0 * r5
            r13.A0L = r0
            java.lang.String r0 = ""
            r13.A06 = r0
            r13.A07 = r7
            X.A88 r0 = r13.A0E
            java.lang.Integer r1 = r0.A06
            if (r1 == 0) goto L_0x00c1
            int r0 = r13.A06()
            double r5 = (double) r0
            int r0 = r1.intValue()
            double r0 = (double) r0
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r11
            double r5 = r5 * r0
            int r0 = (int) r5
            r13.A03 = r0
            com.instagram.common.ui.base.IgFrameLayout r5 = r13.A0A
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0 = 0
            r1.setMargins(r0, r0, r0, r0)
            int r0 = r13.A03
            r1.width = r0
            r5.setLayoutParams(r1)
        L_0x00c1:
            r0 = 2131442393(0x7f0b3ad9, float:1.8506825E38)
            android.view.View r5 = r10.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5
            r13.A04 = r5
            com.instagram.api.schemas.CaptionTextFontStyle r0 = r4.A00
            if (r0 == 0) goto L_0x013c
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x0137
            r0 = 2
            if (r1 == r8) goto L_0x00dd
            r0 = 3
            if (r1 != r0) goto L_0x013c
            r0 = 0
        L_0x00dd:
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r0)
        L_0x00e1:
            X.0qQ.A07(r0)
        L_0x00e4:
            r5.setTypeface(r0)
            com.instagram.common.ui.base.IgTextView r5 = r13.A04
            r1 = 0
            X.0qQ.A0B(r5, r1)
            X.6LK r0 = X.AnonymousClass6LK.A00
            r5.setMovementMethod(r0)
            r5.setClickable(r1)
            r5.setLongClickable(r1)
            java.lang.Float r0 = r4.A03
            if (r0 == 0) goto L_0x0134
            float r0 = r0.floatValue()
        L_0x0100:
            r5.setTextSize(r0)
            int r1 = r13.A03
            com.instagram.common.ui.base.IgTextView r5 = r13.A04
            if (r1 != r9) goto L_0x0110
            int r1 = r13.A06()
            int r0 = r2.A0H
            int r1 = r1 - r0
        L_0x0110:
            int r0 = r2.A0I
            int r1 = r1 - r0
            int r2 = X.AnonymousClass6MI.A00(r5, r1)
            com.instagram.common.ui.base.IgTextView r1 = r13.A04
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            X.0rN r0 = X.AnonymousClass6MI.A05(r0, r1, r2)
            r13.A09 = r0
            java.lang.Integer r0 = r4.A07
            if (r0 == 0) goto L_0x0132
            int r0 = r0.intValue()
        L_0x0129:
            r3.A0G = r0
            r13.A01()
            r13.A00()
            return
        L_0x0132:
            r0 = 2
            goto L_0x0129
        L_0x0134:
            r0 = 1098907648(0x41800000, float:16.0)
            goto L_0x0100
        L_0x0137:
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r7)
            goto L_0x00e1
        L_0x013c:
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r7)
            X.0qQ.A0A(r0)
            goto L_0x00e4
        L_0x0144:
            java.lang.String r1 = "Caption text should not be null for ad "
            java.lang.String r0 = r6.A0U(r14)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0154:
            java.lang.String r1 = "SystematicCaption model should not be null for ad "
            java.lang.String r0 = r6.A0U(r14)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ML.<init>(com.instagram.common.session.UserSession, X.3oV, X.3uh, X.3mM, X.6M9, X.6Yf, X.6M8, X.6M6, X.6Zv, X.6MA):void");
    }

    private final void A00() {
        SpannableStringBuilder A012;
        boolean z;
        boolean z2;
        String str;
        int i;
        CharSequence charSequence = this.A0P;
        0qQ.A0C(charSequence, "null cannot be cast to non-null type kotlin.CharSequence");
        if (this.A08) {
            C19527WbD wbD = new C19527WbD(this);
            0rN r8 = this.A09;
            int i2 = this.A02;
            int intValue = ((Number) this.A0K.getValue()).intValue();
            A88 a88 = this.A0E;
            Boolean bool = a88.A01;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            Boolean bool2 = a88.A02;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = true;
            }
            AnonymousClass6M6 r2 = this.A0G;
            0qQ.A0B(charSequence, 0);
            0qQ.A0B(r8, 1);
            C306726Ng r1 = new C306726Ng(wbD);
            if (z) {
                str = r2.A0K;
            } else {
                str = r2.A0L;
            }
            SpannableString spannableString = new SpannableString(str);
            String obj = spannableString.toString();
            if (obj != null) {
                i = obj.length();
            } else {
                i = 0;
            }
            spannableString.setSpan(r1, 0, i, 33);
            if (z2) {
                spannableString.setSpan(new UnderlineSpan(), 0, i, 33);
            }
            spannableString.setSpan(new ForegroundColorSpan(0nH.A07(intValue, 0.8f)), 0, i, 33);
            charSequence = AnonymousClass6MI.A04(spannableString, r8, charSequence, i2);
        }
        UserSession userSession = this.A0M;
        boolean A022 = 1P7.A02(userSession);
        int intValue2 = ((Number) this.A0K.getValue()).intValue();
        AnonymousClass6M9 r0 = this.A0N;
        if (A022) {
            A012 = W1z.A01(userSession, r0, charSequence, intValue2);
        } else {
            A012 = AnonymousClass6MG.A01(userSession, r0, charSequence, intValue2);
            0qQ.A0A(A012);
        }
        this.A06 = A012;
    }

    private final void A01() {
        int i;
        String str = this.A0P;
        0rN r3 = this.A09;
        int A012 = AnonymousClass6MI.A01(r3, str, (int) this.A0L);
        int min = Math.min(A012, this.A0F.A0G);
        this.A02 = min;
        if (A012 > min) {
            this.A08 = true;
        }
        this.A03 = AnonymousClass6MI.A03(r3, str, min);
        this.A01 = AnonymousClass6MI.A02(r3, str, this.A02);
        Float f = this.A0E.A05;
        if (f != null) {
            float floatValue = f.floatValue();
            AnonymousClass6M6 r2 = this.A0G;
            i = (int) (((((float) r2.A0E) * floatValue) - ((float) (A04() / 2))) - ((float) (r2.A0I / 2)));
        } else {
            i = -1;
        }
        this.A05 = new AnonymousClass6MH(A06(), A04(), 0, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r11 <= r9) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r15 = this;
            X.3oV r8 = r15.A0B
            int r0 = r8.CFV()
            r7 = 8
            if (r0 == r7) goto L_0x008c
            X.6Yf r6 = r15.A0F
            float r4 = r6.A07
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = 0
            r5 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            float r9 = r6.A06
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            X.6MH r1 = r15.A05
            int r0 = r1.A03
            float r11 = (float) r0
            r15.A01 = r11
            int r0 = r1.A00
            float r3 = (float) r0
            float r12 = r11 + r3
            X.6M6 r2 = r15.A0G
            int r0 = r2.A0I
            float r1 = (float) r0
            float r12 = r12 + r1
            r15.A00 = r12
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0035
            r10 = 1
        L_0x0035:
            r15.A07 = r10
            r14 = r11
            r0 = r9
            if (r10 == 0) goto L_0x003d
            r14 = r4
            r0 = r12
        L_0x003d:
            float r14 = r14 - r0
            int r0 = r2.A03
            float r13 = (float) r0
            int r0 = r2.A02
            float r0 = (float) r0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0057
            int r0 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0057
            if (r10 == 0) goto L_0x004f
            r11 = r12
        L_0x004f:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
        L_0x0057:
            int r0 = r2.A04
            float r0 = (float) r0
            if (r10 == 0) goto L_0x0097
            float r4 = r4 - r0
            float r4 = r4 - r1
            float r4 = r4 - r3
        L_0x005f:
            android.view.View r0 = r8.getView()
            r0.setTranslationY(r4)
        L_0x0066:
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x008d
            float r0 = r15.A01
            double r3 = (double) r0
            int r0 = r2.A0E
            double r1 = (double) r0
            r9 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r1 = r1 * r9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
        L_0x007a:
            int r0 = r15.A02
            if (r0 <= r5) goto L_0x009a
            r6.A0G = r5
            r15.A01()
            r15.A00()
            r15.A09()
            r15.A08()
        L_0x008c:
            return
        L_0x008d:
            float r1 = r15.A00
            int r0 = r2.A0E
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008c
            goto L_0x007a
        L_0x0097:
            float r4 = r9 + r0
            goto L_0x005f
        L_0x009a:
            r8.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r0 = r15.A04
            r0.setVisibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ML.A08():void");
    }

    public final void A09() {
        int i;
        if (this.A05.A03 == -1) {
            this.A0B.setVisibility(8);
            this.A04.setVisibility(8);
            return;
        }
        C252063oV r2 = this.A0B;
        r2.setVisibility(0);
        IgTextView igTextView = this.A04;
        igTextView.setVisibility(0);
        if (!this.A08) {
            igTextView.setTextAlignment(4);
        }
        igTextView.setMaxLines(this.A02);
        igTextView.setText(this.A06);
        igTextView.setTextColor(((Number) this.A0K.getValue()).intValue());
        Drawable background = r2.getView().getBackground();
        AnonymousClass0eM r4 = this.A0J;
        background.setTint(((Number) r4.getValue()).intValue());
        r2.getView().setBackground(background);
        r2.getView().setTranslationY((float) this.A05.A03);
        AnonymousClass6MA r22 = this.A0I;
        r22.A01("caption_showed", String.valueOf(!this.A05.A04));
        AnonymousClass6MH r1 = this.A05;
        if (!r1.A04) {
            r22.A00("caption_width", r1.A01);
            r22.A00("caption_height", this.A05.A00);
            r22.A00("caption_position_start_x", this.A05.A02);
            r22.A00("caption_position_start_y", this.A05.A03);
            String obj = this.A06.toString();
            r22.A01("short_caption_text", obj);
            r22.A01("is_caption_fully_displayed", String.valueOf(!this.A08));
            r22.A01("caption_num_hashtags_showed", String.valueOf(C253053q8.A03(obj).size()));
            Integer num = null;
            r22.A01("caption_num_mentions_showed", String.valueOf(C253053q8.A05(obj, false).size()));
            Pattern pattern = 0mp.A00;
            if (obj != null) {
                i = obj.length();
            } else {
                i = 0;
            }
            r22.A01("caption_num_char_showed", String.valueOf(i));
            r22.A01("caption_num_lines_showed", String.valueOf(this.A02));
            1Xj r0 = this.A0C.A0b;
            if (r0 != null) {
                num = Integer.valueOf(r0.A0n());
            }
            r22.A01("caption_num_char_total", String.valueOf(num));
            r22.A01("caption_text_color", 0nH.A0F(igTextView.getCurrentTextColor()));
            r22.A01("caption_background_color", 0nH.A0F(((Number) r4.getValue()).intValue()));
            r22.A00("caption_font_size", (int) igTextView.getTextSize());
            r22.A00("caption_line_height", igTextView.getLineHeight());
            r22.A01("is_systematic_caption", "true");
        }
    }
}
