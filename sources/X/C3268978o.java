package X;

import android.app.Activity;

/* renamed from: X.78o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3268978o implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 2Er A01;
    public final /* synthetic */ C329067Hl A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C3268978o(Activity activity, 2Er r2, C329067Hl r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = activity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.7KY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: X.7KZ} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        if (3 != X.182.A01(X.0Tu.A05, r0.A1Z, 36607677006157410L)) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0a7c, code lost:
        if (X.AnonymousClass48O.A01(r10.C6a()) == false) goto L_0x0a7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0d3f, code lost:
        if (r10.Axj() != false) goto L_0x0d41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0d77, code lost:
        if (r9.Aax(r2, false).size() < 10) goto L_0x0d79;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x027f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r1 = r34
            X.7Hl r0 = r1.A02
            X.2Er r10 = r1.A01
            java.lang.String r2 = r1.A03
            android.app.Activity r1 = r1.A00
            r33 = r1
            X.7L0 r11 = r0.A0U
            if (r11 == 0) goto L_0x031b
            X.7Kf r1 = r0.A0d
            X.0eM r1 = r1.A0H
            java.lang.Object r5 = r1.getValue()
            X.7Kr r5 = (X.C329907Kr) r5
            r0.A0Q = r5
            android.text.TextUtils.isEmpty(r2)
            X.2Er r1 = r0.A0W
            if (r1 == 0) goto L_0x0026
            r1.CVr()
        L_0x0026:
            boolean r25 = X.C329067Hl.A10(r0)
            boolean r1 = X.C329067Hl.A11(r0)
            if (r1 == 0) goto L_0x0f67
            boolean r1 = r0.A1S()
            if (r1 != 0) goto L_0x0f67
            X.2Er r1 = r0.A0W
            if (r1 == 0) goto L_0x0040
            boolean r1 = r1.CVr()
            if (r1 != 0) goto L_0x0f67
        L_0x0040:
            X.7Rr r1 = r0.A0Z
            X.0eM r1 = r1.A0A
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r24 = r1.booleanValue()
        L_0x004e:
            X.7Rr r1 = r0.A0Z
            X.0eM r1 = r1.A0C
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0f63
            boolean r1 = X.C329067Hl.A10(r0)
            if (r1 != 0) goto L_0x0f63
            boolean r1 = X.C329067Hl.A11(r0)
            if (r1 == 0) goto L_0x0f63
            com.instagram.common.session.UserSession r2 = r0.A1Z
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r1.A01(r2)
            boolean r1 = r1.A2L()
            if (r1 == 0) goto L_0x0f63
            boolean r1 = r0.A1S()
            if (r1 != 0) goto L_0x0f63
            X.7QC r1 = X.AnonymousClass7QC.A00
            boolean r23 = r1.A00(r2)
        L_0x0084:
            X.N3L r8 = r0.A0v
            boolean r1 = X.C329067Hl.A0w(r0)
            if (r1 == 0) goto L_0x00a1
            r6 = 3
            com.instagram.common.session.UserSession r4 = r0.A1Z
            X.0Tu r3 = X.0Tu.A05
            r1 = 36607677006157410(0x820e7d00011662, double:3.2141805737529623E-306)
            long r2 = X.182.A01(r3, r4, r1)
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r22 = 1
            if (r1 == 0) goto L_0x00a3
        L_0x00a1:
            r22 = 0
        L_0x00a3:
            X.78r r21 = new X.78r
            r1 = r21
            r1.<init>(r0)
            r4 = 0
            int r1 = r10.BHS()
            if (r1 != 0) goto L_0x00d1
            if (r8 == 0) goto L_0x0357
            com.instagram.common.session.UserSession r7 = r5.A06
            android.content.Context r6 = r5.A03
            android.view.View r3 = r5.A04
            X.0iw r2 = r5.A05
            X.6iJ r1 = r5.A07
            r12 = r6
            r13 = r3
            r14 = r2
            r15 = r7
            r16 = r1
            r17 = r11
            r18 = r8
            boolean r1 = X.OPM.A01(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0357
            java.lang.Integer r12 = X.AnonymousClass05K.A0F
        L_0x00cf:
            r5.A00 = r12
        L_0x00d1:
            X.2Er r8 = r0.A0W
            if (r8 == 0) goto L_0x013d
            com.instagram.common.session.UserSession r7 = r0.A1Z
            android.content.Context r5 = r0.A1R
            android.widget.FrameLayout r6 = r0.A07
            X.0qQ.A0B(r7, r4)
            r1 = 1
            X.0qQ.A0B(r5, r1)
            r3 = 2
            r1 = 3
            X.0qQ.A0B(r6, r1)
            int r1 = r8.C6a()
            boolean r1 = X.AnonymousClass48O.A02(r1)
            if (r1 == 0) goto L_0x013d
            java.lang.String r2 = r8.AsX()
            java.lang.String r1 = r7.A06
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x013d
            java.util.List r1 = r8.BRZ()
            int r1 = r1.size()
            if (r1 >= r3) goto L_0x013d
            X.0Tu r3 = X.0Tu.A05
            r1 = 36327615074023993(0x810fc600063a39, double:3.037068280152906E-306)
            boolean r1 = X.182.A06(r3, r7, r1)
            if (r1 == 0) goto L_0x013d
            r1 = 2131441663(0x7f0b37ff, float:1.8505344E38)
            android.view.View r2 = r6.requireViewById(r1)
            X.0qQ.A07(r2)
            boolean r1 = r2 instanceof android.view.ViewStub
            if (r1 == 0) goto L_0x0128
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r2 = r2.inflate()
        L_0x0128:
            r1 = 9
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 2131963732(0x7f132f54, float:1.9564226E38)
            java.lang.String r1 = r5.getString(r1)
            r2.setText(r1)
        L_0x013d:
            X.7Ij r1 = r0.A0b
            if (r1 == 0) goto L_0x0198
            X.7Iy r1 = r1.A0V
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r6 = r1.BZe()
            boolean r1 = r0.A1E
            if (r1 != 0) goto L_0x0198
            boolean r1 = r0.A19
            if (r1 == 0) goto L_0x0198
            if (r6 == 0) goto L_0x0198
            r1 = 1
            r0.A1E = r1
            com.instagram.common.session.UserSession r7 = r0.A1Z
            X.1Av r5 = X.1Au.A00(r7)
            X.0s0 r3 = r5.A2R
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 452(0x1c4, float:6.33E-43)
            r1 = r2[r1]
            java.lang.Object r1 = r3.CDM(r5, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r5 = r1.booleanValue()
            X.4kA r1 = X.AnonymousClass4k9.A00(r7)
            java.lang.String r3 = X.C329067Hl.A0F(r0)
            X.0xa r2 = r1.A00
            java.lang.String r1 = "broadcast_channel_comments_upsell_banner_dismissed"
            java.lang.String r1 = X.002.A0R(r1, r3)
            boolean r1 = r2.getBoolean(r1, r4)
            if (r5 != 0) goto L_0x0198
            if (r1 == 0) goto L_0x0198
            X.PHw r5 = new X.PHw
            r5.<init>(r0)
            r2 = 2131970920(0x7f134b68, float:1.9578805E38)
            X.FvC r3 = new X.FvC
            r1 = r33
            r3.<init>(r1, r6, r5, r2)
            r1 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r3, r1)
        L_0x0198:
            X.7Ij r1 = r0.A0b
            if (r1 == 0) goto L_0x01dd
            X.7Iy r1 = r1.A0V
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r6 = r1.BZe()
            com.instagram.common.session.UserSession r1 = r0.A1Z
            X.4kA r5 = X.AnonymousClass4k9.A00(r1)
            X.0s0 r3 = r5.A0I
            X.0YZ[] r2 = X.AnonymousClass4kA.A0c
            r1 = 27
            r1 = r2[r1]
            java.lang.Object r1 = r3.CDM(r5, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            if (r6 == 0) goto L_0x01dd
            boolean r1 = r0.A1D
            if (r1 != 0) goto L_0x01dd
            if (r2 != 0) goto L_0x01dd
            boolean r1 = r0.A14
            if (r1 == 0) goto L_0x01dd
            r1 = 1
            r0.A1D = r1
            X.PHv r5 = new X.PHv
            r5.<init>(r0)
            r2 = 2131955044(0x7f130d64, float:1.9546604E38)
            X.FvC r3 = new X.FvC
            r1 = r33
            r3.<init>(r1, r6, r5, r2)
            r1 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r3, r1)
        L_0x01dd:
            r0.A1E()
            r0.A18()
            X.C329067Hl.A0c(r0)
            boolean r5 = X.C329067Hl.A0w(r0)
            X.7Ij r3 = r0.A0b
            if (r3 == 0) goto L_0x01f5
            X.7JT r2 = X.AnonymousClass7JT.META_AI_DISCOVERY
            X.7JU r1 = X.AnonymousClass7JU.RIGHT_INSET
            r3.FMR(r1, r2, r5)
        L_0x01f5:
            boolean r1 = r0.A1F
            if (r1 != 0) goto L_0x026b
            X.0eK r1 = r0.A23
            java.lang.Object r1 = r1.get()
            X.7Kc r1 = (X.C329757Kc) r1
            boolean r1 = r1.Cbb()
            if (r1 == 0) goto L_0x026b
            android.content.Context r6 = r0.A1R
            com.instagram.common.session.UserSession r11 = r0.A1Z
            X.2Er r1 = r0.A0W
            r1.getClass()
            int r2 = r1.C6a()
            X.0qQ.A0B(r6, r4)
            r5 = 1
            X.0qQ.A0B(r11, r5)
            r1 = 29
            if (r2 != r1) goto L_0x031c
            X.1Am r2 = X.1Al.A01(r11)
            X.1An r1 = X.1An.A2r
            X.0xa r9 = r2.A03(r1)
            java.lang.String r8 = "SEND_SILENTLY_NUX_KEY_BC"
            int r7 = r9.getInt(r8, r4)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36600882369859619(0x82084f001f1023, double:3.209883618398435E-306)
            long r12 = X.182.A01(r3, r11, r1)
            r2 = 0
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x031c
            long r2 = (long) r7
            int r1 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x031c
            X.0xY r2 = r9.AR4()
            int r1 = r7 + 1
            r2.E5Z(r8, r1)
        L_0x024e:
            r2.apply()
            r2 = 2131960573(0x7f1322fd, float:1.9557818E38)
            java.lang.String r1 = "🤫"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = r6.getString(r2, r1)
            if (r2 == 0) goto L_0x026b
            r0.A1F = r5
            X.7Ij r1 = r0.A0b
            r1.A0C = r2
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r1.A0S
            r1.setHint(r2)
        L_0x026b:
            X.OZO r1 = r0.A0s
            if (r1 == 0) goto L_0x0272
            X.OZO.A00(r1, r4)
        L_0x0272:
            r1 = 1
            X.C329067Hl.A0h(r0, r1)
            X.7Ij r1 = r0.A0b
            if (r1 == 0) goto L_0x031b
            X.792 r1 = r0.A0q
            if (r1 != 0) goto L_0x031b
            X.792 r1 = new X.792
            r1.<init>()
            r0.A0q = r1
            X.7Ij r1 = r0.A0b
            X.7Iy r1 = r1.A0V
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r3 = r1.BZe()
            X.7Ij r1 = r0.A0b
            X.7Iw r1 = r1.A0W
            android.view.View r5 = r1.A04
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r0.A0H
            if (r1 == 0) goto L_0x02a0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x02a0
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r3 = r0.A0H
        L_0x02a0:
            com.instagram.common.session.UserSession r13 = r0.A1Z
            X.7KY r2 = X.C329067Hl.A08(r0)
            X.793 r1 = new X.793
            r1.<init>(r2)
            X.798 r2 = new X.798
            r2.<init>(r13, r1)
            X.792 r1 = r0.A0q
            X.79A r4 = X.AnonymousClass79A.SHOW_MESSAGE_COMPOSER
            r1.A01(r3, r2, r4)
            X.0Tu r6 = X.0Tu.A05
            r1 = 36317732356494829(0x8106c9002815ed, double:3.0308184097929533E-306)
            boolean r1 = X.182.A06(r6, r13, r1)
            if (r1 == 0) goto L_0x02d7
            X.7KY r2 = X.C329067Hl.A08(r0)
            X.793 r1 = new X.793
            r1.<init>(r2)
            X.EK8 r2 = new X.EK8
            r2.<init>(r13, r1)
            X.792 r1 = r0.A0q
            r1.A01(r3, r2, r4)
        L_0x02d7:
            X.7KX r15 = r0.A0f
            if (r15 == 0) goto L_0x0302
            X.7KY r1 = X.C329067Hl.A08(r0)
            X.7KZ r2 = new X.7KZ
            r2.<init>(r1)
            java.lang.String r1 = r10.BkK()
            com.instagram.direct.prompts.DirectPromptTypes r14 = X.AnonymousClass79B.A01(r1)
            X.0iw r12 = r0.A1X
            java.lang.String r17 = X.C329067Hl.A0F(r0)
            boolean r18 = r0.A1S()
            X.79D r11 = new X.79D
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.792 r1 = r0.A0q
            r1.A01(r3, r11, r4)
        L_0x0302:
            boolean r1 = X.C3268378i.A00(r13, r10)
            if (r1 == 0) goto L_0x0314
            X.792 r3 = r0.A0q
            X.EKA r2 = new X.EKA
            r2.<init>(r13, r10)
            X.79A r1 = X.AnonymousClass79A.ON_USER_TYPING
            r3.A01(r5, r2, r1)
        L_0x0314:
            X.792 r1 = r0.A0q
            r0 = r33
            r1.A00(r0, r4)
        L_0x031b:
            return
        L_0x031c:
            X.1Am r2 = X.1Al.A01(r11)
            X.1An r1 = X.1An.A2r
            X.0xa r9 = r2.A03(r1)
            java.lang.String r7 = "SEND_SILENTLY_NUX_KEY_V2"
            int r8 = r9.getInt(r7, r4)
            r1 = 3
            if (r8 >= r1) goto L_0x026b
            long r1 = java.lang.System.currentTimeMillis()
            java.util.Date r3 = new java.util.Date
            r3.<init>(r1)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTime(r3)
            r1 = 11
            int r2 = r2.get(r1)
            r1 = 23
            if (r2 >= r1) goto L_0x034c
            r1 = 6
            if (r2 >= r1) goto L_0x026b
        L_0x034c:
            X.0xY r2 = r9.AR4()
            int r1 = r8 + 1
            r2.E5Z(r7, r1)
            goto L_0x024e
        L_0x0357:
            com.instagram.common.session.UserSession r3 = r5.A06
            android.app.Activity r9 = r5.A02
            android.view.View r8 = r5.A04
            X.6iJ r1 = r5.A07
            r32 = r1
            r7 = 1
            r1 = 2131437189(0x7f0b2685, float:1.849627E38)
            android.view.View r1 = r8.findViewById(r1)
            if (r1 != 0) goto L_0x047f
            com.instagram.user.model.User r14 = r10.BZK()
            if (r14 == 0) goto L_0x047f
            X.7Yq r1 = new X.7Yq
            r1.<init>(r3)
            java.lang.String r2 = r14.getId()
            X.0xa r13 = r1.A01
            java.lang.String r12 = "creators_banner_shown_on"
            java.util.Set r1 = r13.C1t(r12)
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x047f
            X.6oA r1 = new X.6oA
            r1.<init>(r3)
            boolean r1 = r14.CQp(r1)
            if (r1 == 0) goto L_0x047f
            r1 = 2131434555(0x7f0b1c3b, float:1.8490927E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x047f
            android.view.View r7 = r1.inflate()
            r1 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r2 = r7.findViewById(r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1 = 2131237577(0x7f081ac9, float:1.8091408E38)
            android.graphics.drawable.Drawable r1 = r9.getDrawable(r1)
            r2.setImageDrawable(r1)
            X.1px r2 = X.AnonymousClass1q4.A00()
            boolean r1 = r10.BBQ()
            if (r1 == 0) goto L_0x0453
            r1 = 2131956957(0x7f1314dd, float:1.9550484E38)
            java.lang.String r1 = r9.getString(r1)
            android.text.SpannableStringBuilder r15 = new android.text.SpannableStringBuilder
            r15.<init>(r1)
            X.PiW r1 = X.C73709PiW.A00
            r2.ABX(r9, r15, r3, r1)
            r2 = 2131956956(0x7f1314dc, float:1.9550482E38)
        L_0x03d3:
            java.lang.String r1 = r14.B8Q()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = r9.getString(r2, r1)
            X.0qQ.A07(r1)
            X.JVf r6 = new X.JVf
            r6.<init>((java.lang.CharSequence) r1, (java.lang.CharSequence) r15)
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r2 = r7.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r1 = r6.A01
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            r1 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.view.View r2 = r7.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r1)
            java.lang.Object r1 = r6.A00
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            r1 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r6 = r7.findViewById(r1)
            X.FMs r2 = new X.FMs
            r1 = r32
            r2.<init>(r8, r1)
            X.AnonymousClass0fU.A00(r2, r6)
            int r1 = r11.A02
            r7.setBackgroundColor(r1)
            java.lang.String r2 = r14.getId()
            java.util.Set r1 = r13.C1t(r12)
            java.util.LinkedHashSet r2 = X.094.A01(r2, r1)
            X.0xY r1 = r13.AR4()
            r1.E5h(r12, r2)
            r1.apply()
            r1 = 0
            X.GPq r6 = new X.GPq
            r6.<init>(r3, r1)
            java.lang.String r2 = r14.getId()
            r1 = 10
            java.lang.Long r2 = X.00y.A0n(r1, r2)
            java.lang.String r1 = "creator_has_auto_replies_bottom_banner_impression"
            X.C52369GPq.A03(r6, r2, r1)
            java.lang.Integer r12 = X.AnonymousClass05K.A0H
            goto L_0x00cf
        L_0x0453:
            r1 = 2131956967(0x7f1314e7, float:1.9550505E38)
            java.lang.String r1 = r9.getString(r1)
            android.text.SpannableStringBuilder r15 = new android.text.SpannableStringBuilder
            r15.<init>(r1)
            r1 = 2131952631(0x7f1303f7, float:1.954171E38)
            java.lang.String r6 = r9.getString(r1)
            X.0qQ.A07(r6)
            java.lang.String r1 = "https://help.instagram.com/477434105621119"
            android.net.Uri r2 = android.net.Uri.parse(r1)
            X.0qQ.A07(r2)
            X.Dj7 r1 = new X.Dj7
            r1.<init>(r2)
            X.AnonymousClass7AV.A05(r15, r1, r6)
            r2 = 2131956958(0x7f1314de, float:1.9550486E38)
            goto L_0x03d3
        L_0x047f:
            android.content.Context r6 = r5.A03
            r12 = 5
            X.7LW r2 = X.AnonymousClass7LV.A00
            java.util.List r1 = r10.BRZ()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x04cf
            java.util.List r1 = r10.BRZ()
            java.lang.Object r1 = r1.get(r4)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Integer r1 = r1.Bjj()
            if (r1 == 0) goto L_0x04a6
            int r1 = r1.intValue()
            if (r1 == r12) goto L_0x04cf
        L_0x04a6:
            boolean r1 = r2.A02(r3, r10)
            if (r1 != 0) goto L_0x04b2
            boolean r1 = r2.A03(r3, r10)
            if (r1 == 0) goto L_0x04cf
        L_0x04b2:
            int r2 = r10.C6a()
            r1 = 1003(0x3eb, float:1.406E-42)
            if (r2 != r1) goto L_0x05fb
            java.util.List r1 = r10.BRZ()
            java.lang.Object r2 = r1.get(r4)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.6oA r1 = new X.6oA
            r1.<init>(r3)
            boolean r1 = r2.CQp(r1)
            if (r1 == 0) goto L_0x05fb
        L_0x04cf:
            r1 = 2131440507(0x7f0b337b, float:1.8503E38)
            android.view.View r13 = r8.findViewById(r1)
            r1 = 2131440522(0x7f0b338a, float:1.850303E38)
            android.view.View r19 = r8.findViewById(r1)
            r1 = 2131440506(0x7f0b337a, float:1.8502997E38)
            r8.findViewById(r1)
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            if (r1 != r12) goto L_0x0546
            boolean r1 = r10.BAj()
            if (r1 == 0) goto L_0x0546
            X.3sQ r2 = r10.Aie()
            if (r2 == 0) goto L_0x05eb
            X.3sQ r1 = X.C254403sQ.UNKNOWN
            if (r2 == r1) goto L_0x05eb
            r1 = 2131437189(0x7f0b2685, float:1.849627E38)
            android.view.View r14 = r8.findViewById(r1)
            if (r14 != 0) goto L_0x0512
            r1 = 2131437190(0x7f0b2686, float:1.8496272E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r14 = r1.inflate()
            X.0qQ.A07(r14)
        L_0x0512:
            java.lang.String r1 = r10.BZN()
            X.FC3.A01(r14, r2, r1)
            r1 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r15 = r14.findViewById(r1)
            if (r15 == 0) goto L_0x052c
            X.FMv r2 = new X.FMv
            r1 = r32
            r2.<init>(r14, r1)
            X.AnonymousClass0fU.A00(r2, r15)
        L_0x052c:
            r14.setVisibility(r4)
            r2 = 8
            r1 = 2131428915(0x7f0b0633, float:1.8479488E38)
            android.view.View r1 = r14.findViewById(r1)
            if (r1 == 0) goto L_0x053d
            r1.setVisibility(r2)
        L_0x053d:
            r32.DUt()
            X.FC3.A02(r3, r10)
        L_0x0543:
            r10.EY1(r4)
        L_0x0546:
            java.lang.Integer r2 = r5.A00
            java.lang.Integer r20 = X.AnonymousClass05K.A03
            r1 = r20
            if (r2 != r1) goto L_0x055d
            X.78s r26 = X.C3269378s.A00
            r27 = r6
            r28 = r8
            r29 = r3
            r30 = r11
            r31 = r10
            r26.A08(r27, r28, r29, r30, r31)
        L_0x055d:
            java.lang.Integer r1 = r5.A00
            if (r1 != 0) goto L_0x00d1
            java.lang.Boolean r1 = r10.Amk()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            boolean r1 = X.0qQ.A0K(r1, r2)
            if (r1 == 0) goto L_0x074d
            r1 = 22
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r9, r1)
            r1 = r9
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            r30 = r1
            X.3sy r1 = r10.BJz()
            X.3t3 r26 = X.C66647MaG.A08(r1)
            int r14 = r10.C6a()
            int r29 = r10.AdN()
            java.lang.String r15 = r10.AsX()
            java.lang.Boolean r1 = r10.Amk()
            boolean r18 = X.0qQ.A0K(r1, r2)
            java.lang.String r1 = r5.A08
            r28 = r1
            r1 = r30
            X.0qQ.A0B(r1, r7)
            X.4kA r2 = X.AnonymousClass4k9.A00(r3)
            r1 = 29
            if (r14 != r1) goto L_0x074d
            java.lang.String r1 = r3.A06
            boolean r1 = X.0qQ.A0K(r15, r1)
            if (r1 == 0) goto L_0x074d
            X.0s0 r14 = r2.A06
            X.0YZ[] r15 = X.AnonymousClass4kA.A0c
            r1 = 30
            r1 = r15[r1]
            java.lang.Object r1 = r14.CDM(r2, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            long r16 = r1.longValue()
            r14 = 0
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x074d
            X.0Tu r14 = X.0Tu.A05
            r1 = 36319407399050628(0x81084f00791d84, double:3.0318777134500956E-306)
            boolean r1 = X.182.A06(r14, r3, r1)
            if (r1 == 0) goto L_0x074d
            if (r18 == 0) goto L_0x05e8
            X.NiW r25 = X.C69270NiW.ENGAGEMENT_NUX
        L_0x05db:
            java.lang.String r27 = "thread_view"
            r23 = r30
            r24 = r3
            X.C69873Ntb.A00(r23, r24, r25, r26, r27, r28, r29)
            java.lang.Integer r12 = X.AnonymousClass05K.A04
            goto L_0x00cf
        L_0x05e8:
            X.NiW r25 = X.C69270NiW.ACTIVATION_NUX
            goto L_0x05db
        L_0x05eb:
            r1 = 2131437189(0x7f0b2685, float:1.849627E38)
            android.view.View r2 = r8.findViewById(r1)
            if (r2 == 0) goto L_0x0543
            r1 = r32
            X.FC3.A00(r2, r1)
            goto L_0x0543
        L_0x05fb:
            X.0Tu r12 = X.0Tu.A05
            r1 = 36316409504665955(0x810595000b1163, double:3.0299818329696766E-306)
            boolean r1 = X.182.A06(r12, r3, r1)
            if (r1 != 0) goto L_0x04cf
            r1 = 2131434555(0x7f0b1c3b, float:1.8490927E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x04cf
            android.view.View r15 = r1.inflate()
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r14 = r15.findViewById(r1)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r1 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.view.View r13 = r15.findViewById(r1)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r2 = r15.requireViewById(r1)
            X.0qQ.A07(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.util.List r1 = r10.BRZ()
            java.lang.Object r12 = r1.get(r4)
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            r1 = 2131237690(0x7f081b3a, float:1.8091638E38)
            android.graphics.drawable.Drawable r1 = r6.getDrawable(r1)
            r2.setImageDrawable(r1)
            java.lang.String r9 = r12.getFullName()
            java.lang.String r8 = r12.getUsername()
            if (r9 == 0) goto L_0x0744
            int r1 = r9.length()
            if (r1 == 0) goto L_0x0744
            int r1 = r8.length()
            if (r1 == 0) goto L_0x066d
            boolean r1 = r9.equals(r8)
            if (r1 != 0) goto L_0x066d
            java.lang.String r2 = " ("
            r1 = 41
            java.lang.String r9 = X.002.A0h(r9, r2, r8, r1)
        L_0x066d:
            r2 = 2131959600(0x7f131f30, float:1.9555845E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
        L_0x0674:
            java.lang.String r1 = r6.getString(r2, r1)
            X.0qQ.A0A(r1)
            r14.setText(r1)
            r14.setFocusableInTouchMode(r7)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r13.setMovementMethod(r1)
            r1 = 2131959598(0x7f131f2e, float:1.955584E38)
            java.lang.String r9 = r6.getString(r1)
            X.0qQ.A07(r9)
            r2 = 2131959599(0x7f131f2f, float:1.9555843E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r1 = r6.getString(r2, r1)
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            r1 = 2130970246(0x7f040686, float:1.7549197E38)
            int r1 = X.2Yu.A0H(r6, r1)
            int r2 = r6.getColor(r1)
            X.ESj r1 = new X.ESj
            r1.<init>(r6, r3, r2)
            X.AnonymousClass7AV.A04(r8, r1, r9)
            r13.setText(r8)
            r1 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r1 = r15.findViewById(r1)
            r2 = 8
            r1.setVisibility(r2)
            int r1 = r11.A02
            r15.setBackgroundColor(r1)
            r1 = 2131428915(0x7f0b0633, float:1.8479488E38)
            android.view.View r1 = r15.findViewById(r1)
            if (r1 == 0) goto L_0x06d5
            r1.setVisibility(r2)
        L_0x06d5:
            r32.DUt()
            java.lang.String r8 = r12.getId()
            java.lang.String r2 = "direct_thread_toggle"
            X.0xG r1 = new X.0xG
            r1.<init>(r2)
            X.0wc r3 = X.AnonymousClass0kN.A01(r1, r3)
            java.lang.String r2 = "mwb_actor_experience_event"
            X.0kJ r1 = r3.A00
            X.0Aj r3 = r3.A00(r1, r2)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x073d
            java.lang.String r2 = "action"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r3.A8k(r2, r1)
            X.9tO r2 = X.C391629tO.A0D
            java.lang.String r1 = "restriction_type"
            r3.A8M(r2, r1)
            java.lang.String r2 = "id_direct_thread"
            java.lang.String r1 = "surface"
            r3.AAJ(r1, r2)
            X.9ZL r6 = new X.9ZL
            r6.<init>()
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r8)
            if (r1 == 0) goto L_0x0741
            long r1 = r1.longValue()
        L_0x071d:
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "id"
            r6.A05(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            java.lang.String r1 = "is_fbid"
            r6.A03(r1, r2)
            java.lang.String r1 = "other_user"
            r3.AAK(r6, r1)
            r2 = 0
            java.lang.String r1 = "thread_id"
            r3.AAJ(r1, r2)
            r3.Cgf()
        L_0x073d:
            java.lang.Integer r12 = X.AnonymousClass05K.A0E
            goto L_0x00cf
        L_0x0741:
            r1 = -1
            goto L_0x071d
        L_0x0744:
            r2 = 2131959600(0x7f131f30, float:1.9555845E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            goto L_0x0674
        L_0x074d:
            java.lang.String r14 = r5.A08
            boolean r1 = r10.Ca9()
            if (r1 == 0) goto L_0x0835
            int r1 = r10.C6a()
            boolean r1 = X.AnonymousClass48O.A01(r1)
            if (r1 == 0) goto L_0x0835
            java.lang.String r1 = r3.A06
            boolean r1 = r10.Ce4(r1)
            if (r1 == 0) goto L_0x0835
            X.0Tu r15 = X.0Tu.A05
            r1 = 36315881223556754(0x81051a00090e92, double:3.0296477458690006E-306)
            boolean r1 = X.182.A06(r15, r3, r1)
            if (r1 == 0) goto L_0x0835
            java.lang.String r1 = "inbox_new_social_channel"
            boolean r1 = X.0qQ.A0K(r14, r1)
            if (r1 != 0) goto L_0x0784
            java.lang.String r1 = "direct_thread_public_flow_chat"
            boolean r1 = X.0qQ.A0K(r14, r1)
            if (r1 == 0) goto L_0x0835
        L_0x0784:
            X.FYv r2 = X.C69866NtU.A00(r3)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r2.A00 = r1
            java.lang.String r1 = r10.C6C()
            if (r1 == 0) goto L_0x0835
            X.Fm7 r7 = new X.Fm7
            r7.<init>(r3, r10)
            X.FYv r11 = X.C69866NtU.A00(r3)
            java.lang.String r13 = r10.C6C()
            java.lang.String r12 = r10.C6k()
            java.lang.String r2 = "upsell"
            X.0wc r1 = r11.A02
            X.1Ln r8 = X.1Ln.A0F(r1)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r1 = "entrypoint"
            r6.put(r1, r2)
            X.0Aj r1 = r8.A00
            boolean r1 = r1.isSampled()
            if (r1 == 0) goto L_0x07fe
            long r1 = r11.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r8.A0h(r1)
            java.lang.String r1 = "share_to_story_bottom_sheet_rendered"
            r8.A0l(r1)
            java.lang.String r1 = "impression"
            r8.A0k(r1)
            java.lang.String r1 = "share_to_story_button"
            r8.A0p(r1)
            java.lang.String r1 = "share_to_story_bottom_sheet"
            r8.A0q(r1)
            java.lang.String r1 = "instagram"
            r8.A0o(r1)
            r8.A0s(r13)
            if (r12 == 0) goto L_0x0833
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r12)
        L_0x07f0:
            r8.A0i(r1)
            r8.A0w(r6)
            java.lang.String r1 = r11.A00
            r8.A0v(r1)
            r8.Cgf()
        L_0x07fe:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.E17 r6 = new X.E17
            r6.<init>()
            r6.A01 = r10
            int r1 = r10.C6a()
            r6.A00 = r1
            r6.setArguments(r2)
            X.7Pr r1 = new X.7Pr
            r1.<init>(r3)
            r1.A0U = r7
            X.7Pu r3 = r1.A00()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r1)
            X.FuL r1 = new X.FuL
            r1.<init>(r9, r6, r3)
            r2.post(r1)
            java.lang.Integer r12 = X.AnonymousClass05K.A07
            goto L_0x00cf
        L_0x0833:
            r1 = 0
            goto L_0x07f0
        L_0x0835:
            java.lang.String r18 = r10.BZN()
            X.3sQ r14 = r10.Aie()
            if (r14 == 0) goto L_0x08a3
            X.3sQ r1 = X.C254403sQ.UNKNOWN
            if (r14 == r1) goto L_0x08a3
            if (r18 == 0) goto L_0x08a3
            int r1 = r18.length()
            if (r1 == 0) goto L_0x08a3
            X.0Tu r1 = X.0Tu.A05
            r16 = 36312711537099996(0x810238000004dc, double:3.027643223390444E-306)
            r15 = r1
            r1 = r16
            boolean r1 = X.182.A06(r15, r3, r1)
            if (r1 == 0) goto L_0x08a3
            r1 = 2131437190(0x7f0b2686, float:1.8496272E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x08a3
            android.view.View r7 = r1.inflate()
            X.0qQ.A0A(r7)
            r1 = r18
            X.FC3.A01(r7, r14, r1)
            r1 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r6 = r7.findViewById(r1)
            if (r6 == 0) goto L_0x0885
            X.FMu r2 = new X.FMu
            r1 = r32
            r2.<init>(r7, r1)
            X.AnonymousClass0fU.A00(r2, r6)
        L_0x0885:
            int r1 = r11.A02
            r7.setBackgroundColor(r1)
            r2 = 8
            r1 = 2131428915(0x7f0b0633, float:1.8479488E38)
            android.view.View r1 = r7.findViewById(r1)
            if (r1 == 0) goto L_0x0898
            r1.setVisibility(r2)
        L_0x0898:
            r32.DUt()
            X.FC3.A02(r3, r10)
            r10.EY1(r4)
            goto L_0x00cf
        L_0x08a3:
            if (r22 == 0) goto L_0x096b
            X.1Av r1 = X.1Au.A00(r3)
            X.0xa r1 = r1.A01
            java.lang.String r2 = "meta_ai_discovery_nux_seen"
            boolean r1 = r1.getBoolean(r2, r4)
            if (r1 != 0) goto L_0x096b
            r1 = 2131434555(0x7f0b1c3b, float:1.8490927E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x096b
            android.view.View r9 = r1.inflate()
            r1 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r8 = r9.findViewById(r1)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r1 = 2131237680(0x7f081b30, float:1.8091617E38)
            android.graphics.drawable.Drawable r1 = r6.getDrawable(r1)
            r8.setImageDrawable(r1)
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r8 = r9.findViewById(r1)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 2131958783(0x7f131bff, float:1.9554188E38)
            r8.setText(r1)
            r1 = 2132018629(0x7f1405c5, float:1.967557E38)
            r8.setTextAppearance(r1)
            r1 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.view.View r12 = r9.findViewById(r1)
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r12.setMovementMethod(r1)
            r1 = 2131958781(0x7f131bfd, float:1.9554184E38)
            java.lang.String r13 = r6.getString(r1)
            X.0qQ.A07(r13)
            r8 = 2131958782(0x7f131bfe, float:1.9554186E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r13}
            java.lang.String r1 = r6.getString(r8, r1)
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            int r1 = X.2Yu.A06(r6)
            int r19 = r6.getColor(r1)
            X.ESp r1 = new X.ESp
            r14 = r1
            r15 = r21
            r16 = r9
            r17 = r3
            r18 = r32
            r14.<init>(r15, r16, r17, r18, r19)
            X.AnonymousClass7AV.A04(r8, r1, r13)
            r12.setText(r8)
            r1 = 2132018053(0x7f140385, float:1.9674402E38)
            r12.setTextAppearance(r1)
            r1 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r8 = r9.findViewById(r1)
            X.FMt r6 = new X.FMt
            r1 = r32
            r6.<init>(r9, r1)
            X.AnonymousClass0fU.A00(r6, r8)
            int r1 = r11.A02
            r9.setBackgroundColor(r1)
            r32.DUt()
            X.1Av r1 = X.1Au.A00(r3)
            X.0xa r1 = r1.A01
            X.0xY r1 = r1.AR4()
            r1.E5T(r2, r7)
            r1.apply()
            X.7I3 r1 = new X.7I3
            r1.<init>(r3)
            r1.A04()
            java.lang.Integer r12 = X.AnonymousClass05K.A0I
            goto L_0x00cf
        L_0x096b:
            if (r13 == 0) goto L_0x0997
            X.4kA r14 = X.AnonymousClass4k9.A00(r3)
            if (r25 == 0) goto L_0x0997
            X.0xa r2 = r14.A00
            java.lang.String r1 = "product_picker_first_shown_tooltip_impressions"
            int r1 = r2.getInt(r1, r4)
            long r15 = (long) r1
            X.0Tu r12 = X.0Tu.A05
            r1 = 36592502886761046(0x8200b000020256, double:3.204584399545427E-306)
            long r17 = X.182.A01(r12, r3, r1)
            int r1 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r1 >= 0) goto L_0x0997
            X.FvA r1 = new X.FvA
            r1.<init>(r9, r13, r3, r14)
            r13.post(r1)
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            goto L_0x00cf
        L_0x0997:
            if (r19 == 0) goto L_0x09ac
            if (r23 == 0) goto L_0x09ac
            X.F1N r12 = X.C49278EsN.A00
            r2 = 2131969227(0x7f1344cb, float:1.957537E38)
            r1 = r19
            boolean r1 = r12.A00(r9, r1, r3, r2)
            if (r1 == 0) goto L_0x09ac
            java.lang.Integer r12 = X.AnonymousClass05K.A0Y
            goto L_0x00cf
        L_0x09ac:
            if (r13 == 0) goto L_0x09bf
            if (r24 == 0) goto L_0x09bf
            X.F1N r2 = X.C49278EsN.A00
            r1 = 2131969071(0x7f13442f, float:1.9575054E38)
            boolean r1 = r2.A00(r9, r13, r3, r1)
            if (r1 == 0) goto L_0x09bf
            java.lang.Integer r12 = X.AnonymousClass05K.A0j
            goto L_0x00cf
        L_0x09bf:
            boolean r1 = r10.Ca9()
            if (r1 == 0) goto L_0x0a6c
            int r1 = r10.C6a()
            boolean r1 = X.AnonymousClass48O.A01(r1)
            if (r1 == 0) goto L_0x0a6c
            java.util.List r2 = r10.AZs()
            java.lang.String r1 = r3.A06
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0a6c
            X.1Av r1 = X.1Au.A00(r3)
            X.0xa r2 = r1.A01
            java.lang.String r1 = "kindness_reminder_public_chat_shown"
            int r1 = r2.getInt(r1, r4)
            if (r1 >= r7) goto L_0x0a6c
            X.0Tu r12 = X.0Tu.A05
            r1 = 36315881222966926(0x81051a00000e8e, double:3.029647745495991E-306)
            boolean r1 = X.182.A06(r12, r3, r1)
            if (r1 == 0) goto L_0x0a6c
            r1 = 2131437190(0x7f0b2686, float:1.8496272E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x0a6c
            android.view.View r8 = r1.inflate()
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r9 = r8.findViewById(r1)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.view.View r2 = r8.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 2131960539(0x7f1322db, float:1.955775E38)
            java.lang.CharSequence r1 = r6.getText(r1)
            r9.setText(r1)
            r9.setFocusableInTouchMode(r7)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r1)
            android.text.SpannableStringBuilder r1 = X.C48886Elm.A00(r6, r3)
            r2.setText(r1)
            int r1 = r11.A02
            r8.setBackgroundColor(r1)
            r2 = 8
            r1 = 2131428915(0x7f0b0633, float:1.8479488E38)
            android.view.View r1 = r8.findViewById(r1)
            if (r1 == 0) goto L_0x0a45
            r1.setVisibility(r2)
        L_0x0a45:
            r1 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r6 = r8.findViewById(r1)
            X.FNs r2 = new X.FNs
            r1 = r32
            r2.<init>(r8, r3, r1, r10)
            X.AnonymousClass0fU.A00(r2, r6)
            r32.DUt()
            java.lang.String r7 = r10.C6C()
            if (r7 == 0) goto L_0x0a68
            java.lang.String r6 = "kindness_reminder_rendered"
            java.lang.String r2 = "impression"
            java.lang.String r1 = "kindness_reminder_display"
            X.C48954Ems.A00(r3, r7, r6, r2, r1)
        L_0x0a68:
            java.lang.Integer r12 = X.AnonymousClass05K.A15
            goto L_0x00cf
        L_0x0a6c:
            boolean r1 = r10.Ca9()
            if (r1 == 0) goto L_0x0a7e
            int r1 = r10.C6a()
            boolean r1 = X.AnonymousClass48O.A01(r1)
            r19 = 1
            if (r1 != 0) goto L_0x0a80
        L_0x0a7e:
            r19 = 0
        L_0x0a80:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            X.1Av r1 = X.1Au.A00(r3)
            X.0xa r2 = r1.A01
            java.lang.String r18 = "discoverable_chat_entered_date"
            r12 = 0
            r1 = r18
            long r1 = r2.getLong(r1, r12)
            r15 = 0
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x0abb
            java.util.Date r12 = new java.util.Date
            r12.<init>(r1)
            long r16 = java.lang.System.currentTimeMillis()
            java.util.Date r13 = new java.util.Date
            r1 = r16
            r13.<init>(r1)
            X.1G0.A0G(r12, r13, r14)
            X.3gq r1 = X.C247743gq.MONTHS
            java.lang.Object r1 = r14.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0abb
            int r15 = r1.intValue()
        L_0x0abb:
            if (r19 == 0) goto L_0x0b7c
            X.1Av r12 = X.1Au.A00(r3)
            long r1 = java.lang.System.currentTimeMillis()
            X.0xa r12 = r12.A01
            X.0xY r13 = r12.AR4()
            r12 = r18
            r13.E5c(r12, r1)
            r13.apply()
            java.util.List r2 = r10.AZs()
            java.lang.String r1 = r3.A06
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0b7c
            r1 = 6
            if (r15 < r1) goto L_0x0b7c
            X.0Tu r12 = X.0Tu.A05
            r1 = 36315881222966926(0x81051a00000e8e, double:3.029647745495991E-306)
            boolean r1 = X.182.A06(r12, r3, r1)
            if (r1 == 0) goto L_0x0b7c
            r1 = 2131437190(0x7f0b2686, float:1.8496272E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x0b7c
            android.view.View r8 = r1.inflate()
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r2 = r8.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.view.View r9 = r8.findViewById(r1)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131960520(0x7f1322c8, float:1.955771E38)
            java.lang.CharSequence r1 = r6.getText(r1)
            r2.setText(r1)
            r2.setFocusableInTouchMode(r7)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r9.setMovementMethod(r1)
            r1 = 2131960518(0x7f1322c6, float:1.9557707E38)
            java.lang.String r12 = r6.getString(r1)
            X.0qQ.A07(r12)
            r2 = 2131960519(0x7f1322c7, float:1.9557709E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            java.lang.String r1 = r6.getString(r2, r1)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r1)
            int r1 = X.2Yu.A06(r6)
            int r2 = r6.getColor(r1)
            X.ESm r1 = new X.ESm
            r1.<init>(r6, r3, r2)
            X.AnonymousClass7AV.A04(r7, r1, r12)
            r9.setText(r7)
            int r1 = r11.A02
            r8.setBackgroundColor(r1)
            r2 = 8
            r1 = 2131428915(0x7f0b0633, float:1.8479488E38)
            android.view.View r1 = r8.findViewById(r1)
            if (r1 == 0) goto L_0x0b64
            r1.setVisibility(r2)
        L_0x0b64:
            r1 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r3 = r8.findViewById(r1)
            X.FMx r2 = new X.FMx
            r1 = r32
            r2.<init>(r8, r1)
            X.AnonymousClass0fU.A00(r2, r3)
            r32.DUt()
            java.lang.Integer r12 = X.AnonymousClass05K.A1F
            goto L_0x00cf
        L_0x0b7c:
            boolean r1 = r10.Ca9()
            if (r1 == 0) goto L_0x0c4f
            int r1 = r10.C6a()
            boolean r1 = X.AnonymousClass48O.A01(r1)
            if (r1 == 0) goto L_0x0c4f
            java.util.List r2 = r10.AZs()
            java.lang.String r1 = r3.A06
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0c4f
            X.1Av r1 = X.1Au.A00(r3)
            X.0xa r2 = r1.A01
            java.lang.String r1 = "mod_controls_public_chats_nux_shown_count"
            int r1 = r2.getInt(r1, r4)
            if (r1 >= r7) goto L_0x0c4f
            X.0Tu r12 = X.0Tu.A05
            r1 = 36315881222966926(0x81051a00000e8e, double:3.029647745495991E-306)
            boolean r1 = X.182.A06(r12, r3, r1)
            if (r1 == 0) goto L_0x0c4f
            r1 = 2131437190(0x7f0b2686, float:1.8496272E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x0c4f
            android.view.View r8 = r1.inflate()
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r2 = r8.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.view.View r9 = r8.findViewById(r1)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131960548(0x7f1322e4, float:1.9557768E38)
            java.lang.CharSequence r1 = r6.getText(r1)
            r2.setText(r1)
            r2.setFocusableInTouchMode(r7)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r9.setMovementMethod(r1)
            r1 = 2131960547(0x7f1322e3, float:1.9557766E38)
            java.lang.String r12 = r6.getString(r1)
            X.0qQ.A07(r12)
            r2 = 2131960546(0x7f1322e2, float:1.9557764E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            java.lang.String r1 = r6.getString(r2, r1)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r1)
            int r1 = X.2Yu.A06(r6)
            int r2 = r6.getColor(r1)
            X.ESk r1 = new X.ESk
            r1.<init>(r6, r3, r2)
            X.AnonymousClass7AV.A04(r7, r1, r12)
            r9.setText(r7)
            int r1 = r11.A02
            r8.setBackgroundColor(r1)
            r1 = 2131428915(0x7f0b0633, float:1.8479488E38)
            android.view.View r2 = r8.findViewById(r1)
            if (r2 == 0) goto L_0x0c28
            r1 = 8
            r2.setVisibility(r1)
        L_0x0c28:
            r1 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r6 = r8.findViewById(r1)
            X.FNt r2 = new X.FNt
            r1 = r32
            r2.<init>(r8, r3, r1, r10)
            X.AnonymousClass0fU.A00(r2, r6)
            java.lang.String r7 = r10.C6C()
            if (r7 == 0) goto L_0x0c48
            java.lang.String r6 = "moderation_controls_rendered"
            java.lang.String r2 = "impression"
            java.lang.String r1 = "moderation_controls_display"
            X.C48954Ems.A00(r3, r7, r6, r2, r1)
        L_0x0c48:
            r32.DUt()
            java.lang.Integer r12 = X.AnonymousClass05K.A1I
            goto L_0x00cf
        L_0x0c4f:
            X.78s r12 = X.C3269378s.A00
            boolean r1 = X.C3269378s.A05(r3, r10)
            if (r1 == 0) goto L_0x0c7e
            r1 = 2131430810(0x7f0b0d9a, float:1.8483331E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x0c7e
            android.view.View r14 = r1.inflate()
            X.0qQ.A0A(r14)
            r13 = r6
            r15 = r3
            r16 = r11
            r17 = r10
            r12.A08(r13, r14, r15, r16, r17)
            r32.DUt()
            X.C3269378s.A02(r3, r10)
            r1 = r20
            r5.A00 = r1
            goto L_0x00d1
        L_0x0c7e:
            X.78x r14 = X.C3269878x.A00
            r2 = 1
            int r1 = r10.C6a()
            boolean r1 = X.AnonymousClass48O.A02(r1)
            if (r1 == r7) goto L_0x0c8c
            r2 = 0
        L_0x0c8c:
            java.lang.String r1 = r10.AsX()
            java.lang.String r12 = r3.A06
            boolean r1 = X.00p.A0j(r1, r12, r4)
            if (r2 == 0) goto L_0x0cca
            if (r1 == 0) goto L_0x0cca
            X.0Tu r13 = X.0Tu.A05
            r1 = 36328542786633124(0x81109e00013da4, double:3.037654969342519E-306)
            boolean r1 = X.182.A06(r13, r3, r1)
            if (r1 == 0) goto L_0x0cca
            r1 = 2131430810(0x7f0b0d9a, float:1.8483331E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x0cca
            android.view.View r16 = r1.inflate()
            X.0qQ.A0A(r16)
            r15 = r6
            r17 = r3
            r18 = r11
            r19 = r10
            r14.A00(r15, r16, r17, r18, r19)
            r32.DUt()
            java.lang.Integer r12 = X.AnonymousClass05K.A0D
            goto L_0x00cf
        L_0x0cca:
            java.lang.String r13 = r10.C6C()
            if (r13 == 0) goto L_0x0d28
            boolean r1 = X.C329997La.A07(r10, r12)
            if (r1 == 0) goto L_0x0d28
            X.1Av r1 = X.1Au.A00(r3)
            X.0xa r2 = r1.A01
            java.lang.String r1 = "broadcast_channel_share_to_story_for_collaborator_bottom_sheet"
            java.lang.String r1 = X.002.A0R(r1, r13)
            boolean r1 = r2.getBoolean(r1, r4)
            if (r1 != 0) goto L_0x0d28
            java.lang.String r1 = r10.C6C()
            if (r1 == 0) goto L_0x0d28
            X.AgP r7 = new X.AgP
            r7.<init>(r3, r1)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.E17 r6 = new X.E17
            r6.<init>()
            r6.A01 = r10
            int r1 = r10.C6a()
            r6.A00 = r1
            r6.setArguments(r2)
            X.7Pr r1 = new X.7Pr
            r1.<init>(r3)
            r1.A0U = r7
            X.7Pu r3 = r1.A00()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r1)
            X.FuK r1 = new X.FuK
            r1.<init>(r9, r6, r3)
            r2.post(r1)
            java.lang.Integer r12 = X.AnonymousClass05K.A08
            goto L_0x00cf
        L_0x0d28:
            int r9 = r10.C6a()
            boolean r2 = r10.isPending()
            boolean r1 = r10.Car()
            boolean r1 = X.AnonymousClass7BC.A00(r9, r7, r2, r1, r4)
            if (r1 == 0) goto L_0x0d41
            boolean r1 = r10.Axj()
            r14 = 1
            if (r1 == 0) goto L_0x0d42
        L_0x0d41:
            r14 = 0
        L_0x0d42:
            X.2Dm r9 = X.1bJ.A00(r3)
            X.3sy r1 = r10.BJz()
            com.instagram.model.direct.DirectThreadKey r2 = X.C66647MaG.A04(r1)
            if (r2 == 0) goto L_0x0e29
            X.3su r13 = r9.BLN(r2)
            if (r13 == 0) goto L_0x0e29
            boolean r1 = X.AnonymousClass7BC.A01(r13)
            if (r1 == 0) goto L_0x0d79
            boolean r1 = r13.A1T()
            if (r1 != 0) goto L_0x0d79
            java.lang.String r1 = r13.BsI()
            boolean r1 = X.0qQ.A0K(r12, r1)
            if (r1 == 0) goto L_0x0d79
            java.util.ArrayList r1 = r9.Aax(r2, r4)
            int r9 = r1.size()
            r2 = 10
            r1 = 1
            if (r9 >= r2) goto L_0x0d7a
        L_0x0d79:
            r1 = 0
        L_0x0d7a:
            if (r14 == 0) goto L_0x0e29
            if (r1 == 0) goto L_0x0e29
            X.4kA r9 = X.AnonymousClass4k9.A00(r3)
            X.0s0 r2 = r9.A0E
            X.0YZ[] r14 = X.AnonymousClass4kA.A0c
            r13 = 25
            r1 = r14[r13]
            java.lang.Object r1 = r2.CDM(r9, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            r1 = 2
            if (r2 >= r1) goto L_0x0e29
            X.7IS r9 = new X.7IS
            r9.<init>(r3)
            r1 = 2131434555(0x7f0b1c3b, float:1.8490927E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x0e29
            android.view.View r12 = r1.inflate()
            r1 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r2 = r12.findViewById(r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1 = 2131237570(0x7f081ac2, float:1.8091394E38)
            android.graphics.drawable.Drawable r1 = r6.getDrawable(r1)
            r2.setImageDrawable(r1)
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r2 = r12.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 2131961461(0x7f132675, float:1.955962E38)
            r2.setText(r1)
            r1 = 2132018629(0x7f1405c5, float:1.967557E38)
            r2.setTextAppearance(r1)
            r1 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.view.View r2 = r12.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 2131961460(0x7f132674, float:1.9559618E38)
            r2.setText(r1)
            r1 = 2132018053(0x7f140385, float:1.9674402E38)
            r2.setTextAppearance(r1)
            r1 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r6 = r12.findViewById(r1)
            X.Oiz r2 = new X.Oiz
            r1 = r32
            r2.<init>(r8, r9, r1, r10)
            X.AnonymousClass0fU.A00(r2, r6)
            int r1 = r11.A02
            r12.setBackgroundColor(r1)
            X.3sy r1 = r10.BJz()
            r9.A00(r1, r7)
            X.4kA r6 = X.AnonymousClass4k9.A00(r3)
            X.0s0 r3 = r6.A0E
            r1 = r14[r13]
            java.lang.Object r1 = r3.CDM(r6, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + 1
            r2 = r14[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.Epx(r6, r1, r2)
            r32.DUt()
            java.lang.Integer r12 = X.AnonymousClass05K.A0G
            goto L_0x00cf
        L_0x0e29:
            X.0Tu r9 = X.0Tu.A05
            r1 = 36330986622960489(0x8112d700004369, double:3.039200461276484E-306)
            boolean r1 = X.182.A06(r9, r3, r1)
            if (r1 == 0) goto L_0x0e56
            boolean r1 = r10.CUG()
            if (r1 != 0) goto L_0x0ea7
            boolean r1 = r10.CbX()
            if (r1 != 0) goto L_0x0ea7
            boolean r1 = r10.Aud()
            if (r1 == 0) goto L_0x0ea7
            X.16V r2 = X.AnonymousClass0eD.A01(r3)
            X.16V r1 = X.16V.A06
            if (r2 != r1) goto L_0x0ea7
            boolean r1 = X.C271174i4.A01(r3)
            if (r1 == 0) goto L_0x0ea7
        L_0x0e56:
            com.instagram.user.model.User r12 = r10.BZK()
            if (r12 == 0) goto L_0x0ea7
            java.lang.String r14 = r10.BZP()
            if (r14 == 0) goto L_0x0ea7
            X.1Av r1 = X.1Au.A00(r3)
            X.0xa r2 = r1.A01
            java.lang.String r13 = "direct_open_to_collab_nux/"
            java.lang.String r1 = X.002.A0R(r13, r14)
            boolean r1 = r2.getBoolean(r1, r4)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0ea7
            r1 = 36330986623026026(0x8112d70001436a, double:3.03920046131793E-306)
            boolean r1 = X.182.A06(r9, r3, r1)
            if (r1 == 0) goto L_0x0e9d
            X.1Av r1 = X.1Au.A00(r3)
            java.lang.String r14 = r10.BZP()
            if (r14 != 0) goto L_0x0e8d
            java.lang.String r14 = ""
        L_0x0e8d:
            X.0xa r1 = r1.A01
            X.0xY r2 = r1.AR4()
            java.lang.String r1 = X.002.A0R(r13, r14)
            r2.E5T(r1, r7)
            r2.apply()
        L_0x0e9d:
            X.788 r2 = new X.788
            r2.<init>(r5, r11, r10)
            java.lang.String r1 = "direct_thread"
            X.AnonymousClass78A.A00(r3, r2, r12, r1, r7)
        L_0x0ea7:
            X.78z r18 = new X.78z
            r1 = r18
            r1.<init>(r5)
            X.02m r5 = X.02m.A0p
            r13 = 190451680(0xb5a0fe0, float:4.1997216E-32)
            r1 = 30000(0x7530, double:1.4822E-319)
            r5.A0h(r13, r1)
            X.790 r14 = new X.790
            r14.<init>(r3)
            java.lang.String r12 = r10.C6C()
            java.util.List r15 = r10.BRZ()
            boolean r17 = r10.CUG()
            int r16 = r10.C6a()
            boolean r1 = r10.CJZ()
            X.791 r5 = new X.791
            r19 = r5
            r20 = r6
            r21 = r8
            r22 = r3
            r23 = r32
            r24 = r18
            r25 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.0qQ.A0B(r15, r7)
            if (r1 == 0) goto L_0x0efe
            com.instagram.common.session.UserSession r3 = r14.A00
            r1 = 36313669315004607(0x810317000308bf, double:3.028248925993982E-306)
            boolean r1 = X.182.A06(r9, r3, r1)
            if (r1 == 0) goto L_0x0efe
        L_0x0ef6:
            X.02m r2 = X.02m.A0p
            r1 = 2
            r2.markerEnd(r13, r1)
            goto L_0x00d1
        L_0x0efe:
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto L_0x0ef6
            if (r17 != 0) goto L_0x0ef6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            boolean r1 = X.AnonymousClass48O.A06(r1)
            if (r1 != 0) goto L_0x0ef6
            com.instagram.common.session.UserSession r6 = r14.A00
            X.1Av r2 = X.1Au.A00(r6)
            java.lang.Object r1 = r15.get(r4)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r3 = r1.getId()
            X.0xa r2 = r2.A01
            java.lang.String r1 = "kindness_reminder_prefix/"
            java.lang.String r1 = X.002.A0R(r1, r3)
            int r1 = r2.getInt(r1, r4)
            if (r1 >= r7) goto L_0x0ef6
            java.lang.Object r8 = r15.get(r4)
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            X.Fbb r3 = new X.Fbb
            r3.<init>(r5, r14, r8, r12)
            X.0qQ.A0B(r8, r7)
            boolean r1 = r8.A2B()
            if (r1 == 0) goto L_0x0f56
            X.EBI r2 = new X.EBI
            r2.<init>(r6, r3, r8)
            java.lang.String r1 = r8.getId()
            X.1OC r1 = X.C320126ro.A02(r6, r1, r4)
            r1.A00 = r2
            X.1ES.A03(r1)
            goto L_0x00d1
        L_0x0f56:
            boolean r1 = r8.A2A()
            if (r1 != 0) goto L_0x00d1
            java.lang.String r1 = ""
            X.AnonymousClass78A.A00(r6, r3, r8, r1, r4)
            goto L_0x00d1
        L_0x0f63:
            r23 = 0
            goto L_0x0084
        L_0x0f67:
            r24 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3268978o.run():void");
    }
}
