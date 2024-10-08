package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

public final class KVM extends C60518Jmp implements C66453MSh {
    public C66569MWx A00;
    public C66569MWx A01;
    public Integer A02 = AnonymousClass05K.A00;
    public boolean A03;
    public final View A04;
    public final ViewGroup A05;
    public final ViewGroup A06;
    public final ImageView A07;
    public final AnonymousClass07Z A08;
    public final AnonymousClass2gO A09 = new C64317LZr(this, 21);
    public final MusicProduct A0A;
    public final UserSession A0B;
    public final C252063oV A0C;
    public final C252063oV A0D;
    public final C252063oV A0E;
    public final C252063oV A0F;
    public final C63785L6r A0G;
    public final AnonymousClass8ZI A0H;
    public final GVO A0I;
    public final LFN A0J;
    public final MVU A0K;
    public final C60329JjY A0L;
    public final IgBouncyUfiButtonImageView A0M;
    public final String A0N;
    public final String A0O;
    public final AnonymousClass0eM A0P = AnonymousClass0eN.A01(new C66217MIy(this, 23));
    public final AnonymousClass0eM A0Q = AnonymousClass0eN.A01(new C66217MIy(this, 24));
    public final AnonymousClass0eM A0R = AnonymousClass0eN.A01(new C66217MIy(this, 25));
    public final boolean A0S;
    public final boolean A0T;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r6.CK6() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.instagram.api.schemas.TrackMetadata r16, X.C66569MWx r17, java.lang.Integer r18, java.lang.Integer r19, boolean r20) {
        /*
            r15 = this;
            r14 = 0
            r5 = 1
            r0 = r18
            r15.A02 = r0
            r6 = r17
            r15.A01 = r6
            if (r16 == 0) goto L_0x0012
            java.lang.Integer r0 = r16.C9r()
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            java.lang.Integer r0 = r6.C9r()
        L_0x0016:
            if (r20 == 0) goto L_0x017d
            if (r0 == 0) goto L_0x017d
            X.3oV r2 = r15.A0F
            android.view.View r1 = r2.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r0.toString()
            r1.setText(r0)
            android.view.View r1 = r2.getView()
            r0 = 0
        L_0x002e:
            r1.setVisibility(r0)
        L_0x0031:
            if (r16 == 0) goto L_0x017a
            java.util.List r1 = r16.Ay7()
        L_0x0037:
            r0 = 0
            if (r1 == 0) goto L_0x0177
            java.lang.Object r2 = X.00k.A0J(r1)
        L_0x003e:
            com.instagram.api.schemas.AudioMetadataLabels r1 = com.instagram.api.schemas.AudioMetadataLabels.NEW_RELEASE
            if (r2 != r1) goto L_0x0167
            X.0eM r1 = r15.A0Q
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x0167
            X.3oV r1 = r15.A0D
            android.view.View r3 = r1.getView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2 = 2131964576(0x7f1332a0, float:1.9565938E38)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r3)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r2)
            r3.setText(r1)
            r1 = 0
        L_0x0061:
            r3.setVisibility(r1)
        L_0x0064:
            boolean r4 = r6 instanceof X.DHT
            if (r4 == 0) goto L_0x0157
            r1 = r6
            X.DHT r1 = (X.DHT) r1
            com.instagram.api.schemas.OriginalSoundDataIntf r8 = r1.A02
            com.instagram.api.schemas.OriginalAudioSubtype r2 = r8.BYy()
            com.instagram.api.schemas.OriginalAudioSubtype r1 = com.instagram.api.schemas.OriginalAudioSubtype.A04
            if (r2 != r1) goto L_0x0157
            java.util.List r1 = r8.Adj()
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x0157
            X.3oV r7 = r15.A0E
            android.view.View r3 = r7.getView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r2 = X.JTQ.A06(r15)
            java.util.List r1 = r8.Adj()
            android.text.SpannableStringBuilder r1 = X.C64131LPf.A00(r2, r1)
            r3.setText(r1)
            android.view.View r2 = r7.getView()
            r1 = 0
        L_0x009b:
            r2.setVisibility(r1)
        L_0x009e:
            boolean r1 = r6.isEligibleForAudioEffects()
            if (r1 == 0) goto L_0x0147
            X.0eM r1 = r15.A0P
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x0147
            X.3oV r1 = r15.A0C
            android.view.View r2 = r1.getView()
            r1 = 0
        L_0x00b3:
            r2.setVisibility(r1)
        L_0x00b6:
            X.GVO r3 = r15.A0I
            java.lang.String r8 = r6.getTitle()
            boolean r7 = r6.isExplicit()
            boolean r1 = r15.A0T
            if (r1 == 0) goto L_0x00cb
            boolean r2 = r6.CK6()
            r1 = 1
            if (r2 != 0) goto L_0x00cc
        L_0x00cb:
            r1 = 0
        L_0x00cc:
            X.GVM.A00(r0, r3, r8, r7, r1)
            X.L6r r9 = r15.A0G
            java.lang.String r10 = r6.getDisplayArtist()
            com.instagram.api.schemas.MusicProduct r2 = r15.A0A
            com.instagram.api.schemas.MusicProduct r1 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            r11 = 0
            if (r2 != r1) goto L_0x00e8
            com.instagram.music.common.model.AudioType r8 = r6.CAc()
            com.instagram.music.common.model.AudioType r7 = com.instagram.music.common.model.AudioType.ORIGINAL_AUDIO
            if (r8 != r7) goto L_0x0140
            java.lang.String r11 = r6.getFormattedClipsMediaCount()
        L_0x00e8:
            int r7 = r6.C95()
            long r7 = (long) r7
            java.lang.String r12 = X.1G0.A02(r7)
            boolean r13 = r6.Cdd()
            X.LJQ.A01(r9, r10, r11, r12, r13, r14)
            r3.A00(r14)
            android.widget.TextView r9 = r9.A00
            android.text.TextUtils$TruncateAt r7 = android.text.TextUtils.TruncateAt.END
            r9.setEllipsize(r7)
            r9.setHorizontalFadingEdgeEnabled(r14)
            r9.setSelected(r14)
            r8 = 0
            if (r4 == 0) goto L_0x013e
            r7 = r6
            X.DHT r7 = (X.DHT) r7
            if (r7 == 0) goto L_0x0116
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r7.A02
            com.instagram.api.schemas.OriginalAudioSubtype r0 = r0.BYy()
        L_0x0116:
            com.instagram.api.schemas.OriginalAudioSubtype r4 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            if (r0 != r4) goto L_0x01a2
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r7.A02
            java.util.List r0 = r0.Adj()
            if (r0 == 0) goto L_0x018d
            java.util.Iterator r4 = r0.iterator()
        L_0x012a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r0 = r4.next()
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r0 = (com.instagram.api.schemas.OriginalAudioPartMetadataIntf) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.C72()
            r8.add(r0)
            goto L_0x012a
        L_0x013e:
            r7 = r0
            goto L_0x0116
        L_0x0140:
            if (r16 == 0) goto L_0x00e8
            java.lang.String r11 = r16.getFormattedClipsMediaCount()
            goto L_0x00e8
        L_0x0147:
            X.3oV r2 = r15.A0C
            boolean r1 = r2.CVM()
            if (r1 == 0) goto L_0x00b6
            android.view.View r2 = r2.getView()
            r1 = 8
            goto L_0x00b3
        L_0x0157:
            X.3oV r2 = r15.A0E
            boolean r1 = r2.CVM()
            if (r1 == 0) goto L_0x009e
            android.view.View r2 = r2.getView()
            r1 = 8
            goto L_0x009b
        L_0x0167:
            X.3oV r2 = r15.A0D
            boolean r1 = r2.CVM()
            if (r1 == 0) goto L_0x0064
            android.view.View r3 = r2.getView()
            r1 = 8
            goto L_0x0061
        L_0x0177:
            r2 = r0
            goto L_0x003e
        L_0x017a:
            r1 = 0
            goto L_0x0037
        L_0x017d:
            X.3oV r1 = r15.A0F
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x0031
            android.view.View r1 = r1.getView()
            r0 = 8
            goto L_0x002e
        L_0x018d:
            android.widget.ImageView r7 = r15.A07
            android.graphics.drawable.Drawable r4 = r7.getDrawable()
            r0 = 334(0x14e, float:4.68E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r4, r0)
            X.GIH r4 = (X.GIH) r4
            X.JYP.A04(r4, r8)
            goto L_0x01b1
        L_0x01a2:
            android.widget.ImageView r7 = r15.A07
            boolean r0 = r6.CRQ()
            if (r0 != 0) goto L_0x01ae
            com.instagram.common.typedurl.ImageUrl r8 = r6.As5()
        L_0x01ae:
            X.JYP.A00(r7, r8)
        L_0x01b1:
            X.MWx r0 = r15.A00
            if (r0 == 0) goto L_0x01d3
            r8 = 0
            java.lang.String r4 = r0.BfO()
            X.MWx r0 = r15.A01
            if (r0 == 0) goto L_0x01c2
            java.lang.String r8 = r0.BfO()
        L_0x01c2:
            if (r4 == r8) goto L_0x01d3
            X.JjY r4 = r15.A0L
            X.MWx r0 = r15.A00
            if (r0 == 0) goto L_0x02e1
            X.2Fk r4 = r4.A00(r0)
            X.2gO r0 = r15.A09
            r4.A08(r0)
        L_0x01d3:
            X.JjY r0 = r15.A0L
            X.2Fk r8 = r0.A00(r6)
            X.07Z r4 = r15.A08
            X.2gO r0 = r15.A09
            r8.A06(r4, r0)
            java.lang.Integer r0 = r15.A02
            int r4 = r0.intValue()
            if (r4 == r14) goto L_0x02b8
            if (r4 == r5) goto L_0x02a3
            r0 = 2
            if (r4 != r0) goto L_0x02dc
            X.8ZI r10 = r15.A0H
            X.8ZH r0 = X.AnonymousClass8ZH.STOP
            r10.A01(r0)
            android.view.View r8 = r15.A04
            android.content.Context r4 = X.JTQ.A06(r15)
            r0 = 2131967890(0x7f133f92, float:1.957266E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            r8.setContentDescription(r0)
            r3.A00(r5)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            r9.setEllipsize(r0)
            r9.setHorizontalFadingEdgeEnabled(r5)
            r9.setSelected(r5)
            r0 = 0
            r10.A00(r0)
        L_0x0216:
            r0 = 31
            X.LY7.A00(r8, r0, r6, r15)
            android.view.ViewGroup r4 = r15.A05
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            android.content.Context r9 = X.JTQ.A06(r15)
            r8 = 2131967746(0x7f133f02, float:1.9572367E38)
            java.lang.String r3 = r6.getTitle()
            java.lang.String r0 = r6.getDisplayArtist()
            java.lang.String r0 = X.DbV.A0u(r9, r3, r0, r8)
            r5.append(r0)
            r3 = 0
            if (r2 != r1) goto L_0x0246
            com.instagram.music.common.model.AudioType r1 = r6.CAc()
            com.instagram.music.common.model.AudioType r0 = com.instagram.music.common.model.AudioType.ORIGINAL_AUDIO
            if (r1 != r0) goto L_0x029c
            java.lang.String r3 = r6.getFormattedClipsMediaCount()
        L_0x0246:
            java.lang.String r2 = ","
            if (r3 == 0) goto L_0x0250
            r5.append(r2)
            r5.append(r3)
        L_0x0250:
            int r0 = r6.C95()
            long r0 = (long) r0
            java.lang.String r0 = X.1G0.A02(r0)
            r5.append(r2)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r5)
            X.0qQ.A07(r0)
            r4.setContentDescription(r0)
            boolean r0 = r6.CRQ()
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x027b
            r4.setAlpha(r3)
        L_0x0271:
            r0 = 29
            r1 = r19
            X.LYA.A01(r4, r6, r1, r15, r0)
            r15.A00 = r6
            return
        L_0x027b:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r2)
            X.LFN r0 = r15.A0J
            java.lang.Integer r1 = r0.A00(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0293
            r7.setAlpha(r3)
            android.view.ViewGroup r0 = r15.A06
            r0.setAlpha(r3)
            goto L_0x0271
        L_0x0293:
            r7.setAlpha(r2)
            android.view.ViewGroup r0 = r15.A06
            r0.setAlpha(r2)
            goto L_0x0271
        L_0x029c:
            if (r16 == 0) goto L_0x0246
            java.lang.String r3 = r16.getFormattedClipsMediaCount()
            goto L_0x0246
        L_0x02a3:
            X.8ZI r3 = r15.A0H
            X.8ZH r0 = X.AnonymousClass8ZH.LOADING
            r3.A01(r0)
            android.view.View r8 = r15.A04
            android.content.Context r3 = X.JTQ.A06(r15)
            r0 = 2131967890(0x7f133f92, float:1.957266E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x02d4
        L_0x02b8:
            X.8ZI r3 = r15.A0H
            X.8ZH r0 = X.AnonymousClass8ZH.PLAY
            r3.A01(r0)
            android.view.View r8 = r15.A04
            android.content.Context r5 = X.JTQ.A06(r15)
            r4 = 2131967855(0x7f133f6f, float:1.9572588E38)
            java.lang.String r3 = r6.getTitle()
            java.lang.String r0 = r6.getDisplayArtist()
            java.lang.String r0 = X.DbV.A0u(r5, r3, r0, r4)
        L_0x02d4:
            X.0qQ.A07(r0)
            r8.setContentDescription(r0)
            goto L_0x0216
        L_0x02dc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KVM.A00(com.instagram.api.schemas.TrackMetadata, X.MWx, java.lang.Integer, java.lang.Integer, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0175, code lost:
        if (r1 == r0) goto L_0x0177;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KVM(android.view.View r14, X.AnonymousClass07Z r15, com.instagram.api.schemas.MusicProduct r16, com.instagram.common.session.UserSession r17, X.LFN r18, X.MVU r19, X.C60329JjY r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            r13 = this;
            r5 = r17
            r0 = r19
            X.AnonymousClass7TG.A1Q(r5, r0)
            r2 = r21
            r6 = r16
            X.AnonymousClass7TG.A1S(r6, r2)
            r4 = r18
            r3 = r20
            r1 = r22
            X.C51974G9v.A1Q(r1, r3, r4, r15)
            r13.<init>(r14)
            r13.A0B = r5
            r13.A0K = r0
            r0 = r23
            r13.A0T = r0
            r13.A0A = r6
            r13.A0N = r2
            r13.A0O = r1
            r13.A0L = r3
            r13.A0J = r4
            r13.A08 = r15
            boolean r0 = X.AnonymousClass30D.A03(r5)
            r13.A0S = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r13.A02 = r0
            r1 = 21
            X.LZr r0 = new X.LZr
            r0.<init>(r13, r1)
            r13.A09 = r0
            r1 = 24
            X.MIy r0 = new X.MIy
            r0.<init>(r13, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r13.A0Q = r0
            r1 = 25
            X.MIy r0 = new X.MIy
            r0.<init>(r13, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r13.A0R = r0
            r1 = 23
            X.MIy r0 = new X.MIy
            r0.<init>(r13, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r13.A0P = r0
            r0 = 2131443129(0x7f0b3db9, float:1.8508317E38)
            android.view.ViewGroup r0 = X.DbS.A0E(r14, r0)
            r13.A05 = r0
            r0 = 2131442594(0x7f0b3ba2, float:1.8507232E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r14, r0)
            r13.A06 = r0
            r0 = 2131427950(0x7f0b026e, float:1.847753E38)
            android.widget.ImageView r2 = X.DbX.A0J(r14, r0)
            android.content.Context r4 = X.JTQ.A06(r13)
            android.content.res.Resources r3 = X.JTS.A07(r13)
            boolean r1 = r13.A0S
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            if (r1 == 0) goto L_0x0093
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
        L_0x0093:
            int r6 = r3.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = X.JTS.A07(r13)
            int r7 = X.AnonymousClass7TE.A0C(r0)
            r8 = 0
            android.content.res.Resources r0 = X.JTS.A07(r13)
            int r10 = X.JTP.A03(r0)
            android.content.Context r1 = X.JTQ.A06(r13)
            r0 = 2130970723(0x7f040863, float:1.7550164E38)
            boolean r0 = X.2Yu.A0L(r1, r0, r8)
            r11 = -1
            if (r0 == 0) goto L_0x00b7
            r11 = 1
        L_0x00b7:
            r5 = 0
            X.GIH r3 = new X.GIH
            r9 = r8
            r12 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.setImageDrawable(r3)
            r13.A07 = r2
            r0 = 2131441552(0x7f0b3790, float:1.8505119E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r14, r0)
            android.content.Context r1 = X.JTQ.A06(r13)
            r0 = 2130971412(0x7f040b14, float:1.7551562E38)
            int r1 = X.AnonymousClass7TF.A03(r1, r0)
            X.GVO r0 = new X.GVO
            r0.<init>(r2, r1)
            r13.A0I = r0
            r0 = 2131428150(0x7f0b0336, float:1.8477936E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r14, r0)
            X.L6r r0 = new X.L6r
            r0.<init>(r1)
            r13.A0G = r0
            r0 = 2131443135(0x7f0b3dbf, float:1.850833E38)
            X.3oV r0 = X.DbV.A0T(r14, r0, r8)
            r13.A0F = r0
            r0 = 2131436949(0x7f0b2595, float:1.8495783E38)
            X.3oV r0 = X.DbV.A0T(r14, r0, r8)
            r13.A0D = r0
            r0 = 2131437460(0x7f0b2794, float:1.849682E38)
            X.3oV r0 = X.DbV.A0T(r14, r0, r8)
            r13.A0E = r0
            r0 = 2131428267(0x7f0b03ab, float:1.8478174E38)
            X.3oV r0 = X.DbV.A0T(r14, r0, r8)
            r13.A0C = r0
            X.0eM r0 = r13.A0R
            java.lang.Object r0 = r0.getValue()
            X.Khr r0 = (X.C62561Khr) r0
            int r3 = r0.ordinal()
            if (r3 == r8) goto L_0x01d3
            r0 = 3
            if (r3 == r0) goto L_0x023c
            r2 = 2
            X.8ZJ r1 = X.AnonymousClass8ZI.A0V
            android.content.Context r0 = X.JTQ.A06(r13)
            if (r3 == r2) goto L_0x01cd
            X.8ZG r3 = new X.8ZG
            r3.<init>(r0)
            android.content.res.Resources r1 = X.JTS.A07(r13)
            r0 = 2131165253(0x7f070045, float:1.7944718E38)
            java.lang.Integer r0 = X.JTP.A0k(r1, r0)
            r3.A0B = r0
            android.content.res.Resources r1 = X.JTS.A07(r13)
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            java.lang.Integer r0 = X.JTP.A0k(r1, r0)
            r3.A0A = r0
        L_0x0148:
            X.8ZI r0 = r3.A00()
            r13.A0H = r0
            X.0eM r3 = r13.A0R
            java.lang.Object r0 = r3.getValue()
            X.Khr r2 = X.C62561Khr.PLAY
            if (r0 == r2) goto L_0x01c9
            java.lang.Object r0 = r3.getValue()
            X.Khr r1 = X.C62561Khr.SAVE_AND_PLAY
            if (r0 == r1) goto L_0x01c9
            java.lang.Object r0 = r3.getValue()
            if (r0 == r2) goto L_0x0177
            java.lang.Object r0 = r3.getValue()
            if (r0 == r1) goto L_0x0177
            java.lang.Object r1 = r3.getValue()
            X.Khr r0 = X.C62561Khr.SAVE_V2
            r2 = 2131438099(0x7f0b2a13, float:1.8498115E38)
            if (r1 != r0) goto L_0x017a
        L_0x0177:
            r2 = 2131438100(0x7f0b2a14, float:1.8498117E38)
        L_0x017a:
            android.view.View r1 = X.DbY.A0F(r14, r2)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r1, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.8ZI r0 = r13.A0H
            r1.setImageDrawable(r0)
            X.2eS.A01(r1)
            r13.A04 = r1
            X.0eM r2 = r13.A0R
            java.lang.Object r1 = r2.getValue()
            X.Khr r0 = X.C62561Khr.SAVE
            if (r1 == r0) goto L_0x01b5
            java.lang.Object r1 = r2.getValue()
            X.Khr r0 = X.C62561Khr.SAVE_V2
            if (r1 == r0) goto L_0x01b5
            java.lang.Object r1 = r2.getValue()
            X.Khr r0 = X.C62561Khr.SAVE_AND_PLAY
            if (r1 == r0) goto L_0x01b5
            java.lang.Object r1 = r2.getValue()
            X.Khr r0 = X.C62561Khr.SWIPE_TO_SAVE
            if (r1 == r0) goto L_0x01b5
            r1 = 0
        L_0x01b2:
            r13.A0M = r1
            return
        L_0x01b5:
            r0 = 2131440618(0x7f0b33ea, float:1.8503224E38)
            android.view.View r1 = X.DbY.A0F(r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView"
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r1 = (com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView) r1
            if (r1 == 0) goto L_0x01b2
            X.2eS.A01(r1)
            goto L_0x01b2
        L_0x01c9:
            r2 = 2131438101(0x7f0b2a15, float:1.849812E38)
            goto L_0x017a
        L_0x01cd:
            X.8ZG r3 = r1.A02(r0)
            goto L_0x0148
        L_0x01d3:
            android.content.Context r0 = X.JTQ.A06(r13)
            X.8ZG r3 = new X.8ZG
            r3.<init>(r0)
            android.content.res.Resources r1 = X.JTS.A07(r13)
            r0 = 2131165253(0x7f070045, float:1.7944718E38)
            java.lang.Integer r0 = X.JTP.A0k(r1, r0)
            r3.A0B = r0
            android.content.res.Resources r1 = X.JTS.A07(r13)
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            java.lang.Integer r0 = X.JTP.A0k(r1, r0)
            r3.A0A = r0
            android.content.res.Resources r1 = X.JTS.A07(r13)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            java.lang.Integer r0 = X.JTP.A0k(r1, r0)
            r3.A04 = r0
            android.content.res.Resources r1 = X.JTS.A07(r13)
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            java.lang.Integer r0 = X.JTP.A0k(r1, r0)
            r3.A09 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r3.A06 = r0
            android.content.res.Resources r0 = X.JTS.A07(r13)
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            java.lang.Integer r0 = X.JTP.A0k(r0, r1)
            r3.A07 = r0
            android.content.res.Resources r0 = X.JTS.A07(r13)
            java.lang.Integer r0 = X.JTP.A0k(r0, r1)
            r3.A0D = r0
            android.content.Context r2 = X.JTQ.A06(r13)
            android.content.Context r1 = X.JTQ.A06(r13)
            r0 = 2130970315(0x7f0406cb, float:1.7549337E38)
            int r0 = X.2Yu.A0H(r1, r0)
            goto L_0x0251
        L_0x023c:
            X.8ZJ r1 = X.AnonymousClass8ZI.A0V
            android.content.Context r0 = X.JTQ.A06(r13)
            X.8ZG r3 = r1.A01(r0)
            android.content.Context r2 = X.JTQ.A06(r13)
            r0 = 2130970722(0x7f040862, float:1.7550162E38)
            int r0 = X.2Yu.A0H(r2, r0)
        L_0x0251:
            int r0 = r2.getColor(r0)
            r3.A01(r0)
            goto L_0x0148
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KVM.<init>(android.view.View, X.07Z, com.instagram.api.schemas.MusicProduct, com.instagram.common.session.UserSession, X.LFN, X.MVU, X.JjY, java.lang.String, java.lang.String, boolean):void");
    }

    public final void FM3(C66569MWx mWx, float f) {
        this.A0H.A00(f);
    }
}
