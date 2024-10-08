package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.90B  reason: invalid class name */
public final class AnonymousClass90B extends 0ho {
    public int A00 = -1;
    public List A01 = 0sn.A00;
    public final SparseArray A02 = new SparseArray();
    public final UserSession A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90B(0hq r2, UserSession userSession, String str) {
        super(r2, 0);
        0qQ.A0B(userSession, 2);
        this.A03 = userSession;
        this.A04 = str;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(obj, 2);
        this.A02.remove(i);
        AnonymousClass90B.super.destroyItem(viewGroup, i, obj);
    }

    public final int getItemPosition(Object obj) {
        Bundle bundle;
        0qQ.A0B(obj, 0);
        int i = 0;
        if (!(obj instanceof K5E)) {
            if (!(obj instanceof K5D) || (bundle = ((Fragment) obj).mArguments) == null) {
                return -2;
            }
            String string = bundle.getString(AnonymousClass000.A00(1161));
            int size = this.A01.size();
            while (i < size) {
                boolean A0K = 0qQ.A0K(((AnonymousClass9JA) this.A01.get(i)).A03, string);
                i++;
                if (A0K) {
                    if (i < 0) {
                        return -2;
                    }
                }
            }
            return -2;
        }
        if (i < this.A02.size()) {
            return i;
        }
        return -2;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Object instantiateItem = AnonymousClass90B.super.instantiateItem(viewGroup, i);
        0qQ.A0C(instantiateItem, AnonymousClass000.A00(19));
        C41829B2k b2k = (Fragment) instantiateItem;
        this.A02.put(i, b2k);
        if (i == this.A00) {
            b2k.DW7();
        }
        return b2k;
    }

    public final Fragment A00(int i) {
        String str;
        String str2;
        Fragment k5d;
        Bundle bundle;
        if (i == 0) {
            str = this.A03.A05;
            str2 = this.A04;
            0qQ.A0B(str, 0);
            k5d = new K5E();
            bundle = new Bundle();
        } else {
            String str3 = ((AnonymousClass9JA) this.A01.get(i - 1)).A03;
            str = this.A03.A05;
            str2 = this.A04;
            0qQ.A0B(str3, 0);
            0qQ.A0B(str, 2);
            k5d = new K5D();
            bundle = new Bundle();
            bundle.putString(AnonymousClass000.A00(1161), str3);
            bundle.putInt(AnonymousClass000.A00(2775), i);
        }
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        bundle.putString("surface", str2);
        k5d.setArguments(bundle);
        return k5d;
    }

    public final int getCount() {
        int size = this.A01.size();
        if (!this.A01.isEmpty()) {
            return size + 1;
        }
        return size;
    }

    public final CharSequence getPageTitle(int i) {
        if (i == 0) {
            return "";
        }
        return ((AnonymousClass9JA) this.A01.get(i - 1)).A02;
    }
}
