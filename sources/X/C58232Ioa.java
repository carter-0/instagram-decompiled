package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

/* renamed from: X.Ioa  reason: case insensitive filesystem */
public final class C58232Ioa extends 0Yg implements C62320sa {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ CameraTool A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ MagicModLaunchParams A03;
    public final /* synthetic */ C351818An A04;
    public final /* synthetic */ C352218Cl A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58232Ioa(FragmentActivity fragmentActivity, CameraTool cameraTool, UserSession userSession, MagicModLaunchParams magicModLaunchParams, C351818An r6, C352218Cl r7, Integer num, String str, boolean z) {
        super(0);
        this.A04 = r6;
        this.A06 = num;
        this.A05 = r7;
        this.A01 = cameraTool;
        this.A02 = userSession;
        this.A08 = z;
        this.A03 = magicModLaunchParams;
        this.A07 = str;
        this.A00 = fragmentActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r21 = this;
            r2 = r21
            X.8An r6 = r2.A04
            java.lang.Integer r10 = r2.A06
            X.8Cl r1 = r2.A05
            com.instagram.api.schemas.CameraTool r0 = r2.A01
            r20 = r0
            com.instagram.common.session.UserSession r3 = r2.A02
            boolean r0 = r2.A08
            r19 = r0
            com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r5 = r2.A03
            java.lang.String r0 = r2.A07
            r18 = r0
            androidx.fragment.app.FragmentActivity r0 = r2.A00
            r17 = r0
            X.8hK r9 = X.AnonymousClass6XS.A00(r20)
            if (r9 == 0) goto L_0x0163
            com.instagram.creation.genai.magicmod.model.MagicModTopicInfo r8 = r5.A03
            X.AnonymousClass7TG.A1N(r10, r1)
            java.lang.String r2 = X.C51972G9s.A0n()
            com.instagram.common.session.UserSession r7 = r6.A09
            r4 = 0
            if (r8 == 0) goto L_0x015d
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x015d
            java.lang.Long r14 = X.AnonymousClass7TE.A10(r0)
        L_0x0038:
            java.lang.String r8 = r8.A03
        L_0x003a:
            X.GnY r0 = new X.GnY
            r11 = r0
            r12 = r9
            r13 = r10
            r15 = r2
            r16 = r8
            r11.<init>((X.C362088hK) r12, (java.lang.Integer) r13, (java.lang.Long) r14, (java.lang.String) r15, (java.lang.String) r16)
            X.I4e r8 = new X.I4e
            r8.<init>(r0, r7)
            r6.A05 = r8
            com.instagram.common.session.UserSession r0 = r8.A01
            X.27r r14 = X.27p.A01(r0)
            X.GnY r8 = r8.A00
            java.lang.Object r0 = r8.A01
            X.8hK r0 = (X.C362088hK) r0
            X.80P r11 = X.C394969yz.A00(r0)
            java.lang.String r12 = r8.A03
            java.lang.Object r0 = r8.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r13 = X.HYP.A00(r0)
            X.0wc r8 = r14.A01
            java.lang.String r0 = "ig_camera_start_genai_session"
            X.0Aj r10 = X.AnonymousClass7TE.A0e(r8, r0)
            X.4yP r15 = r14.A0J()
            X.283 r14 = r14.A04
            java.lang.String r8 = r14.A0L
            boolean r0 = r10.isSampled()
            if (r0 == 0) goto L_0x00b7
            if (r15 == 0) goto L_0x00b7
            if (r8 == 0) goto L_0x00b7
            java.lang.String r0 = "camera_destination"
            r10.A8M(r15, r0)
            X.28D r0 = r14.A09
            X.DbS.A1F(r0, r10)
            r14 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r10, r0, r14)
            X.JVj r0 = X.C59725JVj.POST_CAPTURE
            X.C51965G9l.A1A(r0, r10)
            java.lang.String r0 = "camera_session_id"
            r10.AAJ(r0, r8)
            X.0iw r0 = X.27x.A08
            java.lang.String r8 = r0.getModuleName()
            java.lang.String r0 = "module"
            X.C51973G9u.A14(r10, r0, r8)
            java.lang.String r0 = "genai_entry_point"
            X.AnonymousClass7TE.A1W(r10, r0, r13)
            java.lang.String r0 = "magicmod_session_id"
            r10.AAJ(r0, r12)
            java.lang.String r0 = "camera_tool"
            r10.A8M(r11, r0)
            r10.Cgf()
        L_0x00b7:
            X.C351818An.A01(r6, r1)
            X.6iH r0 = r6.A03
            if (r0 == 0) goto L_0x00c1
            r0.DV9(r6)
        L_0x00c1:
            X.8hK r11 = X.C362088hK.A09
            if (r9 != r11) goto L_0x014c
            r8 = 0
            r0 = 30
            X.Ivn r1 = new X.Ivn
            r1.<init>(r7, r0)
            java.lang.Class<X.Hzh> r0 = X.C56510Hzh.class
            java.lang.Object r10 = r7.A01(r0, r1)
            X.Hzh r10 = (X.C56510Hzh) r10
            com.instagram.common.session.UserSession r9 = r10.A00
            X.0Tu r8 = X.DbS.A0J(r9, r8)
            r0 = 36319918495112958(0x8108c6002c1efe, double:3.032200932657932E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x00f0
            X.HrY r0 = r10.A02
            boolean r0 = r0.A01(r11)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x014c
        L_0x00f0:
            r0 = 36319918494326516(0x8108c600201ef4, double:3.0322009321605827E-306)
            boolean r0 = X.182.A06(r8, r7, r0)
            if (r0 == 0) goto L_0x014c
            X.C351818An.A02(r6, r2)
        L_0x00fe:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "is_gen_ai_try_on_mode"
            r0 = r19
            r2.putBoolean(r1, r0)
            java.lang.String r1 = r20.toString()
            java.lang.String r0 = "camera_tool"
            r2.putString(r0, r1)
            java.lang.String r1 = "prompt"
            r0 = r18
            r2.putString(r1, r0)
            java.lang.String r0 = "launch_params"
            r2.putParcelable(r0, r5)
            X.C227642jf.A04(r2, r3)
            X.H11 r1 = new X.H11
            r1.<init>()
            r1.setArguments(r2)
            r0 = r17
            X.6Yo r2 = X.DbS.A0M(r0, r3)
            r2.A0B(r4, r1)
            r0 = 2131439026(0x7f0b2db2, float:1.8499996E38)
            r2.A02 = r0
            java.lang.String r0 = "MAGIC_MOD"
            r2.A0C = r0
            r2.A0A = r0
            r1 = 2130772037(0x7f010045, float:1.7147181E38)
            r0 = 2130772051(0x7f010053, float:1.714721E38)
            r2.A0A(r1, r0, r1, r0)
            r2.A03()
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x014c:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319918493081318(0x8108c6000d1ee6, double:3.0322009313731144E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00fe
            X.C351818An.A00(r6)
            goto L_0x00fe
        L_0x015d:
            r14 = r4
            if (r8 != 0) goto L_0x0038
            r8 = r4
            goto L_0x003a
        L_0x0163:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58232Ioa.invoke():java.lang.Object");
    }
}
