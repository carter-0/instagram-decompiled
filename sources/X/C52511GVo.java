package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

/* renamed from: X.GVo  reason: case insensitive filesystem */
public final class C52511GVo implements AnonymousClass11X {
    public AnonymousClass6OE A00;
    public final int A01;
    public final Context A02;
    public final C308776Vo A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass6L7 A07;
    public final UserSession A08;
    public final AnonymousClass6Q6 A09;
    public final AnonymousClass6UO A0A;

    public final AnonymousClass6OE A00(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass6OE r0 = this.A00;
        if (r0 == null) {
            AnonymousClass6OC r2 = AnonymousClass6OB.A01;
            UserSession userSession = this.A08;
            r0 = r2.A01(AnonymousClass6OC.A00(userSession, str), userSession, str);
            this.A00 = r0;
        }
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String getName() {
        return "ShowreelNativeAssetPrefetchTask";
    }

    public final int getRunnableId() {
        return 584;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C52511GVo(Context context, UserSession userSession, AnonymousClass6Q6 r4, IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf, C308776Vo r6, AnonymousClass6UO r7, int i, int i2, int i3, int i4) {
        C51969G9p.A1N(r4, 8, r7);
        this.A08 = userSession;
        this.A02 = context;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A01 = i4;
        this.A09 = r4;
        this.A03 = r6;
        this.A0A = r7;
        this.A07 = B7C.A00(igShowreelNativeAnimationIntf);
    }

    public final void run() {
        AnonymousClass6UO r0 = this.A0A;
        String str = r0.A00;
        try {
            AnonymousClass6L7 r5 = this.A07;
            C52507GVk gVk = (C52507GVk) r5;
            String str2 = gVk.A03;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = r0.A01;
            String str4 = gVk.A05;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = gVk.A04;
            if (str5 == null) {
                str5 = "";
            }
            boolean A1Y = DbW.A1Y(str3);
            String F01 = this.A09.F01();
            ImmutableList Ack = r5.Ack();
            ImmutableList Acm = r5.Acm();
            C52510GVn A002 = C52509GVm.A00(Integer.valueOf(this.A04), (Integer) null, Integer.valueOf(this.A05), Integer.valueOf(this.A06), gVk.A02, str2, str5, F01, (String) null, str3, str4, Ack, Acm);
            AnonymousClass6OE A003 = A00(str);
            A003.A04(new C52513GVq(this, str), A002, A003.A02(A002, A1Y));
        } catch (C242623Vf e) {
            this.A03.DDB();
            0KC.A0G("ShowreelNativeAssetPrefetchTask", "Failed to prefetch media", e);
        }
    }
}
