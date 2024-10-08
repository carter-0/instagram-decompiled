package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.54t  reason: invalid class name and case insensitive filesystem */
public final class C2809254t extends AnonymousClass0T0 implements C2809354u {
    public final NoteCustomThemeImpl A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Long A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;

    public final C2809254t F5s(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2809254t) {
                C2809254t r5 = (C2809254t) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A04;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.A05;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        NoteCustomThemeImpl noteCustomThemeImpl = this.A00;
        int hashCode3 = (hashCode2 + (noteCustomThemeImpl == null ? 0 : noteCustomThemeImpl.hashCode())) * 31;
        List list = this.A0B;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.A06;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.A07;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.A0C;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        User user = this.A01;
        int hashCode11 = (hashCode10 + (user == null ? 0 : user.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.A03;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode12 + i;
    }

    public final /* bridge */ /* synthetic */ C56009HrH AKG() {
        return new C56009HrH(this);
    }

    public final Integer AdI() {
        return this.A04;
    }

    public final Long AsC() {
        return this.A05;
    }

    public final NoteCustomTheme Auz() {
        return this.A00;
    }

    public final List Azi() {
        return this.A0B;
    }

    public final Long B2l() {
        return this.A06;
    }

    public final Boolean BCJ() {
        return this.A02;
    }

    public final List Bjr() {
        return this.A0C;
    }

    public final User CCd() {
        return this.A01;
    }

    public final Boolean CF2() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaNoteResponse", C54802HTj.A00(this));
    }

    public final String getId() {
        return this.A07;
    }

    public final String getMediaId() {
        return this.A08;
    }

    public final String getText() {
        return this.A09;
    }

    public final String getUserId() {
        return this.A0A;
    }

    public C2809254t(NoteCustomThemeImpl noteCustomThemeImpl, User user, Boolean bool, Boolean bool2, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, List list, List list2) {
        this.A04 = num;
        this.A05 = l;
        this.A00 = noteCustomThemeImpl;
        this.A0B = list;
        this.A06 = l2;
        this.A02 = bool;
        this.A07 = str;
        this.A08 = str2;
        this.A0C = list2;
        this.A09 = str3;
        this.A01 = user;
        this.A0A = str4;
        this.A03 = bool2;
    }

    public final C2809354u E7X(1E9 r1) {
        return this;
    }
}
