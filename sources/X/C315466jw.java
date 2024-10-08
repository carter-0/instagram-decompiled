package X;

import android.app.Activity;

/* renamed from: X.6jw  reason: invalid class name and case insensitive filesystem */
public final class C315466jw implements C234222xL {
    public AnonymousClass5Gv A00;
    public AnonymousClass6Z3 A01;
    public final AnonymousClass5Gt A02;
    public final 0xa A03;
    public final String A04 = "has_seen_ad_expand_story_button_tooltip";

    public final boolean Ds8(AnonymousClass5Gv r2) {
        return true;
    }

    public final void DsE(AnonymousClass5Gv r1) {
    }

    public final void DsC(AnonymousClass5Gv r2) {
        AnonymousClass6Z3 r0 = this.A01;
        if (r0 != null) {
            r0.DsB();
        }
    }

    public final void DsH(AnonymousClass5Gv r4) {
        0xY AR4 = this.A03.AR4();
        AR4.E5T(this.A04, true);
        AR4.apply();
        AnonymousClass6Z3 r0 = this.A01;
        if (r0 != null) {
            r0.DkX();
        }
    }

    public C315466jw(Activity activity, 0xa r4) {
        this.A03 = r4;
        String string = activity.getString(2131961850);
        0qQ.A07(string);
        AnonymousClass5Gt r1 = new AnonymousClass5Gt(activity, new C315476jx((CharSequence) string));
        r1.A0G = true;
        r1.A06(C226262fy.ABOVE_ANCHOR);
        r1.A04 = this;
        this.A02 = r1;
    }
}
