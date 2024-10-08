package com.instagram.creation.activity;

import X.0Aj;
import X.0Tu;
import X.0cp;
import X.0kD;
import X.0mi;
import X.0qQ;
import X.0qc;
import X.0wc;
import X.14i;
import X.182;
import X.1Ng;
import X.1ua;
import X.1wn;
import X.1xC;
import X.27p;
import X.28D;
import X.28E;
import X.28K;
import X.28t;
import X.ABQ;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass06Q;
import X.AnonymousClass06S;
import X.AnonymousClass0fD;
import X.AnonymousClass1Nd;
import X.AnonymousClass1QI;
import X.AnonymousClass2Rc;
import X.AnonymousClass36W;
import X.AnonymousClass3GP;
import X.AnonymousClass3GR;
import X.AnonymousClass3GT;
import X.AnonymousClass3GU;
import X.AnonymousClass3GV;
import X.AnonymousClass3M8;
import X.AnonymousClass3Q2;
import X.AnonymousClass457;
import X.AnonymousClass4DH;
import X.AnonymousClass514;
import X.AnonymousClass5w8;
import X.AnonymousClass7IH;
import X.AnonymousClass9T3;
import X.C10954S2m;
import X.C249463jp;
import X.C249703kE;
import X.C267834cI;
import X.C267844cJ;
import X.C267854cK;
import X.C267864cL;
import X.C267884cN;
import X.C273514mi;
import X.C273534mk;
import X.C273544ml;
import X.C273554mm;
import X.C273564mn;
import X.C273574mo;
import X.C273584mp;
import X.C273594mq;
import X.C273604mr;
import X.C273614ms;
import X.C273884nL;
import X.C279294yP;
import X.C283565Ie;
import X.C347397wk;
import X.C347457wq;
import X.C347467wr;
import X.C3499582p;
import X.C3499682q;
import X.C353948Ka;
import X.C357638Yz;
import X.C363388je;
import X.C363658k8;
import X.C364848m7;
import X.C364978mK;
import X.C395019z4;
import X.C49321Etc;
import X.C59689JTv;
import X.C59796JYp;
import X.C59882Jb5;
import X.C59885Jb9;
import X.C59886JbA;
import X.C59888JbD;
import X.C59890JbF;
import X.C59899JbO;
import X.C59953JcJ;
import X.C59961JcU;
import X.C61110lV;
import X.C61861KPa;
import X.C61862KPb;
import X.C61863KPc;
import X.C61864KPd;
import X.C61865KPe;
import X.C61866KPf;
import X.C62580KiD;
import X.C63201Kt8;
import X.C63469KxY;
import X.C64168LRo;
import X.C64681Lg9;
import X.C64684LgC;
import X.C64685LgD;
import X.C64686LgF;
import X.C64687LgG;
import X.C64699LgU;
import X.C64891Ljr;
import X.C66434MRo;
import X.JWE;
import X.JWG;
import X.JWH;
import X.JWX;
import X.JX9;
import X.JZ1;
import X.JZM;
import X.KH8;
import X.KP7;
import X.KP8;
import X.KP9;
import X.KPA;
import X.KPB;
import X.KPC;
import X.KPD;
import X.KPE;
import X.KPG;
import X.KPH;
import X.KPI;
import X.KPJ;
import X.KPK;
import X.KPL;
import X.KPM;
import X.KPN;
import X.KPO;
import X.KPQ;
import X.KPR;
import X.KPS;
import X.KPT;
import X.KPU;
import X.KPV;
import X.KPW;
import X.KPX;
import X.KPY;
import X.KPZ;
import X.LFT;
import X.LPU;
import X.LSj;
import X.LgE;
import X.M63;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.creation.state.CreationState;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.UpcomingEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class MediaCaptureActivity extends IgFragmentActivity implements C267834cI, C61110lV, C267844cJ, C249463jp, C267854cK, 1wn, C273514mi, C273534mk, C273544ml, C273554mm, C273564mn, C267864cL, C273574mo, C267884cN, C273584mp, C273594mq, C273604mr, C273614ms {
    public static final CallerContext A0U = CallerContext.A01("MediaCaptureActivity");
    public AnonymousClass06Q A00;
    public 28D A01 = 28D.A5J;
    public C10954S2m A02 = null;
    public AnonymousClass4DH A03;
    public UserSession A04;
    public C64699LgU A05;
    public CreationSession A06;
    public JWG A07;
    public JWH A08;
    public C3499582p A09;
    public C59885Jb9 A0A;
    public 1ua A0B;
    public boolean A0C;
    public View A0D;
    public C357638Yz A0E = null;
    public AnonymousClass3M8 A0F;
    public UpcomingEvent A0G;
    public Boolean A0H = null;
    public String A0I;
    public ArrayList A0J;
    public boolean A0K = false;
    public boolean A0L = false;
    public final List A0M = new ArrayList();
    public final Map A0N = new HashMap();
    public final 1wn A0O = new C64687LgG(this);
    public final 1wn A0P = new LgE(this);
    public final 1wn A0Q = new C64686LgF(this);
    public final 1wn A0R = new C64684LgC(this);
    public final 1wn A0S = new C64685LgD(this);
    public final Set A0T = new HashSet();

    public final /* synthetic */ void AGe() {
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0050, code lost:
        if (r0.A04 == false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cqm(X.AnonymousClass3Q2 r13) {
        /*
            r12 = this;
            r3 = r12
            android.content.Context r1 = r12.getApplicationContext()
            com.instagram.common.session.UserSession r0 = r12.A04
            X.2Nn r2 = X.AnonymousClass830.A00(r1, r0)
            com.instagram.pendingmedia.model.ClipInfo r0 = r13.A1N
            java.lang.String r1 = r0.A0F
            r1.getClass()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.io.File r1 = X.C39907AIy.A00(r2, r0)
            com.instagram.common.session.UserSession r5 = r12.A04
            X.5Eg r0 = com.instagram.common.gallery.Medium.A0i
            com.instagram.common.gallery.Medium r0 = r0.A06(r1)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r10)
            X.82p r0 = r12.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = r0.A0B
            java.lang.String r8 = r12.A0I
            java.util.ArrayList r1 = r12.A0J
            if (r1 == 0) goto L_0x0057
            r0 = 0
            java.lang.Object r9 = r1.get(r0)
            java.lang.String r9 = (java.lang.String) r9
        L_0x0044:
            X.28D r4 = r12.A01
            r6 = 0
            com.instagram.creation.base.CreationSession r0 = r12.A06
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.A04
            r11 = 1
            if (r0 != 0) goto L_0x0053
        L_0x0052:
            r11 = 0
        L_0x0053:
            X.C250563lf.A0L(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0057:
            r9 = 0
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.Cqm(X.3Q2):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2.A0B(r1) != false) goto L_0x0015;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cux(boolean r16, boolean r17, boolean r18) {
        /*
            r15 = this;
            r3 = r15
            X.JWG r2 = r15.A07
            if (r2 == 0) goto L_0x0018
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            boolean r0 = r2.A0B(r1)
            if (r0 != 0) goto L_0x0015
            java.lang.Integer r1 = X.AnonymousClass05K.A0D
            boolean r0 = r2.A0B(r1)
            if (r0 == 0) goto L_0x0018
        L_0x0015:
            r2.A08(r1)
        L_0x0018:
            com.instagram.common.session.UserSession r4 = r15.A04
            X.82p r0 = r15.A09
            X.82q r6 = r0.A00
            r6.getClass()
            X.1ua r8 = r15.A0B
            X.JWG r5 = r15.A07
            X.MBP r10 = new X.MBP
            r0 = r18
            r10.<init>(r15, r0)
            X.MBQ r11 = new X.MBQ
            r11.<init>(r15, r0)
            java.lang.String r9 = "MediaCaptureActivity"
            r14 = 0
            r12 = r16
            r13 = r17
            r7 = r15
            X.LPT.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.Cux(boolean, boolean, boolean):void");
    }

    public final /* synthetic */ void D7H(int i, int i2) {
    }

    public final void DFf(Location location, Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, HashMap hashMap, int i, int i2) {
        A02(location, uri, mediaUploadMetadata, this, cropInfo, str, (String) null, (String) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, hashMap, i, i2);
    }

    public final void EJy(boolean z) {
        this.A0L = true;
        EBv(new M63(this, z));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity] */
    private void A00() {
        C3499682q r0 = this.A09.A00;
        r0.getClass();
        ((JWE) r0).A01.A06();
        this.A0N.clear();
        C64168LRo.A0A.A03(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(android.content.Intent r10, java.lang.String r11, boolean r12) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x0119
            long r0 = java.lang.System.nanoTime()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6 = 0
            X.0qQ.A0B(r0, r6)
            X.3Q2 r4 = X.AnonymousClass9T3.A01(r0)
            r9.Ex2(r4)
            java.util.HashMap r0 = X.C379839Vn.A00(r11)
            r4.A44 = r0
            java.lang.String r8 = "originalMediaPath"
            java.lang.String r0 = r10.getStringExtra(r8)
            if (r0 == 0) goto L_0x0029
            java.util.HashMap r0 = X.C379839Vn.A00(r0)
            r4.A44 = r0
        L_0x0029:
            java.lang.String r0 = "originalMediaUri"
            java.lang.String r7 = r10.getStringExtra(r0)
            r4.A3M = r7
            r0 = 370(0x172, float:5.18E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r10.getStringExtra(r0)
            if (r1 == 0) goto L_0x011e
            r0 = 2845(0xb1d, float:3.987E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "com.facebook.mwa.ai"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x011a
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r4.A13
            r0.A03 = r1
        L_0x0055:
            java.lang.String r0 = "content_url"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 == 0) goto L_0x005f
            r4.A2O = r0
        L_0x005f:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r4.A13
            com.instagram.common.session.UserSession r0 = r9.A04
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = X.C59778JXx.A01(r10, r0)
            r1.A00(r0)
            r4.A3K = r11
            java.lang.String r0 = "sourceMediaId"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 == 0) goto L_0x0076
            r4.A3h = r0
        L_0x0076:
            r0 = 3554(0xde2, float:4.98E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r5 = r10.getIntExtra(r0, r6)
            r4.A08 = r5
            java.lang.String r0 = r10.getStringExtra(r8)
            r4.A3L = r0
            java.lang.String r0 = "media_upload_metadata"
            android.os.Parcelable r1 = r10.getParcelableExtra(r0)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = (com.instagram.common.gallery.metadata.MediaUploadMetadata) r1
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r4.A13
            r0.A00(r1)
            r0 = 504(0x1f8, float:7.06E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r10.getStringExtra(r0)
            if (r1 == 0) goto L_0x00a9
            boolean r0 = X.C393979xL.A00(r1)
            if (r0 != 0) goto L_0x00a9
            r4.A2Z = r1
        L_0x00a9:
            r9.A00()
            X.82p r0 = r9.A09
            X.82q r3 = r0.A00
            r3.getClass()
            r3.ExF(r11, r7)
            r0 = r3
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r2 = r0.A01
            r2.A0K = r12
            java.lang.String r0 = "isMirrored"
            boolean r1 = r10.getBooleanExtra(r0, r6)
            com.instagram.creation.base.PhotoSession r0 = r2.A02()
            if (r0 == 0) goto L_0x00cf
            com.instagram.creation.base.PhotoSession r0 = r2.A02()
            r0.A0C = r1
        L_0x00cf:
            int r0 = r4.A08
            r3.EVc(r0)
            r1 = 2
            java.lang.String r0 = "mediaSource"
            int r0 = r10.getIntExtra(r0, r1)
            r2.A02 = r0
            r3.EVc(r5)
            java.lang.String r0 = r4.A35
            r3.EfU(r0)
            r0 = 3740(0xe9c, float:5.241E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r1 = r10.getParcelableExtra(r0)
            com.instagram.creation.base.CropInfo r1 = (com.instagram.creation.base.CropInfo) r1
            if (r1 == 0) goto L_0x00ff
            com.instagram.creation.base.PhotoSession r0 = r2.A02()
            if (r0 == 0) goto L_0x00ff
            com.instagram.creation.base.PhotoSession r0 = r2.A02()
            r0.A05 = r1
        L_0x00ff:
            r0 = 3741(0xe9d, float:5.242E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r1 = r10.getParcelableExtra(r0)
            android.location.Location r1 = (android.location.Location) r1
            if (r1 == 0) goto L_0x0114
            com.instagram.creation.base.MediaSession r0 = r2.A07
            if (r0 == 0) goto L_0x0114
            r0.EcZ(r1)
        L_0x0114:
            com.instagram.common.session.UserSession r0 = r9.A04
            X.JWX.A00(r0)
        L_0x0119:
            return
        L_0x011a:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r4.A13
            r0.A06 = r1
        L_0x011e:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r3 = r4.A13
            java.lang.String r2 = r4.A0G()
            com.instagram.common.session.UserSession r1 = r9.A04
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.0sn r0 = X.0sn.A00
            java.lang.String r0 = X.C59737JVv.A02(r1, r2, r0)
            r3.A03 = r0
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.A01(android.content.Intent, java.lang.String, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, X.4mi, com.instagram.creation.activity.MediaCaptureActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.instagram.creation.activity.MediaCaptureActivity r4) {
        /*
            X.82p r0 = r4.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            r3 = 0
            if (r0 == 0) goto L_0x0053
            X.82p r0 = r4.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0053
            X.82p r0 = r4.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0042
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.M25 r0 = new X.M25
            r0.<init>(r4)
            r1.post(r0)
            return
        L_0x0042:
            com.instagram.common.session.UserSession r2 = r4.A04
            X.4DH r0 = r4.A03
            r1 = 0
            if (r0 == 0) goto L_0x004a
            r1 = 1
        L_0x004a:
            X.KPe r0 = new X.KPe
            r0.<init>(r3, r1)
            X.C59888JbD.A01(r2, r0)
            return
        L_0x0053:
            X.82p r1 = r4.A09
            com.instagram.common.session.UserSession r0 = r4.A04
            X.LIb.A00(r4, r0, r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.A03(com.instagram.creation.activity.MediaCaptureActivity):void");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, X.4cI, com.instagram.creation.activity.MediaCaptureActivity] */
    private void A06(boolean z) {
        Context applicationContext;
        String str;
        C3499682q r0 = this.A09.A00;
        r0.getClass();
        for (MediaSession mediaSession : r0.Co4()) {
            Integer Bsu = mediaSession.Bsu();
            if (Bsu == AnonymousClass05K.A00) {
                A05(mediaSession, z, true);
            } else if (Bsu == AnonymousClass05K.A01) {
                VideoSession videoSession = (VideoSession) mediaSession;
                AnonymousClass3Q2 BbQ = BbQ(videoSession.A0G);
                if (BbQ == null) {
                    0kD.A01("MediaCaptureActivity_setupVideoSessionForEdit", "pendingMedia is null.");
                    applicationContext = getApplicationContext();
                    str = AnonymousClass000.A00(3570);
                } else if (BbQ.A33 == null) {
                    0kD.A01("MediaCaptureActivity_setupVideoSessionForEdit", "image file path is null.");
                    applicationContext = getApplicationContext();
                    str = "media_file_path_unavailable";
                } else if (BbQ.A5U && !z) {
                    videoSession.A00(BbQ);
                    videoSession.A09 = BbQ.A1i.A01;
                    videoSession.A03 = BbQ.A05;
                    ClipInfo clipInfo = BbQ.A1N;
                    videoSession.A02 = clipInfo.A07;
                    videoSession.A01 = clipInfo.A05;
                    videoSession.A0J = BbQ.A5F;
                }
                C59689JTv.A0B(applicationContext, str);
            }
        }
        if (z) {
            C3499682q r02 = this.A09.A00;
            r02.getClass();
            CreationSession creationSession = ((JWE) r02).A01;
            for (MediaSession mediaSession2 : creationSession.A0E) {
                LFT lft = (LFT) creationSession.A0O.get(mediaSession2.B5g());
                if (mediaSession2.Bsu() == AnonymousClass05K.A00 && lft != null) {
                    FilterGroupModel A002 = lft.A00();
                    if (A002 != null) {
                        mediaSession2.EWm(A002);
                    }
                    mediaSession2.Ejx(lft.A05);
                }
            }
            creationSession.A0O.clear();
        }
        C3499682q r03 = this.A09.A00;
        r03.getClass();
        r03.EK5(this);
    }

    private void A07(CreationState[] creationStateArr) {
        if (this.A0A == null) {
            C59885Jb9 jb9 = new C59885Jb9(this.A04, creationStateArr);
            this.A0A = jb9;
            UserSession userSession = this.A04;
            this.A05 = new C64699LgU(getSupportFragmentManager(), this.A01, userSession, this, this.A09, this.A0G);
            CreationState creationState = CreationState.A0E;
            Class<C61865KPe> cls = C61865KPe.class;
            CreationState creationState2 = CreationState.A0R;
            jb9.A02(creationState, creationState2, cls);
            CreationState creationState3 = CreationState.A0F;
            jb9.A02(creationState, creationState3, KPO.class);
            jb9.A02(creationState3, creationState2, cls);
            Class<KPN> cls2 = KPN.class;
            CreationState creationState4 = CreationState.A02;
            jb9.A02(creationState2, creationState4, cls2);
            Class<KPK> cls3 = KPK.class;
            CreationState creationState5 = CreationState.A0W;
            jb9.A02(creationState2, creationState5, cls3);
            Class<KPZ> cls4 = KPZ.class;
            CreationState creationState6 = CreationState.A0J;
            jb9.A02(creationState2, creationState6, cls4);
            jb9.A02(creationState6, creationState2, cls);
            Class<KPH> cls5 = KPH.class;
            jb9.A02(creationState, creationState5, cls5);
            CreationState creationState7 = CreationState.A0P;
            jb9.A02(creationState, creationState7, KPJ.class);
            jb9.A02(creationState7, creationState5, cls5);
            Class<C61864KPd> cls6 = C61864KPd.class;
            CreationState creationState8 = CreationState.A0c;
            jb9.A02(creationState, creationState8, cls6);
            CreationState creationState9 = CreationState.A0b;
            jb9.A02(creationState9, creationState8, cls6);
            jb9.A02(creationState, creationState9, KPM.class);
            jb9.A02(creationState8, creationState4, cls2);
            jb9.A02(creationState8, creationState5, cls3);
            jb9.A02(CreationState.A0T, creationState8, cls6);
            Class<C61861KPa> cls7 = C61861KPa.class;
            CreationState creationState10 = CreationState.A04;
            jb9.A02(creationState, creationState10, cls7);
            jb9.A02(creationState6, creationState10, cls7);
            Class<C61866KPf> cls8 = C61866KPf.class;
            jb9.A02(creationState10, creationState2, cls8);
            Class<C61862KPb> cls9 = C61862KPb.class;
            jb9.A02(creationState10, creationState8, cls9);
            jb9.A02(creationState10, creationState5, cls3);
            jb9.A02(creationState10, creationState6, cls4);
            jb9.A02(creationState10, creationState4, cls2);
            CreationState creationState11 = CreationState.A0H;
            jb9.A02(creationState11, creationState2, cls8);
            jb9.A02(creationState11, creationState8, cls9);
            jb9.A02(creationState11, creationState5, cls3);
            jb9.A02(creationState11, creationState4, cls2);
            CreationState creationState12 = CreationState.A0I;
            jb9.A02(creationState12, creationState5, cls3);
            jb9.A02(creationState12, creationState4, cls2);
            Class<KPT> cls10 = KPT.class;
            CreationState creationState13 = CreationState.A0N;
            jb9.A02(creationState5, creationState13, cls10);
            jb9.A02(creationState5, CreationState.A0K, KP7.class);
            jb9.A02(creationState5, CreationState.A0C, KPR.class);
            jb9.A02(creationState5, CreationState.A0D, KPS.class);
            jb9.A02(creationState5, CreationState.A0U, KPL.class);
            CreationState creationState14 = CreationState.A0Y;
            jb9.A02(creationState5, creationState14, KPU.class);
            Class<KPW> cls11 = KPW.class;
            CreationState creationState15 = CreationState.A0Z;
            jb9.A02(creationState5, creationState15, cls11);
            jb9.A02(creationState14, creationState15, cls11);
            Class<KPY> cls12 = KPY.class;
            CreationState creationState16 = CreationState.A03;
            jb9.A02(creationState5, creationState16, cls12);
            CreationState creationState17 = CreationState.A0V;
            jb9.A02(creationState5, creationState17, KPV.class);
            jb9.A02(creationState5, CreationState.A0G, KPG.class);
            CreationState creationState18 = CreationState.A0A;
            jb9.A02(creationState18, CreationState.A06, KP8.class);
            Class<KPC> cls13 = KPC.class;
            CreationState creationState19 = CreationState.A0Q;
            jb9.A02(creationState5, creationState19, cls13);
            jb9.A02(creationState17, creationState19, cls13);
            Class<KP9> cls14 = KP9.class;
            CreationState creationState20 = CreationState.A09;
            jb9.A02(creationState19, creationState20, cls14);
            Class<KPB> cls15 = KPB.class;
            jb9.A02(creationState19, creationState18, cls15);
            Class<KPD> cls16 = KPD.class;
            CreationState creationState21 = CreationState.A08;
            jb9.A02(creationState5, creationState21, cls16);
            jb9.A02(creationState17, creationState21, cls16);
            jb9.A02(creationState5, creationState20, cls14);
            jb9.A02(creationState17, creationState20, cls14);
            Class<KPA> cls17 = KPA.class;
            CreationState creationState22 = CreationState.A07;
            jb9.A02(creationState5, creationState22, cls17);
            jb9.A02(creationState17, creationState22, cls17);
            jb9.A02(creationState5, creationState18, cls15);
            jb9.A02(creationState17, creationState18, cls15);
            jb9.A02(creationState20, creationState18, cls15);
            jb9.A02(creationState22, creationState21, cls16);
            jb9.A02(creationState18, creationState20, cls14);
            jb9.A02(creationState18, creationState22, cls17);
            jb9.A02(creationState5, creationState2, cls8);
            jb9.A02(creationState5, creationState8, cls9);
            jb9.A02(creationState5, creationState10, C61863KPc.class);
            jb9.A02(creationState5, CreationState.A0X, KPQ.class);
            Class<KPI> cls18 = KPI.class;
            CreationState creationState23 = CreationState.A0M;
            jb9.A02(creationState16, creationState23, cls18);
            Class<KPE> cls19 = KPE.class;
            CreationState creationState24 = CreationState.A01;
            jb9.A02(creationState16, creationState24, cls19);
            jb9.A02(creationState24, CreationState.A05, KPX.class);
            jb9.A02(creationState17, creationState23, cls18);
            jb9.A02(creationState17, creationState24, cls19);
            jb9.A02(creationState17, creationState13, cls10);
            jb9.A02(creationState17, creationState16, cls12);
            AnonymousClass1Nd.A00(this.A04).A01(this.A0A, C59888JbD.class);
            this.A0A.A01(this);
            for (1wn A012 : this.A0M) {
                this.A0A.A01(A012);
            }
            return;
        }
        throw new RuntimeException("State machine already initialised.");
    }

    public final void A08() {
        C59885Jb9 jb9;
        View view;
        int i;
        if (this.A0D != null && (jb9 = this.A0A) != null) {
            CreationState A002 = jb9.A00();
            if (A002 == CreationState.A02 || A002 == CreationState.A04 || A002 == CreationState.A0R || A002 == CreationState.A0H || A002 == CreationState.A0c || A002 == CreationState.A0T || A002 == CreationState.A0U || A002 == CreationState.A0O || A002 == CreationState.A0W || A002 == CreationState.A0P || A002 == CreationState.A0X || A002 == CreationState.A03 || A002 == CreationState.A0M || A002 == CreationState.A0B || A002 == CreationState.A0Q || A002 == CreationState.A01 || A002 == CreationState.A05 || A002 == CreationState.A0I) {
                view = this.A0D;
                i = 0;
            } else {
                view = this.A0D;
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    /* JADX WARNING: type inference failed for: r0v38, types: [X.KH8, X.11X] */
    public final void A09(Medium medium) {
        AnonymousClass514 r1;
        Location location;
        Medium medium2 = medium;
        int i = 0;
        if (medium2.A05()) {
            double[] A072 = medium2.A07(getContentResolver());
            if (A072 != null) {
                location = new Location("photo");
                location.setLatitude(A072[0]);
                location.setLongitude(A072[1]);
            } else {
                location = null;
            }
            if ("image/jpeg".equals(medium2.A03())) {
                String str = medium2.A0X;
                int i2 = medium2.A07;
                String str2 = medium2.A0Y;
                MediaUploadMetadata mediaUploadMetadata = medium2.A0G;
                String str3 = medium2.A0N;
                String str4 = medium2.A0W;
                if (str4 != null) {
                    Uri A032 = 0cp.A03(str4);
                    0qQ.A07(A032);
                    String str5 = medium2.A0M;
                    String str6 = medium2.A0P;
                    A02(location, A032, mediaUploadMetadata, this, (CropInfo) null, str, str2, str3, str, str5, str6, medium2.A0Q, medium2.A0S, (String) null, (HashMap) null, i2, 0);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            schedule(new KH8(location, medium2, this));
        } else if (medium2.CeS()) {
            String str7 = medium2.A0X;
            getApplicationContext();
            C59796JYp A012 = C59796JYp.A01(str7, 0);
            if (ABQ.A01(A012, new AnonymousClass7IH(this), true, true)) {
                C3499682q r0 = this.A09.A00;
                r0.getClass();
                if (((JWE) r0).A01.A0K) {
                    i = getIntent().getIntExtra("mediaSource", 1);
                }
                C3499682q r2 = this.A09.A00;
                AnonymousClass3Q2 A002 = JZ1.A00((String) null, i);
                if (r2 != null) {
                    if (str7 != null) {
                        r2.ExH(str7);
                        r2.EfU(A002.A35);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                String str8 = medium2.A0Y;
                if (str8 != null) {
                    A002.A3h = str8;
                }
                String str9 = medium2.A0Q;
                if (str9 != null) {
                    A002.A2V = str9;
                }
                String str10 = medium2.A0P;
                if (str10 != null) {
                    A002.A2W = str10;
                }
                String str11 = medium2.A0M;
                if (str11 != null) {
                    A002.A2o = str11;
                    String str12 = medium2.A0S;
                    if (str12 != null) {
                        A002.A2n = str12;
                    }
                }
                this.A0B.A0F(A002);
                JZ1.A02(this.A04, this.A09.A00(), A002, A012, 1.0f, 1000 * C63469KxY.A00(this.A04));
                float A003 = 0mi.A00(((float) A002.A0H) / ((float) A002.A0G), 0.8f, 1.91f);
                if (!getIntent().getBooleanExtra("videoRectangleCrop", false)) {
                    A003 = 1.0f;
                }
                A002.A02 = A003;
                A002.A1N.A00 = A003;
                C3499682q r02 = this.A09.A00;
                r02.getClass();
                r02.EOx(A003);
                C3499682q r22 = this.A09.A00;
                r22.getClass();
                if (getIntent().getBooleanExtra("videoRectangleCrop", false)) {
                    r1 = AnonymousClass514.FOUR_BY_FIVE;
                } else {
                    r1 = AnonymousClass514.SQUARE;
                }
                ((JWE) r22).A01.A06 = r1;
                Cqm(A002);
                return;
            }
            onBackPressed();
        }
    }

    public final void AIU() {
        28E.A00(this.A04).A04();
    }

    public final C3499582p Ajn() {
        return this.A09;
    }

    public final CreationSession AsK() {
        return this.A06;
    }

    public final AnonymousClass3Q2 BbQ(String str) {
        return 28K.A00(this.A04).A03(str);
    }

    public final C364848m7 Blh(String str) {
        JWH jwh = this.A08;
        jwh.getClass();
        return jwh.A02(this.A02, str);
    }

    public final AnonymousClass3M8 Bx5() {
        AnonymousClass3M8 r2 = this.A0F;
        if (r2 != null) {
            return r2;
        }
        View findViewById = findViewById(R.id.snack_bar_stub);
        findViewById.getClass();
        ViewStub viewStub = (ViewStub) findViewById;
        0qQ.A0B(viewStub, 1);
        AnonymousClass3M8 r22 = new AnonymousClass3M8(viewStub, false);
        this.A0F = r22;
        return r22;
    }

    public final UserSession CCy() {
        return this.A04;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity] */
    public final void CpX(Uri uri) {
        C49321Etc etc;
        Bundle bundle;
        int i;
        String A002;
        C59882Jb5.A01(this.A04, AnonymousClass05K.A0M);
        C3499682q r0 = this.A09.A00;
        r0.getClass();
        if (r0.AGg() != AnonymousClass36W.PROFILE_PHOTO) {
            C3499682q r02 = this.A09.A00;
            r02.getClass();
            if (r02.AGg() != AnonymousClass36W.GROUP_PHOTO) {
                0qQ.A0B(uri, 1);
                etc = new C49321Etc(this);
                bundle = etc.A00;
                bundle.putParcelable("CropFragment.imageUri", uri);
                bundle.putInt(AnonymousClass000.A00(217), C249703kE.FLAG_MOVED);
                i = 200;
                A002 = "CropFragment.smallestDimension";
                bundle.putInt(A002, i);
                C3499682q r03 = this.A09.A00;
                r03.getClass();
                ((JWE) r03).A01.A02 = 0;
                C59888JbD.A01(this.A04, new KPO(etc.A00));
            }
        }
        0qQ.A0B(uri, 1);
        etc = new C49321Etc(this);
        bundle = etc.A00;
        bundle.putParcelable("CropFragment.imageUri", uri);
        bundle.putBoolean(AnonymousClass000.A00(898), true);
        i = 1080;
        A002 = AnonymousClass000.A00(217);
        bundle.putInt(A002, i);
        C3499682q r032 = this.A09.A00;
        r032.getClass();
        ((JWE) r032).A01.A02 = 0;
        C59888JbD.A01(this.A04, new KPO(etc.A00));
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1qK, java.lang.Object] */
    public final void DgW(boolean z) {
        String absolutePath;
        String str;
        C64891Ljr ljr;
        C3499682q r0 = this.A09.A00;
        r0.getClass();
        for (MediaSession mediaSession : r0.Co4()) {
            String BbR = mediaSession.BbR();
            AnonymousClass3Q2 BbQ = BbQ(BbR);
            boolean z2 = true;
            if (BbQ == null) {
                HashMap hashMap = new HashMap();
                if (BbR != null) {
                    z2 = false;
                }
                hashMap.put("Pending Media Key is null: ", String.valueOf(z2));
                0kD.A0I("MediaCaptureActivity: failed to copy album draft", (Throwable) null, hashMap);
            } else if (BbQ.A5U && !BbQ.A5R) {
                AnonymousClass3Q2 A002 = AnonymousClass9T3.A00(BbQ, String.valueOf(System.nanoTime()));
                A002.A3O = null;
                BbQ.A30 = A002.A3t;
                28K.A00(this.A04).A0D(A002, A002.A35);
                Integer Bsu = mediaSession.Bsu();
                if (Bsu == AnonymousClass05K.A00) {
                    absolutePath = 0qc.A02();
                    absolutePath.getClass();
                    str = BbQ.A3Z;
                    str.getClass();
                    ljr = new C64891Ljr(this, A002, absolutePath, false);
                } else if (Bsu == AnonymousClass05K.A01) {
                    VideoSession videoSession = (VideoSession) mediaSession;
                    int i = videoSession.A09;
                    int i2 = videoSession.A03;
                    int i3 = videoSession.A02;
                    int i4 = videoSession.A01;
                    boolean z3 = videoSession.A0J;
                    A002.A1i.A01 = i;
                    A002.A05 = i2;
                    ClipInfo clipInfo = A002.A1N;
                    clipInfo.A07 = i3;
                    clipInfo.A05 = i4;
                    A002.A5F = z3;
                    absolutePath = AnonymousClass457.A01().getAbsolutePath();
                    str = BbQ.A33;
                    if (str == null) {
                        str = BbQ.A3Z;
                        str.getClass();
                    }
                    ljr = new C64891Ljr(this, A002, absolutePath, true);
                }
                0qc.A04(str, absolutePath, new WeakReference(ljr));
            }
        }
        if (z) {
            Cux(false, true, true);
        } else {
            AnonymousClass1Nd.A00(this.A04).A05(new Object());
        }
    }

    public final void EBv(Runnable runnable) {
        28E.A00(this.A04).A06(runnable);
    }

    public final void Ex2(AnonymousClass3Q2 r2) {
        this.A0B.A0E(r2);
    }

    public final void FMZ(AnonymousClass3Q2 r5) {
        ShareType shareType;
        if (Boolean.valueOf(182.A06(0Tu.A05, this.A04, 36320614277587622L)).booleanValue()) {
            shareType = ShareType.FOLLOWERS_SHARE;
        } else {
            shareType = ShareType.UNKNOWN;
        }
        r5.A1k = shareType;
        this.A0B.A0I(r5, true, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: type inference failed for: r17v1, types: [X.SBa, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00c6, code lost:
        if (r9.getParcelable("MediaCaptureActivity.CREATION_SESSION") == null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x02bd, code lost:
        if (r10.hasExtra(r1) == false) goto L_0x02bf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x03e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r45) {
        /*
            r44 = this;
            r9 = r45
            r0 = 626492978(0x25578632, float:1.8693745E-16)
            int r6 = X.AnonymousClass0fD.A00(r0)
            r7 = r44
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r8 = r0.getExtras()
            r8.getClass()
            X.08y r0 = X.09i.A0A
            com.instagram.common.session.UserSession r2 = r0.A06(r8)
            r7.A04 = r2
            X.0Tu r11 = X.0Tu.A05
            r0 = 36327267181345085(0x810f750001393d, double:3.036848271421913E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x002c
            r9 = 0
        L_0x002c:
            com.instagram.common.session.UserSession r0 = r7.A04
            X.JVm r0 = X.AnonymousClass9PJ.A00(r0)
            r0.A03()
            com.instagram.common.session.UserSession r0 = r7.A04
            X.JbO r0 = X.JZM.A00(r0)
            r5 = 1
            r0.A03 = r5
            java.lang.String r1 = "cameraEntryPoint"
            java.lang.Object r0 = r8.get(r1)
            boolean r0 = r0 instanceof X.28D
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r8.get(r1)
            X.28D r0 = (X.28D) r0
            r7.A01 = r0
        L_0x0050:
            java.lang.String r0 = "upcoming_event"
            java.lang.Object r0 = r8.get(r0)
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            r7.A0G = r0
            java.lang.String r0 = "linked_highlight_id"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r7.A0I = r0
            r0 = 1411(0x583, float:1.977E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.ArrayList r0 = r8.getStringArrayList(r0)
            r7.A0J = r0
            X.AnonymousClass1GD.A01(r7)
            r7.setupColorTheme()
            android.view.Window r4 = r7.getWindow()
            r4.getClass()
            r4.setFormat(r5)
            r0 = 4096(0x1000, float:5.74E-42)
            r4.addFlags(r0)
            r0 = 2130971249(0x7f040a71, float:1.7551231E38)
            int r0 = X.2Yu.A0F(r7, r0)
            X.2db.A02(r7, r0)
            r0 = 2131624025(0x7f0e0059, float:1.8875218E38)
            r7.setContentView((int) r0)
            r0 = 2131440079(0x7f0b31cf, float:1.8502131E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L_0x00a1
            r0.setFitsSystemWindows(r5)
        L_0x00a1:
            r0 = 2131435911(0x7f0b2187, float:1.8493678E38)
            android.view.View r0 = r7.findViewById(r0)
            r0.getClass()
            r7.A0D = r0
            com.instagram.common.session.UserSession r0 = r7.A04
            X.JWG r1 = new X.JWG
            r1.<init>(r7, r0, r7)
            r7.A07 = r1
            X.JWH r0 = new X.JWH
            r0.<init>(r7, r7, r1, r7)
            r7.A08 = r0
            if (r9 == 0) goto L_0x00c8
            java.lang.String r0 = "MediaCaptureActivity.CREATION_SESSION"
            android.os.Parcelable r0 = r9.getParcelable(r0)
            r12 = 1
            if (r0 != 0) goto L_0x00c9
        L_0x00c8:
            r12 = 0
        L_0x00c9:
            java.lang.String r2 = "is_album_external_share"
            java.lang.String r10 = "MediaCaptureActivity.CREATION_SESSION"
            r0 = 3774(0xebe, float:5.289E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r3 = 0
            if (r12 == 0) goto L_0x067c
            android.os.Parcelable r13 = r9.getParcelable(r10)
            r13.getClass()
            com.instagram.creation.base.CreationSession r13 = (com.instagram.creation.base.CreationSession) r13
            r7.A06 = r13
            com.instagram.common.session.UserSession r12 = r7.A04
            X.28D r0 = r7.A01
            r16 = 0
            X.82Y r15 = new X.82Y
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r25 = r16
            r26 = r16
            r27 = r16
            r28 = r16
            r29 = r16
            r30 = r16
            r31 = r16
            r32 = r16
            r33 = r16
            r34 = r16
            r35 = r16
            r36 = r3
            r37 = r3
            r38 = r3
            r39 = r5
            r40 = r3
            r41 = r3
            r42 = r3
            r43 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.82p r0 = X.JWD.A00(r0, r12, r13, r15)
            r7.A09 = r0
            X.82q r0 = r0.A00
            r0.getClass()
            boolean r0 = r0.CZ4()
            if (r0 == 0) goto L_0x0156
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.creation.base.PhotoSession r0 = r0.A02()
            if (r0 == 0) goto L_0x0679
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r12 = r0.A07
        L_0x0146:
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            r0.E2g()
            if (r12 == 0) goto L_0x0156
            r0 = 3
            r12.EWl(r0, r5)
        L_0x0156:
            java.lang.String r0 = "MediaCaptureActivity.BUNDLE_STATE"
            android.os.Parcelable[] r13 = r9.getParcelableArray(r0)
            if (r13 == 0) goto L_0x0675
            int r12 = r13.length
            java.lang.Class<com.instagram.creation.state.CreationState[]> r0 = com.instagram.creation.state.CreationState[].class
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r13, r12, r0)
            com.instagram.creation.state.CreationState[] r0 = (com.instagram.creation.state.CreationState[]) r0
        L_0x0167:
            r7.A07(r0)
        L_0x016a:
            android.content.Intent r12 = r7.getIntent()
            java.lang.String r0 = "captureType"
            java.io.Serializable r12 = r12.getSerializableExtra(r0)
            X.36W r12 = (X.AnonymousClass36W) r12
            if (r12 != 0) goto L_0x0181
            X.36W r12 = X.AnonymousClass36W.FOLLOWERS_SHARE
            java.lang.String r13 = "MediaCaptureActivity#onCreate"
            java.lang.String r0 = "captureType is null from intent."
            X.0kD.A01(r13, r0)
        L_0x0181:
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r0.A0A = r12
            X.82p r0 = r7.A09
            X.82q r13 = r0.A00
            r13.getClass()
            android.content.Intent r12 = r7.getIntent()
            java.lang.String r0 = "isFromQcc"
            boolean r12 = r12.getBooleanExtra(r0, r3)
            X.JWE r13 = (X.JWE) r13
            com.instagram.creation.base.CreationSession r0 = r13.A01
            r0.A0K = r12
            android.content.Intent r12 = r7.getIntent()
            java.lang.Class<com.instagram.model.creation.MediaCaptureConfig> r0 = com.instagram.model.creation.MediaCaptureConfig.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r12.setExtrasClassLoader(r0)
            android.content.Intent r12 = r7.getIntent()
            java.lang.String r0 = "captureConfig"
            android.os.Parcelable r12 = r12.getParcelableExtra(r0)
            com.instagram.model.creation.MediaCaptureConfig r12 = (com.instagram.model.creation.MediaCaptureConfig) r12
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r0.A09 = r12
            X.82p r0 = r7.A09
            X.82q r13 = r0.A00
            r13.getClass()
            android.content.Intent r12 = r7.getIntent()
            r0 = 5317(0x14c5, float:7.451E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r12 = r12.getParcelableExtra(r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r12 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r12
            X.JWE r13 = (X.JWE) r13
            com.instagram.creation.base.CreationSession r0 = r13.A01
            r0.A0B = r12
            X.82p r0 = r7.A09
            X.82q r13 = r0.A00
            r13.getClass()
            android.content.Intent r12 = r7.getIntent()
            r0 = 35
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r12 = r12.getBooleanExtra(r0, r3)
            X.JWE r13 = (X.JWE) r13
            com.instagram.creation.base.CreationSession r0 = r13.A01
            r0.A0L = r12
            com.instagram.common.session.UserSession r0 = r7.A04
            X.1Av r14 = X.1Au.A00(r0)
            java.lang.String r13 = "off"
            X.0s0 r12 = r14.A1I
            X.0YZ[] r15 = X.1Av.A8a
            r0 = 25
            r0 = r15[r0]
            r12.Epx(r14, r13, r0)
            com.instagram.common.session.UserSession r12 = r7.A04
            X.80c r0 = new X.80c
            r0.<init>(r7, r12, r3, r3)
            X.2YN r12 = new X.2YN
            r12.<init>(r0, r7)
            java.lang.Class<X.8Yz> r0 = X.C357638Yz.class
            X.2YL r13 = r12.A00(r0)
            X.8Yz r13 = (X.C357638Yz) r13
            r7.A0E = r13
            X.8jC r12 = X.C363138jC.A00
            X.28D r0 = r7.A01
            r13.A0D(r0, r12)
            super.onCreate(r9)
            com.instagram.common.session.UserSession r0 = r7.A04
            X.1ua r0 = X.1ua.A00(r7, r0)
            r7.A0B = r0
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.36W r12 = r0.AGg()
            X.36W r0 = X.AnonymousClass36W.PROFILE_PHOTO
            if (r12 != r0) goto L_0x065e
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r0 = r7.BQ1()
            r0.A04 = r5
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.514 r8 = X.AnonymousClass514.SQUARE
        L_0x025c:
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r0.A06 = r8
        L_0x0262:
            if (r9 == 0) goto L_0x0284
            android.os.Parcelable r0 = r9.getParcelable(r10)
            if (r0 == 0) goto L_0x0284
        L_0x026a:
            android.view.WindowManager$LayoutParams r1 = r4.getAttributes()
            X.0qQ.A07(r1)
            r0 = 2
            X.C61290mR.A06(r1, r0)
            X.15Y r0 = X.15Y.A03
            X.14i.A03(r0, r7)
            r7.A08()
            r0 = -1936384634(0xffffffff8c951d86, float:-2.2974854E-31)
        L_0x0280:
            X.AnonymousClass0fD.A07(r0, r6)
            return
        L_0x0284:
            android.content.Intent r10 = r7.getIntent()
            java.lang.String r0 = "isPush"
            boolean r0 = r10.getBooleanExtra(r0, r3)
            r7.A0C = r0
            java.lang.String r0 = "isCrop"
            boolean r15 = r10.hasExtra(r0)
            java.lang.String r0 = "autoCenterCrop"
            boolean r14 = r10.getBooleanExtra(r0, r3)
            java.lang.String r9 = "videoFilePath"
            boolean r12 = r10.hasExtra(r9)
            r0 = 3409(0xd51, float:4.777E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r13 = r10.getBooleanExtra(r0, r3)
            r0 = 3408(0xd50, float:4.776E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r10.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x02bf
            boolean r0 = r10.hasExtra(r1)
            r8 = 1
            if (r0 != 0) goto L_0x02c0
        L_0x02bf:
            r8 = 0
        L_0x02c0:
            boolean r2 = r10.getBooleanExtra(r2, r3)
            java.lang.String r0 = "is_photo_external_share"
            boolean r1 = r10.getBooleanExtra(r0, r3)
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x036f
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A0W
        L_0x02db:
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0E
            if (r8 != r0) goto L_0x02fc
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r2 = r0.A01
            com.instagram.model.creation.MediaCaptureConfig r0 = r2.A09
            if (r0 != 0) goto L_0x02fc
            X.36W r0 = X.AnonymousClass36W.FOLLOWERS_SHARE
            X.JWU r1 = new X.JWU
            r1.<init>(r0)
            com.instagram.model.creation.MediaCaptureConfig r0 = new com.instagram.model.creation.MediaCaptureConfig
            r0.<init>((X.JWU) r1)
            r2.A09 = r0
        L_0x02fc:
            com.instagram.common.session.UserSession r0 = r7.A04
            X.27r r0 = X.27p.A01(r0)
            X.283 r0 = r0.A04
            java.lang.String r2 = r0.A0L
            if (r2 == 0) goto L_0x0335
            if (r13 == 0) goto L_0x0335
            com.instagram.common.session.UserSession r12 = r7.A04
            r0 = 36329659478065394(0x8111a2000040f2, double:3.038361169500842E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0335
            java.io.File r18 = r7.getCacheDir()
            X.SBa r17 = new X.SBa
            r17.<init>()
            java.lang.String r19 = "0"
            X.S2m r15 = new X.S2m
            r20 = r2
            r22 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r7.A02 = r15
        L_0x0335:
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0S
            if (r8 != r0) goto L_0x03e3
            com.instagram.creation.state.CreationState[] r0 = new com.instagram.creation.state.CreationState[]{r8}
            r7.A07(r0)
            if (r13 == 0) goto L_0x03da
            android.content.Intent r2 = r7.getIntent()
            r0 = 1678(0x68e, float:2.351E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r2.getStringExtra(r0)
            if (r1 != 0) goto L_0x03ca
            java.lang.String r0 = "CropFragment.imageUri"
            android.os.Parcelable r0 = r2.getParcelableExtra(r0)
            r0.getClass()
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r1 = r0.getPath()
            if (r1 != 0) goto L_0x03ca
            java.lang.String r1 = "MediaCaptureActivity"
            java.lang.String r0 = "preparing PHOTO_EDIT fragment without PHOTO_DATA_PATH"
            X.0kD.A01(r1, r0)
            r0 = -1280003574(0xffffffffb3b4b20a, float:-8.414288E-8)
            goto L_0x0280
        L_0x036f:
            if (r12 == 0) goto L_0x03a0
            android.os.Parcelable r0 = r10.getParcelableExtra(r9)
            if (r0 == 0) goto L_0x0395
            if (r14 == 0) goto L_0x0392
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A0T
        L_0x037b:
            java.lang.String r0 = "sourceMediaId"
            java.lang.String r0 = r10.getStringExtra(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r7.A0J = r0
            goto L_0x02db
        L_0x0392:
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A0b
            goto L_0x037b
        L_0x0395:
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A0E
            r1 = 2131961883(0x7f13281b, float:1.9560475E38)
            java.lang.String r0 = "external_video_share_error"
            X.C59689JTv.A01(r7, r0, r1, r3)
            goto L_0x037b
        L_0x03a0:
            if (r15 == 0) goto L_0x03a8
            if (r14 != 0) goto L_0x03c6
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A0F
            goto L_0x02db
        L_0x03a8:
            if (r13 != 0) goto L_0x03c6
            if (r8 == 0) goto L_0x03b3
            r7.A06(r3)
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A04
            goto L_0x02db
        L_0x03b3:
            if (r2 == 0) goto L_0x03bc
            r7.A06(r3)
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A0H
            goto L_0x02db
        L_0x03bc:
            if (r1 == 0) goto L_0x03c2
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A0I
            goto L_0x02db
        L_0x03c2:
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A0E
            goto L_0x02db
        L_0x03c6:
            com.instagram.creation.state.CreationState r8 = com.instagram.creation.state.CreationState.A0R
            goto L_0x02db
        L_0x03ca:
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0K
            r7.A01(r10, r1, r0)
        L_0x03da:
            X.82p r1 = r7.A09
            com.instagram.common.session.UserSession r0 = r7.A04
            X.LIb.A00(r7, r0, r1, r7, r3)
            goto L_0x026a
        L_0x03e3:
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0T
            if (r8 != r0) goto L_0x040e
            com.instagram.creation.state.CreationState[] r0 = new com.instagram.creation.state.CreationState[]{r8}
            r7.A07(r0)
            android.os.Parcelable r0 = r10.getParcelableExtra(r9)
            r0.getClass()
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r0 = r0.getPath()
            r0.getClass()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            X.5Eg r0 = com.instagram.common.gallery.Medium.A0i
            com.instagram.common.gallery.Medium r0 = r0.A06(r1)
            r7.A09(r0)
            goto L_0x026a
        L_0x040e:
            android.content.Intent r12 = r7.getIntent()
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r2 = r0.A0K
            r0 = 1678(0x68e, float:2.351E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r12.getStringExtra(r13)
            int r0 = r8.ordinal()
            java.lang.String r11 = "MediaCaptureActivity"
            r10 = 0
            r14 = 1
            switch(r0) {
                case 3: goto L_0x05ca;
                case 13: goto L_0x056a;
                case 14: goto L_0x05a0;
                case 16: goto L_0x05ca;
                case 17: goto L_0x0445;
                case 26: goto L_0x05d6;
                case 31: goto L_0x050c;
                case 36: goto L_0x0498;
                default: goto L_0x0434;
            }
        L_0x0434:
            com.instagram.creation.state.CreationState[] r0 = new com.instagram.creation.state.CreationState[]{r8}
            r7.A07(r0)
            if (r10 != 0) goto L_0x060c
            r7.finish()
            r0 = -1471242184(0xffffffffa84ea038, float:-1.1470039E-14)
            goto L_0x0280
        L_0x0445:
            X.8nf r0 = X.C365768ne.A0A
            X.8ne r0 = r0.A00()
            java.util.List r9 = r0.A09
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0492
            java.lang.Object r0 = r9.get(r3)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            java.lang.String r0 = r0.A0X
            if (r0 == 0) goto L_0x0492
            X.LGR r10 = X.AnonymousClass36R.A01()
            com.instagram.common.session.UserSession r2 = r7.A04
            X.4DH r1 = r7.A03
            r0 = 0
            if (r1 == 0) goto L_0x0469
            r0 = 1
        L_0x0469:
            X.JcV r10 = r10.A03(r2, r3, r3, r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0 = 3433(0xd69, float:4.81E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putExtra(r0, r5)
            android.os.Bundle r0 = r1.getExtras()
            r10.setArguments(r0)
            java.lang.Object r0 = r9.get(r3)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            java.lang.String r1 = r0.A0X
            android.content.Intent r0 = r7.getIntent()
            r7.A01(r0, r1, r3)
            goto L_0x0434
        L_0x0492:
            java.lang.String r0 = "preparing PhotoFilterFragment without valid mediums in external photo edit flow."
            X.0kD.A01(r11, r0)
            goto L_0x0434
        L_0x0498:
            android.os.Parcelable r13 = r12.getParcelableExtra(r9)
            r13.getClass()
            java.lang.String r0 = "videoRectangleCrop"
            boolean r9 = r12.getBooleanExtra(r0, r3)
            java.lang.String r0 = "sourceMediaId"
            java.lang.String r5 = r12.getStringExtra(r0)
            r7.A00()
            r7.getApplicationContext()
            android.content.Intent r2 = r7.getIntent()
            java.lang.String r1 = "mediaSource"
            r0 = 2
            int r1 = r2.getIntExtra(r1, r0)
            X.82p r0 = r7.A09
            X.82q r2 = r0.A00
            java.lang.String r0 = r13.toString()
            X.3Q2 r1 = X.JZ1.A00(r10, r1)
            if (r2 == 0) goto L_0x04d4
            if (r0 == 0) goto L_0x06fd
            r2.ExH(r0)
            java.lang.String r0 = r1.A35
            r2.EfU(r0)
        L_0x04d4:
            if (r5 == 0) goto L_0x04d8
            r1.A3h = r5
        L_0x04d8:
            X.1ua r0 = r7.A0B
            r0.A0F(r1)
            if (r9 == 0) goto L_0x04ee
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.514 r1 = X.AnonymousClass514.FOUR_BY_FIVE
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r0.A06 = r1
        L_0x04ee:
            X.AnonymousClass36R.A01()
            com.instagram.common.session.UserSession r0 = r7.A04
            X.0qQ.A0B(r0, r3)
            X.K7x r10 = new X.K7x
            r10.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r0, r1)
            r10.setArguments(r2)
            goto L_0x0434
        L_0x050c:
            X.AnonymousClass36R.A01()
            com.instagram.common.session.UserSession r13 = r7.A04
            X.28D r12 = r7.A01
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.pendingmedia.model.recipients.PendingRecipient r9 = r0.A0B
            X.0qQ.A0B(r13, r3)
            X.0qQ.A0B(r12, r5)
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r2 = new com.instagram.creation.fragment.followersshare.FollowersShareFragment
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r5 = r13.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.putString(r0, r5)
            r0 = 413(0x19d, float:5.79E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putSerializable(r0, r12)
            r0 = 4404(0x1134, float:6.171E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putParcelable(r0, r9)
            java.lang.String r0 = "UPCOMING_EVENT"
            r1.putParcelable(r0, r10)
            r2.setArguments(r1)
            r10 = r2
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0434
            int r0 = X.AnonymousClass3D4.A00(r7)
            r2.setContentInset(r3, r0, r3, r3)
            goto L_0x0434
        L_0x056a:
            X.AnonymousClass36R.A01()
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            r0.AGg()
            X.28D r2 = r7.A01
            r0 = 3
            X.0qQ.A0B(r2, r0)
            com.instagram.creation.capture.MediaCaptureFragment r10 = new com.instagram.creation.capture.MediaCaptureFragment
            r10.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0 = 5279(0x149f, float:7.397E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putBoolean(r0, r3)
            r0 = 863(0x35f, float:1.21E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putSerializable(r0, r2)
            r10.setArguments(r1)
            r7.A03 = r10
            goto L_0x0434
        L_0x05a0:
            X.AnonymousClass36R.A01()
            X.K6Y r10 = new X.K6Y
            r10.<init>()
            if (r2 == 0) goto L_0x05c1
            if (r1 != 0) goto L_0x05b3
            java.lang.String r0 = "preparing CROP fragment without PHOTO_DATA_PATH"
            X.0kD.A01(r11, r0)
            goto L_0x0434
        L_0x05b3:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            java.lang.String r0 = "CropFragment.imageUri"
            r12.putExtra(r0, r1)
        L_0x05c1:
            android.os.Bundle r0 = r12.getExtras()
            r10.setArguments(r0)
            goto L_0x0434
        L_0x05ca:
            X.LGR r1 = X.AnonymousClass36R.A01()
            com.instagram.common.session.UserSession r0 = r7.A04
            com.instagram.creation.fragment.AlbumEditFragment r10 = r1.A01(r0, r3, r3)
            goto L_0x0434
        L_0x05d6:
            X.LGR r5 = X.AnonymousClass36R.A01()
            com.instagram.common.session.UserSession r1 = r7.A04
            X.4DH r0 = r7.A03
            if (r0 != 0) goto L_0x05e1
            r14 = 0
        L_0x05e1:
            X.JcV r10 = r5.A03(r1, r3, r3, r14)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = r1.getStringExtra(r13)
            if (r0 != 0) goto L_0x0607
            java.lang.String r0 = "CropFragment.imageUri"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            r0.getClass()
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r0 = r0.getPath()
            if (r0 != 0) goto L_0x0607
            java.lang.String r0 = "preparing PHOTO_EDIT fragment without PHOTO_DATA_PATH"
            X.0kD.A01(r11, r0)
            goto L_0x0434
        L_0x0607:
            r7.A01(r12, r0, r2)
            goto L_0x0434
        L_0x060c:
            android.os.Bundle r2 = r10.mArguments
            if (r2 != 0) goto L_0x0615
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x0615:
            com.instagram.common.session.UserSession r0 = r7.A04
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r0, r1)
            r10.setArguments(r2)
            X.0hq r0 = r7.getSupportFragmentManager()
            X.0s1 r3 = new X.0s1
            r3.<init>(r0)
            boolean r0 = X.AnonymousClass2Rc.A00
            if (r0 == 0) goto L_0x063b
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x064d
            r2 = 2130772046(0x7f01004e, float:1.71472E38)
            r1 = 2130772047(0x7f01004f, float:1.7147201E38)
        L_0x0638:
            r7.overridePendingTransition(r2, r1)
        L_0x063b:
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            r3.A0D(r10, r11, r0)
            r3.A00()
            X.0hq r0 = r7.getSupportFragmentManager()
            r0.A0a()
            goto L_0x026a
        L_0x064d:
            boolean r0 = r10 instanceof X.C59962JcV
            r2 = 2130772079(0x7f01006f, float:1.7147266E38)
            r1 = 2130772077(0x7f01006d, float:1.7147262E38)
            if (r0 == 0) goto L_0x0638
            r2 = 2130772037(0x7f010045, float:1.7147181E38)
            r1 = 2130772039(0x7f010047, float:1.7147185E38)
            goto L_0x0638
        L_0x065e:
            r0 = 1679(0x68f, float:2.353E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r8 = r8.get(r0)
            X.514 r8 = (X.AnonymousClass514) r8
            if (r8 == 0) goto L_0x0262
            X.82p r0 = r7.A09
            X.82q r0 = r0.A00
            r0.getClass()
            goto L_0x025c
        L_0x0675:
            com.instagram.creation.state.CreationState[] r0 = new com.instagram.creation.state.CreationState[r3]
            goto L_0x0167
        L_0x0679:
            r12 = 0
            goto L_0x0146
        L_0x067c:
            android.content.Intent r0 = r7.getIntent()
            boolean r12 = r0.hasExtra(r1)
            android.content.Intent r0 = r7.getIntent()
            if (r12 == 0) goto L_0x06de
            android.os.Parcelable r13 = r0.getParcelableExtra(r1)
        L_0x068e:
            r13.getClass()
            com.instagram.creation.base.CreationSession r13 = (com.instagram.creation.base.CreationSession) r13
        L_0x0693:
            r7.A06 = r13
            com.instagram.common.session.UserSession r12 = r7.A04
            X.28D r0 = r7.A01
            r16 = 0
            X.82Y r15 = new X.82Y
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r25 = r16
            r26 = r16
            r27 = r16
            r28 = r16
            r29 = r16
            r30 = r16
            r31 = r16
            r32 = r16
            r33 = r16
            r34 = r16
            r35 = r16
            r36 = r3
            r37 = r3
            r38 = r3
            r39 = r5
            r40 = r3
            r41 = r3
            r42 = r3
            r43 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.82p r0 = X.JWD.A00(r0, r12, r13, r15)
            r7.A09 = r0
            goto L_0x016a
        L_0x06de:
            boolean r0 = r0.getBooleanExtra(r2, r3)
            if (r0 == 0) goto L_0x06f7
            android.content.Intent r0 = r7.getIntent()
            boolean r0 = r0.hasExtra(r10)
            if (r0 == 0) goto L_0x06f7
            android.content.Intent r0 = r7.getIntent()
            android.os.Parcelable r13 = r0.getParcelableExtra(r10)
            goto L_0x068e
        L_0x06f7:
            com.instagram.creation.base.CreationSession r13 = new com.instagram.creation.base.CreationSession
            r13.<init>()
            goto L_0x0693
        L_0x06fd:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        1Ng r1;
        C64681Lg9 lg9;
        if (i == 27) {
            r1 = AnonymousClass1Nd.A00(this.A04);
            lg9 = C64681Lg9.A04;
        } else if (i == 80) {
            r1 = AnonymousClass1Nd.A00(this.A04);
            lg9 = C64681Lg9.A01;
        } else if (i == 130) {
            r1 = AnonymousClass1Nd.A00(this.A04);
            lg9 = C64681Lg9.A03;
        } else if (i == 168) {
            r1 = AnonymousClass1Nd.A00(this.A04);
            lg9 = C64681Lg9.A05;
        } else if (i != 169) {
            return super.onKeyDown(i, keyEvent);
        } else {
            r1 = AnonymousClass1Nd.A00(this.A04);
            lg9 = C64681Lg9.A06;
        }
        r1.A00(lg9);
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 130) {
            return super.onKeyUp(i, keyEvent);
        }
        AnonymousClass1Nd.A00(this.A04).A00(C64681Lg9.A02);
        return true;
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.A0T.add(Integer.valueOf(i));
        MediaCaptureActivity.super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public static void A04(MediaCaptureActivity mediaCaptureActivity, boolean z) {
        mediaCaptureActivity.A00();
        JWH jwh = mediaCaptureActivity.A08;
        jwh.getClass();
        synchronized (jwh) {
            jwh.A08.destroy();
            jwh.A07.AOw();
        }
        if (z) {
            JX9 A002 = JWX.A00(mediaCaptureActivity.A04);
            A002.A03.clear();
            A002.A01 = null;
        }
    }

    private void A05(MediaSession mediaSession, boolean z, boolean z2) {
        C273884nL r4;
        FilterGroupModel B5r;
        CropInfo Asr;
        AnonymousClass3Q2 BbQ = BbQ(mediaSession.BbR());
        JWH jwh = this.A08;
        jwh.getClass();
        String B5g = mediaSession.B5g();
        0qQ.A0B(B5g, 0);
        jwh.A03((C10954S2m) null, B5g);
        if (BbQ != null && BbQ.A5U) {
            if (!(!z2 || (r4 = BbQ.A1a) == null || (B5r = mediaSession.B5r()) == null || (Asr = mediaSession.Asr()) == null)) {
                UserSession userSession = this.A04;
                Rect rect = Asr.A02;
                C66434MRo B2U = mediaSession.B2U();
                int value = B2U.getValue();
                if (r4.A0P != null) {
                    PhotoFilter photoFilter = new PhotoFilter(userSession, C353948Ka.A00(userSession).A01(r4.A0P.intValue()), ((FilterGroupModelImpl) B5r).A03);
                    Float f = r4.A07;
                    f.getClass();
                    photoFilter.A00(Math.round(f.floatValue() * 100.0f));
                    B5r.EWk(photoFilter, 17);
                    B5r.EWl(17, true);
                }
                Float f2 = r4.A09;
                if (f2 != null) {
                    float floatValue = f2.floatValue();
                    ColorFilter colorFilter = new ColorFilter(AnonymousClass000.A00(4035));
                    colorFilter.A00 = floatValue;
                    B5r.EWj(colorFilter, 9);
                    B5r.EWl(9, true);
                }
                ValueMapFilterModel A002 = C63201Kt8.A00();
                Float f3 = r4.A03;
                if (f3 != null) {
                    A002.A00("brightness", f3.floatValue());
                }
                Float f4 = r4.A04;
                if (f4 != null) {
                    A002.A00("contrast", f4.floatValue());
                }
                Float f5 = r4.A0D;
                if (f5 != null) {
                    A002.A00("saturation", f5.floatValue());
                }
                Float f6 = r4.A0H;
                if (f6 != null) {
                    A002.A00("temperature", f6.floatValue());
                }
                Float f7 = r4.A0M;
                if (f7 != null) {
                    A002.A00("vignette", f7.floatValue());
                }
                Float f8 = r4.A06;
                if (f8 != null) {
                    A002.A00("fade", f8.floatValue());
                }
                Integer num = r4.A0S;
                if (num != null) {
                    int intValue = num.intValue();
                    float[] fArr = LSj.A00;
                    A002.A03("tint_shadows_color", C62580KiD.values()[intValue].A01);
                    Float f9 = r4.A0L;
                    f9.getClass();
                    A002.A00("tint_shadows_intensity", f9.floatValue());
                }
                Integer num2 = r4.A0R;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    float[] fArr2 = LSj.A00;
                    A002.A03("tint_highlights_color", C62580KiD.values()[intValue2].A01);
                    Float f10 = r4.A0K;
                    f10.getClass();
                    A002.A00("tint_highlights_intensity", f10.floatValue());
                }
                Float f11 = r4.A0F;
                if (f11 != null) {
                    A002.A00("sharpen", f11.floatValue());
                }
                Float f12 = r4.A0E;
                if (f12 != null) {
                    A002.A00("shadows", f12.floatValue());
                }
                Float f13 = r4.A08;
                if (f13 != null) {
                    A002.A00("highlights", f13.floatValue());
                }
                if (LPU.A01(A002) || LPU.A00(A002)) {
                    B5r.EWj(A002, 13);
                    B5r.EWl(13, true);
                }
                Float f14 = r4.A0G;
                if (f14 != null) {
                    float floatValue2 = f14.floatValue();
                    ColorFilter colorFilter2 = new ColorFilter(AnonymousClass000.A00(3520));
                    colorFilter2.A00 = floatValue2;
                    B5r.EWj(colorFilter2, 10);
                    B5r.EWl(10, true);
                }
                SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
                PointF pointF = r4.A01;
                if (pointF != null) {
                    surfaceCropFilter.A0K(rect, (int) pointF.x, (int) pointF.y, value, false);
                }
                Float f15 = r4.A0A;
                if (f15 != null) {
                    surfaceCropFilter.A0F(f15.floatValue());
                }
                Float f16 = r4.A0B;
                if (f16 != null) {
                    surfaceCropFilter.A0G(f16.floatValue());
                }
                Float f17 = r4.A0C;
                if (f17 != null) {
                    surfaceCropFilter.A0H(f17.floatValue());
                }
                Integer num3 = r4.A0O;
                if (num3 != null) {
                    surfaceCropFilter.A0I(num3.intValue());
                }
                B5r.EWk(surfaceCropFilter, 3);
                B5r.EWl(3, true);
                FilterGroupModel B5r2 = mediaSession.B5r();
                CropInfo Asr2 = mediaSession.Asr();
                C364978mK.A02(Asr2.A02, B5r2, Asr2.A01, Asr2.A00, B2U.getValue());
                if (BbQ.A2k != null && C59961JcU.A00(this.A04)) {
                    C364978mK.A03(this.A04, mediaSession.B5r(), BbQ.A2k);
                }
            }
            if (!z) {
                mediaSession.BpN().EK1();
                return;
            }
        } else if (!z) {
            return;
        }
        SurfaceCropFilter A003 = C395019z4.A00(mediaSession.B5r(), "FilterGroupUtil_setSurfaceCropFilterNeedsCropParams()");
        if (A003 != null) {
            A003.A00.A0F = true;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.creation.activity.MediaCaptureActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void AGc() {
        if (AnonymousClass06S.A01(getSupportFragmentManager())) {
            C3499682q r0 = this.A09.A00;
            r0.getClass();
            if (r0.AGg() != AnonymousClass36W.PROFILE_PHOTO) {
                C3499682q r02 = this.A09.A00;
                r02.getClass();
                if (r02.AGg() != AnonymousClass36W.GROUP_PHOTO) {
                    C59888JbD.A01(this.A04, new KPK());
                    return;
                }
            }
            C3499682q r03 = this.A09.A00;
            r03.getClass();
            setResult(-1, new Intent(r03.E2g()));
            finish();
        }
    }

    public final MediaEditActionBar BQ1() {
        View findViewById = findViewById(R.id.media_edit_action_bar);
        findViewById.getClass();
        return (MediaEditActionBar) findViewById;
    }

    public final void DFe(Location location, Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, String str3, HashMap hashMap, int i, int i2) {
        Uri uri2;
        String path = uri.getPath();
        path.getClass();
        String str4 = str2;
        if (str2 != null) {
            uri2 = 0cp.A03(str4);
        } else {
            uri2 = null;
        }
        A02(location, uri2, mediaUploadMetadata, this, cropInfo, path, (String) null, str, str4, (String) null, (String) null, (String) null, (String) null, str3, hashMap, i, i2);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.creation.activity.MediaCaptureActivity, android.app.Activity] */
    public final void finish() {
        MediaCaptureActivity.super.finish();
        if (AnonymousClass2Rc.A00) {
            boolean z = this.A0C;
            int i = 0;
            int i2 = R.anim.modal_slide_down_exit;
            if (z) {
                i = R.anim.fragment_slide_right_enter;
                i2 = R.anim.fragment_slide_right_exit;
            }
            overridePendingTransition(i, i2);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Fragment A0P2;
        super.onActivityResult(i, i2, intent);
        AnonymousClass4DH r0 = this.A03;
        if (r0 != null) {
            r0.onActivityResult(i, i2, intent);
        }
        if (this.A0T.remove(Integer.valueOf(i)) && (A0P2 = getSupportFragmentManager().A0P(R.id.layout_container_main)) != null) {
            A0P2.onActivityResult(i, i2, intent);
        }
        if (i != 5652) {
            return;
        }
        if (i2 == -1 || i2 == 0) {
            C283565Ie.A00();
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1217937685);
        C59899JbO A002 = JZM.A00(this.A04);
        0wc r3 = A002.A04;
        0Aj A003 = r3.A00(r3.A00, "ig_feed_gallery_app_background");
        if (A003.isSampled()) {
            String str = A002.A02;
            if (str == null) {
                str = "";
            }
            A003.AAJ("camera_session_id", str);
            A003.A8k("event_type", 2);
            A003.AAJ("gallery_type", "old_gallery");
            A003.AAJ("module", AnonymousClass000.A00(3293));
            A003.A8M(A002.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A003.Cgf();
        }
        AnonymousClass0fD.A0A(1115952133, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(-1933121804);
        C59899JbO A002 = JZM.A00(this.A04);
        0wc r3 = A002.A04;
        0Aj A003 = r3.A00(r3.A00, "ig_feed_gallery_app_foreground");
        if (A003.isSampled()) {
            String str = A002.A02;
            if (str == null) {
                str = "";
            }
            A003.AAJ("camera_session_id", str);
            A003.A8M(A002.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A003.A8k("event_type", 2);
            A003.AAJ("gallery_type", "old_gallery");
            A003.AAJ("module", AnonymousClass000.A00(3293));
            A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A003.Cgf();
        }
        AnonymousClass0fD.A0A(-1802357863, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r1.onBackPressed() != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
            r9 = this;
            X.0nO r1 = X.0nY.A00()
            X.R9x r0 = new X.R9x
            r0.<init>(r9)
            r1.ATE(r0)
            X.37D r0 = r9.mBottomSheetNavigator
            r6 = 1
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.A0X()
            if (r0 != r6) goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            X.JWG r0 = r9.A07
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0026
            com.instagram.common.session.UserSession r1 = r9.A04
            r0 = 0
            X.LPT.A02(r1, r0, r0)
        L_0x0026:
            X.Jb9 r0 = r9.A0A
            if (r0 == 0) goto L_0x003c
            java.util.Stack r0 = r0.A02
            int r0 = r0.size()
            if (r0 <= r6) goto L_0x003c
            X.0hq r0 = r9.getSupportFragmentManager()
            int r0 = r0.A0M()
            if (r0 != 0) goto L_0x0057
        L_0x003c:
            com.instagram.common.session.UserSession r0 = r9.A04
            X.8ZP r7 = X.AnonymousClass8ZO.A00(r0)
            r0 = 2687(0xa7f, float:3.765E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            long r1 = r7.A00
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            X.1QP r0 = r7.A02
            r0.flowEndCancel(r1, r5)
        L_0x0055:
            r7.A00 = r3
        L_0x0057:
            X.LgU r5 = r9.A05
            if (r5 == 0) goto L_0x0075
            X.Jb9 r8 = r9.A0A
            X.0hq r1 = r5.A01
            r4 = 0
            if (r1 == 0) goto L_0x0081
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
            boolean r0 = r1 instanceof X.AnonymousClass4DR
            if (r0 == 0) goto L_0x0081
            X.4DR r1 = (X.AnonymousClass4DR) r1
            boolean r0 = r1.onBackPressed()
            if (r0 == 0) goto L_0x0081
        L_0x0075:
            X.LgU r0 = r9.A05
            if (r0 != 0) goto L_0x0017
            java.lang.String r1 = "MediaCaptureActivity"
            java.lang.String r0 = "logStartCameraSession() mCameraSession is not null"
            X.0kD.A01(r1, r0)
            return
        L_0x0081:
            r8.getClass()
            com.instagram.creation.state.CreationState r1 = r8.A00()
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0W
            if (r1 != r0) goto L_0x00ce
            X.6SR r7 = X.AnonymousClass6SR.A01()
            com.instagram.common.session.UserSession r3 = r5.A03
            X.82q r2 = r5.A05
            r0 = r2
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r1 = r0.A01
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "gallery"
        L_0x009f:
            r7.A06(r3, r0)
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x00ce
            android.content.Context r1 = r5.A00
            r0 = r1
            X.4cL r0 = (X.C267864cL) r0
            r0.EJy(r4)
            r0 = 2131955005(0x7f130d3d, float:1.9546525E38)
            X.C59689JTv.A08(r1, r0, r4)
            goto L_0x0075
        L_0x00b5:
            boolean r0 = r2.COf()
            if (r0 == 0) goto L_0x00c2
            r0 = 2299(0x8fb, float:3.222E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x009f
        L_0x00c2:
            boolean r0 = r2.CZ4()
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "edit_photo"
            goto L_0x009f
        L_0x00cb:
            java.lang.String r0 = "edit_video"
            goto L_0x009f
        L_0x00ce:
            java.util.Stack r0 = r8.A02
            int r0 = r0.size()
            if (r0 <= r6) goto L_0x00e1
            com.instagram.common.session.UserSession r1 = r5.A03
            X.KPF r0 = new X.KPF
            r0.<init>()
            X.C59888JbD.A01(r1, r0)
            goto L_0x0075
        L_0x00e1:
            r9.A0K = r6
            super.onBackPressed()
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.onBackPressed():void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, X.0lV, com.instagram.creation.activity.MediaCaptureActivity, com.instagram.base.activity.IgFragmentActivity, X.1wn] */
    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(1287033004);
        super.onDestroy();
        14i.A06(this);
        C59953JcJ.A01(this.A04, this);
        boolean z = this.A06.A0F;
        UserSession userSession = this.A04;
        if (z) {
            JX9 A003 = JWX.A00(userSession);
            A003.A03.clear();
            A003.A01 = null;
            JWX.A00(this.A04).A04.clear();
            JWX.A00(this.A04).A00 = 1.0f;
        } else {
            0qQ.A0B(userSession, 0);
            userSession.A03(JX9.class);
        }
        this.A0A.getClass();
        1Ng A004 = AnonymousClass1Nd.A00(this.A04);
        A004.A02(this.A0A, C59888JbD.class);
        A004.A02(this, C59890JbF.class);
        JWG jwg = this.A07;
        jwg.getClass();
        jwg.A03 = true;
        Integer num = jwg.A02;
        if (num != null) {
            JWG.A06(jwg, num);
        }
        jwg.A07.removeCallbacksAndMessages((Object) null);
        this.A07 = null;
        this.A0N.clear();
        this.A05 = null;
        JWH jwh = this.A08;
        jwh.getClass();
        synchronized (jwh) {
            jwh.A08.destroy();
            jwh.A07.AOw();
        }
        this.A08 = null;
        this.A0A = null;
        this.A03 = null;
        AnonymousClass0fD.A07(-297892077, A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (((X.JWE) r0).A01.A0I != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010a, code lost:
        if (r0.A07 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0131, code lost:
        if (((X.JWE) r0).A01.A0I != false) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1970603081(0x75750449, float:3.1059562E32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.JbF r11 = (X.C59890JbF) r11
            r0 = 267407777(0xff051a1, float:2.369727E-29)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 2131440079(0x7f0b31cf, float:1.8502131E38)
            android.view.View r5 = r10.findViewById(r0)
            r5.getClass()
            com.instagram.common.ui.widget.draggable.DraggableContainer r5 = (com.instagram.common.ui.widget.draggable.DraggableContainer) r5
            X.LPC r4 = X.C63515KyQ.A00
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x0043
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = r5.A03
            java.lang.String r0 = "draggableView"
            if (r1 != 0) goto L_0x0032
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0032:
            r1.A09()
            r0 = 4
            r1.setVisibility(r0)
            r4.A01()
            r0 = 0
            r4.A05(r0)
            r0 = 0
            r4.A00 = r0
        L_0x0043:
            android.graphics.Rect r0 = r5.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0052
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.A02 = r0
        L_0x0052:
            X.06Q r1 = r10.A00
            if (r1 == 0) goto L_0x005f
            X.0hq r0 = r10.getSupportFragmentManager()
            java.util.ArrayList r0 = r0.A0F
            r0.remove(r1)
        L_0x005f:
            com.instagram.creation.state.CreationState r5 = r11.A02
            com.instagram.creation.state.CreationState r6 = com.instagram.creation.state.CreationState.A0E
            r8 = 0
            if (r5 == r6) goto L_0x0199
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0F
            if (r5 == r0) goto L_0x0199
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            boolean r0 = r0.COf()
            r7 = 1
            if (r0 == 0) goto L_0x00d0
            X.JbD r0 = r11.A00
            X.JbE r0 = r0.A00
            boolean r0 = r0 instanceof X.KPH
            if (r0 != 0) goto L_0x009e
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x00ce
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x00ce
        L_0x009e:
            r4 = 1
        L_0x009f:
            com.instagram.creation.state.CreationState r1 = r11.A01
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0J
            if (r1 != r0) goto L_0x00a6
            r8 = 1
        L_0x00a6:
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A04
            if (r5 == r0) goto L_0x00ac
            if (r4 == 0) goto L_0x00b9
        L_0x00ac:
            if (r1 == r6) goto L_0x00b6
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0c
            if (r1 == r0) goto L_0x00b6
            if (r8 != 0) goto L_0x00b6
            if (r4 == 0) goto L_0x00b9
        L_0x00b6:
            r10.A06(r8)
        L_0x00b9:
            X.LgU r0 = r10.A05
            r0.getClass()
            r0.A05(r11)
            r0 = 842412490(0x323631ca, float:1.0605115E-8)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1284830972(0xffffffffb36b0904, float:-5.47234E-8)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x00ce:
            r4 = 0
            goto L_0x009f
        L_0x00d0:
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            boolean r0 = r0.CZ4()
            if (r0 == 0) goto L_0x00b9
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0R
            r9 = 0
            if (r5 != r0) goto L_0x00e3
            r9 = 1
        L_0x00e3:
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            java.lang.String r0 = r0.E2g()
            X.8m7 r0 = r10.Blh(r0)
            r5 = 0
            if (r0 == 0) goto L_0x00f6
            r5 = 1
        L_0x00f6:
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.creation.base.PhotoSession r0 = r0.A02()
            if (r0 == 0) goto L_0x010c
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r0.A07
            r4 = 1
            if (r0 != 0) goto L_0x010d
        L_0x010c:
            r4 = 0
        L_0x010d:
            X.JbD r0 = r11.A00
            X.JbE r0 = r0.A00
            boolean r0 = r0 instanceof X.KPH
            if (r0 != 0) goto L_0x0133
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0197
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0197
        L_0x0133:
            X.82p r0 = r10.A09
            X.82q r6 = r0.A00
            r6.getClass()
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            java.lang.String r1 = r0.E2g()
            X.JWE r6 = (X.JWE) r6
            com.instagram.creation.base.CreationSession r0 = r6.A01
            com.instagram.creation.base.PhotoSession r0 = r0.A03(r1)
            if (r0 == 0) goto L_0x0152
            r10.A05(r0, r8, r7)
        L_0x0152:
            if (r9 == 0) goto L_0x00b9
            if (r4 != 0) goto L_0x00b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Transition: "
            r1.append(r0)
            com.instagram.creation.state.CreationState r0 = r11.A01
            int r0 = r0.ordinal()
            r1.append(r0)
            java.lang.String r0 = " ImageRenderer: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " FilterGroup: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " Path: "
            r1.append(r0)
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            java.lang.String r0 = r0.E2g()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "MediaCaptureActivity_InvalidFilterGroup"
            X.0kD.A01(r0, r1)
            goto L_0x00b9
        L_0x0197:
            r7 = 0
            goto L_0x0133
        L_0x0199:
            com.instagram.creation.state.CreationState r1 = r11.A01
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0L
            if (r1 != r0) goto L_0x01a4
            A04(r10, r8)
            goto L_0x00b9
        L_0x01a4:
            X.LZV r1 = new X.LZV
            r1.<init>(r10, r11)
            r10.A00 = r1
            X.0hq r0 = r10.getSupportFragmentManager()
            r0.A0s(r1)
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.onEvent(java.lang.Object):void");
    }

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(45211756);
        super.onPause();
        1xC r2 = 1xC.A01;
        r2.A03(this.A0R, AnonymousClass3GP.class);
        r2.A03(this.A0O, AnonymousClass3GR.class);
        r2.A03(this.A0S, AnonymousClass3GT.class);
        r2.A03(this.A0P, AnonymousClass3GU.class);
        r2.A03(this.A0Q, AnonymousClass3GV.class);
        AnonymousClass0fD.A07(-1507695051, A002);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-256134851);
        super.onResume();
        28K.A00(this.A04).A0B(getApplicationContext());
        1xC r2 = 1xC.A01;
        r2.A02(this.A0R, AnonymousClass3GP.class);
        r2.A02(this.A0O, AnonymousClass3GR.class);
        r2.A02(this.A0S, AnonymousClass3GT.class);
        r2.A02(this.A0P, AnonymousClass3GU.class);
        r2.A02(this.A0Q, AnonymousClass3GV.class);
        boolean booleanValue = Boolean.valueOf(182.A06(0Tu.A05, this.A04, 36329723902771492L)).booleanValue();
        UserSession userSession = this.A04;
        if (booleanValue) {
            AnonymousClass5w8.A01(userSession, getApplicationContext(), "feed_composer_prefetch");
        } else {
            C363388je.A00(userSession).A01(A0U, (C363658k8) null, "feed_composer_prefetch");
        }
        C347397wk.A00(this.A04).A01();
        C347467wr A003 = C347457wq.A00(this.A04);
        if (!A003.A00) {
            A003.A00();
        }
        AnonymousClass0fD.A07(1296159166, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        MediaCaptureActivity.super.onSaveInstanceState(bundle);
        this.A0A.getClass();
        Stack stack = this.A0A.A02;
        CreationState[] creationStateArr = new CreationState[stack.size()];
        stack.copyInto(creationStateArr);
        bundle.putParcelableArray("MediaCaptureActivity.BUNDLE_STATE", creationStateArr);
        bundle.putParcelable("MediaCaptureActivity.CREATION_SESSION", this.A06);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onStart() {
        int A002 = AnonymousClass0fD.A00(714296674);
        super.onStart();
        if (this.A0H == null) {
            UserSession userSession = this.A04;
            28D r3 = this.A01;
            C357638Yz r2 = this.A0E;
            r2.getClass();
            this.A0H = Boolean.valueOf(C59886JbA.A00(this, r3, userSession, r2, this.A09.A02.A01.A09));
            C59885Jb9 jb9 = this.A0A;
            if (!(jb9 == null || this.A05 == null || jb9.A00() != CreationState.A0I)) {
                C59899JbO A003 = JZM.A00(this.A04);
                28t r4 = 28t.A05;
                C3499682q r0 = this.A09.A00;
                r0.getClass();
                int size = r0.Co4().size();
                C3499682q r02 = this.A09.A00;
                r02.getClass();
                ArrayList A022 = C64699LgU.A02(r02.Co4());
                C3499682q r03 = this.A09.A00;
                r03.getClass();
                ArrayList A032 = C64699LgU.A03(r03.Co4());
                C3499682q r04 = this.A09.A00;
                r04.getClass();
                ArrayList A004 = C64699LgU.A00(r04.Co4());
                C3499682q r05 = this.A09.A00;
                r05.getClass();
                A003.A06((C279294yP) null, r4, A022, A032, A004, C64699LgU.A01(r05.Co4()), size);
            }
        }
        AnonymousClass0fD.A07(-672871585, A002);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.creation.activity.MediaCaptureActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onStop() {
        int i;
        int A002 = AnonymousClass0fD.A00(-247493693);
        super.onStop();
        if (isFinishing()) {
            Boolean bool = this.A0H;
            if (bool == null || bool.booleanValue() || (!this.A0K && !this.A0L)) {
                C59885Jb9 jb9 = this.A0A;
                if (jb9 != null && jb9.A00() == CreationState.A0I) {
                    JZM.A00(this.A04).A08(28t.A05);
                }
                UserSession userSession = this.A04;
                0qQ.A0B(userSession, 0);
                27p.A01(userSession).A0W();
                27p.A02(userSession);
            } else {
                i = 1646167854;
                AnonymousClass0fD.A07(i, A002);
            }
        }
        i = -1364569357;
        AnonymousClass0fD.A07(i, A002);
    }

    public final void D0W() {
        onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity, android.app.Activity] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0167  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.location.Location r7, android.net.Uri r8, com.instagram.common.gallery.metadata.MediaUploadMetadata r9, com.instagram.creation.activity.MediaCaptureActivity r10, com.instagram.creation.base.CropInfo r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.HashMap r21, int r22, int r23) {
        /*
            r5 = r19
            r3 = r21
            if (r12 == 0) goto L_0x0132
            X.6SR r0 = X.AnonymousClass6SR.A01()
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x0019
            X.6SR r2 = X.AnonymousClass6SR.A01()
            com.instagram.common.session.UserSession r1 = r10.A04
            java.lang.String r0 = "edit_photo"
            r2.A04(r1, r0)
        L_0x0019:
            long r0 = java.lang.System.nanoTime()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = 0
            X.0qQ.A0B(r0, r4)
            X.3Q2 r2 = X.AnonymousClass9T3.A01(r0)
            r0 = r16
            if (r16 == 0) goto L_0x017c
            r2.A2o = r0
        L_0x002f:
            if (r5 == 0) goto L_0x0033
            r2.A2n = r5
        L_0x0033:
            r0 = r17
            if (r17 == 0) goto L_0x0039
            r2.A2W = r0
        L_0x0039:
            r0 = r18
            if (r18 == 0) goto L_0x003f
            r2.A2V = r0
        L_0x003f:
            if (r21 != 0) goto L_0x0045
            java.util.HashMap r3 = X.C379839Vn.A00(r12)
        L_0x0045:
            r2.A44 = r3
            java.lang.String r3 = r9.A03
            com.instagram.common.session.UserSession r6 = r10.A04
            r5 = 1
            X.0qQ.A0B(r6, r5)
            if (r3 == 0) goto L_0x0167
            java.lang.String r0 = "com.facebook.mwa.ai"
            boolean r0 = r3.equals(r0)
            if (r0 == r5) goto L_0x006a
            X.0Tu r4 = X.0Tu.A05
            r0 = 36884367389360699(0x830a230002023b, double:3.389160686233468E-306)
            java.lang.String r0 = X.182.A04(r4, r6, r0)
            boolean r0 = r3.equals(r0)
            if (r0 != r5) goto L_0x0074
        L_0x006a:
            X.JYi r1 = X.C59789JYi.A01
            com.instagram.common.session.UserSession r0 = r10.A04
            boolean r0 = r1.A04(r0, r3)
            if (r0 == 0) goto L_0x0167
        L_0x0074:
            boolean r0 = X.C59790JYj.A00(r3)
            if (r0 != 0) goto L_0x0167
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            r0.A03 = r3
        L_0x007e:
            if (r14 == 0) goto L_0x0082
            r2.A2O = r14
        L_0x0082:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            java.lang.String r0 = r0.A0A
            if (r0 != 0) goto L_0x0098
            java.lang.String r1 = X.C364678lo.A05(r12)
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0145
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            r0.A0A = r1
        L_0x0098:
            r1 = r20
            if (r20 == 0) goto L_0x00a4
            boolean r0 = X.C393979xL.A00(r1)
            if (r0 != 0) goto L_0x00a4
            r2.A2Z = r1
        L_0x00a4:
            X.82p r0 = r10.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            java.lang.String r0 = r0.A0D
            if (r0 == 0) goto L_0x00b5
            r2.A3J = r0
        L_0x00b5:
            r2.A3K = r12
            if (r15 == 0) goto L_0x00bb
            r2.A3L = r15
        L_0x00bb:
            r3 = 0
            if (r8 == 0) goto L_0x0142
            java.lang.String r4 = r8.toString()
        L_0x00c2:
            r2.A3M = r4
            if (r13 == 0) goto L_0x0133
            r2.A3h = r13
        L_0x00c8:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            r0.A01(r9)
            r10.Ex2(r2)
            X.82p r0 = r10.A09
            if (r0 == 0) goto L_0x00e2
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A2d
            if (r1 != r0) goto L_0x00e2
            r10.A00()
            X.JcJ r0 = X.C64168LRo.A0A
            r0.A03(r10)
        L_0x00e2:
            X.82p r0 = r10.A09
            X.82q r5 = r0.A00
            r5.getClass()
            r0 = r5
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r1 = r0.A01
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x00fd
            com.instagram.creation.base.PhotoSession r0 = r1.A03(r12)
            if (r0 == 0) goto L_0x00fa
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r0.A07
        L_0x00fa:
            r10.A00()
        L_0x00fd:
            r5.ExF(r12, r4)
            r0 = r22
            r5.EVc(r0)
            r0 = r23
            r1.A02 = r0
            java.lang.String r0 = r2.A35
            r5.EfU(r0)
            if (r11 == 0) goto L_0x011c
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            if (r0 == 0) goto L_0x011c
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            r0.A05 = r11
        L_0x011c:
            if (r7 == 0) goto L_0x0125
            com.instagram.creation.base.MediaSession r0 = r1.A07
            if (r0 == 0) goto L_0x0125
            r0.EcZ(r7)
        L_0x0125:
            com.instagram.creation.base.PhotoSession r0 = r1.A03(r12)
            if (r3 == 0) goto L_0x012f
            if (r0 == 0) goto L_0x012f
            r0.A07 = r3
        L_0x012f:
            A03(r10)
        L_0x0132:
            return
        L_0x0133:
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "sourceMediaId"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 == 0) goto L_0x00c8
            r2.A3h = r0
            goto L_0x00c8
        L_0x0142:
            r4 = r3
            goto L_0x00c2
        L_0x0145:
            java.util.HashMap r1 = r2.A44
            if (r1 == 0) goto L_0x0098
            r0 = 3325(0xcfd, float:4.66E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r1.get(r3)
            if (r0 == 0) goto L_0x0098
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r2.A13
            java.util.HashMap r0 = r2.A44
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0161:
            r1.A0A = r0
            goto L_0x0098
        L_0x0165:
            r0 = 0
            goto L_0x0161
        L_0x0167:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r4 = r2.A13
            java.lang.String r3 = r2.A0G()
            com.instagram.common.session.UserSession r1 = r10.A04
            X.0qQ.A0B(r1, r5)
            X.0sn r0 = X.0sn.A00
            java.lang.String r0 = X.C59737JVv.A02(r1, r3, r0)
            r4.A03 = r0
            goto L_0x007e
        L_0x017c:
            if (r15 == 0) goto L_0x0033
            X.9U5 r1 = X.AnonymousClass8VQ.A00(r15)
            if (r1 == 0) goto L_0x0033
            java.util.List r0 = r1.A00()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x019a
            java.util.List r0 = r1.A00()
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            r2.A2o = r0
        L_0x019a:
            java.lang.String r0 = r1.A06
            if (r0 != 0) goto L_0x01a0
            java.lang.String r0 = "normal"
        L_0x01a0:
            r2.A2V = r0
            java.lang.String r5 = r1.A07
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.A02(android.location.Location, android.net.Uri, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.creation.activity.MediaCaptureActivity, com.instagram.creation.base.CropInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, int, int):void");
    }
}
