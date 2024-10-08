package com.instagram.creation.fragment;

import X.00k;
import X.05G;
import X.0Tu;
import X.0eO;
import X.0kD;
import X.0kx;
import X.0qQ;
import X.0sl;
import X.182;
import X.1Eo;
import X.1Ng;
import X.1wn;
import X.27p;
import X.27r;
import X.28t;
import X.2Rw;
import X.2Yu;
import X.2eK;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass12U;
import X.AnonymousClass1Nd;
import X.AnonymousClass30D;
import X.AnonymousClass3Q2;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass6SR;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass8GF;
import X.C227642jf;
import X.C234502xy;
import X.C240053Jk;
import X.C2604245p;
import X.C267834cI;
import X.C267844cJ;
import X.C273514mi;
import X.C273574mo;
import X.C3499582p;
import X.C3499682q;
import X.C357318Xk;
import X.C378369Pn;
import X.C378459Pw;
import X.C51965G9l;
import X.C51967G9n;
import X.C59671JTb;
import X.C59721JVf;
import X.C59725JVj;
import X.C59732JVq;
import X.C59888JbD;
import X.C59889JbE;
import X.C60188Jh7;
import X.C60323JjS;
import X.C60439JlX;
import X.C60715Jq4;
import X.C61714KJf;
import X.C61866KPf;
import X.C61867KPg;
import X.C62499Kgp;
import X.C63126Kru;
import X.C63270KuF;
import X.C64132LPg;
import X.C64626LfE;
import X.C64698LgT;
import X.C64833Liv;
import X.C64905Lk5;
import X.C64982LlL;
import X.C65143Lo5;
import X.C66218MIz;
import X.C66291MMa;
import X.C66534MVo;
import X.C66539MVt;
import X.C66545MVz;
import X.DbS;
import X.DbT;
import X.DbW;
import X.DbZ;
import X.JTO;
import X.JTP;
import X.JTS;
import X.JWB;
import X.JWE;
import X.JWN;
import X.KB5;
import X.LG9;
import X.LHq;
import X.LHt;
import X.LOy;
import X.LY1;
import X.LYB;
import X.MHN;
import X.MMQ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.ml.VisualFeatureStore;
import com.instagram.creation.toolbar.CreationToolbarView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AlbumEditFragment extends AnonymousClass4DH implements AnonymousClass4DR {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ImageView A08;
    public ViewFlipper A09;
    public RecyclerView A0A;
    public ColorFilterAlphaImageView A0B;
    public IgImageView A0C;
    public KB5 A0D;
    public C66545MVz A0E;
    public C60715Jq4 A0F;
    public C3499582p A0G;
    public C3499682q A0H;
    public C357318Xk A0I;
    public VisualFeatureStore A0J;
    public LG9 A0K;
    public C60439JlX A0L;
    public LOy A0M;
    public C273514mi A0N;
    public CreationToolbarView A0O;
    public C234502xy A0P;
    public C267834cI A0Q;
    public Map A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public 1wn A0W;
    public boolean A0X;
    public boolean A0Y;
    public final String A0Z;
    public final String A0a;
    public final AnonymousClass0eM A0b;
    public final AnonymousClass0eM A0c;
    public final AnonymousClass0eM A0d = C227642jf.A02(this);
    public final AnonymousClass0eM A0e;
    public final AnonymousClass0eM A0f;

    public static final void A05(ImageView imageView, AlbumEditFragment albumEditFragment, int i) {
        ImageView imageView2 = imageView;
        if (imageView != null) {
            AlbumEditFragment albumEditFragment2 = albumEditFragment;
            if (albumEditFragment2.A0K == null) {
                C267834cI r1 = albumEditFragment2.A0Q;
                if (r1 != null) {
                    C3499682q r0 = albumEditFragment2.A0H;
                    if (r0 != null) {
                        AnonymousClass3Q2 A052 = JWE.A05(r1, r0);
                        if (A052 != null) {
                            AnonymousClass0eM r02 = albumEditFragment2.A0d;
                            UserSession A0l = AnonymousClass7TE.A0l(r02);
                            Context themedContext = albumEditFragment2.getThemedContext();
                            FragmentActivity requireActivity = albumEditFragment2.requireActivity();
                            boolean A062 = 182.A06(0Tu.A06, AnonymousClass7TE.A0l(r02), 36326541331871556L);
                            C65143Lo5 lo5 = new C65143Lo5(albumEditFragment2, A052);
                            C3499682q r11 = albumEditFragment2.A0H;
                            if (r11 != null) {
                                C267834cI r14 = albumEditFragment2.A0Q;
                                if (r14 != null) {
                                    LG9 lg9 = new LG9(requireActivity, themedContext, imageView2, albumEditFragment2, A0l, r11, lo5, A052, r14, i, A062);
                                    albumEditFragment2.A0K = lg9;
                                    lg9.A00(imageView2);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    0qQ.A0F("creationCameraSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("pendingMediaProvider");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, com.instagram.creation.fragment.AlbumEditFragment, java.lang.Object] */
    public final void A0N() {
        String str;
        A0F(false);
        C273514mi r0 = this.A0N;
        if (r0 == null) {
            str = "provider";
        } else {
            A07(r0.BQ1());
            C66545MVz mVz = this.A0E;
            if (mVz == null) {
                str = "reboundHorizontalScrollView";
            } else {
                int Atv = mVz.Atv();
                int i = 1;
                C3499682q r02 = this.A0H;
                if (r02 == null) {
                    str = "creationCameraSession";
                } else {
                    if (Atv >= DbT.A02(r02.Co4(), 1)) {
                        i = 0;
                    }
                    A04(Atv + i);
                    UserSession A0l = AnonymousClass7TE.A0l(this.A0d);
                    if (182.A06(DbS.A0J(A0l, 0), A0l, 36319355851775146L)) {
                        1Eo.A05(new AnonymousClass12U().AOJ(1632833315, 3), new MHN(this, (AnonymousClass4D7) null, 14), DbW.A0E(this));
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onAttach(Context context) {
        String str;
        0qQ.A0B(context, 0);
        AlbumEditFragment.super.onAttach(context);
        C267844cJ requireActivity = requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.creation.base.sessionprovider.CameraSessionProvider");
        C3499582p Ajn = requireActivity.Ajn();
        this.A0G = Ajn;
        if (Ajn == null) {
            str = "cameraSession";
        } else {
            this.A0H = Ajn.A00();
            C273514mi requireActivity2 = requireActivity();
            0qQ.A0C(requireActivity2, "null cannot be cast to non-null type com.instagram.creation.photo.edit.ui.creationprovider.CreationProvider");
            this.A0N = requireActivity2;
            C267834cI requireActivity3 = requireActivity();
            0qQ.A0C(requireActivity3, "null cannot be cast to non-null type com.instagram.pendingmedia.model.PendingMediaProvider");
            this.A0Q = requireActivity3;
            C60323JjS jjS = (C60323JjS) this.A0f.getValue();
            C267834cI r0 = this.A0Q;
            if (r0 == null) {
                str = "pendingMediaProvider";
            } else {
                jjS.A03 = C51965G9l.A0v(r0);
                C3499682q r02 = this.A0H;
                if (r02 == null) {
                    str = "creationCameraSession";
                } else if (r02.Co4().isEmpty()) {
                    DbT.A1J(this);
                    return;
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: com.instagram.creation.fragment.AlbumEditFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: com.instagram.creation.fragment.AlbumEditFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: X.4DH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x079f  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x07c6  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x07dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r30, android.os.Bundle r31) {
        /*
            r29 = this;
            r0 = 0
            r3 = r30
            X.0qQ.A0B(r3, r0)
            r1 = r29
            r2 = r31
            super.onViewCreated(r3, r2)
            X.0eM r2 = r1.A0d
            r28 = r2
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r28)
            X.0Tu r2 = X.0Tu.A05
            r4 = 36327812642126553(0x810ff400003ad9, double:3.037193223016508E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x0035
            r4 = 2131439831(0x7f0b30d7, float:1.8501628E38)
            android.view.ViewGroup r6 = X.DbX.A0I(r3, r4)
            android.view.ViewTreeObserver r5 = r6.getViewTreeObserver()
            X.IDw r4 = new X.IDw
            r4.<init>(r6, r1)
            r5.addOnGlobalLayoutListener(r4)
        L_0x0035:
            X.4mi r4 = r1.A0N
            r11 = 0
            if (r4 == 0) goto L_0x084f
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r10 = r4.BQ1()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            boolean r4 = X.JWB.A01(r4)
            r9 = 1
            if (r4 == 0) goto L_0x004b
            r10.A02 = r9
        L_0x004b:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r28)
            r4 = 36328590031207875(0x8110a900003dc3, double:3.0376848470018304E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x084b
            X.KhI r4 = X.C62526KhI.BACK_CARROT
        L_0x005c:
            r10.setupBackButton(r4)
            android.widget.LinearLayout r12 = r10.A0A
            r1.A07 = r12
            if (r12 == 0) goto L_0x0068
            r12.removeAllViews()
        L_0x0068:
            r1.A07(r10)
            android.content.Context r4 = r1.getThemedContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r4)
            r5 = 2131627970(0x7f0e0fc2, float:1.888322E38)
            android.view.ViewGroup r4 = r1.A07
            r6.inflate(r5, r4)
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            r4 = 2131429316(0x7f0b07c4, float:1.8480301E38)
            android.view.View r4 = r5.requireViewById(r4)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r4 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r4
            r1.A0B = r4
            r1.A0F(r9)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            boolean r4 = X.2Ht.A04(r4)
            if (r4 == 0) goto L_0x00be
            r5 = 2131238227(0x7f081d53, float:1.8092727E38)
            r4 = 2131972502(0x7f135196, float:1.9582013E38)
            android.widget.ImageView r6 = r1.A02(r12, r5, r4)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            boolean r4 = X.JWB.A01(r4)
            if (r4 == 0) goto L_0x00b9
            android.content.res.Resources r5 = X.DbV.A05(r1)
            r4 = 2131100036(0x7f060184, float:1.7812442E38)
            int r4 = r5.getColor(r4)
            r6.setColorFilter(r4)
        L_0x00b9:
            r4 = 19
            X.LYB.A00(r6, r4, r1)
        L_0x00be:
            X.0eM r6 = r1.A0c
            boolean r4 = X.AnonymousClass7TF.A1Z(r6)
            if (r4 != 0) goto L_0x012f
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r28)
            X.0qQ.A0B(r7, r0)
            r4 = 36323113948162919(0x810bae00042b67, double:3.034221750033784E-306)
            boolean r4 = X.182.A06(r2, r7, r4)
            if (r4 == 0) goto L_0x012f
            r4 = 36323113947900771(0x810bae00002b63, double:3.034221749868E-306)
            boolean r4 = X.182.A06(r2, r7, r4)
            if (r4 == 0) goto L_0x012f
            boolean r4 = X.C60323JjS.A01(r1)
            if (r4 != 0) goto L_0x012f
            r5 = 2131238898(0x7f081ff2, float:1.8094088E38)
            r4 = 2131975081(0x7f135ba9, float:1.9587244E38)
            android.widget.ImageView r4 = r1.A02(r12, r5, r4)
            r1.A02 = r4
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r28)
            X.0qQ.A0B(r7, r0)
            r4 = 36323113948359530(0x810bae00072b6a, double:3.0342217501581213E-306)
            boolean r4 = X.182.A06(r2, r7, r4)
            if (r4 == 0) goto L_0x0126
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            X.0xa r5 = X.AnonymousClass7TE.A0q(r4)
            java.lang.String r4 = "dismissed_feed_text_tool_badge"
            boolean r4 = r5.getBoolean(r4, r0)
            if (r4 != 0) goto L_0x0126
            android.view.View r5 = r1.A02
            boolean r4 = r5 instanceof com.instagram.common.ui.base.IgSimpleImageView
            if (r4 == 0) goto L_0x0126
            com.instagram.common.ui.base.IgSimpleImageView r5 = (com.instagram.common.ui.base.IgSimpleImageView) r5
            if (r5 == 0) goto L_0x0126
            r5.A05 = r9
            r5.invalidate()
        L_0x0126:
            android.view.View r5 = r1.A02
            if (r5 == 0) goto L_0x012f
            r4 = 20
            X.LYB.A00(r5, r4, r1)
        L_0x012f:
            boolean r4 = X.AnonymousClass7TF.A1Z(r6)
            if (r4 != 0) goto L_0x0169
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r28)
            X.0qQ.A0B(r7, r0)
            r4 = 36323113948293993(0x810bae00062b69, double:3.0342217501166755E-306)
            boolean r4 = X.182.A06(r2, r7, r4)
            if (r4 == 0) goto L_0x0169
            r4 = 36323113948031845(0x810bae00022b65, double:3.034221749950892E-306)
            boolean r4 = X.182.A06(r2, r7, r4)
            if (r4 == 0) goto L_0x0169
            boolean r4 = X.C60323JjS.A01(r1)
            if (r4 != 0) goto L_0x0169
            r5 = 2131238850(0x7f081fc2, float:1.809399E38)
            r4 = 2131953207(0x7f130637, float:1.9542878E38)
            android.widget.ImageView r5 = r1.A02(r12, r5, r4)
            r1.A06 = r5
            r4 = 21
            X.LYB.A00(r5, r4, r1)
        L_0x0169:
            boolean r4 = X.AnonymousClass7TF.A1Z(r6)
            if (r4 != 0) goto L_0x01a3
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r28)
            X.0qQ.A0B(r6, r0)
            r4 = 36323113948228456(0x810bae00052b68, double:3.0342217500752296E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x01a3
            r4 = 36323113948097382(0x810bae00032b66, double:3.034221749992338E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x01a3
            boolean r4 = X.C60323JjS.A01(r1)
            if (r4 != 0) goto L_0x01a3
            r5 = 2131238638(0x7f081eee, float:1.809356E38)
            r4 = 2131962901(0x7f132c15, float:1.956254E38)
            android.widget.ImageView r5 = r1.A02(r12, r5, r4)
            r1.A04 = r5
            r4 = 22
            X.LYB.A00(r5, r4, r1)
        L_0x01a3:
            boolean r4 = A0I(r1)
            if (r4 == 0) goto L_0x01be
            r5 = 2131238252(0x7f081d6c, float:1.8092777E38)
            r4 = 2131962420(0x7f132a34, float:1.9561565E38)
            android.widget.ImageView r5 = r1.A02(r12, r5, r4)
            r4 = 2131432748(0x7f0b152c, float:1.8487262E38)
            r5.setId(r4)
            r4 = 23
            X.LYB.A00(r5, r4, r1)
        L_0x01be:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r28)
            r4 = 36318471089559685(0x81077500141885, double:3.0312855875578075E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x01e3
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            X.8qK r7 = new X.8qK
            r7.<init>(r4)
            android.content.Context r6 = r1.requireContext()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r28)
            X.8qM r4 = X.C367208qM.A03
            r7.A00(r6, r5, r4)
        L_0x01e3:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r28)
            r4 = 36326777555007452(0x810f03000037dc, double:3.036538629754427E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            r15 = 8
            if (r4 == 0) goto L_0x0839
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r28)
            r4 = 2131439829(0x7f0b30d5, float:1.8501624E38)
            androidx.recyclerview.widget.RecyclerView r5 = X.JTR.A0c(r3, r4)
            X.Lk8 r4 = new X.Lk8
            r4.<init>(r5, r6)
            r1.A0E = r4
            r4.setVisibility(r0)
            r4 = 2131439830(0x7f0b30d6, float:1.8501626E38)
            X.DbT.A1F(r3, r4, r15)
        L_0x020f:
            X.MVz r8 = r1.A0E
            if (r8 != 0) goto L_0x021d
            java.lang.String r0 = "reboundHorizontalScrollView"
        L_0x0215:
            X.0qQ.A0F(r0)
        L_0x0218:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x021d:
            boolean r4 = r1.A0S
            if (r4 == 0) goto L_0x0230
            android.view.View r5 = r1.requireView()
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            int r4 = r4.height
            int r4 = r4 / 2
            X.0nA.A0e(r5, r4)
        L_0x0230:
            r6 = 4628574517030027264(0x403c000000000000, double:28.0)
            r4 = 4624633867356078080(0x402e000000000000, double:15.0)
            X.2co r13 = X.C71392co.A04(r6, r4)
            r6 = 0
            r4 = 4615739258092021350(0x400e666666666666, double:3.8)
            X.2co r4 = X.C71392co.A04(r6, r4)
            X.0qQ.A0A(r13)
            r8.ElZ(r13)
            X.0qQ.A0A(r4)
            r8.EjL(r4)
            android.content.Context r4 = r1.requireContext()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledMinimumFlingVelocity()
            float r5 = (float) r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r4
            r8.EU0(r5)
            androidx.fragment.app.FragmentActivity r19 = r1.requireActivity()
            android.content.Context r17 = r1.getThemedContext()
            X.4mi r13 = r1.A0N
            if (r13 == 0) goto L_0x084f
            X.4cI r7 = r1.A0Q
            if (r7 != 0) goto L_0x0275
            java.lang.String r0 = "pendingMediaProvider"
            goto L_0x0215
        L_0x0275:
            X.82p r6 = r1.A0G
            if (r6 == 0) goto L_0x0835
            X.82q r4 = r1.A0H
            if (r4 != 0) goto L_0x0280
            java.lang.String r0 = "creationCameraSession"
            goto L_0x0215
        L_0x0280:
            X.JWE r4 = (X.JWE) r4
            com.instagram.creation.base.CreationSession r14 = r4.A01
            androidx.fragment.app.FragmentActivity r5 = r1.getActivity()
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.creation.album.AlbumCoverFrameRenderProvider"
            X.0qQ.A0C(r5, r4)
            X.4mp r5 = (X.C273584mp) r5
            X.KB5 r4 = new X.KB5
            r20 = r5
            r21 = r8
            r22 = r14
            r23 = r6
            r24 = r1
            r25 = r1
            r26 = r13
            r27 = r7
            r16 = r4
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.A0D = r4
            r1.registerLifecycleListener(r4)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r28)
            r4 = 36326773260040155(0x810f02000037db, double:3.036535913599814E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x02c3
            int r4 = r8.Atv()
            r1.A04(r4)
        L_0x02c3:
            r4 = 2131430973(0x7f0b0e3d, float:1.8483662E38)
            android.view.View r4 = r3.requireViewById(r4)
            android.widget.ViewFlipper r4 = (android.widget.ViewFlipper) r4
            r1.A09 = r4
            boolean r4 = X.C60323JjS.A01(r1)
            if (r4 == 0) goto L_0x0320
            android.widget.ViewFlipper r4 = r1.A09
            if (r4 != 0) goto L_0x02df
            java.lang.String r17 = "creationMainActionsFlipper"
        L_0x02da:
            X.0qQ.A0F(r17)
            goto L_0x0218
        L_0x02df:
            r4.setVisibility(r15)
            r4 = 2131430965(0x7f0b0e35, float:1.8483646E38)
            android.view.ViewStub r5 = X.JTR.A0X(r3, r4)
            r4 = 2131624691(0x7f0e02f3, float:1.8876569E38)
            android.view.View r5 = X.JTP.A0H(r5, r4)
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.creation.toolbar.CreationToolbarView"
            X.0qQ.A0C(r5, r4)
            com.instagram.creation.toolbar.CreationToolbarView r5 = (com.instagram.creation.toolbar.CreationToolbarView) r5
            r1.A0O = r5
            if (r5 == 0) goto L_0x02fe
            r5.setVisibility(r0)
        L_0x02fe:
            com.instagram.creation.toolbar.CreationToolbarView r5 = r1.A0O
            if (r5 == 0) goto L_0x030d
            X.0eM r4 = r1.A0b
            java.lang.Object r4 = r4.getValue()
            X.Jh7 r4 = (X.C60188Jh7) r4
            r5.setViewModel(r4)
        L_0x030d:
            X.0eM r4 = r1.A0b
            java.lang.Object r4 = r4.getValue()
            X.Jh7 r4 = (X.C60188Jh7) r4
            X.0r6 r5 = r4.A04
            r4 = 49
            X.MGV r4 = X.MGV.A01(r1, r11, r4)
            X.DbZ.A1C(r1, r4, r5)
        L_0x0320:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r28)
            r4 = 36324647251292359(0x810d13000130c7, double:3.035191417106958E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x0385
            r4 = 2131430979(0x7f0b0e43, float:1.8483674E38)
            android.view.View r5 = r3.requireViewById(r4)
            X.0qQ.A07(r5)
            r4 = 16
            X.LYB.A00(r5, r4, r1)
        L_0x033e:
            r1.A05 = r5
            android.view.View r4 = r1.A00()
            r1.A00 = r4
            android.view.View r4 = r1.A01(r3)
            r1.A01 = r4
            X.0eM r4 = r1.A0f
            r27 = r4
            java.lang.Object r7 = r27.getValue()
            X.JjS r7 = (X.C60323JjS) r7
            X.82q r4 = r7.A08
            X.JWE r4 = (X.JWE) r4
            com.instagram.creation.base.CreationSession r4 = r4.A01
            java.util.List r4 = r4.A05()
            X.0qQ.A07(r4)
            java.util.Iterator r8 = r4.iterator()
        L_0x0367:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0387
            java.lang.Object r6 = r8.next()
            com.instagram.creation.base.PhotoSession r6 = (com.instagram.creation.base.PhotoSession) r6
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r5 = r6.A07
            if (r5 != 0) goto L_0x0380
            com.instagram.common.session.UserSession r4 = r7.A06
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r4 = X.C364978mK.A01(r4, r0)
            r6.A07 = r4
            goto L_0x0367
        L_0x0380:
            r4 = 3
            r5.EWl(r4, r9)
            goto L_0x0367
        L_0x0385:
            r5 = 0
            goto L_0x033e
        L_0x0387:
            X.82q r4 = r1.A0H
            java.lang.String r17 = "creationCameraSession"
            r13 = 0
            if (r4 == 0) goto L_0x02da
            java.util.List r4 = r4.Co4()
            boolean r4 = X.AnonymousClass7TE.A1b(r4)
            if (r4 == 0) goto L_0x03cc
            java.lang.Object r8 = r27.getValue()
            X.JjS r8 = (X.C60323JjS) r8
            X.82q r4 = r1.A0H
            if (r4 == 0) goto L_0x02da
            java.util.List r4 = r4.Co4()
            java.lang.Object r7 = r4.get(r0)
            com.instagram.creation.base.MediaSession r7 = (com.instagram.creation.base.MediaSession) r7
            X.4cI r6 = r1.A0Q
            if (r6 == 0) goto L_0x0652
            android.content.Context r19 = r1.requireContext()
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r28)
            r4 = 36323457545284771(0x810bfe00002ca3, double:3.0344390422371975E-306)
            boolean r23 = X.182.A06(r2, r14, r4)
            r18 = r8
            r20 = r7
            r21 = r6
            r22 = r9
            r18.A03(r19, r20, r21, r22, r23)
        L_0x03cc:
            boolean r4 = X.C60323JjS.A01(r1)
            if (r4 != 0) goto L_0x04c6
            float r4 = androidx.recyclerview.widget.RecyclerView.A1E
            android.content.Context r4 = r1.getThemedContext()
            X.Jq4 r7 = new X.Jq4
            r7.<init>(r4)
            r8 = -1
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r8, r8)
            r7.setLayoutParams(r4)
            r7.setClipChildren(r0)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            X.C63124Krs.A00(r4)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            X.LRo r4 = X.C59953JcJ.A00(r4)
            r7.setBlurIconCache(r4)
            r7.A05 = r9
            r7.A06 = r9
            r4 = 2131432859(0x7f0b159b, float:1.8487487E38)
            android.view.ViewGroup r6 = X.DbX.A0I(r3, r4)
            r6.addView(r7)
            java.lang.Object r4 = r27.getValue()
            X.JjS r4 = (X.C60323JjS) r4
            java.util.List r5 = r4.A0A
            java.lang.Object r4 = r27.getValue()
            X.JjS r4 = (X.C60323JjS) r4
            r7.A02 = r4
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            r7.setEffects(r5, r0, r4)
            X.82q r4 = r1.A0H
            if (r4 == 0) goto L_0x02da
            java.util.List r4 = r4.Co4()
            boolean r4 = X.AnonymousClass7TE.A1b(r4)
            if (r4 == 0) goto L_0x047c
            java.util.List r4 = r7.getTileFrames()
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r4.iterator()
        L_0x043a:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x0453
            java.lang.Object r5 = r16.next()
            r4 = r5
            X.Jeb r4 = (X.C60060Jeb) r4
            X.Jez r4 = r4.A05
            int r4 = X.C66568MWw.A00(r4)
            if (r4 == r8) goto L_0x043a
            r14.add(r5)
            goto L_0x043a
        L_0x0453:
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r14)
            java.util.Iterator r14 = r14.iterator()
        L_0x045b:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x046d
            java.lang.Object r5 = r14.next()
            X.Jeb r5 = (X.C60060Jeb) r5
            X.Jez r4 = r5.A05
            X.C66568MWw.A03(r5, r4, r8)
            goto L_0x045b
        L_0x046d:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            X.LRo r5 = X.C59953JcJ.A00(r4)
            android.content.Context r4 = r1.requireContext()
            r5.A07(r4, r8)
        L_0x047c:
            boolean r4 = A0I(r1)
            if (r4 == 0) goto L_0x04ad
            boolean r4 = r1.A0S
            if (r4 == 0) goto L_0x04ad
            android.content.Context r4 = r1.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r4)
            r4 = 2131623969(0x7f0e0021, float:1.8875104E38)
            android.view.View r5 = r5.inflate(r4, r6, r9)
            r4 = 2131429291(0x7f0b07ab, float:1.848025E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r5, r4)
            r4 = 2131429299(0x7f0b07b3, float:1.8480267E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r5, r4)
            r4 = 13
            X.LYB.A00(r6, r4, r1)
            r4 = 14
            X.LYB.A00(r5, r4, r1)
        L_0x04ad:
            r1.A0F = r7
            boolean r4 = A0I(r1)
            if (r4 == 0) goto L_0x063b
            boolean r4 = r1.A0T
            if (r4 == 0) goto L_0x04c6
            android.view.ViewTreeObserver r6 = r7.getViewTreeObserver()
            r5 = 2
            X.LYs r4 = new X.LYs
            r4.<init>(r5, r7, r1)
            r6.addOnGlobalLayoutListener(r4)
        L_0x04c6:
            boolean r4 = r1.A0G()
            if (r4 == 0) goto L_0x051f
            java.lang.Object r8 = r27.getValue()
            X.JjS r8 = (X.C60323JjS) r8
            com.instagram.common.session.UserSession r7 = r8.A06
            X.82q r6 = r8.A08
            r5 = 9
            X.MP4 r4 = new X.MP4
            r4.<init>(r8, r5)
            X.MKZ r22 = X.MKZ.A00
            r18 = r1
            r19 = r7
            r20 = r6
            r21 = r11
            r23 = r4
            X.C63197Kt4.A00(r18, r19, r20, r21, r22, r23)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r28)
            boolean r4 = X.AnonymousClass30D.A0F(r4)
            if (r4 == 0) goto L_0x051f
            android.content.Context r18 = r1.requireContext()
            com.instagram.common.session.UserSession r19 = X.AnonymousClass7TE.A0l(r28)
            android.content.Context r6 = r1.requireContext()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r28)
            X.2xu r4 = new X.2xu
            r4.<init>(r6, r5)
            java.lang.String r22 = "AlbumEditFragment"
            r20 = r11
            r21 = r4
            r23 = r0
            r24 = r9
            r25 = r9
            r26 = r0
            X.2xy r4 = X.C234472xv.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A0P = r4
        L_0x051f:
            boolean r4 = A0I(r1)
            if (r4 == 0) goto L_0x0663
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r28)
            X.0qQ.A0B(r6, r0)
            r4 = 36319355851775146(0x81084300041caa, double:3.0318451147455166E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x0630
            X.0xx r6 = X.DbW.A0E(r1)
            X.12U r7 = new X.12U
            r7.<init>()
            r5 = 1632833315(0x61530f23, float:2.433346E20)
            r4 = 3
            X.0nV r5 = r7.AOJ(r5, r4)
            r22 = 35
            r23 = 42
            X.MHJ r4 = new X.MHJ
            r18 = r4
            r19 = r1
            r20 = r3
            r21 = r11
            r18.<init>((java.lang.Object) r19, (java.lang.Object) r20, (X.AnonymousClass4D7) r21, (int) r22, (int) r23)
            X.1Eo.A05(r5, r4, r6)
        L_0x055c:
            r4 = 2131436361(0x7f0b2349, float:1.849459E38)
            android.view.View r5 = X.DbY.A0F(r3, r4)
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            X.0qQ.A0C(r5, r4)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r1.A0A = r5
            r4 = 48
            X.MMQ r4 = X.MMQ.A00(r1, r4)
            X.0t0 r5 = X.AnonymousClass0eN.A01(r4)
            com.instagram.common.session.UserSession r20 = X.AnonymousClass7TE.A0l(r28)
            java.lang.String r7 = r1.A0a
            java.util.ArrayList r24 = X.AnonymousClass7TE.A1C()
            X.LBb r8 = X.C60466Jly.A01
            android.content.Context r6 = r1.requireContext()
            boolean r4 = r1.A0S
            java.lang.Integer r4 = X.C51967G9n.A0l(r4)
            int r25 = r8.A00(r6, r4)
            X.LoC r6 = new X.LoC
            r6.<init>(r1, r5)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.89i r19 = X.C3515589i.NO_MUSIC_BROWSER
            X.JlX r4 = new X.JlX
            r21 = r6
            r22 = r5
            r23 = r7
            r18 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r1.A0L = r4
            r4.setHasStableIds(r9)
            androidx.recyclerview.widget.RecyclerView r6 = r1.A0A
            java.lang.String r13 = "audioList"
            if (r6 == 0) goto L_0x05b7
            X.JlX r4 = r1.A0L
            if (r4 != 0) goto L_0x05bc
            java.lang.String r13 = "audioListAdapter"
        L_0x05b7:
            X.0qQ.A0F(r13)
            goto L_0x0218
        L_0x05bc:
            r6.setAdapter(r4)
            androidx.recyclerview.widget.RecyclerView r6 = r1.A0A
            if (r6 == 0) goto L_0x05b7
            android.content.Context r4 = r1.requireContext()
            X.DbV.A1A(r4, r6)
            androidx.recyclerview.widget.RecyclerView r8 = r1.A0A
            if (r8 == 0) goto L_0x05b7
            android.content.Context r7 = r1.requireContext()
            boolean r4 = r1.A0S
            if (r4 == 0) goto L_0x062d
            r6 = r5
        L_0x05d7:
            X.Jly r4 = new X.Jly
            r4.<init>(r7, r6)
            r8.A11(r4)
            androidx.recyclerview.widget.RecyclerView r6 = r1.A0A
            if (r6 == 0) goto L_0x05b7
            X.U05 r4 = new X.U05
            r4.<init>()
            r6.setItemAnimator(r4)
            androidx.recyclerview.widget.RecyclerView r4 = r1.A0A
            if (r4 == 0) goto L_0x05b7
            X.3AS r6 = r4.A0C
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator"
            X.0qQ.A0C(r6, r4)
            X.3AR r6 = (X.AnonymousClass3AR) r6
            r6.A00 = r0
            r1.requireContext()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r28)
            X.4cI r6 = r1.A0Q
            if (r6 == 0) goto L_0x0652
            X.82q r4 = r1.A0H
            if (r4 == 0) goto L_0x02da
            X.3Q2 r6 = X.JWE.A05(r6, r4)
            X.82q r4 = r1.A0H
            if (r4 == 0) goto L_0x02da
            com.instagram.music.common.model.AudioOverlayTrack r8 = X.C63199Kt6.A00(r7, r4, r6)
            if (r8 == 0) goto L_0x0626
            java.lang.Object r7 = r27.getValue()
            X.JjS r7 = (X.C60323JjS) r7
            X.6oS r6 = X.C318116oQ.A00(r7)
            r4 = 19
            X.MHN.A03(r8, r7, r6, r4)
        L_0x0626:
            android.widget.ViewFlipper r4 = r1.A09
            if (r4 != 0) goto L_0x0656
            java.lang.String r13 = "creationMainActionsFlipper"
            goto L_0x05b7
        L_0x062d:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            goto L_0x05d7
        L_0x0630:
            java.lang.Object r4 = r27.getValue()
            X.JjS r4 = (X.C60323JjS) r4
            r4.A04(r1, r11)
            goto L_0x055c
        L_0x063b:
            java.lang.Object r4 = r27.getValue()
            X.JjS r4 = (X.C60323JjS) r4
            X.KJf r4 = r4.A01
            if (r4 == 0) goto L_0x064d
            X.L7l r4 = r4.A00
            int r4 = r4.A00
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
        L_0x064d:
            A0D(r1, r13)
            goto L_0x04c6
        L_0x0652:
            java.lang.String r17 = "pendingMediaProvider"
            goto L_0x02da
        L_0x0656:
            r4.setDisplayedChild(r9)
            java.lang.Object r4 = r27.getValue()
            X.JjS r4 = (X.C60323JjS) r4
            r4.A06(r5)
            goto L_0x066e
        L_0x0663:
            java.lang.Object r5 = r27.getValue()
            X.JjS r5 = (X.C60323JjS) r5
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r5.A06(r4)
        L_0x066e:
            boolean r4 = r1.A0S
            if (r4 == 0) goto L_0x06c4
            android.view.View r4 = r10.A09
            r4.setVisibility(r15)
            r4 = 2131430974(0x7f0b0e3e, float:1.8483664E38)
            android.view.View r6 = r3.requireViewById(r4)
            r7 = r6
            com.instagram.igds.components.mediabutton.IgdsMediaButton r7 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r7
            r7.setVisibility(r0)
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r28)
            X.0qQ.A0B(r8, r0)
            r4 = 36329041002905345(0x81111200023f01, double:3.037970043319228E-306)
            boolean r2 = X.182.A06(r2, r8, r4)
            if (r2 != 0) goto L_0x06b6
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r28)
            boolean r2 = X.C355698Qz.A00(r2)
            if (r2 != 0) goto L_0x06b6
            X.Khx r2 = X.C62567Khx.CREATION_ARROW
            r7.setEndAddOn(r2)
        L_0x06a5:
            r2 = 17
            X.LYB.A00(r6, r2, r1)
            r2 = 5
            r12.setGravity(r2)
        L_0x06ae:
            android.widget.ViewFlipper r4 = r1.A09
            if (r4 != 0) goto L_0x06dd
            java.lang.String r0 = "creationMainActionsFlipper"
            goto L_0x0215
        L_0x06b6:
            X.5pj r2 = X.C296235pj.CREATION_FLOW_FEED_PRIMARY
            r7.setButtonStyle(r2)
            X.Khx r2 = X.C62567Khx.CREATION_ARROW_FILLED
            r7.setEndAddOn(r2)
            r7.setLabel(r11)
            goto L_0x06a5
        L_0x06c4:
            X.0eM r2 = r1.A0e
            boolean r5 = X.AnonymousClass7TF.A1Z(r2)
            r2 = 18
            X.LYB r4 = new X.LYB
            r4.<init>((java.lang.Object) r1, (int) r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            android.view.View r6 = X.JWN.A01(r4, r10, r2, r5)
            r2 = 17
            r12.setGravity(r2)
            goto L_0x06ae
        L_0x06dd:
            r2 = 2131427373(0x7f0b002d, float:1.847636E38)
            android.view.ViewGroup r5 = X.DbX.A0I(r4, r2)
            r5.removeAllViews()
            boolean r2 = A0I(r1)
            java.lang.Integer r7 = X.C51967G9n.A0l(r2)
            boolean r2 = r1.A0S
            if (r2 == 0) goto L_0x0810
            android.content.Context r2 = r1.getThemedContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r2)
            r2 = 2131623968(0x7f0e0020, float:1.8875102E38)
            android.view.View r5 = r4.inflate(r2, r5, r9)
            r2 = 2131429291(0x7f0b07ab, float:1.848025E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r5, r2)
            r2 = 2131429299(0x7f0b07b3, float:1.8480267E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r5, r2)
            r2 = 25
            X.LYG.A02(r8, r2, r1, r7)
            r2 = 26
            X.LYG.A02(r4, r2, r1, r7)
            boolean r2 = r1.A0G()
            if (r2 == 0) goto L_0x073b
            r2 = 2131429301(0x7f0b07b5, float:1.848027E38)
            X.JTR.A1C(r5, r2)
            r2 = 2131429300(0x7f0b07b4, float:1.8480269E38)
            android.view.View r5 = r5.requireViewById(r2)
            r1.A03 = r5
            if (r5 == 0) goto L_0x073b
            r4 = 24
            X.LYB r2 = new X.LYB
            r2.<init>((java.lang.Object) r1, (int) r4)
        L_0x0738:
            X.AnonymousClass0fU.A00(r2, r5)
        L_0x073b:
            java.lang.Object r2 = r27.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            X.0Ud r4 = r2.A0Q
            X.MGX r2 = new X.MGX
            r2.<init>(r1, r11, r9)
            X.DbZ.A1C(r1, r2, r4)
            java.lang.Object r2 = r27.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            X.0r6 r4 = r2.A0I
            r7 = 2
            X.MGX r2 = new X.MGX
            r2.<init>(r1, r11, r7)
            X.DbZ.A1C(r1, r2, r4)
            java.lang.Object r2 = r27.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            X.0r6 r5 = r2.A0F
            r4 = 44
            X.JZr r2 = new X.JZr
            r2.<init>((X.AnonymousClass4D7) r11, (java.lang.Object) r1, (java.lang.Object) r6, (int) r4)
            X.DbZ.A1C(r1, r2, r5)
            java.lang.Object r2 = r27.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            X.0Ud r4 = r2.A0O
            X.MGM r2 = new X.MGM
            r12 = r2
            r13 = r6
            r14 = r3
            r15 = r1
            r16 = r10
            r17 = r11
            r18 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.DbZ.A1C(r1, r2, r4)
            java.lang.Object r2 = r27.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            X.0r6 r5 = r2.A0H
            r4 = 3
            X.MGX r2 = new X.MGX
            r2.<init>(r1, r11, r4)
            X.DbZ.A1C(r1, r2, r5)
            boolean r2 = A0I(r1)
            if (r2 == 0) goto L_0x07c0
            java.lang.Object r2 = r27.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            X.0r6 r5 = r2.A0E
            r4 = 4
            X.MGX r2 = new X.MGX
            r2.<init>(r1, r11, r4)
            X.DbZ.A1C(r1, r2, r5)
            java.lang.Object r2 = r27.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            X.0r6 r4 = r2.A0G
            X.MGX r2 = new X.MGX
            r2.<init>(r1, r11, r0)
            X.DbZ.A1C(r1, r2, r4)
        L_0x07c0:
            boolean r2 = r1.A0G()
            if (r2 == 0) goto L_0x07d8
            java.lang.Object r2 = r27.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            X.0Ud r5 = r2.A0P
            r4 = 43
            X.JZr r2 = new X.JZr
            r2.<init>((X.AnonymousClass4D7) r11, (java.lang.Object) r1, (java.lang.Object) r3, (int) r4)
            X.DbZ.A1C(r1, r2, r5)
        L_0x07d8:
            boolean r2 = r1.A0Y
            if (r2 != 0) goto L_0x07fc
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r28)
            X.JaN r3 = X.JW1.A00(r2)
            X.82p r2 = r1.A0G
            if (r2 == 0) goto L_0x0835
            X.28D r2 = r2.A01
            java.lang.String r5 = r2.toString()
            X.0qQ.A0B(r5, r0)
            X.29E r4 = r3.A0B
            long r2 = r3.A06
            java.lang.String r0 = "ALBUM_EDIT_FRAGMENT_VIEW_CREATED : "
            X.JTP.A1L(r4, r0, r5, r2)
            r1.A0Y = r9
        L_0x07fc:
            android.content.Context r3 = r1.requireContext()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r28)
            boolean r0 = A0I(r1)
            java.lang.Boolean r0 = X.DbT.A0l(r0)
            X.C63200Kt7.A00(r3, r2, r0)
            return
        L_0x0810:
            r5.setVisibility(r15)
            X.Lkp r2 = new X.Lkp
            r2.<init>(r10)
            r10.A00 = r2
            r2 = 2131429291(0x7f0b07ab, float:1.848025E38)
            android.view.View r4 = r10.requireViewById(r2)
            r2 = 27
            X.LYG.A02(r4, r2, r1, r7)
            r2 = 2131429299(0x7f0b07b3, float:1.8480267E38)
            android.view.View r5 = r10.requireViewById(r2)
            r2 = 28
            X.LYG r2 = X.LYG.A01(r1, r7, r2)
            goto L_0x0738
        L_0x0835:
            java.lang.String r0 = "cameraSession"
            goto L_0x0215
        L_0x0839:
            r4 = 2131439830(0x7f0b30d6, float:1.8501626E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r3, r4)
            com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView r5 = (com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView) r5
            X.Lk7 r4 = new X.Lk7
            r4.<init>(r5)
            r1.A0E = r4
            goto L_0x020f
        L_0x084b:
            X.KhI r4 = X.C62526KhI.CANCEL
            goto L_0x005c
        L_0x084f:
            java.lang.String r0 = "provider"
            goto L_0x0215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.AlbumEditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.ME8, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.creation.fragment.AlbumEditFragment r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 40
            boolean r0 = X.ME8.A03(r3, r11)
            if (r0 == 0) goto L_0x00b9
            r8 = r11
            X.ME8 r8 = (X.ME8) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b9
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r8.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004a
            if (r0 != r3) goto L_0x00f8
            X.0eS.A00(r1)
        L_0x0025:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00fd
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r2 = r1.iterator()
        L_0x0031:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Jvh r0 = (X.C61043Jvh) r0
            java.lang.String r0 = r0.A02
            java.lang.Object r0 = X.JTS.A0h(r0, r3)
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x0031
        L_0x004a:
            X.0eS.A00(r1)
            X.82q r0 = r10.A0H
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "creationCameraSession"
        L_0x0053:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005b:
            java.util.List r0 = r0.Co4()
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.creation.base.MediaSession r0 = (com.instagram.creation.base.MediaSession) r0
            if (r0 == 0) goto L_0x00fd
            com.instagram.creation.ml.VisualFeatureStore r5 = r10.A0J
            if (r5 == 0) goto L_0x00fd
            java.lang.String r7 = r0.B5g()
            java.lang.Integer r1 = r0.Bsu()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r9 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00ae
            X.0eM r0 = r10.A0f
            java.lang.Object r1 = r0.getValue()
            X.JjS r1 = (X.C60323JjS) r1
            X.4cI r0 = r10.A0Q
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "pendingMediaProvider"
            goto L_0x0053
        L_0x008c:
            java.util.List r0 = r1.A02(r0)
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            if (r0 == 0) goto L_0x00ae
            java.util.List r0 = r0.A4G
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.pendingmedia.model.ClipInfo r0 = (com.instagram.pendingmedia.model.ClipInfo) r0
            if (r0 == 0) goto L_0x00ae
            int r0 = X.JTO.A09(r0)
            long r0 = (long) r0
            java.lang.Long r6 = X.JTO.A0y(r0)
            goto L_0x00af
        L_0x00ae:
            r6 = r4
        L_0x00af:
            r8.A00 = r3
            r10 = 0
            java.lang.Object r1 = r5.A03(r6, r7, r8, r9, r10)
            if (r1 != r2) goto L_0x0025
            return r2
        L_0x00b9:
            r0 = 42
            X.ME8 r8 = new X.ME8
            r8.<init>(r10, r11, r3, r0)
            goto L_0x0016
        L_0x00c2:
            java.util.LinkedHashMap r4 = X.C51975G9x.A0o(r3)
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r3)
        L_0x00ca:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00fd
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r5)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r0 = X.JTT.A08(r1)
            java.util.LinkedHashMap r2 = X.DbS.A0x(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f4
            X.C61043Jvh.A00(r1, r2)
            goto L_0x00ea
        L_0x00f4:
            r4.put(r3, r2)
            goto L_0x00ca
        L_0x00f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00fd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.AlbumEditFragment.A03(com.instagram.creation.fragment.AlbumEditFragment, X.4D7):java.lang.Object");
    }

    private final void A04(int i) {
        C3499682q r0 = this.A0H;
        Integer num = null;
        if (r0 == null) {
            0qQ.A0F("creationCameraSession");
            throw AnonymousClass00P.createAndThrow();
        }
        MediaSession mediaSession = (MediaSession) 00k.A0O(r0.Co4(), i);
        if (mediaSession != null) {
            num = mediaSession.Bsu();
        }
        A0P(AnonymousClass7TF.A1W(num, AnonymousClass05K.A00));
    }

    public static final void A08(AlbumEditFragment albumEditFragment) {
        ViewParent viewParent;
        if (albumEditFragment.A0M == null) {
            UserSession A0l = AnonymousClass7TE.A0l(albumEditFragment.A0d);
            Context requireContext = albumEditFragment.requireContext();
            CreationToolbarView creationToolbarView = albumEditFragment.A0O;
            if (creationToolbarView != null) {
                viewParent = creationToolbarView.getParent();
            } else {
                viewParent = null;
            }
            0qQ.A0C(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
            albumEditFragment.A0M = new LOy(requireContext, (ViewGroup) viewParent, A0l);
        }
    }

    public static final void A0A(AlbumEditFragment albumEditFragment) {
        C60323JjS jjS = (C60323JjS) albumEditFragment.A0f.getValue();
        Integer num = AnonymousClass05K.A01;
        jjS.A01 = jjS.A02;
        jjS.A02 = null;
        jjS.A07(num, true);
    }

    public static final void A0B(AlbumEditFragment albumEditFragment) {
        KB5 kb5 = albumEditFragment.A0D;
        if (kb5 != null) {
            for (C66539MVt Ekd : kb5.A0E) {
                Ekd.Ekd();
            }
        }
        AnonymousClass6SR.A01().A03(AnonymousClass7TE.A0l(albumEditFragment.A0d), "share_screen");
        ViewGroup viewGroup = albumEditFragment.A07;
        if (viewGroup != null) {
            0kx r1 = new 0kx(viewGroup);
            while (r1.hasNext()) {
                ((View) r1.next()).setEnabled(false);
            }
        }
        if (AnonymousClass7TF.A1Z(albumEditFragment.A0e)) {
            C273574mo requireActivity = albumEditFragment.requireActivity();
            0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.creation.base.AlbumDraftHelper.SaveAlbumDraftDelegate");
            requireActivity.DgW(false);
        } else {
            C60323JjS jjS = (C60323JjS) albumEditFragment.A0f.getValue();
            C59732JVq jVq = new C59732JVq(4, 3, true, false);
            jjS.A00 = jVq;
            jjS.A0B.FIG(jVq);
        }
        JTS.A1N(albumEditFragment.A0I, albumEditFragment);
    }

    public static final void A0C(AlbumEditFragment albumEditFragment, C62499Kgp kgp) {
        String str;
        C66545MVz mVz = albumEditFragment.A0E;
        if (mVz == null) {
            str = "reboundHorizontalScrollView";
        } else {
            int Atv = mVz.Atv();
            C3499682q r0 = albumEditFragment.A0H;
            if (r0 == null) {
                str = "creationCameraSession";
            } else {
                MediaSession mediaSession = (MediaSession) 00k.A0O(r0.Co4(), Atv);
                if (mediaSession != null) {
                    A06(mediaSession, albumEditFragment, kgp);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0D(AlbumEditFragment albumEditFragment, Integer num) {
        int i;
        if (num != null) {
            i = C63126Kru.A00(((C60323JjS) albumEditFragment.A0f.getValue()).A0A, num.intValue());
        } else {
            i = 0;
        }
        C60715Jq4 jq4 = albumEditFragment.A0F;
        if (jq4 != null) {
            jq4.setRestoreSelectedIndex(i);
        }
        C60715Jq4 jq42 = albumEditFragment.A0F;
        if (jq42 != null) {
            jq42.A1I(i);
        }
        if (i > 0 && num != null) {
            27r A012 = 27p.A01(AnonymousClass7TE.A0l(albumEditFragment.A0d));
            int intValue = num.intValue();
            if (A012.A0J() != null) {
                A012.A1A(28t.A02, C59725JVj.POST_CAPTURE, intValue, i);
            }
        }
    }

    public static final void A0E(AlbumEditFragment albumEditFragment, boolean z, boolean z2) {
        C64905Lk5 lk5;
        C378369Pn r0;
        int i;
        ColorFilterAlphaImageView colorFilterAlphaImageView = albumEditFragment.A0B;
        if (colorFilterAlphaImageView != null) {
            C60323JjS jjS = (C60323JjS) albumEditFragment.A0f.getValue();
            C267834cI r02 = albumEditFragment.A0Q;
            if (r02 == null) {
                0qQ.A0F("pendingMediaProvider");
                throw AnonymousClass00P.createAndThrow();
            }
            jjS.A05(r02, z);
            colorFilterAlphaImageView.setSelected(z);
            if (z2) {
                Context context = albumEditFragment.getContext();
                if (AnonymousClass30D.A05(AnonymousClass7TE.A0l(albumEditFragment.A0d))) {
                    i = 2131976469;
                    if (z) {
                        i = 2131976466;
                    }
                } else {
                    i = 2131952873;
                    if (z) {
                        i = 2131952872;
                    }
                }
                DbZ.A0w(context, albumEditFragment, i);
            }
            KB5 kb5 = albumEditFragment.A0D;
            if (!(kb5 == null || (lk5 = kb5.A0B) == null || (r0 = lk5.A01) == null)) {
                C378459Pw r03 = r0.A08;
                if (z) {
                    if (r03 != null) {
                        r03.A09();
                    }
                } else if (r03 != null) {
                    r03.A0A();
                }
            }
            AnonymousClass6SR.A01().A0Q = true;
        }
    }

    private final void A0F(boolean z) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A0B;
        if (colorFilterAlphaImageView != null) {
            C3499682q r0 = this.A0H;
            if (r0 != null) {
                boolean z2 = true;
                if (!r0.FN1().isEmpty()) {
                    colorFilterAlphaImageView.setVisibility(0);
                    AnonymousClass0eM r2 = this.A0f;
                    C60323JjS jjS = (C60323JjS) r2.getValue();
                    C267834cI r02 = this.A0Q;
                    if (r02 != null) {
                        List A022 = jjS.A02(r02);
                        if (!(A022 instanceof Collection) || !A022.isEmpty()) {
                            Iterator it = A022.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (JTO.A0m(it).A5F) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        C267834cI r1 = this.A0Q;
                        if (r1 != null) {
                            C3499682q r03 = this.A0H;
                            if (r03 != null) {
                                AnonymousClass3Q2 A052 = JWE.A05(r1, r03);
                                if (A052 == null || A052.A1J == null) {
                                    C3499682q r04 = this.A0H;
                                    if (r04 != null) {
                                        if (!r04.CKG()) {
                                            z2 = false;
                                        }
                                    }
                                }
                                colorFilterAlphaImageView.setSelected(z2);
                                C60323JjS jjS2 = (C60323JjS) r2.getValue();
                                C267834cI r12 = this.A0Q;
                                if (r12 != null) {
                                    jjS2.A05(r12, colorFilterAlphaImageView.isSelected());
                                    if (z) {
                                        LYB.A00(colorFilterAlphaImageView, 15, this);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    0qQ.A0F("pendingMediaProvider");
                    throw AnonymousClass00P.createAndThrow();
                }
                colorFilterAlphaImageView.setVisibility(8);
                return;
            }
            0qQ.A0F("creationCameraSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private final boolean A0G() {
        String str;
        C267834cI r2 = this.A0Q;
        if (r2 == null) {
            str = "pendingMediaProvider";
        } else {
            C3499682q r0 = this.A0H;
            str = "creationCameraSession";
            if (r0 != null) {
                AnonymousClass3Q2 A052 = JWE.A05(r2, r0);
                if (A052 == null || A052.A1J == null) {
                    C3499682q r02 = this.A0H;
                    if (r02 != null) {
                        if (!r02.CL3()) {
                            UserSession A0l = AnonymousClass7TE.A0l(this.A0d);
                            0qQ.A0B(A0l, 0);
                            if (!AnonymousClass30D.A09(A0l) || !182.A06(0Tu.A05, A0l, 36326296518669999L)) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A0H(AlbumEditFragment albumEditFragment) {
        C3499682q r0 = albumEditFragment.A0H;
        if (r0 == null) {
            0qQ.A0F("creationCameraSession");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.Co4().size() <= 1) {
            return false;
        } else {
            return true;
        }
    }

    public static final boolean A0I(AlbumEditFragment albumEditFragment) {
        AnonymousClass0eM r2 = albumEditFragment.A0d;
        if (AnonymousClass30D.A0B(AnonymousClass7TE.A0l(r2))) {
            C3499682q r0 = albumEditFragment.A0H;
            if (r0 != null) {
                boolean isEmpty = r0.FN1().isEmpty();
                UserSession A0l = AnonymousClass7TE.A0l(r2);
                C3499682q r02 = albumEditFragment.A0H;
                if (r02 != null) {
                    if (!C64132LPg.A02(A0l, JWE.A04(r02), isEmpty, A0H(albumEditFragment)) || C60323JjS.A01(albumEditFragment)) {
                        return false;
                    }
                    return true;
                }
            }
            0qQ.A0F("creationCameraSession");
            throw AnonymousClass00P.createAndThrow();
        }
        return false;
    }

    public final UserSession A0J() {
        return AnonymousClass7TE.A0l(this.A0d);
    }

    public final void A0L() {
        C60323JjS jjS = (C60323JjS) this.A0f.getValue();
        C59732JVq jVq = jjS.A00;
        C59732JVq jVq2 = new C59732JVq(false, jVq.A01, jVq.A02, 3);
        jjS.A00 = jVq2;
        jjS.A0B.FIG(jVq2);
    }

    public final void A0M() {
        C60323JjS jjS = (C60323JjS) this.A0f.getValue();
        C59732JVq jVq = new C59732JVq(false, jjS.A00.A01, false, 3);
        jjS.A00 = jVq;
        jjS.A0B.FIG(jVq);
    }

    public final void A0P(boolean z) {
        05G r3 = ((C60323JjS) this.A0f.getValue()).A0L;
        do {
        } while (!r3.AIY(r3.getValue(), new C59671JTb(z, 4)));
    }

    public final String getModuleName() {
        return this.A0Z;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d4, code lost:
        if (((X.C60323JjS) r2.getValue()).A04 == false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0285, code lost:
        if (r13.B5r() == null) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0183, code lost:
        if (r12 != r0) goto L_0x0185;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r17 = this;
            r5 = r17
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            r4 = 1
            if (r0 == 0) goto L_0x0016
            X.37D r0 = X.DbT.A0i(r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.A0X()
            if (r0 != r4) goto L_0x0016
        L_0x0015:
            return r4
        L_0x0016:
            boolean r0 = r5.A0Q()
            if (r0 == 0) goto L_0x006f
            X.JVf r0 = X.C60323JjS.A00(r5)
            java.lang.Object r0 = r0.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r6 = 0
            if (r1 == r6) goto L_0x006b
            r0 = 2
            if (r1 == r0) goto L_0x006b
            r0 = 3
            if (r1 == r0) goto L_0x0036
            if (r1 == r4) goto L_0x006f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0036:
            X.0eM r0 = r5.A0d
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326541331806019(0x810ecc00003743, double:3.0363892412506464E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            boolean r0 = A0I(r5)
            java.lang.Integer r1 = X.C51967G9n.A0l(r0)
            X.0eM r0 = r5.A0f
            java.lang.Object r0 = r0.getValue()
            X.JjS r0 = (X.C60323JjS) r0
            r0.A07(r1, r6)
            boolean r0 = r5.A0U
            if (r0 == 0) goto L_0x0015
            if (r2 == 0) goto L_0x0015
            X.LG9 r2 = r5.A0K
            if (r2 == 0) goto L_0x0015
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 0
            r2.A02(r0, r1)
            return r4
        L_0x006b:
            A09(r5)
            return r4
        L_0x006f:
            X.LOy r1 = r5.A0M
            if (r1 == 0) goto L_0x0087
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r0 = r1.A06
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0087
            X.Jhn r2 = r1.A07
            X.3ju r1 = r2.A02
            X.KNU r0 = X.KNU.A00
            r1.FIG(r0)
            java.lang.String r0 = ""
            r2.A01 = r0
            return r4
        L_0x0087:
            X.KB5 r0 = r5.A0D
            if (r0 == 0) goto L_0x0092
            boolean r0 = r0.onBackPressed()
            if (r0 != r4) goto L_0x0092
            return r4
        L_0x0092:
            X.0eM r2 = r5.A0f
            java.lang.Object r1 = r2.getValue()
            X.JjS r1 = (X.C60323JjS) r1
            X.4cI r6 = r5.A0Q
            java.lang.String r16 = "pendingMediaProvider"
            r10 = 0
            if (r6 == 0) goto L_0x00e8
            r11 = 0
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0103
            X.82q r0 = r1.A08
            X.3Q2 r0 = X.JWE.A05(r6, r0)
            if (r0 == 0) goto L_0x0103
            boolean r0 = r0.A0r()
            if (r0 == 0) goto L_0x0103
        L_0x00b4:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.0eM r0 = r5.A0e
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x00e2
            X.0eM r7 = r5.A0d
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320390938632579(0x81093400002183, double:3.0324997078421174E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0100
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            r0 = 36320390938698116(0x81093400012184, double:3.032499707883563E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x00fd
            java.lang.Integer r1 = X.AnonymousClass05K.A0A
        L_0x00e2:
            X.4mi r0 = r5.A0N
            if (r0 != 0) goto L_0x00f0
            java.lang.String r16 = "provider"
        L_0x00e8:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f0:
            com.instagram.creation.activity.MediaCaptureActivity r0 = (com.instagram.creation.activity.MediaCaptureActivity) r0
            X.JWG r0 = r0.A07
            if (r0 == 0) goto L_0x02e0
            boolean r0 = r0.A0A(r10, r1)
            if (r0 == 0) goto L_0x01d6
            return r4
        L_0x00fd:
            java.lang.Integer r1 = X.AnonymousClass05K.A08
            goto L_0x00e2
        L_0x0100:
            java.lang.Integer r1 = X.AnonymousClass05K.A05
            goto L_0x00e2
        L_0x0103:
            X.82q r1 = r1.A08
            r0 = r1
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r3 = r0.A01
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x00b4
            java.util.Iterator r15 = X.JTP.A0w(r1)
        L_0x0112:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01b9
            com.instagram.creation.base.MediaSession r12 = X.JTO.A0Z(r15)
            java.lang.String r7 = r12.BbR()
            if (r7 == 0) goto L_0x0112
            X.3Q2 r9 = r6.BbQ(r7)
            java.util.List r0 = r3.A0Q
            java.util.Iterator r1 = r0.iterator()
        L_0x012c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r8 = r1.next()
            X.LFT r8 = (X.LFT) r8
            java.lang.String r0 = r8.A06
            if (r0 == 0) goto L_0x012c
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x012c
        L_0x0142:
            if (r9 == 0) goto L_0x0150
            boolean r0 = r9.A0r()
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = r9.A2k
            if (r0 == 0) goto L_0x0150
            goto L_0x00b4
        L_0x0150:
            java.lang.Integer r0 = r12.Bsu()
            int r0 = r0.intValue()
            if (r0 == r11) goto L_0x019b
            if (r9 == 0) goto L_0x0112
            boolean r0 = r9.A5U
            if (r0 == 0) goto L_0x0196
            if (r8 == 0) goto L_0x0196
            int r7 = r8.A03
            int r1 = r8.A02
            int r13 = r8.A01
            int r12 = r8.A00
            boolean r8 = r8.A07
            X.3QG r0 = r9.A1i
            int r0 = r0.A01
            boolean r14 = X.JTQ.A1O(r0, r7)
            int r0 = r9.A05
            boolean r7 = X.JTQ.A1O(r0, r1)
            com.instagram.pendingmedia.model.ClipInfo r0 = r9.A1N
            int r1 = r0.A07
            int r0 = r0.A05
            if (r13 != r1) goto L_0x0185
            r1 = 0
            if (r12 == r0) goto L_0x0186
        L_0x0185:
            r1 = 1
        L_0x0186:
            boolean r0 = r9.A5F
            boolean r0 = X.JTQ.A1O(r0, r8)
            if (r14 != 0) goto L_0x00b4
            if (r7 != 0) goto L_0x00b4
            if (r1 != 0) goto L_0x00b4
        L_0x0192:
            if (r0 == 0) goto L_0x0112
            goto L_0x00b4
        L_0x0196:
            boolean r0 = X.C64188LSv.A04(r9)
            goto L_0x0192
        L_0x019b:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r12.B5r()
            if (r9 == 0) goto L_0x01b2
            boolean r0 = r9.A5U
            if (r0 == 0) goto L_0x01b2
            if (r8 == 0) goto L_0x01b2
            if (r1 == 0) goto L_0x024d
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r8.A00()
            boolean r0 = X.C364978mK.A06(r1, r0)
            goto L_0x0192
        L_0x01b2:
            boolean r0 = X.C364978mK.A05(r1)
            goto L_0x0192
        L_0x01b7:
            r8 = 0
            goto L_0x0142
        L_0x01b9:
            X.0eM r0 = r5.A0d
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36328482657025397(0x81109000003d75, double:3.03761694313647E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x00b4
            java.lang.Object r0 = r2.getValue()
            X.JjS r0 = (X.C60323JjS) r0
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x02e0
        L_0x01d6:
            java.lang.Object r7 = r2.getValue()
            X.JjS r7 = (X.C60323JjS) r7
            X.4cI r9 = r5.A0Q
            if (r9 == 0) goto L_0x00e8
            X.82q r8 = r7.A08
            r0 = r8
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r6 = r0.A01
            java.util.List r3 = r6.A0E
            r3.clear()
            java.util.List r0 = r6.A0Q
            java.util.Iterator r14 = r0.iterator()
        L_0x01f2:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0252
            java.lang.Object r13 = r14.next()
            X.LFT r13 = (X.LFT) r13
            com.instagram.creation.base.MediaSession r2 = r13.A04
            r2.getClass()
            X.3Q2 r12 = X.JTQ.A0N(r2, r9)
            java.lang.Integer r1 = r2.Bsu()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x021a
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r13.A00()
            r2.EWm(r0)
        L_0x0216:
            r3.add(r2)
            goto L_0x01f2
        L_0x021a:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0216
            if (r12 == 0) goto L_0x0239
            X.3QG r1 = r12.A1i
            int r0 = r13.A03
            r1.A01 = r0
            int r0 = r13.A02
            r12.A05 = r0
            com.instagram.pendingmedia.model.ClipInfo r1 = r12.A1N
            int r0 = r13.A01
            r1.A07 = r0
            int r0 = r13.A00
            r1.A05 = r0
            boolean r0 = r13.A07
            r12.A5F = r0
            goto L_0x0216
        L_0x0239:
            java.lang.String r0 = r2.BbR()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = "reason: media is null. pending media key:%s media session:%s"
            java.lang.String r1 = X.0mp.A06(r0, r1)
            java.lang.String r0 = "ig_restore_media_session_states_error"
            X.0kD.A01(r0, r1)
            goto L_0x0216
        L_0x024d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0252:
            r6.A0H = r11
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = X.JTP.A0w(r8)
        L_0x025c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02cc
            com.instagram.creation.base.MediaSession r13 = X.JTO.A0Z(r14)
            X.3Q2 r11 = X.JTQ.A0N(r13, r9)
            if (r11 == 0) goto L_0x025c
            boolean r0 = r11.A5R
            if (r0 != 0) goto L_0x0272
            r11.A3O = r10
        L_0x0272:
            java.lang.Integer r2 = r13.Bsu()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x0287
            com.instagram.creation.base.CropInfo r0 = r13.Asr()
            if (r0 == 0) goto L_0x0287
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r13.B5r()
            r0 = 1
            if (r1 != 0) goto L_0x0288
        L_0x0287:
            r0 = 0
        L_0x0288:
            java.lang.String r12 = "Required value was null."
            if (r0 == 0) goto L_0x02b1
            com.instagram.creation.base.CropInfo r0 = r13.Asr()
            if (r0 == 0) goto L_0x02c2
            int r8 = r0.A01
            int r3 = r0.A00
            android.graphics.Rect r2 = r0.A02
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r13.B5r()
            if (r1 == 0) goto L_0x02bd
            X.MRo r0 = r13.B2U()
            int r0 = r0.getValue()
            X.C364978mK.A02(r2, r1, r8, r3, r0)
        L_0x02a9:
            java.lang.String r0 = r11.A30
            if (r0 == 0) goto L_0x025c
            r6.add(r0)
            goto L_0x025c
        L_0x02b1:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x02a9
            java.lang.String r0 = r11.A3w
            if (r0 == 0) goto L_0x02c7
            X.AnonymousClass457.A0F(r0)
            goto L_0x02a9
        L_0x02bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x02c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x02c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x02cc:
            boolean r0 = r7.A0R
            if (r0 == 0) goto L_0x02de
            com.instagram.common.session.UserSession r0 = r7.A06
            X.JX9 r0 = X.JWX.A00(r0)
            java.util.List r0 = r0.A03
            r0.clear()
            r0.addAll(r6)
        L_0x02de:
            r7.A04 = r4
        L_0x02e0:
            r4 = 0
            X.6SR r2 = X.AnonymousClass6SR.A01()
            X.0eM r0 = r5.A0d
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = "gallery"
            r2.A03(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.AlbumEditFragment.onBackPressed():boolean");
    }

    public AlbumEditFragment() {
        C66218MIz mIz = new C66218MIz(this, 12);
        C66218MIz mIz2 = new C66218MIz(this, 5);
        0eO r3 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C66218MIz(mIz2, 6));
        this.A0f = DbS.A0I(new C66218MIz(A002, 7), mIz, C66291MMa.A00((Object) null, A002, 43), DbS.A0z(C60323JjS.class));
        this.A0a = AnonymousClass7TG.A0j();
        this.A0S = true;
        this.A0e = AnonymousClass0eN.A00(r3, new C66218MIz(this, 11));
        this.A0c = AnonymousClass0eN.A00(r3, MMQ.A00(this, 49));
        MMQ A003 = MMQ.A00(this, 47);
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r3, new C66218MIz(new C66218MIz(this, 8), 9));
        this.A0b = DbS.A0I(new C66218MIz(A004, 10), A003, C66291MMa.A00((Object) null, A004, 44), DbS.A0z(C60188Jh7.class));
        this.A0T = true;
        this.A0Z = "carousel_gallery";
    }

    private final View A00() {
        KB5 kb5;
        if (C2604245p.A03(requireContext())) {
            C3499682q r0 = this.A0H;
            if (r0 == null) {
                0qQ.A0F("creationCameraSession");
                throw AnonymousClass00P.createAndThrow();
            } else if (!((JWE) r0).A01.A0G && (kb5 = this.A0D) != null) {
                UserSession userSession = kb5.A0P;
                boolean booleanValue = LHq.A00(userSession).booleanValue();
                C66545MVz mVz = kb5.A0R;
                if (booleanValue) {
                    mVz.Etv();
                } else {
                    View Bq9 = mVz.Bq9();
                    View findViewById = Bq9.findViewById(R.id.add_item_content_view);
                    if (findViewById == null) {
                        ViewGroup viewGroup = (ViewGroup) Bq9;
                        findViewById = LayoutInflater.from(kb5.A0N).inflate(R.layout.album_add_item_view, viewGroup, false);
                        viewGroup.addView(findViewById);
                    }
                    View requireViewById = findViewById.requireViewById(R.id.add_item_view_icon);
                    if (!JWB.A01(userSession)) {
                        int A012 = 2Yu.A01(kb5.A0N);
                        Drawable background = requireViewById.getBackground();
                        background.getClass();
                        AnonymousClass7TE.A1R(background, A012);
                    }
                    LY1.A00(requireViewById, 58, kb5);
                    mVz.ElY(true);
                    findViewById.setVisibility(0);
                    return findViewById;
                }
            }
        }
        return null;
    }

    private final View A01(View view) {
        View view2 = null;
        if (C2604245p.A03(requireContext())) {
            C3499682q r0 = this.A0H;
            if (r0 == null) {
                0qQ.A0F("creationCameraSession");
                throw AnonymousClass00P.createAndThrow();
            } else if (!((JWE) r0).A01.A0G && this.A0S) {
                AnonymousClass0eM r6 = this.A0d;
                UserSession A0l = AnonymousClass7TE.A0l(r6);
                if (182.A06(DbS.A0J(A0l, 0), A0l, 36320425299091879L)) {
                    view2 = AnonymousClass7TF.A0G(view, R.id.gallery_add_container);
                    IgImageView A0b2 = DbT.A0b(view2, R.id.gallery_add_button);
                    this.A0C = A0b2;
                    if (A0b2 != null) {
                        A0b2.setActivated(true);
                        AnonymousClass8GF r1 = new AnonymousClass8GF(A0b2);
                        r1.A00 = new C64982LlL(this, 0);
                        r1.A00();
                        LHt.A00(requireActivity(), requireContext(), this, ((C60323JjS) this.A0f.getValue()).A05, AnonymousClass7TE.A0l(r6));
                        view2.setVisibility(0);
                        View view3 = this.A05;
                        if (view3 != null) {
                            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                            if (layoutParams != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.setMargins(0, 0, 0, 0);
                                view3.setLayoutParams(marginLayoutParams);
                            } else {
                                throw AnonymousClass7TE.A11("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
        }
        return view2;
    }

    private final ImageView A02(ViewGroup viewGroup, int i, int i2) {
        View inflate = LayoutInflater.from(getThemedContext()).inflate(R.layout.media_edit_button, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) inflate;
        imageView.setImageResource(i);
        imageView.setContentDescription(getString(i2));
        2eK.A00(imageView, getThemedContext().getColor(2Yu.A0B(getThemedContext())), JTP.A02(getThemedContext(), getThemedContext(), R.attr.igds_color_creation_tools_blue), 255);
        viewGroup.addView(imageView, 0);
        return imageView;
    }

    public static final void A06(MediaSession mediaSession, AlbumEditFragment albumEditFragment, C62499Kgp kgp) {
        C59889JbE kPg;
        Context context = albumEditFragment.getContext();
        if (context != null) {
            C60323JjS jjS = (C60323JjS) albumEditFragment.A0f.getValue();
            C267834cI r9 = albumEditFragment.A0Q;
            if (r9 == null) {
                0qQ.A0F("pendingMediaProvider");
                throw AnonymousClass00P.createAndThrow();
            }
            boolean A062 = 182.A06(0Tu.A05, AnonymousClass7TE.A0l(albumEditFragment.A0d), 36323457545284771L);
            Boolean bool = (Boolean) albumEditFragment.A0c.getValue();
            jjS.A09.A02++;
            jjS.A03(context, mediaSession, r9, false, A062);
            UserSession userSession = jjS.A06;
            if (mediaSession.Bsu() == AnonymousClass05K.A00) {
                kPg = new C61866KPf(kgp, bool, true);
            } else {
                kPg = new C61867KPg(C62499Kgp.A04, "video_edit_button", true, false);
            }
            C59888JbD.A01(userSession, kPg);
            JTS.A1N(albumEditFragment.A0I, albumEditFragment);
            return;
        }
        0kD.A07("AlbumEditFragment", "onItemClick: context is null", (Throwable) null);
    }

    private final void A07(MediaEditActionBar mediaEditActionBar) {
        String str;
        if (!A0I(this) && !C60323JjS.A01(this)) {
            C267834cI r2 = this.A0Q;
            if (r2 == null) {
                str = "pendingMediaProvider";
            } else {
                C3499682q r0 = this.A0H;
                str = "creationCameraSession";
                if (r0 != null) {
                    if (JWE.A05(r2, r0) != null) {
                        LinearLayout linearLayout = mediaEditActionBar.A0A;
                        C3499682q r02 = this.A0H;
                        if (r02 != null) {
                            boolean isEmpty = r02.FN1().isEmpty();
                            UserSession A0l = AnonymousClass7TE.A0l(this.A0d);
                            C3499682q r03 = this.A0H;
                            if (r03 != null) {
                                if (C64132LPg.A02(A0l, JWE.A04(r03), isEmpty, A0H(this)) && this.A08 == null) {
                                    View A0C2 = DbT.A0C(LayoutInflater.from(getThemedContext()), linearLayout, R.layout.media_edit_button);
                                    0qQ.A0C(A0C2, "null cannot be cast to non-null type android.widget.ImageView");
                                    ImageView imageView = (ImageView) A0C2;
                                    this.A08 = imageView;
                                    A05(imageView, this, R.drawable.instagram_music_pano_outline_24);
                                    linearLayout.addView(this.A08);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A09(AlbumEditFragment albumEditFragment) {
        C60715Jq4 jq4;
        int indexOf;
        Integer A0l = C51967G9n.A0l(A0I(albumEditFragment) ? 1 : 0);
        AnonymousClass0eM r3 = albumEditFragment.A0f;
        C60323JjS jjS = (C60323JjS) r3.getValue();
        jjS.A02 = null;
        jjS.A07(A0l, false);
        C61714KJf kJf = ((C60323JjS) r3.getValue()).A01;
        if (kJf != null && (jq4 = albumEditFragment.A0F) != null && (indexOf = jq4.A03.indexOf(kJf)) > -1) {
            jq4.A1I(indexOf);
        }
    }

    public final void A0K() {
        AnonymousClass6SR.A01().A00++;
        this.A0Y = false;
        C59888JbD.A01(AnonymousClass7TE.A0l(this.A0d), new C61867KPg(C62499Kgp.A04, "album_add", true, false));
    }

    public final void A0O() {
        this.A00 = A00();
        View view = this.mView;
        if (view != null) {
            this.A01 = A01(view);
            C66545MVz mVz = this.A0E;
            if (mVz == null) {
                0qQ.A0F("reboundHorizontalScrollView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                A04(mVz.Atv());
            }
        } else {
            0kD.A07("AlbumEditFragment", "onItemsReRendered: view is null", (Throwable) null);
        }
    }

    public final boolean A0Q() {
        if (C60323JjS.A01(this)) {
            return false;
        }
        C59721JVf A002 = C60323JjS.A00(this);
        if (A002.A00 == null) {
            if (!A0I(this)) {
                return false;
            }
            Object obj = A002.A01;
            if (obj == AnonymousClass05K.A0C || obj == AnonymousClass05K.A0N || obj == AnonymousClass05K.A00) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-2005487848);
        AlbumEditFragment.super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A0d;
        JWB.A00(this, AnonymousClass7TE.A0l(r3));
        this.A0W = C64698LgT.A00(this, 14);
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r3));
        Class<C64626LfE> cls = C64626LfE.class;
        1wn r0 = this.A0W;
        if (r0 == null) {
            str = "saveAlbumListener";
        } else {
            A002.A01(r0, cls);
            C267834cI r1 = this.A0Q;
            if (r1 == null) {
                str = "pendingMediaProvider";
            } else {
                C3499682q r02 = this.A0H;
                if (r02 == null) {
                    str = "creationCameraSession";
                } else {
                    AnonymousClass3Q2 BbQ = r1.BbQ(r02.E2M());
                    if (BbQ != null) {
                        C64833Liv A003 = C63270KuF.A00(AnonymousClass7TE.A0l(r3));
                        Context requireContext = requireContext();
                        A003.A02.Epw(0sl.A00);
                        A003.A00.clear();
                        A003.A01(requireContext, BbQ);
                    }
                    AnonymousClass0fD.A09(358172979, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1280810336);
        this.A0S = JWN.A05(DbT.A06(this, layoutInflater, 0));
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_album_filter, false);
        AnonymousClass0fD.A09(525299944, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-594881771);
        super.onDestroy();
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0d));
        Class<C64626LfE> cls = C64626LfE.class;
        1wn r0 = this.A0W;
        if (r0 == null) {
            0qQ.A0F("saveAlbumListener");
            throw AnonymousClass00P.createAndThrow();
        }
        A002.A02(r0, cls);
        AnonymousClass0fD.A09(1150066134, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1726943142);
        super.onDestroyView();
        ((C60323JjS) this.A0f.getValue()).A07(AnonymousClass05K.A00, false);
        C60715Jq4 jq4 = this.A0F;
        if (jq4 != null) {
            jq4.A02 = null;
            jq4.setAdapter((2Rw) null);
        }
        this.A0F = null;
        unregisterLifecycleListener(this.A0D);
        this.A0D = null;
        LG9 lg9 = this.A0K;
        if (lg9 != null) {
            lg9.A01.A07.A0F();
        }
        C234502xy r0 = this.A0P;
        if (r0 != null) {
            r0.release();
        }
        this.A08 = null;
        this.A0B = null;
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
        this.A0O = null;
        this.A0M = null;
        AnonymousClass0fD.A09(-827813553, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1010694696);
        AlbumEditFragment.super.onPause();
        C240053Jk.A03.A02(getActivity(), AnonymousClass7TE.A0l(this.A0d));
        C66534MVo mVo = (C66534MVo) C60323JjS.A00(this).A00;
        if (mVo != null) {
            mVo.onPause();
        }
        C234502xy r0 = this.A0P;
        if (r0 != null && r0.isPlaying()) {
            C234502xy r02 = this.A0P;
            if (r02 != null) {
                r02.pause();
            }
            this.A0X = true;
        }
        AnonymousClass0fD.A09(754059713, A022);
    }

    public final void onResume() {
        C234502xy r0;
        int A022 = AnonymousClass0fD.A02(-1093514100);
        super.onResume();
        C240053Jk.A03.A03(getActivity(), AnonymousClass7TE.A0l(this.A0d));
        C66534MVo mVo = (C66534MVo) C60323JjS.A00(this).A00;
        if (mVo != null) {
            mVo.onResume();
        }
        if (this.A0X && !this.A0V && (r0 = this.A0P) != null) {
            r0.E2p();
        }
        AnonymousClass0fD.A09(658541008, A022);
    }
}
