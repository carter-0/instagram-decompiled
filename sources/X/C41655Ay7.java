package X;

import android.animation.Animator;

/* renamed from: X.Ay7  reason: case insensitive filesystem */
public final class C41655Ay7 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41655Ay7(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new C64195LTd(6, obj, new C41655Ay7(obj, i)));
        animator.start();
    }

    /* JADX WARNING: type inference failed for: r0v173, types: [X.Vh4, X.UOw] */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0493, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05d7, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05e8, code lost:
        if (r0 == null) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05ee, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        X.E3P.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020d, code lost:
        r2 = "clientInfra";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027d, code lost:
        if (X.182.A06(X.AnonymousClass7TF.A0H(r3), r3, 36323307221494843L) == false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x029d, code lost:
        r1.setVisibility(8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x005c;
                case 2: goto L_0x0062;
                case 3: goto L_0x0069;
                case 4: goto L_0x0070;
                case 5: goto L_0x007b;
                case 6: goto L_0x0043;
                case 7: goto L_0x008a;
                case 8: goto L_0x0005;
                case 9: goto L_0x0093;
                case 10: goto L_0x00bc;
                case 11: goto L_0x00c6;
                case 12: goto L_0x00d5;
                case 13: goto L_0x00ec;
                case 14: goto L_0x00f7;
                case 15: goto L_0x0102;
                case 16: goto L_0x010c;
                case 17: goto L_0x0117;
                case 18: goto L_0x011f;
                case 19: goto L_0x0128;
                case 20: goto L_0x013e;
                case 21: goto L_0x014d;
                case 22: goto L_0x0161;
                case 23: goto L_0x016c;
                case 24: goto L_0x0046;
                case 25: goto L_0x0161;
                case 26: goto L_0x008a;
                case 27: goto L_0x017b;
                case 28: goto L_0x0186;
                case 29: goto L_0x01bf;
                case 30: goto L_0x01ed;
                case 31: goto L_0x0211;
                case 32: goto L_0x021b;
                case 33: goto L_0x0225;
                case 34: goto L_0x022f;
                case 35: goto L_0x0239;
                case 36: goto L_0x0253;
                case 37: goto L_0x0285;
                case 38: goto L_0x0291;
                case 39: goto L_0x02a4;
                case 40: goto L_0x0014;
                case 41: goto L_0x0482;
                case 42: goto L_0x02b3;
                case 43: goto L_0x0303;
                case 44: goto L_0x0043;
                case 45: goto L_0x008a;
                case 46: goto L_0x0005;
                case 47: goto L_0x002c;
                case 48: goto L_0x05f3;
                case 49: goto L_0x0603;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07f r6 = r0.getViewModelStore()
        L_0x0013:
            return r6
        L_0x0014:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0028
            r0 = 773(0x305, float:1.083E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String[] r6 = r1.getStringArray(r0)
            if (r6 != 0) goto L_0x0013
        L_0x0028:
            r0 = 0
            java.lang.String[] r6 = new java.lang.String[r0]
            return r6
        L_0x002c:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0040
            r0 = 774(0x306, float:1.085E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r6 = r1.getString(r0)
            if (r6 != 0) goto L_0x0013
        L_0x0040:
            java.lang.String r6 = ""
            return r6
        L_0x0043:
            java.lang.Object r6 = r13.A01
            return r6
        L_0x0046:
            java.lang.Object r0 = r13.A01
            X.A9t r0 = (X.C39798A9t) r0
            com.instagram.user.model.User r6 = r0.A03
            return r6
        L_0x004d:
            java.lang.Object r0 = r13.A01
            X.E3U r0 = (X.E3U) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6gx r6 = X.C313746gw.A00(r0)
            return r6
        L_0x005c:
            java.lang.Object r1 = r13.A01
            X.E3P r1 = (X.E3P) r1
            r0 = 0
            goto L_0x0076
        L_0x0062:
            java.lang.Object r1 = r13.A01
            X.E3P r1 = (X.E3P) r1
            X.NiD r0 = X.C69251NiD.A0I
            goto L_0x0076
        L_0x0069:
            java.lang.Object r1 = r13.A01
            X.E3P r1 = (X.E3P) r1
            X.NiD r0 = X.C69251NiD.A0B
            goto L_0x0076
        L_0x0070:
            java.lang.Object r1 = r13.A01
            X.E3P r1 = (X.E3P) r1
            X.NiD r0 = X.C69251NiD.A0E
        L_0x0076:
            X.E3P.A00(r0, r1)
            goto L_0x05d5
        L_0x007b:
            java.lang.Object r0 = r13.A01
            X.E3P r0 = (X.E3P) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2Dm r6 = X.2L2.A00(r0)
            return r6
        L_0x008a:
            java.lang.Object r0 = r13.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r6 = r0.invoke()
            return r6
        L_0x0093:
            java.lang.Object r4 = r13.A01
            X.E12 r4 = (X.E12) r4
            android.os.Bundle r3 = r4.requireArguments()
            r0 = 886(0x376, float:1.242E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = X.C320236s2.A01(r3, r0)
            r0 = 1496(0x5d8, float:2.096E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            boolean r1 = r3.getBoolean(r1, r0)
            X.0eM r0 = r4.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EF9 r6 = new X.EF9
            r6.<init>(r0, r2, r1)
            return r6
        L_0x00bc:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.LqT r6 = new X.LqT
            r6.<init>(r0)
            return r6
        L_0x00c6:
            java.lang.Object r0 = r13.A01
            X.E17 r0 = (X.E17) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.FYv r6 = X.C69866NtU.A00(r0)
            return r6
        L_0x00d5:
            java.lang.Object r0 = r13.A01
            X.F0W r0 = (X.F0W) r0
            android.app.Activity r7 = r0.A00
            com.instagram.common.session.UserSession r9 = r0.A02
            X.0xG r8 = r0.A01
            X.3BQ r11 = X.AnonymousClass3BQ.DIRECT_THREAD_PARTICIPATION_HUB
            X.7TO r10 = new X.7TO
            r10.<init>()
            X.Fb8 r6 = new X.Fb8
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x00ec:
            java.lang.Object r0 = r13.A01
            X.F0W r0 = (X.F0W) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.6gx r6 = X.C313746gw.A00(r0)
            return r6
        L_0x00f7:
            java.lang.Object r0 = r13.A01
            X.LRE r0 = (X.LRE) r0
            com.instagram.common.session.UserSession r0 = r0.A0E
            X.6gx r6 = X.C313746gw.A00(r0)
            return r6
        L_0x0102:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2E6 r6 = new X.2E6
            r6.<init>(r0)
            return r6
        L_0x010c:
            java.lang.Object r0 = r13.A01
            X.LBH r0 = (X.LBH) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            X.6gx r6 = X.C313746gw.A00(r0)
            return r6
        L_0x0117:
            java.lang.Object r0 = r13.A01
            X.0r6[] r0 = (X.AnonymousClass0r6[]) r0
            int r0 = r0.length
            java.lang.Object[] r6 = new java.lang.Object[r0]
            return r6
        L_0x011f:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2Dm r6 = X.1bJ.A00(r0)
            return r6
        L_0x0128:
            java.lang.Object r2 = r13.A01
            X.0lg r2 = (X.0lg) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 47
            X.Plm r1 = new X.Plm
            r1.<init>(r2, r0)
            java.lang.Class<X.OTV> r0 = X.OTV.class
            java.lang.Object r6 = r2.A01(r0, r1)
            return r6
        L_0x013e:
            X.0nE r1 = X.C61410nE.A00
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            X.OKH r6 = new X.OKH
            r6.<init>(r0, r1)
            return r6
        L_0x014d:
            java.lang.Object r0 = r13.A01
            X.1kd r0 = (X.1kd) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            java.lang.Class<X.OKH> r2 = X.OKH.class
            r1 = 20
            X.Ay7 r0 = new X.Ay7
            r0.<init>(r3, r1)
            java.lang.Object r6 = r3.A01(r2, r0)
            return r6
        L_0x0161:
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.user.model.User r6 = r1.A01(r0)
            return r6
        L_0x016c:
            java.lang.Object r0 = r13.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r0 = r0.invoke()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r6 = r0.getUsername()
            return r6
        L_0x017b:
            java.lang.Object r0 = r13.A01
            X.ODS r0 = (X.ODS) r0
            X.0sa r0 = r0.A02
            java.lang.Object r6 = r0.invoke()
            return r6
        L_0x0186:
            java.lang.Object r5 = r13.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.1vn r4 = X.1vm.A01(r5)
            r2 = 606219748(0x24222de4, float:3.516702E-17)
            r1 = 3
            r0 = 0
            X.0na r3 = new X.0na
            r3.<init>(r2, r1, r0, r0)
            X.AnonymousClass7TG.A1O(r5, r4)
            X.0wX r0 = r5.A03
            android.content.Context r0 = r0.A06()
            X.1Uf r2 = X.AnonymousClass1UZ.A00(r0)
            java.lang.String r1 = "ohai_config_shared_preferences_key_"
            java.lang.String r0 = r5.A06
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.1Uk r1 = r2.A00(r0)
            X.0qQ.A07(r1)
            X.UOw r0 = new X.UOw
            r0.<init>(r1, r4, r3)
            X.UIS r6 = new X.UIS
            r6.<init>(r4, r5, r0, r3)
            return r6
        L_0x01bf:
            java.lang.Object r0 = r13.A01
            X.ADD r0 = (X.ADD) r0
            X.7Gs r0 = r0.A05
            X.7TI r2 = r0.A00
            X.7Zg r1 = r2.A08
            if (r1 == 0) goto L_0x020d
            X.7S7 r0 = r1.C6l()
            X.3t3 r6 = r0.CBU()
            if (r6 == 0) goto L_0x05d5
            X.7ZA r3 = r1.C62()
            com.instagram.common.session.UserSession r4 = r2.A0d
            r7 = 4
            X.7S7 r0 = r1.C6l()
            X.7SD r0 = r0.C6Q()
            X.3Tu r5 = r0.A0H
            r8 = 0
            r9 = r8
            r3.FHH(r4, r5, r6, r7, r8, r9)
            goto L_0x05d5
        L_0x01ed:
            java.lang.Object r0 = r13.A01
            X.ADD r0 = (X.ADD) r0
            X.7Gs r0 = r0.A05
            X.7TI r0 = r0.A00
            X.7Zg r1 = r0.A08
            if (r1 == 0) goto L_0x020d
            X.7S7 r0 = r1.C6l()
            X.3t3 r2 = r0.CBU()
            if (r2 == 0) goto L_0x05d5
            X.7ZA r1 = r1.C62()
            r0 = 0
            r1.FHN(r2, r0, r0, r0)
            goto L_0x05d5
        L_0x020d:
            java.lang.String r2 = "clientInfra"
            goto L_0x05ee
        L_0x0211:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OVs r6 = new X.OVs
            r6.<init>(r0)
            return r6
        L_0x021b:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5I6 r6 = new X.5I6
            r6.<init>(r0)
            return r6
        L_0x0225:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.O66 r6 = new X.O66
            r6.<init>(r0)
            return r6
        L_0x022f:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7BU r6 = new X.7BU
            r6.<init>(r0)
            return r6
        L_0x0239:
            java.lang.Object r0 = r13.A01
            X.9i2 r0 = (X.C384879i2) r0
            X.0eM r0 = r0.A0b
            java.lang.Object r3 = r0.getValue()
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36323307221560380(0x810bdb00022c3c, double:3.0343439769085876E-306)
            java.lang.Boolean r6 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r6
        L_0x0253:
            java.util.List r2 = X.C384879i2.A0g
            java.lang.Object r1 = r13.A01
            X.9i2 r1 = (X.C384879i2) r1
            java.lang.String r0 = r1.A0S
            if (r0 != 0) goto L_0x0261
            java.lang.String r2 = "emoji"
            goto L_0x05ee
        L_0x0261:
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x027f
            X.0eM r0 = r1.A0b
            java.lang.Object r3 = r0.getValue()
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36323307221494843(0x810bdb00012c3b, double:3.034343976867142E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0280
        L_0x027f:
            r0 = 0
        L_0x0280:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0285:
            java.lang.Object r0 = r13.A01
            X.9i2 r0 = (X.C384879i2) r0
            android.widget.TextView r1 = r0.A0D
            if (r1 != 0) goto L_0x029d
            java.lang.String r2 = "arrowView"
            goto L_0x05ee
        L_0x0291:
            java.lang.Object r0 = r13.A01
            X.9i2 r0 = (X.C384879i2) r0
            android.widget.TextView r1 = r0.A0P
            if (r1 != 0) goto L_0x029d
            java.lang.String r2 = "projectileView"
            goto L_0x05ee
        L_0x029d:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x05d5
        L_0x02a4:
            java.lang.Object r0 = r13.A01
            X.9i2 r0 = (X.C384879i2) r0
            X.0eM r0 = r0.A0b
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1Av r6 = X.1Au.A00(r0)
            return r6
        L_0x02b3:
            java.lang.Object r3 = r13.A01
            X.9i2 r3 = (X.C384879i2) r3
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x05d5
            android.view.View r1 = r3.A07
            java.lang.String r2 = "restartButton"
            if (r1 == 0) goto L_0x05ee
            r0 = 0
            r1.setAlpha(r0)
            android.view.View r0 = r3.A07
            if (r0 == 0) goto L_0x05ee
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setScaleX(r1)
            android.view.View r0 = r3.A07
            if (r0 == 0) goto L_0x05ee
            r0.setScaleY(r1)
            android.view.View r1 = r3.A07
            if (r1 == 0) goto L_0x05ee
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r0 = r3.A07
            if (r0 == 0) goto L_0x05ee
            android.view.ViewPropertyAnimator r1 = r0.animate()
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            r0.start()
            goto L_0x05d5
        L_0x0303:
            java.lang.Object r3 = r13.A01
            X.9i2 r3 = (X.C384879i2) r3
            android.widget.TextView r1 = r3.A0K
            if (r1 != 0) goto L_0x0312
            java.lang.String r7 = "gameOverLabel"
        L_0x030d:
            X.0qQ.A0F(r7)
            goto L_0x048f
        L_0x0312:
            r0 = 8
            r1.setVisibility(r0)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0374
            android.widget.TextView r6 = r3.A0J
            java.lang.String r7 = "finalScoreText"
            if (r6 == 0) goto L_0x030d
            android.content.Context r0 = r3.requireContext()
            android.content.res.Resources r5 = r0.getResources()
            r4 = 2131820699(0x7f11009b, float:1.927412E38)
            int r2 = r3.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r5.getQuantityString(r4, r2, r0)
            r6.setText(r0)
            android.widget.TextView r0 = r3.A0J
            if (r0 == 0) goto L_0x030d
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.A0J
            if (r0 == 0) goto L_0x030d
            r1 = 0
            r0.setScaleX(r1)
            android.widget.TextView r0 = r3.A0J
            if (r0 == 0) goto L_0x030d
            r0.setScaleY(r1)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.animation.ValueAnimator r2 = X.AnonymousClass7TG.A0J(r2, r0)
            r1 = 7
            X.AJX r0 = new X.AJX
            r0.<init>(r3, r1)
            X.C384879i2.A04(r0, r2, r3)
            r0 = 42
            A00(r2, r3, r0)
        L_0x0374:
            android.view.View r5 = r3.mView
            if (r5 == 0) goto L_0x03db
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L_0x03db
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            r0 = 2131231729(0x7f0803f1, float:1.8079547E38)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r4 = 0
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r1, r0}
            android.graphics.drawable.TransitionDrawable r1 = new android.graphics.drawable.TransitionDrawable
            r1.<init>(r0)
            r5.setBackground(r1)
            r0 = 200(0xc8, float:2.8E-43)
            r1.startTransition(r0)
            android.widget.ImageView r0 = r3.A0A
            if (r0 != 0) goto L_0x03a3
            java.lang.String r7 = "dismissButton"
            goto L_0x030d
        L_0x03a3:
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            X.0eM r2 = r3.A0e
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r1.setTint(r0)
            android.widget.TextView r0 = r3.A0L
            X.AnonymousClass7TH.A0T(r0, r2)
            android.widget.TextView r0 = r3.A0Q
            X.AnonymousClass7TH.A0T(r0, r2)
            android.widget.TextView r0 = r3.A0R
            X.AnonymousClass7TH.A0T(r0, r2)
            android.widget.ImageView r0 = r3.A0B
            if (r0 == 0) goto L_0x03d8
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto L_0x03d8
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r1.setTint(r0)
        L_0x03d8:
            X.C384879i2.A07(r3, r4)
        L_0x03db:
            android.view.View r0 = r3.A05
            X.AnonymousClass7TF.A16(r0)
            android.widget.TextView r0 = r3.A0M
            X.AnonymousClass7TH.A0R(r0)
            android.widget.TextView r0 = r3.A0N
            X.AnonymousClass7TF.A16(r0)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x05d5
            int r6 = r3.A04
            X.0eM r5 = r3.A0Y
            java.lang.Object r0 = r5.getValue()
            X.1Av r0 = (X.1Av) r0
            X.0xa r1 = r0.A01
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r2 = X.C66579MXk.A00(r0)
            r4 = 0
            int r0 = r1.getInt(r2, r4)
            if (r6 <= r0) goto L_0x05d5
            java.lang.Object r0 = r5.getValue()
            X.1Av r0 = (X.1Av) r0
            int r1 = r3.A04
            X.0xa r0 = r0.A01
            X.AnonymousClass7TG.A1M(r0, r2, r1)
            android.widget.TextView r1 = r3.A0L
            if (r1 == 0) goto L_0x0421
            java.lang.String r0 = X.C384879i2.A02(r3)
            r1.setText(r0)
        L_0x0421:
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0454
            android.widget.TextView r0 = r3.A0O
            java.lang.String r2 = "newHighScoreText"
            if (r0 == 0) goto L_0x05ee
            r0.setVisibility(r4)
            android.widget.TextView r0 = r3.A0O
            if (r0 == 0) goto L_0x05ee
            r1 = 0
            r0.setScaleX(r1)
            android.widget.TextView r0 = r3.A0O
            if (r0 == 0) goto L_0x05ee
            r0.setScaleY(r1)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.animation.ValueAnimator r1 = X.AnonymousClass7TG.A0J(r2, r0)
            r0 = 10
            X.AJX.A00(r1, r3, r0)
        L_0x0454:
            int r5 = r3.A04
            X.0eM r0 = r3.A0W
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x05d5
            X.0eM r0 = r3.A0d
            java.lang.Object r2 = r0.getValue()
            X.2YL r2 = (X.2YL) r2
            X.0eM r0 = r3.A0c
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.6oS r0 = X.C318116oQ.A00(r2)
            r4 = 0
            r6 = 2
            X.MFb r1 = new X.MFb
            r1.<init>(r2, r3, r4, r5, r6)
            X.AnonymousClass7TE.A1Z(r1, r0)
            goto L_0x05d5
        L_0x0482:
            java.lang.Object r4 = r13.A01
            X.9i2 r4 = (X.C384879i2) r4
            android.view.View r0 = r4.A06
            if (r0 != 0) goto L_0x0494
            java.lang.String r12 = "paddleView"
        L_0x048c:
            X.0qQ.A0F(r12)
        L_0x048f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0494:
            r3 = 8
            r0.setVisibility(r3)
            android.widget.TextView r0 = r4.A0I
            if (r0 != 0) goto L_0x04a0
            java.lang.String r12 = "explosionView"
            goto L_0x048c
        L_0x04a0:
            r0.setVisibility(r3)
            android.widget.TextView r0 = r4.A0H
            if (r0 != 0) goto L_0x04aa
            java.lang.String r12 = "currentScoreText"
            goto L_0x048c
        L_0x04aa:
            r0.setVisibility(r3)
            android.content.Context r10 = r4.getContext()
            if (r10 == 0) goto L_0x0579
            int r9 = X.0nA.A09(r10)
            int r8 = X.0nA.A08(r10)
            android.widget.FrameLayout r0 = r4.A09
            java.lang.String r12 = "emojiShowerContainer"
            if (r0 == 0) goto L_0x048c
            r0.removeAllViews()
            android.widget.FrameLayout r1 = r4.A09
            if (r1 == 0) goto L_0x048c
            r0 = 0
            r1.setY(r0)
            r7 = 25
            r6 = 0
        L_0x04cf:
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r10)
            android.widget.FrameLayout r0 = r4.A09
            if (r0 == 0) goto L_0x048c
            r0.addView(r5)
            r1 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r5.setLayoutParams(r0)
            X.0eM r0 = r4.A0X
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x05d8
            java.util.List r2 = X.C384879i2.A0g
            X.0eM r0 = r4.A0Z
            java.lang.Object r1 = r0.getValue()
            java.util.Random r1 = (java.util.Random) r1
            int r0 = r2.size()
            int r0 = r1.nextInt(r0)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r2, r0)
        L_0x0502:
            r5.setText(r0)
            X.0eM r0 = r4.A0V
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r5.setTextColor(r0)
            r11 = 1101004800(0x41a00000, float:20.0)
            X.0eM r1 = r4.A0Z
            java.lang.Object r2 = r1.getValue()
            java.util.Random r2 = (java.util.Random) r2
            r0 = 40
            int r0 = r2.nextInt(r0)
            float r0 = (float) r0
            float r0 = r0 + r11
            r5.setTextSize(r0)
            java.lang.Object r2 = r1.getValue()
            java.util.Random r2 = (java.util.Random) r2
            r0 = 360(0x168, float:5.04E-43)
            int r0 = r2.nextInt(r0)
            float r0 = (float) r0
            r5.setRotation(r0)
            java.lang.Object r0 = r1.getValue()
            java.util.Random r0 = (java.util.Random) r0
            int r0 = r0.nextInt(r9)
            float r0 = (float) r0
            r5.setX(r0)
            java.lang.Object r0 = r1.getValue()
            java.util.Random r0 = (java.util.Random) r0
            int r0 = r0.nextInt(r8)
            float r0 = (float) r0
            r5.setY(r0)
            int r6 = r6 + 1
            if (r6 < r7) goto L_0x04cf
            android.widget.FrameLayout r0 = r4.A09
            if (r0 == 0) goto L_0x048c
            android.view.ViewPropertyAnimator r2 = r0.animate()
            float r1 = (float) r8
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            android.view.ViewPropertyAnimator r2 = r2.y(r1)
            r0 = 3000(0xbb8, double:1.482E-320)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            r0.start()
        L_0x0579:
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x05d5
            android.view.View r0 = r4.A05
            if (r0 == 0) goto L_0x0586
            r0.setVisibility(r3)
        L_0x0586:
            android.widget.TextView r1 = r4.A0K
            java.lang.String r2 = "gameOverLabel"
            if (r1 == 0) goto L_0x05ee
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r0 = r4.A0K
            if (r0 == 0) goto L_0x05ee
            r1 = 0
            r0.setScaleX(r1)
            android.widget.TextView r0 = r4.A0K
            if (r0 == 0) goto L_0x05ee
            r0.setScaleY(r1)
            r5 = 2
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r1 = 200(0xc8, double:9.9E-322)
            android.animation.ValueAnimator r3 = X.AnonymousClass7TG.A0J(r0, r1)
            r0 = 8
            X.AJX.A00(r3, r4, r0)
            float[] r0 = new float[r5]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.ValueAnimator r2 = X.AnonymousClass7TG.A0J(r0, r1)
            r0 = 1200(0x4b0, double:5.93E-321)
            r2.setStartDelay(r0)
            r1 = 9
            X.AJX r0 = new X.AJX
            r0.<init>(r4, r1)
            X.C384879i2.A04(r0, r2, r4)
            r0 = 43
            A00(r2, r4, r0)
        L_0x05d5:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x05d8:
            java.lang.String r2 = "emoji"
            if (r6 != 0) goto L_0x05ea
            java.util.Map r1 = X.C384879i2.A0j
            java.lang.String r0 = r4.A0S
            if (r0 == 0) goto L_0x05ee
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0502
        L_0x05ea:
            java.lang.String r0 = r4.A0S
            if (r0 != 0) goto L_0x0502
        L_0x05ee:
            X.0qQ.A0F(r2)
            goto L_0x048f
        L_0x05f3:
            java.lang.Object r0 = r13.A01
            X.9i2 r0 = (X.C384879i2) r0
            X.0eM r0 = r0.A0b
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBq r6 = new X.KBq
            r6.<init>(r0)
            return r6
        L_0x0603:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.65E r0 = X.AnonymousClass65D.A00(r0)
            boolean r0 = r0.A00()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41655Ay7.invoke():java.lang.Object");
    }
}
