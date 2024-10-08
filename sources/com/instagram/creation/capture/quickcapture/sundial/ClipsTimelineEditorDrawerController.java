package com.instagram.creation.capture.quickcapture.sundial;

import X.002;
import X.03t;
import X.05G;
import X.0Tu;
import X.0eP;
import X.0hq;
import X.0kD;
import X.0nA;
import X.0qQ;
import X.182;
import X.19B;
import X.1Eo;
import X.27p;
import X.27r;
import X.293;
import X.2YN;
import X.2cs;
import X.AK4;
import X.AK5;
import X.AfY;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass07a;
import X.AnonymousClass0eK;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fN;
import X.AnonymousClass11O;
import X.AnonymousClass37O;
import X.AnonymousClass4D7;
import X.AnonymousClass4DU;
import X.AnonymousClass5MH;
import X.AnonymousClass5MM;
import X.AnonymousClass80U;
import X.AnonymousClass80V;
import X.AnonymousClass831;
import X.AnonymousClass85R;
import X.AnonymousClass860;
import X.AnonymousClass861;
import X.AnonymousClass883;
import X.AnonymousClass88G;
import X.AnonymousClass88W;
import X.AnonymousClass89Y;
import X.AnonymousClass8A1;
import X.AnonymousClass8A2;
import X.AnonymousClass8BM;
import X.AnonymousClass8BN;
import X.AnonymousClass8IK;
import X.AnonymousClass8M0;
import X.AnonymousClass8M1;
import X.AnonymousClass8R7;
import X.AnonymousClass8RA;
import X.AnonymousClass8RD;
import X.AnonymousClass8RE;
import X.AnonymousClass8RF;
import X.AnonymousClass8RG;
import X.AnonymousClass8RH;
import X.AnonymousClass8RK;
import X.AnonymousClass8RL;
import X.AnonymousClass8RM;
import X.AnonymousClass8RN;
import X.AnonymousClass8RO;
import X.AnonymousClass8RP;
import X.AnonymousClass8RQ;
import X.AnonymousClass8RR;
import X.AnonymousClass8RU;
import X.AnonymousClass8RV;
import X.AnonymousClass8RW;
import X.AnonymousClass8RX;
import X.AnonymousClass8RY;
import X.AnonymousClass8YK;
import X.AnonymousClass9IF;
import X.AnonymousClass9LJ;
import X.AnonymousClass9M5;
import X.C19140WMw;
import X.C227242it;
import X.C252243on;
import X.C270564gw;
import X.C279294yP;
import X.C2801950r;
import X.C306386Ly;
import X.C314446iH;
import X.C318116oQ;
import X.C318136oS;
import X.C319096q2;
import X.C331157Pu;
import X.C3495780x;
import X.C3499482o;
import X.C3499582p;
import X.C3500182v;
import X.C3507085w;
import X.C3507185x;
import X.C3511287r;
import X.C3511387s;
import X.C3515589i;
import X.C352328Cx;
import X.C354868Nr;
import X.C354878Ns;
import X.C355708Ra;
import X.C355718Rb;
import X.C355728Rd;
import X.C355748Rf;
import X.C355758Rg;
import X.C355768Rh;
import X.C355778Ri;
import X.C355788Rj;
import X.C355798Rk;
import X.C355818Rm;
import X.C355828Rn;
import X.C355838Ro;
import X.C355848Rp;
import X.C355858Rq;
import X.C355868Rr;
import X.C355878Rs;
import X.C355888Rt;
import X.C357638Yz;
import X.C358248ab;
import X.C369898vV;
import X.C376429Hy;
import X.C376879Jr;
import X.C376889Js;
import X.C376959Jz;
import X.C377149Ks;
import X.C381529bu;
import X.C388459nr;
import X.C388469ns;
import X.C388489nu;
import X.C388529ny;
import X.C388539nz;
import X.C390839rv;
import X.C390919s3;
import X.C391109sM;
import X.C391959tx;
import X.C40397AbU;
import X.C59725JVj;
import X.C61860pz;
import X.C65079Lmz;
import X.C65080Ln0;
import X.C65081Ln1;
import X.C71662eb;
import X.C71772f0;
import X.K5P;
import X.MG7;
import X.MQQ;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class ClipsTimelineEditorDrawerController implements AnonymousClass4DU, C252243on, AnonymousClass88G, C227242it, AnonymousClass89Y {
    public View A00;
    public FrameLayout A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgImageView A04;
    public C390839rv A05;
    public C314446iH A06;
    public AnonymousClass8RM A07;
    public AnonymousClass8RM A08;
    public C390919s3 A09;
    public AnonymousClass831 A0A;
    public C331157Pu A0B;
    public C19140WMw A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public ViewGroup A0O;
    public FrameLayout A0P;
    public ComposeView A0Q;
    public IgSimpleImageView A0R;
    public IgSimpleImageView A0S;
    public IgSimpleImageView A0T;
    public IgdsMediaButton A0U;
    public IgdsMediaButton A0V;
    public final Context A0W;
    public final ViewGroup A0X;
    public final FragmentActivity A0Y;
    public final 293 A0Z;
    public final UserSession A0a;
    public final TargetViewSizeProvider A0b;
    public final C3499582p A0c;
    public final C3499482o A0d;
    public final AnonymousClass80U A0e;
    public final ClipsAudioMixingDrawerController A0f;
    public final AnonymousClass8RN A0g;
    public final AnonymousClass8A2 A0h;
    public final C3507185x A0i;
    public final ClipsCreationViewModel A0j;
    public final AnonymousClass8BN A0k;
    public final C354878Ns A0l;
    public final C3511387s A0m;
    public final AnonymousClass8RL A0n;
    public final AnonymousClass8RF A0o;
    public final AnonymousClass8M1 A0p;
    public final C2801950r A0q;
    public final AnonymousClass8RD A0r;
    public final C3495780x A0s;
    public final AnonymousClass861 A0t;
    public final List A0u;
    public final Set A0v;
    public final AnonymousClass0eK A0w;
    public final AnonymousClass0eK A0x;
    public final AnonymousClass0eM A0y = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 32));
    public final AnonymousClass0eM A0z;
    public final AnonymousClass0eM A10;
    public final 0hq A11;
    public final C357638Yz A12;
    public final ClipsAssetHubViewModel A13;
    public final AnonymousClass8RA A14;
    public final AnonymousClass8R7 A15;
    public final AnonymousClass8RL A16;
    public final AnonymousClass8RL A17;
    public final C352328Cx A18;
    public final ClipsCreationDraftViewModel A19;
    public final InteractiveDrawableContainer A1A;
    public final AnonymousClass0eM A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public C71662eb drawerContainerViewStubHolder;
    public View postCaptureVideoContainer;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        r10 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.C390839rv r26, X.C390919s3 r27, java.lang.Boolean r28, java.lang.Boolean r29, java.lang.Integer r30, java.lang.String r31, boolean r32, boolean r33) {
        /*
            r25 = this;
            r3 = 0
            r5 = r26
            X.0qQ.A0B(r5, r3)
            r4 = r25
            X.WMw r0 = r4.A0C
            r11 = 0
            if (r0 == 0) goto L_0x0016
            X.0hq r1 = r0.A0E
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r11 = r1.A0P(r0)
        L_0x0016:
            boolean r0 = r11 instanceof X.K5P
            r9 = r27
            if (r0 == 0) goto L_0x0032
            if (r33 == 0) goto L_0x0022
            A0A(r4)
        L_0x0021:
            return
        L_0x0022:
            r4.A09 = r9
            X.WMw r1 = r4.A0C
            if (r1 == 0) goto L_0x0021
            X.8RM r0 = X.AnonymousClass8RM.A09
            float r0 = r0.A00
            r1.A01 = r0
            r1.A03()
            return
        L_0x0032:
            r6 = r32
            r4.A0J = r6
            com.instagram.common.session.UserSession r15 = r4.A0a
            X.AYm r1 = X.C394779yg.A00(r15)
            X.9s5 r0 = X.C390939s5.EDITED_CLIP
            r1.A01(r0)
            r4.A05 = r5
            boolean r8 = r4.A0L()
            X.87s r7 = r4.A0m
            X.9rv r1 = r4.A05
            r7.A07 = r1
            X.9rv r0 = X.C390839rv.POST_CAPTURE
            if (r1 != r0) goto L_0x0062
            X.2Fk r0 = r7.A0H
            java.lang.Object r1 = r0.A02()
            X.8YK r0 = X.AnonymousClass8YK.GALLERY
            if (r1 != r0) goto L_0x0062
            X.8YK r1 = X.AnonymousClass8YK.SELECTED_SEGMENTS_TIMELINE
            X.05G r0 = r7.A0Q
            r0.Epw(r1)
        L_0x0062:
            X.0Tu r12 = X.0Tu.A05
            r0 = 36322306494244923(0x810af20003283b, double:3.033711112924687E-306)
            boolean r10 = X.182.A06(r12, r15, r0)
            r2 = 1
            if (r10 == 0) goto L_0x0133
            boolean r10 = r11 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r10 == 0) goto L_0x0133
            r10 = r11
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r10 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r10
            android.view.View r13 = r10.mView
            if (r13 == 0) goto L_0x0133
            android.view.ViewParent r13 = r13.getParent()
            if (r13 == 0) goto L_0x0133
        L_0x0081:
            X.8A2 r0 = r4.A0h
            X.1QP r7 = r0.A0J
            long r0 = r0.A0A
            X.AE4 r6 = new X.AE4
            r6.<init>(r7)
            r6.A01 = r0
            java.lang.String r0 = "on_reentry"
            r6.A04(r0)
            X.8RM r11 = r4.A07
            X.WMw r0 = r4.A0C
            r9 = 5
            if (r0 == 0) goto L_0x00ad
            X.We4 r0 = r0.A0F
            X.2cs r0 = r0.A03
            if (r0 == 0) goto L_0x012e
            X.2ct r0 = r0.A09
            double r0 = r0.A00
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x012e
        L_0x00ad:
            int r0 = r11.ordinal()
            if (r0 != r9) goto L_0x011d
            X.861 r6 = r4.A0t
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r0)
            X.2Fj r0 = r6.A07
            java.lang.Object r0 = r0.A02()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ce
            r6.A04()
        L_0x00ce:
            r4.A0K(r2)
            A09(r4)
        L_0x00d4:
            X.9rv r0 = X.C390839rv.PRE_CAPTURE
            if (r5 == r0) goto L_0x00f2
            r4.A0K(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1 = r28
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            X.861 r0 = r4.A0t
            X.2Fj r1 = r0.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A0B(r0)
        L_0x00f2:
            java.util.List r5 = r4.A0u
            r5.clear()
            X.831 r0 = r4.A0A
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "segmentStore"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0105:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0115
            X.861 r0 = r4.A0t
            r0.A06(r3)
            goto L_0x00f2
        L_0x0115:
            if (r28 == 0) goto L_0x00f2
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x011d:
            boolean r0 = X.AnonymousClass8IK.A05(r15)
            if (r0 == 0) goto L_0x0126
            A09(r4)
        L_0x0126:
            X.WMw r0 = r4.A0C
            if (r0 == 0) goto L_0x00d4
            r0.A03()
            goto L_0x00d4
        L_0x012e:
            r10.A0T()
            goto L_0x00ad
        L_0x0133:
            boolean r10 = X.182.A06(r12, r15, r0)
            if (r10 != 0) goto L_0x0142
            boolean r10 = r11 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r10 == 0) goto L_0x0142
            r10 = r11
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r10 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r10
            goto L_0x0081
        L_0x0142:
            boolean r10 = r7.A0M()
            if (r10 == 0) goto L_0x0156
            X.WMw r10 = r4.A0C
            if (r10 == 0) goto L_0x014f
            r10.A05(r3)
        L_0x014f:
            X.WMw r10 = r4.A0C
            if (r10 == 0) goto L_0x0156
            r10.A01()
        L_0x0156:
            boolean r10 = r11 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r10 == 0) goto L_0x0183
            boolean r0 = X.182.A06(r12, r15, r0)
            if (r0 == 0) goto L_0x0183
            android.view.View r0 = r11.mView
            if (r0 == 0) goto L_0x016a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x017c
        L_0x016a:
            X.8A2 r0 = r4.A0h
            X.1QP r11 = r0.A0J
            long r0 = r0.A0A
            X.AE4 r10 = new X.AE4
            r10.<init>(r11)
            r10.A01 = r0
            java.lang.String r0 = "unattached"
            r10.A04(r0)
        L_0x017c:
            X.WMw r0 = r4.A0C
            if (r0 == 0) goto L_0x0183
            r0.A02()
        L_0x0183:
            r12 = r30
            A0F(r4, r12, r8, r3, r6)
            if (r8 == 0) goto L_0x019f
            X.WMw r0 = r4.A0C
            if (r0 != 0) goto L_0x019f
            X.8A2 r11 = r4.A0h
            java.lang.String r14 = "FragmentDrawerController null"
            X.1QP r13 = r11.A0J
            long r0 = r11.A0A
            java.lang.String r10 = ""
            r13.flowEndFail(r0, r14, r10)
            r0 = 0
            r11.A0A = r0
        L_0x019f:
            if (r32 == 0) goto L_0x01f7
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            if (r30 == 0) goto L_0x0288
            int r1 = r12.intValue()
        L_0x01ac:
            r0 = 3944(0xf68, float:5.527E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11.putInt(r0, r1)
            X.K7e r10 = new X.K7e
            r10.<init>()
            r10.setArguments(r11)
            X.7Pr r11 = new X.7Pr
            r11.<init>(r15)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r11.A0a = r0
            X.8RM r0 = X.AnonymousClass8RM.A0D
            float r12 = r0.A00
            boolean r1 = r4.A1D
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            if (r1 == 0) goto L_0x01d6
            r0 = 1027101164(0x3d3851ec, float:0.045)
        L_0x01d6:
            float r12 = r12 - r0
            r11.A03 = r12
            r11.A1O = r3
            r11.A11 = r3
            android.content.Context r1 = r4.A0W
            r0 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r0 = r1.getColor(r0)
            r11.A06 = r0
            r11.A0k = r3
            r11.A0q = r2
            r11.A0T = r10
            X.7Pu r0 = r11.A00()
            r4.A0B = r0
            r0.A03(r1, r10)
        L_0x01f7:
            X.WMw r10 = r4.A0C
            if (r10 == 0) goto L_0x00d4
            if (r8 == 0) goto L_0x0255
            X.80x r0 = r4.A0s
            X.80y r1 = X.C3495980z.A00(r15)
            X.0qQ.A0B(r1, r3)
            X.2Fj r0 = r0.A05
            r0.A0B(r1)
            if (r32 == 0) goto L_0x0220
            X.9hw r0 = new X.9hw
            r0.<init>()
        L_0x0212:
            r7 = r32 ^ 1
            android.view.ViewGroup r6 = r10.A0B
            X.Apj r1 = new X.Apj
            r1.<init>(r0, r10, r7)
            r6.post(r1)
            goto L_0x00d4
        L_0x0220:
            X.50r r8 = r4.A0q
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r19 = A03(r4)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r4.A0b
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r4.A19
            X.05G r0 = r0.A0O
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            X.0eM r0 = r4.A0z
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r24 = r0.booleanValue()
            r21 = r31
            r22 = r1
            r23 = r3
            r18 = r9
            r20 = r8
            r17 = r5
            r16 = r7
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = X.C63162KsV.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.8RN r1 = r4.A0g
            r0.A09 = r1
            goto L_0x0275
        L_0x0255:
            boolean r0 = r7.A0M()
            if (r0 == 0) goto L_0x0278
            r4.A0K(r2)
            X.293 r7 = r4.A0Z
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            X.AnonymousClass0Dg.A00(r1, r15)
            java.lang.String r0 = "ARG_CLIPS_TEMPLATE_BROWSER_ENTRY_POINT"
            r1.putSerializable(r0, r7)
            X.9ni r0 = new X.9ni
            r0.<init>()
            r0.setArguments(r1)
        L_0x0275:
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            goto L_0x0212
        L_0x0278:
            r4.A0K(r2)
            X.50r r7 = r4.A0q
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r1 = A03(r4)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r4.A0b
            X.KLz r0 = X.C63163KsW.A00(r15, r0, r5, r1, r7)
            goto L_0x0212
        L_0x0288:
            r1 = 15000(0x3a98, float:2.102E-41)
            goto L_0x01ac
        L_0x028c:
            java.util.ArrayList r0 = r0.A05()
            java.util.Iterator r1 = r0.iterator()
        L_0x0294:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r0 = r1.next()
            X.51M r0 = (X.AnonymousClass51M) r0
            java.lang.String r0 = r0.A0E()
            X.51M r0 = X.LIO.A00(r0)
            r5.add(r0)
            goto L_0x0294
        L_0x02ac:
            X.8RL r1 = r4.A0n
            X.AbT r0 = X.C40396AbT.A00
            r1.A0F(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1 = r29
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0021
            r8 = 0
            X.8RD r5 = r4.A0r
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r4.A0b
            X.JVj r6 = X.C59725JVj.POST_CAPTURE
            r9 = r8
            r10 = r3
            r5.A00(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A0J(X.9rv, X.9s3, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, boolean, boolean):void");
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022f, code lost:
        if (r1 < 0) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        if (r40 >= X.AnonymousClass8RP.DISMISS_DRAWER.A00) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x030e, code lost:
        if ((r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) != false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0322, code lost:
        if (r9 == false) goto L_0x0324;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAw(X.C19140WMw r38, float r39, float r40, float r41) {
        /*
            r37 = this;
            r11 = 0
            r0 = r37
            boolean r1 = r0.A0L()
            r15 = 0
            r10 = 1
            r36 = r38
            r3 = r40
            if (r1 == 0) goto L_0x02c0
            r1 = r36
            X.0hq r1 = r1.A0E
            r12 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r7 = r1.A0P(r12)
            boolean r1 = r7 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x01a9
            double r8 = (double) r3
            boolean r1 = A0I(r0)
            if (r1 == 0) goto L_0x01a5
            X.8RM r1 = X.AnonymousClass8RM.A0B
            float r1 = r1.A00
            double r1 = (double) r1
        L_0x002c:
            X.8RM r4 = X.AnonymousClass8RM.A09
            float r4 = r4.A00
            double r4 = (double) r4
            r22 = 0
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = r8
            r18 = r1
            r20 = r4
            double r1 = X.AnonymousClass37Q.A04(r16, r18, r20, r22, r24)
            float r4 = (float) r1
            float r6 = X.C229632nm.A02(r4, r15, r6)
            boolean r1 = r0.A0K
            if (r1 != 0) goto L_0x0052
            X.8RP r1 = X.AnonymousClass8RP.DISMISS_DRAWER
            float r1 = r1.A00
            int r1 = (r40 > r1 ? 1 : (r40 == r1 ? 0 : -1))
            r16 = 1
            if (r1 < 0) goto L_0x0054
        L_0x0052:
            r16 = 0
        L_0x0054:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r7 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r7
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r7.A0F
            if (r2 == 0) goto L_0x01a1
            X.MXL r1 = r2.A0B
            r1.DAv(r6)
            android.view.View r1 = r2.borderLine
            if (r1 == 0) goto L_0x019d
            r1.setAlpha(r6)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A0O()
            r1.setAlpha(r6)
            double r1 = (double) r6
            r28 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            r26 = r1
            r30 = r24
            r32 = r22
            r34 = r24
            double r4 = X.AnonymousClass37Q.A04(r26, r28, r30, r32, r34)
            float r8 = (float) r4
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r7.A0G
            if (r4 != 0) goto L_0x008e
            java.lang.String r8 = "actionBarViewController"
        L_0x0086:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008e:
            com.instagram.creation.capture.quickcapture.sundial.edit.views.ClipsTimelineConstraintLayout r4 = r4.actionBarContainer
            if (r4 == 0) goto L_0x0095
            r4.setAlpha(r8)
        L_0x0095:
            X.8RF r4 = r7.A0d
            if (r4 != 0) goto L_0x009c
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            goto L_0x0086
        L_0x009c:
            X.8RH r4 = r4.A0E()
            boolean r4 = r4 instanceof X.C355878Rs
            if (r4 == 0) goto L_0x00ca
            java.lang.String r8 = "stackedTimelineViewModel"
            int r5 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            X.Jfo r4 = r7.A0h
            if (r5 > 0) goto L_0x017c
            if (r4 == 0) goto L_0x0086
            X.05G r14 = r4.A0a
            java.lang.Object r4 = r14.getValue()
            X.Jvy r4 = (X.C61060Jvy) r4
            boolean r13 = r4.A03
            java.lang.Object r9 = r4.A01
            java.lang.Integer r9 = (java.lang.Integer) r9
            boolean r8 = r4.A04
            r5 = 0
        L_0x00bf:
            X.0qQ.A0B(r9, r10)
            X.Jvy r4 = new X.Jvy
            r4.<init>((java.lang.Integer) r9, (boolean) r13, (boolean) r5, (boolean) r8)
            r14.Epw(r4)
        L_0x00ca:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r8 = r7.A0L
            if (r8 == 0) goto L_0x012d
            r4 = 2
            int[] r5 = new int[r4]
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r4 = r7.A0F
            if (r4 == 0) goto L_0x01a1
            android.view.View r4 = r4.borderLine
            if (r4 == 0) goto L_0x019d
            r4.getLocationInWindow(r5)
            r9 = r5[r10]
            boolean r4 = r8.A09
            if (r4 == 0) goto L_0x012d
            android.view.ViewGroup r7 = r8.A0C
            android.view.ViewParent r5 = r7.getParent()
            boolean r4 = r5 instanceof android.view.View
            if (r4 == 0) goto L_0x017a
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x017a
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r4 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x017a
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            if (r5 == 0) goto L_0x017a
            int r5 = r5.topMargin
        L_0x00fe:
            int r4 = r7.getHeight()
            int r4 = r4 - r9
            int r4 = r4 + r5
            float r5 = (float) r4
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r5 = r5 / r4
            r8.A02 = r5
            X.Jfl r4 = r8.A0F
            X.0Ud r4 = r4.A0G
            java.lang.Object r5 = r4.getValue()
            X.Kg8 r4 = X.C62458Kg8.EXPANDED
            if (r5 != r4) goto L_0x012d
            java.util.List r4 = r8.A08
            int r4 = r4.size()
            if (r4 != r10) goto L_0x0174
            java.util.List r5 = r8.A08
            X.KiB r4 = X.C62578KiB.PEEK
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x0174
            if (r16 != 0) goto L_0x0174
        L_0x012d:
            android.view.View r4 = r0.A0N
            if (r4 == 0) goto L_0x0134
            r4.setAlpha(r6)
        L_0x0134:
            android.widget.FrameLayout r8 = r0.A01
            if (r8 == 0) goto L_0x0142
            r4 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r4 = java.lang.Math.pow(r1, r4)
            float r7 = (float) r4
            r8.setAlpha(r7)
        L_0x0142:
            android.widget.FrameLayout r7 = r0.A0P
            if (r7 == 0) goto L_0x0169
            r4 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r1 = java.lang.Math.pow(r1, r4)
            float r4 = (float) r1
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x0166
            r1 = 1050253722(0x3e99999a, float:0.3)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0166
            float r1 = r7.getAlpha()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0166
            float r4 = r7.getAlpha()
        L_0x0166:
            r7.setAlpha(r4)
        L_0x0169:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r0.A0T
            if (r1 == 0) goto L_0x01db
            r1.setVisibility(r11)
            r1.setAlpha(r6)
            goto L_0x01db
        L_0x0174:
            float r4 = r8.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController.A01(r8, r4, r11)
            goto L_0x012d
        L_0x017a:
            r5 = 0
            goto L_0x00fe
        L_0x017c:
            if (r4 == 0) goto L_0x0086
            X.05G r14 = r4.A0a
            java.lang.Object r4 = r14.getValue()
            X.Jvy r4 = (X.C61060Jvy) r4
            java.lang.Object r5 = r4.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r5 == r4) goto L_0x00ca
            java.lang.Object r4 = r14.getValue()
            X.Jvy r4 = (X.C61060Jvy) r4
            boolean r13 = r4.A03
            java.lang.Object r9 = r4.A01
            java.lang.Integer r9 = (java.lang.Integer) r9
            boolean r8 = r4.A04
            r5 = 1
            goto L_0x00bf
        L_0x019d:
            java.lang.String r8 = "borderLine"
            goto L_0x0086
        L_0x01a1:
            java.lang.String r8 = "viewController"
            goto L_0x0086
        L_0x01a5:
            r1 = 0
            goto L_0x002c
        L_0x01a9:
            boolean r1 = r7 instanceof X.K5P
            if (r1 == 0) goto L_0x01db
            X.8RP r1 = X.AnonymousClass8RP.SWITCH_TIMELINE_FRAGMENTS
            float r2 = r1.A00
            double r7 = (double) r3
            X.8RM r1 = X.AnonymousClass8RM.A0B
            float r1 = r1.A00
            double r4 = (double) r1
            double r1 = (double) r2
            r22 = 0
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = r7
            r18 = r4
            r20 = r1
            double r1 = X.AnonymousClass37Q.A04(r16, r18, r20, r22, r24)
            float r4 = (float) r1
            float r1 = X.C229632nm.A02(r4, r15, r6)
            android.widget.FrameLayout r7 = r0.A01
            if (r7 == 0) goto L_0x01db
            double r4 = (double) r1
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r1 = java.lang.Math.pow(r4, r1)
            float r4 = (float) r1
            float r6 = r6 - r4
            r7.setAlpha(r6)
        L_0x01db:
            boolean r1 = A0I(r0)
            if (r1 == 0) goto L_0x02c0
            X.WMw r8 = r0.A0C
            if (r8 == 0) goto L_0x0215
            X.8RP r1 = X.AnonymousClass8RP.SWITCH_TIMELINE_FRAGMENTS
            float r2 = r1.A00
            int r1 = (r40 > r2 ? 1 : (r40 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x04c4
            X.8RM r1 = X.AnonymousClass8RM.A0B
            float r1 = r1.A00
            double r6 = (double) r3
            double r4 = (double) r1
            double r1 = (double) r2
            r22 = 0
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = r6
            r18 = r4
            r20 = r1
            double r20 = X.AnonymousClass37Q.A04(r16, r18, r20, r22, r24)
            double r22 = X.C229632nm.A00(r20, r22, r24)
            r26 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r1 = X.AnonymousClass37Q.A03(r22, r24, r26)
        L_0x020f:
            float r4 = (float) r1
            android.view.ViewGroup r1 = r8.A0C
            r1.setAlpha(r4)
        L_0x0215:
            X.WMw r1 = r0.A0C
            r5 = 0
            if (r1 == 0) goto L_0x04c1
            X.0hq r1 = r1.A0E
            androidx.fragment.app.Fragment r4 = r1.A0P(r12)
        L_0x0220:
            X.8RP r1 = X.AnonymousClass8RP.SWITCH_TIMELINE_FRAGMENTS
            float r6 = r1.A00
            X.8RM r1 = X.AnonymousClass8RM.A0B
            float r2 = r1.A00
            int r1 = (r40 > r6 ? 1 : (r40 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0231
            int r1 = (r40 > r2 ? 1 : (r40 == r2 ? 0 : -1))
            r2 = 1
            if (r1 >= 0) goto L_0x0232
        L_0x0231:
            r2 = 0
        L_0x0232:
            boolean r1 = r0.A0E
            if (r1 != 0) goto L_0x0293
            if (r2 == 0) goto L_0x023c
            boolean r1 = r4 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r1 != 0) goto L_0x0244
        L_0x023c:
            int r1 = (r40 > r6 ? 1 : (r40 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0293
            boolean r1 = r4 instanceof X.K5P
            if (r1 == 0) goto L_0x0293
        L_0x0244:
            boolean r1 = r0.A0G
            if (r1 != 0) goto L_0x0293
            X.WMw r1 = r0.A0C
            r6 = 0
            if (r1 == 0) goto L_0x04be
            X.0hq r1 = r1.A0E
            androidx.fragment.app.Fragment r2 = r1.A0P(r12)
        L_0x0253:
            boolean r1 = r2 instanceof X.K5P
            if (r1 == 0) goto L_0x0489
            X.WMw r7 = r0.A0C
            if (r7 == 0) goto L_0x028b
            X.9rv r18 = X.C390839rv.POST_CAPTURE
            X.50r r8 = r0.A0q
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r20 = A03(r0)
            X.9s3 r4 = r0.A09
            com.instagram.common.session.UserSession r2 = r0.A0a
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r0.A0b
            r22 = 0
            r23 = r22
            r24 = r10
            r25 = r11
            r16 = r2
            r17 = r1
            r19 = r4
            r21 = r8
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = X.C63162KsV.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.8RN r1 = r0.A0g
            r4.A09 = r1
            android.view.ViewGroup r2 = r7.A0B
            X.AoC r1 = new X.AoC
            r1.<init>(r4, r7)
            r2.post(r1)
        L_0x028b:
            r0.A09 = r6
        L_0x028d:
            boolean r1 = r0.A0I
            r1 = r1 ^ 1
            r0.A0G = r1
        L_0x0293:
            X.WMw r6 = r0.A0C
            if (r6 == 0) goto L_0x0299
            java.lang.Integer r5 = r6.A07
        L_0x0299:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r5 != r1) goto L_0x02c0
            if (r6 == 0) goto L_0x02c0
            androidx.fragment.app.FragmentActivity r1 = r0.A0Y
            float r5 = X.AnonymousClass8RO.A01(r1, r3)
            android.content.Context r1 = r0.A0W
            boolean r4 = r0.A0L()
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r4 == 0) goto L_0x02b7
            r1 = 2131165230(0x7f07002e, float:1.7944671E38)
        L_0x02b7:
            int r1 = r2.getDimensionPixelSize(r1)
            float r1 = (float) r1
            r6.A05 = r5
            r6.A04 = r1
        L_0x02c0:
            r1 = r36
            X.We4 r1 = r1.A0F
            X.2cs r1 = r1.A03
            if (r1 != 0) goto L_0x0484
            r4 = 0
        L_0x02c9:
            int r1 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x040f
            r4 = 8
            boolean r1 = A0I(r0)
            if (r1 == 0) goto L_0x0377
            r5 = 0
            r0.A0G = r11
            r0.A0E = r11
            X.2eb r1 = r0.drawerContainerViewStubHolder
            if (r1 == 0) goto L_0x0377
            android.view.View r1 = r1.A01()
            if (r1 == 0) goto L_0x0377
            r6 = 2131433135(0x7f0b16af, float:1.8488047E38)
            android.view.View r10 = r1.requireViewById(r6)
            X.0qQ.A07(r10)
            android.view.View r8 = r0.postCaptureVideoContainer
            if (r8 == 0) goto L_0x0377
            X.WMw r1 = r0.A0C
            r2 = 0
            if (r1 == 0) goto L_0x040c
            X.0hq r1 = r1.A0E
            androidx.fragment.app.Fragment r1 = r1.A0P(r6)
        L_0x02fd:
            boolean r1 = r1 instanceof X.K5P
            if (r1 != 0) goto L_0x0310
            X.WMw r1 = r0.A0C
            if (r1 == 0) goto L_0x030b
            X.0hq r1 = r1.A0E
            androidx.fragment.app.Fragment r2 = r1.A0P(r6)
        L_0x030b:
            boolean r1 = r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            r9 = 0
            if (r1 == 0) goto L_0x0311
        L_0x0310:
            r9 = 1
        L_0x0311:
            X.8RM r1 = X.AnonymousClass8RM.A0B
            float r6 = r1.A00
            X.8RM r1 = X.AnonymousClass8RM.A0C
            float r2 = r1.A00
            int r1 = (r40 > r6 ? 1 : (r40 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0324
            int r1 = (r40 > r2 ? 1 : (r40 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0324
            r7 = 1
            if (r9 != 0) goto L_0x0325
        L_0x0324:
            r7 = 0
        L_0x0325:
            android.view.ViewGroup r2 = r0.A0X
            r1 = 2131433235(0x7f0b1713, float:1.848825E38)
            android.view.View r6 = r2.requireViewById(r1)
            X.0qQ.A07(r6)
            if (r7 == 0) goto L_0x0408
            int r9 = r6.getHeight()
            if (r9 != 0) goto L_0x0342
            android.content.Context r2 = r0.A0W
            r1 = 36
            float r1 = X.0nA.A04(r2, r1)
            int r9 = (int) r1
        L_0x0342:
            float r7 = r10.getTranslationY()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r1 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0405
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L_0x0405
            int r1 = r2.bottomMargin
        L_0x0354:
            int r9 = r9 + r1
            float r1 = (float) r9
            float r7 = r7 - r1
            r6.setTranslationY(r7)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r8.getScaleX()
            float r2 = r2 - r1
            float r2 = -r2
            int r1 = r8.getWidth()
            float r1 = (float) r1
            float r2 = r2 * r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            r6.setTranslationX(r2)
        L_0x036e:
            int r1 = r6.getVisibility()
            if (r1 == r5) goto L_0x0377
            r6.setVisibility(r5)
        L_0x0377:
            X.8RF r5 = r0.A0o
            X.8RH r1 = r5.A0E()
            boolean r1 = r1 instanceof X.AnonymousClass8RU
            if (r1 == 0) goto L_0x03bb
            X.8RM r2 = r0.A07
            X.8RM r1 = X.AnonymousClass8RM.A09
            if (r2 != r1) goto L_0x03bb
        L_0x0387:
            com.instagram.common.session.UserSession r1 = r0.A0a
            X.2cc r3 = X.C71342cb.A00(r1)
            androidx.fragment.app.FragmentActivity r1 = r0.A0Y
            r3.A06(r1)
            X.0iw r2 = X.AnonymousClass6WL.A01(r1)
            if (r2 == 0) goto L_0x039c
            r1 = 0
            X.2cc.A01(r3, r2, r1)
        L_0x039c:
            boolean r1 = r0.A0L()
            if (r1 == 0) goto L_0x03ba
            android.view.ViewGroup r2 = r0.A0O
            if (r2 == 0) goto L_0x03ab
            android.view.View r1 = r0.A0N
            r2.removeView(r1)
        L_0x03ab:
            X.8RM r2 = r0.A07
            X.8RM r1 = X.AnonymousClass8RM.A08
            if (r2 == r1) goto L_0x03ba
            android.view.ViewGroup r1 = r0.A0O
            if (r1 == 0) goto L_0x03ba
            android.view.View r0 = r0.A0N
            r1.addView(r0)
        L_0x03ba:
            return
        L_0x03bb:
            int r1 = (r40 > r15 ? 1 : (r40 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x0387
            boolean r1 = r0.A0K
            if (r1 != 0) goto L_0x0387
            boolean r1 = r0.A0H
            if (r1 != 0) goto L_0x0387
            X.8RM r2 = r0.A07
            X.8RM r1 = X.AnonymousClass8RM.A06
            if (r2 == r1) goto L_0x0387
            X.8RH r3 = r5.A0E()
            X.WMw r1 = r0.A0C
            if (r1 == 0) goto L_0x0403
            X.0hq r2 = r1.A0E
            r1 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r1 = r2.A0P(r1)
        L_0x03de:
            boolean r1 = r1 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r1 == 0) goto L_0x0387
            android.widget.FrameLayout r2 = r0.A01
            if (r2 == 0) goto L_0x03f1
            boolean r1 = r3 instanceof X.C355808Rl
            if (r1 != 0) goto L_0x03ee
            int r4 = A01(r0, r3)
        L_0x03ee:
            r2.setVisibility(r4)
        L_0x03f1:
            X.0Ud r1 = r5.A0A
            java.lang.Object r1 = r1.getValue()
            X.9IZ r1 = (X.AnonymousClass9IZ) r1
            java.lang.Object r2 = r1.A00
            X.8RH r2 = (X.AnonymousClass8RH) r2
            boolean r1 = r1.A01
            A0E(r0, r2, r1)
            goto L_0x0387
        L_0x0403:
            r1 = 0
            goto L_0x03de
        L_0x0405:
            r1 = 0
            goto L_0x0354
        L_0x0408:
            r5 = 8
            goto L_0x036e
        L_0x040c:
            r1 = r2
            goto L_0x02fd
        L_0x040f:
            boolean r1 = r0.A0L()
            if (r1 == 0) goto L_0x03ba
            X.8RM r2 = r0.A08
            boolean r1 = A0I(r0)
            if (r1 == 0) goto L_0x0462
            X.8RP r1 = X.AnonymousClass8RP.SWITCH_TIMELINE_FRAGMENTS
            float r1 = r1.A00
            int r1 = (r40 > r1 ? 1 : (r40 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0454
            X.8RM r1 = X.AnonymousClass8RM.A0B
        L_0x0427:
            r0.A08 = r1
            android.view.ViewGroup r4 = r0.A0X
            r1 = 2131433235(0x7f0b1713, float:1.848825E38)
            android.view.View r5 = r4.requireViewById(r1)
            X.0qQ.A07(r5)
            r4 = 8
            int r1 = r5.getVisibility()
            if (r1 == r4) goto L_0x0440
            r5.setVisibility(r4)
        L_0x0440:
            int r1 = (r39 > r40 ? 1 : (r39 == r40 ? 0 : -1))
            if (r1 == 0) goto L_0x03ba
            X.8RM r1 = r0.A08
            if (r2 == r1) goto L_0x03ba
            boolean r1 = r0.A0I
            if (r1 == 0) goto L_0x03ba
            android.view.View r0 = r0.postCaptureVideoContainer
            if (r0 == 0) goto L_0x03ba
            r0.performHapticFeedback(r10)
            return
        L_0x0454:
            X.8RP r1 = X.AnonymousClass8RP.GO_LARGE
            float r1 = r1.A00
            int r1 = (r40 > r1 ? 1 : (r40 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x045f
            X.8RM r1 = X.AnonymousClass8RM.A09
            goto L_0x0427
        L_0x045f:
            X.8RM r1 = X.AnonymousClass8RM.A0C
            goto L_0x0427
        L_0x0462:
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x0481
            X.8RP r1 = X.AnonymousClass8RP.SWIPE_TO_ENTER_TIMELINE_MIN_PREVIEW_PERCENTAGE
        L_0x0468:
            float r1 = r1.A00
            int r1 = (r40 > r1 ? 1 : (r40 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0473
            X.8RM r1 = X.AnonymousClass8RM.A08
        L_0x0470:
            r0.A08 = r1
            goto L_0x0440
        L_0x0473:
            X.8RP r1 = X.AnonymousClass8RP.GO_LARGE
            float r1 = r1.A00
            int r1 = (r40 > r1 ? 1 : (r40 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x047e
            X.8RM r1 = X.AnonymousClass8RM.A09
            goto L_0x0470
        L_0x047e:
            X.8RM r1 = X.AnonymousClass8RM.A0C
            goto L_0x0470
        L_0x0481:
            X.8RP r1 = X.AnonymousClass8RP.DISMISS_DRAWER
            goto L_0x0468
        L_0x0484:
            double r1 = r1.A01
            float r4 = (float) r1
            goto L_0x02c9
        L_0x0489:
            boolean r1 = r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r1 == 0) goto L_0x028d
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r1 = r2.A0L
            if (r1 == 0) goto L_0x0496
            r1.A03(r10)
        L_0x0496:
            X.WMw r6 = r0.A0C
            if (r6 == 0) goto L_0x028d
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0b
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1 = 866(0x362, float:1.214E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putParcelable(r1, r4)
            X.K5P r4 = new X.K5P
            r4.<init>()
            r4.setArguments(r2)
            android.view.ViewGroup r2 = r6.A0B
            X.AoC r1 = new X.AoC
            r1.<init>(r4, r6)
            r2.post(r1)
            goto L_0x028d
        L_0x04be:
            r2 = r6
            goto L_0x0253
        L_0x04c1:
            r4 = r5
            goto L_0x0220
        L_0x04c4:
            X.8RM r1 = X.AnonymousClass8RM.A09
            float r1 = r1.A00
            double r6 = (double) r3
            double r4 = (double) r2
            double r1 = (double) r1
            r22 = 0
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = r6
            r18 = r4
            r20 = r1
            double r20 = X.AnonymousClass37Q.A04(r16, r18, r20, r22, r24)
            double r20 = X.C229632nm.A00(r20, r22, r24)
            r22 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r1 = X.AnonymousClass37Q.A03(r20, r22, r24)
            goto L_0x020f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.DAw(X.WMw, float, float, float):void");
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final /* synthetic */ void DdI(Drawable drawable, int i, boolean z) {
    }

    public final /* synthetic */ void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r6 == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dkv(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r7 = 0
            X.87s r5 = r8.A0m
            X.4gw r1 = r5.A04
            r0 = 0
            if (r1 == 0) goto L_0x0009
            r0 = 1
        L_0x0009:
            r3 = 1
            if (r0 == 0) goto L_0x0013
            boolean r0 = r5.A0J()
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            return r3
        L_0x0013:
            android.view.View r0 = r8.postCaptureVideoContainer
            if (r0 == 0) goto L_0x0061
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.getGlobalVisibleRect(r2)
            float r0 = r9.getRawX()
            int r1 = (int) r0
            float r0 = r9.getRawY()
            int r0 = (int) r0
            boolean r6 = r2.contains(r1, r0)
        L_0x002d:
            boolean r0 = r8.A0L()
            if (r0 == 0) goto L_0x006f
            X.WMw r0 = r8.A0C
            if (r0 == 0) goto L_0x005f
            X.0hq r1 = r0.A0E
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
        L_0x0040:
            boolean r0 = r1 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x006f
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r4 = r1.A0L
            if (r4 == 0) goto L_0x006c
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x006c
            X.2cs r0 = r4.A05
            X.2ct r0 = r0.A09
            double r0 = r0.A00
            float r2 = (float) r0
            float r1 = r4.A02
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0063
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController.A01(r4, r1, r3)
            return r3
        L_0x005f:
            r1 = 0
            goto L_0x0040
        L_0x0061:
            r6 = 1
            goto L_0x002d
        L_0x0063:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            r4.A03(r3)
            return r3
        L_0x006c:
            if (r6 != 0) goto L_0x0072
            return r3
        L_0x006f:
            if (r6 != 0) goto L_0x0072
        L_0x0071:
            return r7
        L_0x0072:
            boolean r0 = r8.A0L()
            if (r0 == 0) goto L_0x00bb
            X.80U r5 = r8.A0e
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r5.CQ0(r0)
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r8.ABA()
            if (r0 == 0) goto L_0x00ca
            com.instagram.common.session.UserSession r4 = r8.A0a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322306494375997(0x810af20005283d, double:3.033711113007579E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00a7
            X.WMw r0 = r8.A0C
            if (r0 == 0) goto L_0x00ca
            X.We4 r0 = r0.A0F
            X.2cs r0 = r0.A03
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.A0C()
            if (r0 != r3) goto L_0x00ca
        L_0x00a7:
            boolean r0 = A0I(r8)
            if (r0 == 0) goto L_0x0112
            X.WMw r1 = r8.A0C
            if (r1 == 0) goto L_0x0012
            X.8RM r0 = X.AnonymousClass8RM.A0B
            float r0 = r0.A00
            r1.A01 = r0
            r1.A03()
            return r3
        L_0x00bb:
            X.4gw r0 = r5.A04
            if (r0 == 0) goto L_0x0071
            X.9rv r1 = r8.A05
            X.9rv r0 = X.C390839rv.MID_CAPTURE
            if (r1 != r0) goto L_0x0071
            X.9rv r0 = X.C390839rv.POST_CAPTURE
            r8.A05 = r0
            return r7
        L_0x00ca:
            X.80V r0 = X.AnonymousClass80V.MEDIA_EDIT
            boolean r0 = r5.CQ0(r0)
            if (r0 == 0) goto L_0x0012
            boolean r0 = A0I(r8)
            if (r0 == 0) goto L_0x0012
            X.861 r2 = r8.A0t
            X.2Fj r0 = r2.A0A
            java.lang.Object r1 = r0.A02()
            X.8YU r0 = X.AnonymousClass8YU.PLAYING
            if (r1 != r0) goto L_0x0101
            r2.A01()
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r8.A04
            if (r2 == 0) goto L_0x00f7
            android.content.Context r1 = r8.A0W
            r0 = 2131238615(0x7f081ed7, float:1.8093514E38)
        L_0x00f0:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setImageDrawable(r0)
        L_0x00f7:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r8.A04
            if (r2 == 0) goto L_0x0012
            r0 = 250(0xfa, double:1.235E-321)
            X.C294975nL.A02(r2, r0)
            return r3
        L_0x0101:
            X.8YU r0 = X.AnonymousClass8YU.PAUSED
            if (r1 != r0) goto L_0x00f7
            r2.A03()
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r8.A04
            if (r2 == 0) goto L_0x00f7
            android.content.Context r1 = r8.A0W
            r0 = 2131238650(0x7f081efa, float:1.8093585E38)
            goto L_0x00f0
        L_0x0112:
            A06(r8)
            A0G(r8, r3, r3)
            X.27r r0 = X.27p.A01(r4)
            r0.A0h()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.Dkv(android.view.MotionEvent):boolean");
    }

    public final void DlC(Drawable drawable, int i, float f, float f2) {
        Fragment fragment;
        0qQ.A0B(drawable, 1);
        if (drawable instanceof AnonymousClass5MH) {
            drawable = ((AnonymousClass5MH) drawable).A0A;
        }
        C19140WMw wMw = this.A0C;
        if (wMw != null) {
            fragment = wMw.A0E.A0P(R.id.fragment_container);
        } else {
            fragment = null;
        }
        if (!(fragment instanceof K5P)) {
            return;
        }
        if (((drawable instanceof C306386Ly) || (drawable instanceof AnonymousClass5MM)) && !(drawable instanceof C369898vV)) {
            FrameLayout frameLayout = this.A01;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            C19140WMw wMw2 = this.A0C;
            if (wMw2 != null) {
                wMw2.A0F.A02 = 0.0f;
            }
            A0D(this, AnonymousClass8RM.A07);
        }
    }

    public final /* synthetic */ void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    public final /* synthetic */ void Dsb() {
    }

    public final boolean EsU(MotionEvent motionEvent) {
        InteractiveDrawableContainer interactiveDrawableContainer;
        C19140WMw wMw;
        Matrix matrix;
        0qQ.A0B(motionEvent, 0);
        if (this.A0p.A0G() || (interactiveDrawableContainer = this.A1A) == null || (wMw = this.A0C) == null || (matrix = wMw.A0A.getMatrix()) == null) {
            return false;
        }
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        float[] fArr = {motionEvent.getX(), motionEvent.getY()};
        matrix2.mapPoints(fArr);
        if (motionEvent.getAction() == 0) {
            InteractiveDrawableContainer.A0E(interactiveDrawableContainer, fArr[0], fArr[1], false);
        }
        if (interactiveDrawableContainer.A0C != null) {
            return true;
        }
        return false;
    }

    public final String getModuleName() {
        return "clips_timeline_editor_drawer_controller";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final float A00(Context context, AnonymousClass8RM r5) {
        Integer num = r5.A02;
        if (num != null) {
            int intValue = num.intValue();
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(intValue, typedValue, true);
            if (typedValue.type == 4) {
                float f = typedValue.getFloat();
                if (Float.valueOf(f) != null) {
                    return f;
                }
            }
        }
        return r5.A01;
    }

    public static final int A01(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, AnonymousClass8RH r5) {
        Float f;
        float f2;
        if (!(r5 instanceof AnonymousClass8RX) && (!(clipsTimelineEditorDrawerController.A0o.A0E() instanceof AnonymousClass8RU) || clipsTimelineEditorDrawerController.A07 != AnonymousClass8RM.A09)) {
            MQQ A022 = clipsTimelineEditorDrawerController.A02();
            if ((clipsTimelineEditorDrawerController.A07 != AnonymousClass8RM.A07 || (!(A022 instanceof C65080Ln0) && !AnonymousClass9IF.A00(0, A022) && !(A022 instanceof C65079Lmz) && !AnonymousClass9IF.A00(4, A022) && !AnonymousClass9IF.A00(3, A022) && !(A022 instanceof C40397AbU))) && !(r5 instanceof AnonymousClass8RV) && !(r5 instanceof AnonymousClass8RW) && !(r5 instanceof AnonymousClass8RR) && !(r5 instanceof AnonymousClass8RY) && !(r5 instanceof C355788Rj) && !clipsTimelineEditorDrawerController.A0K && !clipsTimelineEditorDrawerController.A0H) {
                C19140WMw wMw = clipsTimelineEditorDrawerController.A0C;
                if (wMw != null) {
                    2cs r0 = wMw.A0F.A03;
                    if (r0 == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = (float) r0.A01;
                    }
                    f = Float.valueOf(f2);
                } else {
                    f = null;
                }
                if (0qQ.A0I(f, 0.0f)) {
                    return 8;
                }
                return 0;
            }
        }
        return 8;
    }

    private final MQQ A02() {
        AnonymousClass88W r0 = (AnonymousClass88W) this.A0n.A00.A02();
        if (r0 != null) {
            return (MQQ) r0.A01;
        }
        return null;
    }

    public static final ClipsTimelineEditorConfig A03(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        int i = 2;
        if (clipsTimelineEditorDrawerController.A0m.A04 != null) {
            i = 0;
        }
        return new ClipsTimelineEditorConfig(182.A06(0Tu.A06, clipsTimelineEditorDrawerController.A0a, 36318161850603473L), false, clipsTimelineEditorDrawerController.A1C, i);
    }

    private final void A04(View view) {
        ViewGroup viewGroup;
        if (view != null) {
            view.setVisibility(8);
            if (view.getParent() != null && (viewGroup = this.A0O) != null) {
                viewGroup.removeView(view);
            }
        }
    }

    public static final void A05(C3515589i r8, ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, String str, 0eP r11, boolean z, boolean z2, boolean z3) {
        clipsTimelineEditorDrawerController.A07 = AnonymousClass8RM.A06;
        FrameLayout frameLayout = clipsTimelineEditorDrawerController.A01;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        FrameLayout frameLayout2 = clipsTimelineEditorDrawerController.A0P;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        C19140WMw wMw = clipsTimelineEditorDrawerController.A0C;
        if (wMw != null) {
            ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = clipsTimelineEditorDrawerController.A0f;
            clipsAudioMixingDrawerController.A04 = wMw;
            clipsAudioMixingDrawerController.A00 = wMw.A01;
            clipsAudioMixingDrawerController.A03(r8, (AudioOverlayTrack) null, str, r11, z, z2, z3, false);
            return;
        }
        0kD.A07(AnonymousClass000.A00(425), 002.A1D("Launching music browser with null fragmentDrawerController, isStackedTimeline ", clipsTimelineEditorDrawerController.A0L()), (Throwable) null);
    }

    public static final void A06(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        AnonymousClass831 r0 = clipsTimelineEditorDrawerController.A0A;
        if (r0 == null) {
            0qQ.A0F("segmentStore");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A03) {
            clipsTimelineEditorDrawerController.A0d.A01.A0N = true;
            05G r3 = clipsTimelineEditorDrawerController.A0j.A0O.A02;
            AnonymousClass831 r02 = (AnonymousClass831) r3.getValue();
            0qQ.A0B(r02, 0);
            List list = r02.A02;
            0qQ.A0B(list, 0);
            r3.Epw(new AnonymousClass831(list, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r3.getValue() != X.AnonymousClass8YK.EMPTY_TIMELINE) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r3.getValue() == X.AnonymousClass8YK.PENDING_CAMERA_CLOSE) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r3.Epw(X.AnonymousClass8YK.CLOSING);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r6) {
        /*
            android.view.View r0 = r6.A00
            X.0nA.A0O(r0)
            android.view.View r0 = r6.A0L
            X.0nA.A0O(r0)
            X.87s r2 = r6.A0m
            X.4gw r0 = r2.A04
            if (r0 == 0) goto L_0x002d
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x001e
            X.05G r3 = r2.A0Q
            java.lang.Object r1 = r3.getValue()
            X.8YK r0 = X.AnonymousClass8YK.EMPTY_TIMELINE
            if (r1 == r0) goto L_0x0028
        L_0x001e:
            X.05G r3 = r2.A0Q
            java.lang.Object r1 = r3.getValue()
            X.8YK r0 = X.AnonymousClass8YK.PENDING_CAMERA_CLOSE
            if (r1 != r0) goto L_0x002d
        L_0x0028:
            X.8YK r0 = X.AnonymousClass8YK.CLOSING
            r3.Epw(r0)
        L_0x002d:
            X.9rv r1 = r6.A05
            X.9rv r0 = X.C390839rv.PRE_CAPTURE
            if (r1 == r0) goto L_0x0051
            boolean r0 = r6.A0J
            r3 = 0
            if (r0 == 0) goto L_0x0052
            X.80U r1 = r6.A0e
            X.8TJ r0 = new X.8TJ
            r0.<init>()
            r1.E3H(r0)
        L_0x0042:
            r6.A0J = r3
            com.instagram.common.ui.base.IgTextView r0 = r6.A03
            r6.A04(r0)
            androidx.compose.ui.platform.ComposeView r0 = r6.A0Q
            r6.A04(r0)
            r6.A0K(r3)
        L_0x0051:
            return
        L_0x0052:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0j
            X.2gB r0 = r0.A0G
            java.lang.Object r0 = r0.A02()
            X.831 r0 = (X.AnonymousClass831) r0
            r5 = 1
            if (r0 == 0) goto L_0x007b
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != r5) goto L_0x007b
            X.80U r1 = r6.A0e
            X.8TI r0 = new X.8TI
            r0.<init>()
            r1.E3H(r0)
            boolean r0 = r6.A1E
            if (r0 == 0) goto L_0x0042
            androidx.fragment.app.FragmentActivity r0 = r6.A0Y
            r0.finish()
            goto L_0x0042
        L_0x007b:
            X.80U r1 = r6.A0e
            X.8TH r0 = new X.8TH
            r0.<init>()
            r1.E3H(r0)
            X.MQQ r1 = r6.A02()
            X.4gw r0 = r2.A04
            if (r0 == 0) goto L_0x0125
            X.AbV r0 = X.C40398AbV.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00a1
            if (r1 == 0) goto L_0x010f
            boolean r0 = X.AnonymousClass9IF.A00(r5, r1)
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r1 instanceof X.C381959cr
            if (r0 == 0) goto L_0x010f
        L_0x00a1:
            X.4gw r0 = r2.A04
            if (r0 == 0) goto L_0x00a8
            X.C3511387s.A01(r2)
        L_0x00a8:
            X.MQQ r4 = r6.A02()
            X.8RA r2 = r6.A14
            boolean r0 = X.AnonymousClass9IF.A00(r5, r4)
            r1 = 0
            if (r0 == 0) goto L_0x00e9
            X.9IF r4 = (X.AnonymousClass9IF) r4
            java.lang.Object r0 = r4.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.7nt r4 = new X.7nt
            r4.<init>(r0, r3)
        L_0x00c0:
            X.8bo r4 = (X.C358998bo) r4
            X.80R r0 = r2.A00
            X.6if r0 = r0.A1y
            java.lang.Object r2 = r0.get()
            X.8cb r2 = (X.C359318cb) r2
            X.0eK r0 = r2.A16
            java.lang.Object r1 = r0.get()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r2.A0s
            X.2Fj r0 = r0.A0I
            r0.A0B(r1)
            X.80U r0 = r2.A0l
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r1 = r0.A01
            X.8Sc r0 = new X.8Sc
            r0.<init>(r4)
            r1.A04(r0)
            goto L_0x0042
        L_0x00e9:
            boolean r0 = r4 instanceof X.C381959cr
            if (r0 == 0) goto L_0x0109
            X.9cr r4 = (X.C381959cr) r4
            int r1 = r4.A00
            X.831 r0 = r6.A0A
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "segmentStore"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ff:
            int r0 = r0.A00(r1)
            X.7iw r4 = new X.7iw
            r4.<init>(r1, r0)
            goto L_0x00c0
        L_0x0109:
            X.7nt r4 = new X.7nt
            r4.<init>(r1, r3)
            goto L_0x00c0
        L_0x010f:
            X.AbR r0 = X.C40394AbR.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x013b
            X.9rv r1 = r6.A05
            X.9rv r0 = X.C390839rv.MID_CAPTURE
            if (r1 != r0) goto L_0x013b
            boolean r0 = r2.A0K()
            if (r0 == 0) goto L_0x013b
            goto L_0x00a1
        L_0x0125:
            if (r1 == 0) goto L_0x0133
            boolean r0 = X.AnonymousClass9IF.A00(r5, r1)
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r1 instanceof X.C381959cr
            if (r0 == 0) goto L_0x0133
            goto L_0x00a1
        L_0x0133:
            X.9rv r1 = r6.A05
            X.9rv r0 = X.C390839rv.MID_CAPTURE
            if (r1 != r0) goto L_0x013b
            goto L_0x00a1
        L_0x013b:
            X.0eM r2 = r6.A0y
            java.lang.Object r1 = r2.getValue()
            X.HsP r1 = (X.C56076HsP) r1
            java.lang.String r0 = "enter_postcap"
            r1.A01(r0)
            java.lang.Object r0 = r2.getValue()
            X.HsP r0 = (X.C56076HsP) r0
            r0.A00()
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A07(com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController):void");
    }

    public static final void A08(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        AnonymousClass831 r0 = clipsTimelineEditorDrawerController.A0A;
        if (r0 == null) {
            0qQ.A0F("segmentStore");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A03 || clipsTimelineEditorDrawerController.A0j.A0u()) {
            ClipsCreationViewModel clipsCreationViewModel = clipsTimelineEditorDrawerController.A0j;
            clipsCreationViewModel.A0j(clipsTimelineEditorDrawerController.A0u);
            05G r3 = clipsCreationViewModel.A0O.A02;
            AnonymousClass831 r02 = (AnonymousClass831) r3.getValue();
            0qQ.A0B(r02, 0);
            List list = r02.A02;
            0qQ.A0B(list, 0);
            r3.Epw(new AnonymousClass831(list, false));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r6) {
        /*
            X.WMw r0 = r6.A0C
            r2 = 0
            if (r0 == 0) goto L_0x009d
            X.0hq r1 = r0.A0E
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r5 = r1.A0P(r0)
        L_0x000e:
            boolean r0 = r5 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x0085
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r5
            X.8RF r0 = r5.A0d
            java.lang.String r4 = "clipsTimelineEditorViewModel"
            r3 = 0
            if (r0 == 0) goto L_0x00bc
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.C355858Rq
            java.lang.String r1 = "timedElementsViewModel"
            if (r0 != 0) goto L_0x0088
            X.8RF r0 = r5.A0d
            if (r0 == 0) goto L_0x00bc
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.C355768Rh
            if (r0 != 0) goto L_0x0088
            X.8RF r0 = r5.A0d
            if (r0 == 0) goto L_0x00bc
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.C355778Ri
            if (r0 == 0) goto L_0x00a6
            X.KMu r0 = r5.A0i
            if (r0 == 0) goto L_0x00c0
            X.Jym r0 = r0.A0M()
            if (r0 == 0) goto L_0x0049
            X.4ds r3 = r0.A00
        L_0x0049:
            boolean r0 = r3 instanceof android.graphics.drawable.Drawable
            if (r0 == 0) goto L_0x00a6
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            if (r3 == 0) goto L_0x00a6
            boolean r0 = r3 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x0086
            r0 = r3
            X.5MH r0 = (X.AnonymousClass5MH) r0
            if (r0 == 0) goto L_0x0086
            android.graphics.drawable.Drawable r1 = r0.A0A
        L_0x005c:
            boolean r0 = r1 instanceof X.C347017w8
            if (r0 == 0) goto L_0x006e
            X.7w8 r1 = (X.C347017w8) r1
            if (r1 == 0) goto L_0x006e
            java.lang.Iterable r0 = r1.A05()
            java.lang.Object r2 = X.00k.A0A(r0)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
        L_0x006e:
            boolean r0 = r2 instanceof X.C321016tR
            if (r0 == 0) goto L_0x00a0
            X.6tR r2 = (X.C321016tR) r2
            r1 = 1
            if (r2 == 0) goto L_0x00a0
            boolean r0 = r2.isLoading()
            if (r0 != r1) goto L_0x00a0
            X.AYz r0 = new X.AYz
            r0.<init>(r3, r6, r2)
            r2.A9D(r0)
        L_0x0085:
            return
        L_0x0086:
            r1 = r2
            goto L_0x005c
        L_0x0088:
            X.KMu r0 = r5.A0i
            if (r0 == 0) goto L_0x00c0
            X.LTY r0 = r0.A01
            X.Jyn r0 = r0.A0F()
            if (r0 == 0) goto L_0x0049
            X.JwI r0 = r0.A06
            if (r0 == 0) goto L_0x0049
            java.lang.Object r3 = r0.A00
            X.5MI r3 = (X.AnonymousClass5MI) r3
            goto L_0x0049
        L_0x009d:
            r5 = r2
            goto L_0x000e
        L_0x00a0:
            X.8BN r0 = r6.A0k
            r0.A02(r3)
            return
        L_0x00a6:
            X.8BN r4 = r6.A0k
            X.6oS r3 = X.C318116oQ.A00(r4)
            r1 = 0
            r0 = 49
            X.9Js r2 = new X.9Js
            r2.<init>(r4, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r2, r3)
            return
        L_0x00bc:
            X.0qQ.A0F(r4)
            goto L_0x00c3
        L_0x00c0:
            X.0qQ.A0F(r1)
        L_0x00c3:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A09(com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController):void");
    }

    public static final void A0A(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        Fragment fragment;
        C19140WMw wMw = clipsTimelineEditorDrawerController.A0C;
        if (wMw != null) {
            fragment = wMw.A0E.A0P(R.id.fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof K5P) {
            AnonymousClass80U r1 = clipsTimelineEditorDrawerController.A0e;
            if (r1.CQ0(AnonymousClass80V.CLIPS_EDITOR)) {
                r1.E3H(new Object());
                return;
            }
        }
        if (fragment instanceof ClipsStackedTimelineFragment) {
            AnonymousClass80U r12 = clipsTimelineEditorDrawerController.A0e;
            if (r12.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                r12.E3H(new Object());
            }
        }
    }

    public static final void A0B(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        if (clipsTimelineEditorDrawerController.A1D) {
            ClipsAssetHubViewModel clipsAssetHubViewModel = clipsTimelineEditorDrawerController.A13;
            C318136oS A002 = C318116oQ.A00(clipsAssetHubViewModel);
            1Eo.A05(19B.A00, new MG7(clipsAssetHubViewModel, (AnonymousClass4D7) null, 46), A002);
            return;
        }
        FrameLayout frameLayout = clipsTimelineEditorDrawerController.A01;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C331157Pu r0 = clipsTimelineEditorDrawerController.A0B;
        if (r0 != null) {
            r0.A07();
        }
        A0G(clipsTimelineEditorDrawerController, false, false);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.5n1] */
    public static final void A0C(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        Context context = clipsTimelineEditorDrawerController.A0W;
        boolean CQ0 = clipsTimelineEditorDrawerController.A0e.CQ0(AnonymousClass80V.CLIPS_EDITOR);
        int i = R.drawable.instagram_chevron_left_pano_filled_24;
        if (CQ0) {
            i = R.drawable.instagram_chevron_down_pano_filled_24;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            drawable.setColorFilter(AnonymousClass37O.A00(context.getColor(R.color.design_dark_default_color_on_background)));
        }
        IgdsMediaButton igdsMediaButton = clipsTimelineEditorDrawerController.A0U;
        if (igdsMediaButton != null) {
            ? obj = new Object();
            obj.A01 = drawable;
            igdsMediaButton.setStartAddOn(obj, context.getResources().getString(2131955913));
        }
    }

    public static final void A0D(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, AnonymousClass8RM r12) {
        ClipsStackedTimelineFragment clipsStackedTimelineFragment;
        C19140WMw wMw;
        Integer num;
        AnonymousClass8M1 r2 = clipsTimelineEditorDrawerController.A0p;
        FragmentActivity fragmentActivity = clipsTimelineEditorDrawerController.A0Y;
        Context applicationContext = fragmentActivity.getApplicationContext();
        0qQ.A07(applicationContext);
        float A002 = A00(applicationContext, r12);
        C381529bu A003 = AnonymousClass8M1.A00(r2);
        if (A003 != null && A003.A05.A00) {
            C391109sM r7 = C391109sM.PREVIEW_SIZE_CHANGED;
            int i = A003.A02;
            C376429Hy r5 = A003.A03;
            float f = A003.A01;
            C376429Hy r6 = A003.A04;
            0qQ.A0B(r5, 2);
            0qQ.A0B(r6, 5);
            AnonymousClass8M1.A04(new C381529bu(r5, r6, r7, A002, f, i), r2);
        }
        if (A0I(clipsTimelineEditorDrawerController)) {
            float f2 = clipsTimelineEditorDrawerController.A07.A00;
            float f3 = AnonymousClass8RM.A0B.A00;
            if (f2 < f3 || r12.A00 < f3) {
                clipsTimelineEditorDrawerController.A0E = true;
                wMw = clipsTimelineEditorDrawerController.A0C;
                if (wMw != null) {
                    num = AnonymousClass05K.A01;
                }
            } else {
                wMw = clipsTimelineEditorDrawerController.A0C;
                if (wMw != null) {
                    num = AnonymousClass05K.A00;
                }
            }
            wMw.A07 = num;
        }
        clipsTimelineEditorDrawerController.A07 = r12;
        C19140WMw wMw2 = clipsTimelineEditorDrawerController.A0C;
        if (wMw2 != null) {
            wMw2.A0F.A03(true, r12.A00);
        }
        Context applicationContext2 = fragmentActivity.getApplicationContext();
        0qQ.A07(applicationContext2);
        if (((double) A00(applicationContext2, r12)) >= 1.0d) {
            C19140WMw wMw3 = clipsTimelineEditorDrawerController.A0C;
            Fragment fragment = null;
            if (wMw3 != null) {
                fragment = wMw3.A0E.A0P(R.id.fragment_container);
            }
            if ((fragment instanceof ClipsStackedTimelineFragment) && (clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) fragment) != null && !clipsTimelineEditorDrawerController.Esq()) {
                clipsStackedTimelineFragment.A0S();
            }
        }
    }

    public static final void A0E(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, AnonymousClass8RH r3, boolean z) {
        if ((r3 instanceof AnonymousClass8RU) || (r3 instanceof AnonymousClass8RV) || (r3 instanceof AnonymousClass8RW) || (r3 instanceof AnonymousClass8RR) || (r3 instanceof AnonymousClass8RX) || (r3 instanceof AnonymousClass8RY) || (r3 instanceof C355708Ra) || (r3 instanceof C355718Rb) || (r3 instanceof C355728Rd)) {
            FrameLayout frameLayout = clipsTimelineEditorDrawerController.A0P;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
            return;
        }
        boolean z2 = false;
        if (!(r3 instanceof C355748Rf) && !(r3 instanceof C355758Rg) && !(r3 instanceof C355768Rh) && !(r3 instanceof C355778Ri)) {
            if (!(r3 instanceof C355788Rj) && !(r3 instanceof C355798Rk) && !(r3 instanceof C355818Rm) && !(r3 instanceof C355828Rn) && !(r3 instanceof C355838Ro) && !(r3 instanceof C355848Rp)) {
                if (!(r3 instanceof C355858Rq) && !(r3 instanceof C355868Rr)) {
                    if (r3 instanceof C355878Rs) {
                        z2 = !z;
                    } else {
                        return;
                    }
                }
            }
            clipsTimelineEditorDrawerController.A0H(z2);
            return;
        }
        clipsTimelineEditorDrawerController.A0H(true);
    }

    /* JADX WARNING: type inference failed for: r11v9, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02f1, code lost:
        if (r7 != true) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04b6, code lost:
        if (r31 != false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05ba, code lost:
        if (r11 != false) goto L_0x05bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r27, java.lang.Integer r28, boolean r29, boolean r30, boolean r31) {
        /*
            r2 = r27
            if (r29 == 0) goto L_0x0019
            android.view.View r0 = r2.postCaptureVideoContainer
            if (r0 != 0) goto L_0x0019
            X.8A2 r6 = r2.A0h
            java.lang.String r5 = "postCaptureVideoContainer null"
            X.1QP r4 = r6.A0J
            long r0 = r6.A0A
            java.lang.String r3 = ""
            r4.flowEndFail(r0, r5, r3)
            r0 = 0
            r6.A0A = r0
        L_0x0019:
            android.view.View r4 = r2.postCaptureVideoContainer
            r3 = 8
            r1 = 0
            if (r4 == 0) goto L_0x0057
            r0 = 2131430265(0x7f0b0b79, float:1.8482226E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r2.A04 = r0
            boolean r0 = r2.A0L()
            if (r0 == 0) goto L_0x0057
            r0 = 2131437981(0x7f0b299d, float:1.8497876E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.A0O = r0
            r0 = 2131437982(0x7f0b299e, float:1.8497878E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r0 = (com.instagram.common.ui.base.IgSimpleImageView) r0
            r2.A0T = r0
            android.content.Context r0 = r4.getContext()
            android.view.View r4 = new android.view.View
            r4.<init>(r0)
            if (r31 == 0) goto L_0x060a
            r4.setVisibility(r3)
        L_0x0055:
            r2.A0N = r4
        L_0x0057:
            X.2eb r0 = r2.drawerContainerViewStubHolder
            if (r0 == 0) goto L_0x04b0
            android.view.View r0 = r0.A01()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x04b0
            r4 = 2131433135(0x7f0b16af, float:1.8488047E38)
            android.view.View r7 = r0.requireViewById(r4)
            X.0qQ.A07(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r4 = 2131099778(0x7f060082, float:1.7811919E38)
            r8 = 2131099778(0x7f060082, float:1.7811919E38)
            r7.setBackgroundResource(r4)
            X.80x r4 = r2.A0s
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r5 = r4.A00()
            r14 = 1065353216(0x3f800000, float:1.0)
            int r4 = r5.A02
            float r6 = (float) r4
            float r6 = r6 * r14
            int r4 = r5.A03
            float r4 = (float) r4
            float r6 = r6 / r4
            android.view.View r15 = r2.postCaptureVideoContainer
            X.0hq r12 = r2.A11
            X.9Y8 r5 = new X.9Y8
            r5.<init>(r2)
            if (r30 == 0) goto L_0x05c1
            X.8RM r4 = X.AnonymousClass8RM.A0C
        L_0x0095:
            float r10 = r4.A00
        L_0x0097:
            com.instagram.common.session.UserSession r9 = r2.A0a
            X.87s r13 = r2.A0m
            X.4gw r4 = r13.A04
            r27 = 0
            if (r4 == 0) goto L_0x00a3
            r27 = 1
        L_0x00a3:
            X.8R7 r11 = r2.A15
            X.WMw r4 = new X.WMw
            r19 = r7
            r20 = r5
            r21 = r12
            r22 = r9
            r23 = r11
            r24 = r2
            r25 = r10
            r26 = r6
            r16 = r4
            r17 = r15
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2.A0C = r4
            androidx.fragment.app.FragmentActivity r15 = r2.A0Y
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r2.A0j
            r22 = r5
            boolean r12 = r22.A0u()
            boolean r11 = r13.A0M()
            boolean r5 = A0I(r2)
            java.lang.Integer r10 = r4.A07
            X.0qQ.A07(r10)
            r7 = 0
            android.content.res.Resources r6 = r15.getResources()
            if (r29 == 0) goto L_0x05b6
            if (r5 == 0) goto L_0x05b1
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            if (r10 != r5) goto L_0x05b1
            float r5 = X.AnonymousClass8RO.A01(r15, r7)
            int r5 = (int) r5
        L_0x00eb:
            int r5 = r6.getDimensionPixelSize(r5)
            float r10 = (float) r5
            android.content.Context r5 = r2.A0W
            android.content.res.Resources r7 = r5.getResources()
            r6 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r29 == 0) goto L_0x00fe
            r6 = 2131165230(0x7f07002e, float:1.7944671E38)
        L_0x00fe:
            int r6 = r7.getDimensionPixelSize(r6)
            float r6 = (float) r6
            r4.A05 = r10
            r4.A04 = r6
            android.content.res.Resources r7 = r5.getResources()
            r6 = 2131165203(0x7f070013, float:1.7944616E38)
            int r6 = r7.getDimensionPixelSize(r6)
            float r6 = (float) r6
            r4.A03 = r6
            if (r29 == 0) goto L_0x011d
            X.8RM r6 = X.AnonymousClass8RM.A09
            float r6 = r6.A00
            r4.A00 = r6
        L_0x011d:
            r4 = 2131432073(0x7f0b1289, float:1.8485893E38)
            android.view.View r7 = r0.requireViewById(r4)
            r2.A00 = r7
            if (r7 == 0) goto L_0x0134
            boolean r6 = r22.A0u()
            r4 = 8
            if (r6 == 0) goto L_0x05ac
            r4 = 0
        L_0x0131:
            r7.setVisibility(r4)
        L_0x0134:
            android.view.View r6 = r2.A00
            if (r6 == 0) goto L_0x0140
            X.AMO r4 = new X.AMO
            r4.<init>(r2)
            X.AnonymousClass0fU.A00(r4, r6)
        L_0x0140:
            r4 = 2131432077(0x7f0b128d, float:1.8485901E38)
            android.view.View r12 = r0.requireViewById(r4)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r2.A0P = r12
            r4 = 1
            if (r12 == 0) goto L_0x017c
            r12.setVisibility(r1)
            r12.setEnabled(r4)
            r12.setClickable(r4)
            X.KIO r6 = new X.KIO
            r6.<init>(r2)
            X.AnonymousClass0fU.A00(r6, r12)
            android.content.Context r6 = r12.getContext()
            android.content.res.Resources r7 = r6.getResources()
            r6 = 2131165184(0x7f070000, float:1.7944578E38)
            int r11 = r7.getDimensionPixelSize(r6)
            int r10 = r12.getPaddingLeft()
            int r7 = r12.getPaddingTop()
            int r6 = r12.getPaddingBottom()
            r12.setPadding(r10, r7, r11, r6)
        L_0x017c:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r2.A0V
            if (r6 != 0) goto L_0x01f3
            X.0Tu r10 = X.0Tu.A05
            r6 = 36329041003036419(0x81111200043f03, double:3.0379700434021195E-306)
            boolean r6 = X.182.A06(r10, r9, r6)
            if (r6 != 0) goto L_0x05a7
            boolean r6 = X.C355698Qz.A00(r9)
            if (r6 != 0) goto L_0x05a7
            r6 = 0
            X.5pj r18 = X.C296235pj.CREATION_FLOW_BLUE_DARK_BACKGROUND_OVERRIDE
        L_0x0196:
            if (r6 != 0) goto L_0x019b
            r8 = 2131100036(0x7f060184, float:1.7812442E38)
        L_0x019b:
            int r6 = r5.getColor(r8)
            android.graphics.ColorFilter r7 = X.AnonymousClass37O.A00(r6)
            X.5pk r19 = X.C296245pk.LARGE
            X.5pl r20 = X.C296255pl.CONSTRAINED
            r21 = 0
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = new com.instagram.igds.components.mediabutton.IgdsMediaButton
            r16 = r6
            r17 = r5
            r16.<init>((android.content.Context) r17, (X.C296235pj) r18, (X.C296245pk) r19, (X.C296255pl) r20, (X.C296265pm) r21)
            r6.setVisibility(r1)
            android.content.Context r10 = r6.getContext()
            r8 = 2131237920(0x7f081c20, float:1.8092104E38)
            android.graphics.drawable.Drawable r8 = r10.getDrawable(r8)
            if (r8 == 0) goto L_0x01c5
            r8.setColorFilter(r7)
        L_0x01c5:
            X.5n1 r11 = new X.5n1
            r11.<init>()
            r11.A01 = r8
            android.content.res.Resources r8 = r10.getResources()
            r7 = 2131968361(0x7f134169, float:1.9573614E38)
            java.lang.String r7 = r8.getString(r7)
            r6.setStartAddOn(r11, r7)
            android.content.res.Resources r8 = r10.getResources()
            r7 = 2131165250(0x7f070042, float:1.7944712E38)
            int r8 = r8.getDimensionPixelSize(r7)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r7.width = r8
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r7.height = r8
            r2.A0V = r6
        L_0x01f3:
            r8 = 0
            if (r6 == 0) goto L_0x01fc
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0205
        L_0x01fc:
            android.widget.FrameLayout r7 = r2.A0P
            if (r7 == 0) goto L_0x0205
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r2.A0V
            r7.addView(r6)
        L_0x0205:
            r6 = 2131432070(0x7f0b1286, float:1.8485887E38)
            android.view.View r12 = r0.requireViewById(r6)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r2.A01 = r12
            if (r31 == 0) goto L_0x0504
            if (r12 == 0) goto L_0x0245
            r12.setVisibility(r1)
            r12.setEnabled(r4)
            r12.setClickable(r4)
            r12.setAlpha(r14)
            android.content.Context r6 = r12.getContext()
            android.content.res.Resources r7 = r6.getResources()
            r6 = 2131165184(0x7f070000, float:1.7944578E38)
            int r11 = r7.getDimensionPixelSize(r6)
            int r10 = r12.getPaddingTop()
            int r7 = r12.getPaddingRight()
            int r6 = r12.getPaddingBottom()
            r12.setPadding(r11, r10, r7, r6)
            X.AMP r6 = new X.AMP
            r6.<init>(r2)
            X.AnonymousClass0fU.A00(r6, r12)
        L_0x0245:
            com.instagram.common.ui.base.IgSimpleImageView r11 = r2.A0R
            if (r11 != 0) goto L_0x0268
            com.instagram.common.ui.base.IgSimpleImageView r11 = new com.instagram.common.ui.base.IgSimpleImageView
            r11.<init>(r5)
            android.content.Context r10 = r11.getContext()
            X.0qQ.A07(r10)
            r7 = 2131239025(0x7f082071, float:1.8094345E38)
            r6 = 2131100036(0x7f060184, float:1.7812442E38)
            int r6 = r10.getColor(r6)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass3JT.A05(r10, r7, r6)
            r11.setImageDrawable(r6)
            r2.A0R = r11
        L_0x0268:
            r11.setVisibility(r1)
            com.instagram.common.ui.base.IgSimpleImageView r6 = r2.A0R
            if (r6 == 0) goto L_0x0275
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x027e
        L_0x0275:
            android.widget.FrameLayout r7 = r2.A01
            if (r7 == 0) goto L_0x027e
            com.instagram.common.ui.base.IgSimpleImageView r6 = r2.A0R
            r7.addView(r6)
        L_0x027e:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r2.A0U
            if (r6 == 0) goto L_0x0285
            r6.setVisibility(r3)
        L_0x0285:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r2.A0U
            if (r6 == 0) goto L_0x0298
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L_0x0298
            android.widget.FrameLayout r7 = r2.A01
            if (r7 == 0) goto L_0x0298
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r2.A0U
            r7.removeView(r6)
        L_0x0298:
            r6 = 2131432069(0x7f0b1285, float:1.8485885E38)
            android.view.View r6 = r0.requireViewById(r6)
            r2.A0L = r6
            r6 = 2131432075(0x7f0b128b, float:1.8485897E38)
            android.view.View r6 = r0.requireViewById(r6)
            r2.A0M = r6
            r6 = 2131432078(0x7f0b128e, float:1.8485903E38)
            android.view.View r6 = r0.requireViewById(r6)
            com.instagram.common.ui.base.IgSimpleImageView r6 = (com.instagram.common.ui.base.IgSimpleImageView) r6
            r2.A0S = r6
            boolean r6 = r13.A0M()
            if (r6 == 0) goto L_0x030b
            android.view.View r6 = r2.A0L
            if (r6 == 0) goto L_0x02c2
            r6.setBackground(r8)
        L_0x02c2:
            android.view.View r6 = r2.A0M
            if (r6 == 0) goto L_0x02c9
            r6.setBackground(r8)
        L_0x02c9:
            X.0Tu r10 = X.0Tu.A05
            r6 = 36322164760193001(0x810ad1000127e9, double:3.0336214797395344E-306)
            boolean r6 = X.182.A06(r10, r9, r6)
            if (r6 != 0) goto L_0x030b
            X.1E7 r10 = X.1E8.A03
            java.lang.String r7 = r13.A0C
            r6 = 425(0x1a9, float:5.96E-43)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            X.1Xj r11 = r10.A01(r9, r6, r7)
            com.instagram.common.ui.base.IgSimpleImageView r10 = r2.A0S
            if (r10 == 0) goto L_0x030b
            if (r11 == 0) goto L_0x02f3
            boolean r7 = r11.CbC()
            r6 = 2131238735(0x7f081f4f, float:1.8093757E38)
            if (r7 == r4) goto L_0x02f6
        L_0x02f3:
            r6 = 2131238737(0x7f081f51, float:1.8093761E38)
        L_0x02f6:
            android.graphics.drawable.Drawable r6 = r5.getDrawable(r6)
            r10.setImageDrawable(r6)
            r10.setVisibility(r1)
            r10.setImportantForAccessibility(r4)
            X.AO4 r6 = new X.AO4
            r6.<init>(r10, r2, r11)
            X.AnonymousClass0fU.A00(r6, r10)
        L_0x030b:
            X.4gw r6 = r13.A04
            if (r6 == 0) goto L_0x04ca
            r7 = 0
            if (r29 == 0) goto L_0x0314
            r7 = 8
        L_0x0314:
            android.view.View r6 = r2.A0L
            if (r6 == 0) goto L_0x031b
            r6.setVisibility(r7)
        L_0x031b:
            if (r29 == 0) goto L_0x04ba
            r2.A0H(r4)
        L_0x0320:
            android.view.View r6 = r2.A0M
            if (r6 == 0) goto L_0x0327
            r6.setVisibility(r7)
        L_0x0327:
            android.view.View r6 = r2.A0M
            if (r6 == 0) goto L_0x032e
            r6.setImportantForAccessibility(r4)
        L_0x032e:
            boolean r6 = r13.A0M()
            if (r6 != 0) goto L_0x0348
            boolean r6 = r13.A0K()
            if (r6 == 0) goto L_0x0348
            android.view.View r6 = r2.A0M
            if (r6 == 0) goto L_0x0341
            r6.setVisibility(r3)
        L_0x0341:
            com.instagram.common.ui.base.IgSimpleImageView r6 = r2.A0S
            if (r6 == 0) goto L_0x0348
            r6.setVisibility(r3)
        L_0x0348:
            android.view.View r6 = r2.A0L
            if (r6 == 0) goto L_0x0354
            X.AMM r3 = new X.AMM
            r3.<init>(r2)
            X.AnonymousClass0fU.A00(r3, r6)
        L_0x0354:
            android.view.View r6 = r2.A0M
            if (r6 == 0) goto L_0x0360
            X.AMN r3 = new X.AMN
            r3.<init>(r2)
            X.AnonymousClass0fU.A00(r3, r6)
        L_0x0360:
            r3 = 2131432079(0x7f0b128f, float:1.8485905E38)
            android.view.View r0 = r0.requireViewById(r3)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r2.A02 = r0
            if (r31 == 0) goto L_0x04b1
            X.0Tu r0 = X.0Tu.A05
            r6 = 36323805438357021(0x810c4f000b2e1d, double:3.0346590512169414E-306)
            boolean r0 = X.182.A06(r0, r9, r6)
            if (r0 == 0) goto L_0x04b1
            androidx.compose.ui.platform.ComposeView r7 = r2.A0Q
            if (r7 != 0) goto L_0x0396
            androidx.compose.ui.platform.ComposeView r7 = new androidx.compose.ui.platform.ComposeView
            r7.<init>(r5, r8, r1)
            r6 = -1097777283(0xffffffffbe913f7d, float:-0.2836875)
            r3 = 29
            X.J6u r0 = new X.J6u
            r0.<init>(r2, r3)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r6, r4)
            r7.setContent(r0)
            r2.A0Q = r7
        L_0x0396:
            r7.setVisibility(r1)
            androidx.compose.ui.platform.ComposeView r3 = r2.A0Q
            if (r3 == 0) goto L_0x03a4
            android.view.ViewGroup r0 = r2.A0O
            if (r0 == 0) goto L_0x03a4
            r0.addView(r3)
        L_0x03a4:
            if (r28 == 0) goto L_0x0615
            int r0 = r28.intValue()
            float r3 = (float) r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r0
            double r6 = (double) r3
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r6)
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            java.math.BigDecimal r0 = r3.setScale(r4, r0)
            java.lang.String r8 = r0.toString()
            X.0qQ.A07(r8)
            com.instagram.common.ui.base.IgTextView r6 = r2.A03
            if (r6 != 0) goto L_0x0435
            com.instagram.common.ui.base.IgTextView r6 = new com.instagram.common.ui.base.IgTextView
            r6.<init>(r5)
            android.content.Context r3 = r6.getContext()
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            float r0 = r4.getDimension(r0)
            r6.setTextSize(r0)
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131100269(0x7f06026d, float:1.7812915E38)
            int r0 = r4.getColor(r0)
            r6.setTextColor(r0)
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            float r0 = r4.getDimension(r0)
            int r7 = (int) r0
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r0 = r4.getDimension(r0)
            int r0 = (int) r0
            r6.setPadding(r7, r0, r7, r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            r6.setElevation(r0)
            r0 = 2131231483(0x7f0802fb, float:1.8079048E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r6.setBackground(r0)
            r0 = -2
            X.2dQ r4 = new X.2dQ
            r4.<init>(r0, r0)
            r0 = 2131437981(0x7f0b299d, float:1.8497876E38)
            r4.A0s = r0
            r4.A0M = r0
            r4.A0F = r0
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r4.setMargins(r1, r1, r1, r0)
            r6.setLayoutParams(r4)
            r2.A03 = r6
        L_0x0435:
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131957334(0x7f131656, float:1.955125E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            java.lang.String r0 = r4.getString(r3, r0)
            r6.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r2.A03
            if (r0 == 0) goto L_0x044e
            r0.setVisibility(r1)
        L_0x044e:
            com.instagram.common.ui.base.IgTextView r1 = r2.A03
            if (r1 == 0) goto L_0x04b0
            android.view.ViewGroup r0 = r2.A0O
            if (r0 == 0) goto L_0x0459
            r0.addView(r1)
        L_0x0459:
            X.1Av r4 = X.1Au.A00(r9)
            X.0s0 r3 = r4.A3x
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 420(0x1a4, float:5.89E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r3.CDM(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x04b0
            com.instagram.common.ui.base.IgTextView r4 = r2.A03
            if (r4 == 0) goto L_0x04b0
            android.content.res.Resources r3 = r5.getResources()
            r1 = 2131955207(0x7f130e07, float:1.9546935E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            java.lang.String r1 = r3.getString(r1, r0)
            X.0qQ.A07(r1)
            X.6jx r0 = new X.6jx
            r0.<init>((java.lang.CharSequence) r1)
            X.5Gt r1 = new X.5Gt
            r1.<init>(r15, r0)
            r1.A01()
            r1.A03(r4)
            X.9p6 r0 = new X.9p6
            r0.<init>(r2)
            r1.A04 = r0
            X.5Gv r0 = r1.A00()
            com.instagram.common.ui.base.IgTextView r4 = r2.A03
            if (r4 == 0) goto L_0x04b0
            X.Ana r3 = new X.Ana
            r3.<init>(r2, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r3, r0)
        L_0x04b0:
            return
        L_0x04b1:
            androidx.compose.ui.platform.ComposeView r0 = r2.A0Q
            r2.A04(r0)
            if (r31 == 0) goto L_0x0615
            goto L_0x03a4
        L_0x04ba:
            android.widget.FrameLayout r6 = r2.A01
            if (r6 == 0) goto L_0x04c1
            r6.setVisibility(r3)
        L_0x04c1:
            android.widget.FrameLayout r6 = r2.A0P
            if (r6 == 0) goto L_0x0320
            r6.setVisibility(r3)
            goto L_0x0320
        L_0x04ca:
            if (r31 == 0) goto L_0x04f1
            android.view.View r6 = r2.A0L
            if (r6 == 0) goto L_0x04d3
            r6.setVisibility(r3)
        L_0x04d3:
            android.widget.FrameLayout r6 = r2.A0P
            if (r6 == 0) goto L_0x04da
            r6.setVisibility(r3)
        L_0x04da:
            android.view.View r6 = r2.A0M
            if (r6 == 0) goto L_0x04e1
            r6.setVisibility(r3)
        L_0x04e1:
            com.instagram.common.ui.base.IgSimpleImageView r6 = r2.A0S
            if (r6 == 0) goto L_0x04e8
            r6.setVisibility(r3)
        L_0x04e8:
            android.widget.FrameLayout r3 = r2.A01
            if (r3 == 0) goto L_0x0348
            r3.setVisibility(r1)
            goto L_0x0348
        L_0x04f1:
            r22.A0u()
            android.view.View r6 = r2.A0L
            if (r6 == 0) goto L_0x04fb
            r6.setVisibility(r3)
        L_0x04fb:
            android.view.View r6 = r2.A0M
            if (r6 == 0) goto L_0x0348
            r6.setVisibility(r3)
            goto L_0x0348
        L_0x0504:
            if (r12 == 0) goto L_0x053c
            r12.setVisibility(r1)
            boolean r6 = r2.ABA()
            r12.setEnabled(r6)
            boolean r6 = r2.ABA()
            r12.setClickable(r6)
            X.ANQ r6 = new X.ANQ
            r6.<init>(r12, r2)
            X.AnonymousClass0fU.A00(r6, r12)
            android.content.Context r6 = r12.getContext()
            android.content.res.Resources r7 = r6.getResources()
            r6 = 2131165184(0x7f070000, float:1.7944578E38)
            int r11 = r7.getDimensionPixelSize(r6)
            int r10 = r12.getPaddingTop()
            int r7 = r12.getPaddingRight()
            int r6 = r12.getPaddingBottom()
            r12.setPadding(r11, r10, r7, r6)
        L_0x053c:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r2.A0U
            if (r6 != 0) goto L_0x0571
            X.5pj r18 = X.C296235pj.CREATION_FLOW
            X.5pk r19 = X.C296245pk.LARGE
            X.5pl r20 = X.C296255pl.CONSTRAINED
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = new com.instagram.igds.components.mediabutton.IgdsMediaButton
            r16 = r6
            r17 = r5
            r21 = r8
            r16.<init>((android.content.Context) r17, (X.C296235pj) r18, (X.C296245pk) r19, (X.C296255pl) r20, (X.C296265pm) r21)
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources r10 = r7.getResources()
            r7 = 2131165250(0x7f070042, float:1.7944712E38)
            int r10 = r10.getDimensionPixelSize(r7)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r7.width = r10
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r7.height = r10
            r2.A0U = r6
            A0C(r2)
        L_0x0571:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r2.A0U
            if (r6 == 0) goto L_0x0578
            r6.setVisibility(r1)
        L_0x0578:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r2.A0U
            if (r6 == 0) goto L_0x0582
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x058b
        L_0x0582:
            android.widget.FrameLayout r7 = r2.A01
            if (r7 == 0) goto L_0x058b
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r2.A0U
            r7.addView(r6)
        L_0x058b:
            com.instagram.common.ui.base.IgSimpleImageView r6 = r2.A0R
            if (r6 == 0) goto L_0x0592
            r6.setVisibility(r3)
        L_0x0592:
            com.instagram.common.ui.base.IgSimpleImageView r6 = r2.A0R
            if (r6 == 0) goto L_0x0298
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L_0x0298
            android.widget.FrameLayout r7 = r2.A01
            if (r7 == 0) goto L_0x0298
            com.instagram.common.ui.base.IgSimpleImageView r6 = r2.A0R
            r7.removeView(r6)
            goto L_0x0298
        L_0x05a7:
            r6 = 1
            X.5pj r18 = X.C296235pj.PRIMARY
            goto L_0x0196
        L_0x05ac:
            r2.A0L()
            goto L_0x0131
        L_0x05b1:
            r5 = 2131165230(0x7f07002e, float:1.7944671E38)
            goto L_0x00eb
        L_0x05b6:
            if (r12 != 0) goto L_0x05bc
            r5 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r11 == 0) goto L_0x00eb
        L_0x05bc:
            r5 = 2131165209(0x7f070019, float:1.7944629E38)
            goto L_0x00eb
        L_0x05c1:
            if (r29 == 0) goto L_0x05d7
            if (r31 == 0) goto L_0x05cb
            X.8RM r4 = X.AnonymousClass8RM.A0D
        L_0x05c7:
            r2.A07 = r4
            goto L_0x0095
        L_0x05cb:
            boolean r4 = A0I(r2)
            if (r4 == 0) goto L_0x05d4
            X.8RM r4 = X.AnonymousClass8RM.A0B
            goto L_0x05c7
        L_0x05d4:
            X.8RM r4 = X.AnonymousClass8RM.A0C
            goto L_0x05c7
        L_0x05d7:
            android.content.Context r9 = r2.A0W
            android.content.res.Resources r10 = r9.getResources()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r4 = r2.A0j
            boolean r4 = r4.A0u()
            if (r4 == 0) goto L_0x05fb
            r4 = 2131165460(0x7f070114, float:1.7945138E38)
        L_0x05e8:
            int r4 = r10.getDimensionPixelSize(r4)
            float r10 = (float) r4
            android.content.res.Resources r4 = r9.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            float r4 = (float) r4
            float r10 = r10 / r4
            goto L_0x0097
        L_0x05fb:
            X.87s r4 = r2.A0m
            boolean r11 = r4.A0M()
            r4 = 2131165459(0x7f070113, float:1.7945136E38)
            if (r11 == 0) goto L_0x05e8
            r4 = 2131165369(0x7f0700b9, float:1.7944953E38)
            goto L_0x05e8
        L_0x060a:
            r4.setVisibility(r1)
            r0 = 2131231385(0x7f080299, float:1.807885E38)
            r4.setBackgroundResource(r0)
            goto L_0x0055
        L_0x0615:
            com.instagram.common.ui.base.IgTextView r0 = r2.A03
            r2.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A0F(com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController, java.lang.Integer, boolean, boolean, boolean):void");
    }

    public static final void A0G(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, boolean z, boolean z2) {
        05G r1;
        AnonymousClass883 r0;
        Medium medium;
        C3511387s r3 = clipsTimelineEditorDrawerController.A0m;
        if (r3.A04 == null) {
            C19140WMw wMw = clipsTimelineEditorDrawerController.A0C;
            if (wMw != null) {
                wMw.A05(z2);
            }
            if (z2) {
                return;
            }
        } else if (z) {
            C390839rv r12 = clipsTimelineEditorDrawerController.A05;
            if (r12 == C390839rv.PRE_CAPTURE) {
                r3.A0I.A00();
                C3511387s.A01(r3);
            } else if (r12 == C390839rv.MID_CAPTURE) {
                if (r3.A0I()) {
                    r3.A08 = new AnonymousClass831(((AnonymousClass831) clipsTimelineEditorDrawerController.A0j.A0c.getValue()).A05(), false);
                }
                clipsTimelineEditorDrawerController.A05 = C390839rv.POST_CAPTURE;
            }
            C19140WMw wMw2 = clipsTimelineEditorDrawerController.A0C;
            if (wMw2 != null) {
                wMw2.A05(false);
            }
        } else {
            AnonymousClass831 r02 = (AnonymousClass831) clipsTimelineEditorDrawerController.A0j.A0G.A02();
            if (r02 != null && r02.A01.isEmpty()) {
                clipsTimelineEditorDrawerController.A0e.E3H(new Object());
            }
            if (r3.A0E) {
                r3.A0G(true);
                if (182.A06(0Tu.A05, r3.A0K, 36322164760258538L) && (medium = r3.A06) != null) {
                    r3.A0M.A02(medium);
                }
                r3.A0Q.Epw(AnonymousClass8YK.LANDING_PAGE);
                r3.A0E = false;
                r3.A0S.Epw(AnonymousClass883.LANDING_PAGE_PLAYBACK);
                if (r3.A0H()) {
                    r1 = r3.A0P;
                    r0 = null;
                } else {
                    return;
                }
            } else {
                05G r2 = r3.A0Q;
                if (r2.getValue() == AnonymousClass8YK.LANDING_PAGE || !r3.A0K()) {
                    r2.Epw(AnonymousClass8YK.CLOSING);
                    r1 = r3.A0S;
                    r0 = AnonymousClass883.PAUSED;
                } else {
                    r3.A0I.A00();
                    C3511387s.A01(r3);
                    return;
                }
            }
            r1.Epw(r0);
            return;
        }
        C19140WMw wMw3 = clipsTimelineEditorDrawerController.A0C;
        if (wMw3 != null) {
            wMw3.A01();
        }
    }

    public static final boolean A0I(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        return ((Boolean) clipsTimelineEditorDrawerController.A1B.getValue()).booleanValue();
    }

    public final void A0K(boolean z) {
        C314446iH r0 = this.A06;
        if (z) {
            if (r0 != null) {
                r0.DV9(this);
                return;
            }
        } else if (r0 != null) {
            r0.D48(this);
            return;
        }
        0qQ.A0F("postCaptureControllerManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0L() {
        if (this.A0j.A0u()) {
            return false;
        }
        if (this.A0m.A04 == null || this.A05 == C390839rv.POST_CAPTURE) {
            return true;
        }
        return false;
    }

    public final boolean ABA() {
        AnonymousClass8RH A0E2 = this.A0o.A0E();
        if ((A0E2 instanceof AnonymousClass8RU) || (A0E2 instanceof AnonymousClass8RX) || (A0E2 instanceof AnonymousClass8RY) || (A0E2 instanceof AnonymousClass8RV) || (A0E2 instanceof AnonymousClass8RW) || (A0E2 instanceof C355788Rj)) {
            return false;
        }
        return true;
    }

    public final boolean CV1() {
        return this.A0p.A0G();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAU() {
        /*
            r3 = this;
            X.8RM r1 = r3.A07
            X.8RM r2 = X.AnonymousClass8RM.A09
            if (r1 != r2) goto L_0x004d
            X.WMw r1 = r3.A0C
            if (r1 == 0) goto L_0x0018
            X.8RM r0 = X.AnonymousClass8RM.A0C
            float r0 = r0.A00
        L_0x000e:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            r1.A01 = r0
        L_0x0018:
            boolean r0 = r3.A0L()
            if (r0 == 0) goto L_0x0040
            boolean r0 = A0I(r3)
            if (r0 == 0) goto L_0x0040
            X.WMw r2 = r3.A0C
            if (r2 == 0) goto L_0x004b
            java.lang.Integer r1 = r2.A07
        L_0x002a:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0048
            if (r2 == 0) goto L_0x0040
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A07 = r0
        L_0x0034:
            X.8RM r0 = X.AnonymousClass8RM.A0B
            float r0 = r0.A00
            X.We4 r1 = r2.A0F
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A04 = r0
        L_0x0040:
            X.8RM r0 = r3.A07
            r3.A08 = r0
            r0 = 1
            r3.A0I = r0
            return
        L_0x0048:
            if (r2 == 0) goto L_0x0040
            goto L_0x0034
        L_0x004b:
            r1 = 0
            goto L_0x002a
        L_0x004d:
            X.8RM r0 = X.AnonymousClass8RM.A0B
            if (r1 != r0) goto L_0x0018
            X.WMw r1 = r3.A0C
            if (r1 == 0) goto L_0x0018
            float r0 = r2.A00
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.DAU():void");
    }

    public final void DAt() {
        AnonymousClass8BN r4;
        C391959tx r1;
        AnonymousClass5MH r3;
        AnonymousClass88W r0;
        ViewGroup viewGroup = this.A0O;
        if (viewGroup != null) {
            viewGroup.removeView(this.A0N);
        }
        if (!A0L() || (r0 = (AnonymousClass88W) this.A0i.A00.A02()) == null || !0qQ.A0K(r0.A01, true)) {
            if (A0L()) {
                AnonymousClass8RM r12 = this.A07;
                if (r12 == AnonymousClass8RM.A07) {
                    MQQ A022 = A02();
                    if ((A022 instanceof C65080Ln0) || (A022 instanceof C65081Ln1)) {
                        r4 = this.A0k;
                        r1 = new C388469ns(-1, -1);
                    } else if (AnonymousClass9IF.A00(0, A022)) {
                        r4 = this.A0k;
                        r1 = new C388489nu((Drawable) ((AnonymousClass9IF) A022).A01);
                    } else if (A022 instanceof C65079Lmz) {
                        r4 = this.A0k;
                        r1 = new C388459nr(-1, -1);
                    } else if (AnonymousClass9IF.A00(4, A022) || AnonymousClass9IF.A00(3, A022)) {
                        r4 = this.A0k;
                        Drawable A002 = r4.A00();
                        if ((A002 instanceof AnonymousClass5MH) && (r3 = (AnonymousClass5MH) A002) != null) {
                            this.A0t.A08(r3.A01, r3.A00);
                        }
                        this.A0t.A03();
                        r1 = C388529ny.A00;
                    } else if (A022 instanceof C40397AbU) {
                        this.A0t.A03();
                        r4 = this.A0k;
                        r1 = C388539nz.A00;
                    } else if (this.A0v.contains(this.A0e.Atr())) {
                        return;
                    }
                    r4.A03(r1);
                    return;
                } else if (r12 != AnonymousClass8RM.A0A) {
                    if (this.A0D) {
                        this.A0D = false;
                    } else {
                        27r A012 = 27p.A01(this.A0a);
                        if (A012.A0J() != null) {
                            27r.A09(C59725JVj.POST_CAPTURE, A012, "TIMELINE_EDIT_CLIPS_DRAG_DONE", A012.A04.A0W);
                        }
                    }
                }
                AnonymousClass8BN r5 = this.A0k;
                C318136oS A003 = C318116oQ.A00(r5);
                C376889Js r2 = new C376889Js(r5, (AnonymousClass4D7) null, 49);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A003);
            } else {
                boolean z = this.A0F;
                27r A013 = 27p.A01(this.A0a);
                C279294yP A0J2 = A013.A0J();
                if (z) {
                    if (A0J2 != null) {
                        27r.A0C(A013, "TIMELINE_EDIT_CLIPS_TAP_DONE");
                    }
                    this.A0F = false;
                } else if (A0J2 != null) {
                    27r.A09(C59725JVj.POST_CAPTURE, A013, "TIMELINE_EDIT_CLIPS_DRAG_DONE", A013.A04.A0W);
                }
                this.A0o.A0G(new AnonymousClass8RG(false));
            }
            AnonymousClass8RM r13 = this.A07;
            if (!(r13 == AnonymousClass8RM.A05 || r13 == AnonymousClass8RM.A0A)) {
                ClipsCreationViewModel clipsCreationViewModel = this.A0j;
                AnonymousClass831 r02 = (AnonymousClass831) clipsCreationViewModel.A0G.A02();
                if (r02 == null || !r02.A01.isEmpty()) {
                    AnonymousClass861 r52 = this.A0t;
                    r52.A03();
                    if (!182.A06(0Tu.A05, this.A0a, 36320043046412175L)) {
                        r52.A06(0);
                    }
                    r52.A09(clipsCreationViewModel.A0C);
                }
            }
            AnonymousClass831 r03 = this.A0A;
            if (r03 == null) {
                0qQ.A0F("segmentStore");
                throw AnonymousClass00P.createAndThrow();
            } else if (r03.A03) {
                C358248ab r22 = new C358248ab(this.A0W);
                r22.A09(2131955445);
                r22.A08(2131955444);
                r22.A0J(new AK4(this), 2131972502);
                r22.A0G(new AK5(this), 2131960790);
                r22.A0r(false);
                AnonymousClass0fN.A00(r22.A02());
            } else {
                A07(this);
            }
        } else {
            this.A0f.DAt();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        r2.A0G(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
        X.0qQ.A0F("clipsTimelineEditorViewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAu() {
        /*
            r3 = this;
            X.WMw r0 = r3.A0C
            if (r0 == 0) goto L_0x002d
            X.0hq r1 = r0.A0E
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
        L_0x000d:
            boolean r0 = r1 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x001f
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            X.9s3 r0 = r1.A0R
            if (r0 == 0) goto L_0x001e
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0033;
                case 1: goto L_0x002f;
                case 2: goto L_0x0046;
                case 3: goto L_0x0037;
                case 4: goto L_0x004d;
                case 5: goto L_0x003b;
                default: goto L_0x001e;
            }
        L_0x001e:
            return
        L_0x001f:
            boolean r0 = r1 instanceof X.K5P
            if (r0 == 0) goto L_0x001e
            android.view.View r1 = r3.A0N
            if (r1 == 0) goto L_0x001e
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x002d:
            r1 = 0
            goto L_0x000d
        L_0x002f:
            r1.A0V()
            return
        L_0x0033:
            r1.A0U()
            return
        L_0x0037:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A09(r1)
            return
        L_0x003b:
            X.8RF r2 = r1.A0d
            if (r2 == 0) goto L_0x0057
            r1 = 0
            X.8Rr r0 = new X.8Rr
            r0.<init>(r1)
            goto L_0x0053
        L_0x0046:
            X.8RF r2 = r1.A0d
            if (r2 == 0) goto L_0x0057
            X.9nj r0 = X.C388379nj.A00
            goto L_0x0053
        L_0x004d:
            X.8RF r2 = r1.A0d
            if (r2 == 0) goto L_0x0057
            X.8Rm r0 = X.C355818Rm.A00
        L_0x0053:
            r2.A0G(r0)
            return
        L_0x0057:
            java.lang.String r0 = "clipsTimelineEditorViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.DAu():void");
    }

    public final void Dfn() {
        Fragment fragment;
        C19140WMw wMw = this.A0C;
        if (wMw != null) {
            fragment = wMw.A0E.A0P(R.id.fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof ClipsStackedTimelineFragment) {
            FrameLayout frameLayout = this.A0P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = this.A01;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        }
    }

    public final boolean Es5() {
        return this.A0J;
    }

    public final boolean Esq() {
        int ordinal = this.A07.ordinal();
        if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (r3 == X.AnonymousClass8RM.A0C) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r12 = this;
            X.WMw r0 = r12.A0C
            if (r0 == 0) goto L_0x00e1
            X.0hq r1 = r0.A0E
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
        L_0x000d:
            boolean r0 = A0I(r12)
            r10 = 0
            if (r0 == 0) goto L_0x0019
            boolean r0 = r1 instanceof X.K5P
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            return r10
        L_0x0019:
            X.8RL r1 = r12.A0n
            X.AbR r0 = X.C40394AbR.A00
            r1.A0F(r0)
            X.80U r4 = r12.A0e
            X.80V r0 = X.AnonymousClass80V.ASSET_PICKER_IN_STACKED_TIMELINE
            boolean r0 = r4.CQ0(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0034
            X.8U4 r0 = new X.8U4
            r0.<init>()
            r4.E3H(r0)
        L_0x0033:
            return r2
        L_0x0034:
            X.87s r3 = r12.A0m
            X.4gw r0 = r3.A04
            if (r0 == 0) goto L_0x0083
            X.2Fk r0 = r3.A0H
            java.lang.Object r1 = r0.A02()
            X.8YK r0 = X.AnonymousClass8YK.GALLERY
            if (r1 == r0) goto L_0x0083
            X.9rv r1 = r12.A05
            X.9rv r0 = X.C390839rv.POST_CAPTURE
            if (r1 == r0) goto L_0x0083
            X.9rv r0 = X.C390839rv.MID_CAPTURE
            if (r1 != r0) goto L_0x011d
            int r0 = r3.A01
            if (r0 <= 0) goto L_0x011d
            com.instagram.common.session.UserSession r8 = r12.A0a
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321550579869187(0x810a4200012603, double:3.033233069629649E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x00e4
            android.content.Context r4 = r12.A0W
            X.AMQ r5 = new X.AMQ
            r5.<init>(r12)
            r6 = 0
            r0 = 36323332991233115(0x810be100002c5b, double:3.0343602737533913E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r3, r8, r0)
            boolean r11 = r0.booleanValue()
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            r7 = r6
            X.FFy r1 = X.C64170LRv.A01(r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r0 = r12.A0Y
            r1.A03(r0)
            return r2
        L_0x0083:
            X.80V r0 = X.AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE
            boolean r0 = r4.CQ0(r0)
            if (r0 == 0) goto L_0x009c
            X.8BN r1 = r12.A0k
            X.9nx r0 = X.C388519nx.A00
            r1.A03(r0)
            android.graphics.drawable.Drawable r0 = r1.A00()
            if (r0 == 0) goto L_0x0033
            r1.A02(r0)
            return r2
        L_0x009c:
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x00a4
            A0B(r12)
            return r2
        L_0x00a4:
            X.WMw r4 = r12.A0C
            if (r4 == 0) goto L_0x0018
            X.8RM r3 = r12.A07
            X.8RM r0 = X.AnonymousClass8RM.A09
            if (r3 == r0) goto L_0x00b3
            X.8RM r0 = X.AnonymousClass8RM.A0C
            r1 = 0
            if (r3 != r0) goto L_0x00b4
        L_0x00b3:
            r1 = 1
        L_0x00b4:
            boolean r0 = r12.A0L()
            if (r0 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x00df
            X.0hq r1 = r4.A0E
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r0 = r1.A0P(r0)
            boolean r0 = r0 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x00df
            r1 = 1
            boolean r0 = A0I(r12)
            if (r0 == 0) goto L_0x00d1
            r2 = 0
        L_0x00d1:
            boolean r0 = r4.A06(r2)
            if (r0 != 0) goto L_0x0018
            if (r1 == 0) goto L_0x0018
            X.8RM r0 = X.AnonymousClass8RM.A0B
            A0D(r12, r0)
            return r10
        L_0x00df:
            r1 = 0
            goto L_0x00d1
        L_0x00e1:
            r1 = 0
            goto L_0x000d
        L_0x00e4:
            r5 = 2131955375(0x7f130eaf, float:1.9547276E38)
            r4 = 2131955369(0x7f130ea9, float:1.9547264E38)
            r3 = 2131960820(0x7f1323f4, float:1.955832E38)
            android.content.Context r0 = r12.A0W
            X.8ab r1 = new X.8ab
            r1.<init>((android.content.Context) r0)
            r1.A09(r5)
            r1.A08(r4)
            X.AK6 r0 = new X.AK6
            r0.<init>(r12)
            r1.A0K(r0, r3)
            X.AK7 r0 = new X.AK7
            r0.<init>(r12)
            r1.A0D(r0)
            r1.A0r(r2)
            X.AJc r0 = new X.AJc
            r0.<init>(r12)
            r1.A0B(r0)
            android.app.Dialog r0 = r1.A02()
            X.AnonymousClass0fN.A00(r0)
            return r2
        L_0x011d:
            A08(r12)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r12.A0j
            r0.A0O()
            A0G(r12, r10, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.onBackPressed():boolean");
    }

    private final void A0H(boolean z) {
        AnonymousClass88W r0;
        if ((!A0L() || (r0 = (AnonymousClass88W) this.A0i.A00.A02()) == null || !0qQ.A0K(r0.A01, true)) && !this.A0J) {
            FrameLayout frameLayout = this.A0P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = this.A0P;
            if (frameLayout2 != null) {
                frameLayout2.setEnabled(z);
            }
            FrameLayout frameLayout3 = this.A0P;
            if (frameLayout3 != null) {
                float f = 0.3f;
                if (z) {
                    f = 1.0f;
                }
                frameLayout3.setAlpha(f);
            }
        }
    }

    public final void DAW() {
        27r A012;
        C59725JVj jVj;
        boolean z;
        String str;
        if (A0L()) {
            C19140WMw wMw = this.A0C;
            Integer num = null;
            if (wMw != null) {
                num = wMw.A07;
            }
            if (num == AnonymousClass05K.A00 && wMw != null) {
                wMw.A0F.A04 = Float.valueOf(0.0f);
            }
            this.A0I = false;
            AnonymousClass8RM r0 = this.A07;
            AnonymousClass8RM r1 = this.A08;
            if (r0 == r1) {
                A0D(this, r0);
            } else if (r1 == AnonymousClass8RM.A08) {
                A0G(this, false, true);
            } else {
                if (wMw != null) {
                    wMw.A01 = r1.A00;
                }
                A0D(this, r1);
                AnonymousClass8RM r12 = this.A08;
                if (r12 == AnonymousClass8RM.A09) {
                    A012 = 27p.A01(this.A0a);
                    if (A012.A0J() != null) {
                        jVj = C59725JVj.POST_CAPTURE;
                        z = true;
                        str = "TIMELINE_INCREASE_PREVIEW_SIZE_DRAG";
                    } else {
                        return;
                    }
                } else if (r12 == AnonymousClass8RM.A0C) {
                    A012 = 27p.A01(this.A0a);
                    if (A012.A0J() != null) {
                        jVj = C59725JVj.POST_CAPTURE;
                        z = true;
                        str = "TIMELINE_DECREASE_PREVIEW_SIZE_DRAG";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                27r.A08(jVj, A012, str, z);
            }
        }
    }

    public final void onDestroyView() {
        ClipsTimelineEditorDrawerControllerLifecycleUtil.cleanupReferences(this);
    }

    public ClipsTimelineEditorDrawerController(View view, ViewGroup viewGroup, Fragment fragment, 293 r24, C270564gw r25, UserSession userSession, C71662eb r27, C357638Yz r28, TargetViewSizeProvider targetViewSizeProvider, C3499582p r30, AnonymousClass8RA r31, AnonymousClass8R7 r32, AnonymousClass80U r33, ClipsAudioMixingDrawerController clipsAudioMixingDrawerController, C352328Cx r35, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C2801950r r37, C3495780x r38, InteractiveDrawableContainer interactiveDrawableContainer, AnonymousClass0eK r40, AnonymousClass0eK r41, boolean z, boolean z2, boolean z3) {
        0hq supportFragmentManager;
        float A002;
        float A003;
        float f;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        Fragment fragment2 = fragment;
        0qQ.A0B(fragment2, 5);
        C3495780x r1 = r38;
        0qQ.A0B(r1, 8);
        C357638Yz r8 = r28;
        0qQ.A0B(r8, 9);
        C2801950r r4 = r37;
        0qQ.A0B(r4, 13);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 17);
        C352328Cx r10 = r35;
        0qQ.A0B(r10, 19);
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 24);
        this.A0a = userSession2;
        this.A0e = r33;
        this.drawerContainerViewStubHolder = r27;
        this.postCaptureVideoContainer = view;
        C3499582p r5 = r30;
        this.A0c = r5;
        this.A14 = r31;
        this.A0s = r1;
        this.A12 = r8;
        this.A0f = clipsAudioMixingDrawerController;
        this.A0w = r40;
        this.A0x = r41;
        this.A0q = r4;
        this.A1E = z;
        this.A0Z = r24;
        this.A0b = targetViewSizeProvider2;
        this.A19 = clipsCreationDraftViewModel;
        this.A18 = r10;
        this.A1A = interactiveDrawableContainer;
        this.A15 = r32;
        this.A1D = z2;
        this.A1C = z3;
        this.A0X = viewGroup2;
        FragmentActivity requireActivity = fragment2.requireActivity();
        this.A0Y = requireActivity;
        this.A0W = fragment2.requireContext();
        this.A0r = new AnonymousClass8RD(fragment2, userSession2);
        AnonymousClass861 A004 = new 2YN(requireActivity).A00(AnonymousClass860.class).A00("post_capture");
        this.A0t = A004;
        ClipsCreationViewModel A005 = new 2YN(new C3500182v(userSession2, requireActivity), requireActivity).A00(ClipsCreationViewModel.class);
        this.A0j = A005;
        this.A0o = new 2YN(new AnonymousClass8RE(requireActivity, A005.A0C, A004.A0G, userSession2), requireActivity).A00(AnonymousClass8RF.class);
        AnonymousClass8RL A006 = new 2YN(new AnonymousClass8RK(requireActivity, userSession2), requireActivity).A00(AnonymousClass8RL.class);
        this.A17 = A006;
        this.A0n = A006;
        this.A16 = A006;
        this.A0m = new 2YN(new C3511287r(requireActivity, userSession2), requireActivity).A00(C3511387s.class);
        this.A0i = new 2YN(new C3507085w(userSession2, requireActivity), requireActivity).A00(C3507185x.class);
        Application application = requireActivity.getApplication();
        0qQ.A07(application);
        this.A13 = new 2YN(new AnonymousClass85R(application, userSession2), requireActivity).A00(ClipsAssetHubViewModel.class);
        this.A0p = new 2YN(new AnonymousClass8M0(requireActivity, userSession2, A005), requireActivity).A00(AnonymousClass8M1.class);
        this.A0l = new 2YN(new C354868Nr(), requireActivity).A00(C354878Ns.class);
        this.A10 = AnonymousClass0eN.A01(new AnonymousClass9LJ(fragment2, 34));
        this.A0k = new 2YN(new AnonymousClass8BM(requireActivity, userSession2), fragment2).A00(AnonymousClass8BN.class);
        this.A0u = new ArrayList();
        if (182.A06(0Tu.A05, userSession2, 36327387441215897L)) {
            supportFragmentManager = fragment2.getChildFragmentManager();
        } else {
            supportFragmentManager = requireActivity.getSupportFragmentManager();
        }
        0qQ.A0A(supportFragmentManager);
        this.A11 = supportFragmentManager;
        AnonymousClass8RM r0 = AnonymousClass8RM.A0C;
        this.A07 = r0;
        this.A08 = r0;
        this.A1B = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 31));
        this.A0h = AnonymousClass8A1.A01(userSession2);
        this.A0d = r5.A02;
        this.A0g = new AnonymousClass8RN(this);
        this.A0z = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 33));
        AnonymousClass80V[] r02 = {AnonymousClass80V.ASSET_PICKER_IN_STACKED_TIMELINE, AnonymousClass80V.COMPOSE_TEXT_IN_STACKED_TIMELINE, AnonymousClass80V.CLIPS_PROMPT_STICKER_COMPOSE, AnonymousClass80V.KARAOKE_STICKER_COMPOSE, AnonymousClass80V.MUSIC_PICK_STICKER_COMPOSE, AnonymousClass80V.POLLING_STICKER_COMPOSE, AnonymousClass80V.PROMPT_STICKER_COMPOSE, AnonymousClass80V.QUESTION_STICKER_COMPOSE, AnonymousClass80V.QUIZ_STICKER_COMPOSE, AnonymousClass80V.SLIDER_STICKER_COMPOSE};
        0qQ.A0B(r02, 0);
        this.A0v = 03t.A0K(r02);
        for (AnonymousClass8RM r82 : AnonymousClass8RM.values()) {
            AnonymousClass8RM r42 = AnonymousClass8RM.A0B;
            FragmentActivity fragmentActivity = this.A0Y;
            if (r82 == r42) {
                Context context = this.A0W;
                UserSession userSession3 = this.A0a;
                int i = fragmentActivity.getResources().getDisplayMetrics().heightPixels;
                float dimension = context.getResources().getDimension(R.dimen.ad4ad_button_bottom_margin);
                float dimension2 = context.getResources().getDimension(R.dimen.abc_edit_text_inset_top_material) + 0nA.A04(context, 44);
                float dimension3 = context.getResources().getDimension(R.dimen.ad4ad_button_bottom_margin) + 0nA.A04(context, 44);
                if (182.A06(0Tu.A06, userSession3, 36327327311214933L)) {
                    f = context.getResources().getDimension(R.dimen.abc_edit_text_inset_top_material) + context.getResources().getDimension(R.dimen.account_group_management_clickable_width);
                } else {
                    f = 0.0f;
                }
                A003 = (((dimension2 + dimension3) + dimension) + f) / ((float) i);
            } else {
                Context applicationContext = fragmentActivity.getApplicationContext();
                0qQ.A07(applicationContext);
                A003 = AnonymousClass8RO.A00(this.A0Y, A00(applicationContext, r82));
            }
            r82.A00 = A003;
        }
        for (AnonymousClass8RP r7 : AnonymousClass8RP.values()) {
            if (r7.ordinal() == 3) {
                float f2 = AnonymousClass8RM.A09.A00;
                float f3 = AnonymousClass8RM.A0B.A00;
                A002 = ((f2 - f3) / 4.0f) + f3;
            } else {
                A002 = AnonymousClass8RO.A00(this.A0Y, r7.A01);
            }
            r7.A00 = A002;
        }
        if (AnonymousClass8IK.A05(this.A0a) || A0I(this)) {
            this.A0e.A7w(new AfY(this));
            InteractiveDrawableContainer interactiveDrawableContainer2 = this.A1A;
            if (interactiveDrawableContainer2 != null) {
                interactiveDrawableContainer2.A0y(this);
            }
        }
        this.A0j.A0G.A06(fragment2, new AnonymousClass8RQ(new AnonymousClass9M5(4, this, r25)));
        this.A0j.A0C.A06(fragment2, new AnonymousClass8RQ(new C377149Ks(this, 48)));
        AnonymousClass11O.A03(AnonymousClass07a.A00(fragment2.getViewLifecycleOwner()), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 36), this.A0o.A0A));
        293 r12 = this.A0Z;
        if (r12 != null) {
            this.A0m.A03 = r12;
        }
        this.A0m.A0H.A06(fragment2, new AnonymousClass8RQ(new C377149Ks(this, 49)));
        this.A0n.A00.A06(fragment2, new C319096q2(new C355888Rt(this)));
        AnonymousClass11O.A03(AnonymousClass07a.A00(fragment2.getViewLifecycleOwner()), new C61860pz(new C376879Jr(this, (AnonymousClass4D7) null, 18), this.A13.A09));
        AnonymousClass11O.A03(AnonymousClass07a.A00(fragment2.getViewLifecycleOwner()), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 37), this.A0m.A0O));
        AnonymousClass11O.A03(C71772f0.A00(fragment2.getLifecycle()), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 38), this.A18.A01));
        AnonymousClass11O.A03(C71772f0.A00(fragment2.getLifecycle()), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 35), this.A16.A02));
    }
}
