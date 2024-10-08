package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.2uh  reason: invalid class name and case insensitive filesystem */
public abstract class C232942uh {
    public void A00(MotionEvent motionEvent) {
        AnonymousClass2uE r1 = ((C232932ug) this).A00;
        r1.A03 = null;
        r1.A02 = null;
        r1.A05 = null;
        r1.A0C = AnonymousClass05K.A00;
    }

    public void A01(MotionEvent motionEvent) {
        AnonymousClass3W1 BQr;
        int i;
        boolean z;
        AnonymousClass2uE r6 = ((C232932ug) this).A00;
        if (r6.A0C == AnonymousClass05K.A0C) {
            r6.A0C = AnonymousClass05K.A0N;
            C289875eN r0 = r6.A0B;
            if (r0 != null) {
                r0.DWX();
            }
            AnonymousClass1Po.A00.A00();
            C3254872q r02 = r6.A09;
            if (r02 != null) {
                View view = r02.A02;
                1Xj A07 = r6.A07();
                1Xj A1c = A07.A1c(r6.A00);
                if (A1c == null) {
                    A1c = A07;
                }
                if (A1c.CeS()) {
                    C231292rN r2 = r6.A0Y;
                    1Xj A072 = r6.A07();
                    if (r2 == null) {
                        BQr = r6.BQr(A072);
                    } else {
                        BQr = r2.BQr(A072);
                    }
                    C232722uK r4 = r6.A0Z;
                    1Xj A073 = r6.A07();
                    C3254872q r03 = r6.A09;
                    if (r03 != null) {
                        AnonymousClass4EA r7 = r03.A0G;
                        0qQ.A06(r7);
                        int i2 = r6.A01;
                        int i3 = r6.A00;
                        if (BQr != null) {
                            i = BQr.A01();
                            z = BQr.A2H;
                        } else {
                            i = 0;
                            z = false;
                        }
                        r4.A0R(A073, r6, r7, new C263414Lx(false, false, false, false), i2, i3, i, true, z);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public void A02(MotionEvent motionEvent) {
        AnonymousClass2uE.A00(((C232932ug) this).A00);
    }

    public void A03(MotionEvent motionEvent, 2cs r8) {
        AnonymousClass2uE r3 = ((C232932ug) this).A00;
        if (r3.A0C != AnonymousClass05K.A00 && r8.A09.A00 != 1.0d) {
            C3254872q r0 = r3.A09;
            if (r0 != null) {
                r0.A01.setVisibility(8);
                C3254872q r02 = r3.A09;
                if (r02 != null) {
                    r02.A01.setAlpha(0.0f);
                    r3.A02 = null;
                    r3.A0E = false;
                    if (r3.A0C == AnonymousClass05K.A0j) {
                        r3.A0C = AnonymousClass05K.A0N;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public void A04(MotionEvent motionEvent, 2cs r13) {
        0qQ.A0B(r13, 1);
        AnonymousClass2uE r5 = ((C232932ug) this).A00;
        C71412ct r6 = r13.A09;
        double d = r6.A00;
        if (r5.A0C == AnonymousClass05K.A0j) {
            C3254872q r7 = r5.A09;
            if (r7 != null) {
                if (!r5.A0E) {
                    r7.A01.setAlpha((float) d);
                }
                if (d >= 1.0d) {
                    r5.A0E = true;
                }
                View view = r7.A01;
                view.setVisibility(0);
                int[] iArr = r5.A0e;
                int i = iArr[0];
                View view2 = r5.A02;
                if (view2 != null) {
                    view.setTranslationX((float) ((i + (view2.getWidth() / 2)) - (view.getWidth() / 2)));
                    int i2 = iArr[1];
                    View view3 = r5.A02;
                    if (view3 != null) {
                        view.setTranslationY(((float) (((i2 + (view3.getHeight() / 2)) - (view.getHeight() / 2)) - r5.A0L)) - (((float) d) * ((float) r5.A0K)));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (r13.A01 != 1.0d) {
            r5.A03 = null;
        } else if (r5.A03 == null && r6.A00 > 0.800000011920929d) {
            r5.A03 = r5.A02;
            AnonymousClass2S0.A01.A03();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r3 = r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.view.MotionEvent r7, X.2cs r8) {
        /*
            r6 = this;
            r5 = r6
            X.2ug r5 = (X.C232932ug) r5
            X.2ct r0 = r8.A09
            double r3 = r0.A00
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
            X.2uE r3 = r5.A00
            java.lang.Integer r0 = r3.A0C
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r0 == r2) goto L_0x0035
            android.view.View r1 = r3.A04
            if (r1 == 0) goto L_0x001d
            r0 = 4
            r1.setVisibility(r0)
        L_0x001d:
            java.lang.Runnable r0 = r3.A0D
            if (r0 == 0) goto L_0x0024
            r0.run()
        L_0x0024:
            r0 = 0
            r3.A0D = r0
            r3.A0C = r2
            X.5eN r0 = r3.A0B
            if (r0 == 0) goto L_0x0030
            r0.DWZ()
        L_0x0030:
            X.1Pp r0 = X.AnonymousClass1Po.A00
            r0.A00()
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232942uh.A05(android.view.MotionEvent, X.2cs):void");
    }

    public void A06(MotionEvent motionEvent, 2cs r9) {
        0qQ.A0B(r9, 1);
        AnonymousClass2uE r6 = ((C232932ug) this).A00;
        double d = r9.A09.A00;
        C3254872q r2 = r6.A09;
        if (r2 != null) {
            Integer num = r6.A0C;
            if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0C) {
                View view = r2.A02;
                View view2 = r6.A04;
                if (view2 != null) {
                    float f = (float) d;
                    view2.setAlpha(f);
                    float f2 = (f * 0.19999999f) + 0.8f;
                    view.setScaleX(f2);
                    view.setScaleY(f2);
                    View view3 = r6.A04;
                    if (view3 != null) {
                        view3.setVisibility(0);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public boolean A07(MotionEvent motionEvent) {
        ImageView imageView;
        int i;
        0qQ.A0B(motionEvent, 0);
        AnonymousClass2uE r5 = ((C232932ug) this).A00;
        Integer num = r5.A0C;
        Integer num2 = AnonymousClass05K.A0N;
        if (num == num2 || num == AnonymousClass05K.A0j) {
            UserSession userSession = r5.A0T;
            AnonymousClass1Nd.A00(userSession).A05(new C52451GTd(true));
            r5.A0E = false;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            C3254872q r0 = r5.A09;
            if (r0 != null) {
                ImageView imageView2 = r0.A06;
                0qQ.A06(imageView2);
                Context context = r5.A0P;
                int i2 = 2131964931;
                if (0q2.A00(userSession).A0N(r5.A07())) {
                    i2 = 2131975945;
                }
                String string = context.getString(i2);
                0qQ.A07(string);
                if (!AnonymousClass2uE.A04(imageView2, r5, string, rawX, rawY)) {
                    boolean z = r5.A0d;
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    C3254872q r02 = r5.A09;
                    if (z) {
                        if (r02 != null) {
                            imageView = r02.A05;
                            0qQ.A06(imageView);
                            i = 2131956343;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (r02 != null) {
                        imageView = r02.A08;
                        0qQ.A06(imageView);
                        i = 2131976660;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string2 = context.getString(i);
                    0qQ.A07(string2);
                    if (!AnonymousClass2uE.A04(imageView, r5, string2, rawX2, rawY2)) {
                        float rawX3 = motionEvent.getRawX();
                        float rawY3 = motionEvent.getRawY();
                        C3254872q r03 = r5.A09;
                        if (r03 != null) {
                            ImageView imageView3 = r03.A09;
                            0qQ.A06(imageView3);
                            String string3 = context.getString(2131973441);
                            0qQ.A07(string3);
                            if (!AnonymousClass2uE.A04(imageView3, r5, string3, rawX3, rawY3)) {
                                float rawX4 = motionEvent.getRawX();
                                float rawY4 = motionEvent.getRawY();
                                C3254872q r04 = r5.A09;
                                if (r04 != null) {
                                    ImageView imageView4 = r04.A07;
                                    0qQ.A06(imageView4);
                                    String string4 = context.getString(2131966173);
                                    0qQ.A07(string4);
                                    if (!AnonymousClass2uE.A04(imageView4, r5, string4, rawX4, rawY4)) {
                                        r5.A02 = null;
                                        r5.A0C = num2;
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                r5.A0C = AnonymousClass05K.A0j;
                return true;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return false;
    }

    public boolean A08(MotionEvent motionEvent) {
        AnonymousClass2uE r2 = ((C232932ug) this).A00;
        View view = r2.A04;
        if (view != null) {
            view.setVisibility(4);
        }
        r2.A0C = AnonymousClass05K.A01;
        return true;
    }

    public abstract boolean A0A(MotionEvent motionEvent);

    public boolean A0B(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass2uE r3 = ((C232932ug) this).A00;
        if (r3.A0C == AnonymousClass05K.A0j) {
            float rawX = motionEvent2.getRawX();
            float rawY = motionEvent2.getRawY();
            View view = r3.A02;
            if (view == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (!VC2.A00(view, rawX, rawY)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(android.view.MotionEvent r29) {
        /*
            r28 = this;
            r0 = r28
            X.2ug r0 = (X.C232932ug) r0
            X.2uE r1 = r0.A00
            X.72q r5 = r1.A09
            r0 = 0
            if (r5 == 0) goto L_0x004b
            android.view.View r3 = r1.A03
            android.widget.ImageView r2 = r5.A05
            if (r3 != r2) goto L_0x004c
            X.Ih9 r2 = new X.Ih9
            r2.<init>(r5, r1)
        L_0x0016:
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.A0D = r2
        L_0x001a:
            java.lang.Integer r3 = r1.A0C
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r3 == r2) goto L_0x0028
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r3 == r2) goto L_0x0028
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            if (r3 != r2) goto L_0x002b
        L_0x0028:
            X.AnonymousClass2uE.A00(r1)
        L_0x002b:
            X.1Xj r3 = r1.A07()
            int r2 = r1.A00
            X.1Xj r2 = r3.A1c(r2)
            if (r2 != 0) goto L_0x0038
            r2 = r3
        L_0x0038:
            r3 = 1
            boolean r2 = r2.CeS()
            if (r2 != r3) goto L_0x004a
            X.2uK r2 = r1.A0Z
            r1 = 3059(0xbf3, float:4.287E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A0U(r1, r3, r0)
        L_0x004a:
            r0 = 1
        L_0x004b:
            return r0
        L_0x004c:
            android.widget.ImageView r2 = r5.A09
            if (r3 != r2) goto L_0x0074
            android.content.Context r6 = r1.A0P
            com.instagram.common.session.UserSession r7 = r1.A0T
            X.1Xj r8 = r1.A07()
            int r4 = r1.A00
            int r3 = r1.A01
            X.4EA r2 = r5.A0G
            com.instagram.feed.widget.IgProgressImageView r2 = r2.A0N
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r2.getIgImageView()
            java.util.concurrent.atomic.AtomicInteger r2 = r2.A0a
            int r13 = r2.get()
            X.3kK r2 = r1.A0a
            r11 = r4
            r12 = r3
            r9 = r1
            r10 = r2
            X.C56307HwK.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x001a
        L_0x0074:
            android.widget.ImageView r2 = r5.A06
            if (r3 != r2) goto L_0x011b
            com.instagram.common.session.UserSession r12 = r1.A0T
            X.0q2 r3 = X.0q2.A00(r12)
            X.1Xj r2 = r1.A07()
            boolean r2 = r3.A0N(r2)
            if (r2 == 0) goto L_0x0117
            X.3Yl r14 = X.C243363Yl.NOT_LIKED
        L_0x008a:
            X.7kd r3 = X.C340057kd.A00(r12)
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            X.1Xj r2 = r1.A07()
            r3.A04(r2, r6)
            android.content.Context r10 = r1.A0P
            X.1Xj r15 = r1.A07()
            int r8 = r1.A01
            int r7 = r1.A00
            X.72q r2 = r1.A09
            java.lang.String r4 = "Required value was null."
            if (r2 == 0) goto L_0x02d4
            X.4EA r2 = r2.A0G
            com.instagram.feed.widget.IgProgressImageView r2 = r2.A0N
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r2.getIgImageView()
            java.util.concurrent.atomic.AtomicInteger r2 = r2.A0a
            int r26 = r2.get()
            androidx.fragment.app.Fragment r2 = r1.A0R
            androidx.fragment.app.FragmentActivity r9 = r2.getActivity()
            X.3kK r5 = r1.A0a
            X.1Xj r2 = r1.A07()
            X.3W1 r2 = r1.BQr(r2)
            boolean r3 = r2.A2V
            r11 = 0
            r24 = -1
            X.6zg r2 = X.C324636ze.A00(r12)
            com.instagram.search.common.analytics.SearchContext r2 = r2.A00
            r13 = r11
            r16 = r11
            r21 = r11
            r22 = r11
            r23 = r8
            r25 = r7
            r27 = r3
            r19 = r5
            r20 = r6
            r17 = r1
            r18 = r2
            X.C56622I4z.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.3Yl r8 = X.C243363Yl.LIKED
            r7 = 0
            if (r14 != r8) goto L_0x0109
            boolean r2 = r1.A0b
            if (r2 != 0) goto L_0x0109
            X.2cs r6 = r1.A0S
            r2 = 0
            r5 = 1
            r6.A08(r2, r5)
            r6.A03()
            X.72q r2 = r1.A09
            if (r2 == 0) goto L_0x02ce
            android.view.View r2 = r2.A00
            r2.setVisibility(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            r1.A0C = r2
        L_0x0109:
            X.72q r2 = r1.A09
            if (r2 == 0) goto L_0x02c8
            android.widget.ImageView r2 = r2.A06
            if (r14 != r8) goto L_0x0112
            r7 = 1
        L_0x0112:
            r2.setSelected(r7)
            goto L_0x001a
        L_0x0117:
            X.3Yl r14 = X.C243363Yl.LIKED
            goto L_0x008a
        L_0x011b:
            android.widget.ImageView r2 = r5.A08
            if (r3 != r2) goto L_0x0126
            X.IhA r2 = new X.IhA
            r2.<init>(r5, r1)
            goto L_0x0016
        L_0x0126:
            android.widget.ImageView r2 = r5.A07
            if (r3 != r2) goto L_0x001a
            X.1Xj r2 = r1.A07()
            boolean r2 = r2.CcK()
            if (r2 == 0) goto L_0x0160
            X.4DU r5 = r1.A0X
            java.lang.String r3 = r5.getModuleName()
            java.lang.String r2 = "explore_popular"
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 != 0) goto L_0x014e
            java.lang.String r3 = r5.getModuleName()
            java.lang.String r2 = "serp_top"
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0160
        L_0x014e:
            com.instagram.common.session.UserSession r2 = r1.A0T
            X.GWo r4 = new X.GWo
            r4.<init>(r2)
            X.1Xj r3 = r1.A07()
            android.content.Context r2 = r1.A0P
            r4.A00(r2, r3, r5)
            goto L_0x001a
        L_0x0160:
            android.app.Activity r2 = r1.A0O
            com.instagram.common.session.UserSession r6 = r1.A0T
            X.Dg1 r5 = new X.Dg1
            r5.<init>(r2, r6)
            X.1Xj r2 = r1.A07()
            boolean r2 = X.2R8.A02(r6, r2)
            r4 = 1
            if (r2 != 0) goto L_0x0226
            r3 = 2131972204(0x7f13506c, float:1.9581409E38)
            X.IA7 r2 = new X.IA7
            r2.<init>(r1)
            r5.A02(r2, r3)
        L_0x017f:
            X.6x4 r2 = r1.A0A
            if (r2 == 0) goto L_0x0217
            boolean r2 = r2.CZI()
            if (r2 != r4) goto L_0x0217
            X.GIr r3 = X.C52200GIr.A00
            X.1Xj r2 = r1.A07()
            boolean r2 = r3.A02(r6, r2)
            if (r2 == 0) goto L_0x0217
            X.1Xj r2 = r1.A07()
            com.instagram.reels.prompt.model.PromptStickerModel r2 = X.C52200GIr.A00(r2)
            if (r2 == 0) goto L_0x020e
            boolean r2 = r2.A0K()
            if (r2 != r4) goto L_0x020e
            r3 = 2131965926(0x7f1337e6, float:1.9568676E38)
            X.IAE r2 = new X.IAE
            r2.<init>(r1)
        L_0x01ad:
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r5.A04(r2, r3)
        L_0x01b2:
            java.util.List r3 = X.C55336Hg4.A00
            X.4DU r2 = r1.A0X
            java.lang.String r2 = r2.getModuleName()
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x01e6
            X.1Xj r2 = r1.A07()
            X.1Xy r2 = r2.A0C
            X.1eD r2 = r2.B2u()
            if (r2 == 0) goto L_0x01d2
            java.lang.String r3 = r2.getTitle()
            if (r3 != 0) goto L_0x01de
        L_0x01d2:
            android.content.Context r3 = r1.A0P
            r2 = 2131968504(0x7f1341f8, float:1.9573904E38)
            java.lang.String r3 = r3.getString(r2)
            X.0qQ.A07(r3)
        L_0x01de:
            X.IA5 r2 = new X.IA5
            r2.<init>(r1)
            r5.A0C(r3, r2)
        L_0x01e6:
            androidx.fragment.app.Fragment r3 = r1.A0R
            X.0qQ.A0B(r3, r0)
            boolean r2 = r3 instanceof X.C266514Zg
            if (r2 == 0) goto L_0x0202
            X.4Zg r3 = (X.C266514Zg) r3
            com.instagram.model.hashtag.Hashtag r2 = r3.BCW()
            if (r2 == 0) goto L_0x0202
            r3 = 2131960997(0x7f1324a5, float:1.9558678E38)
            X.IA6 r2 = new X.IA6
            r2.<init>(r1)
            r5.A04(r2, r3)
        L_0x0202:
            X.FFy r3 = new X.FFy
            r3.<init>(r5)
            android.content.Context r2 = r1.A0P
            r3.A05(r2)
            goto L_0x001a
        L_0x020e:
            r3 = 2131965925(0x7f1337e5, float:1.9568674E38)
            X.IAF r2 = new X.IAF
            r2.<init>(r1)
            goto L_0x01ad
        L_0x0217:
            boolean r2 = X.AnonymousClass2uE.A05(r1)
            if (r2 == 0) goto L_0x01b2
            r3 = 2131965926(0x7f1337e6, float:1.9568676E38)
            X.IA4 r2 = new X.IA4
            r2.<init>(r1)
            goto L_0x01ad
        L_0x0226:
            boolean r2 = X.AnonymousClass2uE.A06(r1)
            if (r2 == 0) goto L_0x0245
            X.1Xj r3 = r1.A07()
            java.lang.String r2 = r6.A06
            boolean r2 = r3.A6h(r2)
            if (r2 == 0) goto L_0x02a7
            r3 = 2131965932(0x7f1337ec, float:1.9568688E38)
            X.IA8 r2 = new X.IA8
            r2.<init>(r1)
        L_0x0240:
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r5.A04(r2, r3)
        L_0x0245:
            X.6x4 r2 = r1.A0A
            if (r2 == 0) goto L_0x0272
            boolean r2 = r2.CZH()
            if (r2 != r4) goto L_0x0272
            X.1Xj r2 = r1.A07()
            boolean r2 = X.GLX.A02(r6, r2)
            if (r2 == 0) goto L_0x0272
            X.1Xj r3 = r1.A07()
            java.lang.String r2 = r6.A06
            boolean r2 = r3.A6g(r2)
            if (r2 == 0) goto L_0x029e
            r3 = 2131965933(0x7f1337ed, float:1.956869E38)
            X.IAA r2 = new X.IAA
            r2.<init>(r1)
        L_0x026d:
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r5.A04(r2, r3)
        L_0x0272:
            X.1Xj r2 = r1.A07()
            boolean r2 = X.C321566uO.A00(r6, r2)
            if (r2 == 0) goto L_0x017f
            X.57N r2 = r1.A0U
            if (r2 == 0) goto L_0x017f
            X.1Xj r2 = r1.A07()
            X.3X1 r2 = r2.A1w()
            if (r2 == 0) goto L_0x02e0
            int r3 = r2.ordinal()
            if (r3 == r4) goto L_0x02b9
            r2 = 2
            if (r3 == r2) goto L_0x02b0
            if (r3 != r0) goto L_0x02da
            java.lang.String r3 = "PeekMediaController_displayOptionsActionSheet"
            java.lang.String r2 = "SubscriptionMediaVisibilityType.DEFAULT"
            X.0wb.A03(r3, r2)
            goto L_0x017f
        L_0x029e:
            r3 = 2131965931(0x7f1337eb, float:1.9568686E38)
            X.IAB r2 = new X.IAB
            r2.<init>(r1)
            goto L_0x026d
        L_0x02a7:
            r3 = 2131965930(0x7f1337ea, float:1.9568684E38)
            X.IA9 r2 = new X.IA9
            r2.<init>(r1)
            goto L_0x0240
        L_0x02b0:
            r3 = 2131961983(0x7f13287f, float:1.9560678E38)
            X.IAD r2 = new X.IAD
            r2.<init>(r1)
            goto L_0x02c1
        L_0x02b9:
            r3 = 2131961984(0x7f132880, float:1.956068E38)
            X.IAC r2 = new X.IAC
            r2.<init>(r1)
        L_0x02c1:
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r5.A04(r2, r3)
            goto L_0x017f
        L_0x02c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x02ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x02d4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x02da:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x02e0:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232942uh.A09(android.view.MotionEvent):boolean");
    }
}
