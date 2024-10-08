package X;

/* renamed from: X.B3u  reason: case insensitive filesystem */
public final class C41851B3u implements 1OW {
    public final /* bridge */ /* synthetic */ Object E1o(16F r2) {
        0qQ.A0B(r2, 0);
        C66381md parseFromJson = C44691CjJ.parseFromJson(r2);
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final void ENE(17Z r3, Object obj) {
        AnonymousClass7TG.A1N(r3, obj);
        C66381md r4 = (C66381md) obj;
        r3.A0c();
        String str = r4.A00;
        if (str != null) {
            r3.A0R("media_id", str);
            String str2 = r4.A01;
            if (str2 != null) {
                r3.A0R("reply_text", str2);
            }
            C66893Meb.A00(r3, r4);
            r3.A0Z();
            return;
        }
        0qQ.A0F("mediaId");
        throw AnonymousClass00P.createAndThrow();
    }
}
