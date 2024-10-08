package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dhh  reason: case insensitive filesystem */
public final class C46601Dhh implements C13907Tl7, AnonymousClass3M5, X5M {
    public int A00;
    public AnonymousClass3M5 A01;
    public 0lg A02;
    public C21043XAw A03;
    public X5O A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final 2el A09;
    public final G9A A0A;
    public final IgBloksScreenConfig A0B;
    public final AnonymousClass3DZ A0C;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final void onPause(AnonymousClass07Z r2) {
        this.A01 = null;
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46601Dhh(android.content.Context r15, android.os.Bundle r16, X.AnonymousClass07V r17, X.G9A r18) {
        /*
            r14 = this;
            r1 = r18
            r2 = 1
            r7 = 3
            r10 = r14
            r14.<init>()
            r14.A0A = r1
            r6 = 0
            X.2ej r0 = X.C71682ef.A00()
            X.2el r9 = X.C71682ef.A01(r6, r0)
            r14.A09 = r9
            r3 = r17
            r3.A09(r14)
            X.TyM r1 = (X.C14557TyM) r1
            X.Dhn r0 = new X.Dhn
            r0.<init>(r3, r1)
            X.3DZ r5 = X.AnonymousClass3DZ.A00(r0)
            r14.A0C = r5
            r4 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r3 = r16
            if (r16 == 0) goto L_0x012e
            X.0lg r0 = r1.A01
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0129
            r14.A02 = r0
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = com.instagram.bloks.hosting.IgBloksScreenConfig.A01(r3, r0)
            if (r0 == 0) goto L_0x0124
            r14.A0B = r0
            java.lang.String r0 = "__nav_data_type"
            java.lang.String r5 = r3.getString(r0)     // Catch:{ RuntimeException -> 0x0083 }
            if (r5 != 0) goto L_0x0049
            goto L_0x00a9
        L_0x0049:
            java.lang.String r0 = "screen_query"
            boolean r1 = r5.equals(r0)     // Catch:{ RuntimeException -> 0x0083 }
            if (r1 != 0) goto L_0x0060
            java.lang.String r0 = "legacy_screen"
            boolean r0 = r5.equals(r0)     // Catch:{ RuntimeException -> 0x0083 }
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "No bundler found to create navigation data of type: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r5)     // Catch:{ RuntimeException -> 0x0083 }
        L_0x005f:
            throw r0     // Catch:{ RuntimeException -> 0x0083 }
        L_0x0060:
            if (r1 != 0) goto L_0x007e
            java.lang.String r0 = "legacy_screen"
            boolean r0 = r5.equals(r0)     // Catch:{ RuntimeException -> 0x0083 }
            if (r0 == 0) goto L_0x006f
            X.DiQ r9 = X.C46645DiQ.A01(r3)     // Catch:{ RuntimeException -> 0x0083 }
            goto L_0x00aa
        L_0x006f:
            java.lang.Object[] r1 = new java.lang.Object[]{r5}     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ RuntimeException -> 0x0083 }
            goto L_0x005f
        L_0x007e:
            X.WEz r9 = X.C18523VtN.A00(r3)     // Catch:{ RuntimeException -> 0x0083 }
            goto L_0x00aa
        L_0x0083:
            r9 = r6
        L_0x0084:
            java.lang.String r0 = "__nav_data_type"
            java.lang.String r0 = r3.getString(r0)
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r5 = "IgCdsBottomSheetFragment"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r8, r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r7)
            java.lang.String r0 = "Has savedInstanceState: %s | From config changes: %s | Has navigationType: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
            X.1Kn.A02(r5, r0)
            goto L_0x00b0
        L_0x00a9:
            r9 = 0
        L_0x00aa:
            if (r9 == 0) goto L_0x0084
            java.lang.String r6 = r9.Ac5()
        L_0x00b0:
            r14.A06 = r6
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0B
            java.lang.String r0 = r0.A0R
            r14.A05 = r0
            r0 = 542(0x21e, float:7.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Bundle r1 = r3.getBundle(r0)
            if (r1 == 0) goto L_0x011d
            X.F1a r0 = X.C46471DfZ.A0P
            X.DfZ r1 = r0.A00(r1)
            r0 = 1614(0x64e, float:2.262E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x011a
            X.Di6 r1 = r1.A0E
            X.Di6 r0 = X.C46626Di6.FULL_SCREEN
            if (r1 != r0) goto L_0x011a
            java.lang.String r0 = "screen_id"
            java.lang.String r13 = r3.getString(r0)
            X.0Sd.A00(r13)
            r0 = 1459(0x5b3, float:2.044E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r3.getInt(r0)
            r14.A00 = r0
            java.lang.String r0 = "back_button_override"
            java.lang.Integer r1 = X.DbV.A0o(r3, r0)
            java.lang.Class<X.X5O> r0 = X.X5O.class
            java.lang.Object r0 = X.C14615TzM.A02(r0, r1)
            X.X5O r0 = (X.X5O) r0
            r14.A04 = r0
            java.lang.String r0 = "is_limited_theme"
            boolean r0 = r3.getBoolean(r0)
            r14.A07 = r0
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0B
            X.68u r11 = r0.A07
            if (r9 == 0) goto L_0x011a
            X.8dD r12 = r0.A05()
            r8 = r15
            X.XAw r0 = X.C49954FGj.A01(r8, r9, r10, r11, r12, r13)
            r14.A03 = r0
        L_0x011a:
            r14.A08 = r2
            return
        L_0x011d:
            java.lang.String r0 = "Open sheet config must be provided with `cds_open_screen_config` key."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0124:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0129:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x012e:
            android.view.View r1 = r1.mView
            X.2eo[] r0 = new X.AnonymousClass2eo[r4]
            r9.A08(r1, r5, r0)
            r14.A0B = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46601Dhh.<init>(android.content.Context, android.os.Bundle, X.07V, X.G9A):void");
    }

    public final F3c AbQ() {
        String str = this.A06;
        if (str == null) {
            return null;
        }
        String str2 = this.A05;
        if (TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            } else {
                str2 = "bloks_unknown";
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "bloks_unknown_class";
        }
        0qQ.A0A(str2);
        0qQ.A0A(str);
        return new F3c(str2, str);
    }

    public final void Ddp(int i) {
        AnonymousClass3M5 r0 = this.A01;
        if (r0 != null) {
            r0.Ddp(i);
        }
    }

    public final void onDestroy(AnonymousClass07Z r3) {
        F1F f1f;
        0lg r0;
        UserSession A012;
        IgBloksScreenConfig igBloksScreenConfig = this.A0B;
        if (igBloksScreenConfig != null && (f1f = igBloksScreenConfig.A03) != null && (r0 = this.A02) != null && (A012 = 0Gl.A01(r0)) != null) {
            f1f.A00(A012);
        }
    }

    public final void onResume(AnonymousClass07Z r8) {
        if (this.A08) {
            2el r3 = this.A09;
            AnonymousClass3DZ r2 = this.A0C;
            Fragment fragment = this.A0A;
            r3.A08(fragment.mView, r2, new AnonymousClass2eo[0]);
            C21043XAw xAw = this.A03;
            if (xAw != null) {
                fragment.E0j(xAw, new C14578Tyi(this.A04, this.A00, this.A07));
                this.A03 = null;
            }
            this.A08 = false;
        }
        G9A g9a = this.A0A;
        if (g9a instanceof AnonymousClass3M5) {
            this.A01 = (AnonymousClass3M5) g9a;
        }
    }
}
