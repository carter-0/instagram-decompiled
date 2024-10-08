package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import java.util.List;

public final class U6E extends U5e {
    public X0R A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public List A04;
    public List A05;
    public int A06;
    public final AdapterView.OnItemSelectedListener A07 = new C18913WCh(this, 4);
    public final Runnable A08 = new Wi2(this);

    public U6E(Context context, int i) {
        super(context, (AttributeSet) null, i);
        this.A06 = i;
    }

    public int getMode() {
        return this.A06;
    }

    public X0R getOnSelectListener() {
        return this.A00;
    }

    public void setOnSelectListener(X0R x0r) {
        this.A00 = x0r;
    }

    public void setStagedBackgroundColor(Integer num) {
        this.A01 = num;
    }

    public void setStagedItems(List list) {
        this.A05 = list;
    }

    public void setStagedPrimaryTextColor(Integer num) {
        this.A02 = num;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.A07);
        }
    }

    public final void requestLayout() {
        super.requestLayout();
        post(this.A08);
    }

    public void setImmediateSelection(int i) {
        if (i != getSelectedItemPosition()) {
            setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
            setSelection(i, false);
            setOnItemSelectedListener(this.A07);
        }
    }

    public void setStagedSelection(int i) {
        this.A03 = Integer.valueOf(i);
    }
}
