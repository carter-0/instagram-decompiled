package X;

import java.util.HashMap;

/* renamed from: X.2oM  reason: invalid class name */
public final class AnonymousClass2oM implements C250603lj {
    public final AnonymousClass2oI A00;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        String str;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        Object obj = r6.A03;
        AnonymousClass3UH r4 = (AnonymousClass3UH) obj;
        if (r7.CEk(r6) == AnonymousClass05K.A00) {
            HashMap hashMap = new HashMap();
            String str2 = r4.A0C;
            if (str2 != null) {
                hashMap.put("insertion_context", str2);
            }
            if (r4.A04() != null) {
                str = "preview";
            } else {
                if (r4.A0M != null) {
                    str = "profile";
                }
                AnonymousClass2oI r1 = this.A00;
                0qQ.A06(obj);
                r1.A00((AnonymousClass3O9) obj, hashMap, ((C242803Vz) r6.A04).getPosition());
            }
            hashMap.put("format", str);
            AnonymousClass2oI r12 = this.A00;
            0qQ.A06(obj);
            r12.A00((AnonymousClass3O9) obj, hashMap, ((C242803Vz) r6.A04).getPosition());
        }
    }

    public AnonymousClass2oM(AnonymousClass2oI r1) {
        this.A00 = r1;
    }
}
