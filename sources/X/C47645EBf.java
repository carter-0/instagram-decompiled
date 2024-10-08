package X;

import com.instagram.igds.components.form.IgFormField;
import java.util.HashMap;

/* renamed from: X.EBf  reason: case insensitive filesystem */
public final class C47645EBf extends 1P0 {
    public final String A00;
    public final C62320sa A01;

    public C47645EBf(String str, C62320sa r3) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = r3;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(570072867);
        C49313Esw.A01.put(this.A00, EVF.FAILED);
        ((IgFormField) this.A01.invoke()).A0E();
        AnonymousClass0fD.A0A(-2035310048, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        EVF evf;
        int A03 = AnonymousClass0fD.A03(-702614929);
        C47365Dvz dvz = (C47365Dvz) obj;
        int A0D = AnonymousClass7TG.A0D(dvz, 1496274299);
        HashMap hashMap = C49313Esw.A01;
        String str = this.A00;
        if (dvz.A02) {
            evf = EVF.A02;
        } else {
            evf = EVF.UNAVAILABLE;
        }
        hashMap.put(str, evf);
        ((IgFormField) this.A01.invoke()).A0E();
        AnonymousClass0fD.A0A(-49854259, A0D);
        AnonymousClass0fD.A0A(1674408060, A03);
    }
}
