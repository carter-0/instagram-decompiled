package X;

import java.util.List;

/* renamed from: X.WaN  reason: case insensitive filesystem */
public final class C19475WaN implements C2802350v {
    public static final C14272Tsv A01;
    public static final int[] A02;
    public static final int[] A03 = C14276Tsz.A02((C14272Tsv) DbZ.A0g(C17164VKt.A02, 0));
    public final AnonymousClass8YF A00;

    static {
        C14272Tsv tsv = (C14272Tsv) DbZ.A0g(C17164VKt.A01, 0);
        A01 = tsv;
        A02 = C14276Tsz.A02(tsv);
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!0qQ.A0K(getClass(), JTR.A0v(obj))) {
            return false;
        }
        AnonymousClass8YF r1 = this.A00;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.reels.fundraiser.model.FundraiserStickerModel");
        if (0qQ.A0K(r1, ((C19475WaN) obj).A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C19475WaN(AnonymousClass8YF r1) {
        this.A00 = r1;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        AnonymousClass7TG.A1J(C317876nz.A0p, A0C);
        return A0C;
    }
}
