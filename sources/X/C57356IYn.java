package X;

/* renamed from: X.IYn  reason: case insensitive filesystem */
public final class C57356IYn implements C230422pb {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public C57356IYn(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public final /* bridge */ /* synthetic */ C253533qw AUN(C230472pg r23, Object obj, Object obj2, float f, long j, long j2) {
        C267324bN r1 = (C267324bN) obj;
        C230472pg r2 = r23;
        AnonymousClass7TG.A1T(r1, obj2, r2);
        AnonymousClass3OA A06 = r1.A06();
        String str = A06.A0S;
        String str2 = this.A01;
        String id = A06.A0K.getId();
        if (id == null) {
            id = "UNKNOWN";
        }
        return new C253533qw(r2, str, str2, id, this.A00, AnonymousClass000.A00(1485), "", f, 0, -1, -1, -1, -1, -1, -1, -1, j, j2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUM(Object obj, Object obj2) {
        return C254373sN.A01(C51966G9m.A0s(C51969G9p.A0g(obj)));
    }
}
