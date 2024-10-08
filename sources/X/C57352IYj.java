package X;

/* renamed from: X.IYj  reason: case insensitive filesystem */
public final class C57352IYj implements C230422pb {
    public final /* synthetic */ AnonymousClass4DU A00;
    public final /* synthetic */ String A01;

    public C57352IYj(AnonymousClass4DU r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUM(Object obj, Object obj2) {
        1Xj r0;
        C296935qt r2 = (C296935qt) obj;
        0qQ.A0B(r2, 0);
        if (r2 instanceof C296965qw) {
            r0 = ((C296965qw) r2).BPf();
        } else {
            r0 = null;
        }
        return C254373sN.A01(r0);
    }

    public final /* bridge */ /* synthetic */ C253533qw AUN(C230472pg r24, Object obj, Object obj2, float f, long j, long j2) {
        1Xj r2;
        String str;
        String str2;
        C296935qt r1 = (C296935qt) obj;
        C230472pg r3 = r24;
        AnonymousClass7TG.A1T(r1, obj2, r3);
        if (r1 instanceof C296965qw) {
            r2 = ((C296965qw) r1).BPf();
        } else {
            r2 = null;
        }
        String str3 = null;
        if (r3 == C230472pg.SPONSORED) {
            if (r2 != null) {
                str3 = r2.A2R();
            }
        } else if (r2 != null) {
            str3 = r2.A2n();
        }
        String valueOf = String.valueOf(str3);
        if (r2 != null) {
            str = r2.getId();
            if (str != null) {
                str2 = C51971G9r.A0r(r2);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            str = "n/a";
            str2 = "not_set";
        }
        return new C253533qw(r3, valueOf, this.A01, str, this.A00.getModuleName(), str2, "", f, 0, -1, -1, -1, -1, -1, -1, -1, j, j2);
    }
}
