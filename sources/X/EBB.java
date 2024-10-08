package X;

public final class EBB extends 1P0 {
    public final /* synthetic */ AnonymousClass32F A00;

    public EBB(AnonymousClass32F r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1082900404);
        CFL cfl = (CFL) obj;
        int A0D = AnonymousClass7TG.A0D(cfl, -2008133732);
        AnonymousClass32F r2 = this.A00;
        1Xj A02 = 1E7.A00(AnonymousClass32F.A01(r2)).A02(r2.A0A);
        if (A02 != null) {
            C45285Cto cto = cfl.A00;
            0qQ.A07(cto);
            A02.A42(cto);
            C54229H3y h3y = r2.A09;
            if (h3y == null) {
                DbS.A13();
                throw AnonymousClass00P.createAndThrow();
            }
            h3y.notifyDataSetChanged();
            AnonymousClass0fD.A0A(60396838, A0D);
            AnonymousClass0fD.A0A(-508983954, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(582780031, A0D);
        throw A0y;
    }
}
