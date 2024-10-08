package X;

import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Gcx  reason: case insensitive filesystem */
public final class C52805Gcx extends CountDownTimer {
    public final /* synthetic */ AnonymousClass3W1 A00;
    public final /* synthetic */ AnonymousClass57Q A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52805Gcx(AnonymousClass3W1 r3, AnonymousClass57Q r4, String str, long j) {
        super(j, 1000);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = str;
    }

    public final void onFinish() {
        String str;
        int i;
        AnonymousClass57Q r7 = this.A01;
        AnonymousClass3W1 r6 = this.A00;
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C234012wq r5 = r7.A0J;
        UserSession userSession = r5.A02;
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        String A002 = AnonymousClass000.A00(2984);
        if (A0q.getBoolean(A002, true)) {
            UserSession userSession2 = r7.A0K.A00;
            0Tu r10 = 0Tu.A06;
            if (182.A06(r10, userSession2, 36324840527770012L)) {
                str = "delayed_skip_tombstone_display_count";
                i = 0;
                if (AnonymousClass7TE.A0q(userSession).getInt(str, 0) < r5.A00) {
                    if (r6 != null) {
                        r6.A3B = true;
                    }
                    0xa A0q2 = AnonymousClass7TE.A0q(userSession);
                    AnonymousClass7TG.A1L(A0q2.AR4(), A0q2, str, i);
                }
            }
            if (182.A06(r10, userSession2, 36324840527311258L)) {
                0xa A0q3 = AnonymousClass7TE.A0q(userSession);
                if (A0q3.getBoolean(A002, true)) {
                    str = "delayed_skip_tombstone_display_count";
                    i = 0;
                    if (A0q3.getInt(str, 0) < r5.A00) {
                        if (r6 != null) {
                            r6.A3C = true;
                        }
                        0xa A0q22 = AnonymousClass7TE.A0q(userSession);
                        AnonymousClass7TG.A1L(A0q22.AR4(), A0q22, str, i);
                    }
                }
            }
        }
        if (182.A06(0Tu.A06, r7.A0K.A00, 36324840527835549L) && (AnonymousClass7TE.A0q(userSession).getInt("delayed_skip_tombstone_display_count", 0) >= r5.A00 || !AnonymousClass7TE.A0q(userSession).getBoolean(A002, true))) {
            if (r6 != null) {
                r6.A39 = true;
            }
            0xa A0q4 = AnonymousClass7TE.A0q(userSession);
            AnonymousClass7TG.A1L(A0q4.AR4(), A0q4, "delayed_skip_tombstone_display_count", 0);
        }
        if (r6 != null) {
            r6.A0c = (long) DbT.A00(AnonymousClass7TE.A0q(userSession), "delayed_skip_tombstone_display_count");
        }
        r7.A03();
        1Av A003 = 1Au.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0p = AnonymousClass7TE.A0p(A003);
        A0p.E5c(AnonymousClass000.A00(684), currentTimeMillis);
        A0p.apply();
        AnonymousClass57Q.A00(r7, AnonymousClass05K.A0u, "unknown");
        if (r6 != null) {
            r6.A0b = 0;
        }
        r7.A0M.A00.get(this.A02);
    }

    public final void onTick(long j) {
        AnonymousClass57Q r3 = this.A01;
        C227802jw r1 = r3.A06;
        if (r1 != null) {
            int i = r3.A01;
            IgTextView igTextView = r1.A04;
            if (igTextView != null) {
                igTextView.setText(String.valueOf(i));
            }
        }
        AnonymousClass3W1 r2 = this.A00;
        if (r2 != null) {
            r2.A0b = (long) r3.A01;
        }
        r3.A0M.A00.get(this.A02);
        r3.A01--;
    }
}
