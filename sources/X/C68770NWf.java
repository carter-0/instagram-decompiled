package X;

import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.direct.inbox.notes.models.NoteAudience;

/* renamed from: X.NWf  reason: case insensitive filesystem */
public final class C68770NWf extends C69985NvP {
    public final GIFNoteResponseInfo A00;
    public final LocationNoteResponseInfo A01;
    public final NotePogImageDict A02;
    public final NotePogVideoDict A03;
    public final ImageUrl A04;
    public final ContentNoteMetadata A05;
    public final NoteAudience A06;
    public final N3C A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final int A0O;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68770NWf) {
                C68770NWf nWf = (C68770NWf) obj;
                if (!0qQ.A0K(this.A0A, nWf.A0A) || !0qQ.A0K(this.A0G, nWf.A0G) || !0qQ.A0K(this.A09, nWf.A09) || !0qQ.A0K(this.A04, nWf.A04) || !0qQ.A0K(this.A0B, nWf.A0B) || !0qQ.A0K(this.A08, nWf.A08) || this.A0O != nWf.A0O || this.A06 != nWf.A06 || !0qQ.A0K(this.A0F, nWf.A0F) || this.A0K != nWf.A0K || this.A0N != nWf.A0N || this.A0J != nWf.A0J || this.A0I != nWf.A0I || this.A0M != nWf.A0M || this.A0L != nWf.A0L || !0qQ.A0K(this.A0D, nWf.A0D) || !0qQ.A0K(this.A0C, nWf.A0C) || !0qQ.A0K(this.A07, nWf.A07) || !0qQ.A0K(this.A01, nWf.A01) || !0qQ.A0K(this.A03, nWf.A03) || !0qQ.A0K(this.A02, nWf.A02) || !0qQ.A0K(this.A00, nWf.A00) || !0qQ.A0K(this.A05, nWf.A05) || this.A0H != nWf.A0H || !0qQ.A0K(this.A0E, nWf.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A0G, AnonymousClass7TE.A0O(this.A0A));
        int A083 = AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A0B, (AnonymousClass7TF.A08(this.A09, A082) + AnonymousClass7TG.A0C(this.A04)) * 31));
        int A002 = C54732HQn.A00();
        return AnonymousClass7TF.A09(this.A0H, (((((((((((((((((((AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0J, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A08(this.A0F, AnonymousClass7TF.A07(this.A06, (((A083 + A002) * 31) + this.A0O) * 31)))))))) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + A002) * 31) + A002) * 31) + C41845B3m.A00(this.A0E);
    }

    public C68770NWf(GIFNoteResponseInfo gIFNoteResponseInfo, LocationNoteResponseInfo locationNoteResponseInfo, NotePogImageDict notePogImageDict, NotePogVideoDict notePogVideoDict, ImageUrl imageUrl, ContentNoteMetadata contentNoteMetadata, NoteAudience noteAudience, N3C n3c, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(str4, 5);
        C51973G9u.A0u(6, str5, noteAudience, str6);
        this.A0A = str;
        this.A0G = str2;
        this.A09 = str3;
        this.A04 = imageUrl;
        this.A0B = str4;
        this.A08 = str5;
        this.A0O = i;
        this.A06 = noteAudience;
        this.A0F = str6;
        this.A0K = z;
        this.A0N = z2;
        this.A0J = z3;
        this.A0I = z4;
        this.A0M = z5;
        this.A0L = z6;
        this.A0D = str7;
        this.A0C = str8;
        this.A07 = n3c;
        this.A01 = locationNoteResponseInfo;
        this.A03 = notePogVideoDict;
        this.A02 = notePogImageDict;
        this.A00 = gIFNoteResponseInfo;
        this.A05 = contentNoteMetadata;
        this.A0H = z7;
        this.A0E = str9;
    }
}
