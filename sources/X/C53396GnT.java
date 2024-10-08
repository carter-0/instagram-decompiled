package X;

import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import java.util.List;

/* renamed from: X.GnT  reason: case insensitive filesystem */
public final class C53396GnT extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    public C53396GnT(boolean z) {
        this((C61076JwE) null, (C15050ULg) null, (C4P) null, C54636HLt.Initial, "", (AnonymousClass62P) AnonymousClass62M.A01, z);
    }

    public static /* synthetic */ C53396GnT A00(C61076JwE jwE, C53396GnT gnT, C54636HLt hLt, String str, AnonymousClass62P r11, int i) {
        C61076JwE jwE2 = jwE;
        AnonymousClass62P r6 = r11;
        String str2 = str;
        C54636HLt hLt2 = hLt;
        C4P c4p = null;
        C15050ULg uLg = null;
        boolean z = false;
        if ((i & 1) != 0) {
            hLt2 = (C54636HLt) gnT.A02;
        }
        if ((i & 2) != 0) {
            str2 = gnT.A06;
        }
        if ((i & 4) != 0) {
            r6 = (AnonymousClass62P) gnT.A05;
        }
        if ((i & 8) != 0) {
            c4p = (C4P) gnT.A04;
        }
        if ((i & 16) != 0) {
            jwE2 = (C61076JwE) gnT.A03;
        }
        if ((i & 32) != 0) {
            uLg = (C15050ULg) gnT.A01;
        }
        if ((i & 64) != 0) {
            z = gnT.A07;
        }
        AnonymousClass7TG.A1T(hLt2, str2, r6);
        return new C53396GnT(jwE2, uLg, c4p, hLt2, str2, r6, z);
    }

    public final boolean equals(Object obj) {
        C53396GnT gnT;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53396GnT) {
                    gnT = (C53396GnT) obj;
                    if (gnT.A00 == 0 && 0qQ.A0K(this.A06, gnT.A06) && this.A01 == gnT.A01 && this.A05 == gnT.A05 && this.A03 == gnT.A03 && 0qQ.A0K(this.A02, gnT.A02)) {
                        obj2 = this.A04;
                        obj3 = gnT.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53396GnT) {
                    gnT = (C53396GnT) obj;
                    if (gnT.A00 == 1 && this.A02 == gnT.A02 && 0qQ.A0K(this.A06, gnT.A06) && 0qQ.A0K(this.A05, gnT.A05) && 0qQ.A0K(this.A04, gnT.A04) && 0qQ.A0K(this.A03, gnT.A03)) {
                        obj2 = this.A01;
                        obj3 = gnT.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C53396GnT)) {
                    return false;
                }
                C53396GnT gnT2 = (C53396GnT) obj;
                if (gnT2.A00 != 2 || !0qQ.A0K(this.A05, gnT2.A05) || !0qQ.A0K(this.A03, gnT2.A03) || this.A04 != gnT2.A04 || !0qQ.A0K(this.A02, gnT2.A02) || this.A07 != gnT2.A07 || !0qQ.A0K(this.A06, gnT2.A06) || !0qQ.A0K(this.A01, gnT2.A01)) {
                    return false;
                }
                return true;
        }
        if (!0qQ.A0K(obj2, obj3) || this.A07 != gnT.A07) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                int A072 = AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A06)));
                i = AnonymousClass7TE.A0N(this.A04, (AnonymousClass7TF.A07(this.A03, A072) + AnonymousClass7TG.A0C(this.A02)) * 31);
                break;
            case 1:
                i = ((((AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0K(this.A02))) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01);
                break;
            default:
                i2 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A05))))));
                i3 = AnonymousClass7TG.A0C(this.A01);
                break;
        }
        i2 = i * 31;
        i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public final String toString() {
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UiState(title=");
        A1A.append(this.A05);
        A1A.append(AnonymousClass000.A00(2019));
        A1A.append(this.A03);
        A1A.append(", screenId=");
        A1A.append(this.A04);
        A1A.append(", contentUiState=");
        A1A.append(this.A02);
        A1A.append(", showSearchBar=");
        A1A.append(this.A07);
        A1A.append(", searchQuery=");
        A1A.append(this.A06);
        A1A.append(", actionButton=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    public C53396GnT(C61083JwL jwL, C54703HPi hPi, C21251XQw xQw, List list) {
        this((C61065Jw3) null, jwL, hPi, xQw, "", list, false);
    }

    public C53396GnT(C61076JwE jwE, C15050ULg uLg, C4P c4p, C54636HLt hLt, String str, AnonymousClass62P r7, boolean z) {
        this.A02 = hLt;
        this.A06 = str;
        this.A05 = r7;
        this.A04 = c4p;
        this.A03 = jwE;
        this.A01 = uLg;
        this.A07 = z;
    }

    public C53396GnT(NoteAudience noteAudience, C68176N3r n3r, NoteCreationSource noteCreationSource, NoteStyle noteStyle, String str, List list, boolean z) {
        AnonymousClass7TG.A1O(str, noteAudience);
        this.A06 = str;
        this.A01 = noteAudience;
        this.A05 = noteStyle;
        this.A03 = noteCreationSource;
        this.A02 = n3r;
        this.A04 = list;
        this.A07 = z;
    }

    public C53396GnT(C61065Jw3 jw3, C61083JwL jwL, C54703HPi hPi, C21251XQw xQw, String str, List list, boolean z) {
        0qQ.A0B(jwL, 1);
        AnonymousClass7TG.A0w(2, list, xQw, hPi);
        0qQ.A0B(str, 6);
        this.A05 = jwL;
        this.A03 = list;
        this.A04 = xQw;
        this.A02 = hPi;
        this.A07 = z;
        this.A06 = str;
        this.A01 = jw3;
    }

    public C53396GnT(NoteAudience noteAudience, C68176N3r n3r, NoteCreationSource noteCreationSource, NoteStyle noteStyle, String str, List list) {
        this(noteAudience, n3r, noteCreationSource, noteStyle, str, list, false);
    }
}
