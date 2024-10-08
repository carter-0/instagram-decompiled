package X;

import android.util.Pair;

/* renamed from: X.2op  reason: invalid class name and case insensitive filesystem */
public final class C230042op implements C229222n2 {
    public final /* synthetic */ String A00;

    public C230042op(String str) {
        this.A00 = str;
    }

    public final String BK2(AnonymousClass30Y r5) {
        String str;
        AnonymousClass3UH r0;
        0qQ.A0B(r5, 0);
        String str2 = this.A00;
        Pair pair = (Pair) r5.A03;
        if (pair == null || (r0 = (AnonymousClass3UH) pair.first) == null) {
            str = null;
        } else {
            str = r0.A0F;
            if (str == null) {
                str = "";
            }
        }
        return 002.A0u(str2, str, "_suggested_user_card_", r5.A05);
    }
}
