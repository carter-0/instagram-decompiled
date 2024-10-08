package X;

import java.util.List;

/* renamed from: X.SkK  reason: case insensitive filesystem */
public final class C12001SkK implements C13882Tj5 {
    public boolean A00;
    public final /* synthetic */ SUv A01;
    public final /* synthetic */ List A02;

    public C12001SkK(SUv sUv, List list) {
        this.A01 = sUv;
        this.A02 = list;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        if (!this.A00) {
            this.A00 = true;
            08j.A00("Glide registry");
            try {
                return C9203RTg.A00(this.A01, this.A02);
            } finally {
                AnonymousClass08k.A00();
            }
        } else {
            throw AnonymousClass7TE.A0z("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
    }
}
