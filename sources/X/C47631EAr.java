package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EAr  reason: case insensitive filesystem */
public final class C47631EAr extends C231632rz {
    public final F07 A00;
    public final Activity A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final EEF A05;
    public final String A06;

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0307, code lost:
        if (r19 >= 86400000) goto L_0x018d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r29, android.view.View r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            r28 = this;
            r8 = r32
            r0 = -723762981(0xffffffffd4dc40db, float:-7.5678472E12)
            int r24 = X.AnonymousClass0fD.A03(r0)
            r23 = 1
            r1 = r30
            r0 = r23
            int r16 = X.DbW.A03(r0, r1, r8)
            r2 = r28
            android.content.Context r7 = r2.A02
            android.app.Activity r12 = r2.A01
            com.instagram.common.session.UserSession r6 = r2.A04
            X.0iw r0 = r2.A03
            r27 = r0
            java.lang.Object r5 = r1.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.user.recommended.adapter.row.FindPeopleButtonsRowViewBinder.Holder"
            X.0qQ.A0C(r5, r0)
            X.F0n r5 = (X.C49656F0n) r5
            X.F2L r8 = (X.F2L) r8
            X.EEF r4 = r2.A05
            X.F07 r11 = r2.A00
            java.lang.String r0 = r2.A06
            r26 = r0
            r3 = 0
            X.0qQ.A0B(r7, r3)
            r0 = r23
            X.AnonymousClass7TF.A1B(r12, r0, r6)
            r1 = r27
            r0 = r16
            X.0qQ.A0B(r1, r0)
            X.AnonymousClass7TG.A1R(r5, r8)
            r0 = 6
            X.0qQ.A0B(r4, r0)
            r2 = 8
            r0 = r26
            X.0qQ.A0B(r0, r2)
            android.view.View r0 = r5.A00
            r25 = r0
            r0.setVisibility(r2)
            java.util.concurrent.atomic.AtomicInteger r22 = new java.util.concurrent.atomic.AtomicInteger
            r0 = r22
            r0.<init>(r3)
            X.2Ly r9 = X.2Lv.A00(r6)
            java.lang.Class<X.FRQ> r0 = X.FRQ.class
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r0 = "ig_android_linking_cache_suggested_userse"
            boolean r13 = r9.A00(r1, r0)
            r0 = 36327022368143485(0x810f3c0000387d, double:3.036693450567438E-306)
            X.1AA r10 = X.182.A02(r6, r0)
            if (r10 == 0) goto L_0x0325
            X.0Tu r9 = X.0Tu.A04
            boolean r1 = r10.Ah0(r9, r0)
            r0 = r23
            if (r1 != r0) goto L_0x0325
        L_0x0085:
            com.instagram.share.facebook.widget.FindPeopleButton r9 = r5.A05
            r9.setVisibility(r2)
        L_0x008a:
            boolean r21 = r8.A00()
            if (r21 == 0) goto L_0x031e
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x031e
            X.FYf r14 = X.C48924EmO.A00(r6)
            com.instagram.common.session.UserSession r13 = r14.A01
            X.0Tu r10 = X.0Tu.A06
            r0 = 2342157464507583031(0x208103ce00010a37, double:4.060884439799541E-152)
            boolean r0 = X.182.A06(r10, r13, r0)
            if (r0 != 0) goto L_0x031e
            boolean r0 = r14.A00
            if (r0 == 0) goto L_0x031e
            r0 = 36314455293823542(0x8103ce00000a36, double:3.028745982163959E-306)
            boolean r0 = X.182.A06(r10, r13, r0)
            if (r0 == 0) goto L_0x031e
            X.EZu r1 = X.C48152EZu.A04
            java.lang.String r0 = "upsell_impressions"
            X.FFL.A00(r1, r6, r0)
            r0 = r25
            r0.setVisibility(r3)
            com.instagram.share.facebook.widget.FindPeopleButton r10 = r5.A07
            r10.setVisibility(r3)
            r0 = 34
            X.FP4 r0 = X.FP4.A00(r4, r0)
            r10.setActionButtonOnClickListener(r0)
            r22.incrementAndGet()
        L_0x00d3:
            if (r21 == 0) goto L_0x0317
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0317
            X.0Tu r13 = X.0Tu.A05
            r0 = 36314859022846801(0x81042c00200b51, double:3.0290013020239545E-306)
            boolean r0 = X.182.A06(r13, r6, r0)
            if (r0 == 0) goto L_0x0317
            com.instagram.user.model.User r15 = X.AnonymousClass7TF.A0Q(r6)
            com.instagram.share.facebook.widget.FindPeopleButton r14 = r5.A06
            com.instagram.common.typedurl.ImageUrl r1 = r15.Bh3()
            r0 = r27
            r14.setAvatar(r1, r0)
            r1 = 15
            X.FP7 r0 = new X.FP7
            r0.<init>((int) r1, (java.lang.Object) r12, (java.lang.Object) r4)
            r14.setActionButtonOnClickListener(r0)
            r14.setDismissButtonEnabled(r3)
            boolean r0 = r15.A2L()
            if (r0 == 0) goto L_0x0119
            r0 = 36314859022912338(0x81042c00210b52, double:3.0290013020654004E-306)
            boolean r0 = X.182.A06(r13, r6, r0)
            if (r0 == 0) goto L_0x0119
            r0 = 2131973515(0x7f13558b, float:1.9584068E38)
            r14.setSubtitle((int) r0)
        L_0x0119:
            if (r11 == 0) goto L_0x0135
            X.EWD r0 = X.EWD.DISCOVER_PEOPLE
            X.0qQ.A0B(r0, r3)
            X.2oe r1 = r11.A04
            java.lang.String r0 = "discover_people"
            X.30Y r1 = r1.A00(r0)
            X.30Y r0 = X.AnonymousClass30Y.A07
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0135
            X.2el r0 = r11.A03
            r0.A05(r14, r1)
        L_0x0135:
            r22.incrementAndGet()
        L_0x0138:
            boolean r0 = X.C267044ar.A00(r7, r6)
            if (r0 == 0) goto L_0x030b
            java.lang.Integer r11 = r8.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r11 == r0) goto L_0x030b
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            if (r11 != r15) goto L_0x018d
            X.1Av r0 = X.1Au.A00(r6)
            long r19 = java.lang.System.currentTimeMillis()
            X.0xa r12 = r0.A01
            java.lang.String r0 = "last_time_dismissed_ci_find_people_button_follow_list"
            long r0 = X.DbW.A06(r12, r0)
            long r19 = r19 - r0
            java.lang.String r14 = "num_times_dismissed_ci_find_people_button_follow_list"
            int r1 = r12.getInt(r14, r3)
            r0 = r16
            if (r1 < r0) goto L_0x0302
            X.0Tu r13 = X.0Tu.A05
            r16 = 36321344421438761(0x810a1200012529, double:3.033102694208114E-306)
            r0 = r16
            boolean r0 = X.182.A06(r13, r6, r0)
            if (r0 == 0) goto L_0x030b
            java.util.concurrent.TimeUnit r18 = java.util.concurrent.TimeUnit.DAYS
            r16 = 36602819398079291(0x820a120000133b, double:3.211108602844342E-306)
            r0 = r16
            long r0 = X.182.A01(r13, r6, r0)
            r13 = r18
            long r16 = r13.toMillis(r0)
            int r0 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x030b
            X.AnonymousClass7TG.A1M(r12, r14, r3)
        L_0x018d:
            if (r21 == 0) goto L_0x02a3
            X.0Tu r12 = X.0Tu.A05
            r0 = 36325738172986539(0x810e11000134ab, double:3.035881320379146E-306)
            boolean r0 = X.182.A06(r12, r6, r0)
            if (r0 == 0) goto L_0x02a3
            com.instagram.share.facebook.widget.FindPeopleButton r11 = r5.A03
            r11.setVisibility(r2)
            r12 = 2131974648(0x7f1359f8, float:1.9586366E38)
            r1 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r0 = r7.getString(r1)
            java.lang.String r13 = X.DbY.A0c(r7, r0, r12)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r7, r1)
            X.EX9 r12 = X.EX9.REVISED_INLINE_UPSELL
            android.text.SpannableString r15 = new android.text.SpannableString
            r15.<init>(r13)
            X.DjS r16 = new X.DjS
            r17 = r7
            r18 = r27
            r19 = r6
            r20 = r12
            r21 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            int r0 = r13.length()
            int r0 = r0 + -1
            int r14 = X.00l.A07(r13, r1, r0)
            int r13 = r1.length()
            int r13 = r13 + r14
            r1 = 33
            r0 = r16
            r15.setSpan(r0, r14, r13, r1)
            r0 = 2130970246(0x7f040686, float:1.7549197E38)
            int r0 = X.AnonymousClass7TF.A03(r7, r0)
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            r7.<init>(r0)
            r15.setSpan(r7, r14, r13, r1)
            android.widget.LinearLayout r13 = r5.A02
            r0 = 2131436062(0x7f0b221e, float:1.8493984E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r13, r0)
            X.DbX.A1G(r0, r15)
            r0 = 2131436065(0x7f0b2221, float:1.849399E38)
            android.view.View r7 = r13.findViewById(r0)
            r1 = 14
            r0 = r22
            X.FP7.A00(r7, r1, r4, r0)
            r0 = r25
            r0.setVisibility(r3)
            r13.setVisibility(r3)
        L_0x0210:
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0232
            r0 = r23
            r4.A00 = r0
            X.0iw r1 = r4.A03
            com.instagram.common.session.UserSession r0 = r4.A04
            X.6cm r13 = new X.6cm
            r13.<init>(r1, r0)
            r13.A00()
            X.EX9 r0 = X.EX9.REVISED_INLINE_UPSELL
            if (r12 != r0) goto L_0x02a0
            java.lang.String r7 = r4.A07
        L_0x022a:
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r13.A01(r0, r1, r7)
        L_0x0232:
            r22.incrementAndGet()
        L_0x0235:
            java.lang.Integer r1 = r8.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x023f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x029a
        L_0x023f:
            java.lang.String r1 = "su_in_stories"
            r0 = r26
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0256
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318685836679544(0x8107a700011978, double:3.0314213945011236E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 == 0) goto L_0x029a
        L_0x0256:
            r0 = r25
            r0.setVisibility(r3)
            com.instagram.share.facebook.widget.FindPeopleButton r1 = r5.A04
            r1.setVisibility(r3)
            r1.setChevronButtonVisibility(r3)
            r0 = 35
            X.FP4.A01(r1, r0, r4)
            r22.incrementAndGet()
        L_0x026b:
            android.view.View r0 = r5.A01
            r2 = 2
            r0.setImportantForAccessibility(r2)
            int r1 = r10.getVisibility()
            r0 = 2
            if (r1 != 0) goto L_0x0279
            r0 = 1
        L_0x0279:
            r10.setImportantForAccessibility(r0)
            int r1 = r9.getVisibility()
            r0 = 2
            if (r1 != 0) goto L_0x0284
            r0 = 1
        L_0x0284:
            r9.setImportantForAccessibility(r0)
            int r0 = r11.getVisibility()
            if (r0 != 0) goto L_0x028e
            r2 = 1
        L_0x028e:
            r11.setImportantForAccessibility(r2)
            r1 = 400887825(0x17e51011, float:1.4802834E-24)
            r0 = r24
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x029a:
            com.instagram.share.facebook.widget.FindPeopleButton r0 = r5.A04
            r0.setVisibility(r2)
            goto L_0x026b
        L_0x02a0:
            java.lang.String r7 = r4.A08
            goto L_0x022a
        L_0x02a3:
            android.widget.LinearLayout r0 = r5.A02
            r0.setVisibility(r2)
            if (r11 != r15) goto L_0x02be
            com.instagram.share.facebook.widget.FindPeopleButton r1 = r5.A03
            r0 = 2131969337(0x7f134539, float:1.9575594E38)
            r1.setTitle((int) r0)
            r0 = 2131969338(0x7f13453a, float:1.9575596E38)
            r1.setSubtitle((int) r0)
            r0 = 2131974910(0x7f135afe, float:1.9586897E38)
            r1.setButtonText((int) r0)
        L_0x02be:
            r0 = r25
            r0.setVisibility(r3)
            com.instagram.share.facebook.widget.FindPeopleButton r11 = r5.A03
            r11.setVisibility(r3)
            r1 = 16
            X.FP7 r0 = new X.FP7
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r8)
            r11.setActionButtonOnClickListener(r0)
            boolean r0 = r8.A01
            r11.setDismissButtonEnabled(r0)
            X.FO6 r0 = new X.FO6
            r12 = r0
            r13 = r1
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r11.setDismissButtonOnClickListener(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            com.instagram.discoverpeople.model.FindPeopleButtonOverride r1 = r4.A00(r0)
            if (r1 == 0) goto L_0x02fe
            java.lang.String r0 = r1.A02
            r11.setTitle((java.lang.String) r0)
            java.lang.String r0 = r1.A01
            r11.setSubtitle((java.lang.String) r0)
            java.lang.String r0 = r1.A00
            r11.setButtonText((java.lang.String) r0)
        L_0x02fe:
            X.EX9 r12 = X.EX9.INLINE_UPSELL
            goto L_0x0210
        L_0x0302:
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x030b
            goto L_0x018d
        L_0x030b:
            com.instagram.share.facebook.widget.FindPeopleButton r11 = r5.A03
            r11.setVisibility(r2)
            android.widget.LinearLayout r0 = r5.A02
            r0.setVisibility(r2)
            goto L_0x0235
        L_0x0317:
            com.instagram.share.facebook.widget.FindPeopleButton r0 = r5.A06
            r0.setVisibility(r2)
            goto L_0x0138
        L_0x031e:
            com.instagram.share.facebook.widget.FindPeopleButton r10 = r5.A07
            r10.setVisibility(r2)
            goto L_0x00d3
        L_0x0325:
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x0085
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0085
            if (r13 != 0) goto L_0x0085
            X.0Tu r9 = X.0Tu.A05
            r0 = 36321576349804056(0x810a4800032618, double:3.033249366640227E-306)
            boolean r0 = X.182.A06(r9, r6, r0)
            if (r0 != 0) goto L_0x0085
            r0 = r25
            r0.setVisibility(r3)
            com.instagram.share.facebook.widget.FindPeopleButton r9 = r5.A05
            r9.setVisibility(r3)
            r0 = 33
            X.FP4 r0 = X.FP4.A00(r4, r0)
            r9.setActionButtonOnClickListener(r0)
            boolean r0 = r8.A01
            r9.setDismissButtonEnabled(r0)
            r1 = 65
            X.FPH r0 = new X.FPH
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r8)
            r9.setDismissButtonOnClickListener(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            com.instagram.discoverpeople.model.FindPeopleButtonOverride r1 = r4.A00(r0)
            if (r1 == 0) goto L_0x0377
            java.lang.String r0 = r1.A02
            r9.setTitle((java.lang.String) r0)
            java.lang.String r0 = r1.A01
            r9.setSubtitle((java.lang.String) r0)
            java.lang.String r0 = r1.A00
            r9.setButtonText((java.lang.String) r0)
        L_0x0377:
            r22.incrementAndGet()
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47631EAr.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r6, Object obj, Object obj2) {
        F07 f07;
        F2L f2l = (F2L) obj2;
        0qQ.A0B(f2l, 2);
        if (r6 != null) {
            r6.A7U(0);
        }
        if (f2l.A00() && (f07 = this.A00) != null) {
            EWD ewd = EWD.DISCOVER_PEOPLE;
            0qQ.A0B(ewd, 0);
            f07.A04.A01(DbU.A0a(f07.A00, AnonymousClass30Y.A00(ewd, C60340gF.A00, "discover_people")), "discover_people");
        }
    }

    public C47631EAr(Activity activity, Context context, F07 f07, AnonymousClass0iw r4, UserSession userSession, EEF eef, String str) {
        this.A02 = context;
        this.A01 = activity;
        this.A04 = userSession;
        this.A03 = r4;
        this.A05 = eef;
        this.A00 = f07;
        this.A06 = str;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        UserSession userSession;
        C48152EZu eZu;
        int A032 = AnonymousClass0fD.A03(691585626);
        EXN exn = this.A05.A05;
        if (exn == EXN.NUX_DISCOVER_PEOPLE_SCREEN) {
            userSession = this.A04;
            eZu = C48152EZu.A0J;
        } else {
            if (exn == EXN.FOLLOW_PEOPLE) {
                userSession = this.A04;
                eZu = C48152EZu.A03;
            }
            View A08 = DbU.A08(LayoutInflater.from(this.A02), R.layout.row_find_people_buttons);
            0qQ.A0A(A08);
            A08.setTag(new C49656F0n(A08));
            AnonymousClass0fD.A0A(1886523137, A032);
            return A08;
        }
        FFL.A00(eZu, userSession, "upsell_impressions");
        View A082 = DbU.A08(LayoutInflater.from(this.A02), R.layout.row_find_people_buttons);
        0qQ.A0A(A082);
        A082.setTag(new C49656F0n(A082));
        AnonymousClass0fD.A0A(1886523137, A032);
        return A082;
    }
}
