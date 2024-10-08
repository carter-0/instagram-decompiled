package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.user.model.UpcomingEvent;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class K6D extends AnonymousClass4DH implements AnonymousClass4DR, C74441Puw {
    public static final long A08 = TimeUnit.MINUTES.toMillis(45);
    public static final long A09 = TimeUnit.DAYS.toMillis(30);
    public static final long A0A = TimeUnit.DAYS.toMillis(90);
    public static final long A0B = TimeUnit.MINUTES.toMillis(5);
    public static final long A0C = TimeUnit.MINUTES.toMillis(60);
    public static final String __redex_internal_original_name = "UpcomingEventCreationFragment";
    public OVW A00;
    public C63670L2g A01;
    public LBP A02;
    public C60952JuA A03;
    public LO9 A04;
    public KWU A05;
    public MUQ A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void D9d() {
    }

    public final String getModuleName() {
        return "upcoming_event_creation";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        if (r3 == X.C62569Khz.A05) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r9 = 0
            X.0qQ.A0B(r11, r9)
            super.onViewCreated(r11, r12)
            X.LBP r0 = new X.LBP
            r0.<init>(r11)
            r10.A02 = r0
            android.content.Context r2 = r10.requireContext()
            X.0eM r0 = r10.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.LBP r0 = r10.A02
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "viewHolder"
        L_0x001e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0026:
            X.LO9 r8 = new X.LO9
            r8.<init>(r2, r1, r10, r0)
            r10.A04 = r8
            X.JuA r7 = r10.A03
            if (r7 != 0) goto L_0x0034
            java.lang.String r0 = "viewState"
            goto L_0x001e
        L_0x0034:
            X.Khz r3 = r7.A00
            X.LBP r6 = r8.A03
            com.instagram.actionbar.ActionButton r2 = r6.A0D
            r0 = 2131238069(0x7f081cb5, float:1.8092406E38)
            r2.setButtonResource(r0)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r2)
            int r0 = X.1QE.A04(r1)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            X.DbU.A12(r1, r2, r0)
            r0 = 17
            X.LY5.A01(r2, r0, r8)
            android.widget.ImageView r1 = r6.A05
            r0 = 18
            X.LY5.A01(r1, r0, r8)
            android.widget.TextView r2 = r6.A09
            android.content.Context r5 = r8.A01
            X.Khz r0 = X.C62569Khz.UPCOMING_EVENT_EDIT
            if (r3 == r0) goto L_0x0070
            X.Khz r1 = X.C62569Khz.FOLLOWERS_SHARE
            r0 = 2131971951(0x7f134f6f, float:1.9580896E38)
            if (r3 != r1) goto L_0x0073
        L_0x0070:
            r0 = 2131971952(0x7f134f70, float:1.9580898E38)
        L_0x0073:
            X.DbT.A18(r5, r2, r0)
            java.lang.String r3 = r7.A02
            android.widget.EditText r2 = r6.A04
            r1 = 2
            X.LWO r0 = new X.LWO
            r0.<init>(r1, r2, r8)
            r8.A00 = r0
            r2.addTextChangedListener(r0)
            r2.setText(r3)
            java.util.Date r4 = r7.A04
            java.util.Date r3 = r7.A03
            android.view.View r2 = r6.A02
            r0 = 19
            X.LY5.A01(r2, r0, r8)
            android.view.View r1 = r6.A01
            r0 = 20
            X.LY5.A01(r1, r0, r8)
            r8.A01(r4, r3)
            X.2eS.A01(r2)
            X.2eS.A01(r1)
            com.instagram.user.model.UpcomingEvent r0 = r7.A01
            android.view.View r2 = r6.A00
            if (r0 == 0) goto L_0x00c9
            r2.setVisibility(r9)
            r1 = 55
            X.LY7 r0 = new X.LY7
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r8)
            X.AnonymousClass0fU.A00(r0, r2)
            X.2eS.A01(r2)
        L_0x00b9:
            boolean r2 = r7.A06
            android.widget.TextView r1 = r6.A0B
            r0 = 2131971948(0x7f134f6c, float:1.958089E38)
            if (r2 == 0) goto L_0x00c5
            r0 = 2131971949(0x7f134f6d, float:1.9580892E38)
        L_0x00c5:
            X.DbT.A18(r5, r1, r0)
            return
        L_0x00c9:
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6D.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(ActionButton actionButton, K6D k6d) {
        C60952JuA juA = k6d.A03;
        if (juA == null) {
            0qQ.A0F("viewState");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean z = true;
        if (!(!00l.A0W(juA.A02)) || juA.A04 == null) {
            z = false;
        }
        actionButton.setEnabled(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C268654dm r4, X.K6D r5, java.lang.String r6) {
        /*
            boolean r0 = r4 instanceof X.C268664dn
            java.lang.String r3 = "viewBinder"
            if (r0 != 0) goto L_0x0037
            boolean r0 = r4 instanceof X.C268674do
            if (r0 == 0) goto L_0x0041
            X.4do r4 = (X.C268674do) r4
            java.lang.Object r0 = r4.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            java.lang.String r2 = r0.getErrorMessage()
            if (r2 == 0) goto L_0x0037
            X.LO9 r0 = r5.A04
            if (r0 == 0) goto L_0x0046
            X.1xC r1 = X.1xC.A01
            X.6ap r0 = X.DbV.A0X()
            r0.A0H = r6
            r0.A0D = r2
            r0.A06()
            X.DbY.A1K(r1, r0)
        L_0x002a:
            X.LO9 r0 = r5.A04
            if (r0 == 0) goto L_0x0046
            X.LBP r0 = r0.A03
            com.instagram.actionbar.ActionButton r1 = r0.A0D
            r0 = 0
            r1.setDisplayedChild(r0)
            return
        L_0x0037:
            X.LO9 r0 = r5.A04
            if (r0 == 0) goto L_0x0046
            android.content.Context r0 = r0.A01
            X.C59689JTv.A0D(r0, r6)
            goto L_0x002a
        L_0x0041:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0046:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6D.A01(X.4dm, X.K6D, java.lang.String):void");
    }

    public static final void A02(K6D k6d) {
        C60952JuA juA = k6d.A03;
        if (juA == null) {
            0qQ.A0F("viewState");
            throw AnonymousClass00P.createAndThrow();
        }
        C62569Khz khz = juA.A00;
        if (khz != C62569Khz.EDIT_MEDIA && khz.A00 && k6d.A01 == null) {
            C59888JbD.A02(k6d.A07);
        } else if (k6d.isAdded() && AnonymousClass06S.A01(k6d.getParentFragmentManager())) {
            DbX.A1J(k6d);
        }
    }

    public final void A03() {
        C60952JuA juA = this.A03;
        String str = "viewState";
        if (juA != null) {
            UpcomingEvent upcomingEvent = juA.A01;
            C62569Khz khz = juA.A00;
            String str2 = juA.A02;
            Date date = juA.A04;
            Date date2 = juA.A03;
            boolean z = juA.A06;
            AnonymousClass7TG.A1O(khz, str2);
            C60952JuA juA2 = new C60952JuA(khz, upcomingEvent, str2, date, date2, true, z);
            this.A03 = juA2;
            Date date3 = juA2.A04;
            if (date3 == null) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(new Date());
                instance.add(12, 60);
                int i = instance.get(12) % 5;
                if (i != 0) {
                    instance.add(12, 5 - i);
                }
                date3 = instance.getTime();
            }
            OVW ovw = this.A00;
            if (ovw == null) {
                str = "datePickerController";
            } else {
                ovw.A01(true, requireContext().getString(2131952346), date3, (Date) null, (Date) null, true);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r3 <= r5) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7r(java.util.Date r10) {
        /*
            r9 = this;
            X.JuA r3 = r9.A03
            r6 = 0
            if (r3 != 0) goto L_0x000f
            java.lang.String r1 = "viewState"
        L_0x0007:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000f:
            if (r10 == 0) goto L_0x002a
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTime(r10)
            r0 = 14
            r1 = 0
            r2.set(r0, r1)
            r0 = 13
            r2.set(r0, r1)
            java.util.Date r6 = r2.getTime()
            X.0qQ.A07(r6)
        L_0x002a:
            boolean r0 = r3.A05
            java.lang.String r1 = "datePickerController"
            X.OVW r8 = r9.A00
            if (r0 == 0) goto L_0x005f
            if (r8 == 0) goto L_0x0007
            if (r6 == 0) goto L_0x005d
            long r4 = r6.getTime()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = A0C
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
            long r4 = r6.getTime()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = A0A
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
        L_0x0054:
            r7 = 1
        L_0x0055:
            X.7Pu r0 = r8.A00
            if (r0 == 0) goto L_0x005c
            r0.A0Q(r7)
        L_0x005c:
            return
        L_0x005d:
            r7 = 0
            goto L_0x0055
        L_0x005f:
            if (r8 == 0) goto L_0x0007
            java.util.Date r0 = r3.A04
            r7 = 0
            if (r0 == 0) goto L_0x0055
            if (r6 == 0) goto L_0x0055
            long r5 = r6.getTime()
            long r0 = r0.getTime()
            long r5 = r5 - r0
            long r3 = A0B
            long r1 = A09
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0055
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0055
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6D.D7r(java.util.Date):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (r4 <= r6) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9n(java.util.Date r26) {
        /*
            r25 = this;
            r0 = r26
            if (r26 == 0) goto L_0x00cb
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTime(r0)
            r0 = 14
            r2 = 0
            r1.set(r0, r2)
            r0 = 13
            r1.set(r0, r2)
            java.util.Date r13 = r1.getTime()
            X.0qQ.A07(r13)
            r3 = r25
            X.JuA r0 = r3.A03
            java.lang.String r8 = "viewState"
            if (r0 == 0) goto L_0x0064
            boolean r15 = r0.A05
            r22 = 0
            com.instagram.user.model.UpcomingEvent r11 = r0.A01
            X.Khz r10 = r0.A00
            java.lang.String r12 = r0.A02
            if (r15 == 0) goto L_0x00a7
            java.util.Date r14 = r0.A03
            boolean r0 = r0.A06
            X.AnonymousClass7TG.A1O(r10, r12)
            X.JuA r9 = new X.JuA
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x003f:
            r3.A03 = r9
            java.util.Date r1 = r9.A04
            java.util.Date r0 = r9.A03
            if (r1 == 0) goto L_0x007e
            if (r0 == 0) goto L_0x007e
            long r6 = r0.getTime()
            long r0 = r1.getTime()
            long r6 = r6 - r0
            long r4 = A0B
            long r1 = A09
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x007e
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x007e
        L_0x005e:
            X.LO9 r2 = r3.A04
            if (r2 != 0) goto L_0x006c
            java.lang.String r8 = "viewBinder"
        L_0x0064:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006c:
            X.JuA r0 = r3.A03
            if (r0 == 0) goto L_0x0064
            java.util.Date r1 = r0.A04
            java.util.Date r0 = r0.A03
            r2.A01(r1, r0)
            X.LBP r0 = r3.A02
            if (r0 != 0) goto L_0x00c3
            java.lang.String r8 = "viewHolder"
            goto L_0x0064
        L_0x007e:
            X.JuA r0 = r3.A03
            if (r0 == 0) goto L_0x0064
            com.instagram.user.model.UpcomingEvent r7 = r0.A01
            X.Khz r6 = r0.A00
            java.lang.String r5 = r0.A02
            java.util.Date r4 = r0.A04
            boolean r2 = r0.A05
            boolean r1 = r0.A06
            X.AnonymousClass7TG.A1O(r6, r5)
            X.JuA r0 = new X.JuA
            r23 = r2
            r24 = r1
            r17 = r0
            r18 = r6
            r19 = r7
            r20 = r5
            r21 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3.A03 = r0
            goto L_0x005e
        L_0x00a7:
            java.util.Date r1 = r0.A04
            boolean r0 = r0.A06
            X.AnonymousClass7TG.A1O(r10, r12)
            X.JuA r9 = new X.JuA
            r14 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r18 = r1
            r19 = r13
            r20 = r2
            r21 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x003f
        L_0x00c3:
            com.instagram.actionbar.ActionButton r0 = r0.A0D
            A00(r0, r3)
            r3.onBackPressed()
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6D.D9n(java.util.Date):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r1 = X.AnonymousClass37D.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r4 = this;
            X.0eM r0 = r4.A07
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322486882871512(0x810b1c000328d8, double:3.033825191418509E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r2 = 1
            if (r0 == 0) goto L_0x0030
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x0030
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0030
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r2) goto L_0x0030
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            X.DbX.A10(r0, r1)
            return r2
        L_0x0030:
            X.37D r0 = X.DbX.A0i(r4)
            if (r0 == 0) goto L_0x003b
            boolean r2 = r0.A0X()
            return r2
        L_0x003b:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6D.onBackPressed():boolean");
    }

    public final void onCreate(Bundle bundle) {
        C60952JuA juA;
        int A022 = AnonymousClass0fD.A02(-1740897333);
        K6D.super.onCreate(bundle);
        Context requireContext = requireContext();
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("prior_surface");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.upcomingevents.creation.enums.UpcomingEventEntryPoint");
        C62569Khz khz = (C62569Khz) serializable;
        UpcomingEvent upcomingEvent = (UpcomingEvent) requireArguments.getParcelable("initial_upcoming_event");
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r3 = this.A07;
        this.A00 = new OVW(requireActivity, AnonymousClass7TE.A0l(r3), this, AnonymousClass7TE.A16(requireContext, 2131952346), requireContext.getString(2131952345), false, true, false, false);
        this.A05 = new KWU(AnonymousClass7TE.A0l(r3));
        boolean A062 = 182.A06(0Tu.A05, AnonymousClass7TF.A0L(r3, 0), 36318720196352410L);
        if (upcomingEvent != null) {
            String title = upcomingEvent.getTitle();
            if (title == null) {
                title = "";
            }
            juA = new C60952JuA(khz, upcomingEvent, title, new Date(C18810W3l.A02(upcomingEvent)), new Date(C18810W3l.A00(upcomingEvent)), false, A062);
        } else {
            juA = new C60952JuA(khz, (UpcomingEvent) null, "", (Date) null, (Date) null, false, A062);
        }
        this.A03 = juA;
        AnonymousClass0fD.A09(1659486048, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-221417956);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.create_event, viewGroup, false);
        AnonymousClass0fD.A09(-300911877, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1687064648);
        LO9 lo9 = this.A04;
        if (lo9 == null) {
            0qQ.A0F("viewBinder");
            throw AnonymousClass00P.createAndThrow();
        }
        LBP lbp = lo9.A03;
        lbp.A0D.setOnClickListener((View.OnClickListener) null);
        lbp.A05.setOnClickListener((View.OnClickListener) null);
        lbp.A02.setOnClickListener((View.OnClickListener) null);
        lbp.A08.setOnClickListener((View.OnClickListener) null);
        lbp.A01.setOnClickListener((View.OnClickListener) null);
        lbp.A06.setOnClickListener((View.OnClickListener) null);
        lbp.A00.setOnClickListener((View.OnClickListener) null);
        lbp.A04.removeTextChangedListener(lo9.A00);
        lo9.A00 = null;
        lbp.A07.setOnClickListener((View.OnClickListener) null);
        super.onDestroyView();
        AnonymousClass0fD.A09(891397228, A022);
    }
}
