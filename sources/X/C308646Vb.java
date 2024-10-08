package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(message = "Sync all changes with the Kotlin implementation of @ReelContentInvalidatorKt")
/* renamed from: X.6Vb  reason: invalid class name and case insensitive filesystem */
public final class C308646Vb implements AnonymousClass2wO {
    public final AnonymousClass2wO A00;
    public final AnonymousClass2wO A01;

    public final /* bridge */ /* synthetic */ void AWG(C54608HKr hKr, 1PW r3, Object obj) {
        this.A00.AWG(hKr, r3, obj);
        this.A01.AWG(hKr, r3, obj);
    }

    public final C271864ji E4e(String str, Collection collection, Map map, boolean z) {
        C271864ji E4e = this.A00.E4e(str, collection, map, z);
        C271864ji E4e2 = this.A01.E4e(str, E4e.A01, map, z);
        ArrayList arrayList = new ArrayList(E4e.A00);
        arrayList.addAll(E4e2.A00);
        return new C271864ji(E4e2.A01, arrayList);
    }

    public C308646Vb(AnonymousClass2wO r1, AnonymousClass2wO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
