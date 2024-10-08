package X;

import com.instagram.music.common.model.LyricsPhrase;
import java.util.List;

/* renamed from: X.Wak  reason: case insensitive filesystem */
public final class C19498Wak implements X8Z {
    public final AnonymousClass9SE A00;

    public final List A00(int i) {
        if (i >= 0 && i < BcH()) {
            return ((LyricsPhrase) this.A00.A00.get(i)).A02;
        }
        throw DbT.A0m();
    }

    public final int AYh(int i) {
        return C17038VFm.A00(this.A00.A00, i);
    }

    public final String BcG(int i) {
        if (i >= 0 && i < BcH()) {
            return ((LyricsPhrase) this.A00.A00.get(i)).A01;
        }
        throw DbT.A0m();
    }

    public final int BcH() {
        return this.A00.A00.size();
    }

    public final int Byp(int i) {
        if (i >= 0 && i < BcH()) {
            return ((LyricsPhrase) this.A00.A00.get(i)).A00;
        }
        throw DbT.A0m();
    }

    public C19498Wak(AnonymousClass9SE r1) {
        this.A00 = r1;
    }
}
