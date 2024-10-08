package X;

import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;

/* renamed from: X.Lub  reason: case insensitive filesystem */
public final class C65513Lub implements C66575MXg {
    public C65512Lua A00;
    public C63736L4u A01 = new C63736L4u(0, (Object) null);
    public final MusicSearchQueryViewModel A02;

    public final void ACw() {
        if (this.A01.A00 == 3) {
            this.A02.A02();
        }
    }

    public final boolean CJz() {
        C65512Lua lua = this.A00;
        if (lua == null) {
            return false;
        }
        C60246Ji3 ji3 = lua.A02.A0G;
        if (ji3.A09.size() > 0 || ji3.A08.size() > 0) {
            return true;
        }
        return false;
    }

    public final boolean CKB() {
        C63736L4u l4u = this.A01;
        if (l4u.A00 == 3) {
            Object obj = l4u.A01;
            if (obj != null) {
                CGO cgo = (CGO) ((JV5) obj).A00;
                if (cgo == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (!cgo.A00()) {
                    return false;
                } else {
                    return true;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return false;
    }

    public final boolean CT5() {
        return AnonymousClass7TF.A1S(this.A01.A00, 4);
    }

    public final boolean CWV() {
        return AnonymousClass7TF.A1P(this.A01.A00);
    }

    public final void CgO() {
        this.A02.A02();
    }

    public final boolean isLoading() {
        if (this.A01.A00 != 1) {
            return false;
        }
        return true;
    }

    public C65513Lub(MusicSearchQueryViewModel musicSearchQueryViewModel) {
        this.A02 = musicSearchQueryViewModel;
    }
}
