package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.igds.components.snackbar.IgdsDualButtonSnackBar;
import com.instagram.igds.components.snackbar.IgdsSnackBar;
import com.instagram.igds.components.snackbar.IgdsUploadSnackBar;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3M8  reason: invalid class name */
public final class AnonymousClass3M8 implements C252203oj, C252213ok {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public C55866Hon A05;
    public LQT A06;
    public IgdsDualButtonSnackBar A07;
    public IgdsSnackBar A08;
    public Dc2 A09;
    public IgdsUploadSnackBar A0A;
    public Integer A0B;
    public boolean A0C;
    public boolean A0D;
    public Integer A0E;
    public Integer A0F;
    public final View A0G;
    public final Runnable A0H = new AnonymousClass3MA(this);
    public final WeakReference A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N;
    public final 0lT A0O;
    public final C252063oV A0P;
    public final boolean A0Q;

    public AnonymousClass3M8(ViewStub viewStub, boolean z) {
        Activity activity;
        0qQ.A0B(viewStub, 1);
        this.A0Q = z;
        AnonymousClass3M9 r1 = new AnonymousClass3M9(this);
        this.A0O = r1;
        viewStub.setLayoutResource(R.layout.igds_snackbar_layout);
        View view = null;
        this.A0P = 2b1.A01(viewStub, false, false);
        0lU.A07(r1);
        Context context = viewStub.getContext();
        this.A0I = new WeakReference(context);
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            view = activity.findViewById(R.id.tab_bar);
        }
        this.A0G = view;
        this.A0B = AnonymousClass05K.A00;
        this.A0K = Collections.synchronizedList(new LinkedList());
        this.A0L = Collections.synchronizedList(new LinkedList());
        this.A0J = Collections.synchronizedList(new LinkedList());
        this.A0M = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9L3(this, 11));
        this.A0N = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 13));
    }

    public final void A07(C55866Hon hon) {
        0qQ.A0B(hon, 0);
        List list = this.A0J;
        0qQ.A06(list);
        list.add(0, hon);
        if (this.A0B == AnonymousClass05K.A00) {
            A01(this);
        }
    }

    public final void A08(LQT lqt) {
        List list = this.A0L;
        0qQ.A06(list);
        list.add(0, lqt);
        if (this.A0B == AnonymousClass05K.A00) {
            A01(this);
        }
    }

    public final void A0A(Dc2 dc2) {
        0qQ.A0B(dc2, 0);
        List list = this.A0K;
        0qQ.A06(list);
        list.add(0, dc2);
        int intValue = this.A0B.intValue();
        if (intValue == 0) {
            A01(this);
        } else if (intValue == 2 || intValue == 3) {
            A03(this, true);
        } else if (intValue != 1) {
            throw new RuntimeException();
        }
    }

    public final synchronized void A0B(C66536MVq mVq) {
        View view = this.A04;
        if (view != null) {
            view.post(new M7Z(this, mVq));
        }
    }

    public final void DmB(2cs r8) {
        0qQ.A0B(r8, 0);
        if (r8.A01 == 1.0d) {
            View view = this.A04;
            if (view != null) {
                view.setVisibility(4);
            }
            int intValue = this.A0B.intValue();
            if (intValue != 0) {
                if (intValue == 2) {
                    IgdsSnackBar igdsSnackBar = this.A08;
                    if (igdsSnackBar != null) {
                        igdsSnackBar.setVisibility(8);
                    }
                    IgdsUploadSnackBar igdsUploadSnackBar = this.A0A;
                    if (igdsUploadSnackBar != null) {
                        igdsUploadSnackBar.setVisibility(0);
                    }
                    IgdsUploadSnackBar igdsUploadSnackBar2 = this.A0A;
                    if (igdsUploadSnackBar2 != null) {
                        igdsUploadSnackBar2.setTranslationY((float) this.A03);
                    }
                } else if (intValue == 3) {
                    IgdsSnackBar igdsSnackBar2 = this.A08;
                    if (igdsSnackBar2 != null) {
                        igdsSnackBar2.setVisibility(8);
                    }
                    IgdsUploadSnackBar igdsUploadSnackBar3 = this.A0A;
                    if (igdsUploadSnackBar3 != null) {
                        igdsUploadSnackBar3.setVisibility(8);
                    }
                    IgdsDualButtonSnackBar igdsDualButtonSnackBar = this.A07;
                    if (igdsDualButtonSnackBar != null) {
                        igdsDualButtonSnackBar.setVisibility(0);
                    }
                    IgdsDualButtonSnackBar igdsDualButtonSnackBar2 = this.A07;
                    if (igdsDualButtonSnackBar2 != null) {
                        igdsDualButtonSnackBar2.setTranslationY((float) this.A01);
                    }
                } else if (intValue == 1) {
                    IgdsSnackBar igdsSnackBar3 = this.A08;
                    if (igdsSnackBar3 != null) {
                        igdsSnackBar3.setVisibility(0);
                    }
                    IgdsSnackBar igdsSnackBar4 = this.A08;
                    if (igdsSnackBar4 != null) {
                        igdsSnackBar4.setTranslationY((float) this.A02);
                    }
                    IgdsUploadSnackBar igdsUploadSnackBar4 = this.A0A;
                    if (igdsUploadSnackBar4 != null) {
                        igdsUploadSnackBar4.setVisibility(8);
                    }
                } else {
                    throw new RuntimeException();
                }
                IgdsDualButtonSnackBar igdsDualButtonSnackBar3 = this.A07;
                if (igdsDualButtonSnackBar3 != null) {
                    igdsDualButtonSnackBar3.setVisibility(8);
                }
            }
            View view2 = this.A04;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.A04;
            if (view3 != null) {
                view3.bringToFront();
            }
        }
    }

    public final void DmC(2cs r16) {
        View view;
        Runnable runnable;
        int A012;
        2cs r0 = r16;
        0qQ.A0B(r0, 0);
        View view2 = this.A04;
        if (view2 != null) {
            double d = r0.A09.A00;
            boolean z = false;
            if (d == 1.0d) {
                z = true;
            }
            if (z && this.A0B == AnonymousClass05K.A01) {
                Dc2 dc2 = this.A09;
                if (dc2 != null) {
                    if (dc2.A0O) {
                        if (dc2.A06 != null) {
                            2eQ.A06(this.A08, 500);
                        } else {
                            view2.requestFocus();
                            View view3 = this.A04;
                            if (view3 != null) {
                                view3.sendAccessibilityEvent(8);
                            }
                        }
                    }
                    Dc2 dc22 = this.A09;
                    if (dc22 != null) {
                        int i = dc22.A00;
                        if (i == 0) {
                            i = Dc5.A01();
                        }
                        if (i == -1) {
                            return;
                        }
                    }
                    if (!this.A0K.isEmpty() || !this.A0L.isEmpty() || !this.A0J.isEmpty()) {
                        view = this.A04;
                        if (view == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        runnable = this.A0H;
                        A012 = Dc5.A01();
                        view.postDelayed(runnable, (long) A012);
                    }
                    Dc2 dc23 = this.A09;
                    if (dc23 != null) {
                        A012 = dc23.A00;
                        if (A012 == 0) {
                            A012 = Dc5.A01();
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (d == 1.0d && this.A0B == AnonymousClass05K.A0N) {
                C55866Hon hon = this.A05;
                if (hon == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (hon.A00 == -1) {
                    return;
                } else {
                    if (!this.A0K.isEmpty() || !this.A0L.isEmpty() || !this.A0J.isEmpty()) {
                        view = this.A04;
                        if (view == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        runnable = this.A0H;
                        A012 = Dc5.A01();
                        view.postDelayed(runnable, (long) A012);
                    }
                    C55866Hon hon2 = this.A05;
                    if (hon2 != null) {
                        A012 = hon2.A00;
                    } else {
                        return;
                    }
                }
            } else if (d == -1.0d) {
                view2.setVisibility(8);
                int intValue = this.A0B.intValue();
                if (intValue != 0) {
                    if (intValue == 2) {
                        LQT lqt = this.A06;
                        if (lqt != null) {
                            C66536MVq mVq = lqt.A02;
                            boolean z2 = this.A0D;
                            if (mVq.BzN() == AnonymousClass05K.A0N && !z2) {
                                List list = this.A0L;
                                0qQ.A06(list);
                                list.add(0, lqt);
                            }
                            LQT lqt2 = this.A06;
                            if (lqt2 != null) {
                                lqt2.A02.FJ6(this);
                            }
                            this.A06 = null;
                            this.A0D = false;
                        }
                    } else if (intValue == 3) {
                        C55866Hon hon3 = this.A05;
                        if (hon3 != null) {
                            C74474PvU pvU = hon3.A03;
                            if (pvU != null) {
                                pvU.onDismiss();
                            }
                            this.A05 = null;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (intValue == 1) {
                        Dc2 dc24 = this.A09;
                        if (dc24 != null) {
                            MVB mvb = dc24.A0A;
                            if (mvb != null) {
                                mvb.onDismiss();
                            }
                            this.A09 = null;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
                this.A0B = AnonymousClass05K.A00;
                A01(this);
                return;
            } else {
                return;
            }
            view = this.A04;
            if (view != null) {
                runnable = this.A0H;
                view.postDelayed(runnable, (long) A012);
            }
        }
    }

    public final void DmD(2cs r1) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmE(X.2cs r5) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.2ct r0 = r5.A09
            double r0 = r0.A00
            float r2 = (float) r0
            java.lang.Integer r0 = r4.A0B
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x003c
            r0 = 2
            if (r1 == r0) goto L_0x003d
            r0 = 3
            if (r1 == r0) goto L_0x0047
            r0 = 1
            if (r1 != r0) goto L_0x0053
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            int r0 = r4.A02
            float r0 = (float) r0
            float r1 = r1 * r0
            com.instagram.igds.components.snackbar.IgdsSnackBar r3 = r4.A08
            if (r3 == 0) goto L_0x003c
            X.Dc2 r0 = r4.A09
            if (r0 == 0) goto L_0x0039
            java.lang.Integer r0 = r0.A0F
            int r2 = r0.intValue()
            r0 = 0
            if (r2 != r0) goto L_0x0039
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x0039
            float r1 = -r1
        L_0x0039:
            r3.setTranslationY(r1)
        L_0x003c:
            return
        L_0x003d:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            int r0 = r4.A03
            float r0 = (float) r0
            float r1 = r1 * r0
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r3 = r4.A0A
            goto L_0x0050
        L_0x0047:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            int r0 = r4.A01
            float r0 = (float) r0
            float r1 = r1 * r0
            com.instagram.igds.components.snackbar.IgdsDualButtonSnackBar r3 = r4.A07
        L_0x0050:
            if (r3 == 0) goto L_0x003c
            goto L_0x0039
        L_0x0053:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3M8.DmE(X.2cs):void");
    }

    private final void A00() {
        C252063oV r1 = this.A0P;
        if (!r1.CVM()) {
            View view = r1.getView();
            this.A04 = view;
            view.setLayoutDirection(0mk.A02(view.getContext()) ? 1 : 0);
            this.A08 = (IgdsSnackBar) view.requireViewById(R.id.igds_snackbar);
            this.A0A = (IgdsUploadSnackBar) view.findViewById(R.id.igds_upload_snackbar);
            this.A07 = (IgdsDualButtonSnackBar) view.findViewById(R.id.igds_dual_button_snackbar);
            AnonymousClass3MM r12 = AnonymousClass3MM.A00;
            AnonymousClass9L3 r6 = new AnonymousClass9L3(this, 12);
            WeakReference weakReference = new WeakReference(view);
            2el A012 = AnonymousClass2hM.A01(C226592hN.A00(view));
            if (A012 != null) {
                String valueOf = String.valueOf(r12.hashCode());
                AnonymousClass30Y r0 = AnonymousClass30Y.A07;
                C2354830a r13 = new C2354830a((Object) null, (Object) null, valueOf);
                r13.A00(new AnonymousClass3MN(weakReference, r6));
                A012.A05(view, r13.A01());
            }
            Integer num = this.A0F;
            if (num != null) {
                A05(num.intValue());
            }
            Integer num2 = this.A0E;
            if (num2 != null) {
                A06(num2.intValue());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.1xE, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass3M8 r22) {
        /*
            r11 = r22
            boolean r0 = r11.A0C
            if (r0 != 0) goto L_0x0529
            java.lang.Integer r1 = r11.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0529
            java.util.List r2 = r11.A0K
            X.0qQ.A06(r2)
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ad
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            r0 = r22
            r11.A0B = r0
            r10 = 0
            java.lang.Object r9 = r2.remove(r10)
            X.Dc2 r9 = (X.Dc2) r9
            if (r9 == 0) goto L_0x01a5
            int r0 = r9.A00
            if (r0 != 0) goto L_0x0030
            int r0 = X.Dc5.A01()
        L_0x0030:
            r1 = -1
            if (r0 != r1) goto L_0x0036
            r2.add(r10, r9)
        L_0x0036:
            r11.A09 = r9
            X.MVB r8 = r9.A0A
            r11.A00()
            com.instagram.igds.components.snackbar.IgdsSnackBar r7 = r11.A08
            java.lang.String r21 = "Required value was null."
            if (r7 == 0) goto L_0x019d
            android.widget.FrameLayout r0 = r7.A01
            r2 = 8
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.A05
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.A04
            r0.setVisibility(r2)
            X.2eb r0 = r7.A07
            r0.A03(r2)
            X.2eb r0 = r7.A08
            r0.A03(r2)
            X.2eb r0 = r7.A06
            r0.A03(r2)
            android.widget.ImageView r0 = r7.A03
            r0.setVisibility(r2)
            r7.setBackgroundResource(r10)
            java.lang.String r20 = ""
            r0 = r20
            r7.setMessageText(r0)
            r6 = 0
            r7.setMessageDescriptionText(r6)
            r7.setMessageMovementMethod(r6)
            r7.setButtonTextAndOnClickListener(r6, r6)
            android.widget.ImageView r5 = r7.A02
            r5.setVisibility(r2)
            r7.setButtonImageAndOnClickListener(r6, r6)
            r7.setSwipeListener(r6)
            X.0eM r0 = r11.A0M
            java.lang.Object r2 = r0.getValue()
            X.3E6 r2 = (X.AnonymousClass3E6) r2
            android.content.Context r4 = r7.getContext()
            X.0qQ.A07(r4)
            android.app.Activity r0 = X.C61270mF.A00(r4)
            r2.DmJ(r0)
            r2.A9Y(r11)
            boolean r0 = X.2eO.A00(r4)
            r3 = 1
            r19 = 3
            if (r0 == 0) goto L_0x0133
            android.view.View r0 = r9.A06
            if (r0 == 0) goto L_0x0133
            android.view.View r2 = r11.A04
            if (r2 == 0) goto L_0x0133
            r9.A00 = r1
            r0 = 1000(0x3e8, double:4.94E-321)
            X.2eQ.A06(r2, r0)
            r0 = 2131952950(0x7f130536, float:1.9542357E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.CharSequence r0 = r9.A0D
            X.2eQ.A09(r0, r1, r3)
            java.lang.String r0 = r9.A0I
            X.2eQ.A09(r0, r1, r3)
            android.view.View r0 = r11.A04
            if (r0 == 0) goto L_0x00d5
            r0.setContentDescription(r1)
        L_0x00d5:
            android.view.View r0 = r7.A00
            r0.setVisibility(r10)
            com.instagram.igds.components.snackbar.IgdsSnackBar r0 = r11.A08
            if (r0 == 0) goto L_0x00ea
            android.view.View r1 = r0.A00
            if (r1 == 0) goto L_0x00ea
            X.FN3 r0 = new X.FN3
            r0.<init>(r9, r11)
        L_0x00e7:
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00ea:
            r7.setFitsSystemWindows(r10)
            java.lang.CharSequence r1 = r9.A0D
            if (r1 == 0) goto L_0x00f9
            boolean r0 = r9.A0N
            r7.setTypeface(r0)
            r7.setMessageText(r1)
        L_0x00f9:
            boolean r0 = r9.A0M
            if (r0 == 0) goto L_0x012f
            if (r8 == 0) goto L_0x012f
            X.LXO r0 = new X.LXO
            r0.<init>(r8, r9, r11)
            r7.setMessageOnClick(r0)
        L_0x0107:
            android.text.method.MovementMethod r0 = r9.A05
            if (r0 == 0) goto L_0x010e
            r7.setMessageMovementMethod(r0)
        L_0x010e:
            java.lang.String r0 = r9.A0I
            if (r0 == 0) goto L_0x0115
            r7.setMessageDescriptionText(r0)
        L_0x0115:
            X.6aq r14 = r9.A0C
            int r1 = r14.ordinal()
            r13 = 4
            r12 = 2
            r0 = r19
            if (r1 == r0) goto L_0x0313
            if (r1 == r10) goto L_0x014a
            if (r1 == r12) goto L_0x014a
            if (r1 == r3) goto L_0x014a
            if (r1 == r13) goto L_0x014a
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x012f:
            r7.setMessageOnClick(r6)
            goto L_0x0107
        L_0x0133:
            boolean r0 = r9.A0P
            if (r0 == 0) goto L_0x00ea
            android.view.View r0 = r7.A00
            r0.setVisibility(r10)
            com.instagram.igds.components.snackbar.IgdsSnackBar r0 = r11.A08
            if (r0 == 0) goto L_0x00ea
            android.view.View r1 = r0.A00
            if (r1 == 0) goto L_0x00ea
            X.LX9 r0 = new X.LX9
            r0.<init>(r9, r11)
            goto L_0x00e7
        L_0x014a:
            X.2Yp r18 = X.C70922Yp.A01
            if (r18 == 0) goto L_0x018e
            X.0lg r17 = X.C70922Yp.A00(r18)
            X.0Tu r2 = X.0Tu.A05
            r15 = 36320330809680182(0x81092600092136, double:3.032461682050502E-306)
            r0 = r15
            r15 = r17
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 == 0) goto L_0x018e
            X.0lg r17 = X.C70922Yp.A00(r18)
            r15 = 36328405347614030(0x81107e00003d4e, double:3.037568052353422E-306)
            r0 = r15
            r15 = r17
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 == 0) goto L_0x018e
            r0 = 2131100409(0x7f0602f9, float:1.7813199E38)
            int r0 = r4.getColor(r0)
            r7.setSnackBarBackgroundColor(r0)
        L_0x017e:
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r7.setTextColor(r0)
            goto L_0x033e
        L_0x018e:
            r0 = 2130970332(0x7f0406dc, float:1.7549371E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r7.setSnackBarBackgroundColor(r0)
            goto L_0x017e
        L_0x019d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r21
            r1.<init>(r0)
            throw r1
        L_0x01a5:
            java.lang.String r1 = "IgdsSnackBar config is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01ad:
            java.util.List r1 = r11.A0L
            X.0qQ.A06(r1)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x024f
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r11.A0B = r0
            r0 = 0
            java.lang.Object r0 = r1.remove(r0)
            X.LQT r0 = (X.LQT) r0
            r11.A06 = r0
            r11.A00()
            X.LQT r4 = r11.A06
            java.lang.String r1 = "Required value was null."
            if (r4 == 0) goto L_0x0249
            android.view.View r6 = r11.A04
            if (r6 == 0) goto L_0x0243
            X.IVl r0 = r4.A01
            if (r0 == 0) goto L_0x01db
            r0.onShow()
        L_0x01db:
            int r0 = r4.A00
            if (r0 != 0) goto L_0x01e7
            android.view.View r0 = r11.A0G
            if (r0 == 0) goto L_0x01ea
            int r0 = r0.getHeight()
        L_0x01e7:
            X.0nA.A0X(r6, r0)
        L_0x01ea:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r5 = r11.A0A
            if (r5 == 0) goto L_0x023d
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.MVq r3 = r4.A02
            java.lang.String r0 = r3.C6v()
            android.graphics.Bitmap r0 = X.1MF.A0E(r0, r1, r1)
            if (r0 == 0) goto L_0x020c
            r5.setMediaThumbnailBitmap(r0)
        L_0x020c:
            android.graphics.drawable.Drawable r0 = r3.C6t()
            if (r0 == 0) goto L_0x021c
            android.graphics.drawable.Drawable r0 = r3.C6t()
            X.0qQ.A0A(r0)
            r5.setMediaThumbnailDrawable(r0)
        L_0x021c:
            X.1iA r2 = r3.BR7()
            X.1iA r1 = X.1iA.A0a
            r0 = 8
            if (r2 != r1) goto L_0x0227
            r0 = 0
        L_0x0227:
            r5.setOverlayVisibility(r0)
            A02(r11)
            r3.ECA(r11)
            int r0 = X.C14013ToF.A00(r5)
            r11.A03 = r0
            X.M7b r0 = new X.M7b
            r0.<init>(r4, r11)
            goto L_0x03bd
        L_0x023d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0243:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0249:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x024f:
            java.util.List r1 = r11.A0J
            X.0qQ.A06(r1)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x051f
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r11.A0B = r0
            r5 = 0
            java.lang.Object r4 = r1.remove(r5)
            X.Hon r4 = (X.C55866Hon) r4
            if (r4 == 0) goto L_0x0517
            r11.A05 = r4
            X.PvU r3 = r4.A03
            r11.A00()
            com.instagram.igds.components.snackbar.IgdsDualButtonSnackBar r7 = r11.A07
            java.lang.String r2 = "Required value was null."
            if (r7 == 0) goto L_0x0511
            android.widget.FrameLayout r0 = r7.A00
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r7.A02
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r7.A01
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A04
            r0.setVisibility(r1)
            r7.setBackgroundResource(r5)
            java.lang.String r6 = ""
            r7.setMessageText(r6)
            r7.setMessageDescriptionText(r6)
            r0 = 0
            r7.setPrimaryButtonTextAndOnClickListener(r6, r0)
            r7.setSecondaryButtonTextAndOnClickListener(r6, r0)
            android.content.Context r0 = r7.getContext()
            X.2eO.A00(r0)
            r1 = 0
            r7.setFitsSystemWindows(r5)
            java.lang.CharSequence r0 = r4.A04
            if (r0 == 0) goto L_0x02b0
            r7.setMessageText(r0)
        L_0x02b0:
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L_0x02b7
            r7.setMessageDescriptionText(r0)
        L_0x02b7:
            com.instagram.common.typedurl.ImageUrl r0 = r4.A02
            if (r0 == 0) goto L_0x030b
            r7.setCircularImageUri(r0)
        L_0x02be:
            if (r3 == 0) goto L_0x0307
            java.lang.String r1 = r4.A06
            if (r1 == 0) goto L_0x050b
            X.Oim r0 = new X.Oim
            r0.<init>(r3, r4, r11)
            r7.setPrimaryButtonTextAndOnClickListener(r1, r0)
            java.lang.String r6 = r4.A07
            if (r6 == 0) goto L_0x0505
            X.Oin r1 = new X.Oin
            r1.<init>(r3, r4, r11)
        L_0x02d5:
            r7.setSecondaryButtonTextAndOnClickListener(r6, r1)
            com.instagram.igds.components.snackbar.IgdsDualButtonSnackBar r0 = r11.A07
            if (r0 == 0) goto L_0x04ff
            int r0 = X.C14013ToF.A00(r0)
            r11.A01 = r0
            r2 = 0
            android.view.View r1 = r11.A0G
            if (r1 == 0) goto L_0x02f1
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x02f1
            int r2 = r1.getHeight()
        L_0x02f1:
            android.view.View r6 = r11.A04
            if (r6 == 0) goto L_0x04f7
            X.0nA.A0X(r6, r2)
            X.0nA.A0T(r6, r5)
            if (r3 == 0) goto L_0x0300
            r3.onShow()
        L_0x0300:
            X.M7a r0 = new X.M7a
            r0.<init>(r4, r11)
            goto L_0x03bd
        L_0x0307:
            r7.setPrimaryButtonTextAndOnClickListener(r6, r1)
            goto L_0x02d5
        L_0x030b:
            android.graphics.drawable.Drawable r0 = r4.A01
            if (r0 == 0) goto L_0x02be
            r7.setCircularImageDrawable(r0)
            goto L_0x02be
        L_0x0313:
            r0 = 2130970147(0x7f040623, float:1.7548996E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r7.setSnackBarBackgroundColor(r0)
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r7.setTextColor(r0)
            java.lang.String r0 = r9.A0G
            if (r0 == 0) goto L_0x033e
            int r0 = X.2Yu.A0D(r4)
            int r0 = r4.getColor(r0)
            r7.setButtonTextColor(r0)
        L_0x033e:
            X.6aq r0 = X.C310346aq.ERROR
            if (r14 != r0) goto L_0x03f6
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            r7.setIconDrawable((int) r0)
        L_0x0348:
            boolean r0 = r9.A0L
            r2 = 0
            if (r0 == 0) goto L_0x03ef
            if (r8 == 0) goto L_0x03ef
            java.lang.String r1 = r9.A0G
            if (r1 == 0) goto L_0x03c5
            int r0 = r1.length()
            if (r0 == 0) goto L_0x03c5
            X.LXP r0 = new X.LXP
            r0.<init>(r8, r9, r11)
            r7.setButtonTextAndOnClickListener(r1, r0)
        L_0x0361:
            com.instagram.igds.components.snackbar.IgdsSnackBar r0 = r11.A08
            if (r0 == 0) goto L_0x04c9
            int r0 = X.C14013ToF.A00(r0)
            r11.A02 = r0
            boolean r0 = r9.A0J
            if (r0 == 0) goto L_0x0377
            X.LYf r0 = new X.LYf
            r0.<init>(r9, r11)
            r7.setSwipeListener(r0)
        L_0x0377:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L_0x038b
            android.app.Activity r4 = (android.app.Activity) r4
            if (r4 == 0) goto L_0x038b
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = r0.A01(r4)
            if (r0 == 0) goto L_0x038b
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r2 = r0.A0g
        L_0x038b:
            int r3 = r9.A02
            android.view.View r1 = r11.A0G
            if (r1 == 0) goto L_0x039f
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x039f
            if (r3 != 0) goto L_0x039f
            if (r2 != 0) goto L_0x039f
            int r3 = r1.getHeight()
        L_0x039f:
            boolean r0 = r11.A04()
            if (r0 == 0) goto L_0x03a8
            int r0 = r11.A02
            int r3 = r3 - r0
        L_0x03a8:
            android.view.View r6 = r11.A04
            if (r6 == 0) goto L_0x04c1
            boolean r0 = r9.A0R
            if (r0 == 0) goto L_0x03c1
            X.0nA.A0T(r6, r3)
        L_0x03b3:
            if (r8 == 0) goto L_0x03b8
            r8.onShow()
        L_0x03b8:
            X.JTt r0 = new X.JTt
            r0.<init>(r9, r11)
        L_0x03bd:
            r6.post(r0)
            return
        L_0x03c1:
            X.0nA.A0X(r6, r3)
            goto L_0x03b3
        L_0x03c5:
            int r0 = r9.A01
            if (r0 == 0) goto L_0x03e1
            X.LXQ r1 = new X.LXQ
            r1.<init>(r8, r9, r11)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r5.setImageDrawable(r0)
            r5.setOnClickListener(r1)
            r5.setVisibility(r10)
            r0 = r22
            X.2eS.A04(r5, r0)
            goto L_0x0361
        L_0x03e1:
            com.instagram.common.typedurl.ImageUrl r1 = r9.A08
            if (r1 == 0) goto L_0x03ef
            X.LXN r0 = new X.LXN
            r0.<init>(r8, r9, r11)
            r7.setButtonImageAndOnClickListener(r1, r0)
            goto L_0x0361
        L_0x03ef:
            r0 = r20
            r7.setButtonTextAndOnClickListener(r0, r6)
            goto L_0x0361
        L_0x03f6:
            X.6aq r0 = X.C310346aq.SUCCESS
            if (r14 != r0) goto L_0x0402
            r0 = 2131238110(0x7f081cde, float:1.809249E38)
            r7.setIconDrawable((int) r0)
            goto L_0x0348
        L_0x0402:
            X.6ar r0 = r9.A0B
            int r1 = r0.ordinal()
            if (r1 == r10) goto L_0x0348
            if (r1 == r3) goto L_0x049d
            if (r1 == r12) goto L_0x047c
            r0 = r19
            if (r1 == r0) goto L_0x042c
            if (r1 != r13) goto L_0x04d9
            java.lang.Integer r0 = r9.A0E
            if (r0 == 0) goto L_0x0423
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0423
            r7.setIconDrawable((int) r0)
            goto L_0x0348
        L_0x0423:
            android.graphics.drawable.Drawable r0 = r9.A04
            if (r0 == 0) goto L_0x04d1
            r7.setIconDrawable((android.graphics.drawable.Drawable) r0)
            goto L_0x0348
        L_0x042c:
            com.instagram.common.typedurl.ImageUrl r1 = r9.A09
            if (r1 == 0) goto L_0x0459
            com.instagram.common.typedurl.ImageUrl r0 = r9.A07
            if (r0 == 0) goto L_0x0455
            r7.setAvatarImageUri(r1, r0)
            r0 = 2130970332(0x7f0406dc, float:1.7549371E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r7.setAvatarRingColor(r0)
        L_0x0445:
            boolean r0 = r9.A0Q
            if (r0 == 0) goto L_0x0477
            r0 = 2131239534(0x7f08226e, float:1.8095378E38)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r7.setPresenceBadgeDrawable(r0)
            goto L_0x0348
        L_0x0455:
            r7.setAvatarImageUri(r1)
            goto L_0x0445
        L_0x0459:
            android.graphics.drawable.Drawable r1 = r9.A04
            if (r1 == 0) goto L_0x04df
            android.graphics.drawable.Drawable r0 = r9.A03
            if (r0 == 0) goto L_0x0473
            r7.setAvatarImageDrawable(r1, r0)
            r0 = 2130970332(0x7f0406dc, float:1.7549371E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r7.setAvatarRingColor(r0)
            goto L_0x0445
        L_0x0473:
            r7.setAvatarImageDrawable(r1)
            goto L_0x0445
        L_0x0477:
            r7.setPresenceBadgeDrawable(r6)
            goto L_0x0348
        L_0x047c:
            com.instagram.common.typedurl.ImageUrl r0 = r9.A09
            if (r0 == 0) goto L_0x0485
            r7.setCircularImageUri(r0)
            goto L_0x0348
        L_0x0485:
            java.lang.Integer r0 = r9.A0E
            if (r0 == 0) goto L_0x0494
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0494
            r7.setCircularImageDrawableRes(r0)
            goto L_0x0348
        L_0x0494:
            android.graphics.drawable.Drawable r0 = r9.A04
            if (r0 == 0) goto L_0x04e7
            r7.setCircularImageDrawable(r0)
            goto L_0x0348
        L_0x049d:
            com.instagram.common.typedurl.ImageUrl r0 = r9.A09
            if (r0 == 0) goto L_0x04ab
            r7.setSquareImageUri(r0)
        L_0x04a4:
            boolean r0 = r9.A0K
            r7.setSquareImageStrokeEnabled(r0)
            goto L_0x0348
        L_0x04ab:
            java.lang.Integer r0 = r9.A0E
            if (r0 == 0) goto L_0x04b9
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x04b9
            r7.setSquareImageDrawableRes(r0)
            goto L_0x04a4
        L_0x04b9:
            android.graphics.drawable.Drawable r0 = r9.A04
            if (r0 == 0) goto L_0x04ef
            r7.setSquareImageDrawable(r0)
            goto L_0x04a4
        L_0x04c1:
            java.lang.String r1 = "snackBarContainer is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x04c9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r21
            r1.<init>(r0)
            throw r1
        L_0x04d1:
            java.lang.String r1 = "Unsupported or missing image for snackbar icon image type"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x04d9:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x04df:
            java.lang.String r1 = "No resources provided for avatar image type"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x04e7:
            java.lang.String r1 = "No circular image resource provided"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x04ef:
            java.lang.String r1 = "No square image resource provided"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x04f7:
            java.lang.String r1 = "snackBarContainer is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x04ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0505:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x050b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0511:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0517:
            java.lang.String r1 = "IgdsDualButtonSnackBar config is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x051f:
            X.1xC r1 = X.1xC.A01
            X.6SS r0 = new X.6SS
            r0.<init>()
            r1.A00(r0)
        L_0x0529:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3M8.A01(X.3M8):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cd, code lost:
        r0 = r3.A01;
        r0.setText(2131972372);
        r0.setOnClickListener(r2);
        r0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a5, code lost:
        r3.postDelayed(r10.A0H, (long) X.Dc5.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01af, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass3M8 r10) {
        /*
            X.LQT r5 = r10.A06
            java.lang.String r7 = "Required value was null."
            if (r5 == 0) goto L_0x01b6
            X.MVq r0 = r5.A02
            X.LSB r4 = r0.BzP()
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r0 = r10.A0A
            if (r0 == 0) goto L_0x0023
            X.MVq r2 = r5.A02
            java.lang.Integer r0 = r2.BzN()
            int r0 = r0.intValue()
            r8 = 0
            r1 = 8
            r9 = 0
            java.lang.String r6 = ""
            switch(r0) {
                case 0: goto L_0x0167;
                case 1: goto L_0x00f4;
                case 2: goto L_0x00de;
                case 3: goto L_0x00b5;
                case 4: goto L_0x009c;
                case 5: goto L_0x0060;
                case 6: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            return
        L_0x0024:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r3 = r10.A0A
            if (r3 == 0) goto L_0x0023
            r0 = 2131952617(0x7f1303e9, float:1.9541682E38)
            r3.setStatusText((int) r0)
            r3.setProgressBarVisibility(r1)
            android.content.Context r2 = r3.getContext()
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x0050
            int r0 = X.2Yu.A05(r2)
            int r0 = r2.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
            r3.setMediaThumbnailDrawable(r1)
        L_0x0050:
            r3.setExplanationText((java.lang.String) r6)
            r3.setButtonTextAndOnClickListener(r6, r9)
            android.view.View r3 = r10.A04
            if (r3 != 0) goto L_0x01a5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0060:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r3 = r10.A0A
            if (r3 == 0) goto L_0x0023
            r0 = 2131952616(0x7f1303e8, float:1.954168E38)
            r3.setStatusText((int) r0)
            r3.setProgressBarVisibility(r1)
            android.content.Context r2 = r3.getContext()
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x008c
            int r0 = X.2Yu.A05(r2)
            int r0 = r2.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
            r3.setMediaThumbnailDrawable(r1)
        L_0x008c:
            r3.setExplanationText((java.lang.String) r6)
            r3.setButtonTextAndOnClickListener(r6, r9)
            android.view.View r3 = r10.A04
            if (r3 != 0) goto L_0x01a5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x009c:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r3 = r10.A0A
            if (r3 == 0) goto L_0x0023
            r0 = 2131968518(0x7f134206, float:1.9573933E38)
            r3.setStatusText((int) r0)
            r3.setProgressBarVisibility(r1)
            r0 = 2131976895(0x7f1362bf, float:1.9590923E38)
            r3.setExplanationText((int) r0)
            X.LWw r2 = new X.LWw
            r2.<init>(r10)
            goto L_0x00cd
        L_0x00b5:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r3 = r10.A0A
            if (r3 == 0) goto L_0x0023
            r0 = 2131968518(0x7f134206, float:1.9573933E38)
            r3.setStatusText((int) r0)
            r3.setProgressBarVisibility(r1)
            r0 = 2131976895(0x7f1362bf, float:1.9590923E38)
            r3.setExplanationText((int) r0)
            X.LWv r2 = new X.LWv
            r2.<init>(r10)
        L_0x00cd:
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1 = 2131972372(0x7f135114, float:1.958175E38)
            android.widget.TextView r0 = r3.A01
            r0.setText(r1)
            r0.setOnClickListener(r2)
            r0.setVisibility(r8)
            return
        L_0x00de:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r3 = r10.A0A
            if (r3 == 0) goto L_0x0023
            r3.setProgressBarVisibility(r8)
            r2 = 100
            r1 = 1
            android.widget.ProgressBar r0 = r3.A00
            r0.setProgress(r2, r1)
            r3.setExplanationText((java.lang.String) r6)
            r3.setButtonTextAndOnClickListener(r6, r9)
            return
        L_0x00f4:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r3 = r10.A0A
            if (r3 == 0) goto L_0x0134
            if (r4 == 0) goto L_0x0102
            java.lang.Integer r0 = r4.A04
            if (r0 == 0) goto L_0x0102
            int r8 = r0.intValue()
        L_0x0102:
            r3.setProgressBarVisibility(r8)
            int r2 = r2.BhS()
            r1 = 1
            android.widget.ProgressBar r0 = r3.A00
            r0.setProgress(r2, r1)
            r3.setExplanationText((java.lang.String) r6)
            if (r4 == 0) goto L_0x0119
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x0119
            r6 = r0
        L_0x0119:
            X.LX8 r0 = new X.LX8
            r0.<init>(r10, r4)
            r3.setButtonTextAndOnClickListener(r6, r0)
            android.view.View r3 = r10.A04
            if (r3 == 0) goto L_0x01b0
            java.lang.Runnable r2 = r10.A0H
            if (r4 == 0) goto L_0x0161
            java.lang.Long r0 = r4.A05
            if (r0 == 0) goto L_0x0161
            long r0 = r0.longValue()
        L_0x0131:
            r3.postDelayed(r2, r0)
        L_0x0134:
            if (r4 == 0) goto L_0x0151
            java.lang.String r1 = r4.A07
            if (r1 == 0) goto L_0x0151
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r0 = r10.A0A
            if (r0 == 0) goto L_0x0141
            r0.setStatusText((java.lang.String) r1)
        L_0x0141:
            X.IVl r0 = r5.A01
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r0.A01
            com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository r0 = (com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository) r0
            X.GPq r1 = r0.A03
            X.HOt r0 = X.C54688HOt.A0W
            X.C52369GPq.A01(r0, r1)
            return
        L_0x0151:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r1 = r10.A0A
            if (r1 == 0) goto L_0x0141
            if (r4 == 0) goto L_0x015d
            int r0 = r4.A00
        L_0x0159:
            r1.setStatusText((int) r0)
            goto L_0x0141
        L_0x015d:
            r0 = 2131969672(0x7f134688, float:1.9576273E38)
            goto L_0x0159
        L_0x0161:
            int r0 = X.Dc5.A01()
            long r0 = (long) r0
            goto L_0x0131
        L_0x0167:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r3 = r10.A0A
            if (r3 == 0) goto L_0x0187
            r3.setProgressBarVisibility(r8)
            int r2 = r2.BhS()
            r1 = 1
            android.widget.ProgressBar r0 = r3.A00
            r0.setProgress(r2, r1)
            r3.setExplanationText((java.lang.String) r6)
            if (r4 == 0) goto L_0x0184
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L_0x0182
            r6 = r0
        L_0x0182:
            android.view.View$OnClickListener r9 = r4.A03
        L_0x0184:
            r3.setButtonTextAndOnClickListener(r6, r9)
        L_0x0187:
            if (r4 == 0) goto L_0x0195
            java.lang.String r1 = r4.A09
            if (r1 == 0) goto L_0x0195
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r0 = r10.A0A
            if (r0 == 0) goto L_0x0023
            r0.setStatusText((java.lang.String) r1)
            return
        L_0x0195:
            com.instagram.igds.components.snackbar.IgdsUploadSnackBar r1 = r10.A0A
            if (r1 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x01a1
            int r0 = r4.A01
        L_0x019d:
            r1.setStatusText((int) r0)
            return
        L_0x01a1:
            r0 = 2131969675(0x7f13468b, float:1.957628E38)
            goto L_0x019d
        L_0x01a5:
            java.lang.Runnable r2 = r10.A0H
            int r0 = X.Dc5.A00()
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x01b0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x01b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3M8.A02(X.3M8):void");
    }

    public static final void A03(AnonymousClass3M8 r5, boolean z) {
        View view = r5.A04;
        if (view != null) {
            view.removeCallbacks(r5.A0H);
            AnonymousClass0eM r1 = r5.A0M;
            if (r1.CVQ()) {
                AnonymousClass3E6 r0 = (AnonymousClass3E6) r1.getValue();
                r0.EEH(r5);
                r0.onStop();
            }
            if (z) {
                IgdsSnackBar igdsSnackBar = r5.A08;
                if (igdsSnackBar != null) {
                    igdsSnackBar.setSwipeListener((View.OnTouchListener) null);
                }
                ((2cs) r5.A0N.getValue()).A06(-1.0d);
                return;
            }
            AnonymousClass0eM r4 = r5.A0N;
            2cs r12 = (2cs) r4.getValue();
            r12.A08(-1.0d, true);
            r12.A01();
            if (r5.A0C) {
                r5.DmC((2cs) r4.getValue());
            }
        }
    }

    private final boolean A04() {
        C310346aq r1;
        Dc2 dc2 = this.A09;
        C310346aq r2 = null;
        if (dc2 != null) {
            r1 = dc2.A0C;
        } else {
            r1 = null;
        }
        if (r1 != C310346aq.BANNER) {
            if (dc2 != null) {
                r2 = dc2.A0C;
            }
            if (r2 == C310346aq.BANNER_IMMERSIVE) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void A05(int i) {
        if (!this.A0Q) {
            A00();
        } else if (this.A04 == null) {
            this.A0F = Integer.valueOf(i);
            return;
        }
        View view = this.A04;
        if (view != null) {
            0nA.A0T(view, i);
            return;
        }
        throw new IllegalStateException("Expected snackbar container to have been initialized");
    }

    public final void A06(int i) {
        if (!this.A0Q) {
            A00();
        } else if (this.A08 == null) {
            this.A0E = Integer.valueOf(i);
            return;
        }
        IgdsSnackBar igdsSnackBar = this.A08;
        if (igdsSnackBar != null) {
            0nA.A0W(igdsSnackBar, i);
            return;
        }
        throw new IllegalStateException("Expected snackbar container to have been initialized");
    }

    public final void A09(Dc2 dc2) {
        if (0qQ.A0K(this.A09, dc2)) {
            A03(this, true);
            int i = dc2.A00;
            if (i == 0) {
                i = Dc5.A01();
            }
            if (i != -1) {
                return;
            }
        }
        this.A0K.remove(dc2);
    }

    public final void DMr(int i, boolean z) {
        View view;
        if (!A04() && (view = this.A04) != null) {
            0nA.A0X(view, i);
        }
    }
}
