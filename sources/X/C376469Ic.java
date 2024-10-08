package X;

import android.content.DialogInterface;
import android.graphics.RectF;
import com.instagram.model.reels.Reel;

/* renamed from: X.9Ic  reason: invalid class name and case insensitive filesystem */
public final class C376469Ic extends AnonymousClass0T0 implements C334127ai {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C376469Ic(RectF rectF, Reel reel, C62320sa r4) {
        this.A03 = reel;
        this.A02 = rectF;
        this.A01 = r4;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376469Ic)) {
                return false;
            }
            C376469Ic r3 = (C376469Ic) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A01, r3.A01)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = r3.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376469Ic)) {
                return false;
            }
            C376469Ic r32 = (C376469Ic) obj;
            if (r32.A00 != 0 || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A02, r32.A02)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = r32.A01;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj;
        if (this.A00 != 0) {
            hashCode = ((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31;
            obj = this.A02;
        } else {
            hashCode = ((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31;
            obj = this.A01;
        }
        return hashCode + obj.hashCode();
    }

    public C376469Ic(DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        this.A03 = onClickListener;
        this.A01 = onClickListener2;
        this.A02 = onCancelListener;
    }
}
