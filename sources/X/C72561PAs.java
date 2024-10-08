package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import java.util.Collections;

/* renamed from: X.PAs  reason: case insensitive filesystem */
public final class C72561PAs implements AnonymousClass7D2 {
    public AnonymousClass78H A00 = null;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C332847Wp A03;
    public final AnonymousClass9HC A04;
    public final AnonymousClass74R A05;
    public final AnonymousClass7GO A06 = new AnonymousClass7GO();
    public final C331037Pg A07;
    public final boolean A08;

    public C72561PAs(AnonymousClass0iw r10, UserSession userSession, C332847Wp r12, AnonymousClass9HC r13, C331037Pg r14, boolean z) {
        this.A03 = r12;
        this.A01 = r10;
        this.A07 = r14;
        this.A02 = userSession;
        this.A08 = z;
        C332827Wn r3 = (C332827Wn) r12;
        AnonymousClass9HC r4 = r13;
        this.A05 = new AnonymousClass74R(r10, userSession, r3, r4, r14, Collections.emptyList(), false, z);
        this.A04 = r13;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r21v0, types: [X.7Xa] */
    /* JADX WARNING: type inference failed for: r21v1, types: [X.7Xa] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.A02(r5) == false) goto L_0x0024;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01eb A[Catch:{ all -> 0x02df }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0213 A[Catch:{ all -> 0x02df }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r29, X.AnonymousClass7FW r30) {
        /*
            r28 = this;
            r6 = r30
            r9 = r29
            X.PBl r9 = (X.C72580PBl) r9
            X.N8K r6 = (X.N8K) r6
            java.util.List r0 = r6.A02
            r27 = r0
            int r0 = r27.size()
            if (r0 == 0) goto L_0x02e9
            java.lang.String r0 = "GenericHscrollContentDefinition.bindViewHolder"
            X.0lp r17 = X.0lq.A00(r0)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r9.A01     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x0024
            com.instagram.model.direct.messageid.DirectMessageIdentifier r5 = r6.A01     // Catch:{ all -> 0x02df }
            boolean r0 = r0.A02(r5)     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x0028
        L_0x0024:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r5 = r6.A01     // Catch:{ all -> 0x02df }
            r9.A01 = r5     // Catch:{ all -> 0x02df }
        L_0x0028:
            com.instagram.ui.recyclerpager.HorizontalRecyclerPager r4 = r9.A05     // Catch:{ all -> 0x02df }
            android.content.Context r8 = r4.getContext()     // Catch:{ all -> 0x02df }
            r0 = 2130969135(0x7f04022f, float:1.7546943E38)
            int r2 = X.2Yu.A0G(r8, r0)     // Catch:{ all -> 0x02df }
            int r11 = X.0nA.A09(r8)     // Catch:{ all -> 0x02df }
            r3 = 0
            int r0 = X.AnonymousClass7PV.A00(r8, r3)     // Catch:{ all -> 0x02df }
            int r11 = r11 - r0
            r1 = 4
            int r0 = X.DbS.A02(r8, r1)     // Catch:{ all -> 0x02df }
            int r0 = r0 + r2
            int r0 = r0 * 2
            int r11 = r11 - r0
            int r10 = X.0nA.A09(r8)     // Catch:{ all -> 0x02df }
            int r0 = X.AnonymousClass7PV.A00(r8, r3)     // Catch:{ all -> 0x02df }
            int r10 = r10 - r0
            int r0 = X.DbS.A02(r8, r1)     // Catch:{ all -> 0x02df }
            int r2 = r2 + r0
            int r10 = r10 - r2
            X.2Rw r2 = r4.A0A     // Catch:{ all -> 0x02df }
            X.MvI r2 = (X.C67814MvI) r2     // Catch:{ all -> 0x02df }
            r7 = r28
            if (r2 != 0) goto L_0x0084
            android.view.LayoutInflater r0 = r9.A02     // Catch:{ all -> 0x02df }
            r16 = r0
            X.7Pg r15 = r7.A07     // Catch:{ all -> 0x02df }
            X.7Wp r14 = r7.A03     // Catch:{ all -> 0x02df }
            com.instagram.common.session.UserSession r13 = r7.A02     // Catch:{ all -> 0x02df }
            X.9HC r12 = r7.A04     // Catch:{ all -> 0x02df }
            X.0iw r1 = r7.A01     // Catch:{ all -> 0x02df }
            boolean r0 = r7.A08     // Catch:{ all -> 0x02df }
            X.MvI r2 = new X.MvI     // Catch:{ all -> 0x02df }
            r19 = r16
            r20 = r1
            r21 = r13
            r22 = r14
            r23 = r12
            r24 = r15
            r25 = r0
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x02df }
        L_0x0084:
            r2.A02 = r6     // Catch:{ all -> 0x02df }
            com.instagram.common.session.UserSession r0 = r7.A02     // Catch:{ all -> 0x02df }
            r26 = r0
            X.0Tu r14 = X.0Tu.A05     // Catch:{ all -> 0x02df }
            r0 = 36327288656378182(0x810f7a00043946, double:3.036861852319317E-306)
            r12 = r26
            boolean r0 = X.182.A06(r14, r12, r0)     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x00fa
            X.7Wp r0 = r7.A03     // Catch:{ all -> 0x02df }
            X.7XJ r0 = (X.AnonymousClass7XJ) r0     // Catch:{ all -> 0x02df }
            java.lang.String r23 = r0.B20()     // Catch:{ all -> 0x02df }
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x02df }
            r21 = r0
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x02df }
            java.lang.String r13 = ""
            r24 = 0
            r12 = 0
            r15 = r24
            r20 = r13
        L_0x00b2:
            int r0 = r27.size()     // Catch:{ all -> 0x02df }
            if (r12 >= r0) goto L_0x00e3
            r0 = r27
            java.lang.Object r1 = r0.get(r12)     // Catch:{ all -> 0x02df }
            X.7FW r1 = (X.AnonymousClass7FW) r1     // Catch:{ all -> 0x02df }
            boolean r0 = r1 instanceof X.AnonymousClass752     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x00c9
            X.752 r1 = (X.AnonymousClass752) r1     // Catch:{ all -> 0x02df }
            X.7Fr r1 = r1.A03     // Catch:{ all -> 0x02df }
            goto L_0x00cf
        L_0x00c9:
            boolean r0 = r1 instanceof X.C328667Fr     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x00e0
            X.7Fr r1 = (X.C328667Fr) r1     // Catch:{ all -> 0x02df }
        L_0x00cf:
            if (r15 != 0) goto L_0x00d3
            X.3t3 r15 = r1.A0M     // Catch:{ all -> 0x02df }
        L_0x00d3:
            X.9J6 r0 = r1.A08     // Catch:{ all -> 0x02df }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x02df }
            r20 = r0
            java.lang.String r13 = r1.A0V     // Catch:{ all -> 0x02df }
            r0 = r16
            r0.add(r1)     // Catch:{ all -> 0x02df }
        L_0x00e0:
            int r12 = r12 + 1
            goto L_0x00b2
        L_0x00e3:
            if (r13 == 0) goto L_0x00fa
            boolean r0 = r16.isEmpty()     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x00fa
            X.7Wp r0 = r2.A08     // Catch:{ all -> 0x02df }
            X.7XD r0 = (X.AnonymousClass7XD) r0     // Catch:{ all -> 0x02df }
            r18 = r0
            r19 = r15
            r22 = r13
            r25 = r16
            r18.Ch6(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x02df }
        L_0x00fa:
            boolean r13 = r6.A03     // Catch:{ all -> 0x02df }
            int r12 = r27.size()     // Catch:{ all -> 0x02df }
            int r15 = r6.A00     // Catch:{ all -> 0x02df }
            r0 = 2130968699(0x7f04007b, float:1.754606E38)
            int r1 = X.2Yu.A0G(r8, r0)     // Catch:{ all -> 0x02df }
            r0 = 8
            if (r15 != r0) goto L_0x011b
            X.0qQ.A0B(r8, r3)     // Catch:{ all -> 0x02df }
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ all -> 0x02df }
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r1 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x02df }
        L_0x011b:
            if (r13 == 0) goto L_0x0129
            r0 = 1
            if (r12 <= r0) goto L_0x0121
            goto L_0x013a
        L_0x0121:
            if (r12 != r0) goto L_0x013f
            X.0nA.A0Y(r4, r10)     // Catch:{ all -> 0x02df }
            r4.A01 = r10     // Catch:{ all -> 0x02df }
            goto L_0x013f
        L_0x0129:
            X.0nA.A0Y(r4, r3)     // Catch:{ all -> 0x02df }
            int r0 = -r1
            X.0nA.A0d(r4, r0)     // Catch:{ all -> 0x02df }
            X.0nA.A0U(r4, r3)     // Catch:{ all -> 0x02df }
            X.MvX r0 = r9.A04     // Catch:{ all -> 0x02df }
            r0.A00 = r1     // Catch:{ all -> 0x02df }
            r0.A01 = r3     // Catch:{ all -> 0x02df }
            goto L_0x014c
        L_0x013a:
            X.0nA.A0Y(r4, r11)     // Catch:{ all -> 0x02df }
            r4.A01 = r11     // Catch:{ all -> 0x02df }
        L_0x013f:
            X.0nA.A0d(r4, r3)     // Catch:{ all -> 0x02df }
            int r0 = -r1
            X.0nA.A0U(r4, r0)     // Catch:{ all -> 0x02df }
            X.MvX r0 = r9.A04     // Catch:{ all -> 0x02df }
            r0.A00 = r3     // Catch:{ all -> 0x02df }
            r0.A01 = r1     // Catch:{ all -> 0x02df }
        L_0x014c:
            r9.A00 = r12     // Catch:{ all -> 0x02df }
            java.util.Iterator r12 = r27.iterator()     // Catch:{ all -> 0x02df }
            r11 = 0
            r10 = r11
        L_0x0154:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x017e
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x02df }
            X.7FW r1 = (X.AnonymousClass7FW) r1     // Catch:{ all -> 0x02df }
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x02df }
            if (r11 != 0) goto L_0x0168
            r11 = r0
            goto L_0x016b
        L_0x0168:
            if (r0 == r11) goto L_0x016b
            goto L_0x01da
        L_0x016b:
            boolean r0 = r1 instanceof X.C328667Fr     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x0174
            X.7Fr r1 = (X.C328667Fr) r1     // Catch:{ all -> 0x02df }
            X.3tD r0 = r1.A0J     // Catch:{ all -> 0x02df }
            goto L_0x0175
        L_0x0174:
            r0 = 0
        L_0x0175:
            if (r10 != 0) goto L_0x017b
            if (r0 == 0) goto L_0x0154
            r10 = r0
            goto L_0x0154
        L_0x017b:
            if (r0 == 0) goto L_0x0154
            goto L_0x01d4
        L_0x017e:
            android.view.LayoutInflater r1 = r9.A02     // Catch:{ all -> 0x02df }
            android.view.ViewGroup r12 = r9.A03     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "GenericHscrollContentDefinition.getMaxCaptionHeight"
            X.0lp r15 = X.0lq.A00(r0)     // Catch:{ all -> 0x02df }
            X.74R r11 = r7.A05     // Catch:{ all -> 0x02d5 }
            X.73v r10 = r11.ANK(r1, r12)     // Catch:{ all -> 0x02d5 }
            java.util.Iterator r14 = r27.iterator()     // Catch:{ all -> 0x02d5 }
            r9 = 0
        L_0x0193:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x02d5 }
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r8 = r14.next()     // Catch:{ all -> 0x02d5 }
            X.7FW r8 = (X.AnonymousClass7FW) r8     // Catch:{ all -> 0x02d5 }
            boolean r0 = r8 instanceof X.C328667Fr     // Catch:{ all -> 0x02d5 }
            if (r0 == 0) goto L_0x0193
            X.7Fr r8 = (X.C328667Fr) r8     // Catch:{ all -> 0x02d5 }
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x02d5 }
            X.0iw r0 = r7.A01     // Catch:{ all -> 0x02d5 }
            r11.A07(r1, r0, r10, r8)     // Catch:{ all -> 0x02d5 }
            X.2eb r13 = r10.A0B     // Catch:{ all -> 0x02d5 }
            android.view.View r8 = r13.A01()     // Catch:{ all -> 0x02d5 }
            int r1 = X.AnonymousClass7PV.A00(r1, r3)     // Catch:{ all -> 0x02d5 }
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)     // Catch:{ all -> 0x02d5 }
            r8.measure(r0, r3)     // Catch:{ all -> 0x02d5 }
            android.view.View r0 = r13.A01()     // Catch:{ all -> 0x02d5 }
            int r0 = r0.getMeasuredHeight()     // Catch:{ all -> 0x02d5 }
            int r9 = java.lang.Math.max(r9, r0)     // Catch:{ all -> 0x02d5 }
            goto L_0x0193
        L_0x01ce:
            r15.close()     // Catch:{ all -> 0x02df }
            r2.A00 = r9     // Catch:{ all -> 0x02df }
            goto L_0x01f6
        L_0x01d4:
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x0154
        L_0x01da:
            r0 = 36609429352748909(0x8210150000176d, double:3.2152887647935597E-306)
            r10 = r26
            long r0 = X.182.A01(r14, r10, r0)     // Catch:{ all -> 0x02df }
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0213
            float r3 = (float) r0     // Catch:{ all -> 0x02df }
            float r0 = X.0nA.A00(r8, r3)     // Catch:{ all -> 0x02df }
            int r9 = java.lang.Math.round(r0)     // Catch:{ all -> 0x02df }
        L_0x01f4:
            r2.A01 = r9     // Catch:{ all -> 0x02df }
        L_0x01f6:
            r4.setAdapter(r2)     // Catch:{ all -> 0x02df }
            boolean r0 = r6.A04     // Catch:{ all -> 0x02df }
            r4.A04 = r0     // Catch:{ all -> 0x02df }
            X.7GO r2 = r7.A06     // Catch:{ all -> 0x02df }
            java.lang.Object r1 = r2.A01(r5)     // Catch:{ all -> 0x02df }
            android.os.Parcelable r1 = (android.os.Parcelable) r1     // Catch:{ all -> 0x02df }
            if (r1 == 0) goto L_0x02cc
            X.3pI r0 = r4.A0D     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x02cc
            r0.A1P(r1)     // Catch:{ all -> 0x02df }
            r2.A02(r5, r1)     // Catch:{ all -> 0x02df }
            goto L_0x02cc
        L_0x0213:
            android.view.LayoutInflater r10 = r9.A02     // Catch:{ all -> 0x02df }
            android.view.ViewGroup r11 = r9.A03     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "GenericHscrollContentDefinition.getMaxChildHeight"
            X.0lp r16 = X.0lq.A00(r0)     // Catch:{ all -> 0x02df }
            r9 = 0
            java.util.Iterator r15 = r27.iterator()     // Catch:{ all -> 0x02d0 }
            r13 = 0
            r8 = r13
        L_0x0224:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x02d0 }
            if (r0 == 0) goto L_0x02c7
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x02d0 }
            X.7FW r1 = (X.AnonymousClass7FW) r1     // Catch:{ all -> 0x02d0 }
            boolean r0 = r1 instanceof X.AnonymousClass752     // Catch:{ all -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            if (r13 != 0) goto L_0x0258
            android.content.Context r18 = r10.getContext()     // Catch:{ all -> 0x02d0 }
            X.78H r0 = r7.A00     // Catch:{ all -> 0x02d0 }
            if (r0 != 0) goto L_0x0254
            X.7Wp r13 = r7.A03     // Catch:{ all -> 0x02d0 }
            X.9HC r12 = r7.A04     // Catch:{ all -> 0x02d0 }
            X.0iw r0 = r7.A01     // Catch:{ all -> 0x02d0 }
            r23 = 0
            r19 = r0
            r20 = r26
            r21 = r13
            r22 = r12
            X.78H r0 = X.AnonymousClass78E.A00(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x02d0 }
            r7.A00 = r0     // Catch:{ all -> 0x02d0 }
        L_0x0254:
            X.76o r13 = r0.ANK(r10, r11)     // Catch:{ all -> 0x02d0 }
        L_0x0258:
            X.752 r1 = (X.AnonymousClass752) r1     // Catch:{ all -> 0x02d0 }
            android.content.Context r18 = r10.getContext()     // Catch:{ all -> 0x02d0 }
            X.78H r0 = r7.A00     // Catch:{ all -> 0x02d0 }
            if (r0 != 0) goto L_0x0278
            X.7Wp r14 = r7.A03     // Catch:{ all -> 0x02d0 }
            X.9HC r12 = r7.A04     // Catch:{ all -> 0x02d0 }
            X.0iw r0 = r7.A01     // Catch:{ all -> 0x02d0 }
            r23 = 0
            r19 = r0
            r20 = r26
            r21 = r14
            r22 = r12
            X.78H r0 = X.AnonymousClass78E.A00(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x02d0 }
            r7.A00 = r0     // Catch:{ all -> 0x02d0 }
        L_0x0278:
            r0.ADp(r1, r13)     // Catch:{ all -> 0x02d0 }
            android.widget.FrameLayout r12 = r13.A03     // Catch:{ all -> 0x02d0 }
            int r1 = r1.A00     // Catch:{ all -> 0x02d0 }
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)     // Catch:{ all -> 0x02d0 }
            r12.measure(r0, r3)     // Catch:{ all -> 0x02d0 }
            int r0 = r12.getMeasuredHeight()     // Catch:{ all -> 0x02d0 }
            int r9 = java.lang.Math.max(r9, r0)     // Catch:{ all -> 0x02d0 }
            goto L_0x0224
        L_0x0291:
            boolean r0 = r1 instanceof X.C328667Fr     // Catch:{ all -> 0x02d0 }
            if (r0 == 0) goto L_0x0224
            if (r8 != 0) goto L_0x029d
            X.74R r0 = r7.A05     // Catch:{ all -> 0x02d0 }
            X.73v r8 = r0.ANK(r10, r11)     // Catch:{ all -> 0x02d0 }
        L_0x029d:
            X.7Fr r1 = (X.C328667Fr) r1     // Catch:{ all -> 0x02d0 }
            X.74R r0 = r7.A05     // Catch:{ all -> 0x02d0 }
            r0.ADp(r8, r1)     // Catch:{ all -> 0x02d0 }
            android.view.View r12 = r8.BJd()     // Catch:{ all -> 0x02d0 }
            android.content.Context r0 = r11.getContext()     // Catch:{ all -> 0x02d0 }
            int r1 = X.AnonymousClass7PV.A00(r0, r3)     // Catch:{ all -> 0x02d0 }
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)     // Catch:{ all -> 0x02d0 }
            r12.measure(r0, r3)     // Catch:{ all -> 0x02d0 }
            android.view.View r0 = r8.BJd()     // Catch:{ all -> 0x02d0 }
            int r0 = r0.getMeasuredHeight()     // Catch:{ all -> 0x02d0 }
            int r9 = java.lang.Math.max(r9, r0)     // Catch:{ all -> 0x02d0 }
            goto L_0x0224
        L_0x02c7:
            r16.close()     // Catch:{ all -> 0x02df }
            goto L_0x01f4
        L_0x02cc:
            r17.close()
            return
        L_0x02d0:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x02da }
            goto L_0x02de
        L_0x02d5:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x02da }
            goto L_0x02de
        L_0x02da:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x02df }
        L_0x02de:
            throw r1     // Catch:{ all -> 0x02df }
        L_0x02df:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x02e4 }
            throw r1
        L_0x02e4:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        L_0x02e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72561PAs.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r4) {
        Parcelable A1M;
        C72580PBl pBl = (C72580PBl) r4;
        C252553pI r1 = pBl.A05.A0D;
        if (pBl.A01 != null && r1 != null && (A1M = r1.A1M()) != null) {
            this.A06.A02(pBl.A01, A1M);
        }
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        View A0C = DbT.A0C(layoutInflater, viewGroup2, R.layout.direct_hscroll_container);
        Context context = viewGroup2.getContext();
        C67829MvX mvX = new C67829MvX(2Yu.A0G(context, R.attr.avatarStartSpacing), DbS.A02(context, 4));
        C72580PBl pBl = new C72580PBl(layoutInflater, A0C, viewGroup2, mvX);
        HorizontalRecyclerPager horizontalRecyclerPager = pBl.A05;
        C331037Pg r12 = this.A07;
        C332847Wp r10 = this.A03;
        horizontalRecyclerPager.setAdapter(new C67814MvI(layoutInflater, this.A01, this.A02, r10, this.A04, r12, this.A08));
        0nA.A0f(horizontalRecyclerPager, 0nA.A09(context));
        C252553pI r1 = horizontalRecyclerPager.A0D;
        if (r1 != null) {
            r1.A0v(true);
            horizontalRecyclerPager.setLayoutManager(r1);
        }
        horizontalRecyclerPager.A11(mvX);
        A0C.setTag(pBl);
        return pBl;
    }
}
