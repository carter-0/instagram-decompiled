package X;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;
import java.util.Map;

public abstract class UFT extends ViewPager {
    public DataSetObserver A00;
    public boolean A01;
    public final Map A02 = new 01r(1);

    private void setCurrentItemWithoutNotification(int i) {
        this.A01 = true;
        A0I(i, false);
        this.A01 = false;
    }

    private int A00(int i) {
        if (i < 0 || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            return i;
        }
        08m adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return (adapter.getCount() - i) - 1;
    }

    public 08m getAdapter() {
        UFM ufm = this.A08;
        if (ufm instanceof Wv6) {
            return ufm.A01;
        }
        return ufm;
    }

    public int getCurrentItem() {
        return A00(this.A02);
    }

    public void setAdapter(08m r5) {
        boolean z;
        DataSetObserver dataSetObserver;
        08m r1 = this.A08;
        if ((r1 instanceof Wv6) && (dataSetObserver = this.A00) != null) {
            r1.unregisterDataSetObserver(dataSetObserver);
            this.A00 = null;
        }
        if (r5 == null || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            z = false;
        } else {
            z = true;
            08m wv6 = new Wv6(r5, this);
            if (this.A00 == null) {
                U0R u0r = new U0R(wv6);
                this.A00 = u0r;
                wv6.registerDataSetObserver(u0r);
            }
            r5 = wv6;
        }
        UFT.super.setAdapter(r5);
        if (z) {
            setCurrentItemWithoutNotification(0);
        }
    }

    public UFT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A0I(int i, boolean z) {
        UFT.super.A0I(A00(i), z);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-1090516285);
        UFT.super.onAttachedToWindow();
        Wv6 wv6 = this.A08;
        if ((wv6 instanceof Wv6) && this.A00 == null) {
            U0R u0r = new U0R(wv6);
            this.A00 = u0r;
            wv6.registerDataSetObserver(u0r);
        }
        AnonymousClass0fD.A0D(1486287263, A06);
    }

    public final void onDetachedFromWindow() {
        DataSetObserver dataSetObserver;
        int A06 = AnonymousClass0fD.A06(1732774538);
        08m r1 = this.A08;
        if ((r1 instanceof Wv6) && (dataSetObserver = this.A00) != null) {
            r1.unregisterDataSetObserver(dataSetObserver);
            this.A00 = null;
        }
        UFT.super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(477393206, A06);
    }

    public void setCurrentItem(int i) {
        UFT.super.setCurrentItem(A00(i));
    }

    public void setOnPageChangeListener(AnonymousClass08u r3) {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            C18956WEj wEj = new C18956WEj(r3, this);
            this.A02.put(r3, wEj);
            r3 = wEj;
        }
        this.A09 = r3;
    }
}
