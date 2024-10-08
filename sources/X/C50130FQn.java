package X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.FQn  reason: case insensitive filesystem */
public final class C50130FQn implements C13907Tl7, X5M {
    public C49720F3h A00;
    public String A01;
    public boolean A02;
    public final C49726F3q A03;

    public C50130FQn(Context context, Bundle bundle, AnonymousClass07V r8, G9A g9a) {
        Object A022;
        r8.A09(this);
        if (bundle != null) {
            Class<C49720F3h> cls = C49720F3h.class;
            int i = bundle.getInt(AnonymousClass000.A00(1216), -1);
            if (i == -1) {
                A022 = null;
            } else {
                A022 = C14615TzM.A02(cls, Integer.valueOf(i));
            }
            0qQ.A0C(A022, AnonymousClass000.A00(3673));
            C49720F3h f3h = (C49720F3h) A022;
            String string = bundle.getString("dark_mode_config");
            if (string != null) {
                int intValue = C46642DiN.A00(string).intValue();
                boolean z = true;
                if (intValue != 0) {
                    if (intValue != 1) {
                        z = AnonymousClass3HA.A00(context);
                    } else {
                        z = false;
                    }
                }
                C49726F3q f3q = new C49726F3q(context, f3h.A03, z);
                f3q.A00 = g9a;
                this.A03 = f3q;
                this.A00 = f3h;
                this.A01 = f3h.A02.A00;
                this.A02 = true;
                return;
            }
            throw AnonymousClass7TE.A0z("Dark mode config is missing from the bundle. Please check that 'dark_mode_config' field is set.");
        }
        throw AnonymousClass7TE.A1B("Navigation from Bloks to Native is not yet supported.");
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final F3c AbQ() {
        String str = this.A01;
        if (str != null) {
            return new F3c(str, str);
        }
        return null;
    }

    public final void onDestroy(AnonymousClass07Z r3) {
        this.A03.A00 = null;
    }

    public final void onResume(AnonymousClass07Z r7) {
        if (this.A02) {
            C49720F3h f3h = this.A00;
            if (f3h != null) {
                C49726F3q f3q = this.A03;
                C49719F3f f3f = f3h.A02;
                0qQ.A0C(f3f, AnonymousClass000.A00(3674));
                f3q.A01(f3h.A01, f3f, f3h.A04, f3h.A00);
                this.A00 = null;
            }
            this.A02 = false;
        }
    }
}
