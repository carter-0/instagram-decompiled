package X;

import com.instagram.mediakit.model.MediaKitSectionType;

/* renamed from: X.LiJ  reason: case insensitive filesystem */
public final class C64799LiJ implements C232262tL {
    public final MediaKitSectionType A00;
    public final K42 A01;
    public final String A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0T(this.A03, this.A00.A00, '_');
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64799LiJ liJ = (C64799LiJ) obj;
        String str2 = this.A03;
        if (liJ != null) {
            str = liJ.A03;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str2, str) || !0qQ.A0K(this.A02, liJ.A02) || this.A00 != liJ.A00) {
            return false;
        }
        return true;
    }

    public C64799LiJ(MediaKitSectionType mediaKitSectionType, K42 k42, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = mediaKitSectionType;
        this.A01 = k42;
    }
}
