package X;

/* renamed from: X.9Q4  reason: invalid class name */
public final class AnonymousClass9Q4 implements 1wn {
    public final /* synthetic */ AnonymousClass8ZV A00;

    public AnonymousClass9Q4(AnonymousClass8ZV r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1364505959);
        C59933Jbx jbx = (C59933Jbx) obj;
        int A032 = AnonymousClass0fD.A03(-178038943);
        0qQ.A0B(jbx, 0);
        if (jbx.A01) {
            AnonymousClass8ZV r7 = this.A00;
            boolean z = r7.A0F;
            if (z && jbx.A00 < 2) {
                JW9 jw9 = r7.A08;
                if (jw9 != null) {
                    jw9.setNextEnabledWithColor(false);
                }
            } else if (jbx.A00 != r7.A00 || z) {
                JW9 jw92 = r7.A08;
                if (jw92 != null) {
                    jw92.setNextEnabledWithColor(true);
                }
            } else {
                C59689JTv.A09(r7.getContext(), r7.requireContext().getResources().getString(2131973048, AnonymousClass7TF.A1b(r7.A00)));
            }
            0qQ.A0F("actionBar");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(844540498, A032);
        AnonymousClass0fD.A0A(-1830962616, A03);
    }
}
