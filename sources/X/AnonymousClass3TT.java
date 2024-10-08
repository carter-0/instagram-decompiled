package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import org.webrtc.EglBase14Impl;

/* renamed from: X.3TT  reason: invalid class name */
public final class AnonymousClass3TT implements AnonymousClass2xU {
    public int A00;
    public ViewGroup A01 = null;
    public TextView A02;
    public AnonymousClass4Fs A03;
    public AnonymousClass3W1 A04;
    public Runnable A05;
    public Runnable A06;
    public boolean A07;
    public final Handler A08;
    public final ViewStub A09;
    public final UserSession A0A;

    public AnonymousClass3TT(ViewStub viewStub, UserSession userSession) {
        this.A09 = viewStub;
        this.A0A = userSession;
        this.A08 = new Handler(Looper.getMainLooper());
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            A00(viewGroup, this);
        } else if (viewStub != null) {
            viewStub.setOnInflateListener(new AnonymousClass3TU(this));
        }
    }

    public final void DQp(AnonymousClass3W1 r4, int i) {
        Integer num;
        0qQ.A0B(r4, 0);
        if (r4 == this.A04) {
            if (i != 4) {
                if (i != 10) {
                    switch (i) {
                        case 16:
                            A05();
                            this.A07 = true;
                            if (r4.A0i != AnonymousClass3TF.IDLE) {
                                return;
                            }
                            break;
                        case 17:
                            A05();
                            if (!r4.A23) {
                                return;
                            }
                            break;
                        case EglBase14Impl.EGLExt_SDK_VERSION:
                            if (!r4.A1w) {
                                this.A07 = false;
                                A05();
                                num = AnonymousClass05K.A00;
                                break;
                            } else {
                                this.A07 = true;
                                return;
                            }
                        default:
                            return;
                    }
                } else {
                    A05();
                    if (r4.A1z) {
                        num = AnonymousClass05K.A01;
                    }
                }
                A02(this, num);
                return;
            }
            A05();
            r4.A15 = AnonymousClass05K.A00;
            A06();
            A04();
        }
    }

    public static final void A01(AnonymousClass3TT r4) {
        if (r4.A06 == null && r4.A05 == null) {
            C275924sC r3 = new C275924sC(r4);
            r4.A05 = r3;
            r4.A08.postDelayed(r3, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final void A02(AnonymousClass3TT r5, Integer num) {
        Integer num2;
        View view;
        ViewGroup viewGroup = r5.A01;
        if (viewGroup == null) {
            ViewStub viewStub = r5.A09;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            0qQ.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) view;
            r5.A01 = viewGroup;
        }
        AnonymousClass3W1 r0 = r5.A04;
        if (r0 != null) {
            num2 = r0.A15;
        } else {
            num2 = null;
        }
        if (num2 == num) {
            return;
        }
        if (viewGroup != null) {
            if (C294975nL.A01(viewGroup, 1).A0W()) {
                ViewGroup viewGroup2 = r5.A01;
                if (viewGroup2 != null) {
                    C294975nL.A01(viewGroup2, 1).A0G();
                    r5.A06();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            AnonymousClass3W1 r02 = r5.A04;
            if (r02 != null) {
                r02.A15 = num;
            }
            Integer num3 = AnonymousClass05K.A01;
            if (num2 == num3 && num == AnonymousClass05K.A00) {
                ViewGroup viewGroup3 = r5.A01;
                if (viewGroup3 != null) {
                    C247763gs.A01(viewGroup3);
                    AnonymousClass3W1 r03 = r5.A04;
                    if (r03 != null) {
                        r03.A36 = true;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } else if (num2 == AnonymousClass05K.A00 && num == num3) {
                ViewGroup viewGroup4 = r5.A01;
                if (viewGroup4 != null) {
                    C247763gs.A02(viewGroup4);
                    AnonymousClass3W1 r1 = r5.A04;
                    if (r1 != null) {
                        r1.A36 = false;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final boolean A03(AnonymousClass3TT r2, AnonymousClass3W1 r3) {
        if (!r3.A23 || r3.A1z) {
            return true;
        }
        if (!r2.A07) {
            return false;
        }
        if (182.A06(0Tu.A05, r2.A0A, 36330784759628559L)) {
            return true;
        }
        return false;
    }

    public final void A04() {
        AnonymousClass3W1 r0;
        AnonymousClass3W1 r02 = this.A04;
        if (r02 != null && !A03(this, r02) && (r0 = this.A04) != null) {
            if (r0.A15.intValue() != 1) {
                A01(this);
                return;
            }
            if (182.A06(0Tu.A05, this.A0A, 36330784759628559L)) {
                return;
            }
            if (this.A06 == null && this.A05 == null) {
                C40884Aks aks = new C40884Aks(this);
                this.A06 = aks;
                this.A08.postDelayed(aks, 1000);
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void A05() {
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A08.removeCallbacks(runnable);
        }
        this.A06 = null;
        Runnable runnable2 = this.A05;
        if (runnable2 != null) {
            this.A08.removeCallbacks(runnable2);
        }
        this.A05 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0114, code lost:
        if (r1 != (r9.A00 - 1)) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r9 = this;
            android.view.ViewGroup r0 = r9.A01
            if (r0 != 0) goto L_0x0015
            android.view.ViewStub r0 = r9.A09
            if (r0 == 0) goto L_0x0150
            android.view.View r1 = r0.inflate()
        L_0x000c:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r9.A01 = r1
        L_0x0015:
            android.widget.TextView r4 = r9.A02
            if (r4 == 0) goto L_0x0076
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            if (r3 == 0) goto L_0x0076
            android.content.Context r8 = r4.getContext()
            X.0qQ.A07(r8)
            X.3W1 r0 = r9.A04
            if (r0 == 0) goto L_0x0163
            int r2 = r0.A02
            int r1 = r9.A00
            r0 = 1
            int r1 = r1 - r0
            r7 = 0
            if (r2 != r1) goto L_0x0142
            com.instagram.common.session.UserSession r5 = r9.A0A
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330784759628559(0x8112a80002430f, double:3.039072802092533E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0142
            r0 = 36612259736852796(0x8212a8000a193c, double:3.2170787110979E-306)
            long r5 = X.182.A01(r2, r5, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1 = 2
            if (r0 == 0) goto L_0x0063
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            float r0 = r1.getDimension(r0)
            int r7 = (int) r0
        L_0x0063:
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0076
            r1 = r3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginEnd()
            if (r0 == r7) goto L_0x0076
            r1.setMarginEnd(r7)
            r4.setLayoutParams(r3)
        L_0x0076:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            X.4Fs r0 = r9.A03
            if (r0 == 0) goto L_0x013f
            int r2 = r0.A02
        L_0x0081:
            X.3W1 r0 = r9.A04
            if (r0 == 0) goto L_0x015b
            int r1 = r0.A02
            int r3 = r9.A00
            if (r2 <= 0) goto L_0x0094
            int r0 = r3 + -1
            if (r2 == r0) goto L_0x0094
            r3 = r0
            if (r1 <= r2) goto L_0x0094
            int r1 = r1 + -1
        L_0x0094:
            int r2 = r1 + 1
            com.instagram.common.session.UserSession r5 = r9.A0A
            X.0Tu r4 = X.0Tu.A05
            r0 = 36316650022507053(0x8105cd0006122d, double:3.0301339374208746E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0134
            r0 = 150(0x96, float:2.1E-43)
            if (r3 < r0) goto L_0x0134
            r1 = r2
            int r0 = r2 % 10
            if (r0 == 0) goto L_0x00b4
            int r0 = r2 + 9
            int r0 = r0 / 10
            int r1 = r0 * 10
        L_0x00b4:
            r0 = 20
            if (r1 >= r0) goto L_0x00ba
            r1 = 20
        L_0x00ba:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "%d/%d+"
        L_0x00c4:
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2, r1)
            r6.append(r0)
            X.3a9 r2 = new X.3a9
            r2.<init>()
            r3 = 0
            int r1 = r6.length()
            r0 = 33
            r6.setSpan(r2, r3, r1, r0)
            android.widget.TextView r0 = r9.A02
            if (r0 == 0) goto L_0x00e1
            r0.setText(r6)
        L_0x00e1:
            X.3W1 r0 = r9.A04
            if (r0 == 0) goto L_0x0102
            java.lang.Integer r0 = r0.A15
            int r0 = r0.intValue()
            r2 = 1
            if (r0 == r2) goto L_0x0124
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x0103
            r0 = 36330784759628559(0x8112a80002430f, double:3.039072802092533E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0103
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            A02(r9, r0)
        L_0x0102:
            return
        L_0x0103:
            X.4Fs r1 = r9.A03
            if (r1 == 0) goto L_0x0116
            X.3W1 r0 = r9.A04
            if (r0 == 0) goto L_0x0153
            int r0 = r0.A02
            int r1 = r1.A02
            if (r0 != r1) goto L_0x0116
            int r0 = r9.A00
            int r0 = r0 - r2
            if (r1 != r0) goto L_0x0124
        L_0x0116:
            android.view.ViewGroup r0 = r9.A01
            if (r0 == 0) goto L_0x011d
            r0.setVisibility(r3)
        L_0x011d:
            X.3W1 r0 = r9.A04
            if (r0 == 0) goto L_0x0102
            r0.A36 = r2
            return
        L_0x0124:
            android.view.ViewGroup r1 = r9.A01
            if (r1 == 0) goto L_0x012d
            r0 = 8
            r1.setVisibility(r0)
        L_0x012d:
            X.3W1 r0 = r9.A04
            if (r0 == 0) goto L_0x0102
            r0.A36 = r3
            return
        L_0x0134:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "%d/%d"
            goto L_0x00c4
        L_0x013f:
            r2 = -1
            goto L_0x0081
        L_0x0142:
            X.4Fs r0 = r9.A03
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = r0.A04
            if (r0 == 0) goto L_0x0063
            int r7 = r0.intValue()
            goto L_0x0063
        L_0x0150:
            r1 = 0
            goto L_0x000c
        L_0x0153:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x015b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0163:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TT.A06():void");
    }

    public static final void A00(ViewGroup viewGroup, AnonymousClass3TT r6) {
        Context context = viewGroup.getContext();
        TextView textView = (TextView) viewGroup.requireViewById(R.id.carousel_index_indicator_text_view);
        r6.A02 = textView;
        if (textView != null) {
            int paddingLeft = textView.getPaddingLeft() + context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            textView.setPadding(paddingLeft, textView.getPaddingTop(), paddingLeft, textView.getPaddingBottom());
            textView.setBackground(C247763gs.A00(context, textView.getLineHeight()));
            viewGroup.setImportantForAccessibility(4);
            C244083ac.A05(textView, C244063aa.CAROUSEL_INDEX_INDICATOR);
        }
    }
}
