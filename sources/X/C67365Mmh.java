package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.user.model.User;

/* renamed from: X.Mmh  reason: case insensitive filesystem */
public final class C67365Mmh extends C66942Mfb {
    public OriginalSoundData A00;
    public TrackDataImpl A01;
    public TrackMetadataImpl A02;
    public HashtagImpl A03;
    public Keyword A04;
    public MapQuery A05;
    public C18072Vl0 A06;
    public User A07;
    public Integer A08;
    public Object A09;
    public String A0A = "";
    public String A0B = "";

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67365Mmh) || this.A08 == null) {
            return false;
        }
        C67365Mmh mmh = (C67365Mmh) obj;
        if (!0qQ.A0K(this.A0A, mmh.A0A) || this.A08 != mmh.A08) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int A0O = AnonymousClass7TE.A0O(this.A0A);
        Integer num = this.A08;
        if (num != null) {
            i = C51971G9r.A0D(num, C67419Mna.A00(num));
        } else {
            i = 0;
        }
        return A0O + i;
    }
}
