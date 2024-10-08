package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.2gm  reason: invalid class name */
public final class AnonymousClass2gm {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final 1QK A00() {
        Integer num;
        if (!this.A02 || ((num = this.A00) != AnonymousClass05K.A0C && num != AnonymousClass05K.A01)) {
            return 1QK.A0F;
        }
        return 1QK.A09;
    }

    public AnonymousClass2gm(Integer num) {
        Integer num2;
        if (AnonymousClass05K.A01 == num) {
            this.A01 = "hide_hero";
            this.A02 = true;
            this.A03 = true;
            num2 = AnonymousClass05K.A0C;
        } else {
            this.A01 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            num2 = AnonymousClass05K.A00;
        }
        this.A00 = num2;
    }
}
