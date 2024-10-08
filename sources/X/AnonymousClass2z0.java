package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2z0  reason: invalid class name */
public final class AnonymousClass2z0 implements C229292n9 {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final /* synthetic */ String A02;

    public AnonymousClass2z0(UserSession userSession, String str) {
        this.A02 = str;
        this.A00 = AnonymousClass0eN.A01(new AnonymousClass9LU(userSession, 48));
        this.A01 = AnonymousClass0eN.A01(new AnonymousClass9LU(userSession, 49));
    }

    public final boolean Axa() {
        Object value = this.A00.getValue();
        0qQ.A07(value);
        return ((Boolean) value).booleanValue();
    }

    public final 1Bm BM2() {
        String str;
        String str2 = this.A02;
        switch (str2.hashCode()) {
            case -849559289:
                str = "smb_support_sticker_prefs";
                break;
            case -825846745:
                str = AnonymousClass000.A00(4050);
                break;
            case -277889517:
                str = "ig_threads_in_stories_unit";
                break;
            case -151634498:
                str = "clips_viewer_ghost";
                break;
            case 239603921:
                str = "merlin_impression";
                break;
            case 1735369040:
                str = "clips_viewer_qp";
                break;
            default:
                return 1Bm.A02;
        }
        if (str2.equals(str)) {
            return 1Bm.A03;
        }
        return 1Bm.A02;
    }

    public final boolean BuY() {
        return ((Boolean) this.A01.getValue()).booleanValue();
    }

    public final String getFileName() {
        return this.A02;
    }
}
