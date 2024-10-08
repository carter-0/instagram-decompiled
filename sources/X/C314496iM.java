package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6iM  reason: invalid class name and case insensitive filesystem */
public final class C314496iM {
    public AnonymousClass5Gv A00;
    public Runnable A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(C314506iN.A00);
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 29));
    public final AnonymousClass0iw A07;

    public final void A02(Activity activity, AnonymousClass9UE r10, String str, boolean z) {
        0xa r1;
        String str2;
        Boolean bool;
        String str3;
        C226262fy r0;
        boolean equals = str.equals("story_remix_reply");
        if (equals) {
            r1 = (0xa) this.A06.getValue();
            str2 = "has_seen_remix_reply_type";
        } else if (str.equals("story_selfie_reply")) {
            r1 = (0xa) this.A06.getValue();
            str2 = "has_seen_selfie_reply_type";
        } else {
            return;
        }
        if (!r1.getBoolean(str2, false)) {
            AnonymousClass5Gv r02 = this.A00;
            if (r02 != null) {
                bool = Boolean.valueOf(r02.A09());
            } else {
                bool = null;
            }
            if (!0qQ.A0K(bool, true)) {
                UserSession userSession = this.A04;
                AnonymousClass0iw r5 = this.A07;
                if (equals) {
                    str3 = "remix_reply_tooltip";
                } else {
                    str3 = "selfie_reply_tooltip";
                }
                C67000MgY.A01(r5, userSession, str3, "impression", "story_reply");
                int i = 2131971606;
                if (equals) {
                    i = 2131971602;
                }
                String string = activity.getString(i);
                0qQ.A07(string);
                AnonymousClass5Gt r12 = new AnonymousClass5Gt(activity, new C315476jx((CharSequence) string));
                if (z) {
                    r0 = C226262fy.ABOVE_ANCHOR;
                } else {
                    r0 = C226262fy.BELOW_ANCHOR;
                }
                r12.A05 = r0;
                r12.A05(r10);
                r12.A0B = true;
                r12.A0A = false;
                r12.A04 = new KSL(this, str);
                this.A00 = r12.A00();
                ((Handler) this.A05.getValue()).postDelayed(new C40892Al0(this), 500);
            }
        }
    }

    public final void A03(C66455MSj mSj, String str) {
        String str2;
        this.A02 = true;
        boolean equals = str.equals("story_remix_reply");
        UserSession userSession = this.A04;
        AnonymousClass0iw r3 = this.A07;
        if (equals) {
            str2 = "remix_reply_megaphone";
        } else {
            str2 = "selfie_reply_megaphone";
        }
        C67000MgY.A01(r3, userSession, str2, "impression", "story_reply");
        Context context = this.A03;
        int i = R.drawable.ig_illustrations_illo_selfie_reactions_refresh;
        if (equals) {
            i = R.drawable.ig_illustrations_illo_remix_reactions_refresh;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            int i2 = 2131974511;
            if (equals) {
                i2 = 2131974499;
            }
            String string = context.getString(i2);
            0qQ.A07(string);
            int i3 = 2131974510;
            if (equals) {
                i3 = 2131974497;
            }
            String string2 = context.getString(i3);
            0qQ.A07(string2);
            String string3 = context.getString(2131974498);
            0qQ.A07(string3);
            LV6 lv6 = new LV6(this, mSj, str);
            C358248ab r6 = new C358248ab(context);
            r6.A0j(drawable);
            r6.A05 = string;
            r6.A0q(string2);
            String string4 = context.getString(2131968772);
            0qQ.A07(string4);
            r6.A0V((DialogInterface.OnClickListener) null, C358278ae.BLUE_BOLD, string4, string3, true);
            r6.A0f(new LV5(lv6, this));
            Dialog A022 = r6.A02();
            if (this.A01 == null) {
                this.A01 = new C51273FrS(A022);
            } else {
                Handler handler = (Handler) this.A05.getValue();
                Runnable runnable = this.A01;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            Handler handler2 = (Handler) this.A05.getValue();
            Runnable runnable2 = this.A01;
            if (runnable2 != null) {
                handler2.post(runnable2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final int A00(C314496iM r3, String str) {
        0xa r1;
        String str2;
        if (0qQ.A0K(str, "story_remix_reply")) {
            r1 = (0xa) r3.A06.getValue();
            str2 = "has_viewed_remix_reply_dialog_nux_count";
        } else if (!0qQ.A0K(str, "story_selfie_reply")) {
            return 0;
        } else {
            r1 = (0xa) r3.A06.getValue();
            str2 = "has_viewed_selfie_reply_dialog_nux_count";
        }
        return r1.getInt(str2, 0);
    }

    public static final boolean A01(C314496iM r6, String str) {
        long A012 = 182.A01(0Tu.A05, r6.A04, 36596484321839613L);
        if (A012 < 0 || ((long) A00(r6, str)) < A012) {
            return true;
        }
        return false;
    }

    public C314496iM(Context context, AnonymousClass0iw r4, UserSession userSession) {
        this.A07 = r4;
        this.A03 = context;
        this.A04 = userSession;
    }
}
