package X;

import com.instagram.api.schemas.FeedItemType;
import com.instagram.api.schemas.TIXUDesignTypeEnum;
import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import java.util.List;

/* renamed from: X.4oe  reason: invalid class name and case insensitive filesystem */
public final class C274594oe implements AnonymousClass3O9 {
    public final C274524oV A00;
    public final C274524oV A01;
    public final C274574ob A02;
    public final C274584oc A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;

    public C274594oe(C274584oc r3) {
        Integer num;
        Integer num2;
        this.A03 = r3;
        String str = r3.A0C;
        this.A08 = str == null ? "" : str;
        0sn r0 = r3.A0E;
        this.A09 = r0 == null ? 0sn.A00 : r0;
        ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum = r3.A06;
        if (threadsInFeedUnitTypeEnum == null || threadsInFeedUnitTypeEnum.ordinal() != 2) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        this.A04 = num;
        String str2 = r3.A0A;
        this.A06 = str2 == null ? "tifu_dev_unit" : str2;
        this.A07 = r3.A0B;
        this.A01 = r3.A03;
        this.A00 = r3.A02;
        this.A0A = r3.A0F;
        this.A02 = r3.A04;
        TIXUDesignTypeEnum tIXUDesignTypeEnum = r3.A05;
        if (tIXUDesignTypeEnum == null || tIXUDesignTypeEnum.ordinal() != 2) {
            num2 = AnonymousClass05K.A01;
        } else {
            num2 = AnonymousClass05K.A00;
        }
        this.A05 = num2;
    }

    public final 1UQ B5J() {
        String str;
        1UQ r0;
        FeedItemType feedItemType = this.A03.A00;
        if (feedItemType == null || (str = feedItemType.A00) == null || (r0 = (1UQ) 1UQ.A01.get(str)) == null) {
            return 1UQ.A0z;
        }
        return r0;
    }

    public final Integer B9V() {
        return this.A03.A07;
    }

    public final C67241sS BJP() {
        return this.A03.A01;
    }

    public final /* synthetic */ Integer BVp() {
        return null;
    }

    public final String C9L() {
        return this.A03.A0D;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0N;
    }

    public final Integer CEl() {
        return this.A03.A08;
    }

    public final String getId() {
        return this.A03.A09;
    }
}
