package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.78H  reason: invalid class name */
public final class AnonymousClass78H implements AnonymousClass7D2 {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C332937Xa A03;
    public final AnonymousClass9HC A04;
    public final AnonymousClass78I A05;
    public final AnonymousClass78D A06;
    public final AnonymousClass7DZ A07;
    public final MYd A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final boolean A0D;

    /* renamed from: A02 */
    public final C3263876o ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup, 0);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 1);
        UserSession userSession = this.A02;
        C227062ia A002 = AnonymousClass2iW.A00(userSession);
        if (A002.A03 > 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 255;
            inflate = 2Su.A01(layoutInflater2, layoutParams, viewGroup2, R.layout.direct_reel_share_message, false, A002.A05);
        } else {
            inflate = layoutInflater.inflate(R.layout.direct_reel_share_message, viewGroup, false);
        }
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        C3263876o r1 = new C3263876o(inflate, userSession);
        this.A07.A00(r1);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v284, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0480, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A02, 36328731765194301L) != false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04b1, code lost:
        if (0 == ((int) X.182.A01(X.0Tu.A05, X.0ob.A00(r3), 36610752202807423L))) goto L_0x04b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x099e, code lost:
        if (r19 == 0) goto L_0x09a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x09cf, code lost:
        if (r4 != null) goto L_0x09d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0359, code lost:
        if (r13.A02(r3.A02) == false) goto L_0x035b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0471 A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0491 A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x049e A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0519 A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x079e A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0867 A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0aa7 A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0ae7 A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0b0d A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0b2f A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0b3b A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0b47 A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0b7c A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0bee A[Catch:{ all -> 0x0d03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0c3f A[Catch:{ all -> 0x0d03 }] */
    /* renamed from: A03 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADp(X.AnonymousClass752 r51, X.C3263876o r52) {
        /*
            r50 = this;
            r0 = 0
            r1 = r52
            X.0qQ.A0B(r1, r0)
            r9 = 1
            r6 = r51
            X.0qQ.A0B(r6, r9)
            r17 = 1
            boolean r2 = com.facebook.systrace.Systrace.A0E(r17)
            if (r2 == 0) goto L_0x001c
            r3 = -2028038483(0xffffffff871e96ad, float:-1.1930879E-34)
            java.lang.String r2 = "PortraitXmaContentDefinition.bindViewHolder"
            X.0fS.A01(r2, r3)
        L_0x001c:
            com.instagram.model.direct.messageid.MessageIdentifier r2 = r6.BSG()     // Catch:{ all -> 0x0d03 }
            int r8 = r2.hashCode()     // Catch:{ all -> 0x0d03 }
            r2 = r50
            X.78I r13 = r2.A05     // Catch:{ all -> 0x0d03 }
            if (r13 == 0) goto L_0x0090
            X.02m r7 = r13.A00     // Catch:{ all -> 0x0d03 }
            r5 = 20134579(0x1333ab3, float:3.2919222E-38)
            boolean r3 = r7.isMarkerOn(r5, r8)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x0090
            X.7Fr r3 = r6.A03     // Catch:{ all -> 0x0d03 }
            X.3t3 r4 = r3.A0M     // Catch:{ all -> 0x0d03 }
            if (r4 == 0) goto L_0x0151
            X.3t0 r11 = X.C300965yF.A02(r4)     // Catch:{ all -> 0x0d03 }
            if (r11 == 0) goto L_0x0151
            X.0eM r3 = r2.A0A     // Catch:{ all -> 0x0d03 }
            java.lang.Object r10 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            X.2Dm r10 = (X.2Dm) r10     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = r11.A00     // Catch:{ all -> 0x0d03 }
            X.2Dr r10 = (X.2Dr) r10     // Catch:{ all -> 0x0d03 }
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x0d03 }
            X.3U9 r3 = r10.A0N(r3)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x014e
            X.3Tu r3 = r3.AiM()     // Catch:{ all -> 0x0d03 }
        L_0x005a:
            boolean r10 = X.C331057Pi.A02(r3)     // Catch:{ all -> 0x0d03 }
        L_0x005e:
            X.3t0 r11 = X.C300965yF.A02(r4)     // Catch:{ all -> 0x0d03 }
            if (r11 == 0) goto L_0x0156
            X.0eM r3 = r2.A0A     // Catch:{ all -> 0x0d03 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            X.2Dm r4 = (X.2Dm) r4     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = r11.A00     // Catch:{ all -> 0x0d03 }
            X.2Dr r4 = (X.2Dr) r4     // Catch:{ all -> 0x0d03 }
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x0d03 }
            X.3U9 r3 = r4.A0N(r3)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x014b
            X.3Tu r4 = r3.AiM()     // Catch:{ all -> 0x0d03 }
        L_0x007d:
            com.instagram.common.session.UserSession r3 = r2.A02     // Catch:{ all -> 0x0d03 }
            boolean r4 = X.C331057Pi.A01(r3, r4)     // Catch:{ all -> 0x0d03 }
        L_0x0083:
            r7.markerStart(r5, r8)     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = "is_instamadillo_cutover"
            r7.markerAnnotate(r5, r8, r3, r10)     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = "is_ttlc"
            r7.markerAnnotate(r5, r8, r3, r4)     // Catch:{ all -> 0x0d03 }
        L_0x0090:
            android.content.Context r3 = r2.A00     // Catch:{ all -> 0x0d03 }
            r49 = r3
            X.7Xa r12 = r2.A03     // Catch:{ all -> 0x0d03 }
            X.0iw r3 = r2.A01     // Catch:{ all -> 0x0d03 }
            r48 = r3
            X.2eb r3 = r1.A0J     // Catch:{ all -> 0x0d03 }
            r5 = 8
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r4 = r1.A0I     // Catch:{ all -> 0x0d03 }
            r4.A03(r5)     // Catch:{ all -> 0x0d03 }
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r3 = r1.A0X     // Catch:{ all -> 0x0d03 }
            r47 = r3
            r3.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            com.instagram.feed.widget.IgProgressImageView r10 = r1.A0V     // Catch:{ all -> 0x0d03 }
            r10.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r3 = r1.A0W     // Catch:{ all -> 0x0d03 }
            r46 = r3
            r3.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            androidx.constraintlayout.widget.ConstraintLayout r3 = r1.A0B     // Catch:{ all -> 0x0d03 }
            r45 = r3
            r3.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0H     // Catch:{ all -> 0x0d03 }
            r44 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0K     // Catch:{ all -> 0x0d03 }
            r43 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0P     // Catch:{ all -> 0x0d03 }
            r42 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.3oV r3 = r1.A0T     // Catch:{ all -> 0x0d03 }
            r41 = r3
            r3.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0L     // Catch:{ all -> 0x0d03 }
            r40 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0M     // Catch:{ all -> 0x0d03 }
            r39 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0N     // Catch:{ all -> 0x0d03 }
            r38 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0O     // Catch:{ all -> 0x0d03 }
            r37 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0E     // Catch:{ all -> 0x0d03 }
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0F     // Catch:{ all -> 0x0d03 }
            r36 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            android.widget.ImageView r3 = r1.A07     // Catch:{ all -> 0x0d03 }
            r35 = r3
            r3.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            android.widget.ImageView r3 = r1.A04     // Catch:{ all -> 0x0d03 }
            r34 = r3
            r3.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0G     // Catch:{ all -> 0x0d03 }
            r33 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            X.2eb r3 = r1.A0C     // Catch:{ all -> 0x0d03 }
            r32 = r3
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
            android.view.View r7 = r37.A01()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x0d03 }
            com.instagram.igds.components.button.IgdsButton r7 = (com.instagram.igds.components.button.IgdsButton) r7     // Catch:{ all -> 0x0d03 }
            X.2el r3 = X.AnonymousClass2hM.A00(r7)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0132
            r3.A04(r7)     // Catch:{ all -> 0x0d03 }
        L_0x0132:
            boolean r3 = r2.A0D     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0144
            android.widget.FrameLayout r8 = r1.A03     // Catch:{ all -> 0x0d03 }
            r7 = 2131237395(0x7f081a13, float:1.809104E38)
            r3 = r49
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r7)     // Catch:{ all -> 0x0d03 }
            r8.setForeground(r3)     // Catch:{ all -> 0x0d03 }
        L_0x0144:
            X.755 r11 = r6.A04     // Catch:{ all -> 0x0d03 }
            boolean r3 = r11 instanceof X.AnonymousClass754     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x018c
            goto L_0x0159
        L_0x014b:
            r4 = 0
            goto L_0x007d
        L_0x014e:
            r3 = 0
            goto L_0x005a
        L_0x0151:
            r10 = 0
            if (r4 == 0) goto L_0x0156
            goto L_0x005e
        L_0x0156:
            r4 = 0
            goto L_0x0083
        L_0x0159:
            if (r13 == 0) goto L_0x0166
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r6.BSG()     // Catch:{ all -> 0x0d03 }
            int r3 = r3.hashCode()     // Catch:{ all -> 0x0d03 }
            r13.A00(r3)     // Catch:{ all -> 0x0d03 }
        L_0x0166:
            X.7FU r3 = r6.A00     // Catch:{ all -> 0x0d03 }
            boolean r8 = r3.CU2()     // Catch:{ all -> 0x0d03 }
            X.754 r11 = (X.AnonymousClass754) r11     // Catch:{ all -> 0x0d03 }
            r7 = 6
            java.lang.CharSequence r5 = r11.A01     // Catch:{ all -> 0x0d03 }
            if (r5 == 0) goto L_0x0cbb
            android.view.View r3 = r4.A01()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0d03 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x0d03 }
            r3.setText(r5)     // Catch:{ all -> 0x0d03 }
            r3.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            int r0 = r11.A00     // Catch:{ all -> 0x0d03 }
            r3.setTextColor(r0)     // Catch:{ all -> 0x0d03 }
            if (r8 != 0) goto L_0x0cb8
            r7 = 5
            goto L_0x0cb8
        L_0x018c:
            boolean r3 = r11 instanceof X.AnonymousClass756     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x0194
            if (r11 == 0) goto L_0x0194
            goto L_0x0cec
        L_0x0194:
            r16 = 0
            if (r3 == 0) goto L_0x0199
            goto L_0x019c
        L_0x0199:
            r11 = r16
            goto L_0x019e
        L_0x019c:
            X.756 r11 = (X.AnonymousClass756) r11     // Catch:{ all -> 0x0d03 }
        L_0x019e:
            X.7Fr r8 = r6.A03     // Catch:{ all -> 0x0d03 }
            X.777 r7 = r8.A0F     // Catch:{ all -> 0x0d03 }
            if (r7 == 0) goto L_0x0285
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r10.getIgImageView()     // Catch:{ all -> 0x0d03 }
            X.7FE r3 = r8.A0C     // Catch:{ all -> 0x0d03 }
            r31 = r3
            X.77D r4 = X.C3265577g.A05(r4, r3)     // Catch:{ all -> 0x0d03 }
            X.9HC r3 = r2.A04     // Catch:{ all -> 0x0d03 }
            X.0eM r3 = r3.A0x     // Catch:{ all -> 0x0d03 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0d03 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x01da
            X.7Qg r3 = r4.A04     // Catch:{ all -> 0x0d03 }
            r15 = r3
            r14 = 2130970330(0x7f0406da, float:1.7549367E38)
            r3 = r49
            int r14 = X.2Yu.A0H(r3, r14)     // Catch:{ all -> 0x0d03 }
            int r14 = r3.getColor(r14)     // Catch:{ all -> 0x0d03 }
            r3 = 1073741824(0x40000000, float:2.0)
            r15.A02(r14, r3, r0)     // Catch:{ all -> 0x0d03 }
            r4.A03 = r0     // Catch:{ all -> 0x0d03 }
            r10.setPostProcessor(r4)     // Catch:{ all -> 0x0d03 }
        L_0x01da:
            X.9Iu r3 = r8.A03     // Catch:{ all -> 0x0d03 }
            r19 = r3
            if (r3 == 0) goto L_0x027a
            android.view.View r3 = r1.itemView     // Catch:{ all -> 0x0d03 }
            android.content.Context r14 = r3.getContext()     // Catch:{ all -> 0x0d03 }
            r3 = r31
            X.3Us r21 = X.C3265577g.A01(r14, r3)     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r21)     // Catch:{ all -> 0x0d03 }
            r3 = r19
            java.lang.Object r3 = r3.A00     // Catch:{ all -> 0x0d03 }
            X.OMk r3 = (X.C70815OMk) r3     // Catch:{ all -> 0x0d03 }
            X.Nj6 r3 = r3.A00     // Catch:{ all -> 0x0d03 }
            X.Nj6 r14 = X.C69305Nj6.PRIVATE     // Catch:{ all -> 0x0d03 }
            r15 = 0
            if (r3 != r14) goto L_0x01fd
            r15 = 1
        L_0x01fd:
            boolean r3 = r7 instanceof X.AnonymousClass776     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0238
            r3 = r7
            X.776 r3 = (X.AnonymousClass776) r3     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0238
            com.instagram.common.typedurl.ImageUrl r3 = r3.A00     // Catch:{ all -> 0x0d03 }
            r25 = r3
        L_0x020a:
            com.instagram.common.session.UserSession r3 = r2.A02     // Catch:{ all -> 0x0d03 }
            r24 = r3
            X.0eM r3 = r1.A0Y     // Catch:{ all -> 0x0d03 }
            r30 = r3
            java.lang.Object r3 = r30.getValue()     // Catch:{ all -> 0x0d03 }
            X.77G r3 = (X.AnonymousClass77G) r3     // Catch:{ all -> 0x0d03 }
            r14 = r31
            X.7L2 r14 = r14.A03     // Catch:{ all -> 0x0d03 }
            r28 = r14
            if (r15 == 0) goto L_0x0235
            r14 = 2131165196(0x7f07000c, float:1.7944602E38)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0d03 }
        L_0x0227:
            r20 = r49
            r22 = r19
            r23 = r48
            r26 = r4
            r27 = r3
            X.AnonymousClass77H.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0d03 }
            goto L_0x023b
        L_0x0235:
            r29 = r16
            goto L_0x0227
        L_0x0238:
            r25 = r16
            goto L_0x020a
        L_0x023b:
            if (r15 != 0) goto L_0x0285
            java.lang.Object r14 = r30.getValue()     // Catch:{ all -> 0x0d03 }
            X.77G r14 = (X.AnonymousClass77G) r14     // Catch:{ all -> 0x0d03 }
            android.view.View r3 = r1.itemView     // Catch:{ all -> 0x0d03 }
            android.content.Context r15 = r3.getContext()     // Catch:{ all -> 0x0d03 }
            r3 = r31
            X.3Us r15 = X.C3265577g.A01(r15, r3)     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r15)     // Catch:{ all -> 0x0d03 }
            X.0qQ.A0B(r14, r0)     // Catch:{ all -> 0x0d03 }
            X.3v7 r14 = r14.A00     // Catch:{ all -> 0x0d03 }
            r3 = r16
            X.C256013v5.A01(r15, r4, r14, r3, r0)     // Catch:{ all -> 0x0d03 }
            X.0Tu r15 = X.0Tu.A05     // Catch:{ all -> 0x0d03 }
            r3 = 36328731765194301(0x8110ca00013e3d, double:3.037774480145563E-306)
            r14 = r24
            boolean r3 = X.182.A06(r15, r14, r3)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x0285
            java.lang.Object r3 = r30.getValue()     // Catch:{ all -> 0x0d03 }
            X.77G r3 = (X.AnonymousClass77G) r3     // Catch:{ all -> 0x0d03 }
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x0d03 }
            X.3v7 r3 = r3.A00     // Catch:{ all -> 0x0d03 }
            X.C256013v5.A04(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0285
        L_0x027a:
            X.0eM r3 = r1.A0Y     // Catch:{ all -> 0x0d03 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            X.77G r3 = (X.AnonymousClass77G) r3     // Catch:{ all -> 0x0d03 }
            X.AnonymousClass77H.A03(r3)     // Catch:{ all -> 0x0d03 }
        L_0x0285:
            X.7FE r3 = r8.A0C     // Catch:{ all -> 0x0d03 }
            r29 = r3
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r6.BSG()     // Catch:{ all -> 0x0d03 }
            int r14 = r3.hashCode()     // Catch:{ all -> 0x0d03 }
            boolean r3 = r7 instanceof X.AnonymousClass776     // Catch:{ all -> 0x0d03 }
            r25 = 8
            if (r3 == 0) goto L_0x0535
            if (r13 == 0) goto L_0x029c
            r13.A00(r14)     // Catch:{ all -> 0x0d03 }
        L_0x029c:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r10.getIgImageView()     // Catch:{ all -> 0x0d03 }
            r3 = r29
            X.77D r3 = X.C3265577g.A05(r4, r3)     // Catch:{ all -> 0x0d03 }
            r4.setImageRendererAndReset(r3)     // Catch:{ all -> 0x0d03 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r10.setAlpha(r3)     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r10.getIgImageView()     // Catch:{ all -> 0x0d03 }
            r3.clearColorFilter()     // Catch:{ all -> 0x0d03 }
            r3 = r45
            r3.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            r3 = 3
            r10.setMiniPreviewBlurRadius(r3)     // Catch:{ all -> 0x0d03 }
            X.78D r3 = r2.A06     // Catch:{ all -> 0x0d03 }
            r20 = r3
            if (r3 == 0) goto L_0x035e
            android.view.View r3 = r1.itemView     // Catch:{ all -> 0x0d03 }
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x0d03 }
            X.7FE r3 = r6.A02     // Catch:{ all -> 0x0d03 }
            X.3Us r3 = X.C3265577g.A01(r4, r3)     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0d03 }
            float[] r4 = r3.A01     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0d03 }
            r14 = r4[r0]     // Catch:{ all -> 0x0d03 }
            r3 = 2
            r13 = r4[r3]     // Catch:{ all -> 0x0d03 }
            r3 = 4
            r19 = r4[r3]     // Catch:{ all -> 0x0d03 }
            r3 = 6
            r3 = r4[r3]     // Catch:{ all -> 0x0d03 }
            r15 = r46
            r4 = r19
            r15.A01(r14, r13, r4, r3)     // Catch:{ all -> 0x0d03 }
            r15.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r6.BSG()     // Catch:{ all -> 0x0d03 }
            java.lang.String r14 = r3.A01     // Catch:{ all -> 0x0d03 }
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r6.BSG()     // Catch:{ all -> 0x0d03 }
            java.lang.String r4 = r3.A00()     // Catch:{ all -> 0x0d03 }
            X.7FU r3 = r6.A00     // Catch:{ all -> 0x0d03 }
            X.2FW r3 = r3.Aqm()     // Catch:{ all -> 0x0d03 }
            com.instagram.model.direct.messageid.DirectMessageIdentifier r13 = new com.instagram.model.direct.messageid.DirectMessageIdentifier     // Catch:{ all -> 0x0d03 }
            r13.<init>(r3, r14, r4)     // Catch:{ all -> 0x0d03 }
            X.1Xj r4 = r6.A08     // Catch:{ all -> 0x0d03 }
            X.757 r21 = new X.757     // Catch:{ all -> 0x0d03 }
            r3 = r21
            r3.<init>(r1, r4, r13)     // Catch:{ all -> 0x0d03 }
            r3 = r20
            X.7GO r4 = r3.A02     // Catch:{ all -> 0x0d03 }
            r3 = r21
            r4.A02(r13, r3)     // Catch:{ all -> 0x0d03 }
            r3 = r20
            X.78C r3 = r3.A01     // Catch:{ all -> 0x0d03 }
            X.78B r3 = (X.AnonymousClass78B) r3     // Catch:{ all -> 0x0d03 }
            X.7L3 r3 = r3.A00     // Catch:{ all -> 0x0d03 }
            r22 = r3
            r3 = r20
            com.instagram.common.session.UserSession r3 = r3.A00     // Catch:{ all -> 0x0d03 }
            r4 = r3
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x0d03 }
            r19 = 2342159139545419770(0x20810554000a0ffa, double:4.062304729795623E-152)
            r15 = r3
            r14 = r4
            r3 = r19
            boolean r3 = X.182.A06(r15, r14, r3)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x033f
            r4 = r22
            r3 = r21
            r4.A02(r3, r13)     // Catch:{ all -> 0x0d03 }
        L_0x033f:
            r3 = r22
            X.Tol r3 = r3.A03     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x035b
            boolean r3 = r3.A0G()     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x035b
            r3 = r22
            X.Nhf r3 = r3.A01     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x035b
            com.instagram.model.direct.messageid.DirectMessageIdentifier r3 = r3.A02     // Catch:{ all -> 0x0d03 }
            boolean r3 = r13.A02(r3)     // Catch:{ all -> 0x0d03 }
            r24 = 1
            if (r3 != 0) goto L_0x0360
        L_0x035b:
            r24 = 0
            goto L_0x0360
        L_0x035e:
            r24 = 0
        L_0x0360:
            X.776 r7 = (X.AnonymousClass776) r7     // Catch:{ all -> 0x0d03 }
            com.instagram.model.mediasize.ImageInfo r13 = r8.A0O     // Catch:{ all -> 0x0d03 }
            int r4 = r6.A00     // Catch:{ all -> 0x0d03 }
            X.9HC r14 = r2.A04     // Catch:{ all -> 0x0d03 }
            r3 = 0
            if (r24 == 0) goto L_0x036c
            r3 = 4
        L_0x036c:
            r10.setVisibility(r3)     // Catch:{ all -> 0x0d03 }
            if (r13 == 0) goto L_0x0388
            X.0eM r3 = r14.A0z     // Catch:{ all -> 0x0d03 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0d03 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0388
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0d03 }
            com.instagram.model.mediasize.ExtendedImageUrl r4 = X.1iI.A05(r13, r3, r4)     // Catch:{ all -> 0x0d03 }
            if (r4 == 0) goto L_0x0388
            goto L_0x038a
        L_0x0388:
            com.instagram.common.typedurl.ImageUrl r4 = r7.A00     // Catch:{ all -> 0x0d03 }
        L_0x038a:
            java.lang.String r14 = r4.getUrl()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r14)     // Catch:{ all -> 0x0d03 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0d03 }
            r3.<init>(r14)     // Catch:{ all -> 0x0d03 }
            boolean r13 = r3.exists()     // Catch:{ all -> 0x0d03 }
            if (r13 == 0) goto L_0x0419
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.C253833rU.A01(r3)     // Catch:{ all -> 0x0d03 }
            r3 = r48
            r10.setUrl(r4, r3)     // Catch:{ all -> 0x0d03 }
        L_0x03a5:
            X.7FU r3 = r6.A00     // Catch:{ all -> 0x0d03 }
            X.2FW r23 = r3.Aqm()     // Catch:{ all -> 0x0d03 }
            X.2FW r4 = X.2FW.A20     // Catch:{ all -> 0x0d03 }
            r3 = r23
            if (r3 != r4) goto L_0x0407
            java.lang.String r3 = r8.A0X     // Catch:{ all -> 0x0d03 }
            r21 = r3
            if (r3 == 0) goto L_0x0407
            com.instagram.common.session.UserSession r3 = r2.A02     // Catch:{ all -> 0x0d03 }
            r22 = r3
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x0d03 }
            r19 = 36323689473846664(0x810c3400052d88, double:3.03458571479364E-306)
            r14 = r3
            r3 = r19
            r13 = r22
            boolean r3 = X.182.A06(r14, r13, r3)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0407
            r3 = r47
            r3.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            android.content.Context r4 = r47.getContext()     // Catch:{ all -> 0x0d03 }
            X.7FE r3 = r6.A02     // Catch:{ all -> 0x0d03 }
            X.3Us r3 = X.C3265577g.A01(r4, r3)     // Catch:{ all -> 0x0d03 }
            float[] r4 = r3.A01     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0d03 }
            r15 = r4[r0]     // Catch:{ all -> 0x0d03 }
            r3 = 2
            r14 = r4[r3]     // Catch:{ all -> 0x0d03 }
            r3 = 4
            r13 = r4[r3]     // Catch:{ all -> 0x0d03 }
            r3 = 6
            r19 = r4[r3]     // Catch:{ all -> 0x0d03 }
            r3 = r47
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r3 = r3.A00     // Catch:{ all -> 0x0d03 }
            r4 = r3
            r3 = r19
            r4.A01(r15, r14, r13, r3)     // Catch:{ all -> 0x0d03 }
            com.instagram.common.typedurl.ImageUrl r4 = r7.A00     // Catch:{ all -> 0x0d03 }
            r3 = r47
            r3.setPreviewUrl(r4)     // Catch:{ all -> 0x0d03 }
            X.6WO r14 = X.AnonymousClass6WO.DIRECT     // Catch:{ all -> 0x0d03 }
            r13 = r3
            r4 = r21
            r3 = r22
            r13.setUrl(r4, r3, r14)     // Catch:{ all -> 0x0d03 }
        L_0x0407:
            X.2FW r22 = X.2FW.A1p     // Catch:{ all -> 0x0d03 }
            r4 = r22
            r3 = r23
            if (r3 == r4) goto L_0x0458
            X.2FW r4 = X.2FW.A1v     // Catch:{ all -> 0x0d03 }
            if (r3 == r4) goto L_0x0458
            X.1Xj r4 = r6.A08     // Catch:{ all -> 0x0d03 }
            r3 = 0
            if (r4 == 0) goto L_0x0459
            goto L_0x0458
        L_0x0419:
            boolean r3 = android.webkit.URLUtil.isContentUrl(r14)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x042c
            boolean r3 = android.webkit.URLUtil.isFileUrl(r14)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x042c
        L_0x0425:
            r3 = r48
            r10.setUrl(r4, r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x03a5
        L_0x042c:
            X.MYd r4 = r2.A08     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = r4.A00(r14)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x043a
            com.instagram.common.typedurl.SimpleImageUrl r4 = new com.instagram.common.typedurl.SimpleImageUrl     // Catch:{ all -> 0x0d03 }
            r4.<init>(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0425
        L_0x043a:
            boolean r3 = r4.A02(r14)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x03a5
            r4.A01(r14)     // Catch:{ all -> 0x0d03 }
            r1.A00()     // Catch:{ all -> 0x0d03 }
            r13 = r12
            X.7Wn r13 = (X.C332827Wn) r13     // Catch:{ all -> 0x0d03 }
            X.P95 r4 = new X.P95     // Catch:{ all -> 0x0d03 }
            r3 = r48
            r4.<init>(r3, r1)     // Catch:{ all -> 0x0d03 }
            X.OKi r3 = r13.CgK(r4, r14)     // Catch:{ all -> 0x0d03 }
            r1.A01 = r3     // Catch:{ all -> 0x0d03 }
            goto L_0x03a5
        L_0x0458:
            r3 = 1
        L_0x0459:
            r21 = 8
            if (r3 == 0) goto L_0x0482
            if (r24 != 0) goto L_0x0482
            X.0eM r3 = r2.A0C     // Catch:{ all -> 0x0d03 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0d03 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0482
            X.9Iu r3 = r8.A03     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0492
            com.instagram.common.session.UserSession r3 = r2.A02     // Catch:{ all -> 0x0d03 }
            r15 = r3
            X.0Tu r13 = X.0Tu.A05     // Catch:{ all -> 0x0d03 }
            r3 = 36328731765194301(0x8110ca00013e3d, double:3.037774480145563E-306)
            r14 = r13
            boolean r3 = X.182.A06(r14, r15, r3)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0492
        L_0x0482:
            android.widget.ImageView r13 = r1.A05     // Catch:{ all -> 0x0d03 }
        L_0x0484:
            r3 = r21
            r13.setVisibility(r3)     // Catch:{ all -> 0x0d03 }
            java.lang.Integer r13 = r7.A03     // Catch:{ all -> 0x0d03 }
            X.76q r3 = r1.A0U     // Catch:{ all -> 0x0d03 }
            boolean r3 = r3.A05     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x0501
            goto L_0x04b6
        L_0x0492:
            android.widget.ImageView r13 = r1.A05     // Catch:{ all -> 0x0d03 }
            r3 = 2131238650(0x7f081efa, float:1.8093585E38)
            r13.setImageResource(r3)     // Catch:{ all -> 0x0d03 }
            X.0ob r3 = X.0ob.A03     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x04b3
            com.instagram.common.session.UserSession r3 = X.0ob.A00(r3)     // Catch:{ all -> 0x0d03 }
            X.0Tu r14 = X.0Tu.A05     // Catch:{ all -> 0x0d03 }
            r19 = 36610752202807423(0x8211490002187f, double:3.2161253404972536E-306)
            r15 = r3
            r3 = r19
            long r14 = X.182.A01(r14, r15, r3)     // Catch:{ all -> 0x0d03 }
            int r14 = (int) r14     // Catch:{ all -> 0x0d03 }
            if (r0 != r14) goto L_0x0484
        L_0x04b3:
            r21 = 0
            goto L_0x0484
        L_0x04b6:
            if (r13 == 0) goto L_0x04f5
            X.Jw0 r3 = r8.A09     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x04c6
            android.widget.ImageView r4 = r1.A06     // Catch:{ all -> 0x0d03 }
            int r3 = r13.intValue()     // Catch:{ all -> 0x0d03 }
            r4.setImageResource(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0501
        L_0x04c6:
            int r7 = r13.intValue()     // Catch:{ all -> 0x0d03 }
            X.0eM r4 = r2.A0B     // Catch:{ all -> 0x0d03 }
            java.lang.Object r3 = r4.getValue()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0d03 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0d03 }
            boolean r14 = r3.booleanValue()     // Catch:{ all -> 0x0d03 }
            r3 = r35
            if (r14 == 0) goto L_0x04df
            r3 = r34
        L_0x04df:
            r3.setImageResource(r7)     // Catch:{ all -> 0x0d03 }
            r3 = 0
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0d03 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0d03 }
            boolean r7 = r4.booleanValue()     // Catch:{ all -> 0x0d03 }
            r4 = r35
            if (r7 == 0) goto L_0x04fe
            goto L_0x04fc
        L_0x04f5:
            r3 = 8
            r4 = r35
            r4.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
        L_0x04fc:
            r4 = r34
        L_0x04fe:
            r4.setVisibility(r3)     // Catch:{ all -> 0x0d03 }
        L_0x0501:
            r4 = -2
            if (r13 == 0) goto L_0x050c
            int r3 = r13.intValue()     // Catch:{ all -> 0x0d03 }
            if (r3 != r4) goto L_0x050c
            r25 = 0
        L_0x050c:
            r4 = r33
            r3 = r25
            r4.A03(r3)     // Catch:{ all -> 0x0d03 }
            r4 = r22
            r3 = r23
            if (r3 != r4) goto L_0x05a6
            com.instagram.common.session.UserSession r13 = r2.A02     // Catch:{ all -> 0x0d03 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0d03 }
            r3 = 36318831867468271(0x8107c9001e19ef, double:3.0315137449599334E-306)
            boolean r3 = X.182.A06(r7, r13, r3)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x05a6
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r13)     // Catch:{ all -> 0x0d03 }
            X.7MP r3 = new X.7MP     // Catch:{ all -> 0x0d03 }
            r3.<init>()     // Catch:{ all -> 0x0d03 }
            r4.A00(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x05a6
        L_0x0535:
            boolean r3 = r7 instanceof X.C68851NZj     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x053c
            if (r13 == 0) goto L_0x058c
            goto L_0x0589
        L_0x053c:
            boolean r3 = r7 instanceof X.C68849NZh     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0560
            if (r13 == 0) goto L_0x0545
            r13.A00(r14)     // Catch:{ all -> 0x0d03 }
        L_0x0545:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r10.getIgImageView()     // Catch:{ all -> 0x0d03 }
            r3 = r29
            X.77D r3 = X.C3265577g.A05(r4, r3)     // Catch:{ all -> 0x0d03 }
            r4.setImageRendererAndReset(r3)     // Catch:{ all -> 0x0d03 }
            r10.A04()     // Catch:{ all -> 0x0d03 }
            r10.setEnableProgressBar(r0)     // Catch:{ all -> 0x0d03 }
            X.NZh r7 = (X.C68849NZh) r7     // Catch:{ all -> 0x0d03 }
            int r3 = r7.A00     // Catch:{ all -> 0x0d03 }
            r10.setBackgroundColor(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x058f
        L_0x0560:
            boolean r3 = r7 instanceof X.C68850NZi     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0577
            if (r13 == 0) goto L_0x0570
            X.02m r7 = r13.A00     // Catch:{ all -> 0x0d03 }
            r4 = 20134579(0x1333ab3, float:3.2919222E-38)
            java.lang.String r3 = "loading"
            r7.markerPoint(r4, r14, r3)     // Catch:{ all -> 0x0d03 }
        L_0x0570:
            r10.A04()     // Catch:{ all -> 0x0d03 }
            r10.setEnableProgressBar(r9)     // Catch:{ all -> 0x0d03 }
            goto L_0x058f
        L_0x0577:
            if (r7 != 0) goto L_0x0cd5
            if (r13 == 0) goto L_0x05a6
            X.02m r7 = r13.A00     // Catch:{ all -> 0x0d03 }
            r4 = 20134579(0x1333ab3, float:3.2919222E-38)
            java.lang.String r3 = "empty"
            r7.markerPoint(r4, r14, r3)     // Catch:{ all -> 0x0d03 }
            r13.A00(r14)     // Catch:{ all -> 0x0d03 }
            goto L_0x05a6
        L_0x0589:
            r13.A00(r14)     // Catch:{ all -> 0x0d03 }
        L_0x058c:
            r10.setEnableProgressBar(r0)     // Catch:{ all -> 0x0d03 }
        L_0x058f:
            r10.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            r3 = r45
            r3.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            r3 = r35
            r3.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            r3 = r34
            r3.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            r3 = r33
            r3.A03(r5)     // Catch:{ all -> 0x0d03 }
        L_0x05a6:
            java.lang.String r13 = r6.A09     // Catch:{ all -> 0x0d03 }
            int r7 = r6.A00     // Catch:{ all -> 0x0d03 }
            android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()     // Catch:{ all -> 0x0d03 }
            java.lang.String r4 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r14, r4)     // Catch:{ all -> 0x0d03 }
            X.2dQ r14 = (X.C71492dQ) r14     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = r14.A0z     // Catch:{ all -> 0x0d03 }
            boolean r3 = X.0qQ.A0K(r13, r3)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x05c1
            int r3 = r14.width     // Catch:{ all -> 0x0d03 }
            if (r7 == r3) goto L_0x05e3
        L_0x05c1:
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A0C(r3, r4)     // Catch:{ all -> 0x0d03 }
            X.2dQ r3 = (X.C71492dQ) r3     // Catch:{ all -> 0x0d03 }
            r3.A0z = r13     // Catch:{ all -> 0x0d03 }
            android.view.ViewGroup$LayoutParams r3 = r46.getLayoutParams()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A0C(r3, r4)     // Catch:{ all -> 0x0d03 }
            X.2dQ r3 = (X.C71492dQ) r3     // Catch:{ all -> 0x0d03 }
            r3.A0z = r13     // Catch:{ all -> 0x0d03 }
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = r46
            r3.A00 = r4     // Catch:{ all -> 0x0d03 }
            X.0nA.A0f(r10, r7)     // Catch:{ all -> 0x0d03 }
            X.0nA.A0f(r3, r7)     // Catch:{ all -> 0x0d03 }
        L_0x05e3:
            r4 = 17
            X.9Lz r3 = new X.9Lz     // Catch:{ all -> 0x0d03 }
            r3.<init>(r4, r6, r1)     // Catch:{ all -> 0x0d03 }
            X.0t0 r26 = X.AnonymousClass0eN.A01(r3)     // Catch:{ all -> 0x0d03 }
            com.instagram.common.session.UserSession r3 = r2.A02     // Catch:{ all -> 0x0d03 }
            r28 = r3
            android.view.View r3 = r1.itemView     // Catch:{ all -> 0x0d03 }
            android.content.Context r20 = r3.getContext()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r20)     // Catch:{ all -> 0x0d03 }
            X.3oV r3 = r1.A0S     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.widget.imageview.IgImageView r23 = r10.getIgImageView()     // Catch:{ all -> 0x0d03 }
            r27 = 192(0xc0, float:2.69E-43)
            X.759 r4 = new X.759     // Catch:{ all -> 0x0d03 }
            r19 = r4
            r21 = r10
            r22 = r28
            r24 = r16
            r25 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d03 }
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r13 = r6.A07     // Catch:{ all -> 0x0d03 }
            if (r13 == 0) goto L_0x066e
            r3 = r46
            r3.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            r7 = 10
            X.Inz r3 = new X.Inz     // Catch:{ all -> 0x0d03 }
            r3.<init>(r7, r6, r2, r13)     // Catch:{ all -> 0x0d03 }
            r4.A04(r13, r3, r9)     // Catch:{ all -> 0x0d03 }
        L_0x0625:
            boolean r3 = r6.A0A     // Catch:{ all -> 0x0d03 }
            r21 = r3
            if (r3 == 0) goto L_0x0672
            r13 = r12
            X.7Y5 r13 = (X.AnonymousClass7Y5) r13     // Catch:{ all -> 0x0d03 }
            X.7FU r3 = r6.A00     // Catch:{ all -> 0x0d03 }
            boolean r14 = r3.CU2()     // Catch:{ all -> 0x0d03 }
            X.0eM r3 = r1.A0c     // Catch:{ all -> 0x0d03 }
            java.lang.Object r7 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            X.A6l r7 = (X.C39720A6l) r7     // Catch:{ all -> 0x0d03 }
            android.view.View r4 = r7.A00     // Catch:{ all -> 0x0d03 }
            r4.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            X.DEY r3 = X.DEY.A00     // Catch:{ all -> 0x0d03 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r4 = r7.A03     // Catch:{ all -> 0x0d03 }
            X.AMq r3 = new X.AMq     // Catch:{ all -> 0x0d03 }
            r3.<init>(r13)     // Catch:{ all -> 0x0d03 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x0d03 }
            android.widget.LinearLayout r4 = r7.A01     // Catch:{ all -> 0x0d03 }
            if (r14 == 0) goto L_0x0663
            r3 = 8388629(0x800015, float:1.1754973E-38)
            r4.setGravity(r3)     // Catch:{ all -> 0x0d03 }
            android.widget.TextView r4 = r7.A02     // Catch:{ all -> 0x0d03 }
            r3 = 8388613(0x800005, float:1.175495E-38)
        L_0x065f:
            r4.setGravity(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0672
        L_0x0663:
            r3 = 16
            r4.setGravity(r3)     // Catch:{ all -> 0x0d03 }
            android.widget.TextView r4 = r7.A02     // Catch:{ all -> 0x0d03 }
            r3 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x065f
        L_0x066e:
            r4.A02()     // Catch:{ all -> 0x0d03 }
            goto L_0x0625
        L_0x0672:
            if (r11 == 0) goto L_0x06d7
            X.N2n r13 = r11.A00     // Catch:{ all -> 0x0d03 }
            if (r13 == 0) goto L_0x06d7
            android.view.View r11 = r40.A01()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x0d03 }
            android.widget.TextView r11 = (android.widget.TextView) r11     // Catch:{ all -> 0x0d03 }
            r3 = 2131959730(0x7f131fb2, float:1.9556109E38)
            r11.setText(r3)     // Catch:{ all -> 0x0d03 }
            r7 = r12
            X.7Y5 r7 = (X.AnonymousClass7Y5) r7     // Catch:{ all -> 0x0d03 }
            android.content.Context r4 = r11.getContext()     // Catch:{ all -> 0x0d03 }
            r3 = r29
            X.3Us r3 = X.C3265577g.A01(r4, r3)     // Catch:{ all -> 0x0d03 }
            float[] r14 = r3.A01     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r14)     // Catch:{ all -> 0x0d03 }
            android.graphics.drawable.Drawable r4 = r11.getBackground()     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"
            X.0qQ.A0C(r4, r3)     // Catch:{ all -> 0x0d03 }
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4     // Catch:{ all -> 0x0d03 }
            float[] r3 = new float[r5]     // Catch:{ all -> 0x0d03 }
            r19 = 0
            r3[r0] = r19     // Catch:{ all -> 0x0d03 }
            r3[r9] = r19     // Catch:{ all -> 0x0d03 }
            r15 = 2
            r3[r15] = r19     // Catch:{ all -> 0x0d03 }
            r15 = 3
            r3[r15] = r19     // Catch:{ all -> 0x0d03 }
            r19 = 4
            r15 = r14[r19]     // Catch:{ all -> 0x0d03 }
            r3[r19] = r15     // Catch:{ all -> 0x0d03 }
            r19 = 5
            r15 = r14[r19]     // Catch:{ all -> 0x0d03 }
            r3[r19] = r15     // Catch:{ all -> 0x0d03 }
            r19 = 6
            r15 = r14[r19]     // Catch:{ all -> 0x0d03 }
            r3[r19] = r15     // Catch:{ all -> 0x0d03 }
            r15 = 7
            r14 = r14[r15]     // Catch:{ all -> 0x0d03 }
            r3[r15] = r14     // Catch:{ all -> 0x0d03 }
            r4.setCornerRadii(r3)     // Catch:{ all -> 0x0d03 }
            r11.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            X.OiM r3 = new X.OiM     // Catch:{ all -> 0x0d03 }
            r3.<init>(r7, r13)     // Catch:{ all -> 0x0d03 }
            X.AnonymousClass0fU.A00(r3, r11)     // Catch:{ all -> 0x0d03 }
        L_0x06d7:
            X.75J r7 = r6.A05     // Catch:{ all -> 0x0d03 }
            if (r7 == 0) goto L_0x0710
            boolean r3 = r7 instanceof X.AnonymousClass75I     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0754
            r3 = r42
            r3.A03(r0)     // Catch:{ all -> 0x0d03 }
            android.view.View r13 = r42.A01()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r13)     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.widget.imageview.IgImageView r13 = (com.instagram.common.ui.widget.imageview.IgImageView) r13     // Catch:{ all -> 0x0d03 }
            r3 = r7
            X.75I r3 = (X.AnonymousClass75I) r3     // Catch:{ all -> 0x0d03 }
            com.instagram.common.typedurl.ImageUrl r3 = r3.A00     // Catch:{ all -> 0x0d03 }
            java.lang.String r11 = r3.getUrl()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x0d03 }
            boolean r3 = X.C66834MdS.A08(r11)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x071e
            r1.A00()     // Catch:{ all -> 0x0d03 }
            r4 = r12
            X.7X5 r4 = (X.AnonymousClass7X5) r4     // Catch:{ all -> 0x0d03 }
            X.P90 r3 = new X.P90     // Catch:{ all -> 0x0d03 }
            r3.<init>(r13, r2, r1)     // Catch:{ all -> 0x0d03 }
            X.O6r r3 = r4.Cg8(r3, r11)     // Catch:{ all -> 0x0d03 }
            r1.A00 = r3     // Catch:{ all -> 0x0d03 }
        L_0x0710:
            X.774 r11 = r8.A0E     // Catch:{ all -> 0x0d03 }
            int r3 = r8.A02     // Catch:{ all -> 0x0d03 }
            r22 = r3
            int r3 = r10.getVisibility()     // Catch:{ all -> 0x0d03 }
            if (r3 == r5) goto L_0x0811
            goto L_0x07f9
        L_0x071e:
            boolean r3 = android.webkit.URLUtil.isContentUrl(r11)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x0732
            boolean r3 = android.webkit.URLUtil.isFileUrl(r11)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x0732
            android.graphics.drawable.Drawable r3 = A00(r2, r11)     // Catch:{ all -> 0x0d03 }
        L_0x072e:
            r13.setImageDrawable(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0710
        L_0x0732:
            X.MYd r4 = r2.A08     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = r4.A00(r11)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x073f
            android.graphics.drawable.Drawable r3 = A00(r2, r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x072e
        L_0x073f:
            boolean r3 = r4.A02(r11)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x0710
            r4.A01(r11)     // Catch:{ all -> 0x0d03 }
            r4 = r12
            X.7Wn r4 = (X.C332827Wn) r4     // Catch:{ all -> 0x0d03 }
            X.P98 r3 = new X.P98     // Catch:{ all -> 0x0d03 }
            r3.<init>(r13, r2)     // Catch:{ all -> 0x0d03 }
            r4.CgK(r3, r11)     // Catch:{ all -> 0x0d03 }
            goto L_0x0710
        L_0x0754:
            boolean r3 = r7 instanceof X.AnonymousClass75K     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x076e
            r3 = r43
            r3.A03(r0)     // Catch:{ all -> 0x0d03 }
            android.view.View r11 = r43.A01()     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.widget.imageview.IgImageView r11 = (com.instagram.common.ui.widget.imageview.IgImageView) r11     // Catch:{ all -> 0x0d03 }
            r3 = r7
            X.75K r3 = (X.AnonymousClass75K) r3     // Catch:{ all -> 0x0d03 }
            com.instagram.common.typedurl.ImageUrl r4 = r3.A00     // Catch:{ all -> 0x0d03 }
            r3 = r48
            r11.setUrl(r4, r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0710
        L_0x076e:
            boolean r3 = r7 instanceof X.AnonymousClass75L     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0ccd
            r3 = r41
            r3.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            android.view.View r13 = r41.getView()     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.widget.imageview.IgImageView r13 = (com.instagram.common.ui.widget.imageview.IgImageView) r13     // Catch:{ all -> 0x0d03 }
            r3 = r7
            X.75L r3 = (X.AnonymousClass75L) r3     // Catch:{ all -> 0x0d03 }
            com.instagram.common.typedurl.ImageUrl r4 = r3.A00     // Catch:{ all -> 0x0d03 }
            java.lang.String r11 = r4.getUrl()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x0d03 }
            boolean r3 = android.webkit.URLUtil.isContentUrl(r11)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x07d6
            boolean r3 = android.webkit.URLUtil.isFileUrl(r11)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x07d6
        L_0x0795:
            r3 = r48
            r13.setUrl(r4, r3)     // Catch:{ all -> 0x0d03 }
        L_0x079a:
            X.77B r4 = r6.A01     // Catch:{ all -> 0x0d03 }
            if (r4 == 0) goto L_0x07b2
            X.OkR r3 = new X.OkR     // Catch:{ all -> 0x0d03 }
            r22 = r3
            r23 = r13
            r24 = r4
            r25 = r2
            r26 = r6
            r27 = r1
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d03 }
            r13.setOnTouchListener(r3)     // Catch:{ all -> 0x0d03 }
        L_0x07b2:
            X.4kA r11 = r12.AxJ()     // Catch:{ all -> 0x0d03 }
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r6.BSG()     // Catch:{ all -> 0x0d03 }
            java.lang.String r14 = r3.A01     // Catch:{ all -> 0x0d03 }
            X.7FU r3 = r6.A00     // Catch:{ all -> 0x0d03 }
            long r3 = r3.BSP()     // Catch:{ all -> 0x0d03 }
            X.0xa r11 = r11.A00     // Catch:{ all -> 0x0d03 }
            X.0xY r13 = r11.AR4()     // Catch:{ all -> 0x0d03 }
            java.lang.String r11 = "direct_reel_share_last_seen_timestamp_"
            java.lang.String r11 = X.002.A0R(r11, r14)     // Catch:{ all -> 0x0d03 }
            r13.E5c(r11, r3)     // Catch:{ all -> 0x0d03 }
            r13.apply()     // Catch:{ all -> 0x0d03 }
            goto L_0x0710
        L_0x07d6:
            X.MYd r4 = r2.A08     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = r4.A00(r11)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x07e4
            com.instagram.common.typedurl.SimpleImageUrl r4 = new com.instagram.common.typedurl.SimpleImageUrl     // Catch:{ all -> 0x0d03 }
            r4.<init>(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0795
        L_0x07e4:
            boolean r3 = r4.A02(r11)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x079a
            r4.A01(r11)     // Catch:{ all -> 0x0d03 }
            r4 = r12
            X.7Wn r4 = (X.C332827Wn) r4     // Catch:{ all -> 0x0d03 }
            X.P97 r3 = new X.P97     // Catch:{ all -> 0x0d03 }
            r3.<init>(r13, r2)     // Catch:{ all -> 0x0d03 }
            r4.CgK(r3, r11)     // Catch:{ all -> 0x0d03 }
            goto L_0x079a
        L_0x07f9:
            if (r11 == 0) goto L_0x0811
            java.util.List r3 = r11.A0A     // Catch:{ all -> 0x0d03 }
            r19 = r3
            if (r3 != 0) goto L_0x081f
            java.lang.CharSequence r3 = r11.A03     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0811
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0811
            int r3 = r3.length()     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x081f
        L_0x0811:
            X.Jw0 r4 = r8.A09     // Catch:{ all -> 0x0d03 }
            if (r4 != 0) goto L_0x09c0
            X.74T r13 = r8.A0D     // Catch:{ all -> 0x0d03 }
            r20 = 8
            r11 = 8
            if (r13 == 0) goto L_0x096b
            goto L_0x096a
        L_0x081f:
            X.0eM r3 = r1.A0a     // Catch:{ all -> 0x0d03 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            X.75H r4 = (X.AnonymousClass75H) r4     // Catch:{ all -> 0x0d03 }
            android.view.View r3 = r4.A00     // Catch:{ all -> 0x0d03 }
            r3.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            if (r19 == 0) goto L_0x08ab
            boolean r3 = r19.isEmpty()     // Catch:{ all -> 0x0d03 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x089a
            com.instagram.common.ui.widget.imageview.CircularImageView r14 = r4.A03     // Catch:{ all -> 0x0d03 }
            java.lang.Object r15 = X.00k.A0I(r19)     // Catch:{ all -> 0x0d03 }
            com.instagram.common.typedurl.ImageUrl r15 = (com.instagram.common.typedurl.ImageUrl) r15     // Catch:{ all -> 0x0d03 }
            java.lang.String r13 = r15.getUrl()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r13)     // Catch:{ all -> 0x0d03 }
            boolean r3 = android.webkit.URLUtil.isContentUrl(r13)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x08c9
            boolean r3 = android.webkit.URLUtil.isFileUrl(r13)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x08c9
        L_0x0851:
            r3 = r48
            r14.setUrl(r15, r3)     // Catch:{ all -> 0x0d03 }
        L_0x0856:
            X.0eM r3 = r2.A0B     // Catch:{ all -> 0x0d03 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0d03 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0d03 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x089a
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r13, r3)     // Catch:{ all -> 0x0d03 }
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13     // Catch:{ all -> 0x0d03 }
            android.content.res.Resources r3 = r49.getResources()     // Catch:{ all -> 0x0d03 }
            r15 = 2131165203(0x7f070013, float:1.7944616E38)
            int r3 = r3.getDimensionPixelSize(r15)     // Catch:{ all -> 0x0d03 }
            r13.width = r3     // Catch:{ all -> 0x0d03 }
            android.content.res.Resources r3 = r49.getResources()     // Catch:{ all -> 0x0d03 }
            int r3 = r3.getDimensionPixelSize(r15)     // Catch:{ all -> 0x0d03 }
            r13.height = r3     // Catch:{ all -> 0x0d03 }
            android.content.res.Resources r15 = r49.getResources()     // Catch:{ all -> 0x0d03 }
            r3 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r3 = r15.getDimensionPixelSize(r3)     // Catch:{ all -> 0x0d03 }
            r13.setMarginEnd(r3)     // Catch:{ all -> 0x0d03 }
            r14.setLayoutParams(r13)     // Catch:{ all -> 0x0d03 }
        L_0x089a:
            int r3 = r19.size()     // Catch:{ all -> 0x0d03 }
            if (r3 <= r9) goto L_0x08ab
            java.lang.String r13 = "PortraitXmaContentDefinition"
            r3 = 571(0x23b, float:8.0E-43)
            java.lang.String r3 = X.C66579MXk.A00(r3)     // Catch:{ all -> 0x0d03 }
            X.0wb.A03(r13, r3)     // Catch:{ all -> 0x0d03 }
        L_0x08ab:
            android.widget.TextView r14 = r4.A02     // Catch:{ all -> 0x0d03 }
            java.lang.CharSequence r3 = r11.A03     // Catch:{ all -> 0x0d03 }
            r14.setText(r3)     // Catch:{ all -> 0x0d03 }
            java.lang.CharSequence r3 = r14.getText()     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x090a
            android.content.res.Resources r13 = r49.getResources()     // Catch:{ all -> 0x0d03 }
            r3 = 2131165190(0x7f070006, float:1.794459E38)
            int r19 = r13.getDimensionPixelSize(r3)     // Catch:{ all -> 0x0d03 }
            r13 = 1
            r3 = r22
            if (r3 == r9) goto L_0x08f8
            goto L_0x08f4
        L_0x08c9:
            X.MYd r15 = r2.A08     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = r15.A00(r13)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x08d8
            com.instagram.common.typedurl.SimpleImageUrl r15 = new com.instagram.common.typedurl.SimpleImageUrl     // Catch:{ all -> 0x0d03 }
            r15.<init>(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0851
        L_0x08d8:
            boolean r3 = r15.A02(r13)     // Catch:{ all -> 0x0d03 }
            if (r3 != 0) goto L_0x0856
            r15.A01(r13)     // Catch:{ all -> 0x0d03 }
            r3 = r12
            X.7Wn r3 = (X.C332827Wn) r3     // Catch:{ all -> 0x0d03 }
            r20 = r3
            X.P96 r15 = new X.P96     // Catch:{ all -> 0x0d03 }
            r3 = r48
            r15.<init>(r3, r14)     // Catch:{ all -> 0x0d03 }
            r3 = r20
            r3.CgK(r15, r13)     // Catch:{ all -> 0x0d03 }
            goto L_0x0856
        L_0x08f4:
            r15 = 3
            if (r3 == r15) goto L_0x08f8
            r13 = 0
        L_0x08f8:
            r15 = 2130970240(0x7f040680, float:1.7549185E38)
            r3 = r49
            int r15 = X.2Yu.A0H(r3, r15)     // Catch:{ all -> 0x0d03 }
            int r15 = r3.getColor(r15)     // Catch:{ all -> 0x0d03 }
            r3 = r19
            X.C244273av.A09(r14, r0, r3, r15, r13)     // Catch:{ all -> 0x0d03 }
        L_0x090a:
            android.widget.TextView r4 = r4.A01     // Catch:{ all -> 0x0d03 }
            java.lang.CharSequence r11 = r11.A02     // Catch:{ all -> 0x0d03 }
            r3 = 8
            if (r11 == 0) goto L_0x0913
            r3 = 0
        L_0x0913:
            r4.setVisibility(r3)     // Catch:{ all -> 0x0d03 }
            r4.setText(r11)     // Catch:{ all -> 0x0d03 }
            android.view.View r3 = r36.A01()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0d03 }
            r3.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            android.graphics.drawable.Drawable r4 = r3.getBackground()     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"
            X.0qQ.A0C(r4, r3)     // Catch:{ all -> 0x0d03 }
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4     // Catch:{ all -> 0x0d03 }
            r4.mutate()     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r10.getIgImageView()     // Catch:{ all -> 0x0d03 }
            android.content.Context r11 = r3.getContext()     // Catch:{ all -> 0x0d03 }
            r3 = r29
            X.3Us r3 = X.C3265577g.A01(r11, r3)     // Catch:{ all -> 0x0d03 }
            float[] r3 = r3.A01     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0d03 }
            float[] r11 = new float[r5]     // Catch:{ all -> 0x0d03 }
            r13 = r3[r0]     // Catch:{ all -> 0x0d03 }
            r11[r0] = r13     // Catch:{ all -> 0x0d03 }
            r13 = r3[r9]     // Catch:{ all -> 0x0d03 }
            r11[r9] = r13     // Catch:{ all -> 0x0d03 }
            r14 = 2
            r13 = r3[r14]     // Catch:{ all -> 0x0d03 }
            r11[r14] = r13     // Catch:{ all -> 0x0d03 }
            r13 = 3
            r3 = r3[r13]     // Catch:{ all -> 0x0d03 }
            r11[r13] = r3     // Catch:{ all -> 0x0d03 }
            r3 = 4
            r13 = 0
            r11[r3] = r13     // Catch:{ all -> 0x0d03 }
            r3 = 5
            r11[r3] = r13     // Catch:{ all -> 0x0d03 }
            r3 = 6
            r11[r3] = r13     // Catch:{ all -> 0x0d03 }
            r3 = 7
            r11[r3] = r13     // Catch:{ all -> 0x0d03 }
            r4.setCornerRadii(r11)     // Catch:{ all -> 0x0d03 }
            goto L_0x0811
        L_0x096a:
            r11 = 0
        L_0x096b:
            r3 = r32
            r3.A03(r11)     // Catch:{ all -> 0x0d03 }
            if (r13 == 0) goto L_0x09c0
            X.0eM r3 = r1.A0Z     // Catch:{ all -> 0x0d03 }
            java.lang.Object r11 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            X.A6H r11 = (X.A6H) r11     // Catch:{ all -> 0x0d03 }
            com.instagram.common.typedurl.ImageUrl r14 = r13.A01     // Catch:{ all -> 0x0d03 }
            if (r14 == 0) goto L_0x0985
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r15 = r11.A02     // Catch:{ all -> 0x0d03 }
            r3 = r48
            r15.setUrl(r14, r3)     // Catch:{ all -> 0x0d03 }
        L_0x0985:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r15 = r11.A02     // Catch:{ all -> 0x0d03 }
            r3 = 8
            if (r14 == 0) goto L_0x098c
            r3 = 0
        L_0x098c:
            r15.setVisibility(r3)     // Catch:{ all -> 0x0d03 }
            android.widget.TextView r15 = r11.A01     // Catch:{ all -> 0x0d03 }
            java.lang.CharSequence r3 = r13.A09     // Catch:{ all -> 0x0d03 }
            r15.setText(r3)     // Catch:{ all -> 0x0d03 }
            r14 = 1
            if (r3 == 0) goto L_0x09a0
            int r19 = r3.length()     // Catch:{ all -> 0x0d03 }
            r3 = 0
            if (r19 != 0) goto L_0x09a2
        L_0x09a0:
            r3 = 8
        L_0x09a2:
            r15.setVisibility(r3)     // Catch:{ all -> 0x0d03 }
            android.widget.TextView r11 = r11.A00     // Catch:{ all -> 0x0d03 }
            java.lang.CharSequence r3 = r13.A05     // Catch:{ all -> 0x0d03 }
            r11.setText(r3)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x09b0
            r20 = 0
        L_0x09b0:
            r3 = r20
            r11.setVisibility(r3)     // Catch:{ all -> 0x0d03 }
            java.lang.Integer r3 = r13.A0A     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x09bd
            int r14 = r3.intValue()     // Catch:{ all -> 0x0d03 }
        L_0x09bd:
            r11.setMaxLines(r14)     // Catch:{ all -> 0x0d03 }
        L_0x09c0:
            X.7Ws r12 = (X.AnonymousClass7Ws) r12     // Catch:{ all -> 0x0d03 }
            java.util.List r14 = r8.A0b     // Catch:{ all -> 0x0d03 }
            if (r14 == 0) goto L_0x09cf
            boolean r3 = r14.isEmpty()     // Catch:{ all -> 0x0d03 }
            if (r3 == r9) goto L_0x09cf
            if (r4 != 0) goto L_0x09d1
            goto L_0x0a37
        L_0x09cf:
            if (r4 == 0) goto L_0x0a91
        L_0x09d1:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r1.A0A     // Catch:{ all -> 0x0d03 }
            r3.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            android.widget.TextView r5 = r1.A09     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = r4.A04     // Catch:{ all -> 0x0d03 }
            r5.setText(r3)     // Catch:{ all -> 0x0d03 }
            android.widget.TextView r5 = r1.A08     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = r4.A02     // Catch:{ all -> 0x0d03 }
            r5.setText(r3)     // Catch:{ all -> 0x0d03 }
            r3 = r39
            r3.A03(r0)     // Catch:{ all -> 0x0d03 }
            java.lang.Object r5 = r4.A00     // Catch:{ all -> 0x0d03 }
            X.9JN r5 = (X.AnonymousClass9JN) r5     // Catch:{ all -> 0x0d03 }
            if (r5 == 0) goto L_0x0a91
            android.view.View r4 = r37.A01()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0d03 }
            com.instagram.igds.components.button.IgdsButton r4 = (com.instagram.igds.components.button.IgdsButton) r4     // Catch:{ all -> 0x0d03 }
            r9 = 2131960232(0x7f1321a8, float:1.9557127E38)
            r3 = r49
            java.lang.String r3 = r3.getString(r9)     // Catch:{ all -> 0x0d03 }
            r4.setText((java.lang.String) r3)     // Catch:{ all -> 0x0d03 }
            X.4lo r3 = X.C273014lo.PRIMARY_ON_COLOR     // Catch:{ all -> 0x0d03 }
            r4.setStyle(r3)     // Catch:{ all -> 0x0d03 }
            X.Oik r3 = new X.Oik     // Catch:{ all -> 0x0d03 }
            r3.<init>(r5, r8, r2)     // Catch:{ all -> 0x0d03 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x0d03 }
            r4.setVisibility(r0)     // Catch:{ all -> 0x0d03 }
            X.2el r5 = X.AnonymousClass2hM.A00(r4)     // Catch:{ all -> 0x0d03 }
            com.instagram.model.direct.messageid.DirectMessageIdentifier r3 = r8.A0L     // Catch:{ all -> 0x0d03 }
            java.lang.String r11 = r3.A02     // Catch:{ all -> 0x0d03 }
            X.30Y r3 = X.AnonymousClass30Y.A07     // Catch:{ all -> 0x0d03 }
            X.30a r9 = new X.30a     // Catch:{ all -> 0x0d03 }
            r3 = r48
            r9.<init>(r11, r3, r11)     // Catch:{ all -> 0x0d03 }
            X.Oza r3 = new X.Oza     // Catch:{ all -> 0x0d03 }
            r3.<init>(r8, r2)     // Catch:{ all -> 0x0d03 }
            r9.A00(r3)     // Catch:{ all -> 0x0d03 }
            X.30Y r3 = r9.A01()     // Catch:{ all -> 0x0d03 }
            if (r5 == 0) goto L_0x0a91
            r5.A05(r4, r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0a91
        L_0x0a37:
            r3 = r39
            r3.A03(r0)     // Catch:{ all -> 0x0d03 }
            r3 = r34
            r3.setVisibility(r5)     // Catch:{ all -> 0x0d03 }
            r13 = 2
            int r3 = r14.size()     // Catch:{ all -> 0x0d03 }
            if (r3 != r13) goto L_0x0ab4
            java.lang.Object r3 = X.00k.A0I(r14)     // Catch:{ all -> 0x0d03 }
            X.9JN r3 = (X.AnonymousClass9JN) r3     // Catch:{ all -> 0x0d03 }
            java.lang.String r4 = r3.A06     // Catch:{ all -> 0x0d03 }
            if (r4 == 0) goto L_0x0ab4
            java.lang.String r3 = "collab_action"
            boolean r3 = X.00l.A0d(r4, r3, r0)     // Catch:{ all -> 0x0d03 }
            if (r3 != r9) goto L_0x0ab4
            X.0Tu r11 = X.0Tu.A05     // Catch:{ all -> 0x0d03 }
            r3 = 36324522697240708(0x810cf600013084, double:3.035112648623155E-306)
            r5 = r28
            boolean r3 = X.182.A06(r11, r5, r3)     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0ab4
            java.lang.Object r4 = X.00k.A0J(r14)     // Catch:{ all -> 0x0d03 }
            X.9JN r4 = (X.AnonymousClass9JN) r4     // Catch:{ all -> 0x0d03 }
            if (r4 == 0) goto L_0x0a7d
            android.view.View r3 = r38.A01()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0d03 }
            com.instagram.igds.components.button.IgdsButton r3 = (com.instagram.igds.components.button.IgdsButton) r3     // Catch:{ all -> 0x0d03 }
            A01(r4, r12, r8, r1, r3)     // Catch:{ all -> 0x0d03 }
        L_0x0a7d:
            java.lang.Object r4 = r14.get(r9)     // Catch:{ all -> 0x0d03 }
            X.9JN r4 = (X.AnonymousClass9JN) r4     // Catch:{ all -> 0x0d03 }
            if (r4 == 0) goto L_0x0a91
            android.view.View r3 = r37.A01()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0d03 }
            com.instagram.igds.components.button.IgdsButton r3 = (com.instagram.igds.components.button.IgdsButton) r3     // Catch:{ all -> 0x0d03 }
            A01(r4, r12, r8, r1, r3)     // Catch:{ all -> 0x0d03 }
        L_0x0a91:
            X.4gb r9 = new X.4gb     // Catch:{ all -> 0x0d03 }
            r9.<init>()     // Catch:{ all -> 0x0d03 }
            r3 = r45
            r9.A0I(r3)     // Catch:{ all -> 0x0d03 }
            int r12 = r10.getId()     // Catch:{ all -> 0x0d03 }
            int r4 = r46.getId()     // Catch:{ all -> 0x0d03 }
            boolean r3 = r7 instanceof X.AnonymousClass75I     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0ae7
            android.view.View r3 = r42.A01()     // Catch:{ all -> 0x0d03 }
            int r3 = r3.getId()     // Catch:{ all -> 0x0d03 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0b0b
        L_0x0ab4:
            java.lang.Object r4 = r14.get(r0)     // Catch:{ all -> 0x0d03 }
            X.9JN r4 = (X.AnonymousClass9JN) r4     // Catch:{ all -> 0x0d03 }
            int r3 = r14.size()     // Catch:{ all -> 0x0d03 }
            if (r3 != r13) goto L_0x0ad8
            java.lang.Object r3 = X.00k.A0I(r14)     // Catch:{ all -> 0x0d03 }
            X.9JN r3 = (X.AnonymousClass9JN) r3     // Catch:{ all -> 0x0d03 }
            java.lang.String r5 = r3.A06     // Catch:{ all -> 0x0d03 }
            if (r5 == 0) goto L_0x0ad8
            java.lang.String r3 = "collab_action"
            boolean r3 = X.00l.A0d(r5, r3, r0)     // Catch:{ all -> 0x0d03 }
            if (r3 != r9) goto L_0x0ad8
            java.lang.Object r4 = r14.get(r9)     // Catch:{ all -> 0x0d03 }
            X.9JN r4 = (X.AnonymousClass9JN) r4     // Catch:{ all -> 0x0d03 }
        L_0x0ad8:
            if (r4 == 0) goto L_0x0a91
            android.view.View r3 = r37.A01()     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0d03 }
            com.instagram.igds.components.button.IgdsButton r3 = (com.instagram.igds.components.button.IgdsButton) r3     // Catch:{ all -> 0x0d03 }
            A01(r4, r12, r8, r1, r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0a91
        L_0x0ae7:
            boolean r3 = r7 instanceof X.AnonymousClass75K     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0af8
            android.view.View r3 = r43.A01()     // Catch:{ all -> 0x0d03 }
            int r3 = r3.getId()     // Catch:{ all -> 0x0d03 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0b0b
        L_0x0af8:
            boolean r3 = r7 instanceof X.AnonymousClass75L     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0b09
            android.view.View r3 = r41.getView()     // Catch:{ all -> 0x0d03 }
            int r3 = r3.getId()     // Catch:{ all -> 0x0d03 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d03 }
            goto L_0x0b0b
        L_0x0b09:
            r7 = r16
        L_0x0b0b:
            if (r21 == 0) goto L_0x0b19
            android.view.View r3 = r44.A01()     // Catch:{ all -> 0x0d03 }
            int r3 = r3.getId()     // Catch:{ all -> 0x0d03 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d03 }
        L_0x0b19:
            X.7FU r3 = r6.A00     // Catch:{ all -> 0x0d03 }
            boolean r5 = r3.CU2()     // Catch:{ all -> 0x0d03 }
            r13 = 6
            r9.A09(r12, r13)     // Catch:{ all -> 0x0d03 }
            r11 = 7
            r9.A09(r12, r11)     // Catch:{ all -> 0x0d03 }
            r9.A09(r4, r13)     // Catch:{ all -> 0x0d03 }
            r9.A09(r4, r11)     // Catch:{ all -> 0x0d03 }
            if (r7 == 0) goto L_0x0b39
            int r3 = r7.intValue()     // Catch:{ all -> 0x0d03 }
            r9.A09(r3, r13)     // Catch:{ all -> 0x0d03 }
            r9.A09(r3, r11)     // Catch:{ all -> 0x0d03 }
        L_0x0b39:
            if (r16 == 0) goto L_0x0b45
            int r3 = r16.intValue()     // Catch:{ all -> 0x0d03 }
            r9.A09(r3, r13)     // Catch:{ all -> 0x0d03 }
            r9.A09(r3, r11)     // Catch:{ all -> 0x0d03 }
        L_0x0b45:
            if (r5 == 0) goto L_0x0b7c
            r9.A0C(r12, r11, r0, r11)     // Catch:{ all -> 0x0d03 }
            r9.A0C(r4, r11, r0, r11)     // Catch:{ all -> 0x0d03 }
            if (r16 == 0) goto L_0x0b69
            int r10 = r16.intValue()     // Catch:{ all -> 0x0d03 }
            if (r7 == 0) goto L_0x0b59
            int r12 = r7.intValue()     // Catch:{ all -> 0x0d03 }
        L_0x0b59:
            android.content.res.Resources r4 = r49.getResources()     // Catch:{ all -> 0x0d03 }
            r3 = 2131165332(0x7f070094, float:1.7944878E38)
            float r3 = r4.getDimension(r3)     // Catch:{ all -> 0x0d03 }
            int r3 = (int) r3     // Catch:{ all -> 0x0d03 }
            r14 = r3
            r9.A0E(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0d03 }
        L_0x0b69:
            if (r7 == 0) goto L_0x0bc0
            int r10 = r7.intValue()     // Catch:{ all -> 0x0d03 }
            android.content.res.Resources r4 = r49.getResources()     // Catch:{ all -> 0x0d03 }
            r3 = 2131165405(0x7f0700dd, float:1.7945026E38)
            float r3 = r4.getDimension(r3)     // Catch:{ all -> 0x0d03 }
            int r3 = (int) r3     // Catch:{ all -> 0x0d03 }
            goto L_0x0bba
        L_0x0b7c:
            r9.A0C(r12, r13, r0, r13)     // Catch:{ all -> 0x0d03 }
            r9.A0C(r4, r13, r0, r13)     // Catch:{ all -> 0x0d03 }
            if (r16 == 0) goto L_0x0ba7
            int r20 = r16.intValue()     // Catch:{ all -> 0x0d03 }
            if (r7 == 0) goto L_0x0b8e
            int r12 = r7.intValue()     // Catch:{ all -> 0x0d03 }
        L_0x0b8e:
            android.content.res.Resources r4 = r49.getResources()     // Catch:{ all -> 0x0d03 }
            r3 = 2131165332(0x7f070094, float:1.7944878E38)
            float r3 = r4.getDimension(r3)     // Catch:{ all -> 0x0d03 }
            int r3 = (int) r3     // Catch:{ all -> 0x0d03 }
            r19 = r9
            r21 = r13
            r22 = r12
            r23 = r11
            r24 = r3
            r19.A0E(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0d03 }
        L_0x0ba7:
            if (r7 == 0) goto L_0x0bc0
            int r10 = r7.intValue()     // Catch:{ all -> 0x0d03 }
            android.content.res.Resources r4 = r49.getResources()     // Catch:{ all -> 0x0d03 }
            r3 = 2131165405(0x7f0700dd, float:1.7945026E38)
            float r3 = r4.getDimension(r3)     // Catch:{ all -> 0x0d03 }
            int r3 = (int) r3     // Catch:{ all -> 0x0d03 }
            r11 = 6
        L_0x0bba:
            r12 = r0
            r13 = r11
            r14 = r3
            r9.A0E(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0d03 }
        L_0x0bc0:
            r3 = r45
            r9.A0G(r3)     // Catch:{ all -> 0x0d03 }
            X.778 r5 = r8.A0G     // Catch:{ all -> 0x0d03 }
            X.76q r4 = r1.A0U     // Catch:{ all -> 0x0d03 }
            r3 = 0
            r4.A00 = r3     // Catch:{ all -> 0x0d03 }
            if (r5 == 0) goto L_0x0cbb
            java.lang.String r9 = r5.A03     // Catch:{ all -> 0x0d03 }
            if (r9 == 0) goto L_0x0cbb
            java.lang.String r8 = r5.A01     // Catch:{ all -> 0x0d03 }
            if (r8 == 0) goto L_0x0cbb
            java.lang.String r7 = r5.A02     // Catch:{ all -> 0x0d03 }
            if (r7 == 0) goto L_0x0cbb
            java.lang.String r10 = r5.A00     // Catch:{ all -> 0x0d03 }
            if (r10 == 0) goto L_0x0cbb
            X.9HC r11 = r2.A04     // Catch:{ all -> 0x0d03 }
            X.0eM r3 = r11.A1R     // Catch:{ all -> 0x0d03 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0d03 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0c3f
            X.3oV r0 = r1.A0Q     // Catch:{ all -> 0x0d03 }
            android.view.View r0 = r0.getView()     // Catch:{ all -> 0x0d03 }
            r4.A00 = r0     // Catch:{ all -> 0x0d03 }
            r0 = r35
            r4.A01 = r0     // Catch:{ all -> 0x0d03 }
            java.util.regex.Pattern r0 = X.0mp.A00     // Catch:{ all -> 0x0d03 }
            int r8 = r8.length()     // Catch:{ all -> 0x0d03 }
            X.0eM r0 = r4.A06     // Catch:{ all -> 0x0d03 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0c16
            int r0 = r8 + 1
            java.lang.String r0 = r7.substring(r0)     // Catch:{ all -> 0x0d03 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0d03 }
            r3.setText(r0)     // Catch:{ all -> 0x0d03 }
        L_0x0c16:
            X.0eM r0 = r4.A07     // Catch:{ all -> 0x0d03 }
            java.lang.Object r7 = r0.getValue()     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.widget.imageview.IgImageView r7 = (com.instagram.common.ui.widget.imageview.IgImageView) r7     // Catch:{ all -> 0x0d03 }
            if (r7 == 0) goto L_0x0c2a
            com.instagram.common.typedurl.SimpleImageUrl r3 = new com.instagram.common.typedurl.SimpleImageUrl     // Catch:{ all -> 0x0d03 }
            r3.<init>(r10)     // Catch:{ all -> 0x0d03 }
            r0 = r48
            r7.setUrl(r3, r0)     // Catch:{ all -> 0x0d03 }
        L_0x0c2a:
            int r0 = r5.hashCode()     // Catch:{ all -> 0x0d03 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d03 }
            r4.A03 = r0     // Catch:{ all -> 0x0d03 }
            X.0eM r0 = r2.A09     // Catch:{ all -> 0x0d03 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0d03 }
            X.A47 r0 = (X.A47) r0     // Catch:{ all -> 0x0d03 }
            r4.A02 = r0     // Catch:{ all -> 0x0d03 }
            goto L_0x0cbb
        L_0x0c3f:
            X.0eM r3 = r11.A1S     // Catch:{ all -> 0x0d03 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0d03 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0d03 }
            if (r3 == 0) goto L_0x0cbb
            X.3oV r3 = r1.A0R     // Catch:{ all -> 0x0d03 }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x0d03 }
            r4.A00 = r3     // Catch:{ all -> 0x0d03 }
            r3 = r35
            r4.A01 = r3     // Catch:{ all -> 0x0d03 }
            X.0eM r3 = r4.A08     // Catch:{ all -> 0x0d03 }
            java.lang.Object r11 = r3.getValue()     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.base.IgTextView r11 = (com.instagram.common.ui.base.IgTextView) r11     // Catch:{ all -> 0x0d03 }
            if (r11 == 0) goto L_0x0c7c
            int r3 = java.lang.Integer.parseInt(r9)     // Catch:{ all -> 0x0d03 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d03 }
            java.lang.Object[] r10 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0d03 }
            java.lang.String r9 = "%,d"
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0d03 }
            java.lang.String r3 = java.lang.String.format(r3, r9, r10)     // Catch:{ all -> 0x0d03 }
            r11.setText(r3)     // Catch:{ all -> 0x0d03 }
        L_0x0c7c:
            java.util.regex.Pattern r3 = X.0mp.A00     // Catch:{ all -> 0x0d03 }
            int r9 = r8.length()     // Catch:{ all -> 0x0d03 }
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x0d03 }
            r8.<init>(r7)     // Catch:{ all -> 0x0d03 }
            r10 = 2132018629(0x7f1405c5, float:1.967557E38)
            android.text.style.TextAppearanceSpan r7 = new android.text.style.TextAppearanceSpan     // Catch:{ all -> 0x0d03 }
            r3 = r49
            r7.<init>(r3, r10)     // Catch:{ all -> 0x0d03 }
            r10 = 33
            r8.setSpan(r7, r0, r9, r10)     // Catch:{ all -> 0x0d03 }
            r7 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r7 = X.2Yu.A0H(r3, r7)     // Catch:{ all -> 0x0d03 }
            int r7 = r3.getColor(r7)     // Catch:{ all -> 0x0d03 }
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan     // Catch:{ all -> 0x0d03 }
            r3.<init>(r7)     // Catch:{ all -> 0x0d03 }
            r8.setSpan(r3, r0, r9, r10)     // Catch:{ all -> 0x0d03 }
            X.0eM r0 = r4.A09     // Catch:{ all -> 0x0d03 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0d03 }
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0     // Catch:{ all -> 0x0d03 }
            if (r0 == 0) goto L_0x0c2a
            r0.setText(r8)     // Catch:{ all -> 0x0d03 }
            goto L_0x0c2a
        L_0x0cb8:
            r3.setTextAlignment(r7)     // Catch:{ all -> 0x0d03 }
        L_0x0cbb:
            X.7DZ r0 = r2.A07     // Catch:{ all -> 0x0d03 }
            r0.A02(r1, r6)     // Catch:{ all -> 0x0d03 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)
            if (r0 == 0) goto L_0x0ccc
            r0 = -656268959(0xffffffffd8e22161, float:-1.98906391E15)
            X.0fS.A00(r0)
        L_0x0ccc:
            return
        L_0x0ccd:
            java.lang.String r0 = "PortraitXmaContentViewModel.Reaction type unknown"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0d03 }
            r1.<init>(r0)     // Catch:{ all -> 0x0d03 }
            goto L_0x0d02
        L_0x0cd5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d03 }
            r1.<init>()     // Catch:{ all -> 0x0d03 }
            java.lang.String r0 = "Unsupported MediaFields subtype: "
            r1.append(r0)     // Catch:{ all -> 0x0d03 }
            r1.append(r7)     // Catch:{ all -> 0x0d03 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d03 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0d03 }
            r1.<init>(r0)     // Catch:{ all -> 0x0d03 }
            goto L_0x0d02
        L_0x0cec:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d03 }
            r1.<init>()     // Catch:{ all -> 0x0d03 }
            java.lang.String r0 = "Invalid content: "
            r1.append(r0)     // Catch:{ all -> 0x0d03 }
            r1.append(r11)     // Catch:{ all -> 0x0d03 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d03 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0d03 }
            r1.<init>(r0)     // Catch:{ all -> 0x0d03 }
        L_0x0d02:
            throw r1     // Catch:{ all -> 0x0d03 }
        L_0x0d03:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)
            if (r0 == 0) goto L_0x0d10
            r0 = -753693226(0xffffffffd3138dd6, float:-6.337398E11)
            X.0fS.A00(r0)
        L_0x0d10:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78H.ADp(X.752, X.76o):void");
    }

    public static final Drawable A00(AnonymousClass78H r15, String str) {
        Context context = r15.A00;
        UserSession userSession = r15.A02;
        return C320996tP.A01(context, userSession, (C320986tO) null, str, (String) null, (String) null, (String) null, context.getResources().getDimensionPixelSize(R.dimen.ar_effect_option_icon_size), context.getResources().getDimensionPixelSize(R.dimen.ar_effect_option_icon_size), false, true, C63282KuR.A00(userSession), true, false);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r6) {
        C3263876o r62 = (C3263876o) r6;
        0qQ.A0B(r62, 0);
        ((AnonymousClass7EE) r62.A0b.getValue()).A00 = null;
        r62.A0V.A04();
        AnonymousClass78D r4 = this.A06;
        if (r4 != null) {
            if (!182.A06(0Tu.A05, r4.A00, 2342159139545288697L)) {
                ((AnonymousClass78B) r4.A01).A00.A03("scroll");
            }
        }
        this.A07.A01(r62);
        r62.A00();
    }

    public AnonymousClass78H(Context context, AnonymousClass0iw r5, UserSession userSession, C332937Xa r7, AnonymousClass9HC r8, AnonymousClass78D r9, AnonymousClass7DZ r10, boolean z) {
        AnonymousClass78I r0;
        this.A00 = context;
        this.A03 = r7;
        this.A01 = r5;
        this.A07 = r10;
        this.A02 = userSession;
        this.A04 = r8;
        this.A0D = z;
        this.A06 = r9;
        this.A08 = AnonymousClass6FA.A00(userSession);
        if (182.A06(0Tu.A05, userSession, 36321219867321511L)) {
            r0 = new AnonymousClass78I();
        } else {
            r0 = null;
        }
        this.A05 = r0;
        0eO r2 = 0eO.A02;
        this.A09 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 32));
        this.A0B = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 34));
        this.A0C = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 35));
        this.A0A = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 33));
    }

    public static final void A01(AnonymousClass9JN r2, AnonymousClass7Ws r3, C328667Fr r4, C3263876o r5, IgdsButton igdsButton) {
        if (1QE.A0E() == 1QG.A04) {
            igdsButton.setStyle(C273014lo.PRIMARY_ON_COLOR);
        }
        igdsButton.setText(r2.A04);
        AnonymousClass0fU.A00(new C71352Oj3(r2, r3, r4, r5), igdsButton);
        igdsButton.setVisibility(0);
    }
}
