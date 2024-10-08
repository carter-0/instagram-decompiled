package X;

/* renamed from: X.NLv  reason: case insensitive filesystem */
public final class C68524NLv extends 1P0 {
    public final 0sL A00;

    public C68524NLv(0sL r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r6) {
        int A0D = AnonymousClass7TG.A0D(r6, 295171250);
        NH3 nh3 = (NH3) r6.A00();
        if (nh3 != null) {
            this.A00.invoke(Integer.valueOf(nh3.mStatusCode), nh3.A00);
        }
        AnonymousClass0fD.A0A(-966748456, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1208443362);
        NH3 nh3 = (NH3) obj;
        int A0D = AnonymousClass7TG.A0D(nh3, -1996335718);
        this.A00.invoke(Integer.valueOf(nh3.mStatusCode), nh3.A00);
        AnonymousClass0fD.A0A(1293888449, A0D);
        AnonymousClass0fD.A0A(-1604139190, A03);
    }
}
