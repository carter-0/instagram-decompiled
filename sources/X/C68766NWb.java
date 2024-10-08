package X;

import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfo;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import java.util.List;

/* renamed from: X.NWb  reason: case insensitive filesystem */
public final class C68766NWb extends C69595Nod {
    public final GIFNoteResponseInfo A00;
    public final ListeningNowResponseInfo A01;
    public final LocationNoteResponseInfo A02;
    public final MusicNoteResponseInfo A03;
    public final NoteChatResponseInfo A04;
    public final NotePogImageDict A05;
    public final NotePogVideoDict A06;
    public final AnonymousClass60L A07;
    public final C279864zZ A08;
    public final ImageUrl A09;
    public final NoteAudienceItem A0A;
    public final Boolean A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final boolean A0J;
    public final int A0K;
    public final LiveNoteResponseInfo A0L;

    public C68766NWb(GIFNoteResponseInfo gIFNoteResponseInfo, ListeningNowResponseInfo listeningNowResponseInfo, LiveNoteResponseInfo liveNoteResponseInfo, LocationNoteResponseInfo locationNoteResponseInfo, MusicNoteResponseInfo musicNoteResponseInfo, NoteChatResponseInfo noteChatResponseInfo, NotePogImageDict notePogImageDict, NotePogVideoDict notePogVideoDict, AnonymousClass60L r14, C279864zZ r15, ImageUrl imageUrl, NoteAudienceItem noteAudienceItem, Boolean bool, String str, String str2, String str3, String str4, List list, List list2, List list3, int i, boolean z) {
        String str5 = str;
        0qQ.A0B(str5, 3);
        String str6 = str4;
        List list4 = list;
        C66581MXm.A1P(str6, 18, list4);
        List list5 = list2;
        0qQ.A0B(list5, 21);
        this.A08 = r15;
        this.A09 = imageUrl;
        this.A0C = str5;
        this.A0K = i;
        this.A0A = noteAudienceItem;
        this.A0J = z;
        this.A03 = musicNoteResponseInfo;
        this.A02 = locationNoteResponseInfo;
        this.A0L = liveNoteResponseInfo;
        this.A01 = listeningNowResponseInfo;
        this.A00 = gIFNoteResponseInfo;
        this.A06 = notePogVideoDict;
        this.A05 = notePogImageDict;
        this.A0E = str2;
        this.A0F = str3;
        this.A0B = bool;
        this.A04 = noteChatResponseInfo;
        this.A0D = str6;
        this.A0I = list4;
        this.A07 = r14;
        this.A0G = list5;
        this.A0H = list3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68766NWb) {
                C68766NWb nWb = (C68766NWb) obj;
                if (!0qQ.A0K(this.A08, nWb.A08) || !0qQ.A0K(this.A09, nWb.A09) || !0qQ.A0K(this.A0C, nWb.A0C) || this.A0K != nWb.A0K || !0qQ.A0K(this.A0A, nWb.A0A) || this.A0J != nWb.A0J || !0qQ.A0K(this.A03, nWb.A03) || !0qQ.A0K(this.A02, nWb.A02) || !0qQ.A0K(this.A0L, nWb.A0L) || !0qQ.A0K(this.A01, nWb.A01) || !0qQ.A0K(this.A00, nWb.A00) || !0qQ.A0K(this.A06, nWb.A06) || !0qQ.A0K(this.A05, nWb.A05) || !0qQ.A0K(this.A0E, nWb.A0E) || !0qQ.A0K(this.A0F, nWb.A0F) || !0qQ.A0K(this.A0B, nWb.A0B) || !0qQ.A0K(this.A04, nWb.A04) || !0qQ.A0K(this.A0D, nWb.A0D) || !0qQ.A0K(this.A0I, nWb.A0I) || !0qQ.A0K(this.A07, nWb.A07) || !0qQ.A0K(this.A0G, nWb.A0G) || !0qQ.A0K(this.A0H, nWb.A0H)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0C;
        int A072 = AnonymousClass7TF.A07(this.A0A, (AnonymousClass7TF.A08(str, (AnonymousClass7TE.A0K(this.A08) + AnonymousClass7TG.A0C(this.A09)) * 31) + this.A0K) * 31);
        int A082 = AnonymousClass7TF.A08(this.A0D, (((((((((((((((((((((AnonymousClass7TF.A09(this.A0J, A072) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A0L)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31);
        return AnonymousClass7TE.A0N(this.A0H, AnonymousClass7TF.A07(this.A0G, (AnonymousClass7TF.A07(this.A0I, A082) + AnonymousClass7TE.A0L(this.A07)) * 31));
    }
}
