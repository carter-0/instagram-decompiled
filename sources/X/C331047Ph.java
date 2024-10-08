package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7Ph  reason: invalid class name and case insensitive filesystem */
public abstract class C331047Ph extends BaseAdapter {
    public AnonymousClass2u9 A00;
    public final boolean A01;

    public final void A08(C231642s0 r2, Object obj) {
        A09(r2, obj, (Object) null);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final void A06() {
        AnonymousClass2u9 r1 = this.A00;
        r1.A01 = 0;
        r1.A07.clear();
        r1.A03 = true;
    }

    public final void A09(C231642s0 r2, Object obj, Object obj2) {
        this.A00.A03(r2, obj, obj2);
    }

    public final void A0A(List list) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass2u9((C232642u8) null, list);
            return;
        }
        throw new RuntimeException("Multi row adapter should only be initialized once.");
    }

    public final boolean areAllItemsEnabled() {
        return this.A00.A03;
    }

    public final String getBinderGroupName(int i) {
        return ((AnonymousClass3BZ) this.A00.A05.get(i)).A01.getBinderGroupName();
    }

    public final int getCount() {
        return this.A00.A01;
    }

    public final Object getItem(int i) {
        return ((AnonymousClass3BZ) this.A00.A05.get(i)).A02;
    }

    public final int getItemViewType(int i) {
        return this.A00.A00(i);
    }

    public final int[] getModelIndex(Object obj) {
        return (int[]) this.A00.A07.get(obj);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View A012 = this.A00.A01(i, view, viewGroup);
        AnonymousClass0mX r1 = AnonymousClass0mX.A00;
        AnonymousClass0mX.A00(viewGroup);
        r1.A01(A012, getCount(), i);
        if (this.A01) {
            AnonymousClass2u9 r12 = this.A00;
            boolean z = false;
            if (view == null) {
                z = true;
            }
            W28.A01(A012, r12, i, z);
        }
        return A012;
    }

    public final int getViewTypeCount() {
        return this.A00.A00;
    }

    public boolean isEnabled(int i) {
        return ((AnonymousClass3BZ) this.A00.A05.get(i)).A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (X.C231482rk.A01() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C331047Ph() {
        /*
            r2 = this;
            r2.<init>()
            boolean r0 = X.C231482rk.A00()
            if (r0 != 0) goto L_0x0010
            boolean r1 = X.C231482rk.A01()
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r2.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331047Ph.<init>():void");
    }

    public final void A07() {
        super.notifyDataSetChanged();
    }

    public final void A0B(C231642s0... r2) {
        A0A(Arrays.asList(r2));
    }

    public void FK4() {
        0fE.A00(this, -1490594135);
    }
}
