package X;

import com.instagram.api.schemas.FeedItemType;
import com.instagram.api.schemas.TIXUDesignTypeEnum;
import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import java.util.List;

/* renamed from: X.4oc  reason: invalid class name and case insensitive filesystem */
public final class C274584oc extends AnonymousClass0T0 {
    public final FeedItemType A00;
    public final C67241sS A01;
    public final C274524oV A02;
    public final C274524oV A03;
    public final C274574ob A04;
    public final TIXUDesignTypeEnum A05;
    public final ThreadsInFeedUnitTypeEnum A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274584oc) {
                C274584oc r5 = (C274584oc) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || this.A00 != r5.A00 || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0B, r5.A0B) || this.A06 != r5.A06 || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D) || this.A05 != r5.A05 || !0qQ.A0K(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C274524oV r0 = this.A02;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        C274574ob r02 = this.A04;
        int hashCode2 = (hashCode + (r02 == null ? 0 : r02.hashCode())) * 31;
        FeedItemType feedItemType = this.A00;
        int hashCode3 = (hashCode2 + (feedItemType == null ? 0 : feedItemType.hashCode())) * 31;
        Integer num = this.A07;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        C274524oV r03 = this.A03;
        int hashCode5 = (hashCode4 + (r03 == null ? 0 : r03.hashCode())) * 31;
        String str = this.A09;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        C67241sS r04 = this.A01;
        int hashCode7 = (hashCode6 + (r04 == null ? 0 : r04.hashCode())) * 31;
        List list = this.A0E;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A0A;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.A0F;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.A0B;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum = this.A06;
        int hashCode12 = (hashCode11 + (threadsInFeedUnitTypeEnum == null ? 0 : threadsInFeedUnitTypeEnum.hashCode())) * 31;
        String str4 = this.A0C;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0D;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        TIXUDesignTypeEnum tIXUDesignTypeEnum = this.A05;
        int hashCode15 = (hashCode14 + (tIXUDesignTypeEnum == null ? 0 : tIXUDesignTypeEnum.hashCode())) * 31;
        Integer num2 = this.A08;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode15 + i;
    }

    public C274584oc(FeedItemType feedItemType, C67241sS r3, C274524oV r4, C274524oV r5, C274574ob r6, TIXUDesignTypeEnum tIXUDesignTypeEnum, ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = feedItemType;
        this.A07 = num;
        this.A03 = r5;
        this.A09 = str;
        this.A01 = r3;
        this.A0E = list;
        this.A0A = str2;
        this.A0F = list2;
        this.A0B = str3;
        this.A06 = threadsInFeedUnitTypeEnum;
        this.A0C = str4;
        this.A0D = str5;
        this.A05 = tIXUDesignTypeEnum;
        this.A08 = num2;
    }
}
