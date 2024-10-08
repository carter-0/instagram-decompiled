package X;

import com.instagram.api.schemas.DemarcatorActionType;
import com.instagram.api.schemas.DemarcatorStyleEnum;
import com.instagram.api.schemas.FeedItemType;

/* renamed from: X.4ZE  reason: invalid class name */
public final class AnonymousClass4ZE extends AnonymousClass0T0 {
    public final DemarcatorActionType A00;
    public final DemarcatorActionType A01;
    public final DemarcatorStyleEnum A02;
    public final FeedItemType A03;
    public final C67241sS A04;
    public final AnonymousClass4ZG A05;
    public final AnonymousClass4ZF A06;
    public final Boolean A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final Boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4ZE) {
                AnonymousClass4ZE r5 = (AnonymousClass4ZE) obj;
                if (!0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0C, r5.A0C) || this.A00 != r5.A00 || !0qQ.A0K(this.A0D, r5.A0D) || this.A01 != r5.A01 || this.A02 != r5.A02 || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0F, r5.A0F) || this.A03 != r5.A03 || !0qQ.A0K(this.A0A, r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A08;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A09;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        AnonymousClass4ZF r0 = this.A06;
        int hashCode3 = (hashCode2 + (r0 == null ? 0 : r0.hashCode())) * 31;
        AnonymousClass4ZG r02 = this.A05;
        int hashCode4 = (hashCode3 + (r02 == null ? 0 : r02.hashCode())) * 31;
        String str = this.A0B;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A0G;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        C67241sS r03 = this.A04;
        int hashCode7 = (hashCode6 + (r03 == null ? 0 : r03.hashCode())) * 31;
        Boolean bool2 = this.A07;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.A0C;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DemarcatorActionType demarcatorActionType = this.A00;
        int hashCode10 = (hashCode9 + (demarcatorActionType == null ? 0 : demarcatorActionType.hashCode())) * 31;
        String str3 = this.A0D;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DemarcatorActionType demarcatorActionType2 = this.A01;
        int hashCode12 = (hashCode11 + (demarcatorActionType2 == null ? 0 : demarcatorActionType2.hashCode())) * 31;
        DemarcatorStyleEnum demarcatorStyleEnum = this.A02;
        int hashCode13 = (hashCode12 + (demarcatorStyleEnum == null ? 0 : demarcatorStyleEnum.hashCode())) * 31;
        String str4 = this.A0E;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0F;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        FeedItemType feedItemType = this.A03;
        int hashCode16 = (hashCode15 + (feedItemType == null ? 0 : feedItemType.hashCode())) * 31;
        Integer num3 = this.A0A;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode16 + i;
    }

    public AnonymousClass4ZE(DemarcatorActionType demarcatorActionType, DemarcatorActionType demarcatorActionType2, DemarcatorStyleEnum demarcatorStyleEnum, FeedItemType feedItemType, C67241sS r6, AnonymousClass4ZG r7, AnonymousClass4ZF r8, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5) {
        this.A08 = num;
        this.A09 = num2;
        this.A06 = r8;
        this.A05 = r7;
        this.A0B = str;
        this.A0G = bool;
        this.A04 = r6;
        this.A07 = bool2;
        this.A0C = str2;
        this.A00 = demarcatorActionType;
        this.A0D = str3;
        this.A01 = demarcatorActionType2;
        this.A02 = demarcatorStyleEnum;
        this.A0E = str4;
        this.A0F = str5;
        this.A03 = feedItemType;
        this.A0A = num3;
    }
}
