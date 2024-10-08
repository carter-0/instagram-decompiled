package X;

import android.view.View;

/* renamed from: X.3dy  reason: invalid class name and case insensitive filesystem */
public final class C246093dy implements C246053du {
    public final float AWv(AnonymousClass2VT r7) {
        0qQ.A0B(r7, 0);
        2TG r5 = r7.A03;
        if (r5 == null || (r5.A0F & 1048576) == 0) {
            return 1.0f;
        }
        return r5.A00;
    }

    public final float AWw(Object obj) {
        0qQ.A0B(obj, 0);
        if (obj instanceof View) {
            return ((View) obj).getAlpha();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Tried to get alpha of unsupported mount content: ");
        sb.append(obj);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final void EHt(Object obj) {
        0qQ.A0B(obj, 0);
        ENI(obj, 1.0f);
    }

    public final void ENI(Object obj, float f) {
        0qQ.A0B(obj, 0);
        if (obj instanceof View) {
            ((View) obj).setAlpha(f);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Setting alpha on unsupported mount content: ");
        sb.append(obj);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final String getName() {
        return "alpha";
    }
}
