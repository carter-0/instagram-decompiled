package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.Ffh  reason: case insensitive filesystem */
public final class C50626Ffh implements G89 {
    public LayoutTransition A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public View.OnClickListener A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public IgdsBottomButtonLayout A0C;
    public IgdsSwitch A0D;
    public C49861FAb A0E;
    public ProgressButton A0F;
    public final AnonymousClass0iw A0G;
    public final UserSession A0H;
    public final C49715F3a A0I;
    public final C51950G8t A0J;

    public C50626Ffh(AnonymousClass0iw r2, UserSession userSession, C49715F3a f3a, C51950G8t g8t) {
        0qQ.A0B(userSession, 1);
        this.A0H = userSession;
        this.A0G = r2;
        this.A0J = g8t;
        this.A0I = f3a;
    }

    public final /* bridge */ /* synthetic */ void D8T(Context context, Object obj) {
    }

    public final /* bridge */ /* synthetic */ void CwD(Context context, Object obj) {
        View view = this.A06;
        if (view == null) {
            0qQ.A0F("progressSpinner");
            throw AnonymousClass00P.createAndThrow();
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dyq(android.content.Context r11, android.view.View r12, java.lang.Object r13) {
        /*
            r10 = this;
            X.F0j r13 = (X.C49652F0j) r13
            r5 = 1
            int r3 = X.DbW.A02(r5, r12, r13)
            android.animation.LayoutTransition r1 = new android.animation.LayoutTransition
            r1.<init>()
            r10.A00 = r1
            r0 = 4
            r1.enableTransitionType(r0)
            r0 = 2131437641(0x7f0b2849, float:1.8497186E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r12, r0)
            r10.A07 = r0
            r0 = 2131441229(0x7f0b364d, float:1.8504464E38)
            android.view.View r0 = r12.findViewById(r0)
            r10.A05 = r0
            r0 = 2131441424(0x7f0b3710, float:1.850486E38)
            android.widget.TextView r0 = X.DbU.A0G(r12, r0)
            r10.A09 = r0
            r0 = 2131432828(0x7f0b157c, float:1.8487424E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r12, r0)
            r10.A0B = r0
            r0 = 2131432827(0x7f0b157b, float:1.8487422E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r12, r0)
            r10.A0A = r0
            r0 = 2131434617(0x7f0b1c79, float:1.8491053E38)
            android.widget.TextView r0 = X.DbU.A0G(r12, r0)
            r10.A08 = r0
            r0 = 2131438591(0x7f0b2bff, float:1.8499113E38)
            android.view.View r0 = r12.requireViewById(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = (com.instagram.ui.widget.progressbutton.ProgressButton) r0
            r10.A0F = r0
            android.view.ViewGroup r1 = r10.A07
            java.lang.String r9 = "rootView"
            if (r1 == 0) goto L_0x01e3
            r0 = 2131427738(0x7f0b019a, float:1.84771E38)
            android.view.View r0 = r1.findViewById(r0)
            r10.A06 = r0
            r0 = 2131441228(0x7f0b364c, float:1.8504462E38)
            android.view.View r0 = r12.requireViewById(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r0
            r10.A0D = r0
            r0 = 2131427572(0x7f0b00f4, float:1.8476764E38)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = X.DbT.A0c(r12, r0)
            r10.A0C = r2
            r1 = 19
            X.FP0 r0 = new X.FP0
            r0.<init>((java.lang.Object) r10, (int) r1)
            r10.A04 = r0
            r1 = 20
            X.FP0 r0 = new X.FP0
            r0.<init>((java.lang.Object) r10, (int) r1)
            r10.A01 = r0
            r1 = 21
            X.FP0 r0 = new X.FP0
            r0.<init>((java.lang.Object) r10, (int) r1)
            r10.A03 = r0
            r1 = 22
            X.FP0 r0 = new X.FP0
            r0.<init>((java.lang.Object) r10, (int) r1)
            r10.A02 = r0
            java.lang.String r8 = "launchIgCaptureFlow"
            java.lang.String r7 = "importFromFacebookOrChangePhotoButton"
            java.lang.String r6 = "progressButton"
            r4 = 8
            if (r2 == 0) goto L_0x00ee
            com.instagram.common.session.UserSession r0 = r10.A0H
            boolean r0 = X.C61670oa.A0I(r0)
            if (r0 == 0) goto L_0x00ee
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r10.A0F
            if (r0 == 0) goto L_0x01de
            r0.setVisibility(r4)
            android.widget.TextView r0 = r10.A08
            if (r0 == 0) goto L_0x01d9
            r0.setVisibility(r4)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r10.A0C
            if (r1 == 0) goto L_0x00c5
            android.view.View$OnClickListener r0 = r10.A04
            if (r0 == 0) goto L_0x0135
            r1.setPrimaryActionOnClickListener(r0)
        L_0x00c5:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r10.A0C
            if (r2 == 0) goto L_0x00d3
            r1 = 23
            X.FP0 r0 = new X.FP0
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.setSecondaryActionOnClickListener(r0)
        L_0x00d3:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r10.A0C
            if (r0 == 0) goto L_0x00da
            r0.setDividerVisible(r5)
        L_0x00da:
            r0 = 2131431953(0x7f0b1211, float:1.848565E38)
            X.DbT.A1F(r12, r0, r4)
            android.view.View r0 = r10.A05
            if (r0 != 0) goto L_0x0117
            java.lang.String r1 = "profilePictureShareSwitchContainer"
        L_0x00e6:
            X.0qQ.A0F(r1)
        L_0x00e9:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ee:
            android.widget.TextView r2 = r10.A09
            java.lang.String r1 = "skipButton"
            if (r2 == 0) goto L_0x00e6
            r0 = 24
            X.FP0.A00(r2, r0, r10)
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x0104
            android.widget.TextView r0 = r10.A09
            if (r0 == 0) goto L_0x00e6
            r0.setVisibility(r4)
        L_0x0104:
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r10.A0F
            if (r1 == 0) goto L_0x01de
            android.view.View$OnClickListener r0 = r10.A04
            if (r0 == 0) goto L_0x0135
            X.AnonymousClass0fU.A00(r0, r1)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r10.A0C
            if (r0 == 0) goto L_0x012b
            r0.setVisibility(r4)
            goto L_0x012b
        L_0x0117:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof X.C71492dQ
            if (r0 == 0) goto L_0x012b
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r10.A0C
            if (r0 == 0) goto L_0x012b
            X.2dQ r1 = (X.C71492dQ) r1
            int r0 = r0.getId()
            r1.A0G = r0
        L_0x012b:
            android.widget.TextView r1 = r10.A08
            if (r1 == 0) goto L_0x01d9
            android.view.View$OnClickListener r0 = r10.A03
            if (r0 != 0) goto L_0x0139
            java.lang.String r8 = "launchFacebookProfilePictureImport"
        L_0x0135:
            X.0qQ.A0F(r8)
            goto L_0x00e9
        L_0x0139:
            X.AnonymousClass0fU.A00(r0, r1)
            X.0iw r0 = r10.A0G
            X.FAb r4 = new X.FAb
            r4.<init>(r0)
            r10.A0E = r4
            r0 = 2131440694(0x7f0b3436, float:1.8503379E38)
            android.view.ViewGroup r1 = X.DbS.A0E(r12, r0)
            r4.A05 = r1
            java.lang.String r7 = "sceneRoot"
            if (r1 == 0) goto L_0x01d9
            r0 = 2131628061(0x7f0e101d, float:1.8883404E38)
            android.content.Context r6 = r12.getContext()
            android.transition.Scene r0 = android.transition.Scene.getSceneForLayout(r1, r0, r6)
            r4.A01 = r0
            android.view.ViewGroup r1 = r4.A05
            if (r1 == 0) goto L_0x01d9
            r0 = 2131628062(0x7f0e101e, float:1.8883406E38)
            android.transition.Scene r0 = android.transition.Scene.getSceneForLayout(r1, r0, r6)
            r4.A02 = r0
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            r4.A04 = r0
            r0.setOrdering(r5)
            android.transition.TransitionSet r1 = r4.A04
            java.lang.String r7 = "animatedTransition"
            if (r1 == 0) goto L_0x01d9
            android.transition.ChangeBounds r0 = new android.transition.ChangeBounds
            r0.<init>()
            r1.addTransition(r0)
            android.transition.TransitionSet r1 = r4.A04
            if (r1 == 0) goto L_0x01d9
            android.transition.Fade r0 = new android.transition.Fade
            r0.<init>(r5)
            r1.addTransition(r0)
            android.transition.TransitionSet r2 = r4.A04
            if (r2 == 0) goto L_0x01d9
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            com.instagram.nux.fragment.AddProfilePhotoUiRedesignDelegate$KitKatViewSwitcher$initialize$1 r0 = new com.instagram.nux.fragment.AddProfilePhotoUiRedesignDelegate$KitKatViewSwitcher$initialize$1
            r0.<init>()
            r4.A03 = r0
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            r4.A00 = r0
            com.instagram.common.session.UserSession r0 = r13.A01
            X.0qQ.A07(r0)
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r0)
            X.Fue r0 = new X.Fue
            r0.<init>(r13, r4, r1)
            r4.A06 = r0
            X.Fuf r0 = new X.Fuf
            r0.<init>(r13, r4, r1)
            r4.A07 = r0
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r10.A0D
            if (r1 != 0) goto L_0x01c8
            java.lang.String r1 = "shareSwitch"
            goto L_0x00e6
        L_0x01c8:
            X.LsC r0 = new X.LsC
            r0.<init>(r3, r13, r10, r12)
            r1.A07 = r0
            android.view.ViewGroup r1 = r10.A07
            if (r1 == 0) goto L_0x01e3
            android.animation.LayoutTransition r0 = r10.A00
            if (r0 != 0) goto L_0x01e8
            java.lang.String r7 = "layoutTransition"
        L_0x01d9:
            X.0qQ.A0F(r7)
            goto L_0x00e9
        L_0x01de:
            X.0qQ.A0F(r6)
            goto L_0x00e9
        L_0x01e3:
            X.0qQ.A0F(r9)
            goto L_0x00e9
        L_0x01e8:
            r1.setLayoutTransition(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50626Ffh.Dyq(android.content.Context, android.view.View, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void FJp(Context context, Object obj) {
        String str;
        String str2;
        View view;
        View.OnClickListener onClickListener;
        C49652F0j f0j = (C49652F0j) obj;
        0qQ.A0B(f0j, 1);
        if (f0j.A00 == null) {
            str2 = "launchIgCaptureFlow";
            str = "launchFacebookProfilePictureImport";
            if (this.A0C == null || !C61670oa.A0I(this.A0H)) {
                TextView textView = this.A08;
                if (textView != null) {
                    View.OnClickListener onClickListener2 = this.A03;
                    if (onClickListener2 != null) {
                        AnonymousClass0fU.A00(onClickListener2, textView);
                        ProgressButton progressButton = this.A0F;
                        if (progressButton != null) {
                            progressButton.setText(2131952338);
                            view = this.A0F;
                            if (view != null) {
                                onClickListener = this.A04;
                            }
                        }
                        0qQ.A0F("progressButton");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("importFromFacebookOrChangePhotoButton");
                throw AnonymousClass00P.createAndThrow();
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A0C;
            if (igdsBottomButtonLayout != null) {
                String string = context.getString(2131952338);
                View.OnClickListener onClickListener3 = this.A04;
                if (onClickListener3 != null) {
                    igdsBottomButtonLayout.setPrimaryAction(string, onClickListener3);
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A0C;
            if (igdsBottomButtonLayout2 != null) {
                String string2 = context.getString(2131964180);
                View.OnClickListener onClickListener4 = this.A03;
                if (onClickListener4 != null) {
                    igdsBottomButtonLayout2.setSecondaryAction(string2, onClickListener4);
                    return;
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            return;
        }
        int i = f0j.A07;
        if (i == -1) {
            i = 2131968361;
        }
        str2 = "changePicture";
        str = "completeCaptureListener";
        if (this.A0C == null || !C61670oa.A0I(this.A0H)) {
            ProgressButton progressButton2 = this.A0F;
            if (progressButton2 != null) {
                progressButton2.setText(i);
                ProgressButton progressButton3 = this.A0F;
                if (progressButton3 != null) {
                    View.OnClickListener onClickListener5 = this.A02;
                    if (onClickListener5 != null) {
                        AnonymousClass0fU.A00(onClickListener5, progressButton3);
                        view = this.A08;
                        if (view != null) {
                            onClickListener = this.A01;
                        }
                        0qQ.A0F("importFromFacebookOrChangePhotoButton");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("progressButton");
            throw AnonymousClass00P.createAndThrow();
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A0C;
        if (igdsBottomButtonLayout3 != null) {
            String string3 = context.getString(i);
            View.OnClickListener onClickListener6 = this.A02;
            if (onClickListener6 != null) {
                igdsBottomButtonLayout3.setPrimaryAction(string3, onClickListener6);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout4 = this.A0C;
        if (igdsBottomButtonLayout4 != null) {
            View.OnClickListener onClickListener7 = this.A01;
            if (onClickListener7 != null) {
                igdsBottomButtonLayout4.setSecondaryActionOnClickListener(onClickListener7);
                return;
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        return;
        if (onClickListener != null) {
            AnonymousClass0fU.A00(onClickListener, view);
            return;
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void FLE(android.content.Context r8, java.lang.Object r9) {
        /*
            r7 = this;
            X.F0j r9 = (X.C49652F0j) r9
            r2 = 0
            r6 = 1
            X.0qQ.A0B(r9, r6)
            android.view.ViewGroup r1 = r7.A07
            if (r1 != 0) goto L_0x0015
            java.lang.String r5 = "rootView"
        L_0x000d:
            X.0qQ.A0F(r5)
        L_0x0010:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0015:
            android.animation.LayoutTransition r0 = r7.A00
            if (r0 != 0) goto L_0x001f
            java.lang.String r4 = "layoutTransition"
        L_0x001b:
            X.0qQ.A0F(r4)
            goto L_0x0010
        L_0x001f:
            r1.setLayoutTransition(r0)
            android.graphics.Bitmap r1 = r9.A00
            r3 = 8
            if (r1 != 0) goto L_0x0032
            android.view.View r0 = r7.A06
            if (r0 != 0) goto L_0x002f
            java.lang.String r4 = "progressSpinner"
            goto L_0x001b
        L_0x002f:
            r0.setVisibility(r3)
        L_0x0032:
            java.lang.String r4 = "shareSwitch"
            java.lang.String r5 = "profilePictureShareSwitchContainer"
            if (r1 == 0) goto L_0x00ba
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x0044
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0044
            X.G8t r0 = r7.A0J
            if (r0 == 0) goto L_0x00ba
        L_0x0044:
            android.view.View r1 = r7.A05
            if (r1 == 0) goto L_0x000d
            r0 = 0
            r1.setAlpha(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r7.A0D
            if (r0 == 0) goto L_0x001b
            r0.setChecked(r6)
            android.view.View r0 = r7.A05
            if (r0 == 0) goto L_0x000d
            r0.setVisibility(r2)
            android.view.View r0 = r7.A05
            if (r0 == 0) goto L_0x000d
            android.view.ViewPropertyAnimator r2 = X.DbY.A0G(r0)
            r0 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
        L_0x006b:
            android.view.View r0 = r7.A05
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getVisibility()
            java.lang.String r5 = "viewSwitcher"
            if (r0 == r3) goto L_0x00a2
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r7.A0D
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x00a2
            X.FAb r2 = r7.A0E
            if (r2 == 0) goto L_0x000d
            android.transition.Scene r1 = r2.A02
            java.lang.String r4 = "postPicturePreviewScene"
            if (r1 == 0) goto L_0x001b
            java.lang.Runnable r0 = r2.A07
            r1.setEnterAction(r0)
            java.lang.String r5 = "sceneRoot"
            android.view.ViewGroup r0 = r2.A05
            if (r0 == 0) goto L_0x000d
            android.transition.Scene r1 = r2.A02
        L_0x0098:
            if (r1 == 0) goto L_0x001b
            android.transition.Transition r0 = r2.A03
            if (r0 != 0) goto L_0x00c2
            java.lang.String r4 = "immediateTransition"
            goto L_0x001b
        L_0x00a2:
            X.FAb r2 = r7.A0E
            if (r2 == 0) goto L_0x000d
            android.transition.Scene r1 = r2.A01
            java.lang.String r4 = "avatarBoxScene"
            if (r1 == 0) goto L_0x001b
            java.lang.Runnable r0 = r2.A06
            r1.setEnterAction(r0)
            java.lang.String r5 = "sceneRoot"
            android.view.ViewGroup r0 = r2.A05
            if (r0 == 0) goto L_0x000d
            android.transition.Scene r1 = r2.A01
            goto L_0x0098
        L_0x00ba:
            android.view.View r0 = r7.A05
            if (r0 == 0) goto L_0x000d
            r0.setVisibility(r3)
            goto L_0x006b
        L_0x00c2:
            android.transition.TransitionManager.go(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50626Ffh.FLE(android.content.Context, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void FLz(Context context, UserSession userSession, Object obj) {
        TextView textView;
        int i;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        int i2;
        C49652F0j f0j = (C49652F0j) obj;
        AnonymousClass7TG.A1O(f0j, userSession);
        if (f0j.A00 == null) {
            TextView textView2 = this.A0B;
            if (textView2 != null) {
                textView2.setText(2131952341);
                TextView textView3 = this.A0A;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    if (f0j.A04) {
                        TextView textView4 = this.A09;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        }
                        0qQ.A0F("skipButton");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    if (this.A0C == null || !C61670oa.A0I(this.A0H)) {
                        textView = this.A08;
                        if (textView != null) {
                            i = 2131964180;
                            textView.setText(i);
                            return;
                        }
                        0qQ.A0F("importFromFacebookOrChangePhotoButton");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    igdsBottomButtonLayout = this.A0C;
                    if (igdsBottomButtonLayout != null) {
                        i2 = 2131964180;
                    } else {
                        return;
                    }
                }
                0qQ.A0F("subTitleText");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("titleText");
            throw AnonymousClass00P.createAndThrow();
        }
        TextView textView5 = this.A0B;
        if (textView5 != null) {
            textView5.setText(2131970047);
            TextView textView6 = this.A0A;
            if (textView6 != null) {
                textView6.setVisibility(8);
                TextView textView7 = this.A09;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                    if (this.A0C == null || !C61670oa.A0I(userSession)) {
                        textView = this.A08;
                        if (textView != null) {
                            i = 2131954990;
                            textView.setText(i);
                            return;
                        }
                        0qQ.A0F("importFromFacebookOrChangePhotoButton");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    igdsBottomButtonLayout = this.A0C;
                    if (igdsBottomButtonLayout != null) {
                        i2 = 2131954990;
                    } else {
                        return;
                    }
                }
                0qQ.A0F("skipButton");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("subTitleText");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("titleText");
        throw AnonymousClass00P.createAndThrow();
        igdsBottomButtonLayout.setSecondaryActionText(context.getString(i2));
    }
}
