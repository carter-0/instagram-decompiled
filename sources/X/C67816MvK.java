package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import java.util.List;

/* renamed from: X.MvK  reason: case insensitive filesystem */
public final class C67816MvK extends 2Rw {
    public int A00;
    public List A01;
    public List A02;
    public final Context A03;
    public final C231422re A04;
    public final UserSession A05;
    public final C74320Psw A06;
    public final C254783t2 A07;
    public final C252303ot A08;
    public final AnonymousClass0iw A09;
    public final DirectThreadAnalyticsParams A0A;

    public C67816MvK(Context context, AnonymousClass0iw r5, UserSession userSession, C74320Psw psw, C254783t2 r8) {
        C254773t1 A022;
        AnonymousClass3U9 A0a;
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A05 = userSession;
        this.A09 = r5;
        this.A06 = psw;
        this.A07 = r8;
        A00(this, 0nA.A09(context));
        0sn r0 = 0sn.A00;
        this.A01 = r0;
        this.A02 = r0;
        C254783t2 r02 = this.A07;
        DirectThreadAnalyticsParams directThreadAnalyticsParams = null;
        if (!(r02 == null || (A022 = AnonymousClass6W3.A02(r02)) == null || (A0a = C66582MXn.A0a(this.A05, AnonymousClass6W4.A01(A022))) == null)) {
            directThreadAnalyticsParams = C3263376i.A01(A0a, false);
        }
        this.A0A = directThreadAnalyticsParams;
        C67769MuT muT = new C67769MuT(0);
        this.A08 = muT;
        this.A04 = new C231422re((C252303ot) muT, (2Rw) this);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            View inflate = LayoutInflater.from(this.A03).inflate(R.layout.layout_thread_detail_shared_photos_and_videos_item, viewGroup, false);
            C66581MXm.A1A(inflate, this.A00);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            C74185PqR pqR = new C74185PqR(17, (Object) inflate, (Object) this);
            return new C68038Mz5(inflate, this.A09, this.A05, pqR);
        } else if (i == 1) {
            View A092 = DbU.A09(LayoutInflater.from(this.A03), viewGroup, R.layout.layout_thread_detail_shared_loading_indicator, false);
            0qQ.A0B(A092, 1);
            return new C249703kE(A092);
        } else {
            throw AnonymousClass7TE.A0w("invalid type");
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r5 = (X.C68038Mz5) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(X.C249703kE r5) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            boolean r0 = r5 instanceof X.C68038Mz5
            if (r0 == 0) goto L_0x0026
            X.Mz5 r5 = (X.C68038Mz5) r5
            X.2el r2 = r5.A04
            if (r2 == 0) goto L_0x0026
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = ""
            X.30a r1 = X.AnonymousClass30Y.A00(r0, r0, r1)
            X.GAY r0 = new X.GAY
            r0.<init>(r5, r3)
            X.30Y r1 = X.DbU.A0a(r0, r1)
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r5.A07
            r2.A05(r0, r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67816MvK.onViewAttachedToWindow(X.3kE):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = (X.C68038Mz5) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewDetachedFromWindow(X.C249703kE r3) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3 instanceof X.C68038Mz5
            if (r0 == 0) goto L_0x0013
            X.Mz5 r3 = (X.C68038Mz5) r3
            X.2el r1 = r3.A04
            if (r1 == 0) goto L_0x0013
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r3.A07
            r1.A04(r0)
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67816MvK.onViewDetachedFromWindow(X.3kE):void");
    }

    public final void onViewRecycled(C249703kE r2) {
        C66819MdB mdB;
        0qQ.A0B(r2, 0);
        if ((r2 instanceof C68038Mz5) && (mdB = ((C68038Mz5) r2).A00) != null) {
            mdB.Dds();
        }
    }

    public static void A00(C67816MvK mvK, int i) {
        mvK.A00 = (i - (mvK.A03.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top) * 2)) / 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.List r30) {
        /*
            r29 = this;
            r28 = 0
            java.util.List r0 = X.00k.A0a(r30)
            r2 = r29
            r2.A01 = r0
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r30)
            java.util.Iterator r11 = r30.iterator()
            r19 = 0
        L_0x0014:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r3 = r11.next()
            int r10 = r19 + 1
            if (r19 >= 0) goto L_0x002a
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002a:
            X.Oa5 r3 = (X.C71039Oa5) r3
            java.lang.Object r5 = r3.A00
            boolean r4 = r5 instanceof X.N3S
            r14 = 0
            if (r4 == 0) goto L_0x00e7
            r0 = r5
            X.N3S r0 = (X.N3S) r0
            if (r0 == 0) goto L_0x00f3
            X.1iA r0 = X.C70885OQc.A01(r0)
        L_0x003c:
            X.1iA r6 = X.1iA.A0Q
            if (r0 != r6) goto L_0x00e5
            com.instagram.common.session.UserSession r9 = r2.A05
            r8 = 1
            int r6 = r3.A00()
            if (r6 == r8) goto L_0x0051
            int r7 = r3.A00()
            r6 = 100
            if (r7 != r6) goto L_0x00e5
        L_0x0051:
            java.lang.Boolean r6 = r3.A03()
            boolean r6 = X.AnonymousClass7TG.A1X(r6)
            boolean r6 = X.C66797Mcj.A02(r9, r6)
            if (r6 == 0) goto L_0x00e5
            int r6 = r3.A00()
            if (r6 != r8) goto L_0x00c6
            r6 = 2131238268(0x7f081d7c, float:1.809281E38)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            r27 = 2
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r15 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r20 = r15
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x007f:
            java.lang.String r18 = r3.A05()
            X.1Xj r16 = r3.A02()
            boolean r6 = r5 instanceof X.OIP
            if (r6 == 0) goto L_0x00b4
            X.OIP r5 = (X.OIP) r5
            com.instagram.common.typedurl.ImageUrl r13 = r5.A02
        L_0x008f:
            java.lang.Boolean r5 = r3.A03()
            boolean r21 = X.DbX.A1a(r5)
            boolean r3 = r3.A09()
            if (r3 == 0) goto L_0x009f
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r14 = r2.A0A
        L_0x009f:
            X.N39 r12 = new X.N39
            r20 = r4
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.N8C r0 = new X.N8C
            r0.<init>(r12)
            r1.add(r0)
            r19 = r10
            goto L_0x0014
        L_0x00b4:
            boolean r6 = r5 instanceof X.C70825OMx
            if (r6 == 0) goto L_0x00bd
            X.OMx r5 = (X.C70825OMx) r5
            com.instagram.common.typedurl.ImageUrl r13 = r5.A01
            goto L_0x008f
        L_0x00bd:
            if (r4 == 0) goto L_0x00f6
            X.N3S r5 = (X.N3S) r5
            com.instagram.common.typedurl.SimpleImageUrl r13 = X.C70885OQc.A00(r5)
            goto L_0x008f
        L_0x00c6:
            r15 = 0
            int r7 = r3.A00()
            r6 = 100
            if (r7 != r6) goto L_0x007f
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r15 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r20 = r15
            r21 = r14
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r27 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x007f
        L_0x00e5:
            r15 = r14
            goto L_0x007f
        L_0x00e7:
            X.1Xj r0 = r3.A02()
            if (r0 == 0) goto L_0x00f3
            X.1iA r0 = r0.BR7()
            goto L_0x003c
        L_0x00f3:
            r0 = r14
            goto L_0x003c
        L_0x00f6:
            java.lang.IllegalStateException r0 = X.C66583MXo.A0b(r5)
            throw r0
        L_0x00fb:
            r2.A02 = r1
            X.2re r2 = r2.A04
            r0 = 0
            r2.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67816MvK.A01(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012f, code lost:
        if (r11.ordinal() == 1) goto L_0x0131;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r19, int r20) {
        /*
            r18 = this;
            r5 = r19
            r6 = 0
            X.0qQ.A0B(r5, r6)
            boolean r0 = r5 instanceof X.C68038Mz5
            if (r0 == 0) goto L_0x019a
            r2 = r18
            X.2re r0 = r2.A04
            java.util.List r0 = r0.A02
            r1 = r20
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.thread.threadmedia.SharedMediaListItemValue"
            X.0qQ.A0C(r1, r0)
            X.N8C r1 = (X.N8C) r1
            X.N39 r4 = r1.A00
            X.Mz5 r5 = (X.C68038Mz5) r5
            int r7 = r2.A00
            X.3t2 r8 = r2.A07
            X.0qQ.A0B(r4, r6)
            X.MdB r0 = r5.A00
            if (r0 == 0) goto L_0x002f
            r0.Dds()
        L_0x002f:
            X.1iA r11 = r4.A05
            X.1iA r0 = X.1iA.A0a
            if (r11 != r0) goto L_0x00f4
            java.lang.Integer r3 = X.AnonymousClass05K.A01
        L_0x0037:
            android.view.View r1 = r5.itemView
            r0 = 63
            X.C71405Ok4.A01(r1, r0, r4, r5)
            X.7HA r2 = r5.A06
            boolean r1 = r4.A07
            X.0iw r10 = r5.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.MdB r3 = r2.A00(r10, r3, r0, r1)
            X.O7M r1 = r5.A05
            com.instagram.igds.components.imagebutton.IgImageButton r13 = r5.A07
            r0 = 2
            X.0qQ.A0B(r13, r0)
            r3.Ddv(r8)
            X.Oyx r0 = new X.Oyx
            r0.<init>(r3, r6)
            r13.A0E = r0
            X.1Xj r2 = r4.A04
            com.instagram.common.typedurl.ImageUrl r8 = r4.A01
            if (r2 == 0) goto L_0x00f8
            X.1iA r9 = r2.BR7()
            X.1iA r0 = X.1iA.A0E
            if (r9 == r0) goto L_0x00f8
            boolean r0 = r2.A56()
            if (r0 == 0) goto L_0x00ef
            X.1Xy r0 = r2.A0C
            java.lang.String r0 = r0.Am5()
            if (r0 == 0) goto L_0x00ef
            X.1Xy r0 = r2.A0C
            java.lang.String r0 = r0.Am5()
            if (r0 == 0) goto L_0x0086
            X.1Xj r0 = r2.A1f(r0)
            if (r0 != 0) goto L_0x0087
        L_0x0086:
            r0 = r2
        L_0x0087:
            com.instagram.model.mediasize.ExtendedImageUrl r7 = r0.A1m(r7)
        L_0x008b:
            if (r7 != 0) goto L_0x01c3
            boolean r0 = r2.A5H()
            if (r0 == 0) goto L_0x00d1
            java.lang.String r3 = "collection"
        L_0x0095:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ImageUri cannot be null for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " media with imageInfo not null: "
            r1.append(r0)
            com.instagram.model.mediasize.ImageInfo r0 = r2.A1p()
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r1.append(r0)
            java.lang.String r0 = " and candidates list size: "
            r1.append(r0)
            com.instagram.model.mediasize.ImageInfo r0 = r2.A1p()
            if (r0 == 0) goto L_0x00cf
            java.util.List r0 = r0.Al9()
            if (r0 == 0) goto L_0x00cf
            java.lang.Integer r0 = X.C51968G9o.A0t(r0)
        L_0x00c6:
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00cf:
            r0 = 0
            goto L_0x00c6
        L_0x00d1:
            boolean r0 = r2.A5D()
            if (r0 == 0) goto L_0x00da
            java.lang.String r3 = "carousel"
            goto L_0x0095
        L_0x00da:
            boolean r0 = r2.A5p()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r3 = "static image"
            goto L_0x0095
        L_0x00e3:
            boolean r0 = r2.CeS()
            if (r0 == 0) goto L_0x00ec
            java.lang.String r3 = "playable"
            goto L_0x0095
        L_0x00ec:
            java.lang.String r3 = "other"
            goto L_0x0095
        L_0x00ef:
            com.instagram.model.mediasize.ExtendedImageUrl r7 = r2.A1m(r7)
            goto L_0x008b
        L_0x00f4:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x0037
        L_0x00f8:
            if (r8 == 0) goto L_0x0136
            java.lang.String r12 = X.JTP.A0o(r8)
            r0 = 75
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9 = 1
            boolean r0 = X.C66580MXl.A1a(r0, r9, r12)
            if (r0 == 0) goto L_0x020e
            X.1a8 r8 = X.C66580MXl.A0O()
            X.MYc r7 = X.C66594MYg.A03
            com.instagram.common.session.UserSession r1 = r1.A00
            X.61K r0 = X.AnonymousClass61K.MEDIA_LOADER
            X.MYg r0 = r7.A02(r1, r0)
            X.MYb r0 = r0.A01
            X.1aU r7 = r0.A02(r12)
            r1 = 10
            X.PUC r0 = new X.PUC
            r0.<init>((int) r1, (java.lang.Object) r10, (java.lang.Object) r13, (java.lang.Object) r3)
            r8.A02(r7, r0)
        L_0x0129:
            if (r11 == 0) goto L_0x0136
            int r0 = r11.ordinal()
            if (r0 != r9) goto L_0x01e9
        L_0x0131:
            X.6uM r0 = X.C321546uM.A0N
        L_0x0133:
            r13.setIcon(r0)
        L_0x0136:
            X.3oV r15 = r5.A03
            if (r15 == 0) goto L_0x0163
            android.view.View r11 = r5.itemView
            r0 = 2
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r11, r0)
            com.instagram.common.session.UserSession r12 = r5.A02
            android.content.Context r10 = X.AnonymousClass7TE.A0S(r13)
            r14 = 0
            r17 = 224(0xe0, float:3.14E-43)
            X.759 r9 = new X.759
            r16 = r14
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r8 = r4.A03
            if (r8 == 0) goto L_0x01bf
            r7 = 1
            r1 = 45
            X.Phe r0 = new X.Phe
            r0.<init>(r1, r5, r4)
            r9.A04(r8, r0, r7)
        L_0x0163:
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.A00 = r0
            r13.setEnableTouchOverlay(r6)
            if (r2 == 0) goto L_0x0198
            com.instagram.common.session.UserSession r0 = r5.A02
            android.content.res.Resources r7 = r13.getResources()
            com.instagram.user.model.User r0 = r2.A2A(r0)
            if (r0 == 0) goto L_0x01bd
            java.lang.String r6 = r0.B8Q()
        L_0x017c:
            X.1Xy r0 = r2.A0C
            java.lang.String r4 = r0.AXm()
            boolean r0 = r2.CeS()
            if (r0 == 0) goto L_0x01a5
            if (r4 == 0) goto L_0x019b
            r1 = 2131976478(0x7f13611e, float:1.9590078E38)
        L_0x018d:
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r4}
        L_0x0191:
            java.lang.String r0 = r7.getString(r1, r0)
        L_0x0195:
            r13.setContentDescription(r0)
        L_0x0198:
            r5.A00 = r3
        L_0x019a:
            return
        L_0x019b:
            if (r6 == 0) goto L_0x01a1
            r1 = 2131976477(0x7f13611d, float:1.9590076E38)
            goto L_0x01b0
        L_0x01a1:
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            goto L_0x01b8
        L_0x01a5:
            if (r4 == 0) goto L_0x01ab
            r1 = 2131965937(0x7f1337f1, float:1.9568698E38)
            goto L_0x018d
        L_0x01ab:
            if (r6 == 0) goto L_0x01b5
            r1 = 2131965936(0x7f1337f0, float:1.9568696E38)
        L_0x01b0:
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            goto L_0x0191
        L_0x01b5:
            r0 = 2131969399(0x7f134577, float:1.957572E38)
        L_0x01b8:
            java.lang.String r0 = r7.getString(r0)
            goto L_0x0195
        L_0x01bd:
            r6 = 0
            goto L_0x017c
        L_0x01bf:
            r9.A02()
            goto L_0x0163
        L_0x01c3:
            X.C66819MdB.A00(r7, r3)
            com.instagram.common.session.UserSession r0 = r1.A00
            r13.setUrl(r0, r7, r10)
            long r0 = r2.A17()
            r13.A05 = r0
            long r0 = r2.A17()
            r13.A05 = r0
            X.1Xy r0 = r2.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x01ee
            java.lang.Boolean r0 = r0.Ca8()
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x01ee
        L_0x01e9:
            r13.A0H()
            goto L_0x0136
        L_0x01ee:
            boolean r0 = r2.A56()
            if (r0 == 0) goto L_0x01f8
            X.6uM r0 = X.C321546uM.A08
            goto L_0x0133
        L_0x01f8:
            boolean r0 = r2.CeS()
            if (r0 == 0) goto L_0x01e9
            boolean r0 = r2.A5G()
            if (r0 != 0) goto L_0x020a
            boolean r0 = r2.A5I()
            if (r0 == 0) goto L_0x0131
        L_0x020a:
            X.6uM r0 = X.C321546uM.A0K
            goto L_0x0133
        L_0x020e:
            X.C66819MdB.A00(r8, r3)
            r13.setUrl(r8, r10)
            goto L_0x0129
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67816MvK.onBindViewHolder(X.3kE, int):void");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1349536907);
        int size = this.A04.A02.size();
        AnonymousClass0fD.A0A(-772628291, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(-768597781);
        Object obj = this.A04.A02.get(i);
        if (obj instanceof N8C) {
            i2 = 0;
        } else if (obj instanceof C72360P2z) {
            i2 = 1;
        } else {
            C20561Wub A1K = AnonymousClass7TE.A1K();
            AnonymousClass0fD.A0A(371880590, A032);
            throw A1K;
        }
        AnonymousClass0fD.A0A(1835203783, A032);
        return i2;
    }
}
