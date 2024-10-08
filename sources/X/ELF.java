package X;

public final class ELF extends C324596za {
    public final /* synthetic */ AnonymousClass32F A00;

    public ELF(AnonymousClass32F r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-1679853141);
        AnonymousClass32F r3 = this.A00;
        C59689JTv.A0F(r3.requireActivity(), AnonymousClass000.A00(275), 2131956760);
        C54229H3y h3y = r3.A09;
        if (h3y == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        h3y.notifyDataSetChanged();
        AnonymousClass32F.A05(r3);
        AnonymousClass0fD.A0A(453719940, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1637789891);
        AnonymousClass3AD r1 = this.A00.A07;
        if (r1 != null) {
            r1.setIsLoading(false);
        }
        AnonymousClass0fD.A0A(-1571404697, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(54629756);
        AnonymousClass32F.A05(this.A00);
        AnonymousClass0fD.A0A(-1566645048, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1949427257);
        1XO r4 = (1XO) obj;
        int A0D = AnonymousClass7TG.A0D(r4, 820932932);
        this.A00.A0c(r4);
        AnonymousClass0fD.A0A(-617455513, A0D);
        AnonymousClass0fD.A0A(-485980150, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-801407585);
        AnonymousClass0fD.A0A(102244441, AnonymousClass0fD.A03(-1144628958));
        AnonymousClass0fD.A0A(-728770339, A03);
    }
}
