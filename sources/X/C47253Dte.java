package X;

import android.view.View;
import java.util.AbstractCollection;

/* renamed from: X.Dte  reason: case insensitive filesystem */
public final class C47253Dte extends AnonymousClass0T0 implements C232262tL {
    public final View.OnClickListener A00;
    public final C266444Yx A01;
    public final C266444Yx A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47253Dte) {
                C47253Dte dte = (C47253Dte) obj;
                if (!0qQ.A0K(this.A02, dte.A02) || !0qQ.A0K(this.A01, dte.A01) || !0qQ.A0K(this.A00, dte.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AbstractCollection abstractCollection, Object[] objArr, int i) {
        abstractCollection.add(new C47253Dte((View.OnClickListener) null, new GKO(objArr, i), (C266444Yx) null));
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C47253Dte(View.OnClickListener onClickListener, C266444Yx r2, C266444Yx r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = onClickListener;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
