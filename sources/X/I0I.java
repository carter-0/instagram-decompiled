package X;

import androidx.fragment.app.Fragment;

public final class I0I {
    public final void A01(int i, Integer num) {
        String A16 = AnonymousClass7TE.A16(C60960kU.A00, i);
        C310336ap A0W = DbV.A0W();
        A0W.A0D = A16;
        A0W.A0O = true;
        if (num != null) {
            int intValue = num.intValue();
            A0W.A02();
            A0W.A04 = C60960kU.A00.getDrawable(intValue);
        }
        1xC.A01.A00(new AnonymousClass3GP(A0W.A00()));
    }

    public static final C54251H4u A00(Fragment fragment, C62320sa r6, C62320sa r7, int i, int i2, int i3, int i4) {
        AnonymousClass6ST A0h = DbV.A0h(fragment.requireContext());
        AnonymousClass0xx A0E = DbW.A0E(fragment);
        A0h.A00(fragment.getString(i));
        return new C54251H4u(A0h, r6, r7, A0E, i4, i2, i3);
    }
}
