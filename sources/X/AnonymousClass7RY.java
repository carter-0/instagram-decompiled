package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7RY  reason: invalid class name */
public final class AnonymousClass7RY implements AnonymousClass7D2 {
    public static final AnonymousClass7RZ A07 = new Object();
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7XR A02;
    public final AnonymousClass9HC A03;
    public final AnonymousClass7DZ A04;
    public final HashMap A05 = new HashMap();
    public final Map A06 = new HashMap();

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_visual_thumbnail_message, viewGroup, false);
        0qQ.A0A(inflate);
        AnonymousClass9HC r5 = this.A03;
        AnonymousClass90H r1 = new AnonymousClass90H(inflate, this.A00, this.A01, r5, this);
        this.A04.A00(r1);
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r29, X.AnonymousClass7FW r30) {
        /*
            r28 = this;
            r3 = r30
            r4 = r29
            X.90H r4 = (X.AnonymousClass90H) r4
            X.NYd r3 = (X.C68819NYd) r3
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r18 = 1
            r0 = r18
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3.A0A
            r17 = r0
            X.Not r14 = r3.A03
            boolean r13 = r14 instanceof X.C68885NaN
            r5 = r28
            X.7XR r6 = r5.A02
            r2 = r6
            X.7Xf r2 = (X.C332987Xf) r2
            r15 = 2
            X.0qQ.A0B(r2, r15)
            com.instagram.common.session.UserSession r8 = r4.A07
            X.0iw r7 = r4.A06
            X.MdB r0 = r4.A01
            if (r0 == 0) goto L_0x0031
            r0.Dds()
        L_0x0031:
            X.7H9 r0 = new X.7H9
            r0.<init>(r8)
            X.7HA r1 = new X.7HA
            r1.<init>(r8, r0)
            if (r17 == 0) goto L_0x02fa
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x003f:
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            X.MdB r0 = r1.A00(r7, r0, r12, r13)
            r4.A01 = r0
            r1 = 35
            X.9Km r0 = new X.9Km
            r0.<init>(r4, r1)
            r2.CjH(r0)
            com.instagram.feed.widget.IgProgressImageView r2 = r4.A0A
            X.PGL r0 = new X.PGL
            r0.<init>(r4)
            r2.A04 = r0
            X.OhO r0 = new X.OhO
            r0.<init>(r4)
            r2.addOnAttachStateChangeListener(r0)
            java.util.HashMap r0 = r5.A05
            r0.put(r4, r3)
            X.7FE r0 = r3.A02
            X.7L2 r1 = r0.A03
            X.7FU r0 = r3.A00
            boolean r8 = r0.CU2()
            X.7Kz r10 = X.AnonymousClass7FB.A04(r1, r8)
            X.7L1 r9 = r1.A02
            r0 = 3
            X.0qQ.A0B(r9, r0)
            android.widget.ImageView r7 = r4.A05
            r1 = 2131239499(0x7f08224b, float:1.8095307E38)
            int[] r0 = r10.A0C
            r11 = 0
            android.graphics.drawable.Drawable r0 = r9.A00(r0, r1)
            r7.setImageDrawable(r0)
            com.instagram.common.session.UserSession r7 = r5.A01
            java.util.Map r1 = r5.A06
            X.0iw r10 = r5.A00
            X.7RZ r19 = A07
            X.AnonymousClass7RZ.A01(r7, r4, r1)
            boolean r0 = r14 instanceof X.C68886NaO
            r16 = r0
            r9 = 1
            java.lang.String r0 = "Required value was null."
            if (r16 == 0) goto L_0x0201
            if (r14 == 0) goto L_0x02fe
            X.NaO r14 = (X.C68886NaO) r14
            java.lang.String r13 = r14.A01
            java.lang.String r15 = r14.A00
            if (r13 == 0) goto L_0x01ef
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r7)
            X.3Q2 r0 = r0.A03(r13)
            if (r0 == 0) goto L_0x01ef
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r7)
            X.3Q2 r14 = r0.A03(r13)
            X.PIV r12 = new X.PIV
            r12.<init>(r10, r4, r3, r14)
            if (r14 == 0) goto L_0x00cc
            r14.A0Y(r12)
            X.34S r0 = new X.34S
            r0.<init>(r13, r12)
            r1.put(r4, r0)
        L_0x00cc:
            X.9IP r1 = r3.A00
            if (r14 == 0) goto L_0x01e9
            java.lang.String r0 = r14.A33
            int r25 = r14.A03()
        L_0x00d6:
            r20 = r1
            r21 = r10
            r22 = r4
            r23 = r15
            r24 = r0
            r26 = r9
        L_0x00e2:
            r19.A03(r20, r21, r22, r23, r24, r25, r26)
        L_0x00e5:
            X.AnonymousClass7RZ.A02(r4, r3, r11)
        L_0x00e8:
            r1 = 19
            X.9Lz r0 = new X.9Lz
            r0.<init>(r1, r3, r4)
            X.0t0 r26 = X.AnonymousClass0eN.A01(r0)
            android.widget.FrameLayout r10 = r4.A04
            android.content.Context r20 = r10.getContext()
            X.0qQ.A07(r20)
            X.3oV r0 = r4.A09
            com.instagram.common.ui.widget.imageview.IgImageView r23 = r2.getIgImageView()
            r24 = 0
            r27 = 192(0xc0, float:2.69E-43)
            X.759 r9 = new X.759
            r25 = r0
            r19 = r9
            r21 = r2
            r22 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r7 = r3.A05
            boolean r0 = r3.A08
            if (r7 == 0) goto L_0x01a2
            if (r0 != 0) goto L_0x014b
            android.content.Context r0 = r9.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165279(0x7f07005f, float:1.794477E38)
            int r12 = r1.getDimensionPixelSize(r0)
            android.view.View r11 = r9.A01
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            int r0 = r0.width
            if (r0 >= r12) goto L_0x0137
            r0 = r12
        L_0x0137:
            r1.width = r0
            X.3oV r0 = r9.A05
            android.view.View r0 = r0.getView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            int r0 = r0.width
            r1.width = r0
        L_0x014b:
            r0 = 14
            X.Inz r1 = new X.Inz
            r1.<init>(r0, r3, r5, r7)
            r0 = r18
            r9.A04(r7, r1, r0)
        L_0x0157:
            X.7TJ r6 = (X.AnonymousClass7TJ) r6
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r3.BSG()
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x016e
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r3.BSG()
            java.lang.String r0 = r0.A00()
            r6.CjC(r0, r8)
        L_0x016e:
            android.content.Context r2 = r2.getContext()
            if (r17 == 0) goto L_0x018a
            if (r8 == 0) goto L_0x0186
            r0 = 2131960569(0x7f1322f9, float:1.955781E38)
        L_0x0179:
            java.lang.String r0 = r2.getString(r0)
        L_0x017d:
            r10.setContentDescription(r0)
        L_0x0180:
            X.7DZ r0 = r5.A04
            r0.A02(r4, r3)
            return
        L_0x0186:
            r1 = 2131960565(0x7f1322f5, float:1.9557802E38)
            goto L_0x0197
        L_0x018a:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0180
            if (r8 == 0) goto L_0x0194
            r0 = 2131960568(0x7f1322f8, float:1.9557808E38)
            goto L_0x0179
        L_0x0194:
            r1 = 2131960564(0x7f1322f4, float:1.95578E38)
        L_0x0197:
            java.lang.String r0 = r3.A06
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            goto L_0x017d
        L_0x01a2:
            if (r0 != 0) goto L_0x01be
            r7 = 2131165265(0x7f070051, float:1.7944742E38)
            com.instagram.common.session.UserSession r12 = r9.A02
            X.0Tu r11 = X.0Tu.A05
            r0 = 36328813369769577(0x8110dd00043e69, double:3.037826087207563E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x01c2
            X.3oV r0 = r9.A05
            boolean r0 = r0.CVM()
            if (r0 != 0) goto L_0x01c2
        L_0x01be:
            r9.A02()
            goto L_0x0157
        L_0x01c2:
            android.view.View r0 = r9.A01
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.content.Context r11 = r9.A00
            android.content.res.Resources r0 = r11.getResources()
            int r0 = r0.getDimensionPixelSize(r7)
            r1.width = r0
            X.3oV r0 = r9.A05
            android.view.View r0 = r0.getView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.content.res.Resources r0 = r11.getResources()
            int r0 = r0.getDimensionPixelSize(r7)
            r1.width = r0
            goto L_0x01be
        L_0x01e9:
            r9 = 0
            r0 = 0
            r25 = 0
            goto L_0x00d6
        L_0x01ef:
            X.9IP r0 = r3.A00
            r24 = 0
            r20 = r0
            r21 = r10
            r22 = r4
            r23 = r15
            r25 = r11
            r26 = r11
            goto L_0x00e2
        L_0x0201:
            boolean r1 = r14 instanceof X.C68887NaP
            if (r1 == 0) goto L_0x029d
            if (r14 == 0) goto L_0x0304
            X.NaP r14 = (X.C68887NaP) r14
            com.instagram.common.typedurl.ImageUrl r0 = r14.A01
            r13 = r0
            com.instagram.model.mediasize.ImageInfo r11 = r14.A02
            if (r11 == 0) goto L_0x0227
            android.widget.FrameLayout r0 = r4.A04
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165265(0x7f070051, float:1.7944742E38)
            int r0 = r1.getDimensionPixelSize(r0)
            com.instagram.model.mediasize.ExtendedImageUrl r11 = X.1iI.A05(r11, r12, r0)
            if (r11 != 0) goto L_0x0228
        L_0x0227:
            r11 = r13
        L_0x0228:
            X.9IP r12 = r3.A00
            boolean r0 = r14.A03
            r16 = r0
            long r0 = r14.A00
            X.0qQ.A0B(r12, r15)
            r13 = 4
            X.0qQ.A0B(r11, r13)
            android.widget.FrameLayout r13 = r4.A04
            android.content.Context r14 = r13.getContext()
            android.view.View r13 = r4.A03
            r15 = 8
            r13.setVisibility(r15)
            com.instagram.feed.widget.IgProgressImageViewProgressBar r13 = r4.A0B
            r13.setVisibility(r15)
            boolean r13 = r12.A00()
            if (r13 == 0) goto L_0x0289
            if (r16 == 0) goto L_0x0289
            r13 = 2131240319(0x7f08257f, float:1.809697E38)
            android.graphics.drawable.Drawable r13 = r14.getDrawable(r13)
            if (r13 == 0) goto L_0x025d
            r2.setProgressBarDrawable(r13)
        L_0x025d:
            java.lang.Object r13 = r12.A01
            java.lang.Number r13 = (java.lang.Number) r13
            int r14 = r13.intValue()
            r13 = 1
            switch(r14) {
                case 0: goto L_0x0298;
                case 1: goto L_0x0269;
                case 2: goto L_0x029b;
                case 3: goto L_0x0269;
                case 4: goto L_0x0298;
                case 5: goto L_0x0269;
                case 6: goto L_0x029b;
                default: goto L_0x0269;
            }
        L_0x0269:
            r2.setEnableProgressBar(r13)
            r2.setExpiration(r0)
            java.lang.Object r0 = r11.AjH()
            com.instagram.common.typedurl.ImageCacheKey r0 = (com.instagram.common.typedurl.ImageCacheKey) r0
            java.lang.String r12 = r0.A03
            X.0qQ.A07(r12)
            X.MdB r1 = r4.A01
            if (r1 == 0) goto L_0x0286
            X.Mcf r0 = new X.Mcf
            r0.<init>(r12)
            r1.DQn(r0)
        L_0x0286:
            r2.setUrl(r7, r11, r10)
        L_0x0289:
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0296
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = r3.A05
            if (r0 != 0) goto L_0x0296
        L_0x0291:
            X.AnonymousClass7RZ.A02(r4, r3, r9)
            goto L_0x00e8
        L_0x0296:
            r9 = 0
            goto L_0x0291
        L_0x0298:
            boolean r13 = r12.A02
            goto L_0x0269
        L_0x029b:
            r13 = 0
            goto L_0x0269
        L_0x029d:
            if (r13 == 0) goto L_0x02e6
            X.NaN r14 = (X.C68885NaN) r14
            if (r14 == 0) goto L_0x030a
            X.9IP r0 = r3.A00
            com.instagram.common.typedurl.ImageUrl r9 = r14.A00
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00e5
            X.MYd r1 = X.AnonymousClass6FA.A00(r7)
            java.lang.String r9 = r9.getUrl()
            X.0qQ.A07(r9)
            java.lang.String r0 = r1.A00(r9)
            if (r0 == 0) goto L_0x02c3
            X.AnonymousClass7RZ.A00(r10, r7, r4, r0)
            goto L_0x00e5
        L_0x02c3:
            boolean r0 = r1.A02(r9)
            if (r0 != 0) goto L_0x00e5
            r1.A01(r9)
            X.OKi r0 = r4.A00
            if (r0 == 0) goto L_0x02d3
            r0.A00()
        L_0x02d3:
            r0 = 0
            r4.A00 = r0
            r1 = r6
            X.7Wn r1 = (X.C332827Wn) r1
            X.Ack r0 = new X.Ack
            r0.<init>(r10, r7, r4)
            X.OKi r0 = r1.CgK(r0, r9)
            r4.A00 = r0
            goto L_0x00e5
        L_0x02e6:
            android.view.View r0 = r4.A03
            r1 = 8
            r0.setVisibility(r1)
            com.instagram.feed.widget.IgProgressImageViewProgressBar r0 = r4.A0B
            r0.setVisibility(r1)
            r2.A04()
            r2.setEnableProgressBar(r11)
            goto L_0x00e5
        L_0x02fa:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x003f
        L_0x02fe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0304:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x030a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RY.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        AnonymousClass90H r32 = (AnonymousClass90H) r3;
        0qQ.A0B(r32, 0);
        HashMap hashMap = this.A05;
        if (hashMap.containsKey(r32)) {
            hashMap.remove(r32);
        }
        AnonymousClass7RZ.A01(this.A01, r32, this.A06);
        C70762OKi oKi = r32.A00;
        if (oKi != null) {
            oKi.A00();
        }
        r32.A00 = null;
        this.A04.A01(r32);
    }

    public AnonymousClass7RY(AnonymousClass0iw r4, UserSession userSession, AnonymousClass7XR r6, AnonymousClass9HC r7) {
        this.A01 = userSession;
        this.A00 = r4;
        this.A02 = r6;
        this.A03 = r7;
        List singletonList = Collections.singletonList(C3259074q.A00(new AnonymousClass7DX((AnonymousClass7XN) r6), new C331447Ra(this), r6, r7));
        0qQ.A07(singletonList);
        this.A04 = new AnonymousClass7DZ(singletonList);
    }
}
