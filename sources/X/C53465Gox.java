package X;

import com.instagram.api.schemas.TrackData;
import java.util.List;

/* renamed from: X.Gox  reason: case insensitive filesystem */
public final class C53465Gox extends AnonymousClass0T0 implements C46232DRn {
    public final int A00;
    public final TrackData A01;
    public final List A02;
    public final List A03;

    public final C53465Gox F9E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53465Gox) {
                C53465Gox gox = (C53465Gox) obj;
                if (!0qQ.A0K(this.A03, gox.A03) || !0qQ.A0K(this.A02, gox.A02) || !0qQ.A0K(this.A01, gox.A01) || this.A00 != gox.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03))) + this.A00;
    }

    public C53465Gox(TrackData trackData, List list, List list2, int i) {
        AnonymousClass7TG.A1U(list, list2, trackData);
        this.A03 = list;
        this.A02 = list2;
        this.A01 = trackData;
        this.A00 = i;
    }
}
