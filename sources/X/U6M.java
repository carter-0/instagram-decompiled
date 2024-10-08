package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

public final class U6M extends U5Q {
    public C20940X5i A00;
    public MenuItem A01;
    public final int A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r3v2, types: [X.WDm] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            X.X5i r0 = r5.A00
            if (r0 == 0) goto L_0x0055
            android.widget.ListAdapter r4 = r5.getAdapter()
            boolean r0 = r4 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x005a
            android.widget.HeaderViewListAdapter r4 = (android.widget.HeaderViewListAdapter) r4
            int r2 = r4.getHeadersCount()
            android.widget.ListAdapter r4 = r4.getWrappedAdapter()
        L_0x0016:
            X.U4C r4 = (X.U4C) r4
            r3 = 0
            int r1 = r6.getAction()
            r0 = 10
            if (r1 == r0) goto L_0x003f
            float r0 = r6.getX()
            int r1 = (int) r0
            float r0 = r6.getY()
            int r0 = (int) r0
            int r1 = r5.pointToPosition(r1, r0)
            r0 = -1
            if (r1 == r0) goto L_0x003f
            int r1 = r1 - r2
            if (r1 < 0) goto L_0x003f
            int r0 = r4.getCount()
            if (r1 >= r0) goto L_0x003f
            X.WDm r3 = r4.getItem(r1)
        L_0x003f:
            android.view.MenuItem r2 = r5.A01
            if (r2 == r3) goto L_0x0055
            X.WDk r1 = r4.A00
            if (r2 == 0) goto L_0x004c
            X.X5i r0 = r5.A00
            r0.DM3(r2, r1)
        L_0x004c:
            r5.A01 = r3
            if (r3 == 0) goto L_0x0055
            X.X5i r0 = r5.A00
            r0.DM2(r3, r1)
        L_0x0055:
            boolean r0 = super.onHoverEvent(r6)
            return r0
        L_0x005a:
            r2 = 0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U6M.onHoverEvent(android.view.MotionEvent):boolean");
    }

    public void setHoverListener(C20940X5i x5i) {
        this.A00 = x5i;
    }

    public U6M(Context context, boolean z) {
        super(context, z);
        if (1 == Pxf.A0G(context).getLayoutDirection()) {
            this.A02 = 21;
            this.A03 = 22;
            return;
        }
        this.A02 = 22;
        this.A03 = 21;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.A02) {
                if (listMenuItemView.isEnabled() && listMenuItemView.A05.hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (i == this.A03) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((U4C) adapter).A00.A0C(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(-1450740429);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(-1276008651, A05);
        return onTouchEvent;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
