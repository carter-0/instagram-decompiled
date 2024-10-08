package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import java.util.List;

/* renamed from: X.3Ho  reason: invalid class name and case insensitive filesystem */
public final class C239673Ho extends AnonymousClass0T0 implements C239683Hp {
    public final C61222JzF A00;
    public final C61222JzF A01;
    public final C61222JzF A02;
    public final C61222JzF A03;
    public final C61222JzF A04;
    public final ShoppingNetegoInStoryIconType A05;
    public final ShoppingNetegoInStorySuggestionType A06;
    public final ShoppingNetegoType A07;
    public final Boolean A08;
    public final Integer A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final List A0E;

    public final C239673Ho FF3(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C239673Ho) {
                C239673Ho r5 = (C239673Ho) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A09, r5.A09) || this.A05 != r5.A05 || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A08, r5.A08) || this.A07 != r5.A07 || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A03, r5.A03) || this.A06 != r5.A06 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C61222JzF jzF = this.A00;
        int i = 0;
        int hashCode = (jzF == null ? 0 : jzF.hashCode()) * 31;
        C61222JzF jzF2 = this.A01;
        int hashCode2 = (hashCode + (jzF2 == null ? 0 : jzF2.hashCode())) * 31;
        C61222JzF jzF3 = this.A02;
        int hashCode3 = (hashCode2 + (jzF3 == null ? 0 : jzF3.hashCode())) * 31;
        Integer num = this.A09;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType = this.A05;
        int hashCode5 = (hashCode4 + (shoppingNetegoInStoryIconType == null ? 0 : shoppingNetegoInStoryIconType.hashCode())) * 31;
        Long l = this.A0A;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.A08;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        ShoppingNetegoType shoppingNetegoType = this.A07;
        int hashCode8 = (hashCode7 + (shoppingNetegoType == null ? 0 : shoppingNetegoType.hashCode())) * 31;
        List list = this.A0D;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A0E;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C61222JzF jzF4 = this.A03;
        int hashCode11 = (hashCode10 + (jzF4 == null ? 0 : jzF4.hashCode())) * 31;
        ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType = this.A06;
        int hashCode12 = (hashCode11 + (shoppingNetegoInStorySuggestionType == null ? 0 : shoppingNetegoInStorySuggestionType.hashCode())) * 31;
        C61222JzF jzF5 = this.A04;
        int hashCode13 = (hashCode12 + (jzF5 == null ? 0 : jzF5.hashCode())) * 31;
        String str = this.A0B;
        int hashCode14 = (hashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A0C;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode14 + i;
    }

    public final /* bridge */ /* synthetic */ C66565MWt AhJ() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C66565MWt AwS() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C66565MWt AwT() {
        return this.A02;
    }

    public final Integer AzH() {
        return this.A09;
    }

    public final ShoppingNetegoInStoryIconType BE8() {
        return this.A05;
    }

    public final Long BEY() {
        return this.A0A;
    }

    public final ShoppingNetegoType BVs() {
        return this.A07;
    }

    public final List Bga() {
        return this.A0D;
    }

    public final List Btt() {
        return this.A0E;
    }

    public final /* bridge */ /* synthetic */ C66565MWt C2a() {
        return this.A03;
    }

    public final ShoppingNetegoInStorySuggestionType C2s() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ C66565MWt C7m() {
        return this.A04;
    }

    public final String C9L() {
        return this.A0B;
    }

    public final String CBA() {
        return this.A0C;
    }

    public final Boolean Cdn() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShoppingNetegoInStory", C44900Cmq.A00(this));
    }

    public C239673Ho(C61222JzF jzF, C61222JzF jzF2, C61222JzF jzF3, C61222JzF jzF4, C61222JzF jzF5, ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType, ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType, ShoppingNetegoType shoppingNetegoType, Boolean bool, Integer num, Long l, String str, String str2, List list, List list2) {
        this.A00 = jzF;
        this.A01 = jzF2;
        this.A02 = jzF3;
        this.A09 = num;
        this.A05 = shoppingNetegoInStoryIconType;
        this.A0A = l;
        this.A08 = bool;
        this.A07 = shoppingNetegoType;
        this.A0D = list;
        this.A0E = list2;
        this.A03 = jzF4;
        this.A06 = shoppingNetegoInStorySuggestionType;
        this.A04 = jzF5;
        this.A0B = str;
        this.A0C = str2;
    }

    public final C239683Hp EA1(1E9 r1) {
        return this;
    }
}
