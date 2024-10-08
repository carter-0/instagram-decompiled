package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.controller.visibility.VisibilityControllerComponentInterface$State;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Vm  reason: invalid class name and case insensitive filesystem */
public final class C356858Vm implements AnonymousClass81E {
    public int A00 = 1;
    public int A01;
    public int A02 = 1;
    public Medium A03;
    public C356888Vp A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Activity A0B;
    public final AnonymousClass86W A0C;
    public final AnonymousClass848 A0D;
    public final AnonymousClass4DH A0E;
    public final AnonymousClass82W A0F;
    public final AnonymousClass0iw A0G;
    public final UserSession A0H;
    public final C357638Yz A0I;
    public final C356788Vf A0J;
    public final C352888Fl A0K;
    public final C3499582p A0L;
    public final AnonymousClass80D A0M;
    public final C3496481e A0N;
    public final AnonymousClass8VZ A0O;
    public final C356898Vq A0P;
    public final AnonymousClass8DO A0Q;
    public final AnonymousClass86Y A0R;
    public final AnonymousClass9PE A0S;
    public final AnonymousClass80U A0T;
    public final AnonymousClass889 A0U;
    public final AvatarStickerPreRenderInteractor A0V;
    public final AnonymousClass0eK A0W;
    public final Handler A0X;
    public final View A0Y;
    public final View A0Z;
    public final CallerContext A0a = CallerContext.A01("VisibilityController");
    public final AnonymousClass84E A0b;
    public final AnonymousClass3E6 A0c;
    public final AnonymousClass8K4 A0d;
    public final AnonymousClass8BA A0e;
    public final TargetViewSizeProvider A0f;
    public final AnonymousClass85X A0g;
    public final AnonymousClass8E7 A0h;
    public final AnonymousClass814 A0i;
    public final C356868Vn A0j;
    public final C3504884v A0k;
    public final C355898Ru A0l;
    public final C353398Hl A0m;
    public final C342887pK A0n;
    public final AnonymousClass8D8 A0o;
    public final C353508Hx A0p;
    public final C356878Vo A0q;
    public final AnonymousClass8D9 A0r;
    public final AnonymousClass88F A0s;
    public final AnonymousClass88B A0t;
    public final AnonymousClass0eK A0u;
    public final AnonymousClass0eK A0v;
    public final AnonymousClass0eM A0w;
    public final boolean A0x;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x01b2, code lost:
        if (r1 != X.AnonymousClass8JL.AUDIO_AND_EFFECT) goto L_0x01bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C356858Vm(android.view.View r25, android.view.View r26, X.AnonymousClass86W r27, X.AnonymousClass848 r28, X.AnonymousClass4DH r29, X.AnonymousClass82W r30, X.AnonymousClass84E r31, X.AnonymousClass0iw r32, X.AnonymousClass3E6 r33, X.C357638Yz r34, X.AnonymousClass8K4 r35, X.AnonymousClass8BA r36, X.C356788Vf r37, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r38, X.C352888Fl r39, X.AnonymousClass85X r40, X.C3499582p r41, X.AnonymousClass8E7 r42, X.AnonymousClass80D r43, X.AnonymousClass814 r44, X.C3496481e r45, X.AnonymousClass8VZ r46, X.AnonymousClass8DO r47, X.AnonymousClass86Y r48, X.C3504884v r49, X.C355898Ru r50, X.C353398Hl r51, X.C342887pK r52, X.AnonymousClass80U r53, X.AnonymousClass8D8 r54, X.C353508Hx r55, X.AnonymousClass8D9 r56, X.AnonymousClass88F r57, X.AnonymousClass889 r58, X.AnonymousClass0eK r59, X.AnonymousClass0eK r60, X.AnonymousClass0eK r61, X.AnonymousClass0eM r62) {
        /*
            r24 = this;
            r1 = 1
            r14 = r39
            X.0qQ.A0B(r14, r1)
            r0 = 2
            r9 = r53
            X.0qQ.A0B(r9, r0)
            r0 = 5
            r11 = r45
            X.0qQ.A0B(r11, r0)
            r2 = 6
            r21 = r32
            r0 = r21
            X.0qQ.A0B(r0, r2)
            r2 = 7
            r22 = r30
            r0 = r22
            X.0qQ.A0B(r0, r2)
            r0 = 8
            r15 = r37
            X.0qQ.A0B(r15, r0)
            r0 = 9
            r13 = r42
            X.0qQ.A0B(r13, r0)
            r0 = 11
            r7 = r55
            X.0qQ.A0B(r7, r0)
            r2 = 17
            r19 = r40
            r0 = r19
            X.0qQ.A0B(r0, r2)
            r2 = 19
            r17 = r51
            r0 = r17
            X.0qQ.A0B(r0, r2)
            r2 = 21
            r16 = r56
            r0 = r16
            X.0qQ.A0B(r0, r2)
            r2 = 22
            r0 = r58
            X.0qQ.A0B(r0, r2)
            r3 = 25
            r20 = r33
            r2 = r20
            X.0qQ.A0B(r2, r3)
            r3 = 26
            r18 = r41
            r2 = r18
            X.0qQ.A0B(r2, r3)
            r2 = 30
            r10 = r46
            X.0qQ.A0B(r10, r2)
            r2 = 31
            r8 = r48
            X.0qQ.A0B(r8, r2)
            r3 = 32
            r23 = r27
            r2 = r23
            X.0qQ.A0B(r2, r3)
            r2 = 33
            r12 = r44
            X.0qQ.A0B(r12, r2)
            r3 = 34
            r2 = r62
            X.0qQ.A0B(r2, r3)
            r3 = 36
            r5 = r59
            X.0qQ.A0B(r5, r3)
            r3 = 37
            r4 = r60
            X.0qQ.A0B(r4, r3)
            r6 = 38
            r3 = r61
            X.0qQ.A0B(r3, r6)
            r6 = r24
            r6.<init>()
            r6.A0K = r14
            r6.A0T = r9
            r9 = r43
            r6.A0M = r9
            r14 = r29
            r6.A0E = r14
            r6.A0N = r11
            r11 = r21
            r6.A0G = r11
            r11 = r22
            r6.A0F = r11
            r6.A0J = r15
            r6.A0h = r13
            r11 = r34
            r6.A0I = r11
            r6.A0p = r7
            r7 = r50
            r6.A0l = r7
            r7 = r25
            r6.A0Y = r7
            r7 = r26
            r6.A0Z = r7
            r7 = r35
            r6.A0d = r7
            r7 = r36
            r6.A0e = r7
            r7 = r19
            r6.A0g = r7
            r7 = r52
            r6.A0n = r7
            r7 = r17
            r6.A0m = r7
            r7 = r57
            r6.A0s = r7
            r7 = r16
            r6.A0r = r7
            r6.A0U = r0
            r0 = r28
            r6.A0D = r0
            r0 = r47
            r6.A0Q = r0
            r0 = r20
            r6.A0c = r0
            r0 = r18
            r6.A0L = r0
            r0 = r49
            r6.A0k = r0
            r0 = r54
            r6.A0o = r0
            r0 = r31
            r6.A0b = r0
            r6.A0O = r10
            r6.A0R = r8
            r0 = r23
            r6.A0C = r0
            r6.A0i = r12
            r6.A0w = r2
            r0 = r38
            r6.A0f = r0
            r6.A0W = r5
            r6.A0v = r4
            r6.A0u = r3
            r6.A02 = r1
            r6.A00 = r1
            java.lang.String r0 = "VisibilityController"
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A01(r0)
            r6.A0a = r0
            android.app.Activity r0 = r9.A05
            X.0qQ.A07(r0)
            r6.A0B = r0
            com.instagram.common.session.UserSession r4 = r9.A0S
            X.0qQ.A07(r4)
            r6.A0H = r4
            X.8Vn r0 = new X.8Vn
            r0.<init>(r6)
            r6.A0j = r0
            X.9PE r0 = r9.A0n
            r6.A0S = r0
            X.8Vo r0 = new X.8Vo
            r0.<init>(r11)
            r6.A0q = r0
            r2 = 0
            r3 = 126(0x7e, float:1.77E-43)
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r0 = new com.instagram.stickersearch.AvatarStickerPreRenderInteractor
            r0.<init>(r2, r4, r3)
            r6.A0V = r0
            com.instagram.common.gallery.Medium r0 = r9.A0P
            r6.A03 = r0
            androidx.fragment.app.FragmentActivity r0 = r14.requireActivity()
            X.2YN r3 = new X.2YN
            r3.<init>(r0)
            java.lang.Class<X.88B> r0 = X.AnonymousClass88B.class
            X.2YL r0 = r3.A00(r0)
            X.88B r0 = (X.AnonymousClass88B) r0
            r6.A0t = r0
            X.82i r0 = r0.A00
            if (r0 == 0) goto L_0x01f3
            X.8JI r4 = r0.A00
        L_0x0179:
            X.8JI r3 = X.AnonymousClass8JI.REMIX
            r0 = 0
            if (r4 != r3) goto L_0x017f
            r0 = 1
        L_0x017f:
            r6.A0x = r0
            X.8Vp r0 = r9.A1z
            r6.A04 = r0
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r3)
            r6.A0X = r0
            r6.A08 = r1
            java.lang.String r11 = r9.A2G
            if (r11 == 0) goto L_0x01b4
            X.8Yz r0 = r6.A0I
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            r3 = 0
            if (r0 == 0) goto L_0x01bc
            X.80D r0 = r6.A0M
            X.9Qn r0 = r0.A13
            if (r0 == 0) goto L_0x01bc
            X.8JL r1 = r0.A03
            X.0qQ.A0B(r1, r3)
            X.8JL r0 = X.AnonymousClass8JL.EFFECT
            if (r1 == r0) goto L_0x01b4
            X.8JL r0 = X.AnonymousClass8JL.AUDIO_AND_EFFECT
            if (r1 != r0) goto L_0x01bc
        L_0x01b4:
            X.8Vq r0 = new X.8Vq
            r0.<init>(r6)
            r6.A0P = r0
            return
        L_0x01bc:
            boolean r0 = r9.A36
            if (r0 == 0) goto L_0x01b4
            X.848 r1 = r6.A0D
            boolean r0 = r1.A02(r11)
            if (r0 != 0) goto L_0x01b4
            X.81e r0 = r6.A0N
            X.80R r0 = r0.A00
            X.28D r0 = r0.A01
            java.lang.String r12 = X.C371068xW.A00(r0)
            X.84B r10 = r9.A0L
            if (r10 != 0) goto L_0x01d8
            X.84B r10 = X.AnonymousClass84B.OTHER
        L_0x01d8:
            java.lang.String r13 = r9.A2R
            java.lang.String r14 = r9.A2N
            java.lang.String r15 = r9.A2f
            r17 = -1
            r18 = 0
            if (r14 == 0) goto L_0x01e6
            r18 = 1
        L_0x01e6:
            X.8YD r9 = new X.8YD
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.05G r0 = r1.A00
            r0.Epw(r9)
            goto L_0x01b4
        L_0x01f3:
            r4 = 0
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C356858Vm.<init>(android.view.View, android.view.View, X.86W, X.848, X.4DH, X.82W, X.84E, X.0iw, X.3E6, X.8Yz, X.8K4, X.8BA, X.8Vf, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8Fl, X.85X, X.82p, X.8E7, X.80D, X.814, X.81e, X.8VZ, X.8DO, X.86Y, X.84v, X.8Ru, X.8Hl, X.7pK, X.80U, X.8D8, X.8Hx, X.8D9, X.88F, X.889, X.0eK, X.0eK, X.0eK, X.0eM):void");
    }

    public final void A08(28D r4) {
        0qQ.A0B(r4, 0);
        if (this.A02 == 3 && (!1AW.A06(0Tu.A05, 18302848513086415L) || r4 != 28D.A0i)) {
            return;
        }
        if (!this.A08 || r4 == 28D.A2T) {
            A02(r4, this);
            return;
        }
        A01();
        this.A0X.post(new AnonymousClass9QB(r4, this));
    }

    public final void A0A(28D r3, Integer num, float f) {
        0qQ.A0B(r3, 1);
        if (f >= 1.0f) {
            A08(r3);
        } else if (f == 0.0f) {
            this.A0X.removeCallbacksAndMessages((Object) null);
            A0B(num);
        } else {
            A09(r3);
        }
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [X.07Z, X.4DH] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0048: MOVE  (r1v21 com.instagram.base.activity.BaseFragmentActivity) = (r1v20 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A0B(java.lang.Integer r9) {
        /*
            r8 = this;
            r6 = 0
            int r1 = r8.A02
            r4 = 1
            if (r1 == r4) goto L_0x0173
            r0 = 3
            if (r1 != r0) goto L_0x0016
            com.instagram.common.session.UserSession r0 = r8.A0H
            X.2cc r2 = X.C71342cb.A00(r0)
            X.8Fl r1 = r8.A0K
            android.app.Activity r0 = r8.A0B
            r2.A08(r0, r1)
        L_0x0016:
            r8.A02 = r4
            X.9PE r1 = r8.A0S
            if (r1 == 0) goto L_0x004f
            X.9PL r0 = r1.A04
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "navigationPerfLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002a:
            r0.A08()
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0040
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            if (r0 == 0) goto L_0x0040
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.AnonymousClass2uJ.A01(r0)
        L_0x0040:
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x004f
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x004f
            r1.A0l(r4)
        L_0x004f:
            r8.A09 = r6
            com.instagram.common.session.UserSession r5 = r8.A0H
            X.27r r2 = X.27p.A01(r5)
            int r0 = r9.intValue()
            switch(r0) {
                case 1: goto L_0x017d;
                case 2: goto L_0x0180;
                case 3: goto L_0x017a;
                case 4: goto L_0x0177;
                case 5: goto L_0x0174;
                default: goto L_0x005e;
            }
        L_0x005e:
            r1 = 15
        L_0x0060:
            X.283 r0 = r2.A04
            r0.A02 = r1
            X.82W r2 = r8.A0F
            X.82X r1 = r2.A00()
            X.8Vn r0 = r8.A0j
            r1.A07(r0)
            X.82X r2 = r2.A00()
            X.8Vf r0 = r8.A0J
            X.7xl r1 = r0.A00()
            X.0qQ.A0B(r1, r6)
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r2.A05
            java.util.Set r0 = r0.A0S
            r0.remove(r1)
            X.8Ru r0 = r8.A0l
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r0.A0H
            r0 = 0
            r1.CNi(r0)
            android.view.View r1 = r8.A0Y
            r0 = 4
            r1.setVisibility(r0)
            X.28D r1 = X.28D.A5C
            X.81e r0 = r8.A0N
            X.80R r0 = r0.A00
            X.28D r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b1
            X.0eK r0 = r8.A0W
            java.lang.Object r0 = r0.get()
            X.0qQ.A0A(r0)
            X.8WX r0 = (X.AnonymousClass8WX) r0
            X.8XA r0 = r0.A00()
            r0.A0M(r6)
        L_0x00b1:
            X.8Yz r2 = r8.A0I
            X.80m r0 = r2.A08
            java.lang.Object r1 = r0.A00
            X.8jC r0 = X.C363138jC.A00
            if (r1 == r0) goto L_0x00bf
            X.80K r0 = X.AnonymousClass80K.A00
            if (r1 != r0) goto L_0x00c4
        L_0x00bf:
            X.9QA r0 = X.AnonymousClass9QA.A00
            r2.A0I(r0)
        L_0x00c4:
            X.8aL r1 = X.C358088aL.A0C
            X.8aL[] r0 = new X.C358088aL[]{r1}
            boolean r0 = r2.A0V(r0)
            if (r0 == 0) goto L_0x00d3
            r2.A0L(r1)
        L_0x00d3:
            X.0eK r0 = r8.A0W
            java.lang.Object r0 = r0.get()
            X.8WX r0 = (X.AnonymousClass8WX) r0
            if (r0 == 0) goto L_0x00f9
            X.8XA r0 = r0.A00()
            if (r0 == 0) goto L_0x00f9
            X.8ic r2 = r0.A01
            if (r2 == 0) goto L_0x00f9
            X.2cs r0 = r2.A0E
            r0.A0B(r2)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.A01
            if (r1 == 0) goto L_0x00f9
            android.view.ViewGroup r0 = r2.A0D
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r1)
        L_0x00f9:
            X.8hG r0 = r8.A00()
            if (r0 == 0) goto L_0x0102
            r0.A0W()
        L_0x0102:
            X.8Fl r7 = r8.A0K
            X.81i r0 = r7.A17
            r0.A09 = r6
            r0.A07 = r6
            r0.A06 = r6
            boolean r0 = r7.A1P
            if (r0 == 0) goto L_0x0117
            X.2cs r2 = r7.A0Y
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A08(r0, r4)
        L_0x0117:
            X.8BA r3 = r8.A0e
            com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r2 = r3.A1Q
            X.2Fk r0 = r2.A01
            X.4DH r1 = r3.A0s
            r0.A05(r1)
            X.2Fk r0 = r2.A00
            r0.A05(r1)
            X.8Cj r0 = r3.A1C
            X.2Fk r0 = r0.A01
            r0.A05(r1)
            r7.A0J = r6
            X.JYD r3 = r7.A0C
            if (r3 == 0) goto L_0x0145
            X.8Yz r2 = r7.A0g
            X.8aL r1 = X.C358088aL.A0T
            X.8aL r0 = X.C358088aL.A0z
            X.8aL[] r0 = new X.C358088aL[]{r1, r0}
            boolean r0 = r2.A0V(r0)
            r3.A0L(r0, r4, r6)
        L_0x0145:
            X.3E6 r0 = r8.A0c
            r0.onStop()
            X.84E r0 = r8.A0b
            if (r0 == 0) goto L_0x0151
            r0.A00()
        L_0x0151:
            X.84v r0 = r8.A0k
            if (r0 == 0) goto L_0x0158
            r0.A02()
        L_0x0158:
            android.app.Activity r0 = r8.A0B
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.C362988ir.A01(r0, r5)
            if (r0 == 0) goto L_0x0169
            X.8Hl r0 = r8.A0m
            r0.A09(r4)
        L_0x0169:
            X.80U r1 = r8.A0T
            X.8SE r0 = new X.8SE
            r0.<init>()
            r1.E3H(r0)
        L_0x0173:
            return
        L_0x0174:
            r1 = 6
            goto L_0x0060
        L_0x0177:
            r1 = 5
            goto L_0x0060
        L_0x017a:
            r1 = 4
            goto L_0x0060
        L_0x017d:
            r1 = 3
            goto L_0x0060
        L_0x0180:
            r1 = 2
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C356858Vm.A0B(java.lang.Integer):void");
    }

    private final C362048hG A00() {
        AnonymousClass8XA A002;
        AnonymousClass8WX r0 = (AnonymousClass8WX) this.A0W.get();
        if (r0 == null || (A002 = r0.A00()) == null) {
            return null;
        }
        return A002.A02;
    }

    private final void A01() {
        0lq.A02("VisibilityController#minimalInitialization");
        try {
            if (this.A02 == 1) {
                if (182.A06(0Tu.A05, this.A0H, 36324999438807592L)) {
                    if (!this.A05) {
                        A04();
                    }
                    this.A05 = false;
                }
            }
            AnonymousClass9PE r0 = this.A0S;
            if (r0 != null) {
                r0.A02();
            }
            View view = this.A0Y;
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.requestFocus();
            }
        } finally {
            0lq.A01();
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [X.07Z] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00c2: MOVE  (r3v45 com.instagram.base.activity.BaseFragmentActivity) = (r3v41 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void A02(X.28D r28, X.C356858Vm r29) {
        /*
            java.lang.String r0 = "VisibilityController#onQuickCaptureFullyVisibleImpl"
            X.0lq.A02(r0)
            r1 = 0
            r0 = r29
            r0.A08 = r1     // Catch:{ all -> 0x048c }
            com.instagram.common.session.UserSession r15 = r0.A0H     // Catch:{ all -> 0x048c }
            X.JVm r4 = X.AnonymousClass9PJ.A00(r15)     // Catch:{ all -> 0x048c }
            X.0JA.A01()     // Catch:{ all -> 0x048c }
            X.29E r5 = r4.A04     // Catch:{ all -> 0x048c }
            long r6 = r4.A00     // Catch:{ all -> 0x048c }
            r10 = 585177486(0x22e1198e, float:6.101343E-18)
            r8 = 10000(0x2710, double:4.9407E-320)
            r5.A08(r6, r8, r10)     // Catch:{ all -> 0x048c }
            long r2 = r4.A00     // Catch:{ all -> 0x048c }
            boolean r2 = r5.A0E(r10, r2)     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x0037
            long r7 = r4.A00     // Catch:{ all -> 0x048c }
            r9 = 0
            java.lang.String r6 = "qcc_fully_visible"
            r10 = r9
            r11 = r9
            r12 = r9
            r5.A0D(r6, r7, r9, r10, r11, r12)     // Catch:{ all -> 0x048c }
            X.04u r2 = r4.A03     // Catch:{ all -> 0x048c }
            r2.add(r6)     // Catch:{ all -> 0x048c }
        L_0x0037:
            r4.A02 = r1     // Catch:{ all -> 0x048c }
            X.C59728JVm.A00(r4)     // Catch:{ all -> 0x048c }
            X.27r r2 = X.27p.A01(r15)     // Catch:{ all -> 0x048c }
            X.283 r2 = r2.A04     // Catch:{ all -> 0x048c }
            java.lang.String r3 = r2.A0L     // Catch:{ all -> 0x048c }
            X.8Yz r2 = r0.A0I     // Catch:{ all -> 0x048c }
            X.80m r2 = r2.A08     // Catch:{ all -> 0x048c }
            r27 = r2
            java.lang.Object r2 = r2.A00     // Catch:{ all -> 0x048c }
            X.4yO r2 = (X.C279284yO) r2     // Catch:{ all -> 0x048c }
            r5 = 1
            X.C360908fL.A01(r15, r2, r3)     // Catch:{ all -> 0x048c }
            r2 = r27
            java.lang.Object r2 = r2.A00     // Catch:{ all -> 0x048c }
            X.4yO r2 = (X.C279284yO) r2     // Catch:{ all -> 0x048c }
            boolean r2 = r2 instanceof X.C363138jC     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x006d
            X.JaN r7 = X.JW1.A00(r15)     // Catch:{ all -> 0x048c }
            X.29E r6 = r7.A0B     // Catch:{ all -> 0x048c }
            long r2 = r7.A00     // Catch:{ all -> 0x048c }
            r4 = 288430453(0x11311975, float:1.3970683E-28)
            long r2 = r6.A02(r4, r2)     // Catch:{ all -> 0x048c }
            r7.A00 = r2     // Catch:{ all -> 0x048c }
        L_0x006d:
            int r2 = r0.A02     // Catch:{ all -> 0x048c }
            if (r2 != r5) goto L_0x0076
            r2 = r28
            r0.A09(r2)     // Catch:{ all -> 0x048c }
        L_0x0076:
            int r3 = r0.A02     // Catch:{ all -> 0x048c }
            r18 = 2
            r2 = r18
            if (r3 != r2) goto L_0x0085
            X.3E6 r3 = r0.A0c     // Catch:{ all -> 0x048c }
            android.app.Activity r2 = r0.A0B     // Catch:{ all -> 0x048c }
            r3.DmJ(r2)     // Catch:{ all -> 0x048c }
        L_0x0085:
            r2 = 3
            r0.A02 = r2     // Catch:{ all -> 0x048c }
            X.9PE r4 = r0.A0S     // Catch:{ all -> 0x048c }
            if (r4 == 0) goto L_0x011c
            X.9PL r3 = r4.A04     // Catch:{ all -> 0x048c }
            java.lang.String r9 = "navigationPerfLogger"
            if (r3 == 0) goto L_0x02f5
            java.lang.String r2 = "fully_visible"
            r3.A0E(r2)     // Catch:{ all -> 0x048c }
            X.0eM r7 = r4.A0J     // Catch:{ all -> 0x048c }
            java.lang.Object r6 = r7.getValue()     // Catch:{ all -> 0x048c }
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6     // Catch:{ all -> 0x048c }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x048c }
            r2 = 36313192573437757(0x8102a80000073d, double:3.027947432707422E-306)
            boolean r3 = X.182.A06(r8, r6, r2)     // Catch:{ all -> 0x048c }
            X.9PL r2 = r4.A04     // Catch:{ all -> 0x048c }
            if (r3 == 0) goto L_0x00b1
            if (r2 == 0) goto L_0x02f5
            goto L_0x00b7
        L_0x00b1:
            if (r2 == 0) goto L_0x02f5
            r2.A0N()     // Catch:{ all -> 0x048c }
            goto L_0x00ba
        L_0x00b7:
            r2.A0M()     // Catch:{ all -> 0x048c }
        L_0x00ba:
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()     // Catch:{ all -> 0x048c }
            boolean r2 = r3 instanceof com.instagram.base.activity.BaseFragmentActivity     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x00c9
            com.instagram.base.activity.BaseFragmentActivity r3 = (com.instagram.base.activity.BaseFragmentActivity) r3     // Catch:{ all -> 0x048c }
            if (r3 == 0) goto L_0x00c9
            r3.A0l(r1)     // Catch:{ all -> 0x048c }
        L_0x00c9:
            java.lang.Object r6 = r7.getValue()     // Catch:{ all -> 0x048c }
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6     // Catch:{ all -> 0x048c }
            X.0qQ.A0B(r6, r1)     // Catch:{ all -> 0x048c }
            r2 = 36323758193192395(0x810c4400032dcb, double:3.034629173184591E-306)
            boolean r2 = X.182.A06(r8, r6, r2)     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x011c
            X.7oG r8 = new X.7oG     // Catch:{ all -> 0x048c }
            r8.<init>(r4)     // Catch:{ all -> 0x048c }
            X.0h9 r6 = r4.mLifecycleRegistry     // Catch:{ all -> 0x048c }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x048c }
            java.lang.Integer r23 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x048c }
            java.lang.Object r3 = r7.getValue()     // Catch:{ all -> 0x048c }
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3     // Catch:{ all -> 0x048c }
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x048c }
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2     // Catch:{ all -> 0x048c }
            X.0wc r21 = X.AnonymousClass0kN.A02(r2)     // Catch:{ all -> 0x048c }
            androidx.fragment.app.FragmentActivity r24 = r4.requireActivity()     // Catch:{ all -> 0x048c }
            r2 = r18
            X.0qQ.A0B(r3, r2)     // Catch:{ all -> 0x048c }
            X.0xx r7 = X.C71772f0.A00(r6)     // Catch:{ all -> 0x048c }
            r25 = 0
            r26 = 14
            X.9KP r6 = new X.9KP     // Catch:{ all -> 0x048c }
            r19 = r6
            r20 = r8
            r22 = r3
            r19.<init>((java.lang.Object) r20, (java.lang.Object) r21, (java.lang.Object) r22, (java.lang.Object) r23, (java.lang.Object) r24, (X.AnonymousClass4D7) r25, (int) r26)     // Catch:{ all -> 0x048c }
            X.19B r3 = X.19B.A00     // Catch:{ all -> 0x048c }
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x048c }
            X.1Eo.A03(r2, r3, r6, r7)     // Catch:{ all -> 0x048c }
        L_0x011c:
            X.4DH r2 = r0.A0E     // Catch:{ all -> 0x048c }
            r19 = r2
            boolean r2 = r2 instanceof X.C60580id     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x0136
            X.2cc r2 = X.C71342cb.A00(r15)     // Catch:{ all -> 0x048c }
            X.8Fl r6 = r0.A0K     // Catch:{ all -> 0x048c }
            r2.A0C(r6)     // Catch:{ all -> 0x048c }
            X.2cc r3 = X.C71342cb.A00(r15)     // Catch:{ all -> 0x048c }
            java.lang.String r2 = "unknown"
            r3.A0E(r2, r6)     // Catch:{ all -> 0x048c }
        L_0x0136:
            X.85X r2 = r0.A0g     // Catch:{ all -> 0x048c }
            r2.A0B = r1     // Catch:{ all -> 0x048c }
            X.AnonymousClass85X.A06(r2)     // Catch:{ all -> 0x048c }
            X.84v r2 = r0.A0k     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x014a
            X.05G r3 = r2.A0e     // Catch:{ all -> 0x048c }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x048c }
            r3.Epw(r2)     // Catch:{ all -> 0x048c }
        L_0x014a:
            X.80U r14 = r0.A0T     // Catch:{ all -> 0x048c }
            boolean r2 = r14.CZU()     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x015b
            X.8Fl r2 = r0.A0K     // Catch:{ all -> 0x048c }
            r2.A0J = r5     // Catch:{ all -> 0x048c }
            X.C352888Fl.A0E(r2, r1)     // Catch:{ all -> 0x048c }
            r0.A07 = r5     // Catch:{ all -> 0x048c }
        L_0x015b:
            X.88F r8 = r0.A0s     // Catch:{ all -> 0x048c }
            if (r8 == 0) goto L_0x0192
            boolean r2 = r8.A0f     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x0192
            java.lang.String r2 = r8.A08     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x0192
            boolean r2 = r8.A0f     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x0192
            r2 = 10
            X.9Km r3 = new X.9Km     // Catch:{ all -> 0x048c }
            r3.<init>(r8, r2)     // Catch:{ all -> 0x048c }
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r8.A0N     // Catch:{ all -> 0x048c }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x048c }
            X.AXr r7 = new X.AXr     // Catch:{ all -> 0x048c }
            r7.<init>(r2, r8, r3)     // Catch:{ all -> 0x048c }
            r8.A01 = r7     // Catch:{ all -> 0x048c }
            X.1NK r6 = X.1NK.A00()     // Catch:{ all -> 0x048c }
            com.instagram.common.typedurl.ImageUrl r3 = r8.A0D     // Catch:{ all -> 0x048c }
            r2 = 0
            X.1OO r2 = r6.A0J(r3, r2)     // Catch:{ all -> 0x048c }
            r2.A0I = r1     // Catch:{ all -> 0x048c }
            r2.A02(r7)     // Catch:{ all -> 0x048c }
            r2.A01()     // Catch:{ all -> 0x048c }
        L_0x0192:
            X.8Hx r2 = r0.A0p     // Catch:{ all -> 0x048c }
            r2.DHC()     // Catch:{ all -> 0x048c }
            X.8D8 r2 = r0.A0o     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x019e
            r2.A07()     // Catch:{ all -> 0x048c }
        L_0x019e:
            X.8Vo r6 = r0.A0q     // Catch:{ all -> 0x048c }
            boolean r2 = r6.A00     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x01ad
            X.8Yz r3 = r6.A01     // Catch:{ all -> 0x048c }
            X.8aL r2 = X.C358088aL.A0C     // Catch:{ all -> 0x048c }
            r3.A0K(r2)     // Catch:{ all -> 0x048c }
            r6.A00 = r1     // Catch:{ all -> 0x048c }
        L_0x01ad:
            X.0eM r2 = r0.A0w     // Catch:{ all -> 0x048c }
            java.lang.Object r8 = r2.getValue()     // Catch:{ all -> 0x048c }
            X.7wL r8 = (X.C347147wL) r8     // Catch:{ all -> 0x048c }
            X.8js r3 = r8.A01     // Catch:{ all -> 0x048c }
            if (r3 != 0) goto L_0x01c2
            com.instagram.common.session.UserSession r2 = r8.A03     // Catch:{ all -> 0x048c }
            X.8js r3 = new X.8js     // Catch:{ all -> 0x048c }
            r3.<init>(r2)     // Catch:{ all -> 0x048c }
            r8.A01 = r3     // Catch:{ all -> 0x048c }
        L_0x01c2:
            java.lang.String r6 = "camera_open_prefetch"
            r3.A06(r6, r5)     // Catch:{ all -> 0x048c }
            X.89T r3 = X.C347157wM.A00(r15)     // Catch:{ all -> 0x048c }
            X.0iw r2 = r0.A0G     // Catch:{ all -> 0x048c }
            java.lang.String r2 = r2.getModuleName()     // Catch:{ all -> 0x048c }
            r3.A00(r2)     // Catch:{ all -> 0x048c }
            boolean r2 = X.C347177wO.A00     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x01ee
            boolean r2 = X.C347177wO.A01     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x01ee
            X.C347177wO.A01 = r5     // Catch:{ all -> 0x048c }
            X.1OP r2 = X.1OP.$redex_init_class     // Catch:{ all -> 0x048c }
            X.1OC r3 = X.1NP.A01(r15)     // Catch:{ all -> 0x048c }
            X.7wS r2 = new X.7wS     // Catch:{ all -> 0x048c }
            r2.<init>(r15)     // Catch:{ all -> 0x048c }
            r3.A00 = r2     // Catch:{ all -> 0x048c }
            X.1ES.A03(r3)     // Catch:{ all -> 0x048c }
        L_0x01ee:
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x048c }
            r2 = 2342155841010009364(0x2081025400020514, double:4.059507851574506E-152)
            boolean r2 = X.182.A06(r7, r15, r2)     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x0268
            r8.A01()     // Catch:{ all -> 0x048c }
            X.7wd r13 = r8.A00     // Catch:{ all -> 0x048c }
            if (r13 != 0) goto L_0x020b
            com.instagram.common.session.UserSession r2 = r8.A03     // Catch:{ all -> 0x048c }
            X.7wd r13 = new X.7wd     // Catch:{ all -> 0x048c }
            r13.<init>(r2)     // Catch:{ all -> 0x048c }
            r8.A00 = r13     // Catch:{ all -> 0x048c }
        L_0x020b:
            com.facebook.common.callercontext.CallerContext r2 = X.C347337we.A00     // Catch:{ all -> 0x048c }
            X.7wf r12 = new X.7wf     // Catch:{ all -> 0x048c }
            r12.<init>()     // Catch:{ all -> 0x048c }
            X.7wg r2 = r12.A01     // Catch:{ all -> 0x048c }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x048c }
            X.2IS r11 = r2.A00     // Catch:{ all -> 0x048c }
            java.lang.String r2 = "ig_story_xpost_upsell"
            r11.A02(r2, r3)     // Catch:{ all -> 0x048c }
            java.util.ArrayList r10 = r12.A02     // Catch:{ all -> 0x048c }
            java.lang.String r2 = "CP_UPSELL_IG_STORY_CROSS_POSTING"
            r10.add(r2)     // Catch:{ all -> 0x048c }
            r12.A00()     // Catch:{ all -> 0x048c }
            com.instagram.common.session.UserSession r9 = r13.A01     // Catch:{ all -> 0x048c }
            X.0Tu r8 = X.0Tu.A06     // Catch:{ all -> 0x048c }
            r16 = 2342156584039352415(0x208103010002085f, double:4.060137877428003E-152)
            r2 = r16
            boolean r2 = X.182.A06(r8, r9, r2)     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x023f
            java.lang.String r2 = "impression_limit_check_enabled"
            r11.A01(r2)     // Catch:{ all -> 0x048c }
        L_0x023f:
            r16 = 2342156584039417952(0x2081030100030860, double:4.0601378774835725E-152)
            r2 = r16
            boolean r2 = X.182.A06(r8, r9, r2)     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x0251
            java.lang.String r2 = "recently_seen_check_enabled"
            r11.A01(r2)     // Catch:{ all -> 0x048c }
        L_0x0251:
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x048c }
            java.lang.Object[] r8 = r10.toArray(r2)     // Catch:{ all -> 0x048c }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ all -> 0x048c }
            boolean r3 = r12.A00     // Catch:{ all -> 0x048c }
            r2 = r18
            X.0qQ.A0B(r8, r2)     // Catch:{ all -> 0x048c }
            X.7wh r2 = new X.7wh     // Catch:{ all -> 0x048c }
            r2.<init>(r13)     // Catch:{ all -> 0x048c }
            X.C347337we.A00(r9, r2, r12, r8, r3)     // Catch:{ all -> 0x048c }
        L_0x0268:
            r2 = 36329723902771492(0x8111b100034124, double:3.038401911944396E-306)
            boolean r2 = X.182.A06(r7, r15, r2)     // Catch:{ all -> 0x048c }
            r8 = 0
            if (r2 == 0) goto L_0x02bf
            X.7wj r9 = new X.7wj     // Catch:{ all -> 0x048c }
            r9.<init>(r0)     // Catch:{ all -> 0x048c }
            r2 = 36326962238732386(0x810f2e00023862, double:3.036655424485737E-306)
            boolean r2 = X.182.A06(r7, r15, r2)     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x02b5
            X.8jd r3 = X.C363388je.A00(r15)     // Catch:{ all -> 0x048c }
            com.facebook.common.callercontext.CallerContext r2 = r0.A0a     // Catch:{ all -> 0x048c }
            r3.A02(r2, r9, r6, r1)     // Catch:{ all -> 0x048c }
        L_0x028d:
            X.7wl r3 = X.C347397wk.A00(r15)     // Catch:{ all -> 0x048c }
            X.05G r2 = r3.A01     // Catch:{ all -> 0x048c }
            r2.Epw(r8)     // Catch:{ all -> 0x048c }
            r3.A00 = r1     // Catch:{ all -> 0x048c }
            X.C347407wl.A00(r3)     // Catch:{ all -> 0x048c }
            X.7wr r2 = X.C347457wq.A00(r15)     // Catch:{ all -> 0x048c }
            r2.A00()     // Catch:{ all -> 0x048c }
            boolean r2 = r14.CZU()     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x03dc
            X.28D r3 = X.28D.A0i     // Catch:{ all -> 0x048c }
            r2 = r28
            if (r2 != r3) goto L_0x0337
            X.8ka r7 = X.C255193tj.A00(r15)     // Catch:{ all -> 0x048c }
            if (r7 == 0) goto L_0x032e
            goto L_0x02ed
        L_0x02b5:
            X.8jd r3 = X.C363388je.A00(r15)     // Catch:{ all -> 0x048c }
            com.facebook.common.callercontext.CallerContext r2 = r0.A0a     // Catch:{ all -> 0x048c }
            r3.A01(r2, r9, r6)     // Catch:{ all -> 0x048c }
            goto L_0x028d
        L_0x02bf:
            r2 = 36326962238732386(0x810f2e00023862, double:3.036655424485737E-306)
            boolean r2 = X.182.A06(r7, r15, r2)     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x02e3
            X.8jd r3 = X.C363388je.A00(r15)     // Catch:{ all -> 0x048c }
            com.facebook.common.callercontext.CallerContext r2 = r0.A0a     // Catch:{ all -> 0x048c }
            r3.A02(r2, r8, r6, r1)     // Catch:{ all -> 0x048c }
        L_0x02d3:
            X.5w9 r2 = X.AnonymousClass5w8.A05     // Catch:{ all -> 0x048c }
            boolean r2 = X.AnonymousClass5w9.A01(r15)     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x028d
            X.5w8 r2 = X.AnonymousClass5w9.A00(r15)     // Catch:{ all -> 0x048c }
            r2.A08(r8)     // Catch:{ all -> 0x048c }
            goto L_0x028d
        L_0x02e3:
            X.8jd r3 = X.C363388je.A00(r15)     // Catch:{ all -> 0x048c }
            com.facebook.common.callercontext.CallerContext r2 = r0.A0a     // Catch:{ all -> 0x048c }
            r3.A01(r2, r8, r6)     // Catch:{ all -> 0x048c }
            goto L_0x02d3
        L_0x02ed:
            if (r4 == 0) goto L_0x0301
            X.9PL r2 = r4.A04     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x02fe
            java.lang.String r9 = "navigationPerfLogger"
        L_0x02f5:
            X.0qQ.A0F(r9)     // Catch:{ all -> 0x048c }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x048b
        L_0x02fe:
            r2.A06()     // Catch:{ all -> 0x048c }
        L_0x0301:
            X.82p r2 = r0.A0L     // Catch:{ all -> 0x048c }
            X.82o r3 = r2.A02     // Catch:{ all -> 0x048c }
            X.82Y r2 = r3.A01     // Catch:{ all -> 0x048c }
            r2.A0L = r5     // Catch:{ all -> 0x048c }
            X.8nd r2 = r7.A02     // Catch:{ all -> 0x048c }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x048c }
            java.lang.String r6 = "Required value was null."
            if (r2 == r1) goto L_0x03c1
            if (r2 != r5) goto L_0x03ca
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x048c }
            r3.A08(r2)     // Catch:{ all -> 0x048c }
            X.8VZ r4 = r0.A0O     // Catch:{ all -> 0x048c }
            X.7zv r3 = r7.A04     // Catch:{ all -> 0x048c }
            if (r3 == 0) goto L_0x0327
            X.8ni r2 = X.C365808ni.A00     // Catch:{ all -> 0x048c }
            r4.A01(r2, r3, r1)     // Catch:{ all -> 0x048c }
            goto L_0x03ca
        L_0x0327:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x048c }
            r0.<init>(r6)     // Catch:{ all -> 0x048c }
            goto L_0x048b
        L_0x032e:
            java.lang.String r3 = "VisibilityController"
            java.lang.String r2 = "entry point is captured media recovery but recovery info is null"
            X.0kD.A07(r3, r2, r8)     // Catch:{ all -> 0x048c }
            goto L_0x03dc
        L_0x0337:
            X.81e r2 = r0.A0N     // Catch:{ all -> 0x048c }
            X.80R r2 = r2.A00     // Catch:{ all -> 0x048c }
            X.28D r2 = r2.A01     // Catch:{ all -> 0x048c }
            boolean r2 = X.C348017xk.A02(r2)     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x0348
            r0.A05()     // Catch:{ all -> 0x048c }
            goto L_0x03dc
        L_0x0348:
            r2 = r27
            java.lang.Object r2 = r2.A00     // Catch:{ all -> 0x048c }
            X.4yO r2 = (X.C279284yO) r2     // Catch:{ all -> 0x048c }
            boolean r2 = r2 instanceof X.AnonymousClass80O     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x03dc
            X.80D r4 = r0.A0M     // Catch:{ all -> 0x048c }
            java.util.ArrayList r2 = r4.A2t     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x036d
            java.util.List r6 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x048c }
        L_0x035c:
            java.util.List r2 = r4.A2x     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x036b
            java.util.List r7 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x048c }
        L_0x0364:
            X.28D r3 = X.28D.A5H     // Catch:{ all -> 0x048c }
            r2 = r28
            if (r2 != r3) goto L_0x0372
            goto L_0x036f
        L_0x036b:
            r7 = 0
            goto L_0x0364
        L_0x036d:
            r6 = 0
            goto L_0x035c
        L_0x036f:
            if (r6 == 0) goto L_0x0390
            goto L_0x0375
        L_0x0372:
            if (r6 == 0) goto L_0x039f
            goto L_0x0389
        L_0x0375:
            int r2 = r6.size()     // Catch:{ all -> 0x048c }
            if (r2 != r5) goto L_0x0390
            java.lang.Object r3 = r6.get(r1)     // Catch:{ all -> 0x048c }
            com.instagram.common.gallery.Medium r3 = (com.instagram.common.gallery.Medium) r3     // Catch:{ all -> 0x048c }
            r2 = r28
            boolean r2 = X.C367268qT.A01(r2, r3, r15)     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x0390
        L_0x0389:
            boolean r2 = r6.isEmpty()     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x03bc
            goto L_0x039f
        L_0x0390:
            X.8nf r2 = X.C365768ne.A0A     // Catch:{ all -> 0x048c }
            X.8ne r2 = r2.A00()     // Catch:{ all -> 0x048c }
            com.instagram.common.gallery.Medium r3 = r2.A03     // Catch:{ all -> 0x048c }
            if (r3 == 0) goto L_0x0372
            X.8BA r2 = r0.A0e     // Catch:{ all -> 0x048c }
            r2.A04 = r3     // Catch:{ all -> 0x048c }
            goto L_0x0372
        L_0x039f:
            if (r7 == 0) goto L_0x03a7
            boolean r2 = r7.isEmpty()     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x03bc
        L_0x03a7:
            boolean r2 = r0.A0x     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x03dc
        L_0x03ab:
            X.0sn r4 = X.0sn.A00     // Catch:{ all -> 0x048c }
            X.8ni r2 = X.C365808ni.A00     // Catch:{ all -> 0x048c }
            X.8VP r3 = new X.8VP     // Catch:{ all -> 0x048c }
            r3.<init>(r2, r4, r8)     // Catch:{ all -> 0x048c }
            X.80T r14 = (X.AnonymousClass80T) r14     // Catch:{ all -> 0x048c }
            X.80W r2 = r14.A02     // Catch:{ all -> 0x048c }
            r2.A04(r3)     // Catch:{ all -> 0x048c }
            goto L_0x03dc
        L_0x03bc:
            boolean r2 = r4.A45     // Catch:{ all -> 0x048c }
            if (r2 != 0) goto L_0x03ab
            goto L_0x03a7
        L_0x03c1:
            X.8VZ r3 = r0.A0O     // Catch:{ all -> 0x048c }
            X.8Cl r2 = r7.A03     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x0486
            r3.A03(r2, r1)     // Catch:{ all -> 0x048c }
        L_0x03ca:
            X.82W r2 = r0.A0F     // Catch:{ all -> 0x048c }
            X.82X r4 = r2.A00()     // Catch:{ all -> 0x048c }
            X.8Vf r2 = r0.A0J     // Catch:{ all -> 0x048c }
            X.7xl r3 = r2.A00()     // Catch:{ all -> 0x048c }
            com.instagram.camera.effect.mq.IgCameraEffectsController r2 = r4.A05     // Catch:{ all -> 0x048c }
            X.82K r2 = r2.A0J     // Catch:{ all -> 0x048c }
            r2.A00 = r3     // Catch:{ all -> 0x048c }
        L_0x03dc:
            X.28D r3 = X.28D.A5B     // Catch:{ all -> 0x048c }
            r2 = r28
            if (r2 != r3) goto L_0x041e
            X.8Fl r2 = r0.A0K     // Catch:{ all -> 0x048c }
            X.7l2 r3 = r2.A06     // Catch:{ all -> 0x048c }
            if (r3 == 0) goto L_0x041b
            boolean r2 = r3.CVP()     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x0423
            X.7rU r2 = r3.A0G     // Catch:{ all -> 0x048c }
            X.7lH r3 = X.C341387mn.A00     // Catch:{ all -> 0x048c }
            X.7qs r2 = r2.A00     // Catch:{ all -> 0x048c }
            X.7qr r2 = (X.C343817qr) r2     // Catch:{ all -> 0x048c }
            X.C343817qr.A01(r2)     // Catch:{ all -> 0x048c }
            X.7qx r2 = r2.A02     // Catch:{ all -> 0x048c }
            X.7qf r4 = r2.A00(r3)     // Catch:{ all -> 0x048c }
            X.7rZ r4 = (X.C344257rZ) r4     // Catch:{ all -> 0x048c }
            X.7mm r4 = (X.C341377mm) r4     // Catch:{ all -> 0x048c }
            X.7ml r4 = (X.C341367ml) r4     // Catch:{ all -> 0x048c }
            X.7r3 r3 = X.C344037rD.A00     // Catch:{ all -> 0x048c }
            X.7qt r2 = r4.A00     // Catch:{ all -> 0x048c }
            X.7r1 r3 = r2.Apf(r3)     // Catch:{ all -> 0x048c }
            X.7rD r3 = (X.C344037rD) r3     // Catch:{ all -> 0x048c }
            java.lang.String r7 = "BasicLoggingNotifier"
            int r2 = r4.hashCode()     // Catch:{ all -> 0x048c }
            long r4 = (long) r2     // Catch:{ all -> 0x048c }
            java.lang.String r6 = "camera_swipe_to_open_finished"
            r3.ChM(r4, r6, r7, r8)     // Catch:{ all -> 0x048c }
        L_0x041b:
            r0.A07()     // Catch:{ all -> 0x048c }
        L_0x041e:
            X.80D r5 = r0.A0M     // Catch:{ all -> 0x048c }
            boolean r2 = r5.A41     // Catch:{ all -> 0x048c }
            goto L_0x0426
        L_0x0423:
            r3.A09 = r5     // Catch:{ all -> 0x048c }
            goto L_0x041b
        L_0x0426:
            if (r2 == 0) goto L_0x0440
            X.81e r2 = r0.A0N     // Catch:{ all -> 0x048c }
            X.80R r2 = r2.A00     // Catch:{ all -> 0x048c }
            X.28D r3 = r2.A01     // Catch:{ all -> 0x048c }
            X.28D r2 = X.28D.A1n     // Catch:{ all -> 0x048c }
            r4 = 10
            if (r3 != r2) goto L_0x0436
            r4 = 16
        L_0x0436:
            android.view.View r3 = r0.A0Z     // Catch:{ all -> 0x048c }
            X.An8 r2 = new X.An8     // Catch:{ all -> 0x048c }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x048c }
            r3.post(r2)     // Catch:{ all -> 0x048c }
        L_0x0440:
            boolean r2 = r5.A40     // Catch:{ all -> 0x048c }
            r5.A40 = r1     // Catch:{ all -> 0x048c }
            if (r2 == 0) goto L_0x0450
            android.view.View r2 = r0.A0Z     // Catch:{ all -> 0x048c }
            X.AjX r1 = new X.AjX     // Catch:{ all -> 0x048c }
            r1.<init>(r0)     // Catch:{ all -> 0x048c }
            r2.post(r1)     // Catch:{ all -> 0x048c }
        L_0x0450:
            com.instagram.avatars.store.AvatarStore r1 = X.25x.A00(r15)     // Catch:{ all -> 0x048c }
            X.27E r1 = r1.A01     // Catch:{ all -> 0x048c }
            X.27H r2 = r1.A00     // Catch:{ all -> 0x048c }
            X.5rf r1 = X.C297385rf.A00     // Catch:{ all -> 0x048c }
            if (r2 == r1) goto L_0x0472
            X.6nw r2 = X.C348197y2.A00(r15)     // Catch:{ all -> 0x048c }
            X.0xx r4 = X.AnonymousClass07a.A00(r19)     // Catch:{ all -> 0x048c }
            r1 = 32
            X.9K3 r3 = new X.9K3     // Catch:{ all -> 0x048c }
            r3.<init>((java.lang.Object) r0, (java.lang.Object) r2, (X.AnonymousClass4D7) r8, (int) r1)     // Catch:{ all -> 0x048c }
            X.19B r2 = X.19B.A00     // Catch:{ all -> 0x048c }
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x048c }
            X.1Eo.A03(r1, r2, r3, r4)     // Catch:{ all -> 0x048c }
        L_0x0472:
            r0.A06()     // Catch:{ all -> 0x048c }
            X.0eK r0 = r0.A0u     // Catch:{ all -> 0x048c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x048c }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x048c }
            if (r0 == 0) goto L_0x0482
            r0.run()     // Catch:{ all -> 0x048c }
        L_0x0482:
            X.0lq.A01()
            return
        L_0x0486:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x048c }
            r0.<init>(r6)     // Catch:{ all -> 0x048c }
        L_0x048b:
            throw r0     // Catch:{ all -> 0x048c }
        L_0x048c:
            r0 = move-exception
            X.0lq.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C356858Vm.A02(X.28D, X.8Vm):void");
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.07Z, X.4DH] */
    public static final void A03(28D r12, C356858Vm r13) {
        Throwable th;
        CameraTool cameraTool;
        boolean z;
        C339307jO A002;
        CameraConfiguration A003;
        0lq.A02("VisibilityController#onQuickCapturePartiallyVisibleImpl");
        try {
            r13.A08 = false;
            r13.A0A = true;
            C3496481e r5 = r13.A0N;
            AnonymousClass80R r8 = r5.A00;
            if (r12 != r8.A01) {
                0f9 AEf = 0wj.A01.AEf(r13.A0G.getModuleName(), 817901356);
                StringBuilder sb = new StringBuilder();
                sb.append("mEntryPoint updated, from ");
                sb.append(r8.A01);
                sb.append(" to ");
                sb.append(r12);
                AEf.ABQ(DialogModule.KEY_MESSAGE, sb.toString());
                AEf.report();
                r5.A00(r12);
            }
            int i = r13.A02;
            if (i == 3) {
                C71342cb.A00(r13.A0H).A08(r13.A0B, r13.A0K);
                AnonymousClass9PE r0 = r13.A0S;
                if (r0 != null) {
                    AnonymousClass9PL r02 = r0.A04;
                    if (r02 == null) {
                        0qQ.A0F("navigationPerfLogger");
                        th = AnonymousClass00P.createAndThrow();
                        throw th;
                    }
                    r02.A08();
                }
            } else if (i == 1) {
                AnonymousClass9PE r03 = r13.A0S;
                if (r03 != null) {
                    r03.A02();
                }
                if (!r13.A05) {
                    r13.A04();
                }
                AnonymousClass80D r52 = r13.A0M;
                if (!r52.A3h) {
                    if (r12.equals(28D.A5B)) {
                        C357638Yz r7 = r13.A0I;
                        C3494680m r11 = r7.A08;
                        AnonymousClass9QA r10 = AnonymousClass9QA.A00;
                        if (!0qQ.A0K((C279284yO) r11.A00, r10)) {
                            if (182.A06(0Tu.A05, r13.A0H, 36326360943179499L)) {
                                A003 = C358098aM.A00(r10, new C358088aL[0]);
                                A003.A00 = true;
                                r7.A0B(r12, A003);
                            }
                        }
                        A003 = C358098aM.A00((C279284yO) r11.A00, new C358088aL[0]);
                        A003.A00 = true;
                        r7.A0B(r12, A003);
                    }
                    r13.A0i.A01();
                }
                r13.A05 = false;
                AnonymousClass82W r3 = r13.A0F;
                AnonymousClass82X A004 = r3.A00();
                C356788Vf r72 = r13.A0J;
                A004.A05.A0J.A00 = r72.A00();
                if (r8.A01 == 28D.A3N) {
                    C357638Yz r2 = r13.A0I;
                    if (r2.A0V(C358088aL.A0C)) {
                        r2.A09();
                    }
                }
                r3.A00().A06(r13.A0j);
                AnonymousClass82X A005 = r3.A00();
                C348027xl A006 = r72.A00();
                0qQ.A0B(A006, 0);
                A005.A05.A0S.add(A006);
                C3496181b r32 = r3.A00().A04;
                C340307l3 r22 = r32.A02;
                C340397lC r04 = r32.A04;
                if (r04 == null || r22 == null) {
                    z = true;
                } else {
                    r04.Dza();
                    r22.Dza();
                    z = false;
                }
                r32.A05 = z;
                C355898Ru r05 = r13.A0l;
                r05.A0H.A00(r05.A0P, r05.A0O);
                AnonymousClass80U r73 = r13.A0T;
                r73.E3H(new Object());
                View view = r13.A0Y;
                view.setVisibility(0);
                view.requestFocus();
                C352888Fl r33 = r13.A0K;
                r33.A17.A09 = true;
                C362048hG A007 = r13.A00();
                if (A007 != null) {
                    A007.A0B = true;
                    A007.A0a.A00 = true;
                }
                AnonymousClass8BA r9 = r13.A0e;
                StoryDraftsCreationViewModel storyDraftsCreationViewModel = r9.A1Q;
                2Fk r23 = storyDraftsCreationViewModel.A01;
                ? r82 = r9.A0s;
                r23.A06(r82, new C346937w0(r9));
                storyDraftsCreationViewModel.A00.A06(r82, new C346957w2(r9));
                r9.A1C.A01.A06(r82, new C346967w3(r9));
                C342887pK r06 = r13.A0n;
                if (!(r06 == null || (A002 = r06.A00()) == null)) {
                    A002.Dzb((C279284yO) r13.A0I.A08.A00);
                }
                if (!r73.CZU() && r13.A07 && r52.A47) {
                    r33.A0J = true;
                    C352888Fl.A0E(r33, false);
                }
                String str = r52.A2p;
                if (str != null) {
                    AnonymousClass8D9 r24 = r13.A0r;
                    AnonymousClass57C r07 = r52.A0A;
                    if (r07 != null) {
                        r24.A01(r07, str);
                    } else {
                        th = new IllegalStateException("Required value was null.");
                        throw th;
                    }
                }
                r13.A0I.A0A();
            }
            r13.A02 = 2;
            if (r13.A00() != null) {
                AnonymousClass80D r34 = r13.A0M;
                if (r34.A2o != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    0qQ.A07(createBitmap);
                    C362048hG A008 = r13.A00();
                    0qQ.A0A(A008);
                    String str2 = r34.A2o;
                    0qQ.A0A(str2);
                    A008.Dnm(createBitmap, str2);
                    r13.A0A = false;
                }
            }
            C356888Vp r25 = r13.A04;
            if (r25 != null) {
                GenAIToolInfoDict genAIToolInfoDict = r13.A0M.A0I;
                if (genAIToolInfoDict != null) {
                    cameraTool = genAIToolInfoDict.A00;
                } else {
                    cameraTool = null;
                }
                if (cameraTool == CameraTool.MEMU_IN_FEED) {
                    1OO A0J2 = 1NK.A00().A0J(new SimpleImageUrl(r25.A06), r13.A0G.getModuleName());
                    A0J2.A02(r13.A0P);
                    A0J2.A01();
                } else if (cameraTool == CameraTool.MEMU_IN_FEED_WITH_MIMICRY) {
                    1Eo.A05(19B.A00, new MH1(r13, (AnonymousClass4D7) null, 7), AnonymousClass07a.A00(r13.A0E));
                }
                r13.A04 = null;
            } else {
                Medium medium = r13.A03;
                if (medium != null) {
                    int i2 = medium.A08;
                    AnonymousClass889 r74 = r13.A0U;
                    if (i2 == 1) {
                        r74.A01(medium);
                    } else {
                        C356848Vl r08 = r74.A02;
                        if (r08 == null) {
                            0qQ.A0F("visibilityControllerComponentProvider");
                            th = AnonymousClass00P.createAndThrow();
                            throw th;
                        } else if (r08.A00().A02 != 1) {
                            r74.A0A.A08(C348017xk.A01(r74.A06));
                            Activity activity = r74.A05;
                            UserSession userSession = r74.A08;
                            AnonymousClass888 r1 = r74.A09;
                            C39658A3y a3y = new C39658A3y(r74);
                            boolean z2 = !AnonymousClass888.A00(r1, "video_import");
                            List singletonList = Collections.singletonList(medium);
                            0qQ.A07(singletonList);
                            C40339AaY aaY = new C40339AaY(a3y);
                            C290815g0 r14 = new C290815g0(new C66091MAy(activity, userSession, singletonList, z2), 468);
                            r14.A00 = new C61671KGv(aaY);
                            1ES.A03(r14);
                        }
                    }
                }
                r13.A03 = null;
            }
            r13.A0A = false;
        } finally {
            0lq.A01();
        }
    }

    public final void A04() {
        String str;
        String str2;
        C59725JVj jVj;
        List list;
        UserSession userSession = this.A0H;
        if (27p.A01(userSession).A04.A0L == null) {
            Activity activity = this.A0B;
            AnonymousClass80D r6 = this.A0M;
            String str3 = r6.A2I;
            String str4 = r6.A2G;
            C3498982i r3 = r6.A18;
            PromptStickerModel promptStickerModel = null;
            if (r3 != null) {
                str = r3.A04.A30();
            } else {
                str = null;
            }
            C3498982i r32 = r6.A18;
            if (r32 != null) {
                str2 = r32.A04.A0C.getLoggingInfoToken();
            } else {
                str2 = null;
            }
            27r A002 = 27p.A00(activity, userSession, str3, str4, str, str2);
            Long l = r6.A2A;
            if (l != null) {
                A002.A04.A0H = l;
            }
            String str5 = r6.A2Z;
            AnonymousClass283 r4 = A002.A04;
            r4.A0R = str5;
            r4.A0S = r6.A2a;
            27p.A01(userSession).A04.A0F = new C358158aS(this);
            27r A012 = 27p.A01(userSession);
            28D r15 = this.A0N.A00.A01;
            String str6 = r6.A2Q;
            String str7 = r6.A2g;
            String str8 = r6.A2b;
            AnonymousClass8ZN r11 = r6.A0C;
            String str9 = r6.A2I;
            String str10 = r6.A2J;
            String str11 = r6.A2K;
            int A003 = AnonymousClass4x3.A00(activity);
            C357638Yz r42 = this.A0I;
            2AL.A01(r42.A08());
            if (this.A0T.CZU()) {
                jVj = C59725JVj.POST_CAPTURE;
            } else {
                jVj = C59725JVj.PRE_CAPTURE;
            }
            C352888Fl r33 = this.A0K;
            C3499482o r2 = this.A0L.A02;
            int i = 2;
            Integer A0N2 = r33.A0N();
            if (A0N2 == null || A0N2.intValue() != 0) {
                i = 1;
            }
            C358178aU A004 = C358168aT.A00(this.A0f);
            AnonymousClass82Y r1 = r2.A01;
            C2801950r r34 = r1.A0g;
            C254743sy r22 = r6.A1J;
            C358088aL r10 = r6.A0X;
            if (r10 != null) {
                list = Collections.singletonList(r10);
                0qQ.A07(list);
            } else {
                list = null;
            }
            PromptStickerModel promptStickerModel2 = r1.A09;
            if (promptStickerModel2 == null) {
                C3499382n r12 = r6.A12;
                if (r12 != null) {
                    promptStickerModel = r12.A01;
                }
            } else {
                promptStickerModel = promptStickerModel2;
            }
            AnonymousClass8ZN r20 = r11;
            28D r17 = r15;
            A012.A16(r17, A004, jVj, r20, r42, r34, r22, promptStickerModel, str6, str7, str8, str9, str10, str11, list, A003, i);
            Class<C264064Ol> cls = C264064Ol.class;
            if (userSession.A00(cls) != null) {
                0wb.A07("ARPlatformLoggerFactory", new IllegalArgumentException("ARPlatformLogger object already exist"));
            }
            userSession.A04(cls, new C264064Ol(userSession));
        }
    }

    public final void A05() {
        short s;
        AnonymousClass8XA A002;
        UserSession userSession = this.A0H;
        02m r2 = 02m.A0p;
        AnonymousClass80U r9 = this.A0T;
        if (!r9.CZe()) {
            C59689JTv.A01(this.A0B, "story_share_intent_while_editing_media_error", 2131974517, 1);
            if (r2.isMarkerOn(18951415)) {
                r2.markerAnnotate(18951415, TraceFieldType.FailureReason, "share_intent_while_editing_media");
                s = 3;
            } else {
                return;
            }
        } else {
            C365768ne A003 = C365768ne.A0A.A00();
            AnonymousClass8WX r0 = (AnonymousClass8WX) this.A0W.get();
            if (!(r0 == null || (A002 = r0.A00()) == null)) {
                A002.A0M(false);
            }
            C3496481e r8 = this.A0N;
            AnonymousClass80R r7 = r8.A00;
            if (r7.A01 != 28D.A5G) {
                r8.A00(28D.A5D);
            }
            this.A09 = true;
            r9.E3H(new Object());
            this.A0L.A02.A08(C348017xk.A01(r7.A01));
            C357038Wf r11 = (C357038Wf) this.A0v.get();
            if (r11 != null) {
                Activity activity = this.A0B;
                List list = A003.A09;
                Medium medium = A003.A03;
                0qQ.A0B(list, 1);
                1ES.A03(new C290815g0(new C59800JYt(activity, medium, userSession, r11, list), 470));
            }
            AnonymousClass8BA r4 = this.A0e;
            r4.A0Y = A003.A08;
            String str = A003.A05;
            if (str != null) {
                AnonymousClass8ME r72 = (AnonymousClass8ME) r4.A1g.get();
                if (str.length() != 0) {
                    UserSession userSession2 = r72.A0r;
                    if (182.A06(0Tu.A05, userSession2, 36320214845038702L)) {
                        r72.A0O = true;
                        C60319JjN.A04(C64876Ljc.A00((C64876Ljc) r72.A1d.get()), new C2802550x(str));
                    } else {
                        Editable newEditable = Editable.Factory.getInstance().newEditable(str);
                        C358868bb A012 = C358878bc.A01("classic", false, false, false, false);
                        0qQ.A0A(newEditable);
                        AnonymousClass91Z.A00(newEditable, A012);
                        Context context = r72.A0f;
                        AnonymousClass91U.A02(context, newEditable, A012);
                        C358938bi r82 = A012.A06;
                        AnonymousClass9UM r5 = new AnonymousClass9UM(context, userSession2, r82.A00(context));
                        Context context2 = r5.A0Z;
                        0qQ.A07(context2);
                        r5.A0A(((float) context2.getResources().getDimensionPixelSize(r82.A05)) * 1.0f);
                        r5.A0L(newEditable);
                        r5.A0I(AnonymousClass91U.A01(AnonymousClass0qo.A00(context2), A012.A05));
                        AnonymousClass91Y.A00((TextView) null, A012, r5);
                        C358948bj.A03(newEditable);
                        r72.AAQ(r5, new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, r82.A02, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false));
                        ((C358368an) r72.A1e.get()).A0b(r5);
                    }
                }
            }
            if (r2.isMarkerOn(18951415)) {
                s = 2;
            } else {
                return;
            }
        }
        r2.markerEnd(18951415, s);
    }

    public final void A06() {
        if (this.A0I.A08.A00 == AnonymousClass9QA.A00 && this.A02 == 3) {
            C361358g6 r3 = C361358g6.A00;
            Activity activity = this.A0B;
            UserSession userSession = this.A0H;
            r3.A00(activity, userSession, 1Au.A00(userSession));
        }
    }

    public final void A07() {
        Activity activity = this.A0B;
        Context applicationContext = activity.getApplicationContext();
        0qQ.A07(applicationContext);
        UserSession userSession = this.A0H;
        if (((Boolean) C342017nu.A00(applicationContext, userSession).A06.getValue()).booleanValue() && this.A0I.A08.A00 == AnonymousClass9QA.A00 && this.A02 == 3 && !1Au.A00(userSession).A01.getBoolean(AnonymousClass000.A00(794), false)) {
            new A99(activity).A00(true);
        }
    }

    public final void A09(28D r3) {
        if (this.A0A) {
            return;
        }
        if (!this.A08 || r3 == 28D.A2T) {
            A03(r3, this);
            return;
        }
        A01();
        this.A0X.post(new C346887vv(r3, this));
    }

    public final /* bridge */ /* synthetic */ void A7M(Parcelable parcelable) {
        VisibilityControllerComponentInterface$State visibilityControllerComponentInterface$State = (VisibilityControllerComponentInterface$State) parcelable;
        if (visibilityControllerComponentInterface$State != null) {
            this.A02 = visibilityControllerComponentInterface$State.A02;
            this.A00 = visibilityControllerComponentInterface$State.A00;
            this.A01 = visibilityControllerComponentInterface$State.A01;
            this.A09 = visibilityControllerComponentInterface$State.A08;
            this.A03 = visibilityControllerComponentInterface$State.A03;
            this.A06 = visibilityControllerComponentInterface$State.A05;
            this.A05 = visibilityControllerComponentInterface$State.A04;
            this.A0A = visibilityControllerComponentInterface$State.A09;
            this.A07 = visibilityControllerComponentInterface$State.A06;
            this.A08 = visibilityControllerComponentInterface$State.A07;
        }
    }

    public final /* bridge */ /* synthetic */ Parcelable ANX() {
        return new VisibilityControllerComponentInterface$State(this.A03, this.A02, this.A00, this.A01, this.A09, this.A06, this.A05, this.A0A, this.A07, this.A08);
    }
}
