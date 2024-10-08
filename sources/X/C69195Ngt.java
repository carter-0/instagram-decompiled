package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.Ngt  reason: case insensitive filesystem */
public final class C69195Ngt extends AnonymousClass7AK {
    public final int A00 = 4;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69195Ngt(NKE nke, User user, int i) {
        super(Integer.valueOf(i));
        this.A01 = user;
        this.A02 = nke;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00a0;
                case 2: goto L_0x0024;
                case 3: goto L_0x0036;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A02
            X.ADC r1 = (X.ADC) r1
            java.lang.Object r0 = r10.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            androidx.fragment.app.FragmentActivity r2 = r1.A04
            com.instagram.common.session.UserSession r4 = r1.A06
            com.instagram.direct.model.messaginguser.MessagingUser r5 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r0)
            X.0iw r3 = r1.A05
            r7 = 0
            r0 = 2278(0x8e6, float:3.192E-42)
            java.lang.String r6 = X.C273654mx.A00(r0)
            r8 = 0
            r9 = r8
            X.C48838El0.A00(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r0 = r10.A02
            X.NJf r0 = (X.C68467NJf) r0
            X.Pvt r1 = r0.A0P
            if (r1 == 0) goto L_0x0023
            java.lang.Object r0 = r10.A01
            java.lang.String r0 = X.DbS.A0q(r0)
            r1.Cqj(r0)
            return
        L_0x0036:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.Object r6 = r10.A02
            X.NJf r6 = (X.C68467NJf) r6
            X.0eM r4 = r6.A0j
            X.0lg r3 = X.DbT.A0X(r4)
            r2 = 0
            X.0Tu r7 = X.DbS.A0J(r3, r2)
            r0 = 36329384600354899(0x81116200034053, double:3.0381873357298816E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            r3 = 1
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = r10.A01
            X.NWf r1 = (X.C68770NWf) r1
            X.N3C r0 = r1.A07
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "arg_launch_music_flow"
        L_0x005f:
            r5.putBoolean(r0, r3)
        L_0x0062:
            java.lang.String r0 = "arg_is_from_try_it"
            r5.putBoolean(r0, r3)
            X.Pvt r0 = r6.A0P
            if (r0 == 0) goto L_0x006e
            r0.DuJ(r5)
        L_0x006e:
            X.60k r1 = X.C66582MXn.A0S(r4)
            X.Nmo r0 = X.C69506Nmo.A0U
            r1.A0B(r0)
            return
        L_0x0078:
            com.instagram.api.schemas.NotePogVideoDict r0 = r1.A03
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "arg_launch_video_flow"
            goto L_0x005f
        L_0x007f:
            X.0lg r2 = X.AnonymousClass7TF.A0L(r4, r2)
            r0 = 36329384600420436(0x81116200044054, double:3.0381873357713274E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r10.A01
            X.NWf r1 = (X.C68770NWf) r1
            X.N3C r0 = r1.A07
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "arg_show_music_tooltip"
            goto L_0x005f
        L_0x0099:
            com.instagram.api.schemas.NotePogVideoDict r0 = r1.A03
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "arg_show_video_tooltip"
            goto L_0x005f
        L_0x00a0:
            java.lang.Object r1 = r10.A02
            X.NJf r1 = (X.C68467NJf) r1
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x00eb
            int r4 = r0.getHeight()
            android.content.Context r2 = r1.requireContext()
            boolean r1 = X.C61670oa.A04()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            if (r1 == 0) goto L_0x00bc
            r0 = 2131165200(0x7f070010, float:1.794461E38)
        L_0x00bc:
            int r1 = X.C51972G9s.A08(r2)
            int r0 = X.AnonymousClass7TF.A02(r2, r0)
            int r1 = r1 + r0
            r0 = 2130968781(0x7f0400cd, float:1.7546225E38)
            int r0 = X.2Yu.A0G(r2, r0)
            int r1 = r1 + r0
            int r4 = r4 + r1
        L_0x00ce:
            X.1xC r3 = X.1xC.A01
            X.6ap r2 = X.DbS.A0a()
            java.lang.Object r0 = r10.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131965106(0x7f1334b2, float:1.9567013E38)
            X.DbT.A1D(r1, r2, r0)
            r2.A02 = r4
            r0 = 1
            r2.A0R = r0
            X.DbY.A1K(r3, r2)
            return
        L_0x00eb:
            r4 = 0
            goto L_0x00ce
        L_0x00ed:
            java.lang.Object r2 = r10.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.Object r1 = r10.A02
            X.NKE r1 = (X.NKE) r1
            X.0eM r0 = r1.A0Q
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            java.lang.String r7 = r1.A0N
            java.lang.String r8 = r2.getId()
            r4 = 0
            r9 = 0
            r6 = r4
            X.C71110Ocp.A01(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69195Ngt.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69195Ngt(Context context, C68467NJf nJf, int i) {
        super(Integer.valueOf(i));
        this.A02 = nJf;
        this.A01 = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69195Ngt(C68467NJf nJf, User user, int i) {
        super(Integer.valueOf(i));
        this.A02 = nJf;
        this.A01 = user;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69195Ngt(C68467NJf nJf, C68770NWf nWf, int i) {
        super(Integer.valueOf(i));
        this.A02 = nJf;
        this.A01 = nWf;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69195Ngt(ADC adc, User user, int i) {
        super(Integer.valueOf(i));
        this.A02 = adc;
        this.A01 = user;
    }
}
