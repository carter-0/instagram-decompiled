package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3V9  reason: invalid class name */
public final class AnonymousClass3V9 implements AnonymousClass2xU {
    public int A00;
    public int A01;
    public AnonymousClass3W1 A02;
    public AnonymousClass3VA A03;
    public C262744Fv A04;
    public C262904Gl A05;
    public C247753gr A06;
    public Runnable A07;
    public Runnable A08;
    public Runnable A09;
    public Runnable A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Context A0F;
    public final Handler A0G;
    public final UserSession A0H;
    public final C71662eb A0I;
    public final View A0J;

    public final void A0G(Integer num) {
        Integer num2;
        View view;
        if (this.A02 != null && !this.A0E) {
            A07(this);
            C247753gr r7 = this.A06;
            if (r7 != null && (num2 = A00(this).A00) != num) {
                A02();
                A00(this).A00 = num;
                View view2 = r7.A00;
                0nA.A0f(view2, -2);
                int intValue = num2.intValue();
                ImageView imageView = r7.A02;
                if (intValue != 0) {
                    imageView.setVisibility(0);
                    if (intValue != 1) {
                        TextView textView = r7.A03;
                        textView.setVisibility(0);
                        View view3 = r7.A01;
                        view3.setVisibility(0);
                        if (num == AnonymousClass05K.A01) {
                            this.A0B = false;
                            C262904Gl r0 = this.A05;
                            if (r0 != null) {
                                r0.DqR();
                            }
                            C247763gs.A02(textView);
                            int i = -this.A01;
                            C294975nL A012 = C294975nL.A01(view2, 1);
                            if (A012.A0W()) {
                                A012.A05 = new C65719LyZ(view2, A012, i);
                                return;
                            } else {
                                C247763gs.A03(view2, i);
                                return;
                            }
                        } else if (num == AnonymousClass05K.A00) {
                            this.A0B = false;
                            C262904Gl r02 = this.A05;
                            if (r02 != null) {
                                r02.DqR();
                            }
                            C247763gs.A02(view3);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        view = r7.A03;
                        view.setVisibility(8);
                        View view4 = r7.A01;
                        view4.setVisibility(0);
                        if (num == AnonymousClass05K.A0C) {
                            this.A0B = true;
                            int i2 = this.A01;
                            C294975nL A013 = C294975nL.A01(view2, 1);
                            if (A013.A0W()) {
                                A013.A05 = new C65719LyZ(view2, A013, i2);
                            } else {
                                C247763gs.A03(view2, i2);
                            }
                        } else if (num == AnonymousClass05K.A00) {
                            this.A0B = false;
                            C247763gs.A02(view4);
                            C262904Gl r03 = this.A05;
                            if (r03 != null) {
                                r03.DqT();
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    imageView.setVisibility(0);
                    view = r7.A01;
                    view.setVisibility(8);
                    if (num == AnonymousClass05K.A01) {
                        this.A0B = false;
                        r7.A03.setVisibility(8);
                        C247763gs.A01(view);
                        C262904Gl r04 = this.A05;
                        if (r04 != null) {
                            r04.DqU();
                            return;
                        }
                        return;
                    } else if (num == AnonymousClass05K.A0C) {
                        this.A0B = true;
                        r7.A03.setVisibility(0);
                    } else {
                        return;
                    }
                }
                C247763gs.A01(view);
                C262904Gl r05 = this.A05;
                if (r05 != null) {
                    r05.DqS();
                }
                A00(this).A03 = true;
                A00(this).A05 = true;
            }
        }
    }

    public final void A0H(String str) {
        0qQ.A0B(str, 0);
        A07(this);
        C247753gr r4 = this.A06;
        if (r4 == null) {
            return;
        }
        if (str.length() == 0) {
            r4.A03.setText("");
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(new CharacterStyle(), 0, spannableStringBuilder.length(), 33);
        r4.A03.setText(spannableStringBuilder);
        int dimensionPixelSize = this.A0F.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        C247753gr r3 = this.A06;
        if (r3 != null) {
            r3.A03.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, SN3.MAX_SIGNED_POWER_OF_TWO));
            this.A01 = r3.A03.getMeasuredWidth();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (r6.A20 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0110, code lost:
        if (r6.A1x != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011d, code lost:
        if (r6.A2G != false) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQp(X.AnonymousClass3W1 r6, int r7) {
        /*
            r5 = this;
            r2 = 0
            X.0qQ.A0B(r6, r2)
            boolean r0 = r5.A0E
            r4 = 64
            if (r0 == 0) goto L_0x000d
            if (r7 == r4) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            X.3W1 r1 = r5.A02
            if (r1 != r6) goto L_0x000c
            r0 = 10
            if (r7 == r0) goto L_0x00ff
            r0 = 40
            if (r7 == r0) goto L_0x010b
            r0 = 58
            r3 = 1
            if (r7 == r0) goto L_0x0079
            if (r7 == r4) goto L_0x004f
            r0 = 78
            if (r7 == r0) goto L_0x0035
            switch(r7) {
                case 16: goto L_0x0028;
                case 17: goto L_0x0125;
                case 18: goto L_0x0086;
                case 19: goto L_0x0118;
                default: goto L_0x0027;
            }
        L_0x0027:
            return
        L_0x0028:
            r5.A0C()
            X.3TF r1 = r6.A0i
            X.3TF r0 = X.AnonymousClass3TF.IDLE
            if (r1 == r0) goto L_0x0132
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0121
        L_0x0035:
            X.4Fv r0 = r5.A04
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.A09
            if (r0 != r3) goto L_0x000c
            if (r1 == 0) goto L_0x00df
            java.lang.Boolean r1 = r1.A0x
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00df
            r5.A0A()
            return
        L_0x004f:
            X.3VA r1 = r5.A03
            X.3VA r0 = X.AnonymousClass3VA.HIGHLIGHTS
            if (r1 != r0) goto L_0x000c
            A07(r5)
            X.3gr r2 = r5.A06
            if (r2 == 0) goto L_0x000c
            boolean r0 = r6.A1t
            android.widget.ImageView r1 = r2.A02
            if (r0 == 0) goto L_0x0136
            X.0eM r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.setImageDrawable(r0)
            X.0eM r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            X.7i4 r0 = (X.C338507i4) r0
            r0.start()
            return
        L_0x0079:
            X.4Fv r0 = r5.A04
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.A0C
            if (r0 != r3) goto L_0x000c
            boolean r0 = r6.A20
            if (r0 == 0) goto L_0x00ef
            goto L_0x00bd
        L_0x0086:
            boolean r0 = r6.A1w
            if (r0 != 0) goto L_0x000c
            X.47M r0 = A00(r5)
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x000c
            r5.A0C()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5.A0G(r0)
            X.4Fv r0 = r5.A04
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x00a8
            X.47M r0 = A00(r5)
            r0.A03 = r2
        L_0x00a8:
            X.3VA r1 = r5.A03
            X.3VA r0 = X.AnonymousClass3VA.ADD_CONTENT_NOTE
            if (r1 != r0) goto L_0x000c
            com.instagram.common.session.UserSession r3 = r5.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163662147953372(0x20810971002822dc, double:4.066139513102511E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x000c
        L_0x00bd:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.3W1 r0 = r5.A02
            if (r0 == 0) goto L_0x000c
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x000c
            A07(r5)
            X.47M r0 = A00(r5)
            java.lang.Integer r0 = r0.A00
            if (r0 == r1) goto L_0x000c
            r5.A02()
            X.47M r0 = A00(r5)
            r0.A00 = r1
            r5.A0D()
            return
        L_0x00df:
            X.3W1 r0 = r5.A02
            if (r0 == 0) goto L_0x000c
            java.lang.Boolean r1 = r0.A0x
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x000c
        L_0x00ef:
            X.2eb r0 = r5.A0I
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x000c
            X.3gr r0 = r5.A06
            if (r0 == 0) goto L_0x000c
            android.view.View r0 = r0.A01
            r0.setVisibility(r2)
            return
        L_0x00ff:
            boolean r0 = r6.A1z
            if (r0 == 0) goto L_0x0107
            r5.A0C()
            goto L_0x011f
        L_0x0107:
            r5.A0C()
            goto L_0x0112
        L_0x010b:
            r5.A0C()
            boolean r0 = r6.A1x
            if (r0 == 0) goto L_0x011f
        L_0x0112:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5.A0G(r0)
            goto L_0x0132
        L_0x0118:
            r5.A0C()
            boolean r0 = r6.A2G
            if (r0 == 0) goto L_0x0132
        L_0x011f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0121:
            r5.A0G(r0)
            return
        L_0x0125:
            boolean r0 = r6.A23
            if (r0 == 0) goto L_0x000c
            X.47M r0 = A00(r5)
            r0.A04 = r2
            r5.A0C()
        L_0x0132:
            r5.A0B()
            return
        L_0x0136:
            X.4Fv r0 = r5.A04
            if (r0 == 0) goto L_0x014b
            android.graphics.drawable.Drawable r0 = r0.A01
        L_0x013c:
            r1.setImageDrawable(r0)
            X.0eM r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            X.7i4 r0 = (X.C338507i4) r0
            r0.stop()
            return
        L_0x014b:
            r0 = 0
            goto L_0x013c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V9.DQp(X.3W1, int):void");
    }

    public static final AnonymousClass47M A00(AnonymousClass3V9 r3) {
        AnonymousClass3W1 r2 = r3.A02;
        if (r2 != null) {
            return r2.A07(r3.A00, r3.A03.ordinal());
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A01() {
        if (this.A0A != null || this.A08 != null || this.A07 != null || this.A09 != null) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final void A02() {
        C247753gr r2 = this.A06;
        if (r2 == null) {
            return;
        }
        if (C294975nL.A01(r2.A01, 1).A0W() || C294975nL.A01(r2.A03, 1).A0W() || C294975nL.A01(r2.A00, 1).A0W()) {
            C294975nL.A01(r2.A01, 1).A0G();
            C294975nL.A01(r2.A03, 1).A0G();
            C294975nL.A01(r2.A00, 1).A0G();
            A0D();
        }
    }

    public static final void A03(View view, AnonymousClass3V9 r7) {
        C247753gr r5 = new C247753gr(view);
        r7.A06 = r5;
        int lineHeight = r5.A03.getLineHeight();
        Context context = r7.A0F;
        int dimensionPixelSize = (lineHeight - context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        r5.A00.setBackground(C247763gs.A00(context, lineHeight));
        ImageView imageView = r5.A02;
        0nA.A0f(imageView, lineHeight);
        0nA.A0V(imageView, lineHeight);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        03v.A0B(r5.A01, new C247773gt());
    }

    public static final void A05(AnonymousClass3V9 r4) {
        long j;
        AnonymousClass3VA r1 = r4.A03;
        if (r1 != AnonymousClass3VA.PRODUCTS) {
            if (r1 == AnonymousClass3VA.OPEN_CAROUSEL) {
                j = 0;
            } else {
                j = 1000;
            }
            r4.A01();
            A07(r4);
            Y22 y22 = new Y22(r4);
            r4.A08 = y22;
            r4.A0G.postDelayed(y22, j);
        }
    }

    public static final void A07(AnonymousClass3V9 r1) {
        C71662eb r12 = r1.A0I;
        if (r12.A00 == null) {
            r12.A01();
        }
    }

    public static final boolean A08(AnonymousClass3V9 r5) {
        C262744Fv r2;
        AnonymousClass3W1 r4 = r5.A02;
        if (r4 == null || (r2 = r5.A04) == null || r5.A0C || !r4.A23 || r5.A00 != r4.A03 || r4.A0i != AnonymousClass3TF.IDLE || r4.A20 || r4.A2G || r4.A1z || r2.A08 || r2.A0A || r2.A0B) {
            return true;
        }
        return false;
    }

    public final View A09() {
        View view;
        View findViewById;
        if (this.A06 == null || (view = this.A0J) == null || ((findViewById = view.findViewById(R.id.media_group)) == null && (findViewById = view.findViewById(R.id.carousel_image_media_group)) == null && (findViewById = view.findViewById(R.id.carousel_video_media_group)) == null)) {
            return null;
        }
        return findViewById;
    }

    public final void A0A() {
        C247753gr r0;
        if (this.A0I.A00 != null && (r0 = this.A06) != null) {
            r0.A01.setVisibility(8);
        }
    }

    public final void A0C() {
        Runnable runnable = this.A0A;
        if (runnable != null) {
            this.A0G.removeCallbacks(runnable);
            this.A0A = null;
        }
        Runnable runnable2 = this.A08;
        if (runnable2 != null) {
            this.A0G.removeCallbacks(runnable2);
            this.A08 = null;
        }
        Runnable runnable3 = this.A07;
        if (runnable3 != null) {
            this.A0G.removeCallbacks(runnable3);
            this.A07 = null;
        }
        Runnable runnable4 = this.A09;
        if (runnable4 != null) {
            this.A0G.removeCallbacks(runnable4);
            this.A09 = null;
        }
    }

    public final void A0E(int i, float f) {
        View view = this.A0J;
        if (view != null) {
            float A022 = C229632nm.A02(1.0f - (view.getX() / (((float) i) * f)), 0.0f, 1.0f);
            C247753gr r0 = this.A06;
            if (r0 != null) {
                r0.A01.setAlpha(A022);
            }
        }
    }

    public AnonymousClass3V9(Context context, View view, UserSession userSession, C71662eb r6) {
        this.A0J = view;
        this.A0F = context;
        this.A0H = userSession;
        this.A0I = r6;
        this.A0G = new Handler(Looper.getMainLooper());
        this.A03 = AnonymousClass3VA.A09;
        this.A00 = -1;
        this.A0D = true;
        if (r6.A00 != null) {
            View A012 = r6.A01();
            0qQ.A07(A012);
            A03(A012, this);
            return;
        }
        r6.A02 = new AnonymousClass3VB(this);
    }

    public static final void A04(AnonymousClass3V9 r4) {
        r4.A01();
        A07(r4);
        Y21 y21 = new Y21(r4);
        r4.A07 = y21;
        r4.A0G.postDelayed(y21, 4000);
    }

    public static final void A06(AnonymousClass3V9 r4) {
        r4.A01();
        A07(r4);
        C2801050c r3 = new C2801050c(r4);
        r4.A09 = r3;
        r4.A0G.postDelayed(r3, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A0H, 36326927878862933L) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
            r4 = this;
            boolean r0 = A08(r4)
            if (r0 != 0) goto L_0x0024
            A07(r4)
            X.47M r0 = A00(r4)
            java.lang.Integer r0 = r0.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x005b
            r0 = 1
            if (r1 == r0) goto L_0x0025
            X.47M r0 = A00(r4)
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x0024
            A04(r4)
        L_0x0024:
            return
        L_0x0025:
            X.47M r0 = A00(r4)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x004f
            X.4Fv r0 = r4.A04
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.A0D
            if (r0 != 0) goto L_0x0039
        L_0x0035:
            A05(r4)
            return
        L_0x0039:
            X.3VA r1 = r4.A03
            X.3VA r0 = X.AnonymousClass3VA.UPCOMING_EVENT
            if (r1 != r0) goto L_0x004f
            com.instagram.common.session.UserSession r3 = r4.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326927878862933(0x810f2600003855, double:3.036633695165939E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x004f
            goto L_0x0035
        L_0x004f:
            X.47M r0 = A00(r4)
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0024
            A06(r4)
            return
        L_0x005b:
            r4.A01()
            A07(r4)
            X.Y23 r3 = new X.Y23
            r3.<init>(r4)
            r4.A0A = r3
            android.os.Handler r2 = r4.A0G
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V9.A0B():void");
    }

    public final void A0D() {
        C247753gr r6;
        A07(this);
        if (this.A02 != null && (r6 = this.A06) != null) {
            0nA.A0f(r6.A00, -2);
            View view = r6.A01;
            view.setAlpha(1.0f);
            TextView textView = r6.A03;
            textView.setAlpha(1.0f);
            if (!this.A0D) {
                2eQ.A04(view, 4);
            }
            int intValue = A00(this).A00.intValue();
            if (intValue == 0) {
                this.A0B = false;
                view.setVisibility(8);
            } else if (intValue != 1) {
                this.A0B = true;
                view.setVisibility(0);
                r6.A02.setVisibility(0);
                textView.setVisibility(0);
                A00(this).A03 = true;
                A00(this).A05 = true;
            } else {
                this.A0B = false;
                r6.A02.setVisibility(0);
                textView.setVisibility(8);
                view.setVisibility(0);
            }
        }
    }

    public final void A0F(Drawable drawable) {
        A07(this);
        C247753gr r0 = this.A06;
        if (r0 != null) {
            r0.A02.setImageDrawable(drawable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3V9(android.view.View r4, com.instagram.common.session.UserSession r5, int r6) {
        /*
            r3 = this;
            android.content.Context r2 = r4.getContext()
            X.0qQ.A07(r2)
            android.view.View r1 = r4.findViewById(r6)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x001a
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0011:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r3.<init>(r2, r4, r5, r0)
            return
        L_0x001a:
            r1 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V9.<init>(android.view.View, com.instagram.common.session.UserSession, int):void");
    }
}
