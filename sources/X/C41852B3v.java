package X;

/* renamed from: X.B3v  reason: case insensitive filesystem */
public final class C41852B3v implements 1OW {
    public final /* bridge */ /* synthetic */ Object E1o(16F r2) {
        0qQ.A0B(r2, 0);
        C66391mg parseFromJson = C44692CjK.parseFromJson(r2);
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final void ENE(17Z r3, Object obj) {
        AnonymousClass7TG.A1N(r3, obj);
        C66391mg r4 = (C66391mg) obj;
        r3.A0c();
        String str = r4.A00;
        if (str != null) {
            r3.A0R("container_id", str);
            String str2 = r4.A01;
            if (str2 != null) {
                r3.A0R("reshare_text", str2);
            }
            C66893Meb.A00(r3, r4);
            r3.A0Z();
            return;
        }
        0qQ.A0F("containerId");
        throw AnonymousClass00P.createAndThrow();
    }
}
