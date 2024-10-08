package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9IF  reason: invalid class name */
public final class AnonymousClass9IF extends AnonymousClass0T0 implements MQQ {
    public final int A00;
    public final Object A01;

    public AnonymousClass9IF(Drawable drawable, int i) {
        this.A00 = i;
        if (i != 0) {
            0qQ.A0B(drawable, 1);
        }
        this.A01 = drawable;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9IF) || ((AnonymousClass9IF) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((AnonymousClass9IF) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj;
        switch (this.A00) {
            case 0:
            case 1:
                obj = this.A01;
                if (obj == null) {
                    return 0;
                }
                break;
            default:
                obj = this.A01;
                break;
        }
        return obj.hashCode();
    }

    public AnonymousClass9IF(Integer num) {
        this.A00 = 1;
        this.A01 = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9IF() {
        this((Integer) null);
        this.A00 = 1;
    }
}
